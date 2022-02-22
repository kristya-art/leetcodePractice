package ja.medium;

public class ContainerWithMostWater3 {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int tempArea = 0;
        int i = 0;
        int j = 0;
        int index=0;

        while (i < height.length) {
           j=i+1;
            while (j < height.length) {
                index = findMaxValue(j,height);
                if (height[i] > height[index]) {
                    tempArea = height[index] * (index- i);
                } else {
                    tempArea = height[i] * (index - i);
                }
                if (maxWater < tempArea) {
                    maxWater = tempArea;
                }
               j=index+1;
            }
            i++;

        }
        return maxWater;



    }
    public static int findMaxValue(int j,int[] arr){

      int maxIndex=j;
      int temp =0;
        while(j<arr.length){
            if(arr[j]>temp){temp=arr[j];maxIndex=j;}
            j++;
        }
        return maxIndex;
    }
    public static void main(String []args){
        int[] height = new int[]{1,1};
        int [] height2  = new int[] {3846,7214,9316,9869,2423,4235,4921,5878,9832,5302,4298,4312,8571,531,3206,7504,8321,9385,657,3095,1486,8099,1635,2735,1160,228,3388,1557,7094,4465,8611,3020,6142,182,4742,2507,3284,2005,7686,6688,3987,3137,781,5463,3098,3637,9384,7166,7751,6068,5560,9329,8846,6705,6672,7069,8478,7126,1758,1313,7419,1087,9752,4609,4133,821,6526,897,4482,7483,4920,6017,938,882,9106,6324,7766,8094,6619,8662,3577,1415,8896,1432,1104,95,4291,1289,5920,8682,9432,6298,3931,1803,401,6743,69,7138,2465,5315,6997,4722,2557,4915,7727,2196,9478,1355,8706,5934,1019,984,5214,800,8195,4819,8201,1796,3767,4032,40,4107,4219,2593,4688,9805,966,5597,5426,5532,2747,9954,1749,3301,153,807,759,6921,5094,1780,9993,8560,9992,5660,7071,9204,3621,192,4119,9603,9674,9420,706,8089,4300,8636,2108,6314,3537,6891,532,1810,9538,162,9776,9457,89,7941,165,4397,8630,4089,9710,1275,3187,7333,5428,1965,7125,1097,5741,5652,2158,1601,4160,5353,7806,6324,322,8684,2245,4585,7469,6817,3629,3305,2182,5236,535,900,4492,3610,3898,437,2581,2529,87};
        int result = maxArea(height2);

        long startTime = System.nanoTime();
        System.out.println(result);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime); // 166600
    }
}
