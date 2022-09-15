package evaluación_1.DTO;

public class Clubes {
    private String Codigo;
    private String NombreClub;
    private String NombreFundador;
    private int AnoFundacion;
    private String PaisOrigen;
    private String Lema;
    private int ValorSuscripcion;
    private String Colores;
    
    public Clubes(){
        this.Codigo = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AnoFundacion = 0;
        this.PaisOrigen = "";
        this.Lema = "";
        this.ValorSuscripcion = 0;
        this.Colores = "";
    }

    public Clubes(String Codigo, String NombreClub, String NombreFundador, int AnoFundacion, String PaisOrigen, String Lema, int ValorSuscripcion, String Colores){
        this.Codigo = Codigo;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AnoFundacion = AnoFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.ValorSuscripcion = ValorSuscripcion;
        this.Colores = Colores;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public int getAnoFundacion() {
        return AnoFundacion;
    }

    public void setAnoFundacion(int AnoFundacion) {
        this.AnoFundacion = AnoFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
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
