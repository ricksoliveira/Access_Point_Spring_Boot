package com.dioproject.liveproject.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Produto {

    @Id
    @GeneratedValue
    private long ID_Produto;
    private String descricao;
    private long quantidade;
    private BigDecimal preco;

}
