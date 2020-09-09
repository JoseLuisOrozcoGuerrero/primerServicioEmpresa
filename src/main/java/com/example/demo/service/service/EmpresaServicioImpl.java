package com.example.demo.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.dao.InterfazEmpresaDAO;
import com.example.demo.service.entity.Empresa;

@Service
public class EmpresaServicioImpl implements InterfazEmpresaService{

	
	@Autowired
	private InterfazEmpresaDAO reposi;
	
	
	@Override
	public List<Empresa> ListarEmpresa() {
		// TODO Auto-generated method stub
		return (List<Empresa>) reposi.findAll();
	}
	
	@Override
	public Empresa save(Empresa empresa) {
		return reposi.save(empresa);
	}
	
	@Override
	public Empresa existsById(long id) {
		return reposi.findById(id).get();
	}

	@Override
	public Empresa update(Empresa empresa) {
		// TODO Auto-generated method stub
		return reposi.save(empresa);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		reposi.deleteById(id);
	}

}
