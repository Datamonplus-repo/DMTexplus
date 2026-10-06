package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rconman_impl extends GXWebReport
{
   public rconman_impl( com.genexus.internet.HttpContext context )
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
            A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV20Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         rconman_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV8EmprNom ;
         GXv_char4[0] = AV19usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
         rconman_impl.this.A396EmprCod = GXv_char2[0] ;
         rconman_impl.this.AV8EmprNom = GXv_char3[0] ;
         rconman_impl.this.AV19usurcod = GXv_char4[0] ;
         GXt_char1 = AV18lit1 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "NICCC0001_", ""), (byte)(99), GXv_char4) ;
         rconman_impl.this.GXt_char1 = GXv_char4[0] ;
         AV18lit1 = GXt_char1 ;
         /* Using cursor P070C2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P070C2_A407EmprNom[0] ;
            n407EmprNom = P070C2_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P070C3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3840CcoDsc = P070C3_A3840CcoDsc[0] ;
            n3840CcoDsc = P070C3_n3840CcoDsc[0] ;
            A3839CcoCod = P070C3_A3839CcoCod[0] ;
            n3839CcoCod = P070C3_n3839CcoCod[0] ;
            A862CumConFec = P070C3_A862CumConFec[0] ;
            A3840CcoDsc = P070C3_A3840CcoDsc[0] ;
            n3840CcoDsc = P070C3_n3840CcoDsc[0] ;
            /* Using cursor P070C4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A8639CumUnidad = P070C4_A8639CumUnidad[0] ;
               A719PrdNum = P070C4_A719PrdNum[0] ;
               A718PrdNom = P070C4_A718PrdNom[0] ;
               A860CumConCant = P070C4_A860CumConCant[0] ;
               A718PrdNom = P070C4_A718PrdNom[0] ;
               AV9Texto_u = httpContext.getMessage( "kg", "") ;
               if ( A8639CumUnidad == 0 )
               {
                  AV9Texto_u = httpContext.getMessage( "g", "") ;
               }
               AV10PrdNum = A719PrdNum ;
               AV12Ccstkped = A859CumCodCont ;
               /* Execute user subroutine: 'CCSTKS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
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
               AV15Tot = (long)(AV15Tot+AV14ValorSI) ;
               h70C0( false, 19) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A860CumConCant, "ZZZZZZ9.9999")), 350, Gx_line+1, 451, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 36, Gx_line+0, 125, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 131, Gx_line+0, 322, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Texto_u, "")), 459, Gx_line+2, 523, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Ccstkpre, "ZZZ,ZZ9.99")), 547, Gx_line+0, 631, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14ValorSI), "ZZ,ZZZ,ZZZ,ZZ9")), 642, Gx_line+0, 760, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h70C0( false, 27) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Tot), "ZZ,ZZZ,ZZZ,ZZ9")), 642, Gx_line+5, 760, Gx_line+23, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h70C0( true, 0) ;
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
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      AV13Ccstkpre = DecimalUtil.doubleToDec(0) ;
      AV14ValorSI = 0 ;
      /* Using cursor P070C5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV10PrdNum, Integer.valueOf(AV12Ccstkped)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P070C5_A719PrdNum[0] ;
         A3353CCStkPed = P070C5_A3353CCStkPed[0] ;
         A3345TipMovCc = P070C5_A3345TipMovCc[0] ;
         A3349CCStkPre = P070C5_A3349CCStkPre[0] ;
         A3344CCStkCanS = P070C5_A3344CCStkCanS[0] ;
         A3342CCStkLin = P070C5_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            A3917ValorSI = A3344CCStkCanS.multiply(A3349CCStkPre) ;
            AV13Ccstkpre = A3349CCStkPre ;
            AV14ValorSI = (long)(DecimalUtil.decToDouble(A3917ValorSI)) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h70C0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 9, Gx_line+10, 229, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Consumo Manual", ""), 280, Gx_line+53, 389, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 517, Gx_line+10, 561, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 524, Gx_line+30, 559, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 514, Gx_line+50, 563, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 569, Gx_line+50, 620, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 627, Gx_line+50, 633, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 642, Gx_line+50, 715, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 569, Gx_line+10, 630, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 569, Gx_line+30, 687, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento:", ""), 475, Gx_line+101, 570, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A859CumCodCont), "ZZZZZZZ9")), 576, Gx_line+100, 644, Gx_line+118, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+122) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 52, Gx_line+0, 93, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Centro de Costos", ""), 190, Gx_line+0, 298, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A862CumConFec, "99/99/99"), 98, Gx_line+0, 159, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9")), 299, Gx_line+0, 325, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3840CcoDsc, "")), 333, Gx_line+0, 553, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 60, Gx_line+31, 117, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 395, Gx_line+32, 452, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(31, Gx_line+50, 766, Gx_line+50, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 590, Gx_line+29, 632, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 720, Gx_line+29, 754, Gx_line+47, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+54) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV20Station = "" ;
      GXv_char2 = new String[1] ;
      AV8EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV19usurcod = "" ;
      AV18lit1 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P070C2_A396EmprCod = new String[] {""} ;
      P070C2_A407EmprNom = new String[] {""} ;
      P070C2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      P070C3_A396EmprCod = new String[] {""} ;
      P070C3_A859CumCodCont = new int[1] ;
      P070C3_A3840CcoDsc = new String[] {""} ;
      P070C3_n3840CcoDsc = new boolean[] {false} ;
      P070C3_A3839CcoCod = new short[1] ;
      P070C3_n3839CcoCod = new boolean[] {false} ;
      P070C3_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      A3840CcoDsc = "" ;
      A862CumConFec = GXutil.nullDate() ;
      P070C4_A396EmprCod = new String[] {""} ;
      P070C4_A859CumCodCont = new int[1] ;
      P070C4_A8639CumUnidad = new byte[1] ;
      P070C4_A719PrdNum = new String[] {""} ;
      P070C4_A718PrdNom = new String[] {""} ;
      P070C4_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A860CumConCant = DecimalUtil.ZERO ;
      AV9Texto_u = "" ;
      AV10PrdNum = "" ;
      AV13Ccstkpre = DecimalUtil.ZERO ;
      P070C5_A396EmprCod = new String[] {""} ;
      P070C5_A719PrdNum = new String[] {""} ;
      P070C5_A3353CCStkPed = new int[1] ;
      P070C5_A3345TipMovCc = new String[] {""} ;
      P070C5_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070C5_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070C5_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rconman__default(),
         new Object[] {
             new Object[] {
            P070C2_A396EmprCod, P070C2_A407EmprNom, P070C2_n407EmprNom
            }
            , new Object[] {
            P070C3_A396EmprCod, P070C3_A859CumCodCont, P070C3_A3840CcoDsc, P070C3_n3840CcoDsc, P070C3_A3839CcoCod, P070C3_n3839CcoCod, P070C3_A862CumConFec
            }
            , new Object[] {
            P070C4_A396EmprCod, P070C4_A859CumCodCont, P070C4_A8639CumUnidad, P070C4_A719PrdNum, P070C4_A718PrdNom, P070C4_A860CumConCant
            }
            , new Object[] {
            P070C5_A396EmprCod, P070C5_A719PrdNum, P070C5_A3353CCStkPed, P070C5_A3345TipMovCc, P070C5_A3349CCStkPre, P070C5_A3344CCStkCanS, P070C5_A3342CCStkLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A8639CumUnidad ;
   private short gxcookieaux ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int A859CumCodCont ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV12Ccstkped ;
   private int Gx_OldLine ;
   private int A3353CCStkPed ;
   private long AV15Tot ;
   private long AV14ValorSI ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal AV13Ccstkpre ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3917ValorSI ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV20Station ;
   private String GXv_char2[] ;
   private String AV8EmprNom ;
   private String GXv_char3[] ;
   private String AV19usurcod ;
   private String AV18lit1 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A3840CcoDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV9Texto_u ;
   private String AV10PrdNum ;
   private String A3345TipMovCc ;
   private String Gx_time ;
   private java.util.Date A862CumConFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n3840CcoDsc ;
   private boolean n3839CcoCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P070C2_A396EmprCod ;
   private String[] P070C2_A407EmprNom ;
   private boolean[] P070C2_n407EmprNom ;
   private String[] P070C3_A396EmprCod ;
   private int[] P070C3_A859CumCodCont ;
   private String[] P070C3_A3840CcoDsc ;
   private boolean[] P070C3_n3840CcoDsc ;
   private short[] P070C3_A3839CcoCod ;
   private boolean[] P070C3_n3839CcoCod ;
   private java.util.Date[] P070C3_A862CumConFec ;
   private String[] P070C4_A396EmprCod ;
   private int[] P070C4_A859CumCodCont ;
   private byte[] P070C4_A8639CumUnidad ;
   private String[] P070C4_A719PrdNum ;
   private String[] P070C4_A718PrdNom ;
   private java.math.BigDecimal[] P070C4_A860CumConCant ;
   private String[] P070C5_A396EmprCod ;
   private String[] P070C5_A719PrdNum ;
   private int[] P070C5_A3353CCStkPed ;
   private String[] P070C5_A3345TipMovCc ;
   private java.math.BigDecimal[] P070C5_A3349CCStkPre ;
   private java.math.BigDecimal[] P070C5_A3344CCStkCanS ;
   private long[] P070C5_A3342CCStkLin ;
}

final  class rconman__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P070C2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P070C3", "SELECT T1.EmprCod, T1.CumCodCont, T2.CcoDsc, T1.CcoCod, T1.CumConFec FROM (TXPCCUMCO T1 LEFT JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) WHERE T1.EmprCod = ? and T1.CumCodCont = ? ORDER BY T1.EmprCod, T1.CumCodCont ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P070C4", "SELECT T1.EmprCod, T1.CumCodCont, T1.CumUnidad, T1.PrdNum, T2.PrdNom, T1.CumConCant FROM (TXPLCUMCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.CumCodCont = ? ORDER BY T1.EmprCod, T1.CumCodCont ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P070C5", "SELECT EmprCod, PrdNum, CCStkPed, TipMovCc, CCStkPre, CCStkCanS, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkPed = ?) ORDER BY EmprCod, PrdNum, TipMovCc, CCStkPed ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

