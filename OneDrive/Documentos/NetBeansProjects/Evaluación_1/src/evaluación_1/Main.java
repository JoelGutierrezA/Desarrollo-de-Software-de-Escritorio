package evaluación_1;

import evaluación_1.DTO.Clubes;
import evaluación_1.DTO.Suscripcion;
import evaluación_1.DTO.Usuarios;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int Folio = 1000;
        
        System.out.println("Creando Usuario...");
        Usuarios David = new Usuarios();
        David.setIde(1000);
        David.setNombreCompleto ("David Cogiolle");
        David.setRun(18085471, '1');
        David.setFechaNacimiento(new Date());
        David.setTelefono (569664337);
        David.setNombreUsuario("dcog");
        David.setEmail("david.cogiolle@gmail.com");
        David.setContrasena("Afds22231");
        
        System.out.println("Usuarios creado: "+ David.getNombreCompleto()); 
        System.out.println("-------------------------");
        
        System.out.println("Creando Usuario...");
        Usuarios Gerr = new Usuarios();
        Gerr.setIde(1001);
        Gerr.setNombreCompleto ("Gerr Adere");
        Gerr.setRun(15446388, '5');
        Gerr.setFechaNacimiento(new Date());
        Gerr.setTelefono (569665823);
        Gerr.setNombreUsuario("ggft");
        Gerr.setEmail("gerr.adere@live.cl");
        Gerr.setContrasena("G1ovanniGg34");
        
        System.out.println("Usuarios creado: "+ Gerr.getNombreCompleto());
        System.out.println("-------------------------");
        
        System.out.println("Creando Usuario...");
        Usuarios Sergio = new Usuarios();
        Sergio.setIde(1002);
        Sergio.setNombreCompleto ("Sergio Villanueva");
        Sergio.setRun(19357165, 'k');
        Sergio.setFechaNacimiento(new Date());
        Sergio.setTelefono (569730023);
        Sergio.setNombreUsuario("scodiio");
        Sergio.setEmail("sergio.villanueva@gmail.com");
        Sergio.setContrasena("5534Gato33");
                
        System.out.println("Usuarios creado: "+ Sergio.getNombreCompleto());
        System.out.println("-------------------------");
        
        System.out.println("Creando Club...");
        Clubes Arsenal_de_Coquimbo = new Clubes();
        Arsenal_de_Coquimbo.setCodigo("ARH11");
        Arsenal_de_Coquimbo.setNombre("Arsenal de Coquimbo");
        Arsenal_de_Coquimbo.setLema("Cañones a los puertos");
        Arsenal_de_Coquimbo.setValorSuscripcion(10050);
        Arsenal_de_Coquimbo.setColores("Amarillo, Rojo");
        
        System.out.println("Club creado: "+ Arsenal_de_Coquimbo.getNombre());
        System.out.println("-------------------------");
        
        System.out.println("Creando Club...");
        Clubes Manquehue_City = new Clubes();
        Manquehue_City.setCodigo("MCH12");
        Manquehue_City.setNombre("Manquehue City");
        Manquehue_City.setLema("Vivir y Fuerza");
        Manquehue_City.setValorSuscripcion(15100);
        Manquehue_City.setColores("Celeste, Blanco");
        
        System.out.println("Club creado: "+ Manquehue_City.getNombre());
        System.out.println("-------------------------");
        
        System.out.println("Creando Club...");
        Clubes Los_Condores_Unidos = new Clubes();
        Los_Condores_Unidos.setCodigo("LCH13");
        Los_Condores_Unidos.setNombre("Los Condores Unidos ");
        Los_Condores_Unidos.setLema("Desde lo alto al sol");
        Los_Condores_Unidos.setValorSuscripcion(13200);
        Los_Condores_Unidos.setColores("Amarillo, Naranjo");
        
        System.out.println("Club creado: "+ Manquehue_City.getNombre());
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
