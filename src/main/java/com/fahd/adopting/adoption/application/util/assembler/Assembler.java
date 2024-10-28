package com.fahd.adopting.adoption.application.util.assembler;

public interface Assembler<Domain, Entity, DTO> {

    Domain fromDtoToDomain(DTO dto);

    DTO fromDomainToDTO(Domain domain);

    Domain fromEntityToDomain(Entity entity);

    Entity fromDomainToEntity(Domain domain);

    DTO fromEntityToDTO(Entity entity);

    Entity fromDTOToEntity(DTO dto);
}

