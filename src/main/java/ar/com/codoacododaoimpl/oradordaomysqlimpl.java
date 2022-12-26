package ar.com.codoacododaoimpl;

import java.sql.Connection;
import java.sql.ResultSet;

import ar.com.codoacododao.ioradoresdao;
import ar.com.codoacododb.AdministradorDeConexiones;
import ar.com.codoacododomain.oradores;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
public class oradordaomysqlimpl implements ioradoresdao {

	@Override
	public oradores getById(Long id) throws Exception {
		// TODO Auto-generated method stub
		//conecto
		//armastatement instruccion
		//obtengo resultado resultset
		Connection connection= AdministradorDeConexiones.getConnection();
		String sql="SELECT *FROM oradores WHERE id="+id;
		
		Statement state=connection.createStatement();
		
		ResultSet result=state.executeQuery(sql);
		
		//verifico si hay datos
		
		
		if(result.next()) {
			return this.crearorador(result);
		//	return new oradores(idba,nomb,aple,titu,tema);
			
		}
					
					return null;
	}

	@Override
	public List<oradores> findAll()  throws Exception {
		// TODO Auto-generated method stub
		Connection connection= AdministradorDeConexiones.getConnection();
		String sql="SELECT *FROM oradores ";
		
		Statement state=connection.createStatement();
		
		ResultSet result=state.executeQuery(sql);
		
		//verifico si hay datos
		
		List<oradores> orad= new ArrayList<oradores>();
		
		
		while(result.next()) {
			orad.add(this.crearorador(result));
			//orad.add(new oradores(idba,nomb,aple,titu,tema));
			
		}
		
		
		
		return orad;
	} 
	
	@Override
	public void delete(Long id)   throws Exception {
		// TODO Auto-generated method stub
		Connection connection = AdministradorDeConexiones.getConnection();

		// 2 - arma el statement
		String sql = "DELETE FROM PRODUCTO WHERE ID="+id;
		Statement state = connection.createStatement();

		// 3 - resultset
		int eliminado = state.executeUpdate(sql);//1 o 2
		
	//	cerrar(connection);
		System.out.println(eliminado);
		
		

	}

	@Override
	public void update(oradores orador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(oradores newOrador) throws Exception {
		// TODO Auto-generated method stub

	}
	
	private oradores crearorador(ResultSet result) throws Exception {
	long idba=result.getLong("id");
	String nomb=result.getString("nombre");
	String aple=result.getString("apellido");
	String titu=result.getString("titulo-confe");
	String tema=result.getString("tema-confe");
	
	return new oradores(idba,nomb,aple,titu,tema);
	}

	@Override
	public List<oradores> search(String clave) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}




}
