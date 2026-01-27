package com.dabApp.InventoryManagement.mapper;

import com.dabApp.InventoryManagement.business.dto.AddBusinessRequestDto;
import com.dabApp.InventoryManagement.business.dto.AddBusinessResponseDto;
import com.dabApp.InventoryManagement.business.entity.Business;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BusinessMapper
{
  Business mapBusinessRequestDtoToBusiness(AddBusinessRequestDto addBusinessRequestDto);
  AddBusinessResponseDto mapBusinessToBusinessResponseDto(Business business);

}
