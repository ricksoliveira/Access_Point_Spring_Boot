package com.dioproject.liveproject.service;

import com.dioproject.liveproject.model.Pedido;
import com.dioproject.liveproject.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * <p>The Serive class uses an instance of the Repository interface, it calls the method and</p>
 * <p>returns the result to the caller (Controller class) which can be shown, for instance, in a View.</p>
 */

@Service
public class PedidoService {

    PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido savePedido(Pedido ped){
        return pedidoRepository.save(ped);
    }

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> getById(Pedido.PedidoId idPed) {
        return pedidoRepository.findById(idPed);
    }

    public Pedido updatePedido(Pedido ped){
        return pedidoRepository.save(ped);
    }

    public void deletePedido(Pedido.PedidoId idPed) {
        pedidoRepository.deleteById(idPed);
    }
}
