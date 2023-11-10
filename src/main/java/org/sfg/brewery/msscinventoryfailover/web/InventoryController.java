package org.sfg.brewery.msscinventoryfailover.web;

import guru.sfg.brewery.model.BeerInventoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestController
public class InventoryController {

    @GetMapping("api/v1/beer/{beerId}/inventory")
    public List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId) {
        BeerInventoryDto beerInventoryDto = BeerInventoryDto.builder()
                .beerId(UUID.randomUUID())
                .quantityOnHand(999)
                .upc("123456")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .build();
        return List.of(beerInventoryDto);
    }
}
