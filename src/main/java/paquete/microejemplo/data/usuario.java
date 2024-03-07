package paquete.microejemplo.data;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class usuario {
    private Long id;
    private String username;
    private String email;
    private Integer edad;
    private String password;

}