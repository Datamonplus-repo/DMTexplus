package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocadenaparahashdocumentoproveedor extends GXProcedure
{
   public obtengocadenaparahashdocumentoproveedor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocadenaparahashdocumentoproveedor.class ), "" );
   }

   public obtengocadenaparahashdocumentoproveedor( int remoteHandle ,
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
      obtengocadenaparahashdocumentoproveedor.this.aP5 = new String[] {""};
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
      obtengocadenaparahashdocumentoproveedor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      obtengocadenaparahashdocumentoproveedor.this.AV18Faccod = aP1[0];
      this.aP1 = aP1;
      obtengocadenaparahashdocumentoproveedor.this.AV17Facfch = aP2[0];
      this.aP2 = aP2;
      obtengocadenaparahashdocumentoproveedor.this.AV40AlbProSys = aP3[0];
      this.aP3 = aP3;
      obtengocadenaparahashdocumentoproveedor.this.aP4 = aP4;
      obtengocadenaparahashdocumentoproveedor.this.aP5 = aP5;
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
      obtengocadenaparahashdocumentoproveedor.this.GXt_int1 = GXv_int2[0] ;
      AV14Firmad = GXt_int1 ;
      GXt_char3 = AV15ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      obtengocadenaparahashdocumentoproveedor.this.GXt_char3 = GXv_char4[0] ;
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
      System.out.println( Gx_msg );
      GXv_char4[0] = AV41contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_char4) ;
      obtengocadenaparahashdocumentoproveedor.this.AV41contidsernew = GXv_char4[0] ;
      AV42SerieAT = ((GXutil.strcmp("", AV41contidsernew)==0) ? "GD5" : AV41contidsernew) ;
      AV30Firma = "" ;
      /* Using cursor P099P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13418AlbProID = P099P2_A13418AlbProID[0] ;
         A13430AlbProDate = P099P2_A13430AlbProDate[0] ;
         A13431AlbProSys = P099P2_A13431AlbProSys[0] ;
         A14191AlbProSerA = P099P2_A14191AlbProSerA[0] ;
         n14191AlbProSerA = P099P2_n14191AlbProSerA[0] ;
         A14192AlbProTipA = P099P2_A14192AlbProTipA[0] ;
         n14192AlbProTipA = P099P2_n14192AlbProTipA[0] ;
         AV20Grosstotal = DecimalUtil.doubleToDec(0) ;
         AV19Factot = AV20Grosstotal ;
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( A13430AlbProDate), 10, 0)) ;
         if ( GXutil.month( A13430AlbProDate) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A13430AlbProDate), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( A13430AlbProDate), 10, 0)) ;
         }
         if ( GXutil.day( A13430AlbProDate) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A13430AlbProDate), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( A13430AlbProDate), 10, 0)) ;
         }
         AV25Texto = AV24Dateaux ;
         AV21VarAUx = localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
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
         AV26Factipfac = (byte)(7) ;
         AV43documentnumber = GXutil.trim( A14192AlbProTipA) + " " + GXutil.trim( A14191AlbProSerA) + "/" + GXutil.trim( GXutil.str( A13418AlbProID, 8, 0)) ;
         AV25Texto += ";" + GXutil.trim( AV43documentnumber) ;
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
      /* Using cursor P099P3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV17Facfch});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13430AlbProDate = P099P3_A13430AlbProDate[0] ;
         A13433AlbProHh = P099P3_A13433AlbProHh[0] ;
         A13418AlbProID = P099P3_A13418AlbProID[0] ;
         if ( A13418AlbProID != AV18Faccod )
         {
            AV27Facfirma = A13433AlbProHh ;
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
      this.aP0[0] = obtengocadenaparahashdocumentoproveedor.this.A396EmprCod;
      this.aP1[0] = obtengocadenaparahashdocumentoproveedor.this.AV18Faccod;
      this.aP2[0] = obtengocadenaparahashdocumentoproveedor.this.AV17Facfch;
      this.aP3[0] = obtengocadenaparahashdocumentoproveedor.this.AV40AlbProSys;
      this.aP4[0] = obtengocadenaparahashdocumentoproveedor.this.AV25Texto;
      this.aP5[0] = obtengocadenaparahashdocumentoproveedor.this.AV30Firma;
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
      Gx_msg = "" ;
      AV41contidsernew = "" ;
      GXv_char4 = new String[1] ;
      AV42SerieAT = "" ;
      scmdbuf = "" ;
      P099P2_A396EmprCod = new String[] {""} ;
      P099P2_A13418AlbProID = new int[1] ;
      P099P2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P099P2_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      P099P2_A14191AlbProSerA = new String[] {""} ;
      P099P2_n14191AlbProSerA = new boolean[] {false} ;
      P099P2_A14192AlbProTipA = new String[] {""} ;
      P099P2_n14192AlbProTipA = new boolean[] {false} ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A14191AlbProSerA = "" ;
      A14192AlbProTipA = "" ;
      AV20Grosstotal = DecimalUtil.ZERO ;
      AV19Factot = DecimalUtil.ZERO ;
      AV24Dateaux = "" ;
      AV21VarAUx = "" ;
      AV22Hhsys = "" ;
      AV23Fecsys = GXutil.nullDate() ;
      AV43documentnumber = "" ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      P099P3_A396EmprCod = new String[] {""} ;
      P099P3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P099P3_A13433AlbProHh = new String[] {""} ;
      P099P3_A13418AlbProID = new int[1] ;
      A13433AlbProHh = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.obtengocadenaparahashdocumentoproveedor__default(),
         new Object[] {
             new Object[] {
            P099P2_A396EmprCod, P099P2_A13418AlbProID, P099P2_A13430AlbProDate, P099P2_A13431AlbProSys, P099P2_A14191AlbProSerA, P099P2_n14191AlbProSerA, P099P2_A14192AlbProTipA, P099P2_n14192AlbProTipA
            }
            , new Object[] {
            P099P3_A396EmprCod, P099P3_A13430AlbProDate, P099P3_A13433AlbProHh, P099P3_A13418AlbProID
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
   private byte AV26Factipfac ;
   private short Gx_err ;
   private int AV18Faccod ;
   private int A13418AlbProID ;
   private java.math.BigDecimal AV20Grosstotal ;
   private java.math.BigDecimal AV19Factot ;
   private String A396EmprCod ;
   private String AV25Texto ;
   private String AV30Firma ;
   private String AV15ddmmaaaa ;
   private String GXt_char3 ;
   private String Gx_msg ;
   private String AV41contidsernew ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A14191AlbProSerA ;
   private String A14192AlbProTipA ;
   private String AV24Dateaux ;
   private String AV21VarAUx ;
   private String AV22Hhsys ;
   private String AV27Facfirma ;
   private String AV28Firmalast ;
   private java.util.Date AV40AlbProSys ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date AV17Facfch ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV23Fecsys ;
   private boolean returnInSub ;
   private boolean n14191AlbProSerA ;
   private boolean n14192AlbProTipA ;
   private String AV42SerieAT ;
   private String AV43documentnumber ;
   private String A13433AlbProHh ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P099P2_A396EmprCod ;
   private int[] P099P2_A13418AlbProID ;
   private java.util.Date[] P099P2_A13430AlbProDate ;
   private java.util.Date[] P099P2_A13431AlbProSys ;
   private String[] P099P2_A14191AlbProSerA ;
   private boolean[] P099P2_n14191AlbProSerA ;
   private String[] P099P2_A14192AlbProTipA ;
   private boolean[] P099P2_n14192AlbProTipA ;
   private String[] P099P3_A396EmprCod ;
   private java.util.Date[] P099P3_A13430AlbProDate ;
   private String[] P099P3_A13433AlbProHh ;
   private int[] P099P3_A13418AlbProID ;
}

final  class obtengocadenaparahashdocumentoproveedor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099P2", "SELECT EmprCod, AlbProID, AlbProDate, AlbProSys, AlbProSerA, AlbProTipA FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P099P3", "SELECT EmprCod, AlbProDate, AlbProHh, AlbProID FROM TXPCALPRO WHERE (EmprCod = ?) AND (AlbProDate >= ?) ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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

