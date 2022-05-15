package hello.kotlin.savingnote.record.service

import hello.kotlin.savingnote.record.domain.Record
import hello.kotlin.savingnote.record.dto.ReadRecordRequest
import hello.kotlin.savingnote.record.repository.RecordRepository
import org.springframework.stereotype.Service

@Service
class RecordService(val recordRepository: RecordRepository) {

    fun create(record: Record){
        recordRepository.save(record)
    }

    fun findRecord(): List<Record> = recordRepository.findAll()
}