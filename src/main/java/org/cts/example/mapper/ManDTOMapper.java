package org.cts.example.mapper;

import org.cts.example.dto.ManDTO;
import org.cts.sample.vo.Man;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import org.mapstruct.factory.Mappers;

@Mapper
public interface ManDTOMapper {

	ManDTOMapper MAPPER = Mappers.getMapper( ManDTOMapper.class );

	    @Mappings( {
	        @Mapping( target = "numberOfStomachs", source = "numberOfStomachs" )
	    } )
	    void toManDTO( Man man, Long numberOfStomachs, @MappingTarget ManDTO manDto );
}
