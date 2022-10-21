# ebm
Event Booking Management

Description: 

this project is build for book any venue from anywhere in that we have 4 types user 
1) Admin : with all access
2) Vender : they can update his/her properties like hotels, halls, party places, wedding place etc.
3) Operation : they are company employees they are able to process inquiry 
4) End user : search for property and put inquiry.

Technologies :

Frontend :  Bootstrap, HTML, CSS, Javascript, JSP
Backend : Java 8, J2EE, Spring, Spring boot MVC
ORM : Spring Data JPA (Hibernate)
Project Building tool : Maven
Database : MySql
Code Repo : Git

Project Archicture :

we follow standard MVC arch type
whenever request comes from front end it will handelled by MVC controller and from controller we call service 
and fron service we call DAO all costom exception are present in exception package and we use entity class to
travel from controller to database so that all POJO classes are present in pojo package.
we use spring boot's embedded tomcat server no need to configure external tomcat.
for logger we use log4j. for common functionality like mail password encryption thease classes are present in 
util package. we euse data table and jstl, and sql tag lib in jsp pages to render data in datatable
also we have common header, sidebar and footer in that we have set values that comes from session 
and it will help to identify user type. Based on user type we navigate user to perticuler user dashboard. 

all configuration related to JPA and Springboot Project is present in application.yaml file.
