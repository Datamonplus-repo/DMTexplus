package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp04 extends GXProcedure
{
   public pdyrp04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp04.class ), "" );
   }

   public pdyrp04( int remoteHandle ,
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
      pdyrp04.this.aP6 = new int[] {0};
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
      pdyrp04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp04.this.AV17Producto = aP1[0];
      this.aP1 = aP1;
      pdyrp04.this.AV19Cantidad = aP2[0];
      this.aP2 = aP2;
      pdyrp04.this.AV20UniMed = aP3[0];
      this.aP3 = aP3;
      pdyrp04.this.AV21TotKil = aP4[0];
      this.aP4 = aP4;
      pdyrp04.this.AV22BarVol = aP5[0];
      this.aP5 = aP5;
      pdyrp04.this.AV23ValCos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P099B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17Producto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A688PrdComCod = P099B2_A688PrdComCod[0] ;
         A690PrdComFN = P099B2_A690PrdComFN[0] ;
         A719PrdNum = P099B2_A719PrdNum[0] ;
         if ( DecimalUtil.compareTo((AV19Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), DecimalUtil.stringToDec("99999.9999")) > 0 )
         {
            AV18ProForCan = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV18ProForCan = AV19Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_decimal3[0] = AV18ProForCan ;
         new app.pdyrp05(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3) ;
         pdyrp04.this.A396EmprCod = GXv_char1[0] ;
         pdyrp04.this.A719PrdNum = GXv_char2[0] ;
         pdyrp04.this.AV18ProForCan = GXv_decimal3[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp04.this.A396EmprCod;
      this.aP1[0] = pdyrp04.this.AV17Producto;
      this.aP2[0] = pdyrp04.this.AV19Cantidad;
      this.aP3[0] = pdyrp04.this.AV20UniMed;
      this.aP4[0] = pdyrp04.this.AV21TotKil;
      this.aP5[0] = pdyrp04.this.AV22BarVol;
      this.aP6[0] = pdyrp04.this.AV23ValCos;
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
      P099B2_A396EmprCod = new String[] {""} ;
      P099B2_A688PrdComCod = new String[] {""} ;
      P099B2_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099B2_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV18ProForCan = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp04__default(),
         new Object[] {
             new Object[] {
            P099B2_A396EmprCod, P099B2_A688PrdComCod, P099B2_A690PrdComFN, P099B2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20UniMed ;
   private short Gx_err ;
   private int AV22BarVol ;
   private int AV23ValCos ;
   private java.math.BigDecimal AV19Cantidad ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV18ProForCan ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String A396EmprCod ;
   private String AV17Producto ;
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
   private String[] P099B2_A396EmprCod ;
   private String[] P099B2_A688PrdComCod ;
   private java.math.BigDecimal[] P099B2_A690PrdComFN ;
   private String[] P099B2_A719PrdNum ;
}

final  class pdyrp04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099B2", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

