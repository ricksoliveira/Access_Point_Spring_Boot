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
public class Pedido {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public static class PedidoId implements Serializable{
        private long ID_Pedido;
        private long ID_Cliente;
        private long ID_Produto;
    }
    @EmbeddedId
    private PedidoId pedId;
    private String metodo_pagamento;
    private String data;
    private String status;
    private long quantidade;

}
