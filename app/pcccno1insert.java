package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcccno1insert extends GXProcedure
{
   public pcccno1insert( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccno1insert.class ), "" );
   }

   public pcccno1insert( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pcccno1insert.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pcccno1insert.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcccno1insert.this.AV10Clicod = aP1[0];
      this.aP1 = aP1;
      pcccno1insert.this.AV11Tb1_cod = aP2[0];
      this.aP2 = aP2;
      pcccno1insert.this.AV12Ccartcod = aP3[0];
      this.aP3 = aP3;
      pcccno1insert.this.AV8TipArtiid = aP4[0];
      this.aP4 = aP4;
      pcccno1insert.this.AV9TipArtids = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04TX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Clicod), AV12Ccartcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P04TX2_A65ArtCod[0] ;
         A252CliCod = P04TX2_A252CliCod[0] ;
         A829TipArtCod = P04TX2_A829TipArtCod[0] ;
         A830TipArtDsc = P04TX2_A830TipArtDsc[0] ;
         n830TipArtDsc = P04TX2_n830TipArtDsc[0] ;
         A830TipArtDsc = P04TX2_A830TipArtDsc[0] ;
         n830TipArtDsc = P04TX2_n830TipArtDsc[0] ;
         AV8TipArtiid = A829TipArtCod ;
         AV9TipArtids = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPCCCno1

      */
      A252CliCod = AV10Clicod ;
      A9713Tb1_Cod = AV11Tb1_cod ;
      A11736CCArtCod = AV12Ccartcod ;
      A11748TipArtiId = AV8TipArtiid ;
      /* Using cursor P04TX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcccno1insert.this.A396EmprCod;
      this.aP1[0] = pcccno1insert.this.AV10Clicod;
      this.aP2[0] = pcccno1insert.this.AV11Tb1_cod;
      this.aP3[0] = pcccno1insert.this.AV12Ccartcod;
      this.aP4[0] = pcccno1insert.this.AV8TipArtiid;
      this.aP5[0] = pcccno1insert.this.AV9TipArtids;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcccno1insert");
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
      P04TX2_A396EmprCod = new String[] {""} ;
      P04TX2_A65ArtCod = new String[] {""} ;
      P04TX2_A252CliCod = new int[1] ;
      P04TX2_A829TipArtCod = new short[1] ;
      P04TX2_A830TipArtDsc = new String[] {""} ;
      P04TX2_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A830TipArtDsc = "" ;
      A11736CCArtCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccno1insert__default(),
         new Object[] {
             new Object[] {
            P04TX2_A396EmprCod, P04TX2_A65ArtCod, P04TX2_A252CliCod, P04TX2_A829TipArtCod, P04TX2_A830TipArtDsc, P04TX2_n830TipArtDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Tb1_cod ;
   private short AV8TipArtiid ;
   private short A829TipArtCod ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short Gx_err ;
   private int AV10Clicod ;
   private int A252CliCod ;
   private int GX_INS1648 ;
   private String A396EmprCod ;
   private String AV12Ccartcod ;
   private String AV9TipArtids ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A830TipArtDsc ;
   private String A11736CCArtCod ;
   private String Gx_emsg ;
   private boolean n830TipArtDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TX2_A396EmprCod ;
   private String[] P04TX2_A65ArtCod ;
   private int[] P04TX2_A252CliCod ;
   private short[] P04TX2_A829TipArtCod ;
   private String[] P04TX2_A830TipArtDsc ;
   private boolean[] P04TX2_n830TipArtDsc ;
}

final  class pcccno1insert__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TX2", "SELECT T1.EmprCod, T1.ArtCod, T1.CliCod, T1.TipArtCod, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04TX3", "INSERT INTO TXPCCCno1(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno1")
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

