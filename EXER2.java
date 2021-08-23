public class EXER2 {
    public static void main(String[]args){
        int resultado = 0;
        int ultimovalor;
        for (int x = 0; x <= 1000; x++){
            ultimovalor = resultado;
            resultado += x;
            System.out.println("%d = %d + %d\n",resultado, ultimovalor, x);
        }
        
    }
}
