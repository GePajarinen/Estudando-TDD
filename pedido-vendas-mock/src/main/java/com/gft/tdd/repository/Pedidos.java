package com.gft.tdd.repository;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.service.AcaoLancamentoPedido;

public class Pedidos implements AcaoLancamentoPedido {
	
	@Override
	public void executar(Pedido pedido) {
		System.out.println("Salvando no banco de dados...");
	}
	
	public Pedido buscarPeloCodigo(Long codigo) {
		//Buscaria no banco de dados o pedido.
		return new Pedido();
	}

}
