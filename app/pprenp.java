package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprenp extends GXProcedure
{
   public pprenp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprenp.class ), "" );
   }

   public pprenp( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 )
   {
      pprenp.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pprenp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprenp.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pprenp.this.A6158PrdPrv = aP2[0];
      this.aP2 = aP2;
      pprenp.this.AV8PRDPREA = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02U92 */
      pr_default.execute(0, new Object[] {AV8PRDPREA, A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprenp.this.A396EmprCod;
      this.aP1[0] = pprenp.this.A719PrdNum;
      this.aP2[0] = pprenp.this.A6158PrdPrv;
      this.aP3[0] = pprenp.this.AV8PRDPREA;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprenp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A7240PrdPrea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprenp__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal AV8PRDPREA ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pprenp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02U92", "UPDATE TXPPROPRV SET PrdPrea=?  WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

