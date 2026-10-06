package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apadt001 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apadt001 pgm = new apadt001 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apadt001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apadt001.class ), "" );
   }

   public apadt001( int remoteHandle ,
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Auditoria Hdrs Cerradas en automatico") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         AV18station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV19EMprcod ;
         GXv_char2[0] = AV20EmprNom ;
         GXv_char3[0] = AV21Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV18station, GXv_char1, GXv_char2, GXv_char3) ;
         apadt001.this.AV19EMprcod = GXv_char1[0] ;
         apadt001.this.AV20EmprNom = GXv_char2[0] ;
         apadt001.this.AV21Usurcod = GXv_char3[0] ;
         AV26Numr = 0 ;
         AV27NumRecmaq = 0 ;
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV28Tab_hdr[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV29i = (short)(1) ;
         /* Using cursor P04UY2 */
         pr_default.execute(0, new Object[] {AV19EMprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P04UY2_A396EmprCod[0] ;
            A4701RecRecep = P04UY2_A4701RecRecep[0] ;
            A10385RecCAut = P04UY2_A10385RecCAut[0] ;
            A6039RecAcab = P04UY2_A6039RecAcab[0] ;
            n6039RecAcab = P04UY2_n6039RecAcab[0] ;
            A129BarCod = P04UY2_A129BarCod[0] ;
            A2804RecLinMaq = P04UY2_A2804RecLinMaq[0] ;
            A130BarCodPar = P04UY2_A130BarCodPar[0] ;
            A132BarCodReo = P04UY2_A132BarCodReo[0] ;
            A602MaqCod = P04UY2_A602MaqCod[0] ;
            A4866RecFecAlt = P04UY2_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P04UY2_n4866RecFecAlt[0] ;
            if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
            {
               AV22Barcod = A129BarCod ;
               AV30RecLinMaq = A2804RecLinMaq ;
               /* Execute user subroutine: 'CRECET' */
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
               /* Execute user subroutine: 'HISREH' */
               S121 ();
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
               if ( ( AV25Hisreh == 1 ) && ( AV31Crecet == 0 ) )
               {
                  AV26Numr = (int)(AV26Numr+1) ;
                  AV28Tab_hdr[AV29i-1] = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.str( A2804RecLinMaq, 4, 0) ;
                  AV29i = (short)(AV29i+1) ;
                  h4UY0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 7, Gx_line+0, 66, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 73, Gx_line+0, 81, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 88, Gx_line+0, 96, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), 102, Gx_line+0, 132, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31Crecet), "9")), 430, Gx_line+0, 438, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32Lrecet), "9")), 489, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25Hisreh), "ZZZZZ9")), 547, Gx_line+0, 592, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV33HreFecTin, "99/99/99"), 598, Gx_line+0, 657, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 139, Gx_line+0, 242, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 248, Gx_line+0, 293, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               AV27NumRecmaq = (int)(AV27NumRecmaq+1) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         Gx_msg = httpContext.getMessage( "Registros Procesados RECMAQ                               ", "") + GXutil.str( AV27NumRecmaq, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Registros existentes en HISREMH pero NO en CRECET,LRECET ", "") + GXutil.str( AV26Numr, 6, 0) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4UY0( true, 0) ;
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
      /* 'CRECET' Routine */
      returnInSub = false ;
      AV31Crecet = (byte)(0) ;
      /* Using cursor P04UY3 */
      pr_default.execute(1, new Object[] {AV19EMprcod, Integer.valueOf(AV22Barcod), Byte.valueOf(AV23Barcodreo), AV24Barcodpar, Short.valueOf(AV30RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P04UY3_A2804RecLinMaq[0] ;
         A130BarCodPar = P04UY3_A130BarCodPar[0] ;
         A132BarCodReo = P04UY3_A132BarCodReo[0] ;
         A129BarCod = P04UY3_A129BarCod[0] ;
         A396EmprCod = P04UY3_A396EmprCod[0] ;
         AV31Crecet = (byte)(1) ;
         AV32Lrecet = (byte)(0) ;
         /* Using cursor P04UY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A811RecLin = P04UY4_A811RecLin[0] ;
            A1273RecLinPro = P04UY4_A1273RecLinPro[0] ;
            AV32Lrecet = (byte)(1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'HISREH' Routine */
      returnInSub = false ;
      AV25Hisreh = 0 ;
      AV33HreFecTin = GXutil.nullDate() ;
      /* Using cursor P04UY5 */
      pr_default.execute(3, new Object[] {AV19EMprcod, Integer.valueOf(AV22Barcod), Byte.valueOf(AV23Barcodreo), AV24Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4494HreBarPar = P04UY5_A4494HreBarPar[0] ;
         A4493HreBarReo = P04UY5_A4493HreBarReo[0] ;
         A4492HreBarCod = P04UY5_A4492HreBarCod[0] ;
         A396EmprCod = P04UY5_A396EmprCod[0] ;
         A4529HreFecTin = P04UY5_A4529HreFecTin[0] ;
         n4529HreFecTin = P04UY5_n4529HreFecTin[0] ;
         A4495HreNumCie = P04UY5_A4495HreNumCie[0] ;
         AV33HreFecTin = A4529HreFecTin ;
         AV25Hisreh = 1 ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h4UY0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 7, Gx_line+94, 30, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+109, 88, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crecet", ""), 430, Gx_line+94, 475, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lrecet", ""), 489, Gx_line+94, 534, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hisreh", ""), 547, Gx_line+94, 592, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(430, Gx_line+109, 474, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(489, Gx_line+109, 533, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(547, Gx_line+109, 591, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdrs que estan en RECMAQ y existen en HISREH pero no hay informacion en CRECET, LRECET", ""), 7, Gx_line+63, 635, Gx_line+78, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+125) ;
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
      GXutil.refClasses(padt001.class);
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
      AV18station = "" ;
      AV19EMprcod = "" ;
      GXv_char1 = new String[1] ;
      AV20EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV21Usurcod = "" ;
      GXv_char3 = new String[1] ;
      AV28Tab_hdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV28Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P04UY2_A396EmprCod = new String[] {""} ;
      P04UY2_A4701RecRecep = new byte[1] ;
      P04UY2_A10385RecCAut = new byte[1] ;
      P04UY2_A6039RecAcab = new String[] {""} ;
      P04UY2_n6039RecAcab = new boolean[] {false} ;
      P04UY2_A129BarCod = new int[1] ;
      P04UY2_A2804RecLinMaq = new short[1] ;
      P04UY2_A130BarCodPar = new String[] {""} ;
      P04UY2_A132BarCodReo = new byte[1] ;
      P04UY2_A602MaqCod = new String[] {""} ;
      P04UY2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P04UY2_n4866RecFecAlt = new boolean[] {false} ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV24Barcodpar = "" ;
      AV33HreFecTin = GXutil.nullDate() ;
      Gx_msg = "" ;
      P04UY3_A2804RecLinMaq = new short[1] ;
      P04UY3_A130BarCodPar = new String[] {""} ;
      P04UY3_A132BarCodReo = new byte[1] ;
      P04UY3_A129BarCod = new int[1] ;
      P04UY3_A396EmprCod = new String[] {""} ;
      P04UY4_A396EmprCod = new String[] {""} ;
      P04UY4_A129BarCod = new int[1] ;
      P04UY4_A132BarCodReo = new byte[1] ;
      P04UY4_A130BarCodPar = new String[] {""} ;
      P04UY4_A2804RecLinMaq = new short[1] ;
      P04UY4_A811RecLin = new short[1] ;
      P04UY4_A1273RecLinPro = new byte[1] ;
      P04UY5_A4494HreBarPar = new String[] {""} ;
      P04UY5_A4493HreBarReo = new byte[1] ;
      P04UY5_A4492HreBarCod = new int[1] ;
      P04UY5_A396EmprCod = new String[] {""} ;
      P04UY5_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P04UY5_n4529HreFecTin = new boolean[] {false} ;
      P04UY5_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apadt001__default(),
         new Object[] {
             new Object[] {
            P04UY2_A396EmprCod, P04UY2_A4701RecRecep, P04UY2_A10385RecCAut, P04UY2_A6039RecAcab, P04UY2_n6039RecAcab, P04UY2_A129BarCod, P04UY2_A2804RecLinMaq, P04UY2_A130BarCodPar, P04UY2_A132BarCodReo, P04UY2_A602MaqCod,
            P04UY2_A4866RecFecAlt, P04UY2_n4866RecFecAlt
            }
            , new Object[] {
            P04UY3_A2804RecLinMaq, P04UY3_A130BarCodPar, P04UY3_A132BarCodReo, P04UY3_A129BarCod, P04UY3_A396EmprCod
            }
            , new Object[] {
            P04UY4_A396EmprCod, P04UY4_A129BarCod, P04UY4_A132BarCodReo, P04UY4_A130BarCodPar, P04UY4_A2804RecLinMaq, P04UY4_A811RecLin, P04UY4_A1273RecLinPro
            }
            , new Object[] {
            P04UY5_A4494HreBarPar, P04UY5_A4493HreBarReo, P04UY5_A4492HreBarCod, P04UY5_A396EmprCod, P04UY5_A4529HreFecTin, P04UY5_n4529HreFecTin, P04UY5_A4495HreNumCie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A4701RecRecep ;
   private byte A10385RecCAut ;
   private byte A132BarCodReo ;
   private byte AV23Barcodreo ;
   private byte AV31Crecet ;
   private byte AV32Lrecet ;
   private byte A1273RecLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV29i ;
   private short A2804RecLinMaq ;
   private short AV30RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV26Numr ;
   private int AV27NumRecmaq ;
   private int GX_I ;
   private int A129BarCod ;
   private int AV22Barcod ;
   private int AV25Hisreh ;
   private int Gx_OldLine ;
   private int A4492HreBarCod ;
   private String AV18station ;
   private String AV19EMprcod ;
   private String GXv_char1[] ;
   private String AV20EmprNom ;
   private String GXv_char2[] ;
   private String AV21Usurcod ;
   private String GXv_char3[] ;
   private String AV28Tab_hdr[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String AV24Barcodpar ;
   private String Gx_msg ;
   private String A4494HreBarPar ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV33HreFecTin ;
   private java.util.Date A4529HreFecTin ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean returnInSub ;
   private boolean n4529HreFecTin ;
   private IDataStoreProvider pr_default ;
   private String[] P04UY2_A396EmprCod ;
   private byte[] P04UY2_A4701RecRecep ;
   private byte[] P04UY2_A10385RecCAut ;
   private String[] P04UY2_A6039RecAcab ;
   private boolean[] P04UY2_n6039RecAcab ;
   private int[] P04UY2_A129BarCod ;
   private short[] P04UY2_A2804RecLinMaq ;
   private String[] P04UY2_A130BarCodPar ;
   private byte[] P04UY2_A132BarCodReo ;
   private String[] P04UY2_A602MaqCod ;
   private java.util.Date[] P04UY2_A4866RecFecAlt ;
   private boolean[] P04UY2_n4866RecFecAlt ;
   private short[] P04UY3_A2804RecLinMaq ;
   private String[] P04UY3_A130BarCodPar ;
   private byte[] P04UY3_A132BarCodReo ;
   private int[] P04UY3_A129BarCod ;
   private String[] P04UY3_A396EmprCod ;
   private String[] P04UY4_A396EmprCod ;
   private int[] P04UY4_A129BarCod ;
   private byte[] P04UY4_A132BarCodReo ;
   private String[] P04UY4_A130BarCodPar ;
   private short[] P04UY4_A2804RecLinMaq ;
   private short[] P04UY4_A811RecLin ;
   private byte[] P04UY4_A1273RecLinPro ;
   private String[] P04UY5_A4494HreBarPar ;
   private byte[] P04UY5_A4493HreBarReo ;
   private int[] P04UY5_A4492HreBarCod ;
   private String[] P04UY5_A396EmprCod ;
   private java.util.Date[] P04UY5_A4529HreFecTin ;
   private boolean[] P04UY5_n4529HreFecTin ;
   private byte[] P04UY5_A4495HreNumCie ;
}

final  class apadt001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UY2", "SELECT EmprCod, RecRecep, RecCAut, RecAcab, BarCod, RecLinMaq, BarCodPar, BarCodReo, MaqCod, RecFecAlt FROM TXPRECMAQ WHERE (EmprCod = ? and RecRecep = 1) AND (RecCAut = 1) ORDER BY EmprCod, RecRecep ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04UY3", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04UY4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04UY5", "SELECT HreBarPar, HreBarReo, HreBarCod, EmprCod, HreFecTin, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

