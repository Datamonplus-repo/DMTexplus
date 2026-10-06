package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputcdib extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputcdib pgm = new aputcdib (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputcdib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputcdib.class ), "" );
   }

   public aputcdib( int remoteHandle ,
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
      /* Using cursor P03LL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1014DibInt = P03LL2_A1014DibInt[0] ;
         A252CliCod = P03LL2_A252CliCod[0] ;
         A1013DibCli = P03LL2_A1013DibCli[0] ;
         A396EmprCod = P03LL2_A396EmprCod[0] ;
         A1824DibUltCil = P03LL2_A1824DibUltCil[0] ;
         n1824DibUltCil = P03LL2_n1824DibUltCil[0] ;
         AV8DibLinCil = (short)(0) ;
         /* Using cursor P03LL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1808DibOrdCil = P03LL3_A1808DibOrdCil[0] ;
            n1808DibOrdCil = P03LL3_n1808DibOrdCil[0] ;
            A1807DibLinCil = P03LL3_A1807DibLinCil[0] ;
            AV8DibLinCil = A1807DibLinCil ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A1824DibUltCil = AV8DibLinCil ;
         n1824DibUltCil = false ;
         Gx_msg = httpContext.getMessage( "Actualizando.... ", "") + GXutil.str( AV8DibLinCil, 4, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P03LL4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n1824DibUltCil), Short.valueOf(A1824DibUltCil), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putcdib.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputcdib");
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
      P03LL2_A1014DibInt = new int[1] ;
      P03LL2_A252CliCod = new int[1] ;
      P03LL2_A1013DibCli = new String[] {""} ;
      P03LL2_A396EmprCod = new String[] {""} ;
      P03LL2_A1824DibUltCil = new short[1] ;
      P03LL2_n1824DibUltCil = new boolean[] {false} ;
      A1013DibCli = "" ;
      A396EmprCod = "" ;
      P03LL3_A396EmprCod = new String[] {""} ;
      P03LL3_A1013DibCli = new String[] {""} ;
      P03LL3_A252CliCod = new int[1] ;
      P03LL3_A1014DibInt = new int[1] ;
      P03LL3_A1808DibOrdCil = new byte[1] ;
      P03LL3_n1808DibOrdCil = new boolean[] {false} ;
      P03LL3_A1807DibLinCil = new short[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputcdib__default(),
         new Object[] {
             new Object[] {
            P03LL2_A1014DibInt, P03LL2_A252CliCod, P03LL2_A1013DibCli, P03LL2_A396EmprCod, P03LL2_A1824DibUltCil, P03LL2_n1824DibUltCil
            }
            , new Object[] {
            P03LL3_A396EmprCod, P03LL3_A1013DibCli, P03LL3_A252CliCod, P03LL3_A1014DibInt, P03LL3_A1808DibOrdCil, P03LL3_n1808DibOrdCil, P03LL3_A1807DibLinCil
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1808DibOrdCil ;
   private short A1824DibUltCil ;
   private short AV8DibLinCil ;
   private short A1807DibLinCil ;
   private short Gx_err ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private boolean n1824DibUltCil ;
   private boolean n1808DibOrdCil ;
   private IDataStoreProvider pr_default ;
   private int[] P03LL2_A1014DibInt ;
   private int[] P03LL2_A252CliCod ;
   private String[] P03LL2_A1013DibCli ;
   private String[] P03LL2_A396EmprCod ;
   private short[] P03LL2_A1824DibUltCil ;
   private boolean[] P03LL2_n1824DibUltCil ;
   private String[] P03LL3_A396EmprCod ;
   private String[] P03LL3_A1013DibCli ;
   private int[] P03LL3_A252CliCod ;
   private int[] P03LL3_A1014DibInt ;
   private byte[] P03LL3_A1808DibOrdCil ;
   private boolean[] P03LL3_n1808DibOrdCil ;
   private short[] P03LL3_A1807DibLinCil ;
}

final  class aputcdib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03LL2", "SELECT DibInt, CliCod, DibCli, EmprCod, DibUltCil FROM TXPCDIBUJ WHERE (EmprCod = '001') AND (DibUltCil = 0) ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03LL3", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibOrdCil, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03LL4", "UPDATE TXPCDIBUJ SET DibUltCil=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
      }
   }

}

