# Notifier
<br>

## Installation steps
- Download the project
- Open command promt
- Move to the project folder 
```sh
    notifier> cd ../notifier
```
## _Database setup_

From the root folder of your project run the following commands
```sh
     notifier> cd documents
     notifier> mysql -u {username} -p
```

Enter the password of your database

 In Mysql console type the following command

```sh
mysql> source database_script.sql
```

Now you can see that your database and tables are created

## To Run the Project

Move to the root folder of the project ie's `../notifier/` and run the below command
```mvn
 notifier> mvn clean install
 notifier> mvn tomcat7:run-war
```

Now Your project will run in port `8080`


# To view Output

- Open the browser and type the folloing URL  http://localhost:8080/

# To change Front end
Delete the folowing files in the listed in this folder  `  notifier\src\main\webapp\resources\css`

- style.default.css
- custom.css

then add your css files here and import it into  jsp pages 

> `NOTE : `  Please don't delete any js files or script code in the jsp pages
>If project throws an exception `port already in use` please kill the process that run in port 8080 and rerun the project



