package com.dabApp.InventoryManagement.business.controller;

import com.dabApp.InventoryManagement.business.dto.AddBusinessRequestDto;
import com.dabApp.InventoryManagement.business.dto.AddBusinessResponseDto;
import com.dabApp.InventoryManagement.business.service.BusinessService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController
{
    private final BusinessService businessService;

    public BusinessController(BusinessService businessService){
        this.businessService=businessService;
    }

    @PostMapping("/api/businesses")
    public ResponseEntity<AddBusinessResponseDto> createBusiness(@RequestBody @Valid AddBusinessRequestDto addBusinessRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(businessService.createBusiness(addBusinessRequestDto));
    }
}


