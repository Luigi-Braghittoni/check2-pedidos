package br.com.fiap.checkpoint2.command;

import br.com.fiap.checkpoint2.dto.PedidoRequestDto;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

public interface AtualizarPedido {

	PedidoResponseDto execute(Long id, PedidoRequestDto request);
	
}
