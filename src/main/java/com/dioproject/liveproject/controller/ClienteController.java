package com.dioproject.liveproject.controller;

import com.dioproject.liveproject.model.Cliente;
import com.dioproject.liveproject.model.Cliente;
import com.dioproject.liveproject.service.ClienteService;
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
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cli){
        return clienteService.saveCliente(cli);
    }

    @GetMapping("/list")
    public List<Cliente> getClienteList(){
        return clienteService.findAll();
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable("idCliente") Long idCliente) throws Exception {
        return ResponseEntity.ok(clienteService.getById(idCliente).orElseThrow(() -> new NoSuchElementException("Cliente não encontrado!")));
    }

    @PutMapping
    public Cliente updateCliente(@RequestBody Cliente cli){
        return clienteService.updateCliente(cli);
    }

    @DeleteMapping("/{idCliente}")
    public ResponseEntity<Cliente> deleteById(@PathVariable("idCliente") Long idCliente) throws Exception {
        try{
            clienteService.deleteCliente(idCliente);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Cliente>) ResponseEntity.ok();
    }
}
