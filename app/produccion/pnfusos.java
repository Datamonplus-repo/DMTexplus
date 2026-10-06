package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnfusos extends GXProcedure
{
   public pnfusos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnfusos.class ), "" );
   }

   public pnfusos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          short aP4 )
   {
      pnfusos.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             int[] aP5 )
   {
      pnfusos.this.A396EmprCod = aP0;
      pnfusos.this.A129BarCod = aP1;
      pnfusos.this.A132BarCodReo = aP2;
      pnfusos.this.A130BarCodPar = aP3;
      pnfusos.this.A194BarOrdLin = aP4;
      pnfusos.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HisProNFusos = 0 ;
      /* Optimized group. */
      /* Using cursor P09ZN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      c14197HisProNFus = P09ZN2_A14197HisProNFus[0] ;
      pr_default.close(0);
      AV8HisProNFusos = (int)(AV8HisProNFusos+c14197HisProNFus) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pnfusos.this.AV8HisProNFusos;
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
      P09ZN2_A14197HisProNFus = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.pnfusos__default(),
         new Object[] {
             new Object[] {
            P09ZN2_A14197HisProNFus
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8HisProNFusos ;
   private int c14197HisProNFus ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P09ZN2_A14197HisProNFus ;
}

final  class pnfusos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZN2", "SELECT SUM(HisProNFus) FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

