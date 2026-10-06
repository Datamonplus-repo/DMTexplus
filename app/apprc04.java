package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc04 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc04 pgm = new apprc04 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc04.class ), "" );
   }

   public apprc04( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      AV11OgsCod1 = 1 ;
      AV10OgsCod2 = 99999999 ;
      /* Using cursor P048S2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV11OgsCod1), Integer.valueOf(AV10OgsCod2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P048S2_A129BarCod[0] ;
         n129BarCod = P048S2_n129BarCod[0] ;
         A132BarCodReo = P048S2_A132BarCodReo[0] ;
         n132BarCodReo = P048S2_n132BarCodReo[0] ;
         A130BarCodPar = P048S2_A130BarCodPar[0] ;
         n130BarCodPar = P048S2_n130BarCodPar[0] ;
         A7049OGSCod = P048S2_A7049OGSCod[0] ;
         A396EmprCod = P048S2_A396EmprCod[0] ;
         A1798BarDibCli = P048S2_A1798BarDibCli[0] ;
         A10885OGSDibC = P048S2_A10885OGSDibC[0] ;
         n10885OGSDibC = P048S2_n10885OGSDibC[0] ;
         A1799BarDibInt = P048S2_A1799BarDibInt[0] ;
         A10886OGSDibI = P048S2_A10886OGSDibI[0] ;
         n10886OGSDibI = P048S2_n10886OGSDibI[0] ;
         A1798BarDibCli = P048S2_A1798BarDibCli[0] ;
         A1799BarDibInt = P048S2_A1799BarDibInt[0] ;
         A10885OGSDibC = A1798BarDibCli ;
         n10885OGSDibC = false ;
         A10886OGSDibI = A1799BarDibInt ;
         n10886OGSDibI = false ;
         Gx_msg = httpContext.getMessage( "Procesando orden ", "") + GXutil.str( A7049OGSCod, 8, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P048S3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10885OGSDibC), A10885OGSDibC, Boolean.valueOf(n10886OGSDibI), Integer.valueOf(A10886OGSDibI), A396EmprCod, Integer.valueOf(A7049OGSCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc04.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc04");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      P048S2_A129BarCod = new int[1] ;
      P048S2_n129BarCod = new boolean[] {false} ;
      P048S2_A132BarCodReo = new byte[1] ;
      P048S2_n132BarCodReo = new boolean[] {false} ;
      P048S2_A130BarCodPar = new String[] {""} ;
      P048S2_n130BarCodPar = new boolean[] {false} ;
      P048S2_A7049OGSCod = new int[1] ;
      P048S2_A396EmprCod = new String[] {""} ;
      P048S2_A1798BarDibCli = new String[] {""} ;
      P048S2_A10885OGSDibC = new String[] {""} ;
      P048S2_n10885OGSDibC = new boolean[] {false} ;
      P048S2_A1799BarDibInt = new int[1] ;
      P048S2_A10886OGSDibI = new int[1] ;
      P048S2_n10886OGSDibI = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1798BarDibCli = "" ;
      A10885OGSDibC = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc04__default(),
         new Object[] {
             new Object[] {
            P048S2_A129BarCod, P048S2_n129BarCod, P048S2_A132BarCodReo, P048S2_n132BarCodReo, P048S2_A130BarCodPar, P048S2_n130BarCodPar, P048S2_A7049OGSCod, P048S2_A396EmprCod, P048S2_A1798BarDibCli, P048S2_A10885OGSDibC,
            P048S2_n10885OGSDibC, P048S2_A1799BarDibInt, P048S2_A10886OGSDibI, P048S2_n10886OGSDibI
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
   private int AV11OgsCod1 ;
   private int AV10OgsCod2 ;
   private int A129BarCod ;
   private int A7049OGSCod ;
   private int A1799BarDibInt ;
   private int A10886OGSDibI ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A1798BarDibCli ;
   private String A10885OGSDibC ;
   private String Gx_msg ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n10885OGSDibC ;
   private boolean n10886OGSDibI ;
   private IDataStoreProvider pr_default ;
   private int[] P048S2_A129BarCod ;
   private boolean[] P048S2_n129BarCod ;
   private byte[] P048S2_A132BarCodReo ;
   private boolean[] P048S2_n132BarCodReo ;
   private String[] P048S2_A130BarCodPar ;
   private boolean[] P048S2_n130BarCodPar ;
   private int[] P048S2_A7049OGSCod ;
   private String[] P048S2_A396EmprCod ;
   private String[] P048S2_A1798BarDibCli ;
   private String[] P048S2_A10885OGSDibC ;
   private boolean[] P048S2_n10885OGSDibC ;
   private int[] P048S2_A1799BarDibInt ;
   private int[] P048S2_A10886OGSDibI ;
   private boolean[] P048S2_n10886OGSDibI ;
}

final  class apprc04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P048S2", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.OGSCod, T1.EmprCod, T2.BarDibCli, T1.OGSDibC, T2.BarDibInt, T1.OGSDibI FROM (TXPShaGra T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.OGSCod >= ?) AND (T1.OGSCod <= ?) ORDER BY T1.EmprCod, T1.OGSCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048S3", "UPDATE TXPShaGra SET OGSDibC=?, OGSDibI=?  WHERE EmprCod = ? AND OGSCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShaGra")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

