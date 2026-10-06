package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apincasini extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apincasini pgm = new apincasini (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apincasini( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apincasini.class ), "" );
   }

   public apincasini( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Inicio proceso Creacion Tablas Incas", ""));
      /* Using cursor P014L2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P014L2_A279CliNom[0] ;
         A260CliDom = P014L2_A260CliDom[0] ;
         A396EmprCod = P014L2_A396EmprCod[0] ;
         A252CliCod = P014L2_A252CliCod[0] ;
         AV8clidom = A260CliDom ;
         A260CliDom = AV8clidom ;
         /* Using cursor P014L3 */
         pr_default.execute(1, new Object[] {A260CliDom, A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "apincasini");
      /* Using cursor P014L4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A653OpeNom = P014L4_A653OpeNom[0] ;
         n653OpeNom = P014L4_n653OpeNom[0] ;
         A396EmprCod = P014L4_A396EmprCod[0] ;
         A652OpeCod = P014L4_A652OpeCod[0] ;
         AV9OpeNom = A653OpeNom ;
         A653OpeNom = AV9OpeNom ;
         n653OpeNom = false ;
         /* Using cursor P014L5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n653OpeNom), A653OpeNom, A396EmprCod, Integer.valueOf(A652OpeCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPERAR");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Application.commitDataStores(context, remoteHandle, pr_default, "apincasini");
      /* Using cursor P014L6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A867ParCodNom = P014L6_A867ParCodNom[0] ;
         n867ParCodNom = P014L6_n867ParCodNom[0] ;
         A396EmprCod = P014L6_A396EmprCod[0] ;
         A656ParCod = P014L6_A656ParCod[0] ;
         AV10ParCodNom = A867ParCodNom ;
         A867ParCodNom = AV10ParCodNom ;
         n867ParCodNom = false ;
         /* Using cursor P014L7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n867ParCodNom), A867ParCodNom, A396EmprCod, Short.valueOf(A656ParCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODPAR");
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Application.commitDataStores(context, remoteHandle, pr_default, "apincasini");
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pincasini.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apincasini");
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
      P014L2_A279CliNom = new String[] {""} ;
      P014L2_A260CliDom = new String[] {""} ;
      P014L2_A396EmprCod = new String[] {""} ;
      P014L2_A252CliCod = new int[1] ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A396EmprCod = "" ;
      AV8clidom = "" ;
      P014L4_A653OpeNom = new String[] {""} ;
      P014L4_n653OpeNom = new boolean[] {false} ;
      P014L4_A396EmprCod = new String[] {""} ;
      P014L4_A652OpeCod = new int[1] ;
      A653OpeNom = "" ;
      AV9OpeNom = "" ;
      P014L6_A867ParCodNom = new String[] {""} ;
      P014L6_n867ParCodNom = new boolean[] {false} ;
      P014L6_A396EmprCod = new String[] {""} ;
      P014L6_A656ParCod = new short[1] ;
      A867ParCodNom = "" ;
      AV10ParCodNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.apincasini__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.apincasini__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.apincasini__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apincasini__default(),
         new Object[] {
             new Object[] {
            P014L2_A279CliNom, P014L2_A260CliDom, P014L2_A396EmprCod, P014L2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P014L4_A653OpeNom, P014L4_n653OpeNom, P014L4_A396EmprCod, P014L4_A652OpeCod
            }
            , new Object[] {
            }
            , new Object[] {
            P014L6_A867ParCodNom, P014L6_n867ParCodNom, P014L6_A396EmprCod, P014L6_A656ParCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A652OpeCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A396EmprCod ;
   private String AV8clidom ;
   private String A653OpeNom ;
   private String AV9OpeNom ;
   private String A867ParCodNom ;
   private String AV10ParCodNom ;
   private boolean n653OpeNom ;
   private boolean n867ParCodNom ;
   private IDataStoreProvider pr_default ;
   private String[] P014L2_A279CliNom ;
   private String[] P014L2_A260CliDom ;
   private String[] P014L2_A396EmprCod ;
   private int[] P014L2_A252CliCod ;
   private String[] P014L4_A653OpeNom ;
   private boolean[] P014L4_n653OpeNom ;
   private String[] P014L4_A396EmprCod ;
   private int[] P014L4_A652OpeCod ;
   private String[] P014L6_A867ParCodNom ;
   private boolean[] P014L6_n867ParCodNom ;
   private String[] P014L6_A396EmprCod ;
   private short[] P014L6_A656ParCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apincasini__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class apincasini__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class apincasini__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class apincasini__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P014L2", "SELECT CliNom, CliDom, EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P014L3", "UPDATE TXPCLIENT SET CliDom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P014L4", "SELECT OpeNom, EmprCod, OpeCod FROM TXPOPERAR ORDER BY EmprCod, OpeCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P014L5", "UPDATE TXPOPERAR SET OpeNom=?  WHERE EmprCod = ? AND OpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOPERAR")
         ,new ForEachCursor("P014L6", "SELECT ParCodNom, EmprCod, ParCod FROM TXPCODPAR ORDER BY EmprCod, ParCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P014L7", "UPDATE TXPCODPAR SET ParCodNom=?  WHERE EmprCod = ? AND ParCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCODPAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 34);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
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
               stmt.setString(1, (String)parms[0], 34);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

