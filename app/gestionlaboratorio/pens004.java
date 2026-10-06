package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens004 extends GXProcedure
{
   public pens004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens004.class ), "" );
   }

   public pens004( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      pens004.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pens004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens004.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens004.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens004.this.AV8Lb_costeE = aP3[0];
      this.aP3 = aP3;
      pens004.this.AV9Lb_costec = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P01T72 */
      pr_default.execute(0, new Object[] {AV9Lb_costec, AV8Lb_costeE, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens004.this.A396EmprCod;
      this.aP1[0] = pens004.this.A5532Lb_numero;
      this.aP2[0] = pens004.this.A5555Lb_opcion;
      this.aP3[0] = pens004.this.AV8Lb_costeE;
      this.aP4[0] = pens004.this.AV9Lb_costec;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens004");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens004__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV8Lb_costeE ;
   private java.math.BigDecimal AV9Lb_costec ;
   private java.math.BigDecimal A1127Lb_CosteC ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pens004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01T72", "UPDATE TXPENS002 SET Lb_CosteC=?, Lb_CosteE=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

