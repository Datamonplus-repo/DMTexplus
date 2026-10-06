package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inslineaprocesoquimico extends GXProcedure
{
   public inslineaprocesoquimico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inslineaprocesoquimico.class ), "" );
   }

   public inslineaprocesoquimico( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           byte[] aP7 )
   {
      inslineaprocesoquimico.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 )
   {
      inslineaprocesoquimico.this.AV18Emprcod = aP0[0];
      this.aP0 = aP0;
      inslineaprocesoquimico.this.AV17Proforcod = aP1[0];
      this.aP1 = aP1;
      inslineaprocesoquimico.this.AV13ProForLin = aP2[0];
      this.aP2 = aP2;
      inslineaprocesoquimico.this.AV15ProForPrd = aP3[0];
      this.aP3 = aP3;
      inslineaprocesoquimico.this.AV11ProForDes = aP4[0];
      this.aP4 = aP4;
      inslineaprocesoquimico.this.AV9ForPrdUMe = aP5[0];
      this.aP5 = aP5;
      inslineaprocesoquimico.this.AV10ProForCan = aP6[0];
      this.aP6 = aP6;
      inslineaprocesoquimico.this.AV14ProForNro = aP7[0];
      this.aP7 = aP7;
      inslineaprocesoquimico.this.AV16ProForTnq = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPLPROFO

      */
      A396EmprCod = AV18Emprcod ;
      A764ProForCod = AV17Proforcod ;
      A767ProForLin = AV13ProForLin ;
      A770ProForPrd = AV15ProForPrd ;
      A765ProForDes = AV11ProForDes ;
      A490ForPrdUMe = AV9ForPrdUMe ;
      A762ProForCan = AV10ProForCan ;
      A763ProForCla = " " ;
      A5358ProForClv = " " ;
      A1645ProForNro = AV14ProForNro ;
      A3379ProForTnq = AV14ProForNro ;
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      A13111ProForDe2 = " " ;
      A13178ProForFT = " " ;
      /* Using cursor P08J52 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, Byte.valueOf(A490ForPrdUMe), A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A6062ProForCPo, A765ProForDes, A13178ProForFT, A13111ProForDe2});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
      if ( (pr_default.getStatus(0) == 1) )
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
      this.aP0[0] = inslineaprocesoquimico.this.AV18Emprcod;
      this.aP1[0] = inslineaprocesoquimico.this.AV17Proforcod;
      this.aP2[0] = inslineaprocesoquimico.this.AV13ProForLin;
      this.aP3[0] = inslineaprocesoquimico.this.AV15ProForPrd;
      this.aP4[0] = inslineaprocesoquimico.this.AV11ProForDes;
      this.aP5[0] = inslineaprocesoquimico.this.AV9ForPrdUMe;
      this.aP6[0] = inslineaprocesoquimico.this.AV10ProForCan;
      this.aP7[0] = inslineaprocesoquimico.this.AV14ProForNro;
      this.aP8[0] = inslineaprocesoquimico.this.AV16ProForTnq;
      Application.commitDataStores(context, remoteHandle, pr_default, "inslineaprocesoquimico");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A13111ProForDe2 = "" ;
      A13178ProForFT = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.inslineaprocesoquimico__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9ForPrdUMe ;
   private byte AV14ProForNro ;
   private byte AV16ProForTnq ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private short AV13ProForLin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int GX_INS90 ;
   private java.math.BigDecimal AV10ProForCan ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A6062ProForCPo ;
   private String AV18Emprcod ;
   private String AV17Proforcod ;
   private String AV15ProForPrd ;
   private String AV11ProForDes ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A13111ProForDe2 ;
   private String A13178ProForFT ;
   private String Gx_emsg ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
}

final  class inslineaprocesoquimico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P08J52", "INSERT INTO TXPLPROFO(EmprCod, ProForCod, ProForLin, ProForPrd, ForPrdUMe, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForCPo, ProForDes, ProForFT, ProForDe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 30);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 26);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 40);
               return;
      }
   }

}

