package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcompue extends GXProcedure
{
   public pcompue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcompue.class ), "" );
   }

   public pcompue( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           byte[] aP4 ,
                           byte[] aP5 )
   {
      pcompue.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pcompue.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcompue.this.AV15PrdComCod = aP1[0];
      this.aP1 = aP1;
      pcompue.this.AV16PrdCant = aP2[0];
      this.aP2 = aP2;
      pcompue.this.AV17PrdCanFin = aP3[0];
      this.aP3 = aP3;
      pcompue.this.AV18Flag3 = aP4[0];
      this.aP4 = aP4;
      pcompue.this.AV19Flag2 = aP5[0];
      this.aP5 = aP5;
      pcompue.this.AV20Consumos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00EU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV15PrdComCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A688PrdComCod = P00EU2_A688PrdComCod[0] ;
         A690PrdComFN = P00EU2_A690PrdComFN[0] ;
         A719PrdNum = P00EU2_A719PrdNum[0] ;
         if ( GXutil.strcmp(A688PrdComCod, AV15PrdComCod) == 0 )
         {
            /* Using cursor P00EU3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
            A707PrdFacCon = P00EU3_A707PrdFacCon[0] ;
            A705PrdExiCC = P00EU3_A705PrdExiCC[0] ;
            A704PrdExiAlm = P00EU3_A704PrdExiAlm[0] ;
            A685PrdCanRes = P00EU3_A685PrdCanRes[0] ;
            AV21Exis = ((AV16PrdCant.add(AV22PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( (0==AV18Flag3) )
            {
               if ( AV20Consumos == 0 )
               {
                  A705PrdExiCC = A705PrdExiCC.subtract(AV21Exis) ;
               }
               else
               {
                  if ( A704PrdExiAlm.subtract(AV21Exis).doubleValue() < 0 )
                  {
                     A704PrdExiAlm = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     A704PrdExiAlm = A704PrdExiAlm.subtract(AV21Exis) ;
                  }
                  if ( ! (0==AV19Flag2) )
                  {
                     A685PrdCanRes = A685PrdCanRes.subtract(((AV17PrdCanFin.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
                  }
                  GXv_char1[0] = A396EmprCod ;
                  GXv_char2[0] = A719PrdNum ;
                  GXv_decimal3[0] = AV21Exis ;
                  GXv_char4[0] = AV23EntLotN ;
                  new app.palmtin(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3, GXv_char4) ;
                  pcompue.this.A396EmprCod = GXv_char1[0] ;
                  pcompue.this.A719PrdNum = GXv_char2[0] ;
                  pcompue.this.AV21Exis = GXv_decimal3[0] ;
                  pcompue.this.AV23EntLotN = GXv_char4[0] ;
               }
            }
            else
            {
               if ( AV20Consumos == 0 )
               {
                  A705PrdExiCC = A705PrdExiCC.subtract(AV21Exis) ;
               }
               else
               {
                  GXv_char4[0] = A396EmprCod ;
                  GXv_char2[0] = A719PrdNum ;
                  GXv_decimal3[0] = AV21Exis ;
                  GXv_char1[0] = AV23EntLotN ;
                  new app.palmtin(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_decimal3, GXv_char1) ;
                  pcompue.this.A396EmprCod = GXv_char4[0] ;
                  pcompue.this.A719PrdNum = GXv_char2[0] ;
                  pcompue.this.AV21Exis = GXv_decimal3[0] ;
                  pcompue.this.AV23EntLotN = GXv_char1[0] ;
               }
            }
            /* Using cursor P00EU4 */
            pr_default.execute(2, new Object[] {A705PrdExiCC, A704PrdExiAlm, A685PrdCanRes, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcompue.this.A396EmprCod;
      this.aP1[0] = pcompue.this.AV15PrdComCod;
      this.aP2[0] = pcompue.this.AV16PrdCant;
      this.aP3[0] = pcompue.this.AV17PrdCanFin;
      this.aP4[0] = pcompue.this.AV18Flag3;
      this.aP5[0] = pcompue.this.AV19Flag2;
      this.aP6[0] = pcompue.this.AV20Consumos;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcompue");
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
      P00EU2_A396EmprCod = new String[] {""} ;
      P00EU2_A688PrdComCod = new String[] {""} ;
      P00EU2_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EU2_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      P00EU3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EU3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EU3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EU3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV21Exis = DecimalUtil.ZERO ;
      AV22PrdCanAny = DecimalUtil.ZERO ;
      AV23EntLotN = "" ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcompue__default(),
         new Object[] {
             new Object[] {
            P00EU2_A396EmprCod, P00EU2_A688PrdComCod, P00EU2_A690PrdComFN, P00EU2_A719PrdNum
            }
            , new Object[] {
            P00EU3_A707PrdFacCon, P00EU3_A705PrdExiCC, P00EU3_A704PrdExiAlm, P00EU3_A685PrdCanRes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Flag3 ;
   private byte AV19Flag2 ;
   private byte AV20Consumos ;
   private short Gx_err ;
   private java.math.BigDecimal AV16PrdCant ;
   private java.math.BigDecimal AV17PrdCanFin ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV21Exis ;
   private java.math.BigDecimal AV22PrdCanAny ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String A396EmprCod ;
   private String AV15PrdComCod ;
   private String scmdbuf ;
   private String A688PrdComCod ;
   private String A719PrdNum ;
   private String AV23EntLotN ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EU2_A396EmprCod ;
   private String[] P00EU2_A688PrdComCod ;
   private java.math.BigDecimal[] P00EU2_A690PrdComFN ;
   private String[] P00EU2_A719PrdNum ;
   private java.math.BigDecimal[] P00EU3_A707PrdFacCon ;
   private java.math.BigDecimal[] P00EU3_A705PrdExiCC ;
   private java.math.BigDecimal[] P00EU3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00EU3_A685PrdCanRes ;
}

final  class pcompue__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EU2", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND ((EmprCod = ?) AND (PrdComCod = ?)) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00EU3", "SELECT PrdFacCon, PrdExiCC, PrdExiAlm, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00EU4", "UPDATE TXPPRODUC SET PrdExiCC=?, PrdExiAlm=?, PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

