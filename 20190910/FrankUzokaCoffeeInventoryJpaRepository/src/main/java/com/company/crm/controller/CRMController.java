package com.company.crm.controller;

import com.company.crm.dao.CoffeeRepository;
import com.company.crm.dao.Roasters;
import com.company.crm.dto.Coffee;
import com.company.crm.dto.Roaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CRMController {

    @Autowired
    private CoffeeRepository customerRepo;

    @Autowired
    private Roasters noteRepo;

    @RequestMapping(value="/coffee", method = RequestMethod.POST)
    public Coffee createCustomer(@RequestBody Coffee coffee) {
        customerRepo.save(coffee);
        return coffee;
    }

    @RequestMapping(value="/customer/{id}", method = RequestMethod.GET)
    public Coffee getCustomerById(@PathVariable(name="id") int id) {
        return customerRepo.findOne(id);
    }

    @RequestMapping(value="/coffee/{id}", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Coffee coffee, @PathVariable(name = "id") int id) {

        customerRepo.save(coffee);
    }

    @RequestMapping(value="/customer/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable(name = "id") int id) {
        customerRepo.delete(id);
    }

    @RequestMapping(value="/customers", method = RequestMethod.GET)
    public List<Coffee> getAllCustomers() {
        return customerRepo.findAll();
    }

    @RequestMapping(value="/roaster", method = RequestMethod.POST)
    public Roaster createNote(@RequestBody Roaster roaster) {
        noteRepo.save(roaster);
        return roaster;
    }

    @RequestMapping(value="/note/{id}", method = RequestMethod.GET)
    public Roaster getNoteById(@PathVariable(name="id") int id) {
        Roaster roaster = noteRepo.findOne(id);
        return roaster;
    }

    @RequestMapping(value="/roaster/{id}", method = RequestMethod.PUT)
    public void updateNote(@RequestBody Roaster roaster, @PathVariable(name="id") int id) {
        // TODO - check matching ids...
        noteRepo.save(roaster);
    }

    @RequestMapping(value="/note/{id}", method = RequestMethod.DELETE)
    public void deleteNote(@PathVariable(name="id") int id) {
        noteRepo.delete(id);
    }

    @RequestMapping(value="/notes", method = RequestMethod.GET)
    public List<Roaster> getAllNotes() {
        List<Roaster> roasterList =  noteRepo.findAll();
        return roasterList;
    }
}
