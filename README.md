## DEPLOYING SPRING BOOT APPLICATION ON AZURE
	


<p style="font-family: times, serif; font-size:16pt;  color:black">
In this demonstration we will see how to host of a spring boot application on Azure cloud
</p>



#### Prerequisites :

<p style="font-family: times, serif; font-size:14pt;  color:black">
Active Azure subscription
<br>
JDK 1.8 or above
<br>
GIT bash or any git client
<br>
Maven
<br>
Azure CLI
<br>
</p>
<br><br>

<h2 font-size:16pt;>Installing Azure CLI and login to azure subscription from terminal : </h2>

<p style="font-family: times, serif; font-size:14pt;  color:black">
$ brew install azure-cli 
<br><br>If successfully logged in then check the version <br><br>
$ az --version
Use the below command to login <br><br>
$ az login
<br><br>You will be redirected to browser for login to your Azure subscription. 
</p>
<br><br><br>


<h2 font-size:16pt;>Cloning the project from GIT hub and running it : </h2>

<p style="font-family: times, serif; font-size:14pt;  color:black">
$ git clone https://github.com/sunil-mohanty/azure-spring-boot-app.git
<br><br>
$ cd azure-spring-boot-app
<br><br>
Compile  and build the code -
<br><br>
$ ./mvnw clean package
<br><br>Run the code - <br><br>
$ ./mvnw spring-boot:run

<br><br>Now we can validate by hitting the below url in the browser - <br><br>
http://localhost:8080/fruits/price-list
<br><br>Response will be as follows - <br><br>
["1 kg  Golden Apple $5.0","1 kg  Red Guava $3.0","1 kg  Green Orange $1.0","1 kg  Purple Mango $2.0","1 kg  Pink Grapes $4.0"]
</p>
<br><br><br>




<h2 font-size:16pt;>Deploying the application in Azure using azure CLI : </h2>

<p style="font-family: times, serif; font-size:14pt;  color:black">
Hit the below command to configure the azure-maven-plugin in the application<br><br>
$ ./mvnw com.microsoft.azure:azure-webapp-maven-plugin:1.14.0:config
<br><br>
The above command will use your cli authentication token if you have already logged in, Unless it will prompt you for login.
<br>
Then it will prompt you certain deployment specific questions.
<br>
The terminal traces will be as follows :
<br>
</p>

![1-terminal-trace](./ReadmeFiles/1-terminal-trace.png)

<p style="font-family: times, serif; font-size:14pt;  color:black">
Now open and check the configuration section of the pom.xml. You can see the modification as follows :
<br><br>
</p>

![2-pom-configuration](./ReadmeFiles/2-pom-configuration.png)

<p style="font-family: times, serif; font-size:14pt;  color:black">
Now run the below maven command to deploy the application on Azure
<br><br>
$ mvn azure-webapp:deploy
<br><br>
Once deployment is success you can see the below logs in the terminal. 
<br><br>
<br>

![3-deploy-success](./ReadmeFiles/3-deploy-success.png)

<p style="font-family: times, serif; font-size:14pt;  color:black">
Now copy the application url from the terminal and use it as your application url in the browser.
<br><br><br>
Use the context root and end point with the url to get the output : 
<br><br>
https://xxxxxxxxxxxxxxxxxxxxx.azurewebsites.net/fruits/price-list
<br><br>
Response will be as follows :
<br>
["1 kg  Golden Apple $5.0","1 kg  Red Guava $3.0","1 kg  Green Orange $1.0","1 kg  Purple Mango $2.0","1 kg  Pink Grapes $4.0"]

<br><br>
This application can be managed now by logging in to azure portal.
<br><br>
</p>



## References :

Find the below reference links for more information :
- [Maven Plugin for Azure App Service ](https://github.com/microsoft/azure-maven-plugins/blob/develop/azure-webapp-maven-plugin/README.md/)
- [Azure spring cloud ](https://azure.microsoft.com/en-us/services/spring-cloud/#overview)
- [Spring Boot App development](https://spring.io/projects/spring-boot)
