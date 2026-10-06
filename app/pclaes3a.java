package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaes3a extends GXProcedure
{
   public pclaes3a( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaes3a.class ), "" );
   }

   public pclaes3a( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            byte[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            byte[] aP8 ,
                            int[] aP9 ,
                            byte[] aP10 ,
                            String[] aP11 ,
                            java.math.BigDecimal[] aP12 )
   {
      pclaes3a.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             short[] aP13 )
   {
      pclaes3a.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaes3a.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclaes3a.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pclaes3a.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pclaes3a.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pclaes3a.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pclaes3a.this.AV15Familia = aP6[0];
      this.aP6 = aP6;
      pclaes3a.this.AV16TotCol = aP7[0];
      this.aP7 = aP7;
      pclaes3a.this.AV17FlagCol = aP8[0];
      this.aP8 = aP8;
      pclaes3a.this.AV24BarCod = aP9[0];
      this.aP9 = aP9;
      pclaes3a.this.AV25BarCodReo = aP10[0];
      this.aP10 = aP10;
      pclaes3a.this.AV26BarCodPar = aP11[0];
      this.aP11 = aP11;
      pclaes3a.this.AV27TotKil = aP12[0];
      this.aP12 = aP12;
      pclaes3a.this.AV28BarLinMaq = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17FlagCol = (byte)(0) ;
      AV23UltCan = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02XS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P02XS2_A486ForNumCol[0] ;
         Gx_msg += httpContext.getMessage( "Existe Formula.", "") + GXutil.chr( (short)(13)) ;
         /* Using cursor P02XS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P02XS3_A719PrdNum[0] ;
            A6193ForClaCol = P02XS3_A6193ForClaCol[0] ;
            A718PrdNom = P02XS3_A718PrdNom[0] ;
            A481ForCan = P02XS3_A481ForCan[0] ;
            A309ColLin = P02XS3_A309ColLin[0] ;
            A718PrdNom = P02XS3_A718PrdNom[0] ;
            AV19Length = (byte)(GXutil.len( A719PrdNum)) ;
            if ( GXutil.strcmp(A6193ForClaCol, "") == 0 )
            {
               AV21PrdVal = (byte)(1) ;
            }
            else
            {
               AV21PrdVal = (byte)(0) ;
               GXv_char1[0] = A396EmprCod ;
               GXv_char2[0] = "" ;
               GXv_char3[0] = A6193ForClaCol ;
               GXv_int4[0] = AV21PrdVal ;
               GXv_int5[0] = AV24BarCod ;
               GXv_int6[0] = AV25BarCodReo ;
               GXv_char7[0] = AV26BarCodPar ;
               GXv_decimal8[0] = AV27TotKil ;
               GXv_char9[0] = A718PrdNom ;
               GXv_char10[0] = AV22Accion ;
               GXv_int11[0] = AV28BarLinMaq ;
               new app.pclaesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char9, GXv_char10, GXv_int11) ;
               pclaes3a.this.A396EmprCod = GXv_char1[0] ;
               pclaes3a.this.A6193ForClaCol = GXv_char3[0] ;
               pclaes3a.this.AV21PrdVal = GXv_int4[0] ;
               pclaes3a.this.AV24BarCod = GXv_int5[0] ;
               pclaes3a.this.AV25BarCodReo = GXv_int6[0] ;
               pclaes3a.this.AV26BarCodPar = GXv_char7[0] ;
               pclaes3a.this.AV27TotKil = GXv_decimal8[0] ;
               pclaes3a.this.A718PrdNom = GXv_char9[0] ;
               pclaes3a.this.AV22Accion = GXv_char10[0] ;
               pclaes3a.this.AV28BarLinMaq = GXv_int11[0] ;
               if ( AV21PrdVal == 1 )
               {
                  if ( ( GXutil.strcmp(AV22Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV22Accion, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     AV21PrdVal = (byte)(1) ;
                  }
                  else
                  {
                     AV21PrdVal = (byte)(0) ;
                  }
                  if ( ( GXutil.strcmp(AV22Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV22Accion, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     AV16TotCol = AV16TotCol.subtract(AV23UltCan) ;
                  }
               }
            }
            if ( AV21PrdVal == 1 )
            {
               if ( AV15Familia == 0 )
               {
                  AV16TotCol = AV16TotCol.add(A481ForCan) ;
                  AV17FlagCol = (byte)(1) ;
               }
               else
               {
                  if ( AV19Length > 5 )
                  {
                     if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV15Familia )
                     {
                        AV16TotCol = AV16TotCol.add(A481ForCan) ;
                        AV23UltCan = A481ForCan ;
                        AV17FlagCol = (byte)(1) ;
                     }
                  }
                  else
                  {
                     AV20FamiliaA = GXutil.str( AV15Familia, 1, 1) ;
                     if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV20FamiliaA) == 0 )
                     {
                        AV16TotCol = AV16TotCol.add(A481ForCan) ;
                        AV23UltCan = A481ForCan ;
                        AV17FlagCol = (byte)(1) ;
                     }
                  }
               }
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
      this.aP0[0] = pclaes3a.this.A396EmprCod;
      this.aP1[0] = pclaes3a.this.A252CliCod;
      this.aP2[0] = pclaes3a.this.A494ForSer;
      this.aP3[0] = pclaes3a.this.A482ForColNom;
      this.aP4[0] = pclaes3a.this.A483ForColNum;
      this.aP5[0] = pclaes3a.this.A831TipColCod;
      this.aP6[0] = pclaes3a.this.AV15Familia;
      this.aP7[0] = pclaes3a.this.AV16TotCol;
      this.aP8[0] = pclaes3a.this.AV17FlagCol;
      this.aP9[0] = pclaes3a.this.AV24BarCod;
      this.aP10[0] = pclaes3a.this.AV25BarCodReo;
      this.aP11[0] = pclaes3a.this.AV26BarCodPar;
      this.aP12[0] = pclaes3a.this.AV27TotKil;
      this.aP13[0] = pclaes3a.this.AV28BarLinMaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23UltCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02XS2_A396EmprCod = new String[] {""} ;
      P02XS2_A252CliCod = new int[1] ;
      P02XS2_A494ForSer = new String[] {""} ;
      P02XS2_A482ForColNom = new String[] {""} ;
      P02XS2_A483ForColNum = new int[1] ;
      P02XS2_A831TipColCod = new byte[1] ;
      P02XS2_A486ForNumCol = new int[1] ;
      Gx_msg = "" ;
      P02XS3_A396EmprCod = new String[] {""} ;
      P02XS3_A486ForNumCol = new int[1] ;
      P02XS3_A719PrdNum = new String[] {""} ;
      P02XS3_A6193ForClaCol = new String[] {""} ;
      P02XS3_A718PrdNom = new String[] {""} ;
      P02XS3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XS3_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A6193ForClaCol = "" ;
      A718PrdNom = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      AV22Accion = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      AV20FamiliaA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaes3a__default(),
         new Object[] {
             new Object[] {
            P02XS2_A396EmprCod, P02XS2_A252CliCod, P02XS2_A494ForSer, P02XS2_A482ForColNom, P02XS2_A483ForColNum, P02XS2_A831TipColCod, P02XS2_A486ForNumCol
            }
            , new Object[] {
            P02XS3_A396EmprCod, P02XS3_A486ForNumCol, P02XS3_A719PrdNum, P02XS3_A6193ForClaCol, P02XS3_A718PrdNom, P02XS3_A481ForCan, P02XS3_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV15Familia ;
   private byte AV17FlagCol ;
   private byte AV25BarCodReo ;
   private byte AV19Length ;
   private byte AV21PrdVal ;
   private byte GXv_int4[] ;
   private byte GXv_int6[] ;
   private short AV28BarLinMaq ;
   private short A309ColLin ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV24BarCod ;
   private int A486ForNumCol ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal AV27TotKil ;
   private java.math.BigDecimal AV23UltCan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV26BarCodPar ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String A719PrdNum ;
   private String A6193ForClaCol ;
   private String A718PrdNom ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char9[] ;
   private String AV22Accion ;
   private String GXv_char10[] ;
   private String AV20FamiliaA ;
   private short[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XS2_A396EmprCod ;
   private int[] P02XS2_A252CliCod ;
   private String[] P02XS2_A494ForSer ;
   private String[] P02XS2_A482ForColNom ;
   private int[] P02XS2_A483ForColNum ;
   private byte[] P02XS2_A831TipColCod ;
   private int[] P02XS2_A486ForNumCol ;
   private String[] P02XS3_A396EmprCod ;
   private int[] P02XS3_A486ForNumCol ;
   private String[] P02XS3_A719PrdNum ;
   private String[] P02XS3_A6193ForClaCol ;
   private String[] P02XS3_A718PrdNom ;
   private java.math.BigDecimal[] P02XS3_A481ForCan ;
   private short[] P02XS3_A309ColLin ;
}

final  class pclaes3a__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XS2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XS3", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForClaCol, T2.PrdNom, T1.ForCan, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

