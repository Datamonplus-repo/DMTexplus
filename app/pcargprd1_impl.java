package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcargprd1_impl extends GXWebReport
{
   public pcargprd1_impl( com.genexus.internet.HttpContext context )
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
            AV159Procod = httpContext.GetPar( "Procod") ;
            AV160Prodsc = httpContext.GetPar( "Prodsc") ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         /* Using cursor P04UM2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P04UM2_A407EmprNom[0] ;
            n407EmprNom = P04UM2_n407EmprNom[0] ;
            AV48EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV8Contador = (byte)(0) ;
         AV10Longitud = 700 ;
         AV151LastClicod = 0 ;
         AV153Tkgse = DecimalUtil.doubleToDec(0) ;
         AV154Tkgss = DecimalUtil.doubleToDec(0) ;
         AV155Tkgsce = DecimalUtil.doubleToDec(0) ;
         AV156Tkgscs = DecimalUtil.doubleToDec(0) ;
         while ( AV8Contador == 0 )
         {
            if ( GXutil.strcmp(AV13Texto_l, httpContext.getMessage( "#fi", "")) == 0 )
            {
               if (true) break;
            }
            AV157Profasest = (byte)(GXutil.lval( GXutil.substring( AV13Texto_l, 1, 1))) ;
            AV37CliCod = (int)(GXutil.lval( GXutil.substring( AV13Texto_l, 2, 6))) ;
            AV39CliNom = (GXutil.substring( AV13Texto_l, 8, 30)) ;
            AV106BarEnccli = (GXutil.substring( AV13Texto_l, 38, 20)) ;
            AV16Barcod = (int)(GXutil.lval( GXutil.substring( AV13Texto_l, 58, 8))) ;
            AV20Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV13Texto_l, 66, 1))) ;
            AV18Barcodpar = (GXutil.substring( AV13Texto_l, 67, 1)) ;
            AV121BarSit = (byte)(GXutil.lval( GXutil.substring( AV13Texto_l, 68, 2))) ;
            AV116Barser = (GXutil.substring( AV13Texto_l, 70, 16)) ;
            AV120Barserdsc = (GXutil.substring( AV13Texto_l, 86, 26)) ;
            AV104Barcolnom = (GXutil.substring( AV13Texto_l, 112, 13)) ;
            AV105Barcolnum = (int)(GXutil.lval( GXutil.substring( AV13Texto_l, 125, 6))) ;
            AV152barnomcli = (GXutil.substring( AV13Texto_l, 131, 13)) ;
            AV113BarKgm = CommonUtil.decimalVal( GXutil.substring( AV13Texto_l, 144, 9), ".") ;
            AV114BarMtr = CommonUtil.decimalVal( GXutil.substring( AV13Texto_l, 153, 9), ".") ;
            AV108Barfascod = (GXutil.substring( AV13Texto_l, 162, 8)) ;
            AV143Hdr = GXutil.str( AV16Barcod, 8, 0) + "-" + GXutil.str( AV20Barcodreo, 1, 0) + AV18Barcodpar ;
            if ( AV157Profasest == 0 )
            {
               AV158EstadoProceso = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( AV157Profasest == 1 )
            {
               AV158EstadoProceso = httpContext.getMessage( "En Proceso(Fase Ini)", "") ;
            }
            else if ( AV157Profasest == 2 )
            {
               AV158EstadoProceso = httpContext.getMessage( "En Proceso(Fase Fin)", "") ;
            }
            else
            {
            }
            h4UM0( false, 16) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158EstadoProceso, "")), 7, Gx_line+0, 154, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39CliNom, "")), 160, Gx_line+0, 380, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV143Hdr, "")), 386, Gx_line+0, 467, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV121BarSit), "Z9")), 471, Gx_line+0, 487, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Barser, "")), 642, Gx_line+0, 760, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV152barnomcli, "")), 869, Gx_line+0, 965, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV113BarKgm, "ZZZZZ9.99")), 970, Gx_line+0, 1037, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV114BarMtr, "ZZZZZ9.99")), 1050, Gx_line+0, 1117, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Barcolnom, "")), 766, Gx_line+0, 862, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106BarEnccli, "")), 489, Gx_line+0, 636, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+16) ;
            AV161Totk = AV161Totk.add(AV113BarKgm) ;
            AV162totm = AV162totm.add(AV114BarMtr) ;
         }
         h4UM0( false, 43) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV161Totk, "ZZZZZZ9.99")), 963, Gx_line+16, 1037, Gx_line+33, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV162totm, "ZZZZZZ9.99")), 1043, Gx_line+16, 1117, Gx_line+33, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+43) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4UM0( true, 0) ;
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

   public void h4UM0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV166Pgmdesc, "")), 15, Gx_line+47, 235, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 926, Gx_line+16, 985, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 992, Gx_line+16, 1051, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 992, Gx_line+47, 1037, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48EmprNom, "")), 15, Gx_line+16, 235, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+67, 1124, Gx_line+67, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.:", ""), 949, Gx_line+47, 986, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora:", ""), 852, Gx_line+16, 919, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped Cli", ""), 489, Gx_line+78, 541, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 386, Gx_line+78, 409, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 642, Gx_line+78, 701, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 766, Gx_line+78, 803, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 970, Gx_line+78, 993, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "St", ""), 471, Gx_line+78, 487, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(489, Gx_line+94, 635, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(386, Gx_line+94, 466, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(642, Gx_line+94, 759, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(766, Gx_line+94, 964, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(970, Gx_line+94, 1036, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(471, Gx_line+93, 486, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 160, Gx_line+78, 212, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 1050, Gx_line+78, 1073, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1050, Gx_line+94, 1116, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159Procod, "")), 284, Gx_line+47, 343, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160Prodsc, "")), 350, Gx_line+47, 643, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(160, Gx_line+94, 379, Gx_line+94, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+98) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV159Procod = "" ;
      AV160Prodsc = "" ;
      scmdbuf = "" ;
      P04UM2_A396EmprCod = new String[] {""} ;
      P04UM2_A407EmprNom = new String[] {""} ;
      P04UM2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV48EmprNom = "" ;
      AV153Tkgse = DecimalUtil.ZERO ;
      AV154Tkgss = DecimalUtil.ZERO ;
      AV155Tkgsce = DecimalUtil.ZERO ;
      AV156Tkgscs = DecimalUtil.ZERO ;
      AV13Texto_l = "" ;
      AV39CliNom = "" ;
      AV106BarEnccli = "" ;
      AV18Barcodpar = "" ;
      AV116Barser = "" ;
      AV120Barserdsc = "" ;
      AV104Barcolnom = "" ;
      AV152barnomcli = "" ;
      AV113BarKgm = DecimalUtil.ZERO ;
      AV114BarMtr = DecimalUtil.ZERO ;
      AV108Barfascod = "" ;
      AV143Hdr = "" ;
      AV158EstadoProceso = "" ;
      AV161Totk = DecimalUtil.ZERO ;
      AV162totm = DecimalUtil.ZERO ;
      AV166Pgmdesc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcargprd1__default(),
         new Object[] {
             new Object[] {
            P04UM2_A396EmprCod, P04UM2_A407EmprNom, P04UM2_n407EmprNom
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV166Pgmdesc = httpContext.getMessage( "Informe Produccion por Proceso", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV166Pgmdesc = httpContext.getMessage( "Informe Produccion por Proceso", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Contador ;
   private byte AV157Profasest ;
   private byte AV20Barcodreo ;
   private byte AV121BarSit ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV10Longitud ;
   private int AV151LastClicod ;
   private int AV37CliCod ;
   private int AV16Barcod ;
   private int AV105Barcolnum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV153Tkgse ;
   private java.math.BigDecimal AV154Tkgss ;
   private java.math.BigDecimal AV155Tkgsce ;
   private java.math.BigDecimal AV156Tkgscs ;
   private java.math.BigDecimal AV113BarKgm ;
   private java.math.BigDecimal AV114BarMtr ;
   private java.math.BigDecimal AV161Totk ;
   private java.math.BigDecimal AV162totm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV159Procod ;
   private String AV160Prodsc ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV48EmprNom ;
   private String AV13Texto_l ;
   private String AV39CliNom ;
   private String AV106BarEnccli ;
   private String AV18Barcodpar ;
   private String AV116Barser ;
   private String AV120Barserdsc ;
   private String AV104Barcolnom ;
   private String AV152barnomcli ;
   private String AV108Barfascod ;
   private String AV143Hdr ;
   private String AV158EstadoProceso ;
   private String AV166Pgmdesc ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private IDataStoreProvider pr_default ;
   private String[] P04UM2_A396EmprCod ;
   private String[] P04UM2_A407EmprNom ;
   private boolean[] P04UM2_n407EmprNom ;
}

final  class pcargprd1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UM2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
      }
   }

}

