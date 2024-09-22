http://localhost:8080/WebServiceProjectClient/samplePersonServiceImplProxy/TestClient.jsp?endpoint=http://localhost:5667/WebServiceProject/services/PersonServiceImpl

Endpoint=http://localhost:5667/WebServiceProject/services/PersonServiceImpl
http://localhost:8080/WebServiceProjectClient/samplePersonServiceImplProxy/TestClient.jsp?wsdl

wsdl-http://localhost:5667/WebServiceProject/services/PersonServiceImpl


##
postman
http://localhost:8080/ws/hello?wsdl


Using Tools for WSDL Generation:
If you need to generate WSDL or client stubs, you can use the wsgen (for server-side WSDL generation) and wsimport (for client-side stub generation) tools. These can be run from Maven goals as well.

Apache TomEE or WildFly

######
Drop table person;

Create table person (id integer(10) primary key,name varchar(50),age integer(10),
sal integer(10),loc varchar(50));

insert into person values(1,'chandra',35,12345,'delhi');
insert into person values(2,'shekhar',36,23451,'noida');