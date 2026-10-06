package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webhdsto6getfilterdata extends GXProcedure
{
   public webhdsto6getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webhdsto6getfilterdata.class ), "" );
   }

   public webhdsto6getfilterdata( int remoteHandle ,
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
      webhdsto6getfilterdata.this.aP5 = new String[] {""};
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
      webhdsto6getfilterdata.this.AV22DDOName = aP0;
      webhdsto6getfilterdata.this.AV20SearchTxt = aP1;
      webhdsto6getfilterdata.this.AV21SearchTxtTo = aP2;
      webhdsto6getfilterdata.this.aP3 = aP3;
      webhdsto6getfilterdata.this.aP4 = aP4;
      webhdsto6getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STPHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STPCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STPBARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STPBARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STPCOLOR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCOLOROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STP_MOT") == 0 )
      {
         /* Execute user subroutine: 'LOADSTP_MOTOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_STP_MOTA") == 0 )
      {
         /* Execute user subroutine: 'LOADSTP_MOTAOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WebHDSTO6GridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebHDSTO6GridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WebHDSTO6GridState"), null, null);
      }
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV10TFStpHdr = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV11TFStpHdr_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV43TFStpClicod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFStpClicod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV45TFStpCliNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV46TFStpCliNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV47TFStpBarser = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV48TFStpBarser_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV49TFStpBarserDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV50TFStpBarserDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV51TFStpColor = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV52TFStpColor_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV12TFStp_Dia = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV14TFStp_Mot = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV15TFStp_Mot_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIAA") == 0 )
         {
            AV16TFStp_DiaA = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA") == 0 )
         {
            AV18TFStp_MotA = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA_SEL") == 0 )
         {
            AV19TFStp_MotA_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSTPHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFStpHdr = AV20SearchTxt ;
      AV11TFStpHdr_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP3 */
      pr_default.execute(0, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08DP3_A396EmprCod[0] ;
         A10757Stp_MotA = P08DP3_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP3_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DP3_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DP3_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP3_A13723StpHdr[0] ;
         A13728StpColor = P08DP3_A13728StpColor[0] ;
         n13728StpColor = P08DP3_n13728StpColor[0] ;
         A13725StpBarserD = P08DP3_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP3_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP3_A13724StpBarser[0] ;
         n13724StpBarser = P08DP3_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP3_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP3_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP3_A13726StpClicod[0] ;
         n13726StpClicod = P08DP3_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP3_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP3_A10747Stp_r[0] ;
         A10748Stp_p = P08DP3_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP3_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP3_A13723StpHdr[0] ;
         A13728StpColor = P08DP3_A13728StpColor[0] ;
         n13728StpColor = P08DP3_n13728StpColor[0] ;
         A13725StpBarserD = P08DP3_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP3_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP3_A13724StpBarser[0] ;
         n13724StpBarser = P08DP3_n13724StpBarser[0] ;
         A13726StpClicod = P08DP3_A13726StpClicod[0] ;
         n13726StpClicod = P08DP3_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP3_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP3_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13723StpHdr)==0) )
         {
            AV24Option = A13723StpHdr ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSTPCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV45TFStpCliNom = AV20SearchTxt ;
      AV46TFStpCliNom_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP5 */
      pr_default.execute(1, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P08DP5_A396EmprCod[0] ;
         A10757Stp_MotA = P08DP5_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP5_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DP5_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DP5_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP5_A13723StpHdr[0] ;
         A13728StpColor = P08DP5_A13728StpColor[0] ;
         n13728StpColor = P08DP5_n13728StpColor[0] ;
         A13725StpBarserD = P08DP5_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP5_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP5_A13724StpBarser[0] ;
         n13724StpBarser = P08DP5_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP5_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP5_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP5_A13726StpClicod[0] ;
         n13726StpClicod = P08DP5_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP5_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP5_A10747Stp_r[0] ;
         A10748Stp_p = P08DP5_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP5_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP5_A13723StpHdr[0] ;
         A13728StpColor = P08DP5_A13728StpColor[0] ;
         n13728StpColor = P08DP5_n13728StpColor[0] ;
         A13725StpBarserD = P08DP5_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP5_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP5_A13724StpBarser[0] ;
         n13724StpBarser = P08DP5_n13724StpBarser[0] ;
         A13726StpClicod = P08DP5_A13726StpClicod[0] ;
         n13726StpClicod = P08DP5_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP5_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP5_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13727StpCliNom)==0) )
         {
            AV24Option = A13727StpCliNom ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADSTPBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV47TFStpBarser = AV20SearchTxt ;
      AV48TFStpBarser_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP7 */
      pr_default.execute(2, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P08DP7_A396EmprCod[0] ;
         A10757Stp_MotA = P08DP7_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP7_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DP7_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DP7_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP7_A13723StpHdr[0] ;
         A13728StpColor = P08DP7_A13728StpColor[0] ;
         n13728StpColor = P08DP7_n13728StpColor[0] ;
         A13725StpBarserD = P08DP7_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP7_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP7_A13724StpBarser[0] ;
         n13724StpBarser = P08DP7_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP7_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP7_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP7_A13726StpClicod[0] ;
         n13726StpClicod = P08DP7_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP7_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP7_A10747Stp_r[0] ;
         A10748Stp_p = P08DP7_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP7_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP7_A13723StpHdr[0] ;
         A13728StpColor = P08DP7_A13728StpColor[0] ;
         n13728StpColor = P08DP7_n13728StpColor[0] ;
         A13725StpBarserD = P08DP7_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP7_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP7_A13724StpBarser[0] ;
         n13724StpBarser = P08DP7_n13724StpBarser[0] ;
         A13726StpClicod = P08DP7_A13726StpClicod[0] ;
         n13726StpClicod = P08DP7_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP7_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP7_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13724StpBarser)==0) )
         {
            AV24Option = A13724StpBarser ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADSTPBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV49TFStpBarserDsc = AV20SearchTxt ;
      AV50TFStpBarserDsc_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP9 */
      pr_default.execute(3, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P08DP9_A396EmprCod[0] ;
         A10757Stp_MotA = P08DP9_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP9_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DP9_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DP9_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP9_A13723StpHdr[0] ;
         A13728StpColor = P08DP9_A13728StpColor[0] ;
         n13728StpColor = P08DP9_n13728StpColor[0] ;
         A13725StpBarserD = P08DP9_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP9_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP9_A13724StpBarser[0] ;
         n13724StpBarser = P08DP9_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP9_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP9_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP9_A13726StpClicod[0] ;
         n13726StpClicod = P08DP9_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP9_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP9_A10747Stp_r[0] ;
         A10748Stp_p = P08DP9_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP9_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP9_A13723StpHdr[0] ;
         A13728StpColor = P08DP9_A13728StpColor[0] ;
         n13728StpColor = P08DP9_n13728StpColor[0] ;
         A13725StpBarserD = P08DP9_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP9_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP9_A13724StpBarser[0] ;
         n13724StpBarser = P08DP9_n13724StpBarser[0] ;
         A13726StpClicod = P08DP9_A13726StpClicod[0] ;
         n13726StpClicod = P08DP9_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP9_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP9_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13725StpBarserD)==0) )
         {
            AV24Option = A13725StpBarserD ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADSTPCOLOROPTIONS' Routine */
      returnInSub = false ;
      AV51TFStpColor = AV20SearchTxt ;
      AV52TFStpColor_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP11 */
      pr_default.execute(4, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P08DP11_A396EmprCod[0] ;
         A10757Stp_MotA = P08DP11_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP11_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DP11_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DP11_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP11_A13723StpHdr[0] ;
         A13728StpColor = P08DP11_A13728StpColor[0] ;
         n13728StpColor = P08DP11_n13728StpColor[0] ;
         A13725StpBarserD = P08DP11_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP11_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP11_A13724StpBarser[0] ;
         n13724StpBarser = P08DP11_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP11_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP11_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP11_A13726StpClicod[0] ;
         n13726StpClicod = P08DP11_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP11_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP11_A10747Stp_r[0] ;
         A10748Stp_p = P08DP11_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP11_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP11_A13723StpHdr[0] ;
         A13728StpColor = P08DP11_A13728StpColor[0] ;
         n13728StpColor = P08DP11_n13728StpColor[0] ;
         A13725StpBarserD = P08DP11_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP11_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP11_A13724StpBarser[0] ;
         n13724StpBarser = P08DP11_n13724StpBarser[0] ;
         A13726StpClicod = P08DP11_A13726StpClicod[0] ;
         n13726StpClicod = P08DP11_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP11_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP11_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13728StpColor)==0) )
         {
            AV24Option = A13728StpColor ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADSTP_MOTOPTIONS' Routine */
      returnInSub = false ;
      AV14TFStp_Mot = AV20SearchTxt ;
      AV15TFStp_Mot_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP13 */
      pr_default.execute(5, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8DP7 = false ;
         A396EmprCod = P08DP13_A396EmprCod[0] ;
         A10752Stp_Mot = P08DP13_A10752Stp_Mot[0] ;
         A10757Stp_MotA = P08DP13_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP13_A10756Stp_DiaA[0] ;
         A10751Stp_Dia = P08DP13_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP13_A13723StpHdr[0] ;
         A13728StpColor = P08DP13_A13728StpColor[0] ;
         n13728StpColor = P08DP13_n13728StpColor[0] ;
         A13725StpBarserD = P08DP13_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP13_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP13_A13724StpBarser[0] ;
         n13724StpBarser = P08DP13_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP13_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP13_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP13_A13726StpClicod[0] ;
         n13726StpClicod = P08DP13_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP13_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP13_A10747Stp_r[0] ;
         A10748Stp_p = P08DP13_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP13_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP13_A13723StpHdr[0] ;
         A13728StpColor = P08DP13_A13728StpColor[0] ;
         n13728StpColor = P08DP13_n13728StpColor[0] ;
         A13725StpBarserD = P08DP13_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP13_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP13_A13724StpBarser[0] ;
         n13724StpBarser = P08DP13_n13724StpBarser[0] ;
         A13726StpClicod = P08DP13_A13726StpClicod[0] ;
         n13726StpClicod = P08DP13_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP13_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP13_n13727StpCliNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08DP13_A10752Stp_Mot[0], A10752Stp_Mot) == 0 ) )
         {
            brk8DP7 = false ;
            A396EmprCod = P08DP13_A396EmprCod[0] ;
            A10746Stp_hdr = P08DP13_A10746Stp_hdr[0] ;
            A10747Stp_r = P08DP13_A10747Stp_r[0] ;
            A10748Stp_p = P08DP13_A10748Stp_p[0] ;
            A10750Stp_Lin = P08DP13_A10750Stp_Lin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8DP7 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A10752Stp_Mot)==0) )
         {
            AV24Option = A10752Stp_Mot ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8DP7 )
         {
            brk8DP7 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADSTP_MOTAOPTIONS' Routine */
      returnInSub = false ;
      AV18TFStp_MotA = AV20SearchTxt ;
      AV19TFStp_MotA_Sel = "" ;
      AV79Webhdsto6ds_1_filterfulltext = AV42FilterFullText ;
      AV80Webhdsto6ds_2_tfstphdr = AV10TFStpHdr ;
      AV81Webhdsto6ds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV82Webhdsto6ds_4_tfstpclicod = AV43TFStpClicod ;
      AV83Webhdsto6ds_5_tfstpclicod_to = AV44TFStpClicod_To ;
      AV84Webhdsto6ds_6_tfstpclinom = AV45TFStpCliNom ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = AV46TFStpCliNom_Sel ;
      AV86Webhdsto6ds_8_tfstpbarser = AV47TFStpBarser ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = AV48TFStpBarser_Sel ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = AV49TFStpBarserDsc ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = AV50TFStpBarserDsc_Sel ;
      AV90Webhdsto6ds_12_tfstpcolor = AV51TFStpColor ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = AV52TFStpColor_Sel ;
      AV92Webhdsto6ds_14_tfstp_dia = AV12TFStp_Dia ;
      AV93Webhdsto6ds_15_tfstp_mot = AV14TFStp_Mot ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV95Webhdsto6ds_17_tfstp_diaa = AV16TFStp_DiaA ;
      AV96Webhdsto6ds_18_tfstp_mota = AV18TFStp_MotA ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = AV19TFStp_MotA_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           AV80Webhdsto6ds_2_tfstphdr ,
                                           AV92Webhdsto6ds_14_tfstp_dia ,
                                           AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           AV93Webhdsto6ds_15_tfstp_mot ,
                                           AV95Webhdsto6ds_17_tfstp_diaa ,
                                           AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           AV96Webhdsto6ds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV79Webhdsto6ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod) ,
                                           Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to) ,
                                           AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           AV84Webhdsto6ds_6_tfstpclinom ,
                                           AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           AV86Webhdsto6ds_8_tfstpbarser ,
                                           AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           AV90Webhdsto6ds_12_tfstpcolor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV79Webhdsto6ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Webhdsto6ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto6ds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV84Webhdsto6ds_6_tfstpclinom), 30, "%") ;
      lV86Webhdsto6ds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV86Webhdsto6ds_8_tfstpbarser), 16, "%") ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV88Webhdsto6ds_10_tfstpbarserdsc), 26, "%") ;
      lV90Webhdsto6ds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV90Webhdsto6ds_12_tfstpcolor), 13, "%") ;
      lV80Webhdsto6ds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV80Webhdsto6ds_2_tfstphdr), 11, "%") ;
      lV93Webhdsto6ds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV93Webhdsto6ds_15_tfstp_mot), "%", "") ;
      lV96Webhdsto6ds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV96Webhdsto6ds_18_tfstp_mota), "%", "") ;
      /* Using cursor P08DP15 */
      pr_default.execute(6, new Object[] {AV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, lV79Webhdsto6ds_1_filterfulltext, Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV82Webhdsto6ds_4_tfstpclicod), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), Integer.valueOf(AV83Webhdsto6ds_5_tfstpclicod_to), AV85Webhdsto6ds_7_tfstpclinom_sel, AV84Webhdsto6ds_6_tfstpclinom, lV84Webhdsto6ds_6_tfstpclinom, AV85Webhdsto6ds_7_tfstpclinom_sel, AV85Webhdsto6ds_7_tfstpclinom_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV86Webhdsto6ds_8_tfstpbarser, lV86Webhdsto6ds_8_tfstpbarser, AV87Webhdsto6ds_9_tfstpbarser_sel, AV87Webhdsto6ds_9_tfstpbarser_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV88Webhdsto6ds_10_tfstpbarserdsc, lV88Webhdsto6ds_10_tfstpbarserdsc, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV89Webhdsto6ds_11_tfstpbarserdsc_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, AV90Webhdsto6ds_12_tfstpcolor, lV90Webhdsto6ds_12_tfstpcolor, AV91Webhdsto6ds_13_tfstpcolor_sel, AV91Webhdsto6ds_13_tfstpcolor_sel, lV80Webhdsto6ds_2_tfstphdr, AV81Webhdsto6ds_3_tfstphdr_sel, AV92Webhdsto6ds_14_tfstp_dia, lV93Webhdsto6ds_15_tfstp_mot, AV94Webhdsto6ds_16_tfstp_mot_sel, AV95Webhdsto6ds_17_tfstp_diaa, lV96Webhdsto6ds_18_tfstp_mota, AV97Webhdsto6ds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8DP9 = false ;
         A396EmprCod = P08DP15_A396EmprCod[0] ;
         A10757Stp_MotA = P08DP15_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P08DP15_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P08DP15_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DP15_A10751Stp_Dia[0] ;
         A13723StpHdr = P08DP15_A13723StpHdr[0] ;
         A13728StpColor = P08DP15_A13728StpColor[0] ;
         n13728StpColor = P08DP15_n13728StpColor[0] ;
         A13725StpBarserD = P08DP15_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP15_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP15_A13724StpBarser[0] ;
         n13724StpBarser = P08DP15_n13724StpBarser[0] ;
         A13727StpCliNom = P08DP15_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP15_n13727StpCliNom[0] ;
         A13726StpClicod = P08DP15_A13726StpClicod[0] ;
         n13726StpClicod = P08DP15_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DP15_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DP15_A10747Stp_r[0] ;
         A10748Stp_p = P08DP15_A10748Stp_p[0] ;
         A10750Stp_Lin = P08DP15_A10750Stp_Lin[0] ;
         A13723StpHdr = P08DP15_A13723StpHdr[0] ;
         A13728StpColor = P08DP15_A13728StpColor[0] ;
         n13728StpColor = P08DP15_n13728StpColor[0] ;
         A13725StpBarserD = P08DP15_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DP15_n13725StpBarserD[0] ;
         A13724StpBarser = P08DP15_A13724StpBarser[0] ;
         n13724StpBarser = P08DP15_n13724StpBarser[0] ;
         A13726StpClicod = P08DP15_A13726StpClicod[0] ;
         n13726StpClicod = P08DP15_n13726StpClicod[0] ;
         A13727StpCliNom = P08DP15_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DP15_n13727StpCliNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08DP15_A10757Stp_MotA[0], A10757Stp_MotA) == 0 ) )
         {
            brk8DP9 = false ;
            A396EmprCod = P08DP15_A396EmprCod[0] ;
            A10746Stp_hdr = P08DP15_A10746Stp_hdr[0] ;
            A10747Stp_r = P08DP15_A10747Stp_r[0] ;
            A10748Stp_p = P08DP15_A10748Stp_p[0] ;
            A10750Stp_Lin = P08DP15_A10750Stp_Lin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8DP9 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A10757Stp_MotA)==0) )
         {
            AV24Option = A10757Stp_MotA ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8DP9 )
         {
            brk8DP9 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webhdsto6getfilterdata.this.AV26OptionsJson;
      this.aP4[0] = webhdsto6getfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = webhdsto6getfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV10TFStpHdr = "" ;
      AV11TFStpHdr_Sel = "" ;
      AV45TFStpCliNom = "" ;
      AV46TFStpCliNom_Sel = "" ;
      AV47TFStpBarser = "" ;
      AV48TFStpBarser_Sel = "" ;
      AV49TFStpBarserDsc = "" ;
      AV50TFStpBarserDsc_Sel = "" ;
      AV51TFStpColor = "" ;
      AV52TFStpColor_Sel = "" ;
      AV12TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV14TFStp_Mot = "" ;
      AV15TFStp_Mot_Sel = "" ;
      AV16TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      AV18TFStp_MotA = "" ;
      AV19TFStp_MotA_Sel = "" ;
      A13723StpHdr = "" ;
      AV79Webhdsto6ds_1_filterfulltext = "" ;
      AV80Webhdsto6ds_2_tfstphdr = "" ;
      AV81Webhdsto6ds_3_tfstphdr_sel = "" ;
      AV84Webhdsto6ds_6_tfstpclinom = "" ;
      AV85Webhdsto6ds_7_tfstpclinom_sel = "" ;
      AV86Webhdsto6ds_8_tfstpbarser = "" ;
      AV87Webhdsto6ds_9_tfstpbarser_sel = "" ;
      AV88Webhdsto6ds_10_tfstpbarserdsc = "" ;
      AV89Webhdsto6ds_11_tfstpbarserdsc_sel = "" ;
      AV90Webhdsto6ds_12_tfstpcolor = "" ;
      AV91Webhdsto6ds_13_tfstpcolor_sel = "" ;
      AV92Webhdsto6ds_14_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV93Webhdsto6ds_15_tfstp_mot = "" ;
      AV94Webhdsto6ds_16_tfstp_mot_sel = "" ;
      AV95Webhdsto6ds_17_tfstp_diaa = GXutil.resetTime( GXutil.nullDate() );
      AV96Webhdsto6ds_18_tfstp_mota = "" ;
      AV97Webhdsto6ds_19_tfstp_mota_sel = "" ;
      lV79Webhdsto6ds_1_filterfulltext = "" ;
      lV84Webhdsto6ds_6_tfstpclinom = "" ;
      lV86Webhdsto6ds_8_tfstpbarser = "" ;
      lV88Webhdsto6ds_10_tfstpbarserdsc = "" ;
      lV90Webhdsto6ds_12_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV80Webhdsto6ds_2_tfstphdr = "" ;
      lV93Webhdsto6ds_15_tfstp_mot = "" ;
      lV96Webhdsto6ds_18_tfstp_mota = "" ;
      A10748Stp_p = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      P08DP3_A129BarCod = new int[1] ;
      P08DP3_A132BarCodReo = new byte[1] ;
      P08DP3_A130BarCodPar = new String[] {""} ;
      P08DP3_A396EmprCod = new String[] {""} ;
      P08DP3_A10757Stp_MotA = new String[] {""} ;
      P08DP3_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP3_A10752Stp_Mot = new String[] {""} ;
      P08DP3_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP3_A13723StpHdr = new String[] {""} ;
      P08DP3_A13728StpColor = new String[] {""} ;
      P08DP3_n13728StpColor = new boolean[] {false} ;
      P08DP3_A13725StpBarserD = new String[] {""} ;
      P08DP3_n13725StpBarserD = new boolean[] {false} ;
      P08DP3_A13724StpBarser = new String[] {""} ;
      P08DP3_n13724StpBarser = new boolean[] {false} ;
      P08DP3_A13727StpCliNom = new String[] {""} ;
      P08DP3_n13727StpCliNom = new boolean[] {false} ;
      P08DP3_A13726StpClicod = new int[1] ;
      P08DP3_n13726StpClicod = new boolean[] {false} ;
      P08DP3_A10746Stp_hdr = new int[1] ;
      P08DP3_A10747Stp_r = new byte[1] ;
      P08DP3_A10748Stp_p = new String[] {""} ;
      P08DP3_A10750Stp_Lin = new short[1] ;
      A396EmprCod = "" ;
      AV24Option = "" ;
      P08DP5_A129BarCod = new int[1] ;
      P08DP5_A132BarCodReo = new byte[1] ;
      P08DP5_A130BarCodPar = new String[] {""} ;
      P08DP5_A396EmprCod = new String[] {""} ;
      P08DP5_A10757Stp_MotA = new String[] {""} ;
      P08DP5_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP5_A10752Stp_Mot = new String[] {""} ;
      P08DP5_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP5_A13723StpHdr = new String[] {""} ;
      P08DP5_A13728StpColor = new String[] {""} ;
      P08DP5_n13728StpColor = new boolean[] {false} ;
      P08DP5_A13725StpBarserD = new String[] {""} ;
      P08DP5_n13725StpBarserD = new boolean[] {false} ;
      P08DP5_A13724StpBarser = new String[] {""} ;
      P08DP5_n13724StpBarser = new boolean[] {false} ;
      P08DP5_A13727StpCliNom = new String[] {""} ;
      P08DP5_n13727StpCliNom = new boolean[] {false} ;
      P08DP5_A13726StpClicod = new int[1] ;
      P08DP5_n13726StpClicod = new boolean[] {false} ;
      P08DP5_A10746Stp_hdr = new int[1] ;
      P08DP5_A10747Stp_r = new byte[1] ;
      P08DP5_A10748Stp_p = new String[] {""} ;
      P08DP5_A10750Stp_Lin = new short[1] ;
      P08DP7_A129BarCod = new int[1] ;
      P08DP7_A132BarCodReo = new byte[1] ;
      P08DP7_A130BarCodPar = new String[] {""} ;
      P08DP7_A396EmprCod = new String[] {""} ;
      P08DP7_A10757Stp_MotA = new String[] {""} ;
      P08DP7_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP7_A10752Stp_Mot = new String[] {""} ;
      P08DP7_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP7_A13723StpHdr = new String[] {""} ;
      P08DP7_A13728StpColor = new String[] {""} ;
      P08DP7_n13728StpColor = new boolean[] {false} ;
      P08DP7_A13725StpBarserD = new String[] {""} ;
      P08DP7_n13725StpBarserD = new boolean[] {false} ;
      P08DP7_A13724StpBarser = new String[] {""} ;
      P08DP7_n13724StpBarser = new boolean[] {false} ;
      P08DP7_A13727StpCliNom = new String[] {""} ;
      P08DP7_n13727StpCliNom = new boolean[] {false} ;
      P08DP7_A13726StpClicod = new int[1] ;
      P08DP7_n13726StpClicod = new boolean[] {false} ;
      P08DP7_A10746Stp_hdr = new int[1] ;
      P08DP7_A10747Stp_r = new byte[1] ;
      P08DP7_A10748Stp_p = new String[] {""} ;
      P08DP7_A10750Stp_Lin = new short[1] ;
      P08DP9_A129BarCod = new int[1] ;
      P08DP9_A132BarCodReo = new byte[1] ;
      P08DP9_A130BarCodPar = new String[] {""} ;
      P08DP9_A396EmprCod = new String[] {""} ;
      P08DP9_A10757Stp_MotA = new String[] {""} ;
      P08DP9_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP9_A10752Stp_Mot = new String[] {""} ;
      P08DP9_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP9_A13723StpHdr = new String[] {""} ;
      P08DP9_A13728StpColor = new String[] {""} ;
      P08DP9_n13728StpColor = new boolean[] {false} ;
      P08DP9_A13725StpBarserD = new String[] {""} ;
      P08DP9_n13725StpBarserD = new boolean[] {false} ;
      P08DP9_A13724StpBarser = new String[] {""} ;
      P08DP9_n13724StpBarser = new boolean[] {false} ;
      P08DP9_A13727StpCliNom = new String[] {""} ;
      P08DP9_n13727StpCliNom = new boolean[] {false} ;
      P08DP9_A13726StpClicod = new int[1] ;
      P08DP9_n13726StpClicod = new boolean[] {false} ;
      P08DP9_A10746Stp_hdr = new int[1] ;
      P08DP9_A10747Stp_r = new byte[1] ;
      P08DP9_A10748Stp_p = new String[] {""} ;
      P08DP9_A10750Stp_Lin = new short[1] ;
      P08DP11_A129BarCod = new int[1] ;
      P08DP11_A132BarCodReo = new byte[1] ;
      P08DP11_A130BarCodPar = new String[] {""} ;
      P08DP11_A396EmprCod = new String[] {""} ;
      P08DP11_A10757Stp_MotA = new String[] {""} ;
      P08DP11_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP11_A10752Stp_Mot = new String[] {""} ;
      P08DP11_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP11_A13723StpHdr = new String[] {""} ;
      P08DP11_A13728StpColor = new String[] {""} ;
      P08DP11_n13728StpColor = new boolean[] {false} ;
      P08DP11_A13725StpBarserD = new String[] {""} ;
      P08DP11_n13725StpBarserD = new boolean[] {false} ;
      P08DP11_A13724StpBarser = new String[] {""} ;
      P08DP11_n13724StpBarser = new boolean[] {false} ;
      P08DP11_A13727StpCliNom = new String[] {""} ;
      P08DP11_n13727StpCliNom = new boolean[] {false} ;
      P08DP11_A13726StpClicod = new int[1] ;
      P08DP11_n13726StpClicod = new boolean[] {false} ;
      P08DP11_A10746Stp_hdr = new int[1] ;
      P08DP11_A10747Stp_r = new byte[1] ;
      P08DP11_A10748Stp_p = new String[] {""} ;
      P08DP11_A10750Stp_Lin = new short[1] ;
      P08DP13_A129BarCod = new int[1] ;
      P08DP13_A132BarCodReo = new byte[1] ;
      P08DP13_A130BarCodPar = new String[] {""} ;
      P08DP13_A396EmprCod = new String[] {""} ;
      P08DP13_A10752Stp_Mot = new String[] {""} ;
      P08DP13_A10757Stp_MotA = new String[] {""} ;
      P08DP13_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP13_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP13_A13723StpHdr = new String[] {""} ;
      P08DP13_A13728StpColor = new String[] {""} ;
      P08DP13_n13728StpColor = new boolean[] {false} ;
      P08DP13_A13725StpBarserD = new String[] {""} ;
      P08DP13_n13725StpBarserD = new boolean[] {false} ;
      P08DP13_A13724StpBarser = new String[] {""} ;
      P08DP13_n13724StpBarser = new boolean[] {false} ;
      P08DP13_A13727StpCliNom = new String[] {""} ;
      P08DP13_n13727StpCliNom = new boolean[] {false} ;
      P08DP13_A13726StpClicod = new int[1] ;
      P08DP13_n13726StpClicod = new boolean[] {false} ;
      P08DP13_A10746Stp_hdr = new int[1] ;
      P08DP13_A10747Stp_r = new byte[1] ;
      P08DP13_A10748Stp_p = new String[] {""} ;
      P08DP13_A10750Stp_Lin = new short[1] ;
      P08DP15_A129BarCod = new int[1] ;
      P08DP15_A132BarCodReo = new byte[1] ;
      P08DP15_A130BarCodPar = new String[] {""} ;
      P08DP15_A396EmprCod = new String[] {""} ;
      P08DP15_A10757Stp_MotA = new String[] {""} ;
      P08DP15_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP15_A10752Stp_Mot = new String[] {""} ;
      P08DP15_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DP15_A13723StpHdr = new String[] {""} ;
      P08DP15_A13728StpColor = new String[] {""} ;
      P08DP15_n13728StpColor = new boolean[] {false} ;
      P08DP15_A13725StpBarserD = new String[] {""} ;
      P08DP15_n13725StpBarserD = new boolean[] {false} ;
      P08DP15_A13724StpBarser = new String[] {""} ;
      P08DP15_n13724StpBarser = new boolean[] {false} ;
      P08DP15_A13727StpCliNom = new String[] {""} ;
      P08DP15_n13727StpCliNom = new boolean[] {false} ;
      P08DP15_A13726StpClicod = new int[1] ;
      P08DP15_n13726StpClicod = new boolean[] {false} ;
      P08DP15_A10746Stp_hdr = new int[1] ;
      P08DP15_A10747Stp_r = new byte[1] ;
      P08DP15_A10748Stp_p = new String[] {""} ;
      P08DP15_A10750Stp_Lin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webhdsto6getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08DP3_A129BarCod, P08DP3_A132BarCodReo, P08DP3_A130BarCodPar, P08DP3_A396EmprCod, P08DP3_A10757Stp_MotA, P08DP3_A10756Stp_DiaA, P08DP3_A10752Stp_Mot, P08DP3_A10751Stp_Dia, P08DP3_A13723StpHdr, P08DP3_A13728StpColor,
            P08DP3_n13728StpColor, P08DP3_A13725StpBarserD, P08DP3_n13725StpBarserD, P08DP3_A13724StpBarser, P08DP3_n13724StpBarser, P08DP3_A13727StpCliNom, P08DP3_n13727StpCliNom, P08DP3_A13726StpClicod, P08DP3_n13726StpClicod, P08DP3_A10746Stp_hdr,
            P08DP3_A10747Stp_r, P08DP3_A10748Stp_p, P08DP3_A10750Stp_Lin
            }
            , new Object[] {
            P08DP5_A129BarCod, P08DP5_A132BarCodReo, P08DP5_A130BarCodPar, P08DP5_A396EmprCod, P08DP5_A10757Stp_MotA, P08DP5_A10756Stp_DiaA, P08DP5_A10752Stp_Mot, P08DP5_A10751Stp_Dia, P08DP5_A13723StpHdr, P08DP5_A13728StpColor,
            P08DP5_n13728StpColor, P08DP5_A13725StpBarserD, P08DP5_n13725StpBarserD, P08DP5_A13724StpBarser, P08DP5_n13724StpBarser, P08DP5_A13727StpCliNom, P08DP5_n13727StpCliNom, P08DP5_A13726StpClicod, P08DP5_n13726StpClicod, P08DP5_A10746Stp_hdr,
            P08DP5_A10747Stp_r, P08DP5_A10748Stp_p, P08DP5_A10750Stp_Lin
            }
            , new Object[] {
            P08DP7_A129BarCod, P08DP7_A132BarCodReo, P08DP7_A130BarCodPar, P08DP7_A396EmprCod, P08DP7_A10757Stp_MotA, P08DP7_A10756Stp_DiaA, P08DP7_A10752Stp_Mot, P08DP7_A10751Stp_Dia, P08DP7_A13723StpHdr, P08DP7_A13728StpColor,
            P08DP7_n13728StpColor, P08DP7_A13725StpBarserD, P08DP7_n13725StpBarserD, P08DP7_A13724StpBarser, P08DP7_n13724StpBarser, P08DP7_A13727StpCliNom, P08DP7_n13727StpCliNom, P08DP7_A13726StpClicod, P08DP7_n13726StpClicod, P08DP7_A10746Stp_hdr,
            P08DP7_A10747Stp_r, P08DP7_A10748Stp_p, P08DP7_A10750Stp_Lin
            }
            , new Object[] {
            P08DP9_A129BarCod, P08DP9_A132BarCodReo, P08DP9_A130BarCodPar, P08DP9_A396EmprCod, P08DP9_A10757Stp_MotA, P08DP9_A10756Stp_DiaA, P08DP9_A10752Stp_Mot, P08DP9_A10751Stp_Dia, P08DP9_A13723StpHdr, P08DP9_A13728StpColor,
            P08DP9_n13728StpColor, P08DP9_A13725StpBarserD, P08DP9_n13725StpBarserD, P08DP9_A13724StpBarser, P08DP9_n13724StpBarser, P08DP9_A13727StpCliNom, P08DP9_n13727StpCliNom, P08DP9_A13726StpClicod, P08DP9_n13726StpClicod, P08DP9_A10746Stp_hdr,
            P08DP9_A10747Stp_r, P08DP9_A10748Stp_p, P08DP9_A10750Stp_Lin
            }
            , new Object[] {
            P08DP11_A129BarCod, P08DP11_A132BarCodReo, P08DP11_A130BarCodPar, P08DP11_A396EmprCod, P08DP11_A10757Stp_MotA, P08DP11_A10756Stp_DiaA, P08DP11_A10752Stp_Mot, P08DP11_A10751Stp_Dia, P08DP11_A13723StpHdr, P08DP11_A13728StpColor,
            P08DP11_n13728StpColor, P08DP11_A13725StpBarserD, P08DP11_n13725StpBarserD, P08DP11_A13724StpBarser, P08DP11_n13724StpBarser, P08DP11_A13727StpCliNom, P08DP11_n13727StpCliNom, P08DP11_A13726StpClicod, P08DP11_n13726StpClicod, P08DP11_A10746Stp_hdr,
            P08DP11_A10747Stp_r, P08DP11_A10748Stp_p, P08DP11_A10750Stp_Lin
            }
            , new Object[] {
            P08DP13_A129BarCod, P08DP13_A132BarCodReo, P08DP13_A130BarCodPar, P08DP13_A396EmprCod, P08DP13_A10752Stp_Mot, P08DP13_A10757Stp_MotA, P08DP13_A10756Stp_DiaA, P08DP13_A10751Stp_Dia, P08DP13_A13723StpHdr, P08DP13_A13728StpColor,
            P08DP13_n13728StpColor, P08DP13_A13725StpBarserD, P08DP13_n13725StpBarserD, P08DP13_A13724StpBarser, P08DP13_n13724StpBarser, P08DP13_A13727StpCliNom, P08DP13_n13727StpCliNom, P08DP13_A13726StpClicod, P08DP13_n13726StpClicod, P08DP13_A10746Stp_hdr,
            P08DP13_A10747Stp_r, P08DP13_A10748Stp_p, P08DP13_A10750Stp_Lin
            }
            , new Object[] {
            P08DP15_A129BarCod, P08DP15_A132BarCodReo, P08DP15_A130BarCodPar, P08DP15_A396EmprCod, P08DP15_A10757Stp_MotA, P08DP15_A10756Stp_DiaA, P08DP15_A10752Stp_Mot, P08DP15_A10751Stp_Dia, P08DP15_A13723StpHdr, P08DP15_A13728StpColor,
            P08DP15_n13728StpColor, P08DP15_A13725StpBarserD, P08DP15_n13725StpBarserD, P08DP15_A13724StpBarser, P08DP15_n13724StpBarser, P08DP15_A13727StpCliNom, P08DP15_n13727StpCliNom, P08DP15_A13726StpClicod, P08DP15_n13726StpClicod, P08DP15_A10746Stp_hdr,
            P08DP15_A10747Stp_r, P08DP15_A10748Stp_p, P08DP15_A10750Stp_Lin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV77GXV1 ;
   private int AV43TFStpClicod ;
   private int AV44TFStpClicod_To ;
   private int AV82Webhdsto6ds_4_tfstpclicod ;
   private int AV83Webhdsto6ds_5_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int A13726StpClicod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private String AV10TFStpHdr ;
   private String AV11TFStpHdr_Sel ;
   private String AV45TFStpCliNom ;
   private String AV46TFStpCliNom_Sel ;
   private String AV47TFStpBarser ;
   private String AV48TFStpBarser_Sel ;
   private String AV49TFStpBarserDsc ;
   private String AV50TFStpBarserDsc_Sel ;
   private String AV51TFStpColor ;
   private String AV52TFStpColor_Sel ;
   private String A13723StpHdr ;
   private String AV80Webhdsto6ds_2_tfstphdr ;
   private String AV81Webhdsto6ds_3_tfstphdr_sel ;
   private String AV84Webhdsto6ds_6_tfstpclinom ;
   private String AV85Webhdsto6ds_7_tfstpclinom_sel ;
   private String AV86Webhdsto6ds_8_tfstpbarser ;
   private String AV87Webhdsto6ds_9_tfstpbarser_sel ;
   private String AV88Webhdsto6ds_10_tfstpbarserdsc ;
   private String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ;
   private String AV90Webhdsto6ds_12_tfstpcolor ;
   private String AV91Webhdsto6ds_13_tfstpcolor_sel ;
   private String lV84Webhdsto6ds_6_tfstpclinom ;
   private String lV86Webhdsto6ds_8_tfstpbarser ;
   private String lV88Webhdsto6ds_10_tfstpbarserdsc ;
   private String lV90Webhdsto6ds_12_tfstpcolor ;
   private String scmdbuf ;
   private String lV80Webhdsto6ds_2_tfstphdr ;
   private String A10748Stp_p ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String A396EmprCod ;
   private java.util.Date AV12TFStp_Dia ;
   private java.util.Date AV16TFStp_DiaA ;
   private java.util.Date AV92Webhdsto6ds_14_tfstp_dia ;
   private java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private boolean returnInSub ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private boolean brk8DP7 ;
   private boolean brk8DP9 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV14TFStp_Mot ;
   private String AV15TFStp_Mot_Sel ;
   private String AV18TFStp_MotA ;
   private String AV19TFStp_MotA_Sel ;
   private String AV79Webhdsto6ds_1_filterfulltext ;
   private String AV93Webhdsto6ds_15_tfstp_mot ;
   private String AV94Webhdsto6ds_16_tfstp_mot_sel ;
   private String AV96Webhdsto6ds_18_tfstp_mota ;
   private String AV97Webhdsto6ds_19_tfstp_mota_sel ;
   private String lV79Webhdsto6ds_1_filterfulltext ;
   private String lV93Webhdsto6ds_15_tfstp_mot ;
   private String lV96Webhdsto6ds_18_tfstp_mota ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08DP3_A129BarCod ;
   private byte[] P08DP3_A132BarCodReo ;
   private String[] P08DP3_A130BarCodPar ;
   private String[] P08DP3_A396EmprCod ;
   private String[] P08DP3_A10757Stp_MotA ;
   private java.util.Date[] P08DP3_A10756Stp_DiaA ;
   private String[] P08DP3_A10752Stp_Mot ;
   private java.util.Date[] P08DP3_A10751Stp_Dia ;
   private String[] P08DP3_A13723StpHdr ;
   private String[] P08DP3_A13728StpColor ;
   private boolean[] P08DP3_n13728StpColor ;
   private String[] P08DP3_A13725StpBarserD ;
   private boolean[] P08DP3_n13725StpBarserD ;
   private String[] P08DP3_A13724StpBarser ;
   private boolean[] P08DP3_n13724StpBarser ;
   private String[] P08DP3_A13727StpCliNom ;
   private boolean[] P08DP3_n13727StpCliNom ;
   private int[] P08DP3_A13726StpClicod ;
   private boolean[] P08DP3_n13726StpClicod ;
   private int[] P08DP3_A10746Stp_hdr ;
   private byte[] P08DP3_A10747Stp_r ;
   private String[] P08DP3_A10748Stp_p ;
   private short[] P08DP3_A10750Stp_Lin ;
   private int[] P08DP5_A129BarCod ;
   private byte[] P08DP5_A132BarCodReo ;
   private String[] P08DP5_A130BarCodPar ;
   private String[] P08DP5_A396EmprCod ;
   private String[] P08DP5_A10757Stp_MotA ;
   private java.util.Date[] P08DP5_A10756Stp_DiaA ;
   private String[] P08DP5_A10752Stp_Mot ;
   private java.util.Date[] P08DP5_A10751Stp_Dia ;
   private String[] P08DP5_A13723StpHdr ;
   private String[] P08DP5_A13728StpColor ;
   private boolean[] P08DP5_n13728StpColor ;
   private String[] P08DP5_A13725StpBarserD ;
   private boolean[] P08DP5_n13725StpBarserD ;
   private String[] P08DP5_A13724StpBarser ;
   private boolean[] P08DP5_n13724StpBarser ;
   private String[] P08DP5_A13727StpCliNom ;
   private boolean[] P08DP5_n13727StpCliNom ;
   private int[] P08DP5_A13726StpClicod ;
   private boolean[] P08DP5_n13726StpClicod ;
   private int[] P08DP5_A10746Stp_hdr ;
   private byte[] P08DP5_A10747Stp_r ;
   private String[] P08DP5_A10748Stp_p ;
   private short[] P08DP5_A10750Stp_Lin ;
   private int[] P08DP7_A129BarCod ;
   private byte[] P08DP7_A132BarCodReo ;
   private String[] P08DP7_A130BarCodPar ;
   private String[] P08DP7_A396EmprCod ;
   private String[] P08DP7_A10757Stp_MotA ;
   private java.util.Date[] P08DP7_A10756Stp_DiaA ;
   private String[] P08DP7_A10752Stp_Mot ;
   private java.util.Date[] P08DP7_A10751Stp_Dia ;
   private String[] P08DP7_A13723StpHdr ;
   private String[] P08DP7_A13728StpColor ;
   private boolean[] P08DP7_n13728StpColor ;
   private String[] P08DP7_A13725StpBarserD ;
   private boolean[] P08DP7_n13725StpBarserD ;
   private String[] P08DP7_A13724StpBarser ;
   private boolean[] P08DP7_n13724StpBarser ;
   private String[] P08DP7_A13727StpCliNom ;
   private boolean[] P08DP7_n13727StpCliNom ;
   private int[] P08DP7_A13726StpClicod ;
   private boolean[] P08DP7_n13726StpClicod ;
   private int[] P08DP7_A10746Stp_hdr ;
   private byte[] P08DP7_A10747Stp_r ;
   private String[] P08DP7_A10748Stp_p ;
   private short[] P08DP7_A10750Stp_Lin ;
   private int[] P08DP9_A129BarCod ;
   private byte[] P08DP9_A132BarCodReo ;
   private String[] P08DP9_A130BarCodPar ;
   private String[] P08DP9_A396EmprCod ;
   private String[] P08DP9_A10757Stp_MotA ;
   private java.util.Date[] P08DP9_A10756Stp_DiaA ;
   private String[] P08DP9_A10752Stp_Mot ;
   private java.util.Date[] P08DP9_A10751Stp_Dia ;
   private String[] P08DP9_A13723StpHdr ;
   private String[] P08DP9_A13728StpColor ;
   private boolean[] P08DP9_n13728StpColor ;
   private String[] P08DP9_A13725StpBarserD ;
   private boolean[] P08DP9_n13725StpBarserD ;
   private String[] P08DP9_A13724StpBarser ;
   private boolean[] P08DP9_n13724StpBarser ;
   private String[] P08DP9_A13727StpCliNom ;
   private boolean[] P08DP9_n13727StpCliNom ;
   private int[] P08DP9_A13726StpClicod ;
   private boolean[] P08DP9_n13726StpClicod ;
   private int[] P08DP9_A10746Stp_hdr ;
   private byte[] P08DP9_A10747Stp_r ;
   private String[] P08DP9_A10748Stp_p ;
   private short[] P08DP9_A10750Stp_Lin ;
   private int[] P08DP11_A129BarCod ;
   private byte[] P08DP11_A132BarCodReo ;
   private String[] P08DP11_A130BarCodPar ;
   private String[] P08DP11_A396EmprCod ;
   private String[] P08DP11_A10757Stp_MotA ;
   private java.util.Date[] P08DP11_A10756Stp_DiaA ;
   private String[] P08DP11_A10752Stp_Mot ;
   private java.util.Date[] P08DP11_A10751Stp_Dia ;
   private String[] P08DP11_A13723StpHdr ;
   private String[] P08DP11_A13728StpColor ;
   private boolean[] P08DP11_n13728StpColor ;
   private String[] P08DP11_A13725StpBarserD ;
   private boolean[] P08DP11_n13725StpBarserD ;
   private String[] P08DP11_A13724StpBarser ;
   private boolean[] P08DP11_n13724StpBarser ;
   private String[] P08DP11_A13727StpCliNom ;
   private boolean[] P08DP11_n13727StpCliNom ;
   private int[] P08DP11_A13726StpClicod ;
   private boolean[] P08DP11_n13726StpClicod ;
   private int[] P08DP11_A10746Stp_hdr ;
   private byte[] P08DP11_A10747Stp_r ;
   private String[] P08DP11_A10748Stp_p ;
   private short[] P08DP11_A10750Stp_Lin ;
   private int[] P08DP13_A129BarCod ;
   private byte[] P08DP13_A132BarCodReo ;
   private String[] P08DP13_A130BarCodPar ;
   private String[] P08DP13_A396EmprCod ;
   private String[] P08DP13_A10752Stp_Mot ;
   private String[] P08DP13_A10757Stp_MotA ;
   private java.util.Date[] P08DP13_A10756Stp_DiaA ;
   private java.util.Date[] P08DP13_A10751Stp_Dia ;
   private String[] P08DP13_A13723StpHdr ;
   private String[] P08DP13_A13728StpColor ;
   private boolean[] P08DP13_n13728StpColor ;
   private String[] P08DP13_A13725StpBarserD ;
   private boolean[] P08DP13_n13725StpBarserD ;
   private String[] P08DP13_A13724StpBarser ;
   private boolean[] P08DP13_n13724StpBarser ;
   private String[] P08DP13_A13727StpCliNom ;
   private boolean[] P08DP13_n13727StpCliNom ;
   private int[] P08DP13_A13726StpClicod ;
   private boolean[] P08DP13_n13726StpClicod ;
   private int[] P08DP13_A10746Stp_hdr ;
   private byte[] P08DP13_A10747Stp_r ;
   private String[] P08DP13_A10748Stp_p ;
   private short[] P08DP13_A10750Stp_Lin ;
   private int[] P08DP15_A129BarCod ;
   private byte[] P08DP15_A132BarCodReo ;
   private String[] P08DP15_A130BarCodPar ;
   private String[] P08DP15_A396EmprCod ;
   private String[] P08DP15_A10757Stp_MotA ;
   private java.util.Date[] P08DP15_A10756Stp_DiaA ;
   private String[] P08DP15_A10752Stp_Mot ;
   private java.util.Date[] P08DP15_A10751Stp_Dia ;
   private String[] P08DP15_A13723StpHdr ;
   private String[] P08DP15_A13728StpColor ;
   private boolean[] P08DP15_n13728StpColor ;
   private String[] P08DP15_A13725StpBarserD ;
   private boolean[] P08DP15_n13725StpBarserD ;
   private String[] P08DP15_A13724StpBarser ;
   private boolean[] P08DP15_n13724StpBarser ;
   private String[] P08DP15_A13727StpCliNom ;
   private boolean[] P08DP15_n13727StpCliNom ;
   private int[] P08DP15_A13726StpClicod ;
   private boolean[] P08DP15_n13726StpClicod ;
   private int[] P08DP15_A10746Stp_hdr ;
   private byte[] P08DP15_A10747Stp_r ;
   private String[] P08DP15_A10748Stp_p ;
   private short[] P08DP15_A10750Stp_Lin ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class webhdsto6getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                          String AV80Webhdsto6ds_2_tfstphdr ,
                                          java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                          String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                          String AV93Webhdsto6ds_15_tfstp_mot ,
                                          java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                          String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                          String AV96Webhdsto6ds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV79Webhdsto6ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV82Webhdsto6ds_4_tfstpclicod ,
                                          int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                          String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                          String AV84Webhdsto6ds_6_tfstpclinom ,
                                          String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                          String AV86Webhdsto6ds_8_tfstpbarser ,
                                          String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                          String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                          String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                          String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08DP5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                          String AV80Webhdsto6ds_2_tfstphdr ,
                                          java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                          String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                          String AV93Webhdsto6ds_15_tfstp_mot ,
                                          java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                          String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                          String AV96Webhdsto6ds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV79Webhdsto6ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV82Webhdsto6ds_4_tfstpclicod ,
                                          int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                          String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                          String AV84Webhdsto6ds_6_tfstpclinom ,
                                          String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                          String AV86Webhdsto6ds_8_tfstpbarser ,
                                          String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                          String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                          String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                          String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[41];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08DP7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                          String AV80Webhdsto6ds_2_tfstphdr ,
                                          java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                          String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                          String AV93Webhdsto6ds_15_tfstp_mot ,
                                          java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                          String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                          String AV96Webhdsto6ds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV79Webhdsto6ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV82Webhdsto6ds_4_tfstpclicod ,
                                          int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                          String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                          String AV84Webhdsto6ds_6_tfstpclinom ,
                                          String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                          String AV86Webhdsto6ds_8_tfstpbarser ,
                                          String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                          String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                          String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                          String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08DP9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                          String AV80Webhdsto6ds_2_tfstphdr ,
                                          java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                          String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                          String AV93Webhdsto6ds_15_tfstp_mot ,
                                          java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                          String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                          String AV96Webhdsto6ds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV79Webhdsto6ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV82Webhdsto6ds_4_tfstpclicod ,
                                          int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                          String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                          String AV84Webhdsto6ds_6_tfstpclinom ,
                                          String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                          String AV86Webhdsto6ds_8_tfstpbarser ,
                                          String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                          String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                          String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                          String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08DP11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           String AV80Webhdsto6ds_2_tfstphdr ,
                                           java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                           String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           String AV93Webhdsto6ds_15_tfstp_mot ,
                                           java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                           String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           String AV96Webhdsto6ds_18_tfstp_mota ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           java.util.Date A10756Stp_DiaA ,
                                           String A10757Stp_MotA ,
                                           String AV79Webhdsto6ds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV82Webhdsto6ds_4_tfstpclicod ,
                                           int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                           String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           String AV84Webhdsto6ds_6_tfstpclinom ,
                                           String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           String AV86Webhdsto6ds_8_tfstpbarser ,
                                           String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[41];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08DP13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           String AV80Webhdsto6ds_2_tfstphdr ,
                                           java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                           String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           String AV93Webhdsto6ds_15_tfstp_mot ,
                                           java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                           String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           String AV96Webhdsto6ds_18_tfstp_mota ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           java.util.Date A10756Stp_DiaA ,
                                           String A10757Stp_MotA ,
                                           String AV79Webhdsto6ds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV82Webhdsto6ds_4_tfstpclicod ,
                                           int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                           String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           String AV84Webhdsto6ds_6_tfstpclinom ,
                                           String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           String AV86Webhdsto6ds_8_tfstpbarser ,
                                           String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[41];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Mot, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Stp_Mot" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08DP15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV81Webhdsto6ds_3_tfstphdr_sel ,
                                           String AV80Webhdsto6ds_2_tfstphdr ,
                                           java.util.Date AV92Webhdsto6ds_14_tfstp_dia ,
                                           String AV94Webhdsto6ds_16_tfstp_mot_sel ,
                                           String AV93Webhdsto6ds_15_tfstp_mot ,
                                           java.util.Date AV95Webhdsto6ds_17_tfstp_diaa ,
                                           String AV97Webhdsto6ds_19_tfstp_mota_sel ,
                                           String AV96Webhdsto6ds_18_tfstp_mota ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           java.util.Date A10756Stp_DiaA ,
                                           String A10757Stp_MotA ,
                                           String AV79Webhdsto6ds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV82Webhdsto6ds_4_tfstpclicod ,
                                           int AV83Webhdsto6ds_5_tfstpclicod_to ,
                                           String AV85Webhdsto6ds_7_tfstpclinom_sel ,
                                           String AV84Webhdsto6ds_6_tfstpclinom ,
                                           String AV87Webhdsto6ds_9_tfstpbarser_sel ,
                                           String AV86Webhdsto6ds_8_tfstpbarser ,
                                           String AV89Webhdsto6ds_11_tfstpbarserdsc_sel ,
                                           String AV88Webhdsto6ds_10_tfstpbarserdsc ,
                                           String AV91Webhdsto6ds_13_tfstpcolor_sel ,
                                           String AV90Webhdsto6ds_12_tfstpcolor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[41];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto6ds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto6ds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Webhdsto6ds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV93Webhdsto6ds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webhdsto6ds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Webhdsto6ds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV96Webhdsto6ds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webhdsto6ds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Stp_MotA" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P08DP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_P08DP5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 2 :
                  return conditional_P08DP7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 3 :
                  return conditional_P08DP9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 4 :
                  return conditional_P08DP11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 5 :
                  return conditional_P08DP13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 6 :
                  return conditional_P08DP15(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DP5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DP7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DP9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DP11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DP13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DP15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
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
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[79], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               return;
      }
   }

}

