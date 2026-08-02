package com.laboratorio.springboot_04.controller;

import com.laboratorio.springboot_04.modelo.Producto;
import com.laboratorio.springboot_04.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoRestController {

    private ProductoService productoService = new ProductoService();

    @GetMapping(value = "/productos/{id}")
    public Producto findById(@PathVariable  Integer id){
        return productoService.findById(id);
    }

    @GetMapping(value="/productos")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @PostMapping(value="/productos")
    public Producto create(@RequestBody Producto producto){
        return productoService.create(producto);
    }

    @PutMapping(value = "/productos/{id}")
    public Producto update(@PathVariable Integer id,
                           @RequestBody Producto producto){
        return productoService.update(id,producto);

    }

    @DeleteMapping(value = "/productos/{id}")
    public String delete(@PathVariable Integer id){
        return productoService.delete(id);
    }
}
