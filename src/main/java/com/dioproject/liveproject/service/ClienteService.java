package com.dioproject.liveproject.service;

import com.dioproject.liveproject.model.Cliente;
import com.dioproject.liveproject.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * <p>The Serive class uses an instance of the Repository interface, it calls the method and</p>
 * <p>returns the result to the caller (Controller class) which can be shown, for instance, in a View.</p>
 */

@Service
public class ClienteService {

    ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente saveCliente(Cliente cli){
        return clienteRepository.save(cli);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getById(Long idCliente) {
        return clienteRepository.findById(idCliente);
    }

    public Cliente updateCliente(Cliente cli){
        return clienteRepository.save(cli);
    }

    public void deleteCliente(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }
}
