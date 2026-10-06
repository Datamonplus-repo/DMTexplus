package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbdet2wwgetfilterdata extends GXProcedure
{
   public talbdet2wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet2wwgetfilterdata.class ), "" );
   }

   public talbdet2wwgetfilterdata( int remoteHandle ,
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
      talbdet2wwgetfilterdata.this.aP5 = new String[] {""};
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
      talbdet2wwgetfilterdata.this.AV58DDOName = aP0;
      talbdet2wwgetfilterdata.this.AV56SearchTxt = aP1;
      talbdet2wwgetfilterdata.this.AV57SearchTxtTo = aP2;
      talbdet2wwgetfilterdata.this.aP3 = aP3;
      talbdet2wwgetfilterdata.this.aP4 = aP4;
      talbdet2wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBRENT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRENTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBRENT2") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRENT2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_PROCENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCENOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_TIPENTNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPENTNOMOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBRDES") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRDESOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBRLOC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRLOCOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV62OptionsJson = AV61Options.toJSonString(false) ;
      AV65OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV67OptionIndexesJson = AV66OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Session.getValue("TALBDET2WWGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDET2WWGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("TALBDET2WWGridState"), null, null);
      }
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV93FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV12TFAlbREnt = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV13TFAlbREnt_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2") == 0 )
         {
            AV14TFAlbREnt2 = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2_SEL") == 0 )
         {
            AV15TFAlbREnt2_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV16TFAlbRFen = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV18TFAlbRHEn = localUtil.ctot( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV20TFCliCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCliCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV22TFCliNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV23TFCliNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV24TFAlbRef = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV25TFAlbRef_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV26TFAlbRefDsc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV27TFAlbRefDsc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV28TFProceCod = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFProceCod_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV30TFProceNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV31TFProceNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV32TFTrnCod = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFTrnCod_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV34TFTrnNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV35TFTrnNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV36TFTipEntCod = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFTipEntCod_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV38TFTipEntNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV39TFTipEntNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV40TFAlbRDes = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV41TFAlbRDes_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV42TFAlbRUniEnt = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFAlbRUniEnt_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV91TFAlbRUni_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV92TFAlbRUni_Sels.fromJSonString(AV91TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV46TFAlbRPieEnt = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFAlbRPieEnt_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV48TFAlbRLoc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV49TFAlbRLoc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV50TFAlbRReo_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFAlbRReo_Sels.fromJSonString(AV50TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV52TFAlbRPieUti = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFAlbRPieUti_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV54TFAlbRUniUti = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFAlbRUniUti_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBRENTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbREnt = AV56SearchTxt ;
      AV13TFAlbREnt_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk86D2 = false ;
         A396EmprCod = P086D2_A396EmprCod[0] ;
         A46AlbREnt = P086D2_A46AlbREnt[0] ;
         A60AlbRUniUti = P086D2_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D2_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D2_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D2_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D2_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D2_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D2_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D2_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D2_n1211TipEntCod[0] ;
         A841TrnNom = P086D2_A841TrnNom[0] ;
         n841TrnNom = P086D2_n841TrnNom[0] ;
         A840TrnCod = P086D2_A840TrnCod[0] ;
         n840TrnCod = P086D2_n840TrnCod[0] ;
         A971ProceNom = P086D2_A971ProceNom[0] ;
         n971ProceNom = P086D2_n971ProceNom[0] ;
         A970ProceCod = P086D2_A970ProceCod[0] ;
         n970ProceCod = P086D2_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D2_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D2_A45AlbRef[0] ;
         A279CliNom = P086D2_A279CliNom[0] ;
         A252CliCod = P086D2_A252CliCod[0] ;
         A4606AlbRHEn = P086D2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D2_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D2_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D2_A5806AlbREnt2[0] ;
         A44AlbRecCod = P086D2_A44AlbRecCod[0] ;
         A55AlbRReo = P086D2_A55AlbRReo[0] ;
         A56AlbRUni = P086D2_A56AlbRUni[0] ;
         A1212TipEntNom = P086D2_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D2_n1212TipEntNom[0] ;
         A841TrnNom = P086D2_A841TrnNom[0] ;
         n841TrnNom = P086D2_n841TrnNom[0] ;
         A971ProceNom = P086D2_A971ProceNom[0] ;
         n971ProceNom = P086D2_n971ProceNom[0] ;
         A279CliNom = P086D2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P086D2_A46AlbREnt[0], A46AlbREnt) == 0 ) )
            {
               brk86D2 = false ;
               A396EmprCod = P086D2_A396EmprCod[0] ;
               A44AlbRecCod = P086D2_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
            {
               AV60Option = A46AlbREnt ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D2 )
         {
            brk86D2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBRENT2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbREnt2 = AV56SearchTxt ;
      AV15TFAlbREnt2_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk86D4 = false ;
         A396EmprCod = P086D3_A396EmprCod[0] ;
         A5806AlbREnt2 = P086D3_A5806AlbREnt2[0] ;
         A60AlbRUniUti = P086D3_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D3_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D3_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D3_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D3_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D3_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D3_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D3_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D3_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D3_n1211TipEntCod[0] ;
         A841TrnNom = P086D3_A841TrnNom[0] ;
         n841TrnNom = P086D3_n841TrnNom[0] ;
         A840TrnCod = P086D3_A840TrnCod[0] ;
         n840TrnCod = P086D3_n840TrnCod[0] ;
         A971ProceNom = P086D3_A971ProceNom[0] ;
         n971ProceNom = P086D3_n971ProceNom[0] ;
         A970ProceCod = P086D3_A970ProceCod[0] ;
         n970ProceCod = P086D3_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D3_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D3_A45AlbRef[0] ;
         A279CliNom = P086D3_A279CliNom[0] ;
         A252CliCod = P086D3_A252CliCod[0] ;
         A4606AlbRHEn = P086D3_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D3_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D3_A49AlbRFen[0] ;
         A46AlbREnt = P086D3_A46AlbREnt[0] ;
         A44AlbRecCod = P086D3_A44AlbRecCod[0] ;
         A55AlbRReo = P086D3_A55AlbRReo[0] ;
         A56AlbRUni = P086D3_A56AlbRUni[0] ;
         A1212TipEntNom = P086D3_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D3_n1212TipEntNom[0] ;
         A841TrnNom = P086D3_A841TrnNom[0] ;
         n841TrnNom = P086D3_n841TrnNom[0] ;
         A971ProceNom = P086D3_A971ProceNom[0] ;
         n971ProceNom = P086D3_n971ProceNom[0] ;
         A279CliNom = P086D3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P086D3_A5806AlbREnt2[0], A5806AlbREnt2) == 0 ) )
            {
               brk86D4 = false ;
               A396EmprCod = P086D3_A396EmprCod[0] ;
               A44AlbRecCod = P086D3_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A5806AlbREnt2)==0) )
            {
               AV60Option = A5806AlbREnt2 ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D4 )
         {
            brk86D4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCliNom = AV56SearchTxt ;
      AV23TFCliNom_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk86D6 = false ;
         A396EmprCod = P086D4_A396EmprCod[0] ;
         A279CliNom = P086D4_A279CliNom[0] ;
         A60AlbRUniUti = P086D4_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D4_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D4_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D4_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D4_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D4_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D4_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D4_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D4_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D4_n1211TipEntCod[0] ;
         A841TrnNom = P086D4_A841TrnNom[0] ;
         n841TrnNom = P086D4_n841TrnNom[0] ;
         A840TrnCod = P086D4_A840TrnCod[0] ;
         n840TrnCod = P086D4_n840TrnCod[0] ;
         A971ProceNom = P086D4_A971ProceNom[0] ;
         n971ProceNom = P086D4_n971ProceNom[0] ;
         A970ProceCod = P086D4_A970ProceCod[0] ;
         n970ProceCod = P086D4_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D4_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D4_A45AlbRef[0] ;
         A252CliCod = P086D4_A252CliCod[0] ;
         A4606AlbRHEn = P086D4_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D4_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D4_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D4_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D4_A46AlbREnt[0] ;
         A44AlbRecCod = P086D4_A44AlbRecCod[0] ;
         A55AlbRReo = P086D4_A55AlbRReo[0] ;
         A56AlbRUni = P086D4_A56AlbRUni[0] ;
         A1212TipEntNom = P086D4_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D4_n1212TipEntNom[0] ;
         A841TrnNom = P086D4_A841TrnNom[0] ;
         n841TrnNom = P086D4_n841TrnNom[0] ;
         A971ProceNom = P086D4_A971ProceNom[0] ;
         n971ProceNom = P086D4_n971ProceNom[0] ;
         A279CliNom = P086D4_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P086D4_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk86D6 = false ;
               A396EmprCod = P086D4_A396EmprCod[0] ;
               A252CliCod = P086D4_A252CliCod[0] ;
               A44AlbRecCod = P086D4_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV60Option = A279CliNom ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D6 )
         {
            brk86D6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbRef = AV56SearchTxt ;
      AV25TFAlbRef_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk86D8 = false ;
         A396EmprCod = P086D5_A396EmprCod[0] ;
         A45AlbRef = P086D5_A45AlbRef[0] ;
         A60AlbRUniUti = P086D5_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D5_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D5_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D5_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D5_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D5_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D5_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D5_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D5_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D5_n1211TipEntCod[0] ;
         A841TrnNom = P086D5_A841TrnNom[0] ;
         n841TrnNom = P086D5_n841TrnNom[0] ;
         A840TrnCod = P086D5_A840TrnCod[0] ;
         n840TrnCod = P086D5_n840TrnCod[0] ;
         A971ProceNom = P086D5_A971ProceNom[0] ;
         n971ProceNom = P086D5_n971ProceNom[0] ;
         A970ProceCod = P086D5_A970ProceCod[0] ;
         n970ProceCod = P086D5_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D5_A3613AlbRefDsc[0] ;
         A279CliNom = P086D5_A279CliNom[0] ;
         A252CliCod = P086D5_A252CliCod[0] ;
         A4606AlbRHEn = P086D5_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D5_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D5_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D5_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D5_A46AlbREnt[0] ;
         A44AlbRecCod = P086D5_A44AlbRecCod[0] ;
         A55AlbRReo = P086D5_A55AlbRReo[0] ;
         A56AlbRUni = P086D5_A56AlbRUni[0] ;
         A1212TipEntNom = P086D5_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D5_n1212TipEntNom[0] ;
         A841TrnNom = P086D5_A841TrnNom[0] ;
         n841TrnNom = P086D5_n841TrnNom[0] ;
         A971ProceNom = P086D5_A971ProceNom[0] ;
         n971ProceNom = P086D5_n971ProceNom[0] ;
         A279CliNom = P086D5_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P086D5_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk86D8 = false ;
               A396EmprCod = P086D5_A396EmprCod[0] ;
               A44AlbRecCod = P086D5_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
            {
               AV60Option = A45AlbRef ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D8 )
         {
            brk86D8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbRefDsc = AV56SearchTxt ;
      AV27TFAlbRefDsc_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk86D10 = false ;
         A396EmprCod = P086D6_A396EmprCod[0] ;
         A3613AlbRefDsc = P086D6_A3613AlbRefDsc[0] ;
         A60AlbRUniUti = P086D6_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D6_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D6_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D6_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D6_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D6_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D6_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D6_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D6_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D6_n1211TipEntCod[0] ;
         A841TrnNom = P086D6_A841TrnNom[0] ;
         n841TrnNom = P086D6_n841TrnNom[0] ;
         A840TrnCod = P086D6_A840TrnCod[0] ;
         n840TrnCod = P086D6_n840TrnCod[0] ;
         A971ProceNom = P086D6_A971ProceNom[0] ;
         n971ProceNom = P086D6_n971ProceNom[0] ;
         A970ProceCod = P086D6_A970ProceCod[0] ;
         n970ProceCod = P086D6_n970ProceCod[0] ;
         A45AlbRef = P086D6_A45AlbRef[0] ;
         A279CliNom = P086D6_A279CliNom[0] ;
         A252CliCod = P086D6_A252CliCod[0] ;
         A4606AlbRHEn = P086D6_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D6_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D6_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D6_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D6_A46AlbREnt[0] ;
         A44AlbRecCod = P086D6_A44AlbRecCod[0] ;
         A55AlbRReo = P086D6_A55AlbRReo[0] ;
         A56AlbRUni = P086D6_A56AlbRUni[0] ;
         A1212TipEntNom = P086D6_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D6_n1212TipEntNom[0] ;
         A841TrnNom = P086D6_A841TrnNom[0] ;
         n841TrnNom = P086D6_n841TrnNom[0] ;
         A971ProceNom = P086D6_A971ProceNom[0] ;
         n971ProceNom = P086D6_n971ProceNom[0] ;
         A279CliNom = P086D6_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P086D6_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
            {
               brk86D10 = false ;
               A396EmprCod = P086D6_A396EmprCod[0] ;
               A44AlbRecCod = P086D6_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
            {
               AV60Option = A3613AlbRefDsc ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D10 )
         {
            brk86D10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPROCENOMOPTIONS' Routine */
      returnInSub = false ;
      AV30TFProceNom = AV56SearchTxt ;
      AV31TFProceNom_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk86D12 = false ;
         A970ProceCod = P086D7_A970ProceCod[0] ;
         n970ProceCod = P086D7_n970ProceCod[0] ;
         A396EmprCod = P086D7_A396EmprCod[0] ;
         A60AlbRUniUti = P086D7_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D7_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D7_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D7_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D7_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D7_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D7_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D7_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D7_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D7_n1211TipEntCod[0] ;
         A841TrnNom = P086D7_A841TrnNom[0] ;
         n841TrnNom = P086D7_n841TrnNom[0] ;
         A840TrnCod = P086D7_A840TrnCod[0] ;
         n840TrnCod = P086D7_n840TrnCod[0] ;
         A971ProceNom = P086D7_A971ProceNom[0] ;
         n971ProceNom = P086D7_n971ProceNom[0] ;
         A3613AlbRefDsc = P086D7_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D7_A45AlbRef[0] ;
         A279CliNom = P086D7_A279CliNom[0] ;
         A252CliCod = P086D7_A252CliCod[0] ;
         A4606AlbRHEn = P086D7_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D7_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D7_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D7_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D7_A46AlbREnt[0] ;
         A44AlbRecCod = P086D7_A44AlbRecCod[0] ;
         A55AlbRReo = P086D7_A55AlbRReo[0] ;
         A56AlbRUni = P086D7_A56AlbRUni[0] ;
         A971ProceNom = P086D7_A971ProceNom[0] ;
         n971ProceNom = P086D7_n971ProceNom[0] ;
         A1212TipEntNom = P086D7_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D7_n1212TipEntNom[0] ;
         A841TrnNom = P086D7_A841TrnNom[0] ;
         n841TrnNom = P086D7_n841TrnNom[0] ;
         A279CliNom = P086D7_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P086D7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086D7_A970ProceCod[0] == A970ProceCod ) )
            {
               brk86D12 = false ;
               A44AlbRecCod = P086D7_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A971ProceNom)==0) )
            {
               AV60Option = A971ProceNom ;
               AV59InsertIndex = 1 ;
               while ( ( AV59InsertIndex <= AV61Options.size() ) && ( GXutil.strcmp((String)AV61Options.elementAt(-1+AV59InsertIndex), AV60Option) < 0 ) )
               {
                  AV59InsertIndex = (int)(AV59InsertIndex+1) ;
               }
               AV61Options.add(AV60Option, AV59InsertIndex);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), AV59InsertIndex);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D12 )
         {
            brk86D12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV34TFTrnNom = AV56SearchTxt ;
      AV35TFTrnNom_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk86D14 = false ;
         A840TrnCod = P086D8_A840TrnCod[0] ;
         n840TrnCod = P086D8_n840TrnCod[0] ;
         A396EmprCod = P086D8_A396EmprCod[0] ;
         A60AlbRUniUti = P086D8_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D8_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D8_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D8_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D8_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D8_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D8_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D8_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D8_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D8_n1211TipEntCod[0] ;
         A841TrnNom = P086D8_A841TrnNom[0] ;
         n841TrnNom = P086D8_n841TrnNom[0] ;
         A971ProceNom = P086D8_A971ProceNom[0] ;
         n971ProceNom = P086D8_n971ProceNom[0] ;
         A970ProceCod = P086D8_A970ProceCod[0] ;
         n970ProceCod = P086D8_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D8_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D8_A45AlbRef[0] ;
         A279CliNom = P086D8_A279CliNom[0] ;
         A252CliCod = P086D8_A252CliCod[0] ;
         A4606AlbRHEn = P086D8_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D8_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D8_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D8_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D8_A46AlbREnt[0] ;
         A44AlbRecCod = P086D8_A44AlbRecCod[0] ;
         A55AlbRReo = P086D8_A55AlbRReo[0] ;
         A56AlbRUni = P086D8_A56AlbRUni[0] ;
         A841TrnNom = P086D8_A841TrnNom[0] ;
         n841TrnNom = P086D8_n841TrnNom[0] ;
         A1212TipEntNom = P086D8_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D8_n1212TipEntNom[0] ;
         A971ProceNom = P086D8_A971ProceNom[0] ;
         n971ProceNom = P086D8_n971ProceNom[0] ;
         A279CliNom = P086D8_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P086D8_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086D8_A840TrnCod[0] == A840TrnCod ) )
            {
               brk86D14 = false ;
               A44AlbRecCod = P086D8_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
            {
               AV60Option = A841TrnNom ;
               AV59InsertIndex = 1 ;
               while ( ( AV59InsertIndex <= AV61Options.size() ) && ( GXutil.strcmp((String)AV61Options.elementAt(-1+AV59InsertIndex), AV60Option) < 0 ) )
               {
                  AV59InsertIndex = (int)(AV59InsertIndex+1) ;
               }
               AV61Options.add(AV60Option, AV59InsertIndex);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), AV59InsertIndex);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D14 )
         {
            brk86D14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADTIPENTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV38TFTipEntNom = AV56SearchTxt ;
      AV39TFTipEntNom_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk86D16 = false ;
         A1211TipEntCod = P086D9_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D9_n1211TipEntCod[0] ;
         A396EmprCod = P086D9_A396EmprCod[0] ;
         A60AlbRUniUti = P086D9_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D9_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D9_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D9_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D9_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D9_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D9_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D9_n1212TipEntNom[0] ;
         A841TrnNom = P086D9_A841TrnNom[0] ;
         n841TrnNom = P086D9_n841TrnNom[0] ;
         A840TrnCod = P086D9_A840TrnCod[0] ;
         n840TrnCod = P086D9_n840TrnCod[0] ;
         A971ProceNom = P086D9_A971ProceNom[0] ;
         n971ProceNom = P086D9_n971ProceNom[0] ;
         A970ProceCod = P086D9_A970ProceCod[0] ;
         n970ProceCod = P086D9_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D9_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D9_A45AlbRef[0] ;
         A279CliNom = P086D9_A279CliNom[0] ;
         A252CliCod = P086D9_A252CliCod[0] ;
         A4606AlbRHEn = P086D9_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D9_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D9_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D9_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D9_A46AlbREnt[0] ;
         A44AlbRecCod = P086D9_A44AlbRecCod[0] ;
         A55AlbRReo = P086D9_A55AlbRReo[0] ;
         A56AlbRUni = P086D9_A56AlbRUni[0] ;
         A1212TipEntNom = P086D9_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D9_n1212TipEntNom[0] ;
         A841TrnNom = P086D9_A841TrnNom[0] ;
         n841TrnNom = P086D9_n841TrnNom[0] ;
         A971ProceNom = P086D9_A971ProceNom[0] ;
         n971ProceNom = P086D9_n971ProceNom[0] ;
         A279CliNom = P086D9_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P086D9_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086D9_A1211TipEntCod[0] == A1211TipEntCod ) )
            {
               brk86D16 = false ;
               A44AlbRecCod = P086D9_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D16 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A1212TipEntNom)==0) )
            {
               AV60Option = A1212TipEntNom ;
               AV59InsertIndex = 1 ;
               while ( ( AV59InsertIndex <= AV61Options.size() ) && ( GXutil.strcmp((String)AV61Options.elementAt(-1+AV59InsertIndex), AV60Option) < 0 ) )
               {
                  AV59InsertIndex = (int)(AV59InsertIndex+1) ;
               }
               AV61Options.add(AV60Option, AV59InsertIndex);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), AV59InsertIndex);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D16 )
         {
            brk86D16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADALBRDESOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbRDes = AV56SearchTxt ;
      AV41TFAlbRDes_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk86D18 = false ;
         A396EmprCod = P086D10_A396EmprCod[0] ;
         A1291AlbRDes = P086D10_A1291AlbRDes[0] ;
         A60AlbRUniUti = P086D10_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D10_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086D10_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086D10_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D10_A58AlbRUniEnt[0] ;
         A1212TipEntNom = P086D10_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D10_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D10_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D10_n1211TipEntCod[0] ;
         A841TrnNom = P086D10_A841TrnNom[0] ;
         n841TrnNom = P086D10_n841TrnNom[0] ;
         A840TrnCod = P086D10_A840TrnCod[0] ;
         n840TrnCod = P086D10_n840TrnCod[0] ;
         A971ProceNom = P086D10_A971ProceNom[0] ;
         n971ProceNom = P086D10_n971ProceNom[0] ;
         A970ProceCod = P086D10_A970ProceCod[0] ;
         n970ProceCod = P086D10_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D10_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D10_A45AlbRef[0] ;
         A279CliNom = P086D10_A279CliNom[0] ;
         A252CliCod = P086D10_A252CliCod[0] ;
         A4606AlbRHEn = P086D10_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D10_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D10_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D10_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D10_A46AlbREnt[0] ;
         A44AlbRecCod = P086D10_A44AlbRecCod[0] ;
         A55AlbRReo = P086D10_A55AlbRReo[0] ;
         A56AlbRUni = P086D10_A56AlbRUni[0] ;
         A1212TipEntNom = P086D10_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D10_n1212TipEntNom[0] ;
         A841TrnNom = P086D10_A841TrnNom[0] ;
         n841TrnNom = P086D10_n841TrnNom[0] ;
         A971ProceNom = P086D10_A971ProceNom[0] ;
         n971ProceNom = P086D10_n971ProceNom[0] ;
         A279CliNom = P086D10_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P086D10_A1291AlbRDes[0], A1291AlbRDes) == 0 ) )
            {
               brk86D18 = false ;
               A396EmprCod = P086D10_A396EmprCod[0] ;
               A44AlbRecCod = P086D10_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D18 = true ;
               pr_default.readNext(8);
            }
            if ( ! (GXutil.strcmp("", A1291AlbRDes)==0) )
            {
               AV60Option = A1291AlbRDes ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D18 )
         {
            brk86D18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADALBRLOCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFAlbRLoc = AV56SearchTxt ;
      AV49TFAlbRLoc_Sel = "" ;
      AV98Talbdet2wwds_1_filterfulltext = AV93FilterFullText ;
      AV99Talbdet2wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV100Talbdet2wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV101Talbdet2wwds_4_tfalbrent = AV12TFAlbREnt ;
      AV102Talbdet2wwds_5_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV103Talbdet2wwds_6_tfalbrent2 = AV14TFAlbREnt2 ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV105Talbdet2wwds_8_tfalbrfen = AV16TFAlbRFen ;
      AV106Talbdet2wwds_9_tfalbrhen = AV18TFAlbRHEn ;
      AV107Talbdet2wwds_10_tfclicod = AV20TFCliCod ;
      AV108Talbdet2wwds_11_tfclicod_to = AV21TFCliCod_To ;
      AV109Talbdet2wwds_12_tfclinom = AV22TFCliNom ;
      AV110Talbdet2wwds_13_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet2wwds_14_tfalbref = AV24TFAlbRef ;
      AV112Talbdet2wwds_15_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet2wwds_16_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet2wwds_18_tfprocecod = AV28TFProceCod ;
      AV116Talbdet2wwds_19_tfprocecod_to = AV29TFProceCod_To ;
      AV117Talbdet2wwds_20_tfprocenom = AV30TFProceNom ;
      AV118Talbdet2wwds_21_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV119Talbdet2wwds_22_tftrncod = AV32TFTrnCod ;
      AV120Talbdet2wwds_23_tftrncod_to = AV33TFTrnCod_To ;
      AV121Talbdet2wwds_24_tftrnnom = AV34TFTrnNom ;
      AV122Talbdet2wwds_25_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV123Talbdet2wwds_26_tftipentcod = AV36TFTipEntCod ;
      AV124Talbdet2wwds_27_tftipentcod_to = AV37TFTipEntCod_To ;
      AV125Talbdet2wwds_28_tftipentnom = AV38TFTipEntNom ;
      AV126Talbdet2wwds_29_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV127Talbdet2wwds_30_tfalbrdes = AV40TFAlbRDes ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV129Talbdet2wwds_32_tfalbrunient = AV42TFAlbRUniEnt ;
      AV130Talbdet2wwds_33_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV131Talbdet2wwds_34_tfalbruni_sels = AV92TFAlbRUni_Sels ;
      AV132Talbdet2wwds_35_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV133Talbdet2wwds_36_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV134Talbdet2wwds_37_tfalbrloc = AV48TFAlbRLoc ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV137Talbdet2wwds_40_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV138Talbdet2wwds_41_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV139Talbdet2wwds_42_tfalbruniuti = AV54TFAlbRUniUti ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           AV101Talbdet2wwds_4_tfalbrent ,
                                           AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV103Talbdet2wwds_6_tfalbrent2 ,
                                           AV105Talbdet2wwds_8_tfalbrfen ,
                                           AV106Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV107Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to) ,
                                           AV110Talbdet2wwds_13_tfclinom_sel ,
                                           AV109Talbdet2wwds_12_tfclinom ,
                                           AV112Talbdet2wwds_15_tfalbref_sel ,
                                           AV111Talbdet2wwds_14_tfalbref ,
                                           AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV115Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to) ,
                                           AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           AV117Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV119Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to) ,
                                           AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           AV121Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV123Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to) ,
                                           AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           AV125Talbdet2wwds_28_tftipentnom ,
                                           AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV127Talbdet2wwds_30_tfalbrdes ,
                                           AV129Talbdet2wwds_32_tfalbrunient ,
                                           AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV131Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV134Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV136Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV139Talbdet2wwds_42_tfalbruniuti ,
                                           AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           AV98Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV101Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV101Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV103Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV103Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV109Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV111Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV113Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV117Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV117Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV121Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV121Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV125Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV125Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV127Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV127Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV134Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV134Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086D11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(AV99Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV100Talbdet2wwds_3_tfalbreccod_to), lV101Talbdet2wwds_4_tfalbrent, AV102Talbdet2wwds_5_tfalbrent_sel, lV103Talbdet2wwds_6_tfalbrent2, AV104Talbdet2wwds_7_tfalbrent2_sel, AV105Talbdet2wwds_8_tfalbrfen, AV106Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV107Talbdet2wwds_10_tfclicod), Integer.valueOf(AV108Talbdet2wwds_11_tfclicod_to), lV109Talbdet2wwds_12_tfclinom, AV110Talbdet2wwds_13_tfclinom_sel, lV111Talbdet2wwds_14_tfalbref, AV112Talbdet2wwds_15_tfalbref_sel, lV113Talbdet2wwds_16_tfalbrefdsc, AV114Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV115Talbdet2wwds_18_tfprocecod), Short.valueOf(AV116Talbdet2wwds_19_tfprocecod_to), lV117Talbdet2wwds_20_tfprocenom, AV118Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV119Talbdet2wwds_22_tftrncod), Short.valueOf(AV120Talbdet2wwds_23_tftrncod_to), lV121Talbdet2wwds_24_tftrnnom, AV122Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV123Talbdet2wwds_26_tftipentcod), Short.valueOf(AV124Talbdet2wwds_27_tftipentcod_to), lV125Talbdet2wwds_28_tftipentnom, AV126Talbdet2wwds_29_tftipentnom_sel, lV127Talbdet2wwds_30_tfalbrdes, AV128Talbdet2wwds_31_tfalbrdes_sel, AV129Talbdet2wwds_32_tfalbrunient, AV130Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV132Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV133Talbdet2wwds_36_tfalbrpieent_to), lV134Talbdet2wwds_37_tfalbrloc, AV135Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV137Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV138Talbdet2wwds_41_tfalbrpieuti_to), AV139Talbdet2wwds_42_tfalbruniuti, AV140Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk86D20 = false ;
         A396EmprCod = P086D11_A396EmprCod[0] ;
         A50AlbRLoc = P086D11_A50AlbRLoc[0] ;
         A60AlbRUniUti = P086D11_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086D11_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P086D11_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086D11_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086D11_A1291AlbRDes[0] ;
         A1212TipEntNom = P086D11_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D11_n1212TipEntNom[0] ;
         A1211TipEntCod = P086D11_A1211TipEntCod[0] ;
         n1211TipEntCod = P086D11_n1211TipEntCod[0] ;
         A841TrnNom = P086D11_A841TrnNom[0] ;
         n841TrnNom = P086D11_n841TrnNom[0] ;
         A840TrnCod = P086D11_A840TrnCod[0] ;
         n840TrnCod = P086D11_n840TrnCod[0] ;
         A971ProceNom = P086D11_A971ProceNom[0] ;
         n971ProceNom = P086D11_n971ProceNom[0] ;
         A970ProceCod = P086D11_A970ProceCod[0] ;
         n970ProceCod = P086D11_n970ProceCod[0] ;
         A3613AlbRefDsc = P086D11_A3613AlbRefDsc[0] ;
         A45AlbRef = P086D11_A45AlbRef[0] ;
         A279CliNom = P086D11_A279CliNom[0] ;
         A252CliCod = P086D11_A252CliCod[0] ;
         A4606AlbRHEn = P086D11_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086D11_n4606AlbRHEn[0] ;
         A49AlbRFen = P086D11_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086D11_A5806AlbREnt2[0] ;
         A46AlbREnt = P086D11_A46AlbREnt[0] ;
         A44AlbRecCod = P086D11_A44AlbRecCod[0] ;
         A55AlbRReo = P086D11_A55AlbRReo[0] ;
         A56AlbRUni = P086D11_A56AlbRUni[0] ;
         A1212TipEntNom = P086D11_A1212TipEntNom[0] ;
         n1212TipEntNom = P086D11_n1212TipEntNom[0] ;
         A841TrnNom = P086D11_A841TrnNom[0] ;
         n841TrnNom = P086D11_n841TrnNom[0] ;
         A971ProceNom = P086D11_A971ProceNom[0] ;
         n971ProceNom = P086D11_n971ProceNom[0] ;
         A279CliNom = P086D11_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV98Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV98Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P086D11_A50AlbRLoc[0], A50AlbRLoc) == 0 ) )
            {
               brk86D20 = false ;
               A396EmprCod = P086D11_A396EmprCod[0] ;
               A44AlbRecCod = P086D11_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86D20 = true ;
               pr_default.readNext(9);
            }
            if ( ! (GXutil.strcmp("", A50AlbRLoc)==0) )
            {
               AV60Option = A50AlbRLoc ;
               AV61Options.add(AV60Option, 0);
               AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV61Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86D20 )
         {
            brk86D20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = talbdet2wwgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = talbdet2wwgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = talbdet2wwgetfilterdata.this.AV67OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62OptionsJson = "" ;
      AV65OptionsDescJson = "" ;
      AV67OptionIndexesJson = "" ;
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV69Session = httpContext.getWebSession();
      AV71GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV72GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV93FilterFullText = "" ;
      AV12TFAlbREnt = "" ;
      AV13TFAlbREnt_Sel = "" ;
      AV14TFAlbREnt2 = "" ;
      AV15TFAlbREnt2_Sel = "" ;
      AV16TFAlbRFen = GXutil.nullDate() ;
      AV18TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV22TFCliNom = "" ;
      AV23TFCliNom_Sel = "" ;
      AV24TFAlbRef = "" ;
      AV25TFAlbRef_Sel = "" ;
      AV26TFAlbRefDsc = "" ;
      AV27TFAlbRefDsc_Sel = "" ;
      AV30TFProceNom = "" ;
      AV31TFProceNom_Sel = "" ;
      AV34TFTrnNom = "" ;
      AV35TFTrnNom_Sel = "" ;
      AV38TFTipEntNom = "" ;
      AV39TFTipEntNom_Sel = "" ;
      AV40TFAlbRDes = "" ;
      AV41TFAlbRDes_Sel = "" ;
      AV42TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV43TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV91TFAlbRUni_SelsJson = "" ;
      AV92TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFAlbRLoc = "" ;
      AV49TFAlbRLoc_Sel = "" ;
      AV50TFAlbRReo_SelsJson = "" ;
      AV51TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFAlbRUniUti = DecimalUtil.ZERO ;
      AV55TFAlbRUniUti_To = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      AV98Talbdet2wwds_1_filterfulltext = "" ;
      AV101Talbdet2wwds_4_tfalbrent = "" ;
      AV102Talbdet2wwds_5_tfalbrent_sel = "" ;
      AV103Talbdet2wwds_6_tfalbrent2 = "" ;
      AV104Talbdet2wwds_7_tfalbrent2_sel = "" ;
      AV105Talbdet2wwds_8_tfalbrfen = GXutil.nullDate() ;
      AV106Talbdet2wwds_9_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV109Talbdet2wwds_12_tfclinom = "" ;
      AV110Talbdet2wwds_13_tfclinom_sel = "" ;
      AV111Talbdet2wwds_14_tfalbref = "" ;
      AV112Talbdet2wwds_15_tfalbref_sel = "" ;
      AV113Talbdet2wwds_16_tfalbrefdsc = "" ;
      AV114Talbdet2wwds_17_tfalbrefdsc_sel = "" ;
      AV117Talbdet2wwds_20_tfprocenom = "" ;
      AV118Talbdet2wwds_21_tfprocenom_sel = "" ;
      AV121Talbdet2wwds_24_tftrnnom = "" ;
      AV122Talbdet2wwds_25_tftrnnom_sel = "" ;
      AV125Talbdet2wwds_28_tftipentnom = "" ;
      AV126Talbdet2wwds_29_tftipentnom_sel = "" ;
      AV127Talbdet2wwds_30_tfalbrdes = "" ;
      AV128Talbdet2wwds_31_tfalbrdes_sel = "" ;
      AV129Talbdet2wwds_32_tfalbrunient = DecimalUtil.ZERO ;
      AV130Talbdet2wwds_33_tfalbrunient_to = DecimalUtil.ZERO ;
      AV131Talbdet2wwds_34_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV134Talbdet2wwds_37_tfalbrloc = "" ;
      AV135Talbdet2wwds_38_tfalbrloc_sel = "" ;
      AV136Talbdet2wwds_39_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Talbdet2wwds_42_tfalbruniuti = DecimalUtil.ZERO ;
      AV140Talbdet2wwds_43_tfalbruniuti_to = DecimalUtil.ZERO ;
      lV98Talbdet2wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV101Talbdet2wwds_4_tfalbrent = "" ;
      lV103Talbdet2wwds_6_tfalbrent2 = "" ;
      lV109Talbdet2wwds_12_tfclinom = "" ;
      lV111Talbdet2wwds_14_tfalbref = "" ;
      lV113Talbdet2wwds_16_tfalbrefdsc = "" ;
      lV117Talbdet2wwds_20_tfprocenom = "" ;
      lV121Talbdet2wwds_24_tftrnnom = "" ;
      lV125Talbdet2wwds_28_tftipentnom = "" ;
      lV127Talbdet2wwds_30_tfalbrdes = "" ;
      lV134Talbdet2wwds_37_tfalbrloc = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      A5806AlbREnt2 = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P086D2_A396EmprCod = new String[] {""} ;
      P086D2_A46AlbREnt = new String[] {""} ;
      P086D2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D2_A54AlbRPieUti = new int[1] ;
      P086D2_A50AlbRLoc = new String[] {""} ;
      P086D2_A52AlbRPieEnt = new int[1] ;
      P086D2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D2_A1291AlbRDes = new String[] {""} ;
      P086D2_A1212TipEntNom = new String[] {""} ;
      P086D2_n1212TipEntNom = new boolean[] {false} ;
      P086D2_A1211TipEntCod = new short[1] ;
      P086D2_n1211TipEntCod = new boolean[] {false} ;
      P086D2_A841TrnNom = new String[] {""} ;
      P086D2_n841TrnNom = new boolean[] {false} ;
      P086D2_A840TrnCod = new short[1] ;
      P086D2_n840TrnCod = new boolean[] {false} ;
      P086D2_A971ProceNom = new String[] {""} ;
      P086D2_n971ProceNom = new boolean[] {false} ;
      P086D2_A970ProceCod = new short[1] ;
      P086D2_n970ProceCod = new boolean[] {false} ;
      P086D2_A3613AlbRefDsc = new String[] {""} ;
      P086D2_A45AlbRef = new String[] {""} ;
      P086D2_A279CliNom = new String[] {""} ;
      P086D2_A252CliCod = new int[1] ;
      P086D2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D2_n4606AlbRHEn = new boolean[] {false} ;
      P086D2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D2_A5806AlbREnt2 = new String[] {""} ;
      P086D2_A44AlbRecCod = new int[1] ;
      P086D2_A55AlbRReo = new String[] {""} ;
      P086D2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV60Option = "" ;
      P086D3_A396EmprCod = new String[] {""} ;
      P086D3_A5806AlbREnt2 = new String[] {""} ;
      P086D3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D3_A54AlbRPieUti = new int[1] ;
      P086D3_A50AlbRLoc = new String[] {""} ;
      P086D3_A52AlbRPieEnt = new int[1] ;
      P086D3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D3_A1291AlbRDes = new String[] {""} ;
      P086D3_A1212TipEntNom = new String[] {""} ;
      P086D3_n1212TipEntNom = new boolean[] {false} ;
      P086D3_A1211TipEntCod = new short[1] ;
      P086D3_n1211TipEntCod = new boolean[] {false} ;
      P086D3_A841TrnNom = new String[] {""} ;
      P086D3_n841TrnNom = new boolean[] {false} ;
      P086D3_A840TrnCod = new short[1] ;
      P086D3_n840TrnCod = new boolean[] {false} ;
      P086D3_A971ProceNom = new String[] {""} ;
      P086D3_n971ProceNom = new boolean[] {false} ;
      P086D3_A970ProceCod = new short[1] ;
      P086D3_n970ProceCod = new boolean[] {false} ;
      P086D3_A3613AlbRefDsc = new String[] {""} ;
      P086D3_A45AlbRef = new String[] {""} ;
      P086D3_A279CliNom = new String[] {""} ;
      P086D3_A252CliCod = new int[1] ;
      P086D3_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D3_n4606AlbRHEn = new boolean[] {false} ;
      P086D3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D3_A46AlbREnt = new String[] {""} ;
      P086D3_A44AlbRecCod = new int[1] ;
      P086D3_A55AlbRReo = new String[] {""} ;
      P086D3_A56AlbRUni = new String[] {""} ;
      P086D4_A396EmprCod = new String[] {""} ;
      P086D4_A279CliNom = new String[] {""} ;
      P086D4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D4_A54AlbRPieUti = new int[1] ;
      P086D4_A50AlbRLoc = new String[] {""} ;
      P086D4_A52AlbRPieEnt = new int[1] ;
      P086D4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D4_A1291AlbRDes = new String[] {""} ;
      P086D4_A1212TipEntNom = new String[] {""} ;
      P086D4_n1212TipEntNom = new boolean[] {false} ;
      P086D4_A1211TipEntCod = new short[1] ;
      P086D4_n1211TipEntCod = new boolean[] {false} ;
      P086D4_A841TrnNom = new String[] {""} ;
      P086D4_n841TrnNom = new boolean[] {false} ;
      P086D4_A840TrnCod = new short[1] ;
      P086D4_n840TrnCod = new boolean[] {false} ;
      P086D4_A971ProceNom = new String[] {""} ;
      P086D4_n971ProceNom = new boolean[] {false} ;
      P086D4_A970ProceCod = new short[1] ;
      P086D4_n970ProceCod = new boolean[] {false} ;
      P086D4_A3613AlbRefDsc = new String[] {""} ;
      P086D4_A45AlbRef = new String[] {""} ;
      P086D4_A252CliCod = new int[1] ;
      P086D4_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D4_n4606AlbRHEn = new boolean[] {false} ;
      P086D4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D4_A5806AlbREnt2 = new String[] {""} ;
      P086D4_A46AlbREnt = new String[] {""} ;
      P086D4_A44AlbRecCod = new int[1] ;
      P086D4_A55AlbRReo = new String[] {""} ;
      P086D4_A56AlbRUni = new String[] {""} ;
      P086D5_A396EmprCod = new String[] {""} ;
      P086D5_A45AlbRef = new String[] {""} ;
      P086D5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D5_A54AlbRPieUti = new int[1] ;
      P086D5_A50AlbRLoc = new String[] {""} ;
      P086D5_A52AlbRPieEnt = new int[1] ;
      P086D5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D5_A1291AlbRDes = new String[] {""} ;
      P086D5_A1212TipEntNom = new String[] {""} ;
      P086D5_n1212TipEntNom = new boolean[] {false} ;
      P086D5_A1211TipEntCod = new short[1] ;
      P086D5_n1211TipEntCod = new boolean[] {false} ;
      P086D5_A841TrnNom = new String[] {""} ;
      P086D5_n841TrnNom = new boolean[] {false} ;
      P086D5_A840TrnCod = new short[1] ;
      P086D5_n840TrnCod = new boolean[] {false} ;
      P086D5_A971ProceNom = new String[] {""} ;
      P086D5_n971ProceNom = new boolean[] {false} ;
      P086D5_A970ProceCod = new short[1] ;
      P086D5_n970ProceCod = new boolean[] {false} ;
      P086D5_A3613AlbRefDsc = new String[] {""} ;
      P086D5_A279CliNom = new String[] {""} ;
      P086D5_A252CliCod = new int[1] ;
      P086D5_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D5_n4606AlbRHEn = new boolean[] {false} ;
      P086D5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D5_A5806AlbREnt2 = new String[] {""} ;
      P086D5_A46AlbREnt = new String[] {""} ;
      P086D5_A44AlbRecCod = new int[1] ;
      P086D5_A55AlbRReo = new String[] {""} ;
      P086D5_A56AlbRUni = new String[] {""} ;
      P086D6_A396EmprCod = new String[] {""} ;
      P086D6_A3613AlbRefDsc = new String[] {""} ;
      P086D6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D6_A54AlbRPieUti = new int[1] ;
      P086D6_A50AlbRLoc = new String[] {""} ;
      P086D6_A52AlbRPieEnt = new int[1] ;
      P086D6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D6_A1291AlbRDes = new String[] {""} ;
      P086D6_A1212TipEntNom = new String[] {""} ;
      P086D6_n1212TipEntNom = new boolean[] {false} ;
      P086D6_A1211TipEntCod = new short[1] ;
      P086D6_n1211TipEntCod = new boolean[] {false} ;
      P086D6_A841TrnNom = new String[] {""} ;
      P086D6_n841TrnNom = new boolean[] {false} ;
      P086D6_A840TrnCod = new short[1] ;
      P086D6_n840TrnCod = new boolean[] {false} ;
      P086D6_A971ProceNom = new String[] {""} ;
      P086D6_n971ProceNom = new boolean[] {false} ;
      P086D6_A970ProceCod = new short[1] ;
      P086D6_n970ProceCod = new boolean[] {false} ;
      P086D6_A45AlbRef = new String[] {""} ;
      P086D6_A279CliNom = new String[] {""} ;
      P086D6_A252CliCod = new int[1] ;
      P086D6_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D6_n4606AlbRHEn = new boolean[] {false} ;
      P086D6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D6_A5806AlbREnt2 = new String[] {""} ;
      P086D6_A46AlbREnt = new String[] {""} ;
      P086D6_A44AlbRecCod = new int[1] ;
      P086D6_A55AlbRReo = new String[] {""} ;
      P086D6_A56AlbRUni = new String[] {""} ;
      P086D7_A970ProceCod = new short[1] ;
      P086D7_n970ProceCod = new boolean[] {false} ;
      P086D7_A396EmprCod = new String[] {""} ;
      P086D7_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D7_A54AlbRPieUti = new int[1] ;
      P086D7_A50AlbRLoc = new String[] {""} ;
      P086D7_A52AlbRPieEnt = new int[1] ;
      P086D7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D7_A1291AlbRDes = new String[] {""} ;
      P086D7_A1212TipEntNom = new String[] {""} ;
      P086D7_n1212TipEntNom = new boolean[] {false} ;
      P086D7_A1211TipEntCod = new short[1] ;
      P086D7_n1211TipEntCod = new boolean[] {false} ;
      P086D7_A841TrnNom = new String[] {""} ;
      P086D7_n841TrnNom = new boolean[] {false} ;
      P086D7_A840TrnCod = new short[1] ;
      P086D7_n840TrnCod = new boolean[] {false} ;
      P086D7_A971ProceNom = new String[] {""} ;
      P086D7_n971ProceNom = new boolean[] {false} ;
      P086D7_A3613AlbRefDsc = new String[] {""} ;
      P086D7_A45AlbRef = new String[] {""} ;
      P086D7_A279CliNom = new String[] {""} ;
      P086D7_A252CliCod = new int[1] ;
      P086D7_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D7_n4606AlbRHEn = new boolean[] {false} ;
      P086D7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D7_A5806AlbREnt2 = new String[] {""} ;
      P086D7_A46AlbREnt = new String[] {""} ;
      P086D7_A44AlbRecCod = new int[1] ;
      P086D7_A55AlbRReo = new String[] {""} ;
      P086D7_A56AlbRUni = new String[] {""} ;
      P086D8_A840TrnCod = new short[1] ;
      P086D8_n840TrnCod = new boolean[] {false} ;
      P086D8_A396EmprCod = new String[] {""} ;
      P086D8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D8_A54AlbRPieUti = new int[1] ;
      P086D8_A50AlbRLoc = new String[] {""} ;
      P086D8_A52AlbRPieEnt = new int[1] ;
      P086D8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D8_A1291AlbRDes = new String[] {""} ;
      P086D8_A1212TipEntNom = new String[] {""} ;
      P086D8_n1212TipEntNom = new boolean[] {false} ;
      P086D8_A1211TipEntCod = new short[1] ;
      P086D8_n1211TipEntCod = new boolean[] {false} ;
      P086D8_A841TrnNom = new String[] {""} ;
      P086D8_n841TrnNom = new boolean[] {false} ;
      P086D8_A971ProceNom = new String[] {""} ;
      P086D8_n971ProceNom = new boolean[] {false} ;
      P086D8_A970ProceCod = new short[1] ;
      P086D8_n970ProceCod = new boolean[] {false} ;
      P086D8_A3613AlbRefDsc = new String[] {""} ;
      P086D8_A45AlbRef = new String[] {""} ;
      P086D8_A279CliNom = new String[] {""} ;
      P086D8_A252CliCod = new int[1] ;
      P086D8_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D8_n4606AlbRHEn = new boolean[] {false} ;
      P086D8_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D8_A5806AlbREnt2 = new String[] {""} ;
      P086D8_A46AlbREnt = new String[] {""} ;
      P086D8_A44AlbRecCod = new int[1] ;
      P086D8_A55AlbRReo = new String[] {""} ;
      P086D8_A56AlbRUni = new String[] {""} ;
      P086D9_A1211TipEntCod = new short[1] ;
      P086D9_n1211TipEntCod = new boolean[] {false} ;
      P086D9_A396EmprCod = new String[] {""} ;
      P086D9_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D9_A54AlbRPieUti = new int[1] ;
      P086D9_A50AlbRLoc = new String[] {""} ;
      P086D9_A52AlbRPieEnt = new int[1] ;
      P086D9_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D9_A1291AlbRDes = new String[] {""} ;
      P086D9_A1212TipEntNom = new String[] {""} ;
      P086D9_n1212TipEntNom = new boolean[] {false} ;
      P086D9_A841TrnNom = new String[] {""} ;
      P086D9_n841TrnNom = new boolean[] {false} ;
      P086D9_A840TrnCod = new short[1] ;
      P086D9_n840TrnCod = new boolean[] {false} ;
      P086D9_A971ProceNom = new String[] {""} ;
      P086D9_n971ProceNom = new boolean[] {false} ;
      P086D9_A970ProceCod = new short[1] ;
      P086D9_n970ProceCod = new boolean[] {false} ;
      P086D9_A3613AlbRefDsc = new String[] {""} ;
      P086D9_A45AlbRef = new String[] {""} ;
      P086D9_A279CliNom = new String[] {""} ;
      P086D9_A252CliCod = new int[1] ;
      P086D9_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D9_n4606AlbRHEn = new boolean[] {false} ;
      P086D9_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D9_A5806AlbREnt2 = new String[] {""} ;
      P086D9_A46AlbREnt = new String[] {""} ;
      P086D9_A44AlbRecCod = new int[1] ;
      P086D9_A55AlbRReo = new String[] {""} ;
      P086D9_A56AlbRUni = new String[] {""} ;
      P086D10_A396EmprCod = new String[] {""} ;
      P086D10_A1291AlbRDes = new String[] {""} ;
      P086D10_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D10_A54AlbRPieUti = new int[1] ;
      P086D10_A50AlbRLoc = new String[] {""} ;
      P086D10_A52AlbRPieEnt = new int[1] ;
      P086D10_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D10_A1212TipEntNom = new String[] {""} ;
      P086D10_n1212TipEntNom = new boolean[] {false} ;
      P086D10_A1211TipEntCod = new short[1] ;
      P086D10_n1211TipEntCod = new boolean[] {false} ;
      P086D10_A841TrnNom = new String[] {""} ;
      P086D10_n841TrnNom = new boolean[] {false} ;
      P086D10_A840TrnCod = new short[1] ;
      P086D10_n840TrnCod = new boolean[] {false} ;
      P086D10_A971ProceNom = new String[] {""} ;
      P086D10_n971ProceNom = new boolean[] {false} ;
      P086D10_A970ProceCod = new short[1] ;
      P086D10_n970ProceCod = new boolean[] {false} ;
      P086D10_A3613AlbRefDsc = new String[] {""} ;
      P086D10_A45AlbRef = new String[] {""} ;
      P086D10_A279CliNom = new String[] {""} ;
      P086D10_A252CliCod = new int[1] ;
      P086D10_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D10_n4606AlbRHEn = new boolean[] {false} ;
      P086D10_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D10_A5806AlbREnt2 = new String[] {""} ;
      P086D10_A46AlbREnt = new String[] {""} ;
      P086D10_A44AlbRecCod = new int[1] ;
      P086D10_A55AlbRReo = new String[] {""} ;
      P086D10_A56AlbRUni = new String[] {""} ;
      P086D11_A396EmprCod = new String[] {""} ;
      P086D11_A50AlbRLoc = new String[] {""} ;
      P086D11_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D11_A54AlbRPieUti = new int[1] ;
      P086D11_A52AlbRPieEnt = new int[1] ;
      P086D11_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086D11_A1291AlbRDes = new String[] {""} ;
      P086D11_A1212TipEntNom = new String[] {""} ;
      P086D11_n1212TipEntNom = new boolean[] {false} ;
      P086D11_A1211TipEntCod = new short[1] ;
      P086D11_n1211TipEntCod = new boolean[] {false} ;
      P086D11_A841TrnNom = new String[] {""} ;
      P086D11_n841TrnNom = new boolean[] {false} ;
      P086D11_A840TrnCod = new short[1] ;
      P086D11_n840TrnCod = new boolean[] {false} ;
      P086D11_A971ProceNom = new String[] {""} ;
      P086D11_n971ProceNom = new boolean[] {false} ;
      P086D11_A970ProceCod = new short[1] ;
      P086D11_n970ProceCod = new boolean[] {false} ;
      P086D11_A3613AlbRefDsc = new String[] {""} ;
      P086D11_A45AlbRef = new String[] {""} ;
      P086D11_A279CliNom = new String[] {""} ;
      P086D11_A252CliCod = new int[1] ;
      P086D11_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086D11_n4606AlbRHEn = new boolean[] {false} ;
      P086D11_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086D11_A5806AlbREnt2 = new String[] {""} ;
      P086D11_A46AlbREnt = new String[] {""} ;
      P086D11_A44AlbRecCod = new int[1] ;
      P086D11_A55AlbRReo = new String[] {""} ;
      P086D11_A56AlbRUni = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet2wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P086D2_A396EmprCod, P086D2_A46AlbREnt, P086D2_A60AlbRUniUti, P086D2_A54AlbRPieUti, P086D2_A50AlbRLoc, P086D2_A52AlbRPieEnt, P086D2_A58AlbRUniEnt, P086D2_A1291AlbRDes, P086D2_A1212TipEntNom, P086D2_n1212TipEntNom,
            P086D2_A1211TipEntCod, P086D2_n1211TipEntCod, P086D2_A841TrnNom, P086D2_n841TrnNom, P086D2_A840TrnCod, P086D2_n840TrnCod, P086D2_A971ProceNom, P086D2_n971ProceNom, P086D2_A970ProceCod, P086D2_n970ProceCod,
            P086D2_A3613AlbRefDsc, P086D2_A45AlbRef, P086D2_A279CliNom, P086D2_A252CliCod, P086D2_A4606AlbRHEn, P086D2_n4606AlbRHEn, P086D2_A49AlbRFen, P086D2_A5806AlbREnt2, P086D2_A44AlbRecCod, P086D2_A55AlbRReo,
            P086D2_A56AlbRUni
            }
            , new Object[] {
            P086D3_A396EmprCod, P086D3_A5806AlbREnt2, P086D3_A60AlbRUniUti, P086D3_A54AlbRPieUti, P086D3_A50AlbRLoc, P086D3_A52AlbRPieEnt, P086D3_A58AlbRUniEnt, P086D3_A1291AlbRDes, P086D3_A1212TipEntNom, P086D3_n1212TipEntNom,
            P086D3_A1211TipEntCod, P086D3_n1211TipEntCod, P086D3_A841TrnNom, P086D3_n841TrnNom, P086D3_A840TrnCod, P086D3_n840TrnCod, P086D3_A971ProceNom, P086D3_n971ProceNom, P086D3_A970ProceCod, P086D3_n970ProceCod,
            P086D3_A3613AlbRefDsc, P086D3_A45AlbRef, P086D3_A279CliNom, P086D3_A252CliCod, P086D3_A4606AlbRHEn, P086D3_n4606AlbRHEn, P086D3_A49AlbRFen, P086D3_A46AlbREnt, P086D3_A44AlbRecCod, P086D3_A55AlbRReo,
            P086D3_A56AlbRUni
            }
            , new Object[] {
            P086D4_A396EmprCod, P086D4_A279CliNom, P086D4_A60AlbRUniUti, P086D4_A54AlbRPieUti, P086D4_A50AlbRLoc, P086D4_A52AlbRPieEnt, P086D4_A58AlbRUniEnt, P086D4_A1291AlbRDes, P086D4_A1212TipEntNom, P086D4_n1212TipEntNom,
            P086D4_A1211TipEntCod, P086D4_n1211TipEntCod, P086D4_A841TrnNom, P086D4_n841TrnNom, P086D4_A840TrnCod, P086D4_n840TrnCod, P086D4_A971ProceNom, P086D4_n971ProceNom, P086D4_A970ProceCod, P086D4_n970ProceCod,
            P086D4_A3613AlbRefDsc, P086D4_A45AlbRef, P086D4_A252CliCod, P086D4_A4606AlbRHEn, P086D4_n4606AlbRHEn, P086D4_A49AlbRFen, P086D4_A5806AlbREnt2, P086D4_A46AlbREnt, P086D4_A44AlbRecCod, P086D4_A55AlbRReo,
            P086D4_A56AlbRUni
            }
            , new Object[] {
            P086D5_A396EmprCod, P086D5_A45AlbRef, P086D5_A60AlbRUniUti, P086D5_A54AlbRPieUti, P086D5_A50AlbRLoc, P086D5_A52AlbRPieEnt, P086D5_A58AlbRUniEnt, P086D5_A1291AlbRDes, P086D5_A1212TipEntNom, P086D5_n1212TipEntNom,
            P086D5_A1211TipEntCod, P086D5_n1211TipEntCod, P086D5_A841TrnNom, P086D5_n841TrnNom, P086D5_A840TrnCod, P086D5_n840TrnCod, P086D5_A971ProceNom, P086D5_n971ProceNom, P086D5_A970ProceCod, P086D5_n970ProceCod,
            P086D5_A3613AlbRefDsc, P086D5_A279CliNom, P086D5_A252CliCod, P086D5_A4606AlbRHEn, P086D5_n4606AlbRHEn, P086D5_A49AlbRFen, P086D5_A5806AlbREnt2, P086D5_A46AlbREnt, P086D5_A44AlbRecCod, P086D5_A55AlbRReo,
            P086D5_A56AlbRUni
            }
            , new Object[] {
            P086D6_A396EmprCod, P086D6_A3613AlbRefDsc, P086D6_A60AlbRUniUti, P086D6_A54AlbRPieUti, P086D6_A50AlbRLoc, P086D6_A52AlbRPieEnt, P086D6_A58AlbRUniEnt, P086D6_A1291AlbRDes, P086D6_A1212TipEntNom, P086D6_n1212TipEntNom,
            P086D6_A1211TipEntCod, P086D6_n1211TipEntCod, P086D6_A841TrnNom, P086D6_n841TrnNom, P086D6_A840TrnCod, P086D6_n840TrnCod, P086D6_A971ProceNom, P086D6_n971ProceNom, P086D6_A970ProceCod, P086D6_n970ProceCod,
            P086D6_A45AlbRef, P086D6_A279CliNom, P086D6_A252CliCod, P086D6_A4606AlbRHEn, P086D6_n4606AlbRHEn, P086D6_A49AlbRFen, P086D6_A5806AlbREnt2, P086D6_A46AlbREnt, P086D6_A44AlbRecCod, P086D6_A55AlbRReo,
            P086D6_A56AlbRUni
            }
            , new Object[] {
            P086D7_A970ProceCod, P086D7_n970ProceCod, P086D7_A396EmprCod, P086D7_A60AlbRUniUti, P086D7_A54AlbRPieUti, P086D7_A50AlbRLoc, P086D7_A52AlbRPieEnt, P086D7_A58AlbRUniEnt, P086D7_A1291AlbRDes, P086D7_A1212TipEntNom,
            P086D7_n1212TipEntNom, P086D7_A1211TipEntCod, P086D7_n1211TipEntCod, P086D7_A841TrnNom, P086D7_n841TrnNom, P086D7_A840TrnCod, P086D7_n840TrnCod, P086D7_A971ProceNom, P086D7_n971ProceNom, P086D7_A3613AlbRefDsc,
            P086D7_A45AlbRef, P086D7_A279CliNom, P086D7_A252CliCod, P086D7_A4606AlbRHEn, P086D7_n4606AlbRHEn, P086D7_A49AlbRFen, P086D7_A5806AlbREnt2, P086D7_A46AlbREnt, P086D7_A44AlbRecCod, P086D7_A55AlbRReo,
            P086D7_A56AlbRUni
            }
            , new Object[] {
            P086D8_A840TrnCod, P086D8_n840TrnCod, P086D8_A396EmprCod, P086D8_A60AlbRUniUti, P086D8_A54AlbRPieUti, P086D8_A50AlbRLoc, P086D8_A52AlbRPieEnt, P086D8_A58AlbRUniEnt, P086D8_A1291AlbRDes, P086D8_A1212TipEntNom,
            P086D8_n1212TipEntNom, P086D8_A1211TipEntCod, P086D8_n1211TipEntCod, P086D8_A841TrnNom, P086D8_n841TrnNom, P086D8_A971ProceNom, P086D8_n971ProceNom, P086D8_A970ProceCod, P086D8_n970ProceCod, P086D8_A3613AlbRefDsc,
            P086D8_A45AlbRef, P086D8_A279CliNom, P086D8_A252CliCod, P086D8_A4606AlbRHEn, P086D8_n4606AlbRHEn, P086D8_A49AlbRFen, P086D8_A5806AlbREnt2, P086D8_A46AlbREnt, P086D8_A44AlbRecCod, P086D8_A55AlbRReo,
            P086D8_A56AlbRUni
            }
            , new Object[] {
            P086D9_A1211TipEntCod, P086D9_n1211TipEntCod, P086D9_A396EmprCod, P086D9_A60AlbRUniUti, P086D9_A54AlbRPieUti, P086D9_A50AlbRLoc, P086D9_A52AlbRPieEnt, P086D9_A58AlbRUniEnt, P086D9_A1291AlbRDes, P086D9_A1212TipEntNom,
            P086D9_n1212TipEntNom, P086D9_A841TrnNom, P086D9_n841TrnNom, P086D9_A840TrnCod, P086D9_n840TrnCod, P086D9_A971ProceNom, P086D9_n971ProceNom, P086D9_A970ProceCod, P086D9_n970ProceCod, P086D9_A3613AlbRefDsc,
            P086D9_A45AlbRef, P086D9_A279CliNom, P086D9_A252CliCod, P086D9_A4606AlbRHEn, P086D9_n4606AlbRHEn, P086D9_A49AlbRFen, P086D9_A5806AlbREnt2, P086D9_A46AlbREnt, P086D9_A44AlbRecCod, P086D9_A55AlbRReo,
            P086D9_A56AlbRUni
            }
            , new Object[] {
            P086D10_A396EmprCod, P086D10_A1291AlbRDes, P086D10_A60AlbRUniUti, P086D10_A54AlbRPieUti, P086D10_A50AlbRLoc, P086D10_A52AlbRPieEnt, P086D10_A58AlbRUniEnt, P086D10_A1212TipEntNom, P086D10_n1212TipEntNom, P086D10_A1211TipEntCod,
            P086D10_n1211TipEntCod, P086D10_A841TrnNom, P086D10_n841TrnNom, P086D10_A840TrnCod, P086D10_n840TrnCod, P086D10_A971ProceNom, P086D10_n971ProceNom, P086D10_A970ProceCod, P086D10_n970ProceCod, P086D10_A3613AlbRefDsc,
            P086D10_A45AlbRef, P086D10_A279CliNom, P086D10_A252CliCod, P086D10_A4606AlbRHEn, P086D10_n4606AlbRHEn, P086D10_A49AlbRFen, P086D10_A5806AlbREnt2, P086D10_A46AlbREnt, P086D10_A44AlbRecCod, P086D10_A55AlbRReo,
            P086D10_A56AlbRUni
            }
            , new Object[] {
            P086D11_A396EmprCod, P086D11_A50AlbRLoc, P086D11_A60AlbRUniUti, P086D11_A54AlbRPieUti, P086D11_A52AlbRPieEnt, P086D11_A58AlbRUniEnt, P086D11_A1291AlbRDes, P086D11_A1212TipEntNom, P086D11_n1212TipEntNom, P086D11_A1211TipEntCod,
            P086D11_n1211TipEntCod, P086D11_A841TrnNom, P086D11_n841TrnNom, P086D11_A840TrnCod, P086D11_n840TrnCod, P086D11_A971ProceNom, P086D11_n971ProceNom, P086D11_A970ProceCod, P086D11_n970ProceCod, P086D11_A3613AlbRefDsc,
            P086D11_A45AlbRef, P086D11_A279CliNom, P086D11_A252CliCod, P086D11_A4606AlbRHEn, P086D11_n4606AlbRHEn, P086D11_A49AlbRFen, P086D11_A5806AlbREnt2, P086D11_A46AlbREnt, P086D11_A44AlbRecCod, P086D11_A55AlbRReo,
            P086D11_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV28TFProceCod ;
   private short AV29TFProceCod_To ;
   private short AV32TFTrnCod ;
   private short AV33TFTrnCod_To ;
   private short AV36TFTipEntCod ;
   private short AV37TFTipEntCod_To ;
   private short AV115Talbdet2wwds_18_tfprocecod ;
   private short AV116Talbdet2wwds_19_tfprocecod_to ;
   private short AV119Talbdet2wwds_22_tftrncod ;
   private short AV120Talbdet2wwds_23_tftrncod_to ;
   private short AV123Talbdet2wwds_26_tftipentcod ;
   private short AV124Talbdet2wwds_27_tftipentcod_to ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV96GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV20TFCliCod ;
   private int AV21TFCliCod_To ;
   private int AV46TFAlbRPieEnt ;
   private int AV47TFAlbRPieEnt_To ;
   private int AV52TFAlbRPieUti ;
   private int AV53TFAlbRPieUti_To ;
   private int AV99Talbdet2wwds_2_tfalbreccod ;
   private int AV100Talbdet2wwds_3_tfalbreccod_to ;
   private int AV107Talbdet2wwds_10_tfclicod ;
   private int AV108Talbdet2wwds_11_tfclicod_to ;
   private int AV132Talbdet2wwds_35_tfalbrpieent ;
   private int AV133Talbdet2wwds_36_tfalbrpieent_to ;
   private int AV137Talbdet2wwds_40_tfalbrpieuti ;
   private int AV138Talbdet2wwds_41_tfalbrpieuti_to ;
   private int AV131Talbdet2wwds_34_tfalbruni_sels_size ;
   private int AV136Talbdet2wwds_39_tfalbrreo_sels_size ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV59InsertIndex ;
   private long AV68count ;
   private java.math.BigDecimal AV42TFAlbRUniEnt ;
   private java.math.BigDecimal AV43TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV54TFAlbRUniUti ;
   private java.math.BigDecimal AV55TFAlbRUniUti_To ;
   private java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ;
   private java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ;
   private java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ;
   private java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String AV12TFAlbREnt ;
   private String AV13TFAlbREnt_Sel ;
   private String AV14TFAlbREnt2 ;
   private String AV15TFAlbREnt2_Sel ;
   private String AV22TFCliNom ;
   private String AV23TFCliNom_Sel ;
   private String AV24TFAlbRef ;
   private String AV25TFAlbRef_Sel ;
   private String AV26TFAlbRefDsc ;
   private String AV27TFAlbRefDsc_Sel ;
   private String AV30TFProceNom ;
   private String AV31TFProceNom_Sel ;
   private String AV34TFTrnNom ;
   private String AV35TFTrnNom_Sel ;
   private String AV38TFTipEntNom ;
   private String AV39TFTipEntNom_Sel ;
   private String AV40TFAlbRDes ;
   private String AV41TFAlbRDes_Sel ;
   private String AV48TFAlbRLoc ;
   private String AV49TFAlbRLoc_Sel ;
   private String A46AlbREnt ;
   private String AV101Talbdet2wwds_4_tfalbrent ;
   private String AV102Talbdet2wwds_5_tfalbrent_sel ;
   private String AV103Talbdet2wwds_6_tfalbrent2 ;
   private String AV104Talbdet2wwds_7_tfalbrent2_sel ;
   private String AV109Talbdet2wwds_12_tfclinom ;
   private String AV110Talbdet2wwds_13_tfclinom_sel ;
   private String AV111Talbdet2wwds_14_tfalbref ;
   private String AV112Talbdet2wwds_15_tfalbref_sel ;
   private String AV113Talbdet2wwds_16_tfalbrefdsc ;
   private String AV114Talbdet2wwds_17_tfalbrefdsc_sel ;
   private String AV117Talbdet2wwds_20_tfprocenom ;
   private String AV118Talbdet2wwds_21_tfprocenom_sel ;
   private String AV121Talbdet2wwds_24_tftrnnom ;
   private String AV122Talbdet2wwds_25_tftrnnom_sel ;
   private String AV125Talbdet2wwds_28_tftipentnom ;
   private String AV126Talbdet2wwds_29_tftipentnom_sel ;
   private String AV127Talbdet2wwds_30_tfalbrdes ;
   private String AV128Talbdet2wwds_31_tfalbrdes_sel ;
   private String AV134Talbdet2wwds_37_tfalbrloc ;
   private String AV135Talbdet2wwds_38_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV101Talbdet2wwds_4_tfalbrent ;
   private String lV103Talbdet2wwds_6_tfalbrent2 ;
   private String lV109Talbdet2wwds_12_tfclinom ;
   private String lV111Talbdet2wwds_14_tfalbref ;
   private String lV113Talbdet2wwds_16_tfalbrefdsc ;
   private String lV117Talbdet2wwds_20_tfprocenom ;
   private String lV121Talbdet2wwds_24_tftrnnom ;
   private String lV125Talbdet2wwds_28_tftipentnom ;
   private String lV127Talbdet2wwds_30_tfalbrdes ;
   private String lV134Talbdet2wwds_37_tfalbrloc ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A50AlbRLoc ;
   private String A396EmprCod ;
   private java.util.Date AV18TFAlbRHEn ;
   private java.util.Date AV106Talbdet2wwds_9_tfalbrhen ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV16TFAlbRFen ;
   private java.util.Date AV105Talbdet2wwds_8_tfalbrfen ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk86D2 ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private boolean brk86D4 ;
   private boolean brk86D6 ;
   private boolean brk86D8 ;
   private boolean brk86D10 ;
   private boolean brk86D12 ;
   private boolean brk86D14 ;
   private boolean brk86D16 ;
   private boolean brk86D18 ;
   private boolean brk86D20 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV91TFAlbRUni_SelsJson ;
   private String AV50TFAlbRReo_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV93FilterFullText ;
   private String AV98Talbdet2wwds_1_filterfulltext ;
   private String lV98Talbdet2wwds_1_filterfulltext ;
   private String AV60Option ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P086D2_A396EmprCod ;
   private String[] P086D2_A46AlbREnt ;
   private java.math.BigDecimal[] P086D2_A60AlbRUniUti ;
   private int[] P086D2_A54AlbRPieUti ;
   private String[] P086D2_A50AlbRLoc ;
   private int[] P086D2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D2_A58AlbRUniEnt ;
   private String[] P086D2_A1291AlbRDes ;
   private String[] P086D2_A1212TipEntNom ;
   private boolean[] P086D2_n1212TipEntNom ;
   private short[] P086D2_A1211TipEntCod ;
   private boolean[] P086D2_n1211TipEntCod ;
   private String[] P086D2_A841TrnNom ;
   private boolean[] P086D2_n841TrnNom ;
   private short[] P086D2_A840TrnCod ;
   private boolean[] P086D2_n840TrnCod ;
   private String[] P086D2_A971ProceNom ;
   private boolean[] P086D2_n971ProceNom ;
   private short[] P086D2_A970ProceCod ;
   private boolean[] P086D2_n970ProceCod ;
   private String[] P086D2_A3613AlbRefDsc ;
   private String[] P086D2_A45AlbRef ;
   private String[] P086D2_A279CliNom ;
   private int[] P086D2_A252CliCod ;
   private java.util.Date[] P086D2_A4606AlbRHEn ;
   private boolean[] P086D2_n4606AlbRHEn ;
   private java.util.Date[] P086D2_A49AlbRFen ;
   private String[] P086D2_A5806AlbREnt2 ;
   private int[] P086D2_A44AlbRecCod ;
   private String[] P086D2_A55AlbRReo ;
   private String[] P086D2_A56AlbRUni ;
   private String[] P086D3_A396EmprCod ;
   private String[] P086D3_A5806AlbREnt2 ;
   private java.math.BigDecimal[] P086D3_A60AlbRUniUti ;
   private int[] P086D3_A54AlbRPieUti ;
   private String[] P086D3_A50AlbRLoc ;
   private int[] P086D3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D3_A58AlbRUniEnt ;
   private String[] P086D3_A1291AlbRDes ;
   private String[] P086D3_A1212TipEntNom ;
   private boolean[] P086D3_n1212TipEntNom ;
   private short[] P086D3_A1211TipEntCod ;
   private boolean[] P086D3_n1211TipEntCod ;
   private String[] P086D3_A841TrnNom ;
   private boolean[] P086D3_n841TrnNom ;
   private short[] P086D3_A840TrnCod ;
   private boolean[] P086D3_n840TrnCod ;
   private String[] P086D3_A971ProceNom ;
   private boolean[] P086D3_n971ProceNom ;
   private short[] P086D3_A970ProceCod ;
   private boolean[] P086D3_n970ProceCod ;
   private String[] P086D3_A3613AlbRefDsc ;
   private String[] P086D3_A45AlbRef ;
   private String[] P086D3_A279CliNom ;
   private int[] P086D3_A252CliCod ;
   private java.util.Date[] P086D3_A4606AlbRHEn ;
   private boolean[] P086D3_n4606AlbRHEn ;
   private java.util.Date[] P086D3_A49AlbRFen ;
   private String[] P086D3_A46AlbREnt ;
   private int[] P086D3_A44AlbRecCod ;
   private String[] P086D3_A55AlbRReo ;
   private String[] P086D3_A56AlbRUni ;
   private String[] P086D4_A396EmprCod ;
   private String[] P086D4_A279CliNom ;
   private java.math.BigDecimal[] P086D4_A60AlbRUniUti ;
   private int[] P086D4_A54AlbRPieUti ;
   private String[] P086D4_A50AlbRLoc ;
   private int[] P086D4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D4_A58AlbRUniEnt ;
   private String[] P086D4_A1291AlbRDes ;
   private String[] P086D4_A1212TipEntNom ;
   private boolean[] P086D4_n1212TipEntNom ;
   private short[] P086D4_A1211TipEntCod ;
   private boolean[] P086D4_n1211TipEntCod ;
   private String[] P086D4_A841TrnNom ;
   private boolean[] P086D4_n841TrnNom ;
   private short[] P086D4_A840TrnCod ;
   private boolean[] P086D4_n840TrnCod ;
   private String[] P086D4_A971ProceNom ;
   private boolean[] P086D4_n971ProceNom ;
   private short[] P086D4_A970ProceCod ;
   private boolean[] P086D4_n970ProceCod ;
   private String[] P086D4_A3613AlbRefDsc ;
   private String[] P086D4_A45AlbRef ;
   private int[] P086D4_A252CliCod ;
   private java.util.Date[] P086D4_A4606AlbRHEn ;
   private boolean[] P086D4_n4606AlbRHEn ;
   private java.util.Date[] P086D4_A49AlbRFen ;
   private String[] P086D4_A5806AlbREnt2 ;
   private String[] P086D4_A46AlbREnt ;
   private int[] P086D4_A44AlbRecCod ;
   private String[] P086D4_A55AlbRReo ;
   private String[] P086D4_A56AlbRUni ;
   private String[] P086D5_A396EmprCod ;
   private String[] P086D5_A45AlbRef ;
   private java.math.BigDecimal[] P086D5_A60AlbRUniUti ;
   private int[] P086D5_A54AlbRPieUti ;
   private String[] P086D5_A50AlbRLoc ;
   private int[] P086D5_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D5_A58AlbRUniEnt ;
   private String[] P086D5_A1291AlbRDes ;
   private String[] P086D5_A1212TipEntNom ;
   private boolean[] P086D5_n1212TipEntNom ;
   private short[] P086D5_A1211TipEntCod ;
   private boolean[] P086D5_n1211TipEntCod ;
   private String[] P086D5_A841TrnNom ;
   private boolean[] P086D5_n841TrnNom ;
   private short[] P086D5_A840TrnCod ;
   private boolean[] P086D5_n840TrnCod ;
   private String[] P086D5_A971ProceNom ;
   private boolean[] P086D5_n971ProceNom ;
   private short[] P086D5_A970ProceCod ;
   private boolean[] P086D5_n970ProceCod ;
   private String[] P086D5_A3613AlbRefDsc ;
   private String[] P086D5_A279CliNom ;
   private int[] P086D5_A252CliCod ;
   private java.util.Date[] P086D5_A4606AlbRHEn ;
   private boolean[] P086D5_n4606AlbRHEn ;
   private java.util.Date[] P086D5_A49AlbRFen ;
   private String[] P086D5_A5806AlbREnt2 ;
   private String[] P086D5_A46AlbREnt ;
   private int[] P086D5_A44AlbRecCod ;
   private String[] P086D5_A55AlbRReo ;
   private String[] P086D5_A56AlbRUni ;
   private String[] P086D6_A396EmprCod ;
   private String[] P086D6_A3613AlbRefDsc ;
   private java.math.BigDecimal[] P086D6_A60AlbRUniUti ;
   private int[] P086D6_A54AlbRPieUti ;
   private String[] P086D6_A50AlbRLoc ;
   private int[] P086D6_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D6_A58AlbRUniEnt ;
   private String[] P086D6_A1291AlbRDes ;
   private String[] P086D6_A1212TipEntNom ;
   private boolean[] P086D6_n1212TipEntNom ;
   private short[] P086D6_A1211TipEntCod ;
   private boolean[] P086D6_n1211TipEntCod ;
   private String[] P086D6_A841TrnNom ;
   private boolean[] P086D6_n841TrnNom ;
   private short[] P086D6_A840TrnCod ;
   private boolean[] P086D6_n840TrnCod ;
   private String[] P086D6_A971ProceNom ;
   private boolean[] P086D6_n971ProceNom ;
   private short[] P086D6_A970ProceCod ;
   private boolean[] P086D6_n970ProceCod ;
   private String[] P086D6_A45AlbRef ;
   private String[] P086D6_A279CliNom ;
   private int[] P086D6_A252CliCod ;
   private java.util.Date[] P086D6_A4606AlbRHEn ;
   private boolean[] P086D6_n4606AlbRHEn ;
   private java.util.Date[] P086D6_A49AlbRFen ;
   private String[] P086D6_A5806AlbREnt2 ;
   private String[] P086D6_A46AlbREnt ;
   private int[] P086D6_A44AlbRecCod ;
   private String[] P086D6_A55AlbRReo ;
   private String[] P086D6_A56AlbRUni ;
   private short[] P086D7_A970ProceCod ;
   private boolean[] P086D7_n970ProceCod ;
   private String[] P086D7_A396EmprCod ;
   private java.math.BigDecimal[] P086D7_A60AlbRUniUti ;
   private int[] P086D7_A54AlbRPieUti ;
   private String[] P086D7_A50AlbRLoc ;
   private int[] P086D7_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D7_A58AlbRUniEnt ;
   private String[] P086D7_A1291AlbRDes ;
   private String[] P086D7_A1212TipEntNom ;
   private boolean[] P086D7_n1212TipEntNom ;
   private short[] P086D7_A1211TipEntCod ;
   private boolean[] P086D7_n1211TipEntCod ;
   private String[] P086D7_A841TrnNom ;
   private boolean[] P086D7_n841TrnNom ;
   private short[] P086D7_A840TrnCod ;
   private boolean[] P086D7_n840TrnCod ;
   private String[] P086D7_A971ProceNom ;
   private boolean[] P086D7_n971ProceNom ;
   private String[] P086D7_A3613AlbRefDsc ;
   private String[] P086D7_A45AlbRef ;
   private String[] P086D7_A279CliNom ;
   private int[] P086D7_A252CliCod ;
   private java.util.Date[] P086D7_A4606AlbRHEn ;
   private boolean[] P086D7_n4606AlbRHEn ;
   private java.util.Date[] P086D7_A49AlbRFen ;
   private String[] P086D7_A5806AlbREnt2 ;
   private String[] P086D7_A46AlbREnt ;
   private int[] P086D7_A44AlbRecCod ;
   private String[] P086D7_A55AlbRReo ;
   private String[] P086D7_A56AlbRUni ;
   private short[] P086D8_A840TrnCod ;
   private boolean[] P086D8_n840TrnCod ;
   private String[] P086D8_A396EmprCod ;
   private java.math.BigDecimal[] P086D8_A60AlbRUniUti ;
   private int[] P086D8_A54AlbRPieUti ;
   private String[] P086D8_A50AlbRLoc ;
   private int[] P086D8_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D8_A58AlbRUniEnt ;
   private String[] P086D8_A1291AlbRDes ;
   private String[] P086D8_A1212TipEntNom ;
   private boolean[] P086D8_n1212TipEntNom ;
   private short[] P086D8_A1211TipEntCod ;
   private boolean[] P086D8_n1211TipEntCod ;
   private String[] P086D8_A841TrnNom ;
   private boolean[] P086D8_n841TrnNom ;
   private String[] P086D8_A971ProceNom ;
   private boolean[] P086D8_n971ProceNom ;
   private short[] P086D8_A970ProceCod ;
   private boolean[] P086D8_n970ProceCod ;
   private String[] P086D8_A3613AlbRefDsc ;
   private String[] P086D8_A45AlbRef ;
   private String[] P086D8_A279CliNom ;
   private int[] P086D8_A252CliCod ;
   private java.util.Date[] P086D8_A4606AlbRHEn ;
   private boolean[] P086D8_n4606AlbRHEn ;
   private java.util.Date[] P086D8_A49AlbRFen ;
   private String[] P086D8_A5806AlbREnt2 ;
   private String[] P086D8_A46AlbREnt ;
   private int[] P086D8_A44AlbRecCod ;
   private String[] P086D8_A55AlbRReo ;
   private String[] P086D8_A56AlbRUni ;
   private short[] P086D9_A1211TipEntCod ;
   private boolean[] P086D9_n1211TipEntCod ;
   private String[] P086D9_A396EmprCod ;
   private java.math.BigDecimal[] P086D9_A60AlbRUniUti ;
   private int[] P086D9_A54AlbRPieUti ;
   private String[] P086D9_A50AlbRLoc ;
   private int[] P086D9_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D9_A58AlbRUniEnt ;
   private String[] P086D9_A1291AlbRDes ;
   private String[] P086D9_A1212TipEntNom ;
   private boolean[] P086D9_n1212TipEntNom ;
   private String[] P086D9_A841TrnNom ;
   private boolean[] P086D9_n841TrnNom ;
   private short[] P086D9_A840TrnCod ;
   private boolean[] P086D9_n840TrnCod ;
   private String[] P086D9_A971ProceNom ;
   private boolean[] P086D9_n971ProceNom ;
   private short[] P086D9_A970ProceCod ;
   private boolean[] P086D9_n970ProceCod ;
   private String[] P086D9_A3613AlbRefDsc ;
   private String[] P086D9_A45AlbRef ;
   private String[] P086D9_A279CliNom ;
   private int[] P086D9_A252CliCod ;
   private java.util.Date[] P086D9_A4606AlbRHEn ;
   private boolean[] P086D9_n4606AlbRHEn ;
   private java.util.Date[] P086D9_A49AlbRFen ;
   private String[] P086D9_A5806AlbREnt2 ;
   private String[] P086D9_A46AlbREnt ;
   private int[] P086D9_A44AlbRecCod ;
   private String[] P086D9_A55AlbRReo ;
   private String[] P086D9_A56AlbRUni ;
   private String[] P086D10_A396EmprCod ;
   private String[] P086D10_A1291AlbRDes ;
   private java.math.BigDecimal[] P086D10_A60AlbRUniUti ;
   private int[] P086D10_A54AlbRPieUti ;
   private String[] P086D10_A50AlbRLoc ;
   private int[] P086D10_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D10_A58AlbRUniEnt ;
   private String[] P086D10_A1212TipEntNom ;
   private boolean[] P086D10_n1212TipEntNom ;
   private short[] P086D10_A1211TipEntCod ;
   private boolean[] P086D10_n1211TipEntCod ;
   private String[] P086D10_A841TrnNom ;
   private boolean[] P086D10_n841TrnNom ;
   private short[] P086D10_A840TrnCod ;
   private boolean[] P086D10_n840TrnCod ;
   private String[] P086D10_A971ProceNom ;
   private boolean[] P086D10_n971ProceNom ;
   private short[] P086D10_A970ProceCod ;
   private boolean[] P086D10_n970ProceCod ;
   private String[] P086D10_A3613AlbRefDsc ;
   private String[] P086D10_A45AlbRef ;
   private String[] P086D10_A279CliNom ;
   private int[] P086D10_A252CliCod ;
   private java.util.Date[] P086D10_A4606AlbRHEn ;
   private boolean[] P086D10_n4606AlbRHEn ;
   private java.util.Date[] P086D10_A49AlbRFen ;
   private String[] P086D10_A5806AlbREnt2 ;
   private String[] P086D10_A46AlbREnt ;
   private int[] P086D10_A44AlbRecCod ;
   private String[] P086D10_A55AlbRReo ;
   private String[] P086D10_A56AlbRUni ;
   private String[] P086D11_A396EmprCod ;
   private String[] P086D11_A50AlbRLoc ;
   private java.math.BigDecimal[] P086D11_A60AlbRUniUti ;
   private int[] P086D11_A54AlbRPieUti ;
   private int[] P086D11_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086D11_A58AlbRUniEnt ;
   private String[] P086D11_A1291AlbRDes ;
   private String[] P086D11_A1212TipEntNom ;
   private boolean[] P086D11_n1212TipEntNom ;
   private short[] P086D11_A1211TipEntCod ;
   private boolean[] P086D11_n1211TipEntCod ;
   private String[] P086D11_A841TrnNom ;
   private boolean[] P086D11_n841TrnNom ;
   private short[] P086D11_A840TrnCod ;
   private boolean[] P086D11_n840TrnCod ;
   private String[] P086D11_A971ProceNom ;
   private boolean[] P086D11_n971ProceNom ;
   private short[] P086D11_A970ProceCod ;
   private boolean[] P086D11_n970ProceCod ;
   private String[] P086D11_A3613AlbRefDsc ;
   private String[] P086D11_A45AlbRef ;
   private String[] P086D11_A279CliNom ;
   private int[] P086D11_A252CliCod ;
   private java.util.Date[] P086D11_A4606AlbRHEn ;
   private boolean[] P086D11_n4606AlbRHEn ;
   private java.util.Date[] P086D11_A49AlbRFen ;
   private String[] P086D11_A5806AlbREnt2 ;
   private String[] P086D11_A46AlbREnt ;
   private int[] P086D11_A44AlbRecCod ;
   private String[] P086D11_A55AlbRReo ;
   private String[] P086D11_A56AlbRUni ;
   private GXSimpleCollection<String> AV92TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV51TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ;
   private GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class talbdet2wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbREnt, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbREnt" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P086D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[40];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbREnt2, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbREnt2" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P086D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T5.CliNom, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.CliNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P086D5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[40];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRef, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P086D6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[40];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRefDsc, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P086D7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[40];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T3.TipEntNom, T1.TipEntCod, T4.TrnNom, T1.TrnCod," ;
      scmdbuf += " T2.ProceNom, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipEntCod = T1.TipEntCod)" ;
      scmdbuf += " LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProceNom = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipEntNom = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P086D8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[40];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T3.TipEntNom, T1.TipEntCod, T2.TrnNom, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) LEFT JOIN TXPENTRAD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipEntCod = T1.TipEntCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipEntNom = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P086D9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV99Talbdet2wwds_2_tfalbreccod ,
                                          int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV101Talbdet2wwds_4_tfalbrent ,
                                          String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV103Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                          int AV107Talbdet2wwds_10_tfclicod ,
                                          int AV108Talbdet2wwds_11_tfclicod_to ,
                                          String AV110Talbdet2wwds_13_tfclinom_sel ,
                                          String AV109Talbdet2wwds_12_tfclinom ,
                                          String AV112Talbdet2wwds_15_tfalbref_sel ,
                                          String AV111Talbdet2wwds_14_tfalbref ,
                                          String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV115Talbdet2wwds_18_tfprocecod ,
                                          short AV116Talbdet2wwds_19_tfprocecod_to ,
                                          String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV117Talbdet2wwds_20_tfprocenom ,
                                          short AV119Talbdet2wwds_22_tftrncod ,
                                          short AV120Talbdet2wwds_23_tftrncod_to ,
                                          String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV121Talbdet2wwds_24_tftrnnom ,
                                          short AV123Talbdet2wwds_26_tftipentcod ,
                                          short AV124Talbdet2wwds_27_tftipentcod_to ,
                                          String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV125Talbdet2wwds_28_tftipentnom ,
                                          String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV127Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV132Talbdet2wwds_35_tfalbrpieent ,
                                          int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV134Talbdet2wwds_37_tfalbrloc ,
                                          int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[40];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.TipEntCod, T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipEntCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P086D10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           int AV99Talbdet2wwds_2_tfalbreccod ,
                                           int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                           String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           String AV101Talbdet2wwds_4_tfalbrent ,
                                           String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           String AV103Talbdet2wwds_6_tfalbrent2 ,
                                           java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                           java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                           int AV107Talbdet2wwds_10_tfclicod ,
                                           int AV108Talbdet2wwds_11_tfclicod_to ,
                                           String AV110Talbdet2wwds_13_tfclinom_sel ,
                                           String AV109Talbdet2wwds_12_tfclinom ,
                                           String AV112Talbdet2wwds_15_tfalbref_sel ,
                                           String AV111Talbdet2wwds_14_tfalbref ,
                                           String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           short AV115Talbdet2wwds_18_tfprocecod ,
                                           short AV116Talbdet2wwds_19_tfprocecod_to ,
                                           String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           String AV117Talbdet2wwds_20_tfprocenom ,
                                           short AV119Talbdet2wwds_22_tftrncod ,
                                           short AV120Talbdet2wwds_23_tftrncod_to ,
                                           String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           String AV121Talbdet2wwds_24_tftrnnom ,
                                           short AV123Talbdet2wwds_26_tftipentcod ,
                                           short AV124Talbdet2wwds_27_tftipentcod_to ,
                                           String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           String AV125Talbdet2wwds_28_tftipentnom ,
                                           String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           String AV127Talbdet2wwds_30_tfalbrdes ,
                                           java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                           java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                           int AV132Talbdet2wwds_35_tfalbrpieent ,
                                           int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                           String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           String AV134Talbdet2wwds_37_tfalbrloc ,
                                           int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                           int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                           int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                           java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                           java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           int A44AlbRecCod ,
                                           String A46AlbREnt ,
                                           String A5806AlbREnt2 ,
                                           java.util.Date A49AlbRFen ,
                                           java.util.Date A4606AlbRHEn ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A45AlbRef ,
                                           String A3613AlbRefDsc ,
                                           short A970ProceCod ,
                                           String A971ProceNom ,
                                           short A840TrnCod ,
                                           String A841TrnNom ,
                                           short A1211TipEntCod ,
                                           String A1212TipEntNom ,
                                           String A1291AlbRDes ,
                                           java.math.BigDecimal A58AlbRUniEnt ,
                                           int A52AlbRPieEnt ,
                                           String A50AlbRLoc ,
                                           int A54AlbRPieUti ,
                                           java.math.BigDecimal A60AlbRUniUti ,
                                           String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[40];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRDes, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRDes" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P086D11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV131Talbdet2wwds_34_tfalbruni_sels ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV136Talbdet2wwds_39_tfalbrreo_sels ,
                                           int AV99Talbdet2wwds_2_tfalbreccod ,
                                           int AV100Talbdet2wwds_3_tfalbreccod_to ,
                                           String AV102Talbdet2wwds_5_tfalbrent_sel ,
                                           String AV101Talbdet2wwds_4_tfalbrent ,
                                           String AV104Talbdet2wwds_7_tfalbrent2_sel ,
                                           String AV103Talbdet2wwds_6_tfalbrent2 ,
                                           java.util.Date AV105Talbdet2wwds_8_tfalbrfen ,
                                           java.util.Date AV106Talbdet2wwds_9_tfalbrhen ,
                                           int AV107Talbdet2wwds_10_tfclicod ,
                                           int AV108Talbdet2wwds_11_tfclicod_to ,
                                           String AV110Talbdet2wwds_13_tfclinom_sel ,
                                           String AV109Talbdet2wwds_12_tfclinom ,
                                           String AV112Talbdet2wwds_15_tfalbref_sel ,
                                           String AV111Talbdet2wwds_14_tfalbref ,
                                           String AV114Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           String AV113Talbdet2wwds_16_tfalbrefdsc ,
                                           short AV115Talbdet2wwds_18_tfprocecod ,
                                           short AV116Talbdet2wwds_19_tfprocecod_to ,
                                           String AV118Talbdet2wwds_21_tfprocenom_sel ,
                                           String AV117Talbdet2wwds_20_tfprocenom ,
                                           short AV119Talbdet2wwds_22_tftrncod ,
                                           short AV120Talbdet2wwds_23_tftrncod_to ,
                                           String AV122Talbdet2wwds_25_tftrnnom_sel ,
                                           String AV121Talbdet2wwds_24_tftrnnom ,
                                           short AV123Talbdet2wwds_26_tftipentcod ,
                                           short AV124Talbdet2wwds_27_tftipentcod_to ,
                                           String AV126Talbdet2wwds_29_tftipentnom_sel ,
                                           String AV125Talbdet2wwds_28_tftipentnom ,
                                           String AV128Talbdet2wwds_31_tfalbrdes_sel ,
                                           String AV127Talbdet2wwds_30_tfalbrdes ,
                                           java.math.BigDecimal AV129Talbdet2wwds_32_tfalbrunient ,
                                           java.math.BigDecimal AV130Talbdet2wwds_33_tfalbrunient_to ,
                                           int AV131Talbdet2wwds_34_tfalbruni_sels_size ,
                                           int AV132Talbdet2wwds_35_tfalbrpieent ,
                                           int AV133Talbdet2wwds_36_tfalbrpieent_to ,
                                           String AV135Talbdet2wwds_38_tfalbrloc_sel ,
                                           String AV134Talbdet2wwds_37_tfalbrloc ,
                                           int AV136Talbdet2wwds_39_tfalbrreo_sels_size ,
                                           int AV137Talbdet2wwds_40_tfalbrpieuti ,
                                           int AV138Talbdet2wwds_41_tfalbrpieuti_to ,
                                           java.math.BigDecimal AV139Talbdet2wwds_42_tfalbruniuti ,
                                           java.math.BigDecimal AV140Talbdet2wwds_43_tfalbruniuti_to ,
                                           int A44AlbRecCod ,
                                           String A46AlbREnt ,
                                           String A5806AlbREnt2 ,
                                           java.util.Date A49AlbRFen ,
                                           java.util.Date A4606AlbRHEn ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A45AlbRef ,
                                           String A3613AlbRefDsc ,
                                           short A970ProceCod ,
                                           String A971ProceNom ,
                                           short A840TrnCod ,
                                           String A841TrnNom ,
                                           short A1211TipEntCod ,
                                           String A1212TipEntNom ,
                                           String A1291AlbRDes ,
                                           java.math.BigDecimal A58AlbRUniEnt ,
                                           int A52AlbRPieEnt ,
                                           String A50AlbRLoc ,
                                           int A54AlbRPieUti ,
                                           java.math.BigDecimal A60AlbRUniUti ,
                                           String AV98Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[40];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRLoc, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV99Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV101Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV103Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV106Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (0==AV107Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (0==AV108Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV119Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV123Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV127Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( AV131Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV132Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRLoc" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_P086D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 1 :
                  return conditional_P086D3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 2 :
                  return conditional_P086D4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 3 :
                  return conditional_P086D5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 4 :
                  return conditional_P086D6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 5 :
                  return conditional_P086D7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 6 :
                  return conditional_P086D8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 7 :
                  return conditional_P086D9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 8 :
                  return conditional_P086D10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
            case 9 :
                  return conditional_P086D11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086D11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 20);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

