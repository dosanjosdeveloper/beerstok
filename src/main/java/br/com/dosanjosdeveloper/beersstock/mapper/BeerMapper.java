package br.com.dosanjosdeveloper.beersstock.mapper;

import br.com.dosanjosdeveloper.beersstock.dto.BeerDTO;
import br.com.dosanjosdeveloper.beersstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
