package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdvrecuento extends GXProcedure
{
   public pdvrecuento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdvrecuento.class ), "" );
   }

   public pdvrecuento( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pdvrecuento.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pdvrecuento.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdvrecuento.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n11978DVEntUniRe = false ;
      n11980DVEntCon = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNENTALM");
      /* End optimized UPDATE. */
      n12005DVPrdExiAl = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdvrecuento.this.A396EmprCod;
      this.aP1[0] = pdvrecuento.this.AV8PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdvrecuento");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdvrecuento__default(),
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

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private boolean n11978DVEntUniRe ;
   private boolean n11980DVEntCon ;
   private boolean n12005DVPrdExiAl ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class pdvrecuento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04XN2", "UPDATE LVNENTALM SET EntUniRem=0, EntCon=1  WHERE (Emprcod = ? and Prdnum = ?) AND (EntCon = 0)", GX_NOMASK + GX_MASKLOOPLOCK, "LVNENTALM")
         ,new UpdateCursor("P04XN3", "UPDATE LVNDVPRODUC SET PrdExiAlm=0  WHERE Emprcod = ? and Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

