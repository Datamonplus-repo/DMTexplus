package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pco0011 extends GXProcedure
{
   public pco0011( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pco0011.class ), "" );
   }

   public pco0011( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      pco0011.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      pco0011.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pco0011.this.AV22FecPrePed = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV26PedCol ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEDCOL", ""), GXv_int2) ;
      pco0011.this.GXt_int1 = GXv_int2[0] ;
      AV26PedCol = GXt_int1 ;
      GXt_int1 = AV25PedCC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEDCC", ""), GXv_int2) ;
      pco0011.this.GXt_int1 = GXv_int2[0] ;
      AV25PedCC = GXt_int1 ;
      GXt_int3 = AV27PorMin ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "%STKMI", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pco0011.this.A396EmprCod = GXv_char4[0] ;
      pco0011.this.GXt_int3 = GXv_int6[0] ;
      AV27PorMin = (byte)(GXt_int3) ;
      GXt_int3 = AV18Coloretto ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "COLORE", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6) ;
      pco0011.this.A396EmprCod = GXv_char5[0] ;
      pco0011.this.GXt_int3 = GXv_int6[0] ;
      AV18Coloretto = (byte)(GXt_int3) ;
      /* Optimized DELETE. */
      /* Using cursor P01J82 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
      /* End optimized DELETE. */
      /* Using cursor P01J83 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A835TipDtoCod = P01J83_A835TipDtoCod[0] ;
         n835TipDtoCod = P01J83_n835TipDtoCod[0] ;
         A795PrvNum = P01J83_A795PrvNum[0] ;
         A724PrdPreAct = P01J83_A724PrdPreAct[0] ;
         A837TipDtoDto = P01J83_A837TipDtoDto[0] ;
         n837TipDtoDto = P01J83_n837TipDtoDto[0] ;
         A732PrdStkMinU = P01J83_A732PrdStkMinU[0] ;
         A684PrdCanPen = P01J83_A684PrdCanPen[0] ;
         A685PrdCanRes = P01J83_A685PrdCanRes[0] ;
         A704PrdExiAlm = P01J83_A704PrdExiAlm[0] ;
         A705PrdExiCC = P01J83_A705PrdExiCC[0] ;
         A856ValCod = P01J83_A856ValCod[0] ;
         A719PrdNum = P01J83_A719PrdNum[0] ;
         A682PrdCalNec = P01J83_A682PrdCalNec[0] ;
         A721PrdNumUco = P01J83_A721PrdNumUco[0] ;
         A629MetCod = P01J83_A629MetCod[0] ;
         n629MetCod = P01J83_n629MetCod[0] ;
         A696PrdConDia = P01J83_A696PrdConDia[0] ;
         A699PrdDiaRot = P01J83_A699PrdDiaRot[0] ;
         A716PrdLotMin = P01J83_A716PrdLotMin[0] ;
         A837TipDtoDto = P01J83_A837TipDtoDto[0] ;
         n837TipDtoDto = P01J83_n837TipDtoDto[0] ;
         W396EmprCod = A396EmprCod ;
         AV16CantMin = A732PrdStkMinU.multiply(DecimalUtil.doubleToDec((1+(AV27PorMin/ (double) (100))))) ;
         if ( AV25PedCC == 0 )
         {
            AV30StkRea = A704PrdExiAlm.subtract(A685PrdCanRes).add(A684PrdCanPen) ;
         }
         else
         {
            AV30StkRea = (A704PrdExiAlm.add(A705PrdExiCC)).subtract(A685PrdCanRes).add(A684PrdCanPen) ;
         }
         if ( ( DecimalUtil.compareTo(AV30StkRea, AV16CantMin) < 0 ) && ( GXutil.strcmp(A682PrdCalNec, httpContext.getMessage( "S", "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A732PrdStkMinU)==0) && ( GXutil.len( A719PrdNum) >= 5 ) && ( GXutil.len( A719PrdNum) <= 6 ) && ( A856ValCod <= 2 ) )
         {
            AV36UniPed = DecimalUtil.ZERO ;
            AV15Any = (short)(GXutil.year( GXutil.today( ))) ;
            AV21Dia = GXutil.nullDate() ;
            GXv_char5[0] = AV40SdtPConCosJSon ;
            GXv_date7[0] = AV21Dia ;
            GXv_date8[0] = AV21Dia ;
            GXv_date9[0] = AV21Dia ;
            GXv_date10[0] = AV21Dia ;
            new app.pconconsdt(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV15Any, GXv_char5, GXv_date7, GXv_date8, GXv_date9, GXv_date10) ;
            pco0011.this.AV40SdtPConCosJSon = GXv_char5[0] ;
            pco0011.this.AV21Dia = GXv_date7[0] ;
            pco0011.this.AV21Dia = GXv_date8[0] ;
            pco0011.this.AV21Dia = GXv_date9[0] ;
            pco0011.this.AV21Dia = GXv_date10[0] ;
            AV33TotCon = DecimalUtil.ZERO ;
            AV39SdtPConCosCollection.fromJSonString(AV40SdtPConCosJSon, null);
            if ( AV39SdtPConCosCollection.size() > 0 )
            {
               AV45GXV1 = 1 ;
               while ( AV45GXV1 <= AV39SdtPConCosCollection.size() )
               {
                  AV38SdtPConCos = (app.SdtSdtPConCos)((app.SdtSdtPConCos)AV39SdtPConCosCollection.elementAt(-1+AV45GXV1));
                  AV33TotCon = AV33TotCon.add((AV38SdtPConCos.getgxTv_SdtSdtPConCos_Prduniconm())) ;
                  AV45GXV1 = (int)(AV45GXV1+1) ;
               }
            }
            AV39SdtPConCosCollection.clear();
            AV29PromCon = AV33TotCon.divide(DecimalUtil.doubleToDec(11), 18, java.math.RoundingMode.DOWN) ;
            if ( ( A629MetCod == 0 ) && ( A721PrdNumUco.doubleValue() != 0 ) )
            {
               AV36UniPed = GXutil.roundDecimal( (DecimalUtil.doubleToDec(A699PrdDiaRot).multiply(A696PrdConDia).divide(A721PrdNumUco, 18, java.math.RoundingMode.DOWN)), 0) ;
            }
            if ( A629MetCod == 1 )
            {
               if ( A721PrdNumUco.doubleValue() == 0 )
               {
                  AV24Multiplo = A716PrdLotMin ;
                  if ( AV24Multiplo == 0 )
                  {
                     AV24Multiplo = (short)(1) ;
                  }
                  AV17CantPedir = (int)(GXutil.Int( DecimalUtil.decToDouble((AV29PromCon.multiply(DecimalUtil.doubleToDec(A699PrdDiaRot))).divide(DecimalUtil.doubleToDec(30), 18, java.math.RoundingMode.DOWN)))) ;
                  if ( ( GXutil.Int( AV17CantPedir/ (double) (AV24Multiplo)) == ( AV17CantPedir / (double) ( AV24Multiplo ) ) ) )
                  {
                     AV36UniPed = DecimalUtil.doubleToDec(AV17CantPedir) ;
                  }
                  else
                  {
                     AV36UniPed = DecimalUtil.doubleToDec(AV24Multiplo*GXutil.Int( AV17CantPedir/ (double) (AV24Multiplo))+AV24Multiplo) ;
                  }
               }
               else
               {
                  if ( AV26PedCol == 0 )
                  {
                     AV36UniPed = A721PrdNumUco ;
                  }
                  else
                  {
                     AV36UniPed = DecimalUtil.doubleToDec(A716PrdLotMin).multiply(A721PrdNumUco) ;
                  }
               }
            }
            if ( A629MetCod == 2 )
            {
               AV36UniPed = DecimalUtil.doubleToDec(-1) ;
            }
            AV28PrdNum = A719PrdNum ;
            if ( AV36UniPed.doubleValue() != 0 )
            {
               /*
                  INSERT RECORD ON TABLE TXPPREPED

               */
               W396EmprCod = A396EmprCod ;
               W719PrdNum = A719PrdNum ;
               A756PrePrvNum = A795PrvNum ;
               A719PrdNum = AV28PrdNum ;
               A658PedCod = 0 ;
               n658PedCod = false ;
               A755PrePedUni = AV36UniPed ;
               n755PrePedUni = false ;
               A751PrePedCon = httpContext.getMessage( "S", "") ;
               n751PrePedCon = false ;
               A753PrePedPre = A724PrdPreAct ;
               n753PrePedPre = false ;
               A752PrePedDto = A837TipDtoDto ;
               n752PrePedDto = false ;
               A754PrePedPri = "1" ;
               n754PrePedPri = false ;
               /* Using cursor P01J84 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n755PrePedUni), A755PrePedUni, Boolean.valueOf(n751PrePedCon), A751PrePedCon, Boolean.valueOf(n753PrePedPre), A753PrePedPre, Boolean.valueOf(n752PrePedDto), A752PrePedDto, Boolean.valueOf(n754PrePedPri), A754PrePedPri});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
               if ( (pr_default.getStatus(2) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A719PrdNum = W719PrdNum ;
               /* End Insert */
            }
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pco0011.this.A396EmprCod;
      this.aP1[0] = pco0011.this.AV22FecPrePed;
      Application.commitDataStores(context, remoteHandle, pr_default, "pco0011");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P01J83_A835TipDtoCod = new byte[1] ;
      P01J83_n835TipDtoCod = new boolean[] {false} ;
      P01J83_A396EmprCod = new String[] {""} ;
      P01J83_A795PrvNum = new int[1] ;
      P01J83_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_n837TipDtoDto = new boolean[] {false} ;
      P01J83_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A856ValCod = new byte[1] ;
      P01J83_A719PrdNum = new String[] {""} ;
      P01J83_A682PrdCalNec = new String[] {""} ;
      P01J83_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A629MetCod = new byte[1] ;
      P01J83_n629MetCod = new boolean[] {false} ;
      P01J83_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J83_A699PrdDiaRot = new short[1] ;
      P01J83_A716PrdLotMin = new short[1] ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A682PrdCalNec = "" ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      AV16CantMin = DecimalUtil.ZERO ;
      AV30StkRea = DecimalUtil.ZERO ;
      AV36UniPed = DecimalUtil.ZERO ;
      AV21Dia = GXutil.nullDate() ;
      AV40SdtPConCosJSon = "" ;
      GXv_char5 = new String[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      AV33TotCon = DecimalUtil.ZERO ;
      AV39SdtPConCosCollection = new GXBaseCollection<app.SdtSdtPConCos>(app.SdtSdtPConCos.class, "SdtPConCos", "TexplusNET", remoteHandle);
      AV38SdtPConCos = new app.SdtSdtPConCos(remoteHandle, context);
      AV29PromCon = DecimalUtil.ZERO ;
      AV28PrdNum = "" ;
      W719PrdNum = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pco0011__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01J83_A835TipDtoCod, P01J83_n835TipDtoCod, P01J83_A396EmprCod, P01J83_A795PrvNum, P01J83_A724PrdPreAct, P01J83_A837TipDtoDto, P01J83_n837TipDtoDto, P01J83_A732PrdStkMinU, P01J83_A684PrdCanPen, P01J83_A685PrdCanRes,
            P01J83_A704PrdExiAlm, P01J83_A705PrdExiCC, P01J83_A856ValCod, P01J83_A719PrdNum, P01J83_A682PrdCalNec, P01J83_A721PrdNumUco, P01J83_A629MetCod, P01J83_n629MetCod, P01J83_A696PrdConDia, P01J83_A699PrdDiaRot,
            P01J83_A716PrdLotMin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26PedCol ;
   private byte AV25PedCC ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV27PorMin ;
   private byte AV18Coloretto ;
   private byte A835TipDtoCod ;
   private byte A856ValCod ;
   private byte A629MetCod ;
   private short A699PrdDiaRot ;
   private short A716PrdLotMin ;
   private short AV15Any ;
   private short AV24Multiplo ;
   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A795PrvNum ;
   private int AV45GXV1 ;
   private int AV17CantPedir ;
   private int GX_INS86 ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal AV16CantMin ;
   private java.math.BigDecimal AV30StkRea ;
   private java.math.BigDecimal AV36UniPed ;
   private java.math.BigDecimal AV33TotCon ;
   private java.math.BigDecimal AV29PromCon ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private String A396EmprCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A682PrdCalNec ;
   private String W396EmprCod ;
   private String GXv_char5[] ;
   private String AV28PrdNum ;
   private String W719PrdNum ;
   private String A751PrePedCon ;
   private String A754PrePedPri ;
   private String Gx_emsg ;
   private java.util.Date AV22FecPrePed ;
   private java.util.Date AV21Dia ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
   private boolean n835TipDtoCod ;
   private boolean n837TipDtoDto ;
   private boolean n629MetCod ;
   private boolean n658PedCod ;
   private boolean n755PrePedUni ;
   private boolean n751PrePedCon ;
   private boolean n753PrePedPre ;
   private boolean n752PrePedDto ;
   private boolean n754PrePedPri ;
   private String AV40SdtPConCosJSon ;
   private java.util.Date[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P01J83_A835TipDtoCod ;
   private boolean[] P01J83_n835TipDtoCod ;
   private String[] P01J83_A396EmprCod ;
   private int[] P01J83_A795PrvNum ;
   private java.math.BigDecimal[] P01J83_A724PrdPreAct ;
   private java.math.BigDecimal[] P01J83_A837TipDtoDto ;
   private boolean[] P01J83_n837TipDtoDto ;
   private java.math.BigDecimal[] P01J83_A732PrdStkMinU ;
   private java.math.BigDecimal[] P01J83_A684PrdCanPen ;
   private java.math.BigDecimal[] P01J83_A685PrdCanRes ;
   private java.math.BigDecimal[] P01J83_A704PrdExiAlm ;
   private java.math.BigDecimal[] P01J83_A705PrdExiCC ;
   private byte[] P01J83_A856ValCod ;
   private String[] P01J83_A719PrdNum ;
   private String[] P01J83_A682PrdCalNec ;
   private java.math.BigDecimal[] P01J83_A721PrdNumUco ;
   private byte[] P01J83_A629MetCod ;
   private boolean[] P01J83_n629MetCod ;
   private java.math.BigDecimal[] P01J83_A696PrdConDia ;
   private short[] P01J83_A699PrdDiaRot ;
   private short[] P01J83_A716PrdLotMin ;
   private GXBaseCollection<app.SdtSdtPConCos> AV39SdtPConCosCollection ;
   private app.SdtSdtPConCos AV38SdtPConCos ;
}

final  class pco0011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01J82", "DELETE FROM TXPPREPED  WHERE EmprCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
         ,new ForEachCursor("P01J83", "SELECT T1.TipDtoCod, T1.EmprCod, T1.PrvNum, T1.PrdPreAct, T2.TipDtoDto, T1.PrdStkMinU, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdExiCC, T1.ValCod, T1.PrdNum, T1.PrdCalNec, T1.PrdNumUco, T1.MetCod, T1.PrdConDia, T1.PrdDiaRot, T1.PrdLotMin FROM (TXPPRODUC T1 LEFT JOIN TXPTIPDTO T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDtoCod = T1.TipDtoCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01J84", "INSERT INTO TXPPREPED(EmprCod, PrePrvNum, PrdNum, PedCod, PrePedUni, PrePedCon, PrePedPre, PrePedDto, PrePedPri) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,4);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((short[]) buf[20])[0] = rslt.getShort(18);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 1);
               }
               return;
      }
   }

}

