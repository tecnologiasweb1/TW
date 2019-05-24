package Market_DO;


/**
 * Esta clase representa a un usuario.
 * El usuario puede ser un cliente, un vendedor, etc.
 * Almacena sus datos personales así como un identificador
 * único, una clave y el tipo de usuario.
 * @author silverio
 */
public class User {

    private int Id;
    private String Nombre;
    private String Email;
    private String Pass;
    private String Ciudad;
    private String CP;
    private UserType UserType;
    
	/**
	 * Crea un nuevo usuario, no requiere parámetros a priori.
	 * Se configuran a posteriori.
	 */
	public User(){}

	/**
	 * @return the id
	 */
	public int getId() {return Id;}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {Id = id;}

	/**
	 * @return the nombre
	 */
	public String getNombre() {return Nombre;}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {Nombre = nombre;}

	/**
	 * @return the email
	 */
	public String getEmail() {return Email;}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {Email = email;}

	/**
	 * @return the pass
	 */
	public String getPass() {return Pass;}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {Pass = pass;}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {return Ciudad;}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {Ciudad = ciudad;}

	/**
	 * @return the cP
	 */
	public String getCP() {return CP;}

	/**
	 * @param cP the cP to set
	 */
	public void setCP(String cP) {CP = cP;}

	/**
	 * @return the userType
	 */
	public UserType getUserType() {return UserType;}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType) {UserType = userType;}


    
    public String getNombre()
	{
		return this.Nombre;
	}

}
