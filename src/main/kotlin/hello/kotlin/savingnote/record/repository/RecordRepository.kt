package hello.kotlin.savingnote.record.repository

import hello.kotlin.savingnote.record.domain.Record
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.domain.Slice

interface RecordRepository : JpaRepository<Record, Long> {

    override fun findAll(pageable: Pageable): Page<Record>
}


