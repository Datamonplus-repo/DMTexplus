package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacau17 extends GXProcedure
{
   public pfacau17( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacau17.class ), "" );
   }

   public pfacau17( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        int aP5 ,
                        int[] aP6 ,
                        String aP7 ,
                        byte aP8 ,
                        short aP9 ,
                        int aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int[] aP6 ,
                             String aP7 ,
                             byte aP8 ,
                             short aP9 ,
                             int aP10 )
   {
      pfacau17.this.A396EmprCod = aP0;
      pfacau17.this.A30AlbProCod = aP1;
      pfacau17.this.A129BarCod = aP2;
      pfacau17.this.A132BarCodReo = aP3;
      pfacau17.this.A130BarCodPar = aP4;
      pfacau17.this.AV23NumFac = aP5;
      pfacau17.this.AV24NumLin = aP6[0];
      this.aP6 = aP6;
      pfacau17.this.AV38ArtObsFac = aP7;
      pfacau17.this.AV74FlagSal = aP8;
      pfacau17.this.AV102TotAlb = aP9;
      pfacau17.this.AV75CliFac = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02MX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1208TubPre = P02MX2_A1208TubPre[0] ;
         n1208TubPre = P02MX2_n1208TubPre[0] ;
         A1266BarAlbTub = P02MX2_A1266BarAlbTub[0] ;
         A1207TubNom = P02MX2_A1207TubNom[0] ;
         n1207TubNom = P02MX2_n1207TubNom[0] ;
         A1503BarPart = P02MX2_A1503BarPart[0] ;
         A4812BarEncCli = P02MX2_A4812BarEncCli[0] ;
         A1206TubCod = P02MX2_A1206TubCod[0] ;
         n1206TubCod = P02MX2_n1206TubCod[0] ;
         A1208TubPre = P02MX2_A1208TubPre[0] ;
         n1208TubPre = P02MX2_n1208TubPre[0] ;
         A1207TubNom = P02MX2_A1207TubNom[0] ;
         n1207TubNom = P02MX2_n1207TubNom[0] ;
         A1503BarPart = P02MX2_A1503BarPart[0] ;
         A4812BarEncCli = P02MX2_A4812BarEncCli[0] ;
         if ( ! (0==A1266BarAlbTub) && ! (0==A1206TubCod) )
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
            A454FacSer = httpContext.getMessage( "Tubos", "") ;
            A448FacPreKgs = A1208TubPre ;
            A449FacPreMts = DecimalUtil.ZERO ;
            A444FacKgs = DecimalUtil.doubleToDec(A1266BarAlbTub) ;
            A447FacMts = DecimalUtil.ZERO ;
            A451FacRec = DecimalUtil.ZERO ;
            A432FacDsc = A1207TubNom ;
            A1498FacDisNum = AV40BarDisNum ;
            A3303FacNPart = A1503BarPart ;
            A4814FacEncCli = A4812BarEncCli ;
            A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
            A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
            A3883FacCliCod = AV75CliFac ;
            /* Using cursor P02MX3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5353FacImpMan, A5355FacImpMin});
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
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = pfacau17.this.AV24NumLin;
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
      P02MX2_A396EmprCod = new String[] {""} ;
      P02MX2_A30AlbProCod = new long[1] ;
      P02MX2_A129BarCod = new int[1] ;
      P02MX2_A132BarCodReo = new byte[1] ;
      P02MX2_A130BarCodPar = new String[] {""} ;
      P02MX2_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02MX2_n1208TubPre = new boolean[] {false} ;
      P02MX2_A1266BarAlbTub = new int[1] ;
      P02MX2_A1207TubNom = new String[] {""} ;
      P02MX2_n1207TubNom = new boolean[] {false} ;
      P02MX2_A1503BarPart = new short[1] ;
      P02MX2_A4812BarEncCli = new String[] {""} ;
      P02MX2_A1206TubCod = new short[1] ;
      P02MX2_n1206TubCod = new boolean[] {false} ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1207TubNom = "" ;
      A4812BarEncCli = "" ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      AV40BarDisNum = "" ;
      A4814FacEncCli = "" ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacau17__default(),
         new Object[] {
             new Object[] {
            P02MX2_A396EmprCod, P02MX2_A30AlbProCod, P02MX2_A129BarCod, P02MX2_A132BarCodReo, P02MX2_A130BarCodPar, P02MX2_A1208TubPre, P02MX2_n1208TubPre, P02MX2_A1266BarAlbTub, P02MX2_A1207TubNom, P02MX2_n1207TubNom,
            P02MX2_A1503BarPart, P02MX2_A4812BarEncCli, P02MX2_A1206TubCod, P02MX2_n1206TubCod
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
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private short AV102TotAlb ;
   private short A1503BarPart ;
   private short A1206TubCod ;
   private short A3303FacNPart ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV23NumFac ;
   private int AV24NumLin ;
   private int AV75CliFac ;
   private int A1266BarAlbTub ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A3883FacCliCod ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV38ArtObsFac ;
   private String scmdbuf ;
   private String A1207TubNom ;
   private String A4812BarEncCli ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String AV40BarDisNum ;
   private String A4814FacEncCli ;
   private String Gx_emsg ;
   private boolean n1208TubPre ;
   private boolean n1207TubNom ;
   private boolean n1206TubCod ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02MX2_A396EmprCod ;
   private long[] P02MX2_A30AlbProCod ;
   private int[] P02MX2_A129BarCod ;
   private byte[] P02MX2_A132BarCodReo ;
   private String[] P02MX2_A130BarCodPar ;
   private java.math.BigDecimal[] P02MX2_A1208TubPre ;
   private boolean[] P02MX2_n1208TubPre ;
   private int[] P02MX2_A1266BarAlbTub ;
   private String[] P02MX2_A1207TubNom ;
   private boolean[] P02MX2_n1207TubNom ;
   private short[] P02MX2_A1503BarPart ;
   private String[] P02MX2_A4812BarEncCli ;
   private short[] P02MX2_A1206TubCod ;
   private boolean[] P02MX2_n1206TubCod ;
}

final  class pfacau17__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02MX2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.TubPre, T1.BarAlbTub, T2.TubNom, T3.BarPart, T3.BarEncCli, T1.TubCod FROM ((TXPALBBAR T1 LEFT JOIN TXPTUBOS T2 ON T2.EmprCod = T1.EmprCod AND T2.TubCod = T1.TubCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02MX3", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacCliCod, FacEncCli, FacImpMan, FacImpMin, FacTipPro, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacBonLi, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               return;
      }
   }

}

