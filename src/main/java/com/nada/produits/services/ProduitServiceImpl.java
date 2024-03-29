package com.nada.produits.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nada.produits.entities.Produit;
import com.nada.produits.repos.ProduitRepository;

public class ProduitServiceImpl implements ProduitService{

	@Autowired
	ProduitRepository produitRepository;
	
	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}

}
