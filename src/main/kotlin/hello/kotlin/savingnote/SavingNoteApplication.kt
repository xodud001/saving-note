package hello.kotlin.savingnote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SavingNoteApplication

fun main(args: Array<String>) {
	runApplication<SavingNoteApplication>(*args)
}
