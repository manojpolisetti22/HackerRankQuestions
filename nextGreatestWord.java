public String nextGreatest(String s){
        //String s = "12653";
        //One bug
        String[] arr = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] ="" + s.charAt(i);
        }
        for(int i  = s.length() - 1; i > 0  ; i--){
            char a = s.charAt(i);
            char b = s.charAt(i - 1);
            if(a > b){
                arr[i - 1] = "" + a;
                arr[i] = "" + b;
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
    }