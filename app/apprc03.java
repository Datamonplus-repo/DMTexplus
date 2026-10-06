package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc03 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc03 pgm = new apprc03 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc03.class ), "" );
   }

   public apprc03( int remoteHandle ,
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
      AV8EmprCod = "001" ;
      while ( 1 > 0 )
      {
         System.out.println( httpContext.getMessage( "Ejecutando", "") );
         /* Using cursor P04D92 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A279CliNom = P04D92_A279CliNom[0] ;
            A252CliCod = P04D92_A252CliCod[0] ;
            A396EmprCod = P04D92_A396EmprCod[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         System.out.println( httpContext.getMessage( "Esperando", "") );
         GXt_decimal1 = DecimalUtil.doubleToDec(AV9basura) ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.core.inkey(remoteHandle, context).execute( (short)(5), GXv_decimal2) ;
         apprc03.this.GXt_decimal1 = GXv_decimal2[0] ;
         AV9basura = (byte)(DecimalUtil.decToDouble(GXt_decimal1)) ;
         if ( AV9basura != 0 )
         {
            if (true) break;
         }
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc03.class);
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
      AV8EmprCod = "" ;
      scmdbuf = "" ;
      P04D92_A279CliNom = new String[] {""} ;
      P04D92_A252CliCod = new int[1] ;
      P04D92_A396EmprCod = new String[] {""} ;
      A279CliNom = "" ;
      A396EmprCod = "" ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc03__default(),
         new Object[] {
             new Object[] {
            P04D92_A279CliNom, P04D92_A252CliCod, P04D92_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9basura ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private String[] P04D92_A279CliNom ;
   private int[] P04D92_A252CliCod ;
   private String[] P04D92_A396EmprCod ;
}

final  class apprc03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04D92", "SELECT CliNom, CliCod, EmprCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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

