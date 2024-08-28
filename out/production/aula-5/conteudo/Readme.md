    Algoritmos de ordenação
    Na aula de hoje:
    - Bubble Sort
    - Selection Sort
    - Insection Sort

1. Bubble Sort percorre a lista inteira comparando elementos irmãos, primeiro com o segundo, segundo com o terceiro etc. Objetivo é colocar o maior elemento no topo do array.
A ideia é que o maior elemento vai flutuar como uma bolha para o final da lista

|4|3|2|1| ----->  |4|1|2|3| -----> |4|3|1|2| -----> |4|3|2|1|

↓

[0][1][2][3]

Essa ordenação considera movimentar um elemento por ciclo em uma comparação entre dois elementos presentes na lista, cada troca acima representa um ciclo.

2. Selection Sort pega a primeira posição e percorre todos os elementos para comparação de forma crescente para cada elemento.

|4|3|2|1| ----->  |4|2|3|1| -----> |4|3|2|1|

Leva menos trocas que o Bubble, mas não é muito eficiente em listas grandes

Insertion Sort

Compara cada novo elemento ordenando do final para o começo do array, cada nova inserção é feita ao final da lista e compara com cada elemento já inserido anteriormente em um ciclo inverso.

|4|3|2|1| ----->  |1|2|4|3| -----> |1|4|3|2| -----> |4|3|2|1|