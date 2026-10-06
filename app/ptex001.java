package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptex001 extends GXProcedure
{
   public ptex001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptex001.class ), "" );
   }

   public ptex001( int remoteHandle ,
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
                             String[] aP6 )
   {
      ptex001.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
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
                             String[] aP6 ,
                             String[] aP7 )
   {
      ptex001.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptex001.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      ptex001.this.AV17ForSer = aP2[0];
      this.aP2 = aP2;
      ptex001.this.AV18ForColNom = aP3[0];
      this.aP3 = aP3;
      ptex001.this.AV19ForColNum = aP4[0];
      this.aP4 = aP4;
      ptex001.this.AV20TipColCod = aP5[0];
      this.aP5 = aP5;
      ptex001.this.AV22ForOpcCli = aP6[0];
      this.aP6 = aP6;
      ptex001.this.AV23Carta = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22ForOpcCli = " " ;
      AV23Carta = " " ;
      /* Using cursor P02OC2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02OC2_A831TipColCod[0] ;
         A483ForColNum = P02OC2_A483ForColNum[0] ;
         A482ForColNom = P02OC2_A482ForColNom[0] ;
         A494ForSer = P02OC2_A494ForSer[0] ;
         A252CliCod = P02OC2_A252CliCod[0] ;
         A396EmprCod = P02OC2_A396EmprCod[0] ;
         A3560ForOpcCli = P02OC2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P02OC2_n3560ForOpcCli[0] ;
         A995ForTonal = P02OC2_A995ForTonal[0] ;
         n995ForTonal = P02OC2_n995ForTonal[0] ;
         AV22ForOpcCli = A3560ForOpcCli ;
         AV23Carta = A995ForTonal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptex001.this.AV15EmprCod;
      this.aP1[0] = ptex001.this.AV16CliCod;
      this.aP2[0] = ptex001.this.AV17ForSer;
      this.aP3[0] = ptex001.this.AV18ForColNom;
      this.aP4[0] = ptex001.this.AV19ForColNum;
      this.aP5[0] = ptex001.this.AV20TipColCod;
      this.aP6[0] = ptex001.this.AV22ForOpcCli;
      this.aP7[0] = ptex001.this.AV23Carta;
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
      P02OC2_A831TipColCod = new byte[1] ;
      P02OC2_A483ForColNum = new int[1] ;
      P02OC2_A482ForColNom = new String[] {""} ;
      P02OC2_A494ForSer = new String[] {""} ;
      P02OC2_A252CliCod = new int[1] ;
      P02OC2_A396EmprCod = new String[] {""} ;
      P02OC2_A3560ForOpcCli = new String[] {""} ;
      P02OC2_n3560ForOpcCli = new boolean[] {false} ;
      P02OC2_A995ForTonal = new String[] {""} ;
      P02OC2_n995ForTonal = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A3560ForOpcCli = "" ;
      A995ForTonal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptex001__default(),
         new Object[] {
             new Object[] {
            P02OC2_A831TipColCod, P02OC2_A483ForColNum, P02OC2_A482ForColNom, P02OC2_A494ForSer, P02OC2_A252CliCod, P02OC2_A396EmprCod, P02OC2_A3560ForOpcCli, P02OC2_n3560ForOpcCli, P02OC2_A995ForTonal, P02OC2_n995ForTonal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV15EmprCod ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String AV22ForOpcCli ;
   private String AV23Carta ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A3560ForOpcCli ;
   private String A995ForTonal ;
   private boolean n3560ForOpcCli ;
   private boolean n995ForTonal ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02OC2_A831TipColCod ;
   private int[] P02OC2_A483ForColNum ;
   private String[] P02OC2_A482ForColNom ;
   private String[] P02OC2_A494ForSer ;
   private int[] P02OC2_A252CliCod ;
   private String[] P02OC2_A396EmprCod ;
   private String[] P02OC2_A3560ForOpcCli ;
   private boolean[] P02OC2_n3560ForOpcCli ;
   private String[] P02OC2_A995ForTonal ;
   private boolean[] P02OC2_n995ForTonal ;
}

final  class ptex001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02OC2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForOpcCli, ForTonal FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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

