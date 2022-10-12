package br.com.fiap.checkpoint2.command.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.command.ListarPedidos;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;
import br.com.fiap.checkpoint2.entities.Pedido;
import br.com.fiap.checkpoint2.repositories.PedidoRepository;

@Service
public class ListarPedidosImpl implements ListarPedidos{

	@Autowired
    private PedidoRepository pedidoRepository;
	
    @Override
    public List<PedidoResponseDto> execute() {
        List<Pedido> pedidos = pedidoRepository.findAll();  
        
        List<PedidoResponseDto> pedidosDto = pedidos.stream().map(pedido -> new PedidoResponseDto(pedido)).collect(Collectors.toList());
		return pedidosDto;
    }
	
}
