package com.funcrib

fun main() {
    val principal = Principal("Jones")
    val course = CourseList()
    val siri = Teacher("Siri", Major.MATHS, Classes.YEAR_THREE)

    principal.getTotalStudents()
    principal.printStudentList()

    principal.expelStudent("Mark")
    principal.getTotalStudents()

    principal.addAspirant("Larry")

    principal.printStudentList()
    principal.admitAspirant()

    principal.getTotalAspirants()
    principal.clearAspirantList()
    principal.getTotalAspirants()

    principal.getStudentPerLevel(Classes.YEAR_FIVE)

    course.printCourseList()
    course.classCourses(Classes.YEAR_THREE)

    siri.courseTaught()




}