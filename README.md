# Simulador de Terminal Linux em Java

## Autores: Geiciane Rodrigues Carvalho e Erick Nogueira Alves

## Descrição do Projeto

Este projeto consiste em uma aplicação em modo texto (console) desenvolvida em Java, que simula o funcionamento básico de um terminal Linux. O usuário interage digitando comandos, que são interpretados e executados pelo sistema.

## Objetivos 
* Simular comandos básicos de um terminal Linux
* Interpretar comandos digitados pelo usuário
* Manipular arquivos e diretórios virtualmente
* Armazenar histórico de comandos
* Utilizar boas práticas de Programação Orientada a Objetos

## Tecnologias Utilizadas

* Java (JDK 8 ou superior)
* Execução via console/terminal
* IDE recomendada: Eclipse ou IntelliJ IDEA

## Estrutura do Projeto

* Terminal → Classe principal que inicia o sistema
* GerenciadorComandos → Classe responsável por interpretar e despachar comandos
* Comando → Interface base para todos os comandos
* GerenciadorDiretorio → Gerencia diretórios
* GerenciadorArquivo → Gerencia arquivos
* ComandoLs, ComandoCd, ComandoMkdir, ComandoPwd, ComandoTouch, etc. → Implementações específicas dos comandos.

## Comandos Implementados

* `pwd` → Exibe o diretório atual
* `ls` → Lista arquivos e diretórios do diretório atual
* `cd <diretorio>` → Navega entre diretórios
* `cd .. ` → Ir para o diretório pai
* `mkdir <nome>` → Cria um novo diretório
* `touch <arquivo>` → Cria um novo arquivo vazio
* `rm <arquivo/diretório>` → Remove arquivo ou diretório
* `cat <nome>` → Exibe o conteúdo de um arquivo
* `echo <texto> > <arquivo>` → Escreve texto em um arquivo
* `history` → Exibe o histórico de comandos
* `exit` → Encerra o programa

## Como Executar o Projeto

* Extraia o projeto para sua máquina
* Importe o projeto em uma IDE Java (Eclipse ou IntelliJ)
* Localize a classe Terminal
* Execute o método main
* Digite os comandos diretamente no console

## Exemplos de Uso

`mkdir Projetos`

`cd Projetos`

`echo Olá Mundo > poo.txt`

`cat poo.txt`

## Pilares de POO

* Herança: Foi utilizado para organizar a estrutura de pastas e arquivos. As classes Arquivo e Diretório compartilham as características comuns da classe Componente, o que evita repetição de código e permite que o sistema trate ambos com a mesma base.
  
* Polimorfismo: Foi utilizado para permitir que o sistema trate todos os comandos de forma genérica. Logo, o terminal chama o método executar() de um comando sem precisar conhecer os detalhes internos dele. Cada classe específica sabe realizar sua própria tarefa conforme sua necessidade.
  
## Persistência

Ao encerrar a aplicação com o comando `exit`, o sistema irá gerar automaticamente um arquivo chamado `historico_terminal.txt` contendo todos os comandos utilizados na sessão.


