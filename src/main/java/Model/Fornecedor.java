package Model;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Fornecedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cnpj;
    private Boolean status;
    @OneToMany
    private ArrayList<Produto> produtos;
}

/*
    {
    "nome": "Vitão LTDA",
    "cnpj": "1234567890",
    "status": "true",
    "produtos": [ ]
    }
 */