package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pborrec extends GXProcedure
{
   public pborrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pborrec.class ), "" );
   }

   public pborrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           java.util.Date[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           long[] aP4 ,
                           String[] aP5 )
   {
      pborrec.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      pborrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pborrec.this.AV15AlbhhFm = aP1[0];
      this.aP1 = aP1;
      pborrec.this.AV31AlbFmd = aP2[0];
      this.aP2 = aP2;
      pborrec.this.AV30AlbFmdc = aP3[0];
      this.aP3 = aP3;
      pborrec.this.AV27AlbProcod = aP4[0];
      this.aP4 = aP4;
      pborrec.this.AV26AlbPropri = aP5[0];
      this.aP5 = aP5;
      pborrec.this.AV35Tipo = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV21FirmaD ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      pborrec.this.GXt_int1 = GXv_int2[0] ;
      AV21FirmaD = GXt_int1 ;
      GXt_char3 = AV22ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pborrec.this.GXt_char3 = GXv_char4[0] ;
      AV22ddmmaaaa = GXt_char3 ;
      if ( GXutil.strcmp(AV22ddmmaaaa, " ") == 0 )
      {
         AV22ddmmaaaa = "02/04/12" ;
      }
      AV23FacFch = localUtil.ctod( AV22ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&ddmmaaaa =", "") + AV22ddmmaaaa + httpContext.getMessage( "&FacFch =", "") + localUtil.dtoc( AV23FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      System.out.println( Gx_msg );
      if ( AV21FirmaD == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15AlbhhFm = GXutil.resetTime( GXutil.nullDate() );
      AV16VarAux = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV17HhSys = GXutil.substring( AV16VarAux, 12, 8) ;
      AV18FecSys = localUtil.ctod( GXutil.substring( AV16VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV16VarAux = GXutil.str( GXutil.day( AV18FecSys), 2, 0) + "/" + GXutil.str( GXutil.month( AV18FecSys), 2, 0) + "/" + GXutil.str( GXutil.year( AV18FecSys), 4, 0) + " " + AV17HhSys ;
      AV20FecHhSys = localUtil.ctot( AV16VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV16VarAux = GXutil.str( GXutil.day( AV18FecSys), 2, 0) + "/" + GXutil.str( GXutil.month( AV18FecSys), 2, 0) + "/" + GXutil.str( GXutil.year( AV18FecSys), 4, 0) + " " + GXutil.substring( A7210FacObs, 23, 8) ;
      AV19FechCtrl = localUtil.ctot( AV16VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      if ( !( GXutil.dateCompare(AV19FechCtrl, AV20FecHhSys) ) )
      {
         Gx_msg = httpContext.getMessage( "Fecha Control=", "") + localUtil.ttoc( AV19FechCtrl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Fachor = ", "") + localUtil.ttoc( AV20FecHhSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.chr( (short)(13)) ;
         System.out.println( Gx_msg );
         AV15AlbhhFm = AV19FechCtrl ;
      }
      AV24DateAux = GXutil.trim( GXutil.str( GXutil.year( AV18FecSys), 10, 0)) ;
      if ( GXutil.month( AV18FecSys) < 10 )
      {
         AV24DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV18FecSys), 10, 0)) ;
      }
      else
      {
         AV24DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV18FecSys), 10, 0)) ;
      }
      if ( GXutil.day( AV18FecSys) < 10 )
      {
         AV24DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV18FecSys), 10, 0)) ;
      }
      else
      {
         AV24DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV18FecSys), 10, 0)) ;
      }
      AV25texto = AV24DateAux ;
      AV25texto += ";" + AV24DateAux + httpContext.getMessage( "T", "") + AV17HhSys ;
      if ( GXutil.strcmp(AV26AlbPropri, "1") == 0 )
      {
         AV28FacTipFac = (byte)(1) ;
         AV25texto += httpContext.getMessage( ";GR ", "") + GXutil.str( AV28FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( AV27AlbProcod, 10, 0)) ;
      }
      else
      {
         AV28FacTipFac = (byte)(2) ;
         AV25texto += httpContext.getMessage( ";GT ", "") + GXutil.str( AV28FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( AV27AlbProcod, 10, 0)) ;
      }
      AV29FacTot = DecimalUtil.doubleToDec(0) ;
      AV25texto += ";" + GXutil.trim( GXutil.str( AV29FacTot, 13, 2)) + ";" ;
      /* Execute user subroutine: 'FIRMAANTERIOR' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV30AlbFmdc = GXutil.trim( AV25texto) ;
      AV30AlbFmdc += httpContext.getMessage( "FirmaLast=", "") + GXutil.trim( AV34FirmaLast) ;
      System.out.println( AV25texto );
      AV16VarAux = GXutil.str( GXutil.day( AV18FecSys), 2, 0) + "/" + GXutil.str( GXutil.month( AV18FecSys), 2, 0) + "/" + GXutil.str( GXutil.year( AV18FecSys), 4, 0) + " " + AV17HhSys ;
      AV20FecHhSys = localUtil.ctot( AV16VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&FecHhSys =", "") + localUtil.ttoc( AV20FecHhSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      System.out.println( Gx_msg );
      AV15AlbhhFm = AV20FecHhSys ;
      AV31AlbFmd = " " ;
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV33FacFirma = "" ;
      AV34FirmaLast = "" ;
      if ( AV35Tipo == 1 )
      {
         /* Using cursor P005D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV23FacFch, AV26AlbPropri});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A39AlbProPri = P005D2_A39AlbProPri[0] ;
            A34AlbProfch = P005D2_A34AlbProfch[0] ;
            A10017AlbFmd = P005D2_A10017AlbFmd[0] ;
            n10017AlbFmd = P005D2_n10017AlbFmd[0] ;
            A30AlbProCod = P005D2_A30AlbProCod[0] ;
            if ( A30AlbProCod != AV27AlbProcod )
            {
               AV33FacFirma = A10017AlbFmd ;
            }
            else
            {
               if ( ! (GXutil.strcmp("", AV33FacFirma)==0) )
               {
                  AV25texto += GXutil.trim( AV33FacFirma) ;
                  AV34FirmaLast = AV33FacFirma ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P005D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV23FacFch, AV26AlbPropri});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A22AlbComPri = P005D3_A22AlbComPri[0] ;
            A17AlbComFch = P005D3_A17AlbComFch[0] ;
            A10014AlbComFd = P005D3_A10014AlbComFd[0] ;
            A14AlbComCod = P005D3_A14AlbComCod[0] ;
            if ( A14AlbComCod != AV27AlbProcod )
            {
               AV33FacFirma = A10014AlbComFd ;
            }
            else
            {
               if ( ! (GXutil.strcmp("", AV33FacFirma)==0) )
               {
                  AV25texto += GXutil.trim( AV33FacFirma) ;
                  AV34FirmaLast = AV33FacFirma ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pborrec.this.A396EmprCod;
      this.aP1[0] = pborrec.this.AV15AlbhhFm;
      this.aP2[0] = pborrec.this.AV31AlbFmd;
      this.aP3[0] = pborrec.this.AV30AlbFmdc;
      this.aP4[0] = pborrec.this.AV27AlbProcod;
      this.aP5[0] = pborrec.this.AV26AlbPropri;
      this.aP6[0] = pborrec.this.AV35Tipo;
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
      AV22ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV23FacFch = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV16VarAux = "" ;
      AV17HhSys = "" ;
      AV18FecSys = GXutil.nullDate() ;
      AV20FecHhSys = GXutil.resetTime( GXutil.nullDate() );
      A7210FacObs = "" ;
      AV19FechCtrl = GXutil.resetTime( GXutil.nullDate() );
      AV24DateAux = "" ;
      AV25texto = "" ;
      AV29FacTot = DecimalUtil.ZERO ;
      AV34FirmaLast = "" ;
      AV33FacFirma = "" ;
      scmdbuf = "" ;
      P005D2_A396EmprCod = new String[] {""} ;
      P005D2_A39AlbProPri = new String[] {""} ;
      P005D2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P005D2_A10017AlbFmd = new String[] {""} ;
      P005D2_n10017AlbFmd = new boolean[] {false} ;
      P005D2_A30AlbProCod = new long[1] ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A10017AlbFmd = "" ;
      P005D3_A396EmprCod = new String[] {""} ;
      P005D3_A22AlbComPri = new String[] {""} ;
      P005D3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P005D3_A10014AlbComFd = new String[] {""} ;
      P005D3_A14AlbComCod = new int[1] ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10014AlbComFd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pborrec__default(),
         new Object[] {
             new Object[] {
            P005D2_A396EmprCod, P005D2_A39AlbProPri, P005D2_A34AlbProfch, P005D2_A10017AlbFmd, P005D2_n10017AlbFmd, P005D2_A30AlbProCod
            }
            , new Object[] {
            P005D3_A396EmprCod, P005D3_A22AlbComPri, P005D3_A17AlbComFch, P005D3_A10014AlbComFd, P005D3_A14AlbComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35Tipo ;
   private byte AV21FirmaD ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV28FacTipFac ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private long AV27AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV29FacTot ;
   private String A396EmprCod ;
   private String AV30AlbFmdc ;
   private String AV26AlbPropri ;
   private String AV22ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String AV16VarAux ;
   private String AV17HhSys ;
   private String AV24DateAux ;
   private String AV25texto ;
   private String AV34FirmaLast ;
   private String AV33FacFirma ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A22AlbComPri ;
   private String A10014AlbComFd ;
   private java.util.Date AV15AlbhhFm ;
   private java.util.Date AV20FecHhSys ;
   private java.util.Date AV19FechCtrl ;
   private java.util.Date AV23FacFch ;
   private java.util.Date AV18FecSys ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean n10017AlbFmd ;
   private String A7210FacObs ;
   private String AV31AlbFmd ;
   private String A10017AlbFmd ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private long[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P005D2_A396EmprCod ;
   private String[] P005D2_A39AlbProPri ;
   private java.util.Date[] P005D2_A34AlbProfch ;
   private String[] P005D2_A10017AlbFmd ;
   private boolean[] P005D2_n10017AlbFmd ;
   private long[] P005D2_A30AlbProCod ;
   private String[] P005D3_A396EmprCod ;
   private String[] P005D3_A22AlbComPri ;
   private java.util.Date[] P005D3_A17AlbComFch ;
   private String[] P005D3_A10014AlbComFd ;
   private int[] P005D3_A14AlbComCod ;
}

final  class pborrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005D2", "SELECT EmprCod, AlbProPri, AlbProfch, AlbFmd, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProfch >= ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P005D3", "SELECT EmprCod, AlbComPri, AlbComFch, AlbComFd, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ?) AND (AlbComFch >= ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

