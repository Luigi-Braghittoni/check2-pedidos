package br.com.fiap.checkpoint2.command.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.command.AtualizarPedido;
import br.com.fiap.checkpoint2.dto.PedidoRequestDto;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;
import br.com.fiap.checkpoint2.entities.Pedido;
import br.com.fiap.checkpoint2.repositories.PedidoRepository;

@Service
public class AtualizarPedidoImpl implements AtualizarPedido {
    
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public PedidoResponseDto execute(Long id, PedidoRequestDto requestDto){
    	Pedido p = pedidoRepository.findById(id).orElseThrow(NoSuchElementException::new);
        p.setDataPedido(requestDto.getDataPedido());
        p.setCodigoCliente(requestDto.getCodigoCliente());
        p.setDataCadastro(requestDto.getDataCadastro());
        p.setValorTotal(requestDto.getValorTotal());
        pedidoRepository.save(p);
      return new PedidoResponseDto(p);
    }   
    
}
