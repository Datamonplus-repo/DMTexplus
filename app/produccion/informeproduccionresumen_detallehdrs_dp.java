package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumen_detallehdrs_dp extends GXProcedure
{
   public informeproduccionresumen_detallehdrs_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumen_detallehdrs_dp.class ), "" );
   }

   public informeproduccionresumen_detallehdrs_dp( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> executeUdp( String aP0 ,
                                                                                                                                                String aP1 ,
                                                                                                                                                String aP2 ,
                                                                                                                                                java.util.Date aP3 ,
                                                                                                                                                java.util.Date aP4 ,
                                                                                                                                                int aP5 ,
                                                                                                                                                int aP6 ,
                                                                                                                                                byte aP7 ,
                                                                                                                                                short aP8 )
   {
      informeproduccionresumen_detallehdrs_dp.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        int aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        short aP8 ,
                        GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             int aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             short aP8 ,
                             GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>[] aP9 )
   {
      informeproduccionresumen_detallehdrs_dp.this.AV5emprcod = aP0;
      informeproduccionresumen_detallehdrs_dp.this.AV12maqcodfrom = aP1;
      informeproduccionresumen_detallehdrs_dp.this.AV11Maqcodto = aP2;
      informeproduccionresumen_detallehdrs_dp.this.AV10hisprodti = aP3;
      informeproduccionresumen_detallehdrs_dp.this.AV9hisprodtf = aP4;
      informeproduccionresumen_detallehdrs_dp.this.AV8opecodfrom = aP5;
      informeproduccionresumen_detallehdrs_dp.this.AV7opecodto = aP6;
      informeproduccionresumen_detallehdrs_dp.this.AV13HisEstReo = aP7;
      informeproduccionresumen_detallehdrs_dp.this.AV20Grulec = aP8;
      informeproduccionresumen_detallehdrs_dp.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV7opecodto) ,
                                           Integer.valueOf(AV8opecodfrom) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Byte.valueOf(AV13HisEstReo) ,
                                           A4441HisProDTF ,
                                           AV9hisprodtf ,
                                           AV10hisprodti ,
                                           AV5emprcod ,
                                           AV12maqcodfrom ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV11Maqcodto } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P004Y2 */
      pr_default.execute(0, new Object[] {AV5emprcod, AV12maqcodfrom, Byte.valueOf(AV13HisEstReo), Byte.valueOf(AV13HisEstReo), AV9hisprodtf, AV10hisprodti, AV11Maqcodto, Integer.valueOf(AV7opecodto), Integer.valueOf(AV8opecodfrom)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004Y2_A396EmprCod[0] ;
         A602MaqCod = P004Y2_A602MaqCod[0] ;
         A503GruOpeCod = P004Y2_A503GruOpeCod[0] ;
         A3612HisProReo = P004Y2_A3612HisProReo[0] ;
         A461Fase = P004Y2_A461Fase[0] ;
         A3610HisProLot = P004Y2_A3610HisProLot[0] ;
         A556HisProEst = P004Y2_A556HisProEst[0] ;
         A252CliCod = P004Y2_A252CliCod[0] ;
         n252CliCod = P004Y2_n252CliCod[0] ;
         A212BarSer = P004Y2_A212BarSer[0] ;
         A135BarColNom = P004Y2_A135BarColNom[0] ;
         A136BarColNum = P004Y2_A136BarColNum[0] ;
         A218BarTipCol = P004Y2_A218BarTipCol[0] ;
         A1525HisProKgr = P004Y2_A1525HisProKgr[0] ;
         A1526HisProMtr = P004Y2_A1526HisProMtr[0] ;
         A4714HisProNpzs = P004Y2_A4714HisProNpzs[0] ;
         A566HisProTur = P004Y2_A566HisProTur[0] ;
         A557HisProF = P004Y2_A557HisProF[0] ;
         A279CliNom = P004Y2_A279CliNom[0] ;
         A1652BarSerDsc = P004Y2_A1652BarSerDsc[0] ;
         A217BarTipArt = P004Y2_A217BarTipArt[0] ;
         n217BarTipArt = P004Y2_n217BarTipArt[0] ;
         A656ParCod = P004Y2_A656ParCod[0] ;
         n656ParCod = P004Y2_n656ParCod[0] ;
         A867ParCodNom = P004Y2_A867ParCodNom[0] ;
         n867ParCodNom = P004Y2_n867ParCodNom[0] ;
         A561HisProLin = P004Y2_A561HisProLin[0] ;
         A558HisProFec = P004Y2_A558HisProFec[0] ;
         A130BarCodPar = P004Y2_A130BarCodPar[0] ;
         A132BarCodReo = P004Y2_A132BarCodReo[0] ;
         A129BarCod = P004Y2_A129BarCod[0] ;
         A4440HisProDTI = P004Y2_A4440HisProDTI[0] ;
         n4440HisProDTI = P004Y2_n4440HisProDTI[0] ;
         A4441HisProDTF = P004Y2_A4441HisProDTF[0] ;
         n4441HisProDTF = P004Y2_n4441HisProDTF[0] ;
         A867ParCodNom = P004Y2_A867ParCodNom[0] ;
         n867ParCodNom = P004Y2_n867ParCodNom[0] ;
         A252CliCod = P004Y2_A252CliCod[0] ;
         n252CliCod = P004Y2_n252CliCod[0] ;
         A212BarSer = P004Y2_A212BarSer[0] ;
         A135BarColNom = P004Y2_A135BarColNom[0] ;
         A136BarColNum = P004Y2_A136BarColNum[0] ;
         A218BarTipCol = P004Y2_A218BarTipCol[0] ;
         A1652BarSerDsc = P004Y2_A1652BarSerDsc[0] ;
         A217BarTipArt = P004Y2_A217BarTipArt[0] ;
         n217BarTipArt = P004Y2_n217BarTipArt[0] ;
         A279CliNom = P004Y2_A279CliNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         Gxm1informeproduccionresumen_detallehdrs_sdt = (app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)new app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1informeproduccionresumen_detallehdrs_sdt, 0);
         AV18HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         GXt_char1 = AV19FasActTin ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A461Fase ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasest(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         informeproduccionresumen_detallehdrs_dp.this.A396EmprCod = GXv_char2[0] ;
         informeproduccionresumen_detallehdrs_dp.this.A461Fase = GXv_char3[0] ;
         informeproduccionresumen_detallehdrs_dp.this.GXt_char1 = GXv_char4[0] ;
         AV19FasActTin = GXt_char1 ;
         AV17Flagmarca = (short)(0) ;
         AV17Flagmarca = (short)(((GXutil.strcmp(A3610HisProLot, AV18HisProLot)==0) ? 1 : 0)) ;
         AV17Flagmarca = (short)(((AV20Grulec==0)&&(GXutil.strcmp(AV19FasActTin, "N")==0) ? 1 : AV17Flagmarca)) ;
         AV17Flagmarca = (short)(((AV20Grulec==1)&&(GXutil.strcmp(A3610HisProLot, AV18HisProLot)==0)&&(GXutil.strcmp(AV19FasActTin, "N")==0) ? 1 : AV17Flagmarca)) ;
         AV16minutos = 0 ;
         AV16minutos = ((AV17Flagmarca==1)&&(A556HisProEst!=0) ? A5605HisProTr2 : 0) ;
         GXt_char1 = AV21Forusrcod ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char2[0] = A135BarColNom ;
         GXv_int6[0] = A136BarColNum ;
         GXv_int7[0] = A218BarTipCol ;
         GXv_char8[0] = "" ;
         GXv_char9[0] = AV15Matdsc ;
         GXv_int10[0] = AV14matcod ;
         GXv_int11[0] = (byte)(0) ;
         GXv_char12[0] = "" ;
         GXv_char13[0] = "" ;
         GXv_int14[0] = 0 ;
         GXv_char15[0] = "" ;
         GXv_char16[0] = "" ;
         GXv_int17[0] = (short)(0) ;
         GXv_char18[0] = "" ;
         GXv_char19[0] = "" ;
         GXv_int20[0] = 0 ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime22[0] = AV22fechadt ;
         GXv_char23[0] = GXt_char1 ;
         new app.pmasinf2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_char13, GXv_int14, GXv_char15, GXv_char16, GXv_int17, GXv_char18, GXv_char19, GXv_int20, GXv_decimal21, GXv_dtime22, GXv_char23) ;
         informeproduccionresumen_detallehdrs_dp.this.A396EmprCod = GXv_char4[0] ;
         informeproduccionresumen_detallehdrs_dp.this.A252CliCod = GXv_int5[0] ;
         informeproduccionresumen_detallehdrs_dp.this.A212BarSer = GXv_char3[0] ;
         informeproduccionresumen_detallehdrs_dp.this.A135BarColNom = GXv_char2[0] ;
         informeproduccionresumen_detallehdrs_dp.this.A136BarColNum = GXv_int6[0] ;
         informeproduccionresumen_detallehdrs_dp.this.A218BarTipCol = GXv_int7[0] ;
         informeproduccionresumen_detallehdrs_dp.this.AV15Matdsc = GXv_char9[0] ;
         informeproduccionresumen_detallehdrs_dp.this.AV14matcod = GXv_int10[0] ;
         informeproduccionresumen_detallehdrs_dp.this.AV22fechadt = GXv_dtime22[0] ;
         informeproduccionresumen_detallehdrs_dp.this.GXt_char1 = GXv_char23[0] ;
         AV21Forusrcod = GXt_char1 ;
         AV23minutosdec = (long)(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)) ;
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barnhdr( A13696BarNHdr );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolot( A3610HisProLot );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqcod( A602MaqCod );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec( A558HisProFec );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin( A561HisProLin );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr( A1525HisProKgr );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr( A1526HisProMtr );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs( A4714HisProNpzs );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur( A566HisProTur );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof( A557HisProF );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti( A4440HisProDTI );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf( A4441HisProDTF );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod( A252CliCod );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clinom( A279CliNom );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barser( A212BarSer );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barserdsc( A1652BarSerDsc );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnom( A135BarColNom );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum( A136BarColNum );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol( A218BarTipCol );
         GXt_char1 = "" ;
         GXv_char23[0] = GXt_char1 ;
         new app.ptipcoldsc(remoteHandle, context).execute( A396EmprCod, A218BarTipCol, GXv_char23) ;
         informeproduccionresumen_detallehdrs_dp.this.GXt_char1 = GXv_char23[0] ;
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipcoldsc( GXt_char1 );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod( AV14matcod );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matdsc( AV15Matdsc );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod( A503GruOpeCod );
         GXt_char1 = "" ;
         GXv_char23[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char23) ;
         informeproduccionresumen_detallehdrs_dp.this.GXt_char1 = GXv_char23[0] ;
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Openom( GXt_char1 );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fase( A461Fase );
         GXt_char1 = "" ;
         GXv_char23[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char23) ;
         informeproduccionresumen_detallehdrs_dp.this.GXt_char1 = GXv_char23[0] ;
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fasdsc( GXt_char1 );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos( AV16minutos );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec( DecimalUtil.doubleToDec(AV23minutosdec) );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2( (short)(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)) );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca( AV17Flagmarca );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart( A217BarTipArt );
         GXt_char1 = "" ;
         GXv_char23[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char23) ;
         informeproduccionresumen_detallehdrs_dp.this.GXt_char1 = GXv_char23[0] ;
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipartdsc( GXt_char1 );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod( A656ParCod );
         Gxm1informeproduccionresumen_detallehdrs_sdt.setgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcodnom( A867ParCodNom );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP9[0] = informeproduccionresumen_detallehdrs_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>(app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem.class, "InformeProduccionResumen_DetalleHdrs_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P004Y2_A396EmprCod = new String[] {""} ;
      P004Y2_A602MaqCod = new String[] {""} ;
      P004Y2_A503GruOpeCod = new int[1] ;
      P004Y2_A3612HisProReo = new byte[1] ;
      P004Y2_A461Fase = new String[] {""} ;
      P004Y2_A3610HisProLot = new String[] {""} ;
      P004Y2_A556HisProEst = new byte[1] ;
      P004Y2_A252CliCod = new int[1] ;
      P004Y2_n252CliCod = new boolean[] {false} ;
      P004Y2_A212BarSer = new String[] {""} ;
      P004Y2_A135BarColNom = new String[] {""} ;
      P004Y2_A136BarColNum = new int[1] ;
      P004Y2_A218BarTipCol = new byte[1] ;
      P004Y2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Y2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Y2_A4714HisProNpzs = new short[1] ;
      P004Y2_A566HisProTur = new byte[1] ;
      P004Y2_A557HisProF = new String[] {""} ;
      P004Y2_A279CliNom = new String[] {""} ;
      P004Y2_A1652BarSerDsc = new String[] {""} ;
      P004Y2_A217BarTipArt = new short[1] ;
      P004Y2_n217BarTipArt = new boolean[] {false} ;
      P004Y2_A656ParCod = new short[1] ;
      P004Y2_n656ParCod = new boolean[] {false} ;
      P004Y2_A867ParCodNom = new String[] {""} ;
      P004Y2_n867ParCodNom = new boolean[] {false} ;
      P004Y2_A561HisProLin = new int[1] ;
      P004Y2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P004Y2_A130BarCodPar = new String[] {""} ;
      P004Y2_A132BarCodReo = new byte[1] ;
      P004Y2_A129BarCod = new int[1] ;
      P004Y2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P004Y2_n4440HisProDTI = new boolean[] {false} ;
      P004Y2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P004Y2_n4441HisProDTF = new boolean[] {false} ;
      A461Fase = "" ;
      A3610HisProLot = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A867ParCodNom = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A13696BarNHdr = "" ;
      Gxm1informeproduccionresumen_detallehdrs_sdt = new app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem(remoteHandle, context);
      AV18HisProLot = "" ;
      AV19FasActTin = "" ;
      AV21Forusrcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      AV15Matdsc = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char15 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int20 = new int[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      AV22fechadt = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime22 = new java.util.Date[1] ;
      GXt_char1 = "" ;
      GXv_char23 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumen_detallehdrs_dp__default(),
         new Object[] {
             new Object[] {
            P004Y2_A396EmprCod, P004Y2_A602MaqCod, P004Y2_A503GruOpeCod, P004Y2_A3612HisProReo, P004Y2_A461Fase, P004Y2_A3610HisProLot, P004Y2_A556HisProEst, P004Y2_A252CliCod, P004Y2_n252CliCod, P004Y2_A212BarSer,
            P004Y2_A135BarColNom, P004Y2_A136BarColNum, P004Y2_A218BarTipCol, P004Y2_A1525HisProKgr, P004Y2_A1526HisProMtr, P004Y2_A4714HisProNpzs, P004Y2_A566HisProTur, P004Y2_A557HisProF, P004Y2_A279CliNom, P004Y2_A1652BarSerDsc,
            P004Y2_A217BarTipArt, P004Y2_n217BarTipArt, P004Y2_A656ParCod, P004Y2_n656ParCod, P004Y2_A867ParCodNom, P004Y2_n867ParCodNom, P004Y2_A561HisProLin, P004Y2_A558HisProFec, P004Y2_A130BarCodPar, P004Y2_A132BarCodReo,
            P004Y2_A129BarCod, P004Y2_A4440HisProDTI, P004Y2_n4440HisProDTI, P004Y2_A4441HisProDTF, P004Y2_n4441HisProDTF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13HisEstReo ;
   private byte A3612HisProReo ;
   private byte A556HisProEst ;
   private byte A218BarTipCol ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte GXv_int7[] ;
   private byte GXv_int11[] ;
   private short AV20Grulec ;
   private short A4714HisProNpzs ;
   private short A217BarTipArt ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV17Flagmarca ;
   private short AV14matcod ;
   private short GXv_int10[] ;
   private short GXv_int17[] ;
   private short Gx_err ;
   private int AV8opecodfrom ;
   private int AV7opecodto ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int AV16minutos ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int GXv_int14[] ;
   private int GXv_int20[] ;
   private long AV23minutosdec ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private String AV5emprcod ;
   private String AV12maqcodfrom ;
   private String AV11Maqcodto ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A3610HisProLot ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A557HisProF ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A867ParCodNom ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV18HisProLot ;
   private String AV19FasActTin ;
   private String AV21Forusrcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String AV15Matdsc ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char15[] ;
   private String GXv_char16[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXt_char1 ;
   private String GXv_char23[] ;
   private java.util.Date AV10hisprodti ;
   private java.util.Date AV9hisprodtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV22fechadt ;
   private java.util.Date GXv_dtime22[] ;
   private java.util.Date A558HisProFec ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P004Y2_A396EmprCod ;
   private String[] P004Y2_A602MaqCod ;
   private int[] P004Y2_A503GruOpeCod ;
   private byte[] P004Y2_A3612HisProReo ;
   private String[] P004Y2_A461Fase ;
   private String[] P004Y2_A3610HisProLot ;
   private byte[] P004Y2_A556HisProEst ;
   private int[] P004Y2_A252CliCod ;
   private boolean[] P004Y2_n252CliCod ;
   private String[] P004Y2_A212BarSer ;
   private String[] P004Y2_A135BarColNom ;
   private int[] P004Y2_A136BarColNum ;
   private byte[] P004Y2_A218BarTipCol ;
   private java.math.BigDecimal[] P004Y2_A1525HisProKgr ;
   private java.math.BigDecimal[] P004Y2_A1526HisProMtr ;
   private short[] P004Y2_A4714HisProNpzs ;
   private byte[] P004Y2_A566HisProTur ;
   private String[] P004Y2_A557HisProF ;
   private String[] P004Y2_A279CliNom ;
   private String[] P004Y2_A1652BarSerDsc ;
   private short[] P004Y2_A217BarTipArt ;
   private boolean[] P004Y2_n217BarTipArt ;
   private short[] P004Y2_A656ParCod ;
   private boolean[] P004Y2_n656ParCod ;
   private String[] P004Y2_A867ParCodNom ;
   private boolean[] P004Y2_n867ParCodNom ;
   private int[] P004Y2_A561HisProLin ;
   private java.util.Date[] P004Y2_A558HisProFec ;
   private String[] P004Y2_A130BarCodPar ;
   private byte[] P004Y2_A132BarCodReo ;
   private int[] P004Y2_A129BarCod ;
   private java.util.Date[] P004Y2_A4440HisProDTI ;
   private boolean[] P004Y2_n4440HisProDTI ;
   private java.util.Date[] P004Y2_A4441HisProDTF ;
   private boolean[] P004Y2_n4441HisProDTF ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> Gxm2rootcol ;
   private app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem Gxm1informeproduccionresumen_detallehdrs_sdt ;
}

final  class informeproduccionresumen_detallehdrs_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV7opecodto ,
                                          int AV8opecodfrom ,
                                          int A503GruOpeCod ,
                                          byte A3612HisProReo ,
                                          byte AV13HisEstReo ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV9hisprodtf ,
                                          java.util.Date AV10hisprodti ,
                                          String AV5emprcod ,
                                          String AV12maqcodfrom ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV11Maqcodto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[9];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.GruOpeCod, T1.HisProReo, T1.Fase, T1.HisProLot, T1.HisProEst, T3.CliCod, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T1.HisProKgr," ;
      scmdbuf += " T1.HisProMtr, T1.HisProNpzs, T1.HisProTur, T1.HisProF, T4.CliNom, T3.BarSerDsc, T3.BarTipArt, T1.ParCod, T2.ParCodNom, T1.HisProLin, T1.HisProFec, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.HisProDTI, T1.HisProDTF FROM (((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN" ;
      scmdbuf += " TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProReo = ? or ? = 9)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (0==AV7opecodto) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (0==AV8opecodfrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_P004Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
               ((String[]) buf[19])[0] = rslt.getString(19, 26);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(23);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(24);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(28);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[14], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

