package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preclin0 extends GXProcedure
{
   public preclin0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preclin0.class ), "" );
   }

   public preclin0( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           int[] aP5 ,
                           int[] aP6 )
   {
      preclin0.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      preclin0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preclin0.this.AV8PrdComCod = aP1[0];
      this.aP1 = aP1;
      preclin0.this.AV9Cantold = aP2[0];
      this.aP2 = aP2;
      preclin0.this.AV10CantNew = aP3[0];
      this.aP3 = aP3;
      preclin0.this.AV11TotKil = aP4[0];
      this.aP4 = aP4;
      preclin0.this.AV13BarVol = aP5[0];
      this.aP5 = aP5;
      preclin0.this.AV12ValCos = aP6[0];
      this.aP6 = aP6;
      preclin0.this.AV15ForPrdUMe = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02A42 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdComCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A688PrdComCod = P02A42_A688PrdComCod[0] ;
         A690PrdComFN = P02A42_A690PrdComFN[0] ;
         A719PrdNum = P02A42_A719PrdNum[0] ;
         AV14ProForcan = AV9Cantold.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( AV15ForPrdUMe == 3 )
         {
            AV14ProForcan = AV14ProForcan.multiply(AV11TotKil).multiply(DecimalUtil.doubleToDec(AV12ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV14ProForcan = AV14ProForcan.multiply(DecimalUtil.doubleToDec(AV13BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_decimal3[0] = AV14ProForcan ;
         GXv_decimal4[0] = A690PrdComFN ;
         new app.pactres3(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3, GXv_decimal4) ;
         preclin0.this.A396EmprCod = GXv_char1[0] ;
         preclin0.this.A719PrdNum = GXv_char2[0] ;
         preclin0.this.AV14ProForcan = GXv_decimal3[0] ;
         preclin0.this.A690PrdComFN = GXv_decimal4[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02A43 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdComCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A688PrdComCod = P02A43_A688PrdComCod[0] ;
         A690PrdComFN = P02A43_A690PrdComFN[0] ;
         A719PrdNum = P02A43_A719PrdNum[0] ;
         AV14ProForcan = AV10CantNew.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( AV15ForPrdUMe == 3 )
         {
            AV14ProForcan = AV14ProForcan.multiply(AV11TotKil).multiply(DecimalUtil.doubleToDec(AV12ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV14ProForcan = AV14ProForcan.multiply(DecimalUtil.doubleToDec(AV13BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         GXv_char2[0] = A396EmprCod ;
         GXv_char1[0] = A719PrdNum ;
         GXv_decimal4[0] = AV14ProForcan ;
         new app.pactres(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal4) ;
         preclin0.this.A396EmprCod = GXv_char2[0] ;
         preclin0.this.A719PrdNum = GXv_char1[0] ;
         preclin0.this.AV14ProForcan = GXv_decimal4[0] ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preclin0.this.A396EmprCod;
      this.aP1[0] = preclin0.this.AV8PrdComCod;
      this.aP2[0] = preclin0.this.AV9Cantold;
      this.aP3[0] = preclin0.this.AV10CantNew;
      this.aP4[0] = preclin0.this.AV11TotKil;
      this.aP5[0] = preclin0.this.AV13BarVol;
      this.aP6[0] = preclin0.this.AV12ValCos;
      this.aP7[0] = preclin0.this.AV15ForPrdUMe;
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
      P02A42_A396EmprCod = new String[] {""} ;
      P02A42_A688PrdComCod = new String[] {""} ;
      P02A42_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02A42_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV14ProForcan = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      P02A43_A396EmprCod = new String[] {""} ;
      P02A43_A688PrdComCod = new String[] {""} ;
      P02A43_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02A43_A719PrdNum = new String[] {""} ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preclin0__default(),
         new Object[] {
             new Object[] {
            P02A42_A396EmprCod, P02A42_A688PrdComCod, P02A42_A690PrdComFN, P02A42_A719PrdNum
            }
            , new Object[] {
            P02A43_A396EmprCod, P02A43_A688PrdComCod, P02A43_A690PrdComFN, P02A43_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15ForPrdUMe ;
   private short Gx_err ;
   private int AV13BarVol ;
   private int AV12ValCos ;
   private java.math.BigDecimal AV9Cantold ;
   private java.math.BigDecimal AV10CantNew ;
   private java.math.BigDecimal AV11TotKil ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV14ProForcan ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String AV8PrdComCod ;
   private String scmdbuf ;
   private String A688PrdComCod ;
   private String A719PrdNum ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02A42_A396EmprCod ;
   private String[] P02A42_A688PrdComCod ;
   private java.math.BigDecimal[] P02A42_A690PrdComFN ;
   private String[] P02A42_A719PrdNum ;
   private String[] P02A43_A396EmprCod ;
   private String[] P02A43_A688PrdComCod ;
   private java.math.BigDecimal[] P02A43_A690PrdComFN ;
   private String[] P02A43_A719PrdNum ;
}

final  class preclin0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02A42", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02A43", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

