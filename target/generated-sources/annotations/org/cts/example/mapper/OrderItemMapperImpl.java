package org.cts.example.mapper;

import javax.annotation.Generated;
import org.cts.example.dto.OrderedItemDto;
import org.cts.sample.vo.OrderedItem;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T13:30:32+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class OrderItemMapperImpl implements OrderItemMapper {

    @Override
    public OrderedItem toOrder(OrderedItemDto orderedItemDto) {
        if ( orderedItemDto == null ) {
            return null;
        }

        OrderedItem orderedItem = new OrderedItem();

        orderedItem.setName( orderedItemDto.getName() );
        orderedItem.setQuantity( orderedItemDto.getQuantity() );

        return orderedItem;
    }

    @Override
    public OrderedItemDto fromOrder(OrderedItem orderedItem) {
        if ( orderedItem == null ) {
            return null;
        }

        OrderedItemDto orderedItemDto = new OrderedItemDto();

        orderedItemDto.setName( orderedItem.getName() );
        orderedItemDto.setQuantity( orderedItem.getQuantity() );

        return orderedItemDto;
    }
}
