import java.util.*

class Course(
    name: String,
    code: String,
    duration: Int,
    visibility: Boolean = false,
    targetAudience: String,
    instructor: String,
    courseContent: String,
    skills: String,
    sections: List<Objects>
)