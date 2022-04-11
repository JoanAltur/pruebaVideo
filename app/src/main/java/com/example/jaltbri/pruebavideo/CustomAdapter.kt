package com.example.jaltbri.pruebavideo

import android.graphics.Color
import android.text.Layout
import android.text.SpannableString
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.updateLayoutParams
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<MessagesViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val text: TextView = itemView.findViewById(R.id.message_text)
        val date: TextView = itemView.findViewById(R.id.message_date)
        val textLayout: LinearLayout = itemView.findViewById(R.id.text_layout)
//        val dateLayout: LinearLayout = itemView.findViewById(R.id.date_layout)
        val verticalLayout: LinearLayout = itemView.findViewById(R.id.vertical_layout)

    }


    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.sent_message, parent, false)
        return ViewHolder(view)
    }


    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]
        //comprobamos si el id es del receptor o del emisor para separarlo en la pantalla
        //versión de pruebas está separado en 1 y 2 id solamente, hay que automatizarlo para diferenciar solamente el del propio paciente
        when(ItemsViewModel.id){

            1 -> {
                holder.verticalLayout.gravity = Gravity.END
                holder.textLayout.setBackgroundColor(Color.CYAN)//pintamos el campo de texto para remarcar el enviado
            }
            2 -> {
            }
        }
        //añadimos el texto del mensaje
        holder.text.text= ItemsViewModel.text
        //formateamos el campo de la hora de recepción del mensaje
        holder.date.text = ItemsViewModel.timestamp.toString().substringBeforeLast(":")
        holder.date.textSize=10f

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }
}