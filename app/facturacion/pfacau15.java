package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacau15 extends GXProcedure
{
   public pfacau15( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacau15.class ), "" );
   }

   public pfacau15( int remoteHandle ,
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
      pfacau15.this.aP10 = new int[] {0};
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
      pfacau15.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacau15.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfacau15.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pfacau15.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pfacau15.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pfacau15.this.AV23NumFac = aP5[0];
      this.aP5 = aP5;
      pfacau15.this.AV24NumLin = aP6[0];
      this.aP6 = aP6;
      pfacau15.this.AV38ArtObsFac = aP7[0];
      this.aP7 = aP7;
      pfacau15.this.AV74FlagSal = aP8[0];
      this.aP8 = aP8;
      pfacau15.this.AV102TotAlb = aP9[0];
      this.aP9 = aP9;
      pfacau15.this.AV75CliFac = aP10[0];
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
      pfacau15.this.AV107Ecapi = GXv_int1[0] ;
      AV108PLinea = (byte)(0) ;
      GXv_int1[0] = AV108PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pfacau15.this.AV108PLinea = GXv_int1[0] ;
      /* Using cursor P02HV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6467BarAlbPlas = P02HV2_A6467BarAlbPlas[0] ;
         A1458BarAlbBul = P02HV2_A1458BarAlbBul[0] ;
         A1503BarPart = P02HV2_A1503BarPart[0] ;
         A4812BarEncCli = P02HV2_A4812BarEncCli[0] ;
         A1206TubCod = P02HV2_A1206TubCod[0] ;
         n1206TubCod = P02HV2_n1206TubCod[0] ;
         A6466PlasCod = P02HV2_A6466PlasCod[0] ;
         n6466PlasCod = P02HV2_n6466PlasCod[0] ;
         A1503BarPart = P02HV2_A1503BarPart[0] ;
         A4812BarEncCli = P02HV2_A4812BarEncCli[0] ;
         if ( ! (0==A6467BarAlbPlas) && ! (0==A6466PlasCod) )
         {
            AV24NumLin = (int)(AV24NumLin+1) ;
            /*
               INSERT RECORD ON TABLE TXPLFAVEN

            */
            A430FacCod = AV23NumFac ;
            A446FacLin = AV24NumLin ;
            A427FacAlbCod = A30AlbProCod ;
            A1294FacBarCod = A129BarCod ;
            A1295FacBarReo = A132BarCodReo ;
            A1296FacBarPar = A130BarCodPar ;
            A428FacAlbTip = (byte)(1) ;
            A454FacSer = httpContext.getMessage( "Plasticos", "") ;
            A448FacPreKgs = A6468PlasPre ;
            A449FacPreMts = DecimalUtil.ZERO ;
            A444FacKgs = DecimalUtil.doubleToDec(A6467BarAlbPlas) ;
            A447FacMts = DecimalUtil.ZERO ;
            A451FacRec = DecimalUtil.ZERO ;
            A432FacDsc = A6474PlasNom ;
            if ( (0==AV74FlagSal) && (0==AV108PLinea) )
            {
               A1498FacDisNum = AV40BarDisNum ;
            }
            else
            {
               A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
            }
            A3303FacNPart = A1503BarPart ;
            A4814FacEncCli = A4812BarEncCli ;
            A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
            A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
            A3883FacCliCod = AV75CliFac ;
            A3397FacFasCod = " " ;
            /* Using cursor P02HV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5353FacImpMan, A5355FacImpMin});
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
            pfacau15.this.A396EmprCod = GXv_char3[0] ;
            pfacau15.this.AV23NumFac = GXv_int4[0] ;
            pfacau15.this.AV24NumLin = GXv_int5[0] ;
            pfacau15.this.GXt_decimal2 = GXv_decimal6[0] ;
            AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal2)))) ;
            AV24NumLin = (int)(AV24NumLin+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacau15.this.A396EmprCod;
      this.aP1[0] = pfacau15.this.A30AlbProCod;
      this.aP2[0] = pfacau15.this.A129BarCod;
      this.aP3[0] = pfacau15.this.A132BarCodReo;
      this.aP4[0] = pfacau15.this.A130BarCodPar;
      this.aP5[0] = pfacau15.this.AV23NumFac;
      this.aP6[0] = pfacau15.this.AV24NumLin;
      this.aP7[0] = pfacau15.this.AV38ArtObsFac;
      this.aP8[0] = pfacau15.this.AV74FlagSal;
      this.aP9[0] = pfacau15.this.AV102TotAlb;
      this.aP10[0] = pfacau15.this.AV75CliFac;
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
      P02HV2_A396EmprCod = new String[] {""} ;
      P02HV2_A30AlbProCod = new long[1] ;
      P02HV2_A129BarCod = new int[1] ;
      P02HV2_A132BarCodReo = new byte[1] ;
      P02HV2_A130BarCodPar = new String[] {""} ;
      P02HV2_A6467BarAlbPlas = new short[1] ;
      P02HV2_A1458BarAlbBul = new short[1] ;
      P02HV2_A1503BarPart = new short[1] ;
      P02HV2_A4812BarEncCli = new String[] {""} ;
      P02HV2_A1206TubCod = new short[1] ;
      P02HV2_n1206TubCod = new boolean[] {false} ;
      P02HV2_A6466PlasCod = new short[1] ;
      P02HV2_n6466PlasCod = new boolean[] {false} ;
      A4812BarEncCli = "" ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A6468PlasPre = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A6474PlasNom = "" ;
      A1498FacDisNum = "" ;
      AV40BarDisNum = "" ;
      A4814FacEncCli = "" ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      Gx_emsg = "" ;
      GXt_decimal2 = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacau15__default(),
         new Object[] {
             new Object[] {
            P02HV2_A396EmprCod, P02HV2_A30AlbProCod, P02HV2_A129BarCod, P02HV2_A132BarCodReo, P02HV2_A130BarCodPar, P02HV2_A6467BarAlbPlas, P02HV2_A1458BarAlbBul, P02HV2_A1503BarPart, P02HV2_A4812BarEncCli, P02HV2_A1206TubCod,
            P02HV2_n1206TubCod, P02HV2_A6466PlasCod, P02HV2_n6466PlasCod
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
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private short AV102TotAlb ;
   private short A6467BarAlbPlas ;
   private short A1458BarAlbBul ;
   private short A1503BarPart ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
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
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A6468PlasPre ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal GXt_decimal2 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV38ArtObsFac ;
   private String scmdbuf ;
   private String A4812BarEncCli ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A6474PlasNom ;
   private String A1498FacDisNum ;
   private String AV40BarDisNum ;
   private String A4814FacEncCli ;
   private String A3397FacFasCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
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
   private String[] P02HV2_A396EmprCod ;
   private long[] P02HV2_A30AlbProCod ;
   private int[] P02HV2_A129BarCod ;
   private byte[] P02HV2_A132BarCodReo ;
   private String[] P02HV2_A130BarCodPar ;
   private short[] P02HV2_A6467BarAlbPlas ;
   private short[] P02HV2_A1458BarAlbBul ;
   private short[] P02HV2_A1503BarPart ;
   private String[] P02HV2_A4812BarEncCli ;
   private short[] P02HV2_A1206TubCod ;
   private boolean[] P02HV2_n1206TubCod ;
   private short[] P02HV2_A6466PlasCod ;
   private boolean[] P02HV2_n6466PlasCod ;
}

final  class pfacau15__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02HV2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbPlas, T1.BarAlbBul, T2.BarPart, T2.BarEncCli, T1.TubCod, T1.PlasCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02HV3", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacImpMan, FacImpMin, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacBonLi, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 8);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 20);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
      }
   }

}

