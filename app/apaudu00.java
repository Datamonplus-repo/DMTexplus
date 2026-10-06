package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apaudu00 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apaudu00 pgm = new apaudu00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apaudu00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apaudu00.class ), "" );
   }

   public apaudu00( int remoteHandle ,
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
      /* Using cursor P02T32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2926DisPla = P02T32_A2926DisPla[0] ;
         A367DisEst = P02T32_A367DisEst[0] ;
         A342DisArtPes = P02T32_A342DisArtPes[0] ;
         A1430DisLoc = P02T32_A1430DisLoc[0] ;
         A396EmprCod = P02T32_A396EmprCod[0] ;
         A361DisCod = P02T32_A361DisCod[0] ;
         if ( GXutil.strcmp(A2926DisPla, httpContext.getMessage( "N", "")) == 0 )
         {
            if ( A367DisEst > 1 )
            {
               A342DisArtPes = (short)(1) ;
               A1430DisLoc = httpContext.getMessage( "OK", "") ;
            }
            /* Using cursor P02T33 */
            pr_default.execute(1, new Object[] {Short.valueOf(A342DisArtPes), A1430DisLoc, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(paudu00.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apaudu00");
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
      P02T32_A2926DisPla = new String[] {""} ;
      P02T32_A367DisEst = new byte[1] ;
      P02T32_A342DisArtPes = new short[1] ;
      P02T32_A1430DisLoc = new String[] {""} ;
      P02T32_A396EmprCod = new String[] {""} ;
      P02T32_A361DisCod = new int[1] ;
      A2926DisPla = "" ;
      A1430DisLoc = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apaudu00__default(),
         new Object[] {
             new Object[] {
            P02T32_A2926DisPla, P02T32_A367DisEst, P02T32_A342DisArtPes, P02T32_A1430DisLoc, P02T32_A396EmprCod, P02T32_A361DisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short A342DisArtPes ;
   private short Gx_err ;
   private int A361DisCod ;
   private String scmdbuf ;
   private String A2926DisPla ;
   private String A1430DisLoc ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private String[] P02T32_A2926DisPla ;
   private byte[] P02T32_A367DisEst ;
   private short[] P02T32_A342DisArtPes ;
   private String[] P02T32_A1430DisLoc ;
   private String[] P02T32_A396EmprCod ;
   private int[] P02T32_A361DisCod ;
}

final  class apaudu00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02T32", "SELECT DisPla, DisEst, DisArtPes, DisLoc, EmprCod, DisCod FROM TXPDISPOS WHERE DisEst > 1 ORDER BY EmprCod, DisEst ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02T33", "UPDATE TXPDISPOS SET DisArtPes=?, DisLoc=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

