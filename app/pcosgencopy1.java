package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcosgencopy1 extends GXProcedure
{
   public pcosgencopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcosgencopy1.class ), "" );
   }

   public pcosgencopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           short aP1 ,
                                           java.math.BigDecimal aP2 )
   {
      pcosgencopy1.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pcosgencopy1.this.AV14EmprCod = aP0;
      pcosgencopy1.this.AV13GrdTipARt = aP1;
      pcosgencopy1.this.AV12Coste_Cor = aP2;
      pcosgencopy1.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AMK2 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Short.valueOf(AV13GrdTipARt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4364GrdTipArt = P0AMK2_A4364GrdTipArt[0] ;
         A396EmprCod = P0AMK2_A396EmprCod[0] ;
         A4377GrdTipCos = P0AMK2_A4377GrdTipCos[0] ;
         A4376GrdTipVal = P0AMK2_A4376GrdTipVal[0] ;
         if ( DecimalUtil.compareTo(AV12Coste_Cor, A4376GrdTipVal) < 0 )
         {
            AV10Coste_Tart = A4377GrdTipCos ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pcosgencopy1.this.AV10Coste_Tart;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Coste_Tart = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AMK2_A4364GrdTipArt = new short[1] ;
      P0AMK2_A396EmprCod = new String[] {""} ;
      P0AMK2_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMK2_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A4377GrdTipCos = DecimalUtil.ZERO ;
      A4376GrdTipVal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcosgencopy1__default(),
         new Object[] {
             new Object[] {
            P0AMK2_A4364GrdTipArt, P0AMK2_A396EmprCod, P0AMK2_A4377GrdTipCos, P0AMK2_A4376GrdTipVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13GrdTipARt ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private java.math.BigDecimal AV12Coste_Cor ;
   private java.math.BigDecimal AV10Coste_Tart ;
   private java.math.BigDecimal A4377GrdTipCos ;
   private java.math.BigDecimal A4376GrdTipVal ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AMK2_A4364GrdTipArt ;
   private String[] P0AMK2_A396EmprCod ;
   private java.math.BigDecimal[] P0AMK2_A4377GrdTipCos ;
   private java.math.BigDecimal[] P0AMK2_A4376GrdTipVal ;
}

final  class pcosgencopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMK2", "SELECT GrdTipArt, EmprCod, GrdTipCos, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, GrdTipVal ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               return;
      }
   }

}

