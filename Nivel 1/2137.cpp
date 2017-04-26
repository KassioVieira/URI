#include<bits/stdc++.h>

using namespace std;

int main(){
    int tamanho,i;

    while(scanf("%d",&tamanho) != EOF){
    int meuvetor[tamanho];


    for(i = 0; i < tamanho; i++){
      cin >> meuvetor[i];
    }

    int j, aux;

    for(i = tamanho-1; i >= 1; i--){
          for(j = 0; j < i ; j++){
              if(meuvetor[j] > meuvetor[j+1]){
                  aux = meuvetor[j];
                  meuvetor[j] = meuvetor[j+1];
                  meuvetor[j+1] = aux;
              }
          }
      }


    for(i = 0; i < tamanho; i++){
      cout << setfill('0') << setw(4) << meuvetor[i] << endl;
    }

  }
  return 0;
}
