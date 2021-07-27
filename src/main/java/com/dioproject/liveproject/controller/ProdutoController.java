package com.dioproject.liveproject.controller;

import com.dioproject.liveproject.model.Produto;
import com.dioproject.liveproject.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public Produto createProduto(@RequestBody Produto prod){
        return produtoService.saveProduto(prod);
    }

    @GetMapping("/list")
    public List<Produto> getProdutoList(){
        return produtoService.findAll();
    }

    @GetMapping("/{idProduto}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable("idProduto") Long idProduto) throws Exception {
        return ResponseEntity.ok(produtoService.getById(idProduto).orElseThrow(() -> new NoSuchElementException("Produto não encontrado!")));
    }

    @PutMapping
    public Produto updateProduto(@RequestBody Produto prod){
        return produtoService.updateProduto(prod);
    }

    @DeleteMapping("/{idProduto}")
    public ResponseEntity<Produto> deleteById(@PathVariable("idProduto") Long idProduto) throws Exception {
        try{
            produtoService.deleteProduto(idProduto);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Produto>) ResponseEntity.ok();
    }

}
