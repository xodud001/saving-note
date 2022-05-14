package hello.kotlin.savingnote.record.dto

data class ReadRecordRequest(
    val title: String,
    val amount: Int,
    val isIncome: Boolean
)