public class mian {
    public static void main(String[] args){
        int year = 2001;
        if ((year % 400 == 0) || (year %4 == 0 && year % 100 !=0) ){
            System.out.println("一定是闰年");
        }else{
            System.out.println("一定是平年");
        }
    }
}
