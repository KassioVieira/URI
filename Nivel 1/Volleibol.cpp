#include<iostream>
#include <string>
#include <iomanip>
using namespace std;
	
int main(){
  int n;
  string nomeJogador;
		
  cin >> n;
  int aux = 0;
  int s = 0, b = 0, a =0;
  int sS = 0, bS = 0, aS =0;
		
   while (n != 0) {
     cin >> nomeJogador;
				
     cin >> aux;
     s += aux;
				  
     cin >> aux; 
     b += aux;
				  
     cin >> aux;
     a += aux;
				  
     cin >> aux;
     sS += aux;
				  
     cin >> aux;
     bS += aux;
				  
     cin >> aux;
     aS += aux;
					
     n--;
}
			
double resultadoSaques = (sS * 100) / s;
cout<<"Pontos de Saque: "<< std::fixed << std::setprecision(5)<< resultadoSaques <<" %."<<endl;

double resultadoBloqueio = (bS * 100) / b;
cout<<"Pontos de Bloqueio: "<< std::fixed << std::setprecision(5)<< resultadoBloqueio <<" %."<<endl;
  	    
double resultadoAtaques = (aS * 100) / a;
cout<< "Pontos de Ataque: " <<std::fixed << std::setprecision(5)<< resultadoAtaques <<" %."<<endl;			
		
  return 0;
}
