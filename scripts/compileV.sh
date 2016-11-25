#!/bin/bash


cd ../..

flex lexicoi.l

gcc -o exe lex.yy.c -lfl

./exe
echo $?


