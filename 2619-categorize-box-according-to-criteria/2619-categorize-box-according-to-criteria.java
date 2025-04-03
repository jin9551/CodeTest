class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        // Bulky 
        // 아무 한변의 길이가 10^4을 넘어서면 
        // 볼륨이 10^9을 넘어서면

        // Heavy 
        // 박스의 질량이 100을 넘어서면

        // 박스가 Heavy하면서 Bulky하면 Both

        // 박스가 둘 다 만족하지 못하면 Neither

        // 박스가 Bulky만 만족하면 Bulky
        // 박스가 Heavy만 만족하면 Heavy
        if(isBulky(length,width,height) && mass >= 100){
            return "Both";
        } else if(isBulky(length,width,height) && mass < 100){
            return "Bulky";
        } else if(!isBulky(length,width,height) && mass >= 100){
            return "Heavy";
        } else {
            return "Neither";
        }



        }
        
        public static boolean isBulky(int l, int w, int h){
            long volume = (long)l * (long)w * (long)h;

            if(Math.max(l,Math.max(w,h))>= 10_000){
                return true;
            }
            if(volume >= 1_000_000_000) {
                return true;
            }

            return false;
        }

    }

  


        // 첫번째 풀이
        // boolean Bulky = false;
        // boolean Heavy = false;

        // long volume = (long)length * (long)width * (long)height;
        // System.out.println(volume);
        // if(length >= 10000 || width>= 10000 || height>= 10000 || volume >= 1000000000 ){
        //     Bulky = true;
        // } 

        // if(mass >= 100){
        //     Heavy = true;
        // }

        // if(Bulky && Heavy){
        //     return "Both";
        // } else if (Bulky && !Heavy){
        //     return "Bulky";
        // } else if(Heavy && !Bulky) {
        //     return "Heavy";
        // } else {
        //     return "Neither";
        // }


