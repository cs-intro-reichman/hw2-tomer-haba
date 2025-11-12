public class TimeCalc {
    public static void main(String[] args) {
        
        String T = args[0]; 
        String M_STR = args[1]; 
        
        int M_ADD = Integer.parseInt(M_STR); 
        
        int H = Integer.parseInt(T.substring(0, 2)); 
        int M = Integer.parseInt(T.substring(3, 5));  
        
        String hoursOutput;
        String minutesOutput; 
        
        int totalMinutes = (H * 60) + M + M_ADD; 
        
        int newMinutes = totalMinutes % 60;  
        
        int calculatedHours = (totalMinutes / 60) % 24;
        
        if (calculatedHours < 10) {
            hoursOutput = "0" + calculatedHours;
        } else {
            hoursOutput = "" + calculatedHours;
        }
        
        if (newMinutes < 10) {
            minutesOutput = "0" + newMinutes;
        } else {
            minutesOutput = "" + newMinutes;
        } 
        
        System.out.println(hoursOutput + ":" + minutesOutput);
    }
}