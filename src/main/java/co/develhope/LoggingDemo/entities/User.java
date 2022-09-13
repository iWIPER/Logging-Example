package co.develhope.LoggingDemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
// Il ToString mi permetterà di avere i dati dello user
@ToString
@AllArgsConstructor
public class User {

    private String name;
    private String surname;
    private String placeOfBirth;
}
