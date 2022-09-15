package evaluación_1.DTO;

public class Suscripcion {
    private int Numero;
    private String FechaSuscripcion;
    private int ValorSuscripcion;
    private Usuarios Usuarios;
    private int AbonoTotal;
    private String Equipos;
    
    public Suscripcion(){
        this.Numero = 0;
        this.FechaSuscripcion = "";
        this.ValorSuscripcion = 0;
        this.Usuarios = new Usuarios();
        this.AbonoTotal = 0;
        this.Equipos = "";
    }
    
    public Suscripcion(int Numero, String FechaSuscripcion, int ValorSuscripcion, Usuarios Usuarios, int AbonoTotal, String Equipos){
        this.Numero = Numero;
        this.FechaSuscripcion = FechaSuscripcion;
        this.ValorSuscripcion = ValorSuscripcion;
        this.Usuarios = Usuarios;
        this.AbonoTotal =  AbonoTotal;
        this.Equipos = Equipos;
    }
    
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        if(Numero > 0){
            this.Numero = Numero;
        }
    }

    public String getFechaSuscripcion() {
        return FechaSuscripcion;
    }

    public void setFechaSuscripcion(String FechaSuscripcion) {
        this.FechaSuscripcion = FechaSuscripcion;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
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
