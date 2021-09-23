import java.lang.RuntimeException
import java.util.*

class Section(
    val name: String,
    val code: String,
    val position: Int,
    var isActive: Boolean = false,
    val isTest: Boolean = false,
    val course: Course,
    val activities: List<Activity>
)
{
    init {
        fun validateCode(code: String) : Boolean{
            val regex = Regex("""^[a-z0-9\-\/]{4,10}\S*$""")
            if(code.matches(regex))
                return true
            return false
        }
        if(!validateCode(code)){
            throw RuntimeException("Invalid Code!")
        }
    }
    fun activate(){
        isActive = true
    }
}