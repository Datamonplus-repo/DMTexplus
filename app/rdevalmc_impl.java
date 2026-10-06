package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rdevalmc_impl extends GXWebReport
{
   public rdevalmc_impl( com.genexus.internet.HttpContext context )
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
            AV10NumALb = httpContext.GetPar( "NumALb") ;
            AV24TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 4 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*4)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV12ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVALM", ""), GXv_char1) ;
         rdevalmc_impl.this.AV12ContDsc = GXv_char1[0] ;
         /* Using cursor P07762 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07762_A407EmprNom[0] ;
            n407EmprNom = P07762_n407EmprNom[0] ;
            A403EmprCpo = P07762_A403EmprCpo[0] ;
            n403EmprCpo = P07762_n403EmprCpo[0] ;
            A404EmprDir = P07762_A404EmprDir[0] ;
            n404EmprDir = P07762_n404EmprDir[0] ;
            A405EmprFax = P07762_A405EmprFax[0] ;
            n405EmprFax = P07762_n405EmprFax[0] ;
            A408EmprPob = P07762_A408EmprPob[0] ;
            n408EmprPob = P07762_n408EmprPob[0] ;
            A409EmprTel = P07762_A409EmprTel[0] ;
            n409EmprTel = P07762_n409EmprTel[0] ;
            AV18EmprNom = A407EmprNom ;
            AV20EmprCpo = A403EmprCpo ;
            AV19EmprDir = A404EmprDir ;
            AV23EmprFax = A405EmprFax ;
            AV21EmprPob = A408EmprPob ;
            AV22EmprTel = A409EmprTel ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07763 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10NumALb});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3345TipMovCc = P07763_A3345TipMovCc[0] ;
            A3354CCStkAlb = P07763_A3354CCStkAlb[0] ;
            A3348CCStkFec = P07763_A3348CCStkFec[0] ;
            A3356CCStkHor = P07763_A3356CCStkHor[0] ;
            A795PrvNum = P07763_A795PrvNum[0] ;
            A718PrdNom = P07763_A718PrdNom[0] ;
            A3344CCStkCanS = P07763_A3344CCStkCanS[0] ;
            A719PrdNum = P07763_A719PrdNum[0] ;
            A3342CCStkLin = P07763_A3342CCStkLin[0] ;
            A795PrvNum = P07763_A795PrvNum[0] ;
            A718PrdNom = P07763_A718PrdNom[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 )
            {
               AV27Ccstkfec = A3348CCStkFec ;
               AV28CCSTKHOR = A3356CCStkHor ;
               AV13PrvNum = A795PrvNum ;
               /* Execute user subroutine: 'PRVGEN' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               h7760( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")), 552, Gx_line+0, 653, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 240, Gx_line+0, 458, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 26, Gx_line+0, 77, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7760( true, 0) ;
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
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      /* Using cursor P07764 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13PrvNum)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A795PrvNum = P07764_A795PrvNum[0] ;
         A794PrvNom = P07764_A794PrvNom[0] ;
         n794PrvNom = P07764_n794PrvNom[0] ;
         A786PrvDir = P07764_A786PrvDir[0] ;
         n786PrvDir = P07764_n786PrvDir[0] ;
         A782PrvCpo = P07764_A782PrvCpo[0] ;
         n782PrvCpo = P07764_n782PrvCpo[0] ;
         A799PrvPob = P07764_A799PrvPob[0] ;
         n799PrvPob = P07764_n799PrvPob[0] ;
         A793PrvNif = P07764_A793PrvNif[0] ;
         n793PrvNif = P07764_n793PrvNif[0] ;
         AV14PrvNom = A794PrvNom ;
         AV15PrvDir = A786PrvDir ;
         AV16PrvCpo = A782PrvCpo ;
         AV17PrvPob = A799PrvPob ;
         AV26Prvnif = A793PrvNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h7760( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ContDsc, "")), 28, Gx_line+35, 112, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 750, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(502, Gx_line+25, 724, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+33, 750, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processado por Computador", ""), 580, Gx_line+35, 729, Gx_line+49, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+55) ;
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
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GUIA DE DEVOLUÇÃO", ""), 428, Gx_line+11, 608, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 613, Gx_line+11, 633, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10NumALb, "")), 639, Gx_line+11, 723, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13PrvNum), "ZZZZZ9")), 150, Gx_line+331, 195, Gx_line+348, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14PrvNom, "")), 429, Gx_line+171, 680, Gx_line+189, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15PrvDir, "")), 429, Gx_line+192, 680, Gx_line+210, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrvPob, "")), 429, Gx_line+213, 680, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PRODUTO", ""), 27, Gx_line+428, 94, Gx_line+446, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESCRIÇÃO", ""), 241, Gx_line+428, 326, Gx_line+446, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "QUANTIDADE", ""), 559, Gx_line+428, 654, Gx_line+446, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+449, 750, Gx_line+449, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 25, Gx_line+2, 354, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rua António Carvalho, 2", ""), 25, Gx_line+54, 141, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Perelhal - BARCELOS", ""), 25, Gx_line+68, 127, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "4750 - 625 Perelhal - PORTUGAL", ""), 25, Gx_line+80, 175, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TEL.: 351 253 860 030", ""), 25, Gx_line+93, 125, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FAX.: 351 253 860 039", ""), 25, Gx_line+104, 125, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "email: carvema@carvema.pt", ""), 25, Gx_line+117, 156, Gx_line+130, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "www.carvema.pt", ""), 25, Gx_line+130, 102, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE Nº PT 500 057 095 - SOCIEDADE POR QUOTAS", ""), 25, Gx_line+150, 315, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MATRICULADA NA CONS. R. C. DE BARCELOS SOB. O Nº 319", ""), 25, Gx_line+160, 311, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CAPITAL SOCIAL € 2.000.000,00 REALIZADO", ""), 25, Gx_line+172, 227, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TextoCopia, "")), 428, Gx_line+32, 517, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(28, Gx_line+324, 742, Gx_line+413, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Fornecedor:", ""), 52, Gx_line+333, 138, Gx_line+349, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 52, Gx_line+351, 144, Gx_line+367, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 52, Gx_line+369, 83, Gx_line+385, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora de Carga:", ""), 52, Gx_line+385, 141, Gx_line+401, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 469, Gx_line+333, 555, Gx_line+349, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 469, Gx_line+351, 581, Gx_line+367, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Expediçao:", ""), 469, Gx_line+369, 533, Gx_line+385, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 469, Gx_line+385, 524, Gx_line+401, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV27Ccstkfec, "99/99/99"), 150, Gx_line+369, 201, Gx_line+386, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 152, Gx_line+351, 235, Gx_line+367, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Prvnif, "")), 597, Gx_line+333, 702, Gx_line+350, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 597, Gx_line+351, 678, Gx_line+367, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Folha", ""), 663, Gx_line+303, 694, Gx_line+318, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 697, Gx_line+303, 736, Gx_line+319, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28CCSTKHOR, "")), 150, Gx_line+385, 243, Gx_line+402, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+456) ;
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
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
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
      AV10NumALb = "" ;
      AV24TextoCopia = "" ;
      AV12ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P07762_A396EmprCod = new String[] {""} ;
      P07762_A407EmprNom = new String[] {""} ;
      P07762_n407EmprNom = new boolean[] {false} ;
      P07762_A403EmprCpo = new String[] {""} ;
      P07762_n403EmprCpo = new boolean[] {false} ;
      P07762_A404EmprDir = new String[] {""} ;
      P07762_n404EmprDir = new boolean[] {false} ;
      P07762_A405EmprFax = new String[] {""} ;
      P07762_n405EmprFax = new boolean[] {false} ;
      P07762_A408EmprPob = new String[] {""} ;
      P07762_n408EmprPob = new boolean[] {false} ;
      P07762_A409EmprTel = new String[] {""} ;
      P07762_n409EmprTel = new boolean[] {false} ;
      A407EmprNom = "" ;
      A403EmprCpo = "" ;
      A404EmprDir = "" ;
      A405EmprFax = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      AV18EmprNom = "" ;
      AV20EmprCpo = "" ;
      AV19EmprDir = "" ;
      AV23EmprFax = "" ;
      AV21EmprPob = "" ;
      AV22EmprTel = "" ;
      P07763_A396EmprCod = new String[] {""} ;
      P07763_A3345TipMovCc = new String[] {""} ;
      P07763_A3354CCStkAlb = new String[] {""} ;
      P07763_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07763_A3356CCStkHor = new String[] {""} ;
      P07763_A795PrvNum = new int[1] ;
      P07763_A718PrdNom = new String[] {""} ;
      P07763_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07763_A719PrdNum = new String[] {""} ;
      P07763_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3354CCStkAlb = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      A718PrdNom = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV27Ccstkfec = GXutil.nullDate() ;
      AV28CCSTKHOR = "" ;
      P07764_A396EmprCod = new String[] {""} ;
      P07764_A795PrvNum = new int[1] ;
      P07764_A794PrvNom = new String[] {""} ;
      P07764_n794PrvNom = new boolean[] {false} ;
      P07764_A786PrvDir = new String[] {""} ;
      P07764_n786PrvDir = new boolean[] {false} ;
      P07764_A782PrvCpo = new String[] {""} ;
      P07764_n782PrvCpo = new boolean[] {false} ;
      P07764_A799PrvPob = new String[] {""} ;
      P07764_n799PrvPob = new boolean[] {false} ;
      P07764_A793PrvNif = new String[] {""} ;
      P07764_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      AV14PrvNom = "" ;
      AV15PrvDir = "" ;
      AV16PrvCpo = "" ;
      AV17PrvPob = "" ;
      AV26Prvnif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevalmc__default(),
         new Object[] {
             new Object[] {
            P07762_A396EmprCod, P07762_A407EmprNom, P07762_n407EmprNom, P07762_A403EmprCpo, P07762_n403EmprCpo, P07762_A404EmprDir, P07762_n404EmprDir, P07762_A405EmprFax, P07762_n405EmprFax, P07762_A408EmprPob,
            P07762_n408EmprPob, P07762_A409EmprTel, P07762_n409EmprTel
            }
            , new Object[] {
            P07763_A396EmprCod, P07763_A3345TipMovCc, P07763_A3354CCStkAlb, P07763_A3348CCStkFec, P07763_A3356CCStkHor, P07763_A795PrvNum, P07763_A718PrdNom, P07763_A3344CCStkCanS, P07763_A719PrdNum, P07763_A3342CCStkLin
            }
            , new Object[] {
            P07764_A396EmprCod, P07764_A795PrvNum, P07764_A794PrvNom, P07764_n794PrvNom, P07764_A786PrvDir, P07764_n786PrvDir, P07764_A782PrvCpo, P07764_n782PrvCpo, P07764_A799PrvPob, P07764_n799PrvPob,
            P07764_A793PrvNif, P07764_n793PrvNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int AV13PrvNum ;
   private int Gx_OldLine ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV10NumALb ;
   private String AV24TextoCopia ;
   private String AV12ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A403EmprCpo ;
   private String A404EmprDir ;
   private String A405EmprFax ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String AV18EmprNom ;
   private String AV20EmprCpo ;
   private String AV19EmprDir ;
   private String AV23EmprFax ;
   private String AV21EmprPob ;
   private String AV22EmprTel ;
   private String A3345TipMovCc ;
   private String A3354CCStkAlb ;
   private String A3356CCStkHor ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV28CCSTKHOR ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String AV14PrvNom ;
   private String AV15PrvDir ;
   private String AV16PrvCpo ;
   private String AV17PrvPob ;
   private String AV26Prvnif ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV27Ccstkfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n405EmprFax ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private IDataStoreProvider pr_default ;
   private String[] P07762_A396EmprCod ;
   private String[] P07762_A407EmprNom ;
   private boolean[] P07762_n407EmprNom ;
   private String[] P07762_A403EmprCpo ;
   private boolean[] P07762_n403EmprCpo ;
   private String[] P07762_A404EmprDir ;
   private boolean[] P07762_n404EmprDir ;
   private String[] P07762_A405EmprFax ;
   private boolean[] P07762_n405EmprFax ;
   private String[] P07762_A408EmprPob ;
   private boolean[] P07762_n408EmprPob ;
   private String[] P07762_A409EmprTel ;
   private boolean[] P07762_n409EmprTel ;
   private String[] P07763_A396EmprCod ;
   private String[] P07763_A3345TipMovCc ;
   private String[] P07763_A3354CCStkAlb ;
   private java.util.Date[] P07763_A3348CCStkFec ;
   private String[] P07763_A3356CCStkHor ;
   private int[] P07763_A795PrvNum ;
   private String[] P07763_A718PrdNom ;
   private java.math.BigDecimal[] P07763_A3344CCStkCanS ;
   private String[] P07763_A719PrdNum ;
   private long[] P07763_A3342CCStkLin ;
   private String[] P07764_A396EmprCod ;
   private int[] P07764_A795PrvNum ;
   private String[] P07764_A794PrvNom ;
   private boolean[] P07764_n794PrvNom ;
   private String[] P07764_A786PrvDir ;
   private boolean[] P07764_n786PrvDir ;
   private String[] P07764_A782PrvCpo ;
   private boolean[] P07764_n782PrvCpo ;
   private String[] P07764_A799PrvPob ;
   private boolean[] P07764_n799PrvPob ;
   private String[] P07764_A793PrvNif ;
   private boolean[] P07764_n793PrvNif ;
}

final  class rdevalmc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07762", "SELECT EmprCod, EmprNom, EmprCpo, EmprDir, EmprFax, EmprPob, EmprTel FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07763", "SELECT T1.EmprCod, T1.TipMovCc, T1.CCStkAlb, T1.CCStkFec, T1.CCStkHor, T2.PrvNum, T2.PrdNom, T1.CCStkCanS, T1.PrdNum, T1.CCStkLin FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.CCStkAlb = ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07764", "SELECT EmprCod, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 7);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 35);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

