program "test";
var
    n1, n2, n3, n4, media, exame: float;
    i: integer;
    nome: string;
    aprovado: boolean;
    a: array [0..10] of integer;

begin
for i:=0 to 10 do
begin
    a[i] := i;
    write a[i];    
    write " ";
end;
write "Digite o nome do aluno: ";
readln nome;
writeln "";

i:=0;
while(i<10) do
begin
    write i;
    i:= i+1;
    write " ";
end;

writeln "";
writeln "Calculadora da média!!";

write "Nota 1: ";
readln n1;
write "Nota 2: ";
readln n2;
write "Nota 3: ";
readln n3;
write "Nota 4: ";
readln n4;

media := (n1+n2+n3+n4)/4;
writeln media;

if(media >= 7) then
    writeln "";
    aprovado := true;    
else
    aprovado := false;
    if(media>=4) then
        write "Nota Exame: ";
        readln exame;
        media := (media + exame)/2;
        if(media>=5) then
            aprovado := true;
        end;
    end;
end;
write "Nota Final: ";
writeln media;

if (aprovado) then
    write nome;
    writeln "Aprovado";
else
    write nome;
    writeln "Reprovado";
end;


end. 