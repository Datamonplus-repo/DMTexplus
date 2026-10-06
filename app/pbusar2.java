package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusar2 extends GXProcedure
{
   public pbusar2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusar2.class ), "" );
   }

   public pbusar2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pbusar2.this.aP3 = new String[] {""};
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
      pbusar2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusar2.this.AV17CliOri = aP1[0];
      this.aP1 = aP1;
      pbusar2.this.AV16ArtOri = aP2[0];
      this.aP2 = aP2;
      pbusar2.this.AV19TArtDsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19TArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P00T32 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliOri), AV16ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = P00T32_A829TipArtCod[0] ;
         A65ArtCod = P00T32_A65ArtCod[0] ;
         A252CliCod = P00T32_A252CliCod[0] ;
         A396EmprCod = P00T32_A396EmprCod[0] ;
         A830TipArtDsc = P00T32_A830TipArtDsc[0] ;
         n830TipArtDsc = P00T32_n830TipArtDsc[0] ;
         A830TipArtDsc = P00T32_A830TipArtDsc[0] ;
         n830TipArtDsc = P00T32_n830TipArtDsc[0] ;
         AV19TArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusar2.this.AV15EmprCod;
      this.aP1[0] = pbusar2.this.AV17CliOri;
      this.aP2[0] = pbusar2.this.AV16ArtOri;
      this.aP3[0] = pbusar2.this.AV19TArtDsc;
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
      P00T32_A829TipArtCod = new short[1] ;
      P00T32_A65ArtCod = new String[] {""} ;
      P00T32_A252CliCod = new int[1] ;
      P00T32_A396EmprCod = new String[] {""} ;
      P00T32_A830TipArtDsc = new String[] {""} ;
      P00T32_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusar2__default(),
         new Object[] {
             new Object[] {
            P00T32_A829TipArtCod, P00T32_A65ArtCod, P00T32_A252CliCod, P00T32_A396EmprCod, P00T32_A830TipArtDsc, P00T32_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV17CliOri ;
   private int A252CliCod ;
   private String AV15EmprCod ;
   private String AV16ArtOri ;
   private String AV19TArtDsc ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A830TipArtDsc ;
   private boolean n830TipArtDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00T32_A829TipArtCod ;
   private String[] P00T32_A65ArtCod ;
   private int[] P00T32_A252CliCod ;
   private String[] P00T32_A396EmprCod ;
   private String[] P00T32_A830TipArtDsc ;
   private boolean[] P00T32_n830TipArtDsc ;
}

final  class pbusar2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00T32", "SELECT T1.TipArtCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
      }
   }

}

