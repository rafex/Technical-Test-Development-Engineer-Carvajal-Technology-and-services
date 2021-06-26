package mx.rafex.carvajal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mx.rafex.carvajal.models.Factorial;
import mx.rafex.carvajal.services.FactorialService;

@RestController
@RequestMapping("/api/factorial")
public class PersonRest {

  @Autowired
  private FactorialService factorialService;

  @GetMapping("/{days}")
  @ResponseStatus(HttpStatus.OK)
  public List<Factorial> findAll(@PathVariable final int days) {
    return factorialService.getValues(days);
  }

}
