package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizohashdocumentotransportecomercial extends GXProcedure
{
   public actualizohashdocumentotransportecomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizohashdocumentotransportecomercial.class ), "" );
   }

   public actualizohashdocumentotransportecomercial( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      actualizohashdocumentotransportecomercial.this.aP3 = new String[] {""};
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
      actualizohashdocumentotransportecomercial.this.AV12EmprCod = aP0;
      actualizohashdocumentotransportecomercial.this.AV9FacCod = aP1;
      actualizohashdocumentotransportecomercial.this.AV10texto = aP2[0];
      this.aP2 = aP2;
      actualizohashdocumentotransportecomercial.this.AV11Hash = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0AHU2 */
      String AV11Hash10014Aux;
      AV11Hash10014Aux = AV11Hash ;
      pr_default.execute(0, new Object[] {AV11Hash10014Aux, AV10texto, Integer.valueOf(AV9FacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.actualizohashdocumentotransportecomercial");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = actualizohashdocumentotransportecomercial.this.AV10texto;
      this.aP3[0] = actualizohashdocumentotransportecomercial.this.AV11Hash;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentotransportecomercial__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentotransportecomercial__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentotransportecomercial__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizohashdocumentotransportecomercial__default(),
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
   private String AV12EmprCod ;
   private String AV10texto ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String AV11Hash ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class actualizohashdocumentotransportecomercial__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizohashdocumentotransportecomercial__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizohashdocumentotransportecomercial__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizohashdocumentotransportecomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AHU2", "UPDATE TXPCALCOM SET AlbComFd=?, AlbComFdD=?  WHERE AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 200);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

