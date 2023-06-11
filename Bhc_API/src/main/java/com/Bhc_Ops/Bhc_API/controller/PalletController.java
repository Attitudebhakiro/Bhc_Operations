package com.Bhc_Ops.Bhc_API.controller;

import com.Bhc_Ops.Bhc_API.model.Pallet;
import com.Bhc_Ops.Bhc_API.service.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PalletController {
    @Autowired
    private PalletService service;

    //save pallet or list of pallets
    @PostMapping("/savePallets")
    public List<Pallet> add(@Valid @RequestBody List<Pallet> pallets){
        return service.addPallets(pallets);
    }
    //list all pallets
    @GetMapping("/listpallets")
    public List<Pallet> allPallets(){
        return service.palletList();
    }

}
