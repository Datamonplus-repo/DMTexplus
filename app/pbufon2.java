package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbufon2 extends GXProcedure
{
   public pbufon2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbufon2.class ), "" );
   }

   public pbufon2( int remoteHandle ,
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
                           byte[] aP5 ,
                           int[] aP6 ,
                           short[] aP7 ,
                           String[] aP8 ,
                           int[] aP9 ,
                           String[] aP10 ,
                           byte[] aP11 )
   {
      pbufon2.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 )
   {
      pbufon2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbufon2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbufon2.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pbufon2.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pbufon2.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pbufon2.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pbufon2.this.AV16ForNumCol = aP6[0];
      this.aP6 = aP6;
      pbufon2.this.AV17Fam_cod = aP7[0];
      this.aP7 = aP7;
      pbufon2.this.AV21Fornomcli2 = aP8[0];
      this.aP8 = aP8;
      pbufon2.this.AV18ForNumarc = aP9[0];
      this.aP9 = aP9;
      pbufon2.this.AV19Foropccli = aP10[0];
      this.aP10 = aP10;
      pbufon2.this.AV20Foropnum = aP11[0];
      this.aP11 = aP11;
      pbufon2.this.AV15Flag = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      AV17Fam_cod = (short)(0) ;
      /* Using cursor P03CH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P03CH2_A486ForNumCol[0] ;
         A8561Fam_Cod = P03CH2_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P03CH2_n8561Fam_Cod[0] ;
         A6379ForNomCli2 = P03CH2_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P03CH2_n6379ForNomCli2[0] ;
         A3315ForNumArc = P03CH2_A3315ForNumArc[0] ;
         n3315ForNumArc = P03CH2_n3315ForNumArc[0] ;
         A3560ForOpcCli = P03CH2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P03CH2_n3560ForOpcCli[0] ;
         A7537ForOpNum = P03CH2_A7537ForOpNum[0] ;
         n7537ForOpNum = P03CH2_n7537ForOpNum[0] ;
         AV15Flag = (byte)(1) ;
         AV16ForNumCol = A486ForNumCol ;
         AV17Fam_cod = A8561Fam_Cod ;
         AV21Fornomcli2 = A6379ForNomCli2 ;
         AV18ForNumarc = A3315ForNumArc ;
         AV19Foropccli = A3560ForOpcCli ;
         AV20Foropnum = A7537ForOpNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbufon2.this.A396EmprCod;
      this.aP1[0] = pbufon2.this.A252CliCod;
      this.aP2[0] = pbufon2.this.A494ForSer;
      this.aP3[0] = pbufon2.this.A482ForColNom;
      this.aP4[0] = pbufon2.this.A483ForColNum;
      this.aP5[0] = pbufon2.this.A831TipColCod;
      this.aP6[0] = pbufon2.this.AV16ForNumCol;
      this.aP7[0] = pbufon2.this.AV17Fam_cod;
      this.aP8[0] = pbufon2.this.AV21Fornomcli2;
      this.aP9[0] = pbufon2.this.AV18ForNumarc;
      this.aP10[0] = pbufon2.this.AV19Foropccli;
      this.aP11[0] = pbufon2.this.AV20Foropnum;
      this.aP12[0] = pbufon2.this.AV15Flag;
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
      P03CH2_A396EmprCod = new String[] {""} ;
      P03CH2_A252CliCod = new int[1] ;
      P03CH2_A494ForSer = new String[] {""} ;
      P03CH2_A482ForColNom = new String[] {""} ;
      P03CH2_A483ForColNum = new int[1] ;
      P03CH2_A831TipColCod = new byte[1] ;
      P03CH2_A486ForNumCol = new int[1] ;
      P03CH2_A8561Fam_Cod = new short[1] ;
      P03CH2_n8561Fam_Cod = new boolean[] {false} ;
      P03CH2_A6379ForNomCli2 = new String[] {""} ;
      P03CH2_n6379ForNomCli2 = new boolean[] {false} ;
      P03CH2_A3315ForNumArc = new int[1] ;
      P03CH2_n3315ForNumArc = new boolean[] {false} ;
      P03CH2_A3560ForOpcCli = new String[] {""} ;
      P03CH2_n3560ForOpcCli = new boolean[] {false} ;
      P03CH2_A7537ForOpNum = new byte[1] ;
      P03CH2_n7537ForOpNum = new boolean[] {false} ;
      A6379ForNomCli2 = "" ;
      A3560ForOpcCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbufon2__default(),
         new Object[] {
             new Object[] {
            P03CH2_A396EmprCod, P03CH2_A252CliCod, P03CH2_A494ForSer, P03CH2_A482ForColNom, P03CH2_A483ForColNum, P03CH2_A831TipColCod, P03CH2_A486ForNumCol, P03CH2_A8561Fam_Cod, P03CH2_n8561Fam_Cod, P03CH2_A6379ForNomCli2,
            P03CH2_n6379ForNomCli2, P03CH2_A3315ForNumArc, P03CH2_n3315ForNumArc, P03CH2_A3560ForOpcCli, P03CH2_n3560ForOpcCli, P03CH2_A7537ForOpNum, P03CH2_n7537ForOpNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV20Foropnum ;
   private byte AV15Flag ;
   private byte A7537ForOpNum ;
   private short AV17Fam_cod ;
   private short A8561Fam_Cod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV16ForNumCol ;
   private int AV18ForNumarc ;
   private int A486ForNumCol ;
   private int A3315ForNumArc ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV21Fornomcli2 ;
   private String AV19Foropccli ;
   private String scmdbuf ;
   private String A6379ForNomCli2 ;
   private String A3560ForOpcCli ;
   private boolean n8561Fam_Cod ;
   private boolean n6379ForNomCli2 ;
   private boolean n3315ForNumArc ;
   private boolean n3560ForOpcCli ;
   private boolean n7537ForOpNum ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P03CH2_A396EmprCod ;
   private int[] P03CH2_A252CliCod ;
   private String[] P03CH2_A494ForSer ;
   private String[] P03CH2_A482ForColNom ;
   private int[] P03CH2_A483ForColNum ;
   private byte[] P03CH2_A831TipColCod ;
   private int[] P03CH2_A486ForNumCol ;
   private short[] P03CH2_A8561Fam_Cod ;
   private boolean[] P03CH2_n8561Fam_Cod ;
   private String[] P03CH2_A6379ForNomCli2 ;
   private boolean[] P03CH2_n6379ForNomCli2 ;
   private int[] P03CH2_A3315ForNumArc ;
   private boolean[] P03CH2_n3315ForNumArc ;
   private String[] P03CH2_A3560ForOpcCli ;
   private boolean[] P03CH2_n3560ForOpcCli ;
   private byte[] P03CH2_A7537ForOpNum ;
   private boolean[] P03CH2_n7537ForOpNum ;
}

final  class pbufon2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CH2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol, Fam_Cod, ForNomCli2, ForNumArc, ForOpcCli, ForOpNum FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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

