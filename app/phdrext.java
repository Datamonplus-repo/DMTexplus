package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrext extends GXProcedure
{
   public phdrext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrext.class ), "" );
   }

   public phdrext( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          java.util.Date[] aP5 ,
                          byte[] aP6 )
   {
      phdrext.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 )
   {
      phdrext.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrext.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phdrext.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrext.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrext.this.AV15FasCod = aP4[0];
      this.aP4 = aP4;
      phdrext.this.AV16FechaE = aP5[0];
      this.aP5 = aP5;
      phdrext.this.AV17BarExt = aP6[0];
      this.aP6 = aP6;
      phdrext.this.AV19SalExtAlb = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "In Phdrext", "") );
      AV18Flag = httpContext.getMessage( "S", "") ;
      /* Using cursor P00CT3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2265BarExt = P00CT3_A2265BarExt[0] ;
         n2265BarExt = P00CT3_n2265BarExt[0] ;
         A166BarKgm = P00CT3_A166BarKgm[0] ;
         A184BarMtr = P00CT3_A184BarMtr[0] ;
         A166BarKgm = P00CT3_A166BarKgm[0] ;
         A184BarMtr = P00CT3_A184BarMtr[0] ;
         A2265BarExt = AV17BarExt ;
         n2265BarExt = false ;
         if ( AV17BarExt == 2 )
         {
            /* Execute user subroutine: 'BUSCAENTREG' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( ( DecimalUtil.compareTo(A184BarMtr, AV21SalExtMtE) != 0 ) ) || ( ( DecimalUtil.compareTo(A166BarKgm, AV20SalExtKgE) != 0 ) ) )
            {
            }
         }
         /* Using cursor P00CT4 */
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
      /* Using cursor P00CT5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV15FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P00CT5_A457FasCod[0] ;
         A153BarFasEst = P00CT5_A153BarFasEst[0] ;
         A160BarFecRea = P00CT5_A160BarFecRea[0] ;
         A3298BarFecRIni = P00CT5_A3298BarFecRIni[0] ;
         A4442BarFasDTI = P00CT5_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P00CT5_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P00CT5_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P00CT5_n4443BarFasDTF[0] ;
         A758ProCod = P00CT5_A758ProCod[0] ;
         A194BarOrdLin = P00CT5_A194BarOrdLin[0] ;
         if ( AV17BarExt == 0 )
         {
            A153BarFasEst = (byte)(0) ;
         }
         if ( AV17BarExt == 1 )
         {
            A153BarFasEst = (byte)(1) ;
            A160BarFecRea = AV16FechaE ;
            A3298BarFecRIni = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) ? AV16FechaE : A3298BarFecRIni) ;
            A4442BarFasDTI = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n4442BarFasDTI = false ;
         }
         if ( AV17BarExt == 2 )
         {
            A153BarFasEst = (byte)(2) ;
            A160BarFecRea = AV16FechaE ;
            A3298BarFecRIni = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) ? AV16FechaE : A3298BarFecRIni) ;
            A4443BarFasDTF = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n4443BarFasDTF = false ;
         }
         /* Using cursor P00CT6 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, A3298BarFecRIni, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      System.out.println( httpContext.getMessage( "In Phdrext.End Tabla BARFAS", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAENTREG' Routine */
      returnInSub = false ;
      /* Using cursor P00CT7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV19SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A2253SalExtAlb = P00CT7_A2253SalExtAlb[0] ;
         A3555SalExtKgE = P00CT7_A3555SalExtKgE[0] ;
         n3555SalExtKgE = P00CT7_n3555SalExtKgE[0] ;
         A3557SalExtMtE = P00CT7_A3557SalExtMtE[0] ;
         n3557SalExtMtE = P00CT7_n3557SalExtMtE[0] ;
         AV20SalExtKgE = A3555SalExtKgE ;
         AV21SalExtMtE = A3557SalExtMtE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrext.this.A396EmprCod;
      this.aP1[0] = phdrext.this.A129BarCod;
      this.aP2[0] = phdrext.this.A132BarCodReo;
      this.aP3[0] = phdrext.this.A130BarCodPar;
      this.aP4[0] = phdrext.this.AV15FasCod;
      this.aP5[0] = phdrext.this.AV16FechaE;
      this.aP6[0] = phdrext.this.AV17BarExt;
      this.aP7[0] = phdrext.this.AV19SalExtAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrext");
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
      P00CT3_A396EmprCod = new String[] {""} ;
      P00CT3_A129BarCod = new int[1] ;
      P00CT3_A132BarCodReo = new byte[1] ;
      P00CT3_A130BarCodPar = new String[] {""} ;
      P00CT3_A2265BarExt = new byte[1] ;
      P00CT3_n2265BarExt = new boolean[] {false} ;
      P00CT3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CT3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV21SalExtMtE = DecimalUtil.ZERO ;
      AV20SalExtKgE = DecimalUtil.ZERO ;
      P00CT5_A396EmprCod = new String[] {""} ;
      P00CT5_A129BarCod = new int[1] ;
      P00CT5_A132BarCodReo = new byte[1] ;
      P00CT5_A130BarCodPar = new String[] {""} ;
      P00CT5_A457FasCod = new String[] {""} ;
      P00CT5_A153BarFasEst = new byte[1] ;
      P00CT5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00CT5_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00CT5_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P00CT5_n4442BarFasDTI = new boolean[] {false} ;
      P00CT5_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00CT5_n4443BarFasDTF = new boolean[] {false} ;
      P00CT5_A758ProCod = new String[] {""} ;
      P00CT5_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      P00CT7_A396EmprCod = new String[] {""} ;
      P00CT7_A129BarCod = new int[1] ;
      P00CT7_A132BarCodReo = new byte[1] ;
      P00CT7_A130BarCodPar = new String[] {""} ;
      P00CT7_A2253SalExtAlb = new int[1] ;
      P00CT7_A3555SalExtKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CT7_n3555SalExtKgE = new boolean[] {false} ;
      P00CT7_A3557SalExtMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CT7_n3557SalExtMtE = new boolean[] {false} ;
      A3555SalExtKgE = DecimalUtil.ZERO ;
      A3557SalExtMtE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrext__default(),
         new Object[] {
             new Object[] {
            P00CT3_A396EmprCod, P00CT3_A129BarCod, P00CT3_A132BarCodReo, P00CT3_A130BarCodPar, P00CT3_A2265BarExt, P00CT3_n2265BarExt, P00CT3_A166BarKgm, P00CT3_A184BarMtr
            }
            , new Object[] {
            }
            , new Object[] {
            P00CT5_A396EmprCod, P00CT5_A129BarCod, P00CT5_A132BarCodReo, P00CT5_A130BarCodPar, P00CT5_A457FasCod, P00CT5_A153BarFasEst, P00CT5_A160BarFecRea, P00CT5_A3298BarFecRIni, P00CT5_A4442BarFasDTI, P00CT5_n4442BarFasDTI,
            P00CT5_A4443BarFasDTF, P00CT5_n4443BarFasDTF, P00CT5_A758ProCod, P00CT5_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00CT7_A396EmprCod, P00CT7_A129BarCod, P00CT7_A132BarCodReo, P00CT7_A130BarCodPar, P00CT7_A2253SalExtAlb, P00CT7_A3555SalExtKgE, P00CT7_n3555SalExtKgE, P00CT7_A3557SalExtMtE, P00CT7_n3557SalExtMtE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17BarExt ;
   private byte A2265BarExt ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV19SalExtAlb ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV21SalExtMtE ;
   private java.math.BigDecimal AV20SalExtKgE ;
   private java.math.BigDecimal A3555SalExtKgE ;
   private java.math.BigDecimal A3557SalExtMtE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15FasCod ;
   private String AV18Flag ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV16FechaE ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n2265BarExt ;
   private boolean returnInSub ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3555SalExtKgE ;
   private boolean n3557SalExtMtE ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.util.Date[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CT3_A396EmprCod ;
   private int[] P00CT3_A129BarCod ;
   private byte[] P00CT3_A132BarCodReo ;
   private String[] P00CT3_A130BarCodPar ;
   private byte[] P00CT3_A2265BarExt ;
   private boolean[] P00CT3_n2265BarExt ;
   private java.math.BigDecimal[] P00CT3_A166BarKgm ;
   private java.math.BigDecimal[] P00CT3_A184BarMtr ;
   private String[] P00CT5_A396EmprCod ;
   private int[] P00CT5_A129BarCod ;
   private byte[] P00CT5_A132BarCodReo ;
   private String[] P00CT5_A130BarCodPar ;
   private String[] P00CT5_A457FasCod ;
   private byte[] P00CT5_A153BarFasEst ;
   private java.util.Date[] P00CT5_A160BarFecRea ;
   private java.util.Date[] P00CT5_A3298BarFecRIni ;
   private java.util.Date[] P00CT5_A4442BarFasDTI ;
   private boolean[] P00CT5_n4442BarFasDTI ;
   private java.util.Date[] P00CT5_A4443BarFasDTF ;
   private boolean[] P00CT5_n4443BarFasDTF ;
   private String[] P00CT5_A758ProCod ;
   private short[] P00CT5_A194BarOrdLin ;
   private String[] P00CT7_A396EmprCod ;
   private int[] P00CT7_A129BarCod ;
   private byte[] P00CT7_A132BarCodReo ;
   private String[] P00CT7_A130BarCodPar ;
   private int[] P00CT7_A2253SalExtAlb ;
   private java.math.BigDecimal[] P00CT7_A3555SalExtKgE ;
   private boolean[] P00CT7_n3555SalExtKgE ;
   private java.math.BigDecimal[] P00CT7_A3557SalExtMtE ;
   private boolean[] P00CT7_n3557SalExtMtE ;
}

final  class phdrext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CT3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarExt, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CT4", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00CT5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarFecRea, BarFecRIni, BarFasDTI, BarFasDTF, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CT6", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarFecRIni=?, BarFasDTI=?, BarFasDTF=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P00CT7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SalExtAlb, SalExtKgE, SalExtMtE FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
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
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               stmt.setString(10, (String)parms[11], 8);
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

