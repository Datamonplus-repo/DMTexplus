package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinscrtinc extends GXProcedure
{
   public pinscrtinc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinscrtinc.class ), "" );
   }

   public pinscrtinc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 )
   {
      pinscrtinc.this.AV8emprcod = aP0;
      pinscrtinc.this.AV9PgmnameIN = aP1;
      pinscrtinc.this.AV10Usurcod = aP2;
      pinscrtinc.this.AV11Station = aP3;
      pinscrtinc.this.AV12Inc_obs = aP4;
      pinscrtinc.this.AV13barcod = aP5;
      pinscrtinc.this.AV14Barcodreo = aP6;
      pinscrtinc.this.AV15Barcodpar = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Inc_dia = GXutil.today( ) ;
      AV17Inc_Num_ult = 1 ;
      /*
         INSERT RECORD ON TABLE TXPCRTINC

      */
      A396EmprCod = AV8emprcod ;
      A4929Inc_Dia = AV16Inc_dia ;
      A4930Inc_Num_ul = AV17Inc_Num_ult ;
      n4930Inc_Num_ul = false ;
      /* Using cursor P0A7D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4929Inc_Dia, Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P0A7D3 */
         pr_default.execute(1, new Object[] {AV8emprcod, AV16Inc_dia});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4929Inc_Dia = P0A7D3_A4929Inc_Dia[0] ;
            A396EmprCod = P0A7D3_A396EmprCod[0] ;
            A4930Inc_Num_ul = P0A7D3_A4930Inc_Num_ul[0] ;
            n4930Inc_Num_ul = P0A7D3_n4930Inc_Num_ul[0] ;
            AV17Inc_Num_ult = (long)(A4930Inc_Num_ul+1) ;
            A4930Inc_Num_ul = AV17Inc_Num_ult ;
            n4930Inc_Num_ul = false ;
            /* Using cursor P0A7D4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul), A396EmprCod, A4929Inc_Dia});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
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
         INSERT RECORD ON TABLE TXPCRTIN1

      */
      A396EmprCod = AV8emprcod ;
      A4929Inc_Dia = AV16Inc_dia ;
      A4931Inc_Linea = AV17Inc_Num_ult ;
      A4932Inc_Hora = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A4933Inc_Usuari = AV10Usurcod ;
      A4934Inc_Termin = AV11Station ;
      A4935Inc_Prog = GXutil.substring( AV9PgmnameIN, 1, 10) ;
      A4936Inc_Obs = AV12Inc_obs ;
      A5299Inc_Barcod = AV13barcod ;
      A5301Inc_BarPar = AV15Barcodpar ;
      A5300Inc_BarReo = AV14Barcodreo ;
      A7499Inc_Maqcod = "" ;
      A8012Inc_St = (byte)(0) ;
      /* Using cursor P0A7D5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar, A7499Inc_Maqcod, Byte.valueOf(A8012Inc_St)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pinscrtinc");
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
      AV16Inc_dia = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P0A7D3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P0A7D3_A396EmprCod = new String[] {""} ;
      P0A7D3_A4930Inc_Num_ul = new long[1] ;
      P0A7D3_n4930Inc_Num_ul = new boolean[] {false} ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A5301Inc_BarPar = "" ;
      A7499Inc_Maqcod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pinscrtinc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pinscrtinc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pinscrtinc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinscrtinc__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P0A7D3_A4929Inc_Dia, P0A7D3_A396EmprCod, P0A7D3_A4930Inc_Num_ul, P0A7D3_n4930Inc_Num_ul
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Barcodreo ;
   private byte A5300Inc_BarReo ;
   private byte A8012Inc_St ;
   private short Gx_err ;
   private int AV13barcod ;
   private int GX_INS725 ;
   private int GX_INS726 ;
   private int A5299Inc_Barcod ;
   private long AV17Inc_Num_ult ;
   private long A4930Inc_Num_ul ;
   private long A4931Inc_Linea ;
   private String AV8emprcod ;
   private String AV9PgmnameIN ;
   private String AV10Usurcod ;
   private String AV11Station ;
   private String AV15Barcodpar ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A5301Inc_BarPar ;
   private String A7499Inc_Maqcod ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV16Inc_dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean n4930Inc_Num_ul ;
   private String AV12Inc_obs ;
   private String A4936Inc_Obs ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0A7D3_A4929Inc_Dia ;
   private String[] P0A7D3_A396EmprCod ;
   private long[] P0A7D3_A4930Inc_Num_ul ;
   private boolean[] P0A7D3_n4930Inc_Num_ul ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pinscrtinc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pinscrtinc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pinscrtinc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pinscrtinc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A7D2", "INSERT INTO TXPCRTINC(EmprCod, Inc_Dia, Inc_Num_ul) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
         ,new ForEachCursor("P0A7D3", "SELECT Inc_Dia, EmprCod, Inc_Num_ul FROM TXPCRTINC WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A7D4", "UPDATE TXPCRTINC SET Inc_Num_ul=?  WHERE EmprCod = ? AND Inc_Dia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
         ,new UpdateCursor("P0A7D5", "INSERT INTO TXPCRTIN1(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[3]).longValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDateTime(4, (java.util.Date)parms[3], true);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setVarchar(8, (String)parms[7], 400, false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 6);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               return;
      }
   }

}

