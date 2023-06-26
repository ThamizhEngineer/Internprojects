package com.sw.SpringIonicCrud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.SpringIonicCrud.Exception.ResourceNotFoundException;

import com.sw.SpringIonicCrud.Entity.products;
import com.sw.SpringIonicCrud.Repository.productrepository;
import com.sw.SpringIonicCrud.Service.loginservice;

@Controller
@RestController
@RequestMapping("/main/value")
public class productcontroller {
	@Autowired
	private loginservice service;

	@Autowired
	private productrepository productrepo;

	// get data using parent &child
	@GetMapping("/products")
	public List<products> findAll() {
		return productrepo.findAll();
	}

	// get data by productbyid
	@GetMapping("/products/{productid}")
	public Optional<products> getproductById(@PathVariable Integer productid) {
		return productrepo.findById(productid);
	}

	// Insert using parent table
	@PostMapping("/products")
	public products createproduct(@RequestBody products product) {
		return productrepo.save(product);
	}

	// update in parent table

	@PutMapping("/products/{productid}")
	public ResponseEntity<products> updateprod(@PathVariable Integer productid, @RequestBody products productdata) {
		products prod = productrepo.findById(productid)
				.orElseThrow(() -> new ResourceNotFoundException("product not exist:" + productid));
		prod.setProductid(productdata.getProductid());
		prod.setProductname(productdata.getProductname());
		prod.setProductprice(productdata.getProductprice());
		prod.setQuantity(productdata.getQuantity());
		products updateprod = productrepo.save(prod);

		return ResponseEntity.ok(updateprod);

	}
	// delete tables using parent

	@DeleteMapping("/products/{productid}")
	public String deleteRecord(@PathVariable Integer productid) {
		return service.deleteById(productid);
	}
	@GetMapping("/products/name")
	public String name() {
		return "Thamizhselvi";
	}
}
