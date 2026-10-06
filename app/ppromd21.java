package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppromd21 extends GXProcedure
{
   public ppromd21( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppromd21.class ), "" );
   }

   public ppromd21( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          short[] aP1 ,
                          int[] aP2 ,
                          java.math.BigDecimal[] aP3 ,
                          short[] aP4 ,
                          int[] aP5 ,
                          java.math.BigDecimal[] aP6 )
   {
      ppromd21.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 )
   {
      ppromd21.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppromd21.this.AV12oPMDCod = aP1[0];
      this.aP1 = aP1;
      ppromd21.this.AV13oPMDColNum = aP2[0];
      this.aP2 = aP2;
      ppromd21.this.AV9oKilEnt = aP3[0];
      this.aP3 = aP3;
      ppromd21.this.AV10PMDCod = aP4[0];
      this.aP4 = aP4;
      ppromd21.this.AV11PMDColNum = aP5[0];
      this.aP5 = aP5;
      ppromd21.this.AV8KilEnt = aP6[0];
      this.aP6 = aP6;
      ppromd21.this.AV14Clicod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P037Q2 */
      pr_default.execute(0, new Object[] {AV9oKilEnt, A396EmprCod, Integer.valueOf(AV14Clicod), Short.valueOf(AV12oPMDCod), Integer.valueOf(AV13oPMDColNum)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
      /* End optimized UPDATE. */
      /* Optimized UPDATE. */
      /* Using cursor P037Q3 */
      pr_default.execute(1, new Object[] {AV8KilEnt, A396EmprCod, Integer.valueOf(AV14Clicod), Short.valueOf(AV10PMDCod), Integer.valueOf(AV11PMDColNum)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppromd21.this.A396EmprCod;
      this.aP1[0] = ppromd21.this.AV12oPMDCod;
      this.aP2[0] = ppromd21.this.AV13oPMDColNum;
      this.aP3[0] = ppromd21.this.AV9oKilEnt;
      this.aP4[0] = ppromd21.this.AV10PMDCod;
      this.aP5[0] = ppromd21.this.AV11PMDColNum;
      this.aP6[0] = ppromd21.this.AV8KilEnt;
      this.aP7[0] = ppromd21.this.AV14Clicod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppromd21");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppromd21__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12oPMDCod ;
   private short AV10PMDCod ;
   private short Gx_err ;
   private int AV13oPMDColNum ;
   private int AV11PMDColNum ;
   private int AV14Clicod ;
   private java.math.BigDecimal AV9oKilEnt ;
   private java.math.BigDecimal AV8KilEnt ;
   private String A396EmprCod ;
   private int[] aP7 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class ppromd21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P037Q2", "UPDATE TXPProMD1 SET PMDEntKgm=PMDEntKgm - ?  WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
         ,new UpdateCursor("P037Q3", "UPDATE TXPProMD1 SET PMDEntKgm=PMDEntKgm + ?  WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

