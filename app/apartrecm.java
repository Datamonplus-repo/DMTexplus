package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apartrecm extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apartrecm pgm = new apartrecm (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apartrecm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apartrecm.class ), "" );
   }

   public apartrecm( int remoteHandle ,
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
      /* Using cursor P033X2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1013DibCli = P033X2_A1013DibCli[0] ;
         A396EmprCod = P033X2_A396EmprCod[0] ;
         A252CliCod = P033X2_A252CliCod[0] ;
         A1014DibInt = P033X2_A1014DibInt[0] ;
         if ( GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = A1013DibCli ;
            GXv_int3[0] = A252CliCod ;
            GXv_int4[0] = A1014DibInt ;
            new app.parmmza(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4) ;
            apartrecm.this.A396EmprCod = GXv_char1[0] ;
            apartrecm.this.A1013DibCli = GXv_char2[0] ;
            apartrecm.this.A252CliCod = GXv_int3[0] ;
            apartrecm.this.A1014DibInt = GXv_int4[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(partrecm.class);
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
      P033X2_A1013DibCli = new String[] {""} ;
      P033X2_A396EmprCod = new String[] {""} ;
      P033X2_A252CliCod = new int[1] ;
      P033X2_A1014DibInt = new int[1] ;
      A1013DibCli = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apartrecm__default(),
         new Object[] {
             new Object[] {
            P033X2_A1013DibCli, P033X2_A396EmprCod, P033X2_A252CliCod, P033X2_A1014DibInt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GXv_int3[] ;
   private int GXv_int4[] ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private IDataStoreProvider pr_default ;
   private String[] P033X2_A1013DibCli ;
   private String[] P033X2_A396EmprCod ;
   private int[] P033X2_A252CliCod ;
   private int[] P033X2_A1014DibInt ;
}

final  class apartrecm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P033X2", "SELECT DibCli, EmprCod, CliCod, DibInt FROM TXPCDIBUJ ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

