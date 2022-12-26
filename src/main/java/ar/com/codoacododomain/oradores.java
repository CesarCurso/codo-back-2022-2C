package ar.com.codoacododomain;

public class oradores {

	private long id;
	private String nombre;
	private String apellido;
	private String temaconfe;
	private String tituloconfe;
	
	
	
	public oradores(long id, String nombre, String apellido, String temaconfe, String tituloconfe) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.temaconfe = temaconfe;
		this.tituloconfe = tituloconfe;
	}



	public oradores(String nombre, String apellido, String temaconfe, String tituloconfe) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.temaconfe = temaconfe;
		this.tituloconfe = tituloconfe;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTemaconfe() {
		return temaconfe;
	}



	public void setTemaconfe(String temaconfe) {
		this.temaconfe = temaconfe;
	}



	public String getTituloconfe() {
		return tituloconfe;
	}



	public void setTituloconfe(String tituloconfe) {
		this.tituloconfe = tituloconfe;
	}
	
	
	
	
	
}
