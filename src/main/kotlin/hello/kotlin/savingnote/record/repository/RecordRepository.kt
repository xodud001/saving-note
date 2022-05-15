package hello.kotlin.savingnote.record.repository

import hello.kotlin.savingnote.record.domain.Record
import org.springframework.data.jpa.repository.JpaRepository

interface RecordRepository : JpaRepository<Record, Long> {

}