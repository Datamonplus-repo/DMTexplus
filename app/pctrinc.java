package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrinc extends GXProcedure
{
   public pctrinc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrinc.class ), "" );
   }

   public pctrinc( int remoteHandle ,
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
      pctrinc.this.A396EmprCod = aP0;
      pctrinc.this.AV13Pgmname_i = aP1;
      pctrinc.this.AV8Usurcod = aP2;
      pctrinc.this.AV9Station = aP3;
      pctrinc.this.AV14Texto_i = aP4;
      pctrinc.this.AV15BarCod = aP5;
      pctrinc.this.AV16BarCodReo = aP6;
      pctrinc.this.AV17BarCodPar = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV13Pgmname_i, AV8Usurcod, AV9Station, AV14Texto_i, AV15BarCod, AV16BarCodReo, AV17BarCodPar) ;
      returnInSub = true;
      cleanup();
      if (true) return;
      GXt_int1 = AV18NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pctrinc.this.GXt_int1 = GXv_int2[0] ;
      AV18NCLec = GXt_int1 ;
      GXt_int1 = AV19Nocommit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCOMM", ""), GXv_int2) ;
      pctrinc.this.GXt_int1 = GXv_int2[0] ;
      AV19Nocommit = GXt_int1 ;
      AV10Inc_Ult = 0 ;
      AV12Dia_i = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /*
         INSERT RECORD ON TABLE TXPCRTINC

      */
      A4929Inc_Dia = AV12Dia_i ;
      A4930Inc_Num_ul = 0 ;
      n4930Inc_Num_ul = false ;
      /* Using cursor P01FP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4929Inc_Dia, Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P01FP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A4929Inc_Dia});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P01FP3_A396EmprCod[0] ;
            A4929Inc_Dia = P01FP3_A4929Inc_Dia[0] ;
            A4930Inc_Num_ul = P01FP3_A4930Inc_Num_ul[0] ;
            n4930Inc_Num_ul = P01FP3_n4930Inc_Num_ul[0] ;
            AV10Inc_Ult = A4930Inc_Num_ul ;
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
      AV20Inc_Obs = AV14Texto_i + GXutil.newLine( ) ;
      /*
         INSERT RECORD ON TABLE TXPCRTIN1

      */
      A4929Inc_Dia = AV12Dia_i ;
      A4931Inc_Linea = (long)(AV10Inc_Ult+1) ;
      A4932Inc_Hora = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A4933Inc_Usuari = AV8Usurcod ;
      A4934Inc_Termin = GXutil.substring( GXutil.trim( AV9Station), 1, 10) ;
      A4935Inc_Prog = GXutil.substring( AV13Pgmname_i, 1, 10) ;
      A4936Inc_Obs = AV20Inc_Obs ;
      A5299Inc_Barcod = AV15BarCod ;
      A5301Inc_BarPar = AV17BarCodPar ;
      A5300Inc_BarReo = AV16BarCodReo ;
      /* Using cursor P01FP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
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
      n4930Inc_Num_ul = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01FP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV12Dia_i});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      /* End optimized UPDATE. */
      if ( ( AV18NCLec == 0 ) && ( AV19Nocommit == 0 ) )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pctrinc");
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
      GXv_int2 = new byte[1] ;
      AV12Dia_i = GXutil.nullDate() ;
      A4929Inc_Dia = GXutil.nullDate() ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P01FP3_A396EmprCod = new String[] {""} ;
      P01FP3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P01FP3_A4930Inc_Num_ul = new long[1] ;
      P01FP3_n4930Inc_Num_ul = new boolean[] {false} ;
      AV20Inc_Obs = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A5301Inc_BarPar = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pctrinc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pctrinc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pctrinc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrinc__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01FP3_A396EmprCod, P01FP3_A4929Inc_Dia, P01FP3_A4930Inc_Num_ul, P01FP3_n4930Inc_Num_ul
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

   private byte AV16BarCodReo ;
   private byte AV18NCLec ;
   private byte AV19Nocommit ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int GX_INS725 ;
   private int GX_INS726 ;
   private int A5299Inc_Barcod ;
   private long AV10Inc_Ult ;
   private long A4930Inc_Num_ul ;
   private long A4931Inc_Linea ;
   private String A396EmprCod ;
   private String AV13Pgmname_i ;
   private String AV8Usurcod ;
   private String AV9Station ;
   private String AV17BarCodPar ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A5301Inc_BarPar ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV12Dia_i ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean n4930Inc_Num_ul ;
   private String AV14Texto_i ;
   private String AV20Inc_Obs ;
   private String A4936Inc_Obs ;
   private IDataStoreProvider pr_default ;
   private String[] P01FP3_A396EmprCod ;
   private java.util.Date[] P01FP3_A4929Inc_Dia ;
   private long[] P01FP3_A4930Inc_Num_ul ;
   private boolean[] P01FP3_n4930Inc_Num_ul ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pctrinc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pctrinc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pctrinc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pctrinc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01FP2", "INSERT INTO TXPCRTINC(EmprCod, Inc_Dia, Inc_Num_ul) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
         ,new ForEachCursor("P01FP3", "SELECT EmprCod, Inc_Dia, Inc_Num_ul FROM TXPCRTINC WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01FP4", "INSERT INTO TXPCRTIN1(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
         ,new UpdateCursor("P01FP5", "UPDATE TXPCRTINC SET Inc_Num_ul=Inc_Num_ul + 1  WHERE EmprCod = ? and Inc_Dia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

