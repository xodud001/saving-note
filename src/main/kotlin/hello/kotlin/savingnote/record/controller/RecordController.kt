package hello.kotlin.savingnote.record.controller

import hello.kotlin.savingnote.record.domain.Record
import hello.kotlin.savingnote.record.dto.ReadRecordRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RecordController {

    @GetMapping
    fun index(): List<ReadRecordRequest> = listOf(
        ReadRecordRequest("편의점", 10_000, false),
        ReadRecordRequest("치킨", 25_000, false),
        ReadRecordRequest("월급", 500_000, true)
    )
}