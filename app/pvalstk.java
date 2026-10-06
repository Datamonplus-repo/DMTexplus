package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalstk extends GXProcedure
{
   public pvalstk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalstk.class ), "" );
   }

   public pvalstk( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      pvalstk.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pvalstk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvalstk.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pvalstk.this.AV8Cant_mov = aP2[0];
      this.aP2 = aP2;
      pvalstk.this.AV9Precio_mov = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02882 */
      pr_default.execute(0, new Object[] {AV9Precio_mov, AV8Cant_mov, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalstk.this.A396EmprCod;
      this.aP1[0] = pvalstk.this.A719PrdNum;
      this.aP2[0] = pvalstk.this.AV8Cant_mov;
      this.aP3[0] = pvalstk.this.AV9Precio_mov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pvalstk");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvalstk__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV8Cant_mov ;
   private java.math.BigDecimal AV9Precio_mov ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pvalstk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02882", "UPDATE TXPPRODUC SET PrdValStk=PrdValStk - ROUND(? * CAST(? AS NUMERIC(24,10)), 2)  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

