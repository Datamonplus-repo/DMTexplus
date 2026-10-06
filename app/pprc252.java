package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc252 extends GXProcedure
{
   public pprc252( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc252.class ), "" );
   }

   public pprc252( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pprc252.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pprc252.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc252.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprc252.this.AV8PrvDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrvDsc = "" ;
      /* Using cursor P05WC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A781PrvCod = P05WC2_A781PrvCod[0] ;
         A787PrvDsc = P05WC2_A787PrvDsc[0] ;
         n787PrvDsc = P05WC2_n787PrvDsc[0] ;
         A787PrvDsc = P05WC2_A787PrvDsc[0] ;
         n787PrvDsc = P05WC2_n787PrvDsc[0] ;
         AV8PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc252.this.A396EmprCod;
      this.aP1[0] = pprc252.this.A252CliCod;
      this.aP2[0] = pprc252.this.AV8PrvDsc;
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
      P05WC2_A781PrvCod = new short[1] ;
      P05WC2_A396EmprCod = new String[] {""} ;
      P05WC2_A252CliCod = new int[1] ;
      P05WC2_A787PrvDsc = new String[] {""} ;
      P05WC2_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc252__default(),
         new Object[] {
             new Object[] {
            P05WC2_A781PrvCod, P05WC2_A396EmprCod, P05WC2_A252CliCod, P05WC2_A787PrvDsc, P05WC2_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A781PrvCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV8PrvDsc ;
   private String scmdbuf ;
   private String A787PrvDsc ;
   private boolean n787PrvDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P05WC2_A781PrvCod ;
   private String[] P05WC2_A396EmprCod ;
   private int[] P05WC2_A252CliCod ;
   private String[] P05WC2_A787PrvDsc ;
   private boolean[] P05WC2_n787PrvDsc ;
}

final  class pprc252__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05WC2", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               return;
      }
   }

}

