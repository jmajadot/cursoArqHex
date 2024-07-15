package org.example.hexagonal.application;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductService
{
    
    public String getProducts()
    {
        return "Listado de productos hexagonal ";
        
    }
}
