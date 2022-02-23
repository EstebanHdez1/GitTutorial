package co.edu.unbosque.model;

import java.io.*;

public class CSVArchivo {
	
	public void leer() {
		
		String file = "src/Source/data.csv";
		BufferedReader read = null;
		String line = "";
		
		try {
			
			read = new BufferedReader(new FileReader(file));
			
			while((line = read.readLine()) != null) {
				
				//Factura-Stock-Descripción-Cantidad-FechaDeFactura-PrecioUnitario-CustomerID-Pais
				
				String[] fila = line.split(",");
				String InvoiceNo = fila[0].trim();
				String Stock = fila[1].trim();
				String Description = fila[2].trim();
				String Quantity = fila[3].trim();
				String InvoiceDate = fila[4].trim();
				String UnitPrice = fila[5].trim();
				String CustomerID = fila[6].trim();
				String Country = fila[7].trim();
				
				for(String index : fila) {
					System.out.printf("%10s", index);
				}
				
				System.out.println();
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		finally {
			
			try {
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public static void BuscarFactura() {
		
		try {
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader reader = new BufferedReader(new FileReader("src/Source/data.csv"));
			System.out.println("Incerte numero de Factura: ");
			String Venta = in.readLine();
			boolean found = false;
			String line = null;
			int TVentas = 0;
			while((line = reader.readLine()) != null) {
				
				String[] parts = line.split(",");
				int totalparts = parts.length;
				for(int i=0;i<totalparts;i++) {
					
					TVentas = 0;
					
					if(Venta.compareTo(parts[i]) == 0) {
						System.out.println(" [Se encontró la venta]");
						for(int j = 0; j < totalparts; j++){ 
							System.out.print(parts[ j ] + ", ");
							
							TVentas *= totalparts;
							
							//System.out.println("\n la mul de " + TVentas);
							
							}
						found = true;
						break;
						
					}
				} //TotalVentas
				for(int i=0;i<totalparts;i++) {
					
					TVentas = 0;
					
						for(int j = 0; j < totalparts; j++){ 
							
							TVentas *= totalparts;
							
							//System.out.println("\n la mul de " + TVentas);
							
							}
						found = true;
						break;
						
					
				}
				
										
				
			}
			if(found == false) {
				
				System.out.println("No se encuentra");
				
			}else {
				System.out.println(" \n [Listo]");
				
				System.out.println("\n El total de Ventas es:  " + TVentas);
				
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		//3*5
		
		
		
		
	}
	
	
}
