# Simulador de Terminal Linux em Java

## Descrição do Projeto

Este projeto consiste em uma aplicação em modo texto (console) desenvolvida em Java, que simula o funcionamento básico de um terminal Linux. O usuário interage digitando comandos, que são interpretados e executados pelo sistema.

## Objetivos 
* Simular comandos básicos de um terminal Linux
* Interpretar comandos digitados pelo usuário
* Manipular arquivos e diretórios virtualmente
* Armazenar histórico de comandos
* Utilizar boas práticas de POO

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
