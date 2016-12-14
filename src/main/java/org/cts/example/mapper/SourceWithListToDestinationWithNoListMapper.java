
package org.cts.example.mapper;


import org.cts.example.dto.SourceWithListValuesDTO;
import org.cts.example.mapper.util.IterableNonInterableUtil;
import org.cts.sample.vo.DestinationWithNoList;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Pradeep Deore
 */
@Mapper( uses = IterableNonInterableUtil.class )
public interface SourceWithListToDestinationWithNoListMapper {

	SourceWithListToDestinationWithNoListMapper MAPPER = Mappers.getMapper(SourceWithListToDestinationWithNoListMapper.class );

    @Mappings( {
        @Mapping( source = "myIntegers", target = "myInteger", qualifiedBy = FirstElement.class ),
        @Mapping( source = "myStrings", target = "myString", qualifiedBy = LastElement.class )
    } )
    DestinationWithNoList toDestinationWithNoList(SourceWithListValuesDTO sourceList);
}
