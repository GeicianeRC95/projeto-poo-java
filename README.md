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

# Estrutura do Projeto (Visão Geral)

* Terminal → Classe principal que inicia o sistema
* GerenciadorComandos → Classe responsável por interpretar e despachar comandos
* Comando → Interface base para todos os comandos
* GerenciadorDiretorio → Gerencia diretórios
* GerenciadorArquivo → Gerencia arquivos
* ComandoLs, ComandoCd, ComandoMkdir, ComandoPwd, ComandoTouch, etc. → Implementações específicas dos comandos.
