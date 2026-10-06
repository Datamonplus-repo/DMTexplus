package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aphisoe1 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aphisoe1 pgm = new aphisoe1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aphisoe1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aphisoe1.class ), "" );
   }

   public aphisoe1( int remoteHandle ,
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
      AV13Fechai = localUtil.ctod( "01/01/2001", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV14Fechaf = localUtil.ctod( "31/12/2010", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      /* Using cursor P03QQ2 */
      pr_default.execute(0, new Object[] {AV13Fechai, AV14Fechaf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P03QQ2_A129BarCod[0] ;
         A132BarCodReo = P03QQ2_A132BarCodReo[0] ;
         A130BarCodPar = P03QQ2_A130BarCodPar[0] ;
         A396EmprCod = P03QQ2_A396EmprCod[0] ;
         A4400BarSitEst = P03QQ2_A4400BarSitEst[0] ;
         A2070BarFecEst = P03QQ2_A2070BarFecEst[0] ;
         n2070BarFecEst = P03QQ2_n2070BarFecEst[0] ;
         A5122BarComFC = P03QQ2_A5122BarComFC[0] ;
         n5122BarComFC = P03QQ2_n5122BarComFC[0] ;
         A2524DisComLin = P03QQ2_A2524DisComLin[0] ;
         A1056DisComCod = P03QQ2_A1056DisComCod[0] ;
         A1032FonCod = P03QQ2_A1032FonCod[0] ;
         A4400BarSitEst = P03QQ2_A4400BarSitEst[0] ;
         AV12Anyo = (short)(GXutil.year( A5122BarComFC)) ;
         if ( AV12Anyo == 0 )
         {
            A5122BarComFC = A2070BarFecEst ;
            n5122BarComFC = false ;
         }
         Gx_msg = httpContext.getMessage( "Anyo= ", "") + GXutil.str( AV12Anyo, 4, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P03QQ3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5122BarComFC), A5122BarComFC, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(phisoe1.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aphisoe1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Fechai = GXutil.nullDate() ;
      AV14Fechaf = GXutil.nullDate() ;
      scmdbuf = "" ;
      P03QQ2_A129BarCod = new int[1] ;
      P03QQ2_A132BarCodReo = new byte[1] ;
      P03QQ2_A130BarCodPar = new String[] {""} ;
      P03QQ2_A396EmprCod = new String[] {""} ;
      P03QQ2_A4400BarSitEst = new byte[1] ;
      P03QQ2_A2070BarFecEst = new java.util.Date[] {GXutil.nullDate()} ;
      P03QQ2_n2070BarFecEst = new boolean[] {false} ;
      P03QQ2_A5122BarComFC = new java.util.Date[] {GXutil.nullDate()} ;
      P03QQ2_n5122BarComFC = new boolean[] {false} ;
      P03QQ2_A2524DisComLin = new byte[1] ;
      P03QQ2_A1056DisComCod = new String[] {""} ;
      P03QQ2_A1032FonCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A2070BarFecEst = GXutil.nullDate() ;
      A5122BarComFC = GXutil.nullDate() ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aphisoe1__default(),
         new Object[] {
             new Object[] {
            P03QQ2_A129BarCod, P03QQ2_A132BarCodReo, P03QQ2_A130BarCodPar, P03QQ2_A396EmprCod, P03QQ2_A4400BarSitEst, P03QQ2_A2070BarFecEst, P03QQ2_n2070BarFecEst, P03QQ2_A5122BarComFC, P03QQ2_n5122BarComFC, P03QQ2_A2524DisComLin,
            P03QQ2_A1056DisComCod, P03QQ2_A1032FonCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A4400BarSitEst ;
   private byte A2524DisComLin ;
   private short AV12Anyo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String Gx_msg ;
   private java.util.Date AV13Fechai ;
   private java.util.Date AV14Fechaf ;
   private java.util.Date A2070BarFecEst ;
   private java.util.Date A5122BarComFC ;
   private boolean n2070BarFecEst ;
   private boolean n5122BarComFC ;
   private IDataStoreProvider pr_default ;
   private int[] P03QQ2_A129BarCod ;
   private byte[] P03QQ2_A132BarCodReo ;
   private String[] P03QQ2_A130BarCodPar ;
   private String[] P03QQ2_A396EmprCod ;
   private byte[] P03QQ2_A4400BarSitEst ;
   private java.util.Date[] P03QQ2_A2070BarFecEst ;
   private boolean[] P03QQ2_n2070BarFecEst ;
   private java.util.Date[] P03QQ2_A5122BarComFC ;
   private boolean[] P03QQ2_n5122BarComFC ;
   private byte[] P03QQ2_A2524DisComLin ;
   private String[] P03QQ2_A1056DisComCod ;
   private String[] P03QQ2_A1032FonCod ;
}

final  class aphisoe1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03QQ2", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T2.BarSitEst, T1.BarFecEst, T1.BarComFC, T1.DisComLin, T1.DisComCod, T1.FonCod FROM (TXPBARCOM T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = '001' and T1.BarFecEst >= ?) AND (T2.BarSitEst = 5) AND (T1.BarFecEst <= ?) ORDER BY T1.EmprCod, T1.BarFecEst ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03QQ3", "UPDATE TXPBARCOM SET BarComFC=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
      }
   }

}

