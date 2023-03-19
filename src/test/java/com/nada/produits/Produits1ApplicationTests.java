package com.nada.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nada.produits.entities.Produit;
import com.nada.produits.repos.ProduitRepository;

@SpringBootTest
class Produits1ApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC Asus tuf",2500.0,new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p= produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0);
		produitRepository.save(p);
	}
	
	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousProduits() {
		List<Produit> prods= produitRepository.findAll();
		for (Produit p : prods) {
			System.out.println(p);
		}
	}

}
