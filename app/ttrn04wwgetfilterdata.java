package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn04wwgetfilterdata extends GXProcedure
{
   public ttrn04wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn04wwgetfilterdata.class ), "" );
   }

   public ttrn04wwgetfilterdata( int remoteHandle ,
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
      ttrn04wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn04wwgetfilterdata.this.AV56DDOName = aP0;
      ttrn04wwgetfilterdata.this.AV54SearchTxt = aP1;
      ttrn04wwgetfilterdata.this.AV55SearchTxtTo = aP2;
      ttrn04wwgetfilterdata.this.aP3 = aP3;
      ttrn04wwgetfilterdata.this.aP4 = aP4;
      ttrn04wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARENCCLIOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPARTDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV60OptionsJson = AV59Options.toJSonString(false) ;
      AV63OptionsDescJson = AV62OptionsDesc.toJSonString(false) ;
      AV65OptionIndexesJson = AV64OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("TTrn04WWGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn04WWGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("TTrn04WWGridState"), null, null);
      }
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV116FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV95TFBarNHdr = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV96TFBarNHdr_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV22TFCliNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV23TFCliNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV112TFBarEncCli = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV113TFBarEncCli_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV24TFBarSer = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV25TFBarSer_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV26TFBarSerDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV27TFBarSerDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV114TFBarTipArtDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV115TFBarTipArtDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV20TFCliCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCliCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV30TFBarColNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV31TFBarColNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV32TFBarColNum = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFBarColNum_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV36TFBarFecGen = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV38TFBarFecCli = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV42TFBarFecSal = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV109TFBarSit = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV110TFBarSit_To = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV111TFHayRec_Sel = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV95TFBarNHdr = AV54SearchTxt ;
      AV96TFBarNHdr_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G2 */
      pr_default.execute(0, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P088G2_A217BarTipArt[0] ;
         n217BarTipArt = P088G2_n217BarTipArt[0] ;
         A213BarSit = P088G2_A213BarSit[0] ;
         A161BarFecSal = P088G2_A161BarFecSal[0] ;
         A155BarFecCli = P088G2_A155BarFecCli[0] ;
         A159BarFecGen = P088G2_A159BarFecGen[0] ;
         A136BarColNum = P088G2_A136BarColNum[0] ;
         A135BarColNom = P088G2_A135BarColNom[0] ;
         A252CliCod = P088G2_A252CliCod[0] ;
         n252CliCod = P088G2_n252CliCod[0] ;
         A13711BarTipArtD = P088G2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088G2_A1652BarSerDsc[0] ;
         A212BarSer = P088G2_A212BarSer[0] ;
         A4812BarEncCli = P088G2_A4812BarEncCli[0] ;
         A279CliNom = P088G2_A279CliNom[0] ;
         A130BarCodPar = P088G2_A130BarCodPar[0] ;
         A132BarCodReo = P088G2_A132BarCodReo[0] ;
         A129BarCod = P088G2_A129BarCod[0] ;
         A396EmprCod = P088G2_A396EmprCod[0] ;
         A13711BarTipArtD = P088G2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G2_n13711BarTipArtD[0] ;
         A279CliNom = P088G2_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
               {
                  AV58Option = A13696BarNHdr ;
                  AV57InsertIndex = 1 ;
                  while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                  {
                     AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                  }
                  if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                  {
                     AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                     AV66count = (long)(AV66count+1) ;
                     AV64OptionIndexes.removeItem(AV57InsertIndex);
                     AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                  }
                  else
                  {
                     AV59Options.add(AV58Option, AV57InsertIndex);
                     AV64OptionIndexes.add("1", AV57InsertIndex);
                  }
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCliNom = AV54SearchTxt ;
      AV23TFCliNom_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G3 */
      pr_default.execute(1, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk88G3 = false ;
         A217BarTipArt = P088G3_A217BarTipArt[0] ;
         n217BarTipArt = P088G3_n217BarTipArt[0] ;
         A279CliNom = P088G3_A279CliNom[0] ;
         A213BarSit = P088G3_A213BarSit[0] ;
         A161BarFecSal = P088G3_A161BarFecSal[0] ;
         A155BarFecCli = P088G3_A155BarFecCli[0] ;
         A159BarFecGen = P088G3_A159BarFecGen[0] ;
         A136BarColNum = P088G3_A136BarColNum[0] ;
         A135BarColNom = P088G3_A135BarColNom[0] ;
         A252CliCod = P088G3_A252CliCod[0] ;
         n252CliCod = P088G3_n252CliCod[0] ;
         A13711BarTipArtD = P088G3_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G3_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088G3_A1652BarSerDsc[0] ;
         A212BarSer = P088G3_A212BarSer[0] ;
         A4812BarEncCli = P088G3_A4812BarEncCli[0] ;
         A130BarCodPar = P088G3_A130BarCodPar[0] ;
         A132BarCodReo = P088G3_A132BarCodReo[0] ;
         A129BarCod = P088G3_A129BarCod[0] ;
         A396EmprCod = P088G3_A396EmprCod[0] ;
         A13711BarTipArtD = P088G3_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G3_n13711BarTipArtD[0] ;
         A279CliNom = P088G3_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV66count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P088G3_A279CliNom[0], A279CliNom) == 0 ) )
               {
                  brk88G3 = false ;
                  A252CliCod = P088G3_A252CliCod[0] ;
                  n252CliCod = P088G3_n252CliCod[0] ;
                  A130BarCodPar = P088G3_A130BarCodPar[0] ;
                  A132BarCodReo = P088G3_A132BarCodReo[0] ;
                  A129BarCod = P088G3_A129BarCod[0] ;
                  A396EmprCod = P088G3_A396EmprCod[0] ;
                  AV66count = (long)(AV66count+1) ;
                  brk88G3 = true ;
                  pr_default.readNext(1);
               }
               if ( ! (GXutil.strcmp("", A279CliNom)==0) )
               {
                  AV58Option = A279CliNom ;
                  AV59Options.add(AV58Option, 0);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk88G3 )
         {
            brk88G3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV112TFBarEncCli = AV54SearchTxt ;
      AV113TFBarEncCli_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G4 */
      pr_default.execute(2, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk88G5 = false ;
         A217BarTipArt = P088G4_A217BarTipArt[0] ;
         n217BarTipArt = P088G4_n217BarTipArt[0] ;
         A4812BarEncCli = P088G4_A4812BarEncCli[0] ;
         A213BarSit = P088G4_A213BarSit[0] ;
         A161BarFecSal = P088G4_A161BarFecSal[0] ;
         A155BarFecCli = P088G4_A155BarFecCli[0] ;
         A159BarFecGen = P088G4_A159BarFecGen[0] ;
         A136BarColNum = P088G4_A136BarColNum[0] ;
         A135BarColNom = P088G4_A135BarColNom[0] ;
         A252CliCod = P088G4_A252CliCod[0] ;
         n252CliCod = P088G4_n252CliCod[0] ;
         A13711BarTipArtD = P088G4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G4_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088G4_A1652BarSerDsc[0] ;
         A212BarSer = P088G4_A212BarSer[0] ;
         A279CliNom = P088G4_A279CliNom[0] ;
         A130BarCodPar = P088G4_A130BarCodPar[0] ;
         A132BarCodReo = P088G4_A132BarCodReo[0] ;
         A129BarCod = P088G4_A129BarCod[0] ;
         A396EmprCod = P088G4_A396EmprCod[0] ;
         A13711BarTipArtD = P088G4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G4_n13711BarTipArtD[0] ;
         A279CliNom = P088G4_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV66count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P088G4_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
               {
                  brk88G5 = false ;
                  A130BarCodPar = P088G4_A130BarCodPar[0] ;
                  A132BarCodReo = P088G4_A132BarCodReo[0] ;
                  A129BarCod = P088G4_A129BarCod[0] ;
                  A396EmprCod = P088G4_A396EmprCod[0] ;
                  AV66count = (long)(AV66count+1) ;
                  brk88G5 = true ;
                  pr_default.readNext(2);
               }
               if ( ! (GXutil.strcmp("", A4812BarEncCli)==0) )
               {
                  AV58Option = A4812BarEncCli ;
                  AV59Options.add(AV58Option, 0);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk88G5 )
         {
            brk88G5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarSer = AV54SearchTxt ;
      AV25TFBarSer_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G5 */
      pr_default.execute(3, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk88G7 = false ;
         A217BarTipArt = P088G5_A217BarTipArt[0] ;
         n217BarTipArt = P088G5_n217BarTipArt[0] ;
         A212BarSer = P088G5_A212BarSer[0] ;
         A213BarSit = P088G5_A213BarSit[0] ;
         A161BarFecSal = P088G5_A161BarFecSal[0] ;
         A155BarFecCli = P088G5_A155BarFecCli[0] ;
         A159BarFecGen = P088G5_A159BarFecGen[0] ;
         A136BarColNum = P088G5_A136BarColNum[0] ;
         A135BarColNom = P088G5_A135BarColNom[0] ;
         A252CliCod = P088G5_A252CliCod[0] ;
         n252CliCod = P088G5_n252CliCod[0] ;
         A13711BarTipArtD = P088G5_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G5_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088G5_A1652BarSerDsc[0] ;
         A4812BarEncCli = P088G5_A4812BarEncCli[0] ;
         A279CliNom = P088G5_A279CliNom[0] ;
         A130BarCodPar = P088G5_A130BarCodPar[0] ;
         A132BarCodReo = P088G5_A132BarCodReo[0] ;
         A129BarCod = P088G5_A129BarCod[0] ;
         A396EmprCod = P088G5_A396EmprCod[0] ;
         A13711BarTipArtD = P088G5_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G5_n13711BarTipArtD[0] ;
         A279CliNom = P088G5_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV66count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P088G5_A212BarSer[0], A212BarSer) == 0 ) )
               {
                  brk88G7 = false ;
                  A130BarCodPar = P088G5_A130BarCodPar[0] ;
                  A132BarCodReo = P088G5_A132BarCodReo[0] ;
                  A129BarCod = P088G5_A129BarCod[0] ;
                  A396EmprCod = P088G5_A396EmprCod[0] ;
                  AV66count = (long)(AV66count+1) ;
                  brk88G7 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A212BarSer)==0) )
               {
                  AV58Option = A212BarSer ;
                  AV59Options.add(AV58Option, 0);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk88G7 )
         {
            brk88G7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarSerDsc = AV54SearchTxt ;
      AV27TFBarSerDsc_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G6 */
      pr_default.execute(4, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk88G9 = false ;
         A217BarTipArt = P088G6_A217BarTipArt[0] ;
         n217BarTipArt = P088G6_n217BarTipArt[0] ;
         A1652BarSerDsc = P088G6_A1652BarSerDsc[0] ;
         A213BarSit = P088G6_A213BarSit[0] ;
         A161BarFecSal = P088G6_A161BarFecSal[0] ;
         A155BarFecCli = P088G6_A155BarFecCli[0] ;
         A159BarFecGen = P088G6_A159BarFecGen[0] ;
         A136BarColNum = P088G6_A136BarColNum[0] ;
         A135BarColNom = P088G6_A135BarColNom[0] ;
         A252CliCod = P088G6_A252CliCod[0] ;
         n252CliCod = P088G6_n252CliCod[0] ;
         A13711BarTipArtD = P088G6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G6_n13711BarTipArtD[0] ;
         A212BarSer = P088G6_A212BarSer[0] ;
         A4812BarEncCli = P088G6_A4812BarEncCli[0] ;
         A279CliNom = P088G6_A279CliNom[0] ;
         A130BarCodPar = P088G6_A130BarCodPar[0] ;
         A132BarCodReo = P088G6_A132BarCodReo[0] ;
         A129BarCod = P088G6_A129BarCod[0] ;
         A396EmprCod = P088G6_A396EmprCod[0] ;
         A13711BarTipArtD = P088G6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G6_n13711BarTipArtD[0] ;
         A279CliNom = P088G6_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV66count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P088G6_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
               {
                  brk88G9 = false ;
                  A130BarCodPar = P088G6_A130BarCodPar[0] ;
                  A132BarCodReo = P088G6_A132BarCodReo[0] ;
                  A129BarCod = P088G6_A129BarCod[0] ;
                  A396EmprCod = P088G6_A396EmprCod[0] ;
                  AV66count = (long)(AV66count+1) ;
                  brk88G9 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
               {
                  AV58Option = A1652BarSerDsc ;
                  AV59Options.add(AV58Option, 0);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk88G9 )
         {
            brk88G9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV114TFBarTipArtDsc = AV54SearchTxt ;
      AV115TFBarTipArtDsc_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G7 */
      pr_default.execute(5, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk88G11 = false ;
         A217BarTipArt = P088G7_A217BarTipArt[0] ;
         n217BarTipArt = P088G7_n217BarTipArt[0] ;
         A213BarSit = P088G7_A213BarSit[0] ;
         A161BarFecSal = P088G7_A161BarFecSal[0] ;
         A155BarFecCli = P088G7_A155BarFecCli[0] ;
         A159BarFecGen = P088G7_A159BarFecGen[0] ;
         A136BarColNum = P088G7_A136BarColNum[0] ;
         A135BarColNom = P088G7_A135BarColNom[0] ;
         A252CliCod = P088G7_A252CliCod[0] ;
         n252CliCod = P088G7_n252CliCod[0] ;
         A13711BarTipArtD = P088G7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G7_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088G7_A1652BarSerDsc[0] ;
         A212BarSer = P088G7_A212BarSer[0] ;
         A4812BarEncCli = P088G7_A4812BarEncCli[0] ;
         A279CliNom = P088G7_A279CliNom[0] ;
         A130BarCodPar = P088G7_A130BarCodPar[0] ;
         A132BarCodReo = P088G7_A132BarCodReo[0] ;
         A129BarCod = P088G7_A129BarCod[0] ;
         A396EmprCod = P088G7_A396EmprCod[0] ;
         A13711BarTipArtD = P088G7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G7_n13711BarTipArtD[0] ;
         A279CliNom = P088G7_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV66count = 0 ;
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P088G7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P088G7_A217BarTipArt[0] == A217BarTipArt ) )
               {
                  brk88G11 = false ;
                  A130BarCodPar = P088G7_A130BarCodPar[0] ;
                  A132BarCodReo = P088G7_A132BarCodReo[0] ;
                  A129BarCod = P088G7_A129BarCod[0] ;
                  AV66count = (long)(AV66count+1) ;
                  brk88G11 = true ;
                  pr_default.readNext(5);
               }
               if ( ! (GXutil.strcmp("", A13711BarTipArtD)==0) )
               {
                  AV58Option = A13711BarTipArtD ;
                  AV57InsertIndex = 1 ;
                  while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                  {
                     AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                  }
                  AV59Options.add(AV58Option, AV57InsertIndex);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk88G11 )
         {
            brk88G11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV30TFBarColNom = AV54SearchTxt ;
      AV31TFBarColNom_Sel = "" ;
      AV123Ttrn04wwds_1_filterfulltext = AV116FilterFullText ;
      AV124Ttrn04wwds_2_tfbarnhdr = AV95TFBarNHdr ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = AV96TFBarNHdr_Sel ;
      AV126Ttrn04wwds_4_tfclinom = AV22TFCliNom ;
      AV127Ttrn04wwds_5_tfclinom_sel = AV23TFCliNom_Sel ;
      AV128Ttrn04wwds_6_tfbarenccli = AV112TFBarEncCli ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = AV113TFBarEncCli_Sel ;
      AV130Ttrn04wwds_8_tfbarser = AV24TFBarSer ;
      AV131Ttrn04wwds_9_tfbarser_sel = AV25TFBarSer_Sel ;
      AV132Ttrn04wwds_10_tfbarserdsc = AV26TFBarSerDsc ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = AV27TFBarSerDsc_Sel ;
      AV134Ttrn04wwds_12_tfbartipartdsc = AV114TFBarTipArtDsc ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = AV115TFBarTipArtDsc_Sel ;
      AV136Ttrn04wwds_14_tfclicod = AV20TFCliCod ;
      AV137Ttrn04wwds_15_tfclicod_to = AV21TFCliCod_To ;
      AV138Ttrn04wwds_16_tfbarcolnom = AV30TFBarColNom ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV140Ttrn04wwds_18_tfbarcolnum = AV32TFBarColNum ;
      AV141Ttrn04wwds_19_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV142Ttrn04wwds_20_tfbarfecgen = AV36TFBarFecGen ;
      AV143Ttrn04wwds_21_tfbarfeccli = AV38TFBarFecCli ;
      AV144Ttrn04wwds_22_tfbarfecsal = AV42TFBarFecSal ;
      AV145Ttrn04wwds_23_tfbarsit = AV109TFBarSit ;
      AV146Ttrn04wwds_24_tfbarsit_to = AV110TFBarSit_To ;
      AV147Ttrn04wwds_25_tfhayrec_sel = AV111TFHayRec_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV123Ttrn04wwds_1_filterfulltext ,
                                           AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV124Ttrn04wwds_2_tfbarnhdr ,
                                           AV127Ttrn04wwds_5_tfclinom_sel ,
                                           AV126Ttrn04wwds_4_tfclinom ,
                                           AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV128Ttrn04wwds_6_tfbarenccli ,
                                           AV131Ttrn04wwds_9_tfbarser_sel ,
                                           AV130Ttrn04wwds_8_tfbarser ,
                                           AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV132Ttrn04wwds_10_tfbarserdsc ,
                                           AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV134Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV136Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to) ,
                                           AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV138Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV142Ttrn04wwds_20_tfbarfecgen ,
                                           AV143Ttrn04wwds_21_tfbarfeccli ,
                                           AV144Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(AV147Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV123Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV124Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV124Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV126Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV126Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV128Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV128Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV130Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV130Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV132Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV132Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV134Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV134Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV138Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV138Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088G8 */
      pr_default.execute(6, new Object[] {lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV123Ttrn04wwds_1_filterfulltext, lV124Ttrn04wwds_2_tfbarnhdr, AV125Ttrn04wwds_3_tfbarnhdr_sel, lV126Ttrn04wwds_4_tfclinom, AV127Ttrn04wwds_5_tfclinom_sel, lV128Ttrn04wwds_6_tfbarenccli, AV129Ttrn04wwds_7_tfbarenccli_sel, lV130Ttrn04wwds_8_tfbarser, AV131Ttrn04wwds_9_tfbarser_sel, lV132Ttrn04wwds_10_tfbarserdsc, AV133Ttrn04wwds_11_tfbarserdsc_sel, lV134Ttrn04wwds_12_tfbartipartdsc, AV135Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV136Ttrn04wwds_14_tfclicod), Integer.valueOf(AV137Ttrn04wwds_15_tfclicod_to), lV138Ttrn04wwds_16_tfbarcolnom, AV139Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV140Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV141Ttrn04wwds_19_tfbarcolnum_to), AV142Ttrn04wwds_20_tfbarfecgen, AV143Ttrn04wwds_21_tfbarfeccli, AV144Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV145Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV146Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk88G13 = false ;
         A217BarTipArt = P088G8_A217BarTipArt[0] ;
         n217BarTipArt = P088G8_n217BarTipArt[0] ;
         A135BarColNom = P088G8_A135BarColNom[0] ;
         A213BarSit = P088G8_A213BarSit[0] ;
         A161BarFecSal = P088G8_A161BarFecSal[0] ;
         A155BarFecCli = P088G8_A155BarFecCli[0] ;
         A159BarFecGen = P088G8_A159BarFecGen[0] ;
         A136BarColNum = P088G8_A136BarColNum[0] ;
         A252CliCod = P088G8_A252CliCod[0] ;
         n252CliCod = P088G8_n252CliCod[0] ;
         A13711BarTipArtD = P088G8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G8_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088G8_A1652BarSerDsc[0] ;
         A212BarSer = P088G8_A212BarSer[0] ;
         A4812BarEncCli = P088G8_A4812BarEncCli[0] ;
         A279CliNom = P088G8_A279CliNom[0] ;
         A130BarCodPar = P088G8_A130BarCodPar[0] ;
         A132BarCodReo = P088G8_A132BarCodReo[0] ;
         A129BarCod = P088G8_A129BarCod[0] ;
         A396EmprCod = P088G8_A396EmprCod[0] ;
         A13711BarTipArtD = P088G8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088G8_n13711BarTipArtD[0] ;
         A279CliNom = P088G8_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV147Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV66count = 0 ;
               while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P088G8_A135BarColNom[0], A135BarColNom) == 0 ) )
               {
                  brk88G13 = false ;
                  A130BarCodPar = P088G8_A130BarCodPar[0] ;
                  A132BarCodReo = P088G8_A132BarCodReo[0] ;
                  A129BarCod = P088G8_A129BarCod[0] ;
                  A396EmprCod = P088G8_A396EmprCod[0] ;
                  AV66count = (long)(AV66count+1) ;
                  brk88G13 = true ;
                  pr_default.readNext(6);
               }
               if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
               {
                  AV58Option = A135BarColNom ;
                  AV59Options.add(AV58Option, 0);
                  AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV59Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk88G13 )
         {
            brk88G13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn04wwgetfilterdata.this.AV60OptionsJson;
      this.aP4[0] = ttrn04wwgetfilterdata.this.AV63OptionsDescJson;
      this.aP5[0] = ttrn04wwgetfilterdata.this.AV65OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60OptionsJson = "" ;
      AV63OptionsDescJson = "" ;
      AV65OptionIndexesJson = "" ;
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV116FilterFullText = "" ;
      AV95TFBarNHdr = "" ;
      AV96TFBarNHdr_Sel = "" ;
      AV22TFCliNom = "" ;
      AV23TFCliNom_Sel = "" ;
      AV112TFBarEncCli = "" ;
      AV113TFBarEncCli_Sel = "" ;
      AV24TFBarSer = "" ;
      AV25TFBarSer_Sel = "" ;
      AV26TFBarSerDsc = "" ;
      AV27TFBarSerDsc_Sel = "" ;
      AV114TFBarTipArtDsc = "" ;
      AV115TFBarTipArtDsc_Sel = "" ;
      AV30TFBarColNom = "" ;
      AV31TFBarColNom_Sel = "" ;
      AV36TFBarFecGen = GXutil.nullDate() ;
      AV38TFBarFecCli = GXutil.nullDate() ;
      AV42TFBarFecSal = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      AV123Ttrn04wwds_1_filterfulltext = "" ;
      AV124Ttrn04wwds_2_tfbarnhdr = "" ;
      AV125Ttrn04wwds_3_tfbarnhdr_sel = "" ;
      AV126Ttrn04wwds_4_tfclinom = "" ;
      AV127Ttrn04wwds_5_tfclinom_sel = "" ;
      AV128Ttrn04wwds_6_tfbarenccli = "" ;
      AV129Ttrn04wwds_7_tfbarenccli_sel = "" ;
      AV130Ttrn04wwds_8_tfbarser = "" ;
      AV131Ttrn04wwds_9_tfbarser_sel = "" ;
      AV132Ttrn04wwds_10_tfbarserdsc = "" ;
      AV133Ttrn04wwds_11_tfbarserdsc_sel = "" ;
      AV134Ttrn04wwds_12_tfbartipartdsc = "" ;
      AV135Ttrn04wwds_13_tfbartipartdsc_sel = "" ;
      AV138Ttrn04wwds_16_tfbarcolnom = "" ;
      AV139Ttrn04wwds_17_tfbarcolnom_sel = "" ;
      AV142Ttrn04wwds_20_tfbarfecgen = GXutil.nullDate() ;
      AV143Ttrn04wwds_21_tfbarfeccli = GXutil.nullDate() ;
      AV144Ttrn04wwds_22_tfbarfecsal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV123Ttrn04wwds_1_filterfulltext = "" ;
      lV124Ttrn04wwds_2_tfbarnhdr = "" ;
      lV126Ttrn04wwds_4_tfclinom = "" ;
      lV128Ttrn04wwds_6_tfbarenccli = "" ;
      lV130Ttrn04wwds_8_tfbarser = "" ;
      lV132Ttrn04wwds_10_tfbarserdsc = "" ;
      lV134Ttrn04wwds_12_tfbartipartdsc = "" ;
      lV138Ttrn04wwds_16_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      P088G2_A217BarTipArt = new short[1] ;
      P088G2_n217BarTipArt = new boolean[] {false} ;
      P088G2_A213BarSit = new byte[1] ;
      P088G2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G2_A136BarColNum = new int[1] ;
      P088G2_A135BarColNom = new String[] {""} ;
      P088G2_A252CliCod = new int[1] ;
      P088G2_n252CliCod = new boolean[] {false} ;
      P088G2_A13711BarTipArtD = new String[] {""} ;
      P088G2_n13711BarTipArtD = new boolean[] {false} ;
      P088G2_A1652BarSerDsc = new String[] {""} ;
      P088G2_A212BarSer = new String[] {""} ;
      P088G2_A4812BarEncCli = new String[] {""} ;
      P088G2_A279CliNom = new String[] {""} ;
      P088G2_A130BarCodPar = new String[] {""} ;
      P088G2_A132BarCodReo = new byte[1] ;
      P088G2_A129BarCod = new int[1] ;
      P088G2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV58Option = "" ;
      P088G3_A217BarTipArt = new short[1] ;
      P088G3_n217BarTipArt = new boolean[] {false} ;
      P088G3_A279CliNom = new String[] {""} ;
      P088G3_A213BarSit = new byte[1] ;
      P088G3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G3_A136BarColNum = new int[1] ;
      P088G3_A135BarColNom = new String[] {""} ;
      P088G3_A252CliCod = new int[1] ;
      P088G3_n252CliCod = new boolean[] {false} ;
      P088G3_A13711BarTipArtD = new String[] {""} ;
      P088G3_n13711BarTipArtD = new boolean[] {false} ;
      P088G3_A1652BarSerDsc = new String[] {""} ;
      P088G3_A212BarSer = new String[] {""} ;
      P088G3_A4812BarEncCli = new String[] {""} ;
      P088G3_A130BarCodPar = new String[] {""} ;
      P088G3_A132BarCodReo = new byte[1] ;
      P088G3_A129BarCod = new int[1] ;
      P088G3_A396EmprCod = new String[] {""} ;
      P088G4_A217BarTipArt = new short[1] ;
      P088G4_n217BarTipArt = new boolean[] {false} ;
      P088G4_A4812BarEncCli = new String[] {""} ;
      P088G4_A213BarSit = new byte[1] ;
      P088G4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G4_A136BarColNum = new int[1] ;
      P088G4_A135BarColNom = new String[] {""} ;
      P088G4_A252CliCod = new int[1] ;
      P088G4_n252CliCod = new boolean[] {false} ;
      P088G4_A13711BarTipArtD = new String[] {""} ;
      P088G4_n13711BarTipArtD = new boolean[] {false} ;
      P088G4_A1652BarSerDsc = new String[] {""} ;
      P088G4_A212BarSer = new String[] {""} ;
      P088G4_A279CliNom = new String[] {""} ;
      P088G4_A130BarCodPar = new String[] {""} ;
      P088G4_A132BarCodReo = new byte[1] ;
      P088G4_A129BarCod = new int[1] ;
      P088G4_A396EmprCod = new String[] {""} ;
      P088G5_A217BarTipArt = new short[1] ;
      P088G5_n217BarTipArt = new boolean[] {false} ;
      P088G5_A212BarSer = new String[] {""} ;
      P088G5_A213BarSit = new byte[1] ;
      P088G5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G5_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G5_A136BarColNum = new int[1] ;
      P088G5_A135BarColNom = new String[] {""} ;
      P088G5_A252CliCod = new int[1] ;
      P088G5_n252CliCod = new boolean[] {false} ;
      P088G5_A13711BarTipArtD = new String[] {""} ;
      P088G5_n13711BarTipArtD = new boolean[] {false} ;
      P088G5_A1652BarSerDsc = new String[] {""} ;
      P088G5_A4812BarEncCli = new String[] {""} ;
      P088G5_A279CliNom = new String[] {""} ;
      P088G5_A130BarCodPar = new String[] {""} ;
      P088G5_A132BarCodReo = new byte[1] ;
      P088G5_A129BarCod = new int[1] ;
      P088G5_A396EmprCod = new String[] {""} ;
      P088G6_A217BarTipArt = new short[1] ;
      P088G6_n217BarTipArt = new boolean[] {false} ;
      P088G6_A1652BarSerDsc = new String[] {""} ;
      P088G6_A213BarSit = new byte[1] ;
      P088G6_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G6_A136BarColNum = new int[1] ;
      P088G6_A135BarColNom = new String[] {""} ;
      P088G6_A252CliCod = new int[1] ;
      P088G6_n252CliCod = new boolean[] {false} ;
      P088G6_A13711BarTipArtD = new String[] {""} ;
      P088G6_n13711BarTipArtD = new boolean[] {false} ;
      P088G6_A212BarSer = new String[] {""} ;
      P088G6_A4812BarEncCli = new String[] {""} ;
      P088G6_A279CliNom = new String[] {""} ;
      P088G6_A130BarCodPar = new String[] {""} ;
      P088G6_A132BarCodReo = new byte[1] ;
      P088G6_A129BarCod = new int[1] ;
      P088G6_A396EmprCod = new String[] {""} ;
      P088G7_A217BarTipArt = new short[1] ;
      P088G7_n217BarTipArt = new boolean[] {false} ;
      P088G7_A213BarSit = new byte[1] ;
      P088G7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G7_A136BarColNum = new int[1] ;
      P088G7_A135BarColNom = new String[] {""} ;
      P088G7_A252CliCod = new int[1] ;
      P088G7_n252CliCod = new boolean[] {false} ;
      P088G7_A13711BarTipArtD = new String[] {""} ;
      P088G7_n13711BarTipArtD = new boolean[] {false} ;
      P088G7_A1652BarSerDsc = new String[] {""} ;
      P088G7_A212BarSer = new String[] {""} ;
      P088G7_A4812BarEncCli = new String[] {""} ;
      P088G7_A279CliNom = new String[] {""} ;
      P088G7_A130BarCodPar = new String[] {""} ;
      P088G7_A132BarCodReo = new byte[1] ;
      P088G7_A129BarCod = new int[1] ;
      P088G7_A396EmprCod = new String[] {""} ;
      P088G8_A217BarTipArt = new short[1] ;
      P088G8_n217BarTipArt = new boolean[] {false} ;
      P088G8_A135BarColNom = new String[] {""} ;
      P088G8_A213BarSit = new byte[1] ;
      P088G8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088G8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088G8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088G8_A136BarColNum = new int[1] ;
      P088G8_A252CliCod = new int[1] ;
      P088G8_n252CliCod = new boolean[] {false} ;
      P088G8_A13711BarTipArtD = new String[] {""} ;
      P088G8_n13711BarTipArtD = new boolean[] {false} ;
      P088G8_A1652BarSerDsc = new String[] {""} ;
      P088G8_A212BarSer = new String[] {""} ;
      P088G8_A4812BarEncCli = new String[] {""} ;
      P088G8_A279CliNom = new String[] {""} ;
      P088G8_A130BarCodPar = new String[] {""} ;
      P088G8_A132BarCodReo = new byte[1] ;
      P088G8_A129BarCod = new int[1] ;
      P088G8_A396EmprCod = new String[] {""} ;
      GXv_int3 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn04wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P088G2_A217BarTipArt, P088G2_n217BarTipArt, P088G2_A213BarSit, P088G2_A161BarFecSal, P088G2_A155BarFecCli, P088G2_A159BarFecGen, P088G2_A136BarColNum, P088G2_A135BarColNom, P088G2_A252CliCod, P088G2_n252CliCod,
            P088G2_A13711BarTipArtD, P088G2_n13711BarTipArtD, P088G2_A1652BarSerDsc, P088G2_A212BarSer, P088G2_A4812BarEncCli, P088G2_A279CliNom, P088G2_A130BarCodPar, P088G2_A132BarCodReo, P088G2_A129BarCod, P088G2_A396EmprCod
            }
            , new Object[] {
            P088G3_A217BarTipArt, P088G3_n217BarTipArt, P088G3_A279CliNom, P088G3_A213BarSit, P088G3_A161BarFecSal, P088G3_A155BarFecCli, P088G3_A159BarFecGen, P088G3_A136BarColNum, P088G3_A135BarColNom, P088G3_A252CliCod,
            P088G3_n252CliCod, P088G3_A13711BarTipArtD, P088G3_n13711BarTipArtD, P088G3_A1652BarSerDsc, P088G3_A212BarSer, P088G3_A4812BarEncCli, P088G3_A130BarCodPar, P088G3_A132BarCodReo, P088G3_A129BarCod, P088G3_A396EmprCod
            }
            , new Object[] {
            P088G4_A217BarTipArt, P088G4_n217BarTipArt, P088G4_A4812BarEncCli, P088G4_A213BarSit, P088G4_A161BarFecSal, P088G4_A155BarFecCli, P088G4_A159BarFecGen, P088G4_A136BarColNum, P088G4_A135BarColNom, P088G4_A252CliCod,
            P088G4_n252CliCod, P088G4_A13711BarTipArtD, P088G4_n13711BarTipArtD, P088G4_A1652BarSerDsc, P088G4_A212BarSer, P088G4_A279CliNom, P088G4_A130BarCodPar, P088G4_A132BarCodReo, P088G4_A129BarCod, P088G4_A396EmprCod
            }
            , new Object[] {
            P088G5_A217BarTipArt, P088G5_n217BarTipArt, P088G5_A212BarSer, P088G5_A213BarSit, P088G5_A161BarFecSal, P088G5_A155BarFecCli, P088G5_A159BarFecGen, P088G5_A136BarColNum, P088G5_A135BarColNom, P088G5_A252CliCod,
            P088G5_n252CliCod, P088G5_A13711BarTipArtD, P088G5_n13711BarTipArtD, P088G5_A1652BarSerDsc, P088G5_A4812BarEncCli, P088G5_A279CliNom, P088G5_A130BarCodPar, P088G5_A132BarCodReo, P088G5_A129BarCod, P088G5_A396EmprCod
            }
            , new Object[] {
            P088G6_A217BarTipArt, P088G6_n217BarTipArt, P088G6_A1652BarSerDsc, P088G6_A213BarSit, P088G6_A161BarFecSal, P088G6_A155BarFecCli, P088G6_A159BarFecGen, P088G6_A136BarColNum, P088G6_A135BarColNom, P088G6_A252CliCod,
            P088G6_n252CliCod, P088G6_A13711BarTipArtD, P088G6_n13711BarTipArtD, P088G6_A212BarSer, P088G6_A4812BarEncCli, P088G6_A279CliNom, P088G6_A130BarCodPar, P088G6_A132BarCodReo, P088G6_A129BarCod, P088G6_A396EmprCod
            }
            , new Object[] {
            P088G7_A217BarTipArt, P088G7_n217BarTipArt, P088G7_A213BarSit, P088G7_A161BarFecSal, P088G7_A155BarFecCli, P088G7_A159BarFecGen, P088G7_A136BarColNum, P088G7_A135BarColNom, P088G7_A252CliCod, P088G7_n252CliCod,
            P088G7_A13711BarTipArtD, P088G7_n13711BarTipArtD, P088G7_A1652BarSerDsc, P088G7_A212BarSer, P088G7_A4812BarEncCli, P088G7_A279CliNom, P088G7_A130BarCodPar, P088G7_A132BarCodReo, P088G7_A129BarCod, P088G7_A396EmprCod
            }
            , new Object[] {
            P088G8_A217BarTipArt, P088G8_n217BarTipArt, P088G8_A135BarColNom, P088G8_A213BarSit, P088G8_A161BarFecSal, P088G8_A155BarFecCli, P088G8_A159BarFecGen, P088G8_A136BarColNum, P088G8_A252CliCod, P088G8_n252CliCod,
            P088G8_A13711BarTipArtD, P088G8_n13711BarTipArtD, P088G8_A1652BarSerDsc, P088G8_A212BarSer, P088G8_A4812BarEncCli, P088G8_A279CliNom, P088G8_A130BarCodPar, P088G8_A132BarCodReo, P088G8_A129BarCod, P088G8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV109TFBarSit ;
   private byte AV110TFBarSit_To ;
   private byte AV111TFHayRec_Sel ;
   private byte AV145Ttrn04wwds_23_tfbarsit ;
   private byte AV146Ttrn04wwds_24_tfbarsit_to ;
   private byte AV147Ttrn04wwds_25_tfhayrec_sel ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV121GXV1 ;
   private int AV20TFCliCod ;
   private int AV21TFCliCod_To ;
   private int AV32TFBarColNum ;
   private int AV33TFBarColNum_To ;
   private int AV136Ttrn04wwds_14_tfclicod ;
   private int AV137Ttrn04wwds_15_tfclicod_to ;
   private int AV140Ttrn04wwds_18_tfbarcolnum ;
   private int AV141Ttrn04wwds_19_tfbarcolnum_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV57InsertIndex ;
   private long AV66count ;
   private String AV95TFBarNHdr ;
   private String AV96TFBarNHdr_Sel ;
   private String AV22TFCliNom ;
   private String AV23TFCliNom_Sel ;
   private String AV112TFBarEncCli ;
   private String AV113TFBarEncCli_Sel ;
   private String AV24TFBarSer ;
   private String AV25TFBarSer_Sel ;
   private String AV26TFBarSerDsc ;
   private String AV27TFBarSerDsc_Sel ;
   private String AV114TFBarTipArtDsc ;
   private String AV115TFBarTipArtDsc_Sel ;
   private String AV30TFBarColNom ;
   private String AV31TFBarColNom_Sel ;
   private String A13696BarNHdr ;
   private String AV124Ttrn04wwds_2_tfbarnhdr ;
   private String AV125Ttrn04wwds_3_tfbarnhdr_sel ;
   private String AV126Ttrn04wwds_4_tfclinom ;
   private String AV127Ttrn04wwds_5_tfclinom_sel ;
   private String AV128Ttrn04wwds_6_tfbarenccli ;
   private String AV129Ttrn04wwds_7_tfbarenccli_sel ;
   private String AV130Ttrn04wwds_8_tfbarser ;
   private String AV131Ttrn04wwds_9_tfbarser_sel ;
   private String AV132Ttrn04wwds_10_tfbarserdsc ;
   private String AV133Ttrn04wwds_11_tfbarserdsc_sel ;
   private String AV134Ttrn04wwds_12_tfbartipartdsc ;
   private String AV135Ttrn04wwds_13_tfbartipartdsc_sel ;
   private String AV138Ttrn04wwds_16_tfbarcolnom ;
   private String AV139Ttrn04wwds_17_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV124Ttrn04wwds_2_tfbarnhdr ;
   private String lV126Ttrn04wwds_4_tfclinom ;
   private String lV128Ttrn04wwds_6_tfbarenccli ;
   private String lV130Ttrn04wwds_8_tfbarser ;
   private String lV132Ttrn04wwds_10_tfbarserdsc ;
   private String lV134Ttrn04wwds_12_tfbartipartdsc ;
   private String lV138Ttrn04wwds_16_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A396EmprCod ;
   private java.util.Date AV36TFBarFecGen ;
   private java.util.Date AV38TFBarFecCli ;
   private java.util.Date AV42TFBarFecSal ;
   private java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ;
   private java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ;
   private java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private boolean brk88G3 ;
   private boolean brk88G5 ;
   private boolean brk88G7 ;
   private boolean brk88G9 ;
   private boolean brk88G11 ;
   private boolean brk88G13 ;
   private String AV60OptionsJson ;
   private String AV63OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV56DDOName ;
   private String AV54SearchTxt ;
   private String AV55SearchTxtTo ;
   private String AV116FilterFullText ;
   private String AV123Ttrn04wwds_1_filterfulltext ;
   private String lV123Ttrn04wwds_1_filterfulltext ;
   private String AV58Option ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P088G2_A217BarTipArt ;
   private boolean[] P088G2_n217BarTipArt ;
   private byte[] P088G2_A213BarSit ;
   private java.util.Date[] P088G2_A161BarFecSal ;
   private java.util.Date[] P088G2_A155BarFecCli ;
   private java.util.Date[] P088G2_A159BarFecGen ;
   private int[] P088G2_A136BarColNum ;
   private String[] P088G2_A135BarColNom ;
   private int[] P088G2_A252CliCod ;
   private boolean[] P088G2_n252CliCod ;
   private String[] P088G2_A13711BarTipArtD ;
   private boolean[] P088G2_n13711BarTipArtD ;
   private String[] P088G2_A1652BarSerDsc ;
   private String[] P088G2_A212BarSer ;
   private String[] P088G2_A4812BarEncCli ;
   private String[] P088G2_A279CliNom ;
   private String[] P088G2_A130BarCodPar ;
   private byte[] P088G2_A132BarCodReo ;
   private int[] P088G2_A129BarCod ;
   private String[] P088G2_A396EmprCod ;
   private short[] P088G3_A217BarTipArt ;
   private boolean[] P088G3_n217BarTipArt ;
   private String[] P088G3_A279CliNom ;
   private byte[] P088G3_A213BarSit ;
   private java.util.Date[] P088G3_A161BarFecSal ;
   private java.util.Date[] P088G3_A155BarFecCli ;
   private java.util.Date[] P088G3_A159BarFecGen ;
   private int[] P088G3_A136BarColNum ;
   private String[] P088G3_A135BarColNom ;
   private int[] P088G3_A252CliCod ;
   private boolean[] P088G3_n252CliCod ;
   private String[] P088G3_A13711BarTipArtD ;
   private boolean[] P088G3_n13711BarTipArtD ;
   private String[] P088G3_A1652BarSerDsc ;
   private String[] P088G3_A212BarSer ;
   private String[] P088G3_A4812BarEncCli ;
   private String[] P088G3_A130BarCodPar ;
   private byte[] P088G3_A132BarCodReo ;
   private int[] P088G3_A129BarCod ;
   private String[] P088G3_A396EmprCod ;
   private short[] P088G4_A217BarTipArt ;
   private boolean[] P088G4_n217BarTipArt ;
   private String[] P088G4_A4812BarEncCli ;
   private byte[] P088G4_A213BarSit ;
   private java.util.Date[] P088G4_A161BarFecSal ;
   private java.util.Date[] P088G4_A155BarFecCli ;
   private java.util.Date[] P088G4_A159BarFecGen ;
   private int[] P088G4_A136BarColNum ;
   private String[] P088G4_A135BarColNom ;
   private int[] P088G4_A252CliCod ;
   private boolean[] P088G4_n252CliCod ;
   private String[] P088G4_A13711BarTipArtD ;
   private boolean[] P088G4_n13711BarTipArtD ;
   private String[] P088G4_A1652BarSerDsc ;
   private String[] P088G4_A212BarSer ;
   private String[] P088G4_A279CliNom ;
   private String[] P088G4_A130BarCodPar ;
   private byte[] P088G4_A132BarCodReo ;
   private int[] P088G4_A129BarCod ;
   private String[] P088G4_A396EmprCod ;
   private short[] P088G5_A217BarTipArt ;
   private boolean[] P088G5_n217BarTipArt ;
   private String[] P088G5_A212BarSer ;
   private byte[] P088G5_A213BarSit ;
   private java.util.Date[] P088G5_A161BarFecSal ;
   private java.util.Date[] P088G5_A155BarFecCli ;
   private java.util.Date[] P088G5_A159BarFecGen ;
   private int[] P088G5_A136BarColNum ;
   private String[] P088G5_A135BarColNom ;
   private int[] P088G5_A252CliCod ;
   private boolean[] P088G5_n252CliCod ;
   private String[] P088G5_A13711BarTipArtD ;
   private boolean[] P088G5_n13711BarTipArtD ;
   private String[] P088G5_A1652BarSerDsc ;
   private String[] P088G5_A4812BarEncCli ;
   private String[] P088G5_A279CliNom ;
   private String[] P088G5_A130BarCodPar ;
   private byte[] P088G5_A132BarCodReo ;
   private int[] P088G5_A129BarCod ;
   private String[] P088G5_A396EmprCod ;
   private short[] P088G6_A217BarTipArt ;
   private boolean[] P088G6_n217BarTipArt ;
   private String[] P088G6_A1652BarSerDsc ;
   private byte[] P088G6_A213BarSit ;
   private java.util.Date[] P088G6_A161BarFecSal ;
   private java.util.Date[] P088G6_A155BarFecCli ;
   private java.util.Date[] P088G6_A159BarFecGen ;
   private int[] P088G6_A136BarColNum ;
   private String[] P088G6_A135BarColNom ;
   private int[] P088G6_A252CliCod ;
   private boolean[] P088G6_n252CliCod ;
   private String[] P088G6_A13711BarTipArtD ;
   private boolean[] P088G6_n13711BarTipArtD ;
   private String[] P088G6_A212BarSer ;
   private String[] P088G6_A4812BarEncCli ;
   private String[] P088G6_A279CliNom ;
   private String[] P088G6_A130BarCodPar ;
   private byte[] P088G6_A132BarCodReo ;
   private int[] P088G6_A129BarCod ;
   private String[] P088G6_A396EmprCod ;
   private short[] P088G7_A217BarTipArt ;
   private boolean[] P088G7_n217BarTipArt ;
   private byte[] P088G7_A213BarSit ;
   private java.util.Date[] P088G7_A161BarFecSal ;
   private java.util.Date[] P088G7_A155BarFecCli ;
   private java.util.Date[] P088G7_A159BarFecGen ;
   private int[] P088G7_A136BarColNum ;
   private String[] P088G7_A135BarColNom ;
   private int[] P088G7_A252CliCod ;
   private boolean[] P088G7_n252CliCod ;
   private String[] P088G7_A13711BarTipArtD ;
   private boolean[] P088G7_n13711BarTipArtD ;
   private String[] P088G7_A1652BarSerDsc ;
   private String[] P088G7_A212BarSer ;
   private String[] P088G7_A4812BarEncCli ;
   private String[] P088G7_A279CliNom ;
   private String[] P088G7_A130BarCodPar ;
   private byte[] P088G7_A132BarCodReo ;
   private int[] P088G7_A129BarCod ;
   private String[] P088G7_A396EmprCod ;
   private short[] P088G8_A217BarTipArt ;
   private boolean[] P088G8_n217BarTipArt ;
   private String[] P088G8_A135BarColNom ;
   private byte[] P088G8_A213BarSit ;
   private java.util.Date[] P088G8_A161BarFecSal ;
   private java.util.Date[] P088G8_A155BarFecCli ;
   private java.util.Date[] P088G8_A159BarFecGen ;
   private int[] P088G8_A136BarColNum ;
   private int[] P088G8_A252CliCod ;
   private boolean[] P088G8_n252CliCod ;
   private String[] P088G8_A13711BarTipArtD ;
   private boolean[] P088G8_n13711BarTipArtD ;
   private String[] P088G8_A1652BarSerDsc ;
   private String[] P088G8_A212BarSer ;
   private String[] P088G8_A4812BarEncCli ;
   private String[] P088G8_A279CliNom ;
   private String[] P088G8_A130BarCodPar ;
   private byte[] P088G8_A132BarCodReo ;
   private int[] P088G8_A129BarCod ;
   private String[] P088G8_A396EmprCod ;
   private GXSimpleCollection<String> AV59Options ;
   private GXSimpleCollection<String> AV62OptionsDesc ;
   private GXSimpleCollection<String> AV64OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class ttrn04wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P088G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc," ;
      scmdbuf += " T1.BarSer, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P088G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T3.CliNom, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P088G4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarEncCli, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarEncCli" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P088G5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSer, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSer" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P088G6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[33];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSer, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P088G7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc," ;
      scmdbuf += " T1.BarSer, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarTipArt" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P088G8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Ttrn04wwds_1_filterfulltext ,
                                          String AV125Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV124Ttrn04wwds_2_tfbarnhdr ,
                                          String AV127Ttrn04wwds_5_tfclinom_sel ,
                                          String AV126Ttrn04wwds_4_tfclinom ,
                                          String AV129Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV128Ttrn04wwds_6_tfbarenccli ,
                                          String AV131Ttrn04wwds_9_tfbarser_sel ,
                                          String AV130Ttrn04wwds_8_tfbarser ,
                                          String AV133Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV132Ttrn04wwds_10_tfbarserdsc ,
                                          String AV135Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV134Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV136Ttrn04wwds_14_tfclicod ,
                                          int AV137Ttrn04wwds_15_tfclicod_to ,
                                          String AV139Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV138Ttrn04wwds_16_tfbarcolnom ,
                                          int AV140Ttrn04wwds_18_tfbarcolnum ,
                                          int AV141Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV142Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV143Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV144Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV145Ttrn04wwds_23_tfbarsit ,
                                          byte AV146Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte AV147Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[33];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarColNom, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc," ;
      scmdbuf += " T1.BarSer, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV123Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV128Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (0==AV136Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (0==AV137Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV140Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P088G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
            case 1 :
                  return conditional_P088G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
            case 2 :
                  return conditional_P088G4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
            case 3 :
                  return conditional_P088G5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
            case 4 :
                  return conditional_P088G6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
            case 5 :
                  return conditional_P088G7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
            case 6 :
                  return conditional_P088G8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P088G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P088G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P088G4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P088G5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P088G6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P088G7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P088G8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 20);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

