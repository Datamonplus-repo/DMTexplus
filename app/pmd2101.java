package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmd2101 extends GXProcedure
{
   public pmd2101( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmd2101.class ), "" );
   }

   public pmd2101( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pmd2101.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pmd2101.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmd2101.this.AV10Clicodd = aP1[0];
      this.aP1 = aP1;
      pmd2101.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03HA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Clicodd), AV9Artcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P03HA2_A65ArtCod[0] ;
         A252CliCod = P03HA2_A252CliCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P03HA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
         /* End optimized DELETE. */
         /* Using cursor P03HA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmd2101.this.A396EmprCod;
      this.aP1[0] = pmd2101.this.AV10Clicodd;
      this.aP2[0] = pmd2101.this.AV9Artcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmd2101");
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
      P03HA2_A396EmprCod = new String[] {""} ;
      P03HA2_A65ArtCod = new String[] {""} ;
      P03HA2_A252CliCod = new int[1] ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmd2101__default(),
         new Object[] {
             new Object[] {
            P03HA2_A396EmprCod, P03HA2_A65ArtCod, P03HA2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10Clicodd ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03HA2_A396EmprCod ;
   private String[] P03HA2_A65ArtCod ;
   private int[] P03HA2_A252CliCod ;
}

final  class pmd2101__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03HA2", "SELECT EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03HA3", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new UpdateCursor("P03HA4", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

