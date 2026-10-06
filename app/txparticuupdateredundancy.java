package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txparticuupdateredundancy extends GXProcedure
{
   public txparticuupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txparticuupdateredundancy.class ), "" );
   }

   public txparticuupdateredundancy( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      txparticuupdateredundancy.this.aP2 = new String[] {""};
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
      txparticuupdateredundancy.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      txparticuupdateredundancy.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      txparticuupdateredundancy.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPARTICUU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = TXPARTICUU2_A829TipArtCod[0] ;
         AV2GXV829 = A829TipArtCod ;
         /* Optimized UPDATE. */
         /* Using cursor TXPARTICUU3 */
         pr_default.execute(1, new Object[] {Short.valueOf(AV2GXV829), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txparticuupdateredundancy.this.A396EmprCod;
      this.aP1[0] = txparticuupdateredundancy.this.A252CliCod;
      this.aP2[0] = txparticuupdateredundancy.this.A65ArtCod;
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
      TXPARTICUU2_A396EmprCod = new String[] {""} ;
      TXPARTICUU2_A252CliCod = new int[1] ;
      TXPARTICUU2_A65ArtCod = new String[] {""} ;
      TXPARTICUU2_A829TipArtCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txparticuupdateredundancy__default(),
         new Object[] {
             new Object[] {
            TXPARTICUU2_A396EmprCod, TXPARTICUU2_A252CliCod, TXPARTICUU2_A65ArtCod, TXPARTICUU2_A829TipArtCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short AV2GXV829 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPARTICUU2_A396EmprCod ;
   private int[] TXPARTICUU2_A252CliCod ;
   private String[] TXPARTICUU2_A65ArtCod ;
   private short[] TXPARTICUU2_A829TipArtCod ;
}

final  class txparticuupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPARTICUU2", "SELECT EmprCod, CliCod, ArtCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("TXPARTICUU3", "UPDATE TXPCESART SET TipArtCod=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
      }
   }

}

