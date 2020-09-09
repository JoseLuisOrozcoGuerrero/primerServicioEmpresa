package com.example.demo.service.service;

import java.util.List;

import com.example.demo.service.entity.Empresa;

public interface InterfazEmpresaService 
{
	public List<Empresa> ListarEmpresa();
	
	public Empresa save(Empresa empresa);
	
	public Empresa existsById(long id);
	
	public Empresa update(Empresa empresa);
	
	public void deleteById(long id);
}
