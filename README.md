Gerenciador de Produtos e Etiquetas de Preço
Este projeto Java ilustra os conceitos de Herança e Polimorfismo através de um sistema para cadastrar diferentes tipos de produtos (comuns, usados e importados) e gerar suas etiquetas de preço com informações específicas.

🚀 Funcionalidades
O programa permite:

Cadastro de Produtos: O usuário pode informar o nome e preço de produtos, indicando se são comuns, usados ou importados.

Dados Específicos:

Para produtos usados, é solicitada a data de fabricação.

Para produtos importados, é solicitada a taxa alfandegária.

Cálculo Polimórfico de Preço: O preço exibido na etiqueta varia conforme o tipo de produto:

Produto Comum: Apenas o preço base.

Produto Usado: O preço base e a data de fabricação.

Produto Importado: O preço base somado à taxa alfandegária, e a taxa é exibida.

Exibição de Etiquetas: Após o cadastro, o programa lista as etiquetas de preço formatadas para todos os produtos inseridos.

💻 Tecnologias Utilizadas
Java

API de Data e Hora (java.time): Para manipulação robusta de datas (JDK 8+).

📁 Estrutura do Projeto
O projeto é organizado em dois pacotes principais:

aplicacao:

Programa.java: Contém o método main, que é o ponto de entrada do aplicativo. Responsável pela interação com o usuário, leitura de dados e exibição das etiquetas.

entidades:

Produto.java: A classe base que representa um produto genérico. Possui atributos nome e preco, e um método precoEtiqueta() que formata a etiqueta básica.

ProdutoImportado.java: Estende Produto. Adiciona o atributo taxaAlfandega e sobrescreve o método precoEtiqueta() para incluir a taxa no cálculo do preço total e na exibição.

ProdutoUsado.java: Estende Produto. Adiciona o atributo dataFabricacao (do tipo LocalDate) e sobrescreve o método precoEtiqueta() para incluir a informação de que o produto é "usado" e sua data de fabricação.

💡 Conceitos Demonstrados
Este projeto é um excelente exemplo prático de:

Herança: As classes ProdutoImportado e ProdutoUsado herdam as características (nome, preco) e comportamentos (precoEtiqueta padrão) da classe Produto, promovendo a reutilização de código e estabelecendo uma relação "é um" (um ProdutoImportado é um Produto).

Polimorfismo: A List<Produto> na classe Programa pode armazenar objetos de qualquer uma das subclasses (Produto, ProdutoImportado, ProdutoUsado). Ao iterar sobre essa lista e chamar o método precoEtiqueta(), o Java automaticamente invoca a implementação correta do método para cada tipo de objeto em tempo de execução, demonstrando o poder do polimorfismo em tratar objetos de diferentes tipos de forma uniforme.

Encapsulamento: Atributos privados com métodos getters e setters garantem o controle sobre o acesso aos dados.

Tratamento de Datas: Uso da moderna API java.time (LocalDate, DateTimeFormatter) para manipulação e formatação de datas de forma eficiente e segura.

▶️ Como Executar
Clone o repositório para sua máquina local.

Compile as classes Java:
Certifique-se de estar no diretório raiz do projeto e execute:

Bash

javac aplicacao/Programa.java entidades/Produto.java entidades/ProdutoImportado.java entidades/ProdutoUsado.java
Execute o programa:

Bash

java aplicacao.Programa
O programa irá então solicitar a entrada dos dados dos produtos e, ao final, exibirá as etiquetas de preço formatadas.

🤝 Contribuição
Sinta-se à vontade para explorar o código, fazer melhorias ou utilizá-lo como base para seus estudos e projetos em Java!
