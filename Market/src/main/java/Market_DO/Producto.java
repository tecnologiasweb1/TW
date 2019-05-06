package Market_DO;

import java.util.*;;

public class Producto {
	
	public int Id;
	public int Categoria_Id;
	public int Marca_Id;
	public int Tienda_Id;
	public String Imagen;
	public String Descripcion;
	public int Cantidad;
	public double Precio;
	
	public String getImagen()
	{
		return this.Imagen;
	}
	public String getDescripcion()
	{
		return this.Descripcion;
	}
	public int getCantidad()
	{
		return this.Cantidad;
	}
	public double getPrecio()
	{
		return this.Precio;
	}
	
	public List<ProductoPuntuacion> ProductoPuntuacion;
}
