package com.gft.tdd.service;

import java.util.List;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.model.StatusPedido;
import com.gft.tdd.repository.Pedidos;

public class PedidoService {

	private List<AcaoLancamentoPedido> acoes;
	private Pedidos pedidos;
	
	public PedidoService(Pedidos pedidos, List<AcaoLancamentoPedido> acoes) {
		this.acoes = acoes;
		this.pedidos = pedidos;
	}

	public double lancar(Pedido pedido) {
		double imposto =  pedido.getValor() * 0.1;
		
		//JAVA 8:
		acoes.forEach(a -> a.executar(pedido));
		
		/*
		for (AcaoLancamentoPedido acao : acoes) {
			acao.executar(pedido);
		}
		*/
		
		return imposto;
	}

	public Pedido pagar(Long codigoPedido) {
		Pedido pedido = pedidos.buscarPeloCodigo(codigoPedido);
		
		if(!pedido.getStatus().equals(StatusPedido.PENDENTE))
			throw new PedidoJaPodeEstarPagoException();
		pedido.setStatus(StatusPedido.PAGO);
		
		return pedido;
	}

}
