package cl.praxis.miprimerspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private int age;

    public void saludo(String name) {
        System.out.println("Hola, soy " + name);
    }
}
