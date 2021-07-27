package com.dioproject.liveproject.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * <p>This Class is a mapped class from a table of the database</p>
 * <p>and its attributes are the tables columns.</p>
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Long ID_Produto;
    private String descricao;
    private long quantidade;
    private BigDecimal preco;

}
