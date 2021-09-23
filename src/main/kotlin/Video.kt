class Video(
    url: String ,
    duration: Int ,
    transcript: String ,
    code: String ,
    isActive: Boolean = false ,
    position: Int ,
    type: String ,
    section: Section ,
    name: String

) : Activity(name , code , isActive , position , type , section) {

}