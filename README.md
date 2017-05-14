# CI346ai69

1. Pull repository
2. Install mvn and npm
3. Run "mvn spring-boot:run" on the command line


Implemented a front end 'Employee Rota System'. Can add employee shifts and delete them. Attempted to run different tests but only ApplicationTest was successful. 

Note: There is authentication however it is not encrypted. I attempted to resolve this by going through the Spring security tutorials but couldn't import websecurity into my maven dependencies. WebMVC and WebSecurityConfigurerAdapter worked, but for some reason, the external jar file was causing errors on my application. The error that I couldn't resolve was "usernamepasswordauthenticationfilter cannot be resolved". 
