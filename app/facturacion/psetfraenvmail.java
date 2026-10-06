package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psetfraenvmail extends GXProcedure
{
   public psetfraenvmail( int remoteHandle )
   {
      super( true, remoteHandle , new ModelContext( psetfraenvmail.class ), "" );
   }

   public psetfraenvmail( int remoteHandle ,
                          ModelContext context )
   {
      super( true, remoteHandle , context, "" );
   }

   public void execute( int aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             String aP1 )
   {
      psetfraenvmail.this.AV10Faccod = aP0;
      psetfraenvmail.this.AV12EmprCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17GXLvl1 = (byte)(0) ;
      /* Using cursor P0AO42 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(AV10Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxtAO42 = (byte)(0) ;
         A430FacCod = P0AO42_A430FacCod[0] ;
         A396EmprCod = P0AO42_A396EmprCod[0] ;
         A14420FacEnvMail = P0AO42_A14420FacEnvMail[0] ;
         AV17GXLvl1 = (byte)(1) ;
         A14420FacEnvMail = GXutil.serverNow( context, remoteHandle, pr_default) ;
         gxtAO42 = (byte)(1) ;
         /* Using cursor P0AO43 */
         pr_default.execute(1, new Object[] {A14420FacEnvMail, A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         if ( gxtAO42 == 1 )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.psetfraenvmail");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl1 == 0 )
      {
         System.out.println( httpContext.getMessage( "Factura no localizada !", "")+GXutil.str( AV10Faccod, 8, 0) );
      }
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
      scmdbuf = "" ;
      P0AO42_A430FacCod = new int[1] ;
      P0AO42_A396EmprCod = new String[] {""} ;
      P0AO42_A14420FacEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.psetfraenvmail__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.psetfraenvmail__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.psetfraenvmail__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.psetfraenvmail__default(),
         new Object[] {
             new Object[] {
            P0AO42_A430FacCod, P0AO42_A396EmprCod, P0AO42_A14420FacEnvMail
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl1 ;
   private byte gxtAO42 ;
   private short Gx_err ;
   private int AV10Faccod ;
   private int A430FacCod ;
   private String AV12EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date A14420FacEnvMail ;
   private IDataStoreProvider pr_default ;
   private int[] P0AO42_A430FacCod ;
   private String[] P0AO42_A396EmprCod ;
   private java.util.Date[] P0AO42_A14420FacEnvMail ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class psetfraenvmail__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetfraenvmail__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetfraenvmail__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class psetfraenvmail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AO42", "SELECT FacCod, EmprCod, FacEnvMail FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AO43", "UPDATE TXPCFAVEN SET FacEnvMail=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
      }
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
               return;
            case 1 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

