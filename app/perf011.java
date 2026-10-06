package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class perf011 extends GXProcedure
{
   public perf011( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( perf011.class ), "" );
   }

   public perf011( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      perf011.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      perf011.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      perf011.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      perf011.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      perf011.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      perf011.this.AV13Barpiecod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03DB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5253BarAcc = P03DB2_A5253BarAcc[0] ;
         A6434BarAsi = P03DB2_A6434BarAsi[0] ;
         /* Using cursor P03DB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A908PieOriCod = P03DB3_A908PieOriCod[0] ;
            A200BarPieCod = P03DB3_A200BarPieCod[0] ;
            if ( GXutil.strcmp(A908PieOriCod, httpContext.getMessage( "Eliminar", "")) == 0 )
            {
               /* Using cursor P03DB4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A5253BarAcc = httpContext.getMessage( "S", "") ;
         A6434BarAsi = (byte)(0) ;
         /* Using cursor P03DB5 */
         pr_default.execute(3, new Object[] {A5253BarAcc, Byte.valueOf(A6434BarAsi), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = perf011.this.A396EmprCod;
      this.aP1[0] = perf011.this.A129BarCod;
      this.aP2[0] = perf011.this.A132BarCodReo;
      this.aP3[0] = perf011.this.A130BarCodPar;
      this.aP4[0] = perf011.this.AV13Barpiecod;
      Application.commitDataStores(context, remoteHandle, pr_default, "perf011");
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
      P03DB2_A396EmprCod = new String[] {""} ;
      P03DB2_A129BarCod = new int[1] ;
      P03DB2_A132BarCodReo = new byte[1] ;
      P03DB2_A130BarCodPar = new String[] {""} ;
      P03DB2_A5253BarAcc = new String[] {""} ;
      P03DB2_A6434BarAsi = new byte[1] ;
      A5253BarAcc = "" ;
      P03DB3_A396EmprCod = new String[] {""} ;
      P03DB3_A129BarCod = new int[1] ;
      P03DB3_A132BarCodReo = new byte[1] ;
      P03DB3_A130BarCodPar = new String[] {""} ;
      P03DB3_A908PieOriCod = new String[] {""} ;
      P03DB3_A200BarPieCod = new String[] {""} ;
      A908PieOriCod = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.perf011__default(),
         new Object[] {
             new Object[] {
            P03DB2_A396EmprCod, P03DB2_A129BarCod, P03DB2_A132BarCodReo, P03DB2_A130BarCodPar, P03DB2_A5253BarAcc, P03DB2_A6434BarAsi
            }
            , new Object[] {
            P03DB3_A396EmprCod, P03DB3_A129BarCod, P03DB3_A132BarCodReo, P03DB3_A130BarCodPar, P03DB3_A908PieOriCod, P03DB3_A200BarPieCod
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

   private byte A132BarCodReo ;
   private byte A6434BarAsi ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV13Barpiecod ;
   private String scmdbuf ;
   private String A5253BarAcc ;
   private String A908PieOriCod ;
   private String A200BarPieCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DB2_A396EmprCod ;
   private int[] P03DB2_A129BarCod ;
   private byte[] P03DB2_A132BarCodReo ;
   private String[] P03DB2_A130BarCodPar ;
   private String[] P03DB2_A5253BarAcc ;
   private byte[] P03DB2_A6434BarAsi ;
   private String[] P03DB3_A396EmprCod ;
   private int[] P03DB3_A129BarCod ;
   private byte[] P03DB3_A132BarCodReo ;
   private String[] P03DB3_A130BarCodPar ;
   private String[] P03DB3_A908PieOriCod ;
   private String[] P03DB3_A200BarPieCod ;
}

final  class perf011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DB2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAcc, BarAsi FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03DB3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PieOriCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03DB4", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P03DB5", "UPDATE TXPBARCAD SET BarAcc=?, BarAsi=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

