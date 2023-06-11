package com.Bhc_Ops.Bhc_API.service;

import com.Bhc_Ops.Bhc_API.model.Pallet;
import com.Bhc_Ops.Bhc_API.repository.PalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalletService {
    @Autowired
    private PalletRepository repository;

    //save pallet or list of pallets
    public List<Pallet> addPallets(List<Pallet> pallets){
        return repository.saveAll(pallets);
    }

    //list all pallets
    public List<Pallet> palletList(){
        return repository.findAll();
    }
}
