package br.com.fiap.checkpoint2.command.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.command.EncontrarPedido;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;
import br.com.fiap.checkpoint2.entities.Pedido;
import br.com.fiap.checkpoint2.repositories.PedidoRepository;

@Service
public class EncontrarPedidoImpl implements EncontrarPedido {

	@Autowired
    private PedidoRepository pedidoRepository;
	
	@Override
	public PedidoResponseDto execute(Long id) {
		Pedido p = pedidoRepository.findById(id).orElseThrow(NoSuchElementException::new);
		return new PedidoResponseDto(p);
	}
}
