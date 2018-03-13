public class TicketForce {
	public native int calcular_precio(int origen, int destino,int clienteFrecuente, int adultoMayor, int primeraClase);
    public native void placeTicket(int idCliente, int origen,int destino,int fechaSal,int fechaRetorno,int clienteFrecuente,int adultoMayor,int primeraClase,int precio);

   /* public static void main(String[] args){
		int precio = 0;

	 	System.out.println(precio);
    }*/

    static {
        System.load("C:\\Users\\neo\\Desktop\\Tickets\\src\\TicketForce.dll");
    }

}
