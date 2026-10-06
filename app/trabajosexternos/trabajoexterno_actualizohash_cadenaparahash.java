package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_actualizohash_cadenaparahash extends GXProcedure
{
   public trabajoexterno_actualizohash_cadenaparahash( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_actualizohash_cadenaparahash.class ), "" );
   }

   public trabajoexterno_actualizohash_cadenaparahash( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 )
   {
      trabajoexterno_actualizohash_cadenaparahash.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      trabajoexterno_actualizohash_cadenaparahash.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      trabajoexterno_actualizohash_cadenaparahash.this.AV18Faccod = aP1[0];
      this.aP1 = aP1;
      trabajoexterno_actualizohash_cadenaparahash.this.AV17Facfch = aP2[0];
      this.aP2 = aP2;
      trabajoexterno_actualizohash_cadenaparahash.this.AV33AlbProSys = aP3[0];
      this.aP3 = aP3;
      trabajoexterno_actualizohash_cadenaparahash.this.aP4 = aP4;
      trabajoexterno_actualizohash_cadenaparahash.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      trabajoexterno_actualizohash_cadenaparahash.this.GXt_int1 = GXv_int2[0] ;
      AV14Firmad = GXt_int1 ;
      GXt_char3 = AV15ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      trabajoexterno_actualizohash_cadenaparahash.this.GXt_char3 = GXv_char4[0] ;
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
      Gx_msg = httpContext.getMessage( "&ddmmaaaa =", "") + AV15ddmmaaaa + httpContext.getMessage( "&FacFch =", "") + localUtil.dtoc( AV17Facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV30Firma = "" ;
      /* Using cursor P0ABT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P0ABT2_A2253SalExtAlb[0] ;
         A2256SalExtFec = P0ABT2_A2256SalExtFec[0] ;
         A10076SalFhh = P0ABT2_A10076SalFhh[0] ;
         A14349SalExtSerA = P0ABT2_A14349SalExtSerA[0] ;
         A14350SalExtTipA = P0ABT2_A14350SalExtTipA[0] ;
         AV37AlbProcod = A2253SalExtAlb ;
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( A2256SalExtFec), 10, 0)) ;
         if ( GXutil.month( A2256SalExtFec) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A2256SalExtFec), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( A2256SalExtFec), 10, 0)) ;
         }
         if ( GXutil.day( A2256SalExtFec) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A2256SalExtFec), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( A2256SalExtFec), 10, 0)) ;
         }
         AV25Texto = AV24Dateaux ;
         AV21VarAUx = localUtil.ttoc( A10076SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
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
         AV25Texto += ";" + GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( AV37AlbProcod, 10, 0)) ;
         AV19Factot = DecimalUtil.ZERO ;
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
      /* Using cursor P0ABT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV17Facfch});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2256SalExtFec = P0ABT3_A2256SalExtFec[0] ;
         A10077SalFmd = P0ABT3_A10077SalFmd[0] ;
         A2253SalExtAlb = P0ABT3_A2253SalExtAlb[0] ;
         if ( A2253SalExtAlb != AV37AlbProcod )
         {
            AV27Facfirma = A10077SalFmd ;
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
      this.aP0[0] = trabajoexterno_actualizohash_cadenaparahash.this.A396EmprCod;
      this.aP1[0] = trabajoexterno_actualizohash_cadenaparahash.this.AV18Faccod;
      this.aP2[0] = trabajoexterno_actualizohash_cadenaparahash.this.AV17Facfch;
      this.aP3[0] = trabajoexterno_actualizohash_cadenaparahash.this.AV33AlbProSys;
      this.aP4[0] = trabajoexterno_actualizohash_cadenaparahash.this.AV25Texto;
      this.aP5[0] = trabajoexterno_actualizohash_cadenaparahash.this.AV30Firma;
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
      Gx_msg = "" ;
      scmdbuf = "" ;
      P0ABT2_A396EmprCod = new String[] {""} ;
      P0ABT2_A2253SalExtAlb = new int[1] ;
      P0ABT2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABT2_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABT2_A14349SalExtSerA = new String[] {""} ;
      P0ABT2_A14350SalExtTipA = new String[] {""} ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      AV24Dateaux = "" ;
      AV21VarAUx = "" ;
      AV22Hhsys = "" ;
      AV23Fecsys = GXutil.nullDate() ;
      AV19Factot = DecimalUtil.ZERO ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      P0ABT3_A396EmprCod = new String[] {""} ;
      P0ABT3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABT3_A10077SalFmd = new String[] {""} ;
      P0ABT3_A2253SalExtAlb = new int[1] ;
      A10077SalFmd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_actualizohash_cadenaparahash__default(),
         new Object[] {
             new Object[] {
            P0ABT2_A396EmprCod, P0ABT2_A2253SalExtAlb, P0ABT2_A2256SalExtFec, P0ABT2_A10076SalFhh, P0ABT2_A14349SalExtSerA, P0ABT2_A14350SalExtTipA
            }
            , new Object[] {
            P0ABT3_A396EmprCod, P0ABT3_A2256SalExtFec, P0ABT3_A10077SalFmd, P0ABT3_A2253SalExtAlb
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
   private int A2253SalExtAlb ;
   private long AV37AlbProcod ;
   private java.math.BigDecimal AV19Factot ;
   private String A396EmprCod ;
   private String AV25Texto ;
   private String AV30Firma ;
   private String AV15ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String AV24Dateaux ;
   private String AV21VarAUx ;
   private String AV22Hhsys ;
   private String AV27Facfirma ;
   private String AV28Firmalast ;
   private String A10077SalFmd ;
   private java.util.Date AV33AlbProSys ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date AV17Facfch ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date AV23Fecsys ;
   private boolean returnInSub ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABT2_A396EmprCod ;
   private int[] P0ABT2_A2253SalExtAlb ;
   private java.util.Date[] P0ABT2_A2256SalExtFec ;
   private java.util.Date[] P0ABT2_A10076SalFhh ;
   private String[] P0ABT2_A14349SalExtSerA ;
   private String[] P0ABT2_A14350SalExtTipA ;
   private String[] P0ABT3_A396EmprCod ;
   private java.util.Date[] P0ABT3_A2256SalExtFec ;
   private String[] P0ABT3_A10077SalFmd ;
   private int[] P0ABT3_A2253SalExtAlb ;
}

final  class trabajoexterno_actualizohash_cadenaparahash__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABT2", "SELECT EmprCod, SalExtAlb, SalExtFec, SalFhh, SalExtSerA, SalExtTipA FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ABT3", "SELECT EmprCod, SalExtFec, SalFmd, SalExtAlb FROM TXPCEXTSA WHERE (EmprCod = ?) AND (SalExtFec >= ?) ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               return;
      }
   }

}

