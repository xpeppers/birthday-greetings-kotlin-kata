package it.xpug.kata.birthday_greetings

interface NotificationService {
    fun sendGreetingsTo(employee: Employee, smtpHost: String, smtpPort: Int)
}
