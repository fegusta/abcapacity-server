package com.fegusta.abcapacity

import com.fegusta.abcapacity.model.Level
import com.fegusta.abcapacity.repository.LevelRepository
import com.fegusta.abcapacity.repository.NoteRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class AbcapacityApplication {

//	@Bean
//	fun run(repository: LevelRepository) = ApplicationRunner {
//		repository.save(Level(
//				nameLevel = "Teste 1",
//				infoLevel = "OLHA O TESTE 1"
//		))
//		repository.save(Level(
//				nameLevel = "Teste 2OLHA O TESTE 2",
//				infoLevel = "OLHA O TESTE 2"
//		))
//	}
}

fun main(args: Array<String>) {
	runApplication<AbcapacityApplication>(*args)
}
