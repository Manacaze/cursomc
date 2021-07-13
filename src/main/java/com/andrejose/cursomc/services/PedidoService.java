package com.andrejose.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrejose.cursomc.domain.Pedido;
import com.andrejose.cursomc.repositories.PedidoRepository;
import com.andrejose.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository clienteRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> object = clienteRepository.findById(id);
		return object.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
