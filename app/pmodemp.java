package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodemp extends GXProcedure
{
   public pmodemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodemp.class ), "" );
   }

   public pmodemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pmodemp.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 )
   {
      pmodemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodemp.this.A1031EmpesCod = aP1[0];
      this.aP1 = aP1;
      pmodemp.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pmodemp.this.A1032FonCod = aP3[0];
      this.aP3 = aP3;
      pmodemp.this.AV15EmpesAlbDi = aP4[0];
      this.aP4 = aP4;
      pmodemp.this.AV16DisCliNum = aP5[0];
      this.aP5 = aP5;
      pmodemp.this.AV17ActPie = aP6[0];
      this.aP6 = aP6;
      pmodemp.this.AV18ActMtr = aP7[0];
      this.aP7 = aP7;
      pmodemp.this.AV19OldPie = aP8[0];
      this.aP8 = aP8;
      pmodemp.this.AV20OldMtr = aP9[0];
      this.aP9 = aP9;
      pmodemp.this.AV21EmpesLTip = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Flag = (byte)(0) ;
      /* Using cursor P00ZO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(AV15EmpesAlbDi), AV21EmpesLTip});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1043EmpesLTip = P00ZO2_A1043EmpesLTip[0] ;
         n1043EmpesLTip = P00ZO2_n1043EmpesLTip[0] ;
         A1044EmpesAlbDi = P00ZO2_A1044EmpesAlbDi[0] ;
         n1044EmpesAlbDi = P00ZO2_n1044EmpesAlbDi[0] ;
         A1048EmpesUUtiL = P00ZO2_A1048EmpesUUtiL[0] ;
         n1048EmpesUUtiL = P00ZO2_n1048EmpesUUtiL[0] ;
         A1050EmpesPUtiL = P00ZO2_A1050EmpesPUtiL[0] ;
         n1050EmpesPUtiL = P00ZO2_n1050EmpesPUtiL[0] ;
         A1042EmpesLin = P00ZO2_A1042EmpesLin[0] ;
         A1048EmpesUUtiL = A1048EmpesUUtiL.add((AV18ActMtr.subtract(AV20OldMtr))) ;
         n1048EmpesUUtiL = false ;
         A1050EmpesPUtiL = (short)(A1050EmpesPUtiL+(AV17ActPie-AV19OldPie)) ;
         n1050EmpesPUtiL = false ;
         AV22Flag = (byte)(1) ;
         /* Using cursor P00ZO3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1048EmpesUUtiL), A1048EmpesUUtiL, Boolean.valueOf(n1050EmpesPUtiL), Short.valueOf(A1050EmpesPUtiL), A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(A1042EmpesLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22Flag == 0 )
      {
         /* Using cursor P00ZO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1041EmpesULin = P00ZO4_A1041EmpesULin[0] ;
            n1041EmpesULin = P00ZO4_n1041EmpesULin[0] ;
            AV23EmpesULin = A1041EmpesULin ;
            A1041EmpesULin = (int)(A1041EmpesULin+1) ;
            n1041EmpesULin = false ;
            /* Using cursor P00ZO5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n1041EmpesULin), Integer.valueOf(A1041EmpesULin), A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEMPES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /*
            INSERT RECORD ON TABLE TXPLEMPES

         */
         A1042EmpesLin = (int)(AV23EmpesULin+1) ;
         A1043EmpesLTip = AV21EmpesLTip ;
         n1043EmpesLTip = false ;
         A1044EmpesAlbDi = AV15EmpesAlbDi ;
         n1044EmpesAlbDi = false ;
         A1045EmpesSitDi = AV16DisCliNum ;
         n1045EmpesSitDi = false ;
         A1050EmpesPUtiL = AV17ActPie ;
         n1050EmpesPUtiL = false ;
         A1048EmpesUUtiL = AV18ActMtr ;
         n1048EmpesUUtiL = false ;
         A1046EmpesFecM = GXutil.today( ) ;
         n1046EmpesFecM = false ;
         /* Using cursor P00ZO6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(A1042EmpesLin), Boolean.valueOf(n1043EmpesLTip), A1043EmpesLTip, Boolean.valueOf(n1044EmpesAlbDi), Integer.valueOf(A1044EmpesAlbDi), Boolean.valueOf(n1045EmpesSitDi), A1045EmpesSitDi, Boolean.valueOf(n1046EmpesFecM), A1046EmpesFecM, Boolean.valueOf(n1048EmpesUUtiL), A1048EmpesUUtiL, Boolean.valueOf(n1050EmpesPUtiL), Short.valueOf(A1050EmpesPUtiL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodemp.this.A396EmprCod;
      this.aP1[0] = pmodemp.this.A1031EmpesCod;
      this.aP2[0] = pmodemp.this.A252CliCod;
      this.aP3[0] = pmodemp.this.A1032FonCod;
      this.aP4[0] = pmodemp.this.AV15EmpesAlbDi;
      this.aP5[0] = pmodemp.this.AV16DisCliNum;
      this.aP6[0] = pmodemp.this.AV17ActPie;
      this.aP7[0] = pmodemp.this.AV18ActMtr;
      this.aP8[0] = pmodemp.this.AV19OldPie;
      this.aP9[0] = pmodemp.this.AV20OldMtr;
      this.aP10[0] = pmodemp.this.AV21EmpesLTip;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodemp");
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
      P00ZO2_A396EmprCod = new String[] {""} ;
      P00ZO2_A1031EmpesCod = new String[] {""} ;
      P00ZO2_A252CliCod = new int[1] ;
      P00ZO2_A1032FonCod = new String[] {""} ;
      P00ZO2_A1043EmpesLTip = new String[] {""} ;
      P00ZO2_n1043EmpesLTip = new boolean[] {false} ;
      P00ZO2_A1044EmpesAlbDi = new int[1] ;
      P00ZO2_n1044EmpesAlbDi = new boolean[] {false} ;
      P00ZO2_A1048EmpesUUtiL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZO2_n1048EmpesUUtiL = new boolean[] {false} ;
      P00ZO2_A1050EmpesPUtiL = new short[1] ;
      P00ZO2_n1050EmpesPUtiL = new boolean[] {false} ;
      P00ZO2_A1042EmpesLin = new int[1] ;
      A1043EmpesLTip = "" ;
      A1048EmpesUUtiL = DecimalUtil.ZERO ;
      P00ZO4_A396EmprCod = new String[] {""} ;
      P00ZO4_A1031EmpesCod = new String[] {""} ;
      P00ZO4_A252CliCod = new int[1] ;
      P00ZO4_A1032FonCod = new String[] {""} ;
      P00ZO4_A1041EmpesULin = new int[1] ;
      P00ZO4_n1041EmpesULin = new boolean[] {false} ;
      A1045EmpesSitDi = "" ;
      A1046EmpesFecM = GXutil.nullDate() ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodemp__default(),
         new Object[] {
             new Object[] {
            P00ZO2_A396EmprCod, P00ZO2_A1031EmpesCod, P00ZO2_A252CliCod, P00ZO2_A1032FonCod, P00ZO2_A1043EmpesLTip, P00ZO2_n1043EmpesLTip, P00ZO2_A1044EmpesAlbDi, P00ZO2_n1044EmpesAlbDi, P00ZO2_A1048EmpesUUtiL, P00ZO2_n1048EmpesUUtiL,
            P00ZO2_A1050EmpesPUtiL, P00ZO2_n1050EmpesPUtiL, P00ZO2_A1042EmpesLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00ZO4_A396EmprCod, P00ZO4_A1031EmpesCod, P00ZO4_A252CliCod, P00ZO4_A1032FonCod, P00ZO4_A1041EmpesULin, P00ZO4_n1041EmpesULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Flag ;
   private short AV17ActPie ;
   private short AV19OldPie ;
   private short A1050EmpesPUtiL ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV15EmpesAlbDi ;
   private int A1044EmpesAlbDi ;
   private int A1042EmpesLin ;
   private int A1041EmpesULin ;
   private int AV23EmpesULin ;
   private int GX_INS553 ;
   private java.math.BigDecimal AV18ActMtr ;
   private java.math.BigDecimal AV20OldMtr ;
   private java.math.BigDecimal A1048EmpesUUtiL ;
   private String A396EmprCod ;
   private String A1031EmpesCod ;
   private String A1032FonCod ;
   private String AV16DisCliNum ;
   private String AV21EmpesLTip ;
   private String scmdbuf ;
   private String A1043EmpesLTip ;
   private String A1045EmpesSitDi ;
   private String Gx_emsg ;
   private java.util.Date A1046EmpesFecM ;
   private boolean n1043EmpesLTip ;
   private boolean n1044EmpesAlbDi ;
   private boolean n1048EmpesUUtiL ;
   private boolean n1050EmpesPUtiL ;
   private boolean n1041EmpesULin ;
   private boolean n1045EmpesSitDi ;
   private boolean n1046EmpesFecM ;
   private String[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZO2_A396EmprCod ;
   private String[] P00ZO2_A1031EmpesCod ;
   private int[] P00ZO2_A252CliCod ;
   private String[] P00ZO2_A1032FonCod ;
   private String[] P00ZO2_A1043EmpesLTip ;
   private boolean[] P00ZO2_n1043EmpesLTip ;
   private int[] P00ZO2_A1044EmpesAlbDi ;
   private boolean[] P00ZO2_n1044EmpesAlbDi ;
   private java.math.BigDecimal[] P00ZO2_A1048EmpesUUtiL ;
   private boolean[] P00ZO2_n1048EmpesUUtiL ;
   private short[] P00ZO2_A1050EmpesPUtiL ;
   private boolean[] P00ZO2_n1050EmpesPUtiL ;
   private int[] P00ZO2_A1042EmpesLin ;
   private String[] P00ZO4_A396EmprCod ;
   private String[] P00ZO4_A1031EmpesCod ;
   private int[] P00ZO4_A252CliCod ;
   private String[] P00ZO4_A1032FonCod ;
   private int[] P00ZO4_A1041EmpesULin ;
   private boolean[] P00ZO4_n1041EmpesULin ;
}

final  class pmodemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZO2", "SELECT EmprCod, EmpesCod, CliCod, FonCod, EmpesLTip, EmpesAlbDi, EmpesUUtiL, EmpesPUtiL, EmpesLin FROM TXPLEMPES WHERE (EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ?) AND (EmpesAlbDi = ?) AND (EmpesLTip = ?) ORDER BY EmprCod, EmpesCod, CliCod, FonCod, EmpesLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZO3", "UPDATE TXPLEMPES SET EmpesUUtiL=?, EmpesPUtiL=?  WHERE EmprCod = ? AND EmpesCod = ? AND CliCod = ? AND FonCod = ? AND EmpesLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
         ,new ForEachCursor("P00ZO4", "SELECT EmprCod, EmpesCod, CliCod, FonCod, EmpesULin FROM TXPCEMPES WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ? ORDER BY EmprCod, EmpesCod, CliCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00ZO5", "UPDATE TXPCEMPES SET EmpesULin=?  WHERE EmprCod = ? AND EmpesCod = ? AND CliCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEMPES")
         ,new UpdateCursor("P00ZO6", "INSERT INTO TXPLEMPES(EmprCod, EmpesCod, CliCod, FonCod, EmpesLin, EmpesLTip, EmpesAlbDi, EmpesSitDi, EmpesFecM, EmpesUUtiL, EmpesPUtiL, EmpesUEntL, EmpesPEntL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 16);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 12);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               return;
      }
   }

}

