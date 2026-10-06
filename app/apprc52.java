package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc52 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc52 pgm = new apprc52 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc52( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc52.class ), "" );
   }

   public apprc52( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc52.this.AV10EmprCod = GXv_char1[0] ;
      apprc52.this.AV11EmprNom = GXv_char2[0] ;
      apprc52.this.AV8UsurCod = GXv_char3[0] ;
      GXt_char4 = AV19Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char3) ;
      apprc52.this.GXt_char4 = GXv_char3[0] ;
      AV19Carpeta = GXt_char4 ;
      GXt_char4 = AV19Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apprc52.this.GXt_char4 = GXv_char3[0] ;
      AV19Carpeta = ((GXutil.strcmp("", AV19Carpeta)==0) ? GXt_char4 : AV19Carpeta) ;
      AV17Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV18Nominf = GXutil.trim( AV30Pgmname) + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV17Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV17Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV17Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV17Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV17Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV17Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      AV20File = GXutil.trim( AV19Carpeta) + "\\" + GXutil.trim( AV18Nominf) + httpContext.getMessage( ".csv", "") ;
      GXt_int5 = AV21hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV20File, GXv_int6) ;
      apprc52.this.GXt_int5 = GXv_int6[0] ;
      AV21hnd = (short)(GXt_int5) ;
      AV22Control = httpContext.getMessage( " Auditoria ROLLOS. HDRS con Situacion=6", "") ;
      GXt_int7 = (byte)(AV24Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV21hnd, AV22Control, GXv_int8) ;
      apprc52.this.GXt_int7 = GXv_int8[0] ;
      AV24Stat = GXt_int7 ;
      System.out.println( AV22Control );
      AV22Control = httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Situacion", "") + ";" + httpContext.getMessage( "Rollo ", "") + ";" + httpContext.getMessage( "Estado", "") + ";" + httpContext.getMessage( "New Estado", "") ;
      GXt_int7 = (byte)(AV24Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV21hnd, AV22Control, GXv_int8) ;
      apprc52.this.GXt_int7 = GXv_int8[0] ;
      AV24Stat = GXt_int7 ;
      System.out.println( AV22Control );
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV25Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27i = (short)(1) ;
      /* Using cursor P05EY2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05EY2_A396EmprCod[0] ;
         A213BarSit = P05EY2_A213BarSit[0] ;
         A130BarCodPar = P05EY2_A130BarCodPar[0] ;
         A132BarCodReo = P05EY2_A132BarCodReo[0] ;
         A129BarCod = P05EY2_A129BarCod[0] ;
         AV12barcod = A129BarCod ;
         AV13barcodreo = A132BarCodReo ;
         AV14barcodpar = A130BarCodPar ;
         AV26PiezasErr = (byte)(0) ;
         /* Using cursor P05EY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P05EY3_A200BarPieCod[0] ;
            A201BarPieEst = P05EY3_A201BarPieEst[0] ;
            AV15barpiecod = A200BarPieCod ;
            /* Execute user subroutine: 'LALPRD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV23BarPieEst = (byte)(((A201BarPieEst==0)&&(AV16lalprd==1) ? 1 : A201BarPieEst)) ;
            if ( A201BarPieEst != AV23BarPieEst )
            {
               AV22Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + GXutil.str( A213BarSit, 2, 0) + ";" + A200BarPieCod + ";" + GXutil.str( A201BarPieEst, 1, 0) + ";" + GXutil.str( AV23BarPieEst, 1, 0) ;
               GXt_int7 = (byte)(AV24Stat) ;
               GXv_int8[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV21hnd, AV22Control, GXv_int8) ;
               apprc52.this.GXt_int7 = GXv_int8[0] ;
               AV24Stat = GXt_int7 ;
               System.out.println( AV22Control );
               A201BarPieEst = AV23BarPieEst ;
               AV26PiezasErr = (byte)(1) ;
            }
            /* Using cursor P05EY4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = (byte)(AV24Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV21hnd, GXv_int8) ;
      apprc52.this.GXt_int7 = GXv_int8[0] ;
      AV24Stat = GXt_int7 ;
      new app.pcommit(remoteHandle, context).execute( ) ;
      new app.pbarsit6(remoteHandle, context).execute( ) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LALPRD' Routine */
      returnInSub = false ;
      AV16lalprd = (byte)(0) ;
      /* Using cursor P05EY5 */
      pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV12barcod), Byte.valueOf(AV13barcodreo), AV14barcodpar, AV15barpiecod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A200BarPieCod = P05EY5_A200BarPieCod[0] ;
         A130BarCodPar = P05EY5_A130BarCodPar[0] ;
         A132BarCodReo = P05EY5_A132BarCodReo[0] ;
         A129BarCod = P05EY5_A129BarCod[0] ;
         A396EmprCod = P05EY5_A396EmprCod[0] ;
         A30AlbProCod = P05EY5_A30AlbProCod[0] ;
         AV16lalprd = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc52.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc52");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV19Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV17Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV18Nominf = "" ;
      AV30Pgmname = "" ;
      AV20File = "" ;
      GXv_int6 = new long[1] ;
      AV22Control = "" ;
      AV25Tab_hdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV25Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P05EY2_A396EmprCod = new String[] {""} ;
      P05EY2_A213BarSit = new byte[1] ;
      P05EY2_A130BarCodPar = new String[] {""} ;
      P05EY2_A132BarCodReo = new byte[1] ;
      P05EY2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV14barcodpar = "" ;
      P05EY3_A396EmprCod = new String[] {""} ;
      P05EY3_A129BarCod = new int[1] ;
      P05EY3_A132BarCodReo = new byte[1] ;
      P05EY3_A130BarCodPar = new String[] {""} ;
      P05EY3_A200BarPieCod = new String[] {""} ;
      P05EY3_A201BarPieEst = new byte[1] ;
      A200BarPieCod = "" ;
      AV15barpiecod = "" ;
      GXv_int8 = new byte[1] ;
      P05EY5_A200BarPieCod = new String[] {""} ;
      P05EY5_A130BarCodPar = new String[] {""} ;
      P05EY5_A132BarCodReo = new byte[1] ;
      P05EY5_A129BarCod = new int[1] ;
      P05EY5_A396EmprCod = new String[] {""} ;
      P05EY5_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc52__default(),
         new Object[] {
             new Object[] {
            P05EY2_A396EmprCod, P05EY2_A213BarSit, P05EY2_A130BarCodPar, P05EY2_A132BarCodReo, P05EY2_A129BarCod
            }
            , new Object[] {
            P05EY3_A396EmprCod, P05EY3_A129BarCod, P05EY3_A132BarCodReo, P05EY3_A130BarCodPar, P05EY3_A200BarPieCod, P05EY3_A201BarPieEst
            }
            , new Object[] {
            }
            , new Object[] {
            P05EY5_A200BarPieCod, P05EY5_A130BarCodPar, P05EY5_A132BarCodReo, P05EY5_A129BarCod, P05EY5_A396EmprCod, P05EY5_A30AlbProCod
            }
         }
      );
      AV30Pgmname = "APPrc52" ;
      /* GeneXus formulas. */
      AV30Pgmname = "APPrc52" ;
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV13barcodreo ;
   private byte AV26PiezasErr ;
   private byte A201BarPieEst ;
   private byte AV23BarPieEst ;
   private byte AV16lalprd ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short AV21hnd ;
   private short AV24Stat ;
   private short AV27i ;
   private short Gx_err ;
   private int GX_I ;
   private int A129BarCod ;
   private int AV12barcod ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long A30AlbProCod ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV19Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV18Nominf ;
   private String AV30Pgmname ;
   private String AV25Tab_hdr[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14barcodpar ;
   private String A200BarPieCod ;
   private String AV15barpiecod ;
   private java.util.Date AV17Hhmmss ;
   private boolean returnInSub ;
   private String AV20File ;
   private String AV22Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05EY2_A396EmprCod ;
   private byte[] P05EY2_A213BarSit ;
   private String[] P05EY2_A130BarCodPar ;
   private byte[] P05EY2_A132BarCodReo ;
   private int[] P05EY2_A129BarCod ;
   private String[] P05EY3_A396EmprCod ;
   private int[] P05EY3_A129BarCod ;
   private byte[] P05EY3_A132BarCodReo ;
   private String[] P05EY3_A130BarCodPar ;
   private String[] P05EY3_A200BarPieCod ;
   private byte[] P05EY3_A201BarPieEst ;
   private String[] P05EY5_A200BarPieCod ;
   private String[] P05EY5_A130BarCodPar ;
   private byte[] P05EY5_A132BarCodReo ;
   private int[] P05EY5_A129BarCod ;
   private String[] P05EY5_A396EmprCod ;
   private long[] P05EY5_A30AlbProCod ;
}

final  class apprc52__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05EY2", "SELECT EmprCod, BarSit, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarSit = 6 ORDER BY EmprCod, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05EY3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EY4", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P05EY5", "SELECT BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPLALPRD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

