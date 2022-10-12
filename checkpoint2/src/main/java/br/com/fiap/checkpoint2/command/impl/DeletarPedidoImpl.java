package br.com.fiap.checkpoint2.command.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.command.DeletarPedido;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;
import br.com.fiap.checkpoint2.entities.Pedido;
import br.com.fiap.checkpoint2.repositories.PedidoRepository;

@Service
public class DeletarPedidoImpl implements DeletarPedido{

	@Autowired
    private PedidoRepository pedidoRepository;
	private Pedido pedido;

    @Override
    public PedidoResponseDto execute(Long id) {
        pedidoRepository.deleteById(id);
        return new PedidoResponseDto(pedido);
    }
    
}
