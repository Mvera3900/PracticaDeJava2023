public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Marcos");
        persona.setApellido("Vera");
        persona.setEdad(37);

        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());

        Persona persona2 = new Persona("Martin", "Dominguez",37);
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona2.getEdad());

    }
}