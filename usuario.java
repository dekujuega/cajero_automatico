package cajero.model;

public class usuario {
 private String nombre;
 public String getNombre() {
	return nombre;
}
 public void setNombre(String nombre) {
	this.nombre = nombre;
 }
 private int cedula,PIN;
 private int saldo;
 
 public int getCedula() {
	return cedula;
 }
 public void setCedula(int cedula) {
	this.cedula = cedula;
 }
 public int getPIN() {
	return PIN;
 }
 public void setPIN(int pIN) {
	PIN = pIN;
 }
 public int getSaldo() {
	return saldo;
 }
 public void setSaldo(int saldo) {
	this.saldo = saldo;
 }
 

}
