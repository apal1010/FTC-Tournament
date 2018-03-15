import java.io.*;
import java.util.*;
/**
 * Write a description of class CryptoTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CryptoTest
{
    public static void main(String[]args){
        GlyphPit g = new GlyphPit();
        Robot bot = new Robot();
        try{
            bot = CreateTeams.createTeams().get(0).getRobot();
        }catch(IOException e){
            e.printStackTrace();
        }
        Cryptobox x = new Cryptobox(true, g); 
        System.out.println(bot.getAutoCrypto());
        System.out.println(bot.getAutoKey());
        Relic r = new Relic(true, x);
        Glyph w = new Glyph(1);
        Glyph b = new Glyph(0);
        int y = x.getAutoPoints(bot);
        x.postAutoUpdate();
        System.out.println(x.isBoxEmpty());
        int i = 0;
        String boi = ""+x.whichCipherWorkingOn();
        System.out.println(x.printCiph());
        System.out.println("Drivers pick up ur controllers");
        while(!x.isFull){
            if(i ==1){
                x.postAutoUpdate();
            }
            x.selfScoreGlyph(bot);
            System.out.println(x.printCiph());
            i++;
            
        }
        System.out.println();

        

       
        System.out.println(x.checkCipher());
        System.out.println(x.whichCiph());
        System.out.println(r.canBeScored(0));
        System.out.println(x.getTelePoints());
        System.out.println(x.partOfCipher());
        System.out.println(x.canScore(1));
        System.out.println(x.cipherWorkingOn());
        System.out.println(g.getCryptoKey());
        System.out.println(boi);
        System.out.println(bot.numAutoGlyphs());
        System.out.println(y);

    }
}
