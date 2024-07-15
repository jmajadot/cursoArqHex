package org.example.hexagonal.adapters;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.hexagonal.application.ProductService;

@Path( "/products" )
public class ProductController
{
    private final ProductService productService;
    @Inject
    public ProductController( ProductService productService )
    {
        this.productService = productService;
    }
    
    @GET
    @Produces( MediaType.APPLICATION_JSON )
    public String getProducts()
    {
        return productService.getProducts();
    }
    
}
