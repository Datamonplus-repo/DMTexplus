package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrex9 extends GXProcedure
{
   public phdrex9( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrex9.class ), "" );
   }

   public phdrex9( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             short[] aP8 )
   {
      phdrex9.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      phdrex9.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrex9.this.AV24BarCod = aP1[0];
      this.aP1 = aP1;
      phdrex9.this.AV25BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrex9.this.AV26BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrex9.this.AV15FasCod = aP4[0];
      this.aP4 = aP4;
      phdrex9.this.AV16FechaE = aP5[0];
      this.aP5 = aP5;
      phdrex9.this.AV17BarExt = aP6[0];
      this.aP6 = aP6;
      phdrex9.this.AV19SalExtAlb = aP7[0];
      this.aP7 = aP7;
      phdrex9.this.AV22SalExNln = aP8[0];
      this.aP8 = aP8;
      phdrex9.this.AV23OpDel = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = httpContext.getMessage( "S", "") ;
      /* Using cursor P055F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodReo), AV26BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P055F2_A130BarCodPar[0] ;
         A132BarCodReo = P055F2_A132BarCodReo[0] ;
         A129BarCod = P055F2_A129BarCod[0] ;
         A2265BarExt = P055F2_A2265BarExt[0] ;
         n2265BarExt = P055F2_n2265BarExt[0] ;
         A2265BarExt = AV17BarExt ;
         n2265BarExt = false ;
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
         /* Using cursor P055F3 */
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
      System.out.println( httpContext.getMessage( "In Phdrext.Read Tabla BARFAS", "") );
      /* Using cursor P055F4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodReo), AV26BarCodPar, AV15FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P055F4_A457FasCod[0] ;
         A130BarCodPar = P055F4_A130BarCodPar[0] ;
         A132BarCodReo = P055F4_A132BarCodReo[0] ;
         A129BarCod = P055F4_A129BarCod[0] ;
         A153BarFasEst = P055F4_A153BarFasEst[0] ;
         A160BarFecRea = P055F4_A160BarFecRea[0] ;
         A3298BarFecRIni = P055F4_A3298BarFecRIni[0] ;
         A758ProCod = P055F4_A758ProCod[0] ;
         A194BarOrdLin = P055F4_A194BarOrdLin[0] ;
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
         /* Using cursor P055F5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, A3298BarFecRIni, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV23OpDel, httpContext.getMessage( "HDR", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P055F6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV19SalExtAlb), Short.valueOf(AV22SalExNln)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
         /* End optimized DELETE. */
      }
      System.out.println( httpContext.getMessage( "In Phdrext.End Tabla BARFAS", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAENTREG' Routine */
      returnInSub = false ;
      /* Using cursor P055F7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV19SalExtAlb), Short.valueOf(A6248SalExNln)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A6248SalExNln = P055F7_A6248SalExNln[0] ;
         A2253SalExtAlb = P055F7_A2253SalExtAlb[0] ;
         A6256SalExKgE = P055F7_A6256SalExKgE[0] ;
         A6258SalExMtE = P055F7_A6258SalExMtE[0] ;
         AV20SalExtKgE = A6256SalExKgE ;
         AV21SalExtMtE = A6258SalExMtE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrex9.this.A396EmprCod;
      this.aP1[0] = phdrex9.this.AV24BarCod;
      this.aP2[0] = phdrex9.this.AV25BarCodReo;
      this.aP3[0] = phdrex9.this.AV26BarCodPar;
      this.aP4[0] = phdrex9.this.AV15FasCod;
      this.aP5[0] = phdrex9.this.AV16FechaE;
      this.aP6[0] = phdrex9.this.AV17BarExt;
      this.aP7[0] = phdrex9.this.AV19SalExtAlb;
      this.aP8[0] = phdrex9.this.AV22SalExNln;
      this.aP9[0] = phdrex9.this.AV23OpDel;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrex9");
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
      P055F2_A396EmprCod = new String[] {""} ;
      P055F2_A130BarCodPar = new String[] {""} ;
      P055F2_A132BarCodReo = new byte[1] ;
      P055F2_A129BarCod = new int[1] ;
      P055F2_A2265BarExt = new byte[1] ;
      P055F2_n2265BarExt = new boolean[] {false} ;
      A130BarCodPar = "" ;
      P055F4_A396EmprCod = new String[] {""} ;
      P055F4_A457FasCod = new String[] {""} ;
      P055F4_A130BarCodPar = new String[] {""} ;
      P055F4_A132BarCodReo = new byte[1] ;
      P055F4_A129BarCod = new int[1] ;
      P055F4_A153BarFasEst = new byte[1] ;
      P055F4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P055F4_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P055F4_A758ProCod = new String[] {""} ;
      P055F4_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A758ProCod = "" ;
      P055F7_A396EmprCod = new String[] {""} ;
      P055F7_A6248SalExNln = new short[1] ;
      P055F7_A2253SalExtAlb = new int[1] ;
      P055F7_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055F7_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      AV20SalExtKgE = DecimalUtil.ZERO ;
      AV21SalExtMtE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrex9__default(),
         new Object[] {
             new Object[] {
            P055F2_A396EmprCod, P055F2_A130BarCodPar, P055F2_A132BarCodReo, P055F2_A129BarCod, P055F2_A2265BarExt, P055F2_n2265BarExt
            }
            , new Object[] {
            }
            , new Object[] {
            P055F4_A396EmprCod, P055F4_A457FasCod, P055F4_A130BarCodPar, P055F4_A132BarCodReo, P055F4_A129BarCod, P055F4_A153BarFasEst, P055F4_A160BarFecRea, P055F4_A3298BarFecRIni, P055F4_A758ProCod, P055F4_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P055F7_A396EmprCod, P055F7_A6248SalExNln, P055F7_A2253SalExtAlb, P055F7_A6256SalExKgE, P055F7_A6258SalExMtE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25BarCodReo ;
   private byte AV17BarExt ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte A153BarFasEst ;
   private short AV22SalExNln ;
   private short A194BarOrdLin ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int AV24BarCod ;
   private int AV19SalExtAlb ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal AV20SalExtKgE ;
   private java.math.BigDecimal AV21SalExtMtE ;
   private String A396EmprCod ;
   private String AV26BarCodPar ;
   private String AV15FasCod ;
   private String AV23OpDel ;
   private String AV18Flag ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.util.Date AV16FechaE ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n2265BarExt ;
   private boolean returnInSub ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.util.Date[] aP5 ;
   private byte[] aP6 ;
   private int[] aP7 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P055F2_A396EmprCod ;
   private String[] P055F2_A130BarCodPar ;
   private byte[] P055F2_A132BarCodReo ;
   private int[] P055F2_A129BarCod ;
   private byte[] P055F2_A2265BarExt ;
   private boolean[] P055F2_n2265BarExt ;
   private String[] P055F4_A396EmprCod ;
   private String[] P055F4_A457FasCod ;
   private String[] P055F4_A130BarCodPar ;
   private byte[] P055F4_A132BarCodReo ;
   private int[] P055F4_A129BarCod ;
   private byte[] P055F4_A153BarFasEst ;
   private java.util.Date[] P055F4_A160BarFecRea ;
   private java.util.Date[] P055F4_A3298BarFecRIni ;
   private String[] P055F4_A758ProCod ;
   private short[] P055F4_A194BarOrdLin ;
   private String[] P055F7_A396EmprCod ;
   private short[] P055F7_A6248SalExNln ;
   private int[] P055F7_A2253SalExtAlb ;
   private java.math.BigDecimal[] P055F7_A6256SalExKgE ;
   private java.math.BigDecimal[] P055F7_A6258SalExMtE ;
}

final  class phdrex9__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055F2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055F3", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P055F4", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarFasEst, BarFecRea, BarFecRIni, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055F5", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarFecRIni=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P055F6", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? and SalExtAlb = ? and SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new ForEachCursor("P055F7", "SELECT EmprCod, SalExNln, SalExtAlb, SalExKgE, SalExMtE FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? and SalExNln = ? ORDER BY EmprCod, SalExtAlb, SalExNln ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

