# Gold Medal Metrics Challenge Project

## Overview
Gold Medal Metrics is an Olympics analytics web application built with **Spring Boot** and **Spring Data JPA**. This project is part of the [Create REST APIs with Spring and Java](https://www.codecademy.com/) course by Codecademy.

The application allows users to:
- View a list of countries along with their population, GDP, and number of Olympic gold medals.
- Sort the list by different attributes, including country name, population, GDP, and medal count.
- View detailed Olympic statistics for a selected country.
- Retrieve a list of Olympic gold medal wins for a country, including details like the year, season, athlete name, city, and event.
- Sort the list of Olympic wins by various attributes.

## Tech Stack
- **Java 11**
- **Spring Boot 2.5.2**
- **Spring Data JPA**
- **H2 Database** (for development and testing)
- **Apache Commons Text** (utility functions)

## Prerequisites
Ensure you have the following installed:
- Java 11 or higher
- Maven

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/Robson16/goldmedal.git
   cd goldmedal
   ```
2. Build the project with Maven:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The API will be available at:
   ```sh
   http://localhost:3001
   ```

## API Usage
### Get all countries sorted by name (ascending order)
```sh
curl --request GET "http://localhost:3001/countries?sort_by=name&ascending=y"
```
**Response:**
```json
{
  "countries": [
    {"name":"Afghanistan","code":"AFG","gdp":594.32,"population":32526562,"medals":0},
    ...
  ]
}
```

### Get details for a specific country (e.g., United States)
```sh
curl --request GET "http://localhost:3001/countries/united%20states"
```
**Response:**
```json
{
  "name":"United States",
  "gdp":56115.72,
  "population":321418820,
  "numberMedals":2477,
  "numberSummerWins":2302,
  "percentageTotalSummerWins":21.957,
  "yearFirstSummerWin":1896,
  "numberWinterWins":175,
  "percentageTotalWinterWins":9.109,
  "yearFirstWinterWin":1924,
  "numberEventsWonByFemaleAthletes":747,
  "numberEventsWonByMaleAthletes":1730
}
```

### Get list of Olympic gold medal winners for a country (sorted by athlete's name descending)
```sh
curl --request GET "http://localhost:3001/countries/united%20states/medals?sort_by=name&ascending=n"
```
**Response:**
```json
{
  "medals": [
    {
      "year":1968,
      "city":"Mexico",
      "season":"Summer",
      "name":"ZORN, Zachary",
      "country":"United States",
      "gender":"Men",
      "sport":"Aquatics",
      "discipline":"Swimming",
      "event":"4X100M Freestyle Relay"
    },
    ...
  ]
}
```

## Dependencies
The project uses the following dependencies, as defined in `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-text</artifactId>
        <version>1.8</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Future Enhancements
- Add support for retrieving Olympic statistics by athlete.
- Implement authentication and authorization for API access.
- Migrate to a production-ready database like PostgreSQL or MySQL.

---
This project was developed as part of the **Create REST APIs with Spring and Java** course by Codecademy.

**Happy Coding!** 🚀

