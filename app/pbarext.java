package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarext extends GXProcedure
{
   public pbarext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarext.class ), "" );
   }

   public pbarext( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 )
   {
      pbarext.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pbarext.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarext.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbarext.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarext.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarext.this.AV16FechaE = aP4[0];
      this.aP4 = aP4;
      pbarext.this.AV17BarExt = aP5[0];
      this.aP5 = aP5;
      pbarext.this.AV19SalExtAlb = aP6[0];
      this.aP6 = aP6;
      pbarext.this.AV26SalExNln = aP7[0];
      this.aP7 = aP7;
      pbarext.this.AV18Flag = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P056C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2265BarExt = P056C2_A2265BarExt[0] ;
         n2265BarExt = P056C2_n2265BarExt[0] ;
         A2265BarExt = AV17BarExt ;
         n2265BarExt = false ;
         AV22Barcod = A129BarCod ;
         AV23Barcodreo = A132BarCodReo ;
         AV24Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BUSCAENTREG' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV17BarExt == 2 )
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
         /* Using cursor P056C3 */
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
      /* Using cursor P056C4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV15FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P056C4_A457FasCod[0] ;
         A153BarFasEst = P056C4_A153BarFasEst[0] ;
         A160BarFecRea = P056C4_A160BarFecRea[0] ;
         A3298BarFecRIni = P056C4_A3298BarFecRIni[0] ;
         A194BarOrdLin = P056C4_A194BarOrdLin[0] ;
         A758ProCod = P056C4_A758ProCod[0] ;
         if ( AV17BarExt == 0 )
         {
            A153BarFasEst = (byte)(0) ;
         }
         if ( AV17BarExt == 1 )
         {
            A153BarFasEst = (byte)(1) ;
            A160BarFecRea = AV16FechaE ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) )
            {
               A3298BarFecRIni = AV16FechaE ;
            }
         }
         if ( AV17BarExt == 2 )
         {
            A153BarFasEst = (byte)(2) ;
            A160BarFecRea = AV16FechaE ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) )
            {
               A3298BarFecRIni = AV16FechaE ;
            }
         }
         /* Using cursor P056C5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, A3298BarFecRIni, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
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
      /* Using cursor P056C6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV19SalExtAlb), Integer.valueOf(AV22Barcod), Byte.valueOf(AV23Barcodreo), AV24Barcodpar, AV15FasCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A6558FasCodn = P056C6_A6558FasCodn[0] ;
         A2253SalExtAlb = P056C6_A2253SalExtAlb[0] ;
         A6248SalExNln = P056C6_A6248SalExNln[0] ;
         A6256SalExKgE = P056C6_A6256SalExKgE[0] ;
         A6258SalExMtE = P056C6_A6258SalExMtE[0] ;
         AV20SalExtKgE = A6256SalExKgE ;
         AV21SalExtMtE = A6258SalExMtE ;
         AV15FasCod = A6558FasCodn ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarext.this.A396EmprCod;
      this.aP1[0] = pbarext.this.A129BarCod;
      this.aP2[0] = pbarext.this.A132BarCodReo;
      this.aP3[0] = pbarext.this.A130BarCodPar;
      this.aP4[0] = pbarext.this.AV16FechaE;
      this.aP5[0] = pbarext.this.AV17BarExt;
      this.aP6[0] = pbarext.this.AV19SalExtAlb;
      this.aP7[0] = pbarext.this.AV26SalExNln;
      this.aP8[0] = pbarext.this.AV18Flag;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbarext");
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
      P056C2_A396EmprCod = new String[] {""} ;
      P056C2_A129BarCod = new int[1] ;
      P056C2_A132BarCodReo = new byte[1] ;
      P056C2_A130BarCodPar = new String[] {""} ;
      P056C2_A2265BarExt = new byte[1] ;
      P056C2_n2265BarExt = new boolean[] {false} ;
      AV24Barcodpar = "" ;
      AV15FasCod = "" ;
      P056C4_A396EmprCod = new String[] {""} ;
      P056C4_A129BarCod = new int[1] ;
      P056C4_A132BarCodReo = new byte[1] ;
      P056C4_A130BarCodPar = new String[] {""} ;
      P056C4_A457FasCod = new String[] {""} ;
      P056C4_A153BarFasEst = new byte[1] ;
      P056C4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P056C4_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P056C4_A194BarOrdLin = new short[1] ;
      P056C4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A758ProCod = "" ;
      P056C6_A396EmprCod = new String[] {""} ;
      P056C6_A6558FasCodn = new String[] {""} ;
      P056C6_A130BarCodPar = new String[] {""} ;
      P056C6_A132BarCodReo = new byte[1] ;
      P056C6_A129BarCod = new int[1] ;
      P056C6_A2253SalExtAlb = new int[1] ;
      P056C6_A6248SalExNln = new short[1] ;
      P056C6_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056C6_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6558FasCodn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      AV20SalExtKgE = DecimalUtil.ZERO ;
      AV21SalExtMtE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarext__default(),
         new Object[] {
             new Object[] {
            P056C2_A396EmprCod, P056C2_A129BarCod, P056C2_A132BarCodReo, P056C2_A130BarCodPar, P056C2_A2265BarExt, P056C2_n2265BarExt
            }
            , new Object[] {
            }
            , new Object[] {
            P056C4_A396EmprCod, P056C4_A129BarCod, P056C4_A132BarCodReo, P056C4_A130BarCodPar, P056C4_A457FasCod, P056C4_A153BarFasEst, P056C4_A160BarFecRea, P056C4_A3298BarFecRIni, P056C4_A194BarOrdLin, P056C4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P056C6_A396EmprCod, P056C6_A6558FasCodn, P056C6_A130BarCodPar, P056C6_A132BarCodReo, P056C6_A129BarCod, P056C6_A2253SalExtAlb, P056C6_A6248SalExNln, P056C6_A6256SalExKgE, P056C6_A6258SalExMtE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17BarExt ;
   private byte A2265BarExt ;
   private byte AV23Barcodreo ;
   private byte A153BarFasEst ;
   private short AV26SalExNln ;
   private short A194BarOrdLin ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV19SalExtAlb ;
   private int AV22Barcod ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal AV20SalExtKgE ;
   private java.math.BigDecimal AV21SalExtMtE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV18Flag ;
   private String scmdbuf ;
   private String AV24Barcodpar ;
   private String AV15FasCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A6558FasCodn ;
   private java.util.Date AV16FechaE ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n2265BarExt ;
   private boolean returnInSub ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P056C2_A396EmprCod ;
   private int[] P056C2_A129BarCod ;
   private byte[] P056C2_A132BarCodReo ;
   private String[] P056C2_A130BarCodPar ;
   private byte[] P056C2_A2265BarExt ;
   private boolean[] P056C2_n2265BarExt ;
   private String[] P056C4_A396EmprCod ;
   private int[] P056C4_A129BarCod ;
   private byte[] P056C4_A132BarCodReo ;
   private String[] P056C4_A130BarCodPar ;
   private String[] P056C4_A457FasCod ;
   private byte[] P056C4_A153BarFasEst ;
   private java.util.Date[] P056C4_A160BarFecRea ;
   private java.util.Date[] P056C4_A3298BarFecRIni ;
   private short[] P056C4_A194BarOrdLin ;
   private String[] P056C4_A758ProCod ;
   private String[] P056C6_A396EmprCod ;
   private String[] P056C6_A6558FasCodn ;
   private String[] P056C6_A130BarCodPar ;
   private byte[] P056C6_A132BarCodReo ;
   private int[] P056C6_A129BarCod ;
   private int[] P056C6_A2253SalExtAlb ;
   private short[] P056C6_A6248SalExNln ;
   private java.math.BigDecimal[] P056C6_A6256SalExKgE ;
   private java.math.BigDecimal[] P056C6_A6258SalExMtE ;
}

final  class pbarext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056C2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P056C3", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P056C4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarFecRea, BarFecRIni, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P056C5", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarFecRIni=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P056C6", "SELECT EmprCod, FasCodn, BarCodPar, BarCodReo, BarCod, SalExtAlb, SalExNln, SalExKgE, SalExMtE FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCodn = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
      }
   }

}

