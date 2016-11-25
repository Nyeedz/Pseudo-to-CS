#include "../include/funcoes.h"


//FUN��O PARA LIMPAR SAIDA
void limparSaida(){
	FILE *arquivo = fopen("io/out.txt","w");
	fclose(arquivo);
}

//FUN��O PARA GRAVAR SAIDA
void gravarSaida(char * texto){
	FILE *arquivo = fopen("io/out.txt","a");
	fprintf (arquivo,"%s",texto);
	fclose(arquivo);


}

//FUN��O SPLIT
int split (char * entrada,Palavras* saida,char * divisor){
	int tam = 0; // quantidade de palavras separadas 
	char *palavra; //palavra recebida pelo metodo strtok(split)
	char out[MAX_FRASE]; //saida

	palavra = strtok (entrada,divisor);
  	while (palavra != NULL)
 	{
    	strcpy(saida[tam++].p,palavra);
   		palavra = strtok (NULL,divisor);
  	}
	
	return tam;
}

//FUN��O INSTANCIAR VARIAVEL
void instanciarVariavel (char * entrada){
	Palavras palavras[4]; //Array de palavras para split
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");

	//SPLIT
	split(entrada,palavras," ");
	
	
	//Verificando tipo de variavel
	if (strncmp(palavras[3].p,"INTEIRO",strlen("INTEIRO")) == 0){
		strcat(out,"int ");
	}else if (strncmp(palavras[3].p,"REAL",strlen("REAL"))==0){
		strcat(out,"double ");
	}

	//Concatenando nome
	strcat(out,palavras[1].p);
	strcat(out,";\n");
		
	gravarSaida(out);
	
}

//FUN��O PARA ATRIBUI��O SIMPLES
void atribuicaoSimples(char * entrada){
	Palavras palavras[4]; //Array de palavras para split
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");
	
	//SPLIT
	split(entrada,palavras,"<-");
	
	//Concatenando nome
	strcat(out,palavras[0].p);
	strcat(out," = ");
	strcat(out,palavras[1].p);
	strcat(out,";\n");

	gravarSaida(out);

}

//FUN��O PARA OPERA��O MATEMATICA
void operacaoAritmetica (char *entrada){
	Palavras palavras[2]; //Array para armazenar o split feito em <-
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");

	//SPLIT
	split(entrada,palavras,"<-");

	//Concatena��es
	strcat (out,palavras[0].p);
	strcat (out," = ");
	strcat (out,palavras[1].p);
	strcat (out,";\n");
	
	gravarSaida(out);	
}

//FUN��O CRIAR ESTRUTURA DO SE
void criarSe(char * entrada){
	Palavras palavras[5]; //Array para armazenar o split feito em ' '
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");
	
	
	//SPLIT
	split(entrada,palavras," ");
	
	//Concatena��es
	strcat (out,"if( ");
	strcat (out,palavras[1].p);
	strcat (out," ");
	strcat (out,palavras[2].p);	
	strcat (out," ");
	strcat (out,palavras[3].p);
	strcat (out," ){\n");

	gravarSaida(out);

}

//FUN��O CRIAR ESTRUTURA DO LEIA
void criarLeia(char *entrada){
	Palavras palavras[2]; //Array para armazenar o split feito em ' '
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");
	
	//SPLIT
	split(entrada,palavras," ");
	
	//Concatena��es
	strcat (out,palavras[1].p);
	strcat (out," = Console.ReadLine()");
	strcat (out,";\n");

	gravarSaida(out);
}

//FUN��O CRIAR ESTRUTURA DO ESCREVA
void criarEscreva(char *entrada){
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");
	int i;
	int iniAspas = 8, fimAspas = strlen(entrada-1);
 	//printf("%c",entrada[fimAspas]);	
	
	//Concatena��o
	strcat (out,"Console.WriteLine(");
	
        i = strlen("Console.WriteLine(")+1;
	for (iniAspas = 8 ; iniAspas <= fimAspas ; iniAspas++){
		out[i++] = entrada[iniAspas];		
	}
		
	
	strcat (out,");\n");
	
	gravarSaida(out);

}

//FUN��O PARA CRIAR ESTRUTURA DO ENQUANTO
void criarEnquanto(char * entrada){
	Palavras palavras[5]; //Array para armazenar o split feito em ' '
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");
	
	
	//SPLIT
	split(entrada,palavras," ");
	
	//Concatena��es	
	strcat (out,"while( ");
	strcat (out,palavras[1].p);
	strcat (out," ");
	strcat (out,palavras[2].p);	
	strcat (out," ");
	strcat (out,palavras[3].p);
	strcat (out," ){\n");

	gravarSaida(out);
	

}

//FUN��O PARA CRIAR ESTRUTURA DO PARA
void criarPara(char * entrada){
	Palavras palavras[8]; //Array para armazenar o split feito em ' '
	char out[MAX_FRASE]; //saida
	strcpy(out,"\n");
	
	//SPLIT
	split(entrada,palavras," ");
	
	//Concatena��es
	strcat (out,"for( ");
	strcat (out,palavras[1].p);
	strcat (out," ");
	strcat (out,palavras[2].p);	
	strcat (out," ");
	strcat (out,palavras[3].p);
	strcat (out," ; ");
	strcat (out,palavras[1].p);
	strcat (out," < ");
	strcat (out,palavras[5].p);
	strcat (out, " ; ");
	strcat (out,palavras[1].p);
	strcat (out, "++){\n");
	
	gravarSaida(out);
		

}



