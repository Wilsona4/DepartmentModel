package com.funcrib

class Principal(override var name: String) : Staff {

    private val aspirantList: ArrayList<Aspirant> = generateAspirantsList()

    private val studentList:ArrayList<StudentModel> = generateStudentList()


    /* Principal can admit applicants based on Age and Jamb Score */
    fun admitAspirant() {
        /*Default Level for every admitted aspirant*/
        val level = Classes.YEAR_ONE

    /* sort out the aspirants with jambScore equals or higher than 180 and age greater than 14 */
        val successfulAspirant = aspirantList.filter { it.age >= 15 && it.jambScore >= 180 }

    /* convert the successful applicants list (<AspirantModel>) to a student list () */
            val newStudentList = successfulAspirant.mapTo(studentList) {
                StudentModel(it.name, level)
            }

    /* Add all successful applicants to the students list */
        studentList.addAll(newStudentList)
        println("The Admitted Aspirants include\n ${newStudentList.map { it.name }}")

    }


    /* Add new individual to applicants list */
    fun addAspirant(name: String) {
        val aspirant = Aspirant(name, randomAge(), randomJambScore())
        aspirantList.add(aspirant)
        println("$name has been added to the aspirant list")
    }


    /*Clear the Aspirant List*/
    fun clearAspirantList(){
        aspirantList.clear()
        println("Aspirant List have been Cleared")
    }


    /*Get total number of aspirants in the school*/
    fun getTotalAspirants(){
        println("They are ${aspirantList.map { it.name }.count()} Aspirants on the List")
    }



    /* Expel Rouge Students */
    fun expelStudent(studentName: String) {


        if (studentList.any { it.name == studentName }){
            studentList.removeIf { it.name == studentName }
            println("$studentName has been Expelled")
        }else {
            println("$studentName not a student of this School\nSee Student's list Below")
            println(studentList.map { it.name })
        }
    }

    /*Print Students List*/
    fun printStudentList(){
        val list = studentList.map { it.name }
        println(list)
    }

    /*Get total number of students in the school*/
    fun getTotalStudents() {
        println("They are ${studentList.map { it.name }.count()} Students in the School")
    }

    /*Get a list of students in each level*/
    fun getStudentPerLevel(level: Classes) {
        when (level) {
            Classes.YEAR_ONE -> {
                val students = studentList.filter { it.level == Classes.YEAR_ONE }
                println("The Students in Year One include ${students.map { it.name }}")
            }
            Classes.YEAR_TWO -> {
                val students = studentList.filter { it.level == Classes.YEAR_TWO }
                println("The Students in Year Two include ${students.map { it.name }}")
            }
            Classes.YEAR_THREE -> {
                val students = studentList.filter { it.level == Classes.YEAR_THREE }
                println("The Students in Year Three include ${students.map { it.name }}")
            }
            Classes.YEAR_FOUR -> {
                val students = studentList.filter { it.level == Classes.YEAR_FOUR }
                println("The Students in Year Four include ${students.map { it.name }}")
            }
            Classes.YEAR_FIVE -> {
                val students = studentList.filter { it.level == Classes.YEAR_FIVE }
                println("The Students in Year Five include ${students.map { it.name }}")
            }
        }
    }


    override fun canTeach(): Boolean {
        println("I can't Teach")
        return false
    }

    /* Implement method to generate random age and jamb score */
    private fun randomAge(): Int = (11..25).random()

    private fun randomJambScore(): Int = (140..300).random()


    /* Generate the default Applicants List */
    private fun generateAspirantsList(): ArrayList<Aspirant> {
        val aspirantList = ArrayList<Aspirant>()
        aspirantList.add(Aspirant("Wilson", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Mike", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Femi", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Emmanuel", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Jesse", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Jones", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Muby", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Ruth", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Wiseman", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Segun",randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Pope", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Nonso", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Dennis", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Nelson", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Abdul", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Hassan", randomAge(), randomJambScore()))
        aspirantList.add(Aspirant("Aniete", randomAge(), randomJambScore()))

        return aspirantList
    }



    /* generate Default or Existing Students */
    private fun generateStudentList(): ArrayList<StudentModel> {
        val studentList = ArrayList<StudentModel>()

        studentList.add(StudentModel("Mary", Classes.YEAR_ONE))
        studentList.add(StudentModel("Joe", Classes.YEAR_ONE))
        studentList.add(StudentModel("Sunday", Classes.YEAR_ONE))
        studentList.add(StudentModel("Albert", Classes.YEAR_ONE))
        studentList.add(StudentModel("Omah", Classes.YEAR_ONE))
        studentList.add(StudentModel("Sandy", Classes.YEAR_ONE))
        studentList.add(StudentModel("Mathew", Classes.YEAR_TWO))
        studentList.add(StudentModel("Mark", Classes.YEAR_TWO))
        studentList.add(StudentModel("Precious", Classes.YEAR_TWO))
        studentList.add(StudentModel("Lekan", Classes.YEAR_TWO))
        studentList.add(StudentModel("Dapo", Classes.YEAR_TWO))
        studentList.add(StudentModel("Daniel", Classes.YEAR_TWO))
        studentList.add(StudentModel("Skinny", Classes.YEAR_THREE))
        studentList.add(StudentModel("Toochi", Classes.YEAR_THREE))
        studentList.add(StudentModel("Pikachu", Classes.YEAR_THREE))
        studentList.add(StudentModel("Naruto", Classes.YEAR_THREE))
        studentList.add(StudentModel("Sasuke", Classes.YEAR_THREE))
        studentList.add(StudentModel("Hinata", Classes.YEAR_THREE))
        studentList.add(StudentModel("Sakura", Classes.YEAR_FOUR))
        studentList.add(StudentModel("Jiraya", Classes.YEAR_FOUR))
        studentList.add(StudentModel("Itachi", Classes.YEAR_FOUR))
        studentList.add(StudentModel("Oruchimaru", Classes.YEAR_FOUR))
        studentList.add(StudentModel("Neji", Classes.YEAR_FOUR))
        studentList.add(StudentModel("Shikamaru", Classes.YEAR_FIVE))
        studentList.add(StudentModel("Lee", Classes.YEAR_FIVE))
        studentList.add(StudentModel("Guy", Classes.YEAR_FIVE))
        studentList.add(StudentModel("Sai", Classes.YEAR_FIVE))
        studentList.add(StudentModel("Kiba", Classes.YEAR_FIVE))
        studentList.add(StudentModel("Pain", Classes.YEAR_FIVE))

        return studentList
    }


}