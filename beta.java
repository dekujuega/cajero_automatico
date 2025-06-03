//hecho por Luis Carlos Saldaña Peña
package cajero.model;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
public class beta {
	public static void main(String[] args) {
 usuario account = new usuario();
 Scanner reader = new Scanner(System.in);
 int red;
 int op ;
 	String linea;
	 int fila = 0;
 	LocalDate fecha = LocalDate.now();
 	account.setCedula(1104939971);
 	account.setPIN(4086);
 	account.setSaldo(20);
 	account.setNombre("luis carlos saldaña");
 	System.out.println("bienvenido al banco de saltadilla");
 	System.out.println("porfavor introduzca sus datos de inicio de sesion");
 	System.out.println("cedula ");
 	int cedula2 = reader.nextInt();
 	System.out.println("PIN ");
 	int pin2 = reader.nextInt();
 	
 	if(cedula2 == account.getCedula() && pin2 == account.getPIN()) {
 	System.out.println("bienvenido "+account.getNombre());
 	}else if(cedula2 != account.getCedula() || pin2 != account.getPIN()) {
 		System.out.println("cedula o pin incorrectos");
 	}
 	do {
 		System.out.println("porfavor escoja una opcion para realizar: 1.consignas 2.retiros 3.consultas");
 		red = reader.nextInt();
 		switch(red) {
 		case 1:
 			System.out.println("introduzca la cantidad a depositar");
 			int mont = reader.nextInt();
 			account.setSaldo(account.getSaldo()+mont);
 			try {
 				BufferedWriter escritor = new BufferedWriter( new FileWriter("C:\\Users\\test\\eclipse-workspace\\javaFXapp\\src\\cajero\\model\\data_cajero.txt",true));
 				escritor.write("deposito de: "+mont+" realizado el "+fecha);
 				escritor.newLine();
 				escritor.close();
 			}catch(Exception ex) {
 				
 			}finally {
 				
 			}
 			break;
 			
 		case 2:
 			System.out.println("introduzca el monto a retirar");
 			int retir = reader.nextInt();
 			account.setSaldo(account.getSaldo()-retir);
 			try {
 				BufferedWriter escritor = new BufferedWriter( new FileWriter("C:\\Users\\test\\eclipse-workspace\\javaFXapp\\src\\cajero\\model\\data_cajero.txt",true));
 				escritor.write("retiro de: "+retir+" hecho el "+fecha);
 				escritor.newLine();
 				escritor.close();
 			}catch(Exception ex) {
 				
 			}finally {
 				
 			}
 			break;
 		case 3:
 			System.out.println("que desea consultar: 1.saldo 2.transacciones");
 			int trs = reader.nextInt();
 			if(trs == 1) {
 				System.out.println("su saldo actual es: "+account.getSaldo());
 			}else if(trs == 2) {
 				try {
 					BufferedReader lector = new BufferedReader( new FileReader("C:\\Users\\test\\eclipse-workspace\\javaFXapp\\src\\cajero\\model\\data_cajero.txt"));
 					while((linea=lector.readLine()) != null) {
 						System.out.println(linea);
 					}
 				}catch(Exception ex) {
 					
 				}finally {
 					
 				}
 				
 			}
 			break;
 		}
 		
 		System.out.println("desea realizar alguna otra operacion? 1.si 2.no");
 		op = reader.nextInt();
 		
 	
 	
 	}while(op == 1);
 	
 	
	}
}

