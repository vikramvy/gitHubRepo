# gitHubRepo
sampleExercise
This is Rest Client and Provider to show person information and family groups
This project uses Spring MVC client to handle information via REST services; it uses RESTTemplate to handle Restservice responses; the provider application returns response in XML.

If you want to Test provider we recommend to use any HTTP REST CLient utility or Postman.

Steps:
Download the two applications Client and provider
Download/Use Maven dependencies list in pOM.XML
Deploy in tomcat and Start the application


URLS:
To Show all the in-memory list of Persons : (Applicatoin URL)
1. http://localhost:8080/spring-rest-client/uptake/getall 
  Calls Service URL: http://localhost:8080/spring-rest-provider/uptake/persons
  
2. 3. To Add a Person: Application URL:http://localhost:8080/spring-rest-client/uptake/add
Service URL: http://localhost:8080/spring-rest-provider/uptake/person
  
  
SERVICE URL for GET, DELETE, UPDATE
http://localhost:8080/spring-rest-provider/uptake/person/{id}
3. localhost:8080/spring-rest-client/uptake/get - to  show one person
  Service URL: http://localhost:8080/spring-rest-provider/uptake/person/{id}
  
4. Delete: Application URL:
localhost:8080/spring-rest-client/uptake/delete/{param id}

5. update:
localhost:8080/spring-rest-client/uptake/delete/{param id}

--------------------------------------





