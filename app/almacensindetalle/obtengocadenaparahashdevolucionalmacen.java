package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocadenaparahashdevolucionalmacen extends GXProcedure
{
   public obtengocadenaparahashdevolucionalmacen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocadenaparahashdevolucionalmacen.class ), "" );
   }

   public obtengocadenaparahashdevolucionalmacen( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 )
   {
      obtengocadenaparahashdevolucionalmacen.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      obtengocadenaparahashdevolucionalmacen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      obtengocadenaparahashdevolucionalmacen.this.AV18Faccod = aP1[0];
      this.aP1 = aP1;
      obtengocadenaparahashdevolucionalmacen.this.AV17Facfch = aP2[0];
      this.aP2 = aP2;
      obtengocadenaparahashdevolucionalmacen.this.AV29FacHor = aP3[0];
      this.aP3 = aP3;
      obtengocadenaparahashdevolucionalmacen.this.AV31Opcion = aP4[0];
      this.aP4 = aP4;
      obtengocadenaparahashdevolucionalmacen.this.AV16Nocont = aP5[0];
      this.aP5 = aP5;
      obtengocadenaparahashdevolucionalmacen.this.aP6 = aP6;
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
      obtengocadenaparahashdevolucionalmacen.this.GXt_int1 = GXv_int2[0] ;
      AV14Firmad = GXt_int1 ;
      GXt_char3 = AV15ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      obtengocadenaparahashdevolucionalmacen.this.GXt_char3 = GXv_char4[0] ;
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
      GXv_char4[0] = AV40contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( A396EmprCod, "022400", GXv_char4) ;
      obtengocadenaparahashdevolucionalmacen.this.AV40contidsernew = GXv_char4[0] ;
      AV41SerieAT = ((GXutil.strcmp("", AV40contidsernew)==0) ? "GD6" : AV40contidsernew) ;
      /* Using cursor P099N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11669DevCruId = P099N2_A11669DevCruId[0] ;
         A11673DevCruSal = P099N2_A11673DevCruSal[0] ;
         A11670DevCruFec = P099N2_A11670DevCruFec[0] ;
         A11676DevCruDtSy = P099N2_A11676DevCruDtSy[0] ;
         A13985DevCruTipA = P099N2_A13985DevCruTipA[0] ;
         A13984DevCruSerA = P099N2_A13984DevCruSerA[0] ;
         AV20Grosstotal = DecimalUtil.doubleToDec(0) ;
         AV19Factot = AV20Grosstotal ;
         if ( AV31Opcion == 1 )
         {
            AV21VarAUx = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV22Hhsys = GXutil.substring( AV21VarAUx, 12, 8) ;
            AV23Fecsys = A11670DevCruFec ;
         }
         else
         {
            AV21VarAUx = localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV22Hhsys = GXutil.substring( AV21VarAUx, 12, 8) ;
            AV23Fecsys = localUtil.ctod( GXutil.substring( AV21VarAUx, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( A11670DevCruFec), 10, 0)) ;
         if ( GXutil.month( A11670DevCruFec) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A11670DevCruFec), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( A11670DevCruFec), 10, 0)) ;
         }
         if ( GXutil.day( A11670DevCruFec) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A11670DevCruFec), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( A11670DevCruFec), 10, 0)) ;
         }
         AV25Texto = AV24Dateaux ;
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
         AV26Factipfac = (byte)(6) ;
         AV42DevCruTipAT = ((GXutil.strcmp("", A13985DevCruTipA)==0) ? httpContext.getMessage( "GD", "") : A13985DevCruTipA) ;
         AV43documentnumber = GXutil.trim( A13985DevCruTipA) + " " + GXutil.trim( A13984DevCruSerA) + "/" + GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)) ;
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
      AV32HayRegtos = (byte)(0) ;
      /* Using cursor P099N3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11669DevCruId = P099N3_A11669DevCruId[0] ;
         if ( A11669DevCruId != AV18Faccod )
         {
            AV32HayRegtos = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV32HayRegtos == 1 )
      {
         /* Using cursor P099N4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV17Facfch});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A11670DevCruFec = P099N4_A11670DevCruFec[0] ;
            A11674DevCruHash = P099N4_A11674DevCruHash[0] ;
            A11669DevCruId = P099N4_A11669DevCruId[0] ;
            if ( A11669DevCruId != AV18Faccod )
            {
               AV27Facfirma = GXutil.trim( A11674DevCruHash) ;
            }
            else
            {
               if ( ! (GXutil.strcmp("", AV27Facfirma)==0) )
               {
                  AV25Texto += GXutil.trim( AV27Facfirma) ;
                  AV28Firmalast = GXutil.trim( AV27Facfirma) ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      else
      {
         /* Using cursor P099N5 */
         pr_default.execute(3, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A10071DevFmd = P099N5_A10071DevFmd[0] ;
            n10071DevFmd = P099N5_n10071DevFmd[0] ;
            A323DevGenCod = P099N5_A323DevGenCod[0] ;
            AV25Texto += GXutil.trim( A10071DevFmd) ;
            AV28Firmalast = GXutil.trim( A10071DevFmd) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtengocadenaparahashdevolucionalmacen.this.A396EmprCod;
      this.aP1[0] = obtengocadenaparahashdevolucionalmacen.this.AV18Faccod;
      this.aP2[0] = obtengocadenaparahashdevolucionalmacen.this.AV17Facfch;
      this.aP3[0] = obtengocadenaparahashdevolucionalmacen.this.AV29FacHor;
      this.aP4[0] = obtengocadenaparahashdevolucionalmacen.this.AV31Opcion;
      this.aP5[0] = obtengocadenaparahashdevolucionalmacen.this.AV16Nocont;
      this.aP6[0] = obtengocadenaparahashdevolucionalmacen.this.AV25Texto;
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
      GXv_int2 = new byte[1] ;
      AV15ddmmaaaa = "" ;
      GXt_char3 = "" ;
      Gx_msg = "" ;
      AV40contidsernew = "" ;
      GXv_char4 = new String[1] ;
      AV41SerieAT = "" ;
      scmdbuf = "" ;
      P099N2_A396EmprCod = new String[] {""} ;
      P099N2_A11669DevCruId = new int[1] ;
      P099N2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P099N2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P099N2_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      P099N2_A13985DevCruTipA = new String[] {""} ;
      P099N2_A13984DevCruSerA = new String[] {""} ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11670DevCruFec = GXutil.nullDate() ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A13985DevCruTipA = "" ;
      A13984DevCruSerA = "" ;
      AV20Grosstotal = DecimalUtil.ZERO ;
      AV19Factot = DecimalUtil.ZERO ;
      AV21VarAUx = "" ;
      AV22Hhsys = "" ;
      AV23Fecsys = GXutil.nullDate() ;
      AV24Dateaux = "" ;
      AV42DevCruTipAT = "" ;
      AV43documentnumber = "" ;
      AV30Firma = "" ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      P099N3_A396EmprCod = new String[] {""} ;
      P099N3_A11669DevCruId = new int[1] ;
      P099N4_A396EmprCod = new String[] {""} ;
      P099N4_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P099N4_A11674DevCruHash = new String[] {""} ;
      P099N4_A11669DevCruId = new int[1] ;
      A11674DevCruHash = "" ;
      P099N5_A396EmprCod = new String[] {""} ;
      P099N5_A10071DevFmd = new String[] {""} ;
      P099N5_n10071DevFmd = new boolean[] {false} ;
      P099N5_A323DevGenCod = new int[1] ;
      A10071DevFmd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen__default(),
         new Object[] {
             new Object[] {
            P099N2_A396EmprCod, P099N2_A11669DevCruId, P099N2_A11673DevCruSal, P099N2_A11670DevCruFec, P099N2_A11676DevCruDtSy, P099N2_A13985DevCruTipA, P099N2_A13984DevCruSerA
            }
            , new Object[] {
            P099N3_A396EmprCod, P099N3_A11669DevCruId
            }
            , new Object[] {
            P099N4_A396EmprCod, P099N4_A11670DevCruFec, P099N4_A11674DevCruHash, P099N4_A11669DevCruId
            }
            , new Object[] {
            P099N5_A396EmprCod, P099N5_A10071DevFmd, P099N5_n10071DevFmd, P099N5_A323DevGenCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31Opcion ;
   private byte AV16Nocont ;
   private byte AV14Firmad ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV26Factipfac ;
   private byte AV32HayRegtos ;
   private short Gx_err ;
   private int AV18Faccod ;
   private int A11669DevCruId ;
   private int A323DevGenCod ;
   private java.math.BigDecimal AV20Grosstotal ;
   private java.math.BigDecimal AV19Factot ;
   private String A396EmprCod ;
   private String AV15ddmmaaaa ;
   private String GXt_char3 ;
   private String Gx_msg ;
   private String AV40contidsernew ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A13985DevCruTipA ;
   private String A13984DevCruSerA ;
   private String AV21VarAUx ;
   private String AV22Hhsys ;
   private String AV24Dateaux ;
   private String AV42DevCruTipAT ;
   private String AV27Facfirma ;
   private String AV28Firmalast ;
   private String A11674DevCruHash ;
   private String A10071DevFmd ;
   private java.util.Date AV29FacHor ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date AV17Facfch ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV23Fecsys ;
   private boolean returnInSub ;
   private boolean n10071DevFmd ;
   private String AV25Texto ;
   private String AV41SerieAT ;
   private String AV43documentnumber ;
   private String AV30Firma ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P099N2_A396EmprCod ;
   private int[] P099N2_A11669DevCruId ;
   private java.util.Date[] P099N2_A11673DevCruSal ;
   private java.util.Date[] P099N2_A11670DevCruFec ;
   private java.util.Date[] P099N2_A11676DevCruDtSy ;
   private String[] P099N2_A13985DevCruTipA ;
   private String[] P099N2_A13984DevCruSerA ;
   private String[] P099N3_A396EmprCod ;
   private int[] P099N3_A11669DevCruId ;
   private String[] P099N4_A396EmprCod ;
   private java.util.Date[] P099N4_A11670DevCruFec ;
   private String[] P099N4_A11674DevCruHash ;
   private int[] P099N4_A11669DevCruId ;
   private String[] P099N5_A396EmprCod ;
   private String[] P099N5_A10071DevFmd ;
   private boolean[] P099N5_n10071DevFmd ;
   private int[] P099N5_A323DevGenCod ;
}

final  class obtengocadenaparahashdevolucionalmacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099N2", "SELECT EmprCod, DevCruId, DevCruSal, DevCruFec, DevCruDtSy, DevCruTipA, DevCruSerA FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P099N3", "SELECT EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P099N4", "SELECT EmprCod, DevCruFec, DevCruHash, DevCruId FROM TXPDEVCRU WHERE (EmprCod = ?) AND (DevCruFec >= ?) ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P099N5", "SELECT * FROM (SELECT EmprCod, DevFmd, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? ORDER BY EmprCod DESC, DevGenCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 200);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

