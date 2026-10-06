package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rgtoserpau extends GXProcedure
{
   public rgtoserpau( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rgtoserpau.class ), "" );
   }

   public rgtoserpau( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 )
   {
      rgtoserpau.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      rgtoserpau.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rgtoserpau.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      rgtoserpau.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      rgtoserpau.this.A758ProCod = aP3[0];
      this.aP3 = aP3;
      rgtoserpau.this.A457FasCod = aP4[0];
      this.aP4 = aP4;
      rgtoserpau.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Serpau = (byte)(0) ;
      /* Using cursor P08GN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8Serpau = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rgtoserpau.this.A396EmprCod;
      this.aP1[0] = rgtoserpau.this.A252CliCod;
      this.aP2[0] = rgtoserpau.this.A65ArtCod;
      this.aP3[0] = rgtoserpau.this.A758ProCod;
      this.aP4[0] = rgtoserpau.this.A457FasCod;
      this.aP5[0] = rgtoserpau.this.AV8Serpau;
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
      P08GN2_A396EmprCod = new String[] {""} ;
      P08GN2_A252CliCod = new int[1] ;
      P08GN2_A65ArtCod = new String[] {""} ;
      P08GN2_A758ProCod = new String[] {""} ;
      P08GN2_A457FasCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rgtoserpau__default(),
         new Object[] {
             new Object[] {
            P08GN2_A396EmprCod, P08GN2_A252CliCod, P08GN2_A65ArtCod, P08GN2_A758ProCod, P08GN2_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Serpau ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GN2_A396EmprCod ;
   private int[] P08GN2_A252CliCod ;
   private String[] P08GN2_A65ArtCod ;
   private String[] P08GN2_A758ProCod ;
   private String[] P08GN2_A457FasCod ;
}

final  class rgtoserpau__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GN2", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

