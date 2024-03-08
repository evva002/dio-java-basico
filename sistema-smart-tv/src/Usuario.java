public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual:" + smartTv.volume);
        System.out.println("Canal atual:" + smartTv.canal);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual:" + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual:" + smartTv.canal);

        smartTv.escolherCanal(12);
        System.out.println("Canal atual:" + smartTv.canal);
    }
}
