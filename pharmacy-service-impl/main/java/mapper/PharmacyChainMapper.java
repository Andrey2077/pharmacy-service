package mapper;


import api.dto.PharmacyChainDataResponse;
import entity.PharmacyChainEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PharmacyChainMapper{

    PharmacyChainDataResponse toDataResponse(PharmacyChainEntity pharmacyChain);

    PharmacyChainEntity toEntity(PharmacyChainDataResponse pharmacyChainDataResponse);

}
