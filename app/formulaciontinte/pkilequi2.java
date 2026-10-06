package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilequi2 extends GXProcedure
{
   public pkilequi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilequi2.class ), "" );
   }

   public pkilequi2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 )
   {
      pkilequi2.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 )
   {
      pkilequi2.this.AV19EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilequi2.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      pkilequi2.this.AV9Forser = aP2[0];
      this.aP2 = aP2;
      pkilequi2.this.AV10Forcolnom = aP3[0];
      this.aP3 = aP3;
      pkilequi2.this.AV11Forcolnum = aP4[0];
      this.aP4 = aP4;
      pkilequi2.this.AV12Tipcolcod = aP5[0];
      this.aP5 = aP5;
      pkilequi2.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Num_hdrs = 0 ;
      /* Optimized group. */
      /* Using cursor P03FA2 */
      pr_default.execute(0, new Object[] {AV19EmprCod, Integer.valueOf(AV8Clicod), AV9Forser, AV10Forcolnom, Integer.valueOf(AV11Forcolnum), Byte.valueOf(AV12Tipcolcod)});
      cV13Num_hdrs = P03FA2_AV13Num_hdrs[0] ;
      pr_default.close(0);
      AV13Num_hdrs = (int)(AV13Num_hdrs+cV13Num_hdrs*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilequi2.this.AV19EmprCod;
      this.aP1[0] = pkilequi2.this.AV8Clicod;
      this.aP2[0] = pkilequi2.this.AV9Forser;
      this.aP3[0] = pkilequi2.this.AV10Forcolnom;
      this.aP4[0] = pkilequi2.this.AV11Forcolnum;
      this.aP5[0] = pkilequi2.this.AV12Tipcolcod;
      this.aP6[0] = pkilequi2.this.AV13Num_hdrs;
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
      P03FA2_AV13Num_hdrs = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pkilequi2__default(),
         new Object[] {
             new Object[] {
            P03FA2_AV13Num_hdrs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Tipcolcod ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV11Forcolnum ;
   private int AV13Num_hdrs ;
   private int cV13Num_hdrs ;
   private String AV19EmprCod ;
   private String AV9Forser ;
   private String AV10Forcolnom ;
   private String scmdbuf ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P03FA2_AV13Num_hdrs ;
}

final  class pkilequi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03FA2", "SELECT COUNT(*) FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.RecEnvio >= 0) AND (T2.CliCod = ?) AND (T2.BarSer = ?) AND (T2.BarColNom = ?) AND (T2.BarColNum = ?) AND (T2.BarTipCol = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

