
package org.cts.example.mapper;

import org.cts.example.dto.CustomerDto;
import org.cts.sample.vo.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Pradeep Deore
 */
@Mapper(uses = { OrderItemMapper.class })
public interface CustomerMapper {

    CustomerMapper MAPPER = Mappers.getMapper( CustomerMapper.class );

    @Mappings({
        @Mapping(source = "orders", target = "orderItems"),
        @Mapping(source = "customerName", target = "name")
    })
    Customer toCustomer(CustomerDto customerDto);

    @InheritInverseConfiguration
    CustomerDto fromCustomer(Customer customer);
}
