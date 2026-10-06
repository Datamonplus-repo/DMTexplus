package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class penshrl extends GXProcedure
{
   public penshrl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penshrl.class ), "" );
   }

   public penshrl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 ,
                          byte[] aP6 )
   {
      penshrl.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 )
   {
      penshrl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      penshrl.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      penshrl.this.A212BarSer = aP2[0];
      this.aP2 = aP2;
      penshrl.this.A135BarColNom = aP3[0];
      this.aP3 = aP3;
      penshrl.this.A136BarColNum = aP4[0];
      this.aP4 = aP4;
      penshrl.this.A218BarTipCol = aP5[0];
      this.aP5 = aP5;
      penshrl.this.AV8Situacion = aP6[0];
      this.aP6 = aP6;
      penshrl.this.AV21Lb_numero = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV9Msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG067_", ""), (byte)(99), GXv_char2) ;
      penshrl.this.GXt_char1 = GXv_char2[0] ;
      AV9Msg1 = GXutil.trim( GXt_char1) ;
      GXt_char1 = AV10Msg2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN239", ""), (byte)(99), GXv_char2) ;
      penshrl.this.GXt_char1 = GXv_char2[0] ;
      AV10Msg2 = GXutil.trim( GXt_char1) ;
      GXt_char1 = AV22Msg3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR127_", ""), (byte)(99), GXv_char2) ;
      penshrl.this.GXt_char1 = GXv_char2[0] ;
      GXt_char3 = AV22Msg3 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG067_", ""), (byte)(99), GXv_char4) ;
      penshrl.this.GXt_char3 = GXv_char4[0] ;
      AV22Msg3 = GXutil.trim( GXt_char1) + " " + GXutil.trim( GXt_char3) ;
      GXt_char3 = AV11Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      penshrl.this.GXt_char3 = GXv_char4[0] ;
      AV11Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char2[0] = AV12EmprNom ;
      GXv_char5[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char2, GXv_char5) ;
      penshrl.this.A396EmprCod = GXv_char4[0] ;
      penshrl.this.AV12EmprNom = GXv_char2[0] ;
      penshrl.this.AV13UsurCod = GXv_char5[0] ;
      GXt_int6 = AV23Hidro ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int7) ;
      penshrl.this.GXt_int6 = GXv_int7[0] ;
      AV23Hidro = GXt_int6 ;
      /* Using cursor P02BA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P02BA2_A213BarSit[0] ;
         A129BarCod = P02BA2_A129BarCod[0] ;
         A132BarCodReo = P02BA2_A132BarCodReo[0] ;
         A130BarCodPar = P02BA2_A130BarCodPar[0] ;
         A1923BarCodTN = P02BA2_A1923BarCodTN[0] ;
         AV18BarCod = A129BarCod ;
         AV19BarCodReo = A132BarCodReo ;
         AV20BarCodPar = A130BarCodPar ;
         if ( AV8Situacion == 3 )
         {
            if ( A213BarSit == 2 )
            {
               A213BarSit = AV8Situacion ;
               AV14Texto_i = AV9Msg1 + httpContext.getMessage( " Ensayo N.", "") + GXutil.str( AV21Lb_numero, 10, 0) + httpContext.getMessage( " Terminal ", "") + GXutil.trim( AV11Station) + httpContext.getMessage( " Usuario ", "") + GXutil.trim( AV13UsurCod) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Hora ", "") + Gx_time + GXutil.newLine( ) ;
               /* Execute user subroutine: 'INCIDENCIA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         else if ( AV8Situacion == 2 )
         {
            if ( A213BarSit == 3 )
            {
               A213BarSit = AV8Situacion ;
               A1923BarCodTN = 0 ;
               AV14Texto_i = AV22Msg3 + httpContext.getMessage( " Ensayo N.", "") + GXutil.str( AV21Lb_numero, 8, 0) + httpContext.getMessage( " Terminal ", "") + GXutil.trim( AV11Station) + httpContext.getMessage( " Usuario ", "") + GXutil.trim( AV13UsurCod) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Hora ", "") + Gx_time + GXutil.newLine( ) ;
               /* Execute user subroutine: 'INCIDENCIA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         else if ( AV8Situacion == 1 )
         {
            if ( ( A213BarSit == 3 ) || ( A213BarSit == 2 ) )
            {
               A213BarSit = AV8Situacion ;
               A1923BarCodTN = 1 ;
               AV14Texto_i = AV10Msg2 + httpContext.getMessage( " Ensayo N.", "") + GXutil.str( AV21Lb_numero, 8, 0) + httpContext.getMessage( " Terminal ", "") + GXutil.trim( AV11Station) + httpContext.getMessage( " Usuario ", "") + GXutil.trim( AV13UsurCod) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Hora ", "") + Gx_time + GXutil.newLine( ) ;
               /* Execute user subroutine: 'INCIDENCIA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         else
         {
         }
         /* Using cursor P02BA3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), Integer.valueOf(A1923BarCodTN), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'INCIDENCIA' Routine */
      returnInSub = false ;
      AV17Inc_Ult = 0 ;
      AV16Dia_i = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /*
         INSERT RECORD ON TABLE TXPCRTINC

      */
      A4929Inc_Dia = AV16Dia_i ;
      A4930Inc_Num_ul = 0 ;
      n4930Inc_Num_ul = false ;
      /* Using cursor P02BA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A4929Inc_Dia, Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P02BA5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A4929Inc_Dia});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P02BA5_A396EmprCod[0] ;
            A4929Inc_Dia = P02BA5_A4929Inc_Dia[0] ;
            A4930Inc_Num_ul = P02BA5_A4930Inc_Num_ul[0] ;
            n4930Inc_Num_ul = P02BA5_n4930Inc_Num_ul[0] ;
            AV17Inc_Ult = A4930Inc_Num_ul ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
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
      A4929Inc_Dia = AV16Dia_i ;
      A4931Inc_Linea = (long)(AV17Inc_Ult+1) ;
      A4932Inc_Hora = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A4933Inc_Usuari = AV13UsurCod ;
      A4934Inc_Termin = AV11Station ;
      A4935Inc_Prog = AV34Pgmname ;
      A4936Inc_Obs = AV14Texto_i + GXutil.newLine( ) ;
      A5299Inc_Barcod = AV18BarCod ;
      A5301Inc_BarPar = AV20BarCodPar ;
      A5300Inc_BarReo = AV19BarCodReo ;
      /* Using cursor P02BA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
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
      n4930Inc_Num_ul = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02BA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV16Dia_i});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = penshrl.this.A396EmprCod;
      this.aP1[0] = penshrl.this.A252CliCod;
      this.aP2[0] = penshrl.this.A212BarSer;
      this.aP3[0] = penshrl.this.A135BarColNom;
      this.aP4[0] = penshrl.this.A136BarColNum;
      this.aP5[0] = penshrl.this.A218BarTipCol;
      this.aP6[0] = penshrl.this.AV8Situacion;
      this.aP7[0] = penshrl.this.AV21Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.penshrl");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Msg1 = "" ;
      AV10Msg2 = "" ;
      AV22Msg3 = "" ;
      GXt_char1 = "" ;
      AV11Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV12EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV13UsurCod = "" ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new byte[1] ;
      scmdbuf = "" ;
      P02BA2_A396EmprCod = new String[] {""} ;
      P02BA2_A212BarSer = new String[] {""} ;
      P02BA2_A135BarColNom = new String[] {""} ;
      P02BA2_A136BarColNum = new int[1] ;
      P02BA2_A218BarTipCol = new byte[1] ;
      P02BA2_A252CliCod = new int[1] ;
      P02BA2_n252CliCod = new boolean[] {false} ;
      P02BA2_A213BarSit = new byte[1] ;
      P02BA2_A129BarCod = new int[1] ;
      P02BA2_A132BarCodReo = new byte[1] ;
      P02BA2_A130BarCodPar = new String[] {""} ;
      P02BA2_A1923BarCodTN = new int[1] ;
      A130BarCodPar = "" ;
      AV20BarCodPar = "" ;
      AV14Texto_i = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV16Dia_i = GXutil.nullDate() ;
      A4929Inc_Dia = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P02BA5_A396EmprCod = new String[] {""} ;
      P02BA5_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P02BA5_A4930Inc_Num_ul = new long[1] ;
      P02BA5_n4930Inc_Num_ul = new boolean[] {false} ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      AV34Pgmname = "" ;
      A4936Inc_Obs = "" ;
      A5301Inc_BarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.penshrl__default(),
         new Object[] {
             new Object[] {
            P02BA2_A396EmprCod, P02BA2_A212BarSer, P02BA2_A135BarColNom, P02BA2_A136BarColNum, P02BA2_A218BarTipCol, P02BA2_A252CliCod, P02BA2_n252CliCod, P02BA2_A213BarSit, P02BA2_A129BarCod, P02BA2_A132BarCodReo,
            P02BA2_A130BarCodPar, P02BA2_A1923BarCodTN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02BA5_A396EmprCod, P02BA5_A4929Inc_Dia, P02BA5_A4930Inc_Num_ul, P02BA5_n4930Inc_Num_ul
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "GestionLaboratorio.PENSHRL" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV34Pgmname = "GestionLaboratorio.PENSHRL" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A218BarTipCol ;
   private byte AV8Situacion ;
   private byte AV23Hidro ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV19BarCodReo ;
   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV21Lb_numero ;
   private int A129BarCod ;
   private int A1923BarCodTN ;
   private int AV18BarCod ;
   private int GX_INS725 ;
   private int GX_INS726 ;
   private int A5299Inc_Barcod ;
   private long AV17Inc_Ult ;
   private long A4930Inc_Num_ul ;
   private long A4931Inc_Linea ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV9Msg1 ;
   private String AV10Msg2 ;
   private String AV22Msg3 ;
   private String GXt_char1 ;
   private String AV11Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV12EmprNom ;
   private String GXv_char2[] ;
   private String AV13UsurCod ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV20BarCodPar ;
   private String Gx_time ;
   private String Gx_emsg ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String AV34Pgmname ;
   private String A5301Inc_BarPar ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date Gx_date ;
   private java.util.Date AV16Dia_i ;
   private java.util.Date A4929Inc_Dia ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n4930Inc_Num_ul ;
   private String AV14Texto_i ;
   private String A4936Inc_Obs ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BA2_A396EmprCod ;
   private String[] P02BA2_A212BarSer ;
   private String[] P02BA2_A135BarColNom ;
   private int[] P02BA2_A136BarColNum ;
   private byte[] P02BA2_A218BarTipCol ;
   private int[] P02BA2_A252CliCod ;
   private boolean[] P02BA2_n252CliCod ;
   private byte[] P02BA2_A213BarSit ;
   private int[] P02BA2_A129BarCod ;
   private byte[] P02BA2_A132BarCodReo ;
   private String[] P02BA2_A130BarCodPar ;
   private int[] P02BA2_A1923BarCodTN ;
   private String[] P02BA5_A396EmprCod ;
   private java.util.Date[] P02BA5_A4929Inc_Dia ;
   private long[] P02BA5_A4930Inc_Num_ul ;
   private boolean[] P02BA5_n4930Inc_Num_ul ;
}

final  class penshrl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BA2", "SELECT EmprCod, BarSer, BarColNom, BarColNum, BarTipCol, CliCod, BarSit, BarCod, BarCodReo, BarCodPar, BarCodTN FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarSer = ? and BarColNom = ? and BarColNum = ?) AND (BarTipCol = ?) AND (BarSit = 2 or BarSit = 3) ORDER BY EmprCod, CliCod, BarSer, BarColNom, BarColNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02BA3", "UPDATE TXPBARCAD SET BarSit=?, BarCodTN=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P02BA4", "INSERT INTO TXPCRTINC(EmprCod, Inc_Dia, Inc_Num_ul) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
         ,new ForEachCursor("P02BA5", "SELECT EmprCod, Inc_Dia, Inc_Num_ul FROM TXPCRTINC WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BA6", "INSERT INTO TXPCRTIN1(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
         ,new UpdateCursor("P02BA7", "UPDATE TXPCRTINC SET Inc_Num_ul=Inc_Num_ul + 1  WHERE EmprCod = ? and Inc_Dia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 3 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 4 :
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

