package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuel09 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuel09 pgm = new apuel09 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuel09( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuel09.class ), "" );
   }

   public apuel09( int remoteHandle ,
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("CONTROL RESERVA Y PESADO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P03F22 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P03F22_A719PrdNum[0] ;
            n719PrdNum = P03F22_n719PrdNum[0] ;
            A396EmprCod = P03F22_A396EmprCod[0] ;
            A685PrdCanRes = P03F22_A685PrdCanRes[0] ;
            A718PrdNom = P03F22_A718PrdNom[0] ;
            AV8PrdNum = A719PrdNum ;
            AV9Emprcod = A396EmprCod ;
            /* Execute user subroutine: 'LRECET' */
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
            if ( A685PrdCanRes.doubleValue() != 0 )
            {
               AV10Reserva = AV10Reserva.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV11Pesada = AV11Pesada.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV12EnReserva = AV10Reserva.subtract(AV11Pesada) ;
               h3F20( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 10, Gx_line+1, 55, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 60, Gx_line+0, 251, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 269, Gx_line+1, 358, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10Reserva, "ZZZZZZ9.9999")), 399, Gx_line+0, 488, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11Pesada, "ZZZZZZ9.9999")), 508, Gx_line+0, 597, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12EnReserva, "ZZZZZZ9.9999")), 625, Gx_line+0, 714, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3F20( true, 0) ;
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
      AV10Reserva = DecimalUtil.doubleToDec(0) ;
      AV11Pesada = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03F23 */
      pr_default.execute(1, new Object[] {AV9Emprcod, AV8PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A129BarCod = P03F23_A129BarCod[0] ;
         A132BarCodReo = P03F23_A132BarCodReo[0] ;
         A130BarCodPar = P03F23_A130BarCodPar[0] ;
         A719PrdNum = P03F23_A719PrdNum[0] ;
         n719PrdNum = P03F23_n719PrdNum[0] ;
         A396EmprCod = P03F23_A396EmprCod[0] ;
         A707PrdFacCon = P03F23_A707PrdFacCon[0] ;
         A686PrdCant = P03F23_A686PrdCant[0] ;
         A4464BarAcaFor = P03F23_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P03F23_n4464BarAcaFor[0] ;
         A2804RecLinMaq = P03F23_A2804RecLinMaq[0] ;
         A1273RecLinPro = P03F23_A1273RecLinPro[0] ;
         A811RecLin = P03F23_A811RecLin[0] ;
         A707PrdFacCon = P03F23_A707PrdFacCon[0] ;
         A4464BarAcaFor = P03F23_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P03F23_n4464BarAcaFor[0] ;
         AV10Reserva = AV10Reserva.add(((A686PrdCant.multiply(A707PrdFacCon)))) ;
         if ( A4464BarAcaFor == 1 )
         {
            AV11Pesada = AV11Pesada.add(((A686PrdCant.multiply(A707PrdFacCon)))) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void h3F20( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control Insumos en Reserva y Pesados", ""), 22, Gx_line+8, 306, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 586, Gx_line+8, 645, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 671, Gx_line+8, 730, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 688, Gx_line+32, 733, Gx_line+49, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 10, Gx_line+69, 64, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+84, 253, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reserva BD", ""), 284, Gx_line+69, 356, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reserva Calculada", ""), 374, Gx_line+69, 486, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pesado", ""), 551, Gx_line+69, 596, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(269, Gx_line+84, 357, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(374, Gx_line+84, 487, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(508, Gx_line+84, 596, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+60, 785, Gx_line+60, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "En Reserva", ""), 643, Gx_line+69, 713, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(628, Gx_line+84, 712, Gx_line+84, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+91) ;
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
      GXutil.refClasses(puel09.class);
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
      scmdbuf = "" ;
      P03F22_A719PrdNum = new String[] {""} ;
      P03F22_n719PrdNum = new boolean[] {false} ;
      P03F22_A396EmprCod = new String[] {""} ;
      P03F22_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03F22_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV8PrdNum = "" ;
      AV9Emprcod = "" ;
      AV10Reserva = DecimalUtil.ZERO ;
      AV11Pesada = DecimalUtil.ZERO ;
      AV12EnReserva = DecimalUtil.ZERO ;
      P03F23_A129BarCod = new int[1] ;
      P03F23_A132BarCodReo = new byte[1] ;
      P03F23_A130BarCodPar = new String[] {""} ;
      P03F23_A719PrdNum = new String[] {""} ;
      P03F23_n719PrdNum = new boolean[] {false} ;
      P03F23_A396EmprCod = new String[] {""} ;
      P03F23_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03F23_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03F23_A4464BarAcaFor = new int[1] ;
      P03F23_n4464BarAcaFor = new boolean[] {false} ;
      P03F23_A2804RecLinMaq = new short[1] ;
      P03F23_A1273RecLinPro = new byte[1] ;
      P03F23_A811RecLin = new short[1] ;
      A130BarCodPar = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuel09__default(),
         new Object[] {
             new Object[] {
            P03F22_A719PrdNum, P03F22_A396EmprCod, P03F22_A685PrdCanRes, P03F22_A718PrdNom
            }
            , new Object[] {
            P03F23_A129BarCod, P03F23_A132BarCodReo, P03F23_A130BarCodPar, P03F23_A719PrdNum, P03F23_n719PrdNum, P03F23_A396EmprCod, P03F23_A707PrdFacCon, P03F23_A686PrdCant, P03F23_A4464BarAcaFor, P03F23_n4464BarAcaFor,
            P03F23_A2804RecLinMaq, P03F23_A1273RecLinPro, P03F23_A811RecLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private int A4464BarAcaFor ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV10Reserva ;
   private java.math.BigDecimal AV11Pesada ;
   private java.math.BigDecimal AV12EnReserva ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV8PrdNum ;
   private String AV9Emprcod ;
   private String A130BarCodPar ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n4464BarAcaFor ;
   private IDataStoreProvider pr_default ;
   private String[] P03F22_A719PrdNum ;
   private boolean[] P03F22_n719PrdNum ;
   private String[] P03F22_A396EmprCod ;
   private java.math.BigDecimal[] P03F22_A685PrdCanRes ;
   private String[] P03F22_A718PrdNom ;
   private int[] P03F23_A129BarCod ;
   private byte[] P03F23_A132BarCodReo ;
   private String[] P03F23_A130BarCodPar ;
   private String[] P03F23_A719PrdNum ;
   private boolean[] P03F23_n719PrdNum ;
   private String[] P03F23_A396EmprCod ;
   private java.math.BigDecimal[] P03F23_A707PrdFacCon ;
   private java.math.BigDecimal[] P03F23_A686PrdCant ;
   private int[] P03F23_A4464BarAcaFor ;
   private boolean[] P03F23_n4464BarAcaFor ;
   private short[] P03F23_A2804RecLinMaq ;
   private byte[] P03F23_A1273RecLinPro ;
   private short[] P03F23_A811RecLin ;
}

final  class apuel09__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03F22", "SELECT PrdNum, EmprCod, PrdCanRes, PrdNom FROM TXPPRODUC WHERE (EmprCod = '001' and PrdNum >= '100000') AND (LENGTH(RTRIM(PrdNum)) >= 5) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03F23", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum, T1.EmprCod, T2.PrdFacCon, T1.PrdCant, T3.BarAcaFor, T1.RecLinMaq, T1.RecLinPro, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

