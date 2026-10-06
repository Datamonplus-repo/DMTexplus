package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdauxa extends GXProcedure
{
   public pprdauxa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdauxa.class ), "" );
   }

   public pprdauxa( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            int[] aP2 ,
                            String[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            byte[] aP5 )
   {
      pprdauxa.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 )
   {
      pprdauxa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdauxa.this.AV13PrdLin = aP1[0];
      this.aP1 = aP1;
      pprdauxa.this.AV12ForNumCol = aP2[0];
      this.aP2 = aP2;
      pprdauxa.this.AV8PrdNum = aP3[0];
      this.aP3 = aP3;
      pprdauxa.this.AV9LB_TAAUXCT = aP4[0];
      this.aP4 = aP4;
      pprdauxa.this.AV10FORPRDUME = aP5[0];
      this.aP5 = aP5;
      pprdauxa.this.AV11lb_tauxord = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPLPRFOR

      */
      A486ForNumCol = AV12ForNumCol ;
      A715PrdLin = AV13PrdLin ;
      A719PrdNum = AV8PrdNum ;
      A487ForPrdCan = AV9LB_TAAUXCT ;
      A490ForPrdUMe = AV10FORPRDUME ;
      A489ForPrdNor = AV11lb_tauxord ;
      /* Using cursor P02FN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin), A719PrdNum, A487ForPrdCan, Byte.valueOf(A490ForPrdUMe), Short.valueOf(A489ForPrdNor)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
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
      this.aP0[0] = pprdauxa.this.A396EmprCod;
      this.aP1[0] = pprdauxa.this.AV13PrdLin;
      this.aP2[0] = pprdauxa.this.AV12ForNumCol;
      this.aP3[0] = pprdauxa.this.AV8PrdNum;
      this.aP4[0] = pprdauxa.this.AV9LB_TAAUXCT;
      this.aP5[0] = pprdauxa.this.AV10FORPRDUME;
      this.aP6[0] = pprdauxa.this.AV11lb_tauxord;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprdauxa");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A719PrdNum = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdauxa__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10FORPRDUME ;
   private byte A490ForPrdUMe ;
   private short AV13PrdLin ;
   private short AV11lb_tauxord ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short Gx_err ;
   private int AV12ForNumCol ;
   private int GX_INS82 ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV9LB_TAAUXCT ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String A719PrdNum ;
   private String Gx_emsg ;
   private short[] aP6 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pprdauxa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02FN2", "INSERT INTO TXPLPRFOR(EmprCod, ForNumCol, PrdLin, PrdNum, ForPrdCan, ForPrdUMe, ForPrdNor) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

