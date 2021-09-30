package br.com.pedrodavi.analisesonarcloud.controller;

import br.com.pedrodavi.analisesonarcloud.model.AddressResponseDTO;
import br.com.pedrodavi.analisesonarcloud.service.CheckAddressService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AddressController.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
class AddressControllerTest {

    static String API_URL = "/api/address";

    MockHttpServletRequestBuilder request;

    @Autowired
    MockMvc mvc;

    @MockBean
    private CheckAddressService service;

    @Test
    void getAddress() throws Exception {
        given(service.getAddress("58900000")).willReturn(any(AddressResponseDTO.class));
        request = get(API_URL.concat("/58900000")).accept(MediaType.APPLICATION_JSON);
        mvc.perform(request).andExpect(status().isOk());
    }

}
