package com.xzhuang.dao;


import com.xzhuang.model.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao {

    Supplier getSupplierById(Long id);

}
