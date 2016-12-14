
package org.cts.example.mapper;


import org.cts.example.dto.OrderedItemDto;
import org.cts.sample.vo.OrderedItem;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Pradeep Deore
 */
@Mapper
public interface OrderItemMapper {

    OrderItemMapper MAPPER = Mappers.getMapper(OrderItemMapper.class);

    OrderedItem toOrder(OrderedItemDto orderedItemDto);

    @InheritInverseConfiguration
    OrderedItemDto fromOrder(OrderedItem orderedItem);
}
