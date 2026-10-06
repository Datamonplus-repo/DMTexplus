package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbdetwwgetfilterdata extends GXProcedure
{
   public talbdetwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdetwwgetfilterdata.class ), "" );
   }

   public talbdetwwgetfilterdata( int remoteHandle ,
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
      talbdetwwgetfilterdata.this.aP5 = new String[] {""};
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
      talbdetwwgetfilterdata.this.AV58DDOName = aP0;
      talbdetwwgetfilterdata.this.AV56SearchTxt = aP1;
      talbdetwwgetfilterdata.this.AV57SearchTxtTo = aP2;
      talbdetwwgetfilterdata.this.aP3 = aP3;
      talbdetwwgetfilterdata.this.aP4 = aP4;
      talbdetwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV69Session.getValue("TALBDETWWGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDETWWGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("TALBDETWWGridState"), null, null);
      }
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV102FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
            AV97TFAlbRUni_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV98TFAlbRUni_Sels.fromJSonString(AV97TFAlbRUni_SelsJson, null);
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
         AV105GXV1 = (int)(AV105GXV1+1) ;
      }
      if ( AV71GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV73GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV71GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV74DynamicFiltersSelector1 = AV73GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV74DynamicFiltersSelector1, "ALBREST") == 0 )
         {
            AV91AlbREst1 = (byte)(GXutil.lval( AV73GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
         }
         if ( AV71GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV79DynamicFiltersEnabled2 = true ;
            AV73GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV71GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV80DynamicFiltersSelector2 = AV73GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV80DynamicFiltersSelector2, "ALBREST") == 0 )
            {
               AV93AlbREst2 = (byte)(GXutil.lval( AV73GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
            }
            if ( AV71GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV85DynamicFiltersEnabled3 = true ;
               AV73GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV71GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV86DynamicFiltersSelector3 = AV73GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV86DynamicFiltersSelector3, "ALBREST") == 0 )
               {
                  AV95AlbREst3 = (byte)(GXutil.lval( AV73GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'LOADALBRENTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbREnt = AV56SearchTxt ;
      AV13TFAlbREnt_Sel = "" ;
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08582 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8582 = false ;
         A396EmprCod = P08582_A396EmprCod[0] ;
         A46AlbREnt = P08582_A46AlbREnt[0] ;
         A60AlbRUniUti = P08582_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08582_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08582_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08582_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08582_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08582_A1291AlbRDes[0] ;
         A1212TipEntNom = P08582_A1212TipEntNom[0] ;
         n1212TipEntNom = P08582_n1212TipEntNom[0] ;
         A1211TipEntCod = P08582_A1211TipEntCod[0] ;
         n1211TipEntCod = P08582_n1211TipEntCod[0] ;
         A841TrnNom = P08582_A841TrnNom[0] ;
         n841TrnNom = P08582_n841TrnNom[0] ;
         A840TrnCod = P08582_A840TrnCod[0] ;
         n840TrnCod = P08582_n840TrnCod[0] ;
         A971ProceNom = P08582_A971ProceNom[0] ;
         n971ProceNom = P08582_n971ProceNom[0] ;
         A970ProceCod = P08582_A970ProceCod[0] ;
         n970ProceCod = P08582_n970ProceCod[0] ;
         A3613AlbRefDsc = P08582_A3613AlbRefDsc[0] ;
         A45AlbRef = P08582_A45AlbRef[0] ;
         A279CliNom = P08582_A279CliNom[0] ;
         A252CliCod = P08582_A252CliCod[0] ;
         A4606AlbRHEn = P08582_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08582_n4606AlbRHEn[0] ;
         A49AlbRFen = P08582_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08582_A5806AlbREnt2[0] ;
         A44AlbRecCod = P08582_A44AlbRecCod[0] ;
         A47AlbREst = P08582_A47AlbREst[0] ;
         A55AlbRReo = P08582_A55AlbRReo[0] ;
         A56AlbRUni = P08582_A56AlbRUni[0] ;
         A1212TipEntNom = P08582_A1212TipEntNom[0] ;
         n1212TipEntNom = P08582_n1212TipEntNom[0] ;
         A841TrnNom = P08582_A841TrnNom[0] ;
         n841TrnNom = P08582_n841TrnNom[0] ;
         A971ProceNom = P08582_A971ProceNom[0] ;
         n971ProceNom = P08582_n971ProceNom[0] ;
         A279CliNom = P08582_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08582_A46AlbREnt[0], A46AlbREnt) == 0 ) )
            {
               brk8582 = false ;
               A396EmprCod = P08582_A396EmprCod[0] ;
               A44AlbRecCod = P08582_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8582 = true ;
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
         if ( ! brk8582 )
         {
            brk8582 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08583 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8584 = false ;
         A396EmprCod = P08583_A396EmprCod[0] ;
         A5806AlbREnt2 = P08583_A5806AlbREnt2[0] ;
         A60AlbRUniUti = P08583_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08583_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08583_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08583_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08583_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08583_A1291AlbRDes[0] ;
         A1212TipEntNom = P08583_A1212TipEntNom[0] ;
         n1212TipEntNom = P08583_n1212TipEntNom[0] ;
         A1211TipEntCod = P08583_A1211TipEntCod[0] ;
         n1211TipEntCod = P08583_n1211TipEntCod[0] ;
         A841TrnNom = P08583_A841TrnNom[0] ;
         n841TrnNom = P08583_n841TrnNom[0] ;
         A840TrnCod = P08583_A840TrnCod[0] ;
         n840TrnCod = P08583_n840TrnCod[0] ;
         A971ProceNom = P08583_A971ProceNom[0] ;
         n971ProceNom = P08583_n971ProceNom[0] ;
         A970ProceCod = P08583_A970ProceCod[0] ;
         n970ProceCod = P08583_n970ProceCod[0] ;
         A3613AlbRefDsc = P08583_A3613AlbRefDsc[0] ;
         A45AlbRef = P08583_A45AlbRef[0] ;
         A279CliNom = P08583_A279CliNom[0] ;
         A252CliCod = P08583_A252CliCod[0] ;
         A4606AlbRHEn = P08583_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08583_n4606AlbRHEn[0] ;
         A49AlbRFen = P08583_A49AlbRFen[0] ;
         A46AlbREnt = P08583_A46AlbREnt[0] ;
         A44AlbRecCod = P08583_A44AlbRecCod[0] ;
         A47AlbREst = P08583_A47AlbREst[0] ;
         A55AlbRReo = P08583_A55AlbRReo[0] ;
         A56AlbRUni = P08583_A56AlbRUni[0] ;
         A1212TipEntNom = P08583_A1212TipEntNom[0] ;
         n1212TipEntNom = P08583_n1212TipEntNom[0] ;
         A841TrnNom = P08583_A841TrnNom[0] ;
         n841TrnNom = P08583_n841TrnNom[0] ;
         A971ProceNom = P08583_A971ProceNom[0] ;
         n971ProceNom = P08583_n971ProceNom[0] ;
         A279CliNom = P08583_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08583_A5806AlbREnt2[0], A5806AlbREnt2) == 0 ) )
            {
               brk8584 = false ;
               A396EmprCod = P08583_A396EmprCod[0] ;
               A44AlbRecCod = P08583_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8584 = true ;
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
         if ( ! brk8584 )
         {
            brk8584 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08584 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8586 = false ;
         A396EmprCod = P08584_A396EmprCod[0] ;
         A279CliNom = P08584_A279CliNom[0] ;
         A60AlbRUniUti = P08584_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08584_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08584_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08584_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08584_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08584_A1291AlbRDes[0] ;
         A1212TipEntNom = P08584_A1212TipEntNom[0] ;
         n1212TipEntNom = P08584_n1212TipEntNom[0] ;
         A1211TipEntCod = P08584_A1211TipEntCod[0] ;
         n1211TipEntCod = P08584_n1211TipEntCod[0] ;
         A841TrnNom = P08584_A841TrnNom[0] ;
         n841TrnNom = P08584_n841TrnNom[0] ;
         A840TrnCod = P08584_A840TrnCod[0] ;
         n840TrnCod = P08584_n840TrnCod[0] ;
         A971ProceNom = P08584_A971ProceNom[0] ;
         n971ProceNom = P08584_n971ProceNom[0] ;
         A970ProceCod = P08584_A970ProceCod[0] ;
         n970ProceCod = P08584_n970ProceCod[0] ;
         A3613AlbRefDsc = P08584_A3613AlbRefDsc[0] ;
         A45AlbRef = P08584_A45AlbRef[0] ;
         A252CliCod = P08584_A252CliCod[0] ;
         A4606AlbRHEn = P08584_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08584_n4606AlbRHEn[0] ;
         A49AlbRFen = P08584_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08584_A5806AlbREnt2[0] ;
         A46AlbREnt = P08584_A46AlbREnt[0] ;
         A44AlbRecCod = P08584_A44AlbRecCod[0] ;
         A47AlbREst = P08584_A47AlbREst[0] ;
         A55AlbRReo = P08584_A55AlbRReo[0] ;
         A56AlbRUni = P08584_A56AlbRUni[0] ;
         A1212TipEntNom = P08584_A1212TipEntNom[0] ;
         n1212TipEntNom = P08584_n1212TipEntNom[0] ;
         A841TrnNom = P08584_A841TrnNom[0] ;
         n841TrnNom = P08584_n841TrnNom[0] ;
         A971ProceNom = P08584_A971ProceNom[0] ;
         n971ProceNom = P08584_n971ProceNom[0] ;
         A279CliNom = P08584_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08584_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk8586 = false ;
               A396EmprCod = P08584_A396EmprCod[0] ;
               A252CliCod = P08584_A252CliCod[0] ;
               A44AlbRecCod = P08584_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8586 = true ;
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
         if ( ! brk8586 )
         {
            brk8586 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08585 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8588 = false ;
         A396EmprCod = P08585_A396EmprCod[0] ;
         A45AlbRef = P08585_A45AlbRef[0] ;
         A60AlbRUniUti = P08585_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08585_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08585_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08585_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08585_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08585_A1291AlbRDes[0] ;
         A1212TipEntNom = P08585_A1212TipEntNom[0] ;
         n1212TipEntNom = P08585_n1212TipEntNom[0] ;
         A1211TipEntCod = P08585_A1211TipEntCod[0] ;
         n1211TipEntCod = P08585_n1211TipEntCod[0] ;
         A841TrnNom = P08585_A841TrnNom[0] ;
         n841TrnNom = P08585_n841TrnNom[0] ;
         A840TrnCod = P08585_A840TrnCod[0] ;
         n840TrnCod = P08585_n840TrnCod[0] ;
         A971ProceNom = P08585_A971ProceNom[0] ;
         n971ProceNom = P08585_n971ProceNom[0] ;
         A970ProceCod = P08585_A970ProceCod[0] ;
         n970ProceCod = P08585_n970ProceCod[0] ;
         A3613AlbRefDsc = P08585_A3613AlbRefDsc[0] ;
         A279CliNom = P08585_A279CliNom[0] ;
         A252CliCod = P08585_A252CliCod[0] ;
         A4606AlbRHEn = P08585_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08585_n4606AlbRHEn[0] ;
         A49AlbRFen = P08585_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08585_A5806AlbREnt2[0] ;
         A46AlbREnt = P08585_A46AlbREnt[0] ;
         A44AlbRecCod = P08585_A44AlbRecCod[0] ;
         A47AlbREst = P08585_A47AlbREst[0] ;
         A55AlbRReo = P08585_A55AlbRReo[0] ;
         A56AlbRUni = P08585_A56AlbRUni[0] ;
         A1212TipEntNom = P08585_A1212TipEntNom[0] ;
         n1212TipEntNom = P08585_n1212TipEntNom[0] ;
         A841TrnNom = P08585_A841TrnNom[0] ;
         n841TrnNom = P08585_n841TrnNom[0] ;
         A971ProceNom = P08585_A971ProceNom[0] ;
         n971ProceNom = P08585_n971ProceNom[0] ;
         A279CliNom = P08585_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08585_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk8588 = false ;
               A396EmprCod = P08585_A396EmprCod[0] ;
               A44AlbRecCod = P08585_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8588 = true ;
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
         if ( ! brk8588 )
         {
            brk8588 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08586 */
      pr_default.execute(4, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk85810 = false ;
         A396EmprCod = P08586_A396EmprCod[0] ;
         A3613AlbRefDsc = P08586_A3613AlbRefDsc[0] ;
         A60AlbRUniUti = P08586_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08586_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08586_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08586_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08586_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08586_A1291AlbRDes[0] ;
         A1212TipEntNom = P08586_A1212TipEntNom[0] ;
         n1212TipEntNom = P08586_n1212TipEntNom[0] ;
         A1211TipEntCod = P08586_A1211TipEntCod[0] ;
         n1211TipEntCod = P08586_n1211TipEntCod[0] ;
         A841TrnNom = P08586_A841TrnNom[0] ;
         n841TrnNom = P08586_n841TrnNom[0] ;
         A840TrnCod = P08586_A840TrnCod[0] ;
         n840TrnCod = P08586_n840TrnCod[0] ;
         A971ProceNom = P08586_A971ProceNom[0] ;
         n971ProceNom = P08586_n971ProceNom[0] ;
         A970ProceCod = P08586_A970ProceCod[0] ;
         n970ProceCod = P08586_n970ProceCod[0] ;
         A45AlbRef = P08586_A45AlbRef[0] ;
         A279CliNom = P08586_A279CliNom[0] ;
         A252CliCod = P08586_A252CliCod[0] ;
         A4606AlbRHEn = P08586_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08586_n4606AlbRHEn[0] ;
         A49AlbRFen = P08586_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08586_A5806AlbREnt2[0] ;
         A46AlbREnt = P08586_A46AlbREnt[0] ;
         A44AlbRecCod = P08586_A44AlbRecCod[0] ;
         A47AlbREst = P08586_A47AlbREst[0] ;
         A55AlbRReo = P08586_A55AlbRReo[0] ;
         A56AlbRUni = P08586_A56AlbRUni[0] ;
         A1212TipEntNom = P08586_A1212TipEntNom[0] ;
         n1212TipEntNom = P08586_n1212TipEntNom[0] ;
         A841TrnNom = P08586_A841TrnNom[0] ;
         n841TrnNom = P08586_n841TrnNom[0] ;
         A971ProceNom = P08586_A971ProceNom[0] ;
         n971ProceNom = P08586_n971ProceNom[0] ;
         A279CliNom = P08586_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08586_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
            {
               brk85810 = false ;
               A396EmprCod = P08586_A396EmprCod[0] ;
               A44AlbRecCod = P08586_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk85810 = true ;
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
         if ( ! brk85810 )
         {
            brk85810 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08587 */
      pr_default.execute(5, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk85812 = false ;
         A970ProceCod = P08587_A970ProceCod[0] ;
         n970ProceCod = P08587_n970ProceCod[0] ;
         A396EmprCod = P08587_A396EmprCod[0] ;
         A60AlbRUniUti = P08587_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08587_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08587_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08587_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08587_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08587_A1291AlbRDes[0] ;
         A1212TipEntNom = P08587_A1212TipEntNom[0] ;
         n1212TipEntNom = P08587_n1212TipEntNom[0] ;
         A1211TipEntCod = P08587_A1211TipEntCod[0] ;
         n1211TipEntCod = P08587_n1211TipEntCod[0] ;
         A841TrnNom = P08587_A841TrnNom[0] ;
         n841TrnNom = P08587_n841TrnNom[0] ;
         A840TrnCod = P08587_A840TrnCod[0] ;
         n840TrnCod = P08587_n840TrnCod[0] ;
         A971ProceNom = P08587_A971ProceNom[0] ;
         n971ProceNom = P08587_n971ProceNom[0] ;
         A3613AlbRefDsc = P08587_A3613AlbRefDsc[0] ;
         A45AlbRef = P08587_A45AlbRef[0] ;
         A279CliNom = P08587_A279CliNom[0] ;
         A252CliCod = P08587_A252CliCod[0] ;
         A4606AlbRHEn = P08587_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08587_n4606AlbRHEn[0] ;
         A49AlbRFen = P08587_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08587_A5806AlbREnt2[0] ;
         A46AlbREnt = P08587_A46AlbREnt[0] ;
         A44AlbRecCod = P08587_A44AlbRecCod[0] ;
         A47AlbREst = P08587_A47AlbREst[0] ;
         A55AlbRReo = P08587_A55AlbRReo[0] ;
         A56AlbRUni = P08587_A56AlbRUni[0] ;
         A971ProceNom = P08587_A971ProceNom[0] ;
         n971ProceNom = P08587_n971ProceNom[0] ;
         A1212TipEntNom = P08587_A1212TipEntNom[0] ;
         n1212TipEntNom = P08587_n1212TipEntNom[0] ;
         A841TrnNom = P08587_A841TrnNom[0] ;
         n841TrnNom = P08587_n841TrnNom[0] ;
         A279CliNom = P08587_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08587_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08587_A970ProceCod[0] == A970ProceCod ) )
            {
               brk85812 = false ;
               A44AlbRecCod = P08587_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk85812 = true ;
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
         if ( ! brk85812 )
         {
            brk85812 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08588 */
      pr_default.execute(6, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk85814 = false ;
         A840TrnCod = P08588_A840TrnCod[0] ;
         n840TrnCod = P08588_n840TrnCod[0] ;
         A396EmprCod = P08588_A396EmprCod[0] ;
         A60AlbRUniUti = P08588_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08588_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08588_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08588_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08588_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08588_A1291AlbRDes[0] ;
         A1212TipEntNom = P08588_A1212TipEntNom[0] ;
         n1212TipEntNom = P08588_n1212TipEntNom[0] ;
         A1211TipEntCod = P08588_A1211TipEntCod[0] ;
         n1211TipEntCod = P08588_n1211TipEntCod[0] ;
         A841TrnNom = P08588_A841TrnNom[0] ;
         n841TrnNom = P08588_n841TrnNom[0] ;
         A971ProceNom = P08588_A971ProceNom[0] ;
         n971ProceNom = P08588_n971ProceNom[0] ;
         A970ProceCod = P08588_A970ProceCod[0] ;
         n970ProceCod = P08588_n970ProceCod[0] ;
         A3613AlbRefDsc = P08588_A3613AlbRefDsc[0] ;
         A45AlbRef = P08588_A45AlbRef[0] ;
         A279CliNom = P08588_A279CliNom[0] ;
         A252CliCod = P08588_A252CliCod[0] ;
         A4606AlbRHEn = P08588_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08588_n4606AlbRHEn[0] ;
         A49AlbRFen = P08588_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08588_A5806AlbREnt2[0] ;
         A46AlbREnt = P08588_A46AlbREnt[0] ;
         A44AlbRecCod = P08588_A44AlbRecCod[0] ;
         A47AlbREst = P08588_A47AlbREst[0] ;
         A55AlbRReo = P08588_A55AlbRReo[0] ;
         A56AlbRUni = P08588_A56AlbRUni[0] ;
         A841TrnNom = P08588_A841TrnNom[0] ;
         n841TrnNom = P08588_n841TrnNom[0] ;
         A1212TipEntNom = P08588_A1212TipEntNom[0] ;
         n1212TipEntNom = P08588_n1212TipEntNom[0] ;
         A971ProceNom = P08588_A971ProceNom[0] ;
         n971ProceNom = P08588_n971ProceNom[0] ;
         A279CliNom = P08588_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08588_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08588_A840TrnCod[0] == A840TrnCod ) )
            {
               brk85814 = false ;
               A44AlbRecCod = P08588_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk85814 = true ;
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
         if ( ! brk85814 )
         {
            brk85814 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08589 */
      pr_default.execute(7, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk85816 = false ;
         A1211TipEntCod = P08589_A1211TipEntCod[0] ;
         n1211TipEntCod = P08589_n1211TipEntCod[0] ;
         A396EmprCod = P08589_A396EmprCod[0] ;
         A60AlbRUniUti = P08589_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08589_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08589_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08589_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08589_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08589_A1291AlbRDes[0] ;
         A1212TipEntNom = P08589_A1212TipEntNom[0] ;
         n1212TipEntNom = P08589_n1212TipEntNom[0] ;
         A841TrnNom = P08589_A841TrnNom[0] ;
         n841TrnNom = P08589_n841TrnNom[0] ;
         A840TrnCod = P08589_A840TrnCod[0] ;
         n840TrnCod = P08589_n840TrnCod[0] ;
         A971ProceNom = P08589_A971ProceNom[0] ;
         n971ProceNom = P08589_n971ProceNom[0] ;
         A970ProceCod = P08589_A970ProceCod[0] ;
         n970ProceCod = P08589_n970ProceCod[0] ;
         A3613AlbRefDsc = P08589_A3613AlbRefDsc[0] ;
         A45AlbRef = P08589_A45AlbRef[0] ;
         A279CliNom = P08589_A279CliNom[0] ;
         A252CliCod = P08589_A252CliCod[0] ;
         A4606AlbRHEn = P08589_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08589_n4606AlbRHEn[0] ;
         A49AlbRFen = P08589_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08589_A5806AlbREnt2[0] ;
         A46AlbREnt = P08589_A46AlbREnt[0] ;
         A44AlbRecCod = P08589_A44AlbRecCod[0] ;
         A47AlbREst = P08589_A47AlbREst[0] ;
         A55AlbRReo = P08589_A55AlbRReo[0] ;
         A56AlbRUni = P08589_A56AlbRUni[0] ;
         A1212TipEntNom = P08589_A1212TipEntNom[0] ;
         n1212TipEntNom = P08589_n1212TipEntNom[0] ;
         A841TrnNom = P08589_A841TrnNom[0] ;
         n841TrnNom = P08589_n841TrnNom[0] ;
         A971ProceNom = P08589_A971ProceNom[0] ;
         n971ProceNom = P08589_n971ProceNom[0] ;
         A279CliNom = P08589_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08589_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08589_A1211TipEntCod[0] == A1211TipEntCod ) )
            {
               brk85816 = false ;
               A44AlbRecCod = P08589_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk85816 = true ;
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
         if ( ! brk85816 )
         {
            brk85816 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P085810 */
      pr_default.execute(8, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk85818 = false ;
         A396EmprCod = P085810_A396EmprCod[0] ;
         A1291AlbRDes = P085810_A1291AlbRDes[0] ;
         A60AlbRUniUti = P085810_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P085810_A54AlbRPieUti[0] ;
         A50AlbRLoc = P085810_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P085810_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P085810_A58AlbRUniEnt[0] ;
         A1212TipEntNom = P085810_A1212TipEntNom[0] ;
         n1212TipEntNom = P085810_n1212TipEntNom[0] ;
         A1211TipEntCod = P085810_A1211TipEntCod[0] ;
         n1211TipEntCod = P085810_n1211TipEntCod[0] ;
         A841TrnNom = P085810_A841TrnNom[0] ;
         n841TrnNom = P085810_n841TrnNom[0] ;
         A840TrnCod = P085810_A840TrnCod[0] ;
         n840TrnCod = P085810_n840TrnCod[0] ;
         A971ProceNom = P085810_A971ProceNom[0] ;
         n971ProceNom = P085810_n971ProceNom[0] ;
         A970ProceCod = P085810_A970ProceCod[0] ;
         n970ProceCod = P085810_n970ProceCod[0] ;
         A3613AlbRefDsc = P085810_A3613AlbRefDsc[0] ;
         A45AlbRef = P085810_A45AlbRef[0] ;
         A279CliNom = P085810_A279CliNom[0] ;
         A252CliCod = P085810_A252CliCod[0] ;
         A4606AlbRHEn = P085810_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P085810_n4606AlbRHEn[0] ;
         A49AlbRFen = P085810_A49AlbRFen[0] ;
         A5806AlbREnt2 = P085810_A5806AlbREnt2[0] ;
         A46AlbREnt = P085810_A46AlbREnt[0] ;
         A44AlbRecCod = P085810_A44AlbRecCod[0] ;
         A47AlbREst = P085810_A47AlbREst[0] ;
         A55AlbRReo = P085810_A55AlbRReo[0] ;
         A56AlbRUni = P085810_A56AlbRUni[0] ;
         A1212TipEntNom = P085810_A1212TipEntNom[0] ;
         n1212TipEntNom = P085810_n1212TipEntNom[0] ;
         A841TrnNom = P085810_A841TrnNom[0] ;
         n841TrnNom = P085810_n841TrnNom[0] ;
         A971ProceNom = P085810_A971ProceNom[0] ;
         n971ProceNom = P085810_n971ProceNom[0] ;
         A279CliNom = P085810_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P085810_A1291AlbRDes[0], A1291AlbRDes) == 0 ) )
            {
               brk85818 = false ;
               A396EmprCod = P085810_A396EmprCod[0] ;
               A44AlbRecCod = P085810_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk85818 = true ;
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
         if ( ! brk85818 )
         {
            brk85818 = true ;
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
      AV107Talbdetwwds_1_filterfulltext = AV102FilterFullText ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = AV74DynamicFiltersSelector1 ;
      AV109Talbdetwwds_3_albrest1 = AV91AlbREst1 ;
      AV110Talbdetwwds_4_dynamicfiltersenabled2 = AV79DynamicFiltersEnabled2 ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = AV80DynamicFiltersSelector2 ;
      AV112Talbdetwwds_6_albrest2 = AV93AlbREst2 ;
      AV113Talbdetwwds_7_dynamicfiltersenabled3 = AV85DynamicFiltersEnabled3 ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = AV86DynamicFiltersSelector3 ;
      AV115Talbdetwwds_9_albrest3 = AV95AlbREst3 ;
      AV116Talbdetwwds_10_tfalbreccod = AV10TFAlbRecCod ;
      AV117Talbdetwwds_11_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV118Talbdetwwds_12_tfalbrent = AV12TFAlbREnt ;
      AV119Talbdetwwds_13_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV120Talbdetwwds_14_tfalbrent2 = AV14TFAlbREnt2 ;
      AV121Talbdetwwds_15_tfalbrent2_sel = AV15TFAlbREnt2_Sel ;
      AV122Talbdetwwds_16_tfalbrfen = AV16TFAlbRFen ;
      AV123Talbdetwwds_17_tfalbrhen = AV18TFAlbRHEn ;
      AV124Talbdetwwds_18_tfclicod = AV20TFCliCod ;
      AV125Talbdetwwds_19_tfclicod_to = AV21TFCliCod_To ;
      AV126Talbdetwwds_20_tfclinom = AV22TFCliNom ;
      AV127Talbdetwwds_21_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Talbdetwwds_22_tfalbref = AV24TFAlbRef ;
      AV129Talbdetwwds_23_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV130Talbdetwwds_24_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV132Talbdetwwds_26_tfprocecod = AV28TFProceCod ;
      AV133Talbdetwwds_27_tfprocecod_to = AV29TFProceCod_To ;
      AV134Talbdetwwds_28_tfprocenom = AV30TFProceNom ;
      AV135Talbdetwwds_29_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV136Talbdetwwds_30_tftrncod = AV32TFTrnCod ;
      AV137Talbdetwwds_31_tftrncod_to = AV33TFTrnCod_To ;
      AV138Talbdetwwds_32_tftrnnom = AV34TFTrnNom ;
      AV139Talbdetwwds_33_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV140Talbdetwwds_34_tftipentcod = AV36TFTipEntCod ;
      AV141Talbdetwwds_35_tftipentcod_to = AV37TFTipEntCod_To ;
      AV142Talbdetwwds_36_tftipentnom = AV38TFTipEntNom ;
      AV143Talbdetwwds_37_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV144Talbdetwwds_38_tfalbrdes = AV40TFAlbRDes ;
      AV145Talbdetwwds_39_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV146Talbdetwwds_40_tfalbrunient = AV42TFAlbRUniEnt ;
      AV147Talbdetwwds_41_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV148Talbdetwwds_42_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV149Talbdetwwds_43_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV150Talbdetwwds_44_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV151Talbdetwwds_45_tfalbrloc = AV48TFAlbRLoc ;
      AV152Talbdetwwds_46_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV153Talbdetwwds_47_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      AV154Talbdetwwds_48_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV155Talbdetwwds_49_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV156Talbdetwwds_50_tfalbruniuti = AV54TFAlbRUniUti ;
      AV157Talbdetwwds_51_tfalbruniuti_to = AV55TFAlbRUniUti_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV148Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV110Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV113Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to) ,
                                           AV119Talbdetwwds_13_tfalbrent_sel ,
                                           AV118Talbdetwwds_12_tfalbrent ,
                                           AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           AV120Talbdetwwds_14_tfalbrent2 ,
                                           AV122Talbdetwwds_16_tfalbrfen ,
                                           AV123Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV124Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to) ,
                                           AV127Talbdetwwds_21_tfclinom_sel ,
                                           AV126Talbdetwwds_20_tfclinom ,
                                           AV129Talbdetwwds_23_tfalbref_sel ,
                                           AV128Talbdetwwds_22_tfalbref ,
                                           AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV130Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV132Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to) ,
                                           AV135Talbdetwwds_29_tfprocenom_sel ,
                                           AV134Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV136Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV137Talbdetwwds_31_tftrncod_to) ,
                                           AV139Talbdetwwds_33_tftrnnom_sel ,
                                           AV138Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV140Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to) ,
                                           AV143Talbdetwwds_37_tftipentnom_sel ,
                                           AV142Talbdetwwds_36_tftipentnom ,
                                           AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           AV144Talbdetwwds_38_tfalbrdes ,
                                           AV146Talbdetwwds_40_tfalbrunient ,
                                           AV147Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV148Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           AV151Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV153Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV156Talbdetwwds_50_tfalbruniuti ,
                                           AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV109Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV112Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV115Talbdetwwds_9_albrest3) ,
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
                                           AV107Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV118Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV118Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV120Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV120Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV126Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV126Talbdetwwds_20_tfclinom), 30, "%") ;
      lV128Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_22_tfalbref), 16, "%") ;
      lV130Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV134Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV138Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV142Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV142Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV144Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV151Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV151Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P085811 */
      pr_default.execute(9, new Object[] {Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV109Talbdetwwds_3_albrest1), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV112Talbdetwwds_6_albrest2), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Byte.valueOf(AV115Talbdetwwds_9_albrest3), Integer.valueOf(AV116Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV117Talbdetwwds_11_tfalbreccod_to), lV118Talbdetwwds_12_tfalbrent, AV119Talbdetwwds_13_tfalbrent_sel, lV120Talbdetwwds_14_tfalbrent2, AV121Talbdetwwds_15_tfalbrent2_sel, AV122Talbdetwwds_16_tfalbrfen, AV123Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV124Talbdetwwds_18_tfclicod), Integer.valueOf(AV125Talbdetwwds_19_tfclicod_to), lV126Talbdetwwds_20_tfclinom, AV127Talbdetwwds_21_tfclinom_sel, lV128Talbdetwwds_22_tfalbref, AV129Talbdetwwds_23_tfalbref_sel, lV130Talbdetwwds_24_tfalbrefdsc, AV131Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV132Talbdetwwds_26_tfprocecod), Short.valueOf(AV133Talbdetwwds_27_tfprocecod_to), lV134Talbdetwwds_28_tfprocenom, AV135Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV136Talbdetwwds_30_tftrncod), Short.valueOf(AV137Talbdetwwds_31_tftrncod_to), lV138Talbdetwwds_32_tftrnnom, AV139Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV140Talbdetwwds_34_tftipentcod), Short.valueOf(AV141Talbdetwwds_35_tftipentcod_to), lV142Talbdetwwds_36_tftipentnom, AV143Talbdetwwds_37_tftipentnom_sel, lV144Talbdetwwds_38_tfalbrdes, AV145Talbdetwwds_39_tfalbrdes_sel, AV146Talbdetwwds_40_tfalbrunient, AV147Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV149Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV150Talbdetwwds_44_tfalbrpieent_to), lV151Talbdetwwds_45_tfalbrloc, AV152Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV154Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV155Talbdetwwds_49_tfalbrpieuti_to), AV156Talbdetwwds_50_tfalbruniuti, AV157Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk85820 = false ;
         A396EmprCod = P085811_A396EmprCod[0] ;
         A50AlbRLoc = P085811_A50AlbRLoc[0] ;
         A60AlbRUniUti = P085811_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P085811_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P085811_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P085811_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P085811_A1291AlbRDes[0] ;
         A1212TipEntNom = P085811_A1212TipEntNom[0] ;
         n1212TipEntNom = P085811_n1212TipEntNom[0] ;
         A1211TipEntCod = P085811_A1211TipEntCod[0] ;
         n1211TipEntCod = P085811_n1211TipEntCod[0] ;
         A841TrnNom = P085811_A841TrnNom[0] ;
         n841TrnNom = P085811_n841TrnNom[0] ;
         A840TrnCod = P085811_A840TrnCod[0] ;
         n840TrnCod = P085811_n840TrnCod[0] ;
         A971ProceNom = P085811_A971ProceNom[0] ;
         n971ProceNom = P085811_n971ProceNom[0] ;
         A970ProceCod = P085811_A970ProceCod[0] ;
         n970ProceCod = P085811_n970ProceCod[0] ;
         A3613AlbRefDsc = P085811_A3613AlbRefDsc[0] ;
         A45AlbRef = P085811_A45AlbRef[0] ;
         A279CliNom = P085811_A279CliNom[0] ;
         A252CliCod = P085811_A252CliCod[0] ;
         A4606AlbRHEn = P085811_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P085811_n4606AlbRHEn[0] ;
         A49AlbRFen = P085811_A49AlbRFen[0] ;
         A5806AlbREnt2 = P085811_A5806AlbREnt2[0] ;
         A46AlbREnt = P085811_A46AlbREnt[0] ;
         A44AlbRecCod = P085811_A44AlbRecCod[0] ;
         A47AlbREst = P085811_A47AlbREst[0] ;
         A55AlbRReo = P085811_A55AlbRReo[0] ;
         A56AlbRUni = P085811_A56AlbRUni[0] ;
         A1212TipEntNom = P085811_A1212TipEntNom[0] ;
         n1212TipEntNom = P085811_n1212TipEntNom[0] ;
         A841TrnNom = P085811_A841TrnNom[0] ;
         n841TrnNom = P085811_n841TrnNom[0] ;
         A971ProceNom = P085811_A971ProceNom[0] ;
         n971ProceNom = P085811_n971ProceNom[0] ;
         A279CliNom = P085811_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P085811_A50AlbRLoc[0], A50AlbRLoc) == 0 ) )
            {
               brk85820 = false ;
               A396EmprCod = P085811_A396EmprCod[0] ;
               A44AlbRecCod = P085811_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk85820 = true ;
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
         if ( ! brk85820 )
         {
            brk85820 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = talbdetwwgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = talbdetwwgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = talbdetwwgetfilterdata.this.AV67OptionIndexesJson;
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
      AV102FilterFullText = "" ;
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
      AV97TFAlbRUni_SelsJson = "" ;
      AV98TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFAlbRLoc = "" ;
      AV49TFAlbRLoc_Sel = "" ;
      AV50TFAlbRReo_SelsJson = "" ;
      AV51TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFAlbRUniUti = DecimalUtil.ZERO ;
      AV55TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV73GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV74DynamicFiltersSelector1 = "" ;
      AV80DynamicFiltersSelector2 = "" ;
      AV86DynamicFiltersSelector3 = "" ;
      A46AlbREnt = "" ;
      AV107Talbdetwwds_1_filterfulltext = "" ;
      AV108Talbdetwwds_2_dynamicfiltersselector1 = "" ;
      AV111Talbdetwwds_5_dynamicfiltersselector2 = "" ;
      AV114Talbdetwwds_8_dynamicfiltersselector3 = "" ;
      AV118Talbdetwwds_12_tfalbrent = "" ;
      AV119Talbdetwwds_13_tfalbrent_sel = "" ;
      AV120Talbdetwwds_14_tfalbrent2 = "" ;
      AV121Talbdetwwds_15_tfalbrent2_sel = "" ;
      AV122Talbdetwwds_16_tfalbrfen = GXutil.nullDate() ;
      AV123Talbdetwwds_17_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV126Talbdetwwds_20_tfclinom = "" ;
      AV127Talbdetwwds_21_tfclinom_sel = "" ;
      AV128Talbdetwwds_22_tfalbref = "" ;
      AV129Talbdetwwds_23_tfalbref_sel = "" ;
      AV130Talbdetwwds_24_tfalbrefdsc = "" ;
      AV131Talbdetwwds_25_tfalbrefdsc_sel = "" ;
      AV134Talbdetwwds_28_tfprocenom = "" ;
      AV135Talbdetwwds_29_tfprocenom_sel = "" ;
      AV138Talbdetwwds_32_tftrnnom = "" ;
      AV139Talbdetwwds_33_tftrnnom_sel = "" ;
      AV142Talbdetwwds_36_tftipentnom = "" ;
      AV143Talbdetwwds_37_tftipentnom_sel = "" ;
      AV144Talbdetwwds_38_tfalbrdes = "" ;
      AV145Talbdetwwds_39_tfalbrdes_sel = "" ;
      AV146Talbdetwwds_40_tfalbrunient = DecimalUtil.ZERO ;
      AV147Talbdetwwds_41_tfalbrunient_to = DecimalUtil.ZERO ;
      AV148Talbdetwwds_42_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV151Talbdetwwds_45_tfalbrloc = "" ;
      AV152Talbdetwwds_46_tfalbrloc_sel = "" ;
      AV153Talbdetwwds_47_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV156Talbdetwwds_50_tfalbruniuti = DecimalUtil.ZERO ;
      AV157Talbdetwwds_51_tfalbruniuti_to = DecimalUtil.ZERO ;
      lV107Talbdetwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV118Talbdetwwds_12_tfalbrent = "" ;
      lV120Talbdetwwds_14_tfalbrent2 = "" ;
      lV126Talbdetwwds_20_tfclinom = "" ;
      lV128Talbdetwwds_22_tfalbref = "" ;
      lV130Talbdetwwds_24_tfalbrefdsc = "" ;
      lV134Talbdetwwds_28_tfprocenom = "" ;
      lV138Talbdetwwds_32_tftrnnom = "" ;
      lV142Talbdetwwds_36_tftipentnom = "" ;
      lV144Talbdetwwds_38_tfalbrdes = "" ;
      lV151Talbdetwwds_45_tfalbrloc = "" ;
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
      P08582_A396EmprCod = new String[] {""} ;
      P08582_A46AlbREnt = new String[] {""} ;
      P08582_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08582_A54AlbRPieUti = new int[1] ;
      P08582_A50AlbRLoc = new String[] {""} ;
      P08582_A52AlbRPieEnt = new int[1] ;
      P08582_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08582_A1291AlbRDes = new String[] {""} ;
      P08582_A1212TipEntNom = new String[] {""} ;
      P08582_n1212TipEntNom = new boolean[] {false} ;
      P08582_A1211TipEntCod = new short[1] ;
      P08582_n1211TipEntCod = new boolean[] {false} ;
      P08582_A841TrnNom = new String[] {""} ;
      P08582_n841TrnNom = new boolean[] {false} ;
      P08582_A840TrnCod = new short[1] ;
      P08582_n840TrnCod = new boolean[] {false} ;
      P08582_A971ProceNom = new String[] {""} ;
      P08582_n971ProceNom = new boolean[] {false} ;
      P08582_A970ProceCod = new short[1] ;
      P08582_n970ProceCod = new boolean[] {false} ;
      P08582_A3613AlbRefDsc = new String[] {""} ;
      P08582_A45AlbRef = new String[] {""} ;
      P08582_A279CliNom = new String[] {""} ;
      P08582_A252CliCod = new int[1] ;
      P08582_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08582_n4606AlbRHEn = new boolean[] {false} ;
      P08582_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08582_A5806AlbREnt2 = new String[] {""} ;
      P08582_A44AlbRecCod = new int[1] ;
      P08582_A47AlbREst = new byte[1] ;
      P08582_A55AlbRReo = new String[] {""} ;
      P08582_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV60Option = "" ;
      P08583_A396EmprCod = new String[] {""} ;
      P08583_A5806AlbREnt2 = new String[] {""} ;
      P08583_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08583_A54AlbRPieUti = new int[1] ;
      P08583_A50AlbRLoc = new String[] {""} ;
      P08583_A52AlbRPieEnt = new int[1] ;
      P08583_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08583_A1291AlbRDes = new String[] {""} ;
      P08583_A1212TipEntNom = new String[] {""} ;
      P08583_n1212TipEntNom = new boolean[] {false} ;
      P08583_A1211TipEntCod = new short[1] ;
      P08583_n1211TipEntCod = new boolean[] {false} ;
      P08583_A841TrnNom = new String[] {""} ;
      P08583_n841TrnNom = new boolean[] {false} ;
      P08583_A840TrnCod = new short[1] ;
      P08583_n840TrnCod = new boolean[] {false} ;
      P08583_A971ProceNom = new String[] {""} ;
      P08583_n971ProceNom = new boolean[] {false} ;
      P08583_A970ProceCod = new short[1] ;
      P08583_n970ProceCod = new boolean[] {false} ;
      P08583_A3613AlbRefDsc = new String[] {""} ;
      P08583_A45AlbRef = new String[] {""} ;
      P08583_A279CliNom = new String[] {""} ;
      P08583_A252CliCod = new int[1] ;
      P08583_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08583_n4606AlbRHEn = new boolean[] {false} ;
      P08583_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08583_A46AlbREnt = new String[] {""} ;
      P08583_A44AlbRecCod = new int[1] ;
      P08583_A47AlbREst = new byte[1] ;
      P08583_A55AlbRReo = new String[] {""} ;
      P08583_A56AlbRUni = new String[] {""} ;
      P08584_A396EmprCod = new String[] {""} ;
      P08584_A279CliNom = new String[] {""} ;
      P08584_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08584_A54AlbRPieUti = new int[1] ;
      P08584_A50AlbRLoc = new String[] {""} ;
      P08584_A52AlbRPieEnt = new int[1] ;
      P08584_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08584_A1291AlbRDes = new String[] {""} ;
      P08584_A1212TipEntNom = new String[] {""} ;
      P08584_n1212TipEntNom = new boolean[] {false} ;
      P08584_A1211TipEntCod = new short[1] ;
      P08584_n1211TipEntCod = new boolean[] {false} ;
      P08584_A841TrnNom = new String[] {""} ;
      P08584_n841TrnNom = new boolean[] {false} ;
      P08584_A840TrnCod = new short[1] ;
      P08584_n840TrnCod = new boolean[] {false} ;
      P08584_A971ProceNom = new String[] {""} ;
      P08584_n971ProceNom = new boolean[] {false} ;
      P08584_A970ProceCod = new short[1] ;
      P08584_n970ProceCod = new boolean[] {false} ;
      P08584_A3613AlbRefDsc = new String[] {""} ;
      P08584_A45AlbRef = new String[] {""} ;
      P08584_A252CliCod = new int[1] ;
      P08584_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08584_n4606AlbRHEn = new boolean[] {false} ;
      P08584_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08584_A5806AlbREnt2 = new String[] {""} ;
      P08584_A46AlbREnt = new String[] {""} ;
      P08584_A44AlbRecCod = new int[1] ;
      P08584_A47AlbREst = new byte[1] ;
      P08584_A55AlbRReo = new String[] {""} ;
      P08584_A56AlbRUni = new String[] {""} ;
      P08585_A396EmprCod = new String[] {""} ;
      P08585_A45AlbRef = new String[] {""} ;
      P08585_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08585_A54AlbRPieUti = new int[1] ;
      P08585_A50AlbRLoc = new String[] {""} ;
      P08585_A52AlbRPieEnt = new int[1] ;
      P08585_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08585_A1291AlbRDes = new String[] {""} ;
      P08585_A1212TipEntNom = new String[] {""} ;
      P08585_n1212TipEntNom = new boolean[] {false} ;
      P08585_A1211TipEntCod = new short[1] ;
      P08585_n1211TipEntCod = new boolean[] {false} ;
      P08585_A841TrnNom = new String[] {""} ;
      P08585_n841TrnNom = new boolean[] {false} ;
      P08585_A840TrnCod = new short[1] ;
      P08585_n840TrnCod = new boolean[] {false} ;
      P08585_A971ProceNom = new String[] {""} ;
      P08585_n971ProceNom = new boolean[] {false} ;
      P08585_A970ProceCod = new short[1] ;
      P08585_n970ProceCod = new boolean[] {false} ;
      P08585_A3613AlbRefDsc = new String[] {""} ;
      P08585_A279CliNom = new String[] {""} ;
      P08585_A252CliCod = new int[1] ;
      P08585_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08585_n4606AlbRHEn = new boolean[] {false} ;
      P08585_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08585_A5806AlbREnt2 = new String[] {""} ;
      P08585_A46AlbREnt = new String[] {""} ;
      P08585_A44AlbRecCod = new int[1] ;
      P08585_A47AlbREst = new byte[1] ;
      P08585_A55AlbRReo = new String[] {""} ;
      P08585_A56AlbRUni = new String[] {""} ;
      P08586_A396EmprCod = new String[] {""} ;
      P08586_A3613AlbRefDsc = new String[] {""} ;
      P08586_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08586_A54AlbRPieUti = new int[1] ;
      P08586_A50AlbRLoc = new String[] {""} ;
      P08586_A52AlbRPieEnt = new int[1] ;
      P08586_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08586_A1291AlbRDes = new String[] {""} ;
      P08586_A1212TipEntNom = new String[] {""} ;
      P08586_n1212TipEntNom = new boolean[] {false} ;
      P08586_A1211TipEntCod = new short[1] ;
      P08586_n1211TipEntCod = new boolean[] {false} ;
      P08586_A841TrnNom = new String[] {""} ;
      P08586_n841TrnNom = new boolean[] {false} ;
      P08586_A840TrnCod = new short[1] ;
      P08586_n840TrnCod = new boolean[] {false} ;
      P08586_A971ProceNom = new String[] {""} ;
      P08586_n971ProceNom = new boolean[] {false} ;
      P08586_A970ProceCod = new short[1] ;
      P08586_n970ProceCod = new boolean[] {false} ;
      P08586_A45AlbRef = new String[] {""} ;
      P08586_A279CliNom = new String[] {""} ;
      P08586_A252CliCod = new int[1] ;
      P08586_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08586_n4606AlbRHEn = new boolean[] {false} ;
      P08586_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08586_A5806AlbREnt2 = new String[] {""} ;
      P08586_A46AlbREnt = new String[] {""} ;
      P08586_A44AlbRecCod = new int[1] ;
      P08586_A47AlbREst = new byte[1] ;
      P08586_A55AlbRReo = new String[] {""} ;
      P08586_A56AlbRUni = new String[] {""} ;
      P08587_A970ProceCod = new short[1] ;
      P08587_n970ProceCod = new boolean[] {false} ;
      P08587_A396EmprCod = new String[] {""} ;
      P08587_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08587_A54AlbRPieUti = new int[1] ;
      P08587_A50AlbRLoc = new String[] {""} ;
      P08587_A52AlbRPieEnt = new int[1] ;
      P08587_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08587_A1291AlbRDes = new String[] {""} ;
      P08587_A1212TipEntNom = new String[] {""} ;
      P08587_n1212TipEntNom = new boolean[] {false} ;
      P08587_A1211TipEntCod = new short[1] ;
      P08587_n1211TipEntCod = new boolean[] {false} ;
      P08587_A841TrnNom = new String[] {""} ;
      P08587_n841TrnNom = new boolean[] {false} ;
      P08587_A840TrnCod = new short[1] ;
      P08587_n840TrnCod = new boolean[] {false} ;
      P08587_A971ProceNom = new String[] {""} ;
      P08587_n971ProceNom = new boolean[] {false} ;
      P08587_A3613AlbRefDsc = new String[] {""} ;
      P08587_A45AlbRef = new String[] {""} ;
      P08587_A279CliNom = new String[] {""} ;
      P08587_A252CliCod = new int[1] ;
      P08587_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08587_n4606AlbRHEn = new boolean[] {false} ;
      P08587_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08587_A5806AlbREnt2 = new String[] {""} ;
      P08587_A46AlbREnt = new String[] {""} ;
      P08587_A44AlbRecCod = new int[1] ;
      P08587_A47AlbREst = new byte[1] ;
      P08587_A55AlbRReo = new String[] {""} ;
      P08587_A56AlbRUni = new String[] {""} ;
      P08588_A840TrnCod = new short[1] ;
      P08588_n840TrnCod = new boolean[] {false} ;
      P08588_A396EmprCod = new String[] {""} ;
      P08588_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08588_A54AlbRPieUti = new int[1] ;
      P08588_A50AlbRLoc = new String[] {""} ;
      P08588_A52AlbRPieEnt = new int[1] ;
      P08588_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08588_A1291AlbRDes = new String[] {""} ;
      P08588_A1212TipEntNom = new String[] {""} ;
      P08588_n1212TipEntNom = new boolean[] {false} ;
      P08588_A1211TipEntCod = new short[1] ;
      P08588_n1211TipEntCod = new boolean[] {false} ;
      P08588_A841TrnNom = new String[] {""} ;
      P08588_n841TrnNom = new boolean[] {false} ;
      P08588_A971ProceNom = new String[] {""} ;
      P08588_n971ProceNom = new boolean[] {false} ;
      P08588_A970ProceCod = new short[1] ;
      P08588_n970ProceCod = new boolean[] {false} ;
      P08588_A3613AlbRefDsc = new String[] {""} ;
      P08588_A45AlbRef = new String[] {""} ;
      P08588_A279CliNom = new String[] {""} ;
      P08588_A252CliCod = new int[1] ;
      P08588_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08588_n4606AlbRHEn = new boolean[] {false} ;
      P08588_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08588_A5806AlbREnt2 = new String[] {""} ;
      P08588_A46AlbREnt = new String[] {""} ;
      P08588_A44AlbRecCod = new int[1] ;
      P08588_A47AlbREst = new byte[1] ;
      P08588_A55AlbRReo = new String[] {""} ;
      P08588_A56AlbRUni = new String[] {""} ;
      P08589_A1211TipEntCod = new short[1] ;
      P08589_n1211TipEntCod = new boolean[] {false} ;
      P08589_A396EmprCod = new String[] {""} ;
      P08589_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08589_A54AlbRPieUti = new int[1] ;
      P08589_A50AlbRLoc = new String[] {""} ;
      P08589_A52AlbRPieEnt = new int[1] ;
      P08589_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08589_A1291AlbRDes = new String[] {""} ;
      P08589_A1212TipEntNom = new String[] {""} ;
      P08589_n1212TipEntNom = new boolean[] {false} ;
      P08589_A841TrnNom = new String[] {""} ;
      P08589_n841TrnNom = new boolean[] {false} ;
      P08589_A840TrnCod = new short[1] ;
      P08589_n840TrnCod = new boolean[] {false} ;
      P08589_A971ProceNom = new String[] {""} ;
      P08589_n971ProceNom = new boolean[] {false} ;
      P08589_A970ProceCod = new short[1] ;
      P08589_n970ProceCod = new boolean[] {false} ;
      P08589_A3613AlbRefDsc = new String[] {""} ;
      P08589_A45AlbRef = new String[] {""} ;
      P08589_A279CliNom = new String[] {""} ;
      P08589_A252CliCod = new int[1] ;
      P08589_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08589_n4606AlbRHEn = new boolean[] {false} ;
      P08589_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08589_A5806AlbREnt2 = new String[] {""} ;
      P08589_A46AlbREnt = new String[] {""} ;
      P08589_A44AlbRecCod = new int[1] ;
      P08589_A47AlbREst = new byte[1] ;
      P08589_A55AlbRReo = new String[] {""} ;
      P08589_A56AlbRUni = new String[] {""} ;
      P085810_A396EmprCod = new String[] {""} ;
      P085810_A1291AlbRDes = new String[] {""} ;
      P085810_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085810_A54AlbRPieUti = new int[1] ;
      P085810_A50AlbRLoc = new String[] {""} ;
      P085810_A52AlbRPieEnt = new int[1] ;
      P085810_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085810_A1212TipEntNom = new String[] {""} ;
      P085810_n1212TipEntNom = new boolean[] {false} ;
      P085810_A1211TipEntCod = new short[1] ;
      P085810_n1211TipEntCod = new boolean[] {false} ;
      P085810_A841TrnNom = new String[] {""} ;
      P085810_n841TrnNom = new boolean[] {false} ;
      P085810_A840TrnCod = new short[1] ;
      P085810_n840TrnCod = new boolean[] {false} ;
      P085810_A971ProceNom = new String[] {""} ;
      P085810_n971ProceNom = new boolean[] {false} ;
      P085810_A970ProceCod = new short[1] ;
      P085810_n970ProceCod = new boolean[] {false} ;
      P085810_A3613AlbRefDsc = new String[] {""} ;
      P085810_A45AlbRef = new String[] {""} ;
      P085810_A279CliNom = new String[] {""} ;
      P085810_A252CliCod = new int[1] ;
      P085810_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P085810_n4606AlbRHEn = new boolean[] {false} ;
      P085810_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P085810_A5806AlbREnt2 = new String[] {""} ;
      P085810_A46AlbREnt = new String[] {""} ;
      P085810_A44AlbRecCod = new int[1] ;
      P085810_A47AlbREst = new byte[1] ;
      P085810_A55AlbRReo = new String[] {""} ;
      P085810_A56AlbRUni = new String[] {""} ;
      P085811_A396EmprCod = new String[] {""} ;
      P085811_A50AlbRLoc = new String[] {""} ;
      P085811_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085811_A54AlbRPieUti = new int[1] ;
      P085811_A52AlbRPieEnt = new int[1] ;
      P085811_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085811_A1291AlbRDes = new String[] {""} ;
      P085811_A1212TipEntNom = new String[] {""} ;
      P085811_n1212TipEntNom = new boolean[] {false} ;
      P085811_A1211TipEntCod = new short[1] ;
      P085811_n1211TipEntCod = new boolean[] {false} ;
      P085811_A841TrnNom = new String[] {""} ;
      P085811_n841TrnNom = new boolean[] {false} ;
      P085811_A840TrnCod = new short[1] ;
      P085811_n840TrnCod = new boolean[] {false} ;
      P085811_A971ProceNom = new String[] {""} ;
      P085811_n971ProceNom = new boolean[] {false} ;
      P085811_A970ProceCod = new short[1] ;
      P085811_n970ProceCod = new boolean[] {false} ;
      P085811_A3613AlbRefDsc = new String[] {""} ;
      P085811_A45AlbRef = new String[] {""} ;
      P085811_A279CliNom = new String[] {""} ;
      P085811_A252CliCod = new int[1] ;
      P085811_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P085811_n4606AlbRHEn = new boolean[] {false} ;
      P085811_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P085811_A5806AlbREnt2 = new String[] {""} ;
      P085811_A46AlbREnt = new String[] {""} ;
      P085811_A44AlbRecCod = new int[1] ;
      P085811_A47AlbREst = new byte[1] ;
      P085811_A55AlbRReo = new String[] {""} ;
      P085811_A56AlbRUni = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdetwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08582_A396EmprCod, P08582_A46AlbREnt, P08582_A60AlbRUniUti, P08582_A54AlbRPieUti, P08582_A50AlbRLoc, P08582_A52AlbRPieEnt, P08582_A58AlbRUniEnt, P08582_A1291AlbRDes, P08582_A1212TipEntNom, P08582_n1212TipEntNom,
            P08582_A1211TipEntCod, P08582_n1211TipEntCod, P08582_A841TrnNom, P08582_n841TrnNom, P08582_A840TrnCod, P08582_n840TrnCod, P08582_A971ProceNom, P08582_n971ProceNom, P08582_A970ProceCod, P08582_n970ProceCod,
            P08582_A3613AlbRefDsc, P08582_A45AlbRef, P08582_A279CliNom, P08582_A252CliCod, P08582_A4606AlbRHEn, P08582_n4606AlbRHEn, P08582_A49AlbRFen, P08582_A5806AlbREnt2, P08582_A44AlbRecCod, P08582_A47AlbREst,
            P08582_A55AlbRReo, P08582_A56AlbRUni
            }
            , new Object[] {
            P08583_A396EmprCod, P08583_A5806AlbREnt2, P08583_A60AlbRUniUti, P08583_A54AlbRPieUti, P08583_A50AlbRLoc, P08583_A52AlbRPieEnt, P08583_A58AlbRUniEnt, P08583_A1291AlbRDes, P08583_A1212TipEntNom, P08583_n1212TipEntNom,
            P08583_A1211TipEntCod, P08583_n1211TipEntCod, P08583_A841TrnNom, P08583_n841TrnNom, P08583_A840TrnCod, P08583_n840TrnCod, P08583_A971ProceNom, P08583_n971ProceNom, P08583_A970ProceCod, P08583_n970ProceCod,
            P08583_A3613AlbRefDsc, P08583_A45AlbRef, P08583_A279CliNom, P08583_A252CliCod, P08583_A4606AlbRHEn, P08583_n4606AlbRHEn, P08583_A49AlbRFen, P08583_A46AlbREnt, P08583_A44AlbRecCod, P08583_A47AlbREst,
            P08583_A55AlbRReo, P08583_A56AlbRUni
            }
            , new Object[] {
            P08584_A396EmprCod, P08584_A279CliNom, P08584_A60AlbRUniUti, P08584_A54AlbRPieUti, P08584_A50AlbRLoc, P08584_A52AlbRPieEnt, P08584_A58AlbRUniEnt, P08584_A1291AlbRDes, P08584_A1212TipEntNom, P08584_n1212TipEntNom,
            P08584_A1211TipEntCod, P08584_n1211TipEntCod, P08584_A841TrnNom, P08584_n841TrnNom, P08584_A840TrnCod, P08584_n840TrnCod, P08584_A971ProceNom, P08584_n971ProceNom, P08584_A970ProceCod, P08584_n970ProceCod,
            P08584_A3613AlbRefDsc, P08584_A45AlbRef, P08584_A252CliCod, P08584_A4606AlbRHEn, P08584_n4606AlbRHEn, P08584_A49AlbRFen, P08584_A5806AlbREnt2, P08584_A46AlbREnt, P08584_A44AlbRecCod, P08584_A47AlbREst,
            P08584_A55AlbRReo, P08584_A56AlbRUni
            }
            , new Object[] {
            P08585_A396EmprCod, P08585_A45AlbRef, P08585_A60AlbRUniUti, P08585_A54AlbRPieUti, P08585_A50AlbRLoc, P08585_A52AlbRPieEnt, P08585_A58AlbRUniEnt, P08585_A1291AlbRDes, P08585_A1212TipEntNom, P08585_n1212TipEntNom,
            P08585_A1211TipEntCod, P08585_n1211TipEntCod, P08585_A841TrnNom, P08585_n841TrnNom, P08585_A840TrnCod, P08585_n840TrnCod, P08585_A971ProceNom, P08585_n971ProceNom, P08585_A970ProceCod, P08585_n970ProceCod,
            P08585_A3613AlbRefDsc, P08585_A279CliNom, P08585_A252CliCod, P08585_A4606AlbRHEn, P08585_n4606AlbRHEn, P08585_A49AlbRFen, P08585_A5806AlbREnt2, P08585_A46AlbREnt, P08585_A44AlbRecCod, P08585_A47AlbREst,
            P08585_A55AlbRReo, P08585_A56AlbRUni
            }
            , new Object[] {
            P08586_A396EmprCod, P08586_A3613AlbRefDsc, P08586_A60AlbRUniUti, P08586_A54AlbRPieUti, P08586_A50AlbRLoc, P08586_A52AlbRPieEnt, P08586_A58AlbRUniEnt, P08586_A1291AlbRDes, P08586_A1212TipEntNom, P08586_n1212TipEntNom,
            P08586_A1211TipEntCod, P08586_n1211TipEntCod, P08586_A841TrnNom, P08586_n841TrnNom, P08586_A840TrnCod, P08586_n840TrnCod, P08586_A971ProceNom, P08586_n971ProceNom, P08586_A970ProceCod, P08586_n970ProceCod,
            P08586_A45AlbRef, P08586_A279CliNom, P08586_A252CliCod, P08586_A4606AlbRHEn, P08586_n4606AlbRHEn, P08586_A49AlbRFen, P08586_A5806AlbREnt2, P08586_A46AlbREnt, P08586_A44AlbRecCod, P08586_A47AlbREst,
            P08586_A55AlbRReo, P08586_A56AlbRUni
            }
            , new Object[] {
            P08587_A970ProceCod, P08587_n970ProceCod, P08587_A396EmprCod, P08587_A60AlbRUniUti, P08587_A54AlbRPieUti, P08587_A50AlbRLoc, P08587_A52AlbRPieEnt, P08587_A58AlbRUniEnt, P08587_A1291AlbRDes, P08587_A1212TipEntNom,
            P08587_n1212TipEntNom, P08587_A1211TipEntCod, P08587_n1211TipEntCod, P08587_A841TrnNom, P08587_n841TrnNom, P08587_A840TrnCod, P08587_n840TrnCod, P08587_A971ProceNom, P08587_n971ProceNom, P08587_A3613AlbRefDsc,
            P08587_A45AlbRef, P08587_A279CliNom, P08587_A252CliCod, P08587_A4606AlbRHEn, P08587_n4606AlbRHEn, P08587_A49AlbRFen, P08587_A5806AlbREnt2, P08587_A46AlbREnt, P08587_A44AlbRecCod, P08587_A47AlbREst,
            P08587_A55AlbRReo, P08587_A56AlbRUni
            }
            , new Object[] {
            P08588_A840TrnCod, P08588_n840TrnCod, P08588_A396EmprCod, P08588_A60AlbRUniUti, P08588_A54AlbRPieUti, P08588_A50AlbRLoc, P08588_A52AlbRPieEnt, P08588_A58AlbRUniEnt, P08588_A1291AlbRDes, P08588_A1212TipEntNom,
            P08588_n1212TipEntNom, P08588_A1211TipEntCod, P08588_n1211TipEntCod, P08588_A841TrnNom, P08588_n841TrnNom, P08588_A971ProceNom, P08588_n971ProceNom, P08588_A970ProceCod, P08588_n970ProceCod, P08588_A3613AlbRefDsc,
            P08588_A45AlbRef, P08588_A279CliNom, P08588_A252CliCod, P08588_A4606AlbRHEn, P08588_n4606AlbRHEn, P08588_A49AlbRFen, P08588_A5806AlbREnt2, P08588_A46AlbREnt, P08588_A44AlbRecCod, P08588_A47AlbREst,
            P08588_A55AlbRReo, P08588_A56AlbRUni
            }
            , new Object[] {
            P08589_A1211TipEntCod, P08589_n1211TipEntCod, P08589_A396EmprCod, P08589_A60AlbRUniUti, P08589_A54AlbRPieUti, P08589_A50AlbRLoc, P08589_A52AlbRPieEnt, P08589_A58AlbRUniEnt, P08589_A1291AlbRDes, P08589_A1212TipEntNom,
            P08589_n1212TipEntNom, P08589_A841TrnNom, P08589_n841TrnNom, P08589_A840TrnCod, P08589_n840TrnCod, P08589_A971ProceNom, P08589_n971ProceNom, P08589_A970ProceCod, P08589_n970ProceCod, P08589_A3613AlbRefDsc,
            P08589_A45AlbRef, P08589_A279CliNom, P08589_A252CliCod, P08589_A4606AlbRHEn, P08589_n4606AlbRHEn, P08589_A49AlbRFen, P08589_A5806AlbREnt2, P08589_A46AlbREnt, P08589_A44AlbRecCod, P08589_A47AlbREst,
            P08589_A55AlbRReo, P08589_A56AlbRUni
            }
            , new Object[] {
            P085810_A396EmprCod, P085810_A1291AlbRDes, P085810_A60AlbRUniUti, P085810_A54AlbRPieUti, P085810_A50AlbRLoc, P085810_A52AlbRPieEnt, P085810_A58AlbRUniEnt, P085810_A1212TipEntNom, P085810_n1212TipEntNom, P085810_A1211TipEntCod,
            P085810_n1211TipEntCod, P085810_A841TrnNom, P085810_n841TrnNom, P085810_A840TrnCod, P085810_n840TrnCod, P085810_A971ProceNom, P085810_n971ProceNom, P085810_A970ProceCod, P085810_n970ProceCod, P085810_A3613AlbRefDsc,
            P085810_A45AlbRef, P085810_A279CliNom, P085810_A252CliCod, P085810_A4606AlbRHEn, P085810_n4606AlbRHEn, P085810_A49AlbRFen, P085810_A5806AlbREnt2, P085810_A46AlbREnt, P085810_A44AlbRecCod, P085810_A47AlbREst,
            P085810_A55AlbRReo, P085810_A56AlbRUni
            }
            , new Object[] {
            P085811_A396EmprCod, P085811_A50AlbRLoc, P085811_A60AlbRUniUti, P085811_A54AlbRPieUti, P085811_A52AlbRPieEnt, P085811_A58AlbRUniEnt, P085811_A1291AlbRDes, P085811_A1212TipEntNom, P085811_n1212TipEntNom, P085811_A1211TipEntCod,
            P085811_n1211TipEntCod, P085811_A841TrnNom, P085811_n841TrnNom, P085811_A840TrnCod, P085811_n840TrnCod, P085811_A971ProceNom, P085811_n971ProceNom, P085811_A970ProceCod, P085811_n970ProceCod, P085811_A3613AlbRefDsc,
            P085811_A45AlbRef, P085811_A279CliNom, P085811_A252CliCod, P085811_A4606AlbRHEn, P085811_n4606AlbRHEn, P085811_A49AlbRFen, P085811_A5806AlbREnt2, P085811_A46AlbREnt, P085811_A44AlbRecCod, P085811_A47AlbREst,
            P085811_A55AlbRReo, P085811_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV91AlbREst1 ;
   private byte AV93AlbREst2 ;
   private byte AV95AlbREst3 ;
   private byte AV109Talbdetwwds_3_albrest1 ;
   private byte AV112Talbdetwwds_6_albrest2 ;
   private byte AV115Talbdetwwds_9_albrest3 ;
   private byte A47AlbREst ;
   private short AV28TFProceCod ;
   private short AV29TFProceCod_To ;
   private short AV32TFTrnCod ;
   private short AV33TFTrnCod_To ;
   private short AV36TFTipEntCod ;
   private short AV37TFTipEntCod_To ;
   private short AV132Talbdetwwds_26_tfprocecod ;
   private short AV133Talbdetwwds_27_tfprocecod_to ;
   private short AV136Talbdetwwds_30_tftrncod ;
   private short AV137Talbdetwwds_31_tftrncod_to ;
   private short AV140Talbdetwwds_34_tftipentcod ;
   private short AV141Talbdetwwds_35_tftipentcod_to ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV105GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV20TFCliCod ;
   private int AV21TFCliCod_To ;
   private int AV46TFAlbRPieEnt ;
   private int AV47TFAlbRPieEnt_To ;
   private int AV52TFAlbRPieUti ;
   private int AV53TFAlbRPieUti_To ;
   private int AV116Talbdetwwds_10_tfalbreccod ;
   private int AV117Talbdetwwds_11_tfalbreccod_to ;
   private int AV124Talbdetwwds_18_tfclicod ;
   private int AV125Talbdetwwds_19_tfclicod_to ;
   private int AV149Talbdetwwds_43_tfalbrpieent ;
   private int AV150Talbdetwwds_44_tfalbrpieent_to ;
   private int AV154Talbdetwwds_48_tfalbrpieuti ;
   private int AV155Talbdetwwds_49_tfalbrpieuti_to ;
   private int AV148Talbdetwwds_42_tfalbruni_sels_size ;
   private int AV153Talbdetwwds_47_tfalbrreo_sels_size ;
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
   private java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ;
   private java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ;
   private java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ;
   private java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ;
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
   private String AV118Talbdetwwds_12_tfalbrent ;
   private String AV119Talbdetwwds_13_tfalbrent_sel ;
   private String AV120Talbdetwwds_14_tfalbrent2 ;
   private String AV121Talbdetwwds_15_tfalbrent2_sel ;
   private String AV126Talbdetwwds_20_tfclinom ;
   private String AV127Talbdetwwds_21_tfclinom_sel ;
   private String AV128Talbdetwwds_22_tfalbref ;
   private String AV129Talbdetwwds_23_tfalbref_sel ;
   private String AV130Talbdetwwds_24_tfalbrefdsc ;
   private String AV131Talbdetwwds_25_tfalbrefdsc_sel ;
   private String AV134Talbdetwwds_28_tfprocenom ;
   private String AV135Talbdetwwds_29_tfprocenom_sel ;
   private String AV138Talbdetwwds_32_tftrnnom ;
   private String AV139Talbdetwwds_33_tftrnnom_sel ;
   private String AV142Talbdetwwds_36_tftipentnom ;
   private String AV143Talbdetwwds_37_tftipentnom_sel ;
   private String AV144Talbdetwwds_38_tfalbrdes ;
   private String AV145Talbdetwwds_39_tfalbrdes_sel ;
   private String AV151Talbdetwwds_45_tfalbrloc ;
   private String AV152Talbdetwwds_46_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV118Talbdetwwds_12_tfalbrent ;
   private String lV120Talbdetwwds_14_tfalbrent2 ;
   private String lV126Talbdetwwds_20_tfclinom ;
   private String lV128Talbdetwwds_22_tfalbref ;
   private String lV130Talbdetwwds_24_tfalbrefdsc ;
   private String lV134Talbdetwwds_28_tfprocenom ;
   private String lV138Talbdetwwds_32_tftrnnom ;
   private String lV142Talbdetwwds_36_tftipentnom ;
   private String lV144Talbdetwwds_38_tfalbrdes ;
   private String lV151Talbdetwwds_45_tfalbrloc ;
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
   private java.util.Date AV123Talbdetwwds_17_tfalbrhen ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV16TFAlbRFen ;
   private java.util.Date AV122Talbdetwwds_16_tfalbrfen ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean AV79DynamicFiltersEnabled2 ;
   private boolean AV85DynamicFiltersEnabled3 ;
   private boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ;
   private boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ;
   private boolean brk8582 ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private boolean brk8584 ;
   private boolean brk8586 ;
   private boolean brk8588 ;
   private boolean brk85810 ;
   private boolean brk85812 ;
   private boolean brk85814 ;
   private boolean brk85816 ;
   private boolean brk85818 ;
   private boolean brk85820 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV97TFAlbRUni_SelsJson ;
   private String AV50TFAlbRReo_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV102FilterFullText ;
   private String AV74DynamicFiltersSelector1 ;
   private String AV80DynamicFiltersSelector2 ;
   private String AV86DynamicFiltersSelector3 ;
   private String AV107Talbdetwwds_1_filterfulltext ;
   private String AV108Talbdetwwds_2_dynamicfiltersselector1 ;
   private String AV111Talbdetwwds_5_dynamicfiltersselector2 ;
   private String AV114Talbdetwwds_8_dynamicfiltersselector3 ;
   private String lV107Talbdetwwds_1_filterfulltext ;
   private String AV60Option ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08582_A396EmprCod ;
   private String[] P08582_A46AlbREnt ;
   private java.math.BigDecimal[] P08582_A60AlbRUniUti ;
   private int[] P08582_A54AlbRPieUti ;
   private String[] P08582_A50AlbRLoc ;
   private int[] P08582_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08582_A58AlbRUniEnt ;
   private String[] P08582_A1291AlbRDes ;
   private String[] P08582_A1212TipEntNom ;
   private boolean[] P08582_n1212TipEntNom ;
   private short[] P08582_A1211TipEntCod ;
   private boolean[] P08582_n1211TipEntCod ;
   private String[] P08582_A841TrnNom ;
   private boolean[] P08582_n841TrnNom ;
   private short[] P08582_A840TrnCod ;
   private boolean[] P08582_n840TrnCod ;
   private String[] P08582_A971ProceNom ;
   private boolean[] P08582_n971ProceNom ;
   private short[] P08582_A970ProceCod ;
   private boolean[] P08582_n970ProceCod ;
   private String[] P08582_A3613AlbRefDsc ;
   private String[] P08582_A45AlbRef ;
   private String[] P08582_A279CliNom ;
   private int[] P08582_A252CliCod ;
   private java.util.Date[] P08582_A4606AlbRHEn ;
   private boolean[] P08582_n4606AlbRHEn ;
   private java.util.Date[] P08582_A49AlbRFen ;
   private String[] P08582_A5806AlbREnt2 ;
   private int[] P08582_A44AlbRecCod ;
   private byte[] P08582_A47AlbREst ;
   private String[] P08582_A55AlbRReo ;
   private String[] P08582_A56AlbRUni ;
   private String[] P08583_A396EmprCod ;
   private String[] P08583_A5806AlbREnt2 ;
   private java.math.BigDecimal[] P08583_A60AlbRUniUti ;
   private int[] P08583_A54AlbRPieUti ;
   private String[] P08583_A50AlbRLoc ;
   private int[] P08583_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08583_A58AlbRUniEnt ;
   private String[] P08583_A1291AlbRDes ;
   private String[] P08583_A1212TipEntNom ;
   private boolean[] P08583_n1212TipEntNom ;
   private short[] P08583_A1211TipEntCod ;
   private boolean[] P08583_n1211TipEntCod ;
   private String[] P08583_A841TrnNom ;
   private boolean[] P08583_n841TrnNom ;
   private short[] P08583_A840TrnCod ;
   private boolean[] P08583_n840TrnCod ;
   private String[] P08583_A971ProceNom ;
   private boolean[] P08583_n971ProceNom ;
   private short[] P08583_A970ProceCod ;
   private boolean[] P08583_n970ProceCod ;
   private String[] P08583_A3613AlbRefDsc ;
   private String[] P08583_A45AlbRef ;
   private String[] P08583_A279CliNom ;
   private int[] P08583_A252CliCod ;
   private java.util.Date[] P08583_A4606AlbRHEn ;
   private boolean[] P08583_n4606AlbRHEn ;
   private java.util.Date[] P08583_A49AlbRFen ;
   private String[] P08583_A46AlbREnt ;
   private int[] P08583_A44AlbRecCod ;
   private byte[] P08583_A47AlbREst ;
   private String[] P08583_A55AlbRReo ;
   private String[] P08583_A56AlbRUni ;
   private String[] P08584_A396EmprCod ;
   private String[] P08584_A279CliNom ;
   private java.math.BigDecimal[] P08584_A60AlbRUniUti ;
   private int[] P08584_A54AlbRPieUti ;
   private String[] P08584_A50AlbRLoc ;
   private int[] P08584_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08584_A58AlbRUniEnt ;
   private String[] P08584_A1291AlbRDes ;
   private String[] P08584_A1212TipEntNom ;
   private boolean[] P08584_n1212TipEntNom ;
   private short[] P08584_A1211TipEntCod ;
   private boolean[] P08584_n1211TipEntCod ;
   private String[] P08584_A841TrnNom ;
   private boolean[] P08584_n841TrnNom ;
   private short[] P08584_A840TrnCod ;
   private boolean[] P08584_n840TrnCod ;
   private String[] P08584_A971ProceNom ;
   private boolean[] P08584_n971ProceNom ;
   private short[] P08584_A970ProceCod ;
   private boolean[] P08584_n970ProceCod ;
   private String[] P08584_A3613AlbRefDsc ;
   private String[] P08584_A45AlbRef ;
   private int[] P08584_A252CliCod ;
   private java.util.Date[] P08584_A4606AlbRHEn ;
   private boolean[] P08584_n4606AlbRHEn ;
   private java.util.Date[] P08584_A49AlbRFen ;
   private String[] P08584_A5806AlbREnt2 ;
   private String[] P08584_A46AlbREnt ;
   private int[] P08584_A44AlbRecCod ;
   private byte[] P08584_A47AlbREst ;
   private String[] P08584_A55AlbRReo ;
   private String[] P08584_A56AlbRUni ;
   private String[] P08585_A396EmprCod ;
   private String[] P08585_A45AlbRef ;
   private java.math.BigDecimal[] P08585_A60AlbRUniUti ;
   private int[] P08585_A54AlbRPieUti ;
   private String[] P08585_A50AlbRLoc ;
   private int[] P08585_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08585_A58AlbRUniEnt ;
   private String[] P08585_A1291AlbRDes ;
   private String[] P08585_A1212TipEntNom ;
   private boolean[] P08585_n1212TipEntNom ;
   private short[] P08585_A1211TipEntCod ;
   private boolean[] P08585_n1211TipEntCod ;
   private String[] P08585_A841TrnNom ;
   private boolean[] P08585_n841TrnNom ;
   private short[] P08585_A840TrnCod ;
   private boolean[] P08585_n840TrnCod ;
   private String[] P08585_A971ProceNom ;
   private boolean[] P08585_n971ProceNom ;
   private short[] P08585_A970ProceCod ;
   private boolean[] P08585_n970ProceCod ;
   private String[] P08585_A3613AlbRefDsc ;
   private String[] P08585_A279CliNom ;
   private int[] P08585_A252CliCod ;
   private java.util.Date[] P08585_A4606AlbRHEn ;
   private boolean[] P08585_n4606AlbRHEn ;
   private java.util.Date[] P08585_A49AlbRFen ;
   private String[] P08585_A5806AlbREnt2 ;
   private String[] P08585_A46AlbREnt ;
   private int[] P08585_A44AlbRecCod ;
   private byte[] P08585_A47AlbREst ;
   private String[] P08585_A55AlbRReo ;
   private String[] P08585_A56AlbRUni ;
   private String[] P08586_A396EmprCod ;
   private String[] P08586_A3613AlbRefDsc ;
   private java.math.BigDecimal[] P08586_A60AlbRUniUti ;
   private int[] P08586_A54AlbRPieUti ;
   private String[] P08586_A50AlbRLoc ;
   private int[] P08586_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08586_A58AlbRUniEnt ;
   private String[] P08586_A1291AlbRDes ;
   private String[] P08586_A1212TipEntNom ;
   private boolean[] P08586_n1212TipEntNom ;
   private short[] P08586_A1211TipEntCod ;
   private boolean[] P08586_n1211TipEntCod ;
   private String[] P08586_A841TrnNom ;
   private boolean[] P08586_n841TrnNom ;
   private short[] P08586_A840TrnCod ;
   private boolean[] P08586_n840TrnCod ;
   private String[] P08586_A971ProceNom ;
   private boolean[] P08586_n971ProceNom ;
   private short[] P08586_A970ProceCod ;
   private boolean[] P08586_n970ProceCod ;
   private String[] P08586_A45AlbRef ;
   private String[] P08586_A279CliNom ;
   private int[] P08586_A252CliCod ;
   private java.util.Date[] P08586_A4606AlbRHEn ;
   private boolean[] P08586_n4606AlbRHEn ;
   private java.util.Date[] P08586_A49AlbRFen ;
   private String[] P08586_A5806AlbREnt2 ;
   private String[] P08586_A46AlbREnt ;
   private int[] P08586_A44AlbRecCod ;
   private byte[] P08586_A47AlbREst ;
   private String[] P08586_A55AlbRReo ;
   private String[] P08586_A56AlbRUni ;
   private short[] P08587_A970ProceCod ;
   private boolean[] P08587_n970ProceCod ;
   private String[] P08587_A396EmprCod ;
   private java.math.BigDecimal[] P08587_A60AlbRUniUti ;
   private int[] P08587_A54AlbRPieUti ;
   private String[] P08587_A50AlbRLoc ;
   private int[] P08587_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08587_A58AlbRUniEnt ;
   private String[] P08587_A1291AlbRDes ;
   private String[] P08587_A1212TipEntNom ;
   private boolean[] P08587_n1212TipEntNom ;
   private short[] P08587_A1211TipEntCod ;
   private boolean[] P08587_n1211TipEntCod ;
   private String[] P08587_A841TrnNom ;
   private boolean[] P08587_n841TrnNom ;
   private short[] P08587_A840TrnCod ;
   private boolean[] P08587_n840TrnCod ;
   private String[] P08587_A971ProceNom ;
   private boolean[] P08587_n971ProceNom ;
   private String[] P08587_A3613AlbRefDsc ;
   private String[] P08587_A45AlbRef ;
   private String[] P08587_A279CliNom ;
   private int[] P08587_A252CliCod ;
   private java.util.Date[] P08587_A4606AlbRHEn ;
   private boolean[] P08587_n4606AlbRHEn ;
   private java.util.Date[] P08587_A49AlbRFen ;
   private String[] P08587_A5806AlbREnt2 ;
   private String[] P08587_A46AlbREnt ;
   private int[] P08587_A44AlbRecCod ;
   private byte[] P08587_A47AlbREst ;
   private String[] P08587_A55AlbRReo ;
   private String[] P08587_A56AlbRUni ;
   private short[] P08588_A840TrnCod ;
   private boolean[] P08588_n840TrnCod ;
   private String[] P08588_A396EmprCod ;
   private java.math.BigDecimal[] P08588_A60AlbRUniUti ;
   private int[] P08588_A54AlbRPieUti ;
   private String[] P08588_A50AlbRLoc ;
   private int[] P08588_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08588_A58AlbRUniEnt ;
   private String[] P08588_A1291AlbRDes ;
   private String[] P08588_A1212TipEntNom ;
   private boolean[] P08588_n1212TipEntNom ;
   private short[] P08588_A1211TipEntCod ;
   private boolean[] P08588_n1211TipEntCod ;
   private String[] P08588_A841TrnNom ;
   private boolean[] P08588_n841TrnNom ;
   private String[] P08588_A971ProceNom ;
   private boolean[] P08588_n971ProceNom ;
   private short[] P08588_A970ProceCod ;
   private boolean[] P08588_n970ProceCod ;
   private String[] P08588_A3613AlbRefDsc ;
   private String[] P08588_A45AlbRef ;
   private String[] P08588_A279CliNom ;
   private int[] P08588_A252CliCod ;
   private java.util.Date[] P08588_A4606AlbRHEn ;
   private boolean[] P08588_n4606AlbRHEn ;
   private java.util.Date[] P08588_A49AlbRFen ;
   private String[] P08588_A5806AlbREnt2 ;
   private String[] P08588_A46AlbREnt ;
   private int[] P08588_A44AlbRecCod ;
   private byte[] P08588_A47AlbREst ;
   private String[] P08588_A55AlbRReo ;
   private String[] P08588_A56AlbRUni ;
   private short[] P08589_A1211TipEntCod ;
   private boolean[] P08589_n1211TipEntCod ;
   private String[] P08589_A396EmprCod ;
   private java.math.BigDecimal[] P08589_A60AlbRUniUti ;
   private int[] P08589_A54AlbRPieUti ;
   private String[] P08589_A50AlbRLoc ;
   private int[] P08589_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08589_A58AlbRUniEnt ;
   private String[] P08589_A1291AlbRDes ;
   private String[] P08589_A1212TipEntNom ;
   private boolean[] P08589_n1212TipEntNom ;
   private String[] P08589_A841TrnNom ;
   private boolean[] P08589_n841TrnNom ;
   private short[] P08589_A840TrnCod ;
   private boolean[] P08589_n840TrnCod ;
   private String[] P08589_A971ProceNom ;
   private boolean[] P08589_n971ProceNom ;
   private short[] P08589_A970ProceCod ;
   private boolean[] P08589_n970ProceCod ;
   private String[] P08589_A3613AlbRefDsc ;
   private String[] P08589_A45AlbRef ;
   private String[] P08589_A279CliNom ;
   private int[] P08589_A252CliCod ;
   private java.util.Date[] P08589_A4606AlbRHEn ;
   private boolean[] P08589_n4606AlbRHEn ;
   private java.util.Date[] P08589_A49AlbRFen ;
   private String[] P08589_A5806AlbREnt2 ;
   private String[] P08589_A46AlbREnt ;
   private int[] P08589_A44AlbRecCod ;
   private byte[] P08589_A47AlbREst ;
   private String[] P08589_A55AlbRReo ;
   private String[] P08589_A56AlbRUni ;
   private String[] P085810_A396EmprCod ;
   private String[] P085810_A1291AlbRDes ;
   private java.math.BigDecimal[] P085810_A60AlbRUniUti ;
   private int[] P085810_A54AlbRPieUti ;
   private String[] P085810_A50AlbRLoc ;
   private int[] P085810_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P085810_A58AlbRUniEnt ;
   private String[] P085810_A1212TipEntNom ;
   private boolean[] P085810_n1212TipEntNom ;
   private short[] P085810_A1211TipEntCod ;
   private boolean[] P085810_n1211TipEntCod ;
   private String[] P085810_A841TrnNom ;
   private boolean[] P085810_n841TrnNom ;
   private short[] P085810_A840TrnCod ;
   private boolean[] P085810_n840TrnCod ;
   private String[] P085810_A971ProceNom ;
   private boolean[] P085810_n971ProceNom ;
   private short[] P085810_A970ProceCod ;
   private boolean[] P085810_n970ProceCod ;
   private String[] P085810_A3613AlbRefDsc ;
   private String[] P085810_A45AlbRef ;
   private String[] P085810_A279CliNom ;
   private int[] P085810_A252CliCod ;
   private java.util.Date[] P085810_A4606AlbRHEn ;
   private boolean[] P085810_n4606AlbRHEn ;
   private java.util.Date[] P085810_A49AlbRFen ;
   private String[] P085810_A5806AlbREnt2 ;
   private String[] P085810_A46AlbREnt ;
   private int[] P085810_A44AlbRecCod ;
   private byte[] P085810_A47AlbREst ;
   private String[] P085810_A55AlbRReo ;
   private String[] P085810_A56AlbRUni ;
   private String[] P085811_A396EmprCod ;
   private String[] P085811_A50AlbRLoc ;
   private java.math.BigDecimal[] P085811_A60AlbRUniUti ;
   private int[] P085811_A54AlbRPieUti ;
   private int[] P085811_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P085811_A58AlbRUniEnt ;
   private String[] P085811_A1291AlbRDes ;
   private String[] P085811_A1212TipEntNom ;
   private boolean[] P085811_n1212TipEntNom ;
   private short[] P085811_A1211TipEntCod ;
   private boolean[] P085811_n1211TipEntCod ;
   private String[] P085811_A841TrnNom ;
   private boolean[] P085811_n841TrnNom ;
   private short[] P085811_A840TrnCod ;
   private boolean[] P085811_n840TrnCod ;
   private String[] P085811_A971ProceNom ;
   private boolean[] P085811_n971ProceNom ;
   private short[] P085811_A970ProceCod ;
   private boolean[] P085811_n970ProceCod ;
   private String[] P085811_A3613AlbRefDsc ;
   private String[] P085811_A45AlbRef ;
   private String[] P085811_A279CliNom ;
   private int[] P085811_A252CliCod ;
   private java.util.Date[] P085811_A4606AlbRHEn ;
   private boolean[] P085811_n4606AlbRHEn ;
   private java.util.Date[] P085811_A49AlbRFen ;
   private String[] P085811_A5806AlbREnt2 ;
   private String[] P085811_A46AlbREnt ;
   private int[] P085811_A44AlbRecCod ;
   private byte[] P085811_A47AlbREst ;
   private String[] P085811_A55AlbRReo ;
   private String[] P085811_A56AlbRUni ;
   private GXSimpleCollection<String> AV98TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV51TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ;
   private GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV73GridStateDynamicFilter ;
}

final  class talbdetwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08582( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[46];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbREnt, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbREnt" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08583( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[46];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbREnt2, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
         GXv_int5[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbREnt2" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08584( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[46];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T5.CliNom, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni" ;
      scmdbuf += " FROM ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.CliNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08585( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[46];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRef, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRefDsc, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni" ;
      scmdbuf += " FROM ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
         GXv_int11[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08586( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[46];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRefDsc, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod," ;
      scmdbuf += " T4.ProceNom, T1.ProceCod, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
         GXv_int14[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08587( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[46];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T3.TipEntNom, T1.TipEntCod, T4.TrnNom, T1.TrnCod," ;
      scmdbuf += " T2.ProceNom, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipEntCod" ;
      scmdbuf += " = T1.TipEntCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
         GXv_int17[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProceNom = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipEntNom = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P08588( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[46];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T3.TipEntNom, T1.TipEntCod, T2.TrnNom, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) LEFT JOIN TXPENTRAD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipEntCod" ;
      scmdbuf += " = T1.TipEntCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
         GXv_int20[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipEntNom = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08589( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV116Talbdetwwds_10_tfalbreccod ,
                                          int AV117Talbdetwwds_11_tfalbreccod_to ,
                                          String AV119Talbdetwwds_13_tfalbrent_sel ,
                                          String AV118Talbdetwwds_12_tfalbrent ,
                                          String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV120Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                          int AV124Talbdetwwds_18_tfclicod ,
                                          int AV125Talbdetwwds_19_tfclicod_to ,
                                          String AV127Talbdetwwds_21_tfclinom_sel ,
                                          String AV126Talbdetwwds_20_tfclinom ,
                                          String AV129Talbdetwwds_23_tfalbref_sel ,
                                          String AV128Talbdetwwds_22_tfalbref ,
                                          String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV130Talbdetwwds_24_tfalbrefdsc ,
                                          short AV132Talbdetwwds_26_tfprocecod ,
                                          short AV133Talbdetwwds_27_tfprocecod_to ,
                                          String AV135Talbdetwwds_29_tfprocenom_sel ,
                                          String AV134Talbdetwwds_28_tfprocenom ,
                                          short AV136Talbdetwwds_30_tftrncod ,
                                          short AV137Talbdetwwds_31_tftrncod_to ,
                                          String AV139Talbdetwwds_33_tftrnnom_sel ,
                                          String AV138Talbdetwwds_32_tftrnnom ,
                                          short AV140Talbdetwwds_34_tftipentcod ,
                                          short AV141Talbdetwwds_35_tftipentcod_to ,
                                          String AV143Talbdetwwds_37_tftipentnom_sel ,
                                          String AV142Talbdetwwds_36_tftipentnom ,
                                          String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV144Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                          int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV149Talbdetwwds_43_tfalbrpieent ,
                                          int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV151Talbdetwwds_45_tfalbrloc ,
                                          int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV154Talbdetwwds_48_tfalbrpieuti ,
                                          int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV109Talbdetwwds_3_albrest1 ,
                                          byte AV112Talbdetwwds_6_albrest2 ,
                                          byte AV115Talbdetwwds_9_albrest3 ,
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
                                          String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[46];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.TipEntCod, T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
         GXv_int23[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
         GXv_int23[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipEntCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P085810( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                           String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                           String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           int AV116Talbdetwwds_10_tfalbreccod ,
                                           int AV117Talbdetwwds_11_tfalbreccod_to ,
                                           String AV119Talbdetwwds_13_tfalbrent_sel ,
                                           String AV118Talbdetwwds_12_tfalbrent ,
                                           String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           String AV120Talbdetwwds_14_tfalbrent2 ,
                                           java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                           java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                           int AV124Talbdetwwds_18_tfclicod ,
                                           int AV125Talbdetwwds_19_tfclicod_to ,
                                           String AV127Talbdetwwds_21_tfclinom_sel ,
                                           String AV126Talbdetwwds_20_tfclinom ,
                                           String AV129Talbdetwwds_23_tfalbref_sel ,
                                           String AV128Talbdetwwds_22_tfalbref ,
                                           String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           String AV130Talbdetwwds_24_tfalbrefdsc ,
                                           short AV132Talbdetwwds_26_tfprocecod ,
                                           short AV133Talbdetwwds_27_tfprocecod_to ,
                                           String AV135Talbdetwwds_29_tfprocenom_sel ,
                                           String AV134Talbdetwwds_28_tfprocenom ,
                                           short AV136Talbdetwwds_30_tftrncod ,
                                           short AV137Talbdetwwds_31_tftrncod_to ,
                                           String AV139Talbdetwwds_33_tftrnnom_sel ,
                                           String AV138Talbdetwwds_32_tftrnnom ,
                                           short AV140Talbdetwwds_34_tftipentcod ,
                                           short AV141Talbdetwwds_35_tftipentcod_to ,
                                           String AV143Talbdetwwds_37_tftipentnom_sel ,
                                           String AV142Talbdetwwds_36_tftipentnom ,
                                           String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           String AV144Talbdetwwds_38_tfalbrdes ,
                                           java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                           java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                           int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                           int AV149Talbdetwwds_43_tfalbrpieent ,
                                           int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                           String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           String AV151Talbdetwwds_45_tfalbrloc ,
                                           int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                           int AV154Talbdetwwds_48_tfalbrpieuti ,
                                           int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                           java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                           java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           byte A47AlbREst ,
                                           byte AV109Talbdetwwds_3_albrest1 ,
                                           byte AV112Talbdetwwds_6_albrest2 ,
                                           byte AV115Talbdetwwds_9_albrest3 ,
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
                                           String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[46];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRDes, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
         GXv_int26[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
         GXv_int26[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRDes" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P085811( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV148Talbdetwwds_42_tfalbruni_sels ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV153Talbdetwwds_47_tfalbrreo_sels ,
                                           String AV108Talbdetwwds_2_dynamicfiltersselector1 ,
                                           boolean AV110Talbdetwwds_4_dynamicfiltersenabled2 ,
                                           String AV111Talbdetwwds_5_dynamicfiltersselector2 ,
                                           boolean AV113Talbdetwwds_7_dynamicfiltersenabled3 ,
                                           String AV114Talbdetwwds_8_dynamicfiltersselector3 ,
                                           int AV116Talbdetwwds_10_tfalbreccod ,
                                           int AV117Talbdetwwds_11_tfalbreccod_to ,
                                           String AV119Talbdetwwds_13_tfalbrent_sel ,
                                           String AV118Talbdetwwds_12_tfalbrent ,
                                           String AV121Talbdetwwds_15_tfalbrent2_sel ,
                                           String AV120Talbdetwwds_14_tfalbrent2 ,
                                           java.util.Date AV122Talbdetwwds_16_tfalbrfen ,
                                           java.util.Date AV123Talbdetwwds_17_tfalbrhen ,
                                           int AV124Talbdetwwds_18_tfclicod ,
                                           int AV125Talbdetwwds_19_tfclicod_to ,
                                           String AV127Talbdetwwds_21_tfclinom_sel ,
                                           String AV126Talbdetwwds_20_tfclinom ,
                                           String AV129Talbdetwwds_23_tfalbref_sel ,
                                           String AV128Talbdetwwds_22_tfalbref ,
                                           String AV131Talbdetwwds_25_tfalbrefdsc_sel ,
                                           String AV130Talbdetwwds_24_tfalbrefdsc ,
                                           short AV132Talbdetwwds_26_tfprocecod ,
                                           short AV133Talbdetwwds_27_tfprocecod_to ,
                                           String AV135Talbdetwwds_29_tfprocenom_sel ,
                                           String AV134Talbdetwwds_28_tfprocenom ,
                                           short AV136Talbdetwwds_30_tftrncod ,
                                           short AV137Talbdetwwds_31_tftrncod_to ,
                                           String AV139Talbdetwwds_33_tftrnnom_sel ,
                                           String AV138Talbdetwwds_32_tftrnnom ,
                                           short AV140Talbdetwwds_34_tftipentcod ,
                                           short AV141Talbdetwwds_35_tftipentcod_to ,
                                           String AV143Talbdetwwds_37_tftipentnom_sel ,
                                           String AV142Talbdetwwds_36_tftipentnom ,
                                           String AV145Talbdetwwds_39_tfalbrdes_sel ,
                                           String AV144Talbdetwwds_38_tfalbrdes ,
                                           java.math.BigDecimal AV146Talbdetwwds_40_tfalbrunient ,
                                           java.math.BigDecimal AV147Talbdetwwds_41_tfalbrunient_to ,
                                           int AV148Talbdetwwds_42_tfalbruni_sels_size ,
                                           int AV149Talbdetwwds_43_tfalbrpieent ,
                                           int AV150Talbdetwwds_44_tfalbrpieent_to ,
                                           String AV152Talbdetwwds_46_tfalbrloc_sel ,
                                           String AV151Talbdetwwds_45_tfalbrloc ,
                                           int AV153Talbdetwwds_47_tfalbrreo_sels_size ,
                                           int AV154Talbdetwwds_48_tfalbrpieuti ,
                                           int AV155Talbdetwwds_49_tfalbrpieuti_to ,
                                           java.math.BigDecimal AV156Talbdetwwds_50_tfalbruniuti ,
                                           java.math.BigDecimal AV157Talbdetwwds_51_tfalbruniuti_to ,
                                           byte A47AlbREst ,
                                           byte AV109Talbdetwwds_3_albrest1 ,
                                           byte AV112Talbdetwwds_6_albrest2 ,
                                           byte AV115Talbdetwwds_9_albrest3 ,
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
                                           String AV107Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[46];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRLoc, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV108Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
         GXv_int29[1] = (byte)(1) ;
      }
      if ( AV110Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV111Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
         GXv_int29[3] = (byte)(1) ;
      }
      if ( AV113Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV114Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV132Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV136Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (0==AV140Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( AV148Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV148Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV149Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
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
                  return conditional_P08582(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 1 :
                  return conditional_P08583(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 2 :
                  return conditional_P08584(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 3 :
                  return conditional_P08585(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 4 :
                  return conditional_P08586(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 5 :
                  return conditional_P08587(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 6 :
                  return conditional_P08588(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 7 :
                  return conditional_P08589(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 8 :
                  return conditional_P085810(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
            case 9 :
                  return conditional_P085811(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , (String)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08582", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08583", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08584", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08585", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08586", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08587", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08588", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08589", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P085810", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P085811", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
      }
   }

}

