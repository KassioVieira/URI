
#include <iostream>
#include <vector>
#include <stack>
#define MAX 101
using namespace std;
//representacao de grafo usando lista de adjacência
vector <int> lista[MAX]; 
//marc[i] = true significa que o vetor foi visitado
bool marc[MAX];
//contador de numero de visitas
int cont;
 
void bp(int u){
 vector <int>::iterator it; 
 cont++;
 for(it = lista[u].begin(); it!=lista[u].end(); it++){
    if(!marc[*it]){
      marc[*it]=true;
      bp(*it);
    }
 } 
  
 
}
int main(){
 int n,m,u,v,i,a,b,teste=1;
 while(true){
   cin >> n >> m; 
   if(n==0 && m==0) break;
   for(i=1;i<=n;i++){ 
     marc[i]=false;
     lista[i].clear();
          }
   for(i=1;i<=m;i++){
     cin >> a >> b;
     lista[a].push_back(b);
     lista[b].push_back(a);
   }
   
   marc[1] = true;
   cont = 0;
   bp(1);
   
   
   cout << "Teste " << teste++ << endl;
   if(cont==n)
    cout << "normal" << endl;
   else
           cout << "falha" << endl;
   cout << endl;
 }
} 
