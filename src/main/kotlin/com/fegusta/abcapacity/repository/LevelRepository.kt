package com.fegusta.abcapacity.repository

import com.fegusta.abcapacity.model.Level
import com.fegusta.abcapacity.model.Note
import org.springframework.data.repository.CrudRepository


interface LevelRepository : CrudRepository<Level, Long>{}