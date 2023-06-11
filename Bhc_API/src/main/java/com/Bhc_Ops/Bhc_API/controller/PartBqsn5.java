package com.Bhc_Ops.Bhc_API.controller;

import com.Bhc_Ops.Bhc_API.model.Bale;
import com.Bhc_Ops.Bhc_API.model.Pallet;
import com.Bhc_Ops.Bhc_API.repository.BaleRepository;
import com.Bhc_Ops.Bhc_API.repository.PalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class PartBqsn5 {
    @Autowired
    private PalletRepository palletRepository;

    @Autowired
    private BaleRepository baleRepository;
    @PostMapping("/loadPallet")
    public Pallet loadPallet(@Validated @RequestBody Pallet requestPallets){
        Pallet pallet = new Pallet();
        pallet.setPalletNumber(requestPallets.getPalletNumber());
        pallet.setWarehouse(requestPallets.getWarehouse());

        List<Bale> bales = requestPallets.getBales();
        if(bales.size()>25){
            System.out.println("Number Bales exceeds the Pallet Capacity");
        }else {
            pallet.setBales(bales);
            return palletRepository.save(pallet);
        }
      return null;

    }

}
