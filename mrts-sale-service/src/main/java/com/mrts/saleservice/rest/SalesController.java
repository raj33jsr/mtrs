package com.mrts.saleservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mrts.saleservice.domain.Sale;
import com.mrts.saleservice.domain.SoldTickets;
import com.mrts.saleservice.service.SalesService;

@RestController
@RequestMapping("sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @PostMapping
    public Sale saleTicket(@RequestBody Sale sale) {
        return salesService.saleTicket(sale);

    }

    @GetMapping("/{saleId}")
    public Sale getSaleById(@PathVariable(value = "saleId") String saleId) {
        return salesService.getSaleById(saleId);

    }

    @PutMapping
    public Sale updateSale(@RequestBody Sale sale) {
        return salesService.updateSale(sale);
    }

    @DeleteMapping
    public String deleteSale(@PathVariable(value = "saleId") String saleId) {
        return salesService.deleteSale(saleId);
    }

    @GetMapping("/all")
    public SoldTickets getAllSoldTickets() {
        return salesService.getAllSoldTickets();

    }

    @GetMapping("/person/{personId}")
    public SoldTickets getSoldTickets(@PathVariable(value = "personId") String personId) {
        return salesService.getSoldTicketForPerson(personId);

    }
}
