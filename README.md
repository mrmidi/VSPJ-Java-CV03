# VSPJ-Java-CV03
Abstract classes, inheritance


1. Nastudujte si příklady z přednášky.
Dědičnost, polymorfismus a rozhraní v jazyce Java.
a. Realizace dědičnosti.
b. Význam polymorfismu – virtuální metody.
c. Rozhraní – podstata rozhraní.
2. (Úkol) Vytvořte kolekci tříd modulu MatematickeFunkce.
a. Vytvořte abstraktní třídu Funkce s abstraktní metodou metodou double calc_y(double x).
b. Dále vytvořte třídu Funkce_Primka jako potomka třídy Funkce. Třída Funkce_Primka bude
mít jako atribut směrnici přímky k a posunutí q (oba atributy typu reálné číslo double), a bude počítat hodnotu y = kx + q v metodě calc_y. Parametry přímky budou inicializováno v konstruktoru podle hodnot předanými do konstruktoru parametry. Definujte metodu equals a metodu toString.
c. Vytvořte třídu Funkce_Kvadraticka jako potomka třídy Funkce. Třída Funkce_Kvadraticka bude mít jako atribut parametry funkce a, b, c (typu reálné číslo double). V metodě calc_y bude počítat hodnotu y = ax^2 + bx + c. Parametry kvadratické funkce budou inicializovány vmetodě konstruktoru. Tato třída bude mít navíc metodu vracející počet kořenů kvadratické rovnice int pocet_korenu() a metodu vracející hodnotnou dikrimintantu double diskriminant(). Definujte metodu equals a metodu toString.
