package com.example.demo.service.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.service.entity.Empresa;

public interface InterfazEmpresaDAO extends CrudRepository<Empresa, Long>
{

}
