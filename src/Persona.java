public final class Persona {

    //Atributos

    private final String nombre;
    private final String apellido;
    private final Documento documento;

    public Persona(String nombre, String apellido, Documento documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    //Metodos

    public Persona renovar(int i) {
        return new Persona(getNombre(), getApellido(), new Documento(i));
    }

    @Override
    public String toString() {
        return "nombre = " + getNombre() +
                ", apellido = " + getApellido() +
                ", documento = " + getDocumento();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Documento getDocumento() {
        return documento;
    }


}
