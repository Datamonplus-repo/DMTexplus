package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webconalbgetfilterdata extends GXProcedure
{
   public webconalbgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webconalbgetfilterdata.class ), "" );
   }

   public webconalbgetfilterdata( int remoteHandle ,
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
      webconalbgetfilterdata.this.aP5 = new String[] {""};
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
      webconalbgetfilterdata.this.AV70DDOName = aP0;
      webconalbgetfilterdata.this.AV68SearchTxt = aP1;
      webconalbgetfilterdata.this.AV69SearchTxtTo = aP2;
      webconalbgetfilterdata.this.aP3 = aP3;
      webconalbgetfilterdata.this.aP4 = aP4;
      webconalbgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV73Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV76OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV78OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_ALBREF") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_ALBREFDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_ALBRTARTD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRTARTDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_TRNNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_PROCENOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV70DDOName), "DDO_ALBRUSU") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRUSUOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV74OptionsJson = AV73Options.toJSonString(false) ;
      AV77OptionsDescJson = AV76OptionsDesc.toJSonString(false) ;
      AV79OptionIndexesJson = AV78OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV81Session.getValue("WebCONALBGridState"), "") == 0 )
      {
         AV83GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebCONALBGridState"), null, null);
      }
      else
      {
         AV83GridState.fromxml(AV81Session.getValue("WebCONALBGridState"), null, null);
      }
      AV128GXV1 = 1 ;
      while ( AV128GXV1 <= AV83GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV84GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV83GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV128GXV1));
         if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV125FilterFullText = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV16TFAlbRFen = localUtil.ctod( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV18TFAlbRReo_SelsJson = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFAlbRReo_Sels.fromJSonString(AV18TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV20TFAlbRef = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV21TFAlbRef_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV22TFAlbRefDsc = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV23TFAlbRefDsc_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV24TFAlbRTartD = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV25TFAlbRTartD_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV26TFTrnNom = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV27TFTrnNom_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV28TFProceNom = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV29TFProceNom_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV30TFAlbRUniEnt = CommonUtil.decimalVal( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFAlbRUniEnt_To = CommonUtil.decimalVal( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV120TFAlbRUni_SelsJson = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV121TFAlbRUni_Sels.fromJSonString(AV120TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV34TFAlbRUniUti = CommonUtil.decimalVal( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFAlbRUniUti_To = CommonUtil.decimalVal( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV36TFAlbRUniDis = CommonUtil.decimalVal( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFAlbRUniDis_To = CommonUtil.decimalVal( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV38TFAlbRPieEnt = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFAlbRPieEnt_To = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV40TFAlbRPieUti = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFAlbRPieUti_To = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV42TFAlbRPieDis = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFAlbRPieDis_To = (int)(GXutil.lval( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV44TFAlbREst_SelsJson = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFAlbREst_Sels.fromJSonString(AV44TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU") == 0 )
         {
            AV52TFAlbrUsu = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU_SEL") == 0 )
         {
            AV53TFAlbrUsu_Sel = AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV54TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV84GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         AV128GXV1 = (int)(AV128GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV68SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk84F2 = false ;
         A396EmprCod = P084F2_A396EmprCod[0] ;
         A252CliCod = P084F2_A252CliCod[0] ;
         A6263AlbRTartC = P084F2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F2_n6263AlbRTartC[0] ;
         A840TrnCod = P084F2_A840TrnCod[0] ;
         n840TrnCod = P084F2_n840TrnCod[0] ;
         A970ProceCod = P084F2_A970ProceCod[0] ;
         n970ProceCod = P084F2_n970ProceCod[0] ;
         A279CliNom = P084F2_A279CliNom[0] ;
         A6179AlbrHor = P084F2_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084F2_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084F2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F2_A57AlbRUniDis[0] ;
         A971ProceNom = P084F2_A971ProceNom[0] ;
         n971ProceNom = P084F2_n971ProceNom[0] ;
         A841TrnNom = P084F2_A841TrnNom[0] ;
         n841TrnNom = P084F2_n841TrnNom[0] ;
         A6264AlbRTartD = P084F2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F2_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084F2_A3613AlbRefDsc[0] ;
         A45AlbRef = P084F2_A45AlbRef[0] ;
         A49AlbRFen = P084F2_A49AlbRFen[0] ;
         A44AlbRecCod = P084F2_A44AlbRecCod[0] ;
         A47AlbREst = P084F2_A47AlbREst[0] ;
         A56AlbRUni = P084F2_A56AlbRUni[0] ;
         A55AlbRReo = P084F2_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F2_A60AlbRUniUti[0] ;
         A279CliNom = P084F2_A279CliNom[0] ;
         A6264AlbRTartD = P084F2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F2_n6264AlbRTartD[0] ;
         A841TrnNom = P084F2_A841TrnNom[0] ;
         n841TrnNom = P084F2_n841TrnNom[0] ;
         A971ProceNom = P084F2_A971ProceNom[0] ;
         n971ProceNom = P084F2_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P084F2_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk84F2 = false ;
               A396EmprCod = P084F2_A396EmprCod[0] ;
               A252CliCod = P084F2_A252CliCod[0] ;
               A44AlbRecCod = P084F2_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV72Option = A279CliNom ;
               AV73Options.add(AV72Option, 0);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F2 )
         {
            brk84F2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbRef = AV68SearchTxt ;
      AV21TFAlbRef_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk84F4 = false ;
         A396EmprCod = P084F3_A396EmprCod[0] ;
         A252CliCod = P084F3_A252CliCod[0] ;
         A6263AlbRTartC = P084F3_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F3_n6263AlbRTartC[0] ;
         A840TrnCod = P084F3_A840TrnCod[0] ;
         n840TrnCod = P084F3_n840TrnCod[0] ;
         A970ProceCod = P084F3_A970ProceCod[0] ;
         n970ProceCod = P084F3_n970ProceCod[0] ;
         A45AlbRef = P084F3_A45AlbRef[0] ;
         A6179AlbrHor = P084F3_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084F3_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084F3_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F3_A57AlbRUniDis[0] ;
         A971ProceNom = P084F3_A971ProceNom[0] ;
         n971ProceNom = P084F3_n971ProceNom[0] ;
         A841TrnNom = P084F3_A841TrnNom[0] ;
         n841TrnNom = P084F3_n841TrnNom[0] ;
         A6264AlbRTartD = P084F3_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F3_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084F3_A3613AlbRefDsc[0] ;
         A49AlbRFen = P084F3_A49AlbRFen[0] ;
         A279CliNom = P084F3_A279CliNom[0] ;
         A44AlbRecCod = P084F3_A44AlbRecCod[0] ;
         A47AlbREst = P084F3_A47AlbREst[0] ;
         A56AlbRUni = P084F3_A56AlbRUni[0] ;
         A55AlbRReo = P084F3_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F3_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F3_A60AlbRUniUti[0] ;
         A279CliNom = P084F3_A279CliNom[0] ;
         A6264AlbRTartD = P084F3_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F3_n6264AlbRTartD[0] ;
         A841TrnNom = P084F3_A841TrnNom[0] ;
         n841TrnNom = P084F3_n841TrnNom[0] ;
         A971ProceNom = P084F3_A971ProceNom[0] ;
         n971ProceNom = P084F3_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P084F3_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk84F4 = false ;
               A396EmprCod = P084F3_A396EmprCod[0] ;
               A44AlbRecCod = P084F3_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
            {
               AV72Option = A45AlbRef ;
               AV73Options.add(AV72Option, 0);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F4 )
         {
            brk84F4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFAlbRefDsc = AV68SearchTxt ;
      AV23TFAlbRefDsc_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk84F6 = false ;
         A396EmprCod = P084F4_A396EmprCod[0] ;
         A252CliCod = P084F4_A252CliCod[0] ;
         A6263AlbRTartC = P084F4_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F4_n6263AlbRTartC[0] ;
         A840TrnCod = P084F4_A840TrnCod[0] ;
         n840TrnCod = P084F4_n840TrnCod[0] ;
         A970ProceCod = P084F4_A970ProceCod[0] ;
         n970ProceCod = P084F4_n970ProceCod[0] ;
         A3613AlbRefDsc = P084F4_A3613AlbRefDsc[0] ;
         A6179AlbrHor = P084F4_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084F4_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084F4_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F4_A57AlbRUniDis[0] ;
         A971ProceNom = P084F4_A971ProceNom[0] ;
         n971ProceNom = P084F4_n971ProceNom[0] ;
         A841TrnNom = P084F4_A841TrnNom[0] ;
         n841TrnNom = P084F4_n841TrnNom[0] ;
         A6264AlbRTartD = P084F4_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F4_n6264AlbRTartD[0] ;
         A45AlbRef = P084F4_A45AlbRef[0] ;
         A49AlbRFen = P084F4_A49AlbRFen[0] ;
         A279CliNom = P084F4_A279CliNom[0] ;
         A44AlbRecCod = P084F4_A44AlbRecCod[0] ;
         A47AlbREst = P084F4_A47AlbREst[0] ;
         A56AlbRUni = P084F4_A56AlbRUni[0] ;
         A55AlbRReo = P084F4_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F4_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F4_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F4_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F4_A60AlbRUniUti[0] ;
         A279CliNom = P084F4_A279CliNom[0] ;
         A6264AlbRTartD = P084F4_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F4_n6264AlbRTartD[0] ;
         A841TrnNom = P084F4_A841TrnNom[0] ;
         n841TrnNom = P084F4_n841TrnNom[0] ;
         A971ProceNom = P084F4_A971ProceNom[0] ;
         n971ProceNom = P084F4_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P084F4_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
            {
               brk84F6 = false ;
               A396EmprCod = P084F4_A396EmprCod[0] ;
               A44AlbRecCod = P084F4_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
            {
               AV72Option = A3613AlbRefDsc ;
               AV73Options.add(AV72Option, 0);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F6 )
         {
            brk84F6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBRTARTDOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbRTartD = AV68SearchTxt ;
      AV25TFAlbRTartD_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk84F8 = false ;
         A252CliCod = P084F5_A252CliCod[0] ;
         A840TrnCod = P084F5_A840TrnCod[0] ;
         n840TrnCod = P084F5_n840TrnCod[0] ;
         A970ProceCod = P084F5_A970ProceCod[0] ;
         n970ProceCod = P084F5_n970ProceCod[0] ;
         A6263AlbRTartC = P084F5_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F5_n6263AlbRTartC[0] ;
         A396EmprCod = P084F5_A396EmprCod[0] ;
         A6179AlbrHor = P084F5_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084F5_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084F5_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F5_A57AlbRUniDis[0] ;
         A971ProceNom = P084F5_A971ProceNom[0] ;
         n971ProceNom = P084F5_n971ProceNom[0] ;
         A841TrnNom = P084F5_A841TrnNom[0] ;
         n841TrnNom = P084F5_n841TrnNom[0] ;
         A6264AlbRTartD = P084F5_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F5_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084F5_A3613AlbRefDsc[0] ;
         A45AlbRef = P084F5_A45AlbRef[0] ;
         A49AlbRFen = P084F5_A49AlbRFen[0] ;
         A279CliNom = P084F5_A279CliNom[0] ;
         A44AlbRecCod = P084F5_A44AlbRecCod[0] ;
         A47AlbREst = P084F5_A47AlbREst[0] ;
         A56AlbRUni = P084F5_A56AlbRUni[0] ;
         A55AlbRReo = P084F5_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F5_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F5_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F5_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F5_A60AlbRUniUti[0] ;
         A279CliNom = P084F5_A279CliNom[0] ;
         A6264AlbRTartD = P084F5_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F5_n6264AlbRTartD[0] ;
         A841TrnNom = P084F5_A841TrnNom[0] ;
         n841TrnNom = P084F5_n841TrnNom[0] ;
         A971ProceNom = P084F5_A971ProceNom[0] ;
         n971ProceNom = P084F5_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P084F5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P084F5_A6263AlbRTartC[0] == A6263AlbRTartC ) )
            {
               brk84F8 = false ;
               A44AlbRecCod = P084F5_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A6264AlbRTartD)==0) )
            {
               AV72Option = A6264AlbRTartD ;
               AV71InsertIndex = 1 ;
               while ( ( AV71InsertIndex <= AV73Options.size() ) && ( GXutil.strcmp((String)AV73Options.elementAt(-1+AV71InsertIndex), AV72Option) < 0 ) )
               {
                  AV71InsertIndex = (int)(AV71InsertIndex+1) ;
               }
               AV73Options.add(AV72Option, AV71InsertIndex);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), AV71InsertIndex);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F8 )
         {
            brk84F8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFTrnNom = AV68SearchTxt ;
      AV27TFTrnNom_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk84F10 = false ;
         A252CliCod = P084F6_A252CliCod[0] ;
         A6263AlbRTartC = P084F6_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F6_n6263AlbRTartC[0] ;
         A970ProceCod = P084F6_A970ProceCod[0] ;
         n970ProceCod = P084F6_n970ProceCod[0] ;
         A840TrnCod = P084F6_A840TrnCod[0] ;
         n840TrnCod = P084F6_n840TrnCod[0] ;
         A396EmprCod = P084F6_A396EmprCod[0] ;
         A6179AlbrHor = P084F6_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084F6_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084F6_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F6_A57AlbRUniDis[0] ;
         A971ProceNom = P084F6_A971ProceNom[0] ;
         n971ProceNom = P084F6_n971ProceNom[0] ;
         A841TrnNom = P084F6_A841TrnNom[0] ;
         n841TrnNom = P084F6_n841TrnNom[0] ;
         A6264AlbRTartD = P084F6_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F6_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084F6_A3613AlbRefDsc[0] ;
         A45AlbRef = P084F6_A45AlbRef[0] ;
         A49AlbRFen = P084F6_A49AlbRFen[0] ;
         A279CliNom = P084F6_A279CliNom[0] ;
         A44AlbRecCod = P084F6_A44AlbRecCod[0] ;
         A47AlbREst = P084F6_A47AlbREst[0] ;
         A56AlbRUni = P084F6_A56AlbRUni[0] ;
         A55AlbRReo = P084F6_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F6_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F6_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F6_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F6_A60AlbRUniUti[0] ;
         A279CliNom = P084F6_A279CliNom[0] ;
         A6264AlbRTartD = P084F6_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F6_n6264AlbRTartD[0] ;
         A841TrnNom = P084F6_A841TrnNom[0] ;
         n841TrnNom = P084F6_n841TrnNom[0] ;
         A971ProceNom = P084F6_A971ProceNom[0] ;
         n971ProceNom = P084F6_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P084F6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P084F6_A840TrnCod[0] == A840TrnCod ) )
            {
               brk84F10 = false ;
               A44AlbRecCod = P084F6_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
            {
               AV72Option = A841TrnNom ;
               AV71InsertIndex = 1 ;
               while ( ( AV71InsertIndex <= AV73Options.size() ) && ( GXutil.strcmp((String)AV73Options.elementAt(-1+AV71InsertIndex), AV72Option) < 0 ) )
               {
                  AV71InsertIndex = (int)(AV71InsertIndex+1) ;
               }
               AV73Options.add(AV72Option, AV71InsertIndex);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), AV71InsertIndex);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F10 )
         {
            brk84F10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPROCENOMOPTIONS' Routine */
      returnInSub = false ;
      AV28TFProceNom = AV68SearchTxt ;
      AV29TFProceNom_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk84F12 = false ;
         A252CliCod = P084F7_A252CliCod[0] ;
         A6263AlbRTartC = P084F7_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F7_n6263AlbRTartC[0] ;
         A840TrnCod = P084F7_A840TrnCod[0] ;
         n840TrnCod = P084F7_n840TrnCod[0] ;
         A970ProceCod = P084F7_A970ProceCod[0] ;
         n970ProceCod = P084F7_n970ProceCod[0] ;
         A396EmprCod = P084F7_A396EmprCod[0] ;
         A6179AlbrHor = P084F7_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084F7_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084F7_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F7_A57AlbRUniDis[0] ;
         A971ProceNom = P084F7_A971ProceNom[0] ;
         n971ProceNom = P084F7_n971ProceNom[0] ;
         A841TrnNom = P084F7_A841TrnNom[0] ;
         n841TrnNom = P084F7_n841TrnNom[0] ;
         A6264AlbRTartD = P084F7_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F7_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084F7_A3613AlbRefDsc[0] ;
         A45AlbRef = P084F7_A45AlbRef[0] ;
         A49AlbRFen = P084F7_A49AlbRFen[0] ;
         A279CliNom = P084F7_A279CliNom[0] ;
         A44AlbRecCod = P084F7_A44AlbRecCod[0] ;
         A47AlbREst = P084F7_A47AlbREst[0] ;
         A56AlbRUni = P084F7_A56AlbRUni[0] ;
         A55AlbRReo = P084F7_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F7_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F7_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F7_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F7_A60AlbRUniUti[0] ;
         A279CliNom = P084F7_A279CliNom[0] ;
         A6264AlbRTartD = P084F7_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F7_n6264AlbRTartD[0] ;
         A841TrnNom = P084F7_A841TrnNom[0] ;
         n841TrnNom = P084F7_n841TrnNom[0] ;
         A971ProceNom = P084F7_A971ProceNom[0] ;
         n971ProceNom = P084F7_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P084F7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P084F7_A970ProceCod[0] == A970ProceCod ) )
            {
               brk84F12 = false ;
               A44AlbRecCod = P084F7_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A971ProceNom)==0) )
            {
               AV72Option = A971ProceNom ;
               AV71InsertIndex = 1 ;
               while ( ( AV71InsertIndex <= AV73Options.size() ) && ( GXutil.strcmp((String)AV73Options.elementAt(-1+AV71InsertIndex), AV72Option) < 0 ) )
               {
                  AV71InsertIndex = (int)(AV71InsertIndex+1) ;
               }
               AV73Options.add(AV72Option, AV71InsertIndex);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), AV71InsertIndex);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F12 )
         {
            brk84F12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBRUSUOPTIONS' Routine */
      returnInSub = false ;
      AV52TFAlbrUsu = AV68SearchTxt ;
      AV53TFAlbrUsu_Sel = "" ;
      AV130Webconalbds_1_filterfulltext = AV125FilterFullText ;
      AV131Webconalbds_2_tfalbreccod = AV10TFAlbRecCod ;
      AV132Webconalbds_3_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV133Webconalbds_4_tfclinom = AV14TFCliNom ;
      AV134Webconalbds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV135Webconalbds_6_tfalbrfen = AV16TFAlbRFen ;
      AV136Webconalbds_7_tfalbrreo_sels = AV19TFAlbRReo_Sels ;
      AV137Webconalbds_8_tfalbref = AV20TFAlbRef ;
      AV138Webconalbds_9_tfalbref_sel = AV21TFAlbRef_Sel ;
      AV139Webconalbds_10_tfalbrefdsc = AV22TFAlbRefDsc ;
      AV140Webconalbds_11_tfalbrefdsc_sel = AV23TFAlbRefDsc_Sel ;
      AV141Webconalbds_12_tfalbrtartd = AV24TFAlbRTartD ;
      AV142Webconalbds_13_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV143Webconalbds_14_tftrnnom = AV26TFTrnNom ;
      AV144Webconalbds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV145Webconalbds_16_tfprocenom = AV28TFProceNom ;
      AV146Webconalbds_17_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV147Webconalbds_18_tfalbrunient = AV30TFAlbRUniEnt ;
      AV148Webconalbds_19_tfalbrunient_to = AV31TFAlbRUniEnt_To ;
      AV149Webconalbds_20_tfalbruni_sels = AV121TFAlbRUni_Sels ;
      AV150Webconalbds_21_tfalbruniuti = AV34TFAlbRUniUti ;
      AV151Webconalbds_22_tfalbruniuti_to = AV35TFAlbRUniUti_To ;
      AV152Webconalbds_23_tfalbrunidis = AV36TFAlbRUniDis ;
      AV153Webconalbds_24_tfalbrunidis_to = AV37TFAlbRUniDis_To ;
      AV154Webconalbds_25_tfalbrpieent = AV38TFAlbRPieEnt ;
      AV155Webconalbds_26_tfalbrpieent_to = AV39TFAlbRPieEnt_To ;
      AV156Webconalbds_27_tfalbrpieuti = AV40TFAlbRPieUti ;
      AV157Webconalbds_28_tfalbrpieuti_to = AV41TFAlbRPieUti_To ;
      AV158Webconalbds_29_tfalbrpiedis = AV42TFAlbRPieDis ;
      AV159Webconalbds_30_tfalbrpiedis_to = AV43TFAlbRPieDis_To ;
      AV160Webconalbds_31_tfalbrest_sels = AV45TFAlbREst_Sels ;
      AV161Webconalbds_32_tfalbrusu = AV52TFAlbrUsu ;
      AV162Webconalbds_33_tfalbrusu_sel = AV53TFAlbrUsu_Sel ;
      AV163Webconalbds_34_tfalbrhor = AV54TFAlbrHor ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV136Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV149Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV160Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV131Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to) ,
                                           AV134Webconalbds_5_tfclinom_sel ,
                                           AV133Webconalbds_4_tfclinom ,
                                           AV135Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV136Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV138Webconalbds_9_tfalbref_sel ,
                                           AV137Webconalbds_8_tfalbref ,
                                           AV140Webconalbds_11_tfalbrefdsc_sel ,
                                           AV139Webconalbds_10_tfalbrefdsc ,
                                           AV142Webconalbds_13_tfalbrtartd_sel ,
                                           AV141Webconalbds_12_tfalbrtartd ,
                                           AV144Webconalbds_15_tftrnnom_sel ,
                                           AV143Webconalbds_14_tftrnnom ,
                                           AV146Webconalbds_17_tfprocenom_sel ,
                                           AV145Webconalbds_16_tfprocenom ,
                                           AV147Webconalbds_18_tfalbrunient ,
                                           AV148Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV149Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV150Webconalbds_21_tfalbruniuti ,
                                           AV151Webconalbds_22_tfalbruniuti_to ,
                                           AV152Webconalbds_23_tfalbrunidis ,
                                           AV153Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV154Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV160Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV162Webconalbds_33_tfalbrusu_sel ,
                                           AV161Webconalbds_32_tfalbrusu ,
                                           AV163Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           AV130Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV133Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Webconalbds_4_tfclinom), 30, "%") ;
      lV137Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV137Webconalbds_8_tfalbref), 16, "%") ;
      lV139Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV139Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV141Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV141Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV143Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Webconalbds_14_tftrnnom), 30, "%") ;
      lV145Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV145Webconalbds_16_tfprocenom), 30, "%") ;
      lV161Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV161Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084F8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV131Webconalbds_2_tfalbreccod), Integer.valueOf(AV132Webconalbds_3_tfalbreccod_to), lV133Webconalbds_4_tfclinom, AV134Webconalbds_5_tfclinom_sel, AV135Webconalbds_6_tfalbrfen, lV137Webconalbds_8_tfalbref, AV138Webconalbds_9_tfalbref_sel, lV139Webconalbds_10_tfalbrefdsc, AV140Webconalbds_11_tfalbrefdsc_sel, lV141Webconalbds_12_tfalbrtartd, AV142Webconalbds_13_tfalbrtartd_sel, lV143Webconalbds_14_tftrnnom, AV144Webconalbds_15_tftrnnom_sel, lV145Webconalbds_16_tfprocenom, AV146Webconalbds_17_tfprocenom_sel, AV147Webconalbds_18_tfalbrunient, AV148Webconalbds_19_tfalbrunient_to, AV150Webconalbds_21_tfalbruniuti, AV151Webconalbds_22_tfalbruniuti_to, AV152Webconalbds_23_tfalbrunidis, AV153Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV154Webconalbds_25_tfalbrpieent), Integer.valueOf(AV155Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV156Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV157Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV158Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV159Webconalbds_30_tfalbrpiedis_to), lV161Webconalbds_32_tfalbrusu, AV162Webconalbds_33_tfalbrusu_sel, AV163Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk84F14 = false ;
         A396EmprCod = P084F8_A396EmprCod[0] ;
         A252CliCod = P084F8_A252CliCod[0] ;
         A6263AlbRTartC = P084F8_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084F8_n6263AlbRTartC[0] ;
         A840TrnCod = P084F8_A840TrnCod[0] ;
         n840TrnCod = P084F8_n840TrnCod[0] ;
         A970ProceCod = P084F8_A970ProceCod[0] ;
         n970ProceCod = P084F8_n970ProceCod[0] ;
         A6178AlbrUsu = P084F8_A6178AlbrUsu[0] ;
         A6179AlbrHor = P084F8_A6179AlbrHor[0] ;
         A51AlbRPieDis = P084F8_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084F8_A57AlbRUniDis[0] ;
         A971ProceNom = P084F8_A971ProceNom[0] ;
         n971ProceNom = P084F8_n971ProceNom[0] ;
         A841TrnNom = P084F8_A841TrnNom[0] ;
         n841TrnNom = P084F8_n841TrnNom[0] ;
         A6264AlbRTartD = P084F8_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F8_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084F8_A3613AlbRefDsc[0] ;
         A45AlbRef = P084F8_A45AlbRef[0] ;
         A49AlbRFen = P084F8_A49AlbRFen[0] ;
         A279CliNom = P084F8_A279CliNom[0] ;
         A44AlbRecCod = P084F8_A44AlbRecCod[0] ;
         A47AlbREst = P084F8_A47AlbREst[0] ;
         A56AlbRUni = P084F8_A56AlbRUni[0] ;
         A55AlbRReo = P084F8_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084F8_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084F8_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084F8_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084F8_A60AlbRUniUti[0] ;
         A279CliNom = P084F8_A279CliNom[0] ;
         A6264AlbRTartD = P084F8_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084F8_n6264AlbRTartD[0] ;
         A841TrnNom = P084F8_A841TrnNom[0] ;
         n841TrnNom = P084F8_n841TrnNom[0] ;
         A971ProceNom = P084F8_A971ProceNom[0] ;
         n971ProceNom = P084F8_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV130Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV130Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV130Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV80count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P084F8_A6178AlbrUsu[0], A6178AlbrUsu) == 0 ) )
            {
               brk84F14 = false ;
               A396EmprCod = P084F8_A396EmprCod[0] ;
               A44AlbRecCod = P084F8_A44AlbRecCod[0] ;
               AV80count = (long)(AV80count+1) ;
               brk84F14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A6178AlbrUsu)==0) )
            {
               AV72Option = A6178AlbrUsu ;
               AV73Options.add(AV72Option, 0);
               AV78OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV80count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV73Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk84F14 )
         {
            brk84F14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webconalbgetfilterdata.this.AV74OptionsJson;
      this.aP4[0] = webconalbgetfilterdata.this.AV77OptionsDescJson;
      this.aP5[0] = webconalbgetfilterdata.this.AV79OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV74OptionsJson = "" ;
      AV77OptionsDescJson = "" ;
      AV79OptionIndexesJson = "" ;
      AV73Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV76OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV81Session = httpContext.getWebSession();
      AV83GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV84GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV125FilterFullText = "" ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV16TFAlbRFen = GXutil.nullDate() ;
      AV18TFAlbRReo_SelsJson = "" ;
      AV19TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20TFAlbRef = "" ;
      AV21TFAlbRef_Sel = "" ;
      AV22TFAlbRefDsc = "" ;
      AV23TFAlbRefDsc_Sel = "" ;
      AV24TFAlbRTartD = "" ;
      AV25TFAlbRTartD_Sel = "" ;
      AV26TFTrnNom = "" ;
      AV27TFTrnNom_Sel = "" ;
      AV28TFProceNom = "" ;
      AV29TFProceNom_Sel = "" ;
      AV30TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV31TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV120TFAlbRUni_SelsJson = "" ;
      AV121TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34TFAlbRUniUti = DecimalUtil.ZERO ;
      AV35TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV36TFAlbRUniDis = DecimalUtil.ZERO ;
      AV37TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV44TFAlbREst_SelsJson = "" ;
      AV45TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV52TFAlbrUsu = "" ;
      AV53TFAlbrUsu_Sel = "" ;
      AV54TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      AV130Webconalbds_1_filterfulltext = "" ;
      AV133Webconalbds_4_tfclinom = "" ;
      AV134Webconalbds_5_tfclinom_sel = "" ;
      AV135Webconalbds_6_tfalbrfen = GXutil.nullDate() ;
      AV136Webconalbds_7_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV137Webconalbds_8_tfalbref = "" ;
      AV138Webconalbds_9_tfalbref_sel = "" ;
      AV139Webconalbds_10_tfalbrefdsc = "" ;
      AV140Webconalbds_11_tfalbrefdsc_sel = "" ;
      AV141Webconalbds_12_tfalbrtartd = "" ;
      AV142Webconalbds_13_tfalbrtartd_sel = "" ;
      AV143Webconalbds_14_tftrnnom = "" ;
      AV144Webconalbds_15_tftrnnom_sel = "" ;
      AV145Webconalbds_16_tfprocenom = "" ;
      AV146Webconalbds_17_tfprocenom_sel = "" ;
      AV147Webconalbds_18_tfalbrunient = DecimalUtil.ZERO ;
      AV148Webconalbds_19_tfalbrunient_to = DecimalUtil.ZERO ;
      AV149Webconalbds_20_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV150Webconalbds_21_tfalbruniuti = DecimalUtil.ZERO ;
      AV151Webconalbds_22_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV152Webconalbds_23_tfalbrunidis = DecimalUtil.ZERO ;
      AV153Webconalbds_24_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV160Webconalbds_31_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV161Webconalbds_32_tfalbrusu = "" ;
      AV162Webconalbds_33_tfalbrusu_sel = "" ;
      AV163Webconalbds_34_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      lV130Webconalbds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV133Webconalbds_4_tfclinom = "" ;
      lV137Webconalbds_8_tfalbref = "" ;
      lV139Webconalbds_10_tfalbrefdsc = "" ;
      lV141Webconalbds_12_tfalbrtartd = "" ;
      lV143Webconalbds_14_tftrnnom = "" ;
      lV145Webconalbds_16_tfprocenom = "" ;
      lV161Webconalbds_32_tfalbrusu = "" ;
      A55AlbRReo = "" ;
      A56AlbRUni = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A6178AlbrUsu = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A57AlbRUniDis = DecimalUtil.ZERO ;
      P084F2_A396EmprCod = new String[] {""} ;
      P084F2_A252CliCod = new int[1] ;
      P084F2_A6263AlbRTartC = new short[1] ;
      P084F2_n6263AlbRTartC = new boolean[] {false} ;
      P084F2_A840TrnCod = new short[1] ;
      P084F2_n840TrnCod = new boolean[] {false} ;
      P084F2_A970ProceCod = new short[1] ;
      P084F2_n970ProceCod = new boolean[] {false} ;
      P084F2_A279CliNom = new String[] {""} ;
      P084F2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F2_A6178AlbrUsu = new String[] {""} ;
      P084F2_A51AlbRPieDis = new int[1] ;
      P084F2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F2_A971ProceNom = new String[] {""} ;
      P084F2_n971ProceNom = new boolean[] {false} ;
      P084F2_A841TrnNom = new String[] {""} ;
      P084F2_n841TrnNom = new boolean[] {false} ;
      P084F2_A6264AlbRTartD = new String[] {""} ;
      P084F2_n6264AlbRTartD = new boolean[] {false} ;
      P084F2_A3613AlbRefDsc = new String[] {""} ;
      P084F2_A45AlbRef = new String[] {""} ;
      P084F2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F2_A44AlbRecCod = new int[1] ;
      P084F2_A47AlbREst = new byte[1] ;
      P084F2_A56AlbRUni = new String[] {""} ;
      P084F2_A55AlbRReo = new String[] {""} ;
      P084F2_A52AlbRPieEnt = new int[1] ;
      P084F2_A54AlbRPieUti = new int[1] ;
      P084F2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV72Option = "" ;
      P084F3_A396EmprCod = new String[] {""} ;
      P084F3_A252CliCod = new int[1] ;
      P084F3_A6263AlbRTartC = new short[1] ;
      P084F3_n6263AlbRTartC = new boolean[] {false} ;
      P084F3_A840TrnCod = new short[1] ;
      P084F3_n840TrnCod = new boolean[] {false} ;
      P084F3_A970ProceCod = new short[1] ;
      P084F3_n970ProceCod = new boolean[] {false} ;
      P084F3_A45AlbRef = new String[] {""} ;
      P084F3_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F3_A6178AlbrUsu = new String[] {""} ;
      P084F3_A51AlbRPieDis = new int[1] ;
      P084F3_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F3_A971ProceNom = new String[] {""} ;
      P084F3_n971ProceNom = new boolean[] {false} ;
      P084F3_A841TrnNom = new String[] {""} ;
      P084F3_n841TrnNom = new boolean[] {false} ;
      P084F3_A6264AlbRTartD = new String[] {""} ;
      P084F3_n6264AlbRTartD = new boolean[] {false} ;
      P084F3_A3613AlbRefDsc = new String[] {""} ;
      P084F3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F3_A279CliNom = new String[] {""} ;
      P084F3_A44AlbRecCod = new int[1] ;
      P084F3_A47AlbREst = new byte[1] ;
      P084F3_A56AlbRUni = new String[] {""} ;
      P084F3_A55AlbRReo = new String[] {""} ;
      P084F3_A52AlbRPieEnt = new int[1] ;
      P084F3_A54AlbRPieUti = new int[1] ;
      P084F3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F4_A396EmprCod = new String[] {""} ;
      P084F4_A252CliCod = new int[1] ;
      P084F4_A6263AlbRTartC = new short[1] ;
      P084F4_n6263AlbRTartC = new boolean[] {false} ;
      P084F4_A840TrnCod = new short[1] ;
      P084F4_n840TrnCod = new boolean[] {false} ;
      P084F4_A970ProceCod = new short[1] ;
      P084F4_n970ProceCod = new boolean[] {false} ;
      P084F4_A3613AlbRefDsc = new String[] {""} ;
      P084F4_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F4_A6178AlbrUsu = new String[] {""} ;
      P084F4_A51AlbRPieDis = new int[1] ;
      P084F4_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F4_A971ProceNom = new String[] {""} ;
      P084F4_n971ProceNom = new boolean[] {false} ;
      P084F4_A841TrnNom = new String[] {""} ;
      P084F4_n841TrnNom = new boolean[] {false} ;
      P084F4_A6264AlbRTartD = new String[] {""} ;
      P084F4_n6264AlbRTartD = new boolean[] {false} ;
      P084F4_A45AlbRef = new String[] {""} ;
      P084F4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F4_A279CliNom = new String[] {""} ;
      P084F4_A44AlbRecCod = new int[1] ;
      P084F4_A47AlbREst = new byte[1] ;
      P084F4_A56AlbRUni = new String[] {""} ;
      P084F4_A55AlbRReo = new String[] {""} ;
      P084F4_A52AlbRPieEnt = new int[1] ;
      P084F4_A54AlbRPieUti = new int[1] ;
      P084F4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F5_A252CliCod = new int[1] ;
      P084F5_A840TrnCod = new short[1] ;
      P084F5_n840TrnCod = new boolean[] {false} ;
      P084F5_A970ProceCod = new short[1] ;
      P084F5_n970ProceCod = new boolean[] {false} ;
      P084F5_A6263AlbRTartC = new short[1] ;
      P084F5_n6263AlbRTartC = new boolean[] {false} ;
      P084F5_A396EmprCod = new String[] {""} ;
      P084F5_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F5_A6178AlbrUsu = new String[] {""} ;
      P084F5_A51AlbRPieDis = new int[1] ;
      P084F5_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F5_A971ProceNom = new String[] {""} ;
      P084F5_n971ProceNom = new boolean[] {false} ;
      P084F5_A841TrnNom = new String[] {""} ;
      P084F5_n841TrnNom = new boolean[] {false} ;
      P084F5_A6264AlbRTartD = new String[] {""} ;
      P084F5_n6264AlbRTartD = new boolean[] {false} ;
      P084F5_A3613AlbRefDsc = new String[] {""} ;
      P084F5_A45AlbRef = new String[] {""} ;
      P084F5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F5_A279CliNom = new String[] {""} ;
      P084F5_A44AlbRecCod = new int[1] ;
      P084F5_A47AlbREst = new byte[1] ;
      P084F5_A56AlbRUni = new String[] {""} ;
      P084F5_A55AlbRReo = new String[] {""} ;
      P084F5_A52AlbRPieEnt = new int[1] ;
      P084F5_A54AlbRPieUti = new int[1] ;
      P084F5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F6_A252CliCod = new int[1] ;
      P084F6_A6263AlbRTartC = new short[1] ;
      P084F6_n6263AlbRTartC = new boolean[] {false} ;
      P084F6_A970ProceCod = new short[1] ;
      P084F6_n970ProceCod = new boolean[] {false} ;
      P084F6_A840TrnCod = new short[1] ;
      P084F6_n840TrnCod = new boolean[] {false} ;
      P084F6_A396EmprCod = new String[] {""} ;
      P084F6_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F6_A6178AlbrUsu = new String[] {""} ;
      P084F6_A51AlbRPieDis = new int[1] ;
      P084F6_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F6_A971ProceNom = new String[] {""} ;
      P084F6_n971ProceNom = new boolean[] {false} ;
      P084F6_A841TrnNom = new String[] {""} ;
      P084F6_n841TrnNom = new boolean[] {false} ;
      P084F6_A6264AlbRTartD = new String[] {""} ;
      P084F6_n6264AlbRTartD = new boolean[] {false} ;
      P084F6_A3613AlbRefDsc = new String[] {""} ;
      P084F6_A45AlbRef = new String[] {""} ;
      P084F6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F6_A279CliNom = new String[] {""} ;
      P084F6_A44AlbRecCod = new int[1] ;
      P084F6_A47AlbREst = new byte[1] ;
      P084F6_A56AlbRUni = new String[] {""} ;
      P084F6_A55AlbRReo = new String[] {""} ;
      P084F6_A52AlbRPieEnt = new int[1] ;
      P084F6_A54AlbRPieUti = new int[1] ;
      P084F6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F7_A252CliCod = new int[1] ;
      P084F7_A6263AlbRTartC = new short[1] ;
      P084F7_n6263AlbRTartC = new boolean[] {false} ;
      P084F7_A840TrnCod = new short[1] ;
      P084F7_n840TrnCod = new boolean[] {false} ;
      P084F7_A970ProceCod = new short[1] ;
      P084F7_n970ProceCod = new boolean[] {false} ;
      P084F7_A396EmprCod = new String[] {""} ;
      P084F7_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F7_A6178AlbrUsu = new String[] {""} ;
      P084F7_A51AlbRPieDis = new int[1] ;
      P084F7_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F7_A971ProceNom = new String[] {""} ;
      P084F7_n971ProceNom = new boolean[] {false} ;
      P084F7_A841TrnNom = new String[] {""} ;
      P084F7_n841TrnNom = new boolean[] {false} ;
      P084F7_A6264AlbRTartD = new String[] {""} ;
      P084F7_n6264AlbRTartD = new boolean[] {false} ;
      P084F7_A3613AlbRefDsc = new String[] {""} ;
      P084F7_A45AlbRef = new String[] {""} ;
      P084F7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F7_A279CliNom = new String[] {""} ;
      P084F7_A44AlbRecCod = new int[1] ;
      P084F7_A47AlbREst = new byte[1] ;
      P084F7_A56AlbRUni = new String[] {""} ;
      P084F7_A55AlbRReo = new String[] {""} ;
      P084F7_A52AlbRPieEnt = new int[1] ;
      P084F7_A54AlbRPieUti = new int[1] ;
      P084F7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F7_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F8_A396EmprCod = new String[] {""} ;
      P084F8_A252CliCod = new int[1] ;
      P084F8_A6263AlbRTartC = new short[1] ;
      P084F8_n6263AlbRTartC = new boolean[] {false} ;
      P084F8_A840TrnCod = new short[1] ;
      P084F8_n840TrnCod = new boolean[] {false} ;
      P084F8_A970ProceCod = new short[1] ;
      P084F8_n970ProceCod = new boolean[] {false} ;
      P084F8_A6178AlbrUsu = new String[] {""} ;
      P084F8_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084F8_A51AlbRPieDis = new int[1] ;
      P084F8_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F8_A971ProceNom = new String[] {""} ;
      P084F8_n971ProceNom = new boolean[] {false} ;
      P084F8_A841TrnNom = new String[] {""} ;
      P084F8_n841TrnNom = new boolean[] {false} ;
      P084F8_A6264AlbRTartD = new String[] {""} ;
      P084F8_n6264AlbRTartD = new boolean[] {false} ;
      P084F8_A3613AlbRefDsc = new String[] {""} ;
      P084F8_A45AlbRef = new String[] {""} ;
      P084F8_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084F8_A279CliNom = new String[] {""} ;
      P084F8_A44AlbRecCod = new int[1] ;
      P084F8_A47AlbREst = new byte[1] ;
      P084F8_A56AlbRUni = new String[] {""} ;
      P084F8_A55AlbRReo = new String[] {""} ;
      P084F8_A52AlbRPieEnt = new int[1] ;
      P084F8_A54AlbRPieUti = new int[1] ;
      P084F8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084F8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webconalbgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P084F2_A396EmprCod, P084F2_A252CliCod, P084F2_A6263AlbRTartC, P084F2_n6263AlbRTartC, P084F2_A840TrnCod, P084F2_n840TrnCod, P084F2_A970ProceCod, P084F2_n970ProceCod, P084F2_A279CliNom, P084F2_A6179AlbrHor,
            P084F2_A6178AlbrUsu, P084F2_A51AlbRPieDis, P084F2_A57AlbRUniDis, P084F2_A971ProceNom, P084F2_n971ProceNom, P084F2_A841TrnNom, P084F2_n841TrnNom, P084F2_A6264AlbRTartD, P084F2_n6264AlbRTartD, P084F2_A3613AlbRefDsc,
            P084F2_A45AlbRef, P084F2_A49AlbRFen, P084F2_A44AlbRecCod, P084F2_A47AlbREst, P084F2_A56AlbRUni, P084F2_A55AlbRReo, P084F2_A52AlbRPieEnt, P084F2_A54AlbRPieUti, P084F2_A58AlbRUniEnt, P084F2_A60AlbRUniUti
            }
            , new Object[] {
            P084F3_A396EmprCod, P084F3_A252CliCod, P084F3_A6263AlbRTartC, P084F3_n6263AlbRTartC, P084F3_A840TrnCod, P084F3_n840TrnCod, P084F3_A970ProceCod, P084F3_n970ProceCod, P084F3_A45AlbRef, P084F3_A6179AlbrHor,
            P084F3_A6178AlbrUsu, P084F3_A51AlbRPieDis, P084F3_A57AlbRUniDis, P084F3_A971ProceNom, P084F3_n971ProceNom, P084F3_A841TrnNom, P084F3_n841TrnNom, P084F3_A6264AlbRTartD, P084F3_n6264AlbRTartD, P084F3_A3613AlbRefDsc,
            P084F3_A49AlbRFen, P084F3_A279CliNom, P084F3_A44AlbRecCod, P084F3_A47AlbREst, P084F3_A56AlbRUni, P084F3_A55AlbRReo, P084F3_A52AlbRPieEnt, P084F3_A54AlbRPieUti, P084F3_A58AlbRUniEnt, P084F3_A60AlbRUniUti
            }
            , new Object[] {
            P084F4_A396EmprCod, P084F4_A252CliCod, P084F4_A6263AlbRTartC, P084F4_n6263AlbRTartC, P084F4_A840TrnCod, P084F4_n840TrnCod, P084F4_A970ProceCod, P084F4_n970ProceCod, P084F4_A3613AlbRefDsc, P084F4_A6179AlbrHor,
            P084F4_A6178AlbrUsu, P084F4_A51AlbRPieDis, P084F4_A57AlbRUniDis, P084F4_A971ProceNom, P084F4_n971ProceNom, P084F4_A841TrnNom, P084F4_n841TrnNom, P084F4_A6264AlbRTartD, P084F4_n6264AlbRTartD, P084F4_A45AlbRef,
            P084F4_A49AlbRFen, P084F4_A279CliNom, P084F4_A44AlbRecCod, P084F4_A47AlbREst, P084F4_A56AlbRUni, P084F4_A55AlbRReo, P084F4_A52AlbRPieEnt, P084F4_A54AlbRPieUti, P084F4_A58AlbRUniEnt, P084F4_A60AlbRUniUti
            }
            , new Object[] {
            P084F5_A252CliCod, P084F5_A840TrnCod, P084F5_n840TrnCod, P084F5_A970ProceCod, P084F5_n970ProceCod, P084F5_A6263AlbRTartC, P084F5_n6263AlbRTartC, P084F5_A396EmprCod, P084F5_A6179AlbrHor, P084F5_A6178AlbrUsu,
            P084F5_A51AlbRPieDis, P084F5_A57AlbRUniDis, P084F5_A971ProceNom, P084F5_n971ProceNom, P084F5_A841TrnNom, P084F5_n841TrnNom, P084F5_A6264AlbRTartD, P084F5_n6264AlbRTartD, P084F5_A3613AlbRefDsc, P084F5_A45AlbRef,
            P084F5_A49AlbRFen, P084F5_A279CliNom, P084F5_A44AlbRecCod, P084F5_A47AlbREst, P084F5_A56AlbRUni, P084F5_A55AlbRReo, P084F5_A52AlbRPieEnt, P084F5_A54AlbRPieUti, P084F5_A58AlbRUniEnt, P084F5_A60AlbRUniUti
            }
            , new Object[] {
            P084F6_A252CliCod, P084F6_A6263AlbRTartC, P084F6_n6263AlbRTartC, P084F6_A970ProceCod, P084F6_n970ProceCod, P084F6_A840TrnCod, P084F6_n840TrnCod, P084F6_A396EmprCod, P084F6_A6179AlbrHor, P084F6_A6178AlbrUsu,
            P084F6_A51AlbRPieDis, P084F6_A57AlbRUniDis, P084F6_A971ProceNom, P084F6_n971ProceNom, P084F6_A841TrnNom, P084F6_n841TrnNom, P084F6_A6264AlbRTartD, P084F6_n6264AlbRTartD, P084F6_A3613AlbRefDsc, P084F6_A45AlbRef,
            P084F6_A49AlbRFen, P084F6_A279CliNom, P084F6_A44AlbRecCod, P084F6_A47AlbREst, P084F6_A56AlbRUni, P084F6_A55AlbRReo, P084F6_A52AlbRPieEnt, P084F6_A54AlbRPieUti, P084F6_A58AlbRUniEnt, P084F6_A60AlbRUniUti
            }
            , new Object[] {
            P084F7_A252CliCod, P084F7_A6263AlbRTartC, P084F7_n6263AlbRTartC, P084F7_A840TrnCod, P084F7_n840TrnCod, P084F7_A970ProceCod, P084F7_n970ProceCod, P084F7_A396EmprCod, P084F7_A6179AlbrHor, P084F7_A6178AlbrUsu,
            P084F7_A51AlbRPieDis, P084F7_A57AlbRUniDis, P084F7_A971ProceNom, P084F7_n971ProceNom, P084F7_A841TrnNom, P084F7_n841TrnNom, P084F7_A6264AlbRTartD, P084F7_n6264AlbRTartD, P084F7_A3613AlbRefDsc, P084F7_A45AlbRef,
            P084F7_A49AlbRFen, P084F7_A279CliNom, P084F7_A44AlbRecCod, P084F7_A47AlbREst, P084F7_A56AlbRUni, P084F7_A55AlbRReo, P084F7_A52AlbRPieEnt, P084F7_A54AlbRPieUti, P084F7_A58AlbRUniEnt, P084F7_A60AlbRUniUti
            }
            , new Object[] {
            P084F8_A396EmprCod, P084F8_A252CliCod, P084F8_A6263AlbRTartC, P084F8_n6263AlbRTartC, P084F8_A840TrnCod, P084F8_n840TrnCod, P084F8_A970ProceCod, P084F8_n970ProceCod, P084F8_A6178AlbrUsu, P084F8_A6179AlbrHor,
            P084F8_A51AlbRPieDis, P084F8_A57AlbRUniDis, P084F8_A971ProceNom, P084F8_n971ProceNom, P084F8_A841TrnNom, P084F8_n841TrnNom, P084F8_A6264AlbRTartD, P084F8_n6264AlbRTartD, P084F8_A3613AlbRefDsc, P084F8_A45AlbRef,
            P084F8_A49AlbRFen, P084F8_A279CliNom, P084F8_A44AlbRecCod, P084F8_A47AlbREst, P084F8_A56AlbRUni, P084F8_A55AlbRReo, P084F8_A52AlbRPieEnt, P084F8_A54AlbRPieUti, P084F8_A58AlbRUniEnt, P084F8_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV128GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV38TFAlbRPieEnt ;
   private int AV39TFAlbRPieEnt_To ;
   private int AV40TFAlbRPieUti ;
   private int AV41TFAlbRPieUti_To ;
   private int AV42TFAlbRPieDis ;
   private int AV43TFAlbRPieDis_To ;
   private int AV131Webconalbds_2_tfalbreccod ;
   private int AV132Webconalbds_3_tfalbreccod_to ;
   private int AV154Webconalbds_25_tfalbrpieent ;
   private int AV155Webconalbds_26_tfalbrpieent_to ;
   private int AV156Webconalbds_27_tfalbrpieuti ;
   private int AV157Webconalbds_28_tfalbrpieuti_to ;
   private int AV158Webconalbds_29_tfalbrpiedis ;
   private int AV159Webconalbds_30_tfalbrpiedis_to ;
   private int AV136Webconalbds_7_tfalbrreo_sels_size ;
   private int AV149Webconalbds_20_tfalbruni_sels_size ;
   private int AV160Webconalbds_31_tfalbrest_sels_size ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int A252CliCod ;
   private int AV71InsertIndex ;
   private long AV80count ;
   private java.math.BigDecimal AV30TFAlbRUniEnt ;
   private java.math.BigDecimal AV31TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV34TFAlbRUniUti ;
   private java.math.BigDecimal AV35TFAlbRUniUti_To ;
   private java.math.BigDecimal AV36TFAlbRUniDis ;
   private java.math.BigDecimal AV37TFAlbRUniDis_To ;
   private java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ;
   private java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ;
   private java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ;
   private java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ;
   private java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ;
   private java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV20TFAlbRef ;
   private String AV21TFAlbRef_Sel ;
   private String AV22TFAlbRefDsc ;
   private String AV23TFAlbRefDsc_Sel ;
   private String AV24TFAlbRTartD ;
   private String AV25TFAlbRTartD_Sel ;
   private String AV26TFTrnNom ;
   private String AV27TFTrnNom_Sel ;
   private String AV28TFProceNom ;
   private String AV29TFProceNom_Sel ;
   private String AV52TFAlbrUsu ;
   private String AV53TFAlbrUsu_Sel ;
   private String A279CliNom ;
   private String AV133Webconalbds_4_tfclinom ;
   private String AV134Webconalbds_5_tfclinom_sel ;
   private String AV137Webconalbds_8_tfalbref ;
   private String AV138Webconalbds_9_tfalbref_sel ;
   private String AV139Webconalbds_10_tfalbrefdsc ;
   private String AV140Webconalbds_11_tfalbrefdsc_sel ;
   private String AV141Webconalbds_12_tfalbrtartd ;
   private String AV142Webconalbds_13_tfalbrtartd_sel ;
   private String AV143Webconalbds_14_tftrnnom ;
   private String AV144Webconalbds_15_tftrnnom_sel ;
   private String AV145Webconalbds_16_tfprocenom ;
   private String AV146Webconalbds_17_tfprocenom_sel ;
   private String AV161Webconalbds_32_tfalbrusu ;
   private String AV162Webconalbds_33_tfalbrusu_sel ;
   private String scmdbuf ;
   private String lV133Webconalbds_4_tfclinom ;
   private String lV137Webconalbds_8_tfalbref ;
   private String lV139Webconalbds_10_tfalbrefdsc ;
   private String lV141Webconalbds_12_tfalbrtartd ;
   private String lV143Webconalbds_14_tftrnnom ;
   private String lV145Webconalbds_16_tfprocenom ;
   private String lV161Webconalbds_32_tfalbrusu ;
   private String A55AlbRReo ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A6264AlbRTartD ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A6178AlbrUsu ;
   private String A396EmprCod ;
   private java.util.Date AV54TFAlbrHor ;
   private java.util.Date AV163Webconalbds_34_tfalbrhor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV16TFAlbRFen ;
   private java.util.Date AV135Webconalbds_6_tfalbrfen ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk84F2 ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n6264AlbRTartD ;
   private boolean brk84F4 ;
   private boolean brk84F6 ;
   private boolean brk84F8 ;
   private boolean brk84F10 ;
   private boolean brk84F12 ;
   private boolean brk84F14 ;
   private String AV74OptionsJson ;
   private String AV77OptionsDescJson ;
   private String AV79OptionIndexesJson ;
   private String AV18TFAlbRReo_SelsJson ;
   private String AV120TFAlbRUni_SelsJson ;
   private String AV44TFAlbREst_SelsJson ;
   private String AV70DDOName ;
   private String AV68SearchTxt ;
   private String AV69SearchTxtTo ;
   private String AV125FilterFullText ;
   private String AV130Webconalbds_1_filterfulltext ;
   private String lV130Webconalbds_1_filterfulltext ;
   private String AV72Option ;
   private GXSimpleCollection<Byte> AV45TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ;
   private com.genexus.webpanels.WebSession AV81Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P084F2_A396EmprCod ;
   private int[] P084F2_A252CliCod ;
   private short[] P084F2_A6263AlbRTartC ;
   private boolean[] P084F2_n6263AlbRTartC ;
   private short[] P084F2_A840TrnCod ;
   private boolean[] P084F2_n840TrnCod ;
   private short[] P084F2_A970ProceCod ;
   private boolean[] P084F2_n970ProceCod ;
   private String[] P084F2_A279CliNom ;
   private java.util.Date[] P084F2_A6179AlbrHor ;
   private String[] P084F2_A6178AlbrUsu ;
   private int[] P084F2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F2_A57AlbRUniDis ;
   private String[] P084F2_A971ProceNom ;
   private boolean[] P084F2_n971ProceNom ;
   private String[] P084F2_A841TrnNom ;
   private boolean[] P084F2_n841TrnNom ;
   private String[] P084F2_A6264AlbRTartD ;
   private boolean[] P084F2_n6264AlbRTartD ;
   private String[] P084F2_A3613AlbRefDsc ;
   private String[] P084F2_A45AlbRef ;
   private java.util.Date[] P084F2_A49AlbRFen ;
   private int[] P084F2_A44AlbRecCod ;
   private byte[] P084F2_A47AlbREst ;
   private String[] P084F2_A56AlbRUni ;
   private String[] P084F2_A55AlbRReo ;
   private int[] P084F2_A52AlbRPieEnt ;
   private int[] P084F2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F2_A60AlbRUniUti ;
   private String[] P084F3_A396EmprCod ;
   private int[] P084F3_A252CliCod ;
   private short[] P084F3_A6263AlbRTartC ;
   private boolean[] P084F3_n6263AlbRTartC ;
   private short[] P084F3_A840TrnCod ;
   private boolean[] P084F3_n840TrnCod ;
   private short[] P084F3_A970ProceCod ;
   private boolean[] P084F3_n970ProceCod ;
   private String[] P084F3_A45AlbRef ;
   private java.util.Date[] P084F3_A6179AlbrHor ;
   private String[] P084F3_A6178AlbrUsu ;
   private int[] P084F3_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F3_A57AlbRUniDis ;
   private String[] P084F3_A971ProceNom ;
   private boolean[] P084F3_n971ProceNom ;
   private String[] P084F3_A841TrnNom ;
   private boolean[] P084F3_n841TrnNom ;
   private String[] P084F3_A6264AlbRTartD ;
   private boolean[] P084F3_n6264AlbRTartD ;
   private String[] P084F3_A3613AlbRefDsc ;
   private java.util.Date[] P084F3_A49AlbRFen ;
   private String[] P084F3_A279CliNom ;
   private int[] P084F3_A44AlbRecCod ;
   private byte[] P084F3_A47AlbREst ;
   private String[] P084F3_A56AlbRUni ;
   private String[] P084F3_A55AlbRReo ;
   private int[] P084F3_A52AlbRPieEnt ;
   private int[] P084F3_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F3_A60AlbRUniUti ;
   private String[] P084F4_A396EmprCod ;
   private int[] P084F4_A252CliCod ;
   private short[] P084F4_A6263AlbRTartC ;
   private boolean[] P084F4_n6263AlbRTartC ;
   private short[] P084F4_A840TrnCod ;
   private boolean[] P084F4_n840TrnCod ;
   private short[] P084F4_A970ProceCod ;
   private boolean[] P084F4_n970ProceCod ;
   private String[] P084F4_A3613AlbRefDsc ;
   private java.util.Date[] P084F4_A6179AlbrHor ;
   private String[] P084F4_A6178AlbrUsu ;
   private int[] P084F4_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F4_A57AlbRUniDis ;
   private String[] P084F4_A971ProceNom ;
   private boolean[] P084F4_n971ProceNom ;
   private String[] P084F4_A841TrnNom ;
   private boolean[] P084F4_n841TrnNom ;
   private String[] P084F4_A6264AlbRTartD ;
   private boolean[] P084F4_n6264AlbRTartD ;
   private String[] P084F4_A45AlbRef ;
   private java.util.Date[] P084F4_A49AlbRFen ;
   private String[] P084F4_A279CliNom ;
   private int[] P084F4_A44AlbRecCod ;
   private byte[] P084F4_A47AlbREst ;
   private String[] P084F4_A56AlbRUni ;
   private String[] P084F4_A55AlbRReo ;
   private int[] P084F4_A52AlbRPieEnt ;
   private int[] P084F4_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F4_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F4_A60AlbRUniUti ;
   private int[] P084F5_A252CliCod ;
   private short[] P084F5_A840TrnCod ;
   private boolean[] P084F5_n840TrnCod ;
   private short[] P084F5_A970ProceCod ;
   private boolean[] P084F5_n970ProceCod ;
   private short[] P084F5_A6263AlbRTartC ;
   private boolean[] P084F5_n6263AlbRTartC ;
   private String[] P084F5_A396EmprCod ;
   private java.util.Date[] P084F5_A6179AlbrHor ;
   private String[] P084F5_A6178AlbrUsu ;
   private int[] P084F5_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F5_A57AlbRUniDis ;
   private String[] P084F5_A971ProceNom ;
   private boolean[] P084F5_n971ProceNom ;
   private String[] P084F5_A841TrnNom ;
   private boolean[] P084F5_n841TrnNom ;
   private String[] P084F5_A6264AlbRTartD ;
   private boolean[] P084F5_n6264AlbRTartD ;
   private String[] P084F5_A3613AlbRefDsc ;
   private String[] P084F5_A45AlbRef ;
   private java.util.Date[] P084F5_A49AlbRFen ;
   private String[] P084F5_A279CliNom ;
   private int[] P084F5_A44AlbRecCod ;
   private byte[] P084F5_A47AlbREst ;
   private String[] P084F5_A56AlbRUni ;
   private String[] P084F5_A55AlbRReo ;
   private int[] P084F5_A52AlbRPieEnt ;
   private int[] P084F5_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F5_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F5_A60AlbRUniUti ;
   private int[] P084F6_A252CliCod ;
   private short[] P084F6_A6263AlbRTartC ;
   private boolean[] P084F6_n6263AlbRTartC ;
   private short[] P084F6_A970ProceCod ;
   private boolean[] P084F6_n970ProceCod ;
   private short[] P084F6_A840TrnCod ;
   private boolean[] P084F6_n840TrnCod ;
   private String[] P084F6_A396EmprCod ;
   private java.util.Date[] P084F6_A6179AlbrHor ;
   private String[] P084F6_A6178AlbrUsu ;
   private int[] P084F6_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F6_A57AlbRUniDis ;
   private String[] P084F6_A971ProceNom ;
   private boolean[] P084F6_n971ProceNom ;
   private String[] P084F6_A841TrnNom ;
   private boolean[] P084F6_n841TrnNom ;
   private String[] P084F6_A6264AlbRTartD ;
   private boolean[] P084F6_n6264AlbRTartD ;
   private String[] P084F6_A3613AlbRefDsc ;
   private String[] P084F6_A45AlbRef ;
   private java.util.Date[] P084F6_A49AlbRFen ;
   private String[] P084F6_A279CliNom ;
   private int[] P084F6_A44AlbRecCod ;
   private byte[] P084F6_A47AlbREst ;
   private String[] P084F6_A56AlbRUni ;
   private String[] P084F6_A55AlbRReo ;
   private int[] P084F6_A52AlbRPieEnt ;
   private int[] P084F6_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F6_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F6_A60AlbRUniUti ;
   private int[] P084F7_A252CliCod ;
   private short[] P084F7_A6263AlbRTartC ;
   private boolean[] P084F7_n6263AlbRTartC ;
   private short[] P084F7_A840TrnCod ;
   private boolean[] P084F7_n840TrnCod ;
   private short[] P084F7_A970ProceCod ;
   private boolean[] P084F7_n970ProceCod ;
   private String[] P084F7_A396EmprCod ;
   private java.util.Date[] P084F7_A6179AlbrHor ;
   private String[] P084F7_A6178AlbrUsu ;
   private int[] P084F7_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F7_A57AlbRUniDis ;
   private String[] P084F7_A971ProceNom ;
   private boolean[] P084F7_n971ProceNom ;
   private String[] P084F7_A841TrnNom ;
   private boolean[] P084F7_n841TrnNom ;
   private String[] P084F7_A6264AlbRTartD ;
   private boolean[] P084F7_n6264AlbRTartD ;
   private String[] P084F7_A3613AlbRefDsc ;
   private String[] P084F7_A45AlbRef ;
   private java.util.Date[] P084F7_A49AlbRFen ;
   private String[] P084F7_A279CliNom ;
   private int[] P084F7_A44AlbRecCod ;
   private byte[] P084F7_A47AlbREst ;
   private String[] P084F7_A56AlbRUni ;
   private String[] P084F7_A55AlbRReo ;
   private int[] P084F7_A52AlbRPieEnt ;
   private int[] P084F7_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F7_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F7_A60AlbRUniUti ;
   private String[] P084F8_A396EmprCod ;
   private int[] P084F8_A252CliCod ;
   private short[] P084F8_A6263AlbRTartC ;
   private boolean[] P084F8_n6263AlbRTartC ;
   private short[] P084F8_A840TrnCod ;
   private boolean[] P084F8_n840TrnCod ;
   private short[] P084F8_A970ProceCod ;
   private boolean[] P084F8_n970ProceCod ;
   private String[] P084F8_A6178AlbrUsu ;
   private java.util.Date[] P084F8_A6179AlbrHor ;
   private int[] P084F8_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084F8_A57AlbRUniDis ;
   private String[] P084F8_A971ProceNom ;
   private boolean[] P084F8_n971ProceNom ;
   private String[] P084F8_A841TrnNom ;
   private boolean[] P084F8_n841TrnNom ;
   private String[] P084F8_A6264AlbRTartD ;
   private boolean[] P084F8_n6264AlbRTartD ;
   private String[] P084F8_A3613AlbRefDsc ;
   private String[] P084F8_A45AlbRef ;
   private java.util.Date[] P084F8_A49AlbRFen ;
   private String[] P084F8_A279CliNom ;
   private int[] P084F8_A44AlbRecCod ;
   private byte[] P084F8_A47AlbREst ;
   private String[] P084F8_A56AlbRUni ;
   private String[] P084F8_A55AlbRReo ;
   private int[] P084F8_A52AlbRPieEnt ;
   private int[] P084F8_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084F8_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084F8_A60AlbRUniUti ;
   private GXSimpleCollection<String> AV19TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV121TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ;
   private GXSimpleCollection<String> AV73Options ;
   private GXSimpleCollection<String> AV76OptionsDesc ;
   private GXSimpleCollection<String> AV78OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV83GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV84GridStateFilterValue ;
}

final  class webconalbgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T2.CliNom, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis," ;
      scmdbuf += " CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom," ;
      scmdbuf += " T4.TrnNom, T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P084F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[30];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.AlbRef, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis," ;
      scmdbuf += " CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom," ;
      scmdbuf += " T4.TrnNom, T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P084F4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.AlbRefDsc, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis," ;
      scmdbuf += " CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom," ;
      scmdbuf += " T4.TrnNom, T3.TipArtDsc AS AlbRTartD, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P084F5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[30];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.TrnCod, T1.ProceCod, T1.AlbRTartC AS AlbRTartC, T1.EmprCod, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRTartC" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P084F6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[30];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.ProceCod, T1.TrnCod, T1.EmprCod, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P084F7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[30];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.EmprCod, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P084F8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV136Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV149Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV160Webconalbds_31_tfalbrest_sels ,
                                          int AV131Webconalbds_2_tfalbreccod ,
                                          int AV132Webconalbds_3_tfalbreccod_to ,
                                          String AV134Webconalbds_5_tfclinom_sel ,
                                          String AV133Webconalbds_4_tfclinom ,
                                          java.util.Date AV135Webconalbds_6_tfalbrfen ,
                                          int AV136Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV138Webconalbds_9_tfalbref_sel ,
                                          String AV137Webconalbds_8_tfalbref ,
                                          String AV140Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV139Webconalbds_10_tfalbrefdsc ,
                                          String AV142Webconalbds_13_tfalbrtartd_sel ,
                                          String AV141Webconalbds_12_tfalbrtartd ,
                                          String AV144Webconalbds_15_tftrnnom_sel ,
                                          String AV143Webconalbds_14_tftrnnom ,
                                          String AV146Webconalbds_17_tfprocenom_sel ,
                                          String AV145Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV147Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV148Webconalbds_19_tfalbrunient_to ,
                                          int AV149Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV150Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV151Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV152Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV153Webconalbds_24_tfalbrunidis_to ,
                                          int AV154Webconalbds_25_tfalbrpieent ,
                                          int AV155Webconalbds_26_tfalbrpieent_to ,
                                          int AV156Webconalbds_27_tfalbrpieuti ,
                                          int AV157Webconalbds_28_tfalbrpieuti_to ,
                                          int AV158Webconalbds_29_tfalbrpiedis ,
                                          int AV159Webconalbds_30_tfalbrpiedis_to ,
                                          int AV160Webconalbds_31_tfalbrest_sels_size ,
                                          String AV162Webconalbds_33_tfalbrusu_sel ,
                                          String AV161Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV163Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          String AV130Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[30];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.AlbrUsu, T1.AlbrHor, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV131Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( AV136Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV137Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV141Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( AV149Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV154Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV155Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV156Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV157Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV158Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( AV160Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV160Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV161Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV163Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbrUsu" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P084F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
            case 1 :
                  return conditional_P084F3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
            case 2 :
                  return conditional_P084F4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
            case 3 :
                  return conditional_P084F5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
            case 4 :
                  return conditional_P084F6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
            case 5 :
                  return conditional_P084F7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
            case 6 :
                  return conditional_P084F8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084F4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084F5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084F6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084F7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084F8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
      }
   }

}

