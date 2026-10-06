package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdclimatiz extends GXProcedure
{
   public pupdclimatiz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdclimatiz.class ), "" );
   }

   public pupdclimatiz( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          short[] aP2 ,
                          int[] aP3 )
   {
      pupdclimatiz.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 )
   {
      pupdclimatiz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdclimatiz.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pupdclimatiz.this.A13240CliMatCod = aP2[0];
      this.aP2 = aP2;
      pupdclimatiz.this.AV8MatConta = aP3[0];
      this.aP3 = aP3;
      pupdclimatiz.this.AV9Lb_colnum = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Lb_colnum = AV8MatConta ;
      n13239MatNumCol = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05X52 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n13239MatNumCol), Integer.valueOf(AV8MatConta), A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A13240CliMatCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMAT");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdclimatiz.this.A396EmprCod;
      this.aP1[0] = pupdclimatiz.this.A252CliCod;
      this.aP2[0] = pupdclimatiz.this.A13240CliMatCod;
      this.aP3[0] = pupdclimatiz.this.AV8MatConta;
      this.aP4[0] = pupdclimatiz.this.AV9Lb_colnum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdclimatiz");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdclimatiz__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13240CliMatCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV8MatConta ;
   private int AV9Lb_colnum ;
   private int A13239MatNumCol ;
   private String A396EmprCod ;
   private boolean n13239MatNumCol ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pupdclimatiz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05X52", "UPDATE TXPCLIMAT SET MatNumCol=?  WHERE EmprCod = ? and CliCod = ? and CliMatCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIMAT")
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

