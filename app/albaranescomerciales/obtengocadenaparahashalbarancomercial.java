package app.albaranescomerciales ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocadenaparahashalbarancomercial extends GXProcedure
{
   public obtengocadenaparahashalbarancomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocadenaparahashalbarancomercial.class ), "" );
   }

   public obtengocadenaparahashalbarancomercial( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      obtengocadenaparahashalbarancomercial.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      obtengocadenaparahashalbarancomercial.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      obtengocadenaparahashalbarancomercial.this.AV18Faccod = aP1[0];
      this.aP1 = aP1;
      obtengocadenaparahashalbarancomercial.this.AV17Facfch = aP2[0];
      this.aP2 = aP2;
      obtengocadenaparahashalbarancomercial.this.AV29FacHor = aP3[0];
      this.aP3 = aP3;
      obtengocadenaparahashalbarancomercial.this.AV40Tablas = aP4[0];
      this.aP4 = aP4;
      obtengocadenaparahashalbarancomercial.this.AV31Opcion = aP5[0];
      this.aP5 = aP5;
      obtengocadenaparahashalbarancomercial.this.AV16Nocont = aP6[0];
      this.aP6 = aP6;
      obtengocadenaparahashalbarancomercial.this.aP7 = aP7;
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
      obtengocadenaparahashalbarancomercial.this.GXt_int1 = GXv_int2[0] ;
      AV14Firmad = GXt_int1 ;
      GXt_char3 = AV15ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      obtengocadenaparahashalbarancomercial.this.GXt_char3 = GXv_char4[0] ;
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
      /* Using cursor P09Z22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P09Z22_A14AlbComCod[0] ;
         A22AlbComPri = P09Z22_A22AlbComPri[0] ;
         A4829AlbComHor = P09Z22_A4829AlbComHor[0] ;
         A10013AlbComFs = P09Z22_A10013AlbComFs[0] ;
         AV41AlbProPri = A22AlbComPri ;
         if ( AV31Opcion == 1 )
         {
            AV21VarAUx = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         else
         {
            AV21VarAUx = localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
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
         AV25Texto = AV24Dateaux ;
         AV25Texto += ";" + AV24Dateaux + httpContext.getMessage( "T", "") + AV22Hhsys ;
         if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
         {
            AV26Factipfac = (byte)(3) ;
            AV25Texto += httpContext.getMessage( ";GR ", "") + GXutil.str( AV26Factipfac, 1, 0) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 10, 0)) ;
         }
         else
         {
            AV26Factipfac = (byte)(4) ;
            AV25Texto += httpContext.getMessage( ";GT ", "") + GXutil.str( AV26Factipfac, 1, 0) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 10, 0)) ;
         }
         AV19Factot = DecimalUtil.doubleToDec(0) ;
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
      /* Using cursor P09Z23 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV17Facfch, AV41AlbProPri});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A22AlbComPri = P09Z23_A22AlbComPri[0] ;
         A17AlbComFch = P09Z23_A17AlbComFch[0] ;
         A10014AlbComFd = P09Z23_A10014AlbComFd[0] ;
         A14AlbComCod = P09Z23_A14AlbComCod[0] ;
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
      this.aP0[0] = obtengocadenaparahashalbarancomercial.this.A396EmprCod;
      this.aP1[0] = obtengocadenaparahashalbarancomercial.this.AV18Faccod;
      this.aP2[0] = obtengocadenaparahashalbarancomercial.this.AV17Facfch;
      this.aP3[0] = obtengocadenaparahashalbarancomercial.this.AV29FacHor;
      this.aP4[0] = obtengocadenaparahashalbarancomercial.this.AV40Tablas;
      this.aP5[0] = obtengocadenaparahashalbarancomercial.this.AV31Opcion;
      this.aP6[0] = obtengocadenaparahashalbarancomercial.this.AV16Nocont;
      this.aP7[0] = obtengocadenaparahashalbarancomercial.this.AV25Texto;
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
      GXv_char4 = new String[1] ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P09Z22_A396EmprCod = new String[] {""} ;
      P09Z22_A14AlbComCod = new int[1] ;
      P09Z22_A22AlbComPri = new String[] {""} ;
      P09Z22_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09Z22_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      A22AlbComPri = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV41AlbProPri = "" ;
      AV21VarAUx = "" ;
      AV22Hhsys = "" ;
      AV23Fecsys = GXutil.nullDate() ;
      AV24Dateaux = "" ;
      AV19Factot = DecimalUtil.ZERO ;
      AV30Firma = "" ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      P09Z23_A396EmprCod = new String[] {""} ;
      P09Z23_A22AlbComPri = new String[] {""} ;
      P09Z23_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09Z23_A10014AlbComFd = new String[] {""} ;
      P09Z23_A14AlbComCod = new int[1] ;
      A17AlbComFch = GXutil.nullDate() ;
      A10014AlbComFd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranescomerciales.obtengocadenaparahashalbarancomercial__default(),
         new Object[] {
             new Object[] {
            P09Z22_A396EmprCod, P09Z22_A14AlbComCod, P09Z22_A22AlbComPri, P09Z22_A4829AlbComHor, P09Z22_A10013AlbComFs
            }
            , new Object[] {
            P09Z23_A396EmprCod, P09Z23_A22AlbComPri, P09Z23_A17AlbComFch, P09Z23_A10014AlbComFd, P09Z23_A14AlbComCod
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
   private short AV40Tablas ;
   private short Gx_err ;
   private int AV18Faccod ;
   private int A14AlbComCod ;
   private java.math.BigDecimal AV19Factot ;
   private String A396EmprCod ;
   private String AV15ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A22AlbComPri ;
   private String AV41AlbProPri ;
   private String AV21VarAUx ;
   private String AV22Hhsys ;
   private String AV24Dateaux ;
   private String AV27Facfirma ;
   private String AV28Firmalast ;
   private String A10014AlbComFd ;
   private java.util.Date AV29FacHor ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV17Facfch ;
   private java.util.Date AV23Fecsys ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private String AV25Texto ;
   private String AV30Firma ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09Z22_A396EmprCod ;
   private int[] P09Z22_A14AlbComCod ;
   private String[] P09Z22_A22AlbComPri ;
   private java.util.Date[] P09Z22_A4829AlbComHor ;
   private java.util.Date[] P09Z22_A10013AlbComFs ;
   private String[] P09Z23_A396EmprCod ;
   private String[] P09Z23_A22AlbComPri ;
   private java.util.Date[] P09Z23_A17AlbComFch ;
   private String[] P09Z23_A10014AlbComFd ;
   private int[] P09Z23_A14AlbComCod ;
}

final  class obtengocadenaparahashalbarancomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Z22", "SELECT EmprCod, AlbComCod, AlbComPri, AlbComHor, AlbComFs FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09Z23", "SELECT EmprCod, AlbComPri, AlbComFch, AlbComFd, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ?) AND (AlbComFch >= ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
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

