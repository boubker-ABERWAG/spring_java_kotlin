package fr.aberwag.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Person(){
    @Column(name = "FIRST_NAME")
    lateinit var firstName: String
    @Column(name = "LAST_NAME")
    lateinit var lastName: String
    @Column(name = "ID")
    @Id
    @GeneratedValue
    var id:Long = 0

    constructor(fName:String, lName:String):this(){
        this.firstName = fName
        this.lastName = lName
    }
}