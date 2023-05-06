package br.unicamp.ic.inf335.t4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;

class AnuncianteBeanTest {


	@Test
	void testNome() {
		AnuncianteBean anunciante = new AnuncianteBean();
		String testNome = "Fulano Siclano";
		anunciante.setNome(testNome);
		String nome = anunciante.getNome();
		assertEquals(testNome, nome);
	}

	@Test
	void testCPF() {
		AnuncianteBean anunciante = new AnuncianteBean();
		String testCPF = "12345678912";
		anunciante.setCPF(testCPF);
		String cpf = anunciante.getCPF();
		assertEquals(testCPF, cpf);
	}

	@Test
	void testNomeCPFConstrutorParametros() {
		String testNome = "Fulano Siclano";
		String testCPF = "12345678912";
		ArrayList<AnuncioBean> testAnuncios = new ArrayList<AnuncioBean>();
		
		AnuncianteBean anunciante = new AnuncianteBean(testNome, testCPF, testAnuncios);
		
		String nome = anunciante.getNome();
		assertEquals(testNome, nome);
		String cpf = anunciante.getCPF();
		assertEquals(testCPF, cpf);
	}
	
	@Test
	void testValorMedio() {
		
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setValor(10.0);
		ProdutoBean produto2 = new ProdutoBean();
		produto2.setValor(20.0);
		
		AnuncioBean anuncio1 = new AnuncioBean();
		anuncio1.setProduto(produto1);
		AnuncioBean anuncio2 = new AnuncioBean();
		anuncio2.setProduto(produto2);
		
		anuncio1.setDesconto(0.5);
		anuncio2.setDesconto(0.75);
		
		ArrayList<AnuncioBean> testAnuncios = new ArrayList<AnuncioBean>();
		testAnuncios.add(anuncio1);
		testAnuncios.add(anuncio2);
		
		String testNome = "Fulano Siclano";
		String testCPF = "12345678912";
		AnuncianteBean anunciante = new AnuncianteBean(testNome, testCPF, testAnuncios);
		assertEquals(5, anunciante.valorMedioAnuncios());
	}
	
	@Test
	void testAddRemoveAnuncio() {
		
		ProdutoBean produto1 = new ProdutoBean();
		produto1.setValor(10.0);
		ProdutoBean produto2 = new ProdutoBean();
		produto2.setValor(20.0);
		
		AnuncioBean anuncio1 = new AnuncioBean();
		anuncio1.setProduto(produto1);
		AnuncioBean anuncio2 = new AnuncioBean();
		anuncio2.setProduto(produto2);
		
		anuncio1.setDesconto(0.5);
		anuncio2.setDesconto(0.75);
		
		AnuncianteBean anunciante = new AnuncianteBean();
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		
		assertEquals(2, anunciante.getAnuncios().size());
		
		anunciante.removeAnuncio(0);
		assertEquals(1, anunciante.getAnuncios().size());
		anunciante.removeAnuncio(0);
		assertEquals(0, anunciante.getAnuncios().size());
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		
		anunciante.removeAnuncio(1);
		assertEquals(1, anunciante.getAnuncios().size());
		anunciante.removeAnuncio(0);
		assertEquals(0, anunciante.getAnuncios().size());
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		
		anunciante.removeAnuncio(0);
		assertEquals(1, anunciante.getAnuncios().size());
		anunciante.removeAnuncio(1);
		assertEquals(1, anunciante.getAnuncios().size());
	}
}
