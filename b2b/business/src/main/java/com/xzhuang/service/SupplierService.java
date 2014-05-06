package com.xzhuang.service;

import com.xzhuang.dao.SupplierDao;
import com.xzhuang.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class SupplierService {

    @Qualifier("supplierDao")
    @Autowired
    SupplierDao supplierDao;

    public Supplier getSupplierById(Long id) {
        return supplierDao.getSupplierById(id);
    }
}
