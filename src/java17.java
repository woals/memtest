class Java17{
    public static void main(String []args){
        int data[] = new int[100000000];
        for(int i=0;i<100000000;i++){
            data[i] = i;
        }
        try{
            println("Done.\n");
            System.out.println("Done.\n");
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }
}