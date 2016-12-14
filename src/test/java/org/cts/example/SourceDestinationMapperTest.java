
package org.cts.example;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.cts.example.dto.CustomerDto;
import org.cts.example.dto.ManDTO;
import org.cts.example.dto.OrderedItemDto;
import org.cts.example.dto.PersonDTO;
import org.cts.example.dto.SourceFileDTO;
import org.cts.example.dto.SourceWithListValuesDTO;
import org.cts.example.mapper.CustomerMapper;
import org.cts.example.mapper.ManDTOMapper;
import org.cts.example.mapper.PersonMapper;
import org.cts.example.mapper.SourceDestinationMapper;
import org.cts.example.mapper.SourceWithListToDestinationWithNoListMapper;
import org.cts.example.sampleEnum.CarType;
import org.cts.sample.vo.Customer;
import org.cts.sample.vo.DestinationFile;
import org.cts.sample.vo.DestinationWithNoList;
import org.cts.sample.vo.Man;
import org.cts.sample.vo.OrderedItem;
import org.cts.sample.vo.Person;
import org.junit.Test;

/**
 *
 * @author Pradeep Deore
 * @Date 12/9/2016
 * 
 */
public class SourceDestinationMapperTest {

	public SourceDestinationMapperTest() {
	}

	/**
	 * Test of toTarget method, of class SourceTargetMapper.
	 */
	@Test
	public void testToTarget() {

		SourceFileDTO sourceFile = new SourceFileDTO();
		sourceFile.setBigDecimal2(new BigDecimal(1.3333));
		sourceFile.setBigDecimal3(new BigDecimal(1.3333));
		sourceFile.setBigDecimal2UnConstrained(new BigDecimal(1.3333));

		DestinationFile t = SourceDestinationMapper.MAPPER.toDestinationFile(sourceFile);

		assertEquals(new BigDecimal("1.33"), t.getBigDecimal2());
		assertEquals(new BigDecimal("1.333"), t.getBigDecimal3());
		assertEquals(1.333d, t.getBigDecimal2UnConstrained().doubleValue(), 0.001d);
	}

	@Test
	public void testMapDtoToEntity() {

		CustomerDto customerDto = new CustomerDto();
		customerDto.setCustomerNumber(10L);
		customerDto.setCustomerName("Pradeep");
		OrderedItemDto order1 = new OrderedItemDto();
		order1.setName("Table");
		order1.setQuantity(2L);
		customerDto.setOrders(new ArrayList<OrderedItemDto>(Collections.singleton(order1)));

		Customer customer = CustomerMapper.MAPPER.toCustomer(customerDto);

		assertEquals(new Long(10), customer.getCustomerNumber());
		assertEquals(new String("Pradeep"), customer.getName());

	}

	@Test
	public void testEntityDtoToDto() {

		Customer customer = new Customer();
		customer.setCustomerNumber(10L);
		customer.setName("Pradeep");
		OrderedItem orderItem = new OrderedItem();
		orderItem.setName("Table");
		orderItem.setQuantity(2L);
		customer.setOrderItems(new ArrayList<OrderedItem>(Collections.singleton(orderItem)));

		CustomerDto customerDto = CustomerMapper.MAPPER.fromCustomer(customer);

		assertEquals(new Long(10), customerDto.getCustomerNumber());
		assertEquals(new String("Pradeep"), customerDto.getCustomerName());
	}

	@Test
	public void testToDestinationWithNoList() {

		SourceWithListValuesDTO s = new SourceWithListValuesDTO();
		s.setMyIntegers(Arrays.asList(35, 63, 87));
		s.setMyStrings(Arrays.asList("six", "two", "seventy"));

		DestinationWithNoList t = SourceWithListToDestinationWithNoListMapper.MAPPER.toDestinationWithNoList(s);
		assertEquals(new Integer(35), t.getMyInteger());
		assertEquals("seventy", t.getMyString());
	}

	@Test
	public void shouldMapPersonDTOToPerson() {
		// Assigning value to personDTO
		PersonDTO personDTO = new PersonDTO("Pradeep", 1, CarType.HONDA_CITY);

		// when
		Person person = PersonMapper.INSTANCE.personDTOToPerson(personDTO);

		// then

		assertEquals(personDTO.getName(), person.getName());
		assertEquals(personDTO.getNumberOfBankAccounts(), person.getNumberOfBankAccounts());
		assertEquals(personDTO.getCar().toString(), person.getCar());
	}

	@Test
	public void testMantoManDTO() {

		Man man = new Man();
		man.setNumberOfLegs(4);

		ManDTO manDto = new ManDTO();

		// mapping the extra field thats not there in target
		ManDTOMapper.MAPPER.toManDTO(man, 3L, manDto);

		assertEquals(manDto.getNumberOfLegs(), new Long(man.getNumberOfLegs()));
		assertEquals(manDto.getNumberOfStomachs(), new Long(3L));

	}
}
