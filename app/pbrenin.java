package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbrenin extends GXProcedure
{
   public pbrenin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbrenin.class ), "" );
   }

   public pbrenin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 )
   {
      pbrenin.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 )
   {
      pbrenin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbrenin.this.AV26PrdNum = aP1[0];
      this.aP1 = aP1;
      pbrenin.this.AV27PrdNom = aP2[0];
      this.aP2 = aP2;
      pbrenin.this.AV21Canrec = aP3[0];
      this.aP3 = aP3;
      pbrenin.this.AV25BarVol = aP4[0];
      this.aP4 = aP4;
      pbrenin.this.AV23RecSalmp = aP5[0];
      this.aP5 = aP5;
      pbrenin.this.AV22RecSalVol = aP6[0];
      this.aP6 = aP6;
      pbrenin.this.AV19Unimed = aP7[0];
      this.aP7 = aP7;
      pbrenin.this.AV20Cantidad = aP8[0];
      this.aP8 = aP8;
      pbrenin.this.AV24ValSal = aP9[0];
      this.aP9 = aP9;
      pbrenin.this.AV28Recacc = aP10[0];
      this.aP10 = aP10;
      pbrenin.this.AV29Valcod = aP11[0];
      this.aP11 = aP11;
      pbrenin.this.AV30recMar = aP12[0];
      this.aP12 = aP12;
      pbrenin.this.AV31Prdnumi = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV33Consumos ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int2) ;
      pbrenin.this.GXt_int1 = GXv_int2[0] ;
      AV33Consumos = (byte)(GXt_int1) ;
      AV29Valcod = (byte)(9) ;
      /* Using cursor P03KC2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5418PrdSalM = P03KC2_A5418PrdSalM[0] ;
         A719PrdNum = P03KC2_A719PrdNum[0] ;
         A718PrdNom = P03KC2_A718PrdNom[0] ;
         A856ValCod = P03KC2_A856ValCod[0] ;
         A704PrdExiAlm = P03KC2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P03KC2_A705PrdExiCC[0] ;
         A685PrdCanRes = P03KC2_A685PrdCanRes[0] ;
         if ( GXutil.strcmp(A5418PrdSalM, httpContext.getMessage( "S", "")) == 0 )
         {
            AV26PrdNum = A719PrdNum ;
            AV27PrdNom = A718PrdNom ;
            AV29Valcod = A856ValCod ;
            AV35Existencia = ((AV33Consumos==0) ? A705PrdExiCC : A704PrdExiAlm) ;
            AV36ExiRes = AV35Existencia.subtract(A685PrdCanRes) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV29Valcod == 9 )
      {
         Gx_msg = httpContext.getMessage( "El sistema no ha encontrado SAL LIQUIDA ¡¡¡,nowait", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV31Prdnumi ;
      GXv_decimal5[0] = AV32Canteo ;
      new app.pactres(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5) ;
      pbrenin.this.A396EmprCod = GXv_char3[0] ;
      pbrenin.this.AV31Prdnumi = GXv_char4[0] ;
      pbrenin.this.AV32Canteo = GXv_decimal5[0] ;
      if ( DecimalUtil.compareTo(AV36ExiRes, AV21Canrec) >= 0 )
      {
         AV34Ok_cant = (byte)(1) ;
         AV30recMar = (byte)(0) ;
      }
      AV22RecSalVol = (int)(DecimalUtil.decToDouble((AV21Canrec.multiply(DecimalUtil.doubleToDec(1000))).divide(DecimalUtil.doubleToDec(AV24ValSal), 18, java.math.RoundingMode.DOWN))) ;
      AV23RecSalmp = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV22RecSalVol/ (double) (AV25BarVol))*100), 0))) ;
      AV28Recacc = httpContext.getMessage( "Solido x Liquido ", "") + httpContext.getMessage( "U=", "") + GXutil.str( AV19Unimed, 1, 0) + httpContext.getMessage( " Fac=", "") + GXutil.str( AV20Cantidad, 12, 5) ;
      AV19Unimed = (byte)(2) ;
      AV20Cantidad = DecimalUtil.doubleToDec((AV23RecSalmp/ (double) (100))*1000) ;
      AV21Canrec = DecimalUtil.doubleToDec(AV22RecSalVol) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = AV26PrdNum ;
      GXv_decimal5[0] = AV21Canrec ;
      new app.pactres(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
      pbrenin.this.A396EmprCod = GXv_char4[0] ;
      pbrenin.this.AV26PrdNum = GXv_char3[0] ;
      pbrenin.this.AV21Canrec = GXv_decimal5[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbrenin.this.A396EmprCod;
      this.aP1[0] = pbrenin.this.AV26PrdNum;
      this.aP2[0] = pbrenin.this.AV27PrdNom;
      this.aP3[0] = pbrenin.this.AV21Canrec;
      this.aP4[0] = pbrenin.this.AV25BarVol;
      this.aP5[0] = pbrenin.this.AV23RecSalmp;
      this.aP6[0] = pbrenin.this.AV22RecSalVol;
      this.aP7[0] = pbrenin.this.AV19Unimed;
      this.aP8[0] = pbrenin.this.AV20Cantidad;
      this.aP9[0] = pbrenin.this.AV24ValSal;
      this.aP10[0] = pbrenin.this.AV28Recacc;
      this.aP11[0] = pbrenin.this.AV29Valcod;
      this.aP12[0] = pbrenin.this.AV30recMar;
      this.aP13[0] = pbrenin.this.AV31Prdnumi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      scmdbuf = "" ;
      P03KC2_A396EmprCod = new String[] {""} ;
      P03KC2_A5418PrdSalM = new String[] {""} ;
      P03KC2_A719PrdNum = new String[] {""} ;
      P03KC2_A718PrdNom = new String[] {""} ;
      P03KC2_A856ValCod = new byte[1] ;
      P03KC2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KC2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KC2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5418PrdSalM = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV35Existencia = DecimalUtil.ZERO ;
      AV36ExiRes = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV32Canteo = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbrenin__default(),
         new Object[] {
             new Object[] {
            P03KC2_A396EmprCod, P03KC2_A5418PrdSalM, P03KC2_A719PrdNum, P03KC2_A718PrdNom, P03KC2_A856ValCod, P03KC2_A704PrdExiAlm, P03KC2_A705PrdExiCC, P03KC2_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Unimed ;
   private byte AV29Valcod ;
   private byte AV30recMar ;
   private byte AV33Consumos ;
   private byte A856ValCod ;
   private byte AV34Ok_cant ;
   private short AV23RecSalmp ;
   private short Gx_err ;
   private int AV25BarVol ;
   private int AV22RecSalVol ;
   private int AV24ValSal ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV21Canrec ;
   private java.math.BigDecimal AV20Cantidad ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV35Existencia ;
   private java.math.BigDecimal AV36ExiRes ;
   private java.math.BigDecimal AV32Canteo ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV26PrdNum ;
   private String AV27PrdNom ;
   private String AV28Recacc ;
   private String AV31Prdnumi ;
   private String scmdbuf ;
   private String A5418PrdSalM ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private String[] aP13 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private byte[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P03KC2_A396EmprCod ;
   private String[] P03KC2_A5418PrdSalM ;
   private String[] P03KC2_A719PrdNum ;
   private String[] P03KC2_A718PrdNom ;
   private byte[] P03KC2_A856ValCod ;
   private java.math.BigDecimal[] P03KC2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P03KC2_A705PrdExiCC ;
   private java.math.BigDecimal[] P03KC2_A685PrdCanRes ;
}

final  class pbrenin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KC2", "SELECT EmprCod, PrdSalM, PrdNum, PrdNom, ValCod, PrdExiAlm, PrdExiCC, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? ORDER BY EmprCod, PrdSalM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
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
               return;
      }
   }

}

