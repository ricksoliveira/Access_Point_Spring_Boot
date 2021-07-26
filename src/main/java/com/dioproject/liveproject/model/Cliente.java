package com.dioproject.liveproject.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private long ID_Cliente;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String telefone;
    private String cpf;

}
