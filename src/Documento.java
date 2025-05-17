import java.time.LocalDate;
import java.time.LocalDateTime;

public final class Documento{

    private final int documento;
    private final LocalDateTime emision;
    private final LocalDateTime vencimiento;

    // Constructor: recibe documento, fecha de emisión y vencimiento
    public Documento(int documento) {
        this.documento = documento;
        this.emision = LocalDateTime.now();
        this.vencimiento = LocalDateTime.now().plusYears(10);
    }

    // Metodos



    @Override
    public String toString() {
        return "numero = " + documento +
                ", emision = " + emision +
                ", vencimiento = " + vencimiento;
    }

    // Getters

    public int getDocumento() {
        return documento;
    }

    public LocalDateTime getEmision() {
        return emision;
    }

    public LocalDateTime getVencimiento() {
        return vencimiento;
    }
}

