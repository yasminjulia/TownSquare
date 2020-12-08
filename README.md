# TownSq QA - Processo Seletivo 
___
### Ambiente
- [x] jdk 1.8
O JDK 8 tem a maior compatibilidade com o Selenium e Appium

- [x] IntelliJ IDEA

## Ferramentas
- [x] TestNG
- [x] Selenide
- [x] Maven dependency
- [x] Selenium
- [x] Allure [comande-line: allure serve]

### Abordagem:  

O desenvolvimento deste teste é baseado na técnica funcional onde se prioriza aspectos externos da aplicação (black-box), avaliei se um grupo de inputs resultou na saída esperada levando em consideração as funcionalidades descritas, ou seja, o que se espera que a aplicação deve fazer. 

A metodologia utilizada na suíte de testes valida um fluxo dentro do app do início ao fim (end-to-end) tendo como objetivo simular um cenário real do usuário final e validar se o retorno está conforme desejado. 

Para a implementação da automação utilizei o selenium webdriver com api da selenide e TestNG, que oferecem ganchos para classe suítes e métodos (Before e after), suporte a anotações, configuração flexível, suporte a parâmetros, definição de tempo limite para testes, entre outros, no geral testng é uma ferramenta para testes em java e seus recursos facilitam muito o processo de automação para ui.  

### Casos de aceite:  

Story: Usuário cria um circular  |
----------------------------------|
Cenário: Criação de circulares |
Dado que estou logado no Townsq com perfil de síndico na tela Circulares|
Quando clico no botão Criar Circular e preencho os campos do formulário: título, descrição, cor e etc...  |
E clico em Criar|
Então um circular deve ser criado e exibido no mural Recentes|


Story: Usuário altera um circular|
----------------------------------|
Cenário: Alteração de circulares criadas|
Dado que estou logado no Townsq com perfil de síndico na tela Circulares|
Quando seleciono um circular, altero e clico em Editar|
Então os campos devem ser alterados|

 
Story: Usuário deleta um circular|
----------------------------------|
Cenário: remoção de circulares|
Dado que estou logado no Townsq com perfil de síndico na tela Circulares|
Quando seleciono um circular, altero e clico em Editar|
Então os campos devem ser alterados| 


Story: Usuário fixa um circular na área de destaque|
----------------------------------|
Cenário: Fixar circulares|
Dado que estou logado no Townsq com perfil de síndico na tela Circulares|
Quando clico no ícone fixar|
Então o circular deve ser exibido no mural fixado|


Story: Usuário síndico verifica os usuários condôminos que visualizaram uma circular|
----------------------------------|
Cenário: Visualização de circulares|
Dado que estou logado no Townsq com perfil de síndico na tela Circulares|
Quando seleciono um circular e clico no ícone Visto por|
Então o usuário que visualizou o circular deve ser exibido|

___

### Reporte de Bug 

Suponha que, no momento da criação, o síndico encontre o botão "Criar" desabilitado, mesmo após preencher todos os campos necessários. Como você reportaria este problema? 

* __Botão criar desabilitado__ 

Bug id: 001 | Criticidade: Alto| Reproduzível: 100%
:----------:|:-----------------:|:----------------:

__Descrição:__  |
----------------|

Ao criar um circular o botão Criar encontra-se desabilitado; 

 

__Passo-a-passo:__ |
----------------|


Logar com perfil síndico > clicar no item de menu Circulares & Eventos > Criar circular preenchendo os campos: Título, Descrição, Cor, Ícone, Anexo > observe o botão Criar do fomulário de novo circular; 

Obs: Ao selecionar um ícone o botão criar é habilitado; 

 __Adicionais:__ |
 ----------------|


Login utilizado: eduarda.carvalho.eeec50@townsq.com.br, 

Ambiente: https://qa.townsq.io/, 

Sem informação sobre a última release, 

 
__Evidencias:__ |
----------------|


 
:blush:
 

