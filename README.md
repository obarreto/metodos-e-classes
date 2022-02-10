# Conceituação



"É uma opção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."  

____

# Criação



`<?visibilidade?><?tipo><?modificadores?> retorno nome (<?parâmetros?>) <?exceções?> corpo`

##### *V*sibilidade: public, protected ou private

##### Tipo: concreto ou abstrato

##### Modificador: "static" ou "final"

##### Retorno: tido de dados primitivos ou "void"

##### Nome: nome que é fornecido ao método

##### Parametros: parâmetros que pode receber

##### Exceções: exceções que pode lançar

##### Corpo: código que possui ou vazio

____

# Exemplos



`public String getNome()`{...}

`public double calcularTotalNota(){...}`

`public int verificarDistancia(int cordenada1, int cordenada2){...}`

`public abstract void executar();`

`public void alterarFabricante(Fabricante fabricante)`{...}

`public Relatorio gerarDadosAnaliticos(Cliente cliente);`

`Lis<Compra> compras){...}`

**`public static R N(P){}`**

____



# Utilização

Passa-se uma mensagem através de uma classe ou objeto.



`nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);`

`nome_da_classe.nome_do_obejto(); ou nome_da_classe.nome_do_objeto(...);`

Exemplo: 

​	`Math.rando();` ou `Math.sqrt(4);`

​	`usuario.getEmail();` ou `usuario.alteraraEndereco(endereco);`

____

# Paraticularidades



* Assinatura: é a forma de identificar unicamente  o método 

  Ass = nome + parâmetros

  **Método:**

  `public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3){...}`

  **Assinatura**:

​	    `calcularTotalVenda(double precoItem1, double precoItem2, precoItem3)`

​		uma assinatua também pode ser vazia.

* Construtor e Destrutor: são métodos esepciais usados na O.O

* Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.

* Passagem de parêmtros

  * Por valor(cápia) :

    ```java
    int i = 10;
    public void fazerAlgo(int i){
        i = i + 10;
        System.out.println("Valor de i dentro: " + i);
    }
    System.out.println("Valor de i fora: " + i);
    ```

    

  * Por referência(endereço)

____



# Boas práticas

Como os métodos devem ser criados:

* Nomes devem ser descritivos, mas curtos
* Notação camelo(camel case)
  * `verificarSaldo();` `executarTrasnferencia();` `existeDebito;`

* Deve possuir entre 80 e 120 linhas
* Evite lista de parâmetros longas
* Visibilidade adequadas

____

Exercitando

Crie uma aplicação que resolva as seguintes situações

* Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores dever passados.

* A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.

* Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.

  Defina arbitrariamente as faixas que influenciam nos valores.

Obsersavões:

* Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto.
* Pode chamar um método dentro de outo.
* Pode passar como parâmetro, a chamada de um outro método.

____



# Sobrecarga

Conceituação

​	"É capacidade de definir métodos para diferentes contextos, mas preservando seu nome e possbilitar alteração de sua lista de parâmetros."

____



# Criação de Sobrecarga

Alterar a assinatura do método - lista de parâmetros - e manter o nome do método.

Ass = nome + parâmetros

Exmplos:

`converterParaInteiro(float f);`

`converterParaInteiro(double f);`

`converterParaInteiro(String S);`

`converterParaInteiro(float f, RountType rd);` 

`converterParaInteiro(double d, RountType rd);`

`converterParaInteiro(String s, RountType rd);`

```java
converterParaInteiro(RountType rd, String s);//RoundType arredonda o tipo de dado para + ou -
converterParaInteriro();
```

https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html

____

# Exercitando

Cria uma aplicação que calcula a á de 3 quafrilateros notaveis; Quadrado, Retangulo, Trapézio.

____

# Return

* É uma instrução de interrupção
* Simbologia `return`

O método executa seu retorno quando:

* Completa todas suas instruções internas
* Chega a uma declaração exeplicita de retorno
* Lança uma exceção

____



# Considerações

* O tipo de retorno do método é definido na sua criação e poder um tipo primitivo ou objeto;
* O tipo de dado de return deve ser compatível com o dado método;
* Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.

____



# Exemplos

`public String getMensagem(){ return "Ola!"; }`

`public double getJuros(){ return 2.36; }`

`public int getParcelas(){ return 1.36f ;}` ` \\erro no tipo de dado`

`public void setIdade(){ return 10; } ` `\\ erro o metodo é void não retorna nada`

`public void executar(){ ... return ; ...}` `\\ quando o metodo é void o return é opcional`# metodos-e-classes
