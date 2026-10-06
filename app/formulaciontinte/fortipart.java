package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fortipart extends GXProcedure
{
   public fortipart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fortipart.class ), "" );
   }

   public fortipart( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 )
   {
      fortipart.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      fortipart.this.A396EmprCod = aP0;
      fortipart.this.A252CliCod = aP1;
      fortipart.this.A65ArtCod = aP2;
      fortipart.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Tipartcod = (short)(0) ;
      /* Using cursor P0AT12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = P0AT12_A829TipArtCod[0] ;
         AV8Tipartcod = A829TipArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = fortipart.this.AV8Tipartcod;
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
      P0AT12_A396EmprCod = new String[] {""} ;
      P0AT12_A252CliCod = new int[1] ;
      P0AT12_A65ArtCod = new String[] {""} ;
      P0AT12_A829TipArtCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.fortipart__default(),
         new Object[] {
             new Object[] {
            P0AT12_A396EmprCod, P0AT12_A252CliCod, P0AT12_A65ArtCod, P0AT12_A829TipArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Tipartcod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AT12_A396EmprCod ;
   private int[] P0AT12_A252CliCod ;
   private String[] P0AT12_A65ArtCod ;
   private short[] P0AT12_A829TipArtCod ;
}

final  class fortipart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT12", "SELECT EmprCod, CliCod, ArtCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

