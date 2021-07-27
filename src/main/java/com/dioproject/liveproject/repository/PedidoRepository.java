package com.dioproject.liveproject.repository;

import com.dioproject.liveproject.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>This interface is a repository which has many of basic spring boot methods</p>
 * <p>including save, delete, getById.</p>
 */

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Pedido.PedidoId> {
}
