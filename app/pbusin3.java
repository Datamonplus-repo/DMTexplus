package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusin3 extends GXProcedure
{
   public pbusin3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusin3.class ), "" );
   }

   public pbusin3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pbusin3.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      pbusin3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusin3.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pbusin3.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      pbusin3.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      pbusin3.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      pbusin3.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      pbusin3.this.AV20IntCod = aP6[0];
      this.aP6 = aP6;
      pbusin3.this.AV21IntDsc = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00EJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P00EJ2_A831TipColCod[0] ;
         A483ForColNum = P00EJ2_A483ForColNum[0] ;
         A482ForColNom = P00EJ2_A482ForColNom[0] ;
         A494ForSer = P00EJ2_A494ForSer[0] ;
         A252CliCod = P00EJ2_A252CliCod[0] ;
         A583IntCod = P00EJ2_A583IntCod[0] ;
         A584IntDsc = P00EJ2_A584IntDsc[0] ;
         n584IntDsc = P00EJ2_n584IntDsc[0] ;
         A584IntDsc = P00EJ2_A584IntDsc[0] ;
         n584IntDsc = P00EJ2_n584IntDsc[0] ;
         AV20IntCod = A583IntCod ;
         AV21IntDsc = A584IntDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusin3.this.A396EmprCod;
      this.aP1[0] = pbusin3.this.AV15CliCod;
      this.aP2[0] = pbusin3.this.AV16ForSer;
      this.aP3[0] = pbusin3.this.AV17ForColNom;
      this.aP4[0] = pbusin3.this.AV18ForColNum;
      this.aP5[0] = pbusin3.this.AV19TipColCod;
      this.aP6[0] = pbusin3.this.AV20IntCod;
      this.aP7[0] = pbusin3.this.AV21IntDsc;
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
      P00EJ2_A396EmprCod = new String[] {""} ;
      P00EJ2_A831TipColCod = new byte[1] ;
      P00EJ2_A483ForColNum = new int[1] ;
      P00EJ2_A482ForColNom = new String[] {""} ;
      P00EJ2_A494ForSer = new String[] {""} ;
      P00EJ2_A252CliCod = new int[1] ;
      P00EJ2_A583IntCod = new byte[1] ;
      P00EJ2_A584IntDsc = new String[] {""} ;
      P00EJ2_n584IntDsc = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A584IntDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusin3__default(),
         new Object[] {
             new Object[] {
            P00EJ2_A396EmprCod, P00EJ2_A831TipColCod, P00EJ2_A483ForColNum, P00EJ2_A482ForColNom, P00EJ2_A494ForSer, P00EJ2_A252CliCod, P00EJ2_A583IntCod, P00EJ2_A584IntDsc, P00EJ2_n584IntDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte AV20IntCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV21IntDsc ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A584IntDsc ;
   private boolean n584IntDsc ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EJ2_A396EmprCod ;
   private byte[] P00EJ2_A831TipColCod ;
   private int[] P00EJ2_A483ForColNum ;
   private String[] P00EJ2_A482ForColNom ;
   private String[] P00EJ2_A494ForSer ;
   private int[] P00EJ2_A252CliCod ;
   private byte[] P00EJ2_A583IntCod ;
   private String[] P00EJ2_A584IntDsc ;
   private boolean[] P00EJ2_n584IntDsc ;
}

final  class pbusin3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EJ2", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.IntCod, T2.IntDsc FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

