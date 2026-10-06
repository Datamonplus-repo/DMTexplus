package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusard extends GXProcedure
{
   public pbusard( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusard.class ), "" );
   }

   public pbusard( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pbusard.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pbusard.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusard.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbusard.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pbusard.this.AV16ArtDsc = aP3[0];
      this.aP3 = aP3;
      pbusard.this.AV15Flag = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P00XC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P00XC2_A69ArtDsc[0] ;
         n69ArtDsc = P00XC2_n69ArtDsc[0] ;
         AV16ArtDsc = A69ArtDsc ;
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusard.this.A396EmprCod;
      this.aP1[0] = pbusard.this.A252CliCod;
      this.aP2[0] = pbusard.this.A65ArtCod;
      this.aP3[0] = pbusard.this.AV16ArtDsc;
      this.aP4[0] = pbusard.this.AV15Flag;
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
      P00XC2_A396EmprCod = new String[] {""} ;
      P00XC2_A252CliCod = new int[1] ;
      P00XC2_A65ArtCod = new String[] {""} ;
      P00XC2_A69ArtDsc = new String[] {""} ;
      P00XC2_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusard__default(),
         new Object[] {
             new Object[] {
            P00XC2_A396EmprCod, P00XC2_A252CliCod, P00XC2_A65ArtCod, P00XC2_A69ArtDsc, P00XC2_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV16ArtDsc ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private boolean n69ArtDsc ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00XC2_A396EmprCod ;
   private int[] P00XC2_A252CliCod ;
   private String[] P00XC2_A65ArtCod ;
   private String[] P00XC2_A69ArtDsc ;
   private boolean[] P00XC2_n69ArtDsc ;
}

final  class pbusard__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00XC2", "SELECT EmprCod, CliCod, ArtCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

