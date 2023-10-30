package KaanBilgenRemzi.u2s1d1.entites;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
private String name;
private List<Toppings> toppings;
private double price;
private int calories;


}
