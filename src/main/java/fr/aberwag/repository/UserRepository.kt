package fr.aberwag.repository

import fr.aberwag.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
    fun findByLastName(name:String):List<User>
}