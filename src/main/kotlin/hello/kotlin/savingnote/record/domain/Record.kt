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
    val description: String, // 이벤트 설명
    val amount: Int, // 금액
    val isIncome: Boolean, // 수입 / 지출 구분
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    val issuedAt: Instant = Instant.now(Clock.systemUTC())

}