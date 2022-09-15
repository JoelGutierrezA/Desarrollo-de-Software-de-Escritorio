package evaluación_1.DTO;

public class Suscripcion {
    private int Numero;
    private Usuarios Usuarios;
    private int AbonoTotal;
    private String Equipos;
    
    public Suscripcion(){
        this.Numero = 0;
        this.Usuarios = new Usuarios();
        this.AbonoTotal = 0;
        this.Equipos = "";
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Usuarios getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(Usuarios Usuarios) {
        this.Usuarios = Usuarios;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
    
}
