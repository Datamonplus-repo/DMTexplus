package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pset_printerdefaultinuser extends GXProcedure
{
   public pset_printerdefaultinuser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pset_printerdefaultinuser.class ), "" );
   }

   public pset_printerdefaultinuser( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( java.util.UUID aP0 ,
                        app.SdtSDTPrinterSelected aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.util.UUID aP0 ,
                             app.SdtSDTPrinterSelected aP1 )
   {
      pset_printerdefaultinuser.this.AV8UserGuid = aP0;
      pset_printerdefaultinuser.this.AV9SDTListPrinterSelected = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10UsurPrint = AV9SDTListPrinterSelected.getgxTv_SdtSDTPrinterSelected_Name() ;
      n14415UsurPrint = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0ANE2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n14415UsurPrint), AV10UsurPrint, AV8UserGuid});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "core.pset_printerdefaultinuser");
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10UsurPrint = "" ;
      A14415UsurPrint = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.core.pset_printerdefaultinuser__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.core.pset_printerdefaultinuser__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.core.pset_printerdefaultinuser__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pset_printerdefaultinuser__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean n14415UsurPrint ;
   private String AV10UsurPrint ;
   private String A14415UsurPrint ;
   private java.util.UUID AV8UserGuid ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private app.SdtSDTPrinterSelected AV9SDTListPrinterSelected ;
}

final  class pset_printerdefaultinuser__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pset_printerdefaultinuser__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pset_printerdefaultinuser__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pset_printerdefaultinuser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0ANE2", "UPDATE TXPUSUARI SET UsurPrint=?  WHERE UsurGuid = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUSUARI")
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 150);
               }
               stmt.setGUID(2, (java.util.UUID)parms[2]);
               return;
      }
   }

}

