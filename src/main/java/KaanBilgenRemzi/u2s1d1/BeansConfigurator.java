package KaanBilgenRemzi.u2s1d1;


import KaanBilgenRemzi.u2s1d1.entites.Drinks;
import KaanBilgenRemzi.u2s1d1.entites.Menu;
import KaanBilgenRemzi.u2s1d1.entites.Pizza;
import KaanBilgenRemzi.u2s1d1.entites.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeansConfigurator {

    @Bean
    Toppings tomato() {
        return new Toppings("Tomato", 1.00, 50);
    }
    @Bean
    Toppings cheese() {
        return new Toppings("Cheese", 1.50, 124);
    }
    @Bean
    Toppings ham() {
        return new Toppings("Ham", 1.50, 250);
    }
    @Bean
    Toppings peperoni() {
        return new Toppings("Peperoni" , 1.50, 276);
    }

    @Bean
    Pizza margherita() {
        return new Pizza("Margherita", List.of(tomato(), cheese()), 5.50, 1200);
    }


    @Bean
    Pizza peperoniPizza() {
        return new Pizza("Pizza Peperoni" , List.of(tomato(),cheese(),peperoni()), 7.50, 1500);
    }

    @Bean
    Drinks fanta() {
        return new Drinks("Fanta" , 3.50, 423);

    }
    @Bean
    Drinks waterHalf() {
        return new Drinks("Water 500ml" , 1.50, 0);
    }

    @Bean
    Menu menu() {
        return new Menu(List.of(margherita(),peperoniPizza()),List.of(tomato(),cheese(),ham(),peperoni()),List.of(fanta(),waterHalf()));
    }
}
