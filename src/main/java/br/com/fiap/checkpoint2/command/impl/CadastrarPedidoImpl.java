package br.com.fiap.checkpoint2.command.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.command.CadastrarPedido;
import br.com.fiap.checkpoint2.dto.PedidoRequestDto;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;
import br.com.fiap.checkpoint2.entities.Pedido;
import br.com.fiap.checkpoint2.repositories.PedidoRepository;

@Service
public class CadastrarPedidoImpl implements CadastrarPedido {

    
    @Autowired
    private PedidoRepository pedidoRepository;
	private Pedido pedido;

    
    @Override
    public PedidoResponseDto execute(PedidoRequestDto requestDto) {
    	this.pedido = Pedido.from(requestDto);
        pedidoRepository.save(pedido);
        return new PedidoResponseDto(pedido);
    }

   
}
