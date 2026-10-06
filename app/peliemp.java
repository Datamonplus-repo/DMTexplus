package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliemp extends GXProcedure
{
   public peliemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliemp.class ), "" );
   }

   public peliemp( int remoteHandle ,
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
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      peliemp.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      peliemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliemp.this.A1031EmpesCod = aP1[0];
      this.aP1 = aP1;
      peliemp.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      peliemp.this.A1032FonCod = aP3[0];
      this.aP3 = aP3;
      peliemp.this.AV15EmpesAlbDi = aP4[0];
      this.aP4 = aP4;
      peliemp.this.AV16BarComPie = aP5[0];
      this.aP5 = aP5;
      peliemp.this.AV17BarComMtr = aP6[0];
      this.aP6 = aP6;
      peliemp.this.AV18EmpesLTip = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00YZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(AV15EmpesAlbDi), AV18EmpesLTip});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1043EmpesLTip = P00YZ2_A1043EmpesLTip[0] ;
         n1043EmpesLTip = P00YZ2_n1043EmpesLTip[0] ;
         A1044EmpesAlbDi = P00YZ2_A1044EmpesAlbDi[0] ;
         n1044EmpesAlbDi = P00YZ2_n1044EmpesAlbDi[0] ;
         A1048EmpesUUtiL = P00YZ2_A1048EmpesUUtiL[0] ;
         n1048EmpesUUtiL = P00YZ2_n1048EmpesUUtiL[0] ;
         A1050EmpesPUtiL = P00YZ2_A1050EmpesPUtiL[0] ;
         n1050EmpesPUtiL = P00YZ2_n1050EmpesPUtiL[0] ;
         A1042EmpesLin = P00YZ2_A1042EmpesLin[0] ;
         A1048EmpesUUtiL = A1048EmpesUUtiL.subtract(AV17BarComMtr) ;
         n1048EmpesUUtiL = false ;
         A1050EmpesPUtiL = (short)(A1050EmpesPUtiL-AV16BarComPie) ;
         n1050EmpesPUtiL = false ;
         if ( ( A1048EmpesUUtiL.doubleValue() == 0 ) && ( A1050EmpesPUtiL == 0 ) )
         {
            /* Using cursor P00YZ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(A1042EmpesLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
         }
         /* Using cursor P00YZ4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n1048EmpesUUtiL), A1048EmpesUUtiL, Boolean.valueOf(n1050EmpesPUtiL), Short.valueOf(A1050EmpesPUtiL), A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(A1042EmpesLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliemp.this.A396EmprCod;
      this.aP1[0] = peliemp.this.A1031EmpesCod;
      this.aP2[0] = peliemp.this.A252CliCod;
      this.aP3[0] = peliemp.this.A1032FonCod;
      this.aP4[0] = peliemp.this.AV15EmpesAlbDi;
      this.aP5[0] = peliemp.this.AV16BarComPie;
      this.aP6[0] = peliemp.this.AV17BarComMtr;
      this.aP7[0] = peliemp.this.AV18EmpesLTip;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliemp");
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
      P00YZ2_A396EmprCod = new String[] {""} ;
      P00YZ2_A1031EmpesCod = new String[] {""} ;
      P00YZ2_A252CliCod = new int[1] ;
      P00YZ2_A1032FonCod = new String[] {""} ;
      P00YZ2_A1043EmpesLTip = new String[] {""} ;
      P00YZ2_n1043EmpesLTip = new boolean[] {false} ;
      P00YZ2_A1044EmpesAlbDi = new int[1] ;
      P00YZ2_n1044EmpesAlbDi = new boolean[] {false} ;
      P00YZ2_A1048EmpesUUtiL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YZ2_n1048EmpesUUtiL = new boolean[] {false} ;
      P00YZ2_A1050EmpesPUtiL = new short[1] ;
      P00YZ2_n1050EmpesPUtiL = new boolean[] {false} ;
      P00YZ2_A1042EmpesLin = new int[1] ;
      A1043EmpesLTip = "" ;
      A1048EmpesUUtiL = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliemp__default(),
         new Object[] {
             new Object[] {
            P00YZ2_A396EmprCod, P00YZ2_A1031EmpesCod, P00YZ2_A252CliCod, P00YZ2_A1032FonCod, P00YZ2_A1043EmpesLTip, P00YZ2_n1043EmpesLTip, P00YZ2_A1044EmpesAlbDi, P00YZ2_n1044EmpesAlbDi, P00YZ2_A1048EmpesUUtiL, P00YZ2_n1048EmpesUUtiL,
            P00YZ2_A1050EmpesPUtiL, P00YZ2_n1050EmpesPUtiL, P00YZ2_A1042EmpesLin
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

   private short AV16BarComPie ;
   private short A1050EmpesPUtiL ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV15EmpesAlbDi ;
   private int A1044EmpesAlbDi ;
   private int A1042EmpesLin ;
   private java.math.BigDecimal AV17BarComMtr ;
   private java.math.BigDecimal A1048EmpesUUtiL ;
   private String A396EmprCod ;
   private String A1031EmpesCod ;
   private String A1032FonCod ;
   private String AV18EmpesLTip ;
   private String scmdbuf ;
   private String A1043EmpesLTip ;
   private boolean n1043EmpesLTip ;
   private boolean n1044EmpesAlbDi ;
   private boolean n1048EmpesUUtiL ;
   private boolean n1050EmpesPUtiL ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YZ2_A396EmprCod ;
   private String[] P00YZ2_A1031EmpesCod ;
   private int[] P00YZ2_A252CliCod ;
   private String[] P00YZ2_A1032FonCod ;
   private String[] P00YZ2_A1043EmpesLTip ;
   private boolean[] P00YZ2_n1043EmpesLTip ;
   private int[] P00YZ2_A1044EmpesAlbDi ;
   private boolean[] P00YZ2_n1044EmpesAlbDi ;
   private java.math.BigDecimal[] P00YZ2_A1048EmpesUUtiL ;
   private boolean[] P00YZ2_n1048EmpesUUtiL ;
   private short[] P00YZ2_A1050EmpesPUtiL ;
   private boolean[] P00YZ2_n1050EmpesPUtiL ;
   private int[] P00YZ2_A1042EmpesLin ;
}

final  class peliemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YZ2", "SELECT EmprCod, EmpesCod, CliCod, FonCod, EmpesLTip, EmpesAlbDi, EmpesUUtiL, EmpesPUtiL, EmpesLin FROM TXPLEMPES WHERE (EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ?) AND (EmpesAlbDi = ?) AND (EmpesLTip = ?) ORDER BY EmprCod, EmpesCod, CliCod, FonCod, EmpesLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YZ3", "DELETE FROM TXPLEMPES  WHERE EmprCod = ? AND EmpesCod = ? AND CliCod = ? AND FonCod = ? AND EmpesLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
         ,new UpdateCursor("P00YZ4", "UPDATE TXPLEMPES SET EmpesUUtiL=?, EmpesPUtiL=?  WHERE EmprCod = ? AND EmpesCod = ? AND CliCod = ? AND FonCod = ? AND EmpesLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
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
      }
   }

}

