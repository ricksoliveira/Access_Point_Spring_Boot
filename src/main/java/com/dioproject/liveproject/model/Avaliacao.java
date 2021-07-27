package com.dioproject.liveproject.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

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
    public class AvaliacaoId implements Serializable {
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
