package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apordexp extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apordexp pgm = new apordexp (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apordexp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apordexp.class ), "" );
   }

   public apordexp( int remoteHandle ,
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
      AV16EmprCod = "001" ;
      System.out.println( httpContext.getMessage( "Inicio Actualizacion Items LALPRD....", "") );
      /* Using cursor P00HZ2 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00HZ2_A396EmprCod[0] ;
         A1691BarPieAnc = P00HZ2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P00HZ2_n1691BarPieAnc[0] ;
         A3117AlbPreAnc = P00HZ2_A3117AlbPreAnc[0] ;
         n3117AlbPreAnc = P00HZ2_n3117AlbPreAnc[0] ;
         A9846BarPieAncc = P00HZ2_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P00HZ2_n9846BarPieAncc[0] ;
         A10131AlbPreAncc = P00HZ2_A10131AlbPreAncc[0] ;
         n10131AlbPreAncc = P00HZ2_n10131AlbPreAncc[0] ;
         A9984BarPiePda = P00HZ2_A9984BarPiePda[0] ;
         n9984BarPiePda = P00HZ2_n9984BarPiePda[0] ;
         A10132AlbPrePgd = P00HZ2_A10132AlbPrePgd[0] ;
         n10132AlbPrePgd = P00HZ2_n10132AlbPrePgd[0] ;
         A200BarPieCod = P00HZ2_A200BarPieCod[0] ;
         A130BarCodPar = P00HZ2_A130BarCodPar[0] ;
         A132BarCodReo = P00HZ2_A132BarCodReo[0] ;
         A129BarCod = P00HZ2_A129BarCod[0] ;
         A30AlbProCod = P00HZ2_A30AlbProCod[0] ;
         A1691BarPieAnc = P00HZ2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P00HZ2_n1691BarPieAnc[0] ;
         A9846BarPieAncc = P00HZ2_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P00HZ2_n9846BarPieAncc[0] ;
         A9984BarPiePda = P00HZ2_A9984BarPiePda[0] ;
         n9984BarPiePda = P00HZ2_n9984BarPiePda[0] ;
         A3117AlbPreAnc = A1691BarPieAnc ;
         n3117AlbPreAnc = false ;
         A10131AlbPreAncc = A9846BarPieAncc ;
         n10131AlbPreAncc = false ;
         A10132AlbPrePgd = A9984BarPiePda ;
         n10132AlbPrePgd = false ;
         /* Using cursor P00HZ3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n3117AlbPreAnc), Short.valueOf(A3117AlbPreAnc), Boolean.valueOf(n10131AlbPreAncc), Short.valueOf(A10131AlbPreAncc), Boolean.valueOf(n10132AlbPrePgd), A10132AlbPrePgd, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Actualizacion Items LALPRD....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pordexp.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apordexp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16EmprCod = "" ;
      scmdbuf = "" ;
      P00HZ2_A396EmprCod = new String[] {""} ;
      P00HZ2_A1691BarPieAnc = new short[1] ;
      P00HZ2_n1691BarPieAnc = new boolean[] {false} ;
      P00HZ2_A3117AlbPreAnc = new short[1] ;
      P00HZ2_n3117AlbPreAnc = new boolean[] {false} ;
      P00HZ2_A9846BarPieAncc = new short[1] ;
      P00HZ2_n9846BarPieAncc = new boolean[] {false} ;
      P00HZ2_A10131AlbPreAncc = new short[1] ;
      P00HZ2_n10131AlbPreAncc = new boolean[] {false} ;
      P00HZ2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HZ2_n9984BarPiePda = new boolean[] {false} ;
      P00HZ2_A10132AlbPrePgd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HZ2_n10132AlbPrePgd = new boolean[] {false} ;
      P00HZ2_A200BarPieCod = new String[] {""} ;
      P00HZ2_A130BarCodPar = new String[] {""} ;
      P00HZ2_A132BarCodReo = new byte[1] ;
      P00HZ2_A129BarCod = new int[1] ;
      P00HZ2_A30AlbProCod = new long[1] ;
      A396EmprCod = "" ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A10132AlbPrePgd = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apordexp__default(),
         new Object[] {
             new Object[] {
            P00HZ2_A396EmprCod, P00HZ2_A1691BarPieAnc, P00HZ2_n1691BarPieAnc, P00HZ2_A3117AlbPreAnc, P00HZ2_n3117AlbPreAnc, P00HZ2_A9846BarPieAncc, P00HZ2_n9846BarPieAncc, P00HZ2_A10131AlbPreAncc, P00HZ2_n10131AlbPreAncc, P00HZ2_A9984BarPiePda,
            P00HZ2_n9984BarPiePda, P00HZ2_A10132AlbPrePgd, P00HZ2_n10132AlbPrePgd, P00HZ2_A200BarPieCod, P00HZ2_A130BarCodPar, P00HZ2_A132BarCodReo, P00HZ2_A129BarCod, P00HZ2_A30AlbProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1691BarPieAnc ;
   private short A3117AlbPreAnc ;
   private short A9846BarPieAncc ;
   private short A10131AlbPreAncc ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A10132AlbPrePgd ;
   private String AV16EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private boolean n1691BarPieAnc ;
   private boolean n3117AlbPreAnc ;
   private boolean n9846BarPieAncc ;
   private boolean n10131AlbPreAncc ;
   private boolean n9984BarPiePda ;
   private boolean n10132AlbPrePgd ;
   private IDataStoreProvider pr_default ;
   private String[] P00HZ2_A396EmprCod ;
   private short[] P00HZ2_A1691BarPieAnc ;
   private boolean[] P00HZ2_n1691BarPieAnc ;
   private short[] P00HZ2_A3117AlbPreAnc ;
   private boolean[] P00HZ2_n3117AlbPreAnc ;
   private short[] P00HZ2_A9846BarPieAncc ;
   private boolean[] P00HZ2_n9846BarPieAncc ;
   private short[] P00HZ2_A10131AlbPreAncc ;
   private boolean[] P00HZ2_n10131AlbPreAncc ;
   private java.math.BigDecimal[] P00HZ2_A9984BarPiePda ;
   private boolean[] P00HZ2_n9984BarPiePda ;
   private java.math.BigDecimal[] P00HZ2_A10132AlbPrePgd ;
   private boolean[] P00HZ2_n10132AlbPrePgd ;
   private String[] P00HZ2_A200BarPieCod ;
   private String[] P00HZ2_A130BarCodPar ;
   private byte[] P00HZ2_A132BarCodReo ;
   private int[] P00HZ2_A129BarCod ;
   private long[] P00HZ2_A30AlbProCod ;
}

final  class apordexp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HZ2", "SELECT T1.EmprCod, T2.BarPieAnc, T1.AlbPreAnc, T2.BarPieAncc, T1.AlbPreAncc, T2.BarPiePda, T1.AlbPrePgd, T1.BarPieCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod FROM (TXPLALPRD T1 INNER JOIN TXPBARPIE T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.BarPieCod = T1.BarPieCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00HZ3", "UPDATE TXPLALPRD SET AlbPreAnc=?, AlbPreAncc=?, AlbPrePgd=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((long[]) buf[17])[0] = rslt.getLong(12);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setLong(5, ((Number) parms[7]).longValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 9);
               return;
      }
   }

}

