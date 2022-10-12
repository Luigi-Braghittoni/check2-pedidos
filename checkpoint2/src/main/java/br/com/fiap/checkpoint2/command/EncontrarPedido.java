package br.com.fiap.checkpoint2.command;

import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

public interface EncontrarPedido {

	PedidoResponseDto execute(Long id);
	
}
