package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmvexhd extends GXProcedure
{
   public pmmvexhd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmvexhd.class ), "" );
   }

   public pmmvexhd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            int[] aP5 ,
                            byte[] aP6 ,
                            String[] aP7 ,
                            java.math.BigDecimal[] aP8 ,
                            java.math.BigDecimal[] aP9 ,
                            java.math.BigDecimal[] aP10 ,
                            java.math.BigDecimal[] aP11 ,
                            short[] aP12 ,
                            short[] aP13 ,
                            java.util.Date[] aP14 )
   {
      pmmvexhd.this.aP15 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 ,
                        java.util.Date[] aP14 ,
                        short[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             java.util.Date[] aP14 ,
                             short[] aP15 )
   {
      pmmvexhd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmvexhd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pmmvexhd.this.AV17ExHdrFas = aP2[0];
      this.aP2 = aP2;
      pmmvexhd.this.AV18ExHdrTip = aP3[0];
      this.aP3 = aP3;
      pmmvexhd.this.AV19ExHdrAlb = aP4[0];
      this.aP4 = aP4;
      pmmvexhd.this.AV20BarCod = aP5[0];
      this.aP5 = aP5;
      pmmvexhd.this.AV21BarCodReo = aP6[0];
      this.aP6 = aP6;
      pmmvexhd.this.AV22BarCodPar = aP7[0];
      this.aP7 = aP7;
      pmmvexhd.this.AV23Kgs = aP8[0];
      this.aP8 = aP8;
      pmmvexhd.this.AV24KgsOld = aP9[0];
      this.aP9 = aP9;
      pmmvexhd.this.AV28Mts = aP10[0];
      this.aP10 = aP10;
      pmmvexhd.this.AV29MtsOld = aP11[0];
      this.aP11 = aP11;
      pmmvexhd.this.AV25Conos = aP12[0];
      this.aP12 = aP12;
      pmmvexhd.this.AV26ConosOld = aP13[0];
      this.aP13 = aP13;
      pmmvexhd.this.AV27FecMov = aP14[0];
      this.aP14 = aP14;
      pmmvexhd.this.AV30SalExNln = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n2697ExHdrFeE = false ;
      n2696ExHdrCnE = false ;
      n2695ExHdrKgE = false ;
      n2844ExHdrMtE = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02CP2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n2697ExHdrFeE), AV27FecMov, Short.valueOf(AV26ConosOld), Short.valueOf(AV25Conos), AV24KgsOld, AV23Kgs, AV29MtsOld, AV28Mts, AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas, AV18ExHdrTip, Integer.valueOf(AV19ExHdrAlb), Integer.valueOf(AV20BarCod), Byte.valueOf(AV21BarCodReo), AV22BarCodPar, Short.valueOf(AV30SalExNln)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmmvexhd.this.AV15EmprCod;
      this.aP1[0] = pmmvexhd.this.AV16ManCod;
      this.aP2[0] = pmmvexhd.this.AV17ExHdrFas;
      this.aP3[0] = pmmvexhd.this.AV18ExHdrTip;
      this.aP4[0] = pmmvexhd.this.AV19ExHdrAlb;
      this.aP5[0] = pmmvexhd.this.AV20BarCod;
      this.aP6[0] = pmmvexhd.this.AV21BarCodReo;
      this.aP7[0] = pmmvexhd.this.AV22BarCodPar;
      this.aP8[0] = pmmvexhd.this.AV23Kgs;
      this.aP9[0] = pmmvexhd.this.AV24KgsOld;
      this.aP10[0] = pmmvexhd.this.AV28Mts;
      this.aP11[0] = pmmvexhd.this.AV29MtsOld;
      this.aP12[0] = pmmvexhd.this.AV25Conos;
      this.aP13[0] = pmmvexhd.this.AV26ConosOld;
      this.aP14[0] = pmmvexhd.this.AV27FecMov;
      this.aP15[0] = pmmvexhd.this.AV30SalExNln;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmmvexhd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A2697ExHdrFeE = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmmvexhd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21BarCodReo ;
   private short AV16ManCod ;
   private short AV25Conos ;
   private short AV26ConosOld ;
   private short AV30SalExNln ;
   private short Gx_err ;
   private int AV19ExHdrAlb ;
   private int AV20BarCod ;
   private java.math.BigDecimal AV23Kgs ;
   private java.math.BigDecimal AV24KgsOld ;
   private java.math.BigDecimal AV28Mts ;
   private java.math.BigDecimal AV29MtsOld ;
   private String AV15EmprCod ;
   private String AV17ExHdrFas ;
   private String AV18ExHdrTip ;
   private String AV22BarCodPar ;
   private java.util.Date AV27FecMov ;
   private java.util.Date A2697ExHdrFeE ;
   private boolean n2697ExHdrFeE ;
   private boolean n2696ExHdrCnE ;
   private boolean n2695ExHdrKgE ;
   private boolean n2844ExHdrMtE ;
   private short[] aP15 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private short[] aP12 ;
   private short[] aP13 ;
   private java.util.Date[] aP14 ;
   private IDataStoreProvider pr_default ;
}

final  class pmmvexhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02CP2", "UPDATE TXPLEXMVH SET ExHdrFeE=?, ExHdrCnE=ExHdrCnE - ? + ?, ExHdrKgE=ExHdrKgE - ? + ?, ExHdrMtE=ExHdrMtE - ? + ?  WHERE (EmprCod = ? and ManCod = ? and ExHdrFas = ?) AND (ExHdrTip = ?) AND (ExHdrAlb = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ExtHdrLS = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(8, (String)parms[8], 3);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setString(10, (String)parms[10], 8);
               stmt.setString(11, (String)parms[11], 1);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setString(15, (String)parms[15], 1);
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               return;
      }
   }

}

