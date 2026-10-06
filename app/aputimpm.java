package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputimpm extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputimpm pgm = new aputimpm (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputimpm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputimpm.class ), "" );
   }

   public aputimpm( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "INICIA PROCESO DE ACTUALIZACION DE FACIMPMIN (IMPORTE MINIMO LINEA FACTURA) CON CLIIMPMIN (IMPORTE MINIMO POR CLIENTE)", ""));
      /* Using cursor P01P92 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01P92_A252CliCod[0] ;
         A5355FacImpMin = P01P92_A5355FacImpMin[0] ;
         A446FacLin = P01P92_A446FacLin[0] ;
         A430FacCod = P01P92_A430FacCod[0] ;
         A396EmprCod = P01P92_A396EmprCod[0] ;
         A252CliCod = P01P92_A252CliCod[0] ;
         AV10EmprCod = A396EmprCod ;
         AV8CliCod = A252CliCod ;
         /* Execute user subroutine: 'CLIENTE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV9CliImpMin)==0) )
         {
            A5355FacImpMin = AV9CliImpMin ;
         }
         AV11Texto = httpContext.getMessage( "Procesada factura ", "") + GXutil.str( A430FacCod, 8, 0) ;
         System.out.println( AV11Texto );
         /* Using cursor P01P93 */
         pr_default.execute(1, new Object[] {A5355FacImpMin, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "FIN PROCESO", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      /* Using cursor P01P94 */
      pr_default.execute(2, new Object[] {AV10EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P01P94_A252CliCod[0] ;
         A396EmprCod = P01P94_A396EmprCod[0] ;
         A2028CliImpMin = P01P94_A2028CliImpMin[0] ;
         n2028CliImpMin = P01P94_n2028CliImpMin[0] ;
         AV9CliImpMin = A2028CliImpMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putimpm.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputimpm");
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
      P01P92_A252CliCod = new int[1] ;
      P01P92_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01P92_A446FacLin = new int[1] ;
      P01P92_A430FacCod = new int[1] ;
      P01P92_A396EmprCod = new String[] {""} ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV10EmprCod = "" ;
      AV9CliImpMin = DecimalUtil.ZERO ;
      AV11Texto = "" ;
      P01P94_A252CliCod = new int[1] ;
      P01P94_A396EmprCod = new String[] {""} ;
      P01P94_A2028CliImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01P94_n2028CliImpMin = new boolean[] {false} ;
      A2028CliImpMin = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputimpm__default(),
         new Object[] {
             new Object[] {
            P01P92_A252CliCod, P01P92_A5355FacImpMin, P01P92_A446FacLin, P01P92_A430FacCod, P01P92_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01P94_A252CliCod, P01P94_A396EmprCod, P01P94_A2028CliImpMin, P01P94_n2028CliImpMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A446FacLin ;
   private int A430FacCod ;
   private int AV8CliCod ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal AV9CliImpMin ;
   private java.math.BigDecimal A2028CliImpMin ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV10EmprCod ;
   private String AV11Texto ;
   private boolean returnInSub ;
   private boolean n2028CliImpMin ;
   private IDataStoreProvider pr_default ;
   private int[] P01P92_A252CliCod ;
   private java.math.BigDecimal[] P01P92_A5355FacImpMin ;
   private int[] P01P92_A446FacLin ;
   private int[] P01P92_A430FacCod ;
   private String[] P01P92_A396EmprCod ;
   private int[] P01P94_A252CliCod ;
   private String[] P01P94_A396EmprCod ;
   private java.math.BigDecimal[] P01P94_A2028CliImpMin ;
   private boolean[] P01P94_n2028CliImpMin ;
}

final  class aputimpm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01P92", "SELECT T2.CliCod, T1.FacImpMin, T1.FacLin, T1.FacCod, T1.EmprCod FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) ORDER BY T1.EmprCod, T1.FacCod, T1.FacLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01P93", "UPDATE TXPLFAVEN SET FacImpMin=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P01P94", "SELECT CliCod, EmprCod, CliImpMin FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

