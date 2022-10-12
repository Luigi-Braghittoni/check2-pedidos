package br.com.fiap.checkpoint2.command;

import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

public interface DeletarPedido {

	PedidoResponseDto execute(Long id);
	
}
