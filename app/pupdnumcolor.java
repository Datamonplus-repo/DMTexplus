package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdnumcolor extends GXProcedure
{
   public pupdnumcolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdnumcolor.class ), "" );
   }

   public pupdnumcolor( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      pupdnumcolor.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pupdnumcolor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdnumcolor.this.A13369CORId = aP1[0];
      this.aP1 = aP1;
      pupdnumcolor.this.AV8MatConta = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n13371CORNum = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05XJ2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n13371CORNum), Integer.valueOf(AV8MatConta), A396EmprCod, A13369CORId});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCORNRO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdnumcolor.this.A396EmprCod;
      this.aP1[0] = pupdnumcolor.this.A13369CORId;
      this.aP2[0] = pupdnumcolor.this.AV8MatConta;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdnumcolor");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdnumcolor__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8MatConta ;
   private int A13371CORNum ;
   private String A396EmprCod ;
   private String A13369CORId ;
   private boolean n13371CORNum ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pupdnumcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05XJ2", "UPDATE TXPCORNRO SET CORNum=?  WHERE EmprCod = ? and CORId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCORNRO")
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 4);
               return;
      }
   }

}

