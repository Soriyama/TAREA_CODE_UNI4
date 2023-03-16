/**
    * TAREA ED04: REFACTORIZACIÓN Y DOCUMENTACIÓN 
    * @autor Esteban_Calo
    * @version 1.0
    * IDE: NETBEANS
 */

package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public double estado() {
        return getSaldo();
    }
    /** 
     * Método ingresar 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    /** 
     * Método Retirar
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
    
    /** ENCAPSULADO DE ATRIBUTOS DE LA CLASE CCuenta */ 
    
    /**
     * Devuelve el nombre de la persona
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece la cuenta
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
     * Devuelve el tipo de interés de la cuenta
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
