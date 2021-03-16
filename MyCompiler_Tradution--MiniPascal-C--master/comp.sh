#!/bin/bash
echo Gerando arquivo
java -jar Pascalzinho.jar $1 -o $2
echo Compilando...
g++ $2 -o $3
echo Compilado amigo ;)
