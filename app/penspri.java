package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class penspri extends GXProcedure
{
   public penspri( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penspri.class ), "" );
   }

   public penspri( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      penspri.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      penspri.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      penspri.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      penspri.this.AV8Lb_PriEns = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02M82 */
      pr_default.execute(0, new Object[] {AV8Lb_PriEns, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = penspri.this.A396EmprCod;
      this.aP1[0] = penspri.this.A5532Lb_numero;
      this.aP2[0] = penspri.this.AV8Lb_PriEns;
      Application.commitDataStores(context, remoteHandle, pr_default, "penspri");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A6644Lb_PriEns = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.penspri__default(),
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
   private String A396EmprCod ;
   private String AV8Lb_PriEns ;
   private String A6644Lb_PriEns ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class penspri__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02M82", "UPDATE TXPENS001 SET Lb_PriEns=?  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

