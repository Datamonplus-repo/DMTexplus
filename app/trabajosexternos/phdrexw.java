package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrexw extends GXProcedure
{
   public phdrexw( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrexw.class ), "" );
   }

   public phdrexw( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          String[] aP5 ,
                          java.util.Date[] aP6 ,
                          byte[] aP7 )
   {
      phdrexw.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        byte[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 ,
                             int[] aP8 )
   {
      phdrexw.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrexw.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phdrexw.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrexw.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrexw.this.AV8BarOrdlin = aP4[0];
      this.aP4 = aP4;
      phdrexw.this.AV9FasCod = aP5[0];
      this.aP5 = aP5;
      phdrexw.this.AV10FechaE = aP6[0];
      this.aP6 = aP6;
      phdrexw.this.AV11BarExt = aP7[0];
      this.aP7 = aP7;
      phdrexw.this.AV12SalExtAlb = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = httpContext.getMessage( "S", "") ;
      /* Using cursor P091B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2265BarExt = P091B2_A2265BarExt[0] ;
         n2265BarExt = P091B2_n2265BarExt[0] ;
         A2265BarExt = AV11BarExt ;
         n2265BarExt = false ;
         AV13Barcod = A129BarCod ;
         AV14Barcodreo = A132BarCodReo ;
         AV15Barcodpar = A130BarCodPar ;
         if ( AV11BarExt == 2 )
         {
            /* Execute user subroutine: 'BUSCAENTREG' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Using cursor P091B3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2265BarExt), Byte.valueOf(A2265BarExt), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV18Flag, httpContext.getMessage( "N", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P091B4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV9FasCod, Short.valueOf(AV8BarOrdlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P091B4_A194BarOrdLin[0] ;
         A457FasCod = P091B4_A457FasCod[0] ;
         A153BarFasEst = P091B4_A153BarFasEst[0] ;
         A12454TsSolTLcq = P091B4_A12454TsSolTLcq[0] ;
         n12454TsSolTLcq = P091B4_n12454TsSolTLcq[0] ;
         A160BarFecRea = P091B4_A160BarFecRea[0] ;
         A3298BarFecRIni = P091B4_A3298BarFecRIni[0] ;
         A4442BarFasDTI = P091B4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P091B4_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P091B4_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P091B4_n4443BarFasDTF[0] ;
         A758ProCod = P091B4_A758ProCod[0] ;
         if ( AV11BarExt == 0 )
         {
            A153BarFasEst = (byte)(0) ;
            A12454TsSolTLcq = 0 ;
            n12454TsSolTLcq = false ;
         }
         if ( AV11BarExt == 1 )
         {
            A153BarFasEst = (byte)(1) ;
            A160BarFecRea = AV10FechaE ;
            A3298BarFecRIni = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) ? AV10FechaE : A3298BarFecRIni) ;
            A4442BarFasDTI = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            A12454TsSolTLcq = 1 ;
            n12454TsSolTLcq = false ;
         }
         if ( AV11BarExt == 2 )
         {
            A153BarFasEst = (byte)(2) ;
            A160BarFecRea = AV10FechaE ;
            A3298BarFecRIni = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) ? AV10FechaE : A3298BarFecRIni) ;
            A4443BarFasDTF = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n4443BarFasDTF = false ;
            A12454TsSolTLcq = 2 ;
            n12454TsSolTLcq = false ;
         }
         /* Using cursor P091B5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), Boolean.valueOf(n12454TsSolTLcq), Integer.valueOf(A12454TsSolTLcq), A160BarFecRea, A3298BarFecRIni, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAENTREG' Routine */
      returnInSub = false ;
      /* Using cursor P091B6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV12SalExtAlb), Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar, AV9FasCod, Short.valueOf(AV8BarOrdlin)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A654OrdLin = P091B6_A654OrdLin[0] ;
         A6558FasCodn = P091B6_A6558FasCodn[0] ;
         A2253SalExtAlb = P091B6_A2253SalExtAlb[0] ;
         A6248SalExNln = P091B6_A6248SalExNln[0] ;
         A6256SalExKgE = P091B6_A6256SalExKgE[0] ;
         A6258SalExMtE = P091B6_A6258SalExMtE[0] ;
         AV17SalExtKgE = A6256SalExKgE ;
         AV16SalExtMtE = A6258SalExMtE ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrexw.this.A396EmprCod;
      this.aP1[0] = phdrexw.this.A129BarCod;
      this.aP2[0] = phdrexw.this.A132BarCodReo;
      this.aP3[0] = phdrexw.this.A130BarCodPar;
      this.aP4[0] = phdrexw.this.AV8BarOrdlin;
      this.aP5[0] = phdrexw.this.AV9FasCod;
      this.aP6[0] = phdrexw.this.AV10FechaE;
      this.aP7[0] = phdrexw.this.AV11BarExt;
      this.aP8[0] = phdrexw.this.AV12SalExtAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.phdrexw");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Flag = "" ;
      scmdbuf = "" ;
      P091B2_A396EmprCod = new String[] {""} ;
      P091B2_A129BarCod = new int[1] ;
      P091B2_A132BarCodReo = new byte[1] ;
      P091B2_A130BarCodPar = new String[] {""} ;
      P091B2_A2265BarExt = new byte[1] ;
      P091B2_n2265BarExt = new boolean[] {false} ;
      AV15Barcodpar = "" ;
      P091B4_A396EmprCod = new String[] {""} ;
      P091B4_A129BarCod = new int[1] ;
      P091B4_A132BarCodReo = new byte[1] ;
      P091B4_A130BarCodPar = new String[] {""} ;
      P091B4_A194BarOrdLin = new short[1] ;
      P091B4_A457FasCod = new String[] {""} ;
      P091B4_A153BarFasEst = new byte[1] ;
      P091B4_A12454TsSolTLcq = new int[1] ;
      P091B4_n12454TsSolTLcq = new boolean[] {false} ;
      P091B4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P091B4_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P091B4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P091B4_n4442BarFasDTI = new boolean[] {false} ;
      P091B4_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P091B4_n4443BarFasDTF = new boolean[] {false} ;
      P091B4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      P091B6_A396EmprCod = new String[] {""} ;
      P091B6_A654OrdLin = new short[1] ;
      P091B6_A6558FasCodn = new String[] {""} ;
      P091B6_A130BarCodPar = new String[] {""} ;
      P091B6_A132BarCodReo = new byte[1] ;
      P091B6_A129BarCod = new int[1] ;
      P091B6_A2253SalExtAlb = new int[1] ;
      P091B6_A6248SalExNln = new short[1] ;
      P091B6_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091B6_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6558FasCodn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      AV17SalExtKgE = DecimalUtil.ZERO ;
      AV16SalExtMtE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.phdrexw__default(),
         new Object[] {
             new Object[] {
            P091B2_A396EmprCod, P091B2_A129BarCod, P091B2_A132BarCodReo, P091B2_A130BarCodPar, P091B2_A2265BarExt, P091B2_n2265BarExt
            }
            , new Object[] {
            }
            , new Object[] {
            P091B4_A396EmprCod, P091B4_A129BarCod, P091B4_A132BarCodReo, P091B4_A130BarCodPar, P091B4_A194BarOrdLin, P091B4_A457FasCod, P091B4_A153BarFasEst, P091B4_A12454TsSolTLcq, P091B4_n12454TsSolTLcq, P091B4_A160BarFecRea,
            P091B4_A3298BarFecRIni, P091B4_A4442BarFasDTI, P091B4_n4442BarFasDTI, P091B4_A4443BarFasDTF, P091B4_n4443BarFasDTF, P091B4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P091B6_A396EmprCod, P091B6_A654OrdLin, P091B6_A6558FasCodn, P091B6_A130BarCodPar, P091B6_A132BarCodReo, P091B6_A129BarCod, P091B6_A2253SalExtAlb, P091B6_A6248SalExNln, P091B6_A6256SalExKgE, P091B6_A6258SalExMtE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarExt ;
   private byte A2265BarExt ;
   private byte AV14Barcodreo ;
   private byte A153BarFasEst ;
   private short AV8BarOrdlin ;
   private short A194BarOrdLin ;
   private short A654OrdLin ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12SalExtAlb ;
   private int AV13Barcod ;
   private int A12454TsSolTLcq ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal AV17SalExtKgE ;
   private java.math.BigDecimal AV16SalExtMtE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9FasCod ;
   private String AV18Flag ;
   private String scmdbuf ;
   private String AV15Barcodpar ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A6558FasCodn ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV10FechaE ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n2265BarExt ;
   private boolean returnInSub ;
   private boolean n12454TsSolTLcq ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private int[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P091B2_A396EmprCod ;
   private int[] P091B2_A129BarCod ;
   private byte[] P091B2_A132BarCodReo ;
   private String[] P091B2_A130BarCodPar ;
   private byte[] P091B2_A2265BarExt ;
   private boolean[] P091B2_n2265BarExt ;
   private String[] P091B4_A396EmprCod ;
   private int[] P091B4_A129BarCod ;
   private byte[] P091B4_A132BarCodReo ;
   private String[] P091B4_A130BarCodPar ;
   private short[] P091B4_A194BarOrdLin ;
   private String[] P091B4_A457FasCod ;
   private byte[] P091B4_A153BarFasEst ;
   private int[] P091B4_A12454TsSolTLcq ;
   private boolean[] P091B4_n12454TsSolTLcq ;
   private java.util.Date[] P091B4_A160BarFecRea ;
   private java.util.Date[] P091B4_A3298BarFecRIni ;
   private java.util.Date[] P091B4_A4442BarFasDTI ;
   private boolean[] P091B4_n4442BarFasDTI ;
   private java.util.Date[] P091B4_A4443BarFasDTF ;
   private boolean[] P091B4_n4443BarFasDTF ;
   private String[] P091B4_A758ProCod ;
   private String[] P091B6_A396EmprCod ;
   private short[] P091B6_A654OrdLin ;
   private String[] P091B6_A6558FasCodn ;
   private String[] P091B6_A130BarCodPar ;
   private byte[] P091B6_A132BarCodReo ;
   private int[] P091B6_A129BarCod ;
   private int[] P091B6_A2253SalExtAlb ;
   private short[] P091B6_A6248SalExNln ;
   private java.math.BigDecimal[] P091B6_A6256SalExKgE ;
   private java.math.BigDecimal[] P091B6_A6258SalExMtE ;
}

final  class phdrexw__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091B2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P091B3", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P091B4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod, BarFasEst, TsSolTLcq, BarFecRea, BarFecRIni, BarFasDTI, BarFasDTF, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P091B5", "UPDATE TXPBARFAS SET BarFasEst=?, TsSolTLcq=?, BarFecRea=?, BarFecRIni=?, BarFasDTI=?, BarFasDTF=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P091B6", "SELECT EmprCod, OrdLin, FasCodn, BarCodPar, BarCodReo, BarCod, SalExtAlb, SalExNln, SalExKgE, SalExMtE FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCodn = ?) AND (OrdLin = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setDate(4, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               stmt.setString(7, (String)parms[9], 3);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setString(10, (String)parms[12], 1);
               stmt.setString(11, (String)parms[13], 8);
               stmt.setShort(12, ((Number) parms[14]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

