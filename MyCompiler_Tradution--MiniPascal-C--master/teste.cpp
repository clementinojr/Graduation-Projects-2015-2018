#include<iostream>
#include<string>

using namespace std; 

float n1, n2, n3, n4, media, exame; 
int i; 
string nome; 
bool aprovado; 
int  a[10-0];

int main(){
i = 0;
for(i=0;i<10;i++){
a[i] = i;
cout <<a[i];
cout <<" ";
}
cout <<"Digite o nome do aluno: ";
cin >> nome;
cout <<"" << endl;
i = 0;
while(i<10){
cout <<i;
i = i+1;
cout <<" ";
}
cout <<"" << endl;
cout <<"Calculadora da média!!" << endl;
cout <<"Nota 1: ";
cin >> n1;
cout <<"Nota 2: ";
cin >> n2;
cout <<"Nota 3: ";
cin >> n3;
cout <<"Nota 4: ";
cin >> n4;
media = (n1+n2+n3+n4)/4;
cout <<media << endl;
if(media>=7){
cout <<"" << endl;
aprovado = true;
}else{
aprovado = false;
if(media>=4){
cout <<"Nota Exame: ";
cin >> exame;
media = (media+exame)/2;
if(media>=5){
aprovado = true;
}
}
}
cout <<"Nota Final: ";
cout <<media << endl;
if(aprovado){
cout <<nome;
cout <<"Aprovado" << endl;
}else{
cout <<nome;
cout <<"Reprovado" << endl;
}
return 0;
}
