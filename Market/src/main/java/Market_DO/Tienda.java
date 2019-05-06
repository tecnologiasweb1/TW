package Market_DO;

import java.util.List;

public class Tienda {

	public Tienda(int Id, String Name, List<Servicio> Servicios) {
		// TODO Auto-generated constructor stub
		this.Name = Name;
		this.Id = Id;
		this.Servicios = Servicios;
	}
	
	public String Name;
	public int Id;
	public List<Servicio> Servicios;
}
