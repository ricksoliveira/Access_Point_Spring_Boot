package com.dioproject.liveproject.controller;

import com.dioproject.liveproject.model.Produto;
import com.dioproject.liveproject.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public Produto createProduto(@RequestBody Produto prod){
        return produtoService.saveProduto(prod);
    }

    @GetMapping
    public List<Produto> getProdutoList(){
        return produtoService.findAll();
    }

    @GetMapping("/{idProduto}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable("idProduto") Long idProduto) throws Exception {
        return ResponseEntity.ok(produtoService.getById(idProduto).orElseThrow(() -> new NoSuchElementException("Produto não encontrado!")));
    }

}
