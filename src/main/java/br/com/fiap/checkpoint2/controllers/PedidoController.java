package br.com.fiap.checkpoint2.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.checkpoint2.command.AtualizarPedido;
import br.com.fiap.checkpoint2.command.CadastrarPedido;
import br.com.fiap.checkpoint2.command.DeletarPedido;
import br.com.fiap.checkpoint2.command.EncontrarPedido;
import br.com.fiap.checkpoint2.command.ListarPedidos;
import br.com.fiap.checkpoint2.dto.PedidoRequestDto;
import br.com.fiap.checkpoint2.dto.PedidoResponseDto;

@RequestMapping("pedidos")
@RestController
public class PedidoController {
    
    @Autowired
    private CadastrarPedido cadastrarPedido;

    @Autowired
    private AtualizarPedido atualizarPedido;
    
    @Autowired
    private DeletarPedido deletarPedido;
    
    @Autowired
    private ListarPedidos listarPedidos;  
    
    @Autowired
    private EncontrarPedido encontrarPedido;
    
    
    @GetMapping
    public ResponseEntity<List<PedidoResponseDto>> listarPedidos(){
        List<PedidoResponseDto> listaPedidos = listarPedidos.execute();
        return new ResponseEntity<>(listaPedidos,HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<PedidoResponseDto> encontrarPedido(@PathVariable Long id) {
        PedidoResponseDto responseDto = encontrarPedido.execute(id);
        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<PedidoResponseDto> cadastraPedido(@RequestBody PedidoRequestDto requestDto) {
    	PedidoResponseDto responseDto = cadastrarPedido.execute(requestDto);
        return new ResponseEntity<>(responseDto,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoResponseDto> atualizarPedido(@PathVariable Long id, @RequestBody PedidoRequestDto requestDto){
    	PedidoResponseDto responseDto = atualizarPedido.execute(id, requestDto);
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PedidoResponseDto> deletarPedido(@PathVariable Long id) {
    	PedidoResponseDto responseDto = deletarPedido.execute(id);
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}
