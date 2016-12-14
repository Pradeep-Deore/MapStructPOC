package org.cts.example.mapper;

import org.cts.example.dto.PersonDTO;
import org.cts.sample.vo.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
/**
 * @author Pradeep Deore
 */

@Mapper
public interface PersonMapper {

	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

	// Mapping Enum to String in this Example
	Person personDTOToPerson(PersonDTO personDTO);

}
