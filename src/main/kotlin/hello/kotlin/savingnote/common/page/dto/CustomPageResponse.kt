package hello.kotlin.savingnote.common.page.dto

data class CustomPageResponse<T>(
    val totalPage: Int, // 총 페이지 수
    val currentPage: Int, // 현재 페이지 번호
    val pageSize: Int, // 한 페이지의 요소 갯수
    val content: List<T>
)