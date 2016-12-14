package org.cts.example.mapper;

import javax.annotation.Generated;
import org.cts.example.dto.SourceWithListValuesDTO;
import org.cts.example.mapper.util.IterableNonInterableUtil;
import org.cts.sample.vo.DestinationWithNoList;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T13:30:32+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class SourceWithListToDestinationWithNoListMapperImpl implements SourceWithListToDestinationWithNoListMapper {

    private final IterableNonInterableUtil iterableNonInterableUtil = new IterableNonInterableUtil();

    @Override
    public DestinationWithNoList toDestinationWithNoList(SourceWithListValuesDTO sourceList) {
        if ( sourceList == null ) {
            return null;
        }

        DestinationWithNoList destinationWithNoList = new DestinationWithNoList();

        destinationWithNoList.setMyString( iterableNonInterableUtil.last( sourceList.getMyStrings() ) );
        destinationWithNoList.setMyInteger( iterableNonInterableUtil.first( sourceList.getMyIntegers() ) );

        return destinationWithNoList;
    }
}
