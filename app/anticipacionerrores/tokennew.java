package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tokennew extends GXProcedure
{
   public tokennew( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tokennew.class ), "" );
   }

   public tokennew( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              app.anticipacionerrores.SdtsdtMTok[] aP2 )
   {
      tokennew.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        app.anticipacionerrores.SdtsdtMTok[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             app.anticipacionerrores.SdtsdtMTok[] aP2 ,
                             boolean[] aP3 )
   {
      tokennew.this.AV12UsurCod = aP0;
      tokennew.this.AV14MTKnDat = aP1;
      tokennew.this.aP2 = aP2;
      tokennew.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CreadoToken = false ;
      AV10MTknIp = context.getWorkstationId( remoteHandle) ;
      AV9FechaHoy = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      AV18GXLvl5 = (byte)(0) ;
      /* Using cursor P0AUI2 */
      pr_default.execute(0, new Object[] {AV12UsurCod, AV10MTknIp, AV14MTKnDat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14581MTknDat = P0AUI2_A14581MTknDat[0] ;
         n14581MTknDat = P0AUI2_n14581MTknDat[0] ;
         A14580MTknIp = P0AUI2_A14580MTknIp[0] ;
         n14580MTknIp = P0AUI2_n14580MTknIp[0] ;
         A14579MTknUsu = P0AUI2_A14579MTknUsu[0] ;
         A14622MTknVen = P0AUI2_A14622MTknVen[0] ;
         n14622MTknVen = P0AUI2_n14622MTknVen[0] ;
         A14578MTknId = P0AUI2_A14578MTknId[0] ;
         AV18GXLvl5 = (byte)(1) ;
         A14622MTknVen = GXutil.dtadd( AV9FechaHoy, 3600*(7)) ;
         n14622MTknVen = false ;
         AV15MTknId = A14578MTknId ;
         /* Using cursor P0AUI3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n14622MTknVen), A14622MTknVen, Long.valueOf(A14578MTknId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTok");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18GXLvl5 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPMTok

         */
         A14579MTknUsu = AV12UsurCod ;
         A14580MTknIp = AV10MTknIp ;
         n14580MTknIp = false ;
         A14620MTkn = java.util.UUID.randomUUID( ).toString() + "-" + java.util.UUID.randomUUID( ).toString() ;
         n14620MTkn = false ;
         A14621MTknFec = AV9FechaHoy ;
         n14621MTknFec = false ;
         A14622MTknVen = GXutil.dtadd( A14621MTknFec, 3600*(7)) ;
         n14622MTknVen = false ;
         A14581MTknDat = AV14MTKnDat ;
         n14581MTknDat = false ;
         /* Using cursor P0AUI4 */
         pr_default.execute(2, new Object[] {A14579MTknUsu, Boolean.valueOf(n14580MTknIp), A14580MTknIp, Boolean.valueOf(n14620MTkn), A14620MTkn, Boolean.valueOf(n14621MTknFec), A14621MTknFec, Boolean.valueOf(n14622MTknVen), A14622MTknVen, Boolean.valueOf(n14581MTknDat), A14581MTknDat});
         /* Retrieving last key number assigned */
         /* Using cursor P0AUI5 */
         pr_default.execute(3);
         A14578MTknId = P0AUI5_A14578MTknId[0] ;
         pr_default.close(3);
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTok");
         if ( (pr_default.getStatus(2) == 1) )
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
         AV15MTknId = A14578MTknId ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.tokennew");
      /* Using cursor P0AUI6 */
      pr_default.execute(4, new Object[] {Long.valueOf(AV15MTknId)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A14578MTknId = P0AUI6_A14578MTknId[0] ;
         A14579MTknUsu = P0AUI6_A14579MTknUsu[0] ;
         A14580MTknIp = P0AUI6_A14580MTknIp[0] ;
         n14580MTknIp = P0AUI6_n14580MTknIp[0] ;
         A14622MTknVen = P0AUI6_A14622MTknVen[0] ;
         n14622MTknVen = P0AUI6_n14622MTknVen[0] ;
         A14621MTknFec = P0AUI6_A14621MTknFec[0] ;
         n14621MTknFec = P0AUI6_n14621MTknFec[0] ;
         A14620MTkn = P0AUI6_A14620MTkn[0] ;
         n14620MTkn = P0AUI6_n14620MTkn[0] ;
         A14581MTknDat = P0AUI6_A14581MTknDat[0] ;
         n14581MTknDat = P0AUI6_n14581MTknDat[0] ;
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtknusu( A14579MTknUsu );
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtknip( A14580MTknIp );
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtknven( A14622MTknVen );
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtknfec( A14621MTknFec );
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtkn( A14620MTkn );
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtknid( A14578MTknId );
         AV11sdtMTok.setgxTv_SdtsdtMTok_Mtkndat( A14581MTknDat );
         AV8CreadoToken = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tokennew.this.AV11sdtMTok;
      this.aP3[0] = tokennew.this.AV8CreadoToken;
      Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.tokennew");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV10MTknIp = "" ;
      AV9FechaHoy = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P0AUI2_A14581MTknDat = new String[] {""} ;
      P0AUI2_n14581MTknDat = new boolean[] {false} ;
      P0AUI2_A14580MTknIp = new String[] {""} ;
      P0AUI2_n14580MTknIp = new boolean[] {false} ;
      P0AUI2_A14579MTknUsu = new String[] {""} ;
      P0AUI2_A14622MTknVen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUI2_n14622MTknVen = new boolean[] {false} ;
      P0AUI2_A14578MTknId = new long[1] ;
      A14581MTknDat = "" ;
      A14580MTknIp = "" ;
      A14579MTknUsu = "" ;
      A14622MTknVen = GXutil.resetTime( GXutil.nullDate() );
      A14620MTkn = "" ;
      A14621MTknFec = GXutil.resetTime( GXutil.nullDate() );
      P0AUI5_A14578MTknId = new long[1] ;
      Gx_emsg = "" ;
      P0AUI6_A14578MTknId = new long[1] ;
      P0AUI6_A14579MTknUsu = new String[] {""} ;
      P0AUI6_A14580MTknIp = new String[] {""} ;
      P0AUI6_n14580MTknIp = new boolean[] {false} ;
      P0AUI6_A14622MTknVen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUI6_n14622MTknVen = new boolean[] {false} ;
      P0AUI6_A14621MTknFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUI6_n14621MTknFec = new boolean[] {false} ;
      P0AUI6_A14620MTkn = new String[] {""} ;
      P0AUI6_n14620MTkn = new boolean[] {false} ;
      P0AUI6_A14581MTknDat = new String[] {""} ;
      P0AUI6_n14581MTknDat = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokennew__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokennew__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokennew__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.tokennew__default(),
         new Object[] {
             new Object[] {
            P0AUI2_A14581MTknDat, P0AUI2_n14581MTknDat, P0AUI2_A14580MTknIp, P0AUI2_n14580MTknIp, P0AUI2_A14579MTknUsu, P0AUI2_A14622MTknVen, P0AUI2_n14622MTknVen, P0AUI2_A14578MTknId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0AUI5_A14578MTknId
            }
            , new Object[] {
            P0AUI6_A14578MTknId, P0AUI6_A14579MTknUsu, P0AUI6_A14580MTknIp, P0AUI6_n14580MTknIp, P0AUI6_A14622MTknVen, P0AUI6_n14622MTknVen, P0AUI6_A14621MTknFec, P0AUI6_n14621MTknFec, P0AUI6_A14620MTkn, P0AUI6_n14620MTkn,
            P0AUI6_A14581MTknDat, P0AUI6_n14581MTknDat
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl5 ;
   private short Gx_err ;
   private int GX_INS1917 ;
   private long A14578MTknId ;
   private long AV15MTknId ;
   private String AV12UsurCod ;
   private String scmdbuf ;
   private String A14579MTknUsu ;
   private String Gx_emsg ;
   private java.util.Date AV9FechaHoy ;
   private java.util.Date A14622MTknVen ;
   private java.util.Date A14621MTknFec ;
   private boolean AV8CreadoToken ;
   private boolean n14581MTknDat ;
   private boolean n14580MTknIp ;
   private boolean n14622MTknVen ;
   private boolean n14620MTkn ;
   private boolean n14621MTknFec ;
   private String AV14MTKnDat ;
   private String AV10MTknIp ;
   private String A14581MTknDat ;
   private String A14580MTknIp ;
   private String A14620MTkn ;
   private boolean[] aP3 ;
   private app.anticipacionerrores.SdtsdtMTok[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUI2_A14581MTknDat ;
   private boolean[] P0AUI2_n14581MTknDat ;
   private String[] P0AUI2_A14580MTknIp ;
   private boolean[] P0AUI2_n14580MTknIp ;
   private String[] P0AUI2_A14579MTknUsu ;
   private java.util.Date[] P0AUI2_A14622MTknVen ;
   private boolean[] P0AUI2_n14622MTknVen ;
   private long[] P0AUI2_A14578MTknId ;
   private long[] P0AUI5_A14578MTknId ;
   private long[] P0AUI6_A14578MTknId ;
   private String[] P0AUI6_A14579MTknUsu ;
   private String[] P0AUI6_A14580MTknIp ;
   private boolean[] P0AUI6_n14580MTknIp ;
   private java.util.Date[] P0AUI6_A14622MTknVen ;
   private boolean[] P0AUI6_n14622MTknVen ;
   private java.util.Date[] P0AUI6_A14621MTknFec ;
   private boolean[] P0AUI6_n14621MTknFec ;
   private String[] P0AUI6_A14620MTkn ;
   private boolean[] P0AUI6_n14620MTkn ;
   private String[] P0AUI6_A14581MTknDat ;
   private boolean[] P0AUI6_n14581MTknDat ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private app.anticipacionerrores.SdtsdtMTok AV11sdtMTok ;
}

final  class tokennew__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tokennew__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tokennew__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tokennew__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUI2", "SELECT MTknDat, MTknIp, MTknUsu, MTknVen, MTknId FROM TXPMTok WHERE MTknUsu = ? and MTknIp = ? and MTknDat = ? ORDER BY MTknUsu, MTknIp, MTknDat ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AUI3", "UPDATE TXPMTok SET MTknVen=?  WHERE MTknId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMTok")
         ,new UpdateCursor("P0AUI4", "INSERT INTO TXPMTok(MTknUsu, MTknIp, MTkn, MTknFec, MTknVen, MTknDat) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMTok")
         ,new ForEachCursor("P0AUI5", "SELECT MTknId.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUI6", "SELECT MTknId, MTknUsu, MTknIp, MTknVen, MTknFec, MTkn, MTknDat FROM TXPMTok WHERE MTknId = ? ORDER BY MTknId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4, true);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5, true);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setVarchar(3, (String)parms[2], 50);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 20);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 256);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false, true);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false, true);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 50);
               }
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

