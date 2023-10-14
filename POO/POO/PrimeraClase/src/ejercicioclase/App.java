package ejercicioclase;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("marca1", 4, Boolean.FALSE,Boolean.TRUE,"100","0");

        Persona persona = new Persona(1132123415L,"Francisco", LocalDate.of(1986, 8, 9),vehiculo);

        System.out.println("Nombre de persona: " + persona.getNombre());
        System.out.println("Dni de persona: " + persona.getDni());
        System.out.println("Fecha de nacimiento: " + persona.getFechaDeNacimiento());
        System.out.println("Marca de Vehiculo: " + persona.getVehiculo().getMarca());

        persona.getVehiculo().arrancarVehiculo();
        persona.getVehiculo().setEstaLaAlarmaEncendida(Boolean.FALSE);
        persona.getVehiculo().arrancarVehiculo();


    }
}
