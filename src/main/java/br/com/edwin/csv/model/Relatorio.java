package br.com.edwin.csv.model;

public class Relatorio {
	private String regiao;
	private String sigla;
	private String estado;
	private String municipio;
	private String revenda;
	private String cnpj;
	private String nomeProduto;
	private String dataColeta;
	private String valorVenda;
	private String valorCompra;
	private String unidadeMedida;
	private String bandeira;
	
	public Relatorio(String regiao, String sigla, String estado, String municipio, String revenda, String cnpj,
			String nomeProduto, String dataColeta, String valorVenda, String valorCompra, String unidadeMedida,
			String bandeira) {
		super();
		this.regiao = regiao;
		this.sigla = sigla;
		this.estado = estado;
		this.municipio = municipio;
		this.revenda = revenda;
		this.cnpj = cnpj;
		this.nomeProduto = nomeProduto;
		this.dataColeta = dataColeta;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.unidadeMedida = unidadeMedida;
		this.bandeira = bandeira;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getRevenda() {
		return revenda;
	}
	public void setRevenda(String revenda) {
		this.revenda = revenda;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDataColeta() {
		return dataColeta;
	}
	public void setDataColeta(String dataColeta) {
		this.dataColeta = dataColeta;
	}
	public String getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}
	public String getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	
}
