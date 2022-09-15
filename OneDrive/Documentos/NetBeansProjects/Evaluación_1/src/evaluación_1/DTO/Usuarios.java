package evaluación_1.DTO;

import java.util.Date;

public class Usuarios {
    private int Ide;
    private String NombreCompleto;
    private int Run;
    private String Dv;
    private Date FechaNacimiento;
    private int Telefono;
    private String NombreUsuario;
    private String Email;
    private String Contrasena;
    
    public Usuarios(){
        this.Ide = 0;
        this.NombreCompleto = "";
        this.Run = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date();
        this.Telefono = 0;
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

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int Run) {
        this.Run = Run;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
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
