class Question(
    text: String ,
    name: String ,
    code: String ,
    isActive: Boolean = false ,
    position: Int ,
    type: String ,
    section: Section

) : Activity(name , code , isActive , position , type , section) {

}