package ar.com.codoacodocontroller;

import ar.com.codoacododao.ioradoresdao;
import ar.com.codoacododaoimpl.oradordaomysqlimpl;
import ar.com.codoacododomain.oradores;

public class getoradorcontroller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      
		ioradoresdao dao= new oradordaomysqlimpl();
		long id =1;
		
		//oradores p;
		oradores p = dao.getById(id);
	/*	try {
		p=dao.getById(id);
	}catch (Exception e) {
		p=null;
	}*/
      if(p !=null) {
    	  System.out.println(p);
      }else {
    	  System.out.println("no existe el id"+id);
      }
}
}