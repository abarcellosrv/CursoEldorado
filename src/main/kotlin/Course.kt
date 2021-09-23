import java.lang.RuntimeException
import java.util.*

class Course(
    val name: String,
    val code: String,
    val duration: Int,
    var isActive: Boolean = false,
    val targetAudience: String,
    val instructor: String,
    val courseContent: String,
    val skills: String,
    val sections: List<Objects>
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