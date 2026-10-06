package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuel060 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuel060 pgm = new apuel060 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuel060( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuel060.class ), "" );
   }

   public apuel060( int remoteHandle ,
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
         getPrinter().GxSetDocName("UEL060") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV8Emprcod = "001" ;
         /* Using cursor P03DD2 */
         pr_default.execute(0, new Object[] {AV8Emprcod, AV10Hrefectini, AV9Hrefectin});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P03DD2_A396EmprCod[0] ;
            A4495HreNumCie = P03DD2_A4495HreNumCie[0] ;
            A4494HreBarPar = P03DD2_A4494HreBarPar[0] ;
            A4493HreBarReo = P03DD2_A4493HreBarReo[0] ;
            A4492HreBarCod = P03DD2_A4492HreBarCod[0] ;
            A4529HreFecTin = P03DD2_A4529HreFecTin[0] ;
            n4529HreFecTin = P03DD2_n4529HreFecTin[0] ;
            AV13Hrebarcod = A4492HreBarCod ;
            AV14Hrebarreo = A4493HreBarReo ;
            AV15Hrebarpar = A4494HreBarPar ;
            AV24Hrenumcie = A4495HreNumCie ;
            AV16FecTin = A4529HreFecTin ;
            AV20Num_v = (short)(0) ;
            AV23Ccstkcansi = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P03DD3 */
            pr_default.execute(1, new Object[] {A396EmprCod, AV11PrdNum, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A719PrdNum = P03DD3_A719PrdNum[0] ;
               n719PrdNum = P03DD3_n719PrdNum[0] ;
               A4557HreRecLin = P03DD3_A4557HreRecLin[0] ;
               A4550HreLinPro = P03DD3_A4550HreLinPro[0] ;
               A4545HreLinMaq = P03DD3_A4545HreLinMaq[0] ;
               A4565HreCanAny = P03DD3_A4565HreCanAny[0] ;
               n4565HreCanAny = P03DD3_n4565HreCanAny[0] ;
               A4563HrePrdCant = P03DD3_A4563HrePrdCant[0] ;
               n4563HrePrdCant = P03DD3_n4563HrePrdCant[0] ;
               AV25Marca2 = " " ;
               if ( AV20Num_v >= 1 )
               {
                  AV25Marca2 = "+" ;
               }
               AV12CCSTKCANS = (A4563HrePrdCant.add(A4565HreCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV17Tot_1 = AV17Tot_1.add(AV12CCSTKCANS) ;
               AV20Num_v = (short)(AV20Num_v+1) ;
               AV23Ccstkcansi = AV23Ccstkcansi.add(AV12CCSTKCANS) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Execute user subroutine: 'CCSTKS' */
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
            if ( ( AV20Num_v == 0 ) && ( AV21Num_vc > 0 ) )
            {
               h3DD0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "No hay Informacion Hislre", ""), 15, Gx_line+3, 168, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            if ( ( AV21Num_vc == 0 ) && ( AV20Num_v > 0 ) )
            {
               h3DD0( false, 20) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NO HAY MOVIMIENTO EN CCSTKS PARA ESA HDR", ""), 15, Gx_line+3, 327, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12CCSTKCANS, "ZZZZZZ9.9999")), 478, Gx_line+2, 567, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13Hrebarcod), "ZZZZZZZ9")), 329, Gx_line+2, 388, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Hrebarpar, "")), 406, Gx_line+2, 414, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Hrebarreo), "9")), 392, Gx_line+2, 400, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV16FecTin, "99/99/99"), 694, Gx_line+2, 753, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24Hrenumcie), "Z9")), 423, Gx_line+2, 439, Gx_line+19, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV19Dif = AV17Tot_1.subtract(AV18Tot_2) ;
         h3DD0( false, 70) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Tot_1, "ZZZZZZ9.9999")), 478, Gx_line+0, 567, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Tot_2, "ZZZZZZ9.9999")), 478, Gx_line+26, 567, Gx_line+44, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19Dif, "ZZZZZZ9.9999")), 478, Gx_line+51, 567, Gx_line+68, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Suma Historico Recetas", ""), 151, Gx_line+1, 328, Gx_line+15, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Suma Cuenta Corriente Stocks", ""), 151, Gx_line+26, 367, Gx_line+40, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Diferencia", ""), 151, Gx_line+52, 212, Gx_line+66, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+70) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3DD0( true, 0) ;
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
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      AV21Num_vc = (short)(0) ;
      /* Using cursor P03DD4 */
      pr_default.execute(2, new Object[] {AV8Emprcod, AV11PrdNum, Integer.valueOf(AV13Hrebarcod), Byte.valueOf(AV14Hrebarreo), AV15Hrebarpar, AV16FecTin});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3345TipMovCc = P03DD4_A3345TipMovCc[0] ;
         A3348CCStkFec = P03DD4_A3348CCStkFec[0] ;
         A3352CCStkPar = P03DD4_A3352CCStkPar[0] ;
         A3351CCStkReo = P03DD4_A3351CCStkReo[0] ;
         A3350CCStkBar = P03DD4_A3350CCStkBar[0] ;
         A719PrdNum = P03DD4_A719PrdNum[0] ;
         n719PrdNum = P03DD4_n719PrdNum[0] ;
         A396EmprCod = P03DD4_A396EmprCod[0] ;
         A3344CCStkCanS = P03DD4_A3344CCStkCanS[0] ;
         A3342CCStkLin = P03DD4_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", "")) == 0 )
         {
            AV21Num_vc = (short)(AV21Num_vc+1) ;
            AV22Marca = "" ;
            if ( DecimalUtil.compareTo(AV23Ccstkcansi, A3344CCStkCanS) != 0 )
            {
               AV22Marca = "*" ;
            }
            AV18Tot_2 = AV18Tot_2.add(A3344CCStkCanS) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void h3DD0( boolean bFoot ,
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
      GXutil.refClasses(puel060.class);
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
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      AV10Hrefectini = GXutil.nullDate() ;
      AV9Hrefectin = GXutil.nullDate() ;
      P03DD2_A396EmprCod = new String[] {""} ;
      P03DD2_A4495HreNumCie = new byte[1] ;
      P03DD2_A4494HreBarPar = new String[] {""} ;
      P03DD2_A4493HreBarReo = new byte[1] ;
      P03DD2_A4492HreBarCod = new int[1] ;
      P03DD2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P03DD2_n4529HreFecTin = new boolean[] {false} ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      AV15Hrebarpar = "" ;
      AV16FecTin = GXutil.nullDate() ;
      AV23Ccstkcansi = DecimalUtil.ZERO ;
      AV11PrdNum = "" ;
      P03DD3_A396EmprCod = new String[] {""} ;
      P03DD3_A4492HreBarCod = new int[1] ;
      P03DD3_A4493HreBarReo = new byte[1] ;
      P03DD3_A4494HreBarPar = new String[] {""} ;
      P03DD3_A4495HreNumCie = new byte[1] ;
      P03DD3_A719PrdNum = new String[] {""} ;
      P03DD3_n719PrdNum = new boolean[] {false} ;
      P03DD3_A4557HreRecLin = new short[1] ;
      P03DD3_A4550HreLinPro = new byte[1] ;
      P03DD3_A4545HreLinMaq = new short[1] ;
      P03DD3_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DD3_n4565HreCanAny = new boolean[] {false} ;
      P03DD3_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DD3_n4563HrePrdCant = new boolean[] {false} ;
      A719PrdNum = "" ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      AV25Marca2 = "" ;
      AV12CCSTKCANS = DecimalUtil.ZERO ;
      AV17Tot_1 = DecimalUtil.ZERO ;
      AV19Dif = DecimalUtil.ZERO ;
      AV18Tot_2 = DecimalUtil.ZERO ;
      P03DD4_A3345TipMovCc = new String[] {""} ;
      P03DD4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03DD4_A3352CCStkPar = new String[] {""} ;
      P03DD4_A3351CCStkReo = new byte[1] ;
      P03DD4_A3350CCStkBar = new int[1] ;
      P03DD4_A719PrdNum = new String[] {""} ;
      P03DD4_n719PrdNum = new boolean[] {false} ;
      P03DD4_A396EmprCod = new String[] {""} ;
      P03DD4_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DD4_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3352CCStkPar = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      AV22Marca = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuel060__default(),
         new Object[] {
             new Object[] {
            P03DD2_A396EmprCod, P03DD2_A4495HreNumCie, P03DD2_A4494HreBarPar, P03DD2_A4493HreBarReo, P03DD2_A4492HreBarCod, P03DD2_A4529HreFecTin, P03DD2_n4529HreFecTin
            }
            , new Object[] {
            P03DD3_A396EmprCod, P03DD3_A4492HreBarCod, P03DD3_A4493HreBarReo, P03DD3_A4494HreBarPar, P03DD3_A4495HreNumCie, P03DD3_A719PrdNum, P03DD3_n719PrdNum, P03DD3_A4557HreRecLin, P03DD3_A4550HreLinPro, P03DD3_A4545HreLinMaq,
            P03DD3_A4565HreCanAny, P03DD3_n4565HreCanAny, P03DD3_A4563HrePrdCant, P03DD3_n4563HrePrdCant
            }
            , new Object[] {
            P03DD4_A3345TipMovCc, P03DD4_A3348CCStkFec, P03DD4_A3352CCStkPar, P03DD4_A3351CCStkReo, P03DD4_A3350CCStkBar, P03DD4_A719PrdNum, P03DD4_A396EmprCod, P03DD4_A3344CCStkCanS, P03DD4_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte AV14Hrebarreo ;
   private byte AV24Hrenumcie ;
   private byte A4550HreLinPro ;
   private byte A3351CCStkReo ;
   private short AV20Num_v ;
   private short A4557HreRecLin ;
   private short A4545HreLinMaq ;
   private short AV21Num_vc ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4492HreBarCod ;
   private int AV13Hrebarcod ;
   private int Gx_OldLine ;
   private int A3350CCStkBar ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV23Ccstkcansi ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal AV12CCSTKCANS ;
   private java.math.BigDecimal AV17Tot_1 ;
   private java.math.BigDecimal AV19Dif ;
   private java.math.BigDecimal AV18Tot_2 ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV15Hrebarpar ;
   private String AV11PrdNum ;
   private String A719PrdNum ;
   private String AV25Marca2 ;
   private String A3345TipMovCc ;
   private String A3352CCStkPar ;
   private String AV22Marca ;
   private java.util.Date AV10Hrefectini ;
   private java.util.Date AV9Hrefectin ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV16FecTin ;
   private java.util.Date A3348CCStkFec ;
   private boolean n4529HreFecTin ;
   private boolean n719PrdNum ;
   private boolean n4565HreCanAny ;
   private boolean n4563HrePrdCant ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P03DD2_A396EmprCod ;
   private byte[] P03DD2_A4495HreNumCie ;
   private String[] P03DD2_A4494HreBarPar ;
   private byte[] P03DD2_A4493HreBarReo ;
   private int[] P03DD2_A4492HreBarCod ;
   private java.util.Date[] P03DD2_A4529HreFecTin ;
   private boolean[] P03DD2_n4529HreFecTin ;
   private String[] P03DD3_A396EmprCod ;
   private int[] P03DD3_A4492HreBarCod ;
   private byte[] P03DD3_A4493HreBarReo ;
   private String[] P03DD3_A4494HreBarPar ;
   private byte[] P03DD3_A4495HreNumCie ;
   private String[] P03DD3_A719PrdNum ;
   private boolean[] P03DD3_n719PrdNum ;
   private short[] P03DD3_A4557HreRecLin ;
   private byte[] P03DD3_A4550HreLinPro ;
   private short[] P03DD3_A4545HreLinMaq ;
   private java.math.BigDecimal[] P03DD3_A4565HreCanAny ;
   private boolean[] P03DD3_n4565HreCanAny ;
   private java.math.BigDecimal[] P03DD3_A4563HrePrdCant ;
   private boolean[] P03DD3_n4563HrePrdCant ;
   private String[] P03DD4_A3345TipMovCc ;
   private java.util.Date[] P03DD4_A3348CCStkFec ;
   private String[] P03DD4_A3352CCStkPar ;
   private byte[] P03DD4_A3351CCStkReo ;
   private int[] P03DD4_A3350CCStkBar ;
   private String[] P03DD4_A719PrdNum ;
   private boolean[] P03DD4_n719PrdNum ;
   private String[] P03DD4_A396EmprCod ;
   private java.math.BigDecimal[] P03DD4_A3344CCStkCanS ;
   private long[] P03DD4_A3342CCStkLin ;
}

final  class apuel060__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DD2", "SELECT EmprCod, HreNumCie, HreBarPar, HreBarReo, HreBarCod, HreFecTin FROM TXPHISREH WHERE (EmprCod = ? and HreFecTin >= ?) AND (HreFecTin <= ?) ORDER BY EmprCod, HreFecTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DD3", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, PrdNum, HreRecLin, HreLinPro, HreLinMaq, HreCanAny, HrePrdCant FROM TXPHISLRE WHERE (EmprCod = ? and PrdNum = ?) AND (HreBarCod = ?) AND (HreBarReo = ?) AND (HreBarPar = ?) AND (HreNumCie = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DD4", "SELECT TipMovCc, CCStkFec, CCStkPar, CCStkReo, CCStkBar, PrdNum, EmprCod, CCStkCanS, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (CCStkBar = ?) AND (CCStkReo = ?) AND (CCStkPar = ?) AND (CCStkFec = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((long[]) buf[8])[0] = rslt.getLong(9);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

