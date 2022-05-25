package com.produc.control;

import com.produc.domen.Product;
import com.produc.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

// comenentariya
//    olindi

//    dfdfdf
    @GetMapping("/product")
    public ResponseEntity getAll() {
        return ResponseEntity.ok(service.findAll());
    }


    @PostMapping("/product")
    public Product create(@RequestBody Product product) {
        Product product1 = new Product();
        product1.setFirstName(product.getFirstName());
        product1.setLastName(product.getLastName());
        product1.setNow(product.getNow());
        product1.setPhone(product.getPhone());
        product1.setEmail(product.getEmail());
        return service.save(product1);
    }



//    @PutMapping("/product/{id}")
//    public Product update(@RequestBody Product product) {
//        return service.save(product);
//    }
//
//    @DeleteMapping("/product/{id}")
//    public ResponseEntity delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.ok(id);
//
//
//    }

}
