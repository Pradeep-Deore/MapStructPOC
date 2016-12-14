package org.cts.example.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.cts.example.dto.CustomerDto;
import org.cts.example.dto.OrderedItemDto;
import org.cts.sample.vo.Customer;
import org.cts.sample.vo.OrderedItem;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T13:30:32+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    private final OrderItemMapper orderItemMapper = Mappers.getMapper( OrderItemMapper.class );

    @Override
    public Customer toCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setName( customerDto.getCustomerName() );
        customer.setOrderItems( orderedItemDtoListToOrderedItemCollection( customerDto.getOrders() ) );
        customer.setCustomerNumber( customerDto.getCustomerNumber() );

        return customer;
    }

    @Override
    public CustomerDto fromCustomer(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setOrders( orderedItemCollectionToOrderedItemDtoList( customer.getOrderItems() ) );
        customerDto.setCustomerName( customer.getName() );
        customerDto.setCustomerNumber( customer.getCustomerNumber() );

        return customerDto;
    }

    protected Collection<OrderedItem> orderedItemDtoListToOrderedItemCollection(List<OrderedItemDto> list) {
        if ( list == null ) {
            return null;
        }

        Collection<OrderedItem> collection = new ArrayList<OrderedItem>();
        for ( OrderedItemDto orderedItemDto : list ) {
            collection.add( orderItemMapper.toOrder( orderedItemDto ) );
        }

        return collection;
    }

    protected List<OrderedItemDto> orderedItemCollectionToOrderedItemDtoList(Collection<OrderedItem> collection) {
        if ( collection == null ) {
            return null;
        }

        List<OrderedItemDto> list = new ArrayList<OrderedItemDto>();
        for ( OrderedItem orderedItem : collection ) {
            list.add( orderItemMapper.fromOrder( orderedItem ) );
        }

        return list;
    }
}
