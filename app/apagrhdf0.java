package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apagrhdf0 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apagrhdf0 pgm = new apagrhdf0 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apagrhdf0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apagrhdf0.class ), "" );
   }

   public apagrhdf0( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Empieza.....", "") );
      /* Using cursor P01HY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01HY2_A130BarCodPar[0] ;
         A132BarCodReo = P01HY2_A132BarCodReo[0] ;
         A129BarCod = P01HY2_A129BarCod[0] ;
         A30AlbProCod = P01HY2_A30AlbProCod[0] ;
         A396EmprCod = P01HY2_A396EmprCod[0] ;
         A1261BarAlbKgmE = P01HY2_A1261BarAlbKgmE[0] ;
         AV12Kgs = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P01HY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2848AlbPieDsc = P01HY3_A2848AlbPieDsc[0] ;
            A1270AlbPMtrEnt = P01HY3_A1270AlbPMtrEnt[0] ;
            A27AlbPKilEnt = P01HY3_A27AlbPKilEnt[0] ;
            A200BarPieCod = P01HY3_A200BarPieCod[0] ;
            if ( ( A27AlbPKilEnt.doubleValue() > 0 ) && ( A1270AlbPMtrEnt.doubleValue() == 0 ) && ( GXutil.strcmp(A2848AlbPieDsc, " ") != 0 ) )
            {
               A27AlbPKilEnt = DecimalUtil.doubleToDec(0) ;
            }
            AV12Kgs = AV12Kgs.add(A27AlbPKilEnt) ;
            /* Using cursor P01HY4 */
            pr_default.execute(2, new Object[] {A27AlbPKilEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A1261BarAlbKgmE = AV12Kgs ;
         /* Using cursor P01HY5 */
         pr_default.execute(3, new Object[] {A1261BarAlbKgmE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01HY6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P01HY6_A396EmprCod[0] ;
         A8838CodBarPz = P01HY6_A8838CodBarPz[0] ;
         n8838CodBarPz = P01HY6_n8838CodBarPz[0] ;
         A3276BarMtsAut = P01HY6_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P01HY6_n3276BarMtsAut[0] ;
         A3275BarKgsAut = P01HY6_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P01HY6_n3275BarKgsAut[0] ;
         A170BarKilLan = P01HY6_A170BarKilLan[0] ;
         A200BarPieCod = P01HY6_A200BarPieCod[0] ;
         A130BarCodPar = P01HY6_A130BarCodPar[0] ;
         A132BarCodReo = P01HY6_A132BarCodReo[0] ;
         A129BarCod = P01HY6_A129BarCod[0] ;
         if ( ( A3275BarKgsAut.doubleValue() > 0 ) && ( A3276BarMtsAut.doubleValue() == 0 ) && ( GXutil.strcmp(A8838CodBarPz, " ") != 0 ) )
         {
            A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
            n3275BarKgsAut = false ;
            A170BarKilLan = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor P01HY7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, A170BarKilLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(4);
      }
      pr_default.close(4);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pagrhdf0.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apagrhdf0");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01HY2_A130BarCodPar = new String[] {""} ;
      P01HY2_A132BarCodReo = new byte[1] ;
      P01HY2_A129BarCod = new int[1] ;
      P01HY2_A30AlbProCod = new long[1] ;
      P01HY2_A396EmprCod = new String[] {""} ;
      P01HY2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV12Kgs = DecimalUtil.ZERO ;
      P01HY3_A396EmprCod = new String[] {""} ;
      P01HY3_A30AlbProCod = new long[1] ;
      P01HY3_A129BarCod = new int[1] ;
      P01HY3_A132BarCodReo = new byte[1] ;
      P01HY3_A130BarCodPar = new String[] {""} ;
      P01HY3_A2848AlbPieDsc = new String[] {""} ;
      P01HY3_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01HY3_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01HY3_A200BarPieCod = new String[] {""} ;
      A2848AlbPieDsc = "" ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P01HY6_A396EmprCod = new String[] {""} ;
      P01HY6_A8838CodBarPz = new String[] {""} ;
      P01HY6_n8838CodBarPz = new boolean[] {false} ;
      P01HY6_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01HY6_n3276BarMtsAut = new boolean[] {false} ;
      P01HY6_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01HY6_n3275BarKgsAut = new boolean[] {false} ;
      P01HY6_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01HY6_A200BarPieCod = new String[] {""} ;
      P01HY6_A130BarCodPar = new String[] {""} ;
      P01HY6_A132BarCodReo = new byte[1] ;
      P01HY6_A129BarCod = new int[1] ;
      A8838CodBarPz = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apagrhdf0__default(),
         new Object[] {
             new Object[] {
            P01HY2_A130BarCodPar, P01HY2_A132BarCodReo, P01HY2_A129BarCod, P01HY2_A30AlbProCod, P01HY2_A396EmprCod, P01HY2_A1261BarAlbKgmE
            }
            , new Object[] {
            P01HY3_A396EmprCod, P01HY3_A30AlbProCod, P01HY3_A129BarCod, P01HY3_A132BarCodReo, P01HY3_A130BarCodPar, P01HY3_A2848AlbPieDsc, P01HY3_A1270AlbPMtrEnt, P01HY3_A27AlbPKilEnt, P01HY3_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01HY6_A396EmprCod, P01HY6_A8838CodBarPz, P01HY6_n8838CodBarPz, P01HY6_A3276BarMtsAut, P01HY6_n3276BarMtsAut, P01HY6_A3275BarKgsAut, P01HY6_n3275BarKgsAut, P01HY6_A170BarKilLan, P01HY6_A200BarPieCod, P01HY6_A130BarCodPar,
            P01HY6_A132BarCodReo, P01HY6_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV12Kgs ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A170BarKilLan ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A2848AlbPieDsc ;
   private String A200BarPieCod ;
   private String A8838CodBarPz ;
   private boolean n8838CodBarPz ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private IDataStoreProvider pr_default ;
   private String[] P01HY2_A130BarCodPar ;
   private byte[] P01HY2_A132BarCodReo ;
   private int[] P01HY2_A129BarCod ;
   private long[] P01HY2_A30AlbProCod ;
   private String[] P01HY2_A396EmprCod ;
   private java.math.BigDecimal[] P01HY2_A1261BarAlbKgmE ;
   private String[] P01HY3_A396EmprCod ;
   private long[] P01HY3_A30AlbProCod ;
   private int[] P01HY3_A129BarCod ;
   private byte[] P01HY3_A132BarCodReo ;
   private String[] P01HY3_A130BarCodPar ;
   private String[] P01HY3_A2848AlbPieDsc ;
   private java.math.BigDecimal[] P01HY3_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P01HY3_A27AlbPKilEnt ;
   private String[] P01HY3_A200BarPieCod ;
   private String[] P01HY6_A396EmprCod ;
   private String[] P01HY6_A8838CodBarPz ;
   private boolean[] P01HY6_n8838CodBarPz ;
   private java.math.BigDecimal[] P01HY6_A3276BarMtsAut ;
   private boolean[] P01HY6_n3276BarMtsAut ;
   private java.math.BigDecimal[] P01HY6_A3275BarKgsAut ;
   private boolean[] P01HY6_n3275BarKgsAut ;
   private java.math.BigDecimal[] P01HY6_A170BarKilLan ;
   private String[] P01HY6_A200BarPieCod ;
   private String[] P01HY6_A130BarCodPar ;
   private byte[] P01HY6_A132BarCodReo ;
   private int[] P01HY6_A129BarCod ;
}

final  class apagrhdf0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01HY2", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = '001' ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01HY3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPieDsc, AlbPMtrEnt, AlbPKilEnt, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01HY4", "UPDATE TXPLALPRD SET AlbPKilEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P01HY5", "UPDATE TXPALBBAR SET BarAlbKgmE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P01HY6", "SELECT EmprCod, CodBarPz, BarMtsAut, BarKgsAut, BarKilLan, BarPieCod, BarCodPar, BarCodReo, BarCod FROM TXPBARPIE WHERE EmprCod = '001' ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01HY7", "UPDATE TXPBARPIE SET BarKgsAut=?, BarKilLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[8])[0] = rslt.getString(6, 9);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 9);
               return;
      }
   }

}

