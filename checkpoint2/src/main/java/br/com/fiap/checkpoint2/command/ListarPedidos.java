package br.com.fiap.checkpoint2.command;

import java.util.List;

import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

public interface ListarPedidos {

	List<PedidoResponseDto> execute();
	
}
