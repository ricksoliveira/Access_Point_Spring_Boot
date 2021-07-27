package com.dioproject.liveproject.controller;

import com.dioproject.liveproject.model.Cliente;
import com.dioproject.liveproject.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cli){
        return clienteService.saveCliente(cli);
    }

    @GetMapping
    public List<Cliente> getClienteList(){
        return clienteService.findAll();
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable("idCliente") Long idCliente) throws Exception {
        return ResponseEntity.ok(clienteService.getById(idCliente).orElseThrow(() -> new NoSuchElementException("Cliente não encontrado!")));
    }
}
