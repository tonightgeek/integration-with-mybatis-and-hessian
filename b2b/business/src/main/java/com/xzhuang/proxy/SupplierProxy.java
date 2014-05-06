package com.xzhuang.proxy;

import com.xzhuang.dto.SupplierDto;
import com.xzhuang.interfaces.SupplierInterface;
import com.xzhuang.model.Supplier;
import com.xzhuang.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;


public class SupplierProxy implements SupplierInterface{

    @Autowired
    SupplierService supplierService;

    @Override
    public SupplierDto getSupplierById(Long id) {
//        Supplier supplier = supplierService.getSupplierById(id);

//        return supplier.toSupplierDto();

        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setName("supplierDto");
        return supplierDto;
    }
}
