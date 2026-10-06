package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod008_impl extends GXWebReport
{
   public rmod008_impl( com.genexus.internet.HttpContext context )
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
            AV12vPCliCod = (int)(GXutil.lval( httpContext.GetPar( "vPCliCod"))) ;
            AV13vUCliCod = (int)(GXutil.lval( httpContext.GetPar( "vUCliCod"))) ;
            AV14vPFecGen = localUtil.parseDateParm( httpContext.GetPar( "vPFecGen")) ;
            AV15vUFecGen = localUtil.parseDateParm( httpContext.GetPar( "vUFecGen")) ;
            AV21vPSit = (byte)(GXutil.lval( httpContext.GetPar( "vPSit"))) ;
            AV22vUSit = (byte)(GXutil.lval( httpContext.GetPar( "vUSit"))) ;
            AV45TipArt1 = (short)(GXutil.lval( httpContext.GetPar( "TipArt1"))) ;
            AV46TIpArt2 = (short)(GXutil.lval( httpContext.GetPar( "TIpArt2"))) ;
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
      M_bot = 0 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06R52 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06R52_A407EmprNom[0] ;
            n407EmprNom = P06R52_n407EmprNom[0] ;
            AV16NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV19vTotG = DecimalUtil.doubleToDec(0) ;
         AV25vTot_Mts_g = DecimalUtil.doubleToDec(0) ;
         AV32Tot_A_k = DecimalUtil.doubleToDec(0) ;
         AV33Tot_A_m = DecimalUtil.doubleToDec(0) ;
         AV40Tot_a_p = DecimalUtil.doubleToDec(0) ;
         AV41Tot_a_t = DecimalUtil.doubleToDec(0) ;
         AV39Tot_a_a = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV12vPCliCod) ,
                                              Integer.valueOf(AV13vUCliCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A10045CliAct ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06R53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12vPCliCod), Integer.valueOf(AV13vUCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P06R53_A252CliCod[0] ;
            n252CliCod = P06R53_n252CliCod[0] ;
            A10045CliAct = P06R53_A10045CliAct[0] ;
            A279CliNom = P06R53_A279CliNom[0] ;
            AV18vTotCli = DecimalUtil.doubleToDec(0) ;
            AV20FlagCli = (byte)(0) ;
            AV24vTot_mts_c = DecimalUtil.doubleToDec(0) ;
            AV11CliCod = A252CliCod ;
            AV43Tot_p = DecimalUtil.doubleToDec(0) ;
            AV44Tot_t = DecimalUtil.doubleToDec(0) ;
            AV38Tot_a = DecimalUtil.doubleToDec(0) ;
            pr_default.dynParam(2, new Object[]{ new Object[]{
                                                 AV14vPFecGen ,
                                                 AV15vUFecGen ,
                                                 Byte.valueOf(AV21vPSit) ,
                                                 Byte.valueOf(AV22vUSit) ,
                                                 Short.valueOf(AV45TipArt1) ,
                                                 Short.valueOf(AV46TIpArt2) ,
                                                 A159BarFecGen ,
                                                 Byte.valueOf(A213BarSit) ,
                                                 Short.valueOf(A217BarTipArt) ,
                                                 A396EmprCod ,
                                                 Integer.valueOf(A252CliCod) } ,
                                                 new int[]{
                                                 TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                                 TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                                 }
            });
            /* Using cursor P06R55 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV14vPFecGen, AV15vUFecGen, Byte.valueOf(AV21vPSit), Byte.valueOf(AV22vUSit), Short.valueOf(AV45TipArt1), Short.valueOf(AV46TIpArt2)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A129BarCod = P06R55_A129BarCod[0] ;
               A132BarCodReo = P06R55_A132BarCodReo[0] ;
               A130BarCodPar = P06R55_A130BarCodPar[0] ;
               A217BarTipArt = P06R55_A217BarTipArt[0] ;
               n217BarTipArt = P06R55_n217BarTipArt[0] ;
               A213BarSit = P06R55_A213BarSit[0] ;
               A159BarFecGen = P06R55_A159BarFecGen[0] ;
               A166BarKgm = P06R55_A166BarKgm[0] ;
               n166BarKgm = P06R55_n166BarKgm[0] ;
               A166BarKgm = P06R55_A166BarKgm[0] ;
               n166BarKgm = P06R55_n166BarKgm[0] ;
               if ( ( A213BarSit >= 1 ) && ( A213BarSit <= 3 ) )
               {
                  AV43Tot_p = AV43Tot_p.add(A166BarKgm) ;
               }
               else if ( ( A213BarSit == 4 ) && ( A213BarSit == 4 ) )
               {
                  AV44Tot_t = AV44Tot_t.add(A166BarKgm) ;
               }
               else if ( ( A213BarSit >= 5 ) && ( A213BarSit <= 6 ) )
               {
                  AV38Tot_a = AV38Tot_a.add(A166BarKgm) ;
               }
               else
               {
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Execute user subroutine: 'ALMACEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV32Tot_A_k = AV32Tot_A_k.add(AV30Saldo_k) ;
            AV39Tot_a_a = AV39Tot_a_a.add(AV38Tot_a) ;
            AV40Tot_a_p = AV40Tot_a_p.add(AV43Tot_p) ;
            AV41Tot_a_t = AV41Tot_a_t.add(AV44Tot_t) ;
            AV42Tot_l = AV38Tot_a.add(AV43Tot_p).add(AV44Tot_t).add(AV30Saldo_k) ;
            if ( AV42Tot_l.doubleValue() > 0 )
            {
               h6R50( false, 15) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 27, Gx_line+0, 66, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 81, Gx_line+0, 238, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30Saldo_k, "Z,ZZZ,ZZ9.99")), 342, Gx_line+0, 418, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43Tot_p, "ZZ,ZZZ,ZZ9.99")), 459, Gx_line+0, 541, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Tot_t, "ZZ,ZZZ,ZZ9.99")), 588, Gx_line+0, 670, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38Tot_a, "ZZ,ZZZ,ZZ9.99")), 735, Gx_line+0, 817, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42Tot_l, "ZZ,ZZZ,ZZ9.99")), 860, Gx_line+0, 942, Gx_line+15, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV42Tot_l = AV39Tot_a_a.add(AV40Tot_a_p).add(AV41Tot_a_t).add(AV32Tot_A_k) ;
         if ( AV42Tot_l.doubleValue() > 0 )
         {
            h6R50( false, 27) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Tot_A_k, "ZZZ,ZZZ,ZZ9.99")), 329, Gx_line+14, 418, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40Tot_a_p, "ZZ,ZZZ,ZZ9.99")), 459, Gx_line+14, 541, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41Tot_a_t, "ZZ,ZZZ,ZZ9.99")), 588, Gx_line+14, 670, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39Tot_a_a, "ZZ,ZZZ,ZZ9.99")), 735, Gx_line+14, 817, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42Tot_l, "ZZ,ZZZ,ZZ9.99")), 860, Gx_line+14, 942, Gx_line+29, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6R50( true, 0) ;
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
      /* 'ALMACEN' Routine */
      returnInSub = false ;
      AV26Tot_Ent_K = DecimalUtil.doubleToDec(0) ;
      AV27Tot_Sal_K = DecimalUtil.doubleToDec(0) ;
      AV28Tot_Ent_m = DecimalUtil.doubleToDec(0) ;
      AV29Tot_Sal_m = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV14vPFecGen ,
                                           AV15vUFecGen ,
                                           Short.valueOf(AV45TipArt1) ,
                                           Short.valueOf(AV46TIpArt2) ,
                                           A49AlbRFen ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV11CliCod) ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P06R56 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV11CliCod), AV14vPFecGen, AV15vUFecGen, Short.valueOf(AV45TipArt1), Short.valueOf(AV46TIpArt2)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A6263AlbRTartC = P06R56_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P06R56_n6263AlbRTartC[0] ;
         A49AlbRFen = P06R56_A49AlbRFen[0] ;
         A252CliCod = P06R56_A252CliCod[0] ;
         n252CliCod = P06R56_n252CliCod[0] ;
         A56AlbRUni = P06R56_A56AlbRUni[0] ;
         A58AlbRUniEnt = P06R56_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P06R56_A60AlbRUniUti[0] ;
         A44AlbRecCod = P06R56_A44AlbRecCod[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV26Tot_Ent_K = AV26Tot_Ent_K.add(A58AlbRUniEnt) ;
            AV27Tot_Sal_K = AV27Tot_Sal_K.add(A60AlbRUniUti) ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            AV28Tot_Ent_m = AV28Tot_Ent_m.add(A58AlbRUniEnt) ;
            AV29Tot_Sal_m = AV29Tot_Sal_m.add(A60AlbRUniUti) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV31Saldo_m = AV28Tot_Ent_m.subtract(AV29Tot_Sal_m) ;
      AV30Saldo_k = AV26Tot_Ent_K.subtract(AV27Tot_Sal_K) ;
   }

   public void h6R50( boolean bFoot ,
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
            getPrinter().GxDrawLine(6, Gx_line+88, 1074, Gx_line+88, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 831, Gx_line+4, 878, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 958, Gx_line+44, 997, Gx_line+59, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16NomEmp, "")), 9, Gx_line+1, 260, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 31, Gx_line+68, 73, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desde", ""), 331, Gx_line+44, 368, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV14vPFecGen, "99/99/99"), 392, Gx_line+44, 439, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "hasta", ""), 475, Gx_line+44, 509, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV15vUFecGen, "99/99/99"), 518, Gx_line+44, 565, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Almacen", ""), 359, Gx_line+68, 411, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preparado", ""), 479, Gx_line+68, 541, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tinte", ""), 639, Gx_line+68, 670, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acabados", ""), 759, Gx_line+68, 817, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 911, Gx_line+68, 942, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produccion en CURSO", ""), 13, Gx_line+41, 197, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+68, 1074, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 913, Gx_line+4, 997, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 892, Gx_line+4, 899, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 913, Gx_line+44, 939, Gx_line+58, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+95) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Tahoma", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Tahoma", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV14vPFecGen = GXutil.nullDate() ;
      AV15vUFecGen = GXutil.nullDate() ;
      scmdbuf = "" ;
      P06R52_A396EmprCod = new String[] {""} ;
      P06R52_A407EmprNom = new String[] {""} ;
      P06R52_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV16NomEmp = "" ;
      AV19vTotG = DecimalUtil.ZERO ;
      AV25vTot_Mts_g = DecimalUtil.ZERO ;
      AV32Tot_A_k = DecimalUtil.ZERO ;
      AV33Tot_A_m = DecimalUtil.ZERO ;
      AV40Tot_a_p = DecimalUtil.ZERO ;
      AV41Tot_a_t = DecimalUtil.ZERO ;
      AV39Tot_a_a = DecimalUtil.ZERO ;
      A10045CliAct = "" ;
      P06R53_A396EmprCod = new String[] {""} ;
      P06R53_A252CliCod = new int[1] ;
      P06R53_n252CliCod = new boolean[] {false} ;
      P06R53_A10045CliAct = new String[] {""} ;
      P06R53_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV18vTotCli = DecimalUtil.ZERO ;
      AV24vTot_mts_c = DecimalUtil.ZERO ;
      AV43Tot_p = DecimalUtil.ZERO ;
      AV44Tot_t = DecimalUtil.ZERO ;
      AV38Tot_a = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      P06R55_A129BarCod = new int[1] ;
      P06R55_A132BarCodReo = new byte[1] ;
      P06R55_A130BarCodPar = new String[] {""} ;
      P06R55_A396EmprCod = new String[] {""} ;
      P06R55_A252CliCod = new int[1] ;
      P06R55_n252CliCod = new boolean[] {false} ;
      P06R55_A217BarTipArt = new short[1] ;
      P06R55_n217BarTipArt = new boolean[] {false} ;
      P06R55_A213BarSit = new byte[1] ;
      P06R55_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P06R55_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R55_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV30Saldo_k = DecimalUtil.ZERO ;
      AV42Tot_l = DecimalUtil.ZERO ;
      AV26Tot_Ent_K = DecimalUtil.ZERO ;
      AV27Tot_Sal_K = DecimalUtil.ZERO ;
      AV28Tot_Ent_m = DecimalUtil.ZERO ;
      AV29Tot_Sal_m = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      P06R56_A396EmprCod = new String[] {""} ;
      P06R56_A6263AlbRTartC = new short[1] ;
      P06R56_n6263AlbRTartC = new boolean[] {false} ;
      P06R56_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06R56_A252CliCod = new int[1] ;
      P06R56_n252CliCod = new boolean[] {false} ;
      P06R56_A56AlbRUni = new String[] {""} ;
      P06R56_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R56_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R56_A44AlbRecCod = new int[1] ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV31Saldo_m = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.rmod008__default(),
         new Object[] {
             new Object[] {
            P06R52_A396EmprCod, P06R52_A407EmprNom, P06R52_n407EmprNom
            }
            , new Object[] {
            P06R53_A396EmprCod, P06R53_A252CliCod, P06R53_A10045CliAct, P06R53_A279CliNom
            }
            , new Object[] {
            P06R55_A129BarCod, P06R55_A132BarCodReo, P06R55_A130BarCodPar, P06R55_A396EmprCod, P06R55_A252CliCod, P06R55_n252CliCod, P06R55_A217BarTipArt, P06R55_n217BarTipArt, P06R55_A213BarSit, P06R55_A159BarFecGen,
            P06R55_A166BarKgm, P06R55_n166BarKgm
            }
            , new Object[] {
            P06R56_A396EmprCod, P06R56_A6263AlbRTartC, P06R56_n6263AlbRTartC, P06R56_A49AlbRFen, P06R56_A252CliCod, P06R56_A56AlbRUni, P06R56_A58AlbRUniEnt, P06R56_A60AlbRUniUti, P06R56_A44AlbRecCod
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

   private byte AV21vPSit ;
   private byte AV22vUSit ;
   private byte AV20FlagCli ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV45TipArt1 ;
   private short AV46TIpArt2 ;
   private short A217BarTipArt ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV12vPCliCod ;
   private int AV13vUCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV11CliCod ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV19vTotG ;
   private java.math.BigDecimal AV25vTot_Mts_g ;
   private java.math.BigDecimal AV32Tot_A_k ;
   private java.math.BigDecimal AV33Tot_A_m ;
   private java.math.BigDecimal AV40Tot_a_p ;
   private java.math.BigDecimal AV41Tot_a_t ;
   private java.math.BigDecimal AV39Tot_a_a ;
   private java.math.BigDecimal AV18vTotCli ;
   private java.math.BigDecimal AV24vTot_mts_c ;
   private java.math.BigDecimal AV43Tot_p ;
   private java.math.BigDecimal AV44Tot_t ;
   private java.math.BigDecimal AV38Tot_a ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV30Saldo_k ;
   private java.math.BigDecimal AV42Tot_l ;
   private java.math.BigDecimal AV26Tot_Ent_K ;
   private java.math.BigDecimal AV27Tot_Sal_K ;
   private java.math.BigDecimal AV28Tot_Ent_m ;
   private java.math.BigDecimal AV29Tot_Sal_m ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV31Saldo_m ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV16NomEmp ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A56AlbRUni ;
   private String Gx_time ;
   private java.util.Date AV14vPFecGen ;
   private java.util.Date AV15vUFecGen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n6263AlbRTartC ;
   private IDataStoreProvider pr_default ;
   private String[] P06R52_A396EmprCod ;
   private String[] P06R52_A407EmprNom ;
   private boolean[] P06R52_n407EmprNom ;
   private String[] P06R53_A396EmprCod ;
   private int[] P06R53_A252CliCod ;
   private boolean[] P06R53_n252CliCod ;
   private String[] P06R53_A10045CliAct ;
   private String[] P06R53_A279CliNom ;
   private int[] P06R55_A129BarCod ;
   private byte[] P06R55_A132BarCodReo ;
   private String[] P06R55_A130BarCodPar ;
   private String[] P06R55_A396EmprCod ;
   private int[] P06R55_A252CliCod ;
   private boolean[] P06R55_n252CliCod ;
   private short[] P06R55_A217BarTipArt ;
   private boolean[] P06R55_n217BarTipArt ;
   private byte[] P06R55_A213BarSit ;
   private java.util.Date[] P06R55_A159BarFecGen ;
   private java.math.BigDecimal[] P06R55_A166BarKgm ;
   private boolean[] P06R55_n166BarKgm ;
   private String[] P06R56_A396EmprCod ;
   private short[] P06R56_A6263AlbRTartC ;
   private boolean[] P06R56_n6263AlbRTartC ;
   private java.util.Date[] P06R56_A49AlbRFen ;
   private int[] P06R56_A252CliCod ;
   private boolean[] P06R56_n252CliCod ;
   private String[] P06R56_A56AlbRUni ;
   private java.math.BigDecimal[] P06R56_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P06R56_A60AlbRUniUti ;
   private int[] P06R56_A44AlbRecCod ;
}

final  class rmod008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06R53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV12vPCliCod ,
                                          int AV13vUCliCod ,
                                          int A252CliCod ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, CliAct, CliNom FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( ! (0==AV12vPCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV13vUCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_P06R55( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV14vPFecGen ,
                                          java.util.Date AV15vUFecGen ,
                                          byte AV21vPSit ,
                                          byte AV22vUSit ,
                                          short AV45TipArt1 ,
                                          short AV46TIpArt2 ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          short A217BarTipArt ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[8];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.CliCod, T1.BarTipArt, T1.BarSit, T1.BarFecGen, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14vPFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15vUFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV21vPSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV22vUSit) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV45TipArt1) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      if ( ! (0==AV46TIpArt2) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int3[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarSit" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P06R56( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV14vPFecGen ,
                                          java.util.Date AV15vUFecGen ,
                                          short AV45TipArt1 ,
                                          short AV46TIpArt2 ,
                                          java.util.Date A49AlbRFen ,
                                          short A6263AlbRTartC ,
                                          String A396EmprCod ,
                                          int AV11CliCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbRTartC, AlbRFen, CliCod, AlbRUni, AlbRUniEnt, AlbRUniUti, AlbRecCod FROM TXPALBREC" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14vPFecGen)) )
      {
         addWhere(sWhereString, "(AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15vUFecGen)) )
      {
         addWhere(sWhereString, "(AlbRFen <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV45TipArt1) )
      {
         addWhere(sWhereString, "(AlbRTartC >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV46TIpArt2) )
      {
         addWhere(sWhereString, "(AlbRTartC <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06R53(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 2 :
                  return conditional_P06R55(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
            case 3 :
                  return conditional_P06R56(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06R52", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R55", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R56", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  if ( ((Boolean) parms[9]).booleanValue() )
                  {
                     stmt.setNull( sIdx , Types.NUMERIC );
                  }
                  else
                  {
                     stmt.setInt(sIdx, ((Number) parms[10]).intValue());
                  }
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               return;
      }
   }

}

