package ksch;

import io.cucumber.spring.CucumberContextConfiguration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TestConfig.class)
@EnableAutoConfiguration
public class CucumberSpringConfiguration {
}