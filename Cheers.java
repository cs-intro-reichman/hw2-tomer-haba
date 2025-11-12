//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        
        int N = Integer.parseInt(args[1]);
        String S = args[0].toUpperCase(); 
        
        String SPECIALS = "AEFHILMNORSX"; 
        
        for (int i = 0; i < S.length(); i++) {
            
            char currentLetter = S.charAt(i); 
            String article; 
            
            // שינוי לוגיקת ה-article כדי שיכלול את הרווח/ים הנדרש/ים:
            if (SPECIALS.indexOf(currentLetter) != -1) {
                // נדרש: רווח בודד אחרי 'an'
                article = "an ";
            } else {
                // נדרש: שני רווחים אחרי 'a' ליישור (עבור 'a  U')
                article = "a  ";
            }
            
            // הדפסה: מחברים את article מיד ל-currentLetter (הרווחים כבר כלולים ב-article)
            System.out.println("Give me " + article + currentLetter + ": " + currentLetter + "!");
        }
        
        System.out.println("What does that spell?"); 

        String cheerLine = S + "!!!"; 
        
        for (int i = 0; i < N; i++) {
            System.out.println(cheerLine);
        }
    }
}