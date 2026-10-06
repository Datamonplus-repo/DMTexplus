package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusalb extends GXProcedure
{
   public pbusalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusalb.class ), "" );
   }

   public pbusalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.math.BigDecimal aP3 ,
                        java.math.BigDecimal aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.math.BigDecimal aP3 ,
                             java.math.BigDecimal aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 )
   {
      pbusalb.this.A396EmprCod = aP0;
      pbusalb.this.A430FacCod = aP1;
      pbusalb.this.A446FacLin = aP2;
      pbusalb.this.AV15FacKgs = aP3;
      pbusalb.this.AV16FacPreKgs = aP4;
      pbusalb.this.AV17FacMts = aP5;
      pbusalb.this.AV18FacPreMts = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P00AF2 */
      pr_default.execute(0, new Object[] {AV18FacPreMts, AV17FacMts, AV16FacPreKgs, AV15FacKgs, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pbusalb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pbusalb__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A430FacCod ;
   private int A446FacLin ;
   private java.math.BigDecimal AV15FacKgs ;
   private java.math.BigDecimal AV16FacPreKgs ;
   private java.math.BigDecimal AV17FacMts ;
   private java.math.BigDecimal AV18FacPreMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class pbusalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00AF2", "UPDATE TXPLFAVEN SET FacPreMts=?, FacMts=?, FacPreKgs=?, FacKgs=?  WHERE EmprCod = ? and FacCod = ? and FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

