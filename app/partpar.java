package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partpar extends GXProcedure
{
   public partpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partpar.class ), "" );
   }

   public partpar( int remoteHandle ,
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
      partpar.this.aP5 = new byte[] {0};
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
      partpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partpar.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partpar.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      partpar.this.AV32DisArtDsc = aP3[0];
      this.aP3 = aP3;
      partpar.this.AV28DisNMtr = aP4[0];
      this.aP4 = aP4;
      partpar.this.AV34Flag = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Flag = (byte)(0) ;
      /* Using cursor P00NO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P00NO2_A69ArtDsc[0] ;
         n69ArtDsc = P00NO2_n69ArtDsc[0] ;
         A967ArtNMtr = P00NO2_A967ArtNMtr[0] ;
         n967ArtNMtr = P00NO2_n967ArtNMtr[0] ;
         AV32DisArtDsc = A69ArtDsc ;
         AV28DisNMtr = A967ArtNMtr ;
         AV34Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partpar.this.A396EmprCod;
      this.aP1[0] = partpar.this.A252CliCod;
      this.aP2[0] = partpar.this.A65ArtCod;
      this.aP3[0] = partpar.this.AV32DisArtDsc;
      this.aP4[0] = partpar.this.AV28DisNMtr;
      this.aP5[0] = partpar.this.AV34Flag;
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
      P00NO2_A396EmprCod = new String[] {""} ;
      P00NO2_A252CliCod = new int[1] ;
      P00NO2_A65ArtCod = new String[] {""} ;
      P00NO2_A69ArtDsc = new String[] {""} ;
      P00NO2_n69ArtDsc = new boolean[] {false} ;
      P00NO2_A967ArtNMtr = new String[] {""} ;
      P00NO2_n967ArtNMtr = new boolean[] {false} ;
      A69ArtDsc = "" ;
      A967ArtNMtr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partpar__default(),
         new Object[] {
             new Object[] {
            P00NO2_A396EmprCod, P00NO2_A252CliCod, P00NO2_A65ArtCod, P00NO2_A69ArtDsc, P00NO2_n69ArtDsc, P00NO2_A967ArtNMtr, P00NO2_n967ArtNMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34Flag ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV32DisArtDsc ;
   private String AV28DisNMtr ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A967ArtNMtr ;
   private boolean n69ArtDsc ;
   private boolean n967ArtNMtr ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NO2_A396EmprCod ;
   private int[] P00NO2_A252CliCod ;
   private String[] P00NO2_A65ArtCod ;
   private String[] P00NO2_A69ArtDsc ;
   private boolean[] P00NO2_n69ArtDsc ;
   private String[] P00NO2_A967ArtNMtr ;
   private boolean[] P00NO2_n967ArtNMtr ;
}

final  class partpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NO2", "SELECT EmprCod, CliCod, ArtCod, ArtDsc, ArtNMtr FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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

