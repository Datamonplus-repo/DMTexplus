package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacau11 extends GXProcedure
{
   public pfacau11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacau11.class ), "" );
   }

   public pfacau11( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 ,
                          int[] aP6 ,
                          String[] aP7 ,
                          byte[] aP8 ,
                          short[] aP9 )
   {
      pfacau11.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        short[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 )
   {
      pfacau11.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacau11.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfacau11.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pfacau11.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pfacau11.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pfacau11.this.AV23NumFac = aP5[0];
      this.aP5 = aP5;
      pfacau11.this.AV24NumLin = aP6[0];
      this.aP6 = aP6;
      pfacau11.this.AV38ArtObsFac = aP7[0];
      this.aP7 = aP7;
      pfacau11.this.AV74FlagSal = aP8[0];
      this.aP8 = aP8;
      pfacau11.this.AV102TotAlb = aP9[0];
      this.aP9 = aP9;
      pfacau11.this.AV75CliFac = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV107Ecapi = (byte)(0) ;
      GXv_int1[0] = AV107Ecapi ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ECAPI", ""), GXv_int1) ;
      pfacau11.this.AV107Ecapi = GXv_int1[0] ;
      AV108PLinea = (byte)(0) ;
      GXv_int1[0] = AV108PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pfacau11.this.AV108PLinea = GXv_int1[0] ;
      /* Using cursor P01UO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1458BarAlbBul = P01UO2_A1458BarAlbBul[0] ;
         A1503BarPart = P01UO2_A1503BarPart[0] ;
         A4812BarEncCli = P01UO2_A4812BarEncCli[0] ;
         A1206TubCod = P01UO2_A1206TubCod[0] ;
         n1206TubCod = P01UO2_n1206TubCod[0] ;
         A1503BarPart = P01UO2_A1503BarPart[0] ;
         A4812BarEncCli = P01UO2_A4812BarEncCli[0] ;
         /*
            INSERT RECORD ON TABLE TXPLFAVEN

         */
         A430FacCod = AV23NumFac ;
         A446FacLin = AV24NumLin ;
         A454FacSer = httpContext.getMessage( "Observ.", "") ;
         A428FacAlbTip = (byte)(2) ;
         A427FacAlbCod = A30AlbProCod ;
         A432FacDsc = AV38ArtObsFac ;
         if ( (0==AV74FlagSal) && (0==AV108PLinea) )
         {
            A1498FacDisNum = AV40BarDisNum ;
         }
         else
         {
            A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
         }
         A3303FacNPart = A1503BarPart ;
         if ( AV107Ecapi == 1 )
         {
            A1294FacBarCod = A129BarCod ;
            A1295FacBarReo = A132BarCodReo ;
            A1296FacBarPar = A130BarCodPar ;
         }
         A4814FacEncCli = A4812BarEncCli ;
         A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
         A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
         A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
         A3883FacCliCod = AV75CliFac ;
         A3397FacFasCod = " " ;
         /* Using cursor P01UO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
         if ( (pr_default.getStatus(1) == 1) )
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
         GXt_decimal2 = DecimalUtil.doubleToDec(AV102TotAlb) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV23NumFac ;
         GXv_int5[0] = AV24NumLin ;
         GXv_decimal6[0] = GXt_decimal2 ;
         new app.pfacimli(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_decimal6) ;
         pfacau11.this.A396EmprCod = GXv_char3[0] ;
         pfacau11.this.AV23NumFac = GXv_int4[0] ;
         pfacau11.this.AV24NumLin = GXv_int5[0] ;
         pfacau11.this.GXt_decimal2 = GXv_decimal6[0] ;
         AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal2)))) ;
         AV24NumLin = (int)(AV24NumLin+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacau11.this.A396EmprCod;
      this.aP1[0] = pfacau11.this.A30AlbProCod;
      this.aP2[0] = pfacau11.this.A129BarCod;
      this.aP3[0] = pfacau11.this.A132BarCodReo;
      this.aP4[0] = pfacau11.this.A130BarCodPar;
      this.aP5[0] = pfacau11.this.AV23NumFac;
      this.aP6[0] = pfacau11.this.AV24NumLin;
      this.aP7[0] = pfacau11.this.AV38ArtObsFac;
      this.aP8[0] = pfacau11.this.AV74FlagSal;
      this.aP9[0] = pfacau11.this.AV102TotAlb;
      this.aP10[0] = pfacau11.this.AV75CliFac;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01UO2_A396EmprCod = new String[] {""} ;
      P01UO2_A30AlbProCod = new long[1] ;
      P01UO2_A129BarCod = new int[1] ;
      P01UO2_A132BarCodReo = new byte[1] ;
      P01UO2_A130BarCodPar = new String[] {""} ;
      P01UO2_A1458BarAlbBul = new short[1] ;
      P01UO2_A1503BarPart = new short[1] ;
      P01UO2_A4812BarEncCli = new String[] {""} ;
      P01UO2_A1206TubCod = new short[1] ;
      P01UO2_n1206TubCod = new boolean[] {false} ;
      A4812BarEncCli = "" ;
      A454FacSer = "" ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      AV40BarDisNum = "" ;
      A1296FacBarPar = "" ;
      A4814FacEncCli = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      Gx_emsg = "" ;
      GXt_decimal2 = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacau11__default(),
         new Object[] {
             new Object[] {
            P01UO2_A396EmprCod, P01UO2_A30AlbProCod, P01UO2_A129BarCod, P01UO2_A132BarCodReo, P01UO2_A130BarCodPar, P01UO2_A1458BarAlbBul, P01UO2_A1503BarPart, P01UO2_A4812BarEncCli, P01UO2_A1206TubCod, P01UO2_n1206TubCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV74FlagSal ;
   private byte AV107Ecapi ;
   private byte AV108PLinea ;
   private byte GXv_int1[] ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private short AV102TotAlb ;
   private short A1458BarAlbBul ;
   private short A1503BarPart ;
   private short A1206TubCod ;
   private short A3303FacNPart ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV23NumFac ;
   private int AV24NumLin ;
   private int AV75CliFac ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A3883FacCliCod ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal GXt_decimal2 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV38ArtObsFac ;
   private String scmdbuf ;
   private String A4812BarEncCli ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String AV40BarDisNum ;
   private String A1296FacBarPar ;
   private String A4814FacEncCli ;
   private String A3397FacFasCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private boolean n1206TubCod ;
   private int[] aP10 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private short[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UO2_A396EmprCod ;
   private long[] P01UO2_A30AlbProCod ;
   private int[] P01UO2_A129BarCod ;
   private byte[] P01UO2_A132BarCodReo ;
   private String[] P01UO2_A130BarCodPar ;
   private short[] P01UO2_A1458BarAlbBul ;
   private short[] P01UO2_A1503BarPart ;
   private String[] P01UO2_A4812BarEncCli ;
   private short[] P01UO2_A1206TubCod ;
   private boolean[] P01UO2_n1206TubCod ;
}

final  class pfacau11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UO2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbBul, T2.BarPart, T2.BarEncCli, T1.TubCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01UO3", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 8);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 20);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               return;
      }
   }

}

