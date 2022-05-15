package hello.kotlin.savingnote.record.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * 하나의 개래내역을 저장
 */
@Entity(name = "record")
data class Record (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long


)