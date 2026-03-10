package mapper;


import api.dto.PharmacyDataResponse;
import entity.PharmacyEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PharmacyMapper {

    PharmacyDataResponse toDataResponse(PharmacyEntity pharmacyChain);

    PharmacyEntity toEntity(PharmacyDataResponse pharmacyChainDataResponse);

}
