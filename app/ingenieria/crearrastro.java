package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class crearrastro extends GXProcedure
{
   public crearrastro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crearrastro.class ), "" );
   }

   public crearrastro( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      crearrastro.this.AV10UsurCod = aP0;
      crearrastro.this.AV13Ip = aP1;
      crearrastro.this.AV11Version = aP2;
      crearrastro.this.AV8MRasObj = aP3;
      crearrastro.this.AV9MRasTxt = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14inVersion = "2026-09-30" ;
      if ( ! (GXutil.strcmp("", AV9MRasTxt)==0) )
      {
         /*
            INSERT RECORD ON TABLE TXPMRas

         */
         A14703MRasTxt = GXutil.format( "%1|usuario:%2|host:%3|version:%4|Ip:%5|", GXutil.trim( AV9MRasTxt), GXutil.trim( AV10UsurCod), context.getWorkstationId( remoteHandle), GXutil.trim( AV14inVersion), GXutil.trim( AV13Ip), "", "", "", "") ;
         n14703MRasTxt = false ;
         A14787MRasFec = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
         A14684MRasObj = GXutil.trim( AV8MRasObj) ;
         /* Using cursor P0AUU2 */
         pr_default.execute(0, new Object[] {A14787MRasFec, A14684MRasObj, Boolean.valueOf(n14703MRasTxt), A14703MRasTxt});
         /* Retrieving last key number assigned */
         /* Using cursor P0AUU3 */
         pr_default.execute(1);
         A14683MRasId = P0AUU3_A14683MRasId[0] ;
         pr_default.close(1);
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRas");
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
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.crearrastro");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.crearrastro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14inVersion = "" ;
      A14703MRasTxt = "" ;
      A14787MRasFec = GXutil.resetTime( GXutil.nullDate() );
      A14684MRasObj = "" ;
      scmdbuf = "" ;
      P0AUU3_A14683MRasId = new long[1] ;
      Gx_emsg = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearrastro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearrastro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearrastro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearrastro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearrastro__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P0AUU3_A14683MRasId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS1926 ;
   private long A14683MRasId ;
   private String AV10UsurCod ;
   private String AV11Version ;
   private String AV14inVersion ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date A14787MRasFec ;
   private boolean n14703MRasTxt ;
   private String AV9MRasTxt ;
   private String A14703MRasTxt ;
   private String AV13Ip ;
   private String AV8MRasObj ;
   private String A14684MRasObj ;
   private IDataStoreProvider pr_default ;
   private long[] P0AUU3_A14683MRasId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class crearrastro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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
      return "MODA21";
   }

}

final  class crearrastro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearrastro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearrastro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearrastro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AUU2", "INSERT INTO TXPMRas(MRasFec, MRasObj, MRasTxt) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMRas")
         ,new ForEachCursor("P0AUU3", "SELECT MRasId.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false, true);
               stmt.setVarchar(2, (String)parms[1], 256, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[3]);
               }
               return;
      }
   }

}

