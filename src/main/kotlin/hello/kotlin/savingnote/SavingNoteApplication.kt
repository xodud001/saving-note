package hello.kotlin.savingnote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class SavingNoteApplication

fun main(args: Array<String>) {
	runApplication<SavingNoteApplication>(*args)
}
