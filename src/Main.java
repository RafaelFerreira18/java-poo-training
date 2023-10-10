public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone(94521);
        Iphone iphone2 = new Iphone(541233);


        // Testing telephonic calling functions
        iphone1.ligar(iphone2);
        iphone2.atender();
        iphone2.iniciarCorreioDeVoz(iphone1);


        // Testing web navigator functions
        iphone1.adicionarNovaAba("www.google.com");
        iphone1.exibirPagina("www.youtube.com");
        iphone1.adicionarNovaAba("www.youtube.com");
        iphone1.exibirPagina("www.youtube.com");
        iphone1.atualizarPagina();

        //Testing music app functions
        String musica = iphone2.selecionarMusica("Locked Out Of Haven");
        iphone2.tocar(musica);
        iphone2.pausar();


    }
}
