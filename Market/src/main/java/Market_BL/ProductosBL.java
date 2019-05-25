package Market_BL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Market_DO.Producto;

public class ProductosBL {
	
	public static List<Producto> darProductos()
	{
		try {
			ResultSet resultSet = Market_DA.ProductoDA.darProductos();
			
			List<Producto> listProductos;
			
			 Producto item = null;
			 listProductos = new ArrayList<Producto>();
			 
			 while (resultSet.next()) {
				 item = new Producto();
				 item.setId(resultSet.getInt("Id"));
				 item.setCategoria_Id(resultSet.getInt("Categoria_Id"));
				 item.setMarca_Id(resultSet.getInt("Marca_Id"));
				 item.setTienda_Id(resultSet.getInt("Tienda_Id"));
				 item.setImagen(resultSet.getString("Imagen"));
				 item.setDescripcion(resultSet.getString("Descripcion"));
				 item.setCantidad(resultSet.getInt("Cantidad"));
				 item.setPrecio(resultSet.getDouble("Precio"));
				 
				 listProductos.add(item);
			 }
			 
			 return listProductos;
			 
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}	
	}
	
	public static List<Producto> darProductos(String filterProducto)
	{
		try {
			ResultSet resultSet = Market_DA.ProductoDA.darProductos(filterProducto);
			
			List<Producto> listProductos;
			
			 Producto item = null;
			 listProductos = new ArrayList<Producto>();
			 
			 while (resultSet.next()) {
				 item = new Producto();
				 item.setId(resultSet.getInt("Id"));
				 item.setCategoria_Id(resultSet.getInt("Categoria_Id"));
				 item.setMarca_Id(resultSet.getInt("Marca_Id"));
				 item.setTienda_Id(resultSet.getInt("Tienda_Id"));
				 item.setImagen(resultSet.getString("Imagen"));
				 item.setDescripcion(resultSet.getString("Descripcion"));
				 item.setCantidad(resultSet.getInt("Cantidad"));
				 item.setPrecio(resultSet.getDouble("Precio"));
				 
				 listProductos.add(item);
			 }		 
			 return listProductos;		 
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}	
	}
	
}
