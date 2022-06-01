package hello.kotlin.savingnote.record.service

import hello.kotlin.savingnote.common.page.dto.CustomPageResponse
import hello.kotlin.savingnote.record.domain.Record
import hello.kotlin.savingnote.record.dto.CreateRecordRequest
import hello.kotlin.savingnote.record.dto.ReadRecordResponse
import hello.kotlin.savingnote.record.repository.RecordRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import java.time.ZoneOffset

@Service
class RecordService(val recordRepository: RecordRepository) {

    fun create(request: CreateRecordRequest): Long {
        val record = Record(request.description, request.amount, request.isIncome)
        val savedRecord = recordRepository.save(record)
        return savedRecord.id
    }

    fun findAll(page: Int): CustomPageResponse<ReadRecordResponse> {

        val pageRequest = PageRequest.of(page, 5)

        val recordPage = recordRepository.findAll(pageRequest)

        val records = recordPage.content
            .map {
                ReadRecordResponse(
                    it.id,
                    it.issuedAt.atOffset(ZoneOffset.ofHours(9)),
                    it.description,
                    it.amount,
                    it.isIncome
                )
            }
            .toList()

        return CustomPageResponse(
            totalPage = recordPage.totalPages,
            currentPage = recordPage.number,
            pageSize = recordPage.size,
            content = records
        )
    }
}