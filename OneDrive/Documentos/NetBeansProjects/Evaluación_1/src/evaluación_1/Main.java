package evaluación_1;

import evaluación_1.DTO.Clubes;
import evaluación_1.DTO.Suscripcion;
import evaluación_1.DTO.Usuarios;
     
public class Main {
    public static void main(String[] args){
        int Folio = 1000;
        
        System.out.println("Creando Usuario...");
        Usuarios David = new Usuarios();
        David.setIde(1000);
        David.setNombreCompleto("David Cogiolle");
        David.setRun(18085471, '1');
        David.setFechaNacimiento("06/09/1991");
        David.setTelefono(569664337);
        David.setNombreUsuario("dcog");
        David.setEmail("david.cogiolle@gmail.com");
        David.setContrasena("Afds22231");
        
        System.out.println("Fecha nacimiento: "+ David.getFechaNacimiento());
        System.out.println("Usuarios creado: "+ David.getNombreCompleto());
        System.out.println("Telefono: +56"+ David.getTelefono());
        System.out.println("Contrasena Valida: "+ David.getContrasena());
        System.out.println("-------------------------");
        
        System.out.println("Creando Usuario...");
        Usuarios Gerr = new Usuarios();
        Gerr.setIde(1001);
        Gerr.setNombreCompleto ("Gerr Adere");
        Gerr.setRun(15446388, '5');
        Gerr.setFechaNacimiento("05/08/1982");
        Gerr.setTelefono (966543379);
        Gerr.setNombreUsuario("ggft");
        Gerr.setEmail("gerr.adere@live.cl");
        Gerr.setContrasena("G1ovanniGg34");
        
        System.out.println("Usuarios creado: "+ Gerr.getNombreCompleto());
        System.out.println("Telefono: +56"+ Gerr.getTelefono());
        System.out.println("Contrasena Valida: "+ Gerr.getContrasena());
        System.out.println("-------------------------");
        
        System.out.println("Creando Usuario...");
        Usuarios Sergio = new Usuarios();
        Sergio.setIde(1002);
        Sergio.setNombreCompleto ("Sergio Villanueva");
        Sergio.setRun(19357165, 'k');
        Sergio.setFechaNacimiento("21/06/1987");
        Sergio.setTelefono (9730023);
        Sergio.setNombreUsuario("scodiio");
        Sergio.setEmail("sergio.villanueva@gmail.com");
        Sergio.setContrasena("5534Gato33");
        
        System.out.println(Sergio.getContrasena());        
        System.out.println("Usuarios creado: "+ Sergio.getNombreCompleto());
        System.out.println("-------------------------");
        
        System.out.println("Creando Club...");
        Clubes Arsenal_de_Coquimbo = new Clubes();
        Arsenal_de_Coquimbo.setCodigo("ARH11");
        Arsenal_de_Coquimbo.setNombreClub("Arsenal de Coquimbo");
        Arsenal_de_Coquimbo.setNombreFundador("Juan Coquimbo");
        Arsenal_de_Coquimbo.setAnoFundacion(1983);
        Arsenal_de_Coquimbo.setPaisOrigen("Chile");
        Arsenal_de_Coquimbo.setLema("Cañones a los puertos");
        Arsenal_de_Coquimbo.setValorSuscripcion(10050);
        Arsenal_de_Coquimbo.setColores("Amarillo, Rojo");
        
        System.out.println("Club creado: "+ Arsenal_de_Coquimbo.getNombreClub());
        System.out.println("-------------------------");
        
        System.out.println("Creando Club...");
        Clubes Manquehue_City = new Clubes();
        Manquehue_City.setCodigo("MCH12");
        Manquehue_City.setNombreClub("Manquehue City");
        Manquehue_City.setLema("Vivir y Fuerza");
        Manquehue_City.setValorSuscripcion(15100);
        Manquehue_City.setColores("Celeste, Blanco");
        
        System.out.println("Club creado: "+ Manquehue_City.getNombreClub());
        System.out.println("-------------------------");
        
        System.out.println("Creando Club...");
        Clubes Los_Condores_Unidos = new Clubes();
        Los_Condores_Unidos.setCodigo("LCH13");
        Los_Condores_Unidos.setNombreClub("Los Condores Unidos ");
        Los_Condores_Unidos.setLema("Desde lo alto al sol");
        Los_Condores_Unidos.setValorSuscripcion(13200);
        Los_Condores_Unidos.setColores("Amarillo, Naranjo");
        
        System.out.println("Club creado: "+ Manquehue_City.getNombreClub());
        System.out.println("-------------------------");
        
        System.out.println("Creando Suscripcion...");
        Suscripcion Usuario1 = new Suscripcion();
        Usuario1.setNumero(Folio + 10);
        Usuario1.setAbonoTotal(25150);
        Usuario1.setEquipos("ARH11 $10.050, MCH12 $15.100");
        System.out.println("Folio Numero: " + Usuario1.getNumero());
        System.out.println("-------------------------");
        
        System.out.println("Creando Suscripcion...");
        Suscripcion Usuario2 = new Suscripcion();
        Usuario2.setNumero(Folio + 20);
        Usuario2.setAbonoTotal(13200);
        Usuario2.setEquipos("LCH13 $13.200");
        System.out.println("Folio Numero: "+ Usuario2.getNumero());
        System.out.println("-------------------------");
        
        System.out.println("Creando Suscripcion...");
        Suscripcion Usuario3 = new Suscripcion();
        Usuario3.setNumero(Folio + 30);
        Usuario3.setAbonoTotal(18300);
        Usuario3.setEquipos("LCH13 $13.200; MCH12, $15.100");
        System.out.println("Folio Numero: "+ Usuario3.getNumero());
        System.out.println("-------------------------");
    }
    
}
