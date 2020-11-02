public class apples {
    public static void main(String[] args){
        salmon salmonObject = new salmon(10);

        for(int i = 0; i<5;i++){
            salmonObject.add();
            System.out.printf("%s", salmonObject);
        }

    }
}
