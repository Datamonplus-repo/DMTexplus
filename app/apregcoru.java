package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apregcoru extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apregcoru pgm = new apregcoru (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apregcoru( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apregcoru.class ), "" );
   }

   public apregcoru( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando clientes.....", "") );
      /* Using cursor P03492 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P03492_A252CliCod[0] ;
         A396EmprCod = P03492_A396EmprCod[0] ;
         AV12Clicod = A252CliCod ;
         AV13Emprcod = A396EmprCod ;
         Gx_msg = httpContext.getMessage( "Procesando Cliente =", "") + GXutil.str( A252CliCod, 6, 0) ;
         System.out.println( Gx_msg );
         /* Execute user subroutine: 'REGCOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Procesando clientes. Ceros en Cartaz para ordenacion.", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'REGCOR' Routine */
      returnInSub = false ;
      /* Using cursor P03493 */
      pr_default.execute(1, new Object[] {AV13Emprcod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P03493_A252CliCod[0] ;
         A396EmprCod = P03493_A396EmprCod[0] ;
         A6934Lb_rcncar = P03493_A6934Lb_rcncar[0] ;
         n6934Lb_rcncar = P03493_n6934Lb_rcncar[0] ;
         A6930Lb_rclin = P03493_A6930Lb_rclin[0] ;
         AV21Ceros6 = "000000" ;
         AV22Cartaz_6 = GXutil.substring( A6934Lb_rcncar, 1, 6) ;
         AV22Cartaz_6 = GXutil.ltrim( GXutil.rtrim( AV22Cartaz_6)) ;
         AV23Len_Cartaz = (byte)(GXutil.len( AV22Cartaz_6)) ;
         if ( AV23Len_Cartaz < 6 )
         {
            AV23Len_Cartaz = (byte)(6-AV23Len_Cartaz) ;
            AV22Cartaz_6 = GXutil.substring( AV21Ceros6, 1, AV23Len_Cartaz) + AV22Cartaz_6 ;
            A6934Lb_rcncar = AV22Cartaz_6 ;
            n6934Lb_rcncar = false ;
         }
         /* Using cursor P03494 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6934Lb_rcncar), A6934Lb_rcncar, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pregcoru.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apregcoru");
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
      P03492_A252CliCod = new int[1] ;
      P03492_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Emprcod = "" ;
      Gx_msg = "" ;
      P03493_A252CliCod = new int[1] ;
      P03493_A396EmprCod = new String[] {""} ;
      P03493_A6934Lb_rcncar = new String[] {""} ;
      P03493_n6934Lb_rcncar = new boolean[] {false} ;
      P03493_A6930Lb_rclin = new int[1] ;
      A6934Lb_rcncar = "" ;
      AV21Ceros6 = "" ;
      AV22Cartaz_6 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apregcoru__default(),
         new Object[] {
             new Object[] {
            P03492_A252CliCod, P03492_A396EmprCod
            }
            , new Object[] {
            P03493_A252CliCod, P03493_A396EmprCod, P03493_A6934Lb_rcncar, P03493_n6934Lb_rcncar, P03493_A6930Lb_rclin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23Len_Cartaz ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV12Clicod ;
   private int A6930Lb_rclin ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV13Emprcod ;
   private String Gx_msg ;
   private String A6934Lb_rcncar ;
   private String AV21Ceros6 ;
   private String AV22Cartaz_6 ;
   private boolean returnInSub ;
   private boolean n6934Lb_rcncar ;
   private IDataStoreProvider pr_default ;
   private int[] P03492_A252CliCod ;
   private String[] P03492_A396EmprCod ;
   private int[] P03493_A252CliCod ;
   private String[] P03493_A396EmprCod ;
   private String[] P03493_A6934Lb_rcncar ;
   private boolean[] P03493_n6934Lb_rcncar ;
   private int[] P03493_A6930Lb_rclin ;
}

final  class apregcoru__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03492", "SELECT CliCod, EmprCod FROM TXPCLIENT WHERE EmprCod = '001' and CliCod > 0 ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03493", "SELECT CliCod, EmprCod, Lb_rcncar, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03494", "UPDATE TXPREGCOR SET Lb_rcncar=?  WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

