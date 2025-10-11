class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> result =new ArrayList<>();
        float divide =a/b;
        result.add(divide);
        
        float rounded = Float.parseFloat(String.format("%.3f", divide));
        result.add(rounded);
        
        return result;

        
    }
    

}