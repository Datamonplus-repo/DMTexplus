package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaes2b extends GXProcedure
{
   public pclaes2b( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaes2b.class ), "" );
   }

   public pclaes2b( int remoteHandle ,
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
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             short[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 )
   {
      pclaes2b.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        short[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             short[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pclaes2b.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaes2b.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclaes2b.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pclaes2b.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pclaes2b.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pclaes2b.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pclaes2b.this.AV15Producto = aP6[0];
      this.aP6 = aP6;
      pclaes2b.this.AV16TotCol = aP7[0];
      this.aP7 = aP7;
      pclaes2b.this.AV17FlagCol = aP8[0];
      this.aP8 = aP8;
      pclaes2b.this.AV19TotKil = aP9[0];
      this.aP9 = aP9;
      pclaes2b.this.AV20BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaes2b.this.AV21Volumen = aP11[0];
      this.aP11 = aP11;
      pclaes2b.this.AV22MaqCod = aP12[0];
      this.aP12 = aP12;
      pclaes2b.this.AV23ProCodi = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17FlagCol = (byte)(0) ;
      /* Using cursor P02XR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A626MatCod = P02XR2_A626MatCod[0] ;
         A583IntCod = P02XR2_A583IntCod[0] ;
         A486ForNumCol = P02XR2_A486ForNumCol[0] ;
         /* Using cursor P02XR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), AV15Producto});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P02XR3_A719PrdNum[0] ;
            A6193ForClaCol = P02XR3_A6193ForClaCol[0] ;
            A718PrdNom = P02XR3_A718PrdNom[0] ;
            A481ForCan = P02XR3_A481ForCan[0] ;
            A309ColLin = P02XR3_A309ColLin[0] ;
            A718PrdNom = P02XR3_A718PrdNom[0] ;
            if ( GXutil.strcmp(A6193ForClaCol, "") == 0 )
            {
               AV24PrdVal = DecimalUtil.doubleToDec(1) ;
            }
            else
            {
               AV24PrdVal = DecimalUtil.doubleToDec(0) ;
               GXv_char1[0] = A396EmprCod ;
               GXv_char2[0] = "" ;
               GXv_char3[0] = A6193ForClaCol ;
               GXv_int4[0] = (byte)(DecimalUtil.decToDouble(AV24PrdVal)) ;
               GXv_int5[0] = A252CliCod ;
               GXv_char6[0] = A494ForSer ;
               GXv_decimal7[0] = AV19TotKil ;
               GXv_char8[0] = A718PrdNom ;
               GXv_char9[0] = AV25Accion ;
               GXv_int10[0] = AV20BarLinMaq ;
               GXv_int11[0] = (int)(DecimalUtil.decToDouble(AV21Volumen)) ;
               GXv_char12[0] = AV22MaqCod ;
               GXv_int13[0] = A626MatCod ;
               GXv_char14[0] = A482ForColNom ;
               GXv_int15[0] = A483ForColNum ;
               GXv_int16[0] = A831TipColCod ;
               GXv_int17[0] = A583IntCod ;
               GXv_char18[0] = AV23ProCodi ;
               new app.psimcla(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_decimal7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_int13, GXv_char14, GXv_int15, GXv_int16, GXv_int17, GXv_char18) ;
               pclaes2b.this.A396EmprCod = GXv_char1[0] ;
               pclaes2b.this.A6193ForClaCol = GXv_char3[0] ;
               pclaes2b.this.AV24PrdVal = DecimalUtil.doubleToDec(GXv_int4[0]) ;
               pclaes2b.this.A252CliCod = GXv_int5[0] ;
               pclaes2b.this.A494ForSer = GXv_char6[0] ;
               pclaes2b.this.AV19TotKil = GXv_decimal7[0] ;
               pclaes2b.this.A718PrdNom = GXv_char8[0] ;
               pclaes2b.this.AV25Accion = GXv_char9[0] ;
               pclaes2b.this.AV20BarLinMaq = GXv_int10[0] ;
               pclaes2b.this.AV21Volumen = DecimalUtil.doubleToDec(GXv_int11[0]) ;
               pclaes2b.this.AV22MaqCod = GXv_char12[0] ;
               pclaes2b.this.A626MatCod = GXv_int13[0] ;
               pclaes2b.this.A482ForColNom = GXv_char14[0] ;
               pclaes2b.this.A483ForColNum = GXv_int15[0] ;
               pclaes2b.this.A831TipColCod = GXv_int16[0] ;
               pclaes2b.this.A583IntCod = GXv_int17[0] ;
               pclaes2b.this.AV23ProCodi = GXv_char18[0] ;
               if ( AV24PrdVal.doubleValue() == 1 )
               {
                  if ( ( GXutil.strcmp(AV25Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV25Accion, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     AV24PrdVal = DecimalUtil.doubleToDec(1) ;
                  }
                  else
                  {
                     AV24PrdVal = DecimalUtil.doubleToDec(0) ;
                  }
                  if ( ( GXutil.strcmp(AV25Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV25Accion, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     AV16TotCol = AV16TotCol.subtract(AV18UltCan) ;
                  }
               }
            }
            if ( AV24PrdVal.doubleValue() == 1 )
            {
               AV16TotCol = AV16TotCol.add(A481ForCan) ;
               AV18UltCan = A481ForCan ;
               AV17FlagCol = (byte)(1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaes2b.this.A396EmprCod;
      this.aP1[0] = pclaes2b.this.A252CliCod;
      this.aP2[0] = pclaes2b.this.A494ForSer;
      this.aP3[0] = pclaes2b.this.A482ForColNom;
      this.aP4[0] = pclaes2b.this.A483ForColNum;
      this.aP5[0] = pclaes2b.this.A831TipColCod;
      this.aP6[0] = pclaes2b.this.AV15Producto;
      this.aP7[0] = pclaes2b.this.AV16TotCol;
      this.aP8[0] = pclaes2b.this.AV17FlagCol;
      this.aP9[0] = pclaes2b.this.AV19TotKil;
      this.aP10[0] = pclaes2b.this.AV20BarLinMaq;
      this.aP11[0] = pclaes2b.this.AV21Volumen;
      this.aP12[0] = pclaes2b.this.AV22MaqCod;
      this.aP13[0] = pclaes2b.this.AV23ProCodi;
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
      P02XR2_A396EmprCod = new String[] {""} ;
      P02XR2_A252CliCod = new int[1] ;
      P02XR2_A494ForSer = new String[] {""} ;
      P02XR2_A482ForColNom = new String[] {""} ;
      P02XR2_A483ForColNum = new int[1] ;
      P02XR2_A831TipColCod = new byte[1] ;
      P02XR2_A626MatCod = new short[1] ;
      P02XR2_A583IntCod = new byte[1] ;
      P02XR2_A486ForNumCol = new int[1] ;
      P02XR3_A396EmprCod = new String[] {""} ;
      P02XR3_A486ForNumCol = new int[1] ;
      P02XR3_A719PrdNum = new String[] {""} ;
      P02XR3_A6193ForClaCol = new String[] {""} ;
      P02XR3_A718PrdNom = new String[] {""} ;
      P02XR3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XR3_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A6193ForClaCol = "" ;
      A718PrdNom = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      AV24PrdVal = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      AV25Accion = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char18 = new String[1] ;
      AV18UltCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaes2b__default(),
         new Object[] {
             new Object[] {
            P02XR2_A396EmprCod, P02XR2_A252CliCod, P02XR2_A494ForSer, P02XR2_A482ForColNom, P02XR2_A483ForColNum, P02XR2_A831TipColCod, P02XR2_A626MatCod, P02XR2_A583IntCod, P02XR2_A486ForNumCol
            }
            , new Object[] {
            P02XR3_A396EmprCod, P02XR3_A486ForNumCol, P02XR3_A719PrdNum, P02XR3_A6193ForClaCol, P02XR3_A718PrdNom, P02XR3_A481ForCan, P02XR3_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV17FlagCol ;
   private byte A583IntCod ;
   private byte GXv_int4[] ;
   private byte GXv_int16[] ;
   private byte GXv_int17[] ;
   private short AV20BarLinMaq ;
   private short A626MatCod ;
   private short A309ColLin ;
   private short GXv_int10[] ;
   private short GXv_int13[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int GXv_int5[] ;
   private int GXv_int11[] ;
   private int GXv_int15[] ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal AV19TotKil ;
   private java.math.BigDecimal AV21Volumen ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV24PrdVal ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV18UltCan ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV15Producto ;
   private String AV22MaqCod ;
   private String AV23ProCodi ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A6193ForClaCol ;
   private String A718PrdNom ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String AV25Accion ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String GXv_char18[] ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private short[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XR2_A396EmprCod ;
   private int[] P02XR2_A252CliCod ;
   private String[] P02XR2_A494ForSer ;
   private String[] P02XR2_A482ForColNom ;
   private int[] P02XR2_A483ForColNum ;
   private byte[] P02XR2_A831TipColCod ;
   private short[] P02XR2_A626MatCod ;
   private byte[] P02XR2_A583IntCod ;
   private int[] P02XR2_A486ForNumCol ;
   private String[] P02XR3_A396EmprCod ;
   private int[] P02XR3_A486ForNumCol ;
   private String[] P02XR3_A719PrdNum ;
   private String[] P02XR3_A6193ForClaCol ;
   private String[] P02XR3_A718PrdNom ;
   private java.math.BigDecimal[] P02XR3_A481ForCan ;
   private short[] P02XR3_A309ColLin ;
}

final  class pclaes2b__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XR2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, MatCod, IntCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XR3", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForClaCol, T2.PrdNom, T1.ForCan, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

