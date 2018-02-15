package fr.aberwag.controller

import fr.aberwag.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController {
    @Autowired
    lateinit var personRepository:PersonRepository

    @GetMapping("/persons")
    fun findAll() = personRepository.findAll()

    @GetMapping("/person/{name}")
    fun findPersonByName(@PathVariable name:String) = personRepository.findByLastName(name)
}