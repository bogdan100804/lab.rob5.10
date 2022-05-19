public class FourthTask {public static void main(String[] args){
    int i=1, fact=1;
    int numb=10;
    System.out.println("FOR");
    for (i=1; i<=numb; i=i+1){
        fact=fact*i;
    }
    System.out.println("Факторіал числа 10:"+fact);

    System.out.println("WHILE");
    while(i<=numb){
        fact=fact*i;
        i++;
    }
    System.out.println("Факторіал числа 10:"+fact);
}
}
