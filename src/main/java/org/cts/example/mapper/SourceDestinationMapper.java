/**
 * @author Pradeep Deore (438423)
 * @date 12/9/2016
 * 
 */
package org.cts.example.mapper;


import org.cts.example.dto.SourceFileDTO;
import org.cts.example.mapper.util.RoundingUtil;
import org.cts.example.mapper.util.RoundingUtil.Fraction2;
import org.cts.example.mapper.util.RoundingUtil.Fraction3;
import org.cts.sample.vo.DestinationFile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Pradeep Deore
 */
@Mapper( uses = RoundingUtil.class )
public interface SourceDestinationMapper {

	SourceDestinationMapper MAPPER = Mappers.getMapper( SourceDestinationMapper.class );

    @Mappings( {
        @Mapping( target = "bigDecimal2", qualifiedBy = Fraction2.class ),
        @Mapping( target = "bigDecimal3", qualifiedBy = Fraction3.class ),
        @Mapping( target = "bigDecimal2UnConstrained" )
    } )
    DestinationFile toDestinationFile(SourceFileDTO source);
}
