%{
	#include <stdlib.h>
	#include <stdio.h>
	#include "include/funcoes.h"
	
	int cont_error = 0 ;

%}

numero			\-?[0-9]+(\.[0-9]+)?
operadorA		(\+|\-|\*|\/)
operadorL 		((\!\=)|(\<\=)|(\>\=)|(\=\=)|\<|\>)
espaco			[ \t]+
whitespace 		[ \t\r\n]+
dado			([a-zA-Z]+|(\-?[0-9]+(\.[0-9]+)?))+

%%

(using){espaco}(System)\;										{}
((int)|(double)){espaco}{dado}\;                                                                  	{}
(class){espaco}(Projeto)\{										{}
(public){espaco}(static){espaco}(void){espaco}(Main)\(\)\{						{}
{dado}{espaco}\={espaco}{dado}{espaco}{operadorA}{espaco}{dado}\;					{}
{dado}{espaco}\={espaco}{dado}+\;								        {}
{dado}{espaco}\={espaco}(Console)\.(ReadLine)\(\)\;				         		{}
(Console)\.(WriteLine)\(\"({dado}|{espaco})+\"\)\;		                 			{} 
(if)\({espaco}{dado}{espaco}{operadorL}{espaco}{dado}{espaco}\)\{					{}
(else)\{ 												{}
(while)\({espaco}{dado}{espaco}{operadorL}{espaco}{dado}{espaco}\)\{				        {}
(for)\({espaco}{dado}{espaco}\={espaco}{dado}{espaco}\;{espaco}{dado}{espaco}{operadorL}{espaco}{dado}{espaco}\;{espaco}{dado}\+\+\)\{	{}					                                                                        
{whitespace}												{}
\}													{}
.													{cont_error++;}


%%	

int main (){

	//Definindo entrada padrão (arquivo txt)
	yyin = fopen("io/saida.txt", "r");
	//Executando analisar léxico
	yylex();

	if (cont_error > 0){
		return 1;
	}
	
	return 0;
}	
