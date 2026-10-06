package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webhdsto5getfilterdata extends GXProcedure
{
   public webhdsto5getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webhdsto5getfilterdata.class ), "" );
   }

   public webhdsto5getfilterdata( int remoteHandle ,
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
      webhdsto5getfilterdata.this.aP5 = new String[] {""};
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
      webhdsto5getfilterdata.this.AV20DDOName = aP0;
      webhdsto5getfilterdata.this.AV18SearchTxt = aP1;
      webhdsto5getfilterdata.this.AV19SearchTxtTo = aP2;
      webhdsto5getfilterdata.this.aP3 = aP3;
      webhdsto5getfilterdata.this.aP4 = aP4;
      webhdsto5getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_STP_MOT") == 0 )
      {
         /* Execute user subroutine: 'LOADSTP_MOTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_STPHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_STPCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_STPBARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_STPBARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_STPCOLOR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCOLOROPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WebHDSTO5GridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebHDSTO5GridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebHDSTO5GridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV12TFStp_Lin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFStp_Lin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV14TFStp_Dia = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV16TFStp_Mot = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV17TFStp_Mot_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV10TFStpHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV11TFStpHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV37TFStpClicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFStpClicod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV39TFStpCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV40TFStpCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV41TFStpBarser = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV42TFStpBarser_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV43TFStpBarserDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV44TFStpBarserDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV45TFStpColor = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV46TFStpColor_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSTP_MOTOPTIONS' Routine */
      returnInSub = false ;
      AV16TFStp_Mot = AV18SearchTxt ;
      AV17TFStp_Mot_Sel = "" ;
      AV76Webhdsto5ds_1_filterfulltext = AV47FilterFullText ;
      AV77Webhdsto5ds_2_tfstp_lin = AV12TFStp_Lin ;
      AV78Webhdsto5ds_3_tfstp_lin_to = AV13TFStp_Lin_To ;
      AV79Webhdsto5ds_4_tfstp_dia = AV14TFStp_Dia ;
      AV80Webhdsto5ds_5_tfstp_mot = AV16TFStp_Mot ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = AV17TFStp_Mot_Sel ;
      AV82Webhdsto5ds_7_tfstphdr = AV10TFStpHdr ;
      AV83Webhdsto5ds_8_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV84Webhdsto5ds_9_tfstpclicod = AV37TFStpClicod ;
      AV85Webhdsto5ds_10_tfstpclicod_to = AV38TFStpClicod_To ;
      AV86Webhdsto5ds_11_tfstpclinom = AV39TFStpCliNom ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV88Webhdsto5ds_13_tfstpbarser = AV41TFStpBarser ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV92Webhdsto5ds_17_tfstpcolor = AV45TFStpColor ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = AV46TFStpColor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV79Webhdsto5ds_4_tfstp_dia ,
                                           AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV80Webhdsto5ds_5_tfstp_mot ,
                                           AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           AV82Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV76Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV86Webhdsto5ds_11_tfstpclinom ,
                                           AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV88Webhdsto5ds_13_tfstpbarser ,
                                           AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV92Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV86Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV86Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV88Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV88Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV92Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV92Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV80Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV80Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV82Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV82Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P08DK3 */
      pr_default.execute(0, new Object[] {AV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), AV87Webhdsto5ds_12_tfstpclinom_sel, AV86Webhdsto5ds_11_tfstpclinom, lV86Webhdsto5ds_11_tfstpclinom, AV87Webhdsto5ds_12_tfstpclinom_sel, AV87Webhdsto5ds_12_tfstpclinom_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV88Webhdsto5ds_13_tfstpbarser, lV88Webhdsto5ds_13_tfstpbarser, AV89Webhdsto5ds_14_tfstpbarser_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV90Webhdsto5ds_15_tfstpbarserdsc, lV90Webhdsto5ds_15_tfstpbarserdsc, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, AV92Webhdsto5ds_17_tfstpcolor, lV92Webhdsto5ds_17_tfstpcolor, AV93Webhdsto5ds_18_tfstpcolor_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to), AV79Webhdsto5ds_4_tfstp_dia, lV80Webhdsto5ds_5_tfstp_mot, AV81Webhdsto5ds_6_tfstp_mot_sel, lV82Webhdsto5ds_7_tfstphdr, AV83Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8DK2 = false ;
         A396EmprCod = P08DK3_A396EmprCod[0] ;
         A10755Stp_Est = P08DK3_A10755Stp_Est[0] ;
         A10752Stp_Mot = P08DK3_A10752Stp_Mot[0] ;
         A13723StpHdr = P08DK3_A13723StpHdr[0] ;
         A10751Stp_Dia = P08DK3_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P08DK3_A10750Stp_Lin[0] ;
         A13728StpColor = P08DK3_A13728StpColor[0] ;
         n13728StpColor = P08DK3_n13728StpColor[0] ;
         A13725StpBarserD = P08DK3_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK3_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK3_A13724StpBarser[0] ;
         n13724StpBarser = P08DK3_n13724StpBarser[0] ;
         A13727StpCliNom = P08DK3_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK3_n13727StpCliNom[0] ;
         A13726StpClicod = P08DK3_A13726StpClicod[0] ;
         n13726StpClicod = P08DK3_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DK3_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DK3_A10747Stp_r[0] ;
         A10748Stp_p = P08DK3_A10748Stp_p[0] ;
         A13723StpHdr = P08DK3_A13723StpHdr[0] ;
         A13728StpColor = P08DK3_A13728StpColor[0] ;
         n13728StpColor = P08DK3_n13728StpColor[0] ;
         A13725StpBarserD = P08DK3_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK3_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK3_A13724StpBarser[0] ;
         n13724StpBarser = P08DK3_n13724StpBarser[0] ;
         A13726StpClicod = P08DK3_A13726StpClicod[0] ;
         n13726StpClicod = P08DK3_n13726StpClicod[0] ;
         A13727StpCliNom = P08DK3_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK3_n13727StpCliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08DK3_A10752Stp_Mot[0], A10752Stp_Mot) == 0 ) )
         {
            brk8DK2 = false ;
            A396EmprCod = P08DK3_A396EmprCod[0] ;
            A10750Stp_Lin = P08DK3_A10750Stp_Lin[0] ;
            A10746Stp_hdr = P08DK3_A10746Stp_hdr[0] ;
            A10747Stp_r = P08DK3_A10747Stp_r[0] ;
            A10748Stp_p = P08DK3_A10748Stp_p[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8DK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A10752Stp_Mot)==0) )
         {
            AV22Option = A10752Stp_Mot ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8DK2 )
         {
            brk8DK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSTPHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFStpHdr = AV18SearchTxt ;
      AV11TFStpHdr_Sel = "" ;
      AV76Webhdsto5ds_1_filterfulltext = AV47FilterFullText ;
      AV77Webhdsto5ds_2_tfstp_lin = AV12TFStp_Lin ;
      AV78Webhdsto5ds_3_tfstp_lin_to = AV13TFStp_Lin_To ;
      AV79Webhdsto5ds_4_tfstp_dia = AV14TFStp_Dia ;
      AV80Webhdsto5ds_5_tfstp_mot = AV16TFStp_Mot ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = AV17TFStp_Mot_Sel ;
      AV82Webhdsto5ds_7_tfstphdr = AV10TFStpHdr ;
      AV83Webhdsto5ds_8_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV84Webhdsto5ds_9_tfstpclicod = AV37TFStpClicod ;
      AV85Webhdsto5ds_10_tfstpclicod_to = AV38TFStpClicod_To ;
      AV86Webhdsto5ds_11_tfstpclinom = AV39TFStpCliNom ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV88Webhdsto5ds_13_tfstpbarser = AV41TFStpBarser ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV92Webhdsto5ds_17_tfstpcolor = AV45TFStpColor ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = AV46TFStpColor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV79Webhdsto5ds_4_tfstp_dia ,
                                           AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV80Webhdsto5ds_5_tfstp_mot ,
                                           AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           AV82Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV76Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV86Webhdsto5ds_11_tfstpclinom ,
                                           AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV88Webhdsto5ds_13_tfstpbarser ,
                                           AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV92Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV86Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV86Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV88Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV88Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV92Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV92Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV80Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV80Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV82Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV82Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P08DK5 */
      pr_default.execute(1, new Object[] {AV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), AV87Webhdsto5ds_12_tfstpclinom_sel, AV86Webhdsto5ds_11_tfstpclinom, lV86Webhdsto5ds_11_tfstpclinom, AV87Webhdsto5ds_12_tfstpclinom_sel, AV87Webhdsto5ds_12_tfstpclinom_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV88Webhdsto5ds_13_tfstpbarser, lV88Webhdsto5ds_13_tfstpbarser, AV89Webhdsto5ds_14_tfstpbarser_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV90Webhdsto5ds_15_tfstpbarserdsc, lV90Webhdsto5ds_15_tfstpbarserdsc, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, AV92Webhdsto5ds_17_tfstpcolor, lV92Webhdsto5ds_17_tfstpcolor, AV93Webhdsto5ds_18_tfstpcolor_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to), AV79Webhdsto5ds_4_tfstp_dia, lV80Webhdsto5ds_5_tfstp_mot, AV81Webhdsto5ds_6_tfstp_mot_sel, lV82Webhdsto5ds_7_tfstphdr, AV83Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P08DK5_A396EmprCod[0] ;
         A10755Stp_Est = P08DK5_A10755Stp_Est[0] ;
         A13723StpHdr = P08DK5_A13723StpHdr[0] ;
         A10752Stp_Mot = P08DK5_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DK5_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P08DK5_A10750Stp_Lin[0] ;
         A13728StpColor = P08DK5_A13728StpColor[0] ;
         n13728StpColor = P08DK5_n13728StpColor[0] ;
         A13725StpBarserD = P08DK5_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK5_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK5_A13724StpBarser[0] ;
         n13724StpBarser = P08DK5_n13724StpBarser[0] ;
         A13727StpCliNom = P08DK5_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK5_n13727StpCliNom[0] ;
         A13726StpClicod = P08DK5_A13726StpClicod[0] ;
         n13726StpClicod = P08DK5_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DK5_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DK5_A10747Stp_r[0] ;
         A10748Stp_p = P08DK5_A10748Stp_p[0] ;
         A13723StpHdr = P08DK5_A13723StpHdr[0] ;
         A13728StpColor = P08DK5_A13728StpColor[0] ;
         n13728StpColor = P08DK5_n13728StpColor[0] ;
         A13725StpBarserD = P08DK5_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK5_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK5_A13724StpBarser[0] ;
         n13724StpBarser = P08DK5_n13724StpBarser[0] ;
         A13726StpClicod = P08DK5_A13726StpClicod[0] ;
         n13726StpClicod = P08DK5_n13726StpClicod[0] ;
         A13727StpCliNom = P08DK5_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK5_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13723StpHdr)==0) )
         {
            AV22Option = A13723StpHdr ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
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
      /* 'LOADSTPCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV39TFStpCliNom = AV18SearchTxt ;
      AV40TFStpCliNom_Sel = "" ;
      AV76Webhdsto5ds_1_filterfulltext = AV47FilterFullText ;
      AV77Webhdsto5ds_2_tfstp_lin = AV12TFStp_Lin ;
      AV78Webhdsto5ds_3_tfstp_lin_to = AV13TFStp_Lin_To ;
      AV79Webhdsto5ds_4_tfstp_dia = AV14TFStp_Dia ;
      AV80Webhdsto5ds_5_tfstp_mot = AV16TFStp_Mot ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = AV17TFStp_Mot_Sel ;
      AV82Webhdsto5ds_7_tfstphdr = AV10TFStpHdr ;
      AV83Webhdsto5ds_8_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV84Webhdsto5ds_9_tfstpclicod = AV37TFStpClicod ;
      AV85Webhdsto5ds_10_tfstpclicod_to = AV38TFStpClicod_To ;
      AV86Webhdsto5ds_11_tfstpclinom = AV39TFStpCliNom ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV88Webhdsto5ds_13_tfstpbarser = AV41TFStpBarser ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV92Webhdsto5ds_17_tfstpcolor = AV45TFStpColor ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = AV46TFStpColor_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV79Webhdsto5ds_4_tfstp_dia ,
                                           AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV80Webhdsto5ds_5_tfstp_mot ,
                                           AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           AV82Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV76Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV86Webhdsto5ds_11_tfstpclinom ,
                                           AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV88Webhdsto5ds_13_tfstpbarser ,
                                           AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV92Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV86Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV86Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV88Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV88Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV92Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV92Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV80Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV80Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV82Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV82Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P08DK7 */
      pr_default.execute(2, new Object[] {AV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), AV87Webhdsto5ds_12_tfstpclinom_sel, AV86Webhdsto5ds_11_tfstpclinom, lV86Webhdsto5ds_11_tfstpclinom, AV87Webhdsto5ds_12_tfstpclinom_sel, AV87Webhdsto5ds_12_tfstpclinom_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV88Webhdsto5ds_13_tfstpbarser, lV88Webhdsto5ds_13_tfstpbarser, AV89Webhdsto5ds_14_tfstpbarser_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV90Webhdsto5ds_15_tfstpbarserdsc, lV90Webhdsto5ds_15_tfstpbarserdsc, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, AV92Webhdsto5ds_17_tfstpcolor, lV92Webhdsto5ds_17_tfstpcolor, AV93Webhdsto5ds_18_tfstpcolor_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to), AV79Webhdsto5ds_4_tfstp_dia, lV80Webhdsto5ds_5_tfstp_mot, AV81Webhdsto5ds_6_tfstp_mot_sel, lV82Webhdsto5ds_7_tfstphdr, AV83Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P08DK7_A396EmprCod[0] ;
         A10755Stp_Est = P08DK7_A10755Stp_Est[0] ;
         A13723StpHdr = P08DK7_A13723StpHdr[0] ;
         A10752Stp_Mot = P08DK7_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DK7_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P08DK7_A10750Stp_Lin[0] ;
         A13728StpColor = P08DK7_A13728StpColor[0] ;
         n13728StpColor = P08DK7_n13728StpColor[0] ;
         A13725StpBarserD = P08DK7_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK7_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK7_A13724StpBarser[0] ;
         n13724StpBarser = P08DK7_n13724StpBarser[0] ;
         A13727StpCliNom = P08DK7_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK7_n13727StpCliNom[0] ;
         A13726StpClicod = P08DK7_A13726StpClicod[0] ;
         n13726StpClicod = P08DK7_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DK7_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DK7_A10747Stp_r[0] ;
         A10748Stp_p = P08DK7_A10748Stp_p[0] ;
         A13723StpHdr = P08DK7_A13723StpHdr[0] ;
         A13728StpColor = P08DK7_A13728StpColor[0] ;
         n13728StpColor = P08DK7_n13728StpColor[0] ;
         A13725StpBarserD = P08DK7_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK7_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK7_A13724StpBarser[0] ;
         n13724StpBarser = P08DK7_n13724StpBarser[0] ;
         A13726StpClicod = P08DK7_A13726StpClicod[0] ;
         n13726StpClicod = P08DK7_n13726StpClicod[0] ;
         A13727StpCliNom = P08DK7_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK7_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13727StpCliNom)==0) )
         {
            AV22Option = A13727StpCliNom ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
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
      /* 'LOADSTPBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV41TFStpBarser = AV18SearchTxt ;
      AV42TFStpBarser_Sel = "" ;
      AV76Webhdsto5ds_1_filterfulltext = AV47FilterFullText ;
      AV77Webhdsto5ds_2_tfstp_lin = AV12TFStp_Lin ;
      AV78Webhdsto5ds_3_tfstp_lin_to = AV13TFStp_Lin_To ;
      AV79Webhdsto5ds_4_tfstp_dia = AV14TFStp_Dia ;
      AV80Webhdsto5ds_5_tfstp_mot = AV16TFStp_Mot ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = AV17TFStp_Mot_Sel ;
      AV82Webhdsto5ds_7_tfstphdr = AV10TFStpHdr ;
      AV83Webhdsto5ds_8_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV84Webhdsto5ds_9_tfstpclicod = AV37TFStpClicod ;
      AV85Webhdsto5ds_10_tfstpclicod_to = AV38TFStpClicod_To ;
      AV86Webhdsto5ds_11_tfstpclinom = AV39TFStpCliNom ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV88Webhdsto5ds_13_tfstpbarser = AV41TFStpBarser ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV92Webhdsto5ds_17_tfstpcolor = AV45TFStpColor ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = AV46TFStpColor_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV79Webhdsto5ds_4_tfstp_dia ,
                                           AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV80Webhdsto5ds_5_tfstp_mot ,
                                           AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           AV82Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV76Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV86Webhdsto5ds_11_tfstpclinom ,
                                           AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV88Webhdsto5ds_13_tfstpbarser ,
                                           AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV92Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV86Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV86Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV88Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV88Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV92Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV92Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV80Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV80Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV82Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV82Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P08DK9 */
      pr_default.execute(3, new Object[] {AV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), AV87Webhdsto5ds_12_tfstpclinom_sel, AV86Webhdsto5ds_11_tfstpclinom, lV86Webhdsto5ds_11_tfstpclinom, AV87Webhdsto5ds_12_tfstpclinom_sel, AV87Webhdsto5ds_12_tfstpclinom_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV88Webhdsto5ds_13_tfstpbarser, lV88Webhdsto5ds_13_tfstpbarser, AV89Webhdsto5ds_14_tfstpbarser_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV90Webhdsto5ds_15_tfstpbarserdsc, lV90Webhdsto5ds_15_tfstpbarserdsc, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, AV92Webhdsto5ds_17_tfstpcolor, lV92Webhdsto5ds_17_tfstpcolor, AV93Webhdsto5ds_18_tfstpcolor_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to), AV79Webhdsto5ds_4_tfstp_dia, lV80Webhdsto5ds_5_tfstp_mot, AV81Webhdsto5ds_6_tfstp_mot_sel, lV82Webhdsto5ds_7_tfstphdr, AV83Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P08DK9_A396EmprCod[0] ;
         A10755Stp_Est = P08DK9_A10755Stp_Est[0] ;
         A13723StpHdr = P08DK9_A13723StpHdr[0] ;
         A10752Stp_Mot = P08DK9_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DK9_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P08DK9_A10750Stp_Lin[0] ;
         A13728StpColor = P08DK9_A13728StpColor[0] ;
         n13728StpColor = P08DK9_n13728StpColor[0] ;
         A13725StpBarserD = P08DK9_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK9_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK9_A13724StpBarser[0] ;
         n13724StpBarser = P08DK9_n13724StpBarser[0] ;
         A13727StpCliNom = P08DK9_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK9_n13727StpCliNom[0] ;
         A13726StpClicod = P08DK9_A13726StpClicod[0] ;
         n13726StpClicod = P08DK9_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DK9_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DK9_A10747Stp_r[0] ;
         A10748Stp_p = P08DK9_A10748Stp_p[0] ;
         A13723StpHdr = P08DK9_A13723StpHdr[0] ;
         A13728StpColor = P08DK9_A13728StpColor[0] ;
         n13728StpColor = P08DK9_n13728StpColor[0] ;
         A13725StpBarserD = P08DK9_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK9_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK9_A13724StpBarser[0] ;
         n13724StpBarser = P08DK9_n13724StpBarser[0] ;
         A13726StpClicod = P08DK9_A13726StpClicod[0] ;
         n13726StpClicod = P08DK9_n13726StpClicod[0] ;
         A13727StpCliNom = P08DK9_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK9_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13724StpBarser)==0) )
         {
            AV22Option = A13724StpBarser ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
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
      /* 'LOADSTPBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV43TFStpBarserDsc = AV18SearchTxt ;
      AV44TFStpBarserDsc_Sel = "" ;
      AV76Webhdsto5ds_1_filterfulltext = AV47FilterFullText ;
      AV77Webhdsto5ds_2_tfstp_lin = AV12TFStp_Lin ;
      AV78Webhdsto5ds_3_tfstp_lin_to = AV13TFStp_Lin_To ;
      AV79Webhdsto5ds_4_tfstp_dia = AV14TFStp_Dia ;
      AV80Webhdsto5ds_5_tfstp_mot = AV16TFStp_Mot ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = AV17TFStp_Mot_Sel ;
      AV82Webhdsto5ds_7_tfstphdr = AV10TFStpHdr ;
      AV83Webhdsto5ds_8_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV84Webhdsto5ds_9_tfstpclicod = AV37TFStpClicod ;
      AV85Webhdsto5ds_10_tfstpclicod_to = AV38TFStpClicod_To ;
      AV86Webhdsto5ds_11_tfstpclinom = AV39TFStpCliNom ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV88Webhdsto5ds_13_tfstpbarser = AV41TFStpBarser ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV92Webhdsto5ds_17_tfstpcolor = AV45TFStpColor ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = AV46TFStpColor_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV79Webhdsto5ds_4_tfstp_dia ,
                                           AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV80Webhdsto5ds_5_tfstp_mot ,
                                           AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           AV82Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV76Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV86Webhdsto5ds_11_tfstpclinom ,
                                           AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV88Webhdsto5ds_13_tfstpbarser ,
                                           AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV92Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV86Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV86Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV88Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV88Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV92Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV92Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV80Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV80Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV82Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV82Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P08DK11 */
      pr_default.execute(4, new Object[] {AV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), AV87Webhdsto5ds_12_tfstpclinom_sel, AV86Webhdsto5ds_11_tfstpclinom, lV86Webhdsto5ds_11_tfstpclinom, AV87Webhdsto5ds_12_tfstpclinom_sel, AV87Webhdsto5ds_12_tfstpclinom_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV88Webhdsto5ds_13_tfstpbarser, lV88Webhdsto5ds_13_tfstpbarser, AV89Webhdsto5ds_14_tfstpbarser_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV90Webhdsto5ds_15_tfstpbarserdsc, lV90Webhdsto5ds_15_tfstpbarserdsc, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, AV92Webhdsto5ds_17_tfstpcolor, lV92Webhdsto5ds_17_tfstpcolor, AV93Webhdsto5ds_18_tfstpcolor_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to), AV79Webhdsto5ds_4_tfstp_dia, lV80Webhdsto5ds_5_tfstp_mot, AV81Webhdsto5ds_6_tfstp_mot_sel, lV82Webhdsto5ds_7_tfstphdr, AV83Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P08DK11_A396EmprCod[0] ;
         A10755Stp_Est = P08DK11_A10755Stp_Est[0] ;
         A13723StpHdr = P08DK11_A13723StpHdr[0] ;
         A10752Stp_Mot = P08DK11_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DK11_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P08DK11_A10750Stp_Lin[0] ;
         A13728StpColor = P08DK11_A13728StpColor[0] ;
         n13728StpColor = P08DK11_n13728StpColor[0] ;
         A13725StpBarserD = P08DK11_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK11_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK11_A13724StpBarser[0] ;
         n13724StpBarser = P08DK11_n13724StpBarser[0] ;
         A13727StpCliNom = P08DK11_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK11_n13727StpCliNom[0] ;
         A13726StpClicod = P08DK11_A13726StpClicod[0] ;
         n13726StpClicod = P08DK11_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DK11_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DK11_A10747Stp_r[0] ;
         A10748Stp_p = P08DK11_A10748Stp_p[0] ;
         A13723StpHdr = P08DK11_A13723StpHdr[0] ;
         A13728StpColor = P08DK11_A13728StpColor[0] ;
         n13728StpColor = P08DK11_n13728StpColor[0] ;
         A13725StpBarserD = P08DK11_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK11_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK11_A13724StpBarser[0] ;
         n13724StpBarser = P08DK11_n13724StpBarser[0] ;
         A13726StpClicod = P08DK11_A13726StpClicod[0] ;
         n13726StpClicod = P08DK11_n13726StpClicod[0] ;
         A13727StpCliNom = P08DK11_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK11_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13725StpBarserD)==0) )
         {
            AV22Option = A13725StpBarserD ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
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
      /* 'LOADSTPCOLOROPTIONS' Routine */
      returnInSub = false ;
      AV45TFStpColor = AV18SearchTxt ;
      AV46TFStpColor_Sel = "" ;
      AV76Webhdsto5ds_1_filterfulltext = AV47FilterFullText ;
      AV77Webhdsto5ds_2_tfstp_lin = AV12TFStp_Lin ;
      AV78Webhdsto5ds_3_tfstp_lin_to = AV13TFStp_Lin_To ;
      AV79Webhdsto5ds_4_tfstp_dia = AV14TFStp_Dia ;
      AV80Webhdsto5ds_5_tfstp_mot = AV16TFStp_Mot ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = AV17TFStp_Mot_Sel ;
      AV82Webhdsto5ds_7_tfstphdr = AV10TFStpHdr ;
      AV83Webhdsto5ds_8_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV84Webhdsto5ds_9_tfstpclicod = AV37TFStpClicod ;
      AV85Webhdsto5ds_10_tfstpclicod_to = AV38TFStpClicod_To ;
      AV86Webhdsto5ds_11_tfstpclinom = AV39TFStpCliNom ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = AV40TFStpCliNom_Sel ;
      AV88Webhdsto5ds_13_tfstpbarser = AV41TFStpBarser ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = AV42TFStpBarser_Sel ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = AV43TFStpBarserDsc ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = AV44TFStpBarserDsc_Sel ;
      AV92Webhdsto5ds_17_tfstpcolor = AV45TFStpColor ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = AV46TFStpColor_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV79Webhdsto5ds_4_tfstp_dia ,
                                           AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV80Webhdsto5ds_5_tfstp_mot ,
                                           AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           AV82Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV76Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV86Webhdsto5ds_11_tfstpclinom ,
                                           AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV88Webhdsto5ds_13_tfstpbarser ,
                                           AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV92Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV76Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV86Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV86Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV88Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV88Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV92Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV92Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV80Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV80Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV82Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV82Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P08DK13 */
      pr_default.execute(5, new Object[] {AV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, lV76Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV84Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV85Webhdsto5ds_10_tfstpclicod_to), AV87Webhdsto5ds_12_tfstpclinom_sel, AV86Webhdsto5ds_11_tfstpclinom, lV86Webhdsto5ds_11_tfstpclinom, AV87Webhdsto5ds_12_tfstpclinom_sel, AV87Webhdsto5ds_12_tfstpclinom_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV88Webhdsto5ds_13_tfstpbarser, lV88Webhdsto5ds_13_tfstpbarser, AV89Webhdsto5ds_14_tfstpbarser_sel, AV89Webhdsto5ds_14_tfstpbarser_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV90Webhdsto5ds_15_tfstpbarserdsc, lV90Webhdsto5ds_15_tfstpbarserdsc, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV91Webhdsto5ds_16_tfstpbarserdsc_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, AV92Webhdsto5ds_17_tfstpcolor, lV92Webhdsto5ds_17_tfstpcolor, AV93Webhdsto5ds_18_tfstpcolor_sel, AV93Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV77Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV78Webhdsto5ds_3_tfstp_lin_to), AV79Webhdsto5ds_4_tfstp_dia, lV80Webhdsto5ds_5_tfstp_mot, AV81Webhdsto5ds_6_tfstp_mot_sel, lV82Webhdsto5ds_7_tfstphdr, AV83Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P08DK13_A396EmprCod[0] ;
         A10755Stp_Est = P08DK13_A10755Stp_Est[0] ;
         A13723StpHdr = P08DK13_A13723StpHdr[0] ;
         A10752Stp_Mot = P08DK13_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P08DK13_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P08DK13_A10750Stp_Lin[0] ;
         A13728StpColor = P08DK13_A13728StpColor[0] ;
         n13728StpColor = P08DK13_n13728StpColor[0] ;
         A13725StpBarserD = P08DK13_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK13_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK13_A13724StpBarser[0] ;
         n13724StpBarser = P08DK13_n13724StpBarser[0] ;
         A13727StpCliNom = P08DK13_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK13_n13727StpCliNom[0] ;
         A13726StpClicod = P08DK13_A13726StpClicod[0] ;
         n13726StpClicod = P08DK13_n13726StpClicod[0] ;
         A10746Stp_hdr = P08DK13_A10746Stp_hdr[0] ;
         A10747Stp_r = P08DK13_A10747Stp_r[0] ;
         A10748Stp_p = P08DK13_A10748Stp_p[0] ;
         A13723StpHdr = P08DK13_A13723StpHdr[0] ;
         A13728StpColor = P08DK13_A13728StpColor[0] ;
         n13728StpColor = P08DK13_n13728StpColor[0] ;
         A13725StpBarserD = P08DK13_A13725StpBarserD[0] ;
         n13725StpBarserD = P08DK13_n13725StpBarserD[0] ;
         A13724StpBarser = P08DK13_A13724StpBarser[0] ;
         n13724StpBarser = P08DK13_n13724StpBarser[0] ;
         A13726StpClicod = P08DK13_A13726StpClicod[0] ;
         n13726StpClicod = P08DK13_n13726StpClicod[0] ;
         A13727StpCliNom = P08DK13_A13727StpCliNom[0] ;
         n13727StpCliNom = P08DK13_n13727StpCliNom[0] ;
         if ( ! (GXutil.strcmp("", A13728StpColor)==0) )
         {
            AV22Option = A13728StpColor ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webhdsto5getfilterdata.this.AV24OptionsJson;
      this.aP4[0] = webhdsto5getfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = webhdsto5getfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47FilterFullText = "" ;
      AV14TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV16TFStp_Mot = "" ;
      AV17TFStp_Mot_Sel = "" ;
      AV10TFStpHdr = "" ;
      AV11TFStpHdr_Sel = "" ;
      AV39TFStpCliNom = "" ;
      AV40TFStpCliNom_Sel = "" ;
      AV41TFStpBarser = "" ;
      AV42TFStpBarser_Sel = "" ;
      AV43TFStpBarserDsc = "" ;
      AV44TFStpBarserDsc_Sel = "" ;
      AV45TFStpColor = "" ;
      AV46TFStpColor_Sel = "" ;
      A10752Stp_Mot = "" ;
      AV76Webhdsto5ds_1_filterfulltext = "" ;
      AV79Webhdsto5ds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV80Webhdsto5ds_5_tfstp_mot = "" ;
      AV81Webhdsto5ds_6_tfstp_mot_sel = "" ;
      AV82Webhdsto5ds_7_tfstphdr = "" ;
      AV83Webhdsto5ds_8_tfstphdr_sel = "" ;
      AV86Webhdsto5ds_11_tfstpclinom = "" ;
      AV87Webhdsto5ds_12_tfstpclinom_sel = "" ;
      AV88Webhdsto5ds_13_tfstpbarser = "" ;
      AV89Webhdsto5ds_14_tfstpbarser_sel = "" ;
      AV90Webhdsto5ds_15_tfstpbarserdsc = "" ;
      AV91Webhdsto5ds_16_tfstpbarserdsc_sel = "" ;
      AV92Webhdsto5ds_17_tfstpcolor = "" ;
      AV93Webhdsto5ds_18_tfstpcolor_sel = "" ;
      lV76Webhdsto5ds_1_filterfulltext = "" ;
      lV86Webhdsto5ds_11_tfstpclinom = "" ;
      lV88Webhdsto5ds_13_tfstpbarser = "" ;
      lV90Webhdsto5ds_15_tfstpbarserdsc = "" ;
      lV92Webhdsto5ds_17_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV80Webhdsto5ds_5_tfstp_mot = "" ;
      lV82Webhdsto5ds_7_tfstphdr = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10748Stp_p = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      P08DK3_A129BarCod = new int[1] ;
      P08DK3_A132BarCodReo = new byte[1] ;
      P08DK3_A130BarCodPar = new String[] {""} ;
      P08DK3_A396EmprCod = new String[] {""} ;
      P08DK3_A10755Stp_Est = new byte[1] ;
      P08DK3_A10752Stp_Mot = new String[] {""} ;
      P08DK3_A13723StpHdr = new String[] {""} ;
      P08DK3_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DK3_A10750Stp_Lin = new short[1] ;
      P08DK3_A13728StpColor = new String[] {""} ;
      P08DK3_n13728StpColor = new boolean[] {false} ;
      P08DK3_A13725StpBarserD = new String[] {""} ;
      P08DK3_n13725StpBarserD = new boolean[] {false} ;
      P08DK3_A13724StpBarser = new String[] {""} ;
      P08DK3_n13724StpBarser = new boolean[] {false} ;
      P08DK3_A13727StpCliNom = new String[] {""} ;
      P08DK3_n13727StpCliNom = new boolean[] {false} ;
      P08DK3_A13726StpClicod = new int[1] ;
      P08DK3_n13726StpClicod = new boolean[] {false} ;
      P08DK3_A10746Stp_hdr = new int[1] ;
      P08DK3_A10747Stp_r = new byte[1] ;
      P08DK3_A10748Stp_p = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08DK5_A129BarCod = new int[1] ;
      P08DK5_A132BarCodReo = new byte[1] ;
      P08DK5_A130BarCodPar = new String[] {""} ;
      P08DK5_A396EmprCod = new String[] {""} ;
      P08DK5_A10755Stp_Est = new byte[1] ;
      P08DK5_A13723StpHdr = new String[] {""} ;
      P08DK5_A10752Stp_Mot = new String[] {""} ;
      P08DK5_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DK5_A10750Stp_Lin = new short[1] ;
      P08DK5_A13728StpColor = new String[] {""} ;
      P08DK5_n13728StpColor = new boolean[] {false} ;
      P08DK5_A13725StpBarserD = new String[] {""} ;
      P08DK5_n13725StpBarserD = new boolean[] {false} ;
      P08DK5_A13724StpBarser = new String[] {""} ;
      P08DK5_n13724StpBarser = new boolean[] {false} ;
      P08DK5_A13727StpCliNom = new String[] {""} ;
      P08DK5_n13727StpCliNom = new boolean[] {false} ;
      P08DK5_A13726StpClicod = new int[1] ;
      P08DK5_n13726StpClicod = new boolean[] {false} ;
      P08DK5_A10746Stp_hdr = new int[1] ;
      P08DK5_A10747Stp_r = new byte[1] ;
      P08DK5_A10748Stp_p = new String[] {""} ;
      P08DK7_A129BarCod = new int[1] ;
      P08DK7_A132BarCodReo = new byte[1] ;
      P08DK7_A130BarCodPar = new String[] {""} ;
      P08DK7_A396EmprCod = new String[] {""} ;
      P08DK7_A10755Stp_Est = new byte[1] ;
      P08DK7_A13723StpHdr = new String[] {""} ;
      P08DK7_A10752Stp_Mot = new String[] {""} ;
      P08DK7_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DK7_A10750Stp_Lin = new short[1] ;
      P08DK7_A13728StpColor = new String[] {""} ;
      P08DK7_n13728StpColor = new boolean[] {false} ;
      P08DK7_A13725StpBarserD = new String[] {""} ;
      P08DK7_n13725StpBarserD = new boolean[] {false} ;
      P08DK7_A13724StpBarser = new String[] {""} ;
      P08DK7_n13724StpBarser = new boolean[] {false} ;
      P08DK7_A13727StpCliNom = new String[] {""} ;
      P08DK7_n13727StpCliNom = new boolean[] {false} ;
      P08DK7_A13726StpClicod = new int[1] ;
      P08DK7_n13726StpClicod = new boolean[] {false} ;
      P08DK7_A10746Stp_hdr = new int[1] ;
      P08DK7_A10747Stp_r = new byte[1] ;
      P08DK7_A10748Stp_p = new String[] {""} ;
      P08DK9_A129BarCod = new int[1] ;
      P08DK9_A132BarCodReo = new byte[1] ;
      P08DK9_A130BarCodPar = new String[] {""} ;
      P08DK9_A396EmprCod = new String[] {""} ;
      P08DK9_A10755Stp_Est = new byte[1] ;
      P08DK9_A13723StpHdr = new String[] {""} ;
      P08DK9_A10752Stp_Mot = new String[] {""} ;
      P08DK9_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DK9_A10750Stp_Lin = new short[1] ;
      P08DK9_A13728StpColor = new String[] {""} ;
      P08DK9_n13728StpColor = new boolean[] {false} ;
      P08DK9_A13725StpBarserD = new String[] {""} ;
      P08DK9_n13725StpBarserD = new boolean[] {false} ;
      P08DK9_A13724StpBarser = new String[] {""} ;
      P08DK9_n13724StpBarser = new boolean[] {false} ;
      P08DK9_A13727StpCliNom = new String[] {""} ;
      P08DK9_n13727StpCliNom = new boolean[] {false} ;
      P08DK9_A13726StpClicod = new int[1] ;
      P08DK9_n13726StpClicod = new boolean[] {false} ;
      P08DK9_A10746Stp_hdr = new int[1] ;
      P08DK9_A10747Stp_r = new byte[1] ;
      P08DK9_A10748Stp_p = new String[] {""} ;
      P08DK11_A129BarCod = new int[1] ;
      P08DK11_A132BarCodReo = new byte[1] ;
      P08DK11_A130BarCodPar = new String[] {""} ;
      P08DK11_A396EmprCod = new String[] {""} ;
      P08DK11_A10755Stp_Est = new byte[1] ;
      P08DK11_A13723StpHdr = new String[] {""} ;
      P08DK11_A10752Stp_Mot = new String[] {""} ;
      P08DK11_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DK11_A10750Stp_Lin = new short[1] ;
      P08DK11_A13728StpColor = new String[] {""} ;
      P08DK11_n13728StpColor = new boolean[] {false} ;
      P08DK11_A13725StpBarserD = new String[] {""} ;
      P08DK11_n13725StpBarserD = new boolean[] {false} ;
      P08DK11_A13724StpBarser = new String[] {""} ;
      P08DK11_n13724StpBarser = new boolean[] {false} ;
      P08DK11_A13727StpCliNom = new String[] {""} ;
      P08DK11_n13727StpCliNom = new boolean[] {false} ;
      P08DK11_A13726StpClicod = new int[1] ;
      P08DK11_n13726StpClicod = new boolean[] {false} ;
      P08DK11_A10746Stp_hdr = new int[1] ;
      P08DK11_A10747Stp_r = new byte[1] ;
      P08DK11_A10748Stp_p = new String[] {""} ;
      P08DK13_A129BarCod = new int[1] ;
      P08DK13_A132BarCodReo = new byte[1] ;
      P08DK13_A130BarCodPar = new String[] {""} ;
      P08DK13_A396EmprCod = new String[] {""} ;
      P08DK13_A10755Stp_Est = new byte[1] ;
      P08DK13_A13723StpHdr = new String[] {""} ;
      P08DK13_A10752Stp_Mot = new String[] {""} ;
      P08DK13_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08DK13_A10750Stp_Lin = new short[1] ;
      P08DK13_A13728StpColor = new String[] {""} ;
      P08DK13_n13728StpColor = new boolean[] {false} ;
      P08DK13_A13725StpBarserD = new String[] {""} ;
      P08DK13_n13725StpBarserD = new boolean[] {false} ;
      P08DK13_A13724StpBarser = new String[] {""} ;
      P08DK13_n13724StpBarser = new boolean[] {false} ;
      P08DK13_A13727StpCliNom = new String[] {""} ;
      P08DK13_n13727StpCliNom = new boolean[] {false} ;
      P08DK13_A13726StpClicod = new int[1] ;
      P08DK13_n13726StpClicod = new boolean[] {false} ;
      P08DK13_A10746Stp_hdr = new int[1] ;
      P08DK13_A10747Stp_r = new byte[1] ;
      P08DK13_A10748Stp_p = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webhdsto5getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08DK3_A129BarCod, P08DK3_A132BarCodReo, P08DK3_A130BarCodPar, P08DK3_A396EmprCod, P08DK3_A10755Stp_Est, P08DK3_A10752Stp_Mot, P08DK3_A13723StpHdr, P08DK3_A10751Stp_Dia, P08DK3_A10750Stp_Lin, P08DK3_A13728StpColor,
            P08DK3_n13728StpColor, P08DK3_A13725StpBarserD, P08DK3_n13725StpBarserD, P08DK3_A13724StpBarser, P08DK3_n13724StpBarser, P08DK3_A13727StpCliNom, P08DK3_n13727StpCliNom, P08DK3_A13726StpClicod, P08DK3_n13726StpClicod, P08DK3_A10746Stp_hdr,
            P08DK3_A10747Stp_r, P08DK3_A10748Stp_p
            }
            , new Object[] {
            P08DK5_A129BarCod, P08DK5_A132BarCodReo, P08DK5_A130BarCodPar, P08DK5_A396EmprCod, P08DK5_A10755Stp_Est, P08DK5_A13723StpHdr, P08DK5_A10752Stp_Mot, P08DK5_A10751Stp_Dia, P08DK5_A10750Stp_Lin, P08DK5_A13728StpColor,
            P08DK5_n13728StpColor, P08DK5_A13725StpBarserD, P08DK5_n13725StpBarserD, P08DK5_A13724StpBarser, P08DK5_n13724StpBarser, P08DK5_A13727StpCliNom, P08DK5_n13727StpCliNom, P08DK5_A13726StpClicod, P08DK5_n13726StpClicod, P08DK5_A10746Stp_hdr,
            P08DK5_A10747Stp_r, P08DK5_A10748Stp_p
            }
            , new Object[] {
            P08DK7_A129BarCod, P08DK7_A132BarCodReo, P08DK7_A130BarCodPar, P08DK7_A396EmprCod, P08DK7_A10755Stp_Est, P08DK7_A13723StpHdr, P08DK7_A10752Stp_Mot, P08DK7_A10751Stp_Dia, P08DK7_A10750Stp_Lin, P08DK7_A13728StpColor,
            P08DK7_n13728StpColor, P08DK7_A13725StpBarserD, P08DK7_n13725StpBarserD, P08DK7_A13724StpBarser, P08DK7_n13724StpBarser, P08DK7_A13727StpCliNom, P08DK7_n13727StpCliNom, P08DK7_A13726StpClicod, P08DK7_n13726StpClicod, P08DK7_A10746Stp_hdr,
            P08DK7_A10747Stp_r, P08DK7_A10748Stp_p
            }
            , new Object[] {
            P08DK9_A129BarCod, P08DK9_A132BarCodReo, P08DK9_A130BarCodPar, P08DK9_A396EmprCod, P08DK9_A10755Stp_Est, P08DK9_A13723StpHdr, P08DK9_A10752Stp_Mot, P08DK9_A10751Stp_Dia, P08DK9_A10750Stp_Lin, P08DK9_A13728StpColor,
            P08DK9_n13728StpColor, P08DK9_A13725StpBarserD, P08DK9_n13725StpBarserD, P08DK9_A13724StpBarser, P08DK9_n13724StpBarser, P08DK9_A13727StpCliNom, P08DK9_n13727StpCliNom, P08DK9_A13726StpClicod, P08DK9_n13726StpClicod, P08DK9_A10746Stp_hdr,
            P08DK9_A10747Stp_r, P08DK9_A10748Stp_p
            }
            , new Object[] {
            P08DK11_A129BarCod, P08DK11_A132BarCodReo, P08DK11_A130BarCodPar, P08DK11_A396EmprCod, P08DK11_A10755Stp_Est, P08DK11_A13723StpHdr, P08DK11_A10752Stp_Mot, P08DK11_A10751Stp_Dia, P08DK11_A10750Stp_Lin, P08DK11_A13728StpColor,
            P08DK11_n13728StpColor, P08DK11_A13725StpBarserD, P08DK11_n13725StpBarserD, P08DK11_A13724StpBarser, P08DK11_n13724StpBarser, P08DK11_A13727StpCliNom, P08DK11_n13727StpCliNom, P08DK11_A13726StpClicod, P08DK11_n13726StpClicod, P08DK11_A10746Stp_hdr,
            P08DK11_A10747Stp_r, P08DK11_A10748Stp_p
            }
            , new Object[] {
            P08DK13_A129BarCod, P08DK13_A132BarCodReo, P08DK13_A130BarCodPar, P08DK13_A396EmprCod, P08DK13_A10755Stp_Est, P08DK13_A13723StpHdr, P08DK13_A10752Stp_Mot, P08DK13_A10751Stp_Dia, P08DK13_A10750Stp_Lin, P08DK13_A13728StpColor,
            P08DK13_n13728StpColor, P08DK13_A13725StpBarserD, P08DK13_n13725StpBarserD, P08DK13_A13724StpBarser, P08DK13_n13724StpBarser, P08DK13_A13727StpCliNom, P08DK13_n13727StpCliNom, P08DK13_A13726StpClicod, P08DK13_n13726StpClicod, P08DK13_A10746Stp_hdr,
            P08DK13_A10747Stp_r, P08DK13_A10748Stp_p
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short AV12TFStp_Lin ;
   private short AV13TFStp_Lin_To ;
   private short AV77Webhdsto5ds_2_tfstp_lin ;
   private short AV78Webhdsto5ds_3_tfstp_lin_to ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private int AV37TFStpClicod ;
   private int AV38TFStpClicod_To ;
   private int AV84Webhdsto5ds_9_tfstpclicod ;
   private int AV85Webhdsto5ds_10_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int A13726StpClicod ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private String AV10TFStpHdr ;
   private String AV11TFStpHdr_Sel ;
   private String AV39TFStpCliNom ;
   private String AV40TFStpCliNom_Sel ;
   private String AV41TFStpBarser ;
   private String AV42TFStpBarser_Sel ;
   private String AV43TFStpBarserDsc ;
   private String AV44TFStpBarserDsc_Sel ;
   private String AV45TFStpColor ;
   private String AV46TFStpColor_Sel ;
   private String AV82Webhdsto5ds_7_tfstphdr ;
   private String AV83Webhdsto5ds_8_tfstphdr_sel ;
   private String AV86Webhdsto5ds_11_tfstpclinom ;
   private String AV87Webhdsto5ds_12_tfstpclinom_sel ;
   private String AV88Webhdsto5ds_13_tfstpbarser ;
   private String AV89Webhdsto5ds_14_tfstpbarser_sel ;
   private String AV90Webhdsto5ds_15_tfstpbarserdsc ;
   private String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ;
   private String AV92Webhdsto5ds_17_tfstpcolor ;
   private String AV93Webhdsto5ds_18_tfstpcolor_sel ;
   private String lV86Webhdsto5ds_11_tfstpclinom ;
   private String lV88Webhdsto5ds_13_tfstpbarser ;
   private String lV90Webhdsto5ds_15_tfstpbarserdsc ;
   private String lV92Webhdsto5ds_17_tfstpcolor ;
   private String scmdbuf ;
   private String lV82Webhdsto5ds_7_tfstphdr ;
   private String A10748Stp_p ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String A396EmprCod ;
   private java.util.Date AV14TFStp_Dia ;
   private java.util.Date AV79Webhdsto5ds_4_tfstp_dia ;
   private java.util.Date A10751Stp_Dia ;
   private boolean returnInSub ;
   private boolean brk8DK2 ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV47FilterFullText ;
   private String AV16TFStp_Mot ;
   private String AV17TFStp_Mot_Sel ;
   private String A10752Stp_Mot ;
   private String AV76Webhdsto5ds_1_filterfulltext ;
   private String AV80Webhdsto5ds_5_tfstp_mot ;
   private String AV81Webhdsto5ds_6_tfstp_mot_sel ;
   private String lV76Webhdsto5ds_1_filterfulltext ;
   private String lV80Webhdsto5ds_5_tfstp_mot ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08DK3_A129BarCod ;
   private byte[] P08DK3_A132BarCodReo ;
   private String[] P08DK3_A130BarCodPar ;
   private String[] P08DK3_A396EmprCod ;
   private byte[] P08DK3_A10755Stp_Est ;
   private String[] P08DK3_A10752Stp_Mot ;
   private String[] P08DK3_A13723StpHdr ;
   private java.util.Date[] P08DK3_A10751Stp_Dia ;
   private short[] P08DK3_A10750Stp_Lin ;
   private String[] P08DK3_A13728StpColor ;
   private boolean[] P08DK3_n13728StpColor ;
   private String[] P08DK3_A13725StpBarserD ;
   private boolean[] P08DK3_n13725StpBarserD ;
   private String[] P08DK3_A13724StpBarser ;
   private boolean[] P08DK3_n13724StpBarser ;
   private String[] P08DK3_A13727StpCliNom ;
   private boolean[] P08DK3_n13727StpCliNom ;
   private int[] P08DK3_A13726StpClicod ;
   private boolean[] P08DK3_n13726StpClicod ;
   private int[] P08DK3_A10746Stp_hdr ;
   private byte[] P08DK3_A10747Stp_r ;
   private String[] P08DK3_A10748Stp_p ;
   private int[] P08DK5_A129BarCod ;
   private byte[] P08DK5_A132BarCodReo ;
   private String[] P08DK5_A130BarCodPar ;
   private String[] P08DK5_A396EmprCod ;
   private byte[] P08DK5_A10755Stp_Est ;
   private String[] P08DK5_A13723StpHdr ;
   private String[] P08DK5_A10752Stp_Mot ;
   private java.util.Date[] P08DK5_A10751Stp_Dia ;
   private short[] P08DK5_A10750Stp_Lin ;
   private String[] P08DK5_A13728StpColor ;
   private boolean[] P08DK5_n13728StpColor ;
   private String[] P08DK5_A13725StpBarserD ;
   private boolean[] P08DK5_n13725StpBarserD ;
   private String[] P08DK5_A13724StpBarser ;
   private boolean[] P08DK5_n13724StpBarser ;
   private String[] P08DK5_A13727StpCliNom ;
   private boolean[] P08DK5_n13727StpCliNom ;
   private int[] P08DK5_A13726StpClicod ;
   private boolean[] P08DK5_n13726StpClicod ;
   private int[] P08DK5_A10746Stp_hdr ;
   private byte[] P08DK5_A10747Stp_r ;
   private String[] P08DK5_A10748Stp_p ;
   private int[] P08DK7_A129BarCod ;
   private byte[] P08DK7_A132BarCodReo ;
   private String[] P08DK7_A130BarCodPar ;
   private String[] P08DK7_A396EmprCod ;
   private byte[] P08DK7_A10755Stp_Est ;
   private String[] P08DK7_A13723StpHdr ;
   private String[] P08DK7_A10752Stp_Mot ;
   private java.util.Date[] P08DK7_A10751Stp_Dia ;
   private short[] P08DK7_A10750Stp_Lin ;
   private String[] P08DK7_A13728StpColor ;
   private boolean[] P08DK7_n13728StpColor ;
   private String[] P08DK7_A13725StpBarserD ;
   private boolean[] P08DK7_n13725StpBarserD ;
   private String[] P08DK7_A13724StpBarser ;
   private boolean[] P08DK7_n13724StpBarser ;
   private String[] P08DK7_A13727StpCliNom ;
   private boolean[] P08DK7_n13727StpCliNom ;
   private int[] P08DK7_A13726StpClicod ;
   private boolean[] P08DK7_n13726StpClicod ;
   private int[] P08DK7_A10746Stp_hdr ;
   private byte[] P08DK7_A10747Stp_r ;
   private String[] P08DK7_A10748Stp_p ;
   private int[] P08DK9_A129BarCod ;
   private byte[] P08DK9_A132BarCodReo ;
   private String[] P08DK9_A130BarCodPar ;
   private String[] P08DK9_A396EmprCod ;
   private byte[] P08DK9_A10755Stp_Est ;
   private String[] P08DK9_A13723StpHdr ;
   private String[] P08DK9_A10752Stp_Mot ;
   private java.util.Date[] P08DK9_A10751Stp_Dia ;
   private short[] P08DK9_A10750Stp_Lin ;
   private String[] P08DK9_A13728StpColor ;
   private boolean[] P08DK9_n13728StpColor ;
   private String[] P08DK9_A13725StpBarserD ;
   private boolean[] P08DK9_n13725StpBarserD ;
   private String[] P08DK9_A13724StpBarser ;
   private boolean[] P08DK9_n13724StpBarser ;
   private String[] P08DK9_A13727StpCliNom ;
   private boolean[] P08DK9_n13727StpCliNom ;
   private int[] P08DK9_A13726StpClicod ;
   private boolean[] P08DK9_n13726StpClicod ;
   private int[] P08DK9_A10746Stp_hdr ;
   private byte[] P08DK9_A10747Stp_r ;
   private String[] P08DK9_A10748Stp_p ;
   private int[] P08DK11_A129BarCod ;
   private byte[] P08DK11_A132BarCodReo ;
   private String[] P08DK11_A130BarCodPar ;
   private String[] P08DK11_A396EmprCod ;
   private byte[] P08DK11_A10755Stp_Est ;
   private String[] P08DK11_A13723StpHdr ;
   private String[] P08DK11_A10752Stp_Mot ;
   private java.util.Date[] P08DK11_A10751Stp_Dia ;
   private short[] P08DK11_A10750Stp_Lin ;
   private String[] P08DK11_A13728StpColor ;
   private boolean[] P08DK11_n13728StpColor ;
   private String[] P08DK11_A13725StpBarserD ;
   private boolean[] P08DK11_n13725StpBarserD ;
   private String[] P08DK11_A13724StpBarser ;
   private boolean[] P08DK11_n13724StpBarser ;
   private String[] P08DK11_A13727StpCliNom ;
   private boolean[] P08DK11_n13727StpCliNom ;
   private int[] P08DK11_A13726StpClicod ;
   private boolean[] P08DK11_n13726StpClicod ;
   private int[] P08DK11_A10746Stp_hdr ;
   private byte[] P08DK11_A10747Stp_r ;
   private String[] P08DK11_A10748Stp_p ;
   private int[] P08DK13_A129BarCod ;
   private byte[] P08DK13_A132BarCodReo ;
   private String[] P08DK13_A130BarCodPar ;
   private String[] P08DK13_A396EmprCod ;
   private byte[] P08DK13_A10755Stp_Est ;
   private String[] P08DK13_A13723StpHdr ;
   private String[] P08DK13_A10752Stp_Mot ;
   private java.util.Date[] P08DK13_A10751Stp_Dia ;
   private short[] P08DK13_A10750Stp_Lin ;
   private String[] P08DK13_A13728StpColor ;
   private boolean[] P08DK13_n13728StpColor ;
   private String[] P08DK13_A13725StpBarserD ;
   private boolean[] P08DK13_n13725StpBarserD ;
   private String[] P08DK13_A13724StpBarser ;
   private boolean[] P08DK13_n13724StpBarser ;
   private String[] P08DK13_A13727StpCliNom ;
   private boolean[] P08DK13_n13727StpCliNom ;
   private int[] P08DK13_A13726StpClicod ;
   private boolean[] P08DK13_n13726StpClicod ;
   private int[] P08DK13_A10746Stp_hdr ;
   private byte[] P08DK13_A10747Stp_r ;
   private String[] P08DK13_A10748Stp_p ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class webhdsto5getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Webhdsto5ds_2_tfstp_lin ,
                                          short AV78Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV79Webhdsto5ds_4_tfstp_dia ,
                                          String AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV80Webhdsto5ds_5_tfstp_mot ,
                                          String AV83Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV82Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV76Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV84Webhdsto5ds_9_tfstpclicod ,
                                          int AV85Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV86Webhdsto5ds_11_tfstpclinom ,
                                          String AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV88Webhdsto5ds_13_tfstpbarser ,
                                          String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV92Webhdsto5ds_17_tfstpcolor ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, T1.Stp_Mot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer, ' ')" ;
      scmdbuf += " AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr, T5.BarCodReo," ;
      scmdbuf += " T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP T7 ON T7.EmprCod" ;
      scmdbuf += " = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr = T1.Stp_hdr AND" ;
      scmdbuf += " T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV77Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Stp_Mot" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08DK5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Webhdsto5ds_2_tfstp_lin ,
                                          short AV78Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV79Webhdsto5ds_4_tfstp_dia ,
                                          String AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV80Webhdsto5ds_5_tfstp_mot ,
                                          String AV83Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV82Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV76Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV84Webhdsto5ds_9_tfstpclicod ,
                                          int AV85Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV86Webhdsto5ds_11_tfstpclinom ,
                                          String AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV88Webhdsto5ds_13_tfstpbarser ,
                                          String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV92Webhdsto5ds_17_tfstpcolor ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[40];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV77Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08DK7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Webhdsto5ds_2_tfstp_lin ,
                                          short AV78Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV79Webhdsto5ds_4_tfstp_dia ,
                                          String AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV80Webhdsto5ds_5_tfstp_mot ,
                                          String AV83Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV82Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV76Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV84Webhdsto5ds_9_tfstpclicod ,
                                          int AV85Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV86Webhdsto5ds_11_tfstpclinom ,
                                          String AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV88Webhdsto5ds_13_tfstpbarser ,
                                          String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV92Webhdsto5ds_17_tfstpcolor ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV77Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08DK9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Webhdsto5ds_2_tfstp_lin ,
                                          short AV78Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV79Webhdsto5ds_4_tfstp_dia ,
                                          String AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV80Webhdsto5ds_5_tfstp_mot ,
                                          String AV83Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV82Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV76Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV84Webhdsto5ds_9_tfstpclicod ,
                                          int AV85Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV86Webhdsto5ds_11_tfstpclinom ,
                                          String AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV88Webhdsto5ds_13_tfstpbarser ,
                                          String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV92Webhdsto5ds_17_tfstpcolor ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV77Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08DK11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           short AV77Webhdsto5ds_2_tfstp_lin ,
                                           short AV78Webhdsto5ds_3_tfstp_lin_to ,
                                           java.util.Date AV79Webhdsto5ds_4_tfstp_dia ,
                                           String AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           String AV80Webhdsto5ds_5_tfstp_mot ,
                                           String AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           String AV82Webhdsto5ds_7_tfstphdr ,
                                           short A10750Stp_Lin ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           String AV76Webhdsto5ds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV84Webhdsto5ds_9_tfstpclicod ,
                                           int AV85Webhdsto5ds_10_tfstpclicod_to ,
                                           String AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           String AV86Webhdsto5ds_11_tfstpclinom ,
                                           String AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           String AV88Webhdsto5ds_13_tfstpbarser ,
                                           String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           String AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           String AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           String AV92Webhdsto5ds_17_tfstpcolor ,
                                           byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[40];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV77Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08DK13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           short AV77Webhdsto5ds_2_tfstp_lin ,
                                           short AV78Webhdsto5ds_3_tfstp_lin_to ,
                                           java.util.Date AV79Webhdsto5ds_4_tfstp_dia ,
                                           String AV81Webhdsto5ds_6_tfstp_mot_sel ,
                                           String AV80Webhdsto5ds_5_tfstp_mot ,
                                           String AV83Webhdsto5ds_8_tfstphdr_sel ,
                                           String AV82Webhdsto5ds_7_tfstphdr ,
                                           short A10750Stp_Lin ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           String AV76Webhdsto5ds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV84Webhdsto5ds_9_tfstpclicod ,
                                           int AV85Webhdsto5ds_10_tfstpclicod_to ,
                                           String AV87Webhdsto5ds_12_tfstpclinom_sel ,
                                           String AV86Webhdsto5ds_11_tfstpclinom ,
                                           String AV89Webhdsto5ds_14_tfstpbarser_sel ,
                                           String AV88Webhdsto5ds_13_tfstpbarser ,
                                           String AV91Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           String AV90Webhdsto5ds_15_tfstpbarserdsc ,
                                           String AV93Webhdsto5ds_18_tfstpcolor_sel ,
                                           String AV92Webhdsto5ds_17_tfstpcolor ,
                                           byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[40];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV77Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV80Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P08DK3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() );
            case 1 :
                  return conditional_P08DK5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() );
            case 2 :
                  return conditional_P08DK7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() );
            case 3 :
                  return conditional_P08DK9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() );
            case 4 :
                  return conditional_P08DK11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() );
            case 5 :
                  return conditional_P08DK13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DK5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DK7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DK9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DK11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DK13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
      }
   }

}

