package com.Syntax.Class12;

public class WordCount {
    static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
  public static void main(String[] args) {  
      String string ="  Although the molecules of water are simple in structure (H2O), the physical and chemical properties of the compound "
      		+ "are extraordinarily complicated, and they are not typical of most substances found on Earth. For example, although the sight "
      		+ "of ice cubes floating in a glass of ice water is commonplace, such behaviour is unusual for chemical entities. For almost every "
      		+ "other compound, the solid state is denser than the liquid state; thus, the solid would sink to the bottom of the liquid. The fact "
      		+ "that ice floats on water is exceedingly important in the natural world, because the ice that forms on ponds and lakes in cold "
      		+ "areas of the world acts as an insulating barrier that protects the aquatic life below. If ice were denser than liquid water, "
      		+ "ice forming on a pond would sink, thereby exposing more water to the cold temperature. Thus, the pond would eventually freeze "
      		+ "throughout, killing all the life-forms present.";  
     System.out.println(wordcount(string) + " words.");   
  }  

}
