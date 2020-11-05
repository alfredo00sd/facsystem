package com.integra.opensource.practica6.controllers;

import com.integra.opensource.practica6.models.BillDetails;
import com.integra.opensource.practica6.models.Products;
import com.integra.opensource.practica6.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    private BillRepository billRepository;

    @PostMapping("/processItem")
    public String processItem(@RequestParam(value = "facId") int facId,
                              @RequestParam(value = "productId") int productId,
                              @RequestParam(value = "quantity") int quantity,
                              @RequestParam(value = "price") int price) {

        return "Inserted " + billRepository.insert(new BillDetails(0, facId, productId, quantity, price));
    }

    @GetMapping("/billDetails")
    public List<BillDetails> billDetails() {
        return billRepository.findAll();
    }

    @GetMapping("/detailsByFac")
    public List<BillDetails> detailsByFac(@RequestParam(value = "facId") int facId) {
        return billRepository.findByFacId(facId);
    }

    @GetMapping("/inventory")
    public List<Products> getInventory() {
        return billRepository.getInventory();
    }

}
