package com.dioproject.liveproject.service;

import com.dioproject.liveproject.model.Avaliacao;
import com.dioproject.liveproject.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * <p>The Serive class uses an instance of the Repository interface, it calls the method and</p>
 * <p>returns the result to the caller (Controller class) which can be shown, for instance, in a View.</p>
 */

@Service
public class AvaliacaoService {

    AvaliacaoRepository avaliacaoRepository;

    @Autowired
    public AvaliacaoService(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public Avaliacao saveAvaliacao(Avaliacao aval){
        return avaliacaoRepository.save(aval);
    }

    public List<Avaliacao> findAll() {
        return avaliacaoRepository.findAll();
    }

    public Optional<Avaliacao> getById(Avaliacao.AvaliacaoId idAval) {
        return avaliacaoRepository.findById(idAval);
    }

    public Avaliacao updateAvaliacao(Avaliacao aval){
        return avaliacaoRepository.save(aval);
    }

    public void deleteAvaliacao(Avaliacao.AvaliacaoId idAval) {
        avaliacaoRepository.deleteById(idAval);
    }
}
