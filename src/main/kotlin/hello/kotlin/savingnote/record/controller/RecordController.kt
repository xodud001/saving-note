package hello.kotlin.savingnote.record.controller

import hello.kotlin.savingnote.record.domain.Record
import hello.kotlin.savingnote.record.dto.CreateRecordRequest
import hello.kotlin.savingnote.record.dto.ReadRecordRequest
import hello.kotlin.savingnote.record.service.RecordService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RequestMapping("/record")
@RestController
class RecordController(val recordService: RecordService) {

    @GetMapping
    fun find(): List<ReadRecordRequest> = recordService.findAll()

    @PostMapping
    fun create(@RequestBody request: CreateRecordRequest): ResponseEntity<Any> {
        val createdRecordId = recordService.create(request)
        return ResponseEntity
            .created(URI.create("/${createdRecordId}"))
            .build()
    }
}