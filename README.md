# url-shortner


# Prerequisite:

1.	Java 11
2.	Maven
3.	MySql

# Required changes :

1>	Need to update database properties in application.properties file as the current properties are based on my local database configuration.
2>	Need to update database properties docker-compose.yml file as the current properties are based on my local database configuration.


# Command to run (without docker):
1.	mvn clean install
2.	mvn spring-boot:run
3.	Open localhost:8080/swagger-ui.html to see endpoints.


# Command to run (using docker):
1.	docker-compose up
2.	Open localhost:8080/swagger-ui.html to see endpoints.



