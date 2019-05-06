package Market_DA;

public class UserDA extends DataAccessCore{
	
	public static void darUsuarios()
	{
		try{			
			 resultSet = statement.executeQuery("SELECT * FROM USERS");
			 
			 while (resultSet.next()) {
			  System.out.println("---Usuario---");
			  System.out.println("ID: " + resultSet.getString(1));
			  System.out.println("Nombre: " + resultSet.getString(2));
			  System.out.println("Apellido: " + resultSet.getString(3));
			 }
			  
			} catch (Exception ex) {
			 ex.printStackTrace();
			}
	}

}
