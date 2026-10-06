package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psetartfecmod extends GXProcedure
{
   public psetartfecmod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psetartfecmod.class ), "" );
   }

   public psetartfecmod( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      psetartfecmod.this.AV8EmprCod = aP0;
      psetartfecmod.this.AV9CliCod = aP1;
      psetartfecmod.this.AV10ArtCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12ArtFecMod = Gx_date ;
      AV16GXLvl6 = (byte)(0) ;
      n4354ArtFecMod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AKF2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n4354ArtFecMod), AV12ArtFecMod, AV8EmprCod, Integer.valueOf(AV9CliCod), AV10ArtCod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV16GXLvl6 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      /* End optimized UPDATE. */
      if ( AV16GXLvl6 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registro no encontrado en : ", "")+localUtil.dtoc( AV12ArtFecMod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "psetartfecmod");
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
      AV12ArtFecMod = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A4354ArtFecMod = GXutil.nullDate() ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.psetartfecmod__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.psetartfecmod__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.psetartfecmod__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psetartfecmod__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV16GXLvl6 ;
   private short Gx_err ;
   private int AV9CliCod ;
   private String AV8EmprCod ;
   private String AV10ArtCod ;
   private java.util.Date AV12ArtFecMod ;
   private java.util.Date Gx_date ;
   private java.util.Date A4354ArtFecMod ;
   private boolean n4354ArtFecMod ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class psetartfecmod__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetartfecmod__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetartfecmod__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetartfecmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AKF2", "UPDATE TXPARTICU SET ArtFecMod=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
      }
   }

}

