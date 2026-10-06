package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactbar extends GXProcedure
{
   public pactbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactbar.class ), "" );
   }

   public pactbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          java.util.Date[] aP2 )
   {
      pactbar.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 )
   {
      pactbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactbar.this.AV17MaqCod = aP1[0];
      this.aP1 = aP1;
      pactbar.this.AV15HisProFec = aP2[0];
      this.aP2 = aP2;
      pactbar.this.AV16HisProLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000L5 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17MaqCod, AV15HisProFec, Integer.valueOf(AV16HisProLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P000L5_A130BarCodPar[0] ;
         n130BarCodPar = P000L5_n130BarCodPar[0] ;
         A132BarCodReo = P000L5_A132BarCodReo[0] ;
         n132BarCodReo = P000L5_n132BarCodReo[0] ;
         A129BarCod = P000L5_A129BarCod[0] ;
         n129BarCod = P000L5_n129BarCod[0] ;
         A194BarOrdLin = P000L5_A194BarOrdLin[0] ;
         A602MaqCod = P000L5_A602MaqCod[0] ;
         n602MaqCod = P000L5_n602MaqCod[0] ;
         A561HisProLin = P000L5_A561HisProLin[0] ;
         A558HisProFec = P000L5_A558HisProFec[0] ;
         A154BarFasLin = P000L5_A154BarFasLin[0] ;
         n154BarFasLin = P000L5_n154BarFasLin[0] ;
         A210BarProCod = P000L5_A210BarProCod[0] ;
         n210BarProCod = P000L5_n210BarProCod[0] ;
         A154BarFasLin = P000L5_A154BarFasLin[0] ;
         n154BarFasLin = P000L5_n154BarFasLin[0] ;
         A210BarProCod = P000L5_A210BarProCod[0] ;
         n210BarProCod = P000L5_n210BarProCod[0] ;
         /* Using cursor P000L6 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A459FasDec = P000L6_A459FasDec[0] ;
            n459FasDec = P000L6_n459FasDec[0] ;
            A457FasCod = P000L6_A457FasCod[0] ;
            AV19Decal = A459FasDec ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P000L7 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A194BarOrdLin), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A194BarOrdLin), Boolean.valueOf(n210BarProCod), A210BarProCod, Boolean.valueOf(n154BarFasLin), Short.valueOf(A154BarFasLin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A758ProCod = P000L7_A758ProCod[0] ;
            A179BarLoc = P000L7_A179BarLoc[0] ;
            if ( ( GXutil.strcmp(A758ProCod, A210BarProCod) == 0 ) && ( A194BarOrdLin == A154BarFasLin ) )
            {
               /* Using cursor P000L8 */
               pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               A181BarMaqPro = P000L8_A181BarMaqPro[0] ;
               A142BarDiaP = P000L8_A142BarDiaP[0] ;
               A181BarMaqPro = A602MaqCod ;
               A142BarDiaP = AV19Decal ;
               /* Using cursor P000L9 */
               pr_default.execute(4, new Object[] {A181BarMaqPro, A142BarDiaP, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactbar.this.A396EmprCod;
      this.aP1[0] = pactbar.this.AV17MaqCod;
      this.aP2[0] = pactbar.this.AV15HisProFec;
      this.aP3[0] = pactbar.this.AV16HisProLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactbar");
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
      P000L5_A396EmprCod = new String[] {""} ;
      P000L5_A130BarCodPar = new String[] {""} ;
      P000L5_n130BarCodPar = new boolean[] {false} ;
      P000L5_A132BarCodReo = new byte[1] ;
      P000L5_n132BarCodReo = new boolean[] {false} ;
      P000L5_A129BarCod = new int[1] ;
      P000L5_n129BarCod = new boolean[] {false} ;
      P000L5_A194BarOrdLin = new short[1] ;
      P000L5_A602MaqCod = new String[] {""} ;
      P000L5_n602MaqCod = new boolean[] {false} ;
      P000L5_A561HisProLin = new int[1] ;
      P000L5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000L5_A154BarFasLin = new short[1] ;
      P000L5_n154BarFasLin = new boolean[] {false} ;
      P000L5_A210BarProCod = new String[] {""} ;
      P000L5_n210BarProCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A210BarProCod = "" ;
      P000L6_A396EmprCod = new String[] {""} ;
      P000L6_A602MaqCod = new String[] {""} ;
      P000L6_n602MaqCod = new boolean[] {false} ;
      P000L6_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000L6_n459FasDec = new boolean[] {false} ;
      P000L6_A457FasCod = new String[] {""} ;
      A459FasDec = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      AV19Decal = DecimalUtil.ZERO ;
      P000L7_A396EmprCod = new String[] {""} ;
      P000L7_A129BarCod = new int[1] ;
      P000L7_n129BarCod = new boolean[] {false} ;
      P000L7_A132BarCodReo = new byte[1] ;
      P000L7_n132BarCodReo = new boolean[] {false} ;
      P000L7_A130BarCodPar = new String[] {""} ;
      P000L7_n130BarCodPar = new boolean[] {false} ;
      P000L7_A194BarOrdLin = new short[1] ;
      P000L7_A758ProCod = new String[] {""} ;
      P000L7_A179BarLoc = new String[] {""} ;
      A758ProCod = "" ;
      A179BarLoc = "" ;
      P000L8_A181BarMaqPro = new String[] {""} ;
      P000L8_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A181BarMaqPro = "" ;
      A142BarDiaP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactbar__default(),
         new Object[] {
             new Object[] {
            P000L5_A396EmprCod, P000L5_A130BarCodPar, P000L5_n130BarCodPar, P000L5_A132BarCodReo, P000L5_n132BarCodReo, P000L5_A129BarCod, P000L5_n129BarCod, P000L5_A194BarOrdLin, P000L5_A602MaqCod, P000L5_A561HisProLin,
            P000L5_A558HisProFec, P000L5_A154BarFasLin, P000L5_n154BarFasLin, P000L5_A210BarProCod, P000L5_n210BarProCod
            }
            , new Object[] {
            P000L6_A396EmprCod, P000L6_A602MaqCod, P000L6_n602MaqCod, P000L6_A459FasDec, P000L6_n459FasDec, P000L6_A457FasCod
            }
            , new Object[] {
            P000L7_A396EmprCod, P000L7_A129BarCod, P000L7_A132BarCodReo, P000L7_A130BarCodPar, P000L7_A194BarOrdLin, P000L7_A758ProCod, P000L7_A179BarLoc
            }
            , new Object[] {
            P000L8_A181BarMaqPro, P000L8_A142BarDiaP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short A154BarFasLin ;
   private short Gx_err ;
   private int AV16HisProLin ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal AV19Decal ;
   private java.math.BigDecimal A142BarDiaP ;
   private String A396EmprCod ;
   private String AV17MaqCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A210BarProCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A179BarLoc ;
   private String A181BarMaqPro ;
   private java.util.Date AV15HisProFec ;
   private java.util.Date A558HisProFec ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n602MaqCod ;
   private boolean n154BarFasLin ;
   private boolean n210BarProCod ;
   private boolean n459FasDec ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000L5_A396EmprCod ;
   private String[] P000L5_A130BarCodPar ;
   private boolean[] P000L5_n130BarCodPar ;
   private byte[] P000L5_A132BarCodReo ;
   private boolean[] P000L5_n132BarCodReo ;
   private int[] P000L5_A129BarCod ;
   private boolean[] P000L5_n129BarCod ;
   private short[] P000L5_A194BarOrdLin ;
   private String[] P000L5_A602MaqCod ;
   private boolean[] P000L5_n602MaqCod ;
   private int[] P000L5_A561HisProLin ;
   private java.util.Date[] P000L5_A558HisProFec ;
   private short[] P000L5_A154BarFasLin ;
   private boolean[] P000L5_n154BarFasLin ;
   private String[] P000L5_A210BarProCod ;
   private boolean[] P000L5_n210BarProCod ;
   private String[] P000L6_A396EmprCod ;
   private String[] P000L6_A602MaqCod ;
   private boolean[] P000L6_n602MaqCod ;
   private java.math.BigDecimal[] P000L6_A459FasDec ;
   private boolean[] P000L6_n459FasDec ;
   private String[] P000L6_A457FasCod ;
   private String[] P000L7_A396EmprCod ;
   private int[] P000L7_A129BarCod ;
   private boolean[] P000L7_n129BarCod ;
   private byte[] P000L7_A132BarCodReo ;
   private boolean[] P000L7_n132BarCodReo ;
   private String[] P000L7_A130BarCodPar ;
   private boolean[] P000L7_n130BarCodPar ;
   private short[] P000L7_A194BarOrdLin ;
   private String[] P000L7_A758ProCod ;
   private String[] P000L7_A179BarLoc ;
   private String[] P000L8_A181BarMaqPro ;
   private java.math.BigDecimal[] P000L8_A142BarDiaP ;
}

final  class pactbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000L5", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarOrdLin, T1.MaqCod, T1.HisProLin, T1.HisProFec, COALESCE( T2.BarFasLin, 0) AS BarFasLin, COALESCE( T3.BarProCod, '') AS BarProCod FROM ((TXPLHIPRO T1 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T4.ProCod) AS BarProCod, COALESCE( T5.BarFasLin, 0) AS BarFasLin, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM (TXPBARFAS T4 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) WHERE T4.BarOrdLin = COALESCE( T5.BarFasLin, 0) GROUP BY T5.BarFasLin, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ? and T1.HisProLin = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000L6", "SELECT EmprCod, MaqCod, FasDec, FasCod FROM TXPFASPRO WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000L7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ProCod, BarLoc FROM TXPBARFAS WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarOrdLin = ?) AND ((EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) AND (ProCod = ? and BarOrdLin = ?)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000L8", "SELECT BarMaqPro, BarDiaP FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000L9", "UPDATE TXPBARCAD SET BarMaqPro=?, BarDiaP=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setString(6, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 1);
               }
               stmt.setShort(10, ((Number) parms[15]).shortValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               return;
      }
   }

}

