package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lber on 26/10/2016.
 * Classe que contém a lista dos bairros a serem exibidos no fragment 1
 */

public class Bairro {
    private String nome;
    private String descricao;
    private Integer foto;

    public Bairro(String nome, String descricao, Integer foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
    }

    //Método que retorna a lista conténdo todos os bairros
    public static List<Bairro> getBairros(){
        List<Bairro> bairros = new ArrayList<>();

        bairros.add( new Bairro("Capim Macio", "Este bairro é o que apresenta melhor qualidade de " +
                "vida da Zona Sul. Nesse bairro, predominam casas de alto padrão e apartamentos de " +
                "luxo, além de uma vasta gama de comércio, sobretudo restaurantes, bares, " +
                "universidades e grandes redes de hipermercados. É cortado pela Avenida Engenheiro " +
                "Roberto Freire, uma das mais extensas avenidas da cidade. É o bairro que dá acesso " +
                "à famosa praia de Ponta Negra, além da conhecida Via Costeira, onde se encontram os " +
                "hotéis mais luxuosos da cidade.", R.drawable.capimmacio));
        bairros.add( new Bairro("Cidade satélite", "O bairro consta de um complexo de conjuntos " +
                "habitacionais, são eles: Conjunto Cidade Satélite, Conjunto Bancários e Conjunto " +
                "Vale do Pitimbu. A construção do maior deles, Conjunto Cidade Satélite, foi " +
                "subdividida em três etapas. Na Etapa I, as ruas recebem nomes de serras brasileiras" +
                " e pássaros. Na Etapa II, as ruas recebem nomes de rios. Na Etapa III, as ruas" +
                " recebem nomes de árvores brasileiras. O Conjunto Cidade Satélite é um dos maiores " +
                "conjuntos habitacionais da América Latina.", R.drawable.cidadesatelite));
        bairros.add( new Bairro("Felipe Camarão", "Felipe Camarão é um bairro da zona oeste da cidade" +
                " do Natal, no estado do Rio Grande do Norte. É conhecido pelo meios de comunicação," +
                " como um dos locais mais violentos da capital potiguar.", R.drawable.felipecamarao));
        bairros.add( new Bairro("Igapó", "Seu nome original era Aldeia Velha, nome esse que foi " +
                "herança do sitio que era a morada do Indio Potiguassu, posteriormente ocupado" +
                " pela família Cavalcante Sant'Iago, a qual era formada pelo casal Adalgiso " +
                "Sant'Iago e Josefa Cavalcanti que tinha 03 (três filhos) João, José e Maria da " +
                "Glória. Este sítio ocupava toda a extensão da margem esquerda da rodovia que vai " +
                "para Ceará Mirim e que na década de 80 após a morte de Dona Fefita, como era " +
                "conhecida Josefa Cavalcanti Sant'Iago, foi completamente loteado e vendido para " +
                "permitir a expansão urbana, esse lado inclusive pertence ao município de São " +
                "Gonçalo do Amarante denominado Jardim Lola (Apelido da mãe de Fefita), porém " +
                "faz parte do Bairro de Igapó. Tem suas origens na década de 1910, ao redor da " +
                "Praça Sto. Antônio de Paula, com a construção da Igreja da Santa Cruz ou Igreja da " +
                "Praça, como é popularmente conhecida.", R.drawable.igapo));
        bairros.add( new Bairro("Nova Natal", "O bairro é quase todo cercado por dunas, sendo uma " +
                "opção de lazer para quem mora por perto, uma das obras mais conhecidas da Capital " +
                "Potiguar é localizada entre o Bairro de Cidade Nova e Candelária, o Parque da " +
                "Cidade Dom Nivaldo Monte inaugurado em junho de 2008, pelo então prefeito de Natal, " +
                "Carlos Eduardo Alves, o parque é muito visitado por pessoas dos bairros mais " +
                "próximos e até turistas, é muito utilizado para fazer caminhadas, com um bela " +
                "paisagem é uma ótima opção para quem gostar de sentir o ar puro da cidade, o " +
                "Parque da Cidade conta com a ajuda de guardas que rondam pelo local.",
                R.drawable.novanatal));
        bairros.add( new Bairro("Ponta Negra", "Ponta Negra é um bairro nobre localizado na cidade " +
                "de Natal, capital do Rio Grande do Norte, Brasil. Localizado na Zona Sul de Natal, " +
                "foi, durante boa parte da década passada, o bairro mais caro da cidade devido ao " +
                "fato de concentrar grande parte dos hotéis e pousadas da cidade. Os turistas " +
                "estrangeiros que foram muitos no período 1998-2008 compraram muitos terrenos, casas " +
                "e prédios em Ponta Negra, gerando uma supervalorização excessiva dos imóveis " +
                "localizados nessa conhecida área da capital potiguar. Atualmente, os preços na área" +
                " de Ponta Negra estão passando por uma readequação tornando-se mais acessíveis aos" +
                " moradores da cidade.", R.drawable.pontanegra));
        bairros.add( new Bairro("Quintas", "O bairro das Quintas é um bairro popular localizado na" +
                " Zona Oeste de Natal, capital do estado do Rio Grande do Norte. Foi oficializado " +
                "bairro em 30 de Setembro de 1947, pela lei 251, e mantém seus limites atuais desde " +
                "1994.\n" +"Seu nome deriva do século XVIII, quando a região era formada por sítios " +
                "e granjas, como a Quinta Velha. Foi local de inspeção de veículos, sediou o primeiro " +
                "matadouro de Natal (onde hoje fica a sede da empresa de limpeza pública, a Urbana)." +
                " Também sediou o Cinema São José e uma amplificadora (sistema de som instalado em " +
                "diversas ruas que divulgava as manifestações da cultura popular).",
                R.drawable.quintas));
        bairros.add( new Bairro("Redinha", "A Redinha é um bairro localizado na Zona Norte de Natal," +
                " no estado do Rio Grande do Norte. Conhecido, principalmente pela frequentada Praia " +
                "da Redinha e a ginga com tapioca.", R.drawable.redinha));
        bairros.add( new Bairro("Forte dos Reis Magos", "O Forte dos Reis Magos é uma edificação " +
                "militar histórica localizada na cidade de Natal, no estado brasileiro do Rio " +
                "Grande do Norte. É administrada pelo Instituto do Patrimônio Histórico e Artístico " +
                "Nacional (IPHAN).", R.drawable.reismagos));
        bairros.add( new Bairro("Ribeira", "Ribeira é um bairro histórico da cidade de Natal, no" +
                " estado do Rio Grande do Norte. Inserido na zona leste da cidade, o bairro compreende" +
                " duas àreas (utilizada pelo setor imobiliário): a Ribeira Histórica (parte baixa " +
                "do bairro) e o Alto da Ribeira (parte alta do bairro). Depois de uma série de " +
                "ações promovidas para a revitalização do bairro, o mesmo está recebendo diversos" +
                " investimentos, principalmente a instalação de vários arranha-céus na região tais " +
                "como o edifício Mirante João Olímpio Filho, o maior da cidade. Tal fenômeno é " +
                "atribuído pela Lei de Operação Urbana da Ribeira, de 1997, que foi revisada em " +
                "2007. Esta lei concede uma série de benefícios fiscais e construtivos a fim de " +
                "reabitar o bairro, restaurar prédios históricos e atrair novos investimentos.",
                R.drawable.ribeira));

        return bairros;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getFoto() {
        return foto;
    }
}
