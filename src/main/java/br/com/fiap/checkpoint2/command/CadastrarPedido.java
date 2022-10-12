package br.com.fiap.checkpoint2.command;

import br.com.fiap.checkpoint2.dto.PedidoRequestDto;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

public interface CadastrarPedido {

	PedidoResponseDto execute(PedidoRequestDto request);
	
}
