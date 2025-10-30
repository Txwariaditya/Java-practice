

class fifth {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50}; 
        int target = 69; 
        int flag=0;
        for (int i = 0; i<5; i++){
            for (int j = i+1; j<5; j++){
                if (myArray[i] + myArray[j] == target){
                    System.out.print("FOUND");
                    flag=1;


                }
                
                }
            
        }
        if (flag==0){
            System.err.println("Not found");
    
        
        
     
        }
    }
}

    
