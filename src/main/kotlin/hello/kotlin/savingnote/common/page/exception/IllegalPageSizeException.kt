package hello.kotlin.savingnote.common.page.exception

class IllegalPageSizeException(message: String?) : Exception("Page index must not be less than zero! page=$message") {
}