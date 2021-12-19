import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(localeDate : LocalDateTime) {
    constructor (localeDate : LocalDate):
      this(LocalDateTime.of(localeDate, LocalTime.of(0, 0)))

    var date: LocalDateTime = localeDate.plusSeconds((1000_000_000L))
}
