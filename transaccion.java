package cajero.model;
import java.util.Date;
import java.time.LocalDate;
public class transaccion {
  public String tipo_transaccion;
  public Date fecha;
  public int monto;
  public static void main(String[] args) {
	  LocalDate fecha = LocalDate.now();
	  
	  System.out.print("la fecha actual es "+fecha);
  }
  
  
}
