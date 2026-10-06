package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelrec extends GXProcedure
{
   public pdelrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelrec.class ), "" );
   }

   public pdelrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          java.util.Date[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 )
   {
      pdelrec.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pdelrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelrec.this.AV24AlbHhfm = aP1[0];
      this.aP1 = aP1;
      pdelrec.this.AV34AlbFmd = aP2[0];
      this.aP2 = aP2;
      pdelrec.this.AV32AlbFmdc = aP3[0];
      this.aP3 = aP3;
      pdelrec.this.AV37ALbprocod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      pdelrec.this.GXt_int1 = GXv_int2[0] ;
      AV20Firmad = GXt_int1 ;
      GXt_char3 = AV21ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pdelrec.this.GXt_char3 = GXv_char4[0] ;
      AV21ddmmaaaa = GXt_char3 ;
      if ( GXutil.strcmp(AV21ddmmaaaa, " ") == 0 )
      {
         AV21ddmmaaaa = "02/04/12" ;
      }
      AV22Facfch = localUtil.ctod( AV21ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&ddmmaaaa =", "") + AV21ddmmaaaa + httpContext.getMessage( "&FacFch =", "") + localUtil.dtoc( AV22Facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      System.out.println( Gx_msg );
      if ( AV20Firmad == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV24AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV23VarAux = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV25Hhsys = GXutil.substring( AV23VarAux, 12, 8) ;
      AV26Fecsys = localUtil.ctod( GXutil.substring( AV23VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV23VarAux = GXutil.str( GXutil.day( AV26Fecsys), 2, 0) + "/" + GXutil.str( GXutil.month( AV26Fecsys), 2, 0) + "/" + GXutil.str( GXutil.year( AV26Fecsys), 4, 0) + " " + AV25Hhsys ;
      AV27FecHhSys = localUtil.ctot( AV23VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV23VarAux = GXutil.str( GXutil.day( AV26Fecsys), 2, 0) + "/" + GXutil.str( GXutil.month( AV26Fecsys), 2, 0) + "/" + GXutil.str( GXutil.year( AV26Fecsys), 4, 0) + " " + GXutil.substring( A7210FacObs, 23, 8) ;
      AV28Fechctrl = localUtil.ctot( AV23VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      if ( !( GXutil.dateCompare(AV28Fechctrl, AV27FecHhSys) ) )
      {
         Gx_msg = httpContext.getMessage( "Fecha Control=", "") + localUtil.ttoc( AV28Fechctrl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Fachor = ", "") + localUtil.ttoc( AV27FecHhSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.chr( (short)(13)) ;
         System.out.println( Gx_msg );
         AV24AlbHhfm = AV28Fechctrl ;
      }
      AV29Dateaux = GXutil.trim( GXutil.str( GXutil.year( AV26Fecsys), 10, 0)) ;
      if ( GXutil.month( AV26Fecsys) < 10 )
      {
         AV29Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV26Fecsys), 10, 0)) ;
      }
      else
      {
         AV29Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV26Fecsys), 10, 0)) ;
      }
      if ( GXutil.day( AV26Fecsys) < 10 )
      {
         AV29Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV26Fecsys), 10, 0)) ;
      }
      else
      {
         AV29Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV26Fecsys), 10, 0)) ;
      }
      AV30Texto = AV29Dateaux ;
      AV30Texto += ";" + AV29Dateaux + httpContext.getMessage( "T", "") + AV25Hhsys ;
      AV38factipfac = (byte)(5) ;
      AV30Texto += httpContext.getMessage( ";GT ", "") + GXutil.str( AV38factipfac, 1, 0) + "/" + GXutil.trim( GXutil.str( AV37ALbprocod, 10, 0)) ;
      AV31FacTot = DecimalUtil.doubleToDec(0) ;
      AV30Texto += ";" + GXutil.trim( GXutil.str( AV31FacTot, 13, 2)) + ";" ;
      /* Execute user subroutine: 'FIRMAANTERIOR' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV32AlbFmdc = GXutil.trim( AV30Texto) ;
      AV32AlbFmdc += httpContext.getMessage( "FirmaLast=", "") + GXutil.trim( AV33Firmalast) ;
      System.out.println( AV30Texto );
      AV23VarAux = GXutil.str( GXutil.day( AV26Fecsys), 2, 0) + "/" + GXutil.str( GXutil.month( AV26Fecsys), 2, 0) + "/" + GXutil.str( GXutil.year( AV26Fecsys), 4, 0) + " " + AV25Hhsys ;
      AV27FecHhSys = localUtil.ctot( AV23VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&FecHhSys =", "") + localUtil.ttoc( AV27FecHhSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      System.out.println( Gx_msg );
      AV24AlbHhfm = AV27FecHhSys ;
      AV35Firma = GXutil.trim( AV35Firma) ;
      AV34AlbFmd = AV35Firma ;
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV36FacFirma = "" ;
      AV33Firmalast = "" ;
      /* Using cursor P005U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV22Facfch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2256SalExtFec = P005U2_A2256SalExtFec[0] ;
         A10077SalFmd = P005U2_A10077SalFmd[0] ;
         A2253SalExtAlb = P005U2_A2253SalExtAlb[0] ;
         if ( A2253SalExtAlb != AV37ALbprocod )
         {
            AV36FacFirma = A10077SalFmd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV36FacFirma)==0) )
            {
               AV30Texto += GXutil.trim( AV36FacFirma) ;
               AV33Firmalast = AV36FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelrec.this.A396EmprCod;
      this.aP1[0] = pdelrec.this.AV24AlbHhfm;
      this.aP2[0] = pdelrec.this.AV34AlbFmd;
      this.aP3[0] = pdelrec.this.AV32AlbFmdc;
      this.aP4[0] = pdelrec.this.AV37ALbprocod;
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
      AV21ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV22Facfch = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV23VarAux = "" ;
      AV25Hhsys = "" ;
      AV26Fecsys = GXutil.nullDate() ;
      AV27FecHhSys = GXutil.resetTime( GXutil.nullDate() );
      A7210FacObs = "" ;
      AV28Fechctrl = GXutil.resetTime( GXutil.nullDate() );
      AV29Dateaux = "" ;
      AV30Texto = "" ;
      AV31FacTot = DecimalUtil.ZERO ;
      AV33Firmalast = "" ;
      AV35Firma = "" ;
      AV36FacFirma = "" ;
      scmdbuf = "" ;
      P005U2_A396EmprCod = new String[] {""} ;
      P005U2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P005U2_A10077SalFmd = new String[] {""} ;
      P005U2_A2253SalExtAlb = new int[1] ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10077SalFmd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelrec__default(),
         new Object[] {
             new Object[] {
            P005U2_A396EmprCod, P005U2_A2256SalExtFec, P005U2_A10077SalFmd, P005U2_A2253SalExtAlb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Firmad ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV38factipfac ;
   private short Gx_err ;
   private int AV37ALbprocod ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal AV31FacTot ;
   private String A396EmprCod ;
   private String AV32AlbFmdc ;
   private String AV21ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String AV23VarAux ;
   private String AV25Hhsys ;
   private String AV29Dateaux ;
   private String AV33Firmalast ;
   private String AV35Firma ;
   private String AV36FacFirma ;
   private String scmdbuf ;
   private String A10077SalFmd ;
   private java.util.Date AV24AlbHhfm ;
   private java.util.Date AV27FecHhSys ;
   private java.util.Date AV28Fechctrl ;
   private java.util.Date AV22Facfch ;
   private java.util.Date AV26Fecsys ;
   private java.util.Date A2256SalExtFec ;
   private boolean returnInSub ;
   private String A7210FacObs ;
   private String AV34AlbFmd ;
   private String AV30Texto ;
   private int[] aP4 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P005U2_A396EmprCod ;
   private java.util.Date[] P005U2_A2256SalExtFec ;
   private String[] P005U2_A10077SalFmd ;
   private int[] P005U2_A2253SalExtAlb ;
}

final  class pdelrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005U2", "SELECT EmprCod, SalExtFec, SalFmd, SalExtAlb FROM TXPCEXTSA WHERE (EmprCod = ?) AND (SalExtFec >= ?) ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

