package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfartmat extends GXProcedure
{
   public pfartmat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfartmat.class ), "" );
   }

   public pfartmat( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfartmat.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pfartmat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfartmat.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfartmat.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pfartmat.this.AV8ArtMat = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ArtMat = GXutil.space( (short)(26)) ;
      /* Using cursor P01XJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A87ArtMat = P01XJ2_A87ArtMat[0] ;
         n87ArtMat = P01XJ2_n87ArtMat[0] ;
         AV8ArtMat = A87ArtMat ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfartmat.this.A396EmprCod;
      this.aP1[0] = pfartmat.this.A252CliCod;
      this.aP2[0] = pfartmat.this.A65ArtCod;
      this.aP3[0] = pfartmat.this.AV8ArtMat;
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
      P01XJ2_A396EmprCod = new String[] {""} ;
      P01XJ2_A252CliCod = new int[1] ;
      P01XJ2_A65ArtCod = new String[] {""} ;
      P01XJ2_A87ArtMat = new String[] {""} ;
      P01XJ2_n87ArtMat = new boolean[] {false} ;
      A87ArtMat = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfartmat__default(),
         new Object[] {
             new Object[] {
            P01XJ2_A396EmprCod, P01XJ2_A252CliCod, P01XJ2_A65ArtCod, P01XJ2_A87ArtMat, P01XJ2_n87ArtMat
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8ArtMat ;
   private String scmdbuf ;
   private String A87ArtMat ;
   private boolean n87ArtMat ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XJ2_A396EmprCod ;
   private int[] P01XJ2_A252CliCod ;
   private String[] P01XJ2_A65ArtCod ;
   private String[] P01XJ2_A87ArtMat ;
   private boolean[] P01XJ2_n87ArtMat ;
}

final  class pfartmat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XJ2", "SELECT EmprCod, CliCod, ArtCod, ArtMat FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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

