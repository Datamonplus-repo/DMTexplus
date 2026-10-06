package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexknit extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexknit pgm = new aptexknit (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexknit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexknit.class ), "" );
   }

   public aptexknit( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      /* Using cursor P011I2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P011I2_A44AlbRecCod[0] ;
         n44AlbRecCod = P011I2_n44AlbRecCod[0] ;
         A396EmprCod = P011I2_A396EmprCod[0] ;
         A4602AlbRMdlCod = P011I2_A4602AlbRMdlCod[0] ;
         A10362DevMdl = P011I2_A10362DevMdl[0] ;
         n10362DevMdl = P011I2_n10362DevMdl[0] ;
         A3359AlbRDisCli = P011I2_A3359AlbRDisCli[0] ;
         A10361DevDiscli = P011I2_A10361DevDiscli[0] ;
         n10361DevDiscli = P011I2_n10361DevDiscli[0] ;
         A323DevGenCod = P011I2_A323DevGenCod[0] ;
         A4602AlbRMdlCod = P011I2_A4602AlbRMdlCod[0] ;
         A3359AlbRDisCli = P011I2_A3359AlbRDisCli[0] ;
         A10362DevMdl = A4602AlbRMdlCod ;
         n10362DevMdl = false ;
         A10361DevDiscli = A3359AlbRDisCli ;
         n10361DevDiscli = false ;
         System.out.println( httpContext.getMessage( "procesando...", "") );
         /* Using cursor P011I3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10362DevMdl), A10362DevMdl, Boolean.valueOf(n10361DevDiscli), A10361DevDiscli, A396EmprCod, Integer.valueOf(A323DevGenCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexknit.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexknit");
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
      P011I2_A44AlbRecCod = new int[1] ;
      P011I2_n44AlbRecCod = new boolean[] {false} ;
      P011I2_A396EmprCod = new String[] {""} ;
      P011I2_A4602AlbRMdlCod = new String[] {""} ;
      P011I2_A10362DevMdl = new String[] {""} ;
      P011I2_n10362DevMdl = new boolean[] {false} ;
      P011I2_A3359AlbRDisCli = new String[] {""} ;
      P011I2_A10361DevDiscli = new String[] {""} ;
      P011I2_n10361DevDiscli = new boolean[] {false} ;
      P011I2_A323DevGenCod = new int[1] ;
      A396EmprCod = "" ;
      A4602AlbRMdlCod = "" ;
      A10362DevMdl = "" ;
      A3359AlbRDisCli = "" ;
      A10361DevDiscli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexknit__default(),
         new Object[] {
             new Object[] {
            P011I2_A44AlbRecCod, P011I2_n44AlbRecCod, P011I2_A396EmprCod, P011I2_A4602AlbRMdlCod, P011I2_A10362DevMdl, P011I2_n10362DevMdl, P011I2_A3359AlbRDisCli, P011I2_A10361DevDiscli, P011I2_n10361DevDiscli, P011I2_A323DevGenCod
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
   private int A323DevGenCod ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4602AlbRMdlCod ;
   private String A10362DevMdl ;
   private String A3359AlbRDisCli ;
   private String A10361DevDiscli ;
   private boolean n44AlbRecCod ;
   private boolean n10362DevMdl ;
   private boolean n10361DevDiscli ;
   private IDataStoreProvider pr_default ;
   private int[] P011I2_A44AlbRecCod ;
   private boolean[] P011I2_n44AlbRecCod ;
   private String[] P011I2_A396EmprCod ;
   private String[] P011I2_A4602AlbRMdlCod ;
   private String[] P011I2_A10362DevMdl ;
   private boolean[] P011I2_n10362DevMdl ;
   private String[] P011I2_A3359AlbRDisCli ;
   private String[] P011I2_A10361DevDiscli ;
   private boolean[] P011I2_n10361DevDiscli ;
   private int[] P011I2_A323DevGenCod ;
}

final  class aptexknit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P011I2", "SELECT T1.AlbRecCod, T1.EmprCod, T2.AlbRMdlCod, T1.DevMdl, T2.AlbRDisCli, T1.DevDiscli, T1.DevGenCod FROM (TXPDEVGEN T1 LEFT JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.DevGenCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P011I3", "UPDATE TXPDEVGEN SET DevMdl=?, DevDiscli=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 13);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

