package com.bservio.tarefator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bservio.tarefator.dao.TarefaDao;
import com.bservio.tarefator.entity.Tarefa;



@Service
@Transactional(readOnly=false)
public class TarefaServiceImpl implements TarefaService {
	
	@Autowired
	private TarefaDao dao;

	@Override
	public Tarefa salvar(Tarefa tarefa) {
		// TODO Auto-generated method stub
		dao.save(tarefa);
		return tarefa;
		

	}

	@Override
	public Tarefa editar(Tarefa tarefa) {
		// TODO Auto-generated method stub
		dao.update(tarefa);
		return tarefa;

	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly=true)
	public Tarefa buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Tarefa> buscaTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
