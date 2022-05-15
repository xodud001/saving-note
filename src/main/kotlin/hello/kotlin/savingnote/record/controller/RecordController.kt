package hello.kotlin.savingnote.record.controller

import hello.kotlin.savingnote.record.domain.Record
import hello.kotlin.savingnote.record.dto.ReadRecordRequest
import hello.kotlin.savingnote.record.service.RecordService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RecordController(val recordService: RecordService) {

    @GetMapping
    fun find(): List<Record> = recordService.findRecord()

    @PostMapping
    fun create(@RequestBody record: Record){
        recordService.create(record)
    }
}