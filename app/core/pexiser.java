package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexiser extends GXProcedure
{
   public pexiser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexiser.class ), "" );
   }

   public pexiser( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 )
   {
      pexiser.this.aP3 = new short[] {0};
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
      pexiser.this.A396EmprCod = aP0;
      pexiser.this.A252CliCod = aP1;
      pexiser.this.A65ArtCod = aP2;
      pexiser.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagArt = (short)(0) ;
      /* Using cursor P00M72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P00M72_A69ArtDsc[0] ;
         n69ArtDsc = P00M72_n69ArtDsc[0] ;
         AV15FlagArt = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pexiser.this.AV15FlagArt;
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
      P00M72_A396EmprCod = new String[] {""} ;
      P00M72_A252CliCod = new int[1] ;
      P00M72_A65ArtCod = new String[] {""} ;
      P00M72_A69ArtDsc = new String[] {""} ;
      P00M72_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pexiser__default(),
         new Object[] {
             new Object[] {
            P00M72_A396EmprCod, P00M72_A252CliCod, P00M72_A65ArtCod, P00M72_A69ArtDsc, P00M72_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15FlagArt ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private boolean n69ArtDsc ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00M72_A396EmprCod ;
   private int[] P00M72_A252CliCod ;
   private String[] P00M72_A65ArtCod ;
   private String[] P00M72_A69ArtDsc ;
   private boolean[] P00M72_n69ArtDsc ;
}

final  class pexiser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00M72", "SELECT EmprCod, CliCod, ArtCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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

