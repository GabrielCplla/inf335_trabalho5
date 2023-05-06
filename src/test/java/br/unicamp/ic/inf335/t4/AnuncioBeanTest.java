package br.unicamp.ic.inf335.t4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.net.URL;
import java.util.ArrayList;

class AnuncioBeanTest {

	@Test
	void test() {
		ProdutoBean produto = new ProdutoBean();
		produto.setValor(10.0);
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(produto);
		
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		anuncio.setFotosUrl(fotosUrl);
		
		anuncio.setDesconto(0.5);
		assertEquals(5, anuncio.getValor());
		
		anuncio.setDesconto(0.0);
		assertEquals(10, anuncio.getValor());
	
		anuncio.setDesconto(1.0);
		assertEquals(0, anuncio.getValor());
		
	}

}
