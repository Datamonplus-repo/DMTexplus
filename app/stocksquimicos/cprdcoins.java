package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cprdcoins extends GXProcedure
{
   public cprdcoins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cprdcoins.class ), "" );
   }

   public cprdcoins( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      cprdcoins.this.aP1 = new String[] {""};
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
      cprdcoins.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      cprdcoins.this.AV9prdnum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCPRDCO

      */
      A396EmprCod = AV8emprcod ;
      A688PrdComCod = AV9prdnum ;
      /* Using cursor P09I02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A688PrdComCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDCO");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = cprdcoins.this.AV8emprcod;
      this.aP1[0] = cprdcoins.this.AV9prdnum;
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.cprdcoins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A688PrdComCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.cprdcoins__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS160 ;
   private String AV8emprcod ;
   private String AV9prdnum ;
   private String A396EmprCod ;
   private String A688PrdComCod ;
   private String Gx_emsg ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class cprdcoins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09I02", "INSERT INTO TXPCPRDCO(EmprCod, PrdComCod) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDCO")
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
      }
   }

}

