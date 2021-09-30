package br.com.pedrodavi.analisesonarcloud.model;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressResponseDTOTest {

    @Test
    void addressResponseDTO() {
        assertThat(AddressResponseDTO.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanToString()
        ));
    }

    @Test
    void builderConstruct() {
        AddressResponseDTO addressResponseDTO = new AddressResponseDTO("", "", "", "", "", "", "", "", "", "");
        AddressResponseDTO addressResponseDTOBuilder = AddressResponseDTO.builder()
                .bairro("").cep("").complemento("").ddd("").gia("")
                .ibge("").localidade("").logradouro("").siafi("")
                .uf("").build();

        assertNotNull(addressResponseDTO);
        assertNotNull(addressResponseDTOBuilder);
    }

}
