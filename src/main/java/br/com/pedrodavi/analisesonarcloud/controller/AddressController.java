package br.com.pedrodavi.analisesonarcloud.controller;

import br.com.pedrodavi.analisesonarcloud.model.AddressResponseDTO;
import br.com.pedrodavi.analisesonarcloud.service.CheckAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    CheckAddressService service;

    @GetMapping("/address/{zipcode}")
    public ResponseEntity<AddressResponseDTO> address(@PathVariable String zipcode) {
        AddressResponseDTO address = service.getAddress(zipcode);
        return ResponseEntity.ok(address);
    }

}
