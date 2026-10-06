package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenmac extends GXProcedure
{
   public pgenmac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenmac.class ), "" );
   }

   public pgenmac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 )
   {
      pgenmac.this.AV15EmprCod = aP0;
      pgenmac.this.AV16DisCod = aP1;
      pgenmac.this.AV17MacCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pgenmac.this.GXt_int1 = GXv_int2[0] ;
      AV20Tinamar = GXt_int1 ;
      AV18Linea = (short)(0) ;
      GXt_char3 = AV22Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pgenmac.this.GXt_char3 = GXv_char4[0] ;
      AV22Station = GXt_char3 ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_char5[0] = AV23EmprNom ;
      GXv_char6[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char5, GXv_char6) ;
      pgenmac.this.AV15EmprCod = GXv_char4[0] ;
      pgenmac.this.AV23EmprNom = GXv_char5[0] ;
      pgenmac.this.AV21UsurCod = GXv_char6[0] ;
      /*
         INSERT RECORD ON TABLE TXPCMACRO

      */
      A396EmprCod = AV15EmprCod ;
      A1199MacCod = AV17MacCod ;
      A1200MacUltLin = (short)(1) ;
      n1200MacUltLin = false ;
      AV18Linea = (short)(1) ;
      /* Using cursor P007U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P007U3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P007U3_A396EmprCod[0] ;
            A1199MacCod = P007U3_A1199MacCod[0] ;
            A1200MacUltLin = P007U3_A1200MacUltLin[0] ;
            n1200MacUltLin = P007U3_n1200MacUltLin[0] ;
            A1200MacUltLin = (short)(A1200MacUltLin+1) ;
            n1200MacUltLin = false ;
            AV18Linea = A1200MacUltLin ;
            /* Using cursor P007U4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin), A396EmprCod, Integer.valueOf(A1199MacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLMACRO

      */
      A396EmprCod = AV15EmprCod ;
      A1199MacCod = AV17MacCod ;
      A1201MacLin = AV18Linea ;
      A1202MacDisCod = AV16DisCod ;
      /* Using cursor P007U5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin), Integer.valueOf(A1202MacDisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
      if ( (pr_default.getStatus(3) == 1) )
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
      AV24Inc_obs = httpContext.getMessage( "Creaccion Accesorios, Nº ", "") + GXutil.str( AV17MacCod, 8, 0) + GXutil.newLine( ) ;
      AV24Inc_obs += httpContext.getMessage( "N Disp Interna ", "") + GXutil.str( AV16DisCod, 8, 0) + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV15EmprCod, AV28Pgmname, AV21UsurCod, AV22Station, AV24Inc_obs, AV16DisCod, (byte)(0), "") ;
      if ( AV20Tinamar == 1 )
      {
         n4476DisAcaFor = false ;
         /* Optimized UPDATE. */
         /* Using cursor P007U6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n4476DisAcaFor), Integer.valueOf(AV17MacCod), Integer.valueOf(AV16DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* End optimized UPDATE. */
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenmac");
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
      GXv_int2 = new byte[1] ;
      AV22Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV21UsurCod = "" ;
      GXv_char6 = new String[1] ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P007U3_A396EmprCod = new String[] {""} ;
      P007U3_A1199MacCod = new int[1] ;
      P007U3_A1200MacUltLin = new short[1] ;
      P007U3_n1200MacUltLin = new boolean[] {false} ;
      AV24Inc_obs = "" ;
      AV28Pgmname = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pgenmac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pgenmac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pgenmac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenmac__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P007U3_A396EmprCod, P007U3_A1199MacCod, P007U3_A1200MacUltLin, P007U3_n1200MacUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV28Pgmname = "PGENMAC" ;
      /* GeneXus formulas. */
      AV28Pgmname = "PGENMAC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20Tinamar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV18Linea ;
   private short A1200MacUltLin ;
   private short Gx_err ;
   private short A1201MacLin ;
   private int AV16DisCod ;
   private int AV17MacCod ;
   private int GX_INS167 ;
   private int A1199MacCod ;
   private int GX_INS168 ;
   private int A1202MacDisCod ;
   private int A4476DisAcaFor ;
   private String AV15EmprCod ;
   private String AV22Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV23EmprNom ;
   private String GXv_char5[] ;
   private String AV21UsurCod ;
   private String GXv_char6[] ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String AV28Pgmname ;
   private boolean n1200MacUltLin ;
   private boolean n4476DisAcaFor ;
   private String AV24Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P007U3_A396EmprCod ;
   private int[] P007U3_A1199MacCod ;
   private short[] P007U3_A1200MacUltLin ;
   private boolean[] P007U3_n1200MacUltLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pgenmac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pgenmac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pgenmac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pgenmac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P007U2", "INSERT INTO TXPCMACRO(EmprCod, MacCod, MacUltLin) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
         ,new ForEachCursor("P007U3", "SELECT EmprCod, MacCod, MacUltLin FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P007U4", "UPDATE TXPCMACRO SET MacUltLin=?  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
         ,new UpdateCursor("P007U5", "INSERT INTO TXPLMACRO(EmprCod, MacCod, MacLin, MacDisCod, MacBarCod, MacBarReo, MacBarPar, MacKgs, MacMts) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new UpdateCursor("P007U6", "UPDATE TXPDISPOS SET DisAcaFor=?  WHERE DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
      }
   }

}

