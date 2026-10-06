package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmd2133 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmd2133 pgm = new apmd2133 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apmd2133( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmd2133.class ), "" );
   }

   public apmd2133( int remoteHandle ,
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
      AV15Emprcod = "001" ;
      /* Using cursor P044H2 */
      pr_default.execute(0, new Object[] {AV15Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P044H2_A396EmprCod[0] ;
         A8396PMDEntKgm = P044H2_A8396PMDEntKgm[0] ;
         A8393PMDColNum = P044H2_A8393PMDColNum[0] ;
         A8391PMDCod = P044H2_A8391PMDCod[0] ;
         A252CliCod = P044H2_A252CliCod[0] ;
         n252CliCod = P044H2_n252CliCod[0] ;
         AV16PMDEntKgm = A8396PMDEntKgm ;
         AV17Clicod = A252CliCod ;
         AV18PMDCod = A8391PMDCod ;
         AV19PMDColNum = A8393PMDColNum ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         Gx_msg = httpContext.getMessage( "Procesando...", "") + httpContext.getMessage( "Cliente=", "") + GXutil.str( AV17Clicod, 6, 0) + httpContext.getMessage( " Prog=", "") + GXutil.str( AV18PMDCod, 4, 0) + httpContext.getMessage( " Linha=", "") + GXutil.str( AV19PMDColNum, 6, 0) ;
         System.out.println( Gx_msg );
         A8396PMDEntKgm = AV20BarKgm ;
         /* Using cursor P044H3 */
         pr_default.execute(1, new Object[] {A8396PMDEntKgm, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV20BarKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P044H5 */
      pr_default.execute(2, new Object[] {AV15Emprcod, Short.valueOf(AV18PMDCod), Integer.valueOf(AV19PMDColNum), Integer.valueOf(AV17Clicod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A129BarCod = P044H5_A129BarCod[0] ;
         A132BarCodReo = P044H5_A132BarCodReo[0] ;
         A130BarCodPar = P044H5_A130BarCodPar[0] ;
         A396EmprCod = P044H5_A396EmprCod[0] ;
         A252CliCod = P044H5_A252CliCod[0] ;
         n252CliCod = P044H5_n252CliCod[0] ;
         A3311BarManCod1 = P044H5_A3311BarManCod1[0] ;
         A4836BarAudSup = P044H5_A4836BarAudSup[0] ;
         A159BarFecGen = P044H5_A159BarFecGen[0] ;
         A166BarKgm = P044H5_A166BarKgm[0] ;
         n166BarKgm = P044H5_n166BarKgm[0] ;
         A166BarKgm = P044H5_A166BarKgm[0] ;
         n166BarKgm = P044H5_n166BarKgm[0] ;
         AV20BarKgm = AV20BarKgm.add(A166BarKgm) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmd2133.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apmd2133");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Emprcod = "" ;
      scmdbuf = "" ;
      P044H2_A396EmprCod = new String[] {""} ;
      P044H2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044H2_A8393PMDColNum = new int[1] ;
      P044H2_A8391PMDCod = new short[1] ;
      P044H2_A252CliCod = new int[1] ;
      P044H2_n252CliCod = new boolean[] {false} ;
      A396EmprCod = "" ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      AV16PMDEntKgm = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV20BarKgm = DecimalUtil.ZERO ;
      P044H5_A129BarCod = new int[1] ;
      P044H5_A132BarCodReo = new byte[1] ;
      P044H5_A130BarCodPar = new String[] {""} ;
      P044H5_A396EmprCod = new String[] {""} ;
      P044H5_A252CliCod = new int[1] ;
      P044H5_n252CliCod = new boolean[] {false} ;
      P044H5_A3311BarManCod1 = new short[1] ;
      P044H5_A4836BarAudSup = new int[1] ;
      P044H5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P044H5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044H5_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apmd2133__default(),
         new Object[] {
             new Object[] {
            P044H2_A396EmprCod, P044H2_A8396PMDEntKgm, P044H2_A8393PMDColNum, P044H2_A8391PMDCod, P044H2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P044H5_A129BarCod, P044H5_A132BarCodReo, P044H5_A130BarCodPar, P044H5_A396EmprCod, P044H5_A252CliCod, P044H5_n252CliCod, P044H5_A3311BarManCod1, P044H5_A4836BarAudSup, P044H5_A159BarFecGen, P044H5_A166BarKgm,
            P044H5_n166BarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A8391PMDCod ;
   private short AV18PMDCod ;
   private short A3311BarManCod1 ;
   private short Gx_err ;
   private int A8393PMDColNum ;
   private int A252CliCod ;
   private int AV17Clicod ;
   private int AV19PMDColNum ;
   private int A129BarCod ;
   private int A4836BarAudSup ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal AV16PMDEntKgm ;
   private java.math.BigDecimal AV20BarKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV15Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String A130BarCodPar ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n166BarKgm ;
   private IDataStoreProvider pr_default ;
   private String[] P044H2_A396EmprCod ;
   private java.math.BigDecimal[] P044H2_A8396PMDEntKgm ;
   private int[] P044H2_A8393PMDColNum ;
   private short[] P044H2_A8391PMDCod ;
   private int[] P044H2_A252CliCod ;
   private boolean[] P044H2_n252CliCod ;
   private int[] P044H5_A129BarCod ;
   private byte[] P044H5_A132BarCodReo ;
   private String[] P044H5_A130BarCodPar ;
   private String[] P044H5_A396EmprCod ;
   private int[] P044H5_A252CliCod ;
   private boolean[] P044H5_n252CliCod ;
   private short[] P044H5_A3311BarManCod1 ;
   private int[] P044H5_A4836BarAudSup ;
   private java.util.Date[] P044H5_A159BarFecGen ;
   private java.math.BigDecimal[] P044H5_A166BarKgm ;
   private boolean[] P044H5_n166BarKgm ;
}

final  class apmd2133__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P044H2", "SELECT EmprCod, PMDEntKgm, PMDColNum, PMDCod, CliCod FROM TXPProMD1 WHERE EmprCod = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P044H3", "UPDATE TXPProMD1 SET PMDEntKgm=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
         ,new ForEachCursor("P044H5", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.CliCod, T1.BarManCod1, T1.BarAudSup, T1.BarFecGen, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarManCod1 = ? and T1.BarAudSup = ?) AND (EXTRACT(YEAR FROM T1.BarFecGen) >= 2009) AND (T1.CliCod = ?) ORDER BY T1.EmprCod, T1.BarManCod1, T1.BarAudSup ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

