package kookmin.software.capstone2023.timebank.application.exception

class UnauthorizedException(
    code: ApplicationErrorCode = ApplicationErrorCode.UNAUTHORIZED,
    override val message: String?,
) : ApplicationException(code, message)
