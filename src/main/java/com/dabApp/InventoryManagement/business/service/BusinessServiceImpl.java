package com.dabApp.InventoryManagement.business.service;

import com.dabApp.InventoryManagement.business.dto.AddBusinessRequestDto;
import com.dabApp.InventoryManagement.business.dto.AddBusinessResponseDto;
import com.dabApp.InventoryManagement.business.entity.Business;
import com.dabApp.InventoryManagement.business.exception.DuplicateEmailException;
import com.dabApp.InventoryManagement.business.repository.BusinessRepository;
import com.dabApp.InventoryManagement.mapper.BusinessMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService
{
    private final BusinessRepository businessRepository;
    private final BusinessMapper businessMapper;

    public BusinessServiceImpl(BusinessRepository businessRepository, BusinessMapper businessMapper){
        this.businessRepository=businessRepository;
        this.businessMapper=businessMapper;
    }

    @Override
    @Transactional
    public AddBusinessResponseDto createBusiness(AddBusinessRequestDto addBusinessRequestDto){
        if(businessRepository.existsByEmail(addBusinessRequestDto.getEmail())){
            throw new DuplicateEmailException("Cannot create business with already existing Email");
        }

        Business newBusiness=businessMapper.mapBusinessRequestDtoToBusiness(addBusinessRequestDto);
        Business savedBusiness= businessRepository.save(newBusiness);

        return businessMapper.mapBusinessToBusinessResponseDto(savedBusiness);
    }

}
