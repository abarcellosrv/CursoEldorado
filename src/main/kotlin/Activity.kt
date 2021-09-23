import java.lang.RuntimeException

abstract class Activity(
    val name: String,
    val code: String,
    var isActive: Boolean = false,
    val position: Int,
    val type: String,
    val section: Section,

){
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

}


