package mx.rafex.carvajal.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.rafex.carvajal.models.Factorial;
import mx.rafex.carvajal.services.FactorialService;

@Service
public class FactorialServiceImpl implements FactorialService {

  @Override
  public Integer getValue(final Integer number) {
    int result = 0;
    int factorial = 1;
    
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }
    
    result = number * factorial;
    return result;
  }
  
  @Override
  public List<Factorial> getValues(final Integer days) {
    
    final List<Factorial> factorials = new ArrayList<>();

    for (int day = 1; day <= days; day++) {
      factorials.add(new Factorial(day, day, getValue(day)));
    }
    
    return factorials;
  }

}
