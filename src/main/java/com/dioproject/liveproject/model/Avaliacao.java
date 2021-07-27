package com.dioproject.liveproject.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

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
public class Avaliacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public static class AvaliacaoId implements Serializable {
        private long ID_Avaliacao;
        private long ID_Cliente;
        private long ID_Produto;
    }
    @EmbeddedId
    private AvaliacaoId avalId;
    private String avaliacao;
    private long nota;
    private boolean recomenda;

}
