package br.com.pedrodavi.analisesonarcloud.service;

import br.com.pedrodavi.analisesonarcloud.model.AddressResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "address", url = "https://gwapi.pedrodavi.com.br/v1/address")
public interface CheckAddressService {

    @GetMapping("/{zipcode}?appkey=${app.key}")
    AddressResponseDTO getAddress(@PathVariable("zipcode") String zipcode);

}
