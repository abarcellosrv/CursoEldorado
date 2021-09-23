import java.util.*

class Category(
    name: String,
    code: String,
    description: String,
    studyGuide: List<String>,
    isActive: Boolean = false,
    position: Int,
    iconPath: String,
    colorHexCode: String,
    subcategories: List<Subcategory>
)