package com.alura.forohub.service;

import com.alura.forohub.domain.curso.Curso;
import com.alura.forohub.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public Curso save(Curso curso){
        return cursoRepository.save(curso);
    }
}
