package vitosfamily;

import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author christian
 */
public class Main {

    public static String getInput() {
        String inputLine=null;
        try {BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if(inputLine.length()==0)return null;
        } catch (IOException e){System.out.println(e.getMessage());}
        return inputLine;
    }

    public static void main(String[] args) {
        boolean igual = false;
        int r=0,k,z;
        int x=0;
        int c = Integer.parseInt(getInput());
        for(int i=0;i<c;i++){
            StringTokenizer s = new StringTokenizer(getInput());
            int a1[] = new int[s.countTokens()];
            while(s.hasMoreElements()){
                int b = Integer.parseInt(s.nextElement().toString());
                a1[x++]=b;
            }

            for(k=0; k<a1.length;k++){
                for(z=0; z<k;z++){
                    if(a1[k] == a1[z] && k>0){
                        igual = true;
                    }
                }
                if(!igual)
                    r++;
                igual = false;
            }
        }
        System.out.println(r);
    }

}
