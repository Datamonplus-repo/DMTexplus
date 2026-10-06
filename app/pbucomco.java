package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbucomco extends GXProcedure
{
   public pbucomco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbucomco.class ), "" );
   }

   public pbucomco( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 )
   {
      pbucomco.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      pbucomco.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pbucomco.this.AV9CliCod = aP1[0];
      this.aP1 = aP1;
      pbucomco.this.AV10ArtCod = aP2[0];
      this.aP2 = aP2;
      pbucomco.this.AV11Dibujo = aP3[0];
      this.aP3 = aP3;
      pbucomco.this.AV12DibIntCod = aP4[0];
      this.aP4 = aP4;
      pbucomco.this.AV13CombCod = aP5[0];
      this.aP5 = aP5;
      pbucomco.this.AV14Flag = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Flag = (byte)(0) ;
      /* Using cursor P024P2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10ArtCod, AV11Dibujo, Integer.valueOf(AV12DibIntCod), AV13CombCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1176CombCod = P024P2_A1176CombCod[0] ;
         A1790DibIntCod = P024P2_A1790DibIntCod[0] ;
         A1177Dibujo = P024P2_A1177Dibujo[0] ;
         A65ArtCod = P024P2_A65ArtCod[0] ;
         A252CliCod = P024P2_A252CliCod[0] ;
         A396EmprCod = P024P2_A396EmprCod[0] ;
         AV14Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbucomco.this.AV8EmprCod;
      this.aP1[0] = pbucomco.this.AV9CliCod;
      this.aP2[0] = pbucomco.this.AV10ArtCod;
      this.aP3[0] = pbucomco.this.AV11Dibujo;
      this.aP4[0] = pbucomco.this.AV12DibIntCod;
      this.aP5[0] = pbucomco.this.AV13CombCod;
      this.aP6[0] = pbucomco.this.AV14Flag;
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
      P024P2_A1176CombCod = new String[] {""} ;
      P024P2_A1790DibIntCod = new int[1] ;
      P024P2_A1177Dibujo = new String[] {""} ;
      P024P2_A65ArtCod = new String[] {""} ;
      P024P2_A252CliCod = new int[1] ;
      P024P2_A396EmprCod = new String[] {""} ;
      A1176CombCod = "" ;
      A1177Dibujo = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbucomco__default(),
         new Object[] {
             new Object[] {
            P024P2_A1176CombCod, P024P2_A1790DibIntCod, P024P2_A1177Dibujo, P024P2_A65ArtCod, P024P2_A252CliCod, P024P2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Flag ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12DibIntCod ;
   private int A1790DibIntCod ;
   private int A252CliCod ;
   private String AV8EmprCod ;
   private String AV10ArtCod ;
   private String AV11Dibujo ;
   private String AV13CombCod ;
   private String scmdbuf ;
   private String A1176CombCod ;
   private String A1177Dibujo ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P024P2_A1176CombCod ;
   private int[] P024P2_A1790DibIntCod ;
   private String[] P024P2_A1177Dibujo ;
   private String[] P024P2_A65ArtCod ;
   private int[] P024P2_A252CliCod ;
   private String[] P024P2_A396EmprCod ;
}

final  class pbucomco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024P2", "SELECT CombCod, DibIntCod, Dibujo, ArtCod, CliCod, EmprCod FROM TXPLPRECO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? and CombCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               return;
      }
   }

}

