package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apxx extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apxx pgm = new apxx (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apxx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apxx.class ), "" );
   }

   public apxx( int remoteHandle ,
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
      /* Using cursor P03L12 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A430FacCod = P03L12_A430FacCod[0] ;
         A396EmprCod = P03L12_A396EmprCod[0] ;
         A965FacCob = P03L12_A965FacCob[0] ;
         A965FacCob = " " ;
         Gx_msg = "Faccod=" + GXutil.str( AV8faccod, 8, 0) + GXutil.newLine( ) + "FacCob=" + A965FacCob ;
         httpContext.GX_msglist.addItem(Gx_msg);
         /* Using cursor P03L13 */
         pr_default.execute(1, new Object[] {A965FacCob, A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pxx.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apxx");
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
      P03L12_A430FacCod = new int[1] ;
      P03L12_A396EmprCod = new String[] {""} ;
      P03L12_A965FacCob = new String[] {""} ;
      A396EmprCod = "" ;
      A965FacCob = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apxx__default(),
         new Object[] {
             new Object[] {
            P03L12_A430FacCod, P03L12_A396EmprCod, P03L12_A965FacCob
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8faccod ;
   private int A430FacCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A965FacCob ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private int[] P03L12_A430FacCod ;
   private String[] P03L12_A396EmprCod ;
   private String[] P03L12_A965FacCob ;
}

final  class apxx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L12", "SELECT FacCod, EmprCod, FacCob FROM TXPCFAVEN WHERE EmprCod = '001' and FacCod = ? ORDER BY EmprCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03L13", "UPDATE TXPCFAVEN SET FacCob=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

