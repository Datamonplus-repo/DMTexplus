package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apreorg extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apreorg pgm = new apreorg (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apreorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apreorg.class ), "" );
   }

   public apreorg( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Realizando cambios Empresa 002", "") );
      /* Using cursor P014Y2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P014Y2_A30AlbProCod[0] ;
         A396EmprCod = P014Y2_A396EmprCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A30AlbProCod ;
         new app.pcoppro(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         apreorg.this.A396EmprCod = GXv_char1[0] ;
         apreorg.this.A30AlbProCod = GXv_int2[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Realizando cambios Empresa 001", "") );
      /* Using cursor P014Y3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = P014Y3_A30AlbProCod[0] ;
         A396EmprCod = P014Y3_A396EmprCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A30AlbProCod ;
         new app.pcoppro(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         apreorg.this.A396EmprCod = GXv_char1[0] ;
         apreorg.this.A30AlbProCod = GXv_int2[0] ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Cambios Realizados", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(preorg.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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
      P014Y2_A30AlbProCod = new long[1] ;
      P014Y2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      P014Y3_A30AlbProCod = new long[1] ;
      P014Y3_A396EmprCod = new String[] {""} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apreorg__default(),
         new Object[] {
             new Object[] {
            P014Y2_A30AlbProCod, P014Y2_A396EmprCod
            }
            , new Object[] {
            P014Y3_A30AlbProCod, P014Y3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private IDataStoreProvider pr_default ;
   private long[] P014Y2_A30AlbProCod ;
   private String[] P014Y2_A396EmprCod ;
   private long[] P014Y3_A30AlbProCod ;
   private String[] P014Y3_A396EmprCod ;
}

final  class apreorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P014Y2", "SELECT AlbProCod, EmprCod FROM TXPCALPRD WHERE (EmprCod = '002') AND (( AlbProCod >= 76 and AlbProCod <= 90) or ( AlbProCod >= 20100322 and AlbProCod <= 20100370)) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P014Y3", "SELECT AlbProCod, EmprCod FROM TXPCALPRD WHERE (EmprCod = '001') AND (( AlbProCod >= 169 and AlbProCod <= 229) or ( AlbProCod >= 20100223 and AlbProCod <= 20100273)) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

