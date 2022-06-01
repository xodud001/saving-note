package hello.kotlin.savingnote.record.controller

import hello.kotlin.savingnote.common.page.dto.CustomPageResponse
import hello.kotlin.savingnote.record.dto.CreateRecordRequest
import hello.kotlin.savingnote.record.dto.ReadRecordResponse
import hello.kotlin.savingnote.record.service.RecordService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import kotlin.math.max

@RequestMapping("/record")
@RestController
class RecordController(val recordService: RecordService) {

    @GetMapping
    fun findAll(@RequestParam page: Int): CustomPageResponse<ReadRecordResponse> {
        val validatedPage = max(page, 0);

        return recordService.findAll(validatedPage)
    }

    @PostMapping
    fun create(@RequestBody request: CreateRecordRequest): ResponseEntity<Any> {
        val createdRecordId = recordService.create(request)
        return ResponseEntity
            .created(URI.create("/${createdRecordId}"))
            .build()
    }
}