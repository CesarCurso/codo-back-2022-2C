package ar.com.codoacodocontroller;

import java.util.List;

import ar.com.codoacododao.ioradoresdao;
import ar.com.codoacododaoimpl.oradordaomysqlimpl;
import ar.com.codoacododomain.oradores;


public class findalloradorcontroller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ioradoresdao dao= new oradordaomysqlimpl();
		
		List<oradores> orar= dao.findAll();
		
		for(oradores aux : orar) {
			System.out.println(aux);
			System.out.println("--------");
			
			
			
		}
		
		
		//long id =1;
		
		//oradores p;
		//oradores p = dao.getById(id);
	/*	try {
		p=dao.getById(id);
	}catch (Exception e) {
		p=null;
	}*/
    /*  if(p !=null) {
    	  System.out.println(p);
      }else {
    	  System.out.println("no existe el id"+id);
      }*/
}
		
		
		
		
	}

