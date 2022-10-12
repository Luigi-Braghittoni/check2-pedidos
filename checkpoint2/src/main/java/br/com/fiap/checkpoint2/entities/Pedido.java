package br.com.fiap.checkpoint2.entities;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fiap.checkpoint2.dto.PedidoRequestDto;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

@Entity
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dataPedido;
    private Long codigoCliente;
    private Instant dataCadastro;
    private BigDecimal valorTotal;

    public Pedido(Long id, Instant dataPedido, Long codigoCliente, Instant dataCadastro, BigDecimal valorTotal) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.codigoCliente = codigoCliente;
        this.dataCadastro = dataCadastro;
        this.valorTotal = valorTotal;
    }

    public Pedido() {}

    public static Pedido from(PedidoRequestDto pedidoRequestDto) {
    	Pedido pedido = new Pedido();
    	pedido.setDataPedido(pedidoRequestDto.getDataPedido());
    	pedido.setCodigoCliente(pedidoRequestDto.getCodigoCliente());
    	pedido.setDataCadastro(pedidoRequestDto.getDataCadastro());
    	pedido.setValorTotal(pedidoRequestDto.getValorTotal());
    	return pedido;
    }
    
    public static Pedido from(PedidoResponseDto pedidoResponseDto) {
    	Pedido pedido = new Pedido();
    	pedido.setId(pedidoResponseDto.getId());
    	pedido.setDataPedido(pedidoResponseDto.getDataPedido());
    	pedido.setCodigoCliente(pedidoResponseDto.getCodigoCliente());
    	pedido.setDataCadastro(pedidoResponseDto.getDataCadastro());
    	pedido.setValorTotal(pedidoResponseDto.getValorTotal());
    	return pedido;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Instant dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Instant getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Instant dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
