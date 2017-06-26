#include <iostream>
#include <vector>
#include <stack>
#define MAX 2001
using namespace std;
vector <int> lista[MAX]; 
bool marc[MAX];
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
 int n,m,aux,u,v,i,a,b,teste=1;
 while(true){
   cin >> n >> m;
   if(n==0 && m==0) break;
   for(i=1;i<=n;i++){ 
     marc[i]=false;
     lista[i].clear();
   }
   
   for(i=1;i<=m;i++){
     cin >> a >> b >> aux;
     if(aux == 1){
        lista[a].push_back(b);
     }else{
        lista[a].push_back(b);
        lista[b].push_back(a);
     }
     
   }
   
   marc[1] = true;
   cont = 0;
   bp(1);
   
   
   if(cont==n)
    cout << "1" << endl;
   else
    cout << "0" << endl;
   cout << endl;
 }
} 
