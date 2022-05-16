package hello.kotlin.savingnote.record.domain

import org.springframework.data.annotation.CreatedDate
import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import java.time.temporal.TemporalAccessor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * 하나의 개래내역을 저장
 */
@Entity(name = "record")
class Record (
    val description: String,
    val amount: Int,
    val isIncome: Boolean,
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    val issuedAt: Instant = Instant.now(Clock.systemUTC())

}