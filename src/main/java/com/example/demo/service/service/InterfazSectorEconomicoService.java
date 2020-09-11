package com.example.demo.service.service;

import java.util.List;

import com.example.demo.service.entity.SectorEconomico;

public interface InterfazSectorEconomicoService {

	public List<SectorEconomico> ListarSectorEconomico();
	
	public SectorEconomico save(SectorEconomico sectoreconomico);
	
	public SectorEconomico existsByIdl(long id);
	
	public SectorEconomico update(SectorEconomico sectorecomico);
	
	public void deleteById(long id);
	
}
