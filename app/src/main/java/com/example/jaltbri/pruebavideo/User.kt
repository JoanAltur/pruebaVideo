import android.media.Image
import androidx.room.ColumnInfo

data class Patient(
    val id: Int,
    val birth_date: String?,
    val birth_place: String?,
//    val carers: List<Carer>?,
    val education: String?,
    val email: String?,
    val first_name: String?,
    val home_phone: String?,
    val hospital: Int?,
    val image: Image?,
    val insurance: String?,
    val insurance_holder: String?,
    val language: String?,
    val last_name_1: String?,
    val last_name_2: String?,
    val local_service_coordination: Boolean?,
    val middle_name: String?,
    val mobile_phone: String?,
    val mrn: String?,
    val occupation: String?,
    val pid_1: String?,
    val pid_2: String?,
    val pid_3: String?,
    val primary_care: Boolean?,
    val privacy_policy_accepted: Boolean?,
    val qr_code: String?,
    val residential_care: Boolean?,
    val special_attention: Boolean?,
    val ssn: String?
)
