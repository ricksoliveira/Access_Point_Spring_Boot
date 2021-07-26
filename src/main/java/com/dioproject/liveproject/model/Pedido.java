package com.dioproject.liveproject.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

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
    public class PedidoId implements Serializable{
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
