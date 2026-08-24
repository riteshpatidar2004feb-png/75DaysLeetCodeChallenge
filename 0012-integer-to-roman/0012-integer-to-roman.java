class Solution {
    public String intToRoman(int num) {
        int[] nums = new int[4];
        int i = 0, place = 1000;
        while(num > 0){
            nums[i] = (num/place) * place;
            num = num - nums[i];
            i++;
            place /= 10;
        }
        StringBuilder sb = new StringBuilder();
        int app = nums[0] / 1000;
        while(app > 0){
             sb.append("M");
             app--;
        }
        for( i = 1; i < nums.length; i++){
            if(nums[i] == 0) continue;
            if(i == 1){
                if(nums[i] <= 900 && nums[i] > 400) {
                    if(nums[i] == 900) sb.append("CM");
                    else {
                        sb.append("D");
                        app = nums[i]/100 - 5;
                        while(app > 0){
                            sb.append("C");
                            app--;
                        }
                    }
                }
                else if(nums[i] <= 400 && nums[i] >= 100) {
                    if(nums[i] == 400) sb.append("CD");
                    else{
                        app = nums[i]/100;
                        while(app > 0){
                            sb.append("C");
                            app--;
                        }
                    }
                }
            }

            if(i == 2){
                if(nums[i] <= 90 && nums[i] > 40) {
                    if(nums[i] == 90) sb.append("XC");
                    else{
                        sb.append("L");
                        app = nums[i]/10 - 5;
                        while(app > 0){
                            sb.append("X");
                            app--;
                        }
                    }
                }
                else if(nums[i] <= 40 && nums[i] >= 10) {
                    if(nums[i] == 40) sb.append("XL");
                    else{
                        app = nums[i]/10;
                        while(app > 0){
                            sb.append("X");
                            app--;
                        }
                    }
                }
            }

            if(i == 3){
                if(nums[i] <= 9 && nums[i] > 4) {
                    if(nums[i] == 9) sb.append("IX");
                    else{
                        sb.append("V");
                        app = nums[i] - 5;
                        while(app > 0){
                            sb.append("I");
                            app--;
                        }
                    }
                }
                else if(nums[i] <= 4 && nums[i] >= 1) {
                    if(nums[i] == 4) sb.append("IV");
                    else{
                        app = nums[i];
                        while(app > 0){
                            sb.append("I");
                            app--;
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
}