import java.lang.RuntimeException
import java.util.*

class Category(
    val name: String,
    val code: String,
    val description: String,
    val studyGuide: List<String>,
    var isActive: Boolean = false,
    val position: Int,
    val iconPath: String,
    val colorHexCode: String,
    val subcategories: List<Subcategory>
) {
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