package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmvhdr extends GXProcedure
{
   public pmmvhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmvhdr.class ), "" );
   }

   public pmmvhdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
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
                                     short[] aP13 )
   {
      pmmvhdr.this.aP14 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
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
                        java.util.Date[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
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
                             java.util.Date[] aP14 )
   {
      pmmvhdr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmvhdr.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pmmvhdr.this.AV17ExHdrFas = aP2[0];
      this.aP2 = aP2;
      pmmvhdr.this.AV18ExHdrTip = aP3[0];
      this.aP3 = aP3;
      pmmvhdr.this.AV19ExHdrAlb = aP4[0];
      this.aP4 = aP4;
      pmmvhdr.this.AV20BarCod = aP5[0];
      this.aP5 = aP5;
      pmmvhdr.this.AV21BarCodReo = aP6[0];
      this.aP6 = aP6;
      pmmvhdr.this.AV22BarCodPar = aP7[0];
      this.aP7 = aP7;
      pmmvhdr.this.AV23Kgs = aP8[0];
      this.aP8 = aP8;
      pmmvhdr.this.AV24KgsOld = aP9[0];
      this.aP9 = aP9;
      pmmvhdr.this.AV28Mts = aP10[0];
      this.aP10 = aP10;
      pmmvhdr.this.AV29MtsOld = aP11[0];
      this.aP11 = aP11;
      pmmvhdr.this.AV25Conos = aP12[0];
      this.aP12 = aP12;
      pmmvhdr.this.AV26ConosOld = aP13[0];
      this.aP13 = aP13;
      pmmvhdr.this.AV27FecMov = aP14[0];
      this.aP14 = aP14;
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
      /* Using cursor P00FL2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n2697ExHdrFeE), AV27FecMov, Short.valueOf(AV26ConosOld), Short.valueOf(AV25Conos), AV24KgsOld, AV23Kgs, AV29MtsOld, AV28Mts, AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas, AV18ExHdrTip, Integer.valueOf(AV19ExHdrAlb), Integer.valueOf(AV20BarCod), Byte.valueOf(AV21BarCodReo), AV22BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmmvhdr.this.AV15EmprCod;
      this.aP1[0] = pmmvhdr.this.AV16ManCod;
      this.aP2[0] = pmmvhdr.this.AV17ExHdrFas;
      this.aP3[0] = pmmvhdr.this.AV18ExHdrTip;
      this.aP4[0] = pmmvhdr.this.AV19ExHdrAlb;
      this.aP5[0] = pmmvhdr.this.AV20BarCod;
      this.aP6[0] = pmmvhdr.this.AV21BarCodReo;
      this.aP7[0] = pmmvhdr.this.AV22BarCodPar;
      this.aP8[0] = pmmvhdr.this.AV23Kgs;
      this.aP9[0] = pmmvhdr.this.AV24KgsOld;
      this.aP10[0] = pmmvhdr.this.AV28Mts;
      this.aP11[0] = pmmvhdr.this.AV29MtsOld;
      this.aP12[0] = pmmvhdr.this.AV25Conos;
      this.aP13[0] = pmmvhdr.this.AV26ConosOld;
      this.aP14[0] = pmmvhdr.this.AV27FecMov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmmvhdr");
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmmvhdr__default(),
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
   private java.util.Date[] aP14 ;
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
   private IDataStoreProvider pr_default ;
}

final  class pmmvhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00FL2", "UPDATE TXPLEXMVH SET ExHdrFeE=?, ExHdrCnE=ExHdrCnE - ? + ?, ExHdrKgE=ExHdrKgE - ? + ?, ExHdrMtE=ExHdrMtE - ? + ?  WHERE (EmprCod = ? and ManCod = ? and ExHdrFas = ?) AND (ExHdrTip = ?) AND (ExHdrAlb = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
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
               return;
      }
   }

}

