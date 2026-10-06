package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn06controlactualizar extends GXProcedure
{
   public ttrn06controlactualizar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06controlactualizar.class ), "" );
   }

   public ttrn06controlactualizar( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String aP2 ,
                        boolean aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             boolean aP3 )
   {
      ttrn06controlactualizar.this.AV16NombreDinamica = aP0;
      ttrn06controlactualizar.this.AV9AlbProCod = aP1;
      ttrn06controlactualizar.this.AV18SdtParametroCallsJson = aP2;
      ttrn06controlactualizar.this.AV24Finalizar = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV14Inc_Terminal ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn06controlactualizar.this.GXt_char1 = GXv_char2[0] ;
      AV14Inc_Terminal = GXt_char1 ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Inc_Terminal, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn06controlactualizar.this.AV11EmprCod = GXv_char2[0] ;
      ttrn06controlactualizar.this.AV22EmprNom = GXv_char3[0] ;
      ttrn06controlactualizar.this.AV23UsurCod = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV11EmprCod)==0) )
      {
         AV8Inc_Maqcod = "@TRN06" ;
         AV19Inc_Prog = GXutil.trim( GXutil.str( AV9AlbProCod, 10, 0)) ;
         AV13Inc_Obs = GXutil.trim( AV16NombreDinamica) + "|" + GXutil.trim( AV18SdtParametroCallsJson) ;
         AV28GXLvl7 = (byte)(0) ;
         /* Using cursor P08P52 */
         pr_default.execute(0, new Object[] {AV11EmprCod, AV8Inc_Maqcod, AV19Inc_Prog});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4935Inc_Prog = P08P52_A4935Inc_Prog[0] ;
            A7499Inc_Maqcod = P08P52_A7499Inc_Maqcod[0] ;
            A396EmprCod = P08P52_A396EmprCod[0] ;
            A8012Inc_St = P08P52_A8012Inc_St[0] ;
            A4936Inc_Obs = P08P52_A4936Inc_Obs[0] ;
            A4932Inc_Hora = P08P52_A4932Inc_Hora[0] ;
            A4934Inc_Termin = P08P52_A4934Inc_Termin[0] ;
            A4929Inc_Dia = P08P52_A4929Inc_Dia[0] ;
            A4931Inc_Linea = P08P52_A4931Inc_Linea[0] ;
            AV28GXLvl7 = (byte)(1) ;
            if ( A8012Inc_St == 0 )
            {
               if ( ! ( GXutil.strcmp(GXutil.trim( A4936Inc_Obs), GXutil.trim( AV13Inc_Obs)) == 0 ) )
               {
                  A4936Inc_Obs = GXutil.trim( AV13Inc_Obs) ;
                  A4932Inc_Hora = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
                  A4934Inc_Termin = AV14Inc_Terminal ;
               }
               if ( AV24Finalizar )
               {
                  A8012Inc_St = (byte)(1) ;
               }
            }
            /* Using cursor P08P53 */
            pr_default.execute(1, new Object[] {Byte.valueOf(A8012Inc_St), A4936Inc_Obs, A4932Inc_Hora, A4934Inc_Termin, A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV28GXLvl7 == 0 )
         {
            if ( ! AV24Finalizar )
            {
               AV20Inc_Dia = GXutil.serverDate( context, remoteHandle, pr_default) ;
               AV25Inc_Linea = 0 ;
               AV29GXLvl25 = (byte)(0) ;
               /* Using cursor P08P54 */
               pr_default.execute(2, new Object[] {AV11EmprCod, AV20Inc_Dia});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A4929Inc_Dia = P08P54_A4929Inc_Dia[0] ;
                  A396EmprCod = P08P54_A396EmprCod[0] ;
                  AV29GXLvl25 = (byte)(1) ;
                  /* Using cursor P08P55 */
                  pr_default.execute(3, new Object[] {A396EmprCod, A4929Inc_Dia});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A4931Inc_Linea = P08P55_A4931Inc_Linea[0] ;
                     if ( AV25Inc_Linea < A4931Inc_Linea )
                     {
                        AV25Inc_Linea = A4931Inc_Linea ;
                     }
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
               if ( AV29GXLvl25 == 0 )
               {
                  /*
                     INSERT RECORD ON TABLE TXPCRTINC

                  */
                  A396EmprCod = AV11EmprCod ;
                  A4929Inc_Dia = AV20Inc_Dia ;
                  A4930Inc_Num_ul = 1 ;
                  n4930Inc_Num_ul = false ;
                  /* Using cursor P08P56 */
                  pr_default.execute(4, new Object[] {A396EmprCod, A4929Inc_Dia, Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
                  if ( (pr_default.getStatus(4) == 1) )
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
               AV25Inc_Linea = (long)(AV25Inc_Linea+1) ;
               /*
                  INSERT RECORD ON TABLE TXPCRTIN1

               */
               A396EmprCod = AV11EmprCod ;
               A4929Inc_Dia = AV20Inc_Dia ;
               A4931Inc_Linea = AV25Inc_Linea ;
               A4932Inc_Hora = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
               A4933Inc_Usuari = AV23UsurCod ;
               A4934Inc_Termin = AV14Inc_Terminal ;
               A4935Inc_Prog = GXutil.trim( GXutil.str( AV9AlbProCod, 10, 0)) ;
               A4936Inc_Obs = AV16NombreDinamica + "|" + AV18SdtParametroCallsJson ;
               A5299Inc_Barcod = 0 ;
               A5300Inc_BarReo = (byte)(0) ;
               A5301Inc_BarPar = "" ;
               A7499Inc_Maqcod = AV8Inc_Maqcod ;
               A8012Inc_St = (byte)(0) ;
               /* Using cursor P08P57 */
               pr_default.execute(5, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar, A7499Inc_Maqcod, Byte.valueOf(A8012Inc_St)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
               if ( (pr_default.getStatus(5) == 1) )
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
               /* Using cursor P08P58 */
               pr_default.execute(6, new Object[] {Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(AV25Inc_Linea), AV11EmprCod, AV20Inc_Dia, Long.valueOf(AV25Inc_Linea)});
               if ( (pr_default.getStatus(6) != 101) )
               {
                  AV28GXLvl7 = (byte)(1) ;
               }
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
               /* End optimized UPDATE. */
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "ttrn06controlactualizar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Inc_Terminal = "" ;
      GXt_char1 = "" ;
      AV11EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV23UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV8Inc_Maqcod = "" ;
      AV19Inc_Prog = "" ;
      AV13Inc_Obs = "" ;
      scmdbuf = "" ;
      P08P52_A4935Inc_Prog = new String[] {""} ;
      P08P52_A7499Inc_Maqcod = new String[] {""} ;
      P08P52_A396EmprCod = new String[] {""} ;
      P08P52_A8012Inc_St = new byte[1] ;
      P08P52_A4936Inc_Obs = new String[] {""} ;
      P08P52_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P08P52_A4934Inc_Termin = new String[] {""} ;
      P08P52_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08P52_A4931Inc_Linea = new long[1] ;
      A4935Inc_Prog = "" ;
      A7499Inc_Maqcod = "" ;
      A396EmprCod = "" ;
      A4936Inc_Obs = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4934Inc_Termin = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      AV20Inc_Dia = GXutil.nullDate() ;
      P08P54_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08P54_A396EmprCod = new String[] {""} ;
      P08P55_A396EmprCod = new String[] {""} ;
      P08P55_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08P55_A4931Inc_Linea = new long[1] ;
      Gx_emsg = "" ;
      A4933Inc_Usuari = "" ;
      A5301Inc_BarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06controlactualizar__default(),
         new Object[] {
             new Object[] {
            P08P52_A4935Inc_Prog, P08P52_A7499Inc_Maqcod, P08P52_A396EmprCod, P08P52_A8012Inc_St, P08P52_A4936Inc_Obs, P08P52_A4932Inc_Hora, P08P52_A4934Inc_Termin, P08P52_A4929Inc_Dia, P08P52_A4931Inc_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            P08P54_A4929Inc_Dia, P08P54_A396EmprCod
            }
            , new Object[] {
            P08P55_A396EmprCod, P08P55_A4929Inc_Dia, P08P55_A4931Inc_Linea
            }
            , new Object[] {
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

   private byte AV28GXLvl7 ;
   private byte A8012Inc_St ;
   private byte AV29GXLvl25 ;
   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int GX_INS725 ;
   private int GX_INS726 ;
   private int A5299Inc_Barcod ;
   private long AV9AlbProCod ;
   private long A4931Inc_Linea ;
   private long AV25Inc_Linea ;
   private long A4930Inc_Num_ul ;
   private String AV14Inc_Terminal ;
   private String GXt_char1 ;
   private String AV11EmprCod ;
   private String GXv_char2[] ;
   private String AV22EmprNom ;
   private String GXv_char3[] ;
   private String AV23UsurCod ;
   private String GXv_char4[] ;
   private String AV8Inc_Maqcod ;
   private String AV19Inc_Prog ;
   private String scmdbuf ;
   private String A4935Inc_Prog ;
   private String A7499Inc_Maqcod ;
   private String A396EmprCod ;
   private String A4934Inc_Termin ;
   private String Gx_emsg ;
   private String A4933Inc_Usuari ;
   private String A5301Inc_BarPar ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV20Inc_Dia ;
   private boolean AV24Finalizar ;
   private boolean n4930Inc_Num_ul ;
   private String AV16NombreDinamica ;
   private String AV18SdtParametroCallsJson ;
   private String AV13Inc_Obs ;
   private String A4936Inc_Obs ;
   private IDataStoreProvider pr_default ;
   private String[] P08P52_A4935Inc_Prog ;
   private String[] P08P52_A7499Inc_Maqcod ;
   private String[] P08P52_A396EmprCod ;
   private byte[] P08P52_A8012Inc_St ;
   private String[] P08P52_A4936Inc_Obs ;
   private java.util.Date[] P08P52_A4932Inc_Hora ;
   private String[] P08P52_A4934Inc_Termin ;
   private java.util.Date[] P08P52_A4929Inc_Dia ;
   private long[] P08P52_A4931Inc_Linea ;
   private java.util.Date[] P08P54_A4929Inc_Dia ;
   private String[] P08P54_A396EmprCod ;
   private String[] P08P55_A396EmprCod ;
   private java.util.Date[] P08P55_A4929Inc_Dia ;
   private long[] P08P55_A4931Inc_Linea ;
}

final  class ttrn06controlactualizar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08P52", "SELECT Inc_Prog, Inc_Maqcod, EmprCod, Inc_St, Inc_Obs, Inc_Hora, Inc_Termin, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE (EmprCod = ?) AND (Inc_Maqcod = ?) AND (Inc_Prog = ?) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P08P53", "UPDATE TXPCRTIN1 SET Inc_St=?, Inc_Obs=?, Inc_Hora=?, Inc_Termin=?  WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
         ,new ForEachCursor("P08P54", "SELECT Inc_Dia, EmprCod FROM TXPCRTINC WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08P55", "SELECT EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P08P56", "INSERT INTO TXPCRTINC(EmprCod, Inc_Dia, Inc_Num_ul) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
         ,new UpdateCursor("P08P57", "INSERT INTO TXPCRTIN1(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
         ,new UpdateCursor("P08P58", "UPDATE TXPCRTINC SET Inc_Num_ul=?  WHERE (EmprCod = ? and Inc_Dia = ?) AND (Not Inc_Num_ul = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setVarchar(2, (String)parms[1], 400, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], true);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
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
               stmt.setLong(4, ((Number) parms[4]).longValue());
               return;
      }
   }

}

