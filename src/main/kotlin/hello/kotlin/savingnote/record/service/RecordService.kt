package hello.kotlin.savingnote.record.service

import hello.kotlin.savingnote.record.domain.Record
import hello.kotlin.savingnote.record.dto.CreateRecordRequest
import hello.kotlin.savingnote.record.dto.ReadRecordRequest
import hello.kotlin.savingnote.record.repository.RecordRepository
import org.springframework.stereotype.Service
import org.thymeleaf.extras.java8time.util.TemporalCreationUtils
import java.time.ZoneOffset
import java.time.temporal.TemporalUnit

@Service
class RecordService(val recordRepository: RecordRepository) {

    fun create(request: CreateRecordRequest): Long {
        val record = Record(request.description, request.amount, request.isIncome)
        val savedRecord = recordRepository.save(record)
        return savedRecord.id
    }

    fun findAll(): List<ReadRecordRequest> =
        recordRepository.findAll()
                    .map{ ReadRecordRequest(
                    it.id,
                    it.issuedAt.atOffset(ZoneOffset.ofHours(9)),
                    it.description,
                    it.amount,
                    it.isIncome
                    )}
                    .toList()
}