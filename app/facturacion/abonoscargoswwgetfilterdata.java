package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class abonoscargoswwgetfilterdata extends GXProcedure
{
   public abonoscargoswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( abonoscargoswwgetfilterdata.class ), "" );
   }

   public abonoscargoswwgetfilterdata( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      abonoscargoswwgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      abonoscargoswwgetfilterdata.this.AV72DDOName = aP0;
      abonoscargoswwgetfilterdata.this.AV73SearchTxt = aP1;
      abonoscargoswwgetfilterdata.this.AV74SearchTxtTo = aP2;
      abonoscargoswwgetfilterdata.this.aP3 = aP3;
      abonoscargoswwgetfilterdata.this.aP4 = aP4;
      abonoscargoswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV62Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV65OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_FACCOB") == 0 )
      {
         /* Execute user subroutine: 'LOADFACCOBOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV75OptionsJson = AV62Options.toJSonString(false) ;
      AV76OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV77OptionIndexesJson = AV65OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("Facturacion.AbonosCargosWWGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.AbonosCargosWWGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("Facturacion.AbonosCargosWWGridState"), null, null);
      }
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV12TFFacCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFFacCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTIPFAC_SEL") == 0 )
         {
            AV79TFFacTipFac_SelsJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV80TFFacTipFac_Sels.fromJSonString(AV79TFFacTipFac_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACFCH") == 0 )
         {
            AV16TFFacFch = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV20TFCliCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCliCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV22TFCliNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV23TFCliNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPPP") == 0 )
         {
            AV81TFFacImpPP = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV82TFFacImpPP_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBASIMP") == 0 )
         {
            AV83TFFacBasImp = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFFacBasImp_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIVAIMP") == 0 )
         {
            AV85TFFacIVAImp = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV86TFFacIVAImp_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTOT") == 0 )
         {
            AV87TFFacTot = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFFacTot_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACEST_SEL") == 0 )
         {
            AV89TFFacEst_SelsJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV90TFFacEst_Sels.fromJSonString(AV89TFFacEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB") == 0 )
         {
            AV91TFFacCob = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB_SEL") == 0 )
         {
            AV92TFFacCob_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCliNom = AV73SearchTxt ;
      AV23TFCliNom_Sel = "" ;
      AV98Facturacion_abonoscargoswwds_1_filterfulltext = AV78FilterFullText ;
      AV99Facturacion_abonoscargoswwds_2_tffaccod = AV12TFFacCod ;
      AV100Facturacion_abonoscargoswwds_3_tffaccod_to = AV13TFFacCod_To ;
      AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV80TFFacTipFac_Sels ;
      AV102Facturacion_abonoscargoswwds_5_tffacfch = AV16TFFacFch ;
      AV103Facturacion_abonoscargoswwds_6_tfclicod = AV20TFCliCod ;
      AV104Facturacion_abonoscargoswwds_7_tfclicod_to = AV21TFCliCod_To ;
      AV105Facturacion_abonoscargoswwds_8_tfclinom = AV22TFCliNom ;
      AV106Facturacion_abonoscargoswwds_9_tfclinom_sel = AV23TFCliNom_Sel ;
      AV107Facturacion_abonoscargoswwds_10_tffacimppp = AV81TFFacImpPP ;
      AV108Facturacion_abonoscargoswwds_11_tffacimppp_to = AV82TFFacImpPP_To ;
      AV109Facturacion_abonoscargoswwds_12_tffacbasimp = AV83TFFacBasImp ;
      AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV84TFFacBasImp_To ;
      AV111Facturacion_abonoscargoswwds_14_tffacivaimp = AV85TFFacIVAImp ;
      AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV86TFFacIVAImp_To ;
      AV113Facturacion_abonoscargoswwds_16_tffactot = AV87TFFacTot ;
      AV114Facturacion_abonoscargoswwds_17_tffactot_to = AV88TFFacTot_To ;
      AV115Facturacion_abonoscargoswwds_18_tffacest_sels = AV90TFFacEst_Sels ;
      AV116Facturacion_abonoscargoswwds_19_tffaccob = AV91TFFacCob ;
      AV117Facturacion_abonoscargoswwds_20_tffaccob_sel = AV92TFFacCob_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                           Byte.valueOf(A435FacEst) ,
                                           AV115Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                           Integer.valueOf(AV99Facturacion_abonoscargoswwds_2_tffaccod) ,
                                           Integer.valueOf(AV100Facturacion_abonoscargoswwds_3_tffaccod_to) ,
                                           Integer.valueOf(AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels.size()) ,
                                           AV102Facturacion_abonoscargoswwds_5_tffacfch ,
                                           Integer.valueOf(AV103Facturacion_abonoscargoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV104Facturacion_abonoscargoswwds_7_tfclicod_to) ,
                                           AV106Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                           AV105Facturacion_abonoscargoswwds_8_tfclinom ,
                                           Integer.valueOf(AV115Facturacion_abonoscargoswwds_18_tffacest_sels.size()) ,
                                           AV117Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                           AV116Facturacion_abonoscargoswwds_19_tffaccob ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A965FacCob ,
                                           AV98Facturacion_abonoscargoswwds_1_filterfulltext ,
                                           A440FacImpPP ,
                                           A429FacBasImp ,
                                           A442FacIVAImp ,
                                           A455FacTot ,
                                           AV107Facturacion_abonoscargoswwds_10_tffacimppp ,
                                           AV108Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                           AV109Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                           AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                           AV111Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                           AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                           AV113Facturacion_abonoscargoswwds_16_tffactot ,
                                           AV114Facturacion_abonoscargoswwds_17_tffactot_to } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV105Facturacion_abonoscargoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV105Facturacion_abonoscargoswwds_8_tfclinom), 30, "%") ;
      lV116Facturacion_abonoscargoswwds_19_tffaccob = GXutil.padr( GXutil.rtrim( AV116Facturacion_abonoscargoswwds_19_tffaccob), 1, "%") ;
      /* Using cursor P0A3A5 */
      pr_default.execute(0, new Object[] {AV107Facturacion_abonoscargoswwds_10_tffacimppp, AV107Facturacion_abonoscargoswwds_10_tffacimppp, AV108Facturacion_abonoscargoswwds_11_tffacimppp_to, AV108Facturacion_abonoscargoswwds_11_tffacimppp_to, Integer.valueOf(AV99Facturacion_abonoscargoswwds_2_tffaccod), Integer.valueOf(AV100Facturacion_abonoscargoswwds_3_tffaccod_to), AV102Facturacion_abonoscargoswwds_5_tffacfch, Integer.valueOf(AV103Facturacion_abonoscargoswwds_6_tfclicod), Integer.valueOf(AV104Facturacion_abonoscargoswwds_7_tfclicod_to), lV105Facturacion_abonoscargoswwds_8_tfclinom, AV106Facturacion_abonoscargoswwds_9_tfclinom_sel, lV116Facturacion_abonoscargoswwds_19_tffaccob, AV117Facturacion_abonoscargoswwds_20_tffaccob_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA3A2 = false ;
         A396EmprCod = P0A3A5_A396EmprCod[0] ;
         A279CliNom = P0A3A5_A279CliNom[0] ;
         A965FacCob = P0A3A5_A965FacCob[0] ;
         A435FacEst = P0A3A5_A435FacEst[0] ;
         A252CliCod = P0A3A5_A252CliCod[0] ;
         A436FacFch = P0A3A5_A436FacFch[0] ;
         A1153FacTipFac = P0A3A5_A1153FacTipFac[0] ;
         A430FacCod = P0A3A5_A430FacCod[0] ;
         A11513FacRecIca = P0A3A5_A11513FacRecIca[0] ;
         A8346FacRecI = P0A3A5_A8346FacRecI[0] ;
         n8346FacRecI = P0A3A5_n8346FacRecI[0] ;
         A7212FacRect = P0A3A5_A7212FacRect[0] ;
         A453FacRECPor = P0A3A5_A453FacRECPor[0] ;
         A443FacIVAPor = P0A3A5_A443FacIVAPor[0] ;
         A14224FacCostFac = P0A3A5_A14224FacCostFac[0] ;
         A14223FacCostKgs = P0A3A5_A14223FacCostKgs[0] ;
         A14222FacCostMts = P0A3A5_A14222FacCostMts[0] ;
         A433FacDtoGen = P0A3A5_A433FacDtoGen[0] ;
         A7209Colombia = P0A3A5_A7209Colombia[0] ;
         n7209Colombia = P0A3A5_n7209Colombia[0] ;
         A14219FacEnergia = P0A3A5_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P0A3A5_A3918FacImpTot1[0] ;
         A440FacImpPP = P0A3A5_A440FacImpPP[0] ;
         n440FacImpPP = P0A3A5_n440FacImpPP[0] ;
         A7209Colombia = P0A3A5_A7209Colombia[0] ;
         n7209Colombia = P0A3A5_n7209Colombia[0] ;
         A279CliNom = P0A3A5_A279CliNom[0] ;
         A3918FacImpTot1 = P0A3A5_A3918FacImpTot1[0] ;
         A440FacImpPP = P0A3A5_A440FacImpPP[0] ;
         n440FacImpPP = P0A3A5_n440FacImpPP[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Facturacion_abonoscargoswwds_12_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV109Facturacion_abonoscargoswwds_12_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Facturacion_abonoscargoswwds_14_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV111Facturacion_abonoscargoswwds_14_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (GXutil.strcmp("", AV98Facturacion_abonoscargoswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1153FacTipFac, 1, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV98Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Facturacion_abonoscargoswwds_16_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV113Facturacion_abonoscargoswwds_16_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Facturacion_abonoscargoswwds_17_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV114Facturacion_abonoscargoswwds_17_tffactot_to) <= 0 ) ) )
                           {
                              AV66count = 0 ;
                              while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A3A5_A279CliNom[0], A279CliNom) == 0 ) )
                              {
                                 brkA3A2 = false ;
                                 A396EmprCod = P0A3A5_A396EmprCod[0] ;
                                 A252CliCod = P0A3A5_A252CliCod[0] ;
                                 A430FacCod = P0A3A5_A430FacCod[0] ;
                                 AV66count = (long)(AV66count+1) ;
                                 brkA3A2 = true ;
                                 pr_default.readNext(0);
                              }
                              if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                              {
                                 AV61Option = A279CliNom ;
                                 AV62Options.add(AV61Option, 0);
                                 AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV62Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkA3A2 )
         {
            brkA3A2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFACCOBOPTIONS' Routine */
      returnInSub = false ;
      AV91TFFacCob = AV73SearchTxt ;
      AV92TFFacCob_Sel = "" ;
      AV98Facturacion_abonoscargoswwds_1_filterfulltext = AV78FilterFullText ;
      AV99Facturacion_abonoscargoswwds_2_tffaccod = AV12TFFacCod ;
      AV100Facturacion_abonoscargoswwds_3_tffaccod_to = AV13TFFacCod_To ;
      AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV80TFFacTipFac_Sels ;
      AV102Facturacion_abonoscargoswwds_5_tffacfch = AV16TFFacFch ;
      AV103Facturacion_abonoscargoswwds_6_tfclicod = AV20TFCliCod ;
      AV104Facturacion_abonoscargoswwds_7_tfclicod_to = AV21TFCliCod_To ;
      AV105Facturacion_abonoscargoswwds_8_tfclinom = AV22TFCliNom ;
      AV106Facturacion_abonoscargoswwds_9_tfclinom_sel = AV23TFCliNom_Sel ;
      AV107Facturacion_abonoscargoswwds_10_tffacimppp = AV81TFFacImpPP ;
      AV108Facturacion_abonoscargoswwds_11_tffacimppp_to = AV82TFFacImpPP_To ;
      AV109Facturacion_abonoscargoswwds_12_tffacbasimp = AV83TFFacBasImp ;
      AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV84TFFacBasImp_To ;
      AV111Facturacion_abonoscargoswwds_14_tffacivaimp = AV85TFFacIVAImp ;
      AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV86TFFacIVAImp_To ;
      AV113Facturacion_abonoscargoswwds_16_tffactot = AV87TFFacTot ;
      AV114Facturacion_abonoscargoswwds_17_tffactot_to = AV88TFFacTot_To ;
      AV115Facturacion_abonoscargoswwds_18_tffacest_sels = AV90TFFacEst_Sels ;
      AV116Facturacion_abonoscargoswwds_19_tffaccob = AV91TFFacCob ;
      AV117Facturacion_abonoscargoswwds_20_tffaccob_sel = AV92TFFacCob_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                           Byte.valueOf(A435FacEst) ,
                                           AV115Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                           Integer.valueOf(AV99Facturacion_abonoscargoswwds_2_tffaccod) ,
                                           Integer.valueOf(AV100Facturacion_abonoscargoswwds_3_tffaccod_to) ,
                                           Integer.valueOf(AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels.size()) ,
                                           AV102Facturacion_abonoscargoswwds_5_tffacfch ,
                                           Integer.valueOf(AV103Facturacion_abonoscargoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV104Facturacion_abonoscargoswwds_7_tfclicod_to) ,
                                           AV106Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                           AV105Facturacion_abonoscargoswwds_8_tfclinom ,
                                           Integer.valueOf(AV115Facturacion_abonoscargoswwds_18_tffacest_sels.size()) ,
                                           AV117Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                           AV116Facturacion_abonoscargoswwds_19_tffaccob ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A965FacCob ,
                                           AV98Facturacion_abonoscargoswwds_1_filterfulltext ,
                                           A440FacImpPP ,
                                           A429FacBasImp ,
                                           A442FacIVAImp ,
                                           A455FacTot ,
                                           AV107Facturacion_abonoscargoswwds_10_tffacimppp ,
                                           AV108Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                           AV109Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                           AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                           AV111Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                           AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                           AV113Facturacion_abonoscargoswwds_16_tffactot ,
                                           AV114Facturacion_abonoscargoswwds_17_tffactot_to } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV105Facturacion_abonoscargoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV105Facturacion_abonoscargoswwds_8_tfclinom), 30, "%") ;
      lV116Facturacion_abonoscargoswwds_19_tffaccob = GXutil.padr( GXutil.rtrim( AV116Facturacion_abonoscargoswwds_19_tffaccob), 1, "%") ;
      /* Using cursor P0A3A9 */
      pr_default.execute(1, new Object[] {AV107Facturacion_abonoscargoswwds_10_tffacimppp, AV107Facturacion_abonoscargoswwds_10_tffacimppp, AV108Facturacion_abonoscargoswwds_11_tffacimppp_to, AV108Facturacion_abonoscargoswwds_11_tffacimppp_to, Integer.valueOf(AV99Facturacion_abonoscargoswwds_2_tffaccod), Integer.valueOf(AV100Facturacion_abonoscargoswwds_3_tffaccod_to), AV102Facturacion_abonoscargoswwds_5_tffacfch, Integer.valueOf(AV103Facturacion_abonoscargoswwds_6_tfclicod), Integer.valueOf(AV104Facturacion_abonoscargoswwds_7_tfclicod_to), lV105Facturacion_abonoscargoswwds_8_tfclinom, AV106Facturacion_abonoscargoswwds_9_tfclinom_sel, lV116Facturacion_abonoscargoswwds_19_tffaccob, AV117Facturacion_abonoscargoswwds_20_tffaccob_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA3A4 = false ;
         A396EmprCod = P0A3A9_A396EmprCod[0] ;
         A965FacCob = P0A3A9_A965FacCob[0] ;
         A435FacEst = P0A3A9_A435FacEst[0] ;
         A279CliNom = P0A3A9_A279CliNom[0] ;
         A252CliCod = P0A3A9_A252CliCod[0] ;
         A436FacFch = P0A3A9_A436FacFch[0] ;
         A1153FacTipFac = P0A3A9_A1153FacTipFac[0] ;
         A430FacCod = P0A3A9_A430FacCod[0] ;
         A11513FacRecIca = P0A3A9_A11513FacRecIca[0] ;
         A8346FacRecI = P0A3A9_A8346FacRecI[0] ;
         n8346FacRecI = P0A3A9_n8346FacRecI[0] ;
         A7212FacRect = P0A3A9_A7212FacRect[0] ;
         A453FacRECPor = P0A3A9_A453FacRECPor[0] ;
         A443FacIVAPor = P0A3A9_A443FacIVAPor[0] ;
         A14224FacCostFac = P0A3A9_A14224FacCostFac[0] ;
         A14223FacCostKgs = P0A3A9_A14223FacCostKgs[0] ;
         A14222FacCostMts = P0A3A9_A14222FacCostMts[0] ;
         A433FacDtoGen = P0A3A9_A433FacDtoGen[0] ;
         A7209Colombia = P0A3A9_A7209Colombia[0] ;
         n7209Colombia = P0A3A9_n7209Colombia[0] ;
         A14219FacEnergia = P0A3A9_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P0A3A9_A3918FacImpTot1[0] ;
         A440FacImpPP = P0A3A9_A440FacImpPP[0] ;
         n440FacImpPP = P0A3A9_n440FacImpPP[0] ;
         A7209Colombia = P0A3A9_A7209Colombia[0] ;
         n7209Colombia = P0A3A9_n7209Colombia[0] ;
         A279CliNom = P0A3A9_A279CliNom[0] ;
         A3918FacImpTot1 = P0A3A9_A3918FacImpTot1[0] ;
         A440FacImpPP = P0A3A9_A440FacImpPP[0] ;
         n440FacImpPP = P0A3A9_n440FacImpPP[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Facturacion_abonoscargoswwds_12_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV109Facturacion_abonoscargoswwds_12_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Facturacion_abonoscargoswwds_14_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV111Facturacion_abonoscargoswwds_14_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (GXutil.strcmp("", AV98Facturacion_abonoscargoswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1153FacTipFac, 1, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV98Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV98Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Facturacion_abonoscargoswwds_16_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV113Facturacion_abonoscargoswwds_16_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Facturacion_abonoscargoswwds_17_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV114Facturacion_abonoscargoswwds_17_tffactot_to) <= 0 ) ) )
                           {
                              AV66count = 0 ;
                              while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A3A9_A965FacCob[0], A965FacCob) == 0 ) )
                              {
                                 brkA3A4 = false ;
                                 A396EmprCod = P0A3A9_A396EmprCod[0] ;
                                 A430FacCod = P0A3A9_A430FacCod[0] ;
                                 AV66count = (long)(AV66count+1) ;
                                 brkA3A4 = true ;
                                 pr_default.readNext(1);
                              }
                              if ( ! (GXutil.strcmp("", A965FacCob)==0) )
                              {
                                 AV61Option = A965FacCob ;
                                 AV62Options.add(AV61Option, 0);
                                 AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV62Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkA3A4 )
         {
            brkA3A4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = abonoscargoswwgetfilterdata.this.AV75OptionsJson;
      this.aP4[0] = abonoscargoswwgetfilterdata.this.AV76OptionsDescJson;
      this.aP5[0] = abonoscargoswwgetfilterdata.this.AV77OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV75OptionsJson = "" ;
      AV76OptionsDescJson = "" ;
      AV77OptionIndexesJson = "" ;
      AV62Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV78FilterFullText = "" ;
      AV79TFFacTipFac_SelsJson = "" ;
      AV80TFFacTipFac_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV16TFFacFch = GXutil.nullDate() ;
      AV22TFCliNom = "" ;
      AV23TFCliNom_Sel = "" ;
      AV81TFFacImpPP = DecimalUtil.ZERO ;
      AV82TFFacImpPP_To = DecimalUtil.ZERO ;
      AV83TFFacBasImp = DecimalUtil.ZERO ;
      AV84TFFacBasImp_To = DecimalUtil.ZERO ;
      AV85TFFacIVAImp = DecimalUtil.ZERO ;
      AV86TFFacIVAImp_To = DecimalUtil.ZERO ;
      AV87TFFacTot = DecimalUtil.ZERO ;
      AV88TFFacTot_To = DecimalUtil.ZERO ;
      AV89TFFacEst_SelsJson = "" ;
      AV90TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV91TFFacCob = "" ;
      AV92TFFacCob_Sel = "" ;
      A279CliNom = "" ;
      AV98Facturacion_abonoscargoswwds_1_filterfulltext = "" ;
      AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV102Facturacion_abonoscargoswwds_5_tffacfch = GXutil.nullDate() ;
      AV105Facturacion_abonoscargoswwds_8_tfclinom = "" ;
      AV106Facturacion_abonoscargoswwds_9_tfclinom_sel = "" ;
      AV107Facturacion_abonoscargoswwds_10_tffacimppp = DecimalUtil.ZERO ;
      AV108Facturacion_abonoscargoswwds_11_tffacimppp_to = DecimalUtil.ZERO ;
      AV109Facturacion_abonoscargoswwds_12_tffacbasimp = DecimalUtil.ZERO ;
      AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to = DecimalUtil.ZERO ;
      AV111Facturacion_abonoscargoswwds_14_tffacivaimp = DecimalUtil.ZERO ;
      AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to = DecimalUtil.ZERO ;
      AV113Facturacion_abonoscargoswwds_16_tffactot = DecimalUtil.ZERO ;
      AV114Facturacion_abonoscargoswwds_17_tffactot_to = DecimalUtil.ZERO ;
      AV115Facturacion_abonoscargoswwds_18_tffacest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV116Facturacion_abonoscargoswwds_19_tffaccob = "" ;
      AV117Facturacion_abonoscargoswwds_20_tffaccob_sel = "" ;
      lV98Facturacion_abonoscargoswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV105Facturacion_abonoscargoswwds_8_tfclinom = "" ;
      lV116Facturacion_abonoscargoswwds_19_tffaccob = "" ;
      A436FacFch = GXutil.nullDate() ;
      A965FacCob = "" ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      P0A3A5_A396EmprCod = new String[] {""} ;
      P0A3A5_A279CliNom = new String[] {""} ;
      P0A3A5_A965FacCob = new String[] {""} ;
      P0A3A5_A435FacEst = new byte[1] ;
      P0A3A5_A252CliCod = new int[1] ;
      P0A3A5_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3A5_A1153FacTipFac = new byte[1] ;
      P0A3A5_A430FacCod = new int[1] ;
      P0A3A5_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_n8346FacRecI = new boolean[] {false} ;
      P0A3A5_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A443FacIVAPor = new byte[1] ;
      P0A3A5_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A7209Colombia = new byte[1] ;
      P0A3A5_n7209Colombia = new boolean[] {false} ;
      P0A3A5_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A5_n440FacImpPP = new boolean[] {false} ;
      A396EmprCod = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      AV61Option = "" ;
      P0A3A9_A396EmprCod = new String[] {""} ;
      P0A3A9_A965FacCob = new String[] {""} ;
      P0A3A9_A435FacEst = new byte[1] ;
      P0A3A9_A279CliNom = new String[] {""} ;
      P0A3A9_A252CliCod = new int[1] ;
      P0A3A9_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3A9_A1153FacTipFac = new byte[1] ;
      P0A3A9_A430FacCod = new int[1] ;
      P0A3A9_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_n8346FacRecI = new boolean[] {false} ;
      P0A3A9_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A443FacIVAPor = new byte[1] ;
      P0A3A9_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A7209Colombia = new byte[1] ;
      P0A3A9_n7209Colombia = new boolean[] {false} ;
      P0A3A9_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3A9_n440FacImpPP = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargoswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A3A5_A396EmprCod, P0A3A5_A279CliNom, P0A3A5_A965FacCob, P0A3A5_A435FacEst, P0A3A5_A252CliCod, P0A3A5_A436FacFch, P0A3A5_A1153FacTipFac, P0A3A5_A430FacCod, P0A3A5_A11513FacRecIca, P0A3A5_A8346FacRecI,
            P0A3A5_n8346FacRecI, P0A3A5_A7212FacRect, P0A3A5_A453FacRECPor, P0A3A5_A443FacIVAPor, P0A3A5_A14224FacCostFac, P0A3A5_A14223FacCostKgs, P0A3A5_A14222FacCostMts, P0A3A5_A433FacDtoGen, P0A3A5_A7209Colombia, P0A3A5_n7209Colombia,
            P0A3A5_A14219FacEnergia, P0A3A5_A3918FacImpTot1, P0A3A5_A440FacImpPP, P0A3A5_n440FacImpPP
            }
            , new Object[] {
            P0A3A9_A396EmprCod, P0A3A9_A965FacCob, P0A3A9_A435FacEst, P0A3A9_A279CliNom, P0A3A9_A252CliCod, P0A3A9_A436FacFch, P0A3A9_A1153FacTipFac, P0A3A9_A430FacCod, P0A3A9_A11513FacRecIca, P0A3A9_A8346FacRecI,
            P0A3A9_n8346FacRecI, P0A3A9_A7212FacRect, P0A3A9_A453FacRECPor, P0A3A9_A443FacIVAPor, P0A3A9_A14224FacCostFac, P0A3A9_A14223FacCostKgs, P0A3A9_A14222FacCostMts, P0A3A9_A433FacDtoGen, P0A3A9_A7209Colombia, P0A3A9_n7209Colombia,
            P0A3A9_A14219FacEnergia, P0A3A9_A3918FacImpTot1, P0A3A9_A440FacImpPP, P0A3A9_n440FacImpPP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short Gx_err ;
   private int AV96GXV1 ;
   private int AV12TFFacCod ;
   private int AV13TFFacCod_To ;
   private int AV20TFCliCod ;
   private int AV21TFCliCod_To ;
   private int AV99Facturacion_abonoscargoswwds_2_tffaccod ;
   private int AV100Facturacion_abonoscargoswwds_3_tffaccod_to ;
   private int AV103Facturacion_abonoscargoswwds_6_tfclicod ;
   private int AV104Facturacion_abonoscargoswwds_7_tfclicod_to ;
   private int AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ;
   private int AV115Facturacion_abonoscargoswwds_18_tffacest_sels_size ;
   private int A430FacCod ;
   private int A252CliCod ;
   private long AV66count ;
   private java.math.BigDecimal AV81TFFacImpPP ;
   private java.math.BigDecimal AV82TFFacImpPP_To ;
   private java.math.BigDecimal AV83TFFacBasImp ;
   private java.math.BigDecimal AV84TFFacBasImp_To ;
   private java.math.BigDecimal AV85TFFacIVAImp ;
   private java.math.BigDecimal AV86TFFacIVAImp_To ;
   private java.math.BigDecimal AV87TFFacTot ;
   private java.math.BigDecimal AV88TFFacTot_To ;
   private java.math.BigDecimal AV107Facturacion_abonoscargoswwds_10_tffacimppp ;
   private java.math.BigDecimal AV108Facturacion_abonoscargoswwds_11_tffacimppp_to ;
   private java.math.BigDecimal AV109Facturacion_abonoscargoswwds_12_tffacbasimp ;
   private java.math.BigDecimal AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to ;
   private java.math.BigDecimal AV111Facturacion_abonoscargoswwds_14_tffacivaimp ;
   private java.math.BigDecimal AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to ;
   private java.math.BigDecimal AV113Facturacion_abonoscargoswwds_16_tffactot ;
   private java.math.BigDecimal AV114Facturacion_abonoscargoswwds_17_tffactot_to ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private String AV22TFCliNom ;
   private String AV23TFCliNom_Sel ;
   private String AV91TFFacCob ;
   private String AV92TFFacCob_Sel ;
   private String A279CliNom ;
   private String AV105Facturacion_abonoscargoswwds_8_tfclinom ;
   private String AV106Facturacion_abonoscargoswwds_9_tfclinom_sel ;
   private String AV116Facturacion_abonoscargoswwds_19_tffaccob ;
   private String AV117Facturacion_abonoscargoswwds_20_tffaccob_sel ;
   private String scmdbuf ;
   private String lV105Facturacion_abonoscargoswwds_8_tfclinom ;
   private String lV116Facturacion_abonoscargoswwds_19_tffaccob ;
   private String A965FacCob ;
   private String A396EmprCod ;
   private java.util.Date AV16TFFacFch ;
   private java.util.Date AV102Facturacion_abonoscargoswwds_5_tffacfch ;
   private java.util.Date A436FacFch ;
   private boolean returnInSub ;
   private boolean brkA3A2 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n440FacImpPP ;
   private boolean brkA3A4 ;
   private String AV75OptionsJson ;
   private String AV76OptionsDescJson ;
   private String AV77OptionIndexesJson ;
   private String AV79TFFacTipFac_SelsJson ;
   private String AV89TFFacEst_SelsJson ;
   private String AV72DDOName ;
   private String AV73SearchTxt ;
   private String AV74SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV98Facturacion_abonoscargoswwds_1_filterfulltext ;
   private String lV98Facturacion_abonoscargoswwds_1_filterfulltext ;
   private String AV61Option ;
   private GXSimpleCollection<Byte> AV80TFFacTipFac_Sels ;
   private GXSimpleCollection<Byte> AV90TFFacEst_Sels ;
   private GXSimpleCollection<Byte> AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels ;
   private GXSimpleCollection<Byte> AV115Facturacion_abonoscargoswwds_18_tffacest_sels ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3A5_A396EmprCod ;
   private String[] P0A3A5_A279CliNom ;
   private String[] P0A3A5_A965FacCob ;
   private byte[] P0A3A5_A435FacEst ;
   private int[] P0A3A5_A252CliCod ;
   private java.util.Date[] P0A3A5_A436FacFch ;
   private byte[] P0A3A5_A1153FacTipFac ;
   private int[] P0A3A5_A430FacCod ;
   private java.math.BigDecimal[] P0A3A5_A11513FacRecIca ;
   private java.math.BigDecimal[] P0A3A5_A8346FacRecI ;
   private boolean[] P0A3A5_n8346FacRecI ;
   private java.math.BigDecimal[] P0A3A5_A7212FacRect ;
   private java.math.BigDecimal[] P0A3A5_A453FacRECPor ;
   private byte[] P0A3A5_A443FacIVAPor ;
   private java.math.BigDecimal[] P0A3A5_A14224FacCostFac ;
   private java.math.BigDecimal[] P0A3A5_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0A3A5_A14222FacCostMts ;
   private java.math.BigDecimal[] P0A3A5_A433FacDtoGen ;
   private byte[] P0A3A5_A7209Colombia ;
   private boolean[] P0A3A5_n7209Colombia ;
   private java.math.BigDecimal[] P0A3A5_A14219FacEnergia ;
   private java.math.BigDecimal[] P0A3A5_A3918FacImpTot1 ;
   private java.math.BigDecimal[] P0A3A5_A440FacImpPP ;
   private boolean[] P0A3A5_n440FacImpPP ;
   private String[] P0A3A9_A396EmprCod ;
   private String[] P0A3A9_A965FacCob ;
   private byte[] P0A3A9_A435FacEst ;
   private String[] P0A3A9_A279CliNom ;
   private int[] P0A3A9_A252CliCod ;
   private java.util.Date[] P0A3A9_A436FacFch ;
   private byte[] P0A3A9_A1153FacTipFac ;
   private int[] P0A3A9_A430FacCod ;
   private java.math.BigDecimal[] P0A3A9_A11513FacRecIca ;
   private java.math.BigDecimal[] P0A3A9_A8346FacRecI ;
   private boolean[] P0A3A9_n8346FacRecI ;
   private java.math.BigDecimal[] P0A3A9_A7212FacRect ;
   private java.math.BigDecimal[] P0A3A9_A453FacRECPor ;
   private byte[] P0A3A9_A443FacIVAPor ;
   private java.math.BigDecimal[] P0A3A9_A14224FacCostFac ;
   private java.math.BigDecimal[] P0A3A9_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0A3A9_A14222FacCostMts ;
   private java.math.BigDecimal[] P0A3A9_A433FacDtoGen ;
   private byte[] P0A3A9_A7209Colombia ;
   private boolean[] P0A3A9_n7209Colombia ;
   private java.math.BigDecimal[] P0A3A9_A14219FacEnergia ;
   private java.math.BigDecimal[] P0A3A9_A3918FacImpTot1 ;
   private java.math.BigDecimal[] P0A3A9_A440FacImpPP ;
   private boolean[] P0A3A9_n440FacImpPP ;
   private GXSimpleCollection<String> AV62Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV65OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class abonoscargoswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A3A5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A1153FacTipFac ,
                                          GXSimpleCollection<Byte> AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV115Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                          int AV99Facturacion_abonoscargoswwds_2_tffaccod ,
                                          int AV100Facturacion_abonoscargoswwds_3_tffaccod_to ,
                                          int AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ,
                                          java.util.Date AV102Facturacion_abonoscargoswwds_5_tffacfch ,
                                          int AV103Facturacion_abonoscargoswwds_6_tfclicod ,
                                          int AV104Facturacion_abonoscargoswwds_7_tfclicod_to ,
                                          String AV106Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                          String AV105Facturacion_abonoscargoswwds_8_tfclinom ,
                                          int AV115Facturacion_abonoscargoswwds_18_tffacest_sels_size ,
                                          String AV117Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                          String AV116Facturacion_abonoscargoswwds_19_tffaccob ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A965FacCob ,
                                          String AV98Facturacion_abonoscargoswwds_1_filterfulltext ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV107Facturacion_abonoscargoswwds_10_tffacimppp ,
                                          java.math.BigDecimal AV108Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                          java.math.BigDecimal AV109Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                          java.math.BigDecimal AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                          java.math.BigDecimal AV111Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                          java.math.BigDecimal AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                          java.math.BigDecimal AV113Facturacion_abonoscargoswwds_16_tffactot ,
                                          java.math.BigDecimal AV114Facturacion_abonoscargoswwds_17_tffactot_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.FacCob, T1.FacEst, T1.CliCod, T1.FacFch, T1.FacTipFac, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor," ;
      scmdbuf += " T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1, COALESCE( T5.FacImpPP, 0) AS FacImpPP" ;
      scmdbuf += " FROM ((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      scmdbuf += " (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA *" ;
      scmdbuf += " CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs =" ;
      scmdbuf += " 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and" ;
      scmdbuf += " (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T7.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T8.FacImpTot1, 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T7.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T8.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T6.EmprCod, T6.FacCod FROM ((TXPCFAVEN T6 INNER JOIN TXPEMPRES T7 ON T7.EmprCod" ;
      scmdbuf += " = T6.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T8 ON T8.EmprCod = T6.EmprCod AND T8.FacCod = T6.FacCod) ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac >= 1)");
      addWhere(sWhereString, "(T1.FacTipFac <= 2)");
      if ( ! (0==AV99Facturacion_abonoscargoswwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV100Facturacion_abonoscargoswwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels, "T1.FacTipFac IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102Facturacion_abonoscargoswwds_5_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV103Facturacion_abonoscargoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV104Facturacion_abonoscargoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Facturacion_abonoscargoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( AV115Facturacion_abonoscargoswwds_18_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Facturacion_abonoscargoswwds_18_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV117Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV116Facturacion_abonoscargoswwds_19_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A3A9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A1153FacTipFac ,
                                          GXSimpleCollection<Byte> AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV115Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                          int AV99Facturacion_abonoscargoswwds_2_tffaccod ,
                                          int AV100Facturacion_abonoscargoswwds_3_tffaccod_to ,
                                          int AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ,
                                          java.util.Date AV102Facturacion_abonoscargoswwds_5_tffacfch ,
                                          int AV103Facturacion_abonoscargoswwds_6_tfclicod ,
                                          int AV104Facturacion_abonoscargoswwds_7_tfclicod_to ,
                                          String AV106Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                          String AV105Facturacion_abonoscargoswwds_8_tfclinom ,
                                          int AV115Facturacion_abonoscargoswwds_18_tffacest_sels_size ,
                                          String AV117Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                          String AV116Facturacion_abonoscargoswwds_19_tffaccob ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A965FacCob ,
                                          String AV98Facturacion_abonoscargoswwds_1_filterfulltext ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV107Facturacion_abonoscargoswwds_10_tffacimppp ,
                                          java.math.BigDecimal AV108Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                          java.math.BigDecimal AV109Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                          java.math.BigDecimal AV110Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                          java.math.BigDecimal AV111Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                          java.math.BigDecimal AV112Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                          java.math.BigDecimal AV113Facturacion_abonoscargoswwds_16_tffactot ,
                                          java.math.BigDecimal AV114Facturacion_abonoscargoswwds_17_tffactot_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[13];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacCob, T1.FacEst, T3.CliNom, T1.CliCod, T1.FacFch, T1.FacTipFac, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor," ;
      scmdbuf += " T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1, COALESCE( T5.FacImpPP, 0) AS FacImpPP" ;
      scmdbuf += " FROM ((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      scmdbuf += " (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA *" ;
      scmdbuf += " CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs =" ;
      scmdbuf += " 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and" ;
      scmdbuf += " (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T7.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T8.FacImpTot1, 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T7.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T8.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T6.EmprCod, T6.FacCod FROM ((TXPCFAVEN T6 INNER JOIN TXPEMPRES T7 ON T7.EmprCod" ;
      scmdbuf += " = T6.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T8 ON T8.EmprCod = T6.EmprCod AND T8.FacCod = T6.FacCod) ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac >= 1)");
      addWhere(sWhereString, "(T1.FacTipFac <= 2)");
      if ( ! (0==AV99Facturacion_abonoscargoswwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV100Facturacion_abonoscargoswwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Facturacion_abonoscargoswwds_4_tffactipfac_sels, "T1.FacTipFac IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102Facturacion_abonoscargoswwds_5_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV103Facturacion_abonoscargoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV104Facturacion_abonoscargoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Facturacion_abonoscargoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( AV115Facturacion_abonoscargoswwds_18_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Facturacion_abonoscargoswwds_18_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV117Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV116Facturacion_abonoscargoswwds_19_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FacCob" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P0A3A5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] );
            case 1 :
                  return conditional_P0A3A9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3A5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3A9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
      }
   }

}

