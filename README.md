# SpringBoot-RestAPI-H2db-Learning
A simple spring boot rest web service with H2 database.

To access database:
http://localhost:8081/h2-console/
Conect using default credentials.

Use postman to test these apis:
GET - get info of all customers
http://localhost:8081/customers

GET - get info of specific customer
http://localhost:8081/customers/<cid>

POST - to add a new customer
http://localhost:8081/customers
Input body raw:
{
    "cid": int,
    "cname": String,
    "cemail": String
}

DEL - to delete a customer
http://localhost:8081/customers/<cid>
  
Similarly, you can also try PUT request to update a record.
