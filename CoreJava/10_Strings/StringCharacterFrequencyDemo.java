public class StringCharacterFrequencyDemo {
    public static void main(String [] args) {
        
        String text = "programming";

        boolean[] visited = new boolean[text.length()];

        for(int i = 0; i < text.length(); i++) {
            if(visited[i]) {
                continue;
            }

            int frequency = 0;

             for(int j = 0; j < text.length(); j++) {
               if(text.charAt(i) == text.charAt(j)) {
                frequency++;
                visited[j] = true;
               } 
            }

            System.out.println(text.charAt(i) + " -> " + frequency);
            
        }
    }
}