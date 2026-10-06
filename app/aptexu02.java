package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu02 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu02 pgm = new aptexu02 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu02.class ), "" );
   }

   public aptexu02( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Lectura Lprofo....CP", "") );
      /* Using cursor P02PR2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5358ProForClv = P02PR2_A5358ProForClv[0] ;
         A767ProForLin = P02PR2_A767ProForLin[0] ;
         A764ProForCod = P02PR2_A764ProForCod[0] ;
         A396EmprCod = P02PR2_A396EmprCod[0] ;
         if ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CP", "")) == 0 )
         {
            AV10Accion = GXutil.substring( A5358ProForClv, 23, 1) ;
            AV11Familia = GXutil.substring( A5358ProForClv, 25, 2) ;
            AV8Ini_5 = GXutil.substring( A5358ProForClv, 4, 5) ;
            AV12Fin_5 = GXutil.substring( A5358ProForClv, 10, 5) ;
            AV9Por_p = GXutil.substring( A5358ProForClv, 16, 6) ;
            A5358ProForClv = httpContext.getMessage( "CP", "") + " " + AV8Ini_5 + "000" + " " + AV12Fin_5 + "000" + " " + AV9Por_p + AV10Accion + AV11Familia ;
            /* Using cursor P02PR3 */
            pr_default.execute(1, new Object[] {A5358ProForClv, A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Lectura Lprofo....CP", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu02.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu02");
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
      P02PR2_A5358ProForClv = new String[] {""} ;
      P02PR2_A767ProForLin = new short[1] ;
      P02PR2_A764ProForCod = new String[] {""} ;
      P02PR2_A396EmprCod = new String[] {""} ;
      A5358ProForClv = "" ;
      A764ProForCod = "" ;
      A396EmprCod = "" ;
      AV10Accion = "" ;
      AV11Familia = "" ;
      AV8Ini_5 = "" ;
      AV12Fin_5 = "" ;
      AV9Por_p = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu02__default(),
         new Object[] {
             new Object[] {
            P02PR2_A5358ProForClv, P02PR2_A767ProForLin, P02PR2_A764ProForCod, P02PR2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A767ProForLin ;
   private short Gx_err ;
   private String scmdbuf ;
   private String A5358ProForClv ;
   private String A764ProForCod ;
   private String A396EmprCod ;
   private String AV10Accion ;
   private String AV11Familia ;
   private String AV8Ini_5 ;
   private String AV12Fin_5 ;
   private String AV9Por_p ;
   private IDataStoreProvider pr_default ;
   private String[] P02PR2_A5358ProForClv ;
   private short[] P02PR2_A767ProForLin ;
   private String[] P02PR2_A764ProForCod ;
   private String[] P02PR2_A396EmprCod ;
}

final  class aptexu02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PR2", "SELECT ProForClv, ProForLin, ProForCod, EmprCod FROM TXPLPROFO ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PR3", "UPDATE TXPLPROFO SET ProForClv=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

