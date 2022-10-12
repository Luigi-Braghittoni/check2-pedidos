package br.com.fiap.checkpoint2.dto;

import java.math.BigDecimal;
import java.time.Instant;

import br.com.fiap.checkpoint2.entities.Pedido;

public class PedidoResponseDto {

	private Long id;
    private Instant dataPedido;
    private Long codigoCliente;
    private Instant dataCadastro;
    private BigDecimal valorTotal;
    

	public PedidoResponseDto(Pedido pedido){
		this.id=pedido.getId();
		this.dataPedido = pedido.getDataPedido();
        this.codigoCliente = pedido.getCodigoCliente();
        this.dataCadastro = pedido.getDataCadastro();
        this.valorTotal = pedido.getValorTotal();
    	return;
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
