# Access Point Spring Boot

### What is `Access Point` ?

This is a simple application made with `Spring Boot` and `Swagger` developed on a class about endpoints and back-end applications in Java.

The database used in this project can be understood by the following Entity Relationship Diagram:

<img src="https://user-images.githubusercontent.com/68413884/127175209-eadad8e2-2d96-45d1-8e2c-75562e31a87b.png" alt="MER" style="zoom:90%;" />



## What do you need to use it?

> - **Java** (at least Java version 8)
> - **Any IDE**
> - **Any software to make requests**



## How to install

To install this project all you have to do is to clone this repository with the command:

> ```
> 	git clone https://github.com/ricksoliveira/Access_Point_Spring_Boot.git
> ```

Or you can just download it as a `ZIP` file and open as a project  within your IDE.



## How to execute it

> 1. Load the **gradle** dependencies in the `build.gradle` file.
>
> 2. Run the `main` class and wait for the spring boot to load.
>
> 3. By default this application creates a database file inside a folder named `temp` located in your **C:/ drive**.
> 4. Open your web browser and go to the address: `localhost:8081/h2`, or just [Click here](localhost:8081/h2).
> 5. Make sure your settings are as the following image:
>
> ![image](https://user-images.githubusercontent.com/68413884/127070119-a816f4c5-bba7-4faf-a03b-11ad975ca5c2.png)
>
> 6. Click **Test Connection** and check if it shows **Test Successful** as shown in the image:
>    - *In case of the test fails, check again if the **JDBC URL** is the same path as in the `application.properties` file*
>
> ![image](https://user-images.githubusercontent.com/68413884/127176507-93a82063-3fa4-41b5-a9b6-1797dd30a8c5.png)
>
> 7. Click **Connect** and you should be redirected to the database home screen:
>
> ![image](https://user-images.githubusercontent.com/68413884/127177956-e1a6151e-ac36-4705-b4d6-9031aace8cd1.png)
>
> 



## How to use the application

> 1. Go to the **Swagger** interface by clicking **[here](http://localhost:8081/swagger-ui.html#/)**.
>    - *The **Swagger** allows you to make requests to each table*:
>
> ![image](https://user-images.githubusercontent.com/68413884/127178770-de4cb0c0-4cf4-4e91-af48-3eb48bd8d156.png)
>
> 2. When desired feature is selected, it will give you an JSON request example, you can click click **Try it out** to make your own request.
>
> ![image](https://user-images.githubusercontent.com/68413884/127180941-a1dcc85b-dc65-485a-b48f-2ccb593ea728.png)
>
> 3. Before making a request, you can go to the database home screen and make a SQL `SELECT` and see that the database is empty:
>
> ![image](https://user-images.githubusercontent.com/68413884/127179440-9579615a-71aa-4efb-92d9-a377479169ee.png)
>
> 4. Now back on **Swagger**, you can edit your request and click **Execute**:
>    - *You can leave ID field empty since Spring Boot auto generates it for us.*
>
> ![image](https://user-images.githubusercontent.com/68413884/127180132-f1440ae9-5d0e-4642-a9d0-5055e0741a43.png)
>
> 5. If everything is OK, the response code should be **200**:
>
> ![image](https://user-images.githubusercontent.com/68413884/127180240-6252aff9-4554-470d-bd9a-dc456f50aa9c.png)
>
> 6. To confirm that the item has been added to the database, you can make the same SQL SELECT again:
>
> ![image](https://user-images.githubusercontent.com/68413884/127180437-bf6297a6-24e0-45fb-ba21-32c297d789d2.png)



## Authors

- **Henrique Servidoni de Oliveira** - [LinkedIn](https://www.linkedin.com/in/ricksoliveira/)


## Thanks !

> Special thanks to [**DIO**](https://web.digitalinnovation.one/home) and [**Santander**](https://www.santander.com.br) for the full-stack scholarship opportunity.
