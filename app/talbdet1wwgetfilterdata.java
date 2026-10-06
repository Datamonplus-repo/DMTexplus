package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbdet1wwgetfilterdata extends GXProcedure
{
   public talbdet1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet1wwgetfilterdata.class ), "" );
   }

   public talbdet1wwgetfilterdata( int remoteHandle ,
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
      talbdet1wwgetfilterdata.this.aP5 = new String[] {""};
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
      talbdet1wwgetfilterdata.this.AV58DDOName = aP0;
      talbdet1wwgetfilterdata.this.AV56SearchTxt = aP1;
      talbdet1wwgetfilterdata.this.AV57SearchTxtTo = aP2;
      talbdet1wwgetfilterdata.this.aP3 = aP3;
      talbdet1wwgetfilterdata.this.aP4 = aP4;
      talbdet1wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
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
         S141 ();
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
         S151 ();
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
         S161 ();
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
         S171 ();
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
         S181 ();
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
         S191 ();
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
      if ( GXutil.strcmp(AV69Session.getValue("TALBDET1WWGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDET1WWGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("TALBDET1WWGridState"), null, null);
      }
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV99FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV16TFAlbRFen = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV18TFAlbRHEn = localUtil.ctot( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
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
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV30TFProceNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV31TFProceNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV34TFTrnNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV35TFTrnNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         AV102GXV1 = (int)(AV102GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCliNom = AV56SearchTxt ;
      AV23TFCliNom_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08682 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8682 = false ;
         A396EmprCod = P08682_A396EmprCod[0] ;
         A252CliCod = P08682_A252CliCod[0] ;
         A840TrnCod = P08682_A840TrnCod[0] ;
         n840TrnCod = P08682_n840TrnCod[0] ;
         A970ProceCod = P08682_A970ProceCod[0] ;
         n970ProceCod = P08682_n970ProceCod[0] ;
         A1211TipEntCod = P08682_A1211TipEntCod[0] ;
         n1211TipEntCod = P08682_n1211TipEntCod[0] ;
         A279CliNom = P08682_A279CliNom[0] ;
         A50AlbRLoc = P08682_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08682_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08682_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08682_A1291AlbRDes[0] ;
         A1212TipEntNom = P08682_A1212TipEntNom[0] ;
         n1212TipEntNom = P08682_n1212TipEntNom[0] ;
         A841TrnNom = P08682_A841TrnNom[0] ;
         n841TrnNom = P08682_n841TrnNom[0] ;
         A971ProceNom = P08682_A971ProceNom[0] ;
         n971ProceNom = P08682_n971ProceNom[0] ;
         A3613AlbRefDsc = P08682_A3613AlbRefDsc[0] ;
         A45AlbRef = P08682_A45AlbRef[0] ;
         A4606AlbRHEn = P08682_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08682_n4606AlbRHEn[0] ;
         A49AlbRFen = P08682_A49AlbRFen[0] ;
         A44AlbRecCod = P08682_A44AlbRecCod[0] ;
         A55AlbRReo = P08682_A55AlbRReo[0] ;
         A56AlbRUni = P08682_A56AlbRUni[0] ;
         A279CliNom = P08682_A279CliNom[0] ;
         A841TrnNom = P08682_A841TrnNom[0] ;
         n841TrnNom = P08682_n841TrnNom[0] ;
         A971ProceNom = P08682_A971ProceNom[0] ;
         n971ProceNom = P08682_n971ProceNom[0] ;
         A1212TipEntNom = P08682_A1212TipEntNom[0] ;
         n1212TipEntNom = P08682_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08682_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk8682 = false ;
               A396EmprCod = P08682_A396EmprCod[0] ;
               A252CliCod = P08682_A252CliCod[0] ;
               A44AlbRecCod = P08682_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8682 = true ;
               pr_default.readNext(0);
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
         if ( ! brk8682 )
         {
            brk8682 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbRef = AV56SearchTxt ;
      AV25TFAlbRef_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08683 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8684 = false ;
         A396EmprCod = P08683_A396EmprCod[0] ;
         A252CliCod = P08683_A252CliCod[0] ;
         A840TrnCod = P08683_A840TrnCod[0] ;
         n840TrnCod = P08683_n840TrnCod[0] ;
         A970ProceCod = P08683_A970ProceCod[0] ;
         n970ProceCod = P08683_n970ProceCod[0] ;
         A1211TipEntCod = P08683_A1211TipEntCod[0] ;
         n1211TipEntCod = P08683_n1211TipEntCod[0] ;
         A45AlbRef = P08683_A45AlbRef[0] ;
         A50AlbRLoc = P08683_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08683_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08683_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08683_A1291AlbRDes[0] ;
         A1212TipEntNom = P08683_A1212TipEntNom[0] ;
         n1212TipEntNom = P08683_n1212TipEntNom[0] ;
         A841TrnNom = P08683_A841TrnNom[0] ;
         n841TrnNom = P08683_n841TrnNom[0] ;
         A971ProceNom = P08683_A971ProceNom[0] ;
         n971ProceNom = P08683_n971ProceNom[0] ;
         A3613AlbRefDsc = P08683_A3613AlbRefDsc[0] ;
         A279CliNom = P08683_A279CliNom[0] ;
         A4606AlbRHEn = P08683_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08683_n4606AlbRHEn[0] ;
         A49AlbRFen = P08683_A49AlbRFen[0] ;
         A44AlbRecCod = P08683_A44AlbRecCod[0] ;
         A55AlbRReo = P08683_A55AlbRReo[0] ;
         A56AlbRUni = P08683_A56AlbRUni[0] ;
         A279CliNom = P08683_A279CliNom[0] ;
         A841TrnNom = P08683_A841TrnNom[0] ;
         n841TrnNom = P08683_n841TrnNom[0] ;
         A971ProceNom = P08683_A971ProceNom[0] ;
         n971ProceNom = P08683_n971ProceNom[0] ;
         A1212TipEntNom = P08683_A1212TipEntNom[0] ;
         n1212TipEntNom = P08683_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08683_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk8684 = false ;
               A396EmprCod = P08683_A396EmprCod[0] ;
               A44AlbRecCod = P08683_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8684 = true ;
               pr_default.readNext(1);
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
         if ( ! brk8684 )
         {
            brk8684 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbRefDsc = AV56SearchTxt ;
      AV27TFAlbRefDsc_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08684 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8686 = false ;
         A396EmprCod = P08684_A396EmprCod[0] ;
         A252CliCod = P08684_A252CliCod[0] ;
         A840TrnCod = P08684_A840TrnCod[0] ;
         n840TrnCod = P08684_n840TrnCod[0] ;
         A970ProceCod = P08684_A970ProceCod[0] ;
         n970ProceCod = P08684_n970ProceCod[0] ;
         A1211TipEntCod = P08684_A1211TipEntCod[0] ;
         n1211TipEntCod = P08684_n1211TipEntCod[0] ;
         A3613AlbRefDsc = P08684_A3613AlbRefDsc[0] ;
         A50AlbRLoc = P08684_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08684_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08684_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08684_A1291AlbRDes[0] ;
         A1212TipEntNom = P08684_A1212TipEntNom[0] ;
         n1212TipEntNom = P08684_n1212TipEntNom[0] ;
         A841TrnNom = P08684_A841TrnNom[0] ;
         n841TrnNom = P08684_n841TrnNom[0] ;
         A971ProceNom = P08684_A971ProceNom[0] ;
         n971ProceNom = P08684_n971ProceNom[0] ;
         A45AlbRef = P08684_A45AlbRef[0] ;
         A279CliNom = P08684_A279CliNom[0] ;
         A4606AlbRHEn = P08684_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08684_n4606AlbRHEn[0] ;
         A49AlbRFen = P08684_A49AlbRFen[0] ;
         A44AlbRecCod = P08684_A44AlbRecCod[0] ;
         A55AlbRReo = P08684_A55AlbRReo[0] ;
         A56AlbRUni = P08684_A56AlbRUni[0] ;
         A279CliNom = P08684_A279CliNom[0] ;
         A841TrnNom = P08684_A841TrnNom[0] ;
         n841TrnNom = P08684_n841TrnNom[0] ;
         A971ProceNom = P08684_A971ProceNom[0] ;
         n971ProceNom = P08684_n971ProceNom[0] ;
         A1212TipEntNom = P08684_A1212TipEntNom[0] ;
         n1212TipEntNom = P08684_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08684_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
            {
               brk8686 = false ;
               A396EmprCod = P08684_A396EmprCod[0] ;
               A44AlbRecCod = P08684_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8686 = true ;
               pr_default.readNext(2);
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
         if ( ! brk8686 )
         {
            brk8686 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROCENOMOPTIONS' Routine */
      returnInSub = false ;
      AV30TFProceNom = AV56SearchTxt ;
      AV31TFProceNom_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08685 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8688 = false ;
         A252CliCod = P08685_A252CliCod[0] ;
         A840TrnCod = P08685_A840TrnCod[0] ;
         n840TrnCod = P08685_n840TrnCod[0] ;
         A1211TipEntCod = P08685_A1211TipEntCod[0] ;
         n1211TipEntCod = P08685_n1211TipEntCod[0] ;
         A970ProceCod = P08685_A970ProceCod[0] ;
         n970ProceCod = P08685_n970ProceCod[0] ;
         A396EmprCod = P08685_A396EmprCod[0] ;
         A50AlbRLoc = P08685_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08685_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08685_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08685_A1291AlbRDes[0] ;
         A1212TipEntNom = P08685_A1212TipEntNom[0] ;
         n1212TipEntNom = P08685_n1212TipEntNom[0] ;
         A841TrnNom = P08685_A841TrnNom[0] ;
         n841TrnNom = P08685_n841TrnNom[0] ;
         A971ProceNom = P08685_A971ProceNom[0] ;
         n971ProceNom = P08685_n971ProceNom[0] ;
         A3613AlbRefDsc = P08685_A3613AlbRefDsc[0] ;
         A45AlbRef = P08685_A45AlbRef[0] ;
         A279CliNom = P08685_A279CliNom[0] ;
         A4606AlbRHEn = P08685_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08685_n4606AlbRHEn[0] ;
         A49AlbRFen = P08685_A49AlbRFen[0] ;
         A44AlbRecCod = P08685_A44AlbRecCod[0] ;
         A55AlbRReo = P08685_A55AlbRReo[0] ;
         A56AlbRUni = P08685_A56AlbRUni[0] ;
         A279CliNom = P08685_A279CliNom[0] ;
         A841TrnNom = P08685_A841TrnNom[0] ;
         n841TrnNom = P08685_n841TrnNom[0] ;
         A971ProceNom = P08685_A971ProceNom[0] ;
         n971ProceNom = P08685_n971ProceNom[0] ;
         A1212TipEntNom = P08685_A1212TipEntNom[0] ;
         n1212TipEntNom = P08685_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08685_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08685_A970ProceCod[0] == A970ProceCod ) )
            {
               brk8688 = false ;
               A44AlbRecCod = P08685_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk8688 = true ;
               pr_default.readNext(3);
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
         if ( ! brk8688 )
         {
            brk8688 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV34TFTrnNom = AV56SearchTxt ;
      AV35TFTrnNom_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08686 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk86810 = false ;
         A252CliCod = P08686_A252CliCod[0] ;
         A970ProceCod = P08686_A970ProceCod[0] ;
         n970ProceCod = P08686_n970ProceCod[0] ;
         A1211TipEntCod = P08686_A1211TipEntCod[0] ;
         n1211TipEntCod = P08686_n1211TipEntCod[0] ;
         A840TrnCod = P08686_A840TrnCod[0] ;
         n840TrnCod = P08686_n840TrnCod[0] ;
         A396EmprCod = P08686_A396EmprCod[0] ;
         A50AlbRLoc = P08686_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08686_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08686_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08686_A1291AlbRDes[0] ;
         A1212TipEntNom = P08686_A1212TipEntNom[0] ;
         n1212TipEntNom = P08686_n1212TipEntNom[0] ;
         A841TrnNom = P08686_A841TrnNom[0] ;
         n841TrnNom = P08686_n841TrnNom[0] ;
         A971ProceNom = P08686_A971ProceNom[0] ;
         n971ProceNom = P08686_n971ProceNom[0] ;
         A3613AlbRefDsc = P08686_A3613AlbRefDsc[0] ;
         A45AlbRef = P08686_A45AlbRef[0] ;
         A279CliNom = P08686_A279CliNom[0] ;
         A4606AlbRHEn = P08686_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08686_n4606AlbRHEn[0] ;
         A49AlbRFen = P08686_A49AlbRFen[0] ;
         A44AlbRecCod = P08686_A44AlbRecCod[0] ;
         A55AlbRReo = P08686_A55AlbRReo[0] ;
         A56AlbRUni = P08686_A56AlbRUni[0] ;
         A279CliNom = P08686_A279CliNom[0] ;
         A841TrnNom = P08686_A841TrnNom[0] ;
         n841TrnNom = P08686_n841TrnNom[0] ;
         A971ProceNom = P08686_A971ProceNom[0] ;
         n971ProceNom = P08686_n971ProceNom[0] ;
         A1212TipEntNom = P08686_A1212TipEntNom[0] ;
         n1212TipEntNom = P08686_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08686_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08686_A840TrnCod[0] == A840TrnCod ) )
            {
               brk86810 = false ;
               A44AlbRecCod = P08686_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86810 = true ;
               pr_default.readNext(4);
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
         if ( ! brk86810 )
         {
            brk86810 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADTIPENTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV38TFTipEntNom = AV56SearchTxt ;
      AV39TFTipEntNom_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08687 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk86812 = false ;
         A252CliCod = P08687_A252CliCod[0] ;
         A840TrnCod = P08687_A840TrnCod[0] ;
         n840TrnCod = P08687_n840TrnCod[0] ;
         A970ProceCod = P08687_A970ProceCod[0] ;
         n970ProceCod = P08687_n970ProceCod[0] ;
         A1211TipEntCod = P08687_A1211TipEntCod[0] ;
         n1211TipEntCod = P08687_n1211TipEntCod[0] ;
         A396EmprCod = P08687_A396EmprCod[0] ;
         A50AlbRLoc = P08687_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08687_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08687_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08687_A1291AlbRDes[0] ;
         A1212TipEntNom = P08687_A1212TipEntNom[0] ;
         n1212TipEntNom = P08687_n1212TipEntNom[0] ;
         A841TrnNom = P08687_A841TrnNom[0] ;
         n841TrnNom = P08687_n841TrnNom[0] ;
         A971ProceNom = P08687_A971ProceNom[0] ;
         n971ProceNom = P08687_n971ProceNom[0] ;
         A3613AlbRefDsc = P08687_A3613AlbRefDsc[0] ;
         A45AlbRef = P08687_A45AlbRef[0] ;
         A279CliNom = P08687_A279CliNom[0] ;
         A4606AlbRHEn = P08687_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08687_n4606AlbRHEn[0] ;
         A49AlbRFen = P08687_A49AlbRFen[0] ;
         A44AlbRecCod = P08687_A44AlbRecCod[0] ;
         A55AlbRReo = P08687_A55AlbRReo[0] ;
         A56AlbRUni = P08687_A56AlbRUni[0] ;
         A279CliNom = P08687_A279CliNom[0] ;
         A841TrnNom = P08687_A841TrnNom[0] ;
         n841TrnNom = P08687_n841TrnNom[0] ;
         A971ProceNom = P08687_A971ProceNom[0] ;
         n971ProceNom = P08687_n971ProceNom[0] ;
         A1212TipEntNom = P08687_A1212TipEntNom[0] ;
         n1212TipEntNom = P08687_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08687_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08687_A1211TipEntCod[0] == A1211TipEntCod ) )
            {
               brk86812 = false ;
               A44AlbRecCod = P08687_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86812 = true ;
               pr_default.readNext(5);
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
         if ( ! brk86812 )
         {
            brk86812 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBRDESOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbRDes = AV56SearchTxt ;
      AV41TFAlbRDes_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08688 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk86814 = false ;
         A396EmprCod = P08688_A396EmprCod[0] ;
         A252CliCod = P08688_A252CliCod[0] ;
         A840TrnCod = P08688_A840TrnCod[0] ;
         n840TrnCod = P08688_n840TrnCod[0] ;
         A970ProceCod = P08688_A970ProceCod[0] ;
         n970ProceCod = P08688_n970ProceCod[0] ;
         A1211TipEntCod = P08688_A1211TipEntCod[0] ;
         n1211TipEntCod = P08688_n1211TipEntCod[0] ;
         A1291AlbRDes = P08688_A1291AlbRDes[0] ;
         A50AlbRLoc = P08688_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08688_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08688_A58AlbRUniEnt[0] ;
         A1212TipEntNom = P08688_A1212TipEntNom[0] ;
         n1212TipEntNom = P08688_n1212TipEntNom[0] ;
         A841TrnNom = P08688_A841TrnNom[0] ;
         n841TrnNom = P08688_n841TrnNom[0] ;
         A971ProceNom = P08688_A971ProceNom[0] ;
         n971ProceNom = P08688_n971ProceNom[0] ;
         A3613AlbRefDsc = P08688_A3613AlbRefDsc[0] ;
         A45AlbRef = P08688_A45AlbRef[0] ;
         A279CliNom = P08688_A279CliNom[0] ;
         A4606AlbRHEn = P08688_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08688_n4606AlbRHEn[0] ;
         A49AlbRFen = P08688_A49AlbRFen[0] ;
         A44AlbRecCod = P08688_A44AlbRecCod[0] ;
         A55AlbRReo = P08688_A55AlbRReo[0] ;
         A56AlbRUni = P08688_A56AlbRUni[0] ;
         A279CliNom = P08688_A279CliNom[0] ;
         A841TrnNom = P08688_A841TrnNom[0] ;
         n841TrnNom = P08688_n841TrnNom[0] ;
         A971ProceNom = P08688_A971ProceNom[0] ;
         n971ProceNom = P08688_n971ProceNom[0] ;
         A1212TipEntNom = P08688_A1212TipEntNom[0] ;
         n1212TipEntNom = P08688_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08688_A1291AlbRDes[0], A1291AlbRDes) == 0 ) )
            {
               brk86814 = false ;
               A396EmprCod = P08688_A396EmprCod[0] ;
               A44AlbRecCod = P08688_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86814 = true ;
               pr_default.readNext(6);
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
         if ( ! brk86814 )
         {
            brk86814 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADALBRLOCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFAlbRLoc = AV56SearchTxt ;
      AV49TFAlbRLoc_Sel = "" ;
      AV104Talbdet1wwds_1_filterfulltext = AV99FilterFullText ;
      AV105Talbdet1wwds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV106Talbdet1wwds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV107Talbdet1wwds_4_tfalbrfen = AV16TFAlbRFen ;
      AV108Talbdet1wwds_5_tfalbrhen = AV18TFAlbRHEn ;
      AV109Talbdet1wwds_6_tfclinom = AV22TFCliNom ;
      AV110Talbdet1wwds_7_tfclinom_sel = AV23TFCliNom_Sel ;
      AV111Talbdet1wwds_8_tfalbref = AV24TFAlbRef ;
      AV112Talbdet1wwds_9_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV113Talbdet1wwds_10_tfalbrefdsc = AV26TFAlbRefDsc ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = AV27TFAlbRefDsc_Sel ;
      AV115Talbdet1wwds_12_tfprocenom = AV30TFProceNom ;
      AV116Talbdet1wwds_13_tfprocenom_sel = AV31TFProceNom_Sel ;
      AV117Talbdet1wwds_14_tftrnnom = AV34TFTrnNom ;
      AV118Talbdet1wwds_15_tftrnnom_sel = AV35TFTrnNom_Sel ;
      AV119Talbdet1wwds_16_tftipentnom = AV38TFTipEntNom ;
      AV120Talbdet1wwds_17_tftipentnom_sel = AV39TFTipEntNom_Sel ;
      AV121Talbdet1wwds_18_tfalbrdes = AV40TFAlbRDes ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = AV41TFAlbRDes_Sel ;
      AV123Talbdet1wwds_20_tfalbrunient = AV42TFAlbRUniEnt ;
      AV124Talbdet1wwds_21_tfalbrunient_to = AV43TFAlbRUniEnt_To ;
      AV125Talbdet1wwds_22_tfalbruni_sels = AV98TFAlbRUni_Sels ;
      AV126Talbdet1wwds_23_tfalbrpieent = AV46TFAlbRPieEnt ;
      AV127Talbdet1wwds_24_tfalbrpieent_to = AV47TFAlbRPieEnt_To ;
      AV128Talbdet1wwds_25_tfalbrloc = AV48TFAlbRLoc ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = AV49TFAlbRLoc_Sel ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = AV51TFAlbRReo_Sels ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV125Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet1wwds_4_tfalbrfen ,
                                           AV108Talbdet1wwds_5_tfalbrhen ,
                                           AV110Talbdet1wwds_7_tfclinom_sel ,
                                           AV109Talbdet1wwds_6_tfclinom ,
                                           AV112Talbdet1wwds_9_tfalbref_sel ,
                                           AV111Talbdet1wwds_8_tfalbref ,
                                           AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV113Talbdet1wwds_10_tfalbrefdsc ,
                                           AV116Talbdet1wwds_13_tfprocenom_sel ,
                                           AV115Talbdet1wwds_12_tfprocenom ,
                                           AV118Talbdet1wwds_15_tftrnnom_sel ,
                                           AV117Talbdet1wwds_14_tftrnnom ,
                                           AV120Talbdet1wwds_17_tftipentnom_sel ,
                                           AV119Talbdet1wwds_16_tftipentnom ,
                                           AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV121Talbdet1wwds_18_tfalbrdes ,
                                           AV123Talbdet1wwds_20_tfalbrunient ,
                                           AV124Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV125Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV128Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV130Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           AV104Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV109Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV111Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV111Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV113Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV113Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV115Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV115Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV117Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV117Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV119Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV119Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV121Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV121Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV128Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08689 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV105Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV106Talbdet1wwds_3_tfalbreccod_to), AV107Talbdet1wwds_4_tfalbrfen, AV108Talbdet1wwds_5_tfalbrhen, lV109Talbdet1wwds_6_tfclinom, AV110Talbdet1wwds_7_tfclinom_sel, lV111Talbdet1wwds_8_tfalbref, AV112Talbdet1wwds_9_tfalbref_sel, lV113Talbdet1wwds_10_tfalbrefdsc, AV114Talbdet1wwds_11_tfalbrefdsc_sel, lV115Talbdet1wwds_12_tfprocenom, AV116Talbdet1wwds_13_tfprocenom_sel, lV117Talbdet1wwds_14_tftrnnom, AV118Talbdet1wwds_15_tftrnnom_sel, lV119Talbdet1wwds_16_tftipentnom, AV120Talbdet1wwds_17_tftipentnom_sel, lV121Talbdet1wwds_18_tfalbrdes, AV122Talbdet1wwds_19_tfalbrdes_sel, AV123Talbdet1wwds_20_tfalbrunient, AV124Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV126Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV127Talbdet1wwds_24_tfalbrpieent_to), lV128Talbdet1wwds_25_tfalbrloc, AV129Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk86816 = false ;
         A396EmprCod = P08689_A396EmprCod[0] ;
         A252CliCod = P08689_A252CliCod[0] ;
         A840TrnCod = P08689_A840TrnCod[0] ;
         n840TrnCod = P08689_n840TrnCod[0] ;
         A970ProceCod = P08689_A970ProceCod[0] ;
         n970ProceCod = P08689_n970ProceCod[0] ;
         A1211TipEntCod = P08689_A1211TipEntCod[0] ;
         n1211TipEntCod = P08689_n1211TipEntCod[0] ;
         A50AlbRLoc = P08689_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08689_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08689_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08689_A1291AlbRDes[0] ;
         A1212TipEntNom = P08689_A1212TipEntNom[0] ;
         n1212TipEntNom = P08689_n1212TipEntNom[0] ;
         A841TrnNom = P08689_A841TrnNom[0] ;
         n841TrnNom = P08689_n841TrnNom[0] ;
         A971ProceNom = P08689_A971ProceNom[0] ;
         n971ProceNom = P08689_n971ProceNom[0] ;
         A3613AlbRefDsc = P08689_A3613AlbRefDsc[0] ;
         A45AlbRef = P08689_A45AlbRef[0] ;
         A279CliNom = P08689_A279CliNom[0] ;
         A4606AlbRHEn = P08689_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08689_n4606AlbRHEn[0] ;
         A49AlbRFen = P08689_A49AlbRFen[0] ;
         A44AlbRecCod = P08689_A44AlbRecCod[0] ;
         A55AlbRReo = P08689_A55AlbRReo[0] ;
         A56AlbRUni = P08689_A56AlbRUni[0] ;
         A279CliNom = P08689_A279CliNom[0] ;
         A841TrnNom = P08689_A841TrnNom[0] ;
         n841TrnNom = P08689_n841TrnNom[0] ;
         A971ProceNom = P08689_A971ProceNom[0] ;
         n971ProceNom = P08689_n971ProceNom[0] ;
         A1212TipEntNom = P08689_A1212TipEntNom[0] ;
         n1212TipEntNom = P08689_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV104Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV104Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV104Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV68count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08689_A50AlbRLoc[0], A50AlbRLoc) == 0 ) )
            {
               brk86816 = false ;
               A396EmprCod = P08689_A396EmprCod[0] ;
               A44AlbRecCod = P08689_A44AlbRecCod[0] ;
               AV68count = (long)(AV68count+1) ;
               brk86816 = true ;
               pr_default.readNext(7);
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
         if ( ! brk86816 )
         {
            brk86816 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = talbdet1wwgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = talbdet1wwgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = talbdet1wwgetfilterdata.this.AV67OptionIndexesJson;
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
      AV99FilterFullText = "" ;
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
      A279CliNom = "" ;
      AV104Talbdet1wwds_1_filterfulltext = "" ;
      AV107Talbdet1wwds_4_tfalbrfen = GXutil.nullDate() ;
      AV108Talbdet1wwds_5_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV109Talbdet1wwds_6_tfclinom = "" ;
      AV110Talbdet1wwds_7_tfclinom_sel = "" ;
      AV111Talbdet1wwds_8_tfalbref = "" ;
      AV112Talbdet1wwds_9_tfalbref_sel = "" ;
      AV113Talbdet1wwds_10_tfalbrefdsc = "" ;
      AV114Talbdet1wwds_11_tfalbrefdsc_sel = "" ;
      AV115Talbdet1wwds_12_tfprocenom = "" ;
      AV116Talbdet1wwds_13_tfprocenom_sel = "" ;
      AV117Talbdet1wwds_14_tftrnnom = "" ;
      AV118Talbdet1wwds_15_tftrnnom_sel = "" ;
      AV119Talbdet1wwds_16_tftipentnom = "" ;
      AV120Talbdet1wwds_17_tftipentnom_sel = "" ;
      AV121Talbdet1wwds_18_tfalbrdes = "" ;
      AV122Talbdet1wwds_19_tfalbrdes_sel = "" ;
      AV123Talbdet1wwds_20_tfalbrunient = DecimalUtil.ZERO ;
      AV124Talbdet1wwds_21_tfalbrunient_to = DecimalUtil.ZERO ;
      AV125Talbdet1wwds_22_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV128Talbdet1wwds_25_tfalbrloc = "" ;
      AV129Talbdet1wwds_26_tfalbrloc_sel = "" ;
      AV130Talbdet1wwds_27_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV109Talbdet1wwds_6_tfclinom = "" ;
      lV111Talbdet1wwds_8_tfalbref = "" ;
      lV113Talbdet1wwds_10_tfalbrefdsc = "" ;
      lV115Talbdet1wwds_12_tfprocenom = "" ;
      lV117Talbdet1wwds_14_tftrnnom = "" ;
      lV119Talbdet1wwds_16_tftipentnom = "" ;
      lV121Talbdet1wwds_18_tfalbrdes = "" ;
      lV128Talbdet1wwds_25_tfalbrloc = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      P08682_A396EmprCod = new String[] {""} ;
      P08682_A252CliCod = new int[1] ;
      P08682_A840TrnCod = new short[1] ;
      P08682_n840TrnCod = new boolean[] {false} ;
      P08682_A970ProceCod = new short[1] ;
      P08682_n970ProceCod = new boolean[] {false} ;
      P08682_A1211TipEntCod = new short[1] ;
      P08682_n1211TipEntCod = new boolean[] {false} ;
      P08682_A279CliNom = new String[] {""} ;
      P08682_A50AlbRLoc = new String[] {""} ;
      P08682_A52AlbRPieEnt = new int[1] ;
      P08682_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08682_A1291AlbRDes = new String[] {""} ;
      P08682_A1212TipEntNom = new String[] {""} ;
      P08682_n1212TipEntNom = new boolean[] {false} ;
      P08682_A841TrnNom = new String[] {""} ;
      P08682_n841TrnNom = new boolean[] {false} ;
      P08682_A971ProceNom = new String[] {""} ;
      P08682_n971ProceNom = new boolean[] {false} ;
      P08682_A3613AlbRefDsc = new String[] {""} ;
      P08682_A45AlbRef = new String[] {""} ;
      P08682_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08682_n4606AlbRHEn = new boolean[] {false} ;
      P08682_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08682_A44AlbRecCod = new int[1] ;
      P08682_A55AlbRReo = new String[] {""} ;
      P08682_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV60Option = "" ;
      P08683_A396EmprCod = new String[] {""} ;
      P08683_A252CliCod = new int[1] ;
      P08683_A840TrnCod = new short[1] ;
      P08683_n840TrnCod = new boolean[] {false} ;
      P08683_A970ProceCod = new short[1] ;
      P08683_n970ProceCod = new boolean[] {false} ;
      P08683_A1211TipEntCod = new short[1] ;
      P08683_n1211TipEntCod = new boolean[] {false} ;
      P08683_A45AlbRef = new String[] {""} ;
      P08683_A50AlbRLoc = new String[] {""} ;
      P08683_A52AlbRPieEnt = new int[1] ;
      P08683_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08683_A1291AlbRDes = new String[] {""} ;
      P08683_A1212TipEntNom = new String[] {""} ;
      P08683_n1212TipEntNom = new boolean[] {false} ;
      P08683_A841TrnNom = new String[] {""} ;
      P08683_n841TrnNom = new boolean[] {false} ;
      P08683_A971ProceNom = new String[] {""} ;
      P08683_n971ProceNom = new boolean[] {false} ;
      P08683_A3613AlbRefDsc = new String[] {""} ;
      P08683_A279CliNom = new String[] {""} ;
      P08683_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08683_n4606AlbRHEn = new boolean[] {false} ;
      P08683_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08683_A44AlbRecCod = new int[1] ;
      P08683_A55AlbRReo = new String[] {""} ;
      P08683_A56AlbRUni = new String[] {""} ;
      P08684_A396EmprCod = new String[] {""} ;
      P08684_A252CliCod = new int[1] ;
      P08684_A840TrnCod = new short[1] ;
      P08684_n840TrnCod = new boolean[] {false} ;
      P08684_A970ProceCod = new short[1] ;
      P08684_n970ProceCod = new boolean[] {false} ;
      P08684_A1211TipEntCod = new short[1] ;
      P08684_n1211TipEntCod = new boolean[] {false} ;
      P08684_A3613AlbRefDsc = new String[] {""} ;
      P08684_A50AlbRLoc = new String[] {""} ;
      P08684_A52AlbRPieEnt = new int[1] ;
      P08684_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08684_A1291AlbRDes = new String[] {""} ;
      P08684_A1212TipEntNom = new String[] {""} ;
      P08684_n1212TipEntNom = new boolean[] {false} ;
      P08684_A841TrnNom = new String[] {""} ;
      P08684_n841TrnNom = new boolean[] {false} ;
      P08684_A971ProceNom = new String[] {""} ;
      P08684_n971ProceNom = new boolean[] {false} ;
      P08684_A45AlbRef = new String[] {""} ;
      P08684_A279CliNom = new String[] {""} ;
      P08684_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08684_n4606AlbRHEn = new boolean[] {false} ;
      P08684_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08684_A44AlbRecCod = new int[1] ;
      P08684_A55AlbRReo = new String[] {""} ;
      P08684_A56AlbRUni = new String[] {""} ;
      P08685_A252CliCod = new int[1] ;
      P08685_A840TrnCod = new short[1] ;
      P08685_n840TrnCod = new boolean[] {false} ;
      P08685_A1211TipEntCod = new short[1] ;
      P08685_n1211TipEntCod = new boolean[] {false} ;
      P08685_A970ProceCod = new short[1] ;
      P08685_n970ProceCod = new boolean[] {false} ;
      P08685_A396EmprCod = new String[] {""} ;
      P08685_A50AlbRLoc = new String[] {""} ;
      P08685_A52AlbRPieEnt = new int[1] ;
      P08685_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08685_A1291AlbRDes = new String[] {""} ;
      P08685_A1212TipEntNom = new String[] {""} ;
      P08685_n1212TipEntNom = new boolean[] {false} ;
      P08685_A841TrnNom = new String[] {""} ;
      P08685_n841TrnNom = new boolean[] {false} ;
      P08685_A971ProceNom = new String[] {""} ;
      P08685_n971ProceNom = new boolean[] {false} ;
      P08685_A3613AlbRefDsc = new String[] {""} ;
      P08685_A45AlbRef = new String[] {""} ;
      P08685_A279CliNom = new String[] {""} ;
      P08685_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08685_n4606AlbRHEn = new boolean[] {false} ;
      P08685_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08685_A44AlbRecCod = new int[1] ;
      P08685_A55AlbRReo = new String[] {""} ;
      P08685_A56AlbRUni = new String[] {""} ;
      P08686_A252CliCod = new int[1] ;
      P08686_A970ProceCod = new short[1] ;
      P08686_n970ProceCod = new boolean[] {false} ;
      P08686_A1211TipEntCod = new short[1] ;
      P08686_n1211TipEntCod = new boolean[] {false} ;
      P08686_A840TrnCod = new short[1] ;
      P08686_n840TrnCod = new boolean[] {false} ;
      P08686_A396EmprCod = new String[] {""} ;
      P08686_A50AlbRLoc = new String[] {""} ;
      P08686_A52AlbRPieEnt = new int[1] ;
      P08686_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08686_A1291AlbRDes = new String[] {""} ;
      P08686_A1212TipEntNom = new String[] {""} ;
      P08686_n1212TipEntNom = new boolean[] {false} ;
      P08686_A841TrnNom = new String[] {""} ;
      P08686_n841TrnNom = new boolean[] {false} ;
      P08686_A971ProceNom = new String[] {""} ;
      P08686_n971ProceNom = new boolean[] {false} ;
      P08686_A3613AlbRefDsc = new String[] {""} ;
      P08686_A45AlbRef = new String[] {""} ;
      P08686_A279CliNom = new String[] {""} ;
      P08686_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08686_n4606AlbRHEn = new boolean[] {false} ;
      P08686_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08686_A44AlbRecCod = new int[1] ;
      P08686_A55AlbRReo = new String[] {""} ;
      P08686_A56AlbRUni = new String[] {""} ;
      P08687_A252CliCod = new int[1] ;
      P08687_A840TrnCod = new short[1] ;
      P08687_n840TrnCod = new boolean[] {false} ;
      P08687_A970ProceCod = new short[1] ;
      P08687_n970ProceCod = new boolean[] {false} ;
      P08687_A1211TipEntCod = new short[1] ;
      P08687_n1211TipEntCod = new boolean[] {false} ;
      P08687_A396EmprCod = new String[] {""} ;
      P08687_A50AlbRLoc = new String[] {""} ;
      P08687_A52AlbRPieEnt = new int[1] ;
      P08687_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08687_A1291AlbRDes = new String[] {""} ;
      P08687_A1212TipEntNom = new String[] {""} ;
      P08687_n1212TipEntNom = new boolean[] {false} ;
      P08687_A841TrnNom = new String[] {""} ;
      P08687_n841TrnNom = new boolean[] {false} ;
      P08687_A971ProceNom = new String[] {""} ;
      P08687_n971ProceNom = new boolean[] {false} ;
      P08687_A3613AlbRefDsc = new String[] {""} ;
      P08687_A45AlbRef = new String[] {""} ;
      P08687_A279CliNom = new String[] {""} ;
      P08687_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08687_n4606AlbRHEn = new boolean[] {false} ;
      P08687_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08687_A44AlbRecCod = new int[1] ;
      P08687_A55AlbRReo = new String[] {""} ;
      P08687_A56AlbRUni = new String[] {""} ;
      P08688_A396EmprCod = new String[] {""} ;
      P08688_A252CliCod = new int[1] ;
      P08688_A840TrnCod = new short[1] ;
      P08688_n840TrnCod = new boolean[] {false} ;
      P08688_A970ProceCod = new short[1] ;
      P08688_n970ProceCod = new boolean[] {false} ;
      P08688_A1211TipEntCod = new short[1] ;
      P08688_n1211TipEntCod = new boolean[] {false} ;
      P08688_A1291AlbRDes = new String[] {""} ;
      P08688_A50AlbRLoc = new String[] {""} ;
      P08688_A52AlbRPieEnt = new int[1] ;
      P08688_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08688_A1212TipEntNom = new String[] {""} ;
      P08688_n1212TipEntNom = new boolean[] {false} ;
      P08688_A841TrnNom = new String[] {""} ;
      P08688_n841TrnNom = new boolean[] {false} ;
      P08688_A971ProceNom = new String[] {""} ;
      P08688_n971ProceNom = new boolean[] {false} ;
      P08688_A3613AlbRefDsc = new String[] {""} ;
      P08688_A45AlbRef = new String[] {""} ;
      P08688_A279CliNom = new String[] {""} ;
      P08688_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08688_n4606AlbRHEn = new boolean[] {false} ;
      P08688_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08688_A44AlbRecCod = new int[1] ;
      P08688_A55AlbRReo = new String[] {""} ;
      P08688_A56AlbRUni = new String[] {""} ;
      P08689_A396EmprCod = new String[] {""} ;
      P08689_A252CliCod = new int[1] ;
      P08689_A840TrnCod = new short[1] ;
      P08689_n840TrnCod = new boolean[] {false} ;
      P08689_A970ProceCod = new short[1] ;
      P08689_n970ProceCod = new boolean[] {false} ;
      P08689_A1211TipEntCod = new short[1] ;
      P08689_n1211TipEntCod = new boolean[] {false} ;
      P08689_A50AlbRLoc = new String[] {""} ;
      P08689_A52AlbRPieEnt = new int[1] ;
      P08689_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08689_A1291AlbRDes = new String[] {""} ;
      P08689_A1212TipEntNom = new String[] {""} ;
      P08689_n1212TipEntNom = new boolean[] {false} ;
      P08689_A841TrnNom = new String[] {""} ;
      P08689_n841TrnNom = new boolean[] {false} ;
      P08689_A971ProceNom = new String[] {""} ;
      P08689_n971ProceNom = new boolean[] {false} ;
      P08689_A3613AlbRefDsc = new String[] {""} ;
      P08689_A45AlbRef = new String[] {""} ;
      P08689_A279CliNom = new String[] {""} ;
      P08689_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08689_n4606AlbRHEn = new boolean[] {false} ;
      P08689_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08689_A44AlbRecCod = new int[1] ;
      P08689_A55AlbRReo = new String[] {""} ;
      P08689_A56AlbRUni = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08682_A396EmprCod, P08682_A252CliCod, P08682_A840TrnCod, P08682_n840TrnCod, P08682_A970ProceCod, P08682_n970ProceCod, P08682_A1211TipEntCod, P08682_n1211TipEntCod, P08682_A279CliNom, P08682_A50AlbRLoc,
            P08682_A52AlbRPieEnt, P08682_A58AlbRUniEnt, P08682_A1291AlbRDes, P08682_A1212TipEntNom, P08682_n1212TipEntNom, P08682_A841TrnNom, P08682_n841TrnNom, P08682_A971ProceNom, P08682_n971ProceNom, P08682_A3613AlbRefDsc,
            P08682_A45AlbRef, P08682_A4606AlbRHEn, P08682_n4606AlbRHEn, P08682_A49AlbRFen, P08682_A44AlbRecCod, P08682_A55AlbRReo, P08682_A56AlbRUni
            }
            , new Object[] {
            P08683_A396EmprCod, P08683_A252CliCod, P08683_A840TrnCod, P08683_n840TrnCod, P08683_A970ProceCod, P08683_n970ProceCod, P08683_A1211TipEntCod, P08683_n1211TipEntCod, P08683_A45AlbRef, P08683_A50AlbRLoc,
            P08683_A52AlbRPieEnt, P08683_A58AlbRUniEnt, P08683_A1291AlbRDes, P08683_A1212TipEntNom, P08683_n1212TipEntNom, P08683_A841TrnNom, P08683_n841TrnNom, P08683_A971ProceNom, P08683_n971ProceNom, P08683_A3613AlbRefDsc,
            P08683_A279CliNom, P08683_A4606AlbRHEn, P08683_n4606AlbRHEn, P08683_A49AlbRFen, P08683_A44AlbRecCod, P08683_A55AlbRReo, P08683_A56AlbRUni
            }
            , new Object[] {
            P08684_A396EmprCod, P08684_A252CliCod, P08684_A840TrnCod, P08684_n840TrnCod, P08684_A970ProceCod, P08684_n970ProceCod, P08684_A1211TipEntCod, P08684_n1211TipEntCod, P08684_A3613AlbRefDsc, P08684_A50AlbRLoc,
            P08684_A52AlbRPieEnt, P08684_A58AlbRUniEnt, P08684_A1291AlbRDes, P08684_A1212TipEntNom, P08684_n1212TipEntNom, P08684_A841TrnNom, P08684_n841TrnNom, P08684_A971ProceNom, P08684_n971ProceNom, P08684_A45AlbRef,
            P08684_A279CliNom, P08684_A4606AlbRHEn, P08684_n4606AlbRHEn, P08684_A49AlbRFen, P08684_A44AlbRecCod, P08684_A55AlbRReo, P08684_A56AlbRUni
            }
            , new Object[] {
            P08685_A252CliCod, P08685_A840TrnCod, P08685_n840TrnCod, P08685_A1211TipEntCod, P08685_n1211TipEntCod, P08685_A970ProceCod, P08685_n970ProceCod, P08685_A396EmprCod, P08685_A50AlbRLoc, P08685_A52AlbRPieEnt,
            P08685_A58AlbRUniEnt, P08685_A1291AlbRDes, P08685_A1212TipEntNom, P08685_n1212TipEntNom, P08685_A841TrnNom, P08685_n841TrnNom, P08685_A971ProceNom, P08685_n971ProceNom, P08685_A3613AlbRefDsc, P08685_A45AlbRef,
            P08685_A279CliNom, P08685_A4606AlbRHEn, P08685_n4606AlbRHEn, P08685_A49AlbRFen, P08685_A44AlbRecCod, P08685_A55AlbRReo, P08685_A56AlbRUni
            }
            , new Object[] {
            P08686_A252CliCod, P08686_A970ProceCod, P08686_n970ProceCod, P08686_A1211TipEntCod, P08686_n1211TipEntCod, P08686_A840TrnCod, P08686_n840TrnCod, P08686_A396EmprCod, P08686_A50AlbRLoc, P08686_A52AlbRPieEnt,
            P08686_A58AlbRUniEnt, P08686_A1291AlbRDes, P08686_A1212TipEntNom, P08686_n1212TipEntNom, P08686_A841TrnNom, P08686_n841TrnNom, P08686_A971ProceNom, P08686_n971ProceNom, P08686_A3613AlbRefDsc, P08686_A45AlbRef,
            P08686_A279CliNom, P08686_A4606AlbRHEn, P08686_n4606AlbRHEn, P08686_A49AlbRFen, P08686_A44AlbRecCod, P08686_A55AlbRReo, P08686_A56AlbRUni
            }
            , new Object[] {
            P08687_A252CliCod, P08687_A840TrnCod, P08687_n840TrnCod, P08687_A970ProceCod, P08687_n970ProceCod, P08687_A1211TipEntCod, P08687_n1211TipEntCod, P08687_A396EmprCod, P08687_A50AlbRLoc, P08687_A52AlbRPieEnt,
            P08687_A58AlbRUniEnt, P08687_A1291AlbRDes, P08687_A1212TipEntNom, P08687_n1212TipEntNom, P08687_A841TrnNom, P08687_n841TrnNom, P08687_A971ProceNom, P08687_n971ProceNom, P08687_A3613AlbRefDsc, P08687_A45AlbRef,
            P08687_A279CliNom, P08687_A4606AlbRHEn, P08687_n4606AlbRHEn, P08687_A49AlbRFen, P08687_A44AlbRecCod, P08687_A55AlbRReo, P08687_A56AlbRUni
            }
            , new Object[] {
            P08688_A396EmprCod, P08688_A252CliCod, P08688_A840TrnCod, P08688_n840TrnCod, P08688_A970ProceCod, P08688_n970ProceCod, P08688_A1211TipEntCod, P08688_n1211TipEntCod, P08688_A1291AlbRDes, P08688_A50AlbRLoc,
            P08688_A52AlbRPieEnt, P08688_A58AlbRUniEnt, P08688_A1212TipEntNom, P08688_n1212TipEntNom, P08688_A841TrnNom, P08688_n841TrnNom, P08688_A971ProceNom, P08688_n971ProceNom, P08688_A3613AlbRefDsc, P08688_A45AlbRef,
            P08688_A279CliNom, P08688_A4606AlbRHEn, P08688_n4606AlbRHEn, P08688_A49AlbRFen, P08688_A44AlbRecCod, P08688_A55AlbRReo, P08688_A56AlbRUni
            }
            , new Object[] {
            P08689_A396EmprCod, P08689_A252CliCod, P08689_A840TrnCod, P08689_n840TrnCod, P08689_A970ProceCod, P08689_n970ProceCod, P08689_A1211TipEntCod, P08689_n1211TipEntCod, P08689_A50AlbRLoc, P08689_A52AlbRPieEnt,
            P08689_A58AlbRUniEnt, P08689_A1291AlbRDes, P08689_A1212TipEntNom, P08689_n1212TipEntNom, P08689_A841TrnNom, P08689_n841TrnNom, P08689_A971ProceNom, P08689_n971ProceNom, P08689_A3613AlbRefDsc, P08689_A45AlbRef,
            P08689_A279CliNom, P08689_A4606AlbRHEn, P08689_n4606AlbRHEn, P08689_A49AlbRFen, P08689_A44AlbRecCod, P08689_A55AlbRReo, P08689_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV102GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV46TFAlbRPieEnt ;
   private int AV47TFAlbRPieEnt_To ;
   private int AV105Talbdet1wwds_2_tfalbreccod ;
   private int AV106Talbdet1wwds_3_tfalbreccod_to ;
   private int AV126Talbdet1wwds_23_tfalbrpieent ;
   private int AV127Talbdet1wwds_24_tfalbrpieent_to ;
   private int AV125Talbdet1wwds_22_tfalbruni_sels_size ;
   private int AV130Talbdet1wwds_27_tfalbrreo_sels_size ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A252CliCod ;
   private int AV59InsertIndex ;
   private long AV68count ;
   private java.math.BigDecimal AV42TFAlbRUniEnt ;
   private java.math.BigDecimal AV43TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ;
   private java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
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
   private String A279CliNom ;
   private String AV109Talbdet1wwds_6_tfclinom ;
   private String AV110Talbdet1wwds_7_tfclinom_sel ;
   private String AV111Talbdet1wwds_8_tfalbref ;
   private String AV112Talbdet1wwds_9_tfalbref_sel ;
   private String AV113Talbdet1wwds_10_tfalbrefdsc ;
   private String AV114Talbdet1wwds_11_tfalbrefdsc_sel ;
   private String AV115Talbdet1wwds_12_tfprocenom ;
   private String AV116Talbdet1wwds_13_tfprocenom_sel ;
   private String AV117Talbdet1wwds_14_tftrnnom ;
   private String AV118Talbdet1wwds_15_tftrnnom_sel ;
   private String AV119Talbdet1wwds_16_tftipentnom ;
   private String AV120Talbdet1wwds_17_tftipentnom_sel ;
   private String AV121Talbdet1wwds_18_tfalbrdes ;
   private String AV122Talbdet1wwds_19_tfalbrdes_sel ;
   private String AV128Talbdet1wwds_25_tfalbrloc ;
   private String AV129Talbdet1wwds_26_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV109Talbdet1wwds_6_tfclinom ;
   private String lV111Talbdet1wwds_8_tfalbref ;
   private String lV113Talbdet1wwds_10_tfalbrefdsc ;
   private String lV115Talbdet1wwds_12_tfprocenom ;
   private String lV117Talbdet1wwds_14_tftrnnom ;
   private String lV119Talbdet1wwds_16_tftipentnom ;
   private String lV121Talbdet1wwds_18_tfalbrdes ;
   private String lV128Talbdet1wwds_25_tfalbrloc ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A50AlbRLoc ;
   private String A396EmprCod ;
   private java.util.Date AV18TFAlbRHEn ;
   private java.util.Date AV108Talbdet1wwds_5_tfalbrhen ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV16TFAlbRFen ;
   private java.util.Date AV107Talbdet1wwds_4_tfalbrfen ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk8682 ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n1212TipEntNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n4606AlbRHEn ;
   private boolean brk8684 ;
   private boolean brk8686 ;
   private boolean brk8688 ;
   private boolean brk86810 ;
   private boolean brk86812 ;
   private boolean brk86814 ;
   private boolean brk86816 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV97TFAlbRUni_SelsJson ;
   private String AV50TFAlbRReo_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV99FilterFullText ;
   private String AV104Talbdet1wwds_1_filterfulltext ;
   private String AV60Option ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08682_A396EmprCod ;
   private int[] P08682_A252CliCod ;
   private short[] P08682_A840TrnCod ;
   private boolean[] P08682_n840TrnCod ;
   private short[] P08682_A970ProceCod ;
   private boolean[] P08682_n970ProceCod ;
   private short[] P08682_A1211TipEntCod ;
   private boolean[] P08682_n1211TipEntCod ;
   private String[] P08682_A279CliNom ;
   private String[] P08682_A50AlbRLoc ;
   private int[] P08682_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08682_A58AlbRUniEnt ;
   private String[] P08682_A1291AlbRDes ;
   private String[] P08682_A1212TipEntNom ;
   private boolean[] P08682_n1212TipEntNom ;
   private String[] P08682_A841TrnNom ;
   private boolean[] P08682_n841TrnNom ;
   private String[] P08682_A971ProceNom ;
   private boolean[] P08682_n971ProceNom ;
   private String[] P08682_A3613AlbRefDsc ;
   private String[] P08682_A45AlbRef ;
   private java.util.Date[] P08682_A4606AlbRHEn ;
   private boolean[] P08682_n4606AlbRHEn ;
   private java.util.Date[] P08682_A49AlbRFen ;
   private int[] P08682_A44AlbRecCod ;
   private String[] P08682_A55AlbRReo ;
   private String[] P08682_A56AlbRUni ;
   private String[] P08683_A396EmprCod ;
   private int[] P08683_A252CliCod ;
   private short[] P08683_A840TrnCod ;
   private boolean[] P08683_n840TrnCod ;
   private short[] P08683_A970ProceCod ;
   private boolean[] P08683_n970ProceCod ;
   private short[] P08683_A1211TipEntCod ;
   private boolean[] P08683_n1211TipEntCod ;
   private String[] P08683_A45AlbRef ;
   private String[] P08683_A50AlbRLoc ;
   private int[] P08683_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08683_A58AlbRUniEnt ;
   private String[] P08683_A1291AlbRDes ;
   private String[] P08683_A1212TipEntNom ;
   private boolean[] P08683_n1212TipEntNom ;
   private String[] P08683_A841TrnNom ;
   private boolean[] P08683_n841TrnNom ;
   private String[] P08683_A971ProceNom ;
   private boolean[] P08683_n971ProceNom ;
   private String[] P08683_A3613AlbRefDsc ;
   private String[] P08683_A279CliNom ;
   private java.util.Date[] P08683_A4606AlbRHEn ;
   private boolean[] P08683_n4606AlbRHEn ;
   private java.util.Date[] P08683_A49AlbRFen ;
   private int[] P08683_A44AlbRecCod ;
   private String[] P08683_A55AlbRReo ;
   private String[] P08683_A56AlbRUni ;
   private String[] P08684_A396EmprCod ;
   private int[] P08684_A252CliCod ;
   private short[] P08684_A840TrnCod ;
   private boolean[] P08684_n840TrnCod ;
   private short[] P08684_A970ProceCod ;
   private boolean[] P08684_n970ProceCod ;
   private short[] P08684_A1211TipEntCod ;
   private boolean[] P08684_n1211TipEntCod ;
   private String[] P08684_A3613AlbRefDsc ;
   private String[] P08684_A50AlbRLoc ;
   private int[] P08684_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08684_A58AlbRUniEnt ;
   private String[] P08684_A1291AlbRDes ;
   private String[] P08684_A1212TipEntNom ;
   private boolean[] P08684_n1212TipEntNom ;
   private String[] P08684_A841TrnNom ;
   private boolean[] P08684_n841TrnNom ;
   private String[] P08684_A971ProceNom ;
   private boolean[] P08684_n971ProceNom ;
   private String[] P08684_A45AlbRef ;
   private String[] P08684_A279CliNom ;
   private java.util.Date[] P08684_A4606AlbRHEn ;
   private boolean[] P08684_n4606AlbRHEn ;
   private java.util.Date[] P08684_A49AlbRFen ;
   private int[] P08684_A44AlbRecCod ;
   private String[] P08684_A55AlbRReo ;
   private String[] P08684_A56AlbRUni ;
   private int[] P08685_A252CliCod ;
   private short[] P08685_A840TrnCod ;
   private boolean[] P08685_n840TrnCod ;
   private short[] P08685_A1211TipEntCod ;
   private boolean[] P08685_n1211TipEntCod ;
   private short[] P08685_A970ProceCod ;
   private boolean[] P08685_n970ProceCod ;
   private String[] P08685_A396EmprCod ;
   private String[] P08685_A50AlbRLoc ;
   private int[] P08685_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08685_A58AlbRUniEnt ;
   private String[] P08685_A1291AlbRDes ;
   private String[] P08685_A1212TipEntNom ;
   private boolean[] P08685_n1212TipEntNom ;
   private String[] P08685_A841TrnNom ;
   private boolean[] P08685_n841TrnNom ;
   private String[] P08685_A971ProceNom ;
   private boolean[] P08685_n971ProceNom ;
   private String[] P08685_A3613AlbRefDsc ;
   private String[] P08685_A45AlbRef ;
   private String[] P08685_A279CliNom ;
   private java.util.Date[] P08685_A4606AlbRHEn ;
   private boolean[] P08685_n4606AlbRHEn ;
   private java.util.Date[] P08685_A49AlbRFen ;
   private int[] P08685_A44AlbRecCod ;
   private String[] P08685_A55AlbRReo ;
   private String[] P08685_A56AlbRUni ;
   private int[] P08686_A252CliCod ;
   private short[] P08686_A970ProceCod ;
   private boolean[] P08686_n970ProceCod ;
   private short[] P08686_A1211TipEntCod ;
   private boolean[] P08686_n1211TipEntCod ;
   private short[] P08686_A840TrnCod ;
   private boolean[] P08686_n840TrnCod ;
   private String[] P08686_A396EmprCod ;
   private String[] P08686_A50AlbRLoc ;
   private int[] P08686_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08686_A58AlbRUniEnt ;
   private String[] P08686_A1291AlbRDes ;
   private String[] P08686_A1212TipEntNom ;
   private boolean[] P08686_n1212TipEntNom ;
   private String[] P08686_A841TrnNom ;
   private boolean[] P08686_n841TrnNom ;
   private String[] P08686_A971ProceNom ;
   private boolean[] P08686_n971ProceNom ;
   private String[] P08686_A3613AlbRefDsc ;
   private String[] P08686_A45AlbRef ;
   private String[] P08686_A279CliNom ;
   private java.util.Date[] P08686_A4606AlbRHEn ;
   private boolean[] P08686_n4606AlbRHEn ;
   private java.util.Date[] P08686_A49AlbRFen ;
   private int[] P08686_A44AlbRecCod ;
   private String[] P08686_A55AlbRReo ;
   private String[] P08686_A56AlbRUni ;
   private int[] P08687_A252CliCod ;
   private short[] P08687_A840TrnCod ;
   private boolean[] P08687_n840TrnCod ;
   private short[] P08687_A970ProceCod ;
   private boolean[] P08687_n970ProceCod ;
   private short[] P08687_A1211TipEntCod ;
   private boolean[] P08687_n1211TipEntCod ;
   private String[] P08687_A396EmprCod ;
   private String[] P08687_A50AlbRLoc ;
   private int[] P08687_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08687_A58AlbRUniEnt ;
   private String[] P08687_A1291AlbRDes ;
   private String[] P08687_A1212TipEntNom ;
   private boolean[] P08687_n1212TipEntNom ;
   private String[] P08687_A841TrnNom ;
   private boolean[] P08687_n841TrnNom ;
   private String[] P08687_A971ProceNom ;
   private boolean[] P08687_n971ProceNom ;
   private String[] P08687_A3613AlbRefDsc ;
   private String[] P08687_A45AlbRef ;
   private String[] P08687_A279CliNom ;
   private java.util.Date[] P08687_A4606AlbRHEn ;
   private boolean[] P08687_n4606AlbRHEn ;
   private java.util.Date[] P08687_A49AlbRFen ;
   private int[] P08687_A44AlbRecCod ;
   private String[] P08687_A55AlbRReo ;
   private String[] P08687_A56AlbRUni ;
   private String[] P08688_A396EmprCod ;
   private int[] P08688_A252CliCod ;
   private short[] P08688_A840TrnCod ;
   private boolean[] P08688_n840TrnCod ;
   private short[] P08688_A970ProceCod ;
   private boolean[] P08688_n970ProceCod ;
   private short[] P08688_A1211TipEntCod ;
   private boolean[] P08688_n1211TipEntCod ;
   private String[] P08688_A1291AlbRDes ;
   private String[] P08688_A50AlbRLoc ;
   private int[] P08688_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08688_A58AlbRUniEnt ;
   private String[] P08688_A1212TipEntNom ;
   private boolean[] P08688_n1212TipEntNom ;
   private String[] P08688_A841TrnNom ;
   private boolean[] P08688_n841TrnNom ;
   private String[] P08688_A971ProceNom ;
   private boolean[] P08688_n971ProceNom ;
   private String[] P08688_A3613AlbRefDsc ;
   private String[] P08688_A45AlbRef ;
   private String[] P08688_A279CliNom ;
   private java.util.Date[] P08688_A4606AlbRHEn ;
   private boolean[] P08688_n4606AlbRHEn ;
   private java.util.Date[] P08688_A49AlbRFen ;
   private int[] P08688_A44AlbRecCod ;
   private String[] P08688_A55AlbRReo ;
   private String[] P08688_A56AlbRUni ;
   private String[] P08689_A396EmprCod ;
   private int[] P08689_A252CliCod ;
   private short[] P08689_A840TrnCod ;
   private boolean[] P08689_n840TrnCod ;
   private short[] P08689_A970ProceCod ;
   private boolean[] P08689_n970ProceCod ;
   private short[] P08689_A1211TipEntCod ;
   private boolean[] P08689_n1211TipEntCod ;
   private String[] P08689_A50AlbRLoc ;
   private int[] P08689_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08689_A58AlbRUniEnt ;
   private String[] P08689_A1291AlbRDes ;
   private String[] P08689_A1212TipEntNom ;
   private boolean[] P08689_n1212TipEntNom ;
   private String[] P08689_A841TrnNom ;
   private boolean[] P08689_n841TrnNom ;
   private String[] P08689_A971ProceNom ;
   private boolean[] P08689_n971ProceNom ;
   private String[] P08689_A3613AlbRefDsc ;
   private String[] P08689_A45AlbRef ;
   private String[] P08689_A279CliNom ;
   private java.util.Date[] P08689_A4606AlbRHEn ;
   private boolean[] P08689_n4606AlbRHEn ;
   private java.util.Date[] P08689_A49AlbRFen ;
   private int[] P08689_A44AlbRecCod ;
   private String[] P08689_A55AlbRReo ;
   private String[] P08689_A56AlbRUni ;
   private GXSimpleCollection<String> AV98TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV51TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ;
   private GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class talbdet1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08682( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T2.CliNom, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom," ;
      scmdbuf += " T1.AlbRefDsc, T1.AlbRef, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08683( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[24];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.AlbRef, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom," ;
      scmdbuf += " T1.AlbRefDsc, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08684( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.AlbRefDsc, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom," ;
      scmdbuf += " T4.ProceNom, T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08685( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[24];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.TrnCod, T1.TipEntCod, T1.ProceCod, T1.EmprCod, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08686( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[24];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.ProceCod, T1.TipEntCod, T1.TrnCod, T1.EmprCod, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08687( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[24];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.EmprCod, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipEntCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P08688( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[24];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.AlbRDes, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRDes" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08689( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV125Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV130Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV105Talbdet1wwds_2_tfalbreccod ,
                                          int AV106Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV107Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV108Talbdet1wwds_5_tfalbrhen ,
                                          String AV110Talbdet1wwds_7_tfclinom_sel ,
                                          String AV109Talbdet1wwds_6_tfclinom ,
                                          String AV112Talbdet1wwds_9_tfalbref_sel ,
                                          String AV111Talbdet1wwds_8_tfalbref ,
                                          String AV114Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV113Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV116Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV115Talbdet1wwds_12_tfprocenom ,
                                          String AV118Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV117Talbdet1wwds_14_tftrnnom ,
                                          String AV120Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV119Talbdet1wwds_16_tftipentnom ,
                                          String AV122Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV121Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV123Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV124Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV125Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV126Talbdet1wwds_23_tfalbrpieent ,
                                          int AV127Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV129Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV128Talbdet1wwds_25_tfalbrloc ,
                                          int AV130Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          String AV104Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[24];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV105Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV115Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( AV125Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV126Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( AV130Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRLoc" ;
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
                  return conditional_P08682(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 1 :
                  return conditional_P08683(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 2 :
                  return conditional_P08684(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 3 :
                  return conditional_P08685(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 4 :
                  return conditional_P08686(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 5 :
                  return conditional_P08687(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 6 :
                  return conditional_P08688(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 7 :
                  return conditional_P08689(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08682", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08683", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08684", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08685", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08686", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08687", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08688", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08689", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((String[]) buf[13])[0] = rslt.getString(11, 25);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((String[]) buf[13])[0] = rslt.getString(11, 25);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((String[]) buf[13])[0] = rslt.getString(11, 25);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
      }
   }

}

