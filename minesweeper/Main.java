package minesweeper;

import java.io.*;

/**
 *
 * @author christian
 */
public class Main {

    public static String getInput() {
        String string = "";
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            string = bf.readLine();
            if(string.length()==0) return null;
        } catch(IOException e){System.out.println(e.getMessage());}
        return string;
    }

    public static void main(String[] args) {
        int f=0,c=0,e=0,r=0,s=0,t=0;
        String linea="";
        f=Integer.parseInt(getInput());
        c=Integer.parseInt(getInput());
        char m[][]=new char[f][c];
        int m2[][]=new int[f][c];
        for(int i=0;i<f;i++){
            linea=getInput();
            for(int j=0;j<c;j++)
                m[i][j]=linea.charAt(j);
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                int k=i;
                int z=j;
                while(e<c+1){
                    if(z<c)
                        z++;
                    else{
                        z=0;
                        k++;
                    }
                    e++;
                }
                e=0;
                if(k<=f-1 && z<=c-1 && k>=0 && z>=0){
                    if(m[k][z]=='*')
                        ++m2[i][j];
                    if(z-1>=0){
                        if(m[k][z-1]=='*')
                            ++m2[i][j];
                    }
                    if(z+1<=c-1){
                        if(m[k][z+1]=='*')
                            ++m2[i][j];
                    }
                }
                if(j>=0 && j<=c-1){
                    if(j-1>=0)
                        if(m[i][j-1]=='*')
                            ++m2[i][j];
                    if(j+1<=c-1)
                        if(m[i][j+1]=='*')
                            ++m2[i][j];
                }
                k=i;z=j;
                if(k>0 && k<=f-1 && z<=c-1 && z>=0){
                    t=c;
                    while(t>0){
                        if(z>0)
                            z--;
                        else{
                            z=c-1;
                            k--;
                        }
                        t--;
                    }
                    t=0;
                    if(m[k][z]=='*')
                        ++m2[i][j];
                    if(z+1<=c-1)
                        if(m[k][z+1]=='*')
                            ++m2[i][j];
                    if(z-1>=0)
                        if(m[k][z-1]=='*')
                            ++m2[i][j];
                }
            }
        }
        System.out.println();
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                if(m[i][j] == '*')
                    System.out.print("* ");
                else
                    System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
