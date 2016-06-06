**PROJECT TITLE: A DSL for specifying queries in Graphs for Java

**GROUP: 3MIEIC3 1 GQDSL

(Names, numbers, self assessment, and contribution of the members of the group according to:)
NAME1: Maria Chaves, NR1: 201306842, GRADE1: 16, CONTRIBUTION: 37.5%
NAME2: Inês Sousa Caldas, NR2: 200904082, GRADE2: 16, CONTRIBUTION: 37.5 %
NAME3: Miguel Lucas, NR3: 201000717, GRADE3: 16, CONTRIBUTION: 25%

** SUMMARY:
O nosso compilador pode ser executado da seguinte forma:
java main/Cronus <input_file>

Para isso criamos as seguintes instruçoes:

Criar um grafo
Criar um nó
Criar uma lista de nós
Ler de um ficheiro um grafo
Atribuir nós a uma lista de nós cumprindo regras passadas por parâmetro
Pesquisar um caminho num grafo dado como parâmetro:
	dois nós - devolve o caminho desde o primeiro nó até ao segundo
	um nó e uma regra para o tamanho - devolve um caminho desde o nó que cumpra a regra para o tamanho
	dois nós e uma regra para o tamanho - devolve o caminho entre os nós desde que cumpra a regra para o tamanho

**DEALING WITH SYNTACTIC ERRORS: (Describe how the syntactic error recovery of your tool does work. Does it exit after the first error?)

Quando existe um erro sintático, o nosso compilador lança uma excepção e sai do programa assim que um erro sintático aparece.

**SEMANTIC ANALYSIS: (Refer the possible semantic rules implemented by your tool.)

O nosso compilador assim que tem um erro semântico envia uma mensagem de erro para o ecrã mas permite compilar todo o ficheiro. Apenas não imprime no ficheiro gerado com as instruções gremlin as respetivas instruções.


**INTERMEDIATE REPRESENTATIONS (IRs): (for example, when applicable, describe the HLIR (high-level IR) and the LLIR (low-level IR) used, if your tool includes an LLIR with structure different from the HLIR)

Não aplicável.

**CODE GENERATION: (when applicable, describe how the code generation of your tool works and identify the possible problems your tool has regarding code generation.)

Cria um ficheiro chamado “gremlin.txt” com as respetivas instruções no gremlin. Tem um problema na geração do código quando é uma instrução para pesquisa num grafo.

**OVERVIEW: (refer the approach used in your tool, the main algorithms, the third-party tools and/or packages, etc.)

Todo o projeto foi baseado na DSL Gremlin (https://github.com/tinkerpop/gremlin), onde foi verificada a documentação desta, e selecionadas as queries que consideramos mais relevantes. 

**TESTSUITE AND TEST INFRASTRUCTURE: (Describe the content of your testsuite regarding the number of examples, the approach to automate the test, etc.)

São disponibilizados três ficheiros de testes.
Input2.txt: Neste ficheiro existem instruções com errors semânticos, não sendo colocado no ficheiro gremlin.txt o respetivo código em gremlin.
Input3.txt Neste ficheiro todas as instruções estão corretas, não havendo erros de sintaxe nem de semântica e, portanto, é gerado o código em gremlin.

**TASK DISTRIBUTION: (Identify the set of tasks done by each member of the project.)

**PROS: (Identify the most positive aspects of your tool)

A nossa linguagem é mais intuitiva e user-friendly em comparação com o Gremlin. Esta DSL tem uma sequência de comandos bastante complexa e de difícil utilização para pessoas com pouca experiência em programação ou que não se encontrem familiarizados com a linguagem.

**CONS: (Identify the most negative aspects of your tool)

A linguagem Gremlin, embora bastante complexa e de difícil utilização, é bastante completa na manipulação de grafos. A linguagem implementada é bastante mais simples e com menos funcionalidades.
