package com.dioproject.liveproject.controller;

import com.dioproject.liveproject.model.Avaliacao;
import com.dioproject.liveproject.service.AvaliacaoService;
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
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    @Autowired
    AvaliacaoService avaliacaoService;

    @PostMapping
    public Avaliacao createAvaliacao(@RequestBody Avaliacao aval){
        return avaliacaoService.saveAvaliacao(aval);
    }

    @GetMapping("/list")
    public List<Avaliacao> getAvaliacaoList(){
        return avaliacaoService.findAll();
    }

    @GetMapping("/{idAvaliacao}")
    public ResponseEntity<Avaliacao> getAvaliacaoById(@PathVariable("idAvaliacao") Avaliacao.AvaliacaoId idAvaliacao) throws Exception {
        return ResponseEntity.ok(avaliacaoService.getById(idAvaliacao).orElseThrow(() -> new NoSuchElementException("Avaliacao não encontrado!")));
    }

    @PutMapping
    public Avaliacao updateAvaliacao(@RequestBody Avaliacao aval){
        return avaliacaoService.updateAvaliacao(aval);
    }

    @DeleteMapping("/{idAvaliacao}")
    public ResponseEntity<Avaliacao> deleteById(@PathVariable("idAvaliacao") Avaliacao.AvaliacaoId idAvaliacao) throws Exception {
        try{
            avaliacaoService.deleteAvaliacao(idAvaliacao);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Avaliacao>) ResponseEntity.ok();
    }
}
