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
    
    public Usuarios(int Ide, String NombreCompleto,int Run, String Dv, Date FechaNacimiento, int Telefono, String Email, String Contrasena) {
        this.Ide = Ide;
        this.NombreCompleto = NombreCompleto;
        this.Run = Run;
        this.Dv = Dv;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Contrasena = Contrasena;
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
    
    public void setRun(int Run, char Dv) {
        if(this.validarRut(Run, Dv)){
            this.Run = Run;
            this.Dv = Dv+"";
        }
    }
    
    public String getDv() {
        return Dv;
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
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
