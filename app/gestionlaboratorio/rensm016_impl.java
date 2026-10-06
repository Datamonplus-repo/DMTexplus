package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rensm016_impl extends GXWebReport
{
   public rensm016_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV25CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV8Lb_cartaz = httpContext.GetPar( "Lb_cartaz") ;
            AV9Lb_fechaen = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaen")) ;
            AV45Json_EnvioEnsayo = httpContext.GetPar( "Json_EnvioEnsayo") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11678, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV11Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS016", ""), GXv_char1) ;
         rensm016_impl.this.AV11Contdsc = GXv_char1[0] ;
         AV20Contdsc2 = GXutil.substring( AV11Contdsc, 1, 10) ;
         AV14i = (short)(1) ;
         AV46Col_EnvioEnsayo.fromJSonString(AV45Json_EnvioEnsayo, null);
         AV52GXV1 = 1 ;
         while ( AV52GXV1 <= AV46Col_EnvioEnsayo.size() )
         {
            AV47Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)((app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)AV46Col_EnvioEnsayo.elementAt(-1+AV52GXV1));
            AV13Tab_ensayo[AV14i-1] = AV47Item_EnvioEnsayo.getgxTv_SdtEnviodeEnsayo_SDT_Lb_numero() ;
            AV18Tab_carta[AV14i-1] = AV47Item_EnvioEnsayo.getgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz() ;
            AV16Tab_opcion[AV14i-1] = AV47Item_EnvioEnsayo.getgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion() ;
            AV14i = (short)(AV14i+1) ;
            AV52GXV1 = (int)(AV52GXV1+1) ;
         }
         AV48texto1 = httpContext.getMessage( "Agradecemos confirmação ao Laboratório dos ensaios aprovados para o mail: cpereira@moda21.pt", "") ;
         AV49texto2 = httpContext.getMessage( "MODA 21, Tinturaria e Acabamentos Têxteis, SA - Ruães - Mire de Tibães - 4700-565 Braga Telef: 253 300390 Fax: 253 300399 E-mail: moda21@moda21.pt", "") ;
         AV14i = (short)(1) ;
         AV29Num_col = (byte)(1) ;
         AV27Var_t = httpContext.getMessage( "CARTAZ DE CORES Nº ", "") ;
         while ( ! (0==AV13Tab_ensayo[AV14i-1]) )
         {
            AV15Lb_numero = AV13Tab_ensayo[AV14i-1] ;
            AV17Lb_opcion = AV16Tab_opcion[AV14i-1] ;
            AV8Lb_cartaz = AV18Tab_carta[AV14i-1] ;
            /* Using cursor P078A2 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Lb_numero), AV8Lb_cartaz});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A5540Lb_Cartaz = P078A2_A5540Lb_Cartaz[0] ;
               A5532Lb_numero = P078A2_A5532Lb_numero[0] ;
               A279CliNom = P078A2_A279CliNom[0] ;
               A5533Lb_ArtCod = P078A2_A5533Lb_ArtCod[0] ;
               A6653Lb_Tra1 = P078A2_A6653Lb_Tra1[0] ;
               A6654Lb_TraP1 = P078A2_A6654Lb_TraP1[0] ;
               A6655Lb_Tra2 = P078A2_A6655Lb_Tra2[0] ;
               A6656Lb_TraP2 = P078A2_A6656Lb_TraP2[0] ;
               A6657Lb_Tra3 = P078A2_A6657Lb_Tra3[0] ;
               A6658Lb_TraP3 = P078A2_A6658Lb_TraP3[0] ;
               A6842Lb_Tra4 = P078A2_A6842Lb_Tra4[0] ;
               A6843Lb_TraP4 = P078A2_A6843Lb_TraP4[0] ;
               A6844Lb_Tra5 = P078A2_A6844Lb_Tra5[0] ;
               A6845Lb_TraP5 = P078A2_A6845Lb_TraP5[0] ;
               A6846Lb_Tra6 = P078A2_A6846Lb_Tra6[0] ;
               A6847Lb_TraP6 = P078A2_A6847Lb_TraP6[0] ;
               A5536Lb_ColNom = P078A2_A5536Lb_ColNom[0] ;
               A5537Lb_ColNum = P078A2_A5537Lb_ColNum[0] ;
               A5538Lb_ColNomC = P078A2_A5538Lb_ColNomC[0] ;
               A5539Lb_ColNumC = P078A2_A5539Lb_ColNumC[0] ;
               A252CliCod = P078A2_A252CliCod[0] ;
               A279CliNom = P078A2_A279CliNom[0] ;
               AV28CliNom = A279CliNom ;
               AV26Artcod1 = " " ;
               AV24Compo1 = "" ;
               AV30Lb_colnom1 = " " ;
               AV31Lb_colnum1 = 0 ;
               AV32Lb_colnoc1 = " " ;
               AV33Lb_colnuc1 = 0 ;
               AV34Lb_opcion1 = "" ;
               AV35Artcod2 = " " ;
               AV42Compo2 = "" ;
               AV37Lb_colnom2 = " " ;
               AV38Lb_colnum2 = 0 ;
               AV39Lb_colnoc2 = " " ;
               AV40Lb_colnuc2 = 0 ;
               AV41Lb_opcion2 = "" ;
               if ( AV29Num_col == 1 )
               {
                  AV34Lb_opcion1 = AV16Tab_opcion[AV14i-1] ;
                  AV26Artcod1 = A5533Lb_ArtCod ;
                  AV24Compo1 = "" ;
                  if ( ! (GXutil.strcmp("", A6653Lb_Tra1)==0) )
                  {
                     AV24Compo1 = GXutil.trim( GXutil.str( A6654Lb_TraP1, 3, 0)) + "% " + GXutil.trim( A6653Lb_Tra1) + " " ;
                     if ( ! (GXutil.strcmp("", A6655Lb_Tra2)==0) )
                     {
                        AV24Compo1 += GXutil.trim( GXutil.str( A6656Lb_TraP2, 3, 0)) + "% " + GXutil.trim( A6655Lb_Tra2) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6657Lb_Tra3)==0) )
                     {
                        AV24Compo1 += GXutil.trim( GXutil.str( A6658Lb_TraP3, 3, 0)) + "% " + GXutil.trim( A6657Lb_Tra3) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6842Lb_Tra4)==0) )
                     {
                        AV24Compo1 += GXutil.trim( GXutil.str( A6843Lb_TraP4, 3, 0)) + "% " + GXutil.trim( A6842Lb_Tra4) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6842Lb_Tra4)==0) )
                     {
                        AV24Compo1 += GXutil.trim( GXutil.str( A6845Lb_TraP5, 3, 0)) + "% " + GXutil.trim( A6844Lb_Tra5) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6846Lb_Tra6)==0) )
                     {
                        AV24Compo1 += GXutil.trim( GXutil.str( A6847Lb_TraP6, 3, 0)) + "% " + GXutil.trim( A6846Lb_Tra6) + " " ;
                     }
                  }
                  AV30Lb_colnom1 = A5536Lb_ColNom ;
                  AV31Lb_colnum1 = A5537Lb_ColNum ;
                  AV32Lb_colnoc1 = A5538Lb_ColNomC ;
                  AV33Lb_colnuc1 = A5539Lb_ColNumC ;
               }
               else
               {
                  AV41Lb_opcion2 = AV16Tab_opcion[AV14i-1] ;
                  AV35Artcod2 = A5533Lb_ArtCod ;
                  AV42Compo2 = "" ;
                  if ( ! (GXutil.strcmp("", A6653Lb_Tra1)==0) )
                  {
                     AV42Compo2 = GXutil.trim( GXutil.str( A6654Lb_TraP1, 3, 0)) + "% " + GXutil.trim( A6653Lb_Tra1) + " " ;
                     if ( ! (GXutil.strcmp("", A6655Lb_Tra2)==0) )
                     {
                        AV42Compo2 += GXutil.trim( GXutil.str( A6656Lb_TraP2, 3, 0)) + "% " + GXutil.trim( A6655Lb_Tra2) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6657Lb_Tra3)==0) )
                     {
                        AV42Compo2 += GXutil.trim( GXutil.str( A6658Lb_TraP3, 3, 0)) + "% " + GXutil.trim( A6657Lb_Tra3) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6842Lb_Tra4)==0) )
                     {
                        AV42Compo2 += GXutil.trim( GXutil.str( A6843Lb_TraP4, 3, 0)) + "% " + GXutil.trim( A6842Lb_Tra4) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6844Lb_Tra5)==0) )
                     {
                        AV42Compo2 += GXutil.trim( GXutil.str( A6845Lb_TraP5, 3, 0)) + "% " + GXutil.trim( A6844Lb_Tra5) + " " ;
                     }
                     if ( ! (GXutil.strcmp("", A6846Lb_Tra6)==0) )
                     {
                        AV42Compo2 += GXutil.trim( GXutil.str( A6847Lb_TraP6, 3, 0)) + "% " + GXutil.trim( A6846Lb_Tra6) + " " ;
                     }
                  }
                  AV37Lb_colnom2 = A5536Lb_ColNom ;
                  AV38Lb_colnum2 = A5537Lb_ColNum ;
                  AV39Lb_colnoc2 = A5538Lb_ColNomC ;
                  AV40Lb_colnuc2 = A5539Lb_ColNumC ;
               }
               AV29Num_col = (byte)(AV29Num_col+1) ;
               /* Execute user subroutine: 'IMPRIMO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
            AV14i = (short)(AV14i+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h78A0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'IMPRIMO' Routine */
      returnInSub = false ;
      GxHdr4 = true ;
      /* Using cursor P078A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15Lb_numero), AV8Lb_cartaz});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5539Lb_ColNumC = P078A3_A5539Lb_ColNumC[0] ;
         A5536Lb_ColNom = P078A3_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P078A3_A5538Lb_ColNomC[0] ;
         A5532Lb_numero = P078A3_A5532Lb_numero[0] ;
         A5540Lb_Cartaz = P078A3_A5540Lb_Cartaz[0] ;
         A5534Lb_ArtDsc = P078A3_A5534Lb_ArtDsc[0] ;
         A5552Lb_TipArtD = P078A3_A5552Lb_TipArtD[0] ;
         A6546Lb_Pantone = P078A3_A6546Lb_Pantone[0] ;
         A5537Lb_ColNum = P078A3_A5537Lb_ColNum[0] ;
         A5533Lb_ArtCod = P078A3_A5533Lb_ArtCod[0] ;
         A6653Lb_Tra1 = P078A3_A6653Lb_Tra1[0] ;
         A6654Lb_TraP1 = P078A3_A6654Lb_TraP1[0] ;
         A6655Lb_Tra2 = P078A3_A6655Lb_Tra2[0] ;
         A6656Lb_TraP2 = P078A3_A6656Lb_TraP2[0] ;
         A6657Lb_Tra3 = P078A3_A6657Lb_Tra3[0] ;
         A6658Lb_TraP3 = P078A3_A6658Lb_TraP3[0] ;
         A6842Lb_Tra4 = P078A3_A6842Lb_Tra4[0] ;
         A6843Lb_TraP4 = P078A3_A6843Lb_TraP4[0] ;
         A6844Lb_Tra5 = P078A3_A6844Lb_Tra5[0] ;
         A6845Lb_TraP5 = P078A3_A6845Lb_TraP5[0] ;
         A6846Lb_Tra6 = P078A3_A6846Lb_Tra6[0] ;
         A6847Lb_TraP6 = P078A3_A6847Lb_TraP6[0] ;
         A252CliCod = P078A3_A252CliCod[0] ;
         A6618Lb_PedCod = P078A3_A6618Lb_PedCod[0] ;
         AV10Lb_artcod = GXutil.trim( GXutil.substring( A5534Lb_ArtDsc, 1, 10)) ;
         AV22Texto_a = GXutil.trim( A5534Lb_ArtDsc) ;
         AV12Tipartdsc = GXutil.trim( GXutil.substring( A5552Lb_TipArtD, 1, 15)) ;
         AV19Lb_pantone = GXutil.substring( A6546Lb_Pantone, 1, 60) ;
         AV23Lb_colnum = A5537Lb_ColNum ;
         AV25CliCod = A252CliCod ;
         AV43Artcod = A5533Lb_ArtCod ;
         AV44Compo = "" ;
         if ( ! (GXutil.strcmp("", A6653Lb_Tra1)==0) )
         {
            AV44Compo = GXutil.trim( GXutil.str( A6654Lb_TraP1, 3, 0)) + "% " + GXutil.trim( A6653Lb_Tra1) + " " ;
            if ( ! (GXutil.strcmp("", A6655Lb_Tra2)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A6656Lb_TraP2, 3, 0)) + "% " + GXutil.trim( A6655Lb_Tra2) + " " ;
            }
            if ( ! (GXutil.strcmp("", A6657Lb_Tra3)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A6658Lb_TraP3, 3, 0)) + "% " + GXutil.trim( A6657Lb_Tra3) + " " ;
            }
            if ( ! (GXutil.strcmp("", A6842Lb_Tra4)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A6843Lb_TraP4, 3, 0)) + "% " + GXutil.trim( A6842Lb_Tra4) + " " ;
            }
            if ( ! (GXutil.strcmp("", A6844Lb_Tra5)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A6845Lb_TraP5, 3, 0)) + "% " + GXutil.trim( A6844Lb_Tra5) + " " ;
            }
            if ( ! (GXutil.strcmp("", A6846Lb_Tra6)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A6847Lb_TraP6, 3, 0)) + "% " + GXutil.trim( A6846Lb_Tra6) + " " ;
            }
         }
         AV27Var_t = httpContext.getMessage( "CARTAZ DE CORES Nº", "") ;
         /* Using cursor P078A4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV17Lb_opcion});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5555Lb_opcion = P078A4_A5555Lb_opcion[0] ;
            if ( A5539Lb_ColNumC == 0 )
            {
               AV21Lb_ColNCar = "" ;
            }
            else
            {
               AV21Lb_ColNCar = GXutil.str( A5539Lb_ColNumC, 10, 0) ;
            }
            h78A0( false, 218) ;
            getPrinter().GxDrawRect(505, Gx_line+15, 740, Gx_line+198, 1, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "V/Cor :", ""), 22, Gx_line+116, 58, Gx_line+130, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 65, Gx_line+115, 161, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opção:", ""), 21, Gx_line+95, 58, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")), 65, Gx_line+94, 73, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N/Cor :", ""), 21, Gx_line+66, 58, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 65, Gx_line+65, 161, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23Lb_colnum), "ZZZZZZ")), 167, Gx_line+65, 212, Gx_line+83, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lb_pantone, "")), 65, Gx_line+135, 504, Gx_line+153, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lb_ColNCar, "")), 167, Gx_line+115, 212, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 26, Gx_line+16, 58, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Texto_a, "")), 65, Gx_line+15, 329, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Compo, "")), 65, Gx_line+36, 394, Gx_line+54, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+218) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      GxHdr4 = false ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV44Compo = "" ;
      /* Using cursor P078A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV43Artcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P078A5_A65ArtCod[0] ;
         A252CliCod = P078A5_A252CliCod[0] ;
         A105ArtTra1 = P078A5_A105ArtTra1[0] ;
         n105ArtTra1 = P078A5_n105ArtTra1[0] ;
         A108ArtTraP1 = P078A5_A108ArtTraP1[0] ;
         n108ArtTraP1 = P078A5_n108ArtTraP1[0] ;
         A106ArtTra2 = P078A5_A106ArtTra2[0] ;
         n106ArtTra2 = P078A5_n106ArtTra2[0] ;
         A109ArtTraP2 = P078A5_A109ArtTraP2[0] ;
         n109ArtTraP2 = P078A5_n109ArtTraP2[0] ;
         A107ArtTra3 = P078A5_A107ArtTra3[0] ;
         n107ArtTra3 = P078A5_n107ArtTra3[0] ;
         A110ArtTraP3 = P078A5_A110ArtTraP3[0] ;
         n110ArtTraP3 = P078A5_n110ArtTraP3[0] ;
         A111ArtUrd1 = P078A5_A111ArtUrd1[0] ;
         n111ArtUrd1 = P078A5_n111ArtUrd1[0] ;
         A114ArtUrdP1 = P078A5_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P078A5_n114ArtUrdP1[0] ;
         A112ArtUrd2 = P078A5_A112ArtUrd2[0] ;
         n112ArtUrd2 = P078A5_n112ArtUrd2[0] ;
         A115ArtUrdP2 = P078A5_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P078A5_n115ArtUrdP2[0] ;
         A113ArtUrd3 = P078A5_A113ArtUrd3[0] ;
         n113ArtUrd3 = P078A5_n113ArtUrd3[0] ;
         A116ArtUrdP3 = P078A5_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P078A5_n116ArtUrdP3[0] ;
         if ( ! (GXutil.strcmp("", A105ArtTra1)==0) )
         {
            AV44Compo = GXutil.trim( GXutil.str( A108ArtTraP1, 3, 0)) + "% " + GXutil.trim( A105ArtTra1) + " " ;
            if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A109ArtTraP2, 3, 0)) + "% " + GXutil.trim( A106ArtTra2) + " " ;
            }
            if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A110ArtTraP3, 3, 0)) + "% " + GXutil.trim( A107ArtTra3) + " " ;
            }
            if ( ! (GXutil.strcmp("", A111ArtUrd1)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A114ArtUrdP1, 3, 0)) + "% " + GXutil.trim( A111ArtUrd1) + " " ;
            }
            if ( ! (GXutil.strcmp("", A112ArtUrd2)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A115ArtUrdP2, 3, 0)) + "% " + GXutil.trim( A112ArtUrd2) + " " ;
            }
            if ( ! (GXutil.strcmp("", A113ArtUrd3)==0) )
            {
               AV44Compo += GXutil.trim( GXutil.str( A116ArtUrdP3, 3, 0)) + "% " + GXutil.trim( A113ArtUrd3) + " " ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h78A0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxDrawLine(21, Gx_line+23, 778, Gx_line+23, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Contdsc2, "")), 21, Gx_line+46, 64, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48texto1, "")), 111, Gx_line+3, 687, Gx_line+19, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49texto2, "")), 8, Gx_line+27, 791, Gx_line+42, 1, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+61) ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr4 )
            {
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 21, Gx_line+5, 778, Gx_line+91) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+96) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 21, Gx_line+8, 68, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV9Lb_fechaen, "99/99/99"), 575, Gx_line+29, 634, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(21, Gx_line+54, 778, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Pedido:", ""), 21, Gx_line+30, 72, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6618Lb_PedCod, "")), 82, Gx_line+29, 448, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 533, Gx_line+30, 561, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Var_t, "")), 373, Gx_line+7, 562, Gx_line+26, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lb_cartaz, "")), 567, Gx_line+7, 776, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28CliNom, "")), 82, Gx_line+7, 364, Gx_line+26, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+68) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV8Lb_cartaz = "" ;
      AV9Lb_fechaen = GXutil.nullDate() ;
      AV45Json_EnvioEnsayo = "" ;
      AV11Contdsc = "" ;
      GXv_char1 = new String[1] ;
      AV20Contdsc2 = "" ;
      AV46Col_EnvioEnsayo = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT>(app.gestionlaboratorio.SdtEnviodeEnsayo_SDT.class, "EnviodeEnsayo_SDT", "TexplusNET", remoteHandle);
      AV47Item_EnvioEnsayo = new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
      AV13Tab_ensayo = new int[100] ;
      AV18Tab_carta = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV18Tab_carta[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16Tab_opcion = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV16Tab_opcion[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV48texto1 = "" ;
      AV49texto2 = "" ;
      AV27Var_t = "" ;
      AV17Lb_opcion = "" ;
      scmdbuf = "" ;
      P078A2_A396EmprCod = new String[] {""} ;
      P078A2_A5540Lb_Cartaz = new String[] {""} ;
      P078A2_A5532Lb_numero = new int[1] ;
      P078A2_A279CliNom = new String[] {""} ;
      P078A2_A5533Lb_ArtCod = new String[] {""} ;
      P078A2_A6653Lb_Tra1 = new String[] {""} ;
      P078A2_A6654Lb_TraP1 = new short[1] ;
      P078A2_A6655Lb_Tra2 = new String[] {""} ;
      P078A2_A6656Lb_TraP2 = new short[1] ;
      P078A2_A6657Lb_Tra3 = new String[] {""} ;
      P078A2_A6658Lb_TraP3 = new short[1] ;
      P078A2_A6842Lb_Tra4 = new String[] {""} ;
      P078A2_A6843Lb_TraP4 = new short[1] ;
      P078A2_A6844Lb_Tra5 = new String[] {""} ;
      P078A2_A6845Lb_TraP5 = new short[1] ;
      P078A2_A6846Lb_Tra6 = new String[] {""} ;
      P078A2_A6847Lb_TraP6 = new short[1] ;
      P078A2_A5536Lb_ColNom = new String[] {""} ;
      P078A2_A5537Lb_ColNum = new int[1] ;
      P078A2_A5538Lb_ColNomC = new String[] {""} ;
      P078A2_A5539Lb_ColNumC = new int[1] ;
      P078A2_A252CliCod = new int[1] ;
      A5540Lb_Cartaz = "" ;
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A6842Lb_Tra4 = "" ;
      A6844Lb_Tra5 = "" ;
      A6846Lb_Tra6 = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      AV28CliNom = "" ;
      AV26Artcod1 = "" ;
      AV24Compo1 = "" ;
      AV30Lb_colnom1 = "" ;
      AV32Lb_colnoc1 = "" ;
      AV34Lb_opcion1 = "" ;
      AV35Artcod2 = "" ;
      AV42Compo2 = "" ;
      AV37Lb_colnom2 = "" ;
      AV39Lb_colnoc2 = "" ;
      AV41Lb_opcion2 = "" ;
      P078A3_A396EmprCod = new String[] {""} ;
      P078A3_A5539Lb_ColNumC = new int[1] ;
      P078A3_A5536Lb_ColNom = new String[] {""} ;
      P078A3_A5538Lb_ColNomC = new String[] {""} ;
      P078A3_A5532Lb_numero = new int[1] ;
      P078A3_A5540Lb_Cartaz = new String[] {""} ;
      P078A3_A5534Lb_ArtDsc = new String[] {""} ;
      P078A3_A5552Lb_TipArtD = new String[] {""} ;
      P078A3_A6546Lb_Pantone = new String[] {""} ;
      P078A3_A5537Lb_ColNum = new int[1] ;
      P078A3_A5533Lb_ArtCod = new String[] {""} ;
      P078A3_A6653Lb_Tra1 = new String[] {""} ;
      P078A3_A6654Lb_TraP1 = new short[1] ;
      P078A3_A6655Lb_Tra2 = new String[] {""} ;
      P078A3_A6656Lb_TraP2 = new short[1] ;
      P078A3_A6657Lb_Tra3 = new String[] {""} ;
      P078A3_A6658Lb_TraP3 = new short[1] ;
      P078A3_A6842Lb_Tra4 = new String[] {""} ;
      P078A3_A6843Lb_TraP4 = new short[1] ;
      P078A3_A6844Lb_Tra5 = new String[] {""} ;
      P078A3_A6845Lb_TraP5 = new short[1] ;
      P078A3_A6846Lb_Tra6 = new String[] {""} ;
      P078A3_A6847Lb_TraP6 = new short[1] ;
      P078A3_A252CliCod = new int[1] ;
      P078A3_A6618Lb_PedCod = new String[] {""} ;
      A5534Lb_ArtDsc = "" ;
      A5552Lb_TipArtD = "" ;
      A6546Lb_Pantone = "" ;
      A6618Lb_PedCod = "" ;
      AV10Lb_artcod = "" ;
      AV22Texto_a = "" ;
      AV12Tipartdsc = "" ;
      AV19Lb_pantone = "" ;
      AV43Artcod = "" ;
      AV44Compo = "" ;
      P078A4_A396EmprCod = new String[] {""} ;
      P078A4_A5532Lb_numero = new int[1] ;
      P078A4_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV21Lb_ColNCar = "" ;
      P078A5_A396EmprCod = new String[] {""} ;
      P078A5_A65ArtCod = new String[] {""} ;
      P078A5_A252CliCod = new int[1] ;
      P078A5_A105ArtTra1 = new String[] {""} ;
      P078A5_n105ArtTra1 = new boolean[] {false} ;
      P078A5_A108ArtTraP1 = new short[1] ;
      P078A5_n108ArtTraP1 = new boolean[] {false} ;
      P078A5_A106ArtTra2 = new String[] {""} ;
      P078A5_n106ArtTra2 = new boolean[] {false} ;
      P078A5_A109ArtTraP2 = new short[1] ;
      P078A5_n109ArtTraP2 = new boolean[] {false} ;
      P078A5_A107ArtTra3 = new String[] {""} ;
      P078A5_n107ArtTra3 = new boolean[] {false} ;
      P078A5_A110ArtTraP3 = new short[1] ;
      P078A5_n110ArtTraP3 = new boolean[] {false} ;
      P078A5_A111ArtUrd1 = new String[] {""} ;
      P078A5_n111ArtUrd1 = new boolean[] {false} ;
      P078A5_A114ArtUrdP1 = new short[1] ;
      P078A5_n114ArtUrdP1 = new boolean[] {false} ;
      P078A5_A112ArtUrd2 = new String[] {""} ;
      P078A5_n112ArtUrd2 = new boolean[] {false} ;
      P078A5_A115ArtUrdP2 = new short[1] ;
      P078A5_n115ArtUrdP2 = new boolean[] {false} ;
      P078A5_A113ArtUrd3 = new String[] {""} ;
      P078A5_n113ArtUrd3 = new boolean[] {false} ;
      P078A5_A116ArtUrdP3 = new short[1] ;
      P078A5_n116ArtUrdP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rensm016__default(),
         new Object[] {
             new Object[] {
            P078A2_A396EmprCod, P078A2_A5540Lb_Cartaz, P078A2_A5532Lb_numero, P078A2_A279CliNom, P078A2_A5533Lb_ArtCod, P078A2_A6653Lb_Tra1, P078A2_A6654Lb_TraP1, P078A2_A6655Lb_Tra2, P078A2_A6656Lb_TraP2, P078A2_A6657Lb_Tra3,
            P078A2_A6658Lb_TraP3, P078A2_A6842Lb_Tra4, P078A2_A6843Lb_TraP4, P078A2_A6844Lb_Tra5, P078A2_A6845Lb_TraP5, P078A2_A6846Lb_Tra6, P078A2_A6847Lb_TraP6, P078A2_A5536Lb_ColNom, P078A2_A5537Lb_ColNum, P078A2_A5538Lb_ColNomC,
            P078A2_A5539Lb_ColNumC, P078A2_A252CliCod
            }
            , new Object[] {
            P078A3_A396EmprCod, P078A3_A5539Lb_ColNumC, P078A3_A5536Lb_ColNom, P078A3_A5538Lb_ColNomC, P078A3_A5532Lb_numero, P078A3_A5540Lb_Cartaz, P078A3_A5534Lb_ArtDsc, P078A3_A5552Lb_TipArtD, P078A3_A6546Lb_Pantone, P078A3_A5537Lb_ColNum,
            P078A3_A5533Lb_ArtCod, P078A3_A6653Lb_Tra1, P078A3_A6654Lb_TraP1, P078A3_A6655Lb_Tra2, P078A3_A6656Lb_TraP2, P078A3_A6657Lb_Tra3, P078A3_A6658Lb_TraP3, P078A3_A6842Lb_Tra4, P078A3_A6843Lb_TraP4, P078A3_A6844Lb_Tra5,
            P078A3_A6845Lb_TraP5, P078A3_A6846Lb_Tra6, P078A3_A6847Lb_TraP6, P078A3_A252CliCod, P078A3_A6618Lb_PedCod
            }
            , new Object[] {
            P078A4_A396EmprCod, P078A4_A5532Lb_numero, P078A4_A5555Lb_opcion
            }
            , new Object[] {
            P078A5_A396EmprCod, P078A5_A65ArtCod, P078A5_A252CliCod, P078A5_A105ArtTra1, P078A5_n105ArtTra1, P078A5_A108ArtTraP1, P078A5_n108ArtTraP1, P078A5_A106ArtTra2, P078A5_n106ArtTra2, P078A5_A109ArtTraP2,
            P078A5_n109ArtTraP2, P078A5_A107ArtTra3, P078A5_n107ArtTra3, P078A5_A110ArtTraP3, P078A5_n110ArtTraP3, P078A5_A111ArtUrd1, P078A5_n111ArtUrd1, P078A5_A114ArtUrdP1, P078A5_n114ArtUrdP1, P078A5_A112ArtUrd2,
            P078A5_n112ArtUrd2, P078A5_A115ArtUrdP2, P078A5_n115ArtUrdP2, P078A5_A113ArtUrd3, P078A5_n113ArtUrd3, P078A5_A116ArtUrdP3, P078A5_n116ArtUrdP3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV29Num_col ;
   private short gxcookieaux ;
   private short AV14i ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A6843Lb_TraP4 ;
   private short A6845Lb_TraP5 ;
   private short A6847Lb_TraP6 ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short Gx_err ;
   private int AV25CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV52GXV1 ;
   private int AV13Tab_ensayo[] ;
   private int AV15Lb_numero ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int A252CliCod ;
   private int AV31Lb_colnum1 ;
   private int AV33Lb_colnuc1 ;
   private int AV38Lb_colnum2 ;
   private int AV40Lb_colnuc2 ;
   private int AV23Lb_colnum ;
   private int Gx_OldLine ;
   private int GX_I ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8Lb_cartaz ;
   private String AV11Contdsc ;
   private String GXv_char1[] ;
   private String AV20Contdsc2 ;
   private String AV18Tab_carta[] ;
   private String AV16Tab_opcion[] ;
   private String AV48texto1 ;
   private String AV49texto2 ;
   private String AV27Var_t ;
   private String AV17Lb_opcion ;
   private String scmdbuf ;
   private String A5540Lb_Cartaz ;
   private String A279CliNom ;
   private String A5533Lb_ArtCod ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A6842Lb_Tra4 ;
   private String A6844Lb_Tra5 ;
   private String A6846Lb_Tra6 ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String AV28CliNom ;
   private String AV26Artcod1 ;
   private String AV24Compo1 ;
   private String AV30Lb_colnom1 ;
   private String AV32Lb_colnoc1 ;
   private String AV34Lb_opcion1 ;
   private String AV35Artcod2 ;
   private String AV42Compo2 ;
   private String AV37Lb_colnom2 ;
   private String AV39Lb_colnoc2 ;
   private String AV41Lb_opcion2 ;
   private String A5534Lb_ArtDsc ;
   private String A5552Lb_TipArtD ;
   private String A6546Lb_Pantone ;
   private String A6618Lb_PedCod ;
   private String AV10Lb_artcod ;
   private String AV22Texto_a ;
   private String AV12Tipartdsc ;
   private String AV19Lb_pantone ;
   private String AV43Artcod ;
   private String AV44Compo ;
   private String A5555Lb_opcion ;
   private String AV21Lb_ColNCar ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private java.util.Date AV9Lb_fechaen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean GxHdr4 ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n114ArtUrdP1 ;
   private boolean n112ArtUrd2 ;
   private boolean n115ArtUrdP2 ;
   private boolean n113ArtUrd3 ;
   private boolean n116ArtUrdP3 ;
   private String AV45Json_EnvioEnsayo ;
   private IDataStoreProvider pr_default ;
   private String[] P078A2_A396EmprCod ;
   private String[] P078A2_A5540Lb_Cartaz ;
   private int[] P078A2_A5532Lb_numero ;
   private String[] P078A2_A279CliNom ;
   private String[] P078A2_A5533Lb_ArtCod ;
   private String[] P078A2_A6653Lb_Tra1 ;
   private short[] P078A2_A6654Lb_TraP1 ;
   private String[] P078A2_A6655Lb_Tra2 ;
   private short[] P078A2_A6656Lb_TraP2 ;
   private String[] P078A2_A6657Lb_Tra3 ;
   private short[] P078A2_A6658Lb_TraP3 ;
   private String[] P078A2_A6842Lb_Tra4 ;
   private short[] P078A2_A6843Lb_TraP4 ;
   private String[] P078A2_A6844Lb_Tra5 ;
   private short[] P078A2_A6845Lb_TraP5 ;
   private String[] P078A2_A6846Lb_Tra6 ;
   private short[] P078A2_A6847Lb_TraP6 ;
   private String[] P078A2_A5536Lb_ColNom ;
   private int[] P078A2_A5537Lb_ColNum ;
   private String[] P078A2_A5538Lb_ColNomC ;
   private int[] P078A2_A5539Lb_ColNumC ;
   private int[] P078A2_A252CliCod ;
   private String[] P078A3_A396EmprCod ;
   private int[] P078A3_A5539Lb_ColNumC ;
   private String[] P078A3_A5536Lb_ColNom ;
   private String[] P078A3_A5538Lb_ColNomC ;
   private int[] P078A3_A5532Lb_numero ;
   private String[] P078A3_A5540Lb_Cartaz ;
   private String[] P078A3_A5534Lb_ArtDsc ;
   private String[] P078A3_A5552Lb_TipArtD ;
   private String[] P078A3_A6546Lb_Pantone ;
   private int[] P078A3_A5537Lb_ColNum ;
   private String[] P078A3_A5533Lb_ArtCod ;
   private String[] P078A3_A6653Lb_Tra1 ;
   private short[] P078A3_A6654Lb_TraP1 ;
   private String[] P078A3_A6655Lb_Tra2 ;
   private short[] P078A3_A6656Lb_TraP2 ;
   private String[] P078A3_A6657Lb_Tra3 ;
   private short[] P078A3_A6658Lb_TraP3 ;
   private String[] P078A3_A6842Lb_Tra4 ;
   private short[] P078A3_A6843Lb_TraP4 ;
   private String[] P078A3_A6844Lb_Tra5 ;
   private short[] P078A3_A6845Lb_TraP5 ;
   private String[] P078A3_A6846Lb_Tra6 ;
   private short[] P078A3_A6847Lb_TraP6 ;
   private int[] P078A3_A252CliCod ;
   private String[] P078A3_A6618Lb_PedCod ;
   private String[] P078A4_A396EmprCod ;
   private int[] P078A4_A5532Lb_numero ;
   private String[] P078A4_A5555Lb_opcion ;
   private String[] P078A5_A396EmprCod ;
   private String[] P078A5_A65ArtCod ;
   private int[] P078A5_A252CliCod ;
   private String[] P078A5_A105ArtTra1 ;
   private boolean[] P078A5_n105ArtTra1 ;
   private short[] P078A5_A108ArtTraP1 ;
   private boolean[] P078A5_n108ArtTraP1 ;
   private String[] P078A5_A106ArtTra2 ;
   private boolean[] P078A5_n106ArtTra2 ;
   private short[] P078A5_A109ArtTraP2 ;
   private boolean[] P078A5_n109ArtTraP2 ;
   private String[] P078A5_A107ArtTra3 ;
   private boolean[] P078A5_n107ArtTra3 ;
   private short[] P078A5_A110ArtTraP3 ;
   private boolean[] P078A5_n110ArtTraP3 ;
   private String[] P078A5_A111ArtUrd1 ;
   private boolean[] P078A5_n111ArtUrd1 ;
   private short[] P078A5_A114ArtUrdP1 ;
   private boolean[] P078A5_n114ArtUrdP1 ;
   private String[] P078A5_A112ArtUrd2 ;
   private boolean[] P078A5_n112ArtUrd2 ;
   private short[] P078A5_A115ArtUrdP2 ;
   private boolean[] P078A5_n115ArtUrdP2 ;
   private String[] P078A5_A113ArtUrd3 ;
   private boolean[] P078A5_n113ArtUrd3 ;
   private short[] P078A5_A116ArtUrdP3 ;
   private boolean[] P078A5_n116ArtUrdP3 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT> AV46Col_EnvioEnsayo ;
   private app.gestionlaboratorio.SdtEnviodeEnsayo_SDT AV47Item_EnvioEnsayo ;
}

final  class rensm016__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P078A2", "SELECT T1.EmprCod, T1.Lb_Cartaz, T1.Lb_numero, T2.CliNom, T1.Lb_ArtCod, T1.Lb_Tra1, T1.Lb_TraP1, T1.Lb_Tra2, T1.Lb_TraP2, T1.Lb_Tra3, T1.Lb_TraP3, T1.Lb_Tra4, T1.Lb_TraP4, T1.Lb_Tra5, T1.Lb_TraP5, T1.Lb_Tra6, T1.Lb_TraP6, T1.Lb_ColNom, T1.Lb_ColNum, T1.Lb_ColNomC, T1.Lb_ColNumC, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.Lb_numero = ?) AND (T1.Lb_Cartaz = ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078A3", "SELECT EmprCod, Lb_ColNumC, Lb_ColNom, Lb_ColNomC, Lb_numero, Lb_Cartaz, Lb_ArtDsc, Lb_TipArtD, Lb_Pantone, Lb_ColNum, Lb_ArtCod, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, CliCod, Lb_PedCod FROM TXPENS001 WHERE (EmprCod = ?) AND (Lb_numero = ?) AND (Lb_Cartaz = ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078A4", "SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078A5", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3, ArtUrd1, ArtUrdP1, ArtUrd2, ArtUrdP2, ArtUrd3, ArtUrdP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 4);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 13);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 100);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 4);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 4);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 4);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 4);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 50);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

