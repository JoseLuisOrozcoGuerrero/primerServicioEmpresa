package com.example.demo.service.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.entity.Empresa;
import com.example.demo.service.service.InterfazEmpresaService;

@RestController
/**
 * @RequestMaping
 * @author Alejo
 *
 */
@RequestMapping("/v10")

public class EmpresaServiceControllers {

	@Autowired
	private InterfazEmpresaService empserv;
	
	//-----------------------------------------------------------------
	
	@GetMapping("/listempresas")
	public List<Empresa>getListEmpresa(){
		System.out.println("ListarFunciona");
		return empserv.ListarEmpresa();

	}

	@PostMapping("/saveempresas")
	public Empresa saveEmpresa(@RequestBody Empresa empresa) {
		System.out.println("saveempresa");
		return empserv.save(empresa);
	}
	
	@GetMapping("/existsEmpresa/{id}")
	public Empresa existsById (@PathVariable(name="id")Long id){
		Empresa empresa_id = new Empresa();
		empresa_id = empserv.existsById(id);
		System.out.println("Existe empresa funciona");
		return empresa_id;
	}
	
	@PutMapping("/updateEmpresa/{id}")
	public Empresa update (@PathVariable(name="id")Long id, @RequestBody Empresa empresa){
		Empresa empres_Select = new Empresa();
		Empresa empres_Update = new Empresa();
		
		empres_Select = empserv.existsById(id);
		
		empres_Select.setNombre(empresa.getNombre());
		empres_Select.setSecEc(empresa.getSecEc());
		empres_Select.setGesCit(empresa.getGesCit());
		
		empres_Update = empserv.update(empres_Select);
		
		System.out.println("Actualizacion exitosa");
		
		return empres_Update;
	
	}
	
	@DeleteMapping("/deleteEmpresa/{id}")
	public void deletexId (@PathVariable (name="id")Long id) {
		System.out.println("Delete exit");
		empserv.deleteById(id);
	}
}
