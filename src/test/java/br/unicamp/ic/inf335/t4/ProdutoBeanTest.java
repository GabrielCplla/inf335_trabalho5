package br.unicamp.ic.inf335.t4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ProdutoBeanTest {

	@Test
	void testCodigo() {
		ProdutoBean prod = new ProdutoBean();
		String c = "123456 0987";
		prod.setCodigo(c);
		assertEquals(c, prod.getCodigo());
	}
	
	@Test
	void testNome() {
		ProdutoBean prod = new ProdutoBean();
		String c = "123456 0987";
		prod.setNome(c);
		assertEquals(c, prod.getNome());
	}
	
	@Test
	void testDescricao() {
		ProdutoBean prod = new ProdutoBean();
		String c = "123456 0987";
		prod.setDescricao(c);
		assertEquals(c, prod.getDescricao());
	}
	
	@Test
	void testEstado() {
		ProdutoBean prod = new ProdutoBean();
		String c = "123456 0987";
		prod.setEstado(c);
		assertEquals(c, prod.getEstado());
	}
	
	@Test
	void testValor() {
		ProdutoBean prod = new ProdutoBean();
		Double c = 1234.5678;
		prod.setValor(c);
		assertEquals(c, prod.getValor());
	}
	
	@Test
	void test() {
		ProdutoBean prod1 = new ProdutoBean();
		ProdutoBean prod2 = new ProdutoBean();
		
		prod1.setValor(1.0);
		prod2.setValor(2.0);
		
		assertEquals(-1, prod1.compareTo(prod2));
		assertEquals(1, prod2.compareTo(prod1));
		
		prod2.setValor(1.0);
		assertEquals(0, prod2.compareTo(prod1));
	}

}
