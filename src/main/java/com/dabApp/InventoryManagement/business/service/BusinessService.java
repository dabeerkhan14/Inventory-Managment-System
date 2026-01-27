package com.dabApp.InventoryManagement.business.service;

import com.dabApp.InventoryManagement.business.dto.AddBusinessRequestDto;
import com.dabApp.InventoryManagement.business.dto.AddBusinessResponseDto;

public interface BusinessService
{
    AddBusinessResponseDto createBusiness(AddBusinessRequestDto addBusinessRequestDto);
}
