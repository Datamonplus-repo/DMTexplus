package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prescom extends GXProcedure
{
   public prescom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prescom.class ), "" );
   }

   public prescom( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          java.math.BigDecimal[] aP2 ,
                          byte[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          int[] aP5 )
   {
      prescom.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 )
   {
      prescom.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prescom.this.AV8Producto = aP1[0];
      this.aP1 = aP1;
      prescom.this.AV10Cantidad = aP2[0];
      this.aP2 = aP2;
      prescom.this.AV11UniMed = aP3[0];
      this.aP3 = aP3;
      prescom.this.AV12TotKil = aP4[0];
      this.aP4 = aP4;
      prescom.this.AV13BarVol = aP5[0];
      this.aP5 = aP5;
      prescom.this.AV14ValCos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P015Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Producto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A688PrdComCod = P015Y2_A688PrdComCod[0] ;
         A690PrdComFN = P015Y2_A690PrdComFN[0] ;
         A719PrdNum = P015Y2_A719PrdNum[0] ;
         if ( DecimalUtil.compareTo((AV10Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), DecimalUtil.stringToDec("99999.9999")) > 0 )
         {
            AV9ProForCan = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV9ProForCan = AV10Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_decimal3[0] = AV9ProForCan ;
         new app.pactres(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3) ;
         prescom.this.A396EmprCod = GXv_char1[0] ;
         prescom.this.A719PrdNum = GXv_char2[0] ;
         prescom.this.AV9ProForCan = GXv_decimal3[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prescom.this.A396EmprCod;
      this.aP1[0] = prescom.this.AV8Producto;
      this.aP2[0] = prescom.this.AV10Cantidad;
      this.aP3[0] = prescom.this.AV11UniMed;
      this.aP4[0] = prescom.this.AV12TotKil;
      this.aP5[0] = prescom.this.AV13BarVol;
      this.aP6[0] = prescom.this.AV14ValCos;
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
      P015Y2_A396EmprCod = new String[] {""} ;
      P015Y2_A688PrdComCod = new String[] {""} ;
      P015Y2_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P015Y2_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV9ProForCan = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prescom__default(),
         new Object[] {
             new Object[] {
            P015Y2_A396EmprCod, P015Y2_A688PrdComCod, P015Y2_A690PrdComFN, P015Y2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11UniMed ;
   private short Gx_err ;
   private int AV13BarVol ;
   private int AV14ValCos ;
   private java.math.BigDecimal AV10Cantidad ;
   private java.math.BigDecimal AV12TotKil ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV9ProForCan ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String A396EmprCod ;
   private String AV8Producto ;
   private String scmdbuf ;
   private String A688PrdComCod ;
   private String A719PrdNum ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private int[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P015Y2_A396EmprCod ;
   private String[] P015Y2_A688PrdComCod ;
   private java.math.BigDecimal[] P015Y2_A690PrdComFN ;
   private String[] P015Y2_A719PrdNum ;
}

final  class prescom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P015Y2", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

