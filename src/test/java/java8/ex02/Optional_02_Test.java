package java8.ex02;


import java8.data.Person;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 02 - Filter, Map
 */
public class Optional_02_Test {

    class GoodException extends RuntimeException {
    }

    Predicate<Person> adult = p -> p.getAge() > 18;
    Predicate<Person> aged = p -> p.getAge() > 80;

    @Test
    public void test_optional_filter() throws Exception {

        Person jules = new Person("Hugues", "Jules", 30, "pass");

        // TODO encapsuler la valeur jules dans un type Optional
        // TODO utiliser la méthode "of"
        Optional<Person> julesOpt = Optional.of(jules);

        // TODO appliquer la méthode "filter" à julesOpt avec le prédicat "adult"
        Optional<Person> adultPerson = julesOpt.filter (adult) ;
        
   
        // TODO appliquer la méthode "filter" à julesOpt avec le prédicat "aged"
        Optional<Person> agedPerson = julesOpt.filter (aged);

        assertThat(adultPerson.isPresent(), is(true));
        assertThat(agedPerson.isPresent(), is(false));
    }

    @Test
    public void test_optional_map() throws Exception {
        Person jules = new Person("Hugues", "Jules", 30, "pass");

        // TODO encapsuler la valeur jules dans un type Optional
        // TODO utiliser la méthode "of"
        Optional<Person> julesOpt = Optional.of(jules);

        // TODO récupérer l'age de jules via la méthode "map"
        Optional<Integer> julesAge = julesOpt.map(a->a.getAge());
    
        assertThat(julesAge.isPresent(), is(true));
        assertThat(julesAge.get(), is(30));

    }

    @Test(expected = GoodException.class)
    public void test_optional_ifPresent() throws Exception {
        Person jules = new Person("Hugues", "Jules", 30, "pass");

        // TODO encapsuler la valeur jules dans un type Optional
        // TODO utiliser la méthode "of"
        Optional<Person> julesOpt = Optional.of(jules);

        // TODO appliquer la méthode "filter" à julesOpt avec le prédicat "adult"
       
        // TODO chaîner avec la méthode "map" pour récupérer l'age
        
        // TODO utiliser la méthode ifPresent pour vérifier que l'age est bien 30, déclencher l'exception GoodException pour valider que la fonction en paramètre de ifPresent a bien été exécutée.
        // julesOpt.filter...;
        
      
        	julesOpt.filter(adult).map(a->a.getAge()).ifPresent(age -> {
        		assert age == 30;
        		throw new GoodException();
        	});
        	
        		
        	
        				
        				 
          
    }
}



