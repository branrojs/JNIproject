#include "sqlite3.h"
#include <iostream>  
#include "TicketForce.h"
#include <string>
 
using namespace std;

static int callback(void *NotUsed, int argc, char **argv, char **azColName){
   int i;
   for(i=0; i<argc; i++){
      printf("%s = %s\n", azColName[i], argv[i] ? argv[i] : "NULL");
   }
   printf("\n");
   return 0;
}


int preciopais(int pais){
	
	switch(pais) {
		case 0: return 100;
		break;
		case 1: return 150;
		break;
		case 2: return 175;
		break;
		case 3: return 225;
		break;
		case 4:  return 200;
		break;
		case 5: return 210;
		break;
		case 6: return 175;
		break;
		case 7:  return 100;
		break;
		case 8: return 250;
		break;
		case 9: return 250;
		break;
		case 10:  return 225;
		break;
		case 11: return 175;
		break;
	}	
}

JNIEXPORT jint JNICALL Java_TicketForce_calcular_1precio(JNIEnv* env, jobject obj, jint origen, jint destino, jint clienteFrecuente, jint adultoMayor, jint primeraClase)
{
	
	int adultodescuento=0, frecuenteDescuento=0, clase = 50;
	int precio = preciopais(origen) + preciopais(destino);
	
	if(clienteFrecuente==1){
		frecuenteDescuento=(20 * precio)/100;
	}
	if(adultoMayor==1){
		adultodescuento=(10 * precio)/100;
	}
	printf("%d\n",precio);
	precio=precio-frecuenteDescuento;
	printf("%d\n",precio);
	precio=precio-adultodescuento;
	printf("%d\n",precio);
	if(primeraClase==1){
		precio = precio + clase;
		printf("%d\n",precio);
	}
	return precio;
}

string encontrar_pais(int pais)
{
	
	switch(pais) {
		case 0: return "Belice BZE";
		break;
		case 1: return "Guatemala GUA";
		break;
		case 2: return "Guatemala FRS";
		break;
		case 3: return "El Salvador SAL";
		break;
		case 4:  return "Honduras TGU";
		break;
		case 5: return "Honduras SPS";
		break;
		case 6: return "Honduras RTB";
		break;
		case 7:  return "Nicaragua MGA";
		break;
		case 8: return "Costa Rica SJO";
		break;
		case 9: return "Costa Rica LIR";
		break;
		case 10:  return "Panama PTY";
		break;
		case 11: return "Panama PAC";
		break;
	}
}


JNIEXPORT void JNICALL Java_TicketForce_placeTicket (JNIEnv* env, jobject obj, jint idCliente, jint origen, jint destino, jint fechaSal, jint fechaRetorno, jint clienteFrecuente, jint adultoMayor, jint primeraClase, jint precio)
{
	/*string idC = to_string(idCliente);
	string paisOrigen = encontrar_pais(origen);
	string paisDestino = encontrar_pais(destino);
	string fechaSalida =  to_string(fechaSal);
	string fechaRet = to_string(fechaRetorno);
	string cf = "";
	if(clienteFrecuente==1){
		cf = "Si";
	} else {
		cf = "No";
	}
	string ad = "";
	if(adultoMayor==1){
		ad = "Si";
	} else {
		ad = "No";
	}
	string pc = "";
	if(primeraClase==1){
		pc = "Si";
	} else {
		pc = "No";
	}
	int precioTicket =  precio;
	
	sqlite3 *db;
   char *zErrMsg = 0;
   int rc;
   const char *sql;
   string comando;

   /* Open database 
   rc = sqlite3_open("C:\\Users\\neo\\Desktop\\Tickets\\src\\AgenciaViajes.db", &db);
   if( rc ){
      fprintf(stderr, "No se puede conectar: %s\n", sqlite3_errmsg(db));
      return;
   }else{
      fprintf(stderr, "Conectado a la base de datos\n");
   }

   /* Create SQL statement 
   comando = "INSERT INTO tiquete (idCliente, origen, destino, fechaSal, fechaRetorno, clienteFrecuente, adultoMayor, primeraClase, precioFinal) "  \
         "VALUES ('" + idC + "','" + paisOrigen + "','" + paisDestino + "','" + fechaSalida + "','" + fechaRet + "','" + cf + "','" + ad + "','" + pc + "'," + to_string(precioTicket)  + " );";
         
   sql = comando.c_str();     

   /* Execute SQL statement 
   rc = sqlite3_exec(db, sql, callback, 0, &zErrMsg);
   if( rc != SQLITE_OK ){
      fprintf(stderr, "SQL error: %s\n", zErrMsg);
      sqlite3_free(zErrMsg);
   }else{
      fprintf(stdout, "Insercion correcta\n");
   }
   sqlite3_close(db);*/

	
    return;
}



