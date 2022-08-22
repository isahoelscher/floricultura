package com.sicredi.floricultura.Floricultura.Model;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private String CNPJ;
    private Boolean status;
    @OneToMany
    private List<Produto> produtos;
}

/*
    {
    "nome": "Vitão LTDA",
    "cnpj": "1234567890",
    "status": "true",
    "produtos": [ ]
    }
 */