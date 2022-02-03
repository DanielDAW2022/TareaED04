package cuentas;

/**
 * Clase que se utiliza para generar y trabajar con cuentas bancarias
 *
 * @author Daniel Gil Albiñana
 * @version 3.0
 * @since 1.0
 */
public class CCuenta {

    /**
     * Atributos de la clase
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor vacío
     */
    public CCuenta() {
    }

    /**
     * Método constructor con parámetros
     *
     * @param nom Propietario de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Estado de la cuenta
     *
     * @return Saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si el parámetro es menor que 0
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retirar una cantidad de la cuenta
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception Si el parámetro es negativo o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre del propietario de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del propietario de la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
