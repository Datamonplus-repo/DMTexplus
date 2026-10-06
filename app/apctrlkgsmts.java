package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apctrlkgsmts extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apctrlkgsmts pgm = new apctrlkgsmts (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apctrlkgsmts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apctrlkgsmts.class ), "" );
   }

   public apctrlkgsmts( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Ctrl Kgs Mts") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         AV16UsurCod = " " ;
         AV17Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV14EmprCod ;
         GXv_char2[0] = AV15EmprNom ;
         GXv_char3[0] = AV16UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char1, GXv_char2, GXv_char3) ;
         apctrlkgsmts.this.AV14EmprCod = GXv_char1[0] ;
         apctrlkgsmts.this.AV15EmprNom = GXv_char2[0] ;
         apctrlkgsmts.this.AV16UsurCod = GXv_char3[0] ;
         /* Using cursor P04NA2 */
         pr_default.execute(0, new Object[] {AV14EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P04NA2_A396EmprCod[0] ;
            A146BarEst = P04NA2_A146BarEst[0] ;
            A159BarFecGen = P04NA2_A159BarFecGen[0] ;
            A130BarCodPar = P04NA2_A130BarCodPar[0] ;
            A132BarCodReo = P04NA2_A132BarCodReo[0] ;
            A129BarCod = P04NA2_A129BarCod[0] ;
            A213BarSit = P04NA2_A213BarSit[0] ;
            A361DisCod = P04NA2_A361DisCod[0] ;
            A228BarUniMed = P04NA2_A228BarUniMed[0] ;
            AV20Discod = A361DisCod ;
            AV23Barunimed = A228BarUniMed ;
            /* Execute user subroutine: 'STKI' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV19HDRs, httpContext.getMessage( "No Stki", "")) == 0 )
            {
               AV21Barfasest = (byte)(0) ;
               AV22Cosido = (byte)(0) ;
               /* Using cursor P04NA3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A457FasCod = P04NA3_A457FasCod[0] ;
                  A153BarFasEst = P04NA3_A153BarFasEst[0] ;
                  A758ProCod = P04NA3_A758ProCod[0] ;
                  A194BarOrdLin = P04NA3_A194BarOrdLin[0] ;
                  if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "COSIDO", "")) == 0 )
                  {
                     AV21Barfasest = A153BarFasEst ;
                     AV22Cosido = (byte)(1) ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               if ( ( AV22Cosido == 1 ) && ( AV21Barfasest == 2 ) )
               {
                  /* Using cursor P04NA4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A56AlbRUni = P04NA4_A56AlbRUni[0] ;
                     A203BarPieKil = P04NA4_A203BarPieKil[0] ;
                     A205BarPieMet = P04NA4_A205BarPieMet[0] ;
                     A44AlbRecCod = P04NA4_A44AlbRecCod[0] ;
                     A200BarPieCod = P04NA4_A200BarPieCod[0] ;
                     A56AlbRUni = P04NA4_A56AlbRUni[0] ;
                     AV18Barpiecod = A200BarPieCod ;
                     AV24AlbRUni = A56AlbRUni ;
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int4[0] = A129BarCod ;
                     GXv_int5[0] = A132BarCodReo ;
                     GXv_char2[0] = A130BarCodPar ;
                     GXv_char1[0] = AV18Barpiecod ;
                     GXv_decimal6[0] = A203BarPieKil ;
                     GXv_decimal7[0] = A205BarPieMet ;
                     GXv_char8[0] = AV23Barunimed ;
                     GXv_char9[0] = AV24AlbRUni ;
                     GXv_char10[0] = Gx_msg ;
                     new app.pctrlpzcosido(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char1, GXv_decimal6, GXv_decimal7, GXv_char8, GXv_char9, GXv_char10) ;
                     apctrlkgsmts.this.A396EmprCod = GXv_char3[0] ;
                     apctrlkgsmts.this.A129BarCod = GXv_int4[0] ;
                     apctrlkgsmts.this.A132BarCodReo = GXv_int5[0] ;
                     apctrlkgsmts.this.A130BarCodPar = GXv_char2[0] ;
                     apctrlkgsmts.this.AV18Barpiecod = GXv_char1[0] ;
                     apctrlkgsmts.this.A203BarPieKil = GXv_decimal6[0] ;
                     apctrlkgsmts.this.A205BarPieMet = GXv_decimal7[0] ;
                     apctrlkgsmts.this.AV23Barunimed = GXv_char8[0] ;
                     apctrlkgsmts.this.AV24AlbRUni = GXv_char9[0] ;
                     apctrlkgsmts.this.Gx_msg = GXv_char10[0] ;
                     if ( GXutil.strcmp(Gx_msg, " ") != 0 )
                     {
                        h4NA0( false, 16) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 0, Gx_line+0, 59, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 66, Gx_line+0, 74, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 80, Gx_line+0, 88, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Barpiecod, "")), 131, Gx_line+0, 198, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 350, Gx_line+0, 861, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 204, Gx_line+0, 271, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 277, Gx_line+0, 344, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 875, Gx_line+0, 934, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 941, Gx_line+0, 1000, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24AlbRUni, "@!")), 1006, Gx_line+0, 1014, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Barunimed, "@!")), 109, Gx_line+0, 117, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+16) ;
                     }
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado", ""));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4NA0( true, 0) ;
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
      /* 'STKI' Routine */
      returnInSub = false ;
      AV19HDRs = "" ;
      AV31GXLvl51 = (byte)(0) ;
      /* Using cursor P04NA5 */
      pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV20Discod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk4NA6 = false ;
         A361DisCod = P04NA5_A361DisCod[0] ;
         A396EmprCod = P04NA5_A396EmprCod[0] ;
         A3400DisRefBCPa = P04NA5_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = P04NA5_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = P04NA5_A3398DisRefBarC[0] ;
         A3607DisRefBPie = P04NA5_A3607DisRefBPie[0] ;
         AV31GXLvl51 = (byte)(1) ;
         AV19HDRs += ((GXutil.strcmp(AV19HDRs, "")==0) ? "" : ", ") ;
         AV19HDRs += GXutil.trim( GXutil.str( A3398DisRefBarC, 10, 0)) + GXutil.trim( GXutil.str( A3399DisRefBCRe, 10, 0)) + GXutil.trim( A3400DisRefBCPa) ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P04NA5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P04NA5_A361DisCod[0] == A361DisCod ) && ( P04NA5_A3398DisRefBarC[0] == A3398DisRefBarC ) && ( P04NA5_A3399DisRefBCRe[0] == A3399DisRefBCRe ) )
         {
            if ( ! ( ( GXutil.strcmp(P04NA5_A3400DisRefBCPa[0], A3400DisRefBCPa) == 0 ) ) )
            {
               if (true) break;
            }
            brk4NA6 = false ;
            A3607DisRefBPie = P04NA5_A3607DisRefBPie[0] ;
            brk4NA6 = true ;
            pr_default.readNext(3);
         }
         if ( ! brk4NA6 )
         {
            brk4NA6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
      if ( AV31GXLvl51 == 0 )
      {
         AV19HDRs = httpContext.getMessage( "No Stki", "") ;
      }
   }

   public void h4NA0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 131, Gx_line+0, 164, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 241, Gx_line+0, 270, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 302, Gx_line+0, 343, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Partida", ""), 956, Gx_line+0, 999, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fec Hdr", ""), 882, Gx_line+0, 930, Gx_line+14, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
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
      GXutil.refClasses(pctrlkgsmts.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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
      AV16UsurCod = "" ;
      AV17Station = "" ;
      AV14EmprCod = "" ;
      AV15EmprNom = "" ;
      scmdbuf = "" ;
      P04NA2_A396EmprCod = new String[] {""} ;
      P04NA2_A146BarEst = new byte[1] ;
      P04NA2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P04NA2_A130BarCodPar = new String[] {""} ;
      P04NA2_A132BarCodReo = new byte[1] ;
      P04NA2_A129BarCod = new int[1] ;
      P04NA2_A213BarSit = new byte[1] ;
      P04NA2_A361DisCod = new int[1] ;
      P04NA2_A228BarUniMed = new String[] {""} ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      AV23Barunimed = "" ;
      AV19HDRs = "" ;
      P04NA3_A396EmprCod = new String[] {""} ;
      P04NA3_A129BarCod = new int[1] ;
      P04NA3_A132BarCodReo = new byte[1] ;
      P04NA3_A130BarCodPar = new String[] {""} ;
      P04NA3_A457FasCod = new String[] {""} ;
      P04NA3_A153BarFasEst = new byte[1] ;
      P04NA3_A758ProCod = new String[] {""} ;
      P04NA3_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P04NA4_A396EmprCod = new String[] {""} ;
      P04NA4_A129BarCod = new int[1] ;
      P04NA4_A132BarCodReo = new byte[1] ;
      P04NA4_A130BarCodPar = new String[] {""} ;
      P04NA4_A56AlbRUni = new String[] {""} ;
      P04NA4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04NA4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04NA4_A44AlbRecCod = new int[1] ;
      P04NA4_A200BarPieCod = new String[] {""} ;
      A56AlbRUni = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV18Barpiecod = "" ;
      AV24AlbRUni = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      Gx_msg = "" ;
      GXv_char10 = new String[1] ;
      A3400DisRefBCPa = "" ;
      P04NA5_A361DisCod = new int[1] ;
      P04NA5_A396EmprCod = new String[] {""} ;
      P04NA5_A3400DisRefBCPa = new String[] {""} ;
      P04NA5_A3399DisRefBCRe = new byte[1] ;
      P04NA5_A3398DisRefBarC = new int[1] ;
      P04NA5_A3607DisRefBPie = new String[] {""} ;
      A3607DisRefBPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apctrlkgsmts__default(),
         new Object[] {
             new Object[] {
            P04NA2_A396EmprCod, P04NA2_A146BarEst, P04NA2_A159BarFecGen, P04NA2_A130BarCodPar, P04NA2_A132BarCodReo, P04NA2_A129BarCod, P04NA2_A213BarSit, P04NA2_A361DisCod, P04NA2_A228BarUniMed
            }
            , new Object[] {
            P04NA3_A396EmprCod, P04NA3_A129BarCod, P04NA3_A132BarCodReo, P04NA3_A130BarCodPar, P04NA3_A457FasCod, P04NA3_A153BarFasEst, P04NA3_A758ProCod, P04NA3_A194BarOrdLin
            }
            , new Object[] {
            P04NA4_A396EmprCod, P04NA4_A129BarCod, P04NA4_A132BarCodReo, P04NA4_A130BarCodPar, P04NA4_A56AlbRUni, P04NA4_A203BarPieKil, P04NA4_A205BarPieMet, P04NA4_A44AlbRecCod, P04NA4_A200BarPieCod
            }
            , new Object[] {
            P04NA5_A361DisCod, P04NA5_A396EmprCod, P04NA5_A3400DisRefBCPa, P04NA5_A3399DisRefBCRe, P04NA5_A3398DisRefBarC, P04NA5_A3607DisRefBPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A146BarEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV21Barfasest ;
   private byte AV22Cosido ;
   private byte A153BarFasEst ;
   private byte GXv_int5[] ;
   private byte A3399DisRefBCRe ;
   private byte AV31GXLvl51 ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV20Discod ;
   private int A44AlbRecCod ;
   private int GXv_int4[] ;
   private int Gx_OldLine ;
   private int A3398DisRefBarC ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String AV16UsurCod ;
   private String AV17Station ;
   private String AV14EmprCod ;
   private String AV15EmprNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String AV23Barunimed ;
   private String AV19HDRs ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A56AlbRUni ;
   private String A200BarPieCod ;
   private String AV18Barpiecod ;
   private String AV24AlbRUni ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String Gx_msg ;
   private String GXv_char10[] ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean brk4NA6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NA2_A396EmprCod ;
   private byte[] P04NA2_A146BarEst ;
   private java.util.Date[] P04NA2_A159BarFecGen ;
   private String[] P04NA2_A130BarCodPar ;
   private byte[] P04NA2_A132BarCodReo ;
   private int[] P04NA2_A129BarCod ;
   private byte[] P04NA2_A213BarSit ;
   private int[] P04NA2_A361DisCod ;
   private String[] P04NA2_A228BarUniMed ;
   private String[] P04NA3_A396EmprCod ;
   private int[] P04NA3_A129BarCod ;
   private byte[] P04NA3_A132BarCodReo ;
   private String[] P04NA3_A130BarCodPar ;
   private String[] P04NA3_A457FasCod ;
   private byte[] P04NA3_A153BarFasEst ;
   private String[] P04NA3_A758ProCod ;
   private short[] P04NA3_A194BarOrdLin ;
   private String[] P04NA4_A396EmprCod ;
   private int[] P04NA4_A129BarCod ;
   private byte[] P04NA4_A132BarCodReo ;
   private String[] P04NA4_A130BarCodPar ;
   private String[] P04NA4_A56AlbRUni ;
   private java.math.BigDecimal[] P04NA4_A203BarPieKil ;
   private java.math.BigDecimal[] P04NA4_A205BarPieMet ;
   private int[] P04NA4_A44AlbRecCod ;
   private String[] P04NA4_A200BarPieCod ;
   private int[] P04NA5_A361DisCod ;
   private String[] P04NA5_A396EmprCod ;
   private String[] P04NA5_A3400DisRefBCPa ;
   private byte[] P04NA5_A3399DisRefBCRe ;
   private int[] P04NA5_A3398DisRefBarC ;
   private String[] P04NA5_A3607DisRefBPie ;
}

final  class apctrlkgsmts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NA2", "SELECT EmprCod, BarEst, BarFecGen, BarCodPar, BarCodReo, BarCod, BarSit, DisCod, BarUniMed FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarEst = 0) AND (BarSit <= 9) ORDER BY EmprCod, BarSit, BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04NA3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04NA4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRUni, T1.BarPieKil, T1.BarPieMet, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04NA5", "SELECT DisCod, EmprCod, DisRefBCPa, DisRefBCRe, DisRefBarC, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

