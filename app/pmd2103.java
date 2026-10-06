package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmd2103 extends GXProcedure
{
   public pmd2103( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmd2103.class ), "" );
   }

   public pmd2103( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pmd2103.this.aP2 = new String[] {""};
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
      pmd2103.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmd2103.this.AV10Clicodd = aP1[0];
      this.aP1 = aP1;
      pmd2103.this.AV11Fascod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P03HC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Clicodd), AV11Fascod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmd2103.this.A396EmprCod;
      this.aP1[0] = pmd2103.this.AV10Clicodd;
      this.aP2[0] = pmd2103.this.AV11Fascod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmd2103");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmd2103__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10Clicodd ;
   private String A396EmprCod ;
   private String AV11Fascod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pmd2103__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03HC2", "DELETE FROM TXPPREFAS  WHERE EmprCod = ? and CliCod = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

