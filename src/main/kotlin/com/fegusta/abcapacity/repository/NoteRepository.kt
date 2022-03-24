package com.fegusta.abcapacity.repository

import com.fegusta.abcapacity.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long>