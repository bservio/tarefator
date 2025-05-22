package com.bservio.tarefator.service;

import java.util.List;

import com.bservio.tarefator.entity.Tarefa;

public interface TarefaService {
	Tarefa salvar(Tarefa tarefa);
	Tarefa editar(Tarefa tarefa);
	void excluir(Long id);
	Tarefa buscarPorId(Long id);
	List<Tarefa> buscaTodos();
}