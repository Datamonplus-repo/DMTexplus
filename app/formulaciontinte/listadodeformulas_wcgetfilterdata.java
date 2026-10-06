package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeformulas_wcgetfilterdata extends GXProcedure
{
   public listadodeformulas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeformulas_wcgetfilterdata.class ), "" );
   }

   public listadodeformulas_wcgetfilterdata( int remoteHandle ,
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
      listadodeformulas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodeformulas_wcgetfilterdata.this.AV136DDOName = aP0;
      listadodeformulas_wcgetfilterdata.this.AV134SearchTxt = aP1;
      listadodeformulas_wcgetfilterdata.this.AV135SearchTxtTo = aP2;
      listadodeformulas_wcgetfilterdata.this.aP3 = aP3;
      listadodeformulas_wcgetfilterdata.this.aP4 = aP4;
      listadodeformulas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV139Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV142OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV144OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_FORTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORTIPARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_INTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV136DDOName), "DDO_INTDSCF") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCFOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV140OptionsJson = AV139Options.toJSonString(false) ;
      AV143OptionsDescJson = AV142OptionsDesc.toJSonString(false) ;
      AV145OptionIndexesJson = AV144OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV147Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), "") == 0 )
      {
         AV149GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      else
      {
         AV149GridState.fromxml(AV147Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      AV172GXV1 = 1 ;
      while ( AV172GXV1 <= AV149GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV150GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV149GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV172GXV1));
         if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV152FilterFullText = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV18TFForSer = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV19TFForSer_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV20TFForSerDsc = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV21TFForSerDsc_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPART") == 0 )
         {
            AV90TFForTipArt = (short)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV91TFForTipArt_To = (short)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV164TFForTipArtDsc = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV165TFForTipArtDsc_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV22TFForColNom = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV23TFForColNom_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV24TFForColNum = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFForColNum_To = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV26TFTipColCod = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFTipColCod_To = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV28TFTipColDsc = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV29TFTipColDsc_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV30TFIntCod = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFIntCod_To = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV32TFIntDsc = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV33TFIntDsc_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCODF") == 0 )
         {
            AV42TFIntCodF = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFIntCodF_To = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF") == 0 )
         {
            AV44TFIntDscF = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF_SEL") == 0 )
         {
            AV45TFIntDscF_Sel = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV72TFForNumCol = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFForNumCol_To = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV168TFForBlo_SelsJson = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV169TFForBlo_Sels.fromJSonString(AV168TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOSFORM") == 0 )
         {
            AV116TFForCosForm = CommonUtil.decimalVal( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV117TFForCosForm_To = CommonUtil.decimalVal( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV74TFForFec = localUtil.ctod( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV80TFForUltMod = localUtil.ctod( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV153Emprcod = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV154Clicod = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV155Clicod_to = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV156Forser = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV157Forser_to = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV158Forcolnum = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV159Forcolnum_to = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV160Forcolnom = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV161Forcolnom_to = AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV162Tipcolcod = (byte)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV163Tipcolcod_to = (short)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLFROM") == 0 )
         {
            AV166ForNumColfrom = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLTO") == 0 )
         {
            AV167ForNumColto = (int)(GXutil.lval( AV150GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV172GXV1 = (int)(AV172GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV134SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A396EmprCod ,
                                           AV153Emprcod ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK2 */
      pr_default.execute(0, new Object[] {AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV153Emprcod, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9DK2 = false ;
         A396EmprCod = P09DK2_A396EmprCod[0] ;
         A10045CliAct = P09DK2_A10045CliAct[0] ;
         A279CliNom = P09DK2_A279CliNom[0] ;
         A495ForUltMod = P09DK2_A495ForUltMod[0] ;
         n495ForUltMod = P09DK2_n495ForUltMod[0] ;
         A485ForFec = P09DK2_A485ForFec[0] ;
         n485ForFec = P09DK2_n485ForFec[0] ;
         A4380ForCosForm = P09DK2_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK2_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK2_A486ForNumCol[0] ;
         A5363IntDscF = P09DK2_A5363IntDscF[0] ;
         n5363IntDscF = P09DK2_n5363IntDscF[0] ;
         A5362IntCodF = P09DK2_A5362IntCodF[0] ;
         n5362IntCodF = P09DK2_n5362IntCodF[0] ;
         A584IntDsc = P09DK2_A584IntDsc[0] ;
         n584IntDsc = P09DK2_n584IntDsc[0] ;
         A583IntCod = P09DK2_A583IntCod[0] ;
         A832TipColDsc = P09DK2_A832TipColDsc[0] ;
         n832TipColDsc = P09DK2_n832TipColDsc[0] ;
         A831TipColCod = P09DK2_A831TipColCod[0] ;
         A483ForColNum = P09DK2_A483ForColNum[0] ;
         A482ForColNom = P09DK2_A482ForColNom[0] ;
         A4384ForTipArt = P09DK2_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK2_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK2_n5742ForSerDsc[0] ;
         A494ForSer = P09DK2_A494ForSer[0] ;
         A252CliCod = P09DK2_A252CliCod[0] ;
         A7781ForBlo = P09DK2_A7781ForBlo[0] ;
         n7781ForBlo = P09DK2_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK2_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DK2_A5363IntDscF[0] ;
         n5363IntDscF = P09DK2_n5363IntDscF[0] ;
         A584IntDsc = P09DK2_A584IntDsc[0] ;
         n584IntDsc = P09DK2_n584IntDsc[0] ;
         A832TipColDsc = P09DK2_A832TipColDsc[0] ;
         n832TipColDsc = P09DK2_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK2_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK2_A10045CliAct[0] ;
         A279CliNom = P09DK2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09DK2_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk9DK2 = false ;
               A396EmprCod = P09DK2_A396EmprCod[0] ;
               A831TipColCod = P09DK2_A831TipColCod[0] ;
               A483ForColNum = P09DK2_A483ForColNum[0] ;
               A482ForColNom = P09DK2_A482ForColNom[0] ;
               A494ForSer = P09DK2_A494ForSer[0] ;
               A252CliCod = P09DK2_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV138Option = A279CliNom ;
               AV139Options.add(AV138Option, 0);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK2 )
         {
            brk9DK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV18TFForSer = AV134SearchTxt ;
      AV19TFForSer_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A396EmprCod ,
                                           AV153Emprcod ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK3 */
      pr_default.execute(1, new Object[] {AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV153Emprcod, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9DK4 = false ;
         A396EmprCod = P09DK3_A396EmprCod[0] ;
         A10045CliAct = P09DK3_A10045CliAct[0] ;
         A494ForSer = P09DK3_A494ForSer[0] ;
         A495ForUltMod = P09DK3_A495ForUltMod[0] ;
         n495ForUltMod = P09DK3_n495ForUltMod[0] ;
         A485ForFec = P09DK3_A485ForFec[0] ;
         n485ForFec = P09DK3_n485ForFec[0] ;
         A4380ForCosForm = P09DK3_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK3_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK3_A486ForNumCol[0] ;
         A5363IntDscF = P09DK3_A5363IntDscF[0] ;
         n5363IntDscF = P09DK3_n5363IntDscF[0] ;
         A5362IntCodF = P09DK3_A5362IntCodF[0] ;
         n5362IntCodF = P09DK3_n5362IntCodF[0] ;
         A584IntDsc = P09DK3_A584IntDsc[0] ;
         n584IntDsc = P09DK3_n584IntDsc[0] ;
         A583IntCod = P09DK3_A583IntCod[0] ;
         A832TipColDsc = P09DK3_A832TipColDsc[0] ;
         n832TipColDsc = P09DK3_n832TipColDsc[0] ;
         A831TipColCod = P09DK3_A831TipColCod[0] ;
         A483ForColNum = P09DK3_A483ForColNum[0] ;
         A482ForColNom = P09DK3_A482ForColNom[0] ;
         A4384ForTipArt = P09DK3_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK3_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK3_n5742ForSerDsc[0] ;
         A279CliNom = P09DK3_A279CliNom[0] ;
         A252CliCod = P09DK3_A252CliCod[0] ;
         A7781ForBlo = P09DK3_A7781ForBlo[0] ;
         n7781ForBlo = P09DK3_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK3_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK3_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DK3_A5363IntDscF[0] ;
         n5363IntDscF = P09DK3_n5363IntDscF[0] ;
         A584IntDsc = P09DK3_A584IntDsc[0] ;
         n584IntDsc = P09DK3_n584IntDsc[0] ;
         A832TipColDsc = P09DK3_A832TipColDsc[0] ;
         n832TipColDsc = P09DK3_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK3_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK3_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK3_A10045CliAct[0] ;
         A279CliNom = P09DK3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09DK3_A494ForSer[0], A494ForSer) == 0 ) )
            {
               brk9DK4 = false ;
               A396EmprCod = P09DK3_A396EmprCod[0] ;
               A831TipColCod = P09DK3_A831TipColCod[0] ;
               A483ForColNum = P09DK3_A483ForColNum[0] ;
               A482ForColNom = P09DK3_A482ForColNom[0] ;
               A252CliCod = P09DK3_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A494ForSer)==0) )
            {
               AV138Option = A494ForSer ;
               AV139Options.add(AV138Option, 0);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK4 )
         {
            brk9DK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFForSerDsc = AV134SearchTxt ;
      AV21TFForSerDsc_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A396EmprCod ,
                                           AV153Emprcod ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK4 */
      pr_default.execute(2, new Object[] {AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV153Emprcod, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9DK6 = false ;
         A396EmprCod = P09DK4_A396EmprCod[0] ;
         A10045CliAct = P09DK4_A10045CliAct[0] ;
         A5742ForSerDsc = P09DK4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK4_n5742ForSerDsc[0] ;
         A495ForUltMod = P09DK4_A495ForUltMod[0] ;
         n495ForUltMod = P09DK4_n495ForUltMod[0] ;
         A485ForFec = P09DK4_A485ForFec[0] ;
         n485ForFec = P09DK4_n485ForFec[0] ;
         A4380ForCosForm = P09DK4_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK4_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK4_A486ForNumCol[0] ;
         A5363IntDscF = P09DK4_A5363IntDscF[0] ;
         n5363IntDscF = P09DK4_n5363IntDscF[0] ;
         A5362IntCodF = P09DK4_A5362IntCodF[0] ;
         n5362IntCodF = P09DK4_n5362IntCodF[0] ;
         A584IntDsc = P09DK4_A584IntDsc[0] ;
         n584IntDsc = P09DK4_n584IntDsc[0] ;
         A583IntCod = P09DK4_A583IntCod[0] ;
         A832TipColDsc = P09DK4_A832TipColDsc[0] ;
         n832TipColDsc = P09DK4_n832TipColDsc[0] ;
         A831TipColCod = P09DK4_A831TipColCod[0] ;
         A483ForColNum = P09DK4_A483ForColNum[0] ;
         A482ForColNom = P09DK4_A482ForColNom[0] ;
         A4384ForTipArt = P09DK4_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK4_n4384ForTipArt[0] ;
         A494ForSer = P09DK4_A494ForSer[0] ;
         A279CliNom = P09DK4_A279CliNom[0] ;
         A252CliCod = P09DK4_A252CliCod[0] ;
         A7781ForBlo = P09DK4_A7781ForBlo[0] ;
         n7781ForBlo = P09DK4_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK4_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK4_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DK4_A5363IntDscF[0] ;
         n5363IntDscF = P09DK4_n5363IntDscF[0] ;
         A584IntDsc = P09DK4_A584IntDsc[0] ;
         n584IntDsc = P09DK4_n584IntDsc[0] ;
         A832TipColDsc = P09DK4_A832TipColDsc[0] ;
         n832TipColDsc = P09DK4_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK4_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK4_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK4_A10045CliAct[0] ;
         A279CliNom = P09DK4_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09DK4_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
            {
               brk9DK6 = false ;
               A396EmprCod = P09DK4_A396EmprCod[0] ;
               A831TipColCod = P09DK4_A831TipColCod[0] ;
               A483ForColNum = P09DK4_A483ForColNum[0] ;
               A482ForColNom = P09DK4_A482ForColNom[0] ;
               A494ForSer = P09DK4_A494ForSer[0] ;
               A252CliCod = P09DK4_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
            {
               AV138Option = A5742ForSerDsc ;
               AV139Options.add(AV138Option, 0);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK6 )
         {
            brk9DK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV164TFForTipArtDsc = AV134SearchTxt ;
      AV165TFForTipArtDsc_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV153Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK5 */
      pr_default.execute(3, new Object[] {AV153Emprcod, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10045CliAct = P09DK5_A10045CliAct[0] ;
         A396EmprCod = P09DK5_A396EmprCod[0] ;
         A495ForUltMod = P09DK5_A495ForUltMod[0] ;
         n495ForUltMod = P09DK5_n495ForUltMod[0] ;
         A485ForFec = P09DK5_A485ForFec[0] ;
         n485ForFec = P09DK5_n485ForFec[0] ;
         A4380ForCosForm = P09DK5_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK5_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK5_A486ForNumCol[0] ;
         A5363IntDscF = P09DK5_A5363IntDscF[0] ;
         n5363IntDscF = P09DK5_n5363IntDscF[0] ;
         A5362IntCodF = P09DK5_A5362IntCodF[0] ;
         n5362IntCodF = P09DK5_n5362IntCodF[0] ;
         A584IntDsc = P09DK5_A584IntDsc[0] ;
         n584IntDsc = P09DK5_n584IntDsc[0] ;
         A583IntCod = P09DK5_A583IntCod[0] ;
         A832TipColDsc = P09DK5_A832TipColDsc[0] ;
         n832TipColDsc = P09DK5_n832TipColDsc[0] ;
         A831TipColCod = P09DK5_A831TipColCod[0] ;
         A483ForColNum = P09DK5_A483ForColNum[0] ;
         A482ForColNom = P09DK5_A482ForColNom[0] ;
         A4384ForTipArt = P09DK5_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK5_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK5_n5742ForSerDsc[0] ;
         A494ForSer = P09DK5_A494ForSer[0] ;
         A279CliNom = P09DK5_A279CliNom[0] ;
         A252CliCod = P09DK5_A252CliCod[0] ;
         A7781ForBlo = P09DK5_A7781ForBlo[0] ;
         n7781ForBlo = P09DK5_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK5_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK5_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DK5_A5363IntDscF[0] ;
         n5363IntDscF = P09DK5_n5363IntDscF[0] ;
         A584IntDsc = P09DK5_A584IntDsc[0] ;
         n584IntDsc = P09DK5_n584IntDsc[0] ;
         A832TipColDsc = P09DK5_A832TipColDsc[0] ;
         n832TipColDsc = P09DK5_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK5_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK5_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK5_A10045CliAct[0] ;
         A279CliNom = P09DK5_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! (GXutil.strcmp("", A13929ForTipArtD)==0) )
            {
               AV138Option = A13929ForTipArtD ;
               AV137InsertIndex = 1 ;
               while ( ( AV137InsertIndex <= AV139Options.size() ) && ( GXutil.strcmp((String)AV139Options.elementAt(-1+AV137InsertIndex), AV138Option) < 0 ) )
               {
                  AV137InsertIndex = (int)(AV137InsertIndex+1) ;
               }
               if ( ( AV137InsertIndex <= AV139Options.size() ) && ( GXutil.strcmp((String)AV139Options.elementAt(-1+AV137InsertIndex), AV138Option) == 0 ) )
               {
                  AV146count = GXutil.lval( (String)AV144OptionIndexes.elementAt(-1+AV137InsertIndex)) ;
                  AV146count = (long)(AV146count+1) ;
                  AV144OptionIndexes.removeItem(AV137InsertIndex);
                  AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), AV137InsertIndex);
               }
               else
               {
                  AV139Options.add(AV138Option, AV137InsertIndex);
                  AV144OptionIndexes.add("1", AV137InsertIndex);
               }
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFForColNom = AV134SearchTxt ;
      AV23TFForColNom_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A396EmprCod ,
                                           AV153Emprcod ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK6 */
      pr_default.execute(4, new Object[] {AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV153Emprcod, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9DK9 = false ;
         A396EmprCod = P09DK6_A396EmprCod[0] ;
         A10045CliAct = P09DK6_A10045CliAct[0] ;
         A482ForColNom = P09DK6_A482ForColNom[0] ;
         A495ForUltMod = P09DK6_A495ForUltMod[0] ;
         n495ForUltMod = P09DK6_n495ForUltMod[0] ;
         A485ForFec = P09DK6_A485ForFec[0] ;
         n485ForFec = P09DK6_n485ForFec[0] ;
         A4380ForCosForm = P09DK6_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK6_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK6_A486ForNumCol[0] ;
         A5363IntDscF = P09DK6_A5363IntDscF[0] ;
         n5363IntDscF = P09DK6_n5363IntDscF[0] ;
         A5362IntCodF = P09DK6_A5362IntCodF[0] ;
         n5362IntCodF = P09DK6_n5362IntCodF[0] ;
         A584IntDsc = P09DK6_A584IntDsc[0] ;
         n584IntDsc = P09DK6_n584IntDsc[0] ;
         A583IntCod = P09DK6_A583IntCod[0] ;
         A832TipColDsc = P09DK6_A832TipColDsc[0] ;
         n832TipColDsc = P09DK6_n832TipColDsc[0] ;
         A831TipColCod = P09DK6_A831TipColCod[0] ;
         A483ForColNum = P09DK6_A483ForColNum[0] ;
         A4384ForTipArt = P09DK6_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK6_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK6_n5742ForSerDsc[0] ;
         A494ForSer = P09DK6_A494ForSer[0] ;
         A279CliNom = P09DK6_A279CliNom[0] ;
         A252CliCod = P09DK6_A252CliCod[0] ;
         A7781ForBlo = P09DK6_A7781ForBlo[0] ;
         n7781ForBlo = P09DK6_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK6_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK6_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DK6_A5363IntDscF[0] ;
         n5363IntDscF = P09DK6_n5363IntDscF[0] ;
         A584IntDsc = P09DK6_A584IntDsc[0] ;
         n584IntDsc = P09DK6_n584IntDsc[0] ;
         A832TipColDsc = P09DK6_A832TipColDsc[0] ;
         n832TipColDsc = P09DK6_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK6_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK6_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK6_A10045CliAct[0] ;
         A279CliNom = P09DK6_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09DK6_A482ForColNom[0], A482ForColNom) == 0 ) )
            {
               brk9DK9 = false ;
               A396EmprCod = P09DK6_A396EmprCod[0] ;
               A831TipColCod = P09DK6_A831TipColCod[0] ;
               A483ForColNum = P09DK6_A483ForColNum[0] ;
               A494ForSer = P09DK6_A494ForSer[0] ;
               A252CliCod = P09DK6_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK9 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
            {
               AV138Option = A482ForColNom ;
               AV139Options.add(AV138Option, 0);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK9 )
         {
            brk9DK9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV28TFTipColDsc = AV134SearchTxt ;
      AV29TFTipColDsc_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV153Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK7 */
      pr_default.execute(5, new Object[] {AV153Emprcod, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9DK11 = false ;
         A831TipColCod = P09DK7_A831TipColCod[0] ;
         A396EmprCod = P09DK7_A396EmprCod[0] ;
         A10045CliAct = P09DK7_A10045CliAct[0] ;
         A495ForUltMod = P09DK7_A495ForUltMod[0] ;
         n495ForUltMod = P09DK7_n495ForUltMod[0] ;
         A485ForFec = P09DK7_A485ForFec[0] ;
         n485ForFec = P09DK7_n485ForFec[0] ;
         A4380ForCosForm = P09DK7_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK7_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK7_A486ForNumCol[0] ;
         A5363IntDscF = P09DK7_A5363IntDscF[0] ;
         n5363IntDscF = P09DK7_n5363IntDscF[0] ;
         A5362IntCodF = P09DK7_A5362IntCodF[0] ;
         n5362IntCodF = P09DK7_n5362IntCodF[0] ;
         A584IntDsc = P09DK7_A584IntDsc[0] ;
         n584IntDsc = P09DK7_n584IntDsc[0] ;
         A583IntCod = P09DK7_A583IntCod[0] ;
         A832TipColDsc = P09DK7_A832TipColDsc[0] ;
         n832TipColDsc = P09DK7_n832TipColDsc[0] ;
         A483ForColNum = P09DK7_A483ForColNum[0] ;
         A482ForColNom = P09DK7_A482ForColNom[0] ;
         A4384ForTipArt = P09DK7_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK7_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK7_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK7_n5742ForSerDsc[0] ;
         A494ForSer = P09DK7_A494ForSer[0] ;
         A279CliNom = P09DK7_A279CliNom[0] ;
         A252CliCod = P09DK7_A252CliCod[0] ;
         A7781ForBlo = P09DK7_A7781ForBlo[0] ;
         n7781ForBlo = P09DK7_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK7_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK7_n13929ForTipArtD[0] ;
         A832TipColDsc = P09DK7_A832TipColDsc[0] ;
         n832TipColDsc = P09DK7_n832TipColDsc[0] ;
         A5363IntDscF = P09DK7_A5363IntDscF[0] ;
         n5363IntDscF = P09DK7_n5363IntDscF[0] ;
         A584IntDsc = P09DK7_A584IntDsc[0] ;
         n584IntDsc = P09DK7_n584IntDsc[0] ;
         A13929ForTipArtD = P09DK7_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK7_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK7_A10045CliAct[0] ;
         A279CliNom = P09DK7_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09DK7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09DK7_A831TipColCod[0] == A831TipColCod ) )
            {
               brk9DK11 = false ;
               A483ForColNum = P09DK7_A483ForColNum[0] ;
               A482ForColNom = P09DK7_A482ForColNom[0] ;
               A494ForSer = P09DK7_A494ForSer[0] ;
               A252CliCod = P09DK7_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK11 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
            {
               AV138Option = A832TipColDsc ;
               AV137InsertIndex = 1 ;
               while ( ( AV137InsertIndex <= AV139Options.size() ) && ( GXutil.strcmp((String)AV139Options.elementAt(-1+AV137InsertIndex), AV138Option) < 0 ) )
               {
                  AV137InsertIndex = (int)(AV137InsertIndex+1) ;
               }
               AV139Options.add(AV138Option, AV137InsertIndex);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), AV137InsertIndex);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK11 )
         {
            brk9DK11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV32TFIntDsc = AV134SearchTxt ;
      AV33TFIntDsc_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV153Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK8 */
      pr_default.execute(6, new Object[] {AV153Emprcod, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9DK13 = false ;
         A583IntCod = P09DK8_A583IntCod[0] ;
         A396EmprCod = P09DK8_A396EmprCod[0] ;
         A10045CliAct = P09DK8_A10045CliAct[0] ;
         A495ForUltMod = P09DK8_A495ForUltMod[0] ;
         n495ForUltMod = P09DK8_n495ForUltMod[0] ;
         A485ForFec = P09DK8_A485ForFec[0] ;
         n485ForFec = P09DK8_n485ForFec[0] ;
         A4380ForCosForm = P09DK8_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK8_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK8_A486ForNumCol[0] ;
         A5363IntDscF = P09DK8_A5363IntDscF[0] ;
         n5363IntDscF = P09DK8_n5363IntDscF[0] ;
         A5362IntCodF = P09DK8_A5362IntCodF[0] ;
         n5362IntCodF = P09DK8_n5362IntCodF[0] ;
         A584IntDsc = P09DK8_A584IntDsc[0] ;
         n584IntDsc = P09DK8_n584IntDsc[0] ;
         A832TipColDsc = P09DK8_A832TipColDsc[0] ;
         n832TipColDsc = P09DK8_n832TipColDsc[0] ;
         A831TipColCod = P09DK8_A831TipColCod[0] ;
         A483ForColNum = P09DK8_A483ForColNum[0] ;
         A482ForColNom = P09DK8_A482ForColNom[0] ;
         A4384ForTipArt = P09DK8_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK8_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK8_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK8_n5742ForSerDsc[0] ;
         A494ForSer = P09DK8_A494ForSer[0] ;
         A279CliNom = P09DK8_A279CliNom[0] ;
         A252CliCod = P09DK8_A252CliCod[0] ;
         A7781ForBlo = P09DK8_A7781ForBlo[0] ;
         n7781ForBlo = P09DK8_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK8_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK8_n13929ForTipArtD[0] ;
         A584IntDsc = P09DK8_A584IntDsc[0] ;
         n584IntDsc = P09DK8_n584IntDsc[0] ;
         A5363IntDscF = P09DK8_A5363IntDscF[0] ;
         n5363IntDscF = P09DK8_n5363IntDscF[0] ;
         A832TipColDsc = P09DK8_A832TipColDsc[0] ;
         n832TipColDsc = P09DK8_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK8_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK8_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK8_A10045CliAct[0] ;
         A279CliNom = P09DK8_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09DK8_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09DK8_A583IntCod[0] == A583IntCod ) )
            {
               brk9DK13 = false ;
               A831TipColCod = P09DK8_A831TipColCod[0] ;
               A483ForColNum = P09DK8_A483ForColNum[0] ;
               A482ForColNom = P09DK8_A482ForColNom[0] ;
               A494ForSer = P09DK8_A494ForSer[0] ;
               A252CliCod = P09DK8_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK13 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A584IntDsc)==0) )
            {
               AV138Option = A584IntDsc ;
               AV137InsertIndex = 1 ;
               while ( ( AV137InsertIndex <= AV139Options.size() ) && ( GXutil.strcmp((String)AV139Options.elementAt(-1+AV137InsertIndex), AV138Option) < 0 ) )
               {
                  AV137InsertIndex = (int)(AV137InsertIndex+1) ;
               }
               AV139Options.add(AV138Option, AV137InsertIndex);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), AV137InsertIndex);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK13 )
         {
            brk9DK13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADINTDSCFOPTIONS' Routine */
      returnInSub = false ;
      AV44TFIntDscF = AV134SearchTxt ;
      AV45TFIntDscF_Sel = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV152FilterFullText ;
      AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV14TFCliCod ;
      AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV15TFCliCod_To ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV16TFCliNom ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV18TFForSer ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV19TFForSer_Sel ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV20TFForSerDsc ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV21TFForSerDsc_Sel ;
      AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV90TFForTipArt ;
      AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV91TFForTipArt_To ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV164TFForTipArtDsc ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV165TFForTipArtDsc_Sel ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV22TFForColNom ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV23TFForColNom_Sel ;
      AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV24TFForColNum ;
      AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV25TFForColNum_To ;
      AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV26TFTipColCod ;
      AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV27TFTipColCod_To ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV28TFTipColDsc ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV29TFTipColDsc_Sel ;
      AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV30TFIntCod ;
      AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV31TFIntCod_To ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV32TFIntDsc ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV33TFIntDsc_Sel ;
      AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV42TFIntCodF ;
      AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV43TFIntCodF_To ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV44TFIntDscF ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV45TFIntDscF_Sel ;
      AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV72TFForNumCol ;
      AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV73TFForNumCol_To ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV169TFForBlo_Sels ;
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV116TFForCosForm ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV117TFForCosForm_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV74TFForFec ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV80TFForUltMod ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV154Clicod) ,
                                           Integer.valueOf(AV155Clicod_to) ,
                                           AV156Forser ,
                                           AV157Forser_to ,
                                           AV160Forcolnom ,
                                           AV161Forcolnom_to ,
                                           Integer.valueOf(AV158Forcolnum) ,
                                           Integer.valueOf(AV159Forcolnum_to) ,
                                           Byte.valueOf(AV162Tipcolcod) ,
                                           Short.valueOf(AV163Tipcolcod_to) ,
                                           Integer.valueOf(AV166ForNumColfrom) ,
                                           Integer.valueOf(AV167ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV153Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DK9 */
      pr_default.execute(7, new Object[] {AV153Emprcod, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV154Clicod), Integer.valueOf(AV155Clicod_to), AV156Forser, AV157Forser_to, AV160Forcolnom, AV161Forcolnom_to, Integer.valueOf(AV158Forcolnum), Integer.valueOf(AV159Forcolnum_to), Byte.valueOf(AV162Tipcolcod), Short.valueOf(AV163Tipcolcod_to), Integer.valueOf(AV166ForNumColfrom), Integer.valueOf(AV167ForNumColto)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9DK15 = false ;
         A5362IntCodF = P09DK9_A5362IntCodF[0] ;
         n5362IntCodF = P09DK9_n5362IntCodF[0] ;
         A396EmprCod = P09DK9_A396EmprCod[0] ;
         A10045CliAct = P09DK9_A10045CliAct[0] ;
         A495ForUltMod = P09DK9_A495ForUltMod[0] ;
         n495ForUltMod = P09DK9_n495ForUltMod[0] ;
         A485ForFec = P09DK9_A485ForFec[0] ;
         n485ForFec = P09DK9_n485ForFec[0] ;
         A4380ForCosForm = P09DK9_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DK9_n4380ForCosForm[0] ;
         A486ForNumCol = P09DK9_A486ForNumCol[0] ;
         A5363IntDscF = P09DK9_A5363IntDscF[0] ;
         n5363IntDscF = P09DK9_n5363IntDscF[0] ;
         A584IntDsc = P09DK9_A584IntDsc[0] ;
         n584IntDsc = P09DK9_n584IntDsc[0] ;
         A583IntCod = P09DK9_A583IntCod[0] ;
         A832TipColDsc = P09DK9_A832TipColDsc[0] ;
         n832TipColDsc = P09DK9_n832TipColDsc[0] ;
         A831TipColCod = P09DK9_A831TipColCod[0] ;
         A483ForColNum = P09DK9_A483ForColNum[0] ;
         A482ForColNom = P09DK9_A482ForColNom[0] ;
         A4384ForTipArt = P09DK9_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DK9_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DK9_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DK9_n5742ForSerDsc[0] ;
         A494ForSer = P09DK9_A494ForSer[0] ;
         A279CliNom = P09DK9_A279CliNom[0] ;
         A252CliCod = P09DK9_A252CliCod[0] ;
         A7781ForBlo = P09DK9_A7781ForBlo[0] ;
         n7781ForBlo = P09DK9_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DK9_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK9_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DK9_A5363IntDscF[0] ;
         n5363IntDscF = P09DK9_n5363IntDscF[0] ;
         A584IntDsc = P09DK9_A584IntDsc[0] ;
         n584IntDsc = P09DK9_n584IntDsc[0] ;
         A832TipColDsc = P09DK9_A832TipColDsc[0] ;
         n832TipColDsc = P09DK9_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DK9_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DK9_n13929ForTipArtD[0] ;
         A10045CliAct = P09DK9_A10045CliAct[0] ;
         A279CliNom = P09DK9_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV146count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09DK9_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09DK9_A5362IntCodF[0] == A5362IntCodF ) )
            {
               brk9DK15 = false ;
               A831TipColCod = P09DK9_A831TipColCod[0] ;
               A483ForColNum = P09DK9_A483ForColNum[0] ;
               A482ForColNom = P09DK9_A482ForColNom[0] ;
               A494ForSer = P09DK9_A494ForSer[0] ;
               A252CliCod = P09DK9_A252CliCod[0] ;
               AV146count = (long)(AV146count+1) ;
               brk9DK15 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A5363IntDscF)==0) )
            {
               AV138Option = A5363IntDscF ;
               AV137InsertIndex = 1 ;
               while ( ( AV137InsertIndex <= AV139Options.size() ) && ( GXutil.strcmp((String)AV139Options.elementAt(-1+AV137InsertIndex), AV138Option) < 0 ) )
               {
                  AV137InsertIndex = (int)(AV137InsertIndex+1) ;
               }
               AV139Options.add(AV138Option, AV137InsertIndex);
               AV144OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV146count), "Z,ZZZ,ZZZ,ZZ9")), AV137InsertIndex);
            }
            if ( AV139Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9DK15 )
         {
            brk9DK15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodeformulas_wcgetfilterdata.this.AV140OptionsJson;
      this.aP4[0] = listadodeformulas_wcgetfilterdata.this.AV143OptionsDescJson;
      this.aP5[0] = listadodeformulas_wcgetfilterdata.this.AV145OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV140OptionsJson = "" ;
      AV143OptionsDescJson = "" ;
      AV145OptionIndexesJson = "" ;
      AV139Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV142OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV144OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV147Session = httpContext.getWebSession();
      AV149GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV150GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV152FilterFullText = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFForSer = "" ;
      AV19TFForSer_Sel = "" ;
      AV20TFForSerDsc = "" ;
      AV21TFForSerDsc_Sel = "" ;
      AV164TFForTipArtDsc = "" ;
      AV165TFForTipArtDsc_Sel = "" ;
      AV22TFForColNom = "" ;
      AV23TFForColNom_Sel = "" ;
      AV28TFTipColDsc = "" ;
      AV29TFTipColDsc_Sel = "" ;
      AV32TFIntDsc = "" ;
      AV33TFIntDsc_Sel = "" ;
      AV44TFIntDscF = "" ;
      AV45TFIntDscF_Sel = "" ;
      AV168TFForBlo_SelsJson = "" ;
      AV169TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV116TFForCosForm = DecimalUtil.ZERO ;
      AV117TFForCosForm_To = DecimalUtil.ZERO ;
      AV74TFForFec = GXutil.nullDate() ;
      AV80TFForUltMod = GXutil.nullDate() ;
      AV153Emprcod = "" ;
      AV156Forser = "" ;
      AV157Forser_to = "" ;
      AV160Forcolnom = "" ;
      AV161Forcolnom_to = "" ;
      A279CliNom = "" ;
      AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = "" ;
      AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = "" ;
      AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = "" ;
      AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = "" ;
      AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = "" ;
      AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = "" ;
      AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = "" ;
      AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = "" ;
      AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = DecimalUtil.ZERO ;
      AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = DecimalUtil.ZERO ;
      AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec = GXutil.nullDate() ;
      AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = GXutil.nullDate() ;
      lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      lV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      A7781ForBlo = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A13929ForTipArtD = "" ;
      A396EmprCod = "" ;
      A10045CliAct = "" ;
      P09DK2_A829TipArtCod = new short[1] ;
      P09DK2_A396EmprCod = new String[] {""} ;
      P09DK2_A10045CliAct = new String[] {""} ;
      P09DK2_A279CliNom = new String[] {""} ;
      P09DK2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK2_n495ForUltMod = new boolean[] {false} ;
      P09DK2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK2_n485ForFec = new boolean[] {false} ;
      P09DK2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK2_n4380ForCosForm = new boolean[] {false} ;
      P09DK2_A486ForNumCol = new int[1] ;
      P09DK2_A5363IntDscF = new String[] {""} ;
      P09DK2_n5363IntDscF = new boolean[] {false} ;
      P09DK2_A5362IntCodF = new byte[1] ;
      P09DK2_n5362IntCodF = new boolean[] {false} ;
      P09DK2_A584IntDsc = new String[] {""} ;
      P09DK2_n584IntDsc = new boolean[] {false} ;
      P09DK2_A583IntCod = new byte[1] ;
      P09DK2_A832TipColDsc = new String[] {""} ;
      P09DK2_n832TipColDsc = new boolean[] {false} ;
      P09DK2_A831TipColCod = new byte[1] ;
      P09DK2_A483ForColNum = new int[1] ;
      P09DK2_A482ForColNom = new String[] {""} ;
      P09DK2_A4384ForTipArt = new short[1] ;
      P09DK2_n4384ForTipArt = new boolean[] {false} ;
      P09DK2_A5742ForSerDsc = new String[] {""} ;
      P09DK2_n5742ForSerDsc = new boolean[] {false} ;
      P09DK2_A494ForSer = new String[] {""} ;
      P09DK2_A252CliCod = new int[1] ;
      P09DK2_A7781ForBlo = new String[] {""} ;
      P09DK2_n7781ForBlo = new boolean[] {false} ;
      P09DK2_A13929ForTipArtD = new String[] {""} ;
      P09DK2_n13929ForTipArtD = new boolean[] {false} ;
      AV138Option = "" ;
      P09DK3_A829TipArtCod = new short[1] ;
      P09DK3_A396EmprCod = new String[] {""} ;
      P09DK3_A10045CliAct = new String[] {""} ;
      P09DK3_A494ForSer = new String[] {""} ;
      P09DK3_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK3_n495ForUltMod = new boolean[] {false} ;
      P09DK3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK3_n485ForFec = new boolean[] {false} ;
      P09DK3_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK3_n4380ForCosForm = new boolean[] {false} ;
      P09DK3_A486ForNumCol = new int[1] ;
      P09DK3_A5363IntDscF = new String[] {""} ;
      P09DK3_n5363IntDscF = new boolean[] {false} ;
      P09DK3_A5362IntCodF = new byte[1] ;
      P09DK3_n5362IntCodF = new boolean[] {false} ;
      P09DK3_A584IntDsc = new String[] {""} ;
      P09DK3_n584IntDsc = new boolean[] {false} ;
      P09DK3_A583IntCod = new byte[1] ;
      P09DK3_A832TipColDsc = new String[] {""} ;
      P09DK3_n832TipColDsc = new boolean[] {false} ;
      P09DK3_A831TipColCod = new byte[1] ;
      P09DK3_A483ForColNum = new int[1] ;
      P09DK3_A482ForColNom = new String[] {""} ;
      P09DK3_A4384ForTipArt = new short[1] ;
      P09DK3_n4384ForTipArt = new boolean[] {false} ;
      P09DK3_A5742ForSerDsc = new String[] {""} ;
      P09DK3_n5742ForSerDsc = new boolean[] {false} ;
      P09DK3_A279CliNom = new String[] {""} ;
      P09DK3_A252CliCod = new int[1] ;
      P09DK3_A7781ForBlo = new String[] {""} ;
      P09DK3_n7781ForBlo = new boolean[] {false} ;
      P09DK3_A13929ForTipArtD = new String[] {""} ;
      P09DK3_n13929ForTipArtD = new boolean[] {false} ;
      P09DK4_A829TipArtCod = new short[1] ;
      P09DK4_A396EmprCod = new String[] {""} ;
      P09DK4_A10045CliAct = new String[] {""} ;
      P09DK4_A5742ForSerDsc = new String[] {""} ;
      P09DK4_n5742ForSerDsc = new boolean[] {false} ;
      P09DK4_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK4_n495ForUltMod = new boolean[] {false} ;
      P09DK4_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK4_n485ForFec = new boolean[] {false} ;
      P09DK4_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK4_n4380ForCosForm = new boolean[] {false} ;
      P09DK4_A486ForNumCol = new int[1] ;
      P09DK4_A5363IntDscF = new String[] {""} ;
      P09DK4_n5363IntDscF = new boolean[] {false} ;
      P09DK4_A5362IntCodF = new byte[1] ;
      P09DK4_n5362IntCodF = new boolean[] {false} ;
      P09DK4_A584IntDsc = new String[] {""} ;
      P09DK4_n584IntDsc = new boolean[] {false} ;
      P09DK4_A583IntCod = new byte[1] ;
      P09DK4_A832TipColDsc = new String[] {""} ;
      P09DK4_n832TipColDsc = new boolean[] {false} ;
      P09DK4_A831TipColCod = new byte[1] ;
      P09DK4_A483ForColNum = new int[1] ;
      P09DK4_A482ForColNom = new String[] {""} ;
      P09DK4_A4384ForTipArt = new short[1] ;
      P09DK4_n4384ForTipArt = new boolean[] {false} ;
      P09DK4_A494ForSer = new String[] {""} ;
      P09DK4_A279CliNom = new String[] {""} ;
      P09DK4_A252CliCod = new int[1] ;
      P09DK4_A7781ForBlo = new String[] {""} ;
      P09DK4_n7781ForBlo = new boolean[] {false} ;
      P09DK4_A13929ForTipArtD = new String[] {""} ;
      P09DK4_n13929ForTipArtD = new boolean[] {false} ;
      P09DK5_A829TipArtCod = new short[1] ;
      P09DK5_A10045CliAct = new String[] {""} ;
      P09DK5_A396EmprCod = new String[] {""} ;
      P09DK5_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK5_n495ForUltMod = new boolean[] {false} ;
      P09DK5_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK5_n485ForFec = new boolean[] {false} ;
      P09DK5_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK5_n4380ForCosForm = new boolean[] {false} ;
      P09DK5_A486ForNumCol = new int[1] ;
      P09DK5_A5363IntDscF = new String[] {""} ;
      P09DK5_n5363IntDscF = new boolean[] {false} ;
      P09DK5_A5362IntCodF = new byte[1] ;
      P09DK5_n5362IntCodF = new boolean[] {false} ;
      P09DK5_A584IntDsc = new String[] {""} ;
      P09DK5_n584IntDsc = new boolean[] {false} ;
      P09DK5_A583IntCod = new byte[1] ;
      P09DK5_A832TipColDsc = new String[] {""} ;
      P09DK5_n832TipColDsc = new boolean[] {false} ;
      P09DK5_A831TipColCod = new byte[1] ;
      P09DK5_A483ForColNum = new int[1] ;
      P09DK5_A482ForColNom = new String[] {""} ;
      P09DK5_A4384ForTipArt = new short[1] ;
      P09DK5_n4384ForTipArt = new boolean[] {false} ;
      P09DK5_A5742ForSerDsc = new String[] {""} ;
      P09DK5_n5742ForSerDsc = new boolean[] {false} ;
      P09DK5_A494ForSer = new String[] {""} ;
      P09DK5_A279CliNom = new String[] {""} ;
      P09DK5_A252CliCod = new int[1] ;
      P09DK5_A7781ForBlo = new String[] {""} ;
      P09DK5_n7781ForBlo = new boolean[] {false} ;
      P09DK5_A13929ForTipArtD = new String[] {""} ;
      P09DK5_n13929ForTipArtD = new boolean[] {false} ;
      P09DK6_A829TipArtCod = new short[1] ;
      P09DK6_A396EmprCod = new String[] {""} ;
      P09DK6_A10045CliAct = new String[] {""} ;
      P09DK6_A482ForColNom = new String[] {""} ;
      P09DK6_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK6_n495ForUltMod = new boolean[] {false} ;
      P09DK6_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK6_n485ForFec = new boolean[] {false} ;
      P09DK6_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK6_n4380ForCosForm = new boolean[] {false} ;
      P09DK6_A486ForNumCol = new int[1] ;
      P09DK6_A5363IntDscF = new String[] {""} ;
      P09DK6_n5363IntDscF = new boolean[] {false} ;
      P09DK6_A5362IntCodF = new byte[1] ;
      P09DK6_n5362IntCodF = new boolean[] {false} ;
      P09DK6_A584IntDsc = new String[] {""} ;
      P09DK6_n584IntDsc = new boolean[] {false} ;
      P09DK6_A583IntCod = new byte[1] ;
      P09DK6_A832TipColDsc = new String[] {""} ;
      P09DK6_n832TipColDsc = new boolean[] {false} ;
      P09DK6_A831TipColCod = new byte[1] ;
      P09DK6_A483ForColNum = new int[1] ;
      P09DK6_A4384ForTipArt = new short[1] ;
      P09DK6_n4384ForTipArt = new boolean[] {false} ;
      P09DK6_A5742ForSerDsc = new String[] {""} ;
      P09DK6_n5742ForSerDsc = new boolean[] {false} ;
      P09DK6_A494ForSer = new String[] {""} ;
      P09DK6_A279CliNom = new String[] {""} ;
      P09DK6_A252CliCod = new int[1] ;
      P09DK6_A7781ForBlo = new String[] {""} ;
      P09DK6_n7781ForBlo = new boolean[] {false} ;
      P09DK6_A13929ForTipArtD = new String[] {""} ;
      P09DK6_n13929ForTipArtD = new boolean[] {false} ;
      P09DK7_A829TipArtCod = new short[1] ;
      P09DK7_A831TipColCod = new byte[1] ;
      P09DK7_A396EmprCod = new String[] {""} ;
      P09DK7_A10045CliAct = new String[] {""} ;
      P09DK7_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK7_n495ForUltMod = new boolean[] {false} ;
      P09DK7_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK7_n485ForFec = new boolean[] {false} ;
      P09DK7_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK7_n4380ForCosForm = new boolean[] {false} ;
      P09DK7_A486ForNumCol = new int[1] ;
      P09DK7_A5363IntDscF = new String[] {""} ;
      P09DK7_n5363IntDscF = new boolean[] {false} ;
      P09DK7_A5362IntCodF = new byte[1] ;
      P09DK7_n5362IntCodF = new boolean[] {false} ;
      P09DK7_A584IntDsc = new String[] {""} ;
      P09DK7_n584IntDsc = new boolean[] {false} ;
      P09DK7_A583IntCod = new byte[1] ;
      P09DK7_A832TipColDsc = new String[] {""} ;
      P09DK7_n832TipColDsc = new boolean[] {false} ;
      P09DK7_A483ForColNum = new int[1] ;
      P09DK7_A482ForColNom = new String[] {""} ;
      P09DK7_A4384ForTipArt = new short[1] ;
      P09DK7_n4384ForTipArt = new boolean[] {false} ;
      P09DK7_A5742ForSerDsc = new String[] {""} ;
      P09DK7_n5742ForSerDsc = new boolean[] {false} ;
      P09DK7_A494ForSer = new String[] {""} ;
      P09DK7_A279CliNom = new String[] {""} ;
      P09DK7_A252CliCod = new int[1] ;
      P09DK7_A7781ForBlo = new String[] {""} ;
      P09DK7_n7781ForBlo = new boolean[] {false} ;
      P09DK7_A13929ForTipArtD = new String[] {""} ;
      P09DK7_n13929ForTipArtD = new boolean[] {false} ;
      P09DK8_A829TipArtCod = new short[1] ;
      P09DK8_A583IntCod = new byte[1] ;
      P09DK8_A396EmprCod = new String[] {""} ;
      P09DK8_A10045CliAct = new String[] {""} ;
      P09DK8_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK8_n495ForUltMod = new boolean[] {false} ;
      P09DK8_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK8_n485ForFec = new boolean[] {false} ;
      P09DK8_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK8_n4380ForCosForm = new boolean[] {false} ;
      P09DK8_A486ForNumCol = new int[1] ;
      P09DK8_A5363IntDscF = new String[] {""} ;
      P09DK8_n5363IntDscF = new boolean[] {false} ;
      P09DK8_A5362IntCodF = new byte[1] ;
      P09DK8_n5362IntCodF = new boolean[] {false} ;
      P09DK8_A584IntDsc = new String[] {""} ;
      P09DK8_n584IntDsc = new boolean[] {false} ;
      P09DK8_A832TipColDsc = new String[] {""} ;
      P09DK8_n832TipColDsc = new boolean[] {false} ;
      P09DK8_A831TipColCod = new byte[1] ;
      P09DK8_A483ForColNum = new int[1] ;
      P09DK8_A482ForColNom = new String[] {""} ;
      P09DK8_A4384ForTipArt = new short[1] ;
      P09DK8_n4384ForTipArt = new boolean[] {false} ;
      P09DK8_A5742ForSerDsc = new String[] {""} ;
      P09DK8_n5742ForSerDsc = new boolean[] {false} ;
      P09DK8_A494ForSer = new String[] {""} ;
      P09DK8_A279CliNom = new String[] {""} ;
      P09DK8_A252CliCod = new int[1] ;
      P09DK8_A7781ForBlo = new String[] {""} ;
      P09DK8_n7781ForBlo = new boolean[] {false} ;
      P09DK8_A13929ForTipArtD = new String[] {""} ;
      P09DK8_n13929ForTipArtD = new boolean[] {false} ;
      P09DK9_A829TipArtCod = new short[1] ;
      P09DK9_A5362IntCodF = new byte[1] ;
      P09DK9_n5362IntCodF = new boolean[] {false} ;
      P09DK9_A396EmprCod = new String[] {""} ;
      P09DK9_A10045CliAct = new String[] {""} ;
      P09DK9_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK9_n495ForUltMod = new boolean[] {false} ;
      P09DK9_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DK9_n485ForFec = new boolean[] {false} ;
      P09DK9_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DK9_n4380ForCosForm = new boolean[] {false} ;
      P09DK9_A486ForNumCol = new int[1] ;
      P09DK9_A5363IntDscF = new String[] {""} ;
      P09DK9_n5363IntDscF = new boolean[] {false} ;
      P09DK9_A584IntDsc = new String[] {""} ;
      P09DK9_n584IntDsc = new boolean[] {false} ;
      P09DK9_A583IntCod = new byte[1] ;
      P09DK9_A832TipColDsc = new String[] {""} ;
      P09DK9_n832TipColDsc = new boolean[] {false} ;
      P09DK9_A831TipColCod = new byte[1] ;
      P09DK9_A483ForColNum = new int[1] ;
      P09DK9_A482ForColNom = new String[] {""} ;
      P09DK9_A4384ForTipArt = new short[1] ;
      P09DK9_n4384ForTipArt = new boolean[] {false} ;
      P09DK9_A5742ForSerDsc = new String[] {""} ;
      P09DK9_n5742ForSerDsc = new boolean[] {false} ;
      P09DK9_A494ForSer = new String[] {""} ;
      P09DK9_A279CliNom = new String[] {""} ;
      P09DK9_A252CliCod = new int[1] ;
      P09DK9_A7781ForBlo = new String[] {""} ;
      P09DK9_n7781ForBlo = new boolean[] {false} ;
      P09DK9_A13929ForTipArtD = new String[] {""} ;
      P09DK9_n13929ForTipArtD = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeformulas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09DK2_A829TipArtCod, P09DK2_A396EmprCod, P09DK2_A10045CliAct, P09DK2_A279CliNom, P09DK2_A495ForUltMod, P09DK2_n495ForUltMod, P09DK2_A485ForFec, P09DK2_n485ForFec, P09DK2_A4380ForCosForm, P09DK2_n4380ForCosForm,
            P09DK2_A486ForNumCol, P09DK2_A5363IntDscF, P09DK2_n5363IntDscF, P09DK2_A5362IntCodF, P09DK2_n5362IntCodF, P09DK2_A584IntDsc, P09DK2_n584IntDsc, P09DK2_A583IntCod, P09DK2_A832TipColDsc, P09DK2_n832TipColDsc,
            P09DK2_A831TipColCod, P09DK2_A483ForColNum, P09DK2_A482ForColNom, P09DK2_A4384ForTipArt, P09DK2_n4384ForTipArt, P09DK2_A5742ForSerDsc, P09DK2_n5742ForSerDsc, P09DK2_A494ForSer, P09DK2_A252CliCod, P09DK2_A7781ForBlo,
            P09DK2_n7781ForBlo, P09DK2_A13929ForTipArtD, P09DK2_n13929ForTipArtD
            }
            , new Object[] {
            P09DK3_A829TipArtCod, P09DK3_A396EmprCod, P09DK3_A10045CliAct, P09DK3_A494ForSer, P09DK3_A495ForUltMod, P09DK3_n495ForUltMod, P09DK3_A485ForFec, P09DK3_n485ForFec, P09DK3_A4380ForCosForm, P09DK3_n4380ForCosForm,
            P09DK3_A486ForNumCol, P09DK3_A5363IntDscF, P09DK3_n5363IntDscF, P09DK3_A5362IntCodF, P09DK3_n5362IntCodF, P09DK3_A584IntDsc, P09DK3_n584IntDsc, P09DK3_A583IntCod, P09DK3_A832TipColDsc, P09DK3_n832TipColDsc,
            P09DK3_A831TipColCod, P09DK3_A483ForColNum, P09DK3_A482ForColNom, P09DK3_A4384ForTipArt, P09DK3_n4384ForTipArt, P09DK3_A5742ForSerDsc, P09DK3_n5742ForSerDsc, P09DK3_A279CliNom, P09DK3_A252CliCod, P09DK3_A7781ForBlo,
            P09DK3_n7781ForBlo, P09DK3_A13929ForTipArtD, P09DK3_n13929ForTipArtD
            }
            , new Object[] {
            P09DK4_A829TipArtCod, P09DK4_A396EmprCod, P09DK4_A10045CliAct, P09DK4_A5742ForSerDsc, P09DK4_n5742ForSerDsc, P09DK4_A495ForUltMod, P09DK4_n495ForUltMod, P09DK4_A485ForFec, P09DK4_n485ForFec, P09DK4_A4380ForCosForm,
            P09DK4_n4380ForCosForm, P09DK4_A486ForNumCol, P09DK4_A5363IntDscF, P09DK4_n5363IntDscF, P09DK4_A5362IntCodF, P09DK4_n5362IntCodF, P09DK4_A584IntDsc, P09DK4_n584IntDsc, P09DK4_A583IntCod, P09DK4_A832TipColDsc,
            P09DK4_n832TipColDsc, P09DK4_A831TipColCod, P09DK4_A483ForColNum, P09DK4_A482ForColNom, P09DK4_A4384ForTipArt, P09DK4_n4384ForTipArt, P09DK4_A494ForSer, P09DK4_A279CliNom, P09DK4_A252CliCod, P09DK4_A7781ForBlo,
            P09DK4_n7781ForBlo, P09DK4_A13929ForTipArtD, P09DK4_n13929ForTipArtD
            }
            , new Object[] {
            P09DK5_A829TipArtCod, P09DK5_A10045CliAct, P09DK5_A396EmprCod, P09DK5_A495ForUltMod, P09DK5_n495ForUltMod, P09DK5_A485ForFec, P09DK5_n485ForFec, P09DK5_A4380ForCosForm, P09DK5_n4380ForCosForm, P09DK5_A486ForNumCol,
            P09DK5_A5363IntDscF, P09DK5_n5363IntDscF, P09DK5_A5362IntCodF, P09DK5_n5362IntCodF, P09DK5_A584IntDsc, P09DK5_n584IntDsc, P09DK5_A583IntCod, P09DK5_A832TipColDsc, P09DK5_n832TipColDsc, P09DK5_A831TipColCod,
            P09DK5_A483ForColNum, P09DK5_A482ForColNom, P09DK5_A4384ForTipArt, P09DK5_n4384ForTipArt, P09DK5_A5742ForSerDsc, P09DK5_n5742ForSerDsc, P09DK5_A494ForSer, P09DK5_A279CliNom, P09DK5_A252CliCod, P09DK5_A7781ForBlo,
            P09DK5_n7781ForBlo, P09DK5_A13929ForTipArtD, P09DK5_n13929ForTipArtD
            }
            , new Object[] {
            P09DK6_A829TipArtCod, P09DK6_A396EmprCod, P09DK6_A10045CliAct, P09DK6_A482ForColNom, P09DK6_A495ForUltMod, P09DK6_n495ForUltMod, P09DK6_A485ForFec, P09DK6_n485ForFec, P09DK6_A4380ForCosForm, P09DK6_n4380ForCosForm,
            P09DK6_A486ForNumCol, P09DK6_A5363IntDscF, P09DK6_n5363IntDscF, P09DK6_A5362IntCodF, P09DK6_n5362IntCodF, P09DK6_A584IntDsc, P09DK6_n584IntDsc, P09DK6_A583IntCod, P09DK6_A832TipColDsc, P09DK6_n832TipColDsc,
            P09DK6_A831TipColCod, P09DK6_A483ForColNum, P09DK6_A4384ForTipArt, P09DK6_n4384ForTipArt, P09DK6_A5742ForSerDsc, P09DK6_n5742ForSerDsc, P09DK6_A494ForSer, P09DK6_A279CliNom, P09DK6_A252CliCod, P09DK6_A7781ForBlo,
            P09DK6_n7781ForBlo, P09DK6_A13929ForTipArtD, P09DK6_n13929ForTipArtD
            }
            , new Object[] {
            P09DK7_A829TipArtCod, P09DK7_A831TipColCod, P09DK7_A396EmprCod, P09DK7_A10045CliAct, P09DK7_A495ForUltMod, P09DK7_n495ForUltMod, P09DK7_A485ForFec, P09DK7_n485ForFec, P09DK7_A4380ForCosForm, P09DK7_n4380ForCosForm,
            P09DK7_A486ForNumCol, P09DK7_A5363IntDscF, P09DK7_n5363IntDscF, P09DK7_A5362IntCodF, P09DK7_n5362IntCodF, P09DK7_A584IntDsc, P09DK7_n584IntDsc, P09DK7_A583IntCod, P09DK7_A832TipColDsc, P09DK7_n832TipColDsc,
            P09DK7_A483ForColNum, P09DK7_A482ForColNom, P09DK7_A4384ForTipArt, P09DK7_n4384ForTipArt, P09DK7_A5742ForSerDsc, P09DK7_n5742ForSerDsc, P09DK7_A494ForSer, P09DK7_A279CliNom, P09DK7_A252CliCod, P09DK7_A7781ForBlo,
            P09DK7_n7781ForBlo, P09DK7_A13929ForTipArtD, P09DK7_n13929ForTipArtD
            }
            , new Object[] {
            P09DK8_A829TipArtCod, P09DK8_A583IntCod, P09DK8_A396EmprCod, P09DK8_A10045CliAct, P09DK8_A495ForUltMod, P09DK8_n495ForUltMod, P09DK8_A485ForFec, P09DK8_n485ForFec, P09DK8_A4380ForCosForm, P09DK8_n4380ForCosForm,
            P09DK8_A486ForNumCol, P09DK8_A5363IntDscF, P09DK8_n5363IntDscF, P09DK8_A5362IntCodF, P09DK8_n5362IntCodF, P09DK8_A584IntDsc, P09DK8_n584IntDsc, P09DK8_A832TipColDsc, P09DK8_n832TipColDsc, P09DK8_A831TipColCod,
            P09DK8_A483ForColNum, P09DK8_A482ForColNom, P09DK8_A4384ForTipArt, P09DK8_n4384ForTipArt, P09DK8_A5742ForSerDsc, P09DK8_n5742ForSerDsc, P09DK8_A494ForSer, P09DK8_A279CliNom, P09DK8_A252CliCod, P09DK8_A7781ForBlo,
            P09DK8_n7781ForBlo, P09DK8_A13929ForTipArtD, P09DK8_n13929ForTipArtD
            }
            , new Object[] {
            P09DK9_A829TipArtCod, P09DK9_A5362IntCodF, P09DK9_n5362IntCodF, P09DK9_A396EmprCod, P09DK9_A10045CliAct, P09DK9_A495ForUltMod, P09DK9_n495ForUltMod, P09DK9_A485ForFec, P09DK9_n485ForFec, P09DK9_A4380ForCosForm,
            P09DK9_n4380ForCosForm, P09DK9_A486ForNumCol, P09DK9_A5363IntDscF, P09DK9_n5363IntDscF, P09DK9_A584IntDsc, P09DK9_n584IntDsc, P09DK9_A583IntCod, P09DK9_A832TipColDsc, P09DK9_n832TipColDsc, P09DK9_A831TipColCod,
            P09DK9_A483ForColNum, P09DK9_A482ForColNom, P09DK9_A4384ForTipArt, P09DK9_n4384ForTipArt, P09DK9_A5742ForSerDsc, P09DK9_n5742ForSerDsc, P09DK9_A494ForSer, P09DK9_A279CliNom, P09DK9_A252CliCod, P09DK9_A7781ForBlo,
            P09DK9_n7781ForBlo, P09DK9_A13929ForTipArtD, P09DK9_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26TFTipColCod ;
   private byte AV27TFTipColCod_To ;
   private byte AV30TFIntCod ;
   private byte AV31TFIntCod_To ;
   private byte AV42TFIntCodF ;
   private byte AV43TFIntCodF_To ;
   private byte AV162Tipcolcod ;
   private byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ;
   private byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ;
   private byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ;
   private byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ;
   private byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ;
   private byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private short AV90TFForTipArt ;
   private short AV91TFForTipArt_To ;
   private short AV163Tipcolcod_to ;
   private short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ;
   private short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ;
   private short A4384ForTipArt ;
   private short Gx_err ;
   private int AV172GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV24TFForColNum ;
   private int AV25TFForColNum_To ;
   private int AV72TFForNumCol ;
   private int AV73TFForNumCol_To ;
   private int AV154Clicod ;
   private int AV155Clicod_to ;
   private int AV158Forcolnum ;
   private int AV159Forcolnum_to ;
   private int AV166ForNumColfrom ;
   private int AV167ForNumColto ;
   private int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ;
   private int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ;
   private int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ;
   private int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ;
   private int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ;
   private int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ;
   private int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV137InsertIndex ;
   private long AV146count ;
   private java.math.BigDecimal AV116TFForCosForm ;
   private java.math.BigDecimal AV117TFForCosForm_To ;
   private java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ;
   private java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ;
   private java.math.BigDecimal A4380ForCosForm ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFForSer ;
   private String AV19TFForSer_Sel ;
   private String AV20TFForSerDsc ;
   private String AV21TFForSerDsc_Sel ;
   private String AV164TFForTipArtDsc ;
   private String AV165TFForTipArtDsc_Sel ;
   private String AV22TFForColNom ;
   private String AV23TFForColNom_Sel ;
   private String AV28TFTipColDsc ;
   private String AV29TFTipColDsc_Sel ;
   private String AV32TFIntDsc ;
   private String AV33TFIntDsc_Sel ;
   private String AV44TFIntDscF ;
   private String AV45TFIntDscF_Sel ;
   private String AV153Emprcod ;
   private String AV156Forser ;
   private String AV157Forser_to ;
   private String AV160Forcolnom ;
   private String AV161Forcolnom_to ;
   private String A279CliNom ;
   private String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ;
   private String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ;
   private String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ;
   private String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ;
   private String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ;
   private String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ;
   private String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ;
   private String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ;
   private String lV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String scmdbuf ;
   private String lV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String lV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String lV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String lV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String lV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String lV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String lV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String A7781ForBlo ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private String A5363IntDscF ;
   private String A13929ForTipArtD ;
   private String A396EmprCod ;
   private String A10045CliAct ;
   private java.util.Date AV74TFForFec ;
   private java.util.Date AV80TFForUltMod ;
   private java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ;
   private java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private boolean returnInSub ;
   private boolean brk9DK2 ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n4380ForCosForm ;
   private boolean n5363IntDscF ;
   private boolean n5362IntCodF ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private boolean n4384ForTipArt ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n13929ForTipArtD ;
   private boolean brk9DK4 ;
   private boolean brk9DK6 ;
   private boolean brk9DK9 ;
   private boolean brk9DK11 ;
   private boolean brk9DK13 ;
   private boolean brk9DK15 ;
   private String AV140OptionsJson ;
   private String AV143OptionsDescJson ;
   private String AV145OptionIndexesJson ;
   private String AV168TFForBlo_SelsJson ;
   private String AV136DDOName ;
   private String AV134SearchTxt ;
   private String AV135SearchTxtTo ;
   private String AV152FilterFullText ;
   private String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String lV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String AV138Option ;
   private com.genexus.webpanels.WebSession AV147Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09DK2_A829TipArtCod ;
   private String[] P09DK2_A396EmprCod ;
   private String[] P09DK2_A10045CliAct ;
   private String[] P09DK2_A279CliNom ;
   private java.util.Date[] P09DK2_A495ForUltMod ;
   private boolean[] P09DK2_n495ForUltMod ;
   private java.util.Date[] P09DK2_A485ForFec ;
   private boolean[] P09DK2_n485ForFec ;
   private java.math.BigDecimal[] P09DK2_A4380ForCosForm ;
   private boolean[] P09DK2_n4380ForCosForm ;
   private int[] P09DK2_A486ForNumCol ;
   private String[] P09DK2_A5363IntDscF ;
   private boolean[] P09DK2_n5363IntDscF ;
   private byte[] P09DK2_A5362IntCodF ;
   private boolean[] P09DK2_n5362IntCodF ;
   private String[] P09DK2_A584IntDsc ;
   private boolean[] P09DK2_n584IntDsc ;
   private byte[] P09DK2_A583IntCod ;
   private String[] P09DK2_A832TipColDsc ;
   private boolean[] P09DK2_n832TipColDsc ;
   private byte[] P09DK2_A831TipColCod ;
   private int[] P09DK2_A483ForColNum ;
   private String[] P09DK2_A482ForColNom ;
   private short[] P09DK2_A4384ForTipArt ;
   private boolean[] P09DK2_n4384ForTipArt ;
   private String[] P09DK2_A5742ForSerDsc ;
   private boolean[] P09DK2_n5742ForSerDsc ;
   private String[] P09DK2_A494ForSer ;
   private int[] P09DK2_A252CliCod ;
   private String[] P09DK2_A7781ForBlo ;
   private boolean[] P09DK2_n7781ForBlo ;
   private String[] P09DK2_A13929ForTipArtD ;
   private boolean[] P09DK2_n13929ForTipArtD ;
   private short[] P09DK3_A829TipArtCod ;
   private String[] P09DK3_A396EmprCod ;
   private String[] P09DK3_A10045CliAct ;
   private String[] P09DK3_A494ForSer ;
   private java.util.Date[] P09DK3_A495ForUltMod ;
   private boolean[] P09DK3_n495ForUltMod ;
   private java.util.Date[] P09DK3_A485ForFec ;
   private boolean[] P09DK3_n485ForFec ;
   private java.math.BigDecimal[] P09DK3_A4380ForCosForm ;
   private boolean[] P09DK3_n4380ForCosForm ;
   private int[] P09DK3_A486ForNumCol ;
   private String[] P09DK3_A5363IntDscF ;
   private boolean[] P09DK3_n5363IntDscF ;
   private byte[] P09DK3_A5362IntCodF ;
   private boolean[] P09DK3_n5362IntCodF ;
   private String[] P09DK3_A584IntDsc ;
   private boolean[] P09DK3_n584IntDsc ;
   private byte[] P09DK3_A583IntCod ;
   private String[] P09DK3_A832TipColDsc ;
   private boolean[] P09DK3_n832TipColDsc ;
   private byte[] P09DK3_A831TipColCod ;
   private int[] P09DK3_A483ForColNum ;
   private String[] P09DK3_A482ForColNom ;
   private short[] P09DK3_A4384ForTipArt ;
   private boolean[] P09DK3_n4384ForTipArt ;
   private String[] P09DK3_A5742ForSerDsc ;
   private boolean[] P09DK3_n5742ForSerDsc ;
   private String[] P09DK3_A279CliNom ;
   private int[] P09DK3_A252CliCod ;
   private String[] P09DK3_A7781ForBlo ;
   private boolean[] P09DK3_n7781ForBlo ;
   private String[] P09DK3_A13929ForTipArtD ;
   private boolean[] P09DK3_n13929ForTipArtD ;
   private short[] P09DK4_A829TipArtCod ;
   private String[] P09DK4_A396EmprCod ;
   private String[] P09DK4_A10045CliAct ;
   private String[] P09DK4_A5742ForSerDsc ;
   private boolean[] P09DK4_n5742ForSerDsc ;
   private java.util.Date[] P09DK4_A495ForUltMod ;
   private boolean[] P09DK4_n495ForUltMod ;
   private java.util.Date[] P09DK4_A485ForFec ;
   private boolean[] P09DK4_n485ForFec ;
   private java.math.BigDecimal[] P09DK4_A4380ForCosForm ;
   private boolean[] P09DK4_n4380ForCosForm ;
   private int[] P09DK4_A486ForNumCol ;
   private String[] P09DK4_A5363IntDscF ;
   private boolean[] P09DK4_n5363IntDscF ;
   private byte[] P09DK4_A5362IntCodF ;
   private boolean[] P09DK4_n5362IntCodF ;
   private String[] P09DK4_A584IntDsc ;
   private boolean[] P09DK4_n584IntDsc ;
   private byte[] P09DK4_A583IntCod ;
   private String[] P09DK4_A832TipColDsc ;
   private boolean[] P09DK4_n832TipColDsc ;
   private byte[] P09DK4_A831TipColCod ;
   private int[] P09DK4_A483ForColNum ;
   private String[] P09DK4_A482ForColNom ;
   private short[] P09DK4_A4384ForTipArt ;
   private boolean[] P09DK4_n4384ForTipArt ;
   private String[] P09DK4_A494ForSer ;
   private String[] P09DK4_A279CliNom ;
   private int[] P09DK4_A252CliCod ;
   private String[] P09DK4_A7781ForBlo ;
   private boolean[] P09DK4_n7781ForBlo ;
   private String[] P09DK4_A13929ForTipArtD ;
   private boolean[] P09DK4_n13929ForTipArtD ;
   private short[] P09DK5_A829TipArtCod ;
   private String[] P09DK5_A10045CliAct ;
   private String[] P09DK5_A396EmprCod ;
   private java.util.Date[] P09DK5_A495ForUltMod ;
   private boolean[] P09DK5_n495ForUltMod ;
   private java.util.Date[] P09DK5_A485ForFec ;
   private boolean[] P09DK5_n485ForFec ;
   private java.math.BigDecimal[] P09DK5_A4380ForCosForm ;
   private boolean[] P09DK5_n4380ForCosForm ;
   private int[] P09DK5_A486ForNumCol ;
   private String[] P09DK5_A5363IntDscF ;
   private boolean[] P09DK5_n5363IntDscF ;
   private byte[] P09DK5_A5362IntCodF ;
   private boolean[] P09DK5_n5362IntCodF ;
   private String[] P09DK5_A584IntDsc ;
   private boolean[] P09DK5_n584IntDsc ;
   private byte[] P09DK5_A583IntCod ;
   private String[] P09DK5_A832TipColDsc ;
   private boolean[] P09DK5_n832TipColDsc ;
   private byte[] P09DK5_A831TipColCod ;
   private int[] P09DK5_A483ForColNum ;
   private String[] P09DK5_A482ForColNom ;
   private short[] P09DK5_A4384ForTipArt ;
   private boolean[] P09DK5_n4384ForTipArt ;
   private String[] P09DK5_A5742ForSerDsc ;
   private boolean[] P09DK5_n5742ForSerDsc ;
   private String[] P09DK5_A494ForSer ;
   private String[] P09DK5_A279CliNom ;
   private int[] P09DK5_A252CliCod ;
   private String[] P09DK5_A7781ForBlo ;
   private boolean[] P09DK5_n7781ForBlo ;
   private String[] P09DK5_A13929ForTipArtD ;
   private boolean[] P09DK5_n13929ForTipArtD ;
   private short[] P09DK6_A829TipArtCod ;
   private String[] P09DK6_A396EmprCod ;
   private String[] P09DK6_A10045CliAct ;
   private String[] P09DK6_A482ForColNom ;
   private java.util.Date[] P09DK6_A495ForUltMod ;
   private boolean[] P09DK6_n495ForUltMod ;
   private java.util.Date[] P09DK6_A485ForFec ;
   private boolean[] P09DK6_n485ForFec ;
   private java.math.BigDecimal[] P09DK6_A4380ForCosForm ;
   private boolean[] P09DK6_n4380ForCosForm ;
   private int[] P09DK6_A486ForNumCol ;
   private String[] P09DK6_A5363IntDscF ;
   private boolean[] P09DK6_n5363IntDscF ;
   private byte[] P09DK6_A5362IntCodF ;
   private boolean[] P09DK6_n5362IntCodF ;
   private String[] P09DK6_A584IntDsc ;
   private boolean[] P09DK6_n584IntDsc ;
   private byte[] P09DK6_A583IntCod ;
   private String[] P09DK6_A832TipColDsc ;
   private boolean[] P09DK6_n832TipColDsc ;
   private byte[] P09DK6_A831TipColCod ;
   private int[] P09DK6_A483ForColNum ;
   private short[] P09DK6_A4384ForTipArt ;
   private boolean[] P09DK6_n4384ForTipArt ;
   private String[] P09DK6_A5742ForSerDsc ;
   private boolean[] P09DK6_n5742ForSerDsc ;
   private String[] P09DK6_A494ForSer ;
   private String[] P09DK6_A279CliNom ;
   private int[] P09DK6_A252CliCod ;
   private String[] P09DK6_A7781ForBlo ;
   private boolean[] P09DK6_n7781ForBlo ;
   private String[] P09DK6_A13929ForTipArtD ;
   private boolean[] P09DK6_n13929ForTipArtD ;
   private short[] P09DK7_A829TipArtCod ;
   private byte[] P09DK7_A831TipColCod ;
   private String[] P09DK7_A396EmprCod ;
   private String[] P09DK7_A10045CliAct ;
   private java.util.Date[] P09DK7_A495ForUltMod ;
   private boolean[] P09DK7_n495ForUltMod ;
   private java.util.Date[] P09DK7_A485ForFec ;
   private boolean[] P09DK7_n485ForFec ;
   private java.math.BigDecimal[] P09DK7_A4380ForCosForm ;
   private boolean[] P09DK7_n4380ForCosForm ;
   private int[] P09DK7_A486ForNumCol ;
   private String[] P09DK7_A5363IntDscF ;
   private boolean[] P09DK7_n5363IntDscF ;
   private byte[] P09DK7_A5362IntCodF ;
   private boolean[] P09DK7_n5362IntCodF ;
   private String[] P09DK7_A584IntDsc ;
   private boolean[] P09DK7_n584IntDsc ;
   private byte[] P09DK7_A583IntCod ;
   private String[] P09DK7_A832TipColDsc ;
   private boolean[] P09DK7_n832TipColDsc ;
   private int[] P09DK7_A483ForColNum ;
   private String[] P09DK7_A482ForColNom ;
   private short[] P09DK7_A4384ForTipArt ;
   private boolean[] P09DK7_n4384ForTipArt ;
   private String[] P09DK7_A5742ForSerDsc ;
   private boolean[] P09DK7_n5742ForSerDsc ;
   private String[] P09DK7_A494ForSer ;
   private String[] P09DK7_A279CliNom ;
   private int[] P09DK7_A252CliCod ;
   private String[] P09DK7_A7781ForBlo ;
   private boolean[] P09DK7_n7781ForBlo ;
   private String[] P09DK7_A13929ForTipArtD ;
   private boolean[] P09DK7_n13929ForTipArtD ;
   private short[] P09DK8_A829TipArtCod ;
   private byte[] P09DK8_A583IntCod ;
   private String[] P09DK8_A396EmprCod ;
   private String[] P09DK8_A10045CliAct ;
   private java.util.Date[] P09DK8_A495ForUltMod ;
   private boolean[] P09DK8_n495ForUltMod ;
   private java.util.Date[] P09DK8_A485ForFec ;
   private boolean[] P09DK8_n485ForFec ;
   private java.math.BigDecimal[] P09DK8_A4380ForCosForm ;
   private boolean[] P09DK8_n4380ForCosForm ;
   private int[] P09DK8_A486ForNumCol ;
   private String[] P09DK8_A5363IntDscF ;
   private boolean[] P09DK8_n5363IntDscF ;
   private byte[] P09DK8_A5362IntCodF ;
   private boolean[] P09DK8_n5362IntCodF ;
   private String[] P09DK8_A584IntDsc ;
   private boolean[] P09DK8_n584IntDsc ;
   private String[] P09DK8_A832TipColDsc ;
   private boolean[] P09DK8_n832TipColDsc ;
   private byte[] P09DK8_A831TipColCod ;
   private int[] P09DK8_A483ForColNum ;
   private String[] P09DK8_A482ForColNom ;
   private short[] P09DK8_A4384ForTipArt ;
   private boolean[] P09DK8_n4384ForTipArt ;
   private String[] P09DK8_A5742ForSerDsc ;
   private boolean[] P09DK8_n5742ForSerDsc ;
   private String[] P09DK8_A494ForSer ;
   private String[] P09DK8_A279CliNom ;
   private int[] P09DK8_A252CliCod ;
   private String[] P09DK8_A7781ForBlo ;
   private boolean[] P09DK8_n7781ForBlo ;
   private String[] P09DK8_A13929ForTipArtD ;
   private boolean[] P09DK8_n13929ForTipArtD ;
   private short[] P09DK9_A829TipArtCod ;
   private byte[] P09DK9_A5362IntCodF ;
   private boolean[] P09DK9_n5362IntCodF ;
   private String[] P09DK9_A396EmprCod ;
   private String[] P09DK9_A10045CliAct ;
   private java.util.Date[] P09DK9_A495ForUltMod ;
   private boolean[] P09DK9_n495ForUltMod ;
   private java.util.Date[] P09DK9_A485ForFec ;
   private boolean[] P09DK9_n485ForFec ;
   private java.math.BigDecimal[] P09DK9_A4380ForCosForm ;
   private boolean[] P09DK9_n4380ForCosForm ;
   private int[] P09DK9_A486ForNumCol ;
   private String[] P09DK9_A5363IntDscF ;
   private boolean[] P09DK9_n5363IntDscF ;
   private String[] P09DK9_A584IntDsc ;
   private boolean[] P09DK9_n584IntDsc ;
   private byte[] P09DK9_A583IntCod ;
   private String[] P09DK9_A832TipColDsc ;
   private boolean[] P09DK9_n832TipColDsc ;
   private byte[] P09DK9_A831TipColCod ;
   private int[] P09DK9_A483ForColNum ;
   private String[] P09DK9_A482ForColNom ;
   private short[] P09DK9_A4384ForTipArt ;
   private boolean[] P09DK9_n4384ForTipArt ;
   private String[] P09DK9_A5742ForSerDsc ;
   private boolean[] P09DK9_n5742ForSerDsc ;
   private String[] P09DK9_A494ForSer ;
   private String[] P09DK9_A279CliNom ;
   private int[] P09DK9_A252CliCod ;
   private String[] P09DK9_A7781ForBlo ;
   private boolean[] P09DK9_n7781ForBlo ;
   private String[] P09DK9_A13929ForTipArtD ;
   private boolean[] P09DK9_n13929ForTipArtD ;
   private GXSimpleCollection<String> AV169TFForBlo_Sels ;
   private GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ;
   private GXSimpleCollection<String> AV139Options ;
   private GXSimpleCollection<String> AV142OptionsDesc ;
   private GXSimpleCollection<String> AV144OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV149GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV150GridStateFilterValue ;
}

final  class listadodeformulas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A396EmprCod ,
                                          String AV153Emprcod ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[50];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.EmprCod, T6.CliAct, T6.CliNom, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc," ;
      scmdbuf += " T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T6.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09DK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A396EmprCod ,
                                          String AV153Emprcod ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[50];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.EmprCod, T6.CliAct, T1.ForSer, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc," ;
      scmdbuf += " T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09DK4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A396EmprCod ,
                                          String AV153Emprcod ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[50];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.EmprCod, T6.CliAct, T1.ForSerDsc, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc," ;
      scmdbuf += " T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09DK5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV153Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[50];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T6.CliAct, T1.EmprCod, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc, T1.TipColCod," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09DK6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A396EmprCod ,
                                          String AV153Emprcod ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[50];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.EmprCod, T6.CliAct, T1.ForColNom, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc," ;
      scmdbuf += " T1.TipColCod, T1.ForColNum, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09DK7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV153Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[50];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.TipColCod, T1.EmprCod, T6.CliAct, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T3.IntDscF, T1.IntCodF, T4.IntDsc, T1.IntCod, T2.TipColDsc," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) LEFT JOIN TXPINTFAC T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCodF = T1.IntCodF)" ;
      scmdbuf += " INNER JOIN TXPINTENS T4 ON T4.EmprCod = T1.EmprCod AND T4.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.IntDsc = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDscF = ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09DK8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV153Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[50];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.IntCod, T1.EmprCod, T6.CliAct, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T3.IntDscF, T1.IntCodF, T2.IntDsc, T4.TipColDsc, T1.TipColCod," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) LEFT JOIN TXPINTFAC T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCodF = T1.IntCodF)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDscF = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.IntCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09DK9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV154Clicod ,
                                          int AV155Clicod_to ,
                                          String AV156Forser ,
                                          String AV157Forser_to ,
                                          String AV160Forcolnom ,
                                          String AV161Forcolnom_to ,
                                          int AV158Forcolnum ,
                                          int AV159Forcolnum_to ,
                                          byte AV162Tipcolcod ,
                                          short AV163Tipcolcod_to ,
                                          int AV166ForNumColfrom ,
                                          int AV167ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          String AV174Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV153Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[50];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.IntCodF, T1.EmprCod, T6.CliAct, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T3.IntDsc, T1.IntCod, T4.TipColDsc, T1.TipColCod," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV175Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV176Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV177Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV192Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV208Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV209Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV154Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (0==AV158Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (0==AV159Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! (0==AV162Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( ! (0==AV163Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (0==AV166ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! (0==AV167ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.IntCodF" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_P09DK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 1 :
                  return conditional_P09DK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 2 :
                  return conditional_P09DK4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 3 :
                  return conditional_P09DK5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 4 :
                  return conditional_P09DK6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 5 :
                  return conditional_P09DK7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 6 :
                  return conditional_P09DK8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
            case 7 :
                  return conditional_P09DK9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DK9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((String[]) buf[22])[0] = rslt.getString(16, 13);
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 16);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((String[]) buf[22])[0] = rslt.getString(16, 13);
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((String[]) buf[23])[0] = rslt.getString(16, 13);
               ((short[]) buf[24])[0] = rslt.getShort(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
      }
   }

}

