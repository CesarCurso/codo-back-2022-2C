package ar.com.codoacododao;

import java.util.List;


import ar.com.codoacododomain.oradores;
public interface ioradoresdao {

	/*define los metodos de acceso a la tabla oradores*/
	/*crud*/
	public oradores getById(Long id) throws Exception;
	//select * from oradores where id = id
	
	
	public List<oradores> findAll()  throws Exception;
	/*public List<oradores> findAll() throws Exception; */
	//select * from oradores
	
	public void delete(Long id) throws Exception;
	//delete from oradores where id = id
	
	public void update(oradores orador) throws Exception;
	//update oradores 
	//set campo1 = valor1.....
	//where id = oradores.id
	
	public void create(oradores newOrador) throws Exception;
	//insert into oradore (campo1, ....m campoN)
	//values(neworadores.campo1, ...neworadore.campoN)

	//select * from oradores where algun campo like '%clave%' 
	/*public List<oradores> search(String id) throws Exception;*/
	public List<oradores> search(String id) throws Exception;
}
