
package pacote3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Date;
import java.util.Locale;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class X_Parser {
    
   public static String linkInicial;
   public static Document pagina_HTML_Capturada;
   public static ArrayList<String> listaLinksIntermediarios;
   public static ArrayList<String> listaLinksFinais;
   public static ArrayList<String> listaSetBody;
   
    //   public static String issueCover;
    //   public static String issueNumber;
    //   public static String title;
    //   public static String date;
    //   public static String nutshell;
    //   public static String cast;     
    //   public static String plot;
   
   
   public static int posts = 0;
   
   public static String extensao = ".html";
   public static String caminho = "H:/Temp/";
   public static String nome = "X-Aminations - All (ver. 2)";

   
   //------------------------------------------------------------------------------
   //-------------------------CAPTURADOR DA PAGINA---------------------------------
   //------------------------------------------------------------------------------
   public static Document capturaPagina_HTML(String link) throws IOException
    {
        pagina_HTML_Capturada = Jsoup.connect(link).get();
        
     return pagina_HTML_Capturada;
    }
   
   
   //------------------------------------------------------------------------------
   //--------------------------------MAIN------------------------------------------
   //------------------------------------------------------------------------------
   public static void main(String[] args) throws IOException, InterruptedException
   {
        //------------------------------------------------------------------------------
        //----------------------USO DE LINKS INTERMEDIÁRIOS [ INÍCIO ]------------------
        //------------------------------------------------------------------------------
//       
//       linkInicial = "https://www.therealgentlemenofleisure.com/";
//       
//     
//       /*if (!linkInicial.endsWith("/"))                                  	//Verificador de contra barra (negação)
//        {
//        linkInicial = linkInicial + "/";
//        }*/
//        
//        
//        System.out.println("Link inicial: " + linkInicial);
//        capturaPagina_HTML(linkInicial);
//        System.out.println("Página HTML capturada");
//        
//        
//        capturaLinksIntermediarios(pagina_HTML_Capturada);                 	//roda 1 vez apenas
//        
//        
        int cont=1;                                                       	//Percorre LISTA DE LINKS INTERMEDIÁRIOS
        listaLinksFinais = new ArrayList<>();
//        
//        Collections.sort(listaLinksIntermediarios);
//        
//		
		//for (String i : listaLinksIntermediarios)			//Para escolher de qual LINK INTERMEDIÁRIO COMEÇAR
		//for (int i = 41; i <= 156; i++)				//Neste exemplo começa-se da posição 41 até a 156 da LISTA INTERMEDIÁRIA...
//        for (int i = 41; i <= 43; i++)						//...e aqui, da posição 41 até a 43				
//        {
//            System.out.println("");
//            System.out.println("Link intermediário " + cont + "/" + listaLinksIntermediarios.size() + ": " + i);
//            String link = listaLinksIntermediarios.get(i);
//			//String link = i;
//            capturaPagina_HTML(link);
//            capturaLinksFinais(pagina_HTML_Capturada, link);
//
//            cont++;
//        }
        
        //------------------------------------------------------------------------------
        //----------------------USO DE LINKS INTERMEDIÁRIOS [ FIM ]---------------------
        //------------------------------------------------------------------------------


        //------------------------------------------------------------------------------
        //---------------------USO DE LINKS FINAIS [ INÍCIO ]---------------------------
        //------------------------------------------------------------------------------
        
        
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/01/x-amining-giant-size-x-men-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/01/x-amining-x-men-hiatus-years-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/02/x-amining-x-men-94.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/02/x-amining-x-men-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/02/x-amining-x-men-96.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/02/x-amining-x-men-97.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/03/x-amining-x-men-98.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/03/x-amining-x-men-99.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/03/x-amining-x-men-100.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/03/x-amining-x-men-101.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/03/x-amining-x-men-102.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/04/x-amining-x-men-103.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/04/x-amining-x-men-104.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/04/x-amining-x-men-105.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/04/x-amining-x-men-106.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/05/x-amining-x-men-107.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/05/x-amining-x-men-108.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/05/x-amining-x-men-109.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/05/x-amining-x-men-110.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/06/x-amining-x-men-111.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/06/x-amining-x-men-112.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/06/x-amining-x-men-113.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/06/x-amining-x-men-114_22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/06/x-amining-x-men-115.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/07/x-amining-x-men-116.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/07/x-amining-x-men-117.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/07/x-amining-x-men-118.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/07/x-amining-x-men-119.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/08/x-amining-x-men-120.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/08/x-amining-x-men-121.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/08/x-amining-x-men-122.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/08/x-amining-x-men-123.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/08/x-amining-x-men-124.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/09/x-amining-x-men-125.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/09/x-amining-x-men-126.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/09/x-amining-x-men-127.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/09/x-amining-x-men-annual-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/10/x-amining-x-men-128.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/10/x-amining-x-men-129.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/10/x-amining-x-men-130.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/10/x-amining-x-men-131.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/11/x-amining-x-men-132.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/11/x-amining-x-men-133.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/11/x-amining-x-men-133_10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/11/x-amining-x-men-134.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/11/x-amining-x-men-135.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/11/x-amining-x-men-136.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/12/x-amining-phoenix-untold-story-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/12/x-amining-x-men-137.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/12/x-amining-x-men-138.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2011/12/x-amining-x-men-annual-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/01/x-amining-x-men-139.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/01/x-amining-x-men-140.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/01/x-amining-x-men-141.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/01/x-amining-uncanny-x-men-142.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/02/x-amining-spider-woman-37-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/02/x-amining-uncanny-x-men-143.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/02/x-amining-uncanny-x-men-144.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/02/x-amining-uncanny-x-men-145.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/02/x-amining-uncanny-x-men-146.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/03/x-amining-avengers-annual-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/03/x-amining-uncanny-x-men-147.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/03/x-amining-uncanny-x-men-148.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/03/x-amining-uncanny-x-men-149.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/04/x-amining-marvel-fanfare-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/04/x-amining-uncanny-x-men-150.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/04/x-amining-uncanny-x-men-151.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/04/x-amining-x-men-annual-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/05/x-amining-uncanny-x-men-152.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/05/x-amining-uncanny-x-men-153.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/05/x-amining-uncanny-x-men-154.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/05/x-amining-uncanny-x-men-155.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/05/x-amining-uncanny-x-men-156.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/06/x-amining-uncanny-x-men-157.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/06/x-amining-x-men-158.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/06/x-amining-x-men-159.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/06/x-amining-x-men-160.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/07/x-amining-marvel-graphic-novel-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/07/x-amining-new-mutants-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/07/x-amining-uncanny-x-men-161.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/07/x-amining-uncanny-x-men-162.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/07/x-amining-uncanny-x-men-163.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/07/x-amining-uncanny-x-men-164.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-marvel-graphic-novel-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-new-mutants-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-new-mutants-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-special-edition-x-men-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-uncanny-x-men-165.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-uncanny-x-men-166.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-uncanny-x-men-167.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-uncanny-x-men-168.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-uncanny-x-men-and-new-teen.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/08/x-amining-x-men-annual-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-new-mutants-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-new-mutants-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-new-mutants-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-uncanny-x-men-169.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-uncanny-x-men-170.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-uncanny-x-men-171.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/09/x-amining-wolverine-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-marvel-team-up-annual-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-new-mutants-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-new-mutants-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-new-mutants-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-uncanny-x-men-172.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-uncanny-x-men-173.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-uncanny-x-men-174.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-uncanny-x-men-175.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/10/x-amining-uncanny-x-men-at-state-fair.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-new-mutants-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-new-mutants-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-new-mutants-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-new-mutants-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-uncanny-x-men-176.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-uncanny-x-men-177.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-uncanny-x-men-178.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/11/x-amining-uncanny-x-men-annual-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-magik-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-new-mutants-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-new-mutants-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-secret-wars-1-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-uncanny-x-men-179.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-uncanny-x-men-180.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2012/12/x-amining-x-men-and-micronauts-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-new-mutants-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-new-mutants-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-new-mutants-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-new-mutants-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-uncanny-x-men-181.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-uncanny-x-men-182.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-uncanny-x-men-183.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/01/x-amining-uncanny-x-men-184.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-kitty-pryde-and-wolverine-1-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-new-mutants-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-new-mutants-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-new-mutants-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-new-mutants-annual-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-uncanny-x-men-185.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-uncanny-x-men-186.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/02/x-amining-uncanny-x-men-187.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-iceman-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-marvel-team-up-150.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-new-mutants-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-new-mutants-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-new-mutants-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-uncanny-x-men-188.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-uncanny-x-men-189.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/03/x-amining-uncanny-x-men-190.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-alpha-flight-17-dazzler-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-beauty-and-beast-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-new-mutants-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-new-mutants-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-uncanny-x-men-191.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-uncanny-x-men-192.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-x-men-and-alpha-flight-1-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-x-men-annual-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/04/x-amining-x-men-she-ra-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-new-mutants-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-new-mutants-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-new-mutants-30.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-new-mutants-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-nightcrawler-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-power-pack-12-secret-wars-ii-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-uncanny-x-men-193.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-uncanny-x-men-194.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-uncanny-x-men-195.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/05/x-amining-uncanny-x-men-196.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-longshot-1-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-new-mutants-32.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-new-mutants-33.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-new-mutants-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-secret-wars-ii-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-uncanny-x-men-197.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-uncanny-x-men-198.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/06/x-amining-uncanny-x-men-199.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-alpha-flight-33-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-new-mutants-35.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-new-mutants-36.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-new-mutants-special-edition-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-power-pack-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-uncanny-x-men-200.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-uncanny-x-men-201.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-x-men-annual-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/07/x-amining-x-men-heroes-for-hope.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-avengers-263-fantastic-four.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-new-mutants-37.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-new-mutants-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-new-mutants-39.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-new-mutants-40.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-uncanny-x-men-202.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-uncanny-x-men-203.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-uncanny-x-men-204.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-uncanny-x-men-205.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-x-factor-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-x-factor-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-x-factor-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/08/x-amining-x-factor-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-firestar-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-new-mutants-41.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-new-mutants-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-new-mutants-43.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-uncanny-x-men-206.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-uncanny-x-men-207.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-uncanny-x-men-208.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-x-factor-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-x-factor-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-x-factor-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/09/x-amining-x-factor-annual-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-amazing-spider-man-282-web-of.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-new-mutants-44.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-new-mutants-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-new-mutants-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-new-mutants-47.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-new-mutants-annual-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-uncanny-x-men-209.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-uncanny-x-men-210.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-uncanny-x-men-211.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-uncanny-x-men-212.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-x-factor-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-x-factor-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-x-factor-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/10/x-amining-x-men-annual-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-mephisto-vs-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-new-mutants-48.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-new-mutants-49.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-new-mutants-50.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-power-pack-27-daredevil-238.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-thor-373-374.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-uncanny-x-men-213.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-uncanny-x-men-214_20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-uncanny-x-men-215.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-x-factor-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-x-factor-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-x-factor-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/11/x-amining-x-factor-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-new-mutants-51.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-new-mutants-52.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-new-mutants-53.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-new-mutants-annual-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-uncanny-x-men-216.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-uncanny-x-men-217.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-uncanny-x-men-218.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-x-factor-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-x-factor-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2013/12/x-amining-x-factor-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-fallen-angels-1-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-fantastic-four-vs-x-men-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-new-mutants-54.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-new-mutants-55.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-uncanny-x-men-219.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-uncanny-x-men-220.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-x-factor-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-x-factor-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-x-factor-annual-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-x-men-annual-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/01/x-amining-x-men-vs-avengers-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-incredible-hulk-340.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-new-mutants-56.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-new-mutants-57.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-new-mutants-58.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-uncanny-x-men-221.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-uncanny-x-men-222.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-uncanny-x-men-223.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-uncanny-x-men-224.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-x-factor-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-x-factor-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-x-factor-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/02/x-amining-x-factor-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-captain-america-339-daredevil.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-excalibur-special-edition-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-new-mutants-59.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-new-mutants-60.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-new-mutants-61.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-power-pack-35-fantastic-four.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-uncanny-x-men-225.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-uncanny-x-men-226.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-uncanny-x-men-227.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-x-factor-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-x-factor-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/03/x-amining-x-factor-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-new-mutants-62.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-new-mutants-63.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-new-mutants-64.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-new-mutants-65.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-uncanny-x-men-228.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-uncanny-x-men-229.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-uncanny-x-men-230.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-uncanny-x-men-231.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-x-factor-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-x-factor-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-x-factor-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-x-factor-30.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/04/x-amining-x-factor-annual-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-marvel-comics-presents-1-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-new-mutants-66.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-new-mutants-67.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-new-mutants-68.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-new-mutants-annual-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-uncanny-x-men-232.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-uncanny-x-men-233.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-uncanny-x-men-234.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-uncanny-x-men-235.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-x-factor-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-x-factor-32.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-x-factor-33.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/05/x-amining-x-men-annual-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-excalibur-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-excalibur-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-excalibur-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-marvel-comics-presents-10-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-new-mutants-69.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-uncanny-x-men-236.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-uncanny-x-men-237.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-uncanny-x-men-238.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-wolverine-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-wolverine-2_27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/06/x-amining-x-factor-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-excalibur-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-excalibur-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-inferno-tie-ins-part-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-inferno-tie-ins-part-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-new-mutants-70.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-new-mutants-71.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-new-mutants-72.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-uncanny-x-men-239.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-uncanny-x-men-240.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-uncanny-x-men-241.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-wolverine-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-x-factor-35.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-x-factor-36.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-x-factor-37.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/07/x-amining-x-terminators-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-excalibur-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-excalibur-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-inferno-tie-ins-part-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-inferno-tie-ins-part-four.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-new-mutants-73.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-new-mutants-74.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-uncanny-x-men-242.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-uncanny-x-men-243.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-wolverine-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-wolverine-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-wolverine-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-x-factor-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-x-factor-38_8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/08/x-amining-x-factor-39.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-excalibur-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-excalibur-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-marvel-comics-presents-17-24_10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-new-mutants-75.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-new-mutants-76.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-uncanny-x-men-244.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-uncanny-x-men-245.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-wolverine-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-wolverine-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-x-factor-40.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-x-factor-41.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/09/x-amining-x-men-annual-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-excalibur-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-havok-wolverine-meltdown-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-marvel-comics-presents-24-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-new-mutants-77.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-new-mutants-78.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-new-mutants-annual-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-punisher-war-journal-6-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-uncanny-x-men-246.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-uncanny-x-men-247.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-wolverine-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-x-factor-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-x-factor-43.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/10/x-amining-x-factor-annual-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-daredevil-269.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-excalibur-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-excalibur-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-new-mutants-79.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-new-mutants-80.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-uncanny-x-men-248.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-uncanny-x-men-249.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-wolverine-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-wolverine-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-wolverine-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-x-factor-44.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/11/x-amining-x-factor-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-excalibur-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-excalibur-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-marvel-comics-presents-31-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-new-mutants-81.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-uncanny-x-men-250.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-uncanny-x-men-251.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-uncanny-x-men-252.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-wolverine-13-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-wolverine-15-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2014/12/x-amining-x-factor-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-classic-x-men-41-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-excalibur-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-new-mutants-82.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-uncanny-x-men-253.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-uncanny-x-men-254.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-wolverine-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/01/x-amining-x-factor-47.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-acts-of-vengeance-part-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-excalibur-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-excalibur-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-new-mutants-83.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-new-mutants-84.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-uncanny-x-men-255.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-uncanny-x-men-256.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-wolverine-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-wolverine-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-x-factor-48.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/02/x-amining-x-factor-49.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-acts-of-vengeance-part-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-acts-of-vengeance-part-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-excalibur-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-excalibur-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-new-mutants-85.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-new-mutants-86.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-uncanny-x-men-257.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-uncanny-x-men-258.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-wolverine-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-wolverine-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-x-factor-50.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/03/x-amining-x-factor-51.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-avengers-west-coast-56-57-60.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-excalibur-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-excalibur-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-marvel-comics-presents-48-50.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-new-mutants-87.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-new-mutants-88.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-new-mutants-89.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-uncanny-x-men-259.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-uncanny-x-men-260.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-uncanny-x-men-261.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-wolverine-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-wolverine-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-x-factor-52.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/04/x-amining-x-factor-53.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-excalibur-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-excalibur-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-incredible-hulk-369.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-marvel-comics-presents-51-53.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-new-mutants-90.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-uncanny-x-men-262.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-wolverine-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-wolverine-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-x-factor-54.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-x-factor-55.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/05/x-amining-x-men-spotlight-on.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-excalibur-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-fantastic-four-annual-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-new-mutants-91.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-new-mutants-annual-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-new-mutants-summer-special-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-wolverine-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-wolverine-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-x-factor-56.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-x-factor-annual-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-x-men-263.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-x-men-264.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/06/x-amining-x-men-annual-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-alpha-flight-87-90.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-excalibur-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-excalibur-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-marvel-comics-presents-54-61.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-new-mutants-92.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-new-mutants-93.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-uncanny-x-men-265.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-uncanny-x-men-266.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-uncanny-x-men-267.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-wolverine-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-wolverine-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-x-factor-57.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/07/x-amining-x-factor-58.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-excalibur-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-excalibur-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-new-mutants-94.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-uncanny-x-men-268.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-uncanny-x-men-269.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-wolverine-30.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-wolverine-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-x-factor-59.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/08/x-amining-x-factor-prisoner-of-love.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/09/x-amining-excalibur-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/09/x-amining-excalibur-30.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/09/x-amining-new-mutants-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/09/x-amining-uncanny-x-men-270.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/09/x-amining-wolverine-32.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/09/x-amining-x-factor-60.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-excalibur-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-excalibur-32.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-excalibur-33.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-new-mutants-96.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-new-mutants-97.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-thor-427-429.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-uncanny-x-men-271.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-uncanny-x-men-272.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-wolverine-33.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-wolverine-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-wolverine-35.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-wolverine-bloodlust.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-x-factor-61.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/10/x-amining-x-factor-62.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-excalibur-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-fantastic-four-347-349.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-new-mutants-98.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-new-mutants-99.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-uncanny-x-men-273.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-uncanny-x-men-274.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-wolverine-36.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-x-factor-63.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-x-factor-64.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/11/x-amining-x-men-animation-special.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-excalibur-35.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-excalibur-36.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-excalibur-weird-war-iii.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-ghost-rider-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-marvel-comics-presents-72-84.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-new-mutants-100.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-uncanny-x-men-275.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-wolverine-37.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-wolverine-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2015/12/x-amining-x-factor-65.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-excalibur-37.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-new-mutants-annual-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-new-mutants.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-new-warriors-9-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-new-warriors-annual-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-uncanny-x-men-276.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-uncanny-x-men-277.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-wolverine-39.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-x-factor-66.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-x-factor-67.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-x-factor-annual-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/01/x-amining-x-men-annual-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-excalibur-39.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-excalibur-39_11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-excalibur-possession.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-sensational-she-hulk-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-uncanny-x-men-278.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-uncanny-x-men-279.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-wolverine-40.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-wolverine-41.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-wolverine-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-x-factor-68.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-x-factor-69.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/02/x-amining-x-force-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-excalibur-40.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-excalibur-41.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-marvel-comics-presents-85-92.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-uncanny-x-men-280.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-wolverine-43.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-wolverine-44.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-wolverine-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-wolverine-bloody-choices.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-x-factor-1-70.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-x-factor-70.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/03/x-amining-x-force-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-excalibur-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-spider-man-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-spider-man-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-uncanny-x-men-281.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-uncanny-x-men-282.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-wolverine-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-wolverine-47.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-wolverine-rahne-of-terra.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-x-factor-71.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-x-factor-72.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-x-force-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-x-force-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/04/x-amining-x-men-vol-2-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-excalibur-43.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-excalibur-44.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-marvel-comics-presents-85-92.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-uncanny-x-men-283.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-wolverine-48.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-x-factor-73.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-x-force-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/05/x-amining-x-men-vol-2-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-excalibur-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-excalibur-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-excalibur-47.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-uncanny-x-men-284.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-uncanny-x-men-285.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-wolverine-49.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-wolverine-50.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-factor-74.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-factor-75.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-force-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-force-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-men-vol-2-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-men-vol-2-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/06/x-amining-x-men-vol-2-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-excalibur-48.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-excalibur-air-apparent.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-ghost-riderwolverinepunisher.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-incredible-hulk-390-391_5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-uncanny-x-men-286.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-wolverine-51.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-wolverine-52.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-x-factor-76.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-x-force-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-x-men-action-figures-x-men.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/07/x-amining-x-men-vol-2-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-excalibur-49.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-incredible-hulk-392.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-marvel-comics-presents-90-97.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-uncanny-x-men-287.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-uncanny-x-men-288.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-wolverine-53.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-x-factor-77.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-x-factor-78.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-x-force-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-x-force-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/08/x-amining-x-men-vol-2-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-excalibur-50.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-uncanny-x-men-289.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-uncanny-x-men-annual-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-wolverine-54.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-x-factor-79.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-x-factor-annual-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-x-force-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-x-force-annual-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-x-men-vol-2-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/09/x-amining-x-men-vol-2-annual-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-excalibur-51.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-excalibur-xx-crossing.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-ghost-rider-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-ghost-rider-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-uncanny-x-men-290.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-wolverine-55.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-wolverine-56.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-x-factor-80.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-x-force-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/10/x-amining-x-men-vol-2-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-avengers-350-351.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-excalibur-52.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-excalibur-53.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-uncanny-x-men-291.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-wolverine-57.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-wolverine-58.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-x-factor-81.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-x-force-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-x-men-vol-2-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/11/x-amining-x-men-vol-2-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-excalibur-54.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-ghost-rider-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-spider-man-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-uncanny-x-men-292.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-wolverine-59.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-wolverine-60.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-wolverine-61.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-x-factor-82.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-x-force-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2016/12/x-amining-x-men-vol-2-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-captain-america-402-408.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-excalibur-55.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-tales-of-suspense-49.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-uncanny-x-men-293.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-wolverine-62.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-x-factor-83.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-x-force-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/01/x-amining-x-men-vol-2-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/02/x-amining-bizarre-adventures-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/02/x-amining-giant-size-fantastic-four-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/02/x-amining-incredible-hulk-180-182.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-cable-1-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-excalibur-56.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-excalibur-57.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-excalibur-58.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-uncanny-x-men-294.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-uncanny-x-men-295.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-wolverine-63.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-wolverine-64.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-x-factor-84.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-x-factor-85.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-x-force-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-x-force-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-x-men-vol-2-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/03/x-amining-x-men-vol-2-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-excalibur-59.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-excalibur-60.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-excalibur-61.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-new-warriors-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-stryfes-strike-file-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-uncanny-x-men-296.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-wolverine-65.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-x-factor-86.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-x-force-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/04/x-amining-x-men-vol-2-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-excalibur-62.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-uncanny-x-men-297.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-uncanny-x-men-298.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-wolverine-66.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-x-factor-87.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-x-force-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-x-men-action-figures-x-men.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/05/x-amining-x-men-vol-2-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-excalibur-63.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-excalibur-64.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-uncanny-x-men-299.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-uncanny-x-men-300.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-wolverine-67.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-wolverine-68.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-wolverine-69.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-factor-88.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-factor-89.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-factor-90.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-force-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-force-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-men-vol-2-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/06/x-amining-x-men-vol-2-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-cable-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-excalibur-65.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-uncanny-x-men-301.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-uncanny-x-men-annual-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-wolverine-70.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-x-factor-91.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-x-force-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/07/x-amining-x-men-vol-2-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-cable-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-excalibur-66.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-excalibur-67.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-uncanny-x-men-302.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-wolverine-71.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-factor-92.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-factor-annual-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-force-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-force-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-men-unlimited-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-men-vol-2-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/08/x-amining-x-men-vol-2-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-cable-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-excalibur-68.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-marvel-comics-presents-132.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-uncanny-x-men-303.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-wolverine-72.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-wolverine-inner-fury.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-x-factor-93.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-x-force-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/09/x-amining-x-men-vol-2-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-cable-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-deadpool-circle-chase-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-excalibur-69.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-excalibur-annual-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-uncanny-x-men-304.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-wolverine-73.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-x-factor-94.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-x-force-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-x-men-unlimited-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/10/x-amining-x-men-vol-2-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-excalibur-70.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-uncanny-x-men-305.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-uncanny-x-men-306.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-wolverine-74.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-x-factor-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-x-factor-96.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-x-force-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-x-force-annual-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-x-men-vol-2-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/11/x-amining-x-men-vol-2-annual-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/12/x-amining-avengers-368.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/12/x-amining-marvel-comics-presents-137.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/12/x-amining-sabretooth-death-hunt-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2017/12/x-amining-wolverine-75.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-avengers-369.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-avengers-west-coast-101.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-cable-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-excalibur-71.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-uncanny-x-men-307.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-wolverine-76.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-wolverine-global-jeopardy.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-wolverine-killing.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-x-factor-97.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-x-force-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-x-men-unlimited-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-x-men-vol-2-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-cable-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-excalibur-72.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-excalibur-73.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-gambit-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-uncanny-x-men-308.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-wolverine-77.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-x-factor-98.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-x-force-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-x-force-30.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-x-men-vol-2-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/02/x-amining-x-men-vol-2-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-cable-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-cable-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-excalibur-74.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-uncanny-x-men-309.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-wolverine-78.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-x-factor-99.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-x-force-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-x-men-action-figures-x-men.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/03/x-amining-x-men-vol-2-29.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/04/x-amining-uncanny-x-men-310.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/04/x-amining-wolverine-79.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/04/x-amining-x-factor-100.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/04/x-amining-x-force-32.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/04/x-amining-x-men-vol-2-30.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/04/x-amining-x-men-wedding-album-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-cable-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-excalibur-75.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-new-warriors-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-uncanny-x-men-311.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-wolverine-80.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-x-factor-101.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/05/x-amining-x-men-unlimited-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-cable-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-excalibur-76.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-new-warriors-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-uncanny-x-men-312.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-what-if-60.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-wolverine-81.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-x-factor-102.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-x-force-33.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/06/x-amining-x-men-vol-2-31.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-cable-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-excalibur-77.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-uncanny-x-men-313.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-wolverine-82.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-x-factor-103.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-x-factor-annual-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-x-force-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/07/x-amining-x-men-vol-2-32.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-adventures-of-cyclops-phoenix.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-avengers-53.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-cable-12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-excalibur-78.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-fantastic-four-28.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-incredible-hulk-annual-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-marvel-team-up-100.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-spider-manx-factor.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-uncanny-x-men-annual-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-wolverinenick-fury-scorpio.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-x-force-35.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-x-men-unlimited-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/08/x-amining-x-men-vol-2-33.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-cable-13.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-excalibur-79.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-uncanny-x-men-314.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-uncanny-x-men-315.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-wolverine-83.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-wolverine-84.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-x-factor-104.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-x-factor-105.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-x-force-36.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/09/x-amining-x-men-vol-2-34.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-cable-14.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-excalibur-80.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-excalibur-81.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-uncanny-x-men-316.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-wolverine-85.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-x-factor-106.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-x-force-37.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-x-force-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-x-men-unlimited-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-x-men-vol-2-35.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/10/x-amining-x-men-vol-2-36.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-cable-15.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-cable-16.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-excalibur-82.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-excalibur-annual-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-generation-x-ashcan-opening.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-uncanny-x-men-317.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-wolverine-86.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-x-factor-107.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-x-force-39.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-x-force-annual-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-x-men-vol-2-37.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/11/x-amining-x-men-vol-2-annual-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-excalibur-83.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-generation-x-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-uncanny-x-men-318.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-wolverine-87.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-x-factor-108.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-x-force-40.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/12/x-amining-x-men-vol-2-38.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-x-men-unlimited-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-bishop-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-cable-17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-deadpool-sins-of-past-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-uncanny-x-men-319.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-wolverine-88.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-wolverine-evilution.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-factor-109.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-force-41.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-men-2099-1-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-men-2099-2-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-men-2099-3-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-men-2099-4-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/01/x-amining-x-men-vol-2-39.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-cable-18.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-excalibur-84.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-excalibur-85.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-generation-x-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-uncanny-x-men-320.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-wolverine-89.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-wolverine-scorpio-rising.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-factor-110.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-force-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-men-2099-5-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-men-2099-6-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-men-2099-7-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-men-2099-8-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-men-unlimited-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/02/x-amining-x-men-vol-2-40.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-cable-19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-generation-x-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-rogue-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-x-men-2099-10-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-x-men-2099-11-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-x-men-2099-12-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-x-men-2099-9-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/03/x-amining-x-men-action-figures-phoenix.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-avengers-47-49-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-cable-20.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-excalibur-86.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-generation-x-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-ghost-riderpunisherwolverine.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-uncanny-x-men-321.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-wolverine-90.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-x-factor-111.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-x-force-43.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-x-men-2099-13-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-x-men-2099-14-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-x-men-2099-16-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/04/x-amining-x-men-vol-2-41.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-age-of-apocalypse-ashcan-year.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-astonishing-x-men-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-factor-x-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-weapon-x-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-x-men-2099-18-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-x-men-2099-19-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-x-men-2099-20-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-x-men-2099-21-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-x-men-alpha-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/05/x-amining-x-men-chronicles-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-amazing-x-men-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-amazing-x-men-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-astonishing-x-men-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-factor-x-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-gambit-and-x-ternals-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-gambit-x-ternals-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-generation-next-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-weapon-x-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-what-if-27-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-x-calibre-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-x-calibre-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-x-man-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-x-men-2099-22-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-x-men-2099-24-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/06/x-amining-x-men-2099-25-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-2099-ad-genesis-1-patreon.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-age-of-apocalypse-chosen-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-amazing-x-men-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-astonishing-x-men-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-factor-x-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-gambit-x-ternals-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-generation-next-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-weapon-x-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-calibre-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-man-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-men-2099-26-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-men-2099-27-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-men-2099-28-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-men-2099-special-1-patreon.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/07/x-amining-x-universe-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-amazing-x-men-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-astonishing-x-men-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-factor-x-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-gambit-x-ternals-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-generation-next-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-weapon-x-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-calibre-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-man-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-men-2099-29-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-men-2099-30-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-men-2099-31-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-men-chronicles-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/08/x-amining-x-nation-2099-1-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-generation-next-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-man-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-men-2099-33-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-men-2099-33-patreon-first_24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-men-omega-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-men-prime-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-nation-2-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-nation-3-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/09/x-amining-x-universe-2.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-cable-21.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-excalibur-87.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-generation-x-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-uncanny-x-men-322.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-uncanny-x-men-323.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-wolverine-91.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-factor-112.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-factor-113.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-force-44.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-man-5.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-man-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-men-2099-34-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-men-2099-35-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-men-vol-2-42.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-men-vol-2-43.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-nation-4-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-nation-5-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/10/x-amining-x-nation-6-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-2099-world-of-tomorrow-1_12.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-2099-world-of-tomorrow-2_19.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-2099-world-of-tomorrow-3_26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-cable-22.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-excalibur-88.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-generation-x-6.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-knight-of-terra.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-what-if-77.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-wolverine-gambit-victims-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/11/x-amining-x-men-2099-oasis-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-2099-world-of-tomorrow-4_3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-2099-world-of-tomorrow-6_17.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-2099-world-of-tomorrow-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-2099-world-of-tomorrow-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-uncanny-x-men-324.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-wolverine-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-x-factor-114.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-x-man-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2019/12/x-amining-x-men-action-figures-mutant.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2018/01/x-amining-x-men-unlimited-3.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/patreon-x-amination-x-amining-spider.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-2099-manifest-destiny-patreon.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-cable-23.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-excalibur-89.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-generation-x-7.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-strange-tales-120.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-uncanny-x-men-325.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-wolverine-92.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-x-factor-115.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-x-force-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-x-man-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/01/x-amining-x-men-vol-2-44.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-cable-24.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-champions-1-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-champions-2-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-champions-3-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-champions-4-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-excalibur-90.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-generation-x-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-wolverine-93.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-wolverine-94.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-x-force-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-x-force-47.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-x-men-unlimited-8.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/02/x-amining-x-men-vol-2-45.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-champions-5-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-champions-6-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-champions-7-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-champions-8-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-champions-9-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-generation-x-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-uncanny-x-men-326.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-wolverine-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-x-factor-116.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-x-force-48.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-x-man-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-x-men-vol-2-46.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/03/x-amining-x-men-vol-2-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-cable-25.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-champions-10-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-champions-11-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-champions-12-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-champions-13-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-excalibur-91.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-generation-x-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-uncanny-x-men-327.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-uncanny-x-men-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-x-factor-117.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-x-force-49.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-x-man-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/04/x-amining-x-men-vol-2-47.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-avengers-163-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-cable-26.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-champions-14-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-champions-15-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-excalibur-92.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-generation-x-10.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-iron-man-annual-4-patreon.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-starjammers-1-4.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-wolverine-96.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-x-force-cable-95.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/05/x-amining-x-men-unlimited-9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-cable-27.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-champions-16-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-champions-17-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-excalibur-93.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-generation-x-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-godzilla-3-patreon-first.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-sabretooth-special-1.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-super-villain-team-up-15_9.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-uncanny-x-men-328.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-wolverine-97.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-x-factor-118.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-x-force-50.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-x-man-11.html");
        listaLinksFinais.add("https://www.therealgentlemenofleisure.com/2020/06/x-amining-x-men-vol-2-48.html");
        
        System.out.println("");
        System.out.println("LINKS FINAIS adicionados: " + listaLinksFinais.size());
        System.out.println("");
        //System.out.println("Pressione qualquer tecla...");
        //Scanner in = new Scanner (System.in); in.nextLine();
    
        listaSetBody = new ArrayList<>();   //Criação prévia de LISTA 
        
        cont=1;																//Percorre LISTA DE LINKS FINAIS
        for (String ii : listaLinksFinais)
        {
            System.out.println("");
            System.out.println("Link Final " + cont + "/" + listaLinksFinais.size() + ": " + ii);
            capturaPagina_HTML(ii);
            capturaDados(pagina_HTML_Capturada, ii);

            cont++;
        }
        
        //------------------------------------------------------------------------------
        //---------------------USO DE LINKS FINAIS [ FINAL ]---------------------------
        //------------------------------------------------------------------------------
        
		
        geraHTML(listaSetBody);
        
     }
   
   
   //------------------------------------------------------------------------------
   //-------------------------CAPTURADOR DE LINKS INTERMEDIÁRIOS-------------------
   //------------------------------------------------------------------------------
   public static ArrayList<String> capturaLinksIntermediarios(Document paginaHTML) throws IOException
    {
        
        Elements linkElements = paginaHTML.select(".post-count-link");          //1.Captura LINK-ELEMENTOS da PAGINA HTML capturada
        listaLinksIntermediarios = new ArrayList<>();                  		       
				
				
        for (Element i : linkElements)                                          //2.Transforma os LINK-ELEMENTOS em LINKS PUROS
        {		
            if (i.toString().matches(".*/[0-9][0-9]/.*"))		
            {		
                listaLinksIntermediarios.add(i.attr("href"));          		//3.Coloca dentro de uma LISTA
                //System.out.println(i.attr("href"));
            }
        }
        
     return listaLinksIntermediarios;
    }
   
   
   //------------------------------------------------------------------------------
   //-------------------------CAPTURADOR DE LINKS FINAIS---------------------------
   //------------------------------------------------------------------------------
   public static ArrayList<String> capturaLinksFinais(Document paginaHTML, String link) throws IOException, InterruptedException
    {
		
        int pag = 1;                                                            //1.Captura LINK-ELEMENTOS da PAGINA HTML capturada
        int cont = 1;
        Elements linkElements = paginaHTML.select(".post-title.entry-title").select("a");
        
        //listaLinksFinais = new ArrayList<>();
        
        for (Element i : linkElements) 						//2.Transforma os LINK-ELEMENTOS em LINKS PUROS
        {
            if (i.toString().contains("x-amining"))
            {
                System.out.println(cont + ": " + i.attr("href"));
                listaLinksFinais.add(i.attr("href"));                           //3.Coloca dentro de uma LISTA
		//Collections.sort(listaLinksFinais);

                posts++;
                cont++;
            }
        }
        
        System.out.println(""); System.out.println("Posts = " + posts);
        //        System.out.println("Aperte qualquer tecla...");
        //        Scanner in = new Scanner (System.in); in.nextLine();

        //        System.out.println();
        //        Elements classNext = pagina.getElementsByClass("previous");
        //        
        //        while (classNext.hasText() == true )
        //        {
        ////Gerando Links-Elementos da página (próxima página)
        //            pag++;
        //            cont = 1;
        //            String linkNextPage = link + "page/" + pag;
        //            
        //            System.out.println(linkNextPage);
        //            
        //            paginaHTML = Jsoup.connect(linkNextPage).get();
        //            linkElements = paginaHTML.select(".entry-title > a");
        //            
        ////Transformando cada Links-Elemento em link puro (próxima página)
        //            for (Element i : linkElements) 
        //            {
        //                System.out.println(cont + ": " + i.attr("href"));
        //                listaLinksFinais.add(i.attr("href"));
        //                
        //                posts++;
        //                cont++;
        //            }
        //            
        //            System.out.println("");System.out.println("Posts = " + posts);
        ////            System.out.println("Aperte qualquer tecla...");
        ////            in = new Scanner (System.in); in.nextLine();
        //            
        //            System.out.println();
        //            classNext = paginaHTML.getElementsByClass("previous");
        //        }
     Collections.sort(listaLinksFinais);
     return listaLinksFinais;
    }
   
   
   //------------------------------------------------------------------------------
   //-------------------------CAPTURADOR DE DADOS----------------------------------
   //------------------------------------------------------------------------------
   public static ArrayList<String> capturaDados(Document paginaHTML, String link)
    {
        //------------------------------------------------------------------------------
        //-------------------CAPTURADOR DE DATA P/ COMPARAÇÃO---------------------------
        //------------------------------------------------------------------------------
        String dateClass = paginaHTML.select(".date-header").text();            
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ENGLISH);
            LocalDate pageFullDate = LocalDate.parse(dateClass, formatter);
            LocalDate pageDateCompare = LocalDate.parse("2010-01-21");          
        
        String issueCover;
        String issueNumber;
        String title = null;
        String date = null;
        String nutshell = null;
        String cast = null;    
        String plot = null;
        String setBody;
        
        if (pageFullDate.isAfter(pageDateCompare) == true)                                             //Se data DEPOIS de 21/01/2010...
        {
            
            //Elements pageDate = paginaHTML.select("date-header");                                     //Captura DATA (não utilizado)
            issueNumber = paginaHTML.select(".post-title.entry-title").text().replace("X-amining ",""); //Captura NÚMERO DA EDIÇÂO
            issueCover = paginaHTML.select(".post-body.entry-content").select("img").attr("abs:src").replaceAll("\\/s\\d{3,}\\/","/s117/");   //Captura ENDEREÇO DA CAPA
            Elements elementsBody = paginaHTML.select("div .post-body.entry-content").select("div, iframe").remove();   //Remove elementos (1)
            String paginaHTML_2 = elementsBody.html().replace("&nbsp;","").replace("Plot</b>:","Ploot</b>:");                                                                  //...cria nova página HTML (2)
            
            
         //------------------------------------------------------------------------------
         //-------------------REGEX [ Início ]-------------------------------------------
         //------------------------------------------------------------------------------  
                        String regexTitle = "\"<b>.*</b>";                                              //Captura DADOS por REGEX
                        String regexDate = ".* \\d{4}";
                        String regexNutshell = ".*Nutshell.*\\n.*";
                        String regexCast = "[^\"]<b>.*: .*(\\n.*){5}"; 
                        String regexPlot = ".*Plot</b>.*\n.*";
                        
                        final Pattern padrao_1 = Pattern.compile(regexTitle, Pattern.MULTILINE);    final Matcher matcher_Title = padrao_1.matcher(paginaHTML_2);
                        final Pattern padrao_2 = Pattern.compile(regexDate, Pattern.MULTILINE);     final Matcher matcher_Date = padrao_2.matcher(paginaHTML_2);
                        final Pattern padrao_3 = Pattern.compile(regexNutshell, Pattern.MULTILINE); final Matcher matcher_Nutshell = padrao_3.matcher(paginaHTML_2);
                        final Pattern padrao_4 = Pattern.compile(regexCast, Pattern.MULTILINE);     final Matcher matcher_Cast = padrao_4.matcher(paginaHTML_2);
                        final Pattern padrao_5 = Pattern.compile(regexPlot, Pattern.MULTILINE);     final Matcher matcher_Plot = padrao_5.matcher(paginaHTML_2);
                        
                        if (matcher_Title.find())   {   title = matcher_Title.group(0).replace("\"",""); }
                        if (matcher_Date.find())    {   date = matcher_Date.group(0).replace("<br> ",""); }
                        //if (matcher_Nutshell.find()){   nutshell = matcher_Nutshell.group(0).replace("<br> <b>In a Nutshell</b>\n" + "<br> ","").replace("<br> <b>In a Nutshell </b>\n" + "<br> ","").replace("<br> <b><br></b> <b>In a Nutshell</b>\n" + "<br> ",""); }
                        if (matcher_Nutshell.find()){   nutshell = matcher_Nutshell.group(0).replace("<br> ","").replaceAll(".*In a Nutshell.*",""); }
                        if (matcher_Cast.find())    {   cast = matcher_Cast.group(0).replace("Ploot</b>:","Plot</b>:");}    
                        if (matcher_Plot.find())    {   plot = matcher_Plot.group(0).replace("<br> ","").replace("<b>Plot</b>\n","");}
             
         //------------------------------------------------------------------------------
         //-------------------REGEX [ Fim ]----------------------------------------------
         //------------------------------------------------------------------------------  
                        
                                                                                                        //Insere dados em variável...(1)
            //            setBody =   "    \n" +                                                                      //Insere dados em variável...(1)
            //                        "    <hr>  \n" +
            //                        "    <h3 class='post-title entry-title' itemprop='name' id='" + issueNumber + "'>\n" +
            //                        "    " + issueNumber + "\n" +
            //                        "    </h3>\n" +
            //                        "    <br>\n" +
            //                        "\n" +
            //                        "    <div class='post-body entry-content' itemprop='description articleBody'>\n" +
            //                        "    <div class=\"separator\" style=\"clear: both; text-align: center;\">\n" +
            //                        "    <a href=\"" + link + "\" imageanchor=\"1\" style=\"clear: left; float: left; margin-bottom: 1em; margin-right: 1em;\" target=\"_blank\">\n" +
            //                        "        <img border=\"0\" height=\"320\" src=\"" + issueCover + "\"/>\n" +
            //                        "    </a>\n" +
            //                        "    </div>\n" +
            //                        "\n" +
            //                        "    " + title + "\n" +
            //                        "\n" +
            //                        "    " + date + "\n" +
            //                        "    \n" +
            //                        "    <br>\n" +
            //                        "    \n" +
            //                        "    " + nutshell + "\n" +
            //                        "    \n" +
            //                        "    <br>\n" +
            //                        "    <br>\n" +
            //                        "    \n" +
            //                        "    " + cast + "\n" +
            //                        "    \n" +
            //                        "    <br>\n" +
            //                        "    \n" +
            //                        "    " + plot + "\n" +
            //                        "    </div>\n" +
            //                        "    \n" +
            //                        "    \n" +
            //                        "    <br>";
            setBody = "<li class=\"items\">\n" +
                        "			<div class=\"itemsblock\">\n" +
                        "				<div class='imageblock'>\n" +
                        "					<a href=\"" + link + "\" target=\"_blank\">\n" +
                        "						<img border=\"0\" src=\"" + issueCover + "\"/>\n" +
                        "					</a>\n" +
                        "				</div>\n" +
                        "				<div class='textblock'>\n" +
                        "					<div id='issue'>" + issueNumber + "</div>\n" +
                        "					<div id='title'>\"" + title + "\"</div>\n" +
                        "					<div id='date'>" + date + "</div>\n" +
                        "					<div id='nutshell'>" + nutshell + "</div>\n" +
                        "					<div id='cast'>" + cast +  
                        "					</div>\n" +
                        "				</div>\n" +
                        "				<div class='plotblock'>\n" +
                        "					<button type=\"button\" class=\"collapsible\">Plot</button>\n" +
                        "					<div class=\"content\">\n" +
                        "  						" + plot + "\n" +
                        "					</div>\n" +
                        "				</div>\n" +
                        "			</div>\n" +
                        "		</li>";


                        
            listaSetBody.add(setBody);                                                                  //..depois, insere dados em LISTA (2)
            //System.out.println(setBody);
            //System.out.println("Aperte qualquer tecla...");
            //Scanner in = new Scanner (System.in); in.nextLine();
            
            
         }else                                                                  //Se data ANTES de 21/01/2010...
        {
            
            //Elements pageDate = paginaHTML.select("date-header");                                     //Captura DATA (não utilizado)
            issueNumber = paginaHTML.select(".post-title.entry-title").text().replace("X-amining ",""); //Captura NÚMERO DA EDIÇÂO
            issueCover = paginaHTML.select(".post-body.entry-content").select("img").attr("abs:src");   //Captura ENDEREÇO DA CAPA
            
            Elements elementsBody = paginaHTML.select("div .post-body.entry-content").select("div, iframe").remove();   //Remove elementos (1)
            String paginaHTML_2 = elementsBody.html();                                                                  //...cria NOVA PÁGINA HTML (2)
            
            
         //------------------------------------------------------------------------------
         //-------------------REGEX [ Início ]-------------------------------------------
         //------------------------------------------------------------------------------            
                        String regexTitle = "<span style=\"font-weight: bold;\">.*?</span>";            //Captura DADOS por REGEX
                        String regexDate = "<br.*\\s[1][9][5-7][0-9]";
                        //String regexDate = "(?<=span>).*19[6-7][0-9](?=<br)";
                        //String regexCast = "cast";
                        String regexPlot = "<span style=\"font-weight: bold;\">Plot.*(\\n*)<br>";
                        //String regexPlot = "plot";

                        final Pattern padrao_1 = Pattern.compile(regexTitle, Pattern.MULTILINE);         final Matcher matcher_Title = padrao_1.matcher(paginaHTML_2);
                        final Pattern padrao_2 = Pattern.compile(regexDate, Pattern.MULTILINE);          final Matcher matcher_Date = padrao_2.matcher(paginaHTML_2);
                        //final Pattern padrao_3 = Pattern.compile(regexNutshell, Pattern.MULTILINE);    //final Matcher matcher_Nutshell = padrao_3.matcher(paginaHTML_2);
                        //final Pattern padrao_4 = Pattern.compile(regexCast, Pattern.MULTILINE);        //final Matcher matcher_Cast = padrao_4.matcher(paginaHTML_2);
                        final Pattern padrao_5 = Pattern.compile(regexPlot, Pattern.MULTILINE);          final Matcher matcher_Plot = padrao_5.matcher(paginaHTML_2);

                        
                        if (matcher_Title.find())   {   title = matcher_Title.group(0);     }

                        //if (matcher_Date.find())    {   date = matcher_Date.group(0);       }
                        
                        //if (matcher_Nutshell.find()){   nutshell = matcher_Nutshell.group(0); }

                        //if (matcher_Cast.find())    {   cast = matcher_Cast.group(0);          }    
                            	
                        if (matcher_Plot.find())    {   plot = matcher_Plot.group(0);      }
         //------------------------------------------------------------------------------
         //-------------------REGEX [ Fim ]----------------------------------------------
         //------------------------------------------------------------------------------  


            setBody =   "    \n" +                                                                      //Insere dados em variável...(1)
                            "    <hr>  \n" +
                            "    <h3 class='post-title entry-title' itemprop='name' id='" + issueNumber + "'>\n" +
                            "    " + issueNumber + "\n" +
                            "    </h3>\n" +
                            "    <br>\n" +
                            "\n" +
                            "    <div class='post-body entry-content' itemprop='description articleBody'>\n" +
                            "    <div class=\"separator\" style=\"clear: both; text-align: center;\">\n" +
                            "    <a href=\"" + link + "\" imageanchor=\"1\" style=\"clear: left; float: left; margin-bottom: 1em; margin-right: 1em;\" target=\"_blank\">\n" +
                            "        <img border=\"0\" height=\"320\" src=\"" + issueCover + "\"/>\n" +
                            "    </a>\n" +
                            "    </div>\n" +
                            "\n" +
                            "    " + title + "\n" +
                            "\n" +
                            "    " + date + "\n" +
                            "    \n" +
                            "    \n" +
                            "    \n" +
                            //                            "    <br>\n" +
                            //                            "    <br>\n" +
                            "    \n" +
                            //                            "    " + cast + "\n" +
                            //                            "    \n" +
                            //                            "    <br>\n" +
                            "    \n" +
                            "    " + plot + "\n" +
                            "    </div>\n" +
                            "    \n" +
                            "    \n" +
                            "    <br>";
            
            
            listaSetBody.add(setBody);                                                                  //..depois, insere dados em LISTA (2)
            //System.out.println(setBody);
            //System.out.println("Aperte qualquer tecla...");
            //Scanner in = new Scanner (System.in); in.nextLine();
         
         }
        
     return listaSetBody;
    }
   
   
   
   public static void geraHTML(ArrayList<String> setBody) throws FileNotFoundException, IOException
    {
        
        String headerHTML = "<!DOCTYPE html>\n" +
                            "<html>\n" +
                            "<head>\n" +
                            "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                            "   <style id='page-skin-1' type='text/css'>\n" +
                            "		body " +
                            "		{\n" +
                            "			font: normal normal 10px Arial, Tahoma, Helvetica, FreeSans, sans-serif;\n" +
                            "			color: #999999;\n" +
                            "			background: #000000 none repeat scroll top left;\n" +
                            "			padding: 0px 0px 0px 0px;\n" +
                            "		}\n" +
                            "	    html body .region-inner \n" +
                            "		{\n" +
                            "			min-width: 0;\n" +
                            "			max-width: 100%;\n" +
                            "			width: auto;\n" +
                            "	    }\n" +
                            "	    h2 \n" +
                            "		{\n" +
                            "			font-size: 22px;\n" +
                            "	    }\n" +
                            "	    a:link \n" +
                            "		{\n" +
                            "			text-decoration:none;\n" +
                            "			color: #6fa8dc;\n" +
                            "	    }\n" +
                            "	    a:visited \n" +
                            "		{\n" +
                            "			text-decoration:none;\n" +
                            "			color: #6fa8dc;\n" +
                            "			\n" +
                            "	    }\n" +
                            "	    a:hover \n" +
                            "		{\n" +
                            "			text-decoration:underline;\n" +
                            "			color: #ffff00;\n" +
                            "	    }\n" +
                            "	    \n" +
                            "		#searchbar\n" +
                            "		{ \n" +
                            "		 padding: 10px; \n" +
                            "		 border-radius: 10px;\n" +
                            "		 font-size: 20px;	 \n" +
                            "		} \n" +
                            "	 \n" +
                            "		input[type=text] \n" +
                            "	  	{ \n" +
                            "	      width: 93%; \n" +
                            "		} \n" +
                            "	 \n" +
                            "	   /* When the input field gets focus, \n" +
                            "	        change its width to 100% */\n" +
                            "	    input[type=text]:focus \n" +
                            "	    { \n" +
                            "	     \n" +
                            "	    } \n" +
                            "	 \n" +
                            "		#list\n" +
                            "		{ \n" +
                            "		    font-size:  1.5em; \n" +
                            "		    margin-left: -15px; \n" +
                            "		}\n" +
                            "		.items\n" +
                            "		{ \n" +
                            "			display: list-item; \n" +
                            "			padding: 0px 0px;\n" +
                            "\n" +
                            "		}\n" +
                            "\n" +
                            "		div#issue{\n" +
                            "			color: #ffffff;\n" +
                            "			font-weight: bold;\n" +
                            "			font-size: 16px;\n" +
                            "\n" +
                            "		}\n" +
                            "		div#title, div#cast{\n" +
                            "			color: #6fa8dc;\n" +
                            "\n" +
                            "		}\n" +
                            "\n" +
                            "		div#date{\n" +
                            "			color: #ffff00;\n" +
                            "			font-style: italic;\n" +
                            "		}\n" +
                            "				\n" +
                            "		.collapsible {\n" +
                            "			background-color: #6fa8dc;\n" +
                            "			color: white;\n" +
                            "			cursor: pointer;\n" +
                            "			padding: 10px;\n" +
                            "			border: none;\n" +
                            "			/*text-align: center;*/\n" +
                            "			outline: none;\n" +
                            "			font-size: 20px;\n" +
                            "			width: 75px;\n" +
                            "			border-radius: 10px;\n" +
                            "			position: relative;\n" +
                            "			top: -5px;\n" +
                            "			\n" +
                            "		}\n" +
                            "\n" +
                            "		.active {\n" +
                            "  			background-color: #ffff00;\n" +
                            "  			color: black\n" +
                            "		}\n" +
                            "\n" +
                            "		.content {\n" +
                            "			display: none;\n" +
                            "			overflow: hidden;\n" +
                            "			\n" +
                            "			\n" +
                            "			\n" +
                            "		}\n" +
                            "\n" +
                            "		div.itemsblock{\n" +
                            "			\n" +
                            "		}\n" +
                            "		\n" +
                            "		div.imageblock{\n" +
                            "			float: left;\n" +
                            "			margin: 0px 10px 0px 0px;\n" +
                            "\n" +
                            "		}\n" +
                            "		div.textblock{\n" +
                            "			column-count: 1;\n" +
                            "			position: relative;\n" +
                            "			width: auto;\n" +
                            "			\n" +
                            "		}\n" +
                            "\n" +
                            "		div.plotblock{\n" +
                            "			column-count: 1;\n" +
                            "			width: auto;\n" +
                            "			position: relative;\n" +
                            "			top: -35px;\n" +
                            "		}" +
                            "</style>\n" +
                            "	<script>\n" +
                            "		// JavaScript code \n" +
                            "		function search_links() \n" +
                            "		{ \n" +
                            "			let input = document.getElementById('searchbar').value \n" +
                            "			input=input.toLowerCase(); \n" +
                            "			let x = document.getElementsByClassName('items'); \n" +
                            "			  \n" +
                            "			for (i = 0; i < x.length; i++) \n" +
                            "			{  \n" +
                            "				if (!x[i].innerHTML.toLowerCase().includes(input)) \n" +
                            "				{ \n" +
                            "					x[i].style.display=\"none\"; \n" +
                            "				} \n" +
                            "				else \n" +
                            "				{ \n" +
                            "					x[i].style.display=\"list-item\";                  \n" +
                            "				} \n" +
                            "			} \n" +
                            "		}\n" +
                            "	</script>\n" +
                            "</head>\n" +
                            "	\n" +
                            "<body>\n" +
                            "	<!-- input tag -->\n" +
                            "	<input id=\"searchbar\" onkeyup=\"search_links()\" type=\"text\"\n" +
                            "		name=\"search\" placeholder=\"Search X-Animations\"> \n" +
                            "		\n" +
                            "	<!-- ordered list -->\n" +
                            "	<ol id='list'>";
        

        
        
        String footerHTML = "</ol> \n" +
                            "<script>\n" +
                            "	// Collapse code \n" +
                            "	var coll = document.getElementsByClassName(\"collapsible\");\n" +
                            "	var i;\n" +
                            "\n" +
                            "	for (i = 0; i < coll.length; i++) {\n" +
                            "		coll[i].addEventListener(\"click\", function() {\n" +
                            "			this.classList.toggle(\"active\");\n" +
                            "			var content = this.nextElementSibling;\n" +
                            "			if (content.style.display === \"block\") {\n" +
                            "			    content.style.display = \"none\";\n" +
                            "			 } else {\n" +
                            "			    	content.style.display = \"block\";\n" +
                            "		    	}\n" +
                            "		});\n" +
                            "	} \n" +
                            "</script>\n" +
                            "</body>\n" +
                            "</html>";
        
        String fileName = caminho +         //Caminho
                          nome +            //Nome
                          extensao;         //Extensão
        
        //Collections.sort(bodyHTML, reverseOrder());
        
        
        try (FileWriter file = new FileWriter(fileName))
        {
            file.write(headerHTML);
        
            for (String i : setBody)
            {
                file.write(i);
            }

            file.write(footerHTML);
            file.close();
        }
		
        
        System.out.println("");
        System.out.println("HTML gerado em " + fileName + " com sucesso!");
    }
}
