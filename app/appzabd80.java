package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appzabd80 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appzabd80 pgm = new appzabd80 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appzabd80( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appzabd80.class ), "" );
   }

   public appzabd80( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando....", "") );
      /* Using cursor P03OO2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A148BarEstReo = P03OO2_A148BarEstReo[0] ;
         A130BarCodPar = P03OO2_A130BarCodPar[0] ;
         A132BarCodReo = P03OO2_A132BarCodReo[0] ;
         A129BarCod = P03OO2_A129BarCod[0] ;
         A396EmprCod = P03OO2_A396EmprCod[0] ;
         A5034BarEstTip = P03OO2_A5034BarEstTip[0] ;
         if ( GXutil.strcmp(A5034BarEstTip, httpContext.getMessage( "A", "")) == 0 )
         {
            /* Using cursor P03OO3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A8907PzaB80 = P03OO3_A8907PzaB80[0] ;
               n8907PzaB80 = P03OO3_n8907PzaB80[0] ;
               A200BarPieCod = P03OO3_A200BarPieCod[0] ;
               if ( (GXutil.strcmp("", A8907PzaB80)==0) )
               {
                  A8907PzaB80 = A200BarPieCod ;
                  n8907PzaB80 = false ;
               }
               /* Using cursor P03OO4 */
               pr_default.execute(2, new Object[] {Boolean.valueOf(n8907PzaB80), A8907PzaB80, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Proceso....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppzabd80.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "appzabd80");
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
      P03OO2_A148BarEstReo = new byte[1] ;
      P03OO2_A130BarCodPar = new String[] {""} ;
      P03OO2_A132BarCodReo = new byte[1] ;
      P03OO2_A129BarCod = new int[1] ;
      P03OO2_A396EmprCod = new String[] {""} ;
      P03OO2_A5034BarEstTip = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A5034BarEstTip = "" ;
      P03OO3_A396EmprCod = new String[] {""} ;
      P03OO3_A129BarCod = new int[1] ;
      P03OO3_A132BarCodReo = new byte[1] ;
      P03OO3_A130BarCodPar = new String[] {""} ;
      P03OO3_A8907PzaB80 = new String[] {""} ;
      P03OO3_n8907PzaB80 = new boolean[] {false} ;
      P03OO3_A200BarPieCod = new String[] {""} ;
      A8907PzaB80 = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appzabd80__default(),
         new Object[] {
             new Object[] {
            P03OO2_A148BarEstReo, P03OO2_A130BarCodPar, P03OO2_A132BarCodReo, P03OO2_A129BarCod, P03OO2_A396EmprCod, P03OO2_A5034BarEstTip
            }
            , new Object[] {
            P03OO3_A396EmprCod, P03OO3_A129BarCod, P03OO3_A132BarCodReo, P03OO3_A130BarCodPar, P03OO3_A8907PzaB80, P03OO3_n8907PzaB80, P03OO3_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A5034BarEstTip ;
   private String A8907PzaB80 ;
   private String A200BarPieCod ;
   private boolean n8907PzaB80 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03OO2_A148BarEstReo ;
   private String[] P03OO2_A130BarCodPar ;
   private byte[] P03OO2_A132BarCodReo ;
   private int[] P03OO2_A129BarCod ;
   private String[] P03OO2_A396EmprCod ;
   private String[] P03OO2_A5034BarEstTip ;
   private String[] P03OO3_A396EmprCod ;
   private int[] P03OO3_A129BarCod ;
   private byte[] P03OO3_A132BarCodReo ;
   private String[] P03OO3_A130BarCodPar ;
   private String[] P03OO3_A8907PzaB80 ;
   private boolean[] P03OO3_n8907PzaB80 ;
   private String[] P03OO3_A200BarPieCod ;
}

final  class appzabd80__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03OO2", "SELECT BarEstReo, BarCodPar, BarCodReo, BarCod, EmprCod, BarEstTip FROM TXPBARCAD WHERE BarEstReo = 1 ORDER BY EmprCod, BarEstReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03OO3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PzaB80, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03OO4", "UPDATE TXPBARPIE SET PzaB80=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 9);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 9);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 9);
               return;
      }
   }

}

