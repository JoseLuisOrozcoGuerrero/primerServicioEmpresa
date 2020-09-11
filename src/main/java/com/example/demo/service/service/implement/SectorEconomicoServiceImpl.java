package com.example.demo.service.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.dao.InterfazEmpresaDAO;
import com.example.demo.service.dao.InterfazSectorEconomicoDAO;
import com.example.demo.service.entity.SectorEconomico;
import com.example.demo.service.service.InterfazSectorEconomicoService;

@Service
public class SectorEconomicoServiceImpl  implements InterfazSectorEconomicoService{

	@Autowired
	private InterfazSectorEconomicoDAO respos;
	@Override
	public List<SectorEconomico> ListarSectorEconomico() {
		// TODO Auto-generated method stub
		//List<SectorEconomico> sector = List.newArrayList(getClass().getMethods().s);
		return (List<SectorEconomico>)respos.findAll();
	}

	@Override
	public SectorEconomico save(SectorEconomico sectoreconomico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SectorEconomico existsByIdl(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SectorEconomico update(SectorEconomico sectorecomico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
