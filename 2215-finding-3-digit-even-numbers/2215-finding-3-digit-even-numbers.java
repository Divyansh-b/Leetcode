class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int len = digits.length;
        HashSet<Integer> h1 = new HashSet<>();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                for(int k = 0; k < len; k++){
                    if(i == j || j == k || k == i){
                        continue;
                    }
                    int num = (((digits[i] * 10) +  digits[j]) * 10) + digits[k];  
                    if(num % 2 == 0 && num >= 100 && num <= 999){

                    h1.add(num);
                    }
                }
            }
        }
        // ArrayList arr1 = new ArrayList(h1);
        ArrayList<Integer> arr1 = new ArrayList<>(h1);
        Collections.sort(arr1);
        int arr2[] = new int[arr1.size()];
        for(int i = 0; i < arr2.length; i++){    
            arr2[i] = arr1.get(i); 
        }
return arr2;
    }
}