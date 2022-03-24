package com.fegusta.abcapacity.controller

import com.fegusta.abcapacity.model.Note
import com.fegusta.abcapacity.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.bind.Bindable.listOf
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var noteRepository: NoteRepository

    //@GetMapping
    //fun list(): List<Note> {
    //    return noteRepository.findAll().toList()
    //}

    @PostMapping
    fun add(@RequestBody note: Note): Note{
        return noteRepository.save(note)
    }
}