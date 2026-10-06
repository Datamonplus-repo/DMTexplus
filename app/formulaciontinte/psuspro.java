package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psuspro extends GXProcedure
{
   public psuspro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psuspro.class ), "" );
   }

   public psuspro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            int[] aP5 ,
                            int[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            byte[] aP9 ,
                            byte[] aP10 ,
                            short[] aP11 ,
                            short[] aP12 ,
                            byte[] aP13 ,
                            byte[] aP14 ,
                            String[] aP15 ,
                            String[] aP16 ,
                            short[] aP17 )
   {
      psuspro.this.aP18 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        byte[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        byte[] aP13 ,
                        byte[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        short[] aP17 ,
                        short[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             byte[] aP13 ,
                             byte[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             short[] aP17 ,
                             short[] aP18 )
   {
      psuspro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psuspro.this.AV15PCliCod = aP1[0];
      this.aP1 = aP1;
      psuspro.this.AV16UCliCod = aP2[0];
      this.aP2 = aP2;
      psuspro.this.AV17PArtCod = aP3[0];
      this.aP3 = aP3;
      psuspro.this.AV18UArtCod = aP4[0];
      this.aP4 = aP4;
      psuspro.this.AV29PForColNum = aP5[0];
      this.aP5 = aP5;
      psuspro.this.AV30UForColNum = aP6[0];
      this.aP6 = aP6;
      psuspro.this.AV27PForColNom = aP7[0];
      this.aP7 = aP7;
      psuspro.this.AV28UForColNom = aP8[0];
      this.aP8 = aP8;
      psuspro.this.AV21PIntCod = aP9[0];
      this.aP9 = aP9;
      psuspro.this.AV22UIntCod = aP10[0];
      this.aP10 = aP10;
      psuspro.this.AV23PMatCod = aP11[0];
      this.aP11 = aP11;
      psuspro.this.AV24UMatCod = aP12[0];
      this.aP12 = aP12;
      psuspro.this.AV25PTipColCod = aP13[0];
      this.aP13 = aP13;
      psuspro.this.AV26UTipColCod = aP14[0];
      this.aP14 = aP14;
      psuspro.this.AV19ProSus1 = aP15[0];
      this.aP15 = aP15;
      psuspro.this.AV20ProSus2 = aP16[0];
      this.aP16 = aP16;
      psuspro.this.AV33BarTipArt = aP17[0];
      this.aP17 = aP17;
      psuspro.this.AV34BarTipArtf = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV15PCliCod) ,
                                           Integer.valueOf(AV16UCliCod) ,
                                           AV17PArtCod ,
                                           AV18UArtCod ,
                                           AV27PForColNom ,
                                           AV28UForColNom ,
                                           Integer.valueOf(AV29PForColNum) ,
                                           Integer.valueOf(AV30UForColNum) ,
                                           Byte.valueOf(AV25PTipColCod) ,
                                           Byte.valueOf(AV26UTipColCod) ,
                                           Byte.valueOf(AV21PIntCod) ,
                                           Byte.valueOf(AV22UIntCod) ,
                                           Short.valueOf(AV23PMatCod) ,
                                           Short.valueOf(AV24UMatCod) ,
                                           Short.valueOf(AV33BarTipArt) ,
                                           Short.valueOf(AV34BarTipArtf) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A764ProForCod ,
                                           AV19ProSus1 ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P00292 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV19ProSus1, Integer.valueOf(AV15PCliCod), Integer.valueOf(AV16UCliCod), AV17PArtCod, AV18UArtCod, AV27PForColNom, AV28UForColNom, Integer.valueOf(AV29PForColNum), Integer.valueOf(AV30UForColNum), Byte.valueOf(AV25PTipColCod), Byte.valueOf(AV26UTipColCod), Byte.valueOf(AV21PIntCod), Byte.valueOf(AV22UIntCod), Short.valueOf(AV23PMatCod), Short.valueOf(AV24UMatCod), Short.valueOf(AV33BarTipArt), Short.valueOf(AV34BarTipArtf)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P00292_A764ProForCod[0] ;
         A4384ForTipArt = P00292_A4384ForTipArt[0] ;
         n4384ForTipArt = P00292_n4384ForTipArt[0] ;
         A626MatCod = P00292_A626MatCod[0] ;
         A583IntCod = P00292_A583IntCod[0] ;
         A831TipColCod = P00292_A831TipColCod[0] ;
         A483ForColNum = P00292_A483ForColNum[0] ;
         A482ForColNom = P00292_A482ForColNom[0] ;
         A494ForSer = P00292_A494ForSer[0] ;
         A252CliCod = P00292_A252CliCod[0] ;
         A1160ProForL = P00292_A1160ProForL[0] ;
         A4384ForTipArt = P00292_A4384ForTipArt[0] ;
         n4384ForTipArt = P00292_n4384ForTipArt[0] ;
         A626MatCod = P00292_A626MatCod[0] ;
         A583IntCod = P00292_A583IntCod[0] ;
         A764ProForCod = AV20ProSus2 ;
         /* Using cursor P00293 */
         pr_default.execute(1, new Object[] {A764ProForCod, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV31Macprocodi = " " ;
      AV32Macprocodf = httpContext.getMessage( "ZZZZZZ", "") ;
      /* Optimized UPDATE. */
      /* Using cursor P00294 */
      pr_default.execute(2, new Object[] {AV20ProSus2, A396EmprCod, AV31Macprocodi, AV19ProSus1, AV32Macprocodf});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
      /* End optimized UPDATE. */
      /* Optimized UPDATE. */
      /* Using cursor P00295 */
      pr_default.execute(3, new Object[] {AV20ProSus2, A396EmprCod, AV19ProSus1});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psuspro.this.A396EmprCod;
      this.aP1[0] = psuspro.this.AV15PCliCod;
      this.aP2[0] = psuspro.this.AV16UCliCod;
      this.aP3[0] = psuspro.this.AV17PArtCod;
      this.aP4[0] = psuspro.this.AV18UArtCod;
      this.aP5[0] = psuspro.this.AV29PForColNum;
      this.aP6[0] = psuspro.this.AV30UForColNum;
      this.aP7[0] = psuspro.this.AV27PForColNom;
      this.aP8[0] = psuspro.this.AV28UForColNom;
      this.aP9[0] = psuspro.this.AV21PIntCod;
      this.aP10[0] = psuspro.this.AV22UIntCod;
      this.aP11[0] = psuspro.this.AV23PMatCod;
      this.aP12[0] = psuspro.this.AV24UMatCod;
      this.aP13[0] = psuspro.this.AV25PTipColCod;
      this.aP14[0] = psuspro.this.AV26UTipColCod;
      this.aP15[0] = psuspro.this.AV19ProSus1;
      this.aP16[0] = psuspro.this.AV20ProSus2;
      this.aP17[0] = psuspro.this.AV33BarTipArt;
      this.aP18[0] = psuspro.this.AV34BarTipArtf;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.psuspro");
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
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A764ProForCod = "" ;
      P00292_A396EmprCod = new String[] {""} ;
      P00292_A764ProForCod = new String[] {""} ;
      P00292_A4384ForTipArt = new short[1] ;
      P00292_n4384ForTipArt = new boolean[] {false} ;
      P00292_A626MatCod = new short[1] ;
      P00292_A583IntCod = new byte[1] ;
      P00292_A831TipColCod = new byte[1] ;
      P00292_A483ForColNum = new int[1] ;
      P00292_A482ForColNom = new String[] {""} ;
      P00292_A494ForSer = new String[] {""} ;
      P00292_A252CliCod = new int[1] ;
      P00292_A1160ProForL = new short[1] ;
      AV31Macprocodi = "" ;
      AV32Macprocodf = "" ;
      A4898ArtProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.psuspro__default(),
         new Object[] {
             new Object[] {
            P00292_A396EmprCod, P00292_A764ProForCod, P00292_A4384ForTipArt, P00292_n4384ForTipArt, P00292_A626MatCod, P00292_A583IntCod, P00292_A831TipColCod, P00292_A483ForColNum, P00292_A482ForColNom, P00292_A494ForSer,
            P00292_A252CliCod, P00292_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21PIntCod ;
   private byte AV22UIntCod ;
   private byte AV25PTipColCod ;
   private byte AV26UTipColCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short AV23PMatCod ;
   private short AV24UMatCod ;
   private short AV33BarTipArt ;
   private short AV34BarTipArtf ;
   private short A626MatCod ;
   private short A4384ForTipArt ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV15PCliCod ;
   private int AV16UCliCod ;
   private int AV29PForColNum ;
   private int AV30UForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV17PArtCod ;
   private String AV18UArtCod ;
   private String AV27PForColNom ;
   private String AV28UForColNom ;
   private String AV19ProSus1 ;
   private String AV20ProSus2 ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A764ProForCod ;
   private String AV31Macprocodi ;
   private String AV32Macprocodf ;
   private String A4898ArtProCod ;
   private boolean n4384ForTipArt ;
   private short[] aP18 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private byte[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private byte[] aP13 ;
   private byte[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private short[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P00292_A396EmprCod ;
   private String[] P00292_A764ProForCod ;
   private short[] P00292_A4384ForTipArt ;
   private boolean[] P00292_n4384ForTipArt ;
   private short[] P00292_A626MatCod ;
   private byte[] P00292_A583IntCod ;
   private byte[] P00292_A831TipColCod ;
   private int[] P00292_A483ForColNum ;
   private String[] P00292_A482ForColNom ;
   private String[] P00292_A494ForSer ;
   private int[] P00292_A252CliCod ;
   private short[] P00292_A1160ProForL ;
}

final  class psuspro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00292( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV15PCliCod ,
                                          int AV16UCliCod ,
                                          String AV17PArtCod ,
                                          String AV18UArtCod ,
                                          String AV27PForColNom ,
                                          String AV28UForColNom ,
                                          int AV29PForColNum ,
                                          int AV30UForColNum ,
                                          byte AV25PTipColCod ,
                                          byte AV26UTipColCod ,
                                          byte AV21PIntCod ,
                                          byte AV22UIntCod ,
                                          short AV23PMatCod ,
                                          short AV24UMatCod ,
                                          short AV33BarTipArt ,
                                          short AV34BarTipArtf ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          short A4384ForTipArt ,
                                          String A764ProForCod ,
                                          String AV19ProSus1 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[18];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T2.ForTipArt, T2.MatCod, T2.IntCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ProForL FROM (TXPLFORMU T1" ;
      scmdbuf += " INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum" ;
      scmdbuf += " AND T2.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( ! (0==AV15PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV16UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17PArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18UArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27PForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28UForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      if ( ! (0==AV29PForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int1[8] = (byte)(1) ;
      }
      if ( ! (0==AV30UForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int1[9] = (byte)(1) ;
      }
      if ( ! (0==AV25PTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int1[10] = (byte)(1) ;
      }
      if ( ! (0==AV26UTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int1[11] = (byte)(1) ;
      }
      if ( ! (0==AV21PIntCod) )
      {
         addWhere(sWhereString, "(T2.IntCod >= ?)");
      }
      else
      {
         GXv_int1[12] = (byte)(1) ;
      }
      if ( ! (0==AV22UIntCod) )
      {
         addWhere(sWhereString, "(T2.IntCod <= ?)");
      }
      else
      {
         GXv_int1[13] = (byte)(1) ;
      }
      if ( ! (0==AV23PMatCod) )
      {
         addWhere(sWhereString, "(T2.MatCod >= ?)");
      }
      else
      {
         GXv_int1[14] = (byte)(1) ;
      }
      if ( ! (0==AV24UMatCod) )
      {
         addWhere(sWhereString, "(T2.MatCod <= ?)");
      }
      else
      {
         GXv_int1[15] = (byte)(1) ;
      }
      if ( ! (0==AV33BarTipArt) )
      {
         addWhere(sWhereString, "(T2.ForTipArt >= ?)");
      }
      else
      {
         GXv_int1[16] = (byte)(1) ;
      }
      if ( ! (0==AV34BarTipArtf) )
      {
         addWhere(sWhereString, "(T2.ForTipArt <= ?)");
      }
      else
      {
         GXv_int1[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00292(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00292", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00293", "UPDATE TXPLFORMU SET ProForCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P00294", "UPDATE TXPLMACPR SET ProForCod=?  WHERE (EmprCod = ? and MacProCod >= ?) AND (ProForCod = ?) AND (MacProCod <= ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACPR")
         ,new UpdateCursor("P00295", "UPDATE TXPArtFor SET ArtProCod=?  WHERE EmprCod = ? and ArtProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPArtFor")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

