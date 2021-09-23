import java.util.*

class Subcategory(
    name: String,
    code: String,
    description: String,
    studyGuide: List<String>,
    isActive: Boolean = false,
    position: Int,
    category: Category
)