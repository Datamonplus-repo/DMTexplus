package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webplicrnd extends GXProcedure
{
   public webplicrnd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webplicrnd.class ), "" );
   }

   public webplicrnd( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 )
   {
      webplicrnd.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      webplicrnd.this.AV21RlrPgm = aP0[0];
      this.aP0 = aP0;
      webplicrnd.this.AV8Error = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20UsurCod = "" ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webplicrnd.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      webplicrnd.this.AV18EmprCod = GXv_char2[0] ;
      webplicrnd.this.AV19EmprNom = GXv_char3[0] ;
      webplicrnd.this.AV20UsurCod = GXv_char4[0] ;
      GXt_int5 = AV24NewLicRnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, "LICRDN", GXv_int6) ;
      webplicrnd.this.GXt_int5 = GXv_int6[0] ;
      AV24NewLicRnd = GXt_int5 ;
      if ( (0==AV24NewLicRnd) )
      {
         GXv_char4[0] = AV21RlrPgm ;
         GXv_int6[0] = AV8Error ;
         new app.pnewlicrnd(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
         webplicrnd.this.AV21RlrPgm = GXv_char4[0] ;
         webplicrnd.this.AV8Error = GXv_int6[0] ;
      }
      else
      {
         AV16LicPrdId = httpContext.getMessage( "EN01", "") ;
         AV34GXLvl17 = (byte)(0) ;
         /* Using cursor P08V12 */
         pr_default.execute(0, new Object[] {AV16LicPrdId});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4103LicPrdId = P08V12_A4103LicPrdId[0] ;
            A4104LicPrdDat = P08V12_A4104LicPrdDat[0] ;
            AV34GXLvl17 = (byte)(1) ;
            AV25LicPrdDat = A4104LicPrdDat ;
            AV8Error = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV34GXLvl17 == 0 )
         {
            AV8Error = (byte)(1) ;
         }
         if ( (0==AV8Error) )
         {
            GXt_char1 = AV22Station ;
            GXv_char4[0] = GXt_char1 ;
            new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
            webplicrnd.this.GXt_char1 = GXv_char4[0] ;
            AV22Station = GXt_char1 ;
            GXv_char4[0] = AV18EmprCod ;
            GXv_char3[0] = AV19EmprNom ;
            GXv_char2[0] = AV20UsurCod ;
            new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
            webplicrnd.this.AV18EmprCod = GXv_char4[0] ;
            webplicrnd.this.AV19EmprNom = GXv_char3[0] ;
            webplicrnd.this.AV20UsurCod = GXv_char2[0] ;
            GXv_char4[0] = AV25LicPrdDat ;
            new app.plic2par(remoteHandle, context).execute( AV14LicPar, GXv_char4) ;
            webplicrnd.this.AV25LicPrdDat = GXv_char4[0] ;
            AV9fecha = GXutil.serverDate( context, remoteHandle, pr_default) ;
            AV26RlrFchA = localUtil.ctod( AV14LicPar[2-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.GX_msglist.addItem(AV14LicPar[2-1]);
            AV26RlrFchA = localUtil.ymdtod( 2021, 3, 1) ;
            AV27RlrFchE = localUtil.ctod( AV14LicPar[3-1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV10fechaA = GXutil.resetTime( AV26RlrFchA );
            AV11fechaC = GXutil.resetTime( AV27RlrFchE );
            AV12dia = (byte)(GXutil.Int( GXutil.dtdiff( localUtil.ctot( localUtil.dtoc( AV9fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), AV10fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
            AV13diaDif = (short)(GXutil.Int( GXutil.dtdiff( AV11fechaC, AV10fechaA)/ (double) (60)/ (double) (60)/ (double) (24))) ;
            AV15rnd = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.random( )*AV13diaDif), 0))) ;
            if ( (( GXutil.resetTime(AV9fecha).after( GXutil.resetTime( AV26RlrFchA )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV9fecha), GXutil.resetTime(AV26RlrFchA)) )) && ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUS", "")) != 0 ) && ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUGRA", "")) != 0 ) )
            {
               if ( (( GXutil.resetTime(AV9fecha).after( GXutil.resetTime( AV27RlrFchE )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV9fecha), GXutil.resetTime(AV27RlrFchE)) )) )
               {
                  AV8Error = (byte)(1) ;
                  AV28RlrDia = (short)(-1) ;
                  AV29RlrDiaDif = (short)(-1) ;
                  AV30RlrRnd = (short)(-1) ;
                  /* Execute user subroutine: 'REALIZAR NEW EN RLICRN' */
                  S111 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               else
               {
                  if ( AV15rnd < AV12dia )
                  {
                     AV8Error = (byte)(1) ;
                     AV28RlrDia = AV12dia ;
                     AV29RlrDiaDif = AV13diaDif ;
                     AV30RlrRnd = (short)(AV15rnd) ;
                     /* Execute user subroutine: 'REALIZAR NEW EN RLICRN' */
                     S111 ();
                     if ( returnInSub )
                     {
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  else
                  {
                     AV8Error = (byte)(0) ;
                  }
               }
            }
            else if ( ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUS", "")) == 0 ) || ( GXutil.strcmp(AV21RlrPgm, httpContext.getMessage( "UMENUGRA", "")) == 0 ) )
            {
               /* Using cursor P08V13 */
               pr_default.execute(1, new Object[] {AV27RlrFchE});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A8714RlrFch = P08V13_A8714RlrFch[0] ;
                  A8717RlrFchE = P08V13_A8717RlrFchE[0] ;
                  n8717RlrFchE = P08V13_n8717RlrFchE[0] ;
                  A8715RlrUsu = P08V13_A8715RlrUsu[0] ;
                  if ( (( localUtil.ctot( localUtil.dtoc( A8717RlrFchE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( A8714RlrFch ) ) || ( GXutil.dateCompare(localUtil.ctot( localUtil.dtoc( A8717RlrFchE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), A8714RlrFch) )) )
                  {
                     AV8Error = (byte)(1) ;
                     AV28RlrDia = AV12dia ;
                     AV29RlrDiaDif = AV13diaDif ;
                     AV30RlrRnd = (short)(-2) ;
                     /* Execute user subroutine: 'REALIZAR NEW EN RLICRN' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(1);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               if ( (0==AV8Error) )
               {
                  /* Using cursor P08V14 */
                  pr_default.execute(2, new Object[] {AV9fecha, AV26RlrFchA});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A8717RlrFchE = P08V14_A8717RlrFchE[0] ;
                     n8717RlrFchE = P08V14_n8717RlrFchE[0] ;
                     A8714RlrFch = P08V14_A8714RlrFch[0] ;
                     A8716RlrFchA = P08V14_A8716RlrFchA[0] ;
                     n8716RlrFchA = P08V14_n8716RlrFchA[0] ;
                     A8715RlrUsu = P08V14_A8715RlrUsu[0] ;
                     if ( (( localUtil.ctot( localUtil.dtoc( A8716RlrFchA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( A8714RlrFch ) ) || ( GXutil.dateCompare(localUtil.ctot( localUtil.dtoc( A8716RlrFchA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), A8714RlrFch) )) )
                     {
                        if ( A8714RlrFch.before( localUtil.ctot( localUtil.dtoc( A8717RlrFchE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) )
                        {
                           AV8Error = (byte)(1) ;
                           AV28RlrDia = AV12dia ;
                           AV29RlrDiaDif = AV13diaDif ;
                           AV30RlrRnd = (short)(-3) ;
                           /* Execute user subroutine: 'REALIZAR NEW EN RLICRN' */
                           S111 ();
                           if ( returnInSub )
                           {
                              pr_default.close(2);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
               }
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'REALIZAR NEW EN RLICRN' Routine */
      returnInSub = false ;
      AV31RlrTrCod = AV22Station ;
      /*
         INSERT RECORD ON TABLE TXPRLICRN

      */
      A8714RlrFch = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A8715RlrUsu = AV20UsurCod ;
      A8716RlrFchA = AV26RlrFchA ;
      n8716RlrFchA = false ;
      A8717RlrFchE = AV27RlrFchE ;
      n8717RlrFchE = false ;
      A8718RlrPgm = AV21RlrPgm ;
      n8718RlrPgm = false ;
      A8719RlrTrCod = GXutil.substring( AV31RlrTrCod, 1, 10) ;
      n8719RlrTrCod = false ;
      A8720RlrDia = AV28RlrDia ;
      n8720RlrDia = false ;
      A8721RlrDiaDif = AV29RlrDiaDif ;
      n8721RlrDiaDif = false ;
      A8722RlrRnd = AV30RlrRnd ;
      n8722RlrRnd = false ;
      /* Using cursor P08V15 */
      pr_default.execute(3, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
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
   }

   protected void cleanup( )
   {
      this.aP0[0] = webplicrnd.this.AV21RlrPgm;
      this.aP1[0] = webplicrnd.this.AV8Error;
      Application.commitDataStores(context, remoteHandle, pr_default, "webplicrnd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20UsurCod = "" ;
      AV22Station = "" ;
      AV18EmprCod = "" ;
      AV19EmprNom = "" ;
      GXv_int6 = new byte[1] ;
      AV16LicPrdId = "" ;
      scmdbuf = "" ;
      P08V12_A4103LicPrdId = new String[] {""} ;
      P08V12_A4104LicPrdDat = new String[] {""} ;
      A4103LicPrdId = "" ;
      A4104LicPrdDat = "" ;
      AV25LicPrdDat = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV14LicPar = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV14LicPar[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char4 = new String[1] ;
      AV9fecha = GXutil.nullDate() ;
      AV26RlrFchA = GXutil.nullDate() ;
      AV27RlrFchE = GXutil.nullDate() ;
      AV10fechaA = GXutil.resetTime( GXutil.nullDate() );
      AV11fechaC = GXutil.resetTime( GXutil.nullDate() );
      P08V13_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08V13_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P08V13_n8717RlrFchE = new boolean[] {false} ;
      P08V13_A8715RlrUsu = new String[] {""} ;
      A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      A8717RlrFchE = GXutil.nullDate() ;
      A8715RlrUsu = "" ;
      P08V14_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P08V14_n8717RlrFchE = new boolean[] {false} ;
      P08V14_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08V14_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      P08V14_n8716RlrFchA = new boolean[] {false} ;
      P08V14_A8715RlrUsu = new String[] {""} ;
      A8716RlrFchA = GXutil.nullDate() ;
      AV31RlrTrCod = "" ;
      A8718RlrPgm = "" ;
      A8719RlrTrCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webplicrnd__default(),
         new Object[] {
             new Object[] {
            P08V12_A4103LicPrdId, P08V12_A4104LicPrdDat
            }
            , new Object[] {
            P08V13_A8714RlrFch, P08V13_A8717RlrFchE, P08V13_n8717RlrFchE, P08V13_A8715RlrUsu
            }
            , new Object[] {
            P08V14_A8717RlrFchE, P08V14_n8717RlrFchE, P08V14_A8714RlrFch, P08V14_A8716RlrFchA, P08V14_n8716RlrFchA, P08V14_A8715RlrUsu
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Error ;
   private byte AV24NewLicRnd ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV34GXLvl17 ;
   private byte AV12dia ;
   private short AV13diaDif ;
   private short AV28RlrDia ;
   private short AV29RlrDiaDif ;
   private short AV30RlrRnd ;
   private short A8720RlrDia ;
   private short A8721RlrDiaDif ;
   private short A8722RlrRnd ;
   private short Gx_err ;
   private int GX_INS1190 ;
   private int GX_I ;
   private long AV15rnd ;
   private String AV20UsurCod ;
   private String AV22Station ;
   private String AV18EmprCod ;
   private String AV19EmprNom ;
   private String AV16LicPrdId ;
   private String scmdbuf ;
   private String A4103LicPrdId ;
   private String A4104LicPrdDat ;
   private String AV25LicPrdDat ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV14LicPar[] ;
   private String GXv_char4[] ;
   private String A8715RlrUsu ;
   private String AV31RlrTrCod ;
   private String A8719RlrTrCod ;
   private String Gx_emsg ;
   private java.util.Date AV10fechaA ;
   private java.util.Date AV11fechaC ;
   private java.util.Date A8714RlrFch ;
   private java.util.Date AV9fecha ;
   private java.util.Date AV26RlrFchA ;
   private java.util.Date AV27RlrFchE ;
   private java.util.Date A8717RlrFchE ;
   private java.util.Date A8716RlrFchA ;
   private boolean returnInSub ;
   private boolean n8717RlrFchE ;
   private boolean n8716RlrFchA ;
   private boolean n8718RlrPgm ;
   private boolean n8719RlrTrCod ;
   private boolean n8720RlrDia ;
   private boolean n8721RlrDiaDif ;
   private boolean n8722RlrRnd ;
   private String AV21RlrPgm ;
   private String A8718RlrPgm ;
   private byte[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08V12_A4103LicPrdId ;
   private String[] P08V12_A4104LicPrdDat ;
   private java.util.Date[] P08V13_A8714RlrFch ;
   private java.util.Date[] P08V13_A8717RlrFchE ;
   private boolean[] P08V13_n8717RlrFchE ;
   private String[] P08V13_A8715RlrUsu ;
   private java.util.Date[] P08V14_A8717RlrFchE ;
   private boolean[] P08V14_n8717RlrFchE ;
   private java.util.Date[] P08V14_A8714RlrFch ;
   private java.util.Date[] P08V14_A8716RlrFchA ;
   private boolean[] P08V14_n8716RlrFchA ;
   private String[] P08V14_A8715RlrUsu ;
}

final  class webplicrnd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08V12", "SELECT LicPrdId, LicPrdDat FROM TXPLICPRD WHERE LicPrdId = ? ORDER BY LicPrdId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08V13", "SELECT RlrFch, RlrFchE, RlrUsu FROM TXPRLICRN WHERE RlrFchE = ? ORDER BY RlrFch, RlrUsu ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08V14", "SELECT RlrFchE, RlrFch, RlrFchA, RlrUsu FROM TXPRLICRN WHERE (RlrFchA > ?) AND (RlrFchA = ?) ORDER BY RlrFch, RlrUsu ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P08V15", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, Clave1, Clave2, RlrFchA1, RlrFchE1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
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
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 1 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 3 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               return;
      }
   }

}

