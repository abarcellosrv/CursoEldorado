import java.util.*

class Section(
    name: String,
    code: String,
    position: Int,
    isActive: Boolean = false,
    isTest: Boolean = false,
    course: Course,
    activities: List<Activity>
)