package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputi025 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputi025 pgm = new aputi025 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputi025( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputi025.class ), "" );
   }

   public aputi025( int remoteHandle ,
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
      aputi025.this.AV10EmprCod = GXv_char1[0] ;
      aputi025.this.AV11EmprNom = GXv_char2[0] ;
      aputi025.this.AV8UsurCod = GXv_char3[0] ;
      AV12fec1 = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12fec1)) ? AV12fec1 : GXutil.today( )) ;
      /* Using cursor P05712 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV12fec1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05712_A396EmprCod[0] ;
         A130BarCodPar = P05712_A130BarCodPar[0] ;
         A132BarCodReo = P05712_A132BarCodReo[0] ;
         A129BarCod = P05712_A129BarCod[0] ;
         A159BarFecGen = P05712_A159BarFecGen[0] ;
         A252CliCod = P05712_A252CliCod[0] ;
         n252CliCod = P05712_n252CliCod[0] ;
         A212BarSer = P05712_A212BarSer[0] ;
         AV13Clicod = A252CliCod ;
         AV14Artcod = A212BarSer ;
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17BarKgm = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P05713 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A205BarPieMet = P05713_A205BarPieMet[0] ;
            A203BarPieKil = P05713_A203BarPieKil[0] ;
            A200BarPieCod = P05713_A200BarPieCod[0] ;
            A203BarPieKil = ((A203BarPieKil.doubleValue()==0)&&(AV15ArtRdto.doubleValue()>0) ? A205BarPieMet.divide(AV15ArtRdto, 18, java.math.RoundingMode.DOWN) : A203BarPieKil) ;
            AV17BarKgm = AV17BarKgm.add(A203BarPieKil) ;
            /* Using cursor P05714 */
            pr_default.execute(2, new Object[] {A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV16Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + "->" + httpContext.getMessage( " Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Kilos = ", "") + GXutil.str( AV17BarKgm, 9, 2) ;
         System.out.println( AV16Control );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV16Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + "->" + httpContext.getMessage( " FInalizacion ", "") ;
      System.out.println( AV16Control );
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV15ArtRdto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05715 */
      pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV13Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P05715_A252CliCod[0] ;
         n252CliCod = P05715_n252CliCod[0] ;
         A396EmprCod = P05715_A396EmprCod[0] ;
         A69ArtDsc = P05715_A69ArtDsc[0] ;
         n69ArtDsc = P05715_n69ArtDsc[0] ;
         A95ArtRen = P05715_A95ArtRen[0] ;
         n95ArtRen = P05715_n95ArtRen[0] ;
         A65ArtCod = P05715_A65ArtCod[0] ;
         AV15ArtRdto = A95ArtRen ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puti025.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputi025");
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
      GXv_char3 = new String[1] ;
      AV12fec1 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P05712_A396EmprCod = new String[] {""} ;
      P05712_A130BarCodPar = new String[] {""} ;
      P05712_A132BarCodReo = new byte[1] ;
      P05712_A129BarCod = new int[1] ;
      P05712_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05712_A252CliCod = new int[1] ;
      P05712_n252CliCod = new boolean[] {false} ;
      P05712_A212BarSer = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      AV14Artcod = "" ;
      AV17BarKgm = DecimalUtil.ZERO ;
      P05713_A396EmprCod = new String[] {""} ;
      P05713_A129BarCod = new int[1] ;
      P05713_A132BarCodReo = new byte[1] ;
      P05713_A130BarCodPar = new String[] {""} ;
      P05713_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05713_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05713_A200BarPieCod = new String[] {""} ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV15ArtRdto = DecimalUtil.ZERO ;
      AV16Control = "" ;
      P05715_A252CliCod = new int[1] ;
      P05715_n252CliCod = new boolean[] {false} ;
      P05715_A396EmprCod = new String[] {""} ;
      P05715_A69ArtDsc = new String[] {""} ;
      P05715_n69ArtDsc = new boolean[] {false} ;
      P05715_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05715_n95ArtRen = new boolean[] {false} ;
      P05715_A65ArtCod = new String[] {""} ;
      A69ArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputi025__default(),
         new Object[] {
             new Object[] {
            P05712_A396EmprCod, P05712_A130BarCodPar, P05712_A132BarCodReo, P05712_A129BarCod, P05712_A159BarFecGen, P05712_A252CliCod, P05712_n252CliCod, P05712_A212BarSer
            }
            , new Object[] {
            P05713_A396EmprCod, P05713_A129BarCod, P05713_A132BarCodReo, P05713_A130BarCodPar, P05713_A205BarPieMet, P05713_A203BarPieKil, P05713_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05715_A252CliCod, P05715_A396EmprCod, P05715_A69ArtDsc, P05715_n69ArtDsc, P05715_A95ArtRen, P05715_n95ArtRen, P05715_A65ArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV13Clicod ;
   private java.math.BigDecimal AV17BarKgm ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV15ArtRdto ;
   private java.math.BigDecimal A95ArtRen ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV14Artcod ;
   private String A200BarPieCod ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private java.util.Date AV12fec1 ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n69ArtDsc ;
   private boolean n95ArtRen ;
   private String AV16Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05712_A396EmprCod ;
   private String[] P05712_A130BarCodPar ;
   private byte[] P05712_A132BarCodReo ;
   private int[] P05712_A129BarCod ;
   private java.util.Date[] P05712_A159BarFecGen ;
   private int[] P05712_A252CliCod ;
   private boolean[] P05712_n252CliCod ;
   private String[] P05712_A212BarSer ;
   private String[] P05713_A396EmprCod ;
   private int[] P05713_A129BarCod ;
   private byte[] P05713_A132BarCodReo ;
   private String[] P05713_A130BarCodPar ;
   private java.math.BigDecimal[] P05713_A205BarPieMet ;
   private java.math.BigDecimal[] P05713_A203BarPieKil ;
   private String[] P05713_A200BarPieCod ;
   private int[] P05715_A252CliCod ;
   private boolean[] P05715_n252CliCod ;
   private String[] P05715_A396EmprCod ;
   private String[] P05715_A69ArtDsc ;
   private boolean[] P05715_n69ArtDsc ;
   private java.math.BigDecimal[] P05715_A95ArtRen ;
   private boolean[] P05715_n95ArtRen ;
   private String[] P05715_A65ArtCod ;
}

final  class aputi025__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05712", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFecGen, CliCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarFecGen >= ? ORDER BY EmprCod, BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05713", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieMet, BarPieKil, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05714", "UPDATE TXPBARPIE SET BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P05715", "SELECT CliCod, EmprCod, ArtDsc, ArtRen, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

