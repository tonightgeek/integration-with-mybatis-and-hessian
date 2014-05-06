package com.xzhuang.model;

import com.xzhuang.dto.SupplierDto;

import java.io.Serializable;

public class Supplier implements Serializable{

    private String name;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplierDto toSupplierDto() {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setName(this.getName());
        return supplierDto;
    }
}
