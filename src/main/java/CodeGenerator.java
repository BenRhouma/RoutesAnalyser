

import com.sofrecom.*;
import java.io.File;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author z.benrhouma
 */
public class CodeGenerator {
   
    public static void main(String...args){
        String[] ob = {"-o","./src/main/java/com/sofrecom/analyser/lexer", "-package","com.sofrecom.analyser.lexer" ,"-Dlanguage=Java","-listener","-no-visitor", "-lib","./src/main/java","./src/main/java/Component.g4"};
        org.antlr.v4.Tool.main(ob);
    }
}
