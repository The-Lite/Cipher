package sample;

public class Cryptage {

   private String sendWord;
   private String cryptedSendWorld="";
   private String  decryptedRecivedWorld;

     void setSendWord(String sendWord)
    {
        this.sendWord=sendWord;
    }
     String getSendWord()
    {
        return  this.sendWord;
    }
      String getCryptedSendWorld()
    {
    return this.cryptedSendWorld;
    }
      String getDecryptedRecivedWorld() { return  this.decryptedRecivedWorld; }





      ///Ceaser Cryptage first method 1

    public  String encrypt(String text, int round)
    {
        if(round>26)
        {
            round=round%26;
        }
        else
             if(round<0)
             {
                 round=(round%26)+26;
             }
             int length=text.length();
             for (int i=0;i<length;i++)
             {
                 char ch=text.charAt(i);//get the character from the string variable in the position i
                 //cheacking if the ch is a letter
                 if(Character.isLetter(ch))
                 {
                    //checking if the character is a lower case or Upper Case
                     if(Character.isUpperCase(ch))
                     {
                         char c=(char)(ch+round);
                         //checking if the value of c is not any symbol should be a character
                         if(c>'Z' )
                         {
                             cryptedSendWorld+=(char)(ch-(26-round));
                         }
                         else
                         {
                             cryptedSendWorld+=c;
                         }
                       }
                     else
                         if(Character.isLowerCase(ch))
                         {
                            char c=(char)(ch+round);
                            //checking if the value of c is not any symbols should be a character
                            if(c>'z' )
                            {
                                cryptedSendWorld+=(char)(ch-(26-round));
                            }
                            else
                            {
                                cryptedSendWorld+=c;
                            }
                         }
                 }
                 cryptedSendWorld+=ch;
             }
             return  cryptedSendWorld;
    }


        public String decrypt()
    {
        return "";
    }

    //// Miror Mehtod

/////  Ceaser teacher Method


public String CeaserCryptageTeacher(String text, boolean type,int shiftNumber)
{
    char x;
   String  test =text;
  String [] parts=test.split(" ");
  String []textParts= new String[parts.length];
    for(int i=0;i<textParts.length;i++)
    {
        textParts[i]=parts [i];
    }

    for(int i=0; i<textParts.length;i++)
    {
        textParts[i]=cryptageleft(textParts[i],shiftNumber);
    }
    for (int i=0;i<textParts.length;i++)
    {
        cryptedSendWorld+=textParts[i];
        cryptedSendWorld+=" ";
    }
    return  cryptedSendWorld;
}

private  String cryptageleft(String text , int n )
{
    char x;
    String test =text;
    String returnString="";
    for(int i=0;i< n;i++)
    {
        returnString="";
        x=test.charAt(0);
        for (int j=0;j<test.length()-1;j++)
        {
            returnString+=test.charAt(j+1);
        }
        returnString+=x;
        test=returnString;
    }
    return  returnString;
}

}
