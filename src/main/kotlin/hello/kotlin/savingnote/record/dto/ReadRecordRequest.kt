package hello.kotlin.savingnote.record.dto

import java.time.OffsetDateTime

data class ReadRecordRequest(
    val id: Long,
    val issuedAt: OffsetDateTime,
    val title: String,
    val amount: Int,
    val isIncome: Boolean
)