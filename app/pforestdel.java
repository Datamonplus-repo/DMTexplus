package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pforestdel extends GXProcedure
{
   public pforestdel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pforestdel.class ), "" );
   }

   public pforestdel( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pforestdel.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pforestdel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pforestdel.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      pforestdel.this.AV9SerEst = aP2[0];
      this.aP2 = aP2;
      pforestdel.this.AV10DibCli = aP3[0];
      this.aP3 = aP3;
      pforestdel.this.AV11DibInt = aP4[0];
      this.aP4 = aP4;
      pforestdel.this.AV12ColCom = aP5[0];
      this.aP5 = aP5;
      pforestdel.this.AV13ColFon = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01GX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9SerEst, AV10DibCli, Integer.valueOf(AV11DibInt), AV12ColCom, AV13ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2078ColFon = P01GX2_A2078ColFon[0] ;
         A2074ColCom = P01GX2_A2074ColCom[0] ;
         A1014DibInt = P01GX2_A1014DibInt[0] ;
         A1013DibCli = P01GX2_A1013DibCli[0] ;
         A2141SerEst = P01GX2_A2141SerEst[0] ;
         A252CliCod = P01GX2_A252CliCod[0] ;
         A2097ForObsULin = P01GX2_A2097ForObsULin[0] ;
         n2097ForObsULin = P01GX2_n2097ForObsULin[0] ;
         /* Using cursor P01GX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2098MolCod = P01GX3_A2098MolCod[0] ;
            A2650MolPesMin = P01GX3_A2650MolPesMin[0] ;
            n2650MolPesMin = P01GX3_n2650MolPesMin[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01GX4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P01GX5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPR2");
            /* End optimized DELETE. */
            /* Using cursor P01GX6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P01GX7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFOROBS");
         /* End optimized DELETE. */
         /* Using cursor P01GX8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV8CliCod = 0 ;
      AV9SerEst = "" ;
      AV10DibCli = "" ;
      AV11DibInt = 0 ;
      AV12ColCom = "" ;
      AV13ColFon = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pforestdel.this.A396EmprCod;
      this.aP1[0] = pforestdel.this.AV8CliCod;
      this.aP2[0] = pforestdel.this.AV9SerEst;
      this.aP3[0] = pforestdel.this.AV10DibCli;
      this.aP4[0] = pforestdel.this.AV11DibInt;
      this.aP5[0] = pforestdel.this.AV12ColCom;
      this.aP6[0] = pforestdel.this.AV13ColFon;
      Application.commitDataStores(context, remoteHandle, pr_default, "pforestdel");
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
      P01GX2_A396EmprCod = new String[] {""} ;
      P01GX2_A2078ColFon = new String[] {""} ;
      P01GX2_A2074ColCom = new String[] {""} ;
      P01GX2_A1014DibInt = new int[1] ;
      P01GX2_A1013DibCli = new String[] {""} ;
      P01GX2_A2141SerEst = new String[] {""} ;
      P01GX2_A252CliCod = new int[1] ;
      P01GX2_A2097ForObsULin = new byte[1] ;
      P01GX2_n2097ForObsULin = new boolean[] {false} ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      P01GX3_A396EmprCod = new String[] {""} ;
      P01GX3_A252CliCod = new int[1] ;
      P01GX3_A2141SerEst = new String[] {""} ;
      P01GX3_A1013DibCli = new String[] {""} ;
      P01GX3_A1014DibInt = new int[1] ;
      P01GX3_A2074ColCom = new String[] {""} ;
      P01GX3_A2078ColFon = new String[] {""} ;
      P01GX3_A2098MolCod = new byte[1] ;
      P01GX3_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01GX3_n2650MolPesMin = new boolean[] {false} ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pforestdel__default(),
         new Object[] {
             new Object[] {
            P01GX2_A396EmprCod, P01GX2_A2078ColFon, P01GX2_A2074ColCom, P01GX2_A1014DibInt, P01GX2_A1013DibCli, P01GX2_A2141SerEst, P01GX2_A252CliCod, P01GX2_A2097ForObsULin, P01GX2_n2097ForObsULin
            }
            , new Object[] {
            P01GX3_A396EmprCod, P01GX3_A252CliCod, P01GX3_A2141SerEst, P01GX3_A1013DibCli, P01GX3_A1014DibInt, P01GX3_A2074ColCom, P01GX3_A2078ColFon, P01GX3_A2098MolCod, P01GX3_A2650MolPesMin, P01GX3_n2650MolPesMin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
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

   private byte A2097ForObsULin ;
   private byte A2098MolCod ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11DibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private java.math.BigDecimal A2650MolPesMin ;
   private String A396EmprCod ;
   private String AV9SerEst ;
   private String AV10DibCli ;
   private String AV12ColCom ;
   private String AV13ColFon ;
   private String scmdbuf ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private boolean n2097ForObsULin ;
   private boolean n2650MolPesMin ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01GX2_A396EmprCod ;
   private String[] P01GX2_A2078ColFon ;
   private String[] P01GX2_A2074ColCom ;
   private int[] P01GX2_A1014DibInt ;
   private String[] P01GX2_A1013DibCli ;
   private String[] P01GX2_A2141SerEst ;
   private int[] P01GX2_A252CliCod ;
   private byte[] P01GX2_A2097ForObsULin ;
   private boolean[] P01GX2_n2097ForObsULin ;
   private String[] P01GX3_A396EmprCod ;
   private int[] P01GX3_A252CliCod ;
   private String[] P01GX3_A2141SerEst ;
   private String[] P01GX3_A1013DibCli ;
   private int[] P01GX3_A1014DibInt ;
   private String[] P01GX3_A2074ColCom ;
   private String[] P01GX3_A2078ColFon ;
   private byte[] P01GX3_A2098MolCod ;
   private java.math.BigDecimal[] P01GX3_A2650MolPesMin ;
   private boolean[] P01GX3_n2650MolPesMin ;
}

final  class pforestdel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01GX2", "SELECT EmprCod, ColFon, ColCom, DibInt, DibCli, SerEst, CliCod, ForObsULin FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01GX3", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolPesMin FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01GX4", "DELETE FROM TXPPASFOR  WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPASFOR")
         ,new UpdateCursor("P01GX5", "DELETE FROM TXPRECPR2  WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPR2")
         ,new UpdateCursor("P01GX6", "DELETE FROM TXPMFORES  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
         ,new UpdateCursor("P01GX7", "DELETE FROM TXPFOROBS  WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFOROBS")
         ,new UpdateCursor("P01GX8", "DELETE FROM TXPCFORES  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORES")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
      }
   }

}

