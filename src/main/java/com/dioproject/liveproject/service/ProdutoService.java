package com.dioproject.liveproject.service;

import com.dioproject.liveproject.model.Produto;
import com.dioproject.liveproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * <p>The Serive class uses an instance of the Repository interface, it calls the method and</p>
 * <p>returns the result to the caller (Controller class) which can be shown, for instance, in a View.</p>
 */

@Service
public class ProdutoService {

    ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto saveProduto(Produto prod){
        return produtoRepository.save(prod);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getById(Long idProduto) {
        return produtoRepository.findById(idProduto);
    }

    public Produto updateProduto(Produto prod){
        return produtoRepository.save(prod);
    }

    public void deleteProduto(Long idProduto) {
        produtoRepository.deleteById(idProduto);
    }
}
