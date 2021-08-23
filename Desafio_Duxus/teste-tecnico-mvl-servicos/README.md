## Teste Técnico


Fazer um sistema de escalação de times. Toda semana você vai montar um time vencedor. Não importa se é Esporte tradicional ou eSports

Exemplos de Esporte tradicional : Futebol, Basquete

Exemplos de eSports : Counter Strike, Valorant, Free Fire, League of Legends, APEX

Você pode usar a criatividade pois NÃO EXISTE UMA SOLUÇÃO DEFINITIVA para o teste. 

## Considerações Importantes

Faça testes unitários para validar sua solução.
Faça commits frequentes.

## Itens Obrigatórios:


Utilize Java >= 8;
Utilize o Maven como estrutura do projeto.
O pacote final da sua solução deve ser um arquivo WAR, será executado em um Tomcat;
Se sua aplicação necessitar de configurações (ex: banco de dados), inclua as indicações em um arquivo setup.md na raíz do projeto;
Também inclua no setup.md como podemos executar a sua aplicação;

## Funcionalidades

### 1) Estrutura dos Dados

Você vai precisar de dois cadastros. - Cadastro de Integrantes - Cadastro de Times

### 2) Cadastro de Integrantes

Fazer um cadastro de integrantes para os times. Sugestão de campos para a tabela de "Integrante" :

Id
Franquia
Nome
Função
Exemplo de integrante para esporte tradicional :

Franquia : São Paulo
Nome : Daniel Alves
Função : Meia
Exemplo de integrante para esports (gaming) :

Franquia : Apex Legends
Nome : Lifeline
Função : Médica

### 3) Cadastro de Times

Fazer um cadastro de times onde não importa muito a quantidade de integrantes. Para cadastrar um time para uma determinada semana basta escolher os personagens/integrantes que farão parte dele. A sugestão é fazer duas tabelas : Time e ComposicaoTime

Sugestão de Campos para Time:

Id
Data
Sugestão de Campos para ComposicaoTime:

Id
Id_Time (foreign key tabela Time)
Id_Integrante (foreign key tabela Integrante)

### 4) API

Seu sistema vai processar as informações do banco de dados e vai exportá-las através de endpoints.

Esse passo é muito interessante no teste porque queremos medir como você de lida com estruturas de dados. Colocamos uma restrição artificial : Não utilizar funções de SQL como 'count' para resolver esses processamentos. Você deve usar os selects para trazer todos os dados, mas processe eles na linguagem.


## Endpoints:

| Endpoint  | Parâmetros | Descrição | 
|--|--|--|
| TimeDaData | Data | Vai retornar uma lista com os nomes dos integrantes do time daquela data |
| IntegranteMaisUsado | Data inicial e Data final (podem ser null) | Vai retornar o integrante que tiver presente na maior quantidade de times dentro do período | 
| TimeMaisComum | Data inicial e Data final (podem ser null) | Vai retornar uma lista com os nomes dos integrantes do time mais comum dentro do período |
| FuncaoMaisComum | Data inicial e Data final (podem ser null) | Vai retornar a função mais comum nos times dentro do período |
| FranquiaMaisFamosa | Data inicial e Data final (podem ser null) | Vai retornar o nome da Franquia mais comum nos times dentro do período |
| ContagemPorFranquia | Data inicial e Data final (podem ser null) | Vai retornar o número (quantidade) de Franquias dentro do período |
| ContagemPorFuncao | Data inicial e Data final (podem ser null) | Vai retornar o número (quantidade) de Funções dentro do período |



## 5) Telas

Conforme já foi dito as telas de cadastro tem prioridade menor do que o funcionamento da API. Você pode fazer as telas da maneira mais simples possível e usar qualquer framework que facilite o desenvolvimento.

- Tela de Inserção de Integrantes
    - Um formulário com os campos é suficiente
- Tela de Montagem de Times pode ser feita de diversas maneiras, algumas sugestões:
    - Fazer uma listagem e colocar um checkbox ao lado de cada integrante
    - Fazer um "transfer" usando dois "selects" de html
    - Usar um componente de jquery ( https://www.jqueryscript.net/blog/best-multiple-select.html )

O importante é a tela estar funcional e a aparência não será avaliada.
