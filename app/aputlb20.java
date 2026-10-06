package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputlb20 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputlb20 pgm = new aputlb20 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputlb20( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputlb20.class ), "" );
   }

   public aputlb20( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Inicio Proceso Estado=3....", "") );
      /* Using cursor P03D72 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P03D72_A5532Lb_numero[0] ;
         A396EmprCod = P03D72_A396EmprCod[0] ;
         A5569Lb_EstEns = P03D72_A5569Lb_EstEns[0] ;
         A5533Lb_ArtCod = P03D72_A5533Lb_ArtCod[0] ;
         AV8Num_r = 0 ;
         AV9Num_r3 = 0 ;
         /* Using cursor P03D73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5566Lb_Estado = P03D73_A5566Lb_Estado[0] ;
            A5555Lb_opcion = P03D73_A5555Lb_opcion[0] ;
            AV8Num_r = (int)(AV8Num_r+1) ;
            if ( A5566Lb_Estado == 3 )
            {
               AV9Num_r3 = (int)(AV9Num_r3+1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV8Num_r == AV9Num_r3 ) && ( AV8Num_r > 0 ) )
         {
            A5569Lb_EstEns = (byte)(3) ;
            AV10Num_a = (int)(AV10Num_a+1) ;
         }
         /* Using cursor P03D74 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A5569Lb_EstEns), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Registros Actualizados= ", "") + GXutil.str( AV10Num_a, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "Fin Proceso Estado=3....", "") ;
      httpContext.GX_msglist.addItem(Gx_msg);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putlb20.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputlb20");
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
      P03D72_A5532Lb_numero = new int[1] ;
      P03D72_A396EmprCod = new String[] {""} ;
      P03D72_A5569Lb_EstEns = new byte[1] ;
      P03D72_A5533Lb_ArtCod = new String[] {""} ;
      A396EmprCod = "" ;
      A5533Lb_ArtCod = "" ;
      P03D73_A396EmprCod = new String[] {""} ;
      P03D73_A5532Lb_numero = new int[1] ;
      P03D73_A5566Lb_Estado = new byte[1] ;
      P03D73_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputlb20__default(),
         new Object[] {
             new Object[] {
            P03D72_A5532Lb_numero, P03D72_A396EmprCod, P03D72_A5569Lb_EstEns, P03D72_A5533Lb_ArtCod
            }
            , new Object[] {
            P03D73_A396EmprCod, P03D73_A5532Lb_numero, P03D73_A5566Lb_Estado, P03D73_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int AV8Num_r ;
   private int AV9Num_r3 ;
   private int AV10Num_a ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5533Lb_ArtCod ;
   private String A5555Lb_opcion ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private int[] P03D72_A5532Lb_numero ;
   private String[] P03D72_A396EmprCod ;
   private byte[] P03D72_A5569Lb_EstEns ;
   private String[] P03D72_A5533Lb_ArtCod ;
   private String[] P03D73_A396EmprCod ;
   private int[] P03D73_A5532Lb_numero ;
   private byte[] P03D73_A5566Lb_Estado ;
   private String[] P03D73_A5555Lb_opcion ;
}

final  class aputlb20__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03D72", "SELECT Lb_numero, EmprCod, Lb_EstEns, Lb_ArtCod FROM TXPENS001 WHERE (EmprCod = '001' and Lb_numero > 0) AND (Lb_EstEns <> 3) ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03D73", "SELECT EmprCod, Lb_numero, Lb_Estado, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03D74", "UPDATE TXPENS001 SET Lb_EstEns=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

