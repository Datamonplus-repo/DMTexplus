package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuhid01 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuhid01 pgm = new apuhid01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuhid01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuhid01.class ), "" );
   }

   public apuhid01( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "INICIO PROCESO ACTUALIZACION DE BARFECSAL", ""));
      /* Using cursor P01U42 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A32AlbProEsp = P01U42_A32AlbProEsp[0] ;
         A30AlbProCod = P01U42_A30AlbProCod[0] ;
         A130BarCodPar = P01U42_A130BarCodPar[0] ;
         A132BarCodReo = P01U42_A132BarCodReo[0] ;
         A129BarCod = P01U42_A129BarCod[0] ;
         A396EmprCod = P01U42_A396EmprCod[0] ;
         /* Using cursor P01U43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A161BarFecSal = P01U43_A161BarFecSal[0] ;
         /* Using cursor P01U44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A34AlbProfch = P01U44_A34AlbProfch[0] ;
         AV23AlbProFch = A34AlbProfch ;
         if ( GXutil.resetTime(AV23AlbProFch).after( GXutil.resetTime( A161BarFecSal )) )
         {
            A161BarFecSal = AV23AlbProFch ;
         }
         AV28Texto = httpContext.getMessage( "Hdr. ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar + httpContext.getMessage( " Alb. ", "") + GXutil.str( A30AlbProCod, 10, 0) + httpContext.getMessage( " Fecha: ", "") + localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         System.out.println( AV28Texto );
         /* Using cursor P01U45 */
         pr_default.execute(3, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "FIN PROCESO", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puhid01.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apuhid01");
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
      P01U42_A32AlbProEsp = new byte[1] ;
      P01U42_A30AlbProCod = new long[1] ;
      P01U42_A130BarCodPar = new String[] {""} ;
      P01U42_A132BarCodReo = new byte[1] ;
      P01U42_A129BarCod = new int[1] ;
      P01U42_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P01U43_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A161BarFecSal = GXutil.nullDate() ;
      P01U44_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      AV23AlbProFch = GXutil.nullDate() ;
      AV28Texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuhid01__default(),
         new Object[] {
             new Object[] {
            P01U42_A32AlbProEsp, P01U42_A30AlbProCod, P01U42_A130BarCodPar, P01U42_A132BarCodReo, P01U42_A129BarCod, P01U42_A396EmprCod
            }
            , new Object[] {
            P01U43_A161BarFecSal
            }
            , new Object[] {
            P01U44_A34AlbProfch
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV28Texto ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV23AlbProFch ;
   private IDataStoreProvider pr_default ;
   private byte[] P01U42_A32AlbProEsp ;
   private long[] P01U42_A30AlbProCod ;
   private String[] P01U42_A130BarCodPar ;
   private byte[] P01U42_A132BarCodReo ;
   private int[] P01U42_A129BarCod ;
   private String[] P01U42_A396EmprCod ;
   private java.util.Date[] P01U43_A161BarFecSal ;
   private java.util.Date[] P01U44_A34AlbProfch ;
}

final  class apuhid01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01U42", "SELECT AlbProEsp, AlbProCod, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPALBBAR ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01U43", "SELECT BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01U44", "SELECT AlbProfch FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01U45", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

