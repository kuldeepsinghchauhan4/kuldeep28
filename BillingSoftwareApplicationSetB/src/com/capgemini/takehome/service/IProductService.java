package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.ProductCodeIsNotValidException;

public interface IProductService {
Product getProductDetails(int productCode) throws ProductCodeIsNotValidException, InvalidProductCodeException;
}