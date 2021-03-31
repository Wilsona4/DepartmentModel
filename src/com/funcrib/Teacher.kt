package com.funcrib

class Teacher(override var name: String, private val major: Major, private val levelTaught: Classes) : Staff {

    //    if can teach is true implement a method to get a level then course for each teacher
    fun courseTaught() {
        if (canTeach()) {
            when (levelTaught) {
                Classes.YEAR_ONE -> {
                    when (major) {
                        Major.MATHS -> courseTaughtMessage("Maths101")
                        Major.GSC -> courseTaughtMessage("GSC101")
                        Major.CSC -> courseTaughtMessage("CSC101")
                        Major.PHY -> courseTaughtMessage("PHY101")
                    }
                }
                Classes.YEAR_TWO -> {
                    when (major) {
                        Major.MATHS -> courseTaughtMessage("Maths201")
                        Major.GSC -> courseTaughtMessage("GSC201")
                        Major.CSC -> courseTaughtMessage("CSC201")
                        Major.PHY -> courseTaughtMessage("PHY201")
                    }
                }
                Classes.YEAR_THREE -> {
                    when (major) {
                        Major.MATHS -> courseTaughtMessage("Maths301")
                        Major.GSC -> courseTaughtMessage("GSC301")
                        Major.CSC -> courseTaughtMessage("CSC301")
                        Major.PHY -> courseTaughtMessage("PHY301")
                    }
                }
                Classes.YEAR_FOUR -> {
                    when (major) {
                        Major.MATHS -> courseTaughtMessage("Maths401")
                        Major.GSC -> courseTaughtMessage("GSC401")
                        Major.CSC -> courseTaughtMessage("CSC401")
                        Major.PHY -> courseTaughtMessage("PHY401")
                    }
                }
                Classes.YEAR_FIVE -> {
                    when (major) {
                        Major.MATHS -> courseTaughtMessage("Maths501")
                        Major.GSC -> courseTaughtMessage("GSC501")
                        Major.CSC -> courseTaughtMessage("CSC501")
                        Major.PHY -> courseTaughtMessage("PHY501")
                    }
                }
            }
        }
    }

    private fun courseTaughtMessage(course: String) {
        println("I Teach $levelTaught $course")
    }

    override fun canTeach(): Boolean {
        println("I can Teach")
        return true
    }

}
