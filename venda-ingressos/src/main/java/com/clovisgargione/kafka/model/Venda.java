package com.clovisgargione.kafka.model;

import java.math.BigDecimal;

public class Venda {

	private Long operacao;
	private Long cliente;
	private Integer quantidadeDeIngressos;
	private BigDecimal valorTotal;
	private String status;
	
	public Venda() {
		super();
	}

	public Venda(Long operacao, Long cliente, Integer quantidadeDeIngressos, BigDecimal valorTotal) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.quantidadeDeIngressos = quantidadeDeIngressos;
		this.valorTotal = valorTotal;
	}

	public Long getOperacao() {
		return operacao;
	}

	public void setOperacao(Long operacao) {
		this.operacao = operacao;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public Integer getQuantidadeDeIngressos() {
		return quantidadeDeIngressos;
	}

	public void setQuantidadeDeIngressos(Integer quantidadeDeIngressos) {
		this.quantidadeDeIngressos = quantidadeDeIngressos;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Venda [operacao=" + operacao + ", cliente=" + cliente + ", quantidadeDeIngressos="
				+ quantidadeDeIngressos + ", valorTotal=" + valorTotal + ", status=" + status + "]";
	}
	
}
