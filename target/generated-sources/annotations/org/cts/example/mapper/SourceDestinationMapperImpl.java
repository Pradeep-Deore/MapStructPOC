package org.cts.example.mapper;

import javax.annotation.Generated;
import org.cts.example.dto.SourceFileDTO;
import org.cts.example.mapper.util.RoundingUtil;
import org.cts.sample.vo.DestinationFile;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T13:30:32+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class SourceDestinationMapperImpl implements SourceDestinationMapper {

    private final RoundingUtil roundingUtil = new RoundingUtil();

    @Override
    public DestinationFile toDestinationFile(SourceFileDTO source) {
        if ( source == null ) {
            return null;
        }

        DestinationFile destinationFile = new DestinationFile();

        destinationFile.setBigDecimal2( roundingUtil.fraction2( source.getBigDecimal2() ) );
        destinationFile.setBigDecimal3( roundingUtil.fraction3( source.getBigDecimal3() ) );
        destinationFile.setBigDecimal2UnConstrained( source.getBigDecimal2UnConstrained() );

        return destinationFile;
    }
}
