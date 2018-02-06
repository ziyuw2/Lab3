package com.company;
public class Main {
    public static void main(String[] args) {
	 String content = Test.urlToString("http://erdani.com/tdpl/hamlet.txt");
	 int wordCount = 0;
	 int index =  content.indexOf("Prince");
	 while (index != -1){
	     wordCount++;
	     index = content.indexOf("Prince", index + 1);
     }
        System.out.println(wordCount);

    }
}
