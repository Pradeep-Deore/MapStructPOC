package org.cts.example.mapper;

import javax.annotation.Generated;
import org.cts.example.dto.PersonDTO;
import org.cts.sample.vo.Person;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T13:30:32+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person personDTOToPerson(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setName( personDTO.getName() );
        person.setNumberOfBankAccounts( personDTO.getNumberOfBankAccounts() );
        if ( personDTO.getCar() != null ) {
            person.setCar( personDTO.getCar().name() );
        }

        return person;
    }
}
