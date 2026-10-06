package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilequi2historico extends GXProcedure
{
   public pkilequi2historico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilequi2historico.class ), "" );
   }

   public pkilequi2historico( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 ,
                          String aP3 ,
                          int aP4 ,
                          byte aP5 )
   {
      pkilequi2historico.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             int[] aP6 )
   {
      pkilequi2historico.this.AV19EmprCod = aP0;
      pkilequi2historico.this.AV8Clicod = aP1;
      pkilequi2historico.this.AV9Forser = aP2;
      pkilequi2historico.this.AV10Forcolnom = aP3;
      pkilequi2historico.this.AV11Forcolnum = aP4;
      pkilequi2historico.this.AV12Tipcolcod = aP5;
      pkilequi2historico.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Num_hdrs = 0 ;
      /* Optimized group. */
      /* Using cursor P09WA2 */
      pr_default.execute(0, new Object[] {AV19EmprCod, Integer.valueOf(AV8Clicod), AV9Forser, AV10Forcolnom, Integer.valueOf(AV11Forcolnum), Byte.valueOf(AV12Tipcolcod)});
      cV13Num_hdrs = P09WA2_AV13Num_hdrs[0] ;
      pr_default.close(0);
      AV13Num_hdrs = (int)(AV13Num_hdrs+cV13Num_hdrs*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = pkilequi2historico.this.AV13Num_hdrs;
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
      P09WA2_AV13Num_hdrs = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pkilequi2historico__default(),
         new Object[] {
             new Object[] {
            P09WA2_AV13Num_hdrs
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
   private IDataStoreProvider pr_default ;
   private int[] P09WA2_AV13Num_hdrs ;
}

final  class pkilequi2historico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09WA2", "SELECT COUNT(*) FROM TXPHISREH WHERE EmprCod = ? and CliCod = ? and HreBarSer = ? and HreColNom = ? and HreColNum = ? and HreTipCol = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

