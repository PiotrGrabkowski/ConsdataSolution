

public class BrainFuckDecoder {

    // without nested loops for now :)
    public String decode (String s, int arraySize){
        byte[] array = new byte[arraySize];
        StringBuilder stringBuilder = new StringBuilder();
        int pointer = 0;


        for (int j = 0; j <s.length(); j++){
            char c = s.charAt(j);
            if(c == '<'){
                pointer--;
            }
            else if(c == '>'){
                pointer ++;
            }
            else if(c == '+'){
                array[pointer] ++;
            }
            else if(c == '-'){
                array[pointer] --;
            }
            else if(c == '['){
                if (array[pointer] == 0){
                    while (s.charAt(j) != ']'){
                        j++;
                    }
                }
            }
            else if(c == ']'){
                if(array[pointer] !=0){
                    while (s.charAt(j) != '['){
                        j--;
                    }

                }
            }
            else if(c == '.'){
                stringBuilder.append((char)array[pointer]);
            }

        }
        return stringBuilder.toString();
    }
}
