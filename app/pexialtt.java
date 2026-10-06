package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexialtt extends GXProcedure
{
   public pexialtt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexialtt.class ), "" );
   }

   public pexialtt( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             byte[] aP14 ,
                             short[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 )
   {
      pexialtt.this.aP18 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        byte[] aP10 ,
                        byte[] aP11 ,
                        byte[] aP12 ,
                        byte[] aP13 ,
                        byte[] aP14 ,
                        short[] aP15 ,
                        byte[] aP16 ,
                        byte[] aP17 ,
                        String[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             byte[] aP14 ,
                             short[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             String[] aP18 )
   {
      pexialtt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexialtt.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pexialtt.this.AV27CanTeo = aP2[0];
      this.aP2 = aP2;
      pexialtt.this.AV21BarCod = aP3[0];
      this.aP3 = aP3;
      pexialtt.this.AV22BarCodReo = aP4[0];
      this.aP4 = aP4;
      pexialtt.this.AV23BarCodPar = aP5[0];
      this.aP5 = aP5;
      pexialtt.this.AV20LinRec = aP6[0];
      this.aP6 = aP6;
      pexialtt.this.AV16UniMed = aP7[0];
      this.aP7 = aP7;
      pexialtt.this.AV26Exist = aP8[0];
      this.aP8 = aP8;
      pexialtt.this.AV15Cantidad = aP9[0];
      this.aP9 = aP9;
      pexialtt.this.AV28Flag2 = aP10[0];
      this.aP10 = aP10;
      pexialtt.this.AV29Flag1 = aP11[0];
      this.aP11 = aP11;
      pexialtt.this.AV30Linea = aP12[0];
      this.aP12 = aP12;
      pexialtt.this.AV32ExiCon = aP13[0];
      this.aP13 = aP13;
      pexialtt.this.AV25ProForNro = aP14[0];
      this.aP14 = aP14;
      pexialtt.this.AV47RecLinMaq = aP15[0];
      this.aP15 = aP15;
      pexialtt.this.AV46TanqueN = aP16[0];
      this.aP16 = aP16;
      pexialtt.this.AV55Parcial = aP17[0];
      this.aP17 = aP17;
      pexialtt.this.AV56PrdNomIni = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV52Consumos = (byte)(0) ;
      GXv_int1[0] = AV52Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int1) ;
      pexialtt.this.AV52Consumos = (byte)((byte)(GXv_int1[0])) ;
      AV37Flag = (byte)(0) ;
      AV57CantidadA = AV15Cantidad ;
      /* Using cursor P01LZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P01LZ2_A856ValCod[0] ;
         A680PrdAltNum = P01LZ2_A680PrdAltNum[0] ;
         A718PrdNom = P01LZ2_A718PrdNom[0] ;
         A678PrdAltFac = P01LZ2_A678PrdAltFac[0] ;
         A705PrdExiCC = P01LZ2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P01LZ2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P01LZ2_A685PrdCanRes[0] ;
         A856ValCod = P01LZ2_A856ValCod[0] ;
         A718PrdNom = P01LZ2_A718PrdNom[0] ;
         A705PrdExiCC = P01LZ2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P01LZ2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P01LZ2_A685PrdCanRes[0] ;
         AV37Flag = (byte)(1) ;
         AV40PrdNum = A719PrdNum ;
         AV41PrdNom = A718PrdNom ;
         AV42PrdAltFac = A678PrdAltFac ;
         AV27CanTeo = AV27CanTeo.multiply(A678PrdAltFac) ;
         AV57CantidadA = AV15Cantidad.multiply(A678PrdAltFac) ;
         AV34CanRec = AV27CanTeo ;
         if ( AV52Consumos == 0 )
         {
            AV53Existencia = A705PrdExiCC ;
         }
         else
         {
            AV53Existencia = A704PrdExiAlm ;
         }
         AV33ExiRes = AV53Existencia.subtract(A685PrdCanRes) ;
         if ( DecimalUtil.compareTo(AV33ExiRes, AV27CanTeo) >= 0 )
         {
            AV54RecMar = (byte)(0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         else
         {
            AV54RecMar = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV37Flag == 0 )
      {
         AV40PrdNum = A719PrdNum ;
         AV41PrdNom = AV56PrdNomIni ;
         AV34CanRec = AV27CanTeo ;
         AV54RecMar = (byte)(1) ;
      }
      if ( AV28Flag2 == 1 )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV40PrdNum ;
         GXv_decimal4[0] = AV27CanTeo ;
         new app.pactres(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_decimal4) ;
         pexialtt.this.A396EmprCod = GXv_char2[0] ;
         pexialtt.this.AV40PrdNum = GXv_char3[0] ;
         pexialtt.this.AV27CanTeo = GXv_decimal4[0] ;
      }
      /* Execute user subroutine: 'NEWRECETA' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NEWRECETA' Routine */
      returnInSub = false ;
      AV20LinRec = (short)(AV20LinRec+10) ;
      /*
         INSERT RECORD ON TABLE TXPLRECET

      */
      A129BarCod = AV21BarCod ;
      A132BarCodReo = AV22BarCodReo ;
      A130BarCodPar = AV23BarCodPar ;
      A2804RecLinMaq = AV47RecLinMaq ;
      A1273RecLinPro = AV30Linea ;
      A811RecLin = AV20LinRec ;
      A872RecPrdNum = AV40PrdNum ;
      A875RecPrdDsc = AV41PrdNom ;
      A490ForPrdUMe = AV16UniMed ;
      n490ForPrdUMe = false ;
      A686PrdCant = AV34CanRec.multiply(DecimalUtil.doubleToDec(1000)) ;
      A431FacCon = AV57CantidadA ;
      A719PrdNum = AV40PrdNum ;
      n719PrdNum = false ;
      A2394RecForNro = AV25ProForNro ;
      A3274RecPrdTnq = AV46TanqueN ;
      A4024RecMar = AV54RecMar ;
      A5527RecLinRea = httpContext.getMessage( "N", "") ;
      /* Using cursor P01LZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, A872RecPrdNum, A875RecPrdDsc, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A431FacCon, A686PrdCant, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A5527RecLinRea});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
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
      AV26Exist = (byte)(1) ;
      AV55Parcial = (byte)(0) ;
      if ( AV54RecMar != 0 )
      {
         /* Execute user subroutine: 'ACTHDR' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'ACTHDR' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01LZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexialtt.this.A396EmprCod;
      this.aP1[0] = pexialtt.this.A719PrdNum;
      this.aP2[0] = pexialtt.this.AV27CanTeo;
      this.aP3[0] = pexialtt.this.AV21BarCod;
      this.aP4[0] = pexialtt.this.AV22BarCodReo;
      this.aP5[0] = pexialtt.this.AV23BarCodPar;
      this.aP6[0] = pexialtt.this.AV20LinRec;
      this.aP7[0] = pexialtt.this.AV16UniMed;
      this.aP8[0] = pexialtt.this.AV26Exist;
      this.aP9[0] = pexialtt.this.AV15Cantidad;
      this.aP10[0] = pexialtt.this.AV28Flag2;
      this.aP11[0] = pexialtt.this.AV29Flag1;
      this.aP12[0] = pexialtt.this.AV30Linea;
      this.aP13[0] = pexialtt.this.AV32ExiCon;
      this.aP14[0] = pexialtt.this.AV25ProForNro;
      this.aP15[0] = pexialtt.this.AV47RecLinMaq;
      this.aP16[0] = pexialtt.this.AV46TanqueN;
      this.aP17[0] = pexialtt.this.AV55Parcial;
      this.aP18[0] = pexialtt.this.AV56PrdNomIni;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexialtt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      AV57CantidadA = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01LZ2_A396EmprCod = new String[] {""} ;
      P01LZ2_A719PrdNum = new String[] {""} ;
      P01LZ2_n719PrdNum = new boolean[] {false} ;
      P01LZ2_A856ValCod = new byte[1] ;
      P01LZ2_A680PrdAltNum = new String[] {""} ;
      P01LZ2_A718PrdNom = new String[] {""} ;
      P01LZ2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LZ2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LZ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LZ2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A680PrdAltNum = "" ;
      A718PrdNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV40PrdNum = "" ;
      AV41PrdNom = "" ;
      AV42PrdAltFac = DecimalUtil.ZERO ;
      AV34CanRec = DecimalUtil.ZERO ;
      AV53Existencia = DecimalUtil.ZERO ;
      AV33ExiRes = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A431FacCon = DecimalUtil.ZERO ;
      A5527RecLinRea = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexialtt__default(),
         new Object[] {
             new Object[] {
            P01LZ2_A396EmprCod, P01LZ2_A719PrdNum, P01LZ2_A856ValCod, P01LZ2_A680PrdAltNum, P01LZ2_A718PrdNom, P01LZ2_A678PrdAltFac, P01LZ2_A705PrdExiCC, P01LZ2_A704PrdExiAlm, P01LZ2_A685PrdCanRes
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

   private byte AV22BarCodReo ;
   private byte AV16UniMed ;
   private byte AV26Exist ;
   private byte AV28Flag2 ;
   private byte AV29Flag1 ;
   private byte AV30Linea ;
   private byte AV32ExiCon ;
   private byte AV25ProForNro ;
   private byte AV46TanqueN ;
   private byte AV55Parcial ;
   private byte AV52Consumos ;
   private byte AV37Flag ;
   private byte A856ValCod ;
   private byte AV54RecMar ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private short AV20LinRec ;
   private short AV47RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV21BarCod ;
   private int GXv_int1[] ;
   private int GX_INS410 ;
   private int A129BarCod ;
   private java.math.BigDecimal AV27CanTeo ;
   private java.math.BigDecimal AV15Cantidad ;
   private java.math.BigDecimal AV57CantidadA ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV42PrdAltFac ;
   private java.math.BigDecimal AV34CanRec ;
   private java.math.BigDecimal AV53Existencia ;
   private java.math.BigDecimal AV33ExiRes ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A431FacCon ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV23BarCodPar ;
   private String AV56PrdNomIni ;
   private String scmdbuf ;
   private String A680PrdAltNum ;
   private String A718PrdNom ;
   private String AV40PrdNum ;
   private String AV41PrdNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A5527RecLinRea ;
   private String Gx_emsg ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n490ForPrdUMe ;
   private String[] aP18 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private byte[] aP10 ;
   private byte[] aP11 ;
   private byte[] aP12 ;
   private byte[] aP13 ;
   private byte[] aP14 ;
   private short[] aP15 ;
   private byte[] aP16 ;
   private byte[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LZ2_A396EmprCod ;
   private String[] P01LZ2_A719PrdNum ;
   private boolean[] P01LZ2_n719PrdNum ;
   private byte[] P01LZ2_A856ValCod ;
   private String[] P01LZ2_A680PrdAltNum ;
   private String[] P01LZ2_A718PrdNom ;
   private java.math.BigDecimal[] P01LZ2_A678PrdAltFac ;
   private java.math.BigDecimal[] P01LZ2_A705PrdExiCC ;
   private java.math.BigDecimal[] P01LZ2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P01LZ2_A685PrdCanRes ;
}

final  class pexialtt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LZ2", "SELECT T1.EmprCod, T1.PrdNum, T2.ValCod, T1.PrdAltNum, T2.PrdNom, T1.PrdAltFac, T2.PrdExiCC, T2.PrdExiAlm, T2.PrdCanRes FROM (TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T2.ValCod <> 3) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01LZ3", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, RecPrdNum, RecPrdDsc, ForPrdUMe, FacCon, PrdCant, RecForNro, RecPrdTnq, RecMar, RecLinRea, PrdCanFin, PrdCanAny, RecCanEns, RecLinUsr, RecPesFec, RecSalMP, RecSalVol, RecLote, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecPrdDc2, PrdCantOrg, RecFabId, RecLotAlm, RecLoteFch, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P01LZ4", "UPDATE TXPBARCAD SET BarInci=9  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               stmt.setString(9, (String)parms[9], 6);
               stmt.setString(10, (String)parms[10], 26);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[12]).byteValue());
               }
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[14], 3);
               stmt.setByte(14, ((Number) parms[15]).byteValue());
               stmt.setByte(15, ((Number) parms[16]).byteValue());
               stmt.setByte(16, ((Number) parms[17]).byteValue());
               stmt.setString(17, (String)parms[18], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

