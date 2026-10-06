package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc120 extends GXProcedure
{
   public pprc120( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc120.class ), "" );
   }

   public pprc120( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pprc120.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pprc120.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc120.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pprc120.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pprc120.this.AV10usurcod = aP3[0];
      this.aP3 = aP3;
      pprc120.this.AV11Station = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05LH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9715Tb1_Dsc = P05LH2_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P05LH2_n9715Tb1_Dsc[0] ;
         A718PrdNom = P05LH2_A718PrdNom[0] ;
         A718PrdNom = P05LH2_A718PrdNom[0] ;
         A9715Tb1_Dsc = P05LH2_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P05LH2_n9715Tb1_Dsc[0] ;
         AV12inc_obs = httpContext.getMessage( "Eliminacion Caderno Encargos ", "") + GXutil.str( A9713Tb1_Cod, 4, 0) + " " + GXutil.trim( A9715Tb1_Dsc) ;
         AV12inc_obs += httpContext.getMessage( "Producto ", "") + A719PrdNum + " " + A718PrdNom ;
         /* Using cursor P05LH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCdnEnc");
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV10usurcod, AV11Station, AV12inc_obs, 99999999, (byte)(0), " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc120.this.A396EmprCod;
      this.aP1[0] = pprc120.this.A719PrdNum;
      this.aP2[0] = pprc120.this.A9713Tb1_Cod;
      this.aP3[0] = pprc120.this.AV10usurcod;
      this.aP4[0] = pprc120.this.AV11Station;
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
      P05LH2_A396EmprCod = new String[] {""} ;
      P05LH2_A719PrdNum = new String[] {""} ;
      P05LH2_A9713Tb1_Cod = new short[1] ;
      P05LH2_A9715Tb1_Dsc = new String[] {""} ;
      P05LH2_n9715Tb1_Dsc = new boolean[] {false} ;
      P05LH2_A718PrdNom = new String[] {""} ;
      A9715Tb1_Dsc = "" ;
      A718PrdNom = "" ;
      AV12inc_obs = "" ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc120__default(),
         new Object[] {
             new Object[] {
            P05LH2_A396EmprCod, P05LH2_A719PrdNum, P05LH2_A9713Tb1_Cod, P05LH2_A9715Tb1_Dsc, P05LH2_n9715Tb1_Dsc, P05LH2_A718PrdNom
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PPrc120" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PPrc120" ;
      Gx_err = (short)(0) ;
   }

   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV10usurcod ;
   private String AV11Station ;
   private String scmdbuf ;
   private String A9715Tb1_Dsc ;
   private String A718PrdNom ;
   private String AV16Pgmname ;
   private boolean n9715Tb1_Dsc ;
   private String AV12inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LH2_A396EmprCod ;
   private String[] P05LH2_A719PrdNum ;
   private short[] P05LH2_A9713Tb1_Cod ;
   private String[] P05LH2_A9715Tb1_Dsc ;
   private boolean[] P05LH2_n9715Tb1_Dsc ;
   private String[] P05LH2_A718PrdNom ;
}

final  class pprc120__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LH2", "SELECT T1.EmprCod, T1.PrdNum, T1.Tb1_Cod, T3.Tb1_Dsc, T2.PrdNom FROM ((TXPCdnEnc T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTABLE1 T3 ON T3.EmprCod = T1.EmprCod AND T3.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.Tb1_Cod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.Tb1_Cod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05LH3", "DELETE FROM TXPCdnEnc  WHERE EmprCod = ? AND PrdNum = ? AND Tb1_Cod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCdnEnc")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

