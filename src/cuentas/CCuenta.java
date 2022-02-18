/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase cuenta que guarda en su interior el nombre, la cuenta, el saldo y el tipo de interes.
 * @author Silvia Olivares Amer 
 * @version 1.0
 * @since 1.0
 * @see <a target="_blank" href="https://github.com/Silviafp/Deposito/tree/master/src/cuentas">Github</a>
 */
public class CCuenta {
    /**
     * Nombre del cliente de la cuenta
     */
    private String nombre;
    /**
     * Identificador de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interes de la cuenta
     */
    private double tipoInteres;

    /**
     * Este es el constructor sin parametros.
     */
    public CCuenta()
    {
    }
    
    /**
     * Este es el constructor con parametros.
     * @param nombre este es el nombre del usuario de la cuenta.
     * @param cuenta este es el numero de cuenta.
     * @param saldo el saldo inicial.
     * @param tipoInteres tipo de interes inicial.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Metodo ingresar: envian una cantidad de tipo double y la guarda en el objeto.
     * 
     * @param cantidad Cantidad que va a sumar al saldo actual.
     * @throws java.lang.Exception Si la cantidad es menor a 0, devuelve una excepcion.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo retirar: envian una cantidad de tipo double y lo resta del objeto.
     * 
     * @param cantidad Cantidad que va a retirar del saldo actual.
     * @throws java.lang.Exception Si la cantidad es menor o igual a 0 o saldo es menor a cantidad, devuelve su correspondiente excepcion.
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Getter del nombre.
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Setter del nombre.
     * @param nombre Cambio de nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de cuenta.
     * @return cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter de la cuenta.
     * @param cuenta Identificador de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Getter del saldo.
     *
     * @return saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter del saldo.
     * @param saldo Saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del tipoInteres.
     * @return tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }
    
    /**
     * Setter del tipoInteres.
     * @param tipoInteres Tipo de interes de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
