package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotmac extends GXProcedure
{
   public ptotmac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotmac.class ), "" );
   }

   public ptotmac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      ptotmac.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      ptotmac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotmac.this.A1514MacProCod = aP1[0];
      this.aP1 = aP1;
      ptotmac.this.AV8Total = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P00RR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1514MacProCod});
      c771ProForTie = P00RR2_A771ProForTie[0] ;
      pr_default.close(0);
      AV8Total = (int)(AV8Total+c771ProForTie) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotmac.this.A396EmprCod;
      this.aP1[0] = ptotmac.this.A1514MacProCod;
      this.aP2[0] = ptotmac.this.AV8Total;
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
      P00RR2_A771ProForTie = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotmac__default(),
         new Object[] {
             new Object[] {
            P00RR2_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Total ;
   private int c771ProForTie ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P00RR2_A771ProForTie ;
}

final  class ptotmac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00RR2", "SELECT SUM(T2.ProForTie) FROM (TXPLMACPR T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.MacProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

