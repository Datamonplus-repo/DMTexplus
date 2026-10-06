package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumendatatimedetalle_prc extends GXProcedure
{
   public informeproduccionresumendatatimedetalle_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumendatatimedetalle_prc.class ), "" );
   }

   public informeproduccionresumendatatimedetalle_prc( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             int aP5 ,
                             int aP6 ,
                             byte aP7 )
   {
      informeproduccionresumendatatimedetalle_prc.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        int aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             int aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             String[] aP8 )
   {
      informeproduccionresumendatatimedetalle_prc.this.AV9emprcod = aP0;
      informeproduccionresumendatatimedetalle_prc.this.AV20maqcod1 = aP1;
      informeproduccionresumendatatimedetalle_prc.this.AV21Maqcod2 = aP2;
      informeproduccionresumendatatimedetalle_prc.this.AV14hisprodti = aP3;
      informeproduccionresumendatatimedetalle_prc.this.AV13hisprodtf = aP4;
      informeproduccionresumendatatimedetalle_prc.this.AV23opecodfrom = aP5;
      informeproduccionresumendatatimedetalle_prc.this.AV24opecodto = aP6;
      informeproduccionresumendatatimedetalle_prc.this.AV16Hisproreo = aP7;
      informeproduccionresumendatatimedetalle_prc.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV12Grulec) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV9emprcod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      informeproduccionresumendatatimedetalle_prc.this.GXt_int1 = GXv_int2[0] ;
      AV12Grulec = GXt_int1 ;
      AV18InformeProduccionResumenDataTimeDetalle_SDT.clear();
      AV31GXLvl6 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV23opecodfrom) ,
                                           Integer.valueOf(AV24opecodto) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A4441HisProDTF ,
                                           AV14hisprodti ,
                                           AV13hisprodtf ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Byte.valueOf(AV8HisEstReo) ,
                                           AV9emprcod ,
                                           AV20maqcod1 ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV21Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ASU2 */
      pr_default.execute(0, new Object[] {AV9emprcod, AV20maqcod1, AV14hisprodti, AV13hisprodtf, Byte.valueOf(AV8HisEstReo), Byte.valueOf(AV8HisEstReo), AV21Maqcod2, Integer.valueOf(AV23opecodfrom), Integer.valueOf(AV24opecodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A503GruOpeCod = P0ASU2_A503GruOpeCod[0] ;
         A3612HisProReo = P0ASU2_A3612HisProReo[0] ;
         A602MaqCod = P0ASU2_A602MaqCod[0] ;
         A396EmprCod = P0ASU2_A396EmprCod[0] ;
         A3610HisProLot = P0ASU2_A3610HisProLot[0] ;
         A606MaqDsc = P0ASU2_A606MaqDsc[0] ;
         n606MaqDsc = P0ASU2_n606MaqDsc[0] ;
         A1525HisProKgr = P0ASU2_A1525HisProKgr[0] ;
         A1526HisProMtr = P0ASU2_A1526HisProMtr[0] ;
         A4714HisProNpzs = P0ASU2_A4714HisProNpzs[0] ;
         A461Fase = P0ASU2_A461Fase[0] ;
         A194BarOrdLin = P0ASU2_A194BarOrdLin[0] ;
         A556HisProEst = P0ASU2_A556HisProEst[0] ;
         A566HisProTur = P0ASU2_A566HisProTur[0] ;
         A557HisProF = P0ASU2_A557HisProF[0] ;
         A252CliCod = P0ASU2_A252CliCod[0] ;
         n252CliCod = P0ASU2_n252CliCod[0] ;
         A279CliNom = P0ASU2_A279CliNom[0] ;
         A212BarSer = P0ASU2_A212BarSer[0] ;
         A1652BarSerDsc = P0ASU2_A1652BarSerDsc[0] ;
         A656ParCod = P0ASU2_A656ParCod[0] ;
         n656ParCod = P0ASU2_n656ParCod[0] ;
         A867ParCodNom = P0ASU2_A867ParCodNom[0] ;
         n867ParCodNom = P0ASU2_n867ParCodNom[0] ;
         A135BarColNom = P0ASU2_A135BarColNom[0] ;
         A136BarColNum = P0ASU2_A136BarColNum[0] ;
         A218BarTipCol = P0ASU2_A218BarTipCol[0] ;
         A217BarTipArt = P0ASU2_A217BarTipArt[0] ;
         n217BarTipArt = P0ASU2_n217BarTipArt[0] ;
         A561HisProLin = P0ASU2_A561HisProLin[0] ;
         A558HisProFec = P0ASU2_A558HisProFec[0] ;
         A4440HisProDTI = P0ASU2_A4440HisProDTI[0] ;
         n4440HisProDTI = P0ASU2_n4440HisProDTI[0] ;
         A4441HisProDTF = P0ASU2_A4441HisProDTF[0] ;
         n4441HisProDTF = P0ASU2_n4441HisProDTF[0] ;
         A130BarCodPar = P0ASU2_A130BarCodPar[0] ;
         A132BarCodReo = P0ASU2_A132BarCodReo[0] ;
         A129BarCod = P0ASU2_A129BarCod[0] ;
         A606MaqDsc = P0ASU2_A606MaqDsc[0] ;
         n606MaqDsc = P0ASU2_n606MaqDsc[0] ;
         A867ParCodNom = P0ASU2_A867ParCodNom[0] ;
         n867ParCodNom = P0ASU2_n867ParCodNom[0] ;
         A252CliCod = P0ASU2_A252CliCod[0] ;
         n252CliCod = P0ASU2_n252CliCod[0] ;
         A212BarSer = P0ASU2_A212BarSer[0] ;
         A1652BarSerDsc = P0ASU2_A1652BarSerDsc[0] ;
         A135BarColNom = P0ASU2_A135BarColNom[0] ;
         A136BarColNum = P0ASU2_A136BarColNum[0] ;
         A218BarTipCol = P0ASU2_A218BarTipCol[0] ;
         A217BarTipArt = P0ASU2_A217BarTipArt[0] ;
         n217BarTipArt = P0ASU2_n217BarTipArt[0] ;
         A279CliNom = P0ASU2_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV31GXLvl6 = (byte)(1) ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item = (app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem)new app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem(remoteHandle, context);
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr( A13696BarNHdr );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot( A3610HisProLot );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod( A602MaqCod );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc( A606MaqDsc );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec( A558HisProFec );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin( A561HisProLin );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr( A1525HisProKgr );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr( A1526HisProMtr );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs( A4714HisProNpzs );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase( A461Fase );
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A461Fase ;
         GXv_char5[0] = AV10FasActTin ;
         new app.pfasest(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
         informeproduccionresumendatatimedetalle_prc.this.A396EmprCod = GXv_char3[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A461Fase = GXv_char4[0] ;
         informeproduccionresumendatatimedetalle_prc.this.AV10FasActTin = GXv_char5[0] ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin( AV10FasActTin );
         GXt_char6 = "" ;
         GXv_char5[0] = GXt_char6 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
         informeproduccionresumendatatimedetalle_prc.this.GXt_char6 = GXv_char5[0] ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc( GXt_char6 );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin( A194BarOrdLin );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti( A4440HisProDTI );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf( A4441HisProDTF );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2( A5605HisProTr2 );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest( A556HisProEst );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca( (byte)(AV11FlagMarca) );
         AV17hisprotre3 = (!GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF)&&A4441HisProDTF.after(A4440HisProDTI) ? DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)) : DecimalUtil.doubleToDec(0)) ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3( AV17hisprotre3 );
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A461Fase ;
         GXv_char3[0] = AV10FasActTin ;
         new app.pfasest(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         informeproduccionresumendatatimedetalle_prc.this.A396EmprCod = GXv_char5[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A461Fase = GXv_char4[0] ;
         informeproduccionresumendatatimedetalle_prc.this.AV10FasActTin = GXv_char3[0] ;
         AV11FlagMarca = (short)(0) ;
         AV11FlagMarca = (short)(((GXutil.strcmp(A3610HisProLot, GXutil.str( A129BarCod, 8, 0)+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar)==0) ? 1 : 0)) ;
         if ( AV12Grulec == 0 )
         {
            if ( GXutil.strcmp(AV10FasActTin, httpContext.getMessage( "N", "")) == 0 )
            {
               AV11FlagMarca = (short)(1) ;
            }
         }
         else
         {
            AV11FlagMarca = (short)(((GXutil.strcmp(A3610HisProLot, AV15HisProLot)==0)&&(GXutil.strcmp(AV10FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV11FlagMarca)) ;
         }
         AV22minutos = ((AV11FlagMarca==1)&&(A556HisProEst!=0) ? A5605HisProTr2 : 0) ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos( AV22minutos );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur( A566HisProTur );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof( A557HisProF );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod( A252CliCod );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom( A279CliNom );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser( A212BarSer );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc( A1652BarSerDsc );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod( A503GruOpeCod );
         GXt_char6 = "" ;
         GXv_char5[0] = GXt_char6 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char5) ;
         informeproduccionresumendatatimedetalle_prc.this.GXt_char6 = GXv_char5[0] ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom( GXt_char6 );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod( A656ParCod );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom( ((A656ParCod==0) ? " " : A867ParCodNom) );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom( A135BarColNom );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum( A136BarColNum );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol( A218BarTipCol );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart( A217BarTipArt );
         GXt_char6 = "" ;
         GXv_char5[0] = GXt_char6 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char5) ;
         informeproduccionresumendatatimedetalle_prc.this.GXt_char6 = GXv_char5[0] ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc( GXt_char6 );
         GXv_char5[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_char3[0] = A135BarColNom ;
         GXv_int8[0] = A136BarColNum ;
         GXv_int2[0] = A218BarTipCol ;
         GXv_char9[0] = "" ;
         GXv_char10[0] = AV26MatDsc ;
         GXv_int11[0] = AV27MatCod ;
         GXv_int12[0] = (byte)(0) ;
         GXv_char13[0] = "" ;
         GXv_char14[0] = "" ;
         GXv_int15[0] = 0 ;
         GXv_char16[0] = "" ;
         GXv_char17[0] = "" ;
         GXv_int18[0] = (short)(0) ;
         GXv_char19[0] = "" ;
         GXv_char20[0] = "" ;
         GXv_int21[0] = 0 ;
         GXv_decimal22[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime23[0] = GXutil.resetTime( AV28fechadt );
         GXv_char24[0] = "" ;
         new app.pmasinf2(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_char4, GXv_char3, GXv_int8, GXv_int2, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_char17, GXv_int18, GXv_char19, GXv_char20, GXv_int21, GXv_decimal22, GXv_dtime23, GXv_char24) ;
         informeproduccionresumendatatimedetalle_prc.this.A396EmprCod = GXv_char5[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A252CliCod = GXv_int7[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A212BarSer = GXv_char4[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A135BarColNom = GXv_char3[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A136BarColNum = GXv_int8[0] ;
         informeproduccionresumendatatimedetalle_prc.this.A218BarTipCol = GXv_int2[0] ;
         informeproduccionresumendatatimedetalle_prc.this.AV26MatDsc = GXv_char10[0] ;
         informeproduccionresumendatatimedetalle_prc.this.AV27MatCod = GXv_int11[0] ;
         informeproduccionresumendatatimedetalle_prc.this.AV28fechadt = GXutil.resetTime(GXv_dtime23[0]) ;
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod( AV27MatCod );
         AV19InformeProduccionResumenDataTimeDetalle_SDT_item.setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc( AV26MatDsc );
         AV18InformeProduccionResumenDataTimeDetalle_SDT.add(AV19InformeProduccionResumenDataTimeDetalle_SDT_item, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV31GXLvl6 == 0 )
      {
      }
      AV25InformeProduccionResumenDataTimeDetalle_SDTJson = AV18InformeProduccionResumenDataTimeDetalle_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = informeproduccionresumendatatimedetalle_prc.this.AV25InformeProduccionResumenDataTimeDetalle_SDTJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25InformeProduccionResumenDataTimeDetalle_SDTJson = "" ;
      AV18InformeProduccionResumenDataTimeDetalle_SDT = new GXBaseCollection<app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem>(app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem.class, "InformeProduccionResumenDataTimeDetalle_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P0ASU2_A503GruOpeCod = new int[1] ;
      P0ASU2_A3612HisProReo = new byte[1] ;
      P0ASU2_A602MaqCod = new String[] {""} ;
      P0ASU2_A396EmprCod = new String[] {""} ;
      P0ASU2_A3610HisProLot = new String[] {""} ;
      P0ASU2_A606MaqDsc = new String[] {""} ;
      P0ASU2_n606MaqDsc = new boolean[] {false} ;
      P0ASU2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASU2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASU2_A4714HisProNpzs = new short[1] ;
      P0ASU2_A461Fase = new String[] {""} ;
      P0ASU2_A194BarOrdLin = new short[1] ;
      P0ASU2_A556HisProEst = new byte[1] ;
      P0ASU2_A566HisProTur = new byte[1] ;
      P0ASU2_A557HisProF = new String[] {""} ;
      P0ASU2_A252CliCod = new int[1] ;
      P0ASU2_n252CliCod = new boolean[] {false} ;
      P0ASU2_A279CliNom = new String[] {""} ;
      P0ASU2_A212BarSer = new String[] {""} ;
      P0ASU2_A1652BarSerDsc = new String[] {""} ;
      P0ASU2_A656ParCod = new short[1] ;
      P0ASU2_n656ParCod = new boolean[] {false} ;
      P0ASU2_A867ParCodNom = new String[] {""} ;
      P0ASU2_n867ParCodNom = new boolean[] {false} ;
      P0ASU2_A135BarColNom = new String[] {""} ;
      P0ASU2_A136BarColNum = new int[1] ;
      P0ASU2_A218BarTipCol = new byte[1] ;
      P0ASU2_A217BarTipArt = new short[1] ;
      P0ASU2_n217BarTipArt = new boolean[] {false} ;
      P0ASU2_A561HisProLin = new int[1] ;
      P0ASU2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASU2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASU2_n4440HisProDTI = new boolean[] {false} ;
      P0ASU2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASU2_n4441HisProDTF = new boolean[] {false} ;
      P0ASU2_A130BarCodPar = new String[] {""} ;
      P0ASU2_A132BarCodReo = new byte[1] ;
      P0ASU2_A129BarCod = new int[1] ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A461Fase = "" ;
      A557HisProF = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A867ParCodNom = "" ;
      A135BarColNom = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV19InformeProduccionResumenDataTimeDetalle_SDT_item = new app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem(remoteHandle, context);
      AV10FasActTin = "" ;
      AV17hisprotre3 = DecimalUtil.ZERO ;
      AV15HisProLot = "" ;
      GXt_char6 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char9 = new String[1] ;
      AV26MatDsc = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int18 = new short[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      AV28fechadt = GXutil.nullDate() ;
      GXv_dtime23 = new java.util.Date[1] ;
      GXv_char24 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumendatatimedetalle_prc__default(),
         new Object[] {
             new Object[] {
            P0ASU2_A503GruOpeCod, P0ASU2_A3612HisProReo, P0ASU2_A602MaqCod, P0ASU2_A396EmprCod, P0ASU2_A3610HisProLot, P0ASU2_A606MaqDsc, P0ASU2_n606MaqDsc, P0ASU2_A1525HisProKgr, P0ASU2_A1526HisProMtr, P0ASU2_A4714HisProNpzs,
            P0ASU2_A461Fase, P0ASU2_A194BarOrdLin, P0ASU2_A556HisProEst, P0ASU2_A566HisProTur, P0ASU2_A557HisProF, P0ASU2_A252CliCod, P0ASU2_n252CliCod, P0ASU2_A279CliNom, P0ASU2_A212BarSer, P0ASU2_A1652BarSerDsc,
            P0ASU2_A656ParCod, P0ASU2_n656ParCod, P0ASU2_A867ParCodNom, P0ASU2_n867ParCodNom, P0ASU2_A135BarColNom, P0ASU2_A136BarColNum, P0ASU2_A218BarTipCol, P0ASU2_A217BarTipArt, P0ASU2_n217BarTipArt, P0ASU2_A561HisProLin,
            P0ASU2_A558HisProFec, P0ASU2_A4440HisProDTI, P0ASU2_n4440HisProDTI, P0ASU2_A4441HisProDTF, P0ASU2_n4441HisProDTF, P0ASU2_A130BarCodPar, P0ASU2_A132BarCodReo, P0ASU2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Hisproreo ;
   private byte GXt_int1 ;
   private byte AV31GXLvl6 ;
   private byte A3612HisProReo ;
   private byte AV8HisEstReo ;
   private byte A556HisProEst ;
   private byte A566HisProTur ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
   private byte GXv_int12[] ;
   private short AV12Grulec ;
   private short A4714HisProNpzs ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short A217BarTipArt ;
   private short A5605HisProTr2 ;
   private short AV11FlagMarca ;
   private short AV27MatCod ;
   private short GXv_int11[] ;
   private short GXv_int18[] ;
   private short Gx_err ;
   private int AV23opecodfrom ;
   private int AV24opecodto ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int AV22minutos ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int15[] ;
   private int GXv_int21[] ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV17hisprotre3 ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private String AV9emprcod ;
   private String AV20maqcod1 ;
   private String AV21Maqcod2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A867ParCodNom ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV10FasActTin ;
   private String AV15HisProLot ;
   private String GXt_char6 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char9[] ;
   private String AV26MatDsc ;
   private String GXv_char10[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char24[] ;
   private java.util.Date AV14hisprodti ;
   private java.util.Date AV13hisprodtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date GXv_dtime23[] ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV28fechadt ;
   private boolean n606MaqDsc ;
   private boolean n252CliCod ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n217BarTipArt ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV25InformeProduccionResumenDataTimeDetalle_SDTJson ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P0ASU2_A503GruOpeCod ;
   private byte[] P0ASU2_A3612HisProReo ;
   private String[] P0ASU2_A602MaqCod ;
   private String[] P0ASU2_A396EmprCod ;
   private String[] P0ASU2_A3610HisProLot ;
   private String[] P0ASU2_A606MaqDsc ;
   private boolean[] P0ASU2_n606MaqDsc ;
   private java.math.BigDecimal[] P0ASU2_A1525HisProKgr ;
   private java.math.BigDecimal[] P0ASU2_A1526HisProMtr ;
   private short[] P0ASU2_A4714HisProNpzs ;
   private String[] P0ASU2_A461Fase ;
   private short[] P0ASU2_A194BarOrdLin ;
   private byte[] P0ASU2_A556HisProEst ;
   private byte[] P0ASU2_A566HisProTur ;
   private String[] P0ASU2_A557HisProF ;
   private int[] P0ASU2_A252CliCod ;
   private boolean[] P0ASU2_n252CliCod ;
   private String[] P0ASU2_A279CliNom ;
   private String[] P0ASU2_A212BarSer ;
   private String[] P0ASU2_A1652BarSerDsc ;
   private short[] P0ASU2_A656ParCod ;
   private boolean[] P0ASU2_n656ParCod ;
   private String[] P0ASU2_A867ParCodNom ;
   private boolean[] P0ASU2_n867ParCodNom ;
   private String[] P0ASU2_A135BarColNom ;
   private int[] P0ASU2_A136BarColNum ;
   private byte[] P0ASU2_A218BarTipCol ;
   private short[] P0ASU2_A217BarTipArt ;
   private boolean[] P0ASU2_n217BarTipArt ;
   private int[] P0ASU2_A561HisProLin ;
   private java.util.Date[] P0ASU2_A558HisProFec ;
   private java.util.Date[] P0ASU2_A4440HisProDTI ;
   private boolean[] P0ASU2_n4440HisProDTI ;
   private java.util.Date[] P0ASU2_A4441HisProDTF ;
   private boolean[] P0ASU2_n4441HisProDTF ;
   private String[] P0ASU2_A130BarCodPar ;
   private byte[] P0ASU2_A132BarCodReo ;
   private int[] P0ASU2_A129BarCod ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem> AV18InformeProduccionResumenDataTimeDetalle_SDT ;
   private app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem AV19InformeProduccionResumenDataTimeDetalle_SDT_item ;
}

final  class informeproduccionresumendatatimedetalle_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ASU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV23opecodfrom ,
                                          int AV24opecodto ,
                                          int A503GruOpeCod ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV14hisprodti ,
                                          java.util.Date AV13hisprodtf ,
                                          byte A3612HisProReo ,
                                          byte AV8HisEstReo ,
                                          String AV9emprcod ,
                                          String AV20maqcod1 ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV21Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[9];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.GruOpeCod, T1.HisProReo, T1.MaqCod, T1.EmprCod, T1.HisProLot, T2.MaqDsc, T1.HisProKgr, T1.HisProMtr, T1.HisProNpzs, T1.Fase, T1.BarOrdLin, T1.HisProEst," ;
      scmdbuf += " T1.HisProTur, T1.HisProF, T4.CliCod, T5.CliNom, T4.BarSer, T4.BarSerDsc, T1.ParCod, T3.ParCodNom, T4.BarColNom, T4.BarColNum, T4.BarTipCol, T4.BarTipArt, T1.HisProLin," ;
      scmdbuf += " T1.HisProFec, T1.HisProDTI, T1.HisProDTF, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod" ;
      scmdbuf += " = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod" ;
      scmdbuf += " AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T4.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.HisProReo = ? or ? = 9)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (0==AV23opecodfrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (0==AV24opecodto) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_P0ASU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ASU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 16);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((short[]) buf[20])[0] = rslt.getShort(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 13);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(25);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(28);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(29, 1);
               ((byte[]) buf[36])[0] = rslt.getByte(30);
               ((int[]) buf[37])[0] = rslt.getInt(31);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
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

