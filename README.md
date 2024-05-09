## Desafio


Implementar uma aplicação para cadastrar nossas músicas e podcasts preferidos, modelando as classes utilizando os conceitos de orientação a objetos: abstração, herança, encapsulamento e polimorfismo. 
&nbsp;

&nbsp;

## 🔨 Objetivos do projeto

- Criar uma classe **Audio** com os atributos (titulo, totalReproducoes, totalCurtidas e classificacao).
- Utilizar encapsulamento, deixando os atributos privados e criando os *getters* e *setters* para acessar e modificar os atributos.
- Criar dois métodos sem retorno: curte() e reproduz(), que irão incrementar as variáveis totalCurtidas e totalReproducoes, respectivamente.
- Organizar o código em pacotes.
- Criar uma classe **Musica** estendendo de Audio, com os atributos adicionais **album**, **cantor** e **genero**.
- Criar uma classe **Podcast** estendendo de Audio, com os atributos adicionais **apresentador** e **descricao**.
- Criar uma classe Principal e instancie um objeto do tipo Musica e outro do tipo Podcast, preenchendo seus atributos;
- Criar um loop para chamar os métodos curte() e reproduz() a fim de simular um número grande de reproduções e curtidas.
- Fazer uma sobrescrita do método *getClassificacao* na classe Musica, definindo que se a mesma tiver mais de 2000 **reproduções** a classificação será 10 e para valores inferiores a classificação será 8.
- Fazer uma sobrescrita do método *getClassificacao* na classe Podcast, definindo que se o mesmo tiver mais de 500 **curtidas** a classificação será 10 e para valores inferiores, a classificação será 7.
- Criar uma classe chamada **MusicasPreferidas** ou apenas **Preferencias**, com um método sem retorno (void) chamado *inclui*, que receberá como parâmetro um Audio.
- No método inclui, trabalharemos o polimorfismo, onde iremos utilizar o *getClassificacao* (de acordo com a subclasse que for passada aqui como parâmetro) para exibir alguma mensagem. Para classificação igual ou superior a 9, iremos imprimir no terminal uma mensagem e se for inferior, imprimiremos uma outra mensagem.
- Finalizar instanciando um objeto do tipo **MusicasPreferidas** ou **Preferencias** e incluindo a música e podcast instanciados anteriormente.
&nbsp;


&nbsp;
- Prévia resultados:
&nbsp;

&nbsp;
<div id="badges skills">
      <img src="https://github.com/Mviniicius11/desafio_StreamDeMusica/assets/127998638/a4ba29d5-b907-4abd-8725-a90ea586c410" alt="Resultado Código" width="700px"/>
      <img src="https://github.com/Mviniicius11/desafio_StreamDeMusica/assets/127998638/d8dd7947-179b-4388-ac76-3618fbd4b376" alt="Main" width="700px"/>
      <img src="https://github.com/Mviniicius11/desafio_StreamDeMusica/assets/127998638/78f41851-7062-4803-b296-b7e58773ea8a" alt="Classe Audio" width="700px"/>
      <img src="https://github.com/Mviniicius11/desafio_StreamDeMusica/assets/127998638/80ac84f1-6dee-4290-a49d-e8bb4d3409a8" alt="Classe MinhasPreferidas" width="700px"/>
</div>
