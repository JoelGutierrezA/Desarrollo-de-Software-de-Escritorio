package evaluación_1.DTO;

public class Clubes {
    private String Codigo;
    private String Nombre;
    private String Lema;
    private int ValorSuscripcion;
    private String Colores;
    
    public Clubes(){
        this.Codigo = "";
        this.Nombre = "";
        this.Lema = "";
        this.ValorSuscripcion = 0;
        this.Colores = "";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }
    
    
}
