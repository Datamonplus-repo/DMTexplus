package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputent01 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputent01 pgm = new aputent01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      java.util.Date[] aP1 = new java.util.Date[] {GXutil.nullDate()};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (java.util.Date) localUtil.ctod( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public aputent01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputent01.class ), "" );
   }

   public aputent01( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      aputent01.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      aputent01.this.AV20EmprCod = aP0[0];
      this.aP0 = aP0;
      aputent01.this.AV50RecFec = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
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
         getPrinter().GxSetDocName("UTIL.AJUSTE ENTRADA ALMACEN") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV26Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV20EmprCod ;
         GXv_char2[0] = AV27EmprNom ;
         GXv_char3[0] = AV28UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char1, GXv_char2, GXv_char3) ;
         aputent01.this.AV20EmprCod = GXv_char1[0] ;
         aputent01.this.AV27EmprNom = GXv_char2[0] ;
         aputent01.this.AV28UsurCod = GXv_char3[0] ;
         System.out.println( httpContext.getMessage( "Ajuste ENTALM y CCSTKS con Stock Almacen ", "") );
         AV52Dia = GXutil.str( GXutil.day( AV50RecFec), 2, 0) ;
         AV53Mes = GXutil.str( GXutil.month( AV50RecFec), 2, 0) ;
         AV54Year = GXutil.str( GXutil.year( AV50RecFec), 4, 0) ;
         AV55Any = GXutil.substring( AV54Year, 3, 2) ;
         if ( GXutil.len( GXutil.trim( AV52Dia)) == 1 )
         {
            AV52Dia = "0" + GXutil.trim( AV52Dia) ;
         }
         AV51Albaran = httpContext.getMessage( "REC.", "") + AV52Dia + AV53Mes + AV55Any ;
         /* Using cursor P036P2 */
         pr_default.execute(0, new Object[] {AV20EmprCod, AV50RecFec});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A810RecFec = P036P2_A810RecFec[0] ;
            A396EmprCod = P036P2_A396EmprCod[0] ;
            A704PrdExiAlm = P036P2_A704PrdExiAlm[0] ;
            A807RecExiRea = P036P2_A807RecExiRea[0] ;
            A3341CCStKULin = P036P2_A3341CCStKULin[0] ;
            n3341CCStKULin = P036P2_n3341CCStKULin[0] ;
            A724PrdPreAct = P036P2_A724PrdPreAct[0] ;
            A718PrdNom = P036P2_A718PrdNom[0] ;
            A719PrdNum = P036P2_A719PrdNum[0] ;
            A704PrdExiAlm = P036P2_A704PrdExiAlm[0] ;
            A3341CCStKULin = P036P2_A3341CCStKULin[0] ;
            n3341CCStKULin = P036P2_n3341CCStKULin[0] ;
            A724PrdPreAct = P036P2_A724PrdPreAct[0] ;
            A718PrdNom = P036P2_A718PrdNom[0] ;
            AV49FecRec = A810RecFec ;
            AV18PrdNum = A719PrdNum ;
            AV22PrdExiAlm = A704PrdExiAlm ;
            AV46RecExiRea = A807RecExiRea ;
            AV20EmprCod = A396EmprCod ;
            AV47CCStkULin = A3341CCStKULin ;
            AV48PrdPreAct = A724PrdPreAct ;
            /* Execute user subroutine: 'ENTALM' */
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
            /* Execute user subroutine: 'CCSTKS' */
            S121 ();
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
            if ( ( AV47CCStkULin == 0 ) || ( AV45CcStks == 0 ) )
            {
               GXv_char3[0] = AV20EmprCod ;
               GXv_char2[0] = AV18PrdNum ;
               GXv_decimal4[0] = AV46RecExiRea ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_char1[0] = httpContext.getMessage( "SR", "") ;
               GXv_char6[0] = "1" ;
               GXv_decimal7[0] = AV48PrdPreAct ;
               GXv_int8[0] = 0 ;
               GXv_int9[0] = (byte)(0) ;
               GXv_char10[0] = " " ;
               GXv_int11[0] = 0 ;
               GXv_char12[0] = " " ;
               GXv_char13[0] = AV28UsurCod ;
               GXv_char14[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
               GXv_int15[0] = (short)(0) ;
               GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date18[0] = AV49FecRec ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal4, GXv_decimal5, GXv_char1, GXv_char6, GXv_decimal7, GXv_int8, GXv_int9, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_decimal16, GXv_decimal17, GXv_date18) ;
               aputent01.this.AV20EmprCod = GXv_char3[0] ;
               aputent01.this.AV18PrdNum = GXv_char2[0] ;
               aputent01.this.AV46RecExiRea = GXv_decimal4[0] ;
               aputent01.this.AV48PrdPreAct = GXv_decimal7[0] ;
               aputent01.this.AV28UsurCod = GXv_char13[0] ;
               aputent01.this.AV49FecRec = GXv_date18[0] ;
            }
            if ( ( AV45CcStks == 1 ) && ( AV44EntAlm == 1 ) )
            {
               h36P0( false, 17) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 19, Gx_line+2, 83, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 91, Gx_line+2, 227, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PrdExiAlm, "ZZZZZZ9.9999")), 264, Gx_line+2, 340, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41EntUniEnt, "ZZZZZ9.99")), 469, Gx_line+2, 526, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42EntUniRem, "ZZZZZ9.9999")), 555, Gx_line+2, 625, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43CCStkCanE, "ZZZZZZ9.9999")), 669, Gx_line+2, 745, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46RecExiRea, "ZZZZZZ9.9999")), 367, Gx_line+2, 443, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               if ( AV45CcStks == 0 )
               {
                  AV56MarcaCC = "*" ;
               }
               if ( AV44EntAlm == 0 )
               {
                  AV57MarcaENT = "*" ;
               }
               h36P0( false, 17) ;
               getPrinter().GxAttris("Tahoma", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 19, Gx_line+2, 89, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 91, Gx_line+2, 255, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PrdExiAlm, "ZZZZZZ9.9999")), 264, Gx_line+2, 340, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56MarcaCC, "")), 760, Gx_line+2, 772, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57MarcaENT, "")), 631, Gx_line+2, 643, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43CCStkCanE, "ZZZZZZ9.9999")), 669, Gx_line+2, 745, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42EntUniRem, "ZZZZZ9.9999")), 555, Gx_line+2, 625, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41EntUniEnt, "ZZZZZ9.99")), 469, Gx_line+2, 526, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46RecExiRea, "ZZZZZZ9.9999")), 367, Gx_line+2, 443, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV21mENSA = httpContext.getMessage( "Producto= ", "") + AV18PrdNum + httpContext.getMessage( " Stock= ", "") + GXutil.str( AV22PrdExiAlm, 12, 4) ;
            System.out.println( AV21mENSA );
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h36P0( true, 0) ;
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
      /* 'ENTALM' Routine */
      returnInSub = false ;
      AV44EntAlm = (byte)(0) ;
      AV41EntUniEnt = DecimalUtil.ZERO ;
      AV42EntUniRem = DecimalUtil.ZERO ;
      /* Using cursor P036P3 */
      pr_default.execute(1, new Object[] {AV20EmprCod, AV18PrdNum, AV51Albaran});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11Albaran = P036P3_A11Albaran[0] ;
         A719PrdNum = P036P3_A719PrdNum[0] ;
         A396EmprCod = P036P3_A396EmprCod[0] ;
         A419EntUniRem = P036P3_A419EntUniRem[0] ;
         A418EntUniEnt = P036P3_A418EntUniEnt[0] ;
         A597LinEnt = P036P3_A597LinEnt[0] ;
         A419EntUniRem = AV22PrdExiAlm ;
         A418EntUniEnt = AV46RecExiRea ;
         AV41EntUniEnt = A418EntUniEnt ;
         AV42EntUniRem = A419EntUniRem ;
         AV44EntAlm = (byte)(1) ;
         /* Using cursor P036P4 */
         pr_default.execute(2, new Object[] {A419EntUniRem, A418EntUniEnt, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      AV45CcStks = (byte)(0) ;
      AV43CCStkCanE = DecimalUtil.ZERO ;
      /* Using cursor P036P5 */
      pr_default.execute(3, new Object[] {AV20EmprCod, AV18PrdNum, AV50RecFec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A3348CCStkFec = P036P5_A3348CCStkFec[0] ;
         A3345TipMovCc = P036P5_A3345TipMovCc[0] ;
         A719PrdNum = P036P5_A719PrdNum[0] ;
         A396EmprCod = P036P5_A396EmprCod[0] ;
         A3343CCStkCanE = P036P5_A3343CCStkCanE[0] ;
         A3342CCStkLin = P036P5_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            A3343CCStkCanE = AV46RecExiRea ;
            AV43CCStkCanE = A3343CCStkCanE ;
            AV45CcStks = (byte)(1) ;
            /* Using cursor P036P6 */
            pr_default.execute(4, new Object[] {A3343CCStkCanE, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h36P0( boolean bFoot ,
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
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "AJUSTE ENTRADA ALMACEN Y CCSTK S TRAS RECUENTO -", ""), 17, Gx_line+13, 342, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 519, Gx_line+14, 566, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 618, Gx_line+14, 702, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 721, Gx_line+14, 760, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(3, Gx_line+31, 798, Gx_line+31, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 19, Gx_line+51, 73, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Existencia Real", ""), 358, Gx_line+51, 448, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 471, Gx_line+51, 526, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remanente", ""), 555, Gx_line+52, 625, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+68, 799, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 692, Gx_line+14, 718, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidades Recuento ", ""), 648, Gx_line+51, 766, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENTRADA ALMACEN", ""), 493, Gx_line+38, 605, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CTA.CTE", ""), 682, Gx_line+38, 730, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RECUENTO", ""), 376, Gx_line+38, 436, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "STOCK", ""), 282, Gx_line+39, 321, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Almacen", ""), 275, Gx_line+51, 327, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Albaran, "")), 347, Gx_line+13, 400, Gx_line+28, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+74) ;
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

   public static Object refClasses( )
   {
      GXutil.refClasses(putent01.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = aputent01.this.AV20EmprCod;
      this.aP1[0] = aputent01.this.AV50RecFec;
      Application.commitDataStores(context, remoteHandle, pr_default, "aputent01");
      if (Application.realMainProgram == this)	waitPrinterEnd();
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Station = "" ;
      AV27EmprNom = "" ;
      AV28UsurCod = "" ;
      AV52Dia = "" ;
      AV53Mes = "" ;
      AV54Year = "" ;
      AV55Any = "" ;
      AV51Albaran = "" ;
      scmdbuf = "" ;
      P036P2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P036P2_A396EmprCod = new String[] {""} ;
      P036P2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036P2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036P2_A3341CCStKULin = new long[1] ;
      P036P2_n3341CCStKULin = new boolean[] {false} ;
      P036P2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036P2_A718PrdNom = new String[] {""} ;
      P036P2_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV49FecRec = GXutil.nullDate() ;
      AV18PrdNum = "" ;
      AV22PrdExiAlm = DecimalUtil.ZERO ;
      AV46RecExiRea = DecimalUtil.ZERO ;
      AV48PrdPreAct = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_date18 = new java.util.Date[1] ;
      AV41EntUniEnt = DecimalUtil.ZERO ;
      AV42EntUniRem = DecimalUtil.ZERO ;
      AV43CCStkCanE = DecimalUtil.ZERO ;
      AV56MarcaCC = "" ;
      AV57MarcaENT = "" ;
      AV21mENSA = "" ;
      P036P3_A11Albaran = new String[] {""} ;
      P036P3_A719PrdNum = new String[] {""} ;
      P036P3_A396EmprCod = new String[] {""} ;
      P036P3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036P3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036P3_A597LinEnt = new short[1] ;
      A11Albaran = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      P036P5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P036P5_A3345TipMovCc = new String[] {""} ;
      P036P5_A719PrdNum = new String[] {""} ;
      P036P5_A396EmprCod = new String[] {""} ;
      P036P5_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036P5_A3342CCStkLin = new long[1] ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputent01__default(),
         new Object[] {
             new Object[] {
            P036P2_A810RecFec, P036P2_A396EmprCod, P036P2_A704PrdExiAlm, P036P2_A807RecExiRea, P036P2_A3341CCStKULin, P036P2_n3341CCStKULin, P036P2_A724PrdPreAct, P036P2_A718PrdNom, P036P2_A719PrdNum
            }
            , new Object[] {
            P036P3_A11Albaran, P036P3_A719PrdNum, P036P3_A396EmprCod, P036P3_A419EntUniRem, P036P3_A418EntUniEnt, P036P3_A597LinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P036P5_A3348CCStkFec, P036P5_A3345TipMovCc, P036P5_A719PrdNum, P036P5_A396EmprCod, P036P5_A3343CCStkCanE, P036P5_A3342CCStkLin
            }
            , new Object[] {
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

   private byte AV45CcStks ;
   private byte GXv_int9[] ;
   private byte AV44EntAlm ;
   private short GXv_int15[] ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int Gx_OldLine ;
   private long A3341CCStKULin ;
   private long AV47CCStkULin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV22PrdExiAlm ;
   private java.math.BigDecimal AV46RecExiRea ;
   private java.math.BigDecimal AV48PrdPreAct ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal AV41EntUniEnt ;
   private java.math.BigDecimal AV42EntUniRem ;
   private java.math.BigDecimal AV43CCStkCanE ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private String AV20EmprCod ;
   private String AV26Station ;
   private String AV27EmprNom ;
   private String AV28UsurCod ;
   private String AV52Dia ;
   private String AV53Mes ;
   private String AV54Year ;
   private String AV55Any ;
   private String AV51Albaran ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV18PrdNum ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String AV56MarcaCC ;
   private String AV57MarcaENT ;
   private String AV21mENSA ;
   private String A11Albaran ;
   private String A3345TipMovCc ;
   private String Gx_time ;
   private java.util.Date AV50RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV49FecRec ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private boolean n3341CCStKULin ;
   private boolean returnInSub ;
   private java.util.Date[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P036P2_A810RecFec ;
   private String[] P036P2_A396EmprCod ;
   private java.math.BigDecimal[] P036P2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P036P2_A807RecExiRea ;
   private long[] P036P2_A3341CCStKULin ;
   private boolean[] P036P2_n3341CCStKULin ;
   private java.math.BigDecimal[] P036P2_A724PrdPreAct ;
   private String[] P036P2_A718PrdNom ;
   private String[] P036P2_A719PrdNum ;
   private String[] P036P3_A11Albaran ;
   private String[] P036P3_A719PrdNum ;
   private String[] P036P3_A396EmprCod ;
   private java.math.BigDecimal[] P036P3_A419EntUniRem ;
   private java.math.BigDecimal[] P036P3_A418EntUniEnt ;
   private short[] P036P3_A597LinEnt ;
   private java.util.Date[] P036P5_A3348CCStkFec ;
   private String[] P036P5_A3345TipMovCc ;
   private String[] P036P5_A719PrdNum ;
   private String[] P036P5_A396EmprCod ;
   private java.math.BigDecimal[] P036P5_A3343CCStkCanE ;
   private long[] P036P5_A3342CCStkLin ;
}

final  class aputent01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036P2", "SELECT T1.RecFec, T1.EmprCod, T2.PrdExiAlm, T1.RecExiRea, T2.CCStKULin, T2.PrdPreAct, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.RecFec = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P036P3", "SELECT Albaran, PrdNum, EmprCod, EntUniRem, EntUniEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (Albaran = ?) ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P036P4", "UPDATE TXPENTALM SET EntUniRem=?, EntUniEnt=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P036P5", "SELECT CCStkFec, TipMovCc, PrdNum, EmprCod, CCStkCanE, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkFec = ?) ORDER BY EmprCod, PrdNum, CCStkLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P036P6", "UPDATE TXPCCSTKS SET CCStkCanE=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

