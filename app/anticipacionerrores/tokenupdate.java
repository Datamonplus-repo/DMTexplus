package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tokenupdate extends GXProcedure
{
   public tokenupdate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tokenupdate.class ), "" );
   }

   public tokenupdate( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              String aP2 )
   {
      tokenupdate.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             boolean[] aP3 )
   {
      tokenupdate.this.AV12UsurCod = aP0;
      tokenupdate.this.AV19inIp = aP1;
      tokenupdate.this.AV17MTkn = aP2;
      tokenupdate.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18ActualizadoToken = false ;
      AV9FechaHoy = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      AV23GXLvl4 = (byte)(0) ;
      /* Using cursor P0AVD2 */
      pr_default.execute(0, new Object[] {AV12UsurCod, AV19inIp, AV17MTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14620MTkn = P0AVD2_A14620MTkn[0] ;
         n14620MTkn = P0AVD2_n14620MTkn[0] ;
         A14580MTknIp = P0AVD2_A14580MTknIp[0] ;
         n14580MTknIp = P0AVD2_n14580MTknIp[0] ;
         A14579MTknUsu = P0AVD2_A14579MTknUsu[0] ;
         A14622MTknVen = P0AVD2_A14622MTknVen[0] ;
         n14622MTknVen = P0AVD2_n14622MTknVen[0] ;
         A14578MTknId = P0AVD2_A14578MTknId[0] ;
         AV23GXLvl4 = (byte)(1) ;
         AV20MTknVen = A14622MTknVen ;
         A14622MTknVen = GXutil.dtadd( AV9FechaHoy, 86400*(1)) ;
         n14622MTknVen = false ;
         AV18ActualizadoToken = true ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Localizado el token con: &UsurCod:%1, &MTkn:%2, &inIp:%3, Id=%4, Ven:%5, Venc anterior:%6.", AV12UsurCod, AV17MTkn, AV19inIp, GXutil.ltrimstr( DecimalUtil.doubleToDec(A14578MTknId), 10, 0), localUtil.ttoc( A14622MTknVen, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV20MTknVen, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", ""), AV24Pgmname) ;
         /* Using cursor P0AVD3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n14622MTknVen), A14622MTknVen, Long.valueOf(A14578MTknId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTok");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23GXLvl4 == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "NO Localizado token con: &UsurCod:%1, &MTkn:%2, &inIp:%3.", AV12UsurCod, AV17MTkn, AV19inIp, "", "", "", "", "", ""), AV24Pgmname) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.tokenupdate");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = tokenupdate.this.AV18ActualizadoToken;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9FechaHoy = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P0AVD2_A14620MTkn = new String[] {""} ;
      P0AVD2_n14620MTkn = new boolean[] {false} ;
      P0AVD2_A14580MTknIp = new String[] {""} ;
      P0AVD2_n14580MTknIp = new boolean[] {false} ;
      P0AVD2_A14579MTknUsu = new String[] {""} ;
      P0AVD2_A14622MTknVen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AVD2_n14622MTknVen = new boolean[] {false} ;
      P0AVD2_A14578MTknId = new long[1] ;
      A14620MTkn = "" ;
      A14580MTknIp = "" ;
      A14579MTknUsu = "" ;
      A14622MTknVen = GXutil.resetTime( GXutil.nullDate() );
      AV20MTknVen = GXutil.resetTime( GXutil.nullDate() );
      AV24Pgmname = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokenupdate__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokenupdate__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokenupdate__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokenupdate__default(),
         new Object[] {
             new Object[] {
            P0AVD2_A14620MTkn, P0AVD2_n14620MTkn, P0AVD2_A14580MTknIp, P0AVD2_n14580MTknIp, P0AVD2_A14579MTknUsu, P0AVD2_A14622MTknVen, P0AVD2_n14622MTknVen, P0AVD2_A14578MTknId
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "AnticipacionErrores.TokenUpdate" ;
      /* GeneXus formulas. */
      AV24Pgmname = "AnticipacionErrores.TokenUpdate" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl4 ;
   private short Gx_err ;
   private long A14578MTknId ;
   private String AV12UsurCod ;
   private String scmdbuf ;
   private String A14579MTknUsu ;
   private String AV24Pgmname ;
   private java.util.Date AV9FechaHoy ;
   private java.util.Date A14622MTknVen ;
   private java.util.Date AV20MTknVen ;
   private boolean AV18ActualizadoToken ;
   private boolean n14620MTkn ;
   private boolean n14580MTknIp ;
   private boolean n14622MTknVen ;
   private String AV19inIp ;
   private String AV17MTkn ;
   private String A14620MTkn ;
   private String A14580MTknIp ;
   private boolean[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVD2_A14620MTkn ;
   private boolean[] P0AVD2_n14620MTkn ;
   private String[] P0AVD2_A14580MTknIp ;
   private boolean[] P0AVD2_n14580MTknIp ;
   private String[] P0AVD2_A14579MTknUsu ;
   private java.util.Date[] P0AVD2_A14622MTknVen ;
   private boolean[] P0AVD2_n14622MTknVen ;
   private long[] P0AVD2_A14578MTknId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class tokenupdate__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tokenupdate__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tokenupdate__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tokenupdate__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVD2", "SELECT MTkn, MTknIp, MTknUsu, MTknVen, MTknId FROM TXPMTok WHERE (MTknUsu = ? and MTknIp = ?) AND (MTkn = ?) ORDER BY MTknUsu, MTknIp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AVD3", "UPDATE TXPMTok SET MTknVen=?  WHERE MTknId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMTok")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4, true);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 20);
               stmt.setVarchar(3, (String)parms[2], 256);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false, true);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
      }
   }

}

