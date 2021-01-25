# Init. Database from code or script base using hibernate

*from a script base*

spring.jpa.hibernate.auto-ddl : its value determins if hibernate automatically generates database schema and tables from entities. 

Spring boot assgin a default value according to the type of databsae found in the class path. 

if it finds an embedded database, like h2 

spring.jpa.hibernate.auto-ddl=create-drop

if it finds a real database, like PostgreSQL

spring.jpa.hibernate.ddl-auto=none

Hence, for an embeded database, if using script to generate schema, putting the following key-value in the `application.properties`

spring.jpa.hibernate.ddl-auto=none

Otherwise, Hibernate generates schema again, and overwritting tables and populated data. 

*from a Hibernate auto and data.sql*

For an embedde database, We may use spring.jpa.hibernate.ddl-auto=none default value,

and leaving hibernate to generate database schema from entities and then popoulate database using a data.sql script.







