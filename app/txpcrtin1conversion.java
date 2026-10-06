package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpcrtin1conversion extends GXProcedure
{
   public txpcrtin1conversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpcrtin1conversion.class ), "" );
   }

   public txpcrtin1conversion( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized copy (Insert w/Subselect). */
      /* Using cursor TXPCRTIN1C2 */
      pr_default.execute(0);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
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
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpcrtin1conversion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpcrtin1conversion__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class txpcrtin1conversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("TXPCRTIN1C2", "INSERT INTO TEXPLUSNET.GXA0726(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) SELECT EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, SUBSTR(Inc_Obs, 1, 400) AS GXC1, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St  FROM TEXPLUSNET.TXPCRTIN1", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
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
      }
   }

}

