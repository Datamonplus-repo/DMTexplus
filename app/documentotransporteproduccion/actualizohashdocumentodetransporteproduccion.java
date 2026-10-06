package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizohashdocumentodetransporteproduccion extends GXProcedure
{
   public actualizohashdocumentodetransporteproduccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizohashdocumentodetransporteproduccion.class ), "" );
   }

   public actualizohashdocumentodetransporteproduccion( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      actualizohashdocumentodetransporteproduccion.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      actualizohashdocumentodetransporteproduccion.this.AV19EmprCod = aP0;
      actualizohashdocumentodetransporteproduccion.this.AV9FacCod = aP1;
      actualizohashdocumentodetransporteproduccion.this.AV10texto = aP2[0];
      this.aP2 = aP2;
      actualizohashdocumentodetransporteproduccion.this.AV11Hash = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n10017AlbFmd = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0A732 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n10017AlbFmd), AV11Hash, AV10texto, Integer.valueOf(AV9FacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.actualizohashdocumentodetransporteproduccion");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = actualizohashdocumentodetransporteproduccion.this.AV10texto;
      this.aP3[0] = actualizohashdocumentodetransporteproduccion.this.AV11Hash;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A10017AlbFmd = "" ;
      A10018ALbFmdc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9FacCod ;
   private String AV19EmprCod ;
   private String AV10texto ;
   private String A10018ALbFmdc ;
   private boolean n10017AlbFmd ;
   private String AV11Hash ;
   private String A10017AlbFmd ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class actualizohashdocumentodetransporteproduccion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizohashdocumentodetransporteproduccion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizohashdocumentodetransporteproduccion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizohashdocumentodetransporteproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A732", "UPDATE TXPCALPRD SET AlbFmd=?, ALbFmdc=?  WHERE AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               stmt.setString(2, (String)parms[2], 255);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

