package hello.kotlin.savingnote.record.dto

data class CreateRecordRequest(
    val description: String,
    val amount: Int,
    val isIncome: Boolean
)
