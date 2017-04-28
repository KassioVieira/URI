#include<iostream>
#include <map>
#include <vector>
#include <string>
using namespace std;
	
int main(){
  double n, grau = 0;

  	
 cin >> n;
 map<string, double> mapAtletas;
 map<string, double>::iterator MyIterMap;
 string nomes;
 double aux, grau;
 double notas;
  	
  while (n != 0) {

    cin >> nomes;
    cin >> aux;
    
    for(int i = 0; i < 7; i++){
    	cin >> notas[i];
	}
	/*
	 processamento aqui
	*/
    
    mapAtletas[nomes] = notaFinal;
					
	n--;
}
			
//double resultadoSaques = (sS * 100) / s;
//cout<<"Pontos de Saque: "<< std::fixed << std::setprecision(2)<< resultadoSaques <<" %."<<endl;
		
 return 0;
}
