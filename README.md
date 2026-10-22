# Java Enums, Dates & Records

Small Java exercises to learn three important topics:

- Enums — fixed lists of values
- java.time — dates and times
- Records — simple data classes (coming next)

Each exercise has:
- a service class with the logic
- a Main class that only prints
- a test class

## Project structure

src/main/java/level1/
Day.java
Level.java
Task.java
Main.java

src/main/java/level2/
Exercise1.java
Exercise2.java
Exercise3.java
Exercise4.java
Exercise5.java
Exercise6.java
Appointment.java
Main.java

src/test/java/level1/
DayTest.java
LevelTest.java
TaskTest.java

src/test/java/level2/
Exercise1Test.java
Exercise2Test.java
Exercise3Test.java
Exercise4Test.java
Exercise5Test.java
Exercise6Test.java

## Level 1 — Enums

Exercise 1 — Day
- Enum with the 7 days of the week.
- Method isWorkingDay() returns true from Monday to Friday.

Exercise 2 — Task + Level
- Level has three values: LOW, MEDIUM, HIGH.
- Task stores a name and a level, and returns a message that depends on the level.

Exercise 3 — Enum with methods
- Level has a color and a priority.
- Methods: getColor(), getPriority(), getMessage().

Exercise 4 — String to Enum
- stringToEnum(String) converts a text to a Level.
- If the text is null or not valid, it returns Level.LOW.

## Level 2 — Dates and times (java.time)

All services receive a Clock. This makes testing easy: we can use a fixed clock in tests.

Exercise 1 — Current date and time
- getFormattedDate() returns 2025-03-10
- getFormattedTime() returns 14:35:00
- getFormattedDateTime() returns 2025-03-10 14:35:00

Exercise 2 — Difference between two dates
- differentPeriod(LocalDate, LocalDate) returns Period (years, months, days)
- differentDuration(LocalDateTime, LocalDateTime) returns Duration (hours, minutes, seconds)
- formatPeriod(...) returns "2 years, 5 months, 5 days"
- formatDuration(...) returns "9h 45m"

Exercise 3 — Add or subtract time
- addDays, subtractMonths, addYears (on LocalDate)
- addHours, subtractMinutes (on LocalDateTime)

Exercise 4 — Format dates
- yyyy-MM-dd'T'HH:mm:ss (ISO)
- dd/MM/yyyy
- HH:mm:ss
- EEEE, d MMMM yyyy (long, English)

Exercise 5 — Is a date before today?
- isBeforeToday(LocalDate) returns true or false

Exercise 6 — Agenda
- Appointment class: description + date-time, and a format() method.
- Exercise6.add(...) adds an appointment.
- Exercise6.upcoming() returns only the future appointments, sorted by date.

## How to run

Run all tests:
mvn test

Run one test class:
mvn test -Dtest=Exercise6Test

Run the Main:
In IntelliJ: right-click Main, then Run 'Main.main()'.

## Rules I follow in every exercise

1. Main only prints. No logic in main.
2. Logic lives in a service class.
3. Inject a Clock when the code uses "now". Tests use Clock.fixed(...).
4. Use DateTimeFormatter for output — never print raw LocalDateTime.
5. One class per file, package level2; at the top.
6. JUnit 5 imports: org.junit.jupiter.api.Assertions.*

## Notes

- A Period is for dates (years / months / days).
- A Duration is for times (hours / minutes / seconds). It cannot hold years or months.
- Duration.of(2, 5, 5) does not exist. For years/months/days, use Period.of(2, 5, 5).
- A package name must be lowercase and must not be the same as a class name (level2.Ext6 is wrong, level2 is correct).

## What comes next

- Level 3 — Records: simple, immutable data classes with less code.