package com.xzhuang.controller;

import com.xzhuang.dto.SupplierDto;
import com.xzhuang.interfaces.SupplierInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    @Qualifier("supplierInterface")
    SupplierInterface supplierInterface;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public void start(@PathVariable("id") Long id) {
        SupplierDto supplierDto = supplierInterface.getSupplierById(id);
        System.out.println(supplierDto);
    }

}
