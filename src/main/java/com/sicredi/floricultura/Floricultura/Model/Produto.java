package com.sicredi.floricultura.Floricultura.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String familia;
    private Boolean status;
    private Tipo tipo;
    private Date diaDaCompra;
    private Date validade;
    private Double preco;
}

/* {
    "nome": "Girassol",
    "familia": "Asteraceae",
    "status": "true",
    "tipo": "flor",
    "diaDaCompra": "22/08/2022",
    "validade": "27/08/2022",
    "preco": "15.00",
        } */
