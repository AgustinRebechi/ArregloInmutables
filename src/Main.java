import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[5];


        personas[0] = new Persona("Ana", "García", new Documento(123));
        personas[1] = new Persona("Luis", "Pérez", new Documento(456));
        personas[2] = new Persona("Marta","López", new Documento(789));
        personas[3] = new Persona("Juan", "Martínez", new Documento(111));
        personas[4] = new Persona("Lucía","Fernández", new Documento(222));

        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }

        personas[0] = personas[0].renovar(176);
        personas[1] = personas[1].renovar(343);

        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }

    }
}
