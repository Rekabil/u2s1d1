package KaanBilgenRemzi.u2s1d1.entites;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Menu {
    private List<Pizza> pizzas;
    private List<Toppings> toppings;
    private List<Drinks> drinks;


}
