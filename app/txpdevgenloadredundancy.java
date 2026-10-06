package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpdevgenloadredundancy extends GXProcedure
{
   public txpdevgenloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpdevgenloadredundancy.class ), "" );
   }

   public txpdevgenloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPDEVGEN ...", "") );
      /* Using cursor TXPDEVGENL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = TXPDEVGENL2_A44AlbRecCod[0] ;
         n44AlbRecCod = TXPDEVGENL2_n44AlbRecCod[0] ;
         A252CliCod = TXPDEVGENL2_A252CliCod[0] ;
         n252CliCod = TXPDEVGENL2_n252CliCod[0] ;
         A323DevGenCod = TXPDEVGENL2_A323DevGenCod[0] ;
         A396EmprCod = TXPDEVGENL2_A396EmprCod[0] ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         /* Using cursor TXPDEVGENL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         A252CliCod = TXPDEVGENL3_A252CliCod[0] ;
         n252CliCod = TXPDEVGENL3_n252CliCod[0] ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         A252CliCod = O252CliCod ;
         n252CliCod = false ;
         /* Using cursor TXPDEVGENL4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A323DevGenCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpdevgenloadredundancy");
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
      TXPDEVGENL2_A44AlbRecCod = new int[1] ;
      TXPDEVGENL2_n44AlbRecCod = new boolean[] {false} ;
      TXPDEVGENL2_A252CliCod = new int[1] ;
      TXPDEVGENL2_n252CliCod = new boolean[] {false} ;
      TXPDEVGENL2_A323DevGenCod = new int[1] ;
      TXPDEVGENL2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      TXPDEVGENL3_A252CliCod = new int[1] ;
      TXPDEVGENL3_n252CliCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpdevgenloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPDEVGENL2_A44AlbRecCod, TXPDEVGENL2_n44AlbRecCod, TXPDEVGENL2_A252CliCod, TXPDEVGENL2_n252CliCod, TXPDEVGENL2_A323DevGenCod, TXPDEVGENL2_A396EmprCod
            }
            , new Object[] {
            TXPDEVGENL3_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A323DevGenCod ;
   private int O252CliCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private boolean n44AlbRecCod ;
   private boolean n252CliCod ;
   private IDataStoreProvider pr_default ;
   private int[] TXPDEVGENL2_A44AlbRecCod ;
   private boolean[] TXPDEVGENL2_n44AlbRecCod ;
   private int[] TXPDEVGENL2_A252CliCod ;
   private boolean[] TXPDEVGENL2_n252CliCod ;
   private int[] TXPDEVGENL2_A323DevGenCod ;
   private String[] TXPDEVGENL2_A396EmprCod ;
   private int[] TXPDEVGENL3_A252CliCod ;
   private boolean[] TXPDEVGENL3_n252CliCod ;
}

final  class txpdevgenloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPDEVGENL2", "SELECT AlbRecCod, CliCod, DevGenCod, EmprCod FROM TXPDEVGEN ORDER BY EmprCod, DevGenCod  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPDEVGENL3", "SELECT CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPDEVGENL4", "UPDATE TXPDEVGEN SET CliCod=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
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
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

