package mx.rafex.test.carvajal.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.rafex.carvajal.ServiceFactorialApplication;
import mx.rafex.carvajal.services.FactorialService;

@SpringBootTest(classes = ServiceFactorialApplication.class)
public class FactorialServiceTest {

  @Autowired
  private FactorialService factorialService;
  
  @Test
  @DisplayName("Test Spring @Autowired Integration service factorial")
  void factorialNumberSix() {

    final Integer value = factorialService.getValue(6);

    assertEquals(4320, value, "Factorial number six");
  }
  
}
