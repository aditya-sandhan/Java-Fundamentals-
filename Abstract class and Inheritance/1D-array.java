class Array1D{
    public static void main(String[] args){
        //declaration and memory allocation
        int[] arr = new int[5];

        //initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //accessing elements
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}