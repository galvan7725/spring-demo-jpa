package com.luisgalvan.springboot.app.models.dao;
import java.util.List;

import com.luisgalvan.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	
	public List<Cliente> findAll();

}
