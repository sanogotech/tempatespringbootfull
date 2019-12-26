# Spring Boot Templates Full


This is to illustrate layouts example in thymeleaf using the Thymeleaf 3. 


## Pre-requisites
- Maven 3.3+
- Java 8+
- Tomcat 8+ (Optional)
- Thymeleaf 3.0.x
- Bootstrap  AdminLTE Template
- Spring Boot 2.1
- spring-boot-starter-security
- flywaydb

## Configuration
The fist thing required is to declare your depencies in your `pom.xml`

```xml
</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
	
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

```

The second thing to do is your spring configuration

```java

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource datasource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/home/**","/bower_components/**","/bower.json","/js/**","/less/**", "/dist/**", "/plugins/**").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .failureUrl("/login?error")
                .loginPage("/login")
                .defaultSuccessUrl("/index")
                .permitAll()
                .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")
                .permitAll();
    }
}

```



## Running the Application
Your can run the application by specifying a maven goal `mvn spring-boot:run`, which will start an embedded Tomcat instance.
Visit your new application on [http://127.0.0.1:8080/](http://localhost:8080/).



