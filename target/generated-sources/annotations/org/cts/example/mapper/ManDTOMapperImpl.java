package org.cts.example.mapper;

import javax.annotation.Generated;
import org.cts.example.dto.ManDTO;
import org.cts.sample.vo.Man;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T13:30:32+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class ManDTOMapperImpl implements ManDTOMapper {

    @Override
    public void toManDTO(Man man, Long numberOfStomachs, ManDTO manDto) {
        if ( man == null && numberOfStomachs == null ) {
            return;
        }

        if ( man != null ) {
            if ( man.getNumberOfLegs() != null ) {
                manDto.setNumberOfLegs( man.getNumberOfLegs().longValue() );
            }
        }
        if ( numberOfStomachs != null ) {
            manDto.setNumberOfStomachs( numberOfStomachs );
        }
    }
}
