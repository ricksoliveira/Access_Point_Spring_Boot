package com.dioproject.liveproject.controller;

import com.dioproject.liveproject.model.Pedido;
import com.dioproject.liveproject.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * <p>The controller class is responsible for mapping the endpoints and requests types</p>
 * <p>Each of them uses a istance of this class equivalent of the Service class, which</p>
 * <p>communicates directly with its Repository responsible for calling the desired methods.</p>
 */

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido ped){
        return pedidoService.savePedido(ped);
    }

    @GetMapping("/list")
    public List<Pedido> getPedidoList(){
        return pedidoService.findAll();
    }

    @GetMapping("/{idPedido}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable("idPedido") Pedido.PedidoId idPedido) throws Exception {
        return ResponseEntity.ok(pedidoService.getById(idPedido).orElseThrow(() -> new NoSuchElementException("Pedido não encontrado!")));
    }

    @PutMapping
    public Pedido updatePedido(@RequestBody Pedido ped){
        return pedidoService.updatePedido(ped);
    }

    @DeleteMapping("/{idPedido}")
    public ResponseEntity<Pedido> deleteById(@PathVariable("idPedido") Pedido.PedidoId idPedido) throws Exception {
        try{
            pedidoService.deletePedido(idPedido);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Pedido>) ResponseEntity.ok();
    }
}
