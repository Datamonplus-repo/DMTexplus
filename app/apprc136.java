package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc136 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc136 pgm = new apprc136 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc136( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc136.class ), "" );
   }

   public apprc136( int remoteHandle ,
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
      apprc136.this.AV10EmprCod = GXv_char1[0] ;
      apprc136.this.AV11EmprNom = GXv_char2[0] ;
      apprc136.this.AV8UsurCod = GXv_char3[0] ;
      GXt_char4 = AV14Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char3) ;
      apprc136.this.GXt_char4 = GXv_char3[0] ;
      AV14Carpeta = GXt_char4 ;
      GXt_char4 = AV14Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apprc136.this.GXt_char4 = GXv_char3[0] ;
      AV14Carpeta = ((GXutil.strcmp("", AV14Carpeta)==0) ? GXt_char4 : AV14Carpeta) ;
      AV15NomInf = httpContext.getMessage( "AuditoriaAlbaranes", "") ;
      AV17File = GXutil.trim( AV14Carpeta) + "\\" + GXutil.trim( AV15NomInf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV17File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV27Stat = GXutil.deleteFile( AV17File) ;
      }
      GXt_int5 = AV25hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV17File, GXv_int6) ;
      apprc136.this.GXt_int5 = GXv_int6[0] ;
      AV25hnd = (short)(GXt_int5) ;
      AV16Control = httpContext.getMessage( " Auditoria Albaranes", "") + localUtil.dtoc( AV12Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " - " + localUtil.dtoc( AV13Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      GXt_int7 = (byte)(AV27Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV25hnd, AV16Control, GXv_int8) ;
      apprc136.this.GXt_int7 = GXv_int8[0] ;
      AV27Stat = GXt_int7 ;
      System.out.println( AV16Control );
      AV16Control = httpContext.getMessage( "N Albaran", "") + ";" + httpContext.getMessage( "E", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Kilos ALBBAR", "") + ";" + httpContext.getMessage( "Metros ALBBAR", "") + ";" + httpContext.getMessage( "Kilos LALPRD", "") + ";" + httpContext.getMessage( "Metros LALPRD", "") + ";" + httpContext.getMessage( "Metros LALTRZ", "") + ";" + httpContext.getMessage( "Kilos LALTRZ", "") + ";" + httpContext.getMessage( "Observaciones", "") ;
      GXt_int7 = (byte)(AV27Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV25hnd, AV16Control, GXv_int8) ;
      apprc136.this.GXt_int7 = GXv_int8[0] ;
      AV27Stat = GXt_int7 ;
      System.out.println( AV16Control );
      /* Using cursor P05MH2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV12Fec1, AV13Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05MH2_A396EmprCod[0] ;
         A30AlbProCod = P05MH2_A30AlbProCod[0] ;
         A34AlbProfch = P05MH2_A34AlbProfch[0] ;
         A1243GuiRemCli = P05MH2_A1243GuiRemCli[0] ;
         A33AlbProEst = P05MH2_A33AlbProEst[0] ;
         /* Using cursor P05MH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P05MH3_A130BarCodPar[0] ;
            A132BarCodReo = P05MH3_A132BarCodReo[0] ;
            A129BarCod = P05MH3_A129BarCod[0] ;
            A1261BarAlbKgmE = P05MH3_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P05MH3_A1263BarAlbMtrE[0] ;
            AV19BarAlbKgmE = A1261BarAlbKgmE ;
            AV18BarAlbMtrE = A1263BarAlbMtrE ;
            AV28Barcod = A129BarCod ;
            AV29Barcodreo = A132BarCodReo ;
            AV20AlbPKilEnt = DecimalUtil.doubleToDec(0) ;
            AV21AlbPMtrEnt = DecimalUtil.doubleToDec(0) ;
            /* Optimized group. */
            /* Using cursor P05MH4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            c27AlbPKilEnt = P05MH4_A27AlbPKilEnt[0] ;
            c1270AlbPMtrEnt = P05MH4_A1270AlbPMtrEnt[0] ;
            pr_default.close(2);
            AV20AlbPKilEnt = AV20AlbPKilEnt.add(c27AlbPKilEnt) ;
            AV21AlbPMtrEnt = AV21AlbPMtrEnt.add(c1270AlbPMtrEnt) ;
            /* End optimized group. */
            AV22AlbPTroMet = DecimalUtil.doubleToDec(0) ;
            AV23AlbPTroKil = DecimalUtil.doubleToDec(0) ;
            /* Optimized group. */
            /* Using cursor P05MH5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            c43AlbPTroMet = P05MH5_A43AlbPTroMet[0] ;
            c5303AlbPTroKil = P05MH5_A5303AlbPTroKil[0] ;
            pr_default.close(3);
            AV22AlbPTroMet = AV22AlbPTroMet.add(c43AlbPTroMet) ;
            AV23AlbPTroKil = AV23AlbPTroKil.add(c5303AlbPTroKil) ;
            /* End optimized group. */
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV24observaciones = (((DecimalUtil.compareTo(AV19BarAlbKgmE, AV23AlbPTroKil)!=0)&&(AV23AlbPTroKil.doubleValue()>0))||((DecimalUtil.compareTo(AV18BarAlbMtrE, AV22AlbPTroMet)!=0)&&(AV22AlbPTroMet.doubleValue()>0)) ? httpContext.getMessage( "ERROR Revisar Metros,Kilos", "") : " ") ;
         AV16Control = GXutil.str( A30AlbProCod, 10, 0) + ";" + GXutil.str( A33AlbProEst, 1, 0) + ";" + GXutil.str( AV28Barcod, 8, 0) + "-" + GXutil.str( AV29Barcodreo, 1, 0) + AV30Barcodpar + ";" + GXutil.str( AV19BarAlbKgmE, 9, 2) + ";" + GXutil.str( AV18BarAlbMtrE, 9, 2) + ";" + GXutil.str( AV20AlbPKilEnt, 9, 2) + ";" + GXutil.str( AV21AlbPMtrEnt, 9, 2) + ";" + GXutil.str( AV22AlbPTroMet, 9, 2) + ";" + GXutil.str( AV23AlbPTroKil, 9, 2) + ";" + AV24observaciones ;
         GXt_int7 = (byte)(AV27Stat) ;
         GXv_int8[0] = GXt_int7 ;
         new app.core.fputs(remoteHandle, context).execute( AV25hnd, AV16Control, GXv_int8) ;
         apprc136.this.GXt_int7 = GXv_int8[0] ;
         AV27Stat = GXt_int7 ;
         System.out.println( AV16Control );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = (byte)(AV27Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV25hnd, GXv_int8) ;
      apprc136.this.GXt_int7 = GXv_int8[0] ;
      AV27Stat = GXt_int7 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc136.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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
      AV14Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV15NomInf = "" ;
      AV17File = "" ;
      GXv_int6 = new long[1] ;
      AV16Control = "" ;
      AV12Fec1 = GXutil.nullDate() ;
      AV13Fec2 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P05MH2_A396EmprCod = new String[] {""} ;
      P05MH2_A30AlbProCod = new long[1] ;
      P05MH2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P05MH2_A1243GuiRemCli = new int[1] ;
      P05MH2_A33AlbProEst = new byte[1] ;
      A396EmprCod = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P05MH3_A396EmprCod = new String[] {""} ;
      P05MH3_A30AlbProCod = new long[1] ;
      P05MH3_A130BarCodPar = new String[] {""} ;
      P05MH3_A132BarCodReo = new byte[1] ;
      P05MH3_A129BarCod = new int[1] ;
      P05MH3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MH3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV19BarAlbKgmE = DecimalUtil.ZERO ;
      AV18BarAlbMtrE = DecimalUtil.ZERO ;
      AV30Barcodpar = "" ;
      AV20AlbPKilEnt = DecimalUtil.ZERO ;
      AV21AlbPMtrEnt = DecimalUtil.ZERO ;
      c27AlbPKilEnt = DecimalUtil.ZERO ;
      c1270AlbPMtrEnt = DecimalUtil.ZERO ;
      P05MH4_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MH4_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV22AlbPTroMet = DecimalUtil.ZERO ;
      AV23AlbPTroKil = DecimalUtil.ZERO ;
      c43AlbPTroMet = DecimalUtil.ZERO ;
      c5303AlbPTroKil = DecimalUtil.ZERO ;
      P05MH5_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MH5_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV24observaciones = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc136__default(),
         new Object[] {
             new Object[] {
            P05MH2_A396EmprCod, P05MH2_A30AlbProCod, P05MH2_A34AlbProfch, P05MH2_A1243GuiRemCli, P05MH2_A33AlbProEst
            }
            , new Object[] {
            P05MH3_A396EmprCod, P05MH3_A30AlbProCod, P05MH3_A130BarCodPar, P05MH3_A132BarCodReo, P05MH3_A129BarCod, P05MH3_A1261BarAlbKgmE, P05MH3_A1263BarAlbMtrE
            }
            , new Object[] {
            P05MH4_A27AlbPKilEnt, P05MH4_A1270AlbPMtrEnt
            }
            , new Object[] {
            P05MH5_A43AlbPTroMet, P05MH5_A5303AlbPTroKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte AV29Barcodreo ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short AV27Stat ;
   private short AV25hnd ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int AV28Barcod ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV19BarAlbKgmE ;
   private java.math.BigDecimal AV18BarAlbMtrE ;
   private java.math.BigDecimal AV20AlbPKilEnt ;
   private java.math.BigDecimal AV21AlbPMtrEnt ;
   private java.math.BigDecimal c27AlbPKilEnt ;
   private java.math.BigDecimal c1270AlbPMtrEnt ;
   private java.math.BigDecimal AV22AlbPTroMet ;
   private java.math.BigDecimal AV23AlbPTroKil ;
   private java.math.BigDecimal c43AlbPTroMet ;
   private java.math.BigDecimal c5303AlbPTroKil ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV14Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV15NomInf ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV30Barcodpar ;
   private String AV24observaciones ;
   private java.util.Date AV12Fec1 ;
   private java.util.Date AV13Fec2 ;
   private java.util.Date A34AlbProfch ;
   private boolean Cond_result ;
   private String AV17File ;
   private String AV16Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05MH2_A396EmprCod ;
   private long[] P05MH2_A30AlbProCod ;
   private java.util.Date[] P05MH2_A34AlbProfch ;
   private int[] P05MH2_A1243GuiRemCli ;
   private byte[] P05MH2_A33AlbProEst ;
   private String[] P05MH3_A396EmprCod ;
   private long[] P05MH3_A30AlbProCod ;
   private String[] P05MH3_A130BarCodPar ;
   private byte[] P05MH3_A132BarCodReo ;
   private int[] P05MH3_A129BarCod ;
   private java.math.BigDecimal[] P05MH3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P05MH3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P05MH4_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P05MH4_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P05MH5_A43AlbPTroMet ;
   private java.math.BigDecimal[] P05MH5_A5303AlbPTroKil ;
}

final  class apprc136__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05MH2", "SELECT EmprCod, AlbProCod, AlbProfch, GuiRemCli, AlbProEst FROM TXPCALPRD WHERE (EmprCod = ? and AlbProfch >= ?) AND (AlbProfch <= ?) ORDER BY EmprCod, AlbProfch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MH3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MH4", "SELECT SUM(AlbPKilEnt), SUM(AlbPMtrEnt) FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MH5", "SELECT SUM(AlbPTroMet), SUM(AlbPTroKil) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

