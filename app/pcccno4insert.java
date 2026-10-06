package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcccno4insert extends GXProcedure
{
   public pcccno4insert( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccno4insert.class ), "" );
   }

   public pcccno4insert( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 )
   {
      pcccno4insert.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pcccno4insert.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcccno4insert.this.AV10Clicod = aP1[0];
      this.aP1 = aP1;
      pcccno4insert.this.AV11Tb1_cod = aP2[0];
      this.aP2 = aP2;
      pcccno4insert.this.AV12Ccartcod = aP3[0];
      this.aP3 = aP3;
      pcccno4insert.this.AV16CCColNom = aP4[0];
      this.aP4 = aP4;
      pcccno4insert.this.AV17CCColNum = aP5[0];
      this.aP5 = aP5;
      pcccno4insert.this.AV18CCCTc = aP6[0];
      this.aP6 = aP6;
      pcccno4insert.this.AV14IntId = aP7[0];
      this.aP7 = aP7;
      pcccno4insert.this.AV15IntDs = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04U32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Clicod), AV16CCColNom, Integer.valueOf(AV17CCColNum), Byte.valueOf(AV18CCCTc), AV12Ccartcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P04U32_A252CliCod[0] ;
         A494ForSer = P04U32_A494ForSer[0] ;
         A482ForColNom = P04U32_A482ForColNom[0] ;
         A483ForColNum = P04U32_A483ForColNum[0] ;
         A831TipColCod = P04U32_A831TipColCod[0] ;
         A583IntCod = P04U32_A583IntCod[0] ;
         A584IntDsc = P04U32_A584IntDsc[0] ;
         n584IntDsc = P04U32_n584IntDsc[0] ;
         A584IntDsc = P04U32_A584IntDsc[0] ;
         n584IntDsc = P04U32_n584IntDsc[0] ;
         AV14IntId = A583IntCod ;
         AV15IntDs = A584IntDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPCCCno4

      */
      A252CliCod = AV10Clicod ;
      A9713Tb1_Cod = AV11Tb1_cod ;
      A11736CCArtCod = AV12Ccartcod ;
      A11748TipArtiId = AV8TipArtiid ;
      A11737CCColNom = AV16CCColNom ;
      A11738CCColNum = AV17CCColNum ;
      A11749CCCTc = AV18CCCTc ;
      A11750IntId = AV14IntId ;
      /* Using cursor P04U33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
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
      this.aP0[0] = pcccno4insert.this.A396EmprCod;
      this.aP1[0] = pcccno4insert.this.AV10Clicod;
      this.aP2[0] = pcccno4insert.this.AV11Tb1_cod;
      this.aP3[0] = pcccno4insert.this.AV12Ccartcod;
      this.aP4[0] = pcccno4insert.this.AV16CCColNom;
      this.aP5[0] = pcccno4insert.this.AV17CCColNum;
      this.aP6[0] = pcccno4insert.this.AV18CCCTc;
      this.aP7[0] = pcccno4insert.this.AV14IntId;
      this.aP8[0] = pcccno4insert.this.AV15IntDs;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcccno4insert");
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
      P04U32_A396EmprCod = new String[] {""} ;
      P04U32_A252CliCod = new int[1] ;
      P04U32_A494ForSer = new String[] {""} ;
      P04U32_A482ForColNom = new String[] {""} ;
      P04U32_A483ForColNum = new int[1] ;
      P04U32_A831TipColCod = new byte[1] ;
      P04U32_A583IntCod = new byte[1] ;
      P04U32_A584IntDsc = new String[] {""} ;
      P04U32_n584IntDsc = new boolean[] {false} ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A584IntDsc = "" ;
      A11736CCArtCod = "" ;
      A11737CCColNom = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccno4insert__default(),
         new Object[] {
             new Object[] {
            P04U32_A396EmprCod, P04U32_A252CliCod, P04U32_A494ForSer, P04U32_A482ForColNom, P04U32_A483ForColNum, P04U32_A831TipColCod, P04U32_A583IntCod, P04U32_A584IntDsc, P04U32_n584IntDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18CCCTc ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A11749CCCTc ;
   private short AV11Tb1_cod ;
   private short AV14IntId ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short AV8TipArtiid ;
   private short A11750IntId ;
   private short Gx_err ;
   private int AV10Clicod ;
   private int AV17CCColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int GX_INS1650 ;
   private int A11738CCColNum ;
   private String A396EmprCod ;
   private String AV12Ccartcod ;
   private String AV16CCColNom ;
   private String AV15IntDs ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A584IntDsc ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private String Gx_emsg ;
   private boolean n584IntDsc ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04U32_A396EmprCod ;
   private int[] P04U32_A252CliCod ;
   private String[] P04U32_A494ForSer ;
   private String[] P04U32_A482ForColNom ;
   private int[] P04U32_A483ForColNum ;
   private byte[] P04U32_A831TipColCod ;
   private byte[] P04U32_A583IntCod ;
   private String[] P04U32_A584IntDsc ;
   private boolean[] P04U32_n584IntDsc ;
}

final  class pcccno4insert__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04U32", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.IntCod, T2.IntDsc FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ?) AND (T1.ForSer = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04U33", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
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
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

