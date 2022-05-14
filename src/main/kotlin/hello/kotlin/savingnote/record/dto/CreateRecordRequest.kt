package hello.kotlin.savingnote.record.dto

data class CreateRecordRequest(
    val title: String,
    val amount: String,
    val isIncome: Boolean
)
