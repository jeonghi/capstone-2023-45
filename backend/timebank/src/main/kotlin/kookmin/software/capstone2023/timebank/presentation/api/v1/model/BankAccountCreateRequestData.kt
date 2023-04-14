package kookmin.software.capstone2023.timebank.presentation.api.v1.model
import jakarta.validation.constraints.NotBlank

data class BankAccountCreateRequestData(

    val branchId: Long,

    @field:NotBlank(message = "생성하려는 은행 계정의 패스워드를 보내주세요")
    val password: String,

    @field:NotBlank(message = "생성하려는 은행 계정의 패스워드의 iv를 보내주세요")
    val iv: String,
)
