package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.controller.AvalicaoFisica;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.AvaliacaoFisica;
import me.dio.academia.digital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        // TODO Auto-generated method stub
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
        
    }

    @Override
    public Aluno get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica() {
        // TODO Auto-generated method stub
        AlunoRepository
        return null;
    }

    public List<AvalicaoFisica> getAllAvalicaoFisicaId(Long id) {
        
        repository.findById(id).get();

        return aluno.getAvaliacoes();
        return null;
    }
    
}
