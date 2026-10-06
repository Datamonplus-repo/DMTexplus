package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_tgrdtar extends GXProcedure
{
   public get_tgrdtar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_tgrdtar.class ), "" );
   }

   public get_tgrdtar( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           short aP1 ,
                                           java.math.BigDecimal aP2 )
   {
      get_tgrdtar.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.math.BigDecimal aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.math.BigDecimal aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      get_tgrdtar.this.A396EmprCod = aP0;
      get_tgrdtar.this.A4364GrdTipArt = aP1;
      get_tgrdtar.this.A4376GrdTipVal = aP2;
      get_tgrdtar.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9GrdTipCos = DecimalUtil.ZERO ;
      /* Using cursor P0AMF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4377GrdTipCos = P0AMF2_A4377GrdTipCos[0] ;
         AV9GrdTipCos = A4377GrdTipCos ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = get_tgrdtar.this.AV9GrdTipCos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9GrdTipCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AMF2_A396EmprCod = new String[] {""} ;
      P0AMF2_A4364GrdTipArt = new short[1] ;
      P0AMF2_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMF2_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4377GrdTipCos = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.get_tgrdtar__default(),
         new Object[] {
             new Object[] {
            P0AMF2_A396EmprCod, P0AMF2_A4364GrdTipArt, P0AMF2_A4376GrdTipVal, P0AMF2_A4377GrdTipCos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short Gx_err ;
   private java.math.BigDecimal A4376GrdTipVal ;
   private java.math.BigDecimal AV9GrdTipCos ;
   private java.math.BigDecimal A4377GrdTipCos ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMF2_A396EmprCod ;
   private short[] P0AMF2_A4364GrdTipArt ;
   private java.math.BigDecimal[] P0AMF2_A4376GrdTipVal ;
   private java.math.BigDecimal[] P0AMF2_A4377GrdTipCos ;
}

final  class get_tgrdtar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMF2", "SELECT EmprCod, GrdTipArt, GrdTipVal, GrdTipCos FROM TXPGRDTAR WHERE EmprCod = ? and GrdTipArt = ? and GrdTipVal = ? ORDER BY EmprCod, GrdTipArt, GrdTipVal ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
      }
   }

}

