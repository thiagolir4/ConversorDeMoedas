# Conversor de Moedas

Este projeto é um conversor de moedas em tempo real desenvolvido em Java. Utiliza a API Exchangerate para obter taxas de câmbio atualizadas, permitindo a conversão entre várias moedas, incluindo opções para moedas arbitrárias.

## Atribuição
Este projeto foi desenvolvido como parte do bootcamp Oracle Next Education.

## Estrutura do Projeto

- `Principal.java`: Classe principal que fornece a interface de linha de comando e lida com as interações do usuário.
- `Moeda.java`: Classe que armazena as moedas de origem e destino selecionadas para conversão.
- `Moedas.java`: Um record que armazena as taxas de câmbio retornadas pela API e fornece métodos para acessá-las.
- `GeradorDeArquivos.java`: Classe responsável por salvar as taxas de câmbio obtidas em um arquivo JSON.
- `ApiServices.java`: Classe que lida com a comunicação com a API Exchangerate para obter as taxas de câmbio.

## Funcionalidades

- Conversão entre moedas fixas: Conversão direta entre Dólar, Real, Euro e Libra Esterlina.
- Conversão com moedas arbitrárias: Permite a escolha de moedas específicas conforme a ISO 4217 para conversão personalizada.
- Salvamento de dados JSON: Gera um arquivo JSON com as taxas de câmbio mais recentes da moeda selecionada.



## Tecnologias Utilizadas

- Java: Linguagem principal para a lógica de negócios e implementação.
- Java HTTP Client: Para realizar requisições à API de taxas de câmbio.
- API Exchangerate: Provedor de taxas de câmbio em tempo real.
- Gson (para manipulação de JSON)

## Melhorias Futuras
- Adição de interface gráfica: Para melhorar a interação com o usuário.
- Suporte a mais moedas simultâneas: Permitir a conversão entre várias moedas ao mesmo tempo.
- Otimização do salvamento de dados: Implementar opções de exportação de dados em formatos adicionais, como CSV.

## Contribuição

Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades. Para contribuir, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma nova branch: `git checkout -b minha-nova-funcionalidade`.
3. Faça suas alterações e commit: `git commit -m 'Adicionei nova funcionalidade'`.
4. Envie para o repositório original: `git push origin minha-nova-funcionalidade`.
5. Crie um pull request.


## Contato

Para qualquer dúvida ou sugestão, entre em contato através do email: thi.lira01@hotmail.com