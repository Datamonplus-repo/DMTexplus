package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu00 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu00 pgm = new aptexu00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu00.class ), "" );
   }

   public aptexu00( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando tabla ARTICU...Metros a Cms...", "") );
      /* Using cursor P02PP2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A67ArtCruMax = P02PP2_A67ArtCruMax[0] ;
         n67ArtCruMax = P02PP2_n67ArtCruMax[0] ;
         A68ArtCruMin = P02PP2_A68ArtCruMin[0] ;
         n68ArtCruMin = P02PP2_n68ArtCruMin[0] ;
         A62ArtAcaMax = P02PP2_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P02PP2_n62ArtAcaMax[0] ;
         A63ArtAcaMin = P02PP2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P02PP2_n63ArtAcaMin[0] ;
         A65ArtCod = P02PP2_A65ArtCod[0] ;
         A252CliCod = P02PP2_A252CliCod[0] ;
         A396EmprCod = P02PP2_A396EmprCod[0] ;
         if ( A67ArtCruMax > 0 )
         {
            if ( A68ArtCruMin < 100 )
            {
               AV8ArtCrumin = (short)(A68ArtCruMin*100) ;
               AV9Ancho = (short)(AV8ArtCrumin+A67ArtCruMax) ;
               A68ArtCruMin = AV9Ancho ;
               n68ArtCruMin = false ;
               A67ArtCruMax = (short)(0) ;
               n67ArtCruMax = false ;
            }
         }
         if ( A62ArtAcaMax > 0 )
         {
            if ( A63ArtAcaMin < 100 )
            {
               AV8ArtCrumin = (short)(A63ArtAcaMin*100) ;
               AV9Ancho = (short)(AV8ArtCrumin+A62ArtAcaMax) ;
               A63ArtAcaMin = AV9Ancho ;
               n63ArtAcaMin = false ;
               A62ArtAcaMax = (short)(0) ;
               n62ArtAcaMax = false ;
            }
         }
         /* Using cursor P02PP3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin tabla ARTICU...Metros a Cms...", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu00.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu00");
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
      P02PP2_A67ArtCruMax = new short[1] ;
      P02PP2_n67ArtCruMax = new boolean[] {false} ;
      P02PP2_A68ArtCruMin = new short[1] ;
      P02PP2_n68ArtCruMin = new boolean[] {false} ;
      P02PP2_A62ArtAcaMax = new short[1] ;
      P02PP2_n62ArtAcaMax = new boolean[] {false} ;
      P02PP2_A63ArtAcaMin = new short[1] ;
      P02PP2_n63ArtAcaMin = new boolean[] {false} ;
      P02PP2_A65ArtCod = new String[] {""} ;
      P02PP2_A252CliCod = new int[1] ;
      P02PP2_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu00__default(),
         new Object[] {
             new Object[] {
            P02PP2_A67ArtCruMax, P02PP2_n67ArtCruMax, P02PP2_A68ArtCruMin, P02PP2_n68ArtCruMin, P02PP2_A62ArtAcaMax, P02PP2_n62ArtAcaMax, P02PP2_A63ArtAcaMin, P02PP2_n63ArtAcaMin, P02PP2_A65ArtCod, P02PP2_A252CliCod,
            P02PP2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A67ArtCruMax ;
   private short A68ArtCruMin ;
   private short A62ArtAcaMax ;
   private short A63ArtAcaMin ;
   private short AV8ArtCrumin ;
   private short AV9Ancho ;
   private short Gx_err ;
   private int A252CliCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private boolean n67ArtCruMax ;
   private boolean n68ArtCruMin ;
   private boolean n62ArtAcaMax ;
   private boolean n63ArtAcaMin ;
   private IDataStoreProvider pr_default ;
   private short[] P02PP2_A67ArtCruMax ;
   private boolean[] P02PP2_n67ArtCruMax ;
   private short[] P02PP2_A68ArtCruMin ;
   private boolean[] P02PP2_n68ArtCruMin ;
   private short[] P02PP2_A62ArtAcaMax ;
   private boolean[] P02PP2_n62ArtAcaMax ;
   private short[] P02PP2_A63ArtAcaMin ;
   private boolean[] P02PP2_n63ArtAcaMin ;
   private String[] P02PP2_A65ArtCod ;
   private int[] P02PP2_A252CliCod ;
   private String[] P02PP2_A396EmprCod ;
}

final  class aptexu00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PP2", "SELECT ArtCruMax, ArtCruMin, ArtAcaMax, ArtAcaMin, ArtCod, CliCod, EmprCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PP3", "UPDATE TXPARTICU SET ArtCruMax=?, ArtCruMin=?, ArtAcaMax=?, ArtAcaMin=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 16);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               return;
      }
   }

}

