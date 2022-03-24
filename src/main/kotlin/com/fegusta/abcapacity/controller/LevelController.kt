package com.fegusta.abcapacity.controller

import com.fegusta.abcapacity.model.Level
import com.fegusta.abcapacity.model.Note
import com.fegusta.abcapacity.repository.LevelRepository
import com.fegusta.abcapacity.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("level")
class LevelController {

    @Autowired
    lateinit var levelRepository: LevelRepository

    @GetMapping
    fun list(): List<Level> {
        levelRepository.save(Level(
                nameLevel = "Level 3",
                infoLevel = "Terceiro Level"
        ))
        levelRepository.save(Level(
                nameLevel = "Level 4",
                infoLevel = "Quarto Level"
        ))
        var listLevel = ArrayList<Level>()
        levelRepository.findAll().forEach {
            listLevel.add(it)
        }
        return listLevel
    }


    @PostMapping
    fun add(@RequestBody level: Level): Level {
        return levelRepository.save(level)
    }

}