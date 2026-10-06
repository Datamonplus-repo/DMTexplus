package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class crearfiltro extends GXProcedure
{
   public crearfiltro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crearfiltro.class ), "" );
   }

   public crearfiltro( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( app.anticipacionerrores.SdtsdtMFil aP0 ,
                              String[] aP1 ,
                              String[] aP2 )
   {
      crearfiltro.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( app.anticipacionerrores.SdtsdtMFil aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( app.anticipacionerrores.SdtsdtMFil aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             boolean[] aP3 )
   {
      crearfiltro.this.AV8sdtMFil = aP0;
      crearfiltro.this.aP1 = aP1;
      crearfiltro.this.aP2 = aP2;
      crearfiltro.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      crearfiltro.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      crearfiltro.this.AV12EmprCod = GXv_char2[0] ;
      crearfiltro.this.AV13EmprNom = GXv_char3[0] ;
      crearfiltro.this.AV14UsurCod = GXv_char4[0] ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "datos: &Station=%1 ,&EmprCod=%2,&EmprNom =%3,&UsurCod=%4.", ""), AV11Station, AV12EmprCod, AV13EmprNom, AV14UsurCod, "", "", "", "", ""), AV22Pgmname) ;
      AV18sdtMTok.fromJSonString(AV17WebSession.getValue("TexplusNET_Token"), null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Web Session token>%1", ""), AV18sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV22Pgmname) ;
      AV15MFilIp = context.getWorkstationId( remoteHandle) ;
      AV19MFilFec = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      AV16MFilTkn = AV18sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ;
      AV23GXLvl12 = (byte)(0) ;
      n14619MFilNum02 = false ;
      n14618MFilNum01 = false ;
      n14617MFilFec02 = false ;
      n14616MFilFec01 = false ;
      n14614MFilTxt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AUH2 */
      pr_default.execute(0, new Object[] {AV19MFilFec, Boolean.valueOf(n14619MFilNum02), Long.valueOf(AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilnum02()), Boolean.valueOf(n14618MFilNum01), Long.valueOf(AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilnum01()), Boolean.valueOf(n14617MFilFec02), AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilfec02(), Boolean.valueOf(n14616MFilFec01), AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilfec01(), Boolean.valueOf(n14614MFilTxt), AV8sdtMFil.getgxTv_SdtsdtMFil_Mfiltxt(), AV16MFilTkn, AV12EmprCod, AV14UsurCod, AV15MFilIp, AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilobj()});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV23GXLvl12 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFil");
      /* End optimized UPDATE. */
      if ( AV23GXLvl12 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPMFil

         */
         A14577MFilEmp = AV12EmprCod ;
         A14573MFilUsu = AV14UsurCod ;
         A14576MFilIp = AV15MFilIp ;
         A14575MFilTkn = AV16MFilTkn ;
         A14574MFilObj = AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilobj() ;
         A14614MFilTxt = AV8sdtMFil.getgxTv_SdtsdtMFil_Mfiltxt() ;
         n14614MFilTxt = false ;
         A14616MFilFec01 = AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilfec01() ;
         n14616MFilFec01 = false ;
         A14617MFilFec02 = AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilfec02() ;
         n14617MFilFec02 = false ;
         A14618MFilNum01 = AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilnum01() ;
         n14618MFilNum01 = false ;
         A14619MFilNum02 = AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilnum02() ;
         n14619MFilNum02 = false ;
         A14615MFilFec = AV19MFilFec ;
         /* Using cursor P0AUH3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n14614MFilTxt), A14614MFilTxt, A14573MFilUsu, A14577MFilEmp, A14574MFilObj, A14615MFilFec, A14576MFilIp, A14575MFilTkn, Boolean.valueOf(n14616MFilFec01), A14616MFilFec01, Boolean.valueOf(n14617MFilFec02), A14617MFilFec02, Boolean.valueOf(n14618MFilNum01), Long.valueOf(A14618MFilNum01), Boolean.valueOf(n14619MFilNum02), Long.valueOf(A14619MFilNum02)});
         /* Retrieving last key number assigned */
         /* Using cursor P0AUH4 */
         pr_default.execute(2);
         A14572MFilId = P0AUH4_A14572MFilId[0] ;
         pr_default.close(2);
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFil");
         if ( (pr_default.getStatus(1) == 1) )
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
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.crearfiltro");
      AV9Existe = false ;
      /* Using cursor P0AUH5 */
      pr_default.execute(3, new Object[] {AV14UsurCod, AV8sdtMFil.getgxTv_SdtsdtMFil_Mfilobj(), AV16MFilTkn, AV15MFilIp, AV12EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14574MFilObj = P0AUH5_A14574MFilObj[0] ;
         A14575MFilTkn = P0AUH5_A14575MFilTkn[0] ;
         A14576MFilIp = P0AUH5_A14576MFilIp[0] ;
         A14573MFilUsu = P0AUH5_A14573MFilUsu[0] ;
         A14577MFilEmp = P0AUH5_A14577MFilEmp[0] ;
         A14572MFilId = P0AUH5_A14572MFilId[0] ;
         AV9Existe = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = crearfiltro.this.AV14UsurCod;
      this.aP2[0] = crearfiltro.this.AV16MFilTkn;
      this.aP3[0] = crearfiltro.this.AV9Existe;
      Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.crearfiltro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14UsurCod = "" ;
      AV16MFilTkn = "" ;
      AV11Station = "" ;
      GXt_char1 = "" ;
      AV12EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV22Pgmname = "" ;
      AV18sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV17WebSession = httpContext.getWebSession();
      AV15MFilIp = "" ;
      AV19MFilFec = GXutil.resetTime( GXutil.nullDate() );
      A14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
      A14617MFilFec02 = GXutil.nullDate() ;
      A14616MFilFec01 = GXutil.nullDate() ;
      A14614MFilTxt = "" ;
      A14575MFilTkn = "" ;
      A14577MFilEmp = "" ;
      A14573MFilUsu = "" ;
      A14576MFilIp = "" ;
      A14574MFilObj = "" ;
      scmdbuf = "" ;
      P0AUH4_A14572MFilId = new long[1] ;
      Gx_emsg = "" ;
      P0AUH5_A14574MFilObj = new String[] {""} ;
      P0AUH5_A14575MFilTkn = new String[] {""} ;
      P0AUH5_A14576MFilIp = new String[] {""} ;
      P0AUH5_A14573MFilUsu = new String[] {""} ;
      P0AUH5_A14577MFilEmp = new String[] {""} ;
      P0AUH5_A14572MFilId = new long[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.crearfiltro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.crearfiltro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.crearfiltro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.crearfiltro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.crearfiltro__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0AUH4_A14572MFilId
            }
            , new Object[] {
            P0AUH5_A14574MFilObj, P0AUH5_A14575MFilTkn, P0AUH5_A14576MFilIp, P0AUH5_A14573MFilUsu, P0AUH5_A14577MFilEmp, P0AUH5_A14572MFilId
            }
         }
      );
      AV22Pgmname = "AnticipacionErrores.CrearFiltro" ;
      /* GeneXus formulas. */
      AV22Pgmname = "AnticipacionErrores.CrearFiltro" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl12 ;
   private short Gx_err ;
   private int GX_INS1916 ;
   private long A14619MFilNum02 ;
   private long A14618MFilNum01 ;
   private long A14572MFilId ;
   private String AV14UsurCod ;
   private String AV11Station ;
   private String GXt_char1 ;
   private String AV12EmprCod ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV22Pgmname ;
   private String A14614MFilTxt ;
   private String A14577MFilEmp ;
   private String A14573MFilUsu ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date AV19MFilFec ;
   private java.util.Date A14615MFilFec ;
   private java.util.Date A14617MFilFec02 ;
   private java.util.Date A14616MFilFec01 ;
   private boolean AV9Existe ;
   private boolean n14619MFilNum02 ;
   private boolean n14618MFilNum01 ;
   private boolean n14617MFilFec02 ;
   private boolean n14616MFilFec01 ;
   private boolean n14614MFilTxt ;
   private String AV16MFilTkn ;
   private String AV15MFilIp ;
   private String A14575MFilTkn ;
   private String A14576MFilIp ;
   private String A14574MFilObj ;
   private com.genexus.webpanels.WebSession AV17WebSession ;
   private boolean[] aP3 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P0AUH4_A14572MFilId ;
   private String[] P0AUH5_A14574MFilObj ;
   private String[] P0AUH5_A14575MFilTkn ;
   private String[] P0AUH5_A14576MFilIp ;
   private String[] P0AUH5_A14573MFilUsu ;
   private String[] P0AUH5_A14577MFilEmp ;
   private long[] P0AUH5_A14572MFilId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private app.anticipacionerrores.SdtsdtMFil AV8sdtMFil ;
   private app.anticipacionerrores.SdtsdtMTok AV18sdtMTok ;
}

final  class crearfiltro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AUH2", "UPDATE TXPMFil SET MFilFec=?, MFilNum02=?, MFilNum01=?, MFilFec02=?, MFilFec01=?, MFilTxt=?, MFilTkn=?  WHERE (MFilEmp = ?) AND (MFilUsu = ?) AND (MFilIp = ?) AND (MFilObj = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFil")
         ,new UpdateCursor("P0AUH3", "INSERT INTO TXPMFil(MFilTxt, MFilUsu, MFilEmp, MFilObj, MFilFec, MFilIp, MFilTkn, MFilFec01, MFilFec02, MFilNum01, MFilNum02) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFil")
         ,new ForEachCursor("P0AUH4", "SELECT MFilId.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUH5", "SELECT MFilObj, MFilTkn, MFilIp, MFilUsu, MFilEmp, MFilId FROM TXPMFil WHERE MFilUsu = ? and MFilObj = ? and MFilTkn = ? and MFilIp = ? and MFilEmp = ? ORDER BY MFilUsu, MFilObj, MFilTkn, MFilIp, MFilEmp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[4]).longValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 16);
               }
               stmt.setVarchar(7, (String)parms[11], 256, false);
               stmt.setString(8, (String)parms[12], 3);
               stmt.setString(9, (String)parms[13], 8);
               stmt.setVarchar(10, (String)parms[14], 20);
               stmt.setVarchar(11, (String)parms[15], 256);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setVarchar(4, (String)parms[4], 256, false);
               stmt.setDateTime(5, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(6, (String)parms[6], 20, false);
               stmt.setVarchar(7, (String)parms[7], 256, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[15]).longValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 256);
               stmt.setVarchar(3, (String)parms[2], 256);
               stmt.setVarchar(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 3);
               return;
      }
   }

}

