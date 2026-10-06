package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsbar extends GXProcedure
{
   public pinsbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsbar.class ), "" );
   }

   public pinsbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           String[] aP5 ,
                                           byte[] aP6 ,
                                           int[] aP7 ,
                                           String[] aP8 ,
                                           int[] aP9 ,
                                           java.util.Date[] aP10 )
   {
      pinsbar.this.aP11 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        java.util.Date[] aP10 ,
                        java.math.BigDecimal[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             java.util.Date[] aP10 ,
                             java.math.BigDecimal[] aP11 )
   {
      pinsbar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsbar.this.AV16barcod = aP1[0];
      this.aP1 = aP1;
      pinsbar.this.AV17barcodreo = aP2[0];
      this.aP2 = aP2;
      pinsbar.this.AV18barcodpar = aP3[0];
      this.aP3 = aP3;
      pinsbar.this.AV19peso = aP4[0];
      this.aP4 = aP4;
      pinsbar.this.AV20maqcod = aP5[0];
      this.aP5 = aP5;
      pinsbar.this.AV21termic = aP6[0];
      this.aP6 = aP6;
      pinsbar.this.AV22CliCod = aP7[0];
      this.aP7 = aP7;
      pinsbar.this.AV23barser = aP8[0];
      this.aP8 = aP8;
      pinsbar.this.AV24barcolnum = aP9[0];
      this.aP9 = aP9;
      pinsbar.this.AV25barfeccli = aP10[0];
      this.aP10 = aP10;
      pinsbar.this.AV28relban = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV29FlagEtal ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ETAL", ""), GXv_int1) ;
      pinsbar.this.AV29FlagEtal = GXv_int1[0] ;
      GXv_int2[0] = AV30BTermo ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BTERMO", ""), GXv_int2) ;
      pinsbar.this.AV30BTermo = (byte)((byte)(GXv_int2[0])) ;
      /* Using cursor P00EF4 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16barcod), Byte.valueOf(AV17barcodreo), AV18barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00EF4_A130BarCodPar[0] ;
         A132BarCodReo = P00EF4_A132BarCodReo[0] ;
         A129BarCod = P00EF4_A129BarCod[0] ;
         A396EmprCod = P00EF4_A396EmprCod[0] ;
         A236BarVolMaq = P00EF4_A236BarVolMaq[0] ;
         A166BarKgm = P00EF4_A166BarKgm[0] ;
         n166BarKgm = P00EF4_n166BarKgm[0] ;
         A219BarTotAgr = P00EF4_A219BarTotAgr[0] ;
         n219BarTotAgr = P00EF4_n219BarTotAgr[0] ;
         A219BarTotAgr = P00EF4_A219BarTotAgr[0] ;
         n219BarTotAgr = P00EF4_n219BarTotAgr[0] ;
         A166BarKgm = P00EF4_A166BarKgm[0] ;
         n166BarKgm = P00EF4_n166BarKgm[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         AV19peso = A812RecTotKgm ;
         if ( A236BarVolMaq > 0 )
         {
            if ( AV19peso.doubleValue() != 0 )
            {
               AV28relban = GXutil.roundDecimal( DecimalUtil.doubleToDec(A236BarVolMaq).divide(AV19peso, 18, java.math.RoundingMode.DOWN), 0) ;
            }
            else
            {
               AV28relban = DecimalUtil.doubleToDec(0) ;
            }
         }
         else
         {
            AV28relban = DecimalUtil.doubleToDec(0) ;
         }
         if ( AV29FlagEtal == 1 )
         {
            AV28relban = DecimalUtil.doubleToDec(AV30BTermo) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00EF5 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16barcod), Byte.valueOf(AV17barcodreo), AV18barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P00EF5_A130BarCodPar[0] ;
         A132BarCodReo = P00EF5_A132BarCodReo[0] ;
         A129BarCod = P00EF5_A129BarCod[0] ;
         A396EmprCod = P00EF5_A396EmprCod[0] ;
         A212BarSer = P00EF5_A212BarSer[0] ;
         A180BarMaqCod = P00EF5_A180BarMaqCod[0] ;
         AV20maqcod = A180BarMaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P00EF6 */
      pr_default.execute(2, new Object[] {AV15EmprCod, AV20maqcod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A602MaqCod = P00EF6_A602MaqCod[0] ;
         A396EmprCod = P00EF6_A396EmprCod[0] ;
         A604MaqCodFor = P00EF6_A604MaqCodFor[0] ;
         n604MaqCodFor = P00EF6_n604MaqCodFor[0] ;
         A2391MaqMicro = P00EF6_A2391MaqMicro[0] ;
         n2391MaqMicro = P00EF6_n2391MaqMicro[0] ;
         AV21termic = A2391MaqMicro ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P00EF7 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV16barcod), Byte.valueOf(AV17barcodreo), AV18barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P00EF7_A130BarCodPar[0] ;
         A132BarCodReo = P00EF7_A132BarCodReo[0] ;
         A129BarCod = P00EF7_A129BarCod[0] ;
         A396EmprCod = P00EF7_A396EmprCod[0] ;
         A252CliCod = P00EF7_A252CliCod[0] ;
         n252CliCod = P00EF7_n252CliCod[0] ;
         A212BarSer = P00EF7_A212BarSer[0] ;
         A136BarColNum = P00EF7_A136BarColNum[0] ;
         A155BarFecCli = P00EF7_A155BarFecCli[0] ;
         AV22CliCod = A252CliCod ;
         AV23barser = A212BarSer ;
         AV24barcolnum = A136BarColNum ;
         AV25barfeccli = A155BarFecCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV26t = httpContext.getMessage( "la emprcod= ", "") + AV15EmprCod + httpContext.getMessage( "el barcod= ", "") + GXutil.str( AV16barcod, 10, 0) ;
      AV26t = httpContext.getMessage( "el barcodreo= ", "") + GXutil.str( AV17barcodreo, 10, 0) ;
      AV26t = httpContext.getMessage( "el peso= ", "") + GXutil.str( AV19peso, 10, 0) + httpContext.getMessage( " y el micro= ", "") + GXutil.str( AV27maqmicro, 10, 0) ;
      AV26t = httpContext.getMessage( "el clicod de variable=", "") + GXutil.str( AV22CliCod, 10, 0) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsbar.this.AV15EmprCod;
      this.aP1[0] = pinsbar.this.AV16barcod;
      this.aP2[0] = pinsbar.this.AV17barcodreo;
      this.aP3[0] = pinsbar.this.AV18barcodpar;
      this.aP4[0] = pinsbar.this.AV19peso;
      this.aP5[0] = pinsbar.this.AV20maqcod;
      this.aP6[0] = pinsbar.this.AV21termic;
      this.aP7[0] = pinsbar.this.AV22CliCod;
      this.aP8[0] = pinsbar.this.AV23barser;
      this.aP9[0] = pinsbar.this.AV24barcolnum;
      this.aP10[0] = pinsbar.this.AV25barfeccli;
      this.aP11[0] = pinsbar.this.AV28relban;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      GXv_int2 = new int[1] ;
      scmdbuf = "" ;
      P00EF4_A130BarCodPar = new String[] {""} ;
      P00EF4_A132BarCodReo = new byte[1] ;
      P00EF4_A129BarCod = new int[1] ;
      P00EF4_A396EmprCod = new String[] {""} ;
      P00EF4_A236BarVolMaq = new int[1] ;
      P00EF4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EF4_n166BarKgm = new boolean[] {false} ;
      P00EF4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EF4_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      P00EF5_A130BarCodPar = new String[] {""} ;
      P00EF5_A132BarCodReo = new byte[1] ;
      P00EF5_A129BarCod = new int[1] ;
      P00EF5_A396EmprCod = new String[] {""} ;
      P00EF5_A212BarSer = new String[] {""} ;
      P00EF5_A180BarMaqCod = new String[] {""} ;
      A212BarSer = "" ;
      A180BarMaqCod = "" ;
      P00EF6_A602MaqCod = new String[] {""} ;
      P00EF6_A396EmprCod = new String[] {""} ;
      P00EF6_A604MaqCodFor = new String[] {""} ;
      P00EF6_n604MaqCodFor = new boolean[] {false} ;
      P00EF6_A2391MaqMicro = new byte[1] ;
      P00EF6_n2391MaqMicro = new boolean[] {false} ;
      A602MaqCod = "" ;
      A604MaqCodFor = "" ;
      P00EF7_A130BarCodPar = new String[] {""} ;
      P00EF7_A132BarCodReo = new byte[1] ;
      P00EF7_A129BarCod = new int[1] ;
      P00EF7_A396EmprCod = new String[] {""} ;
      P00EF7_A252CliCod = new int[1] ;
      P00EF7_n252CliCod = new boolean[] {false} ;
      P00EF7_A212BarSer = new String[] {""} ;
      P00EF7_A136BarColNum = new int[1] ;
      P00EF7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      A155BarFecCli = GXutil.nullDate() ;
      AV26t = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsbar__default(),
         new Object[] {
             new Object[] {
            P00EF4_A130BarCodPar, P00EF4_A132BarCodReo, P00EF4_A129BarCod, P00EF4_A396EmprCod, P00EF4_A236BarVolMaq, P00EF4_A166BarKgm, P00EF4_n166BarKgm, P00EF4_A219BarTotAgr, P00EF4_n219BarTotAgr
            }
            , new Object[] {
            P00EF5_A130BarCodPar, P00EF5_A132BarCodReo, P00EF5_A129BarCod, P00EF5_A396EmprCod, P00EF5_A212BarSer, P00EF5_A180BarMaqCod
            }
            , new Object[] {
            P00EF6_A602MaqCod, P00EF6_A396EmprCod, P00EF6_A604MaqCodFor, P00EF6_n604MaqCodFor, P00EF6_A2391MaqMicro, P00EF6_n2391MaqMicro
            }
            , new Object[] {
            P00EF7_A130BarCodPar, P00EF7_A132BarCodReo, P00EF7_A129BarCod, P00EF7_A396EmprCod, P00EF7_A252CliCod, P00EF7_n252CliCod, P00EF7_A212BarSer, P00EF7_A136BarColNum, P00EF7_A155BarFecCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17barcodreo ;
   private byte AV21termic ;
   private byte AV29FlagEtal ;
   private byte GXv_int1[] ;
   private byte AV30BTermo ;
   private byte A132BarCodReo ;
   private byte A2391MaqMicro ;
   private byte AV27maqmicro ;
   private short Gx_err ;
   private int AV16barcod ;
   private int AV22CliCod ;
   private int AV24barcolnum ;
   private int GXv_int2[] ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private java.math.BigDecimal AV19peso ;
   private java.math.BigDecimal AV28relban ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String AV15EmprCod ;
   private String AV18barcodpar ;
   private String AV20maqcod ;
   private String AV23barser ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A180BarMaqCod ;
   private String A602MaqCod ;
   private String A604MaqCodFor ;
   private String AV26t ;
   private java.util.Date AV25barfeccli ;
   private java.util.Date A155BarFecCli ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean n604MaqCodFor ;
   private boolean n2391MaqMicro ;
   private boolean n252CliCod ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private java.util.Date[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EF4_A130BarCodPar ;
   private byte[] P00EF4_A132BarCodReo ;
   private int[] P00EF4_A129BarCod ;
   private String[] P00EF4_A396EmprCod ;
   private int[] P00EF4_A236BarVolMaq ;
   private java.math.BigDecimal[] P00EF4_A166BarKgm ;
   private boolean[] P00EF4_n166BarKgm ;
   private java.math.BigDecimal[] P00EF4_A219BarTotAgr ;
   private boolean[] P00EF4_n219BarTotAgr ;
   private String[] P00EF5_A130BarCodPar ;
   private byte[] P00EF5_A132BarCodReo ;
   private int[] P00EF5_A129BarCod ;
   private String[] P00EF5_A396EmprCod ;
   private String[] P00EF5_A212BarSer ;
   private String[] P00EF5_A180BarMaqCod ;
   private String[] P00EF6_A602MaqCod ;
   private String[] P00EF6_A396EmprCod ;
   private String[] P00EF6_A604MaqCodFor ;
   private boolean[] P00EF6_n604MaqCodFor ;
   private byte[] P00EF6_A2391MaqMicro ;
   private boolean[] P00EF6_n2391MaqMicro ;
   private String[] P00EF7_A130BarCodPar ;
   private byte[] P00EF7_A132BarCodReo ;
   private int[] P00EF7_A129BarCod ;
   private String[] P00EF7_A396EmprCod ;
   private int[] P00EF7_A252CliCod ;
   private boolean[] P00EF7_n252CliCod ;
   private String[] P00EF7_A212BarSer ;
   private int[] P00EF7_A136BarColNum ;
   private java.util.Date[] P00EF7_A155BarFecCli ;
}

final  class pinsbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EF4", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarVolMaq, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00EF5", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSer, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00EF6", "SELECT MaqCod, EmprCod, MaqCodFor, MaqMicro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00EF7", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNum, BarFecCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
      }
   }

}

