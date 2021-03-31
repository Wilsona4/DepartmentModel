package com.funcrib

class CourseList {
    private var courseList = generateCourseList()

    /*Generate a default list of courses*/
    private fun generateCourseList(): List<CourseModel> {
        val courseList = ArrayList<CourseModel>()

        courseList.add(CourseModel("Maths101", Classes.YEAR_ONE))
        courseList.add(CourseModel("CSC101", Classes.YEAR_ONE))
        courseList.add(CourseModel("GSC101", Classes.YEAR_ONE))
        courseList.add(CourseModel("PHY101", Classes.YEAR_ONE))
        courseList.add(CourseModel("Maths201", Classes.YEAR_TWO))
        courseList.add(CourseModel("CSC201", Classes.YEAR_TWO))
        courseList.add(CourseModel("GSC201", Classes.YEAR_TWO))
        courseList.add(CourseModel("PHY201", Classes.YEAR_TWO))
        courseList.add(CourseModel("Maths301", Classes.YEAR_THREE))
        courseList.add(CourseModel("CSC301", Classes.YEAR_THREE))
        courseList.add(CourseModel("GSC301", Classes.YEAR_THREE))
        courseList.add(CourseModel("PHY301", Classes.YEAR_THREE))
        courseList.add(CourseModel("Maths401", Classes.YEAR_FOUR))
        courseList.add(CourseModel("CSC401", Classes.YEAR_FOUR))
        courseList.add(CourseModel("GSC401", Classes.YEAR_FOUR))
        courseList.add(CourseModel("PHY401", Classes.YEAR_FOUR))
        courseList.add(CourseModel("Maths501", Classes.YEAR_FIVE))
        courseList.add(CourseModel("CSC501", Classes.YEAR_FIVE))
        courseList.add(CourseModel("GSC501", Classes.YEAR_FIVE))
        courseList.add(CourseModel("PHY501", Classes.YEAR_FIVE))
        return courseList
    }

    /*Print the courseList*/
    fun printCourseList() {
        val list = courseList.map { it.name }
        println(list)
    }

    /*Get the list of course taken by each level*/
    fun classCourses(level: Classes) {
        when (level) {
            Classes.YEAR_ONE -> {
                val courses = courseList.filter { it.level == Classes.YEAR_ONE }
                print(courses.map { it.name })
            }
            Classes.YEAR_TWO -> {
                val courses = courseList.filter { it.level == Classes.YEAR_TWO }
                print(courses.map { it.name })
            }
            Classes.YEAR_THREE -> {
                val courses = courseList.filter { it.level == Classes.YEAR_THREE }
                print(courses.map { it.name })
            }
            Classes.YEAR_FOUR -> {
                val courses = courseList.filter { it.level == Classes.YEAR_FOUR }
                print(courses.map { it.name })
            }
            Classes.YEAR_FIVE -> {
                val courses = courseList.filter { it.level == Classes.YEAR_FIVE }
                print(courses.map { it.name })
            }
        }
    }
}