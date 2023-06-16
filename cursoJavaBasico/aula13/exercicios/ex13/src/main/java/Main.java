import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Calcule o peso ideal
        Para homens (72*h) - 58
        Para mulheres (62.1*h) - 44.7
        Peça o peso e informe se ela está dentro, acima ou abaixo do peso ideal
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double altura = lerDoubleCorretamente(scan);
        System.out.println("Digite seu sexo (M ou F)");
        String sexo = lerSexoCorretamente(scan);
        System.out.println("Informe seu peso");
        double peso = lerDoubleCorretamente(scan);

        double pesoIdeal;
        String genero;

        if(sexo.equalsIgnoreCase("m")){
            pesoIdeal = calcularPesoIdealHomem(altura);
            genero = "homens";
        }else if(sexo.equalsIgnoreCase("f")){
            pesoIdeal = calcularPesoIdealMulher(altura);
            genero = "mulheres";
        }else {
            System.out.println("Digite apenas F ou M");
            return;
        }

        System.out.printf("Para %s o peso ideal de acordo com sua altura é: %.5s\n", genero, pesoIdeal);
        if(peso == pesoIdeal){
            System.out.println("Parabéns, você está no peso ideal");
        }else if(peso < pesoIdeal){
            System.out.println("Você está abaixo do peso");
        }else{
            System.out.println("Você está acima do peso");
        }
    }
    public static double calcularPesoIdealHomem(double altura){
        return (72 * altura) - 58;
    }
    public static double calcularPesoIdealMulher(double altura) {
        return (62.1 * altura) - 44.7;
    }
    public static double lerDoubleCorretamente(Scanner scan){
        double valor;
        do {
            valor = scan.nextDouble();
            if(valor <=0){
                System.out.println("Valor digitado incorreto, tente novamente:");
            }
        }while(valor <= 0 );
        return valor;
    }
    public static String lerSexoCorretamente(Scanner scan){
        String sexo;
        do {
            sexo = scan.next();
            if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){
                System.out.println("Opção de sexo inválida. Digite novamente:");
            }
        }while(!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
        return sexo;
    }
}