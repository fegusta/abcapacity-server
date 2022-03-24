package com.fegusta.abcapacity.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Level(@Id
           @GeneratedValue
           val id: Long = -1,
           val nameLevel: String = "",
           val infoLevel: String = "")