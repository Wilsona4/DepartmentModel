package com.funcrib

class NonAcademicStaff(override var name: String): Staff {

//  Implement payment of salary

    override fun canTeach(): Boolean {
        println("I can't Teach")
        return false
    }
}