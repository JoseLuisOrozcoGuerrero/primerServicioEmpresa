package com.example.demo.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.entity.SectorEconomico;
import com.example.demo.service.service.InterfazSectorEconomicoService;

@RestController
@RequestMapping("/v11")
public class SectorEconomicoControllers {

	@Autowired
	private InterfazSectorEconomicoService helencita;

	/**
	 * Nuevo servicio listar sectores economicos 
	 * @return
	 */
	@GetMapping("/listsector")
	public List<SectorEconomico>getListSectorEconomico(){
		System.out.println("Listar Sector Ecomico Funciona");
		return helencita.ListarSectorEconomico();

	}
}
