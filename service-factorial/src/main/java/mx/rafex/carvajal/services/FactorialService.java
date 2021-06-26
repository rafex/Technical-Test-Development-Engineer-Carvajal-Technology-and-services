package mx.rafex.carvajal.services;

import java.util.List;

import mx.rafex.carvajal.models.Factorial;

public interface FactorialService {
  
  Integer getValue(Integer number);
  
  List<Factorial> getValues(Integer days);
  
}
