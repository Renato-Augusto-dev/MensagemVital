import java.util.Random;
import java.util.Scanner;
public class VitaMensagen {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int contador = 0 ;
        int dificuldade;
        String resposta = "";
        char letras = 0;

        System.out.println("-----------------------------------------");
        System.out.println("A MENSAGEM VITAL");
        System.out.println("-----------------------------------------");

        System.out.println("ESCOLHE UMA DIFICULDADE DE 4 - 10");
        dificuldade = leitor.nextInt();

        while (dificuldade < 4 || dificuldade > 10)
        {
            System.out.println("ESCOLHE UMA DIFICULDADE DE 4 - 10");
            dificuldade = leitor.nextInt();
        }

        Comparador(dificuldade,contador,leitor,gerador,letras, resposta);


        while(contador != 10)
        {
            System.out.println("Deseja jogar novamente? Y/N");
            resposta = leitor.next();

            if(resposta.equals("Y") || resposta.equals("y"))
            {
                Comparador(dificuldade,contador,leitor,gerador,letras,resposta);
            }else
            {
                System.out.println("O jogo acabou");
                contador = 10;
            }
        }


    }
    private static void Comparador(int dificuldade, int contador, Scanner leitor, Random gerador, char letras, String resposta){

        //
        StringBuilder mensagem = new StringBuilder();


        while (contador != dificuldade)
        {
            letras = (char)('A' + gerador.nextInt(26)+1);
            mensagem.append(letras);

            System.out.print(letras);

            contador++;

        }
        try
        {
            Thread.sleep(3000);
            System.out.println();
        }
        catch (InterruptedException e)
        {
            System.out.println("O programa foi interronpido");
        }

        while(contador != 1000)
        {
            System.out.println();
            contador++;
        }

        System.out.println("Qual é a palavra que pareceu?");
        resposta = leitor.next();

        if(resposta.equals(mensagem.toString()))
        {
            System.out.print("Você aceitou ");
        }
        else
        {
            System.out.print("Vcoê errou ");
        }

    }

}
