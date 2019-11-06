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






    //// Miror Mehtod

/////  Ceaser teacher Method




// cryptage ceaser  use this function to call it in the button cryptag
public String CeaserCryptageTeacher(String text, int  type,int shiftNumber)
{
   String  test =text;
  String [] parts=test.split(" ");
  String []textParts= new String[parts.length];
    if(shiftNumber-25>25)
    {
        shiftNumber=shiftNumber-25;
    }
    if(shiftNumber%25==0)
    {
        // darthalak hna error bal3ani bch tfham discord ngssro 3liuha

    }
// chose left or right
  switch (type)
  {
      case 0:
      {
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
          break;
      }
      case 1:
      {
          for(int i=0;i<textParts.length;i++)
          {
              textParts[i]=parts [i];
          }

          for(int i=0; i<textParts.length;i++)
          {
              textParts[i]=cryptageRight(textParts[i],shiftNumber);
          }
          for (int i=0;i<textParts.length;i++)
          {
              cryptedSendWorld+=textParts[i];
              cryptedSendWorld+=" ";
          }
          break;
      }
  }

    return  cryptedSendWorld;
}






// left cipher
private  String cryptageleft(String text , int n )
{
    char [] alphabetL={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char [] alphabetU = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char x;
    int t=0;
    String returnString="";



    for(int i=0;i<text.length();i++)
    {
        x=text.charAt(i);

        if(Character.isAlphabetic(x)) // checking if the word is an alphabet
        {
            if(Character.isLowerCase(x))  // checking if a lower case
            {

                for(int j =0;j<alphabetL.length;j++)
                {
                    if(x==alphabetL[j])
                    {
                        t=j; /// getting the position of the character
                        break;
                    }
                }
                if(t-n<0) // checking if the cipher code is a negative
                {
                    if( Math.abs(t-n)==1)
                    {
                      t=25;
                    }
                    else if(Math.abs(t-n)>1)
                    {
                        int u=n-t;
                        t=25-u;
                    }
                    returnString+=alphabetL[t];
                }
                else
                { returnString+=alphabetL[t-n]; }

            }


            if(Character.isUpperCase(x)) // for upper Case
            {

                for(int j =0;j<alphabetU.length;j++)
                {
                    if(x==alphabetU[j])
                    {
                        t=j;
                        break;
                    }
                }
                if(t-n<0)
                {
                    if( Math.abs(t-n)==1)
                    { t=26; }
                    else if(Math.abs(t-n)>1)
                    { t=26-Math.abs(t-n)-1; }
                    returnString+=alphabetU[t];
                }
                else
                { returnString+=alphabetL[t-n]; }
            }
        }
        else
        { returnString+=x; }

    }
    return  returnString;
}




    private  String cryptageRight(String text , int n )
    {
        char [] alphabetL={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] alphabetU = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char x;
        int t=0;
        String returnString="";

        for(int i=0;i<text.length();i++)
        {
            x=text.charAt(i);

            if(Character.isAlphabetic(x))
            {
                if(Character.isLowerCase(x))
                {

                    for(int j =0;j<alphabetL.length;j++)
                    {
                        if(x==alphabetL[j])
                        {
                            t=j;
                            break;
                        }
                    }
                    if(t+n>25)
                    {
                        int c =t+n;
                        if( c-25==1)
                        {
                            t=0;
                        }
                        else if(c-25>1)
                        {
                            int u=c-25;
                            t=0+u;
                        }
                        returnString+=alphabetL[t];
                    }
                    else
                    {
                        returnString+=alphabetL[t+n];
                    }

                }
                else
                if(Character.isUpperCase(x))
                {

                    for(int j =0;j<alphabetU.length;j++)
                    {
                        if(x==alphabetU[j])
                        {
                            t=j;
                            break;
                        }
                    }
                    if(t+n>25)
                    {
                        int c =t+n;
                        if( c-25==1)
                        {
                            t=0;
                        }
                        else if(c-25>1)
                        {
                            int u=c-25;
                            t=0+u;
                        }
                        returnString+=alphabetU[t];
                    }
                    else
                    {
                        returnString+=alphabetU[t+n];
                    }
                }


            }
            else
            {
                returnString+=x;
            }

        }
        return  returnString;
    }
}
