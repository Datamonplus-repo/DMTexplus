package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocadenaparahashdocumentotransportecomercial extends GXProcedure
{
   public obtengocadenaparahashdocumentotransportecomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocadenaparahashdocumentotransportecomercial.class ), "" );
   }

   public obtengocadenaparahashdocumentotransportecomercial( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String[] aP4 )
   {
      obtengocadenaparahashdocumentotransportecomercial.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      obtengocadenaparahashdocumentotransportecomercial.this.AV36EmprCod = aP0;
      obtengocadenaparahashdocumentotransportecomercial.this.AV18Faccod = aP1;
      obtengocadenaparahashdocumentotransportecomercial.this.AV17Facfch = aP2;
      obtengocadenaparahashdocumentotransportecomercial.this.AV33AlbProSys = aP3;
      obtengocadenaparahashdocumentotransportecomercial.this.aP4 = aP4;
      obtengocadenaparahashdocumentotransportecomercial.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      obtengocadenaparahashdocumentotransportecomercial.this.GXt_int1 = GXv_int2[0] ;
      AV14Firmad = GXt_int1 ;
      GXt_char3 = AV15ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      obtengocadenaparahashdocumentotransportecomercial.this.GXt_char3 = GXv_char4[0] ;
      AV15ddmmaaaa = GXt_char3 ;
      if ( ( AV14Firmad == 0 ) && ( AV16Nocont == 1 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV15ddmmaaaa, " ") == 0 )
      {
         AV15ddmmaaaa = "02/04/12" ;
      }
      AV17Facfch = localUtil.ctod( AV15ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV30Firma = "" ;
      /* Using cursor P0AHT2 */
      pr_default.execute(0, new Object[] {AV36EmprCod, Integer.valueOf(AV18Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AHT2_A396EmprCod[0] ;
         A14AlbComCod = P0AHT2_A14AlbComCod[0] ;
         A22AlbComPri = P0AHT2_A22AlbComPri[0] ;
         A17AlbComFch = P0AHT2_A17AlbComFch[0] ;
         A10013AlbComFs = P0AHT2_A10013AlbComFs[0] ;
         A14249AlbComSerA = P0AHT2_A14249AlbComSerA[0] ;
         A14250AlbComTipA = P0AHT2_A14250AlbComTipA[0] ;
         AV34AlbProPri = A22AlbComPri ;
         AV19Factot = DecimalUtil.doubleToDec(0) ;
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( A17AlbComFch), 10, 0)) ;
         if ( GXutil.month( A17AlbComFch) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A17AlbComFch), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( A17AlbComFch), 10, 0)) ;
         }
         if ( GXutil.day( A17AlbComFch) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A17AlbComFch), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( A17AlbComFch), 10, 0)) ;
         }
         AV25Texto = AV24Dateaux ;
         AV21VarAUx = localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV22Hhsys = GXutil.substring( AV21VarAUx, 12, 8) ;
         AV23Fecsys = localUtil.ctod( GXutil.substring( AV21VarAUx, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( AV23Fecsys), 10, 0)) ;
         if ( GXutil.month( AV23Fecsys) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV23Fecsys), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV23Fecsys), 10, 0)) ;
         }
         if ( GXutil.day( AV23Fecsys) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV23Fecsys), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV23Fecsys), 10, 0)) ;
         }
         AV25Texto += ";" + AV24Dateaux + httpContext.getMessage( "T", "") + AV22Hhsys ;
         AV25Texto += ";" + GXutil.trim( A14250AlbComTipA) + " " + GXutil.trim( A14249AlbComSerA) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 10, 0)) ;
         AV25Texto += ";" + GXutil.trim( GXutil.str( AV19Factot, 13, 2)) + ";" ;
         /* Execute user subroutine: 'FIRMAANTERIOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV25Texto = GXutil.trim( AV25Texto) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV30Firma = GXutil.trim( AV30Firma) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      /* Using cursor P0AHT3 */
      pr_default.execute(1, new Object[] {AV36EmprCod, AV17Facfch, AV34AlbProPri});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0AHT3_A396EmprCod[0] ;
         A22AlbComPri = P0AHT3_A22AlbComPri[0] ;
         A17AlbComFch = P0AHT3_A17AlbComFch[0] ;
         A10014AlbComFd = P0AHT3_A10014AlbComFd[0] ;
         A14AlbComCod = P0AHT3_A14AlbComCod[0] ;
         if ( A14AlbComCod != AV18Faccod )
         {
            AV27Facfirma = A10014AlbComFd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV27Facfirma)==0) )
            {
               AV25Texto += GXutil.trim( AV27Facfirma) ;
               AV28Firmalast = AV27Facfirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP4[0] = obtengocadenaparahashdocumentotransportecomercial.this.AV25Texto;
      this.aP5[0] = obtengocadenaparahashdocumentotransportecomercial.this.AV30Firma;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Texto = "" ;
      AV30Firma = "" ;
      GXv_int2 = new byte[1] ;
      AV15ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P0AHT2_A396EmprCod = new String[] {""} ;
      P0AHT2_A14AlbComCod = new int[1] ;
      P0AHT2_A22AlbComPri = new String[] {""} ;
      P0AHT2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHT2_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHT2_A14249AlbComSerA = new String[] {""} ;
      P0AHT2_A14250AlbComTipA = new String[] {""} ;
      A396EmprCod = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      AV34AlbProPri = "" ;
      AV19Factot = DecimalUtil.ZERO ;
      AV24Dateaux = "" ;
      AV21VarAUx = "" ;
      AV22Hhsys = "" ;
      AV23Fecsys = GXutil.nullDate() ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      P0AHT3_A396EmprCod = new String[] {""} ;
      P0AHT3_A22AlbComPri = new String[] {""} ;
      P0AHT3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHT3_A10014AlbComFd = new String[] {""} ;
      P0AHT3_A14AlbComCod = new int[1] ;
      A10014AlbComFd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.obtengocadenaparahashdocumentotransportecomercial__default(),
         new Object[] {
             new Object[] {
            P0AHT2_A396EmprCod, P0AHT2_A14AlbComCod, P0AHT2_A22AlbComPri, P0AHT2_A17AlbComFch, P0AHT2_A10013AlbComFs, P0AHT2_A14249AlbComSerA, P0AHT2_A14250AlbComTipA
            }
            , new Object[] {
            P0AHT3_A396EmprCod, P0AHT3_A22AlbComPri, P0AHT3_A17AlbComFch, P0AHT3_A10014AlbComFd, P0AHT3_A14AlbComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Firmad ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV16Nocont ;
   private short Gx_err ;
   private int AV18Faccod ;
   private int A14AlbComCod ;
   private java.math.BigDecimal AV19Factot ;
   private String AV36EmprCod ;
   private String AV25Texto ;
   private String AV30Firma ;
   private String AV15ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A22AlbComPri ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String AV34AlbProPri ;
   private String AV24Dateaux ;
   private String AV21VarAUx ;
   private String AV22Hhsys ;
   private String AV27Facfirma ;
   private String AV28Firmalast ;
   private String A10014AlbComFd ;
   private java.util.Date AV33AlbProSys ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV17Facfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV23Fecsys ;
   private boolean returnInSub ;
   private String[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHT2_A396EmprCod ;
   private int[] P0AHT2_A14AlbComCod ;
   private String[] P0AHT2_A22AlbComPri ;
   private java.util.Date[] P0AHT2_A17AlbComFch ;
   private java.util.Date[] P0AHT2_A10013AlbComFs ;
   private String[] P0AHT2_A14249AlbComSerA ;
   private String[] P0AHT2_A14250AlbComTipA ;
   private String[] P0AHT3_A396EmprCod ;
   private String[] P0AHT3_A22AlbComPri ;
   private java.util.Date[] P0AHT3_A17AlbComFch ;
   private String[] P0AHT3_A10014AlbComFd ;
   private int[] P0AHT3_A14AlbComCod ;
}

final  class obtengocadenaparahashdocumentotransportecomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHT2", "SELECT EmprCod, AlbComCod, AlbComPri, AlbComFch, AlbComFs, AlbComSerA, AlbComTipA FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AHT3", "SELECT EmprCod, AlbComPri, AlbComFch, AlbComFd, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ?) AND (AlbComFch >= ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

