package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rst0015r extends GXReport
{
   public rst0015r( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rst0015r.class ), "" );
   }

   public rst0015r( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      rst0015r.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      rst0015r.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rst0015r.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORMACION PRODUCTOS RECETAS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07E72 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07E72_A407EmprNom[0] ;
            n407EmprNom = P07E72_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07E73 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P07E73_A719PrdNum[0] ;
            n719PrdNum = P07E73_n719PrdNum[0] ;
            A718PrdNom = P07E73_A718PrdNom[0] ;
            AV11PrdNom = A718PrdNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV16FlagRec = (byte)(0) ;
         /* Using cursor P07E74 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P07E74_A719PrdNum[0] ;
            n719PrdNum = P07E74_n719PrdNum[0] ;
            A1273RecLinPro = P07E74_A1273RecLinPro[0] ;
            A252CliCod = P07E74_A252CliCod[0] ;
            n252CliCod = P07E74_n252CliCod[0] ;
            A129BarCod = P07E74_A129BarCod[0] ;
            A132BarCodReo = P07E74_A132BarCodReo[0] ;
            A130BarCodPar = P07E74_A130BarCodPar[0] ;
            A212BarSer = P07E74_A212BarSer[0] ;
            A135BarColNom = P07E74_A135BarColNom[0] ;
            A136BarColNum = P07E74_A136BarColNum[0] ;
            A218BarTipCol = P07E74_A218BarTipCol[0] ;
            A2804RecLinMaq = P07E74_A2804RecLinMaq[0] ;
            A686PrdCant = P07E74_A686PrdCant[0] ;
            A490ForPrdUMe = P07E74_A490ForPrdUMe[0] ;
            n490ForPrdUMe = P07E74_n490ForPrdUMe[0] ;
            A488ForPrdDsc = P07E74_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P07E74_n488ForPrdDsc[0] ;
            A213BarSit = P07E74_A213BarSit[0] ;
            A811RecLin = P07E74_A811RecLin[0] ;
            A488ForPrdDsc = P07E74_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P07E74_n488ForPrdDsc[0] ;
            A252CliCod = P07E74_A252CliCod[0] ;
            n252CliCod = P07E74_n252CliCod[0] ;
            A212BarSer = P07E74_A212BarSer[0] ;
            A135BarColNom = P07E74_A135BarColNom[0] ;
            A136BarColNum = P07E74_A136BarColNum[0] ;
            A218BarTipCol = P07E74_A218BarTipCol[0] ;
            A213BarSit = P07E74_A213BarSit[0] ;
            if ( AV16FlagRec == 0 )
            {
               AV16FlagRec = (byte)(1) ;
               h7E70( false, 55) ;
               getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "( Recetas )", ""), 303, Gx_line+8, 368, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hoja Ruta", ""), 26, Gx_line+34, 83, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 115, Gx_line+34, 157, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 175, Gx_line+34, 207, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 320, Gx_line+34, 352, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+50, 760, Gx_line+50, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 541, Gx_line+34, 592, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 618, Gx_line+34, 674, Gx_line+50, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+55) ;
            }
            AV28Clicod = A252CliCod ;
            AV18barcod = A129BarCod ;
            AV19barcodreo = A132BarCodReo ;
            AV20Barcodpar = A130BarCodPar ;
            AV21barSer = A212BarSer ;
            AV22Barcolnom = A135BarColNom ;
            AV23Barcolnum = A136BarColNum ;
            AV24barTipCol = A218BarTipCol ;
            AV30RecLinMaq = A2804RecLinMaq ;
            /* Execute user subroutine: 'RECMAQ' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV26Prdcant = A686PrdCant ;
            if ( A490ForPrdUMe == 3 )
            {
               AV27Forprddsc = httpContext.getMessage( "Gr", "") ;
            }
            else
            {
               AV27Forprddsc = A488ForPrdDsc ;
            }
            AV29BarSit = A213BarSit ;
            AV31Tot_ct = AV31Tot_ct.add(A686PrdCant) ;
            /* Execute user subroutine: 'LRECET' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV31Tot_ct.doubleValue() > 0 )
         {
            h7E70( false, 25) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Tot_ct, "Z,ZZZ,ZZ9.999")), 578, Gx_line+4, 674, Gx_line+21, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+25) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7E70( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'LRECET' Routine */
      returnInSub = false ;
      h7E70( false, 17) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18barcod), "ZZZZZZZ9")), 19, Gx_line+0, 78, Gx_line+17, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19barcodreo), "9")), 82, Gx_line+1, 90, Gx_line+18, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Barcodpar, "")), 95, Gx_line+1, 103, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")), 119, Gx_line+1, 164, Gx_line+18, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 174, Gx_line+0, 292, Gx_line+17, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Barcolnom, "")), 311, Gx_line+1, 407, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23Barcolnum), "ZZZZZ9")), 421, Gx_line+1, 466, Gx_line+18, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24barTipCol), "Z9")), 479, Gx_line+1, 495, Gx_line+18, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarSit), "Z9")), 515, Gx_line+1, 531, Gx_line+18, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Maqcod, "")), 544, Gx_line+1, 589, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Prdcant, "ZZZZZZ9.999")), 593, Gx_line+1, 674, Gx_line+18, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Forprddsc, "")), 677, Gx_line+0, 714, Gx_line+17, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21barSer, "")), 174, Gx_line+1, 292, Gx_line+18, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+17) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      /* Using cursor P07E75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18barcod), Byte.valueOf(AV19barcodreo), AV20Barcodpar, Short.valueOf(AV30RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2804RecLinMaq = P07E75_A2804RecLinMaq[0] ;
         A130BarCodPar = P07E75_A130BarCodPar[0] ;
         A132BarCodReo = P07E75_A132BarCodReo[0] ;
         A129BarCod = P07E75_A129BarCod[0] ;
         A602MaqCod = P07E75_A602MaqCod[0] ;
         AV25Maqcod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h7E70( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 11, Gx_line+11, 324, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Informacion Producto", ""), 11, Gx_line+41, 185, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+66, 759, Gx_line+66, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 619, Gx_line+43, 661, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 692, Gx_line+43, 737, Gx_line+60, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11PrdNom, "")), 252, Gx_line+43, 443, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8PrdNum, "")), 202, Gx_line+43, 247, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha ", ""), 501, Gx_line+13, 541, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 553, Gx_line+13, 612, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Pgmname, "")), 544, Gx_line+43, 764, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 631, Gx_line+13, 660, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 686, Gx_line+13, 745, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 541, Gx_line+13, 545, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 668, Gx_line+13, 672, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 668, Gx_line+43, 672, Gx_line+59, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+71) ;
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

   protected void cleanup( )
   {
      this.aP0[0] = rst0015r.this.A396EmprCod;
      this.aP1[0] = rst0015r.this.AV8PrdNum;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P07E72_A396EmprCod = new String[] {""} ;
      P07E72_A407EmprNom = new String[] {""} ;
      P07E72_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      P07E73_A396EmprCod = new String[] {""} ;
      P07E73_A719PrdNum = new String[] {""} ;
      P07E73_n719PrdNum = new boolean[] {false} ;
      P07E73_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV11PrdNom = "" ;
      P07E74_A396EmprCod = new String[] {""} ;
      P07E74_A719PrdNum = new String[] {""} ;
      P07E74_n719PrdNum = new boolean[] {false} ;
      P07E74_A1273RecLinPro = new byte[1] ;
      P07E74_A252CliCod = new int[1] ;
      P07E74_n252CliCod = new boolean[] {false} ;
      P07E74_A129BarCod = new int[1] ;
      P07E74_A132BarCodReo = new byte[1] ;
      P07E74_A130BarCodPar = new String[] {""} ;
      P07E74_A212BarSer = new String[] {""} ;
      P07E74_A135BarColNom = new String[] {""} ;
      P07E74_A136BarColNum = new int[1] ;
      P07E74_A218BarTipCol = new byte[1] ;
      P07E74_A2804RecLinMaq = new short[1] ;
      P07E74_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07E74_A490ForPrdUMe = new byte[1] ;
      P07E74_n490ForPrdUMe = new boolean[] {false} ;
      P07E74_A488ForPrdDsc = new String[] {""} ;
      P07E74_n488ForPrdDsc = new boolean[] {false} ;
      P07E74_A213BarSit = new byte[1] ;
      P07E74_A811RecLin = new short[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV20Barcodpar = "" ;
      AV21barSer = "" ;
      AV22Barcolnom = "" ;
      AV26Prdcant = DecimalUtil.ZERO ;
      AV27Forprddsc = "" ;
      AV31Tot_ct = DecimalUtil.ZERO ;
      AV25Maqcod = "" ;
      P07E75_A396EmprCod = new String[] {""} ;
      P07E75_A2804RecLinMaq = new short[1] ;
      P07E75_A130BarCodPar = new String[] {""} ;
      P07E75_A132BarCodReo = new byte[1] ;
      P07E75_A129BarCod = new int[1] ;
      P07E75_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV42Pgmname = "" ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0015r__default(),
         new Object[] {
             new Object[] {
            P07E72_A396EmprCod, P07E72_A407EmprNom, P07E72_n407EmprNom
            }
            , new Object[] {
            P07E73_A396EmprCod, P07E73_A719PrdNum, P07E73_A718PrdNom
            }
            , new Object[] {
            P07E74_A396EmprCod, P07E74_A719PrdNum, P07E74_n719PrdNum, P07E74_A1273RecLinPro, P07E74_A252CliCod, P07E74_n252CliCod, P07E74_A129BarCod, P07E74_A132BarCodReo, P07E74_A130BarCodPar, P07E74_A212BarSer,
            P07E74_A135BarColNom, P07E74_A136BarColNum, P07E74_A218BarTipCol, P07E74_A2804RecLinMaq, P07E74_A686PrdCant, P07E74_A490ForPrdUMe, P07E74_n490ForPrdUMe, P07E74_A488ForPrdDsc, P07E74_n488ForPrdDsc, P07E74_A213BarSit,
            P07E74_A811RecLin
            }
            , new Object[] {
            P07E75_A396EmprCod, P07E75_A2804RecLinMaq, P07E75_A130BarCodPar, P07E75_A132BarCodReo, P07E75_A129BarCod, P07E75_A602MaqCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      AV42Pgmname = "RST0015r" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      AV42Pgmname = "RST0015r" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV16FlagRec ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A490ForPrdUMe ;
   private byte A213BarSit ;
   private byte AV19barcodreo ;
   private byte AV24barTipCol ;
   private byte AV29BarSit ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV30RecLinMaq ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int Gx_OldLine ;
   private int AV28Clicod ;
   private int AV18barcod ;
   private int AV23Barcolnum ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV26Prdcant ;
   private java.math.BigDecimal AV31Tot_ct ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV11PrdNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A488ForPrdDsc ;
   private String AV20Barcodpar ;
   private String AV21barSer ;
   private String AV22Barcolnom ;
   private String AV27Forprddsc ;
   private String AV25Maqcod ;
   private String A602MaqCod ;
   private String AV42Pgmname ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n719PrdNum ;
   private boolean n252CliCod ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07E72_A396EmprCod ;
   private String[] P07E72_A407EmprNom ;
   private boolean[] P07E72_n407EmprNom ;
   private String[] P07E73_A396EmprCod ;
   private String[] P07E73_A719PrdNum ;
   private boolean[] P07E73_n719PrdNum ;
   private String[] P07E73_A718PrdNom ;
   private String[] P07E74_A396EmprCod ;
   private String[] P07E74_A719PrdNum ;
   private boolean[] P07E74_n719PrdNum ;
   private byte[] P07E74_A1273RecLinPro ;
   private int[] P07E74_A252CliCod ;
   private boolean[] P07E74_n252CliCod ;
   private int[] P07E74_A129BarCod ;
   private byte[] P07E74_A132BarCodReo ;
   private String[] P07E74_A130BarCodPar ;
   private String[] P07E74_A212BarSer ;
   private String[] P07E74_A135BarColNom ;
   private int[] P07E74_A136BarColNum ;
   private byte[] P07E74_A218BarTipCol ;
   private short[] P07E74_A2804RecLinMaq ;
   private java.math.BigDecimal[] P07E74_A686PrdCant ;
   private byte[] P07E74_A490ForPrdUMe ;
   private boolean[] P07E74_n490ForPrdUMe ;
   private String[] P07E74_A488ForPrdDsc ;
   private boolean[] P07E74_n488ForPrdDsc ;
   private byte[] P07E74_A213BarSit ;
   private short[] P07E74_A811RecLin ;
   private String[] P07E75_A396EmprCod ;
   private short[] P07E75_A2804RecLinMaq ;
   private String[] P07E75_A130BarCodPar ;
   private byte[] P07E75_A132BarCodReo ;
   private int[] P07E75_A129BarCod ;
   private String[] P07E75_A602MaqCod ;
}

final  class rst0015r__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07E72", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07E73", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07E74", "SELECT T1.EmprCod, T1.PrdNum, T1.RecLinPro, T3.CliCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T1.RecLinMaq, T1.PrdCant, T1.ForPrdUMe, T2.ForPrdDsc, T3.BarSit, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07E75", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((short[]) buf[20])[0] = rslt.getShort(17);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

