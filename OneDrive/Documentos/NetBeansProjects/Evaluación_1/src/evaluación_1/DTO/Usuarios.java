package evaluación_1.DTO;

public class Usuarios {
    private int Ide;
    private String NombreUsuario;
    private String Email;
    private String Contrasena;
    
    public Usuarios(){
        this.Ide = 0;
        this.NombreUsuario = "";
        this.Email = "";
        this.Contrasena = "";
    }

    public int getIde() {
        return Ide;
    }

    public void setIde(int Ide) {
        this.Ide = Ide;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if(NombreUsuario.length() >= 4){
            this.NombreUsuario = NombreUsuario;
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@"))
            if (Email.contains(".com")|| Email.contains(".cl")){
                this.Email = Email;
        }
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        if(Contrasena.length() > 6){
            this.Contrasena = Contrasena;
        }    
    }
    
    
}
