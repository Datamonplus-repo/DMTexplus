package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apartveld extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apartveld pgm = new apartveld (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apartveld( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apartveld.class ), "" );
   }

   public apartveld( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      AV9Var1 = " " ;
      /* Using cursor P04BV2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04BV2_A396EmprCod[0] ;
         A829TipArtCod = P04BV2_A829TipArtCod[0] ;
         A69ArtDsc = P04BV2_A69ArtDsc[0] ;
         n69ArtDsc = P04BV2_n69ArtDsc[0] ;
         A252CliCod = P04BV2_A252CliCod[0] ;
         A65ArtCod = P04BV2_A65ArtCod[0] ;
         if ( GXutil.strcmp(AV9Var1, GXutil.str( A252CliCod, 6, 0)+A69ArtDsc+GXutil.str( A829TipArtCod, 4, 0)) == 0 )
         {
            System.out.println( AV9Var1 );
            /* Using cursor P04BV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         }
         AV9Var1 = GXutil.str( A252CliCod, 6, 0) + A69ArtDsc + GXutil.str( A829TipArtCod, 4, 0) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(partveld.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apartveld");
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
      AV9Var1 = "" ;
      scmdbuf = "" ;
      P04BV2_A396EmprCod = new String[] {""} ;
      P04BV2_A829TipArtCod = new short[1] ;
      P04BV2_A69ArtDsc = new String[] {""} ;
      P04BV2_n69ArtDsc = new boolean[] {false} ;
      P04BV2_A252CliCod = new int[1] ;
      P04BV2_A65ArtCod = new String[] {""} ;
      A396EmprCod = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apartveld__default(),
         new Object[] {
             new Object[] {
            P04BV2_A396EmprCod, P04BV2_A829TipArtCod, P04BV2_A69ArtDsc, P04BV2_n69ArtDsc, P04BV2_A252CliCod, P04BV2_A65ArtCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String AV8Emprcod ;
   private String AV9Var1 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private boolean n69ArtDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P04BV2_A396EmprCod ;
   private short[] P04BV2_A829TipArtCod ;
   private String[] P04BV2_A69ArtDsc ;
   private boolean[] P04BV2_n69ArtDsc ;
   private int[] P04BV2_A252CliCod ;
   private String[] P04BV2_A65ArtCod ;
}

final  class apartveld__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04BV2", "SELECT EmprCod, TipArtCod, ArtDsc, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtDsc, TipArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04BV3", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

