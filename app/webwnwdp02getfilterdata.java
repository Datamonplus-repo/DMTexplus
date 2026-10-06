package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwnwdp02getfilterdata extends GXProcedure
{
   public webwnwdp02getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwnwdp02getfilterdata.class ), "" );
   }

   public webwnwdp02getfilterdata( int remoteHandle ,
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
      webwnwdp02getfilterdata.this.aP5 = new String[] {""};
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
      webwnwdp02getfilterdata.this.AV36DDOName = aP0;
      webwnwdp02getfilterdata.this.AV34SearchTxt = aP1;
      webwnwdp02getfilterdata.this.AV35SearchTxtTo = aP2;
      webwnwdp02getfilterdata.this.aP3 = aP3;
      webwnwdp02getfilterdata.this.aP4 = aP4;
      webwnwdp02getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_DISARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_DISARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_DISCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCOLNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_DISNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADDISNOMCLIOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_DIBCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADDIBCLIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("WebWNwDP02GridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWNwDP02GridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("WebWNwDP02GridState"), null, null);
      }
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV14TFDisCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFDisCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV18TFDisFec = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV20TFDisArtCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV21TFDisArtCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV22TFDisArtDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV23TFDisArtDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV24TFDisColNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV25TFDisColNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV26TFDisNomCli = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV27TFDisNomCli_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV28TFDisColNum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFDisColNum_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI") == 0 )
         {
            AV30TFDibCli = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI_SEL") == 0 )
         {
            AV31TFDibCli_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBINT") == 0 )
         {
            AV32TFDibInt = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFDibInt_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISMAXOBSLIN") == 0 )
         {
            AV64TFDisMaxObsLin = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFDisMaxObsLin_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV66TFDisCanRec = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFDisCanRec_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFDisArtCod = AV34SearchTxt ;
      AV21TFDisArtCod_Sel = "" ;
      AV72Webwnwdp02ds_1_filterfulltext = AV52FilterFullText ;
      AV73Webwnwdp02ds_2_tfdiscod = AV14TFDisCod ;
      AV74Webwnwdp02ds_3_tfdiscod_to = AV15TFDisCod_To ;
      AV75Webwnwdp02ds_4_tfclicod = AV16TFCliCod ;
      AV76Webwnwdp02ds_5_tfclicod_to = AV17TFCliCod_To ;
      AV77Webwnwdp02ds_6_tfdisfec = AV18TFDisFec ;
      AV78Webwnwdp02ds_7_tfdisartcod = AV20TFDisArtCod ;
      AV79Webwnwdp02ds_8_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV80Webwnwdp02ds_9_tfdisartdsc = AV22TFDisArtDsc ;
      AV81Webwnwdp02ds_10_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV82Webwnwdp02ds_11_tfdiscolnom = AV24TFDisColNom ;
      AV83Webwnwdp02ds_12_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV84Webwnwdp02ds_13_tfdisnomcli = AV26TFDisNomCli ;
      AV85Webwnwdp02ds_14_tfdisnomcli_sel = AV27TFDisNomCli_Sel ;
      AV86Webwnwdp02ds_15_tfdiscolnum = AV28TFDisColNum ;
      AV87Webwnwdp02ds_16_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV88Webwnwdp02ds_17_tfdibcli = AV30TFDibCli ;
      AV89Webwnwdp02ds_18_tfdibcli_sel = AV31TFDibCli_Sel ;
      AV90Webwnwdp02ds_19_tfdibint = AV32TFDibInt ;
      AV91Webwnwdp02ds_20_tfdibint_to = AV33TFDibInt_To ;
      AV92Webwnwdp02ds_21_tfdismaxobslin = AV64TFDisMaxObsLin ;
      AV93Webwnwdp02ds_22_tfdismaxobslin_to = AV65TFDisMaxObsLin_To ;
      AV94Webwnwdp02ds_23_tfdiscanrec = AV66TFDisCanRec ;
      AV95Webwnwdp02ds_24_tfdiscanrec_to = AV67TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to) ,
                                           AV77Webwnwdp02ds_6_tfdisfec ,
                                           AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV78Webwnwdp02ds_7_tfdisartcod ,
                                           AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV88Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV63Discodp) ,
                                           Integer.valueOf(AV56CliCod) ,
                                           AV57DisCliNum ,
                                           AV58DisArtCod ,
                                           AV59Disartdsc ,
                                           AV60DisColNom ,
                                           AV61Disnomcli ,
                                           AV62DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           AV72Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV55pricod ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           AV54Disfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV80Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV80Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV82Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV82Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV84Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV88Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV57DisCliNum = GXutil.padr( GXutil.rtrim( AV57DisCliNum), 8, "%") ;
      lV58DisArtCod = GXutil.padr( GXutil.rtrim( AV58DisArtCod), 16, "%") ;
      lV59Disartdsc = GXutil.padr( GXutil.rtrim( AV59Disartdsc), 26, "%") ;
      lV60DisColNom = GXutil.padr( GXutil.rtrim( AV60DisColNom), 13, "%") ;
      lV61Disnomcli = GXutil.padr( GXutil.rtrim( AV61Disnomcli), 13, "%") ;
      /* Using cursor P08ER4 */
      pr_default.execute(0, new Object[] {AV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), AV55pricod, AV55pricod, AV53EmprCod, AV54Disfec, Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to), AV77Webwnwdp02ds_6_tfdisfec, lV78Webwnwdp02ds_7_tfdisartcod, AV79Webwnwdp02ds_8_tfdisartcod_sel, lV80Webwnwdp02ds_9_tfdisartdsc, AV81Webwnwdp02ds_10_tfdisartdsc_sel, lV82Webwnwdp02ds_11_tfdiscolnom, AV83Webwnwdp02ds_12_tfdiscolnom_sel, lV84Webwnwdp02ds_13_tfdisnomcli, AV85Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to), lV88Webwnwdp02ds_17_tfdibcli, AV89Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV63Discodp), Integer.valueOf(AV56CliCod), lV57DisCliNum, lV58DisArtCod, lV59Disartdsc, lV60DisColNom, lV61Disnomcli, AV62DisUsrcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8ER2 = false ;
         A396EmprCod = P08ER4_A396EmprCod[0] ;
         A369DisFec = P08ER4_A369DisFec[0] ;
         A335DisArtCod = P08ER4_A335DisArtCod[0] ;
         A4348DisUsrCod = P08ER4_A4348DisUsrCod[0] ;
         A360DisCliNum = P08ER4_A360DisCliNum[0] ;
         A757PriCod = P08ER4_A757PriCod[0] ;
         A1014DibInt = P08ER4_A1014DibInt[0] ;
         n1014DibInt = P08ER4_n1014DibInt[0] ;
         A1013DibCli = P08ER4_A1013DibCli[0] ;
         n1013DibCli = P08ER4_n1013DibCli[0] ;
         A363DisColNum = P08ER4_A363DisColNum[0] ;
         n363DisColNum = P08ER4_n363DisColNum[0] ;
         A1195DisNomCli = P08ER4_A1195DisNomCli[0] ;
         A362DisColNom = P08ER4_A362DisColNom[0] ;
         n362DisColNom = P08ER4_n362DisColNom[0] ;
         A337DisArtDsc = P08ER4_A337DisArtDsc[0] ;
         A252CliCod = P08ER4_A252CliCod[0] ;
         A361DisCod = P08ER4_A361DisCod[0] ;
         A13732DisCanRec = P08ER4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER4_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08ER4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER4_n13737DisMaxObsL[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08ER4_A335DisArtCod[0], A335DisArtCod) == 0 ) )
         {
            brk8ER2 = false ;
            A396EmprCod = P08ER4_A396EmprCod[0] ;
            A361DisCod = P08ER4_A361DisCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8ER2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
         {
            AV38Option = A335DisArtCod ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ER2 )
         {
            brk8ER2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDISARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFDisArtDsc = AV34SearchTxt ;
      AV23TFDisArtDsc_Sel = "" ;
      AV72Webwnwdp02ds_1_filterfulltext = AV52FilterFullText ;
      AV73Webwnwdp02ds_2_tfdiscod = AV14TFDisCod ;
      AV74Webwnwdp02ds_3_tfdiscod_to = AV15TFDisCod_To ;
      AV75Webwnwdp02ds_4_tfclicod = AV16TFCliCod ;
      AV76Webwnwdp02ds_5_tfclicod_to = AV17TFCliCod_To ;
      AV77Webwnwdp02ds_6_tfdisfec = AV18TFDisFec ;
      AV78Webwnwdp02ds_7_tfdisartcod = AV20TFDisArtCod ;
      AV79Webwnwdp02ds_8_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV80Webwnwdp02ds_9_tfdisartdsc = AV22TFDisArtDsc ;
      AV81Webwnwdp02ds_10_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV82Webwnwdp02ds_11_tfdiscolnom = AV24TFDisColNom ;
      AV83Webwnwdp02ds_12_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV84Webwnwdp02ds_13_tfdisnomcli = AV26TFDisNomCli ;
      AV85Webwnwdp02ds_14_tfdisnomcli_sel = AV27TFDisNomCli_Sel ;
      AV86Webwnwdp02ds_15_tfdiscolnum = AV28TFDisColNum ;
      AV87Webwnwdp02ds_16_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV88Webwnwdp02ds_17_tfdibcli = AV30TFDibCli ;
      AV89Webwnwdp02ds_18_tfdibcli_sel = AV31TFDibCli_Sel ;
      AV90Webwnwdp02ds_19_tfdibint = AV32TFDibInt ;
      AV91Webwnwdp02ds_20_tfdibint_to = AV33TFDibInt_To ;
      AV92Webwnwdp02ds_21_tfdismaxobslin = AV64TFDisMaxObsLin ;
      AV93Webwnwdp02ds_22_tfdismaxobslin_to = AV65TFDisMaxObsLin_To ;
      AV94Webwnwdp02ds_23_tfdiscanrec = AV66TFDisCanRec ;
      AV95Webwnwdp02ds_24_tfdiscanrec_to = AV67TFDisCanRec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to) ,
                                           AV77Webwnwdp02ds_6_tfdisfec ,
                                           AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV78Webwnwdp02ds_7_tfdisartcod ,
                                           AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV88Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV63Discodp) ,
                                           Integer.valueOf(AV56CliCod) ,
                                           AV57DisCliNum ,
                                           AV58DisArtCod ,
                                           AV59Disartdsc ,
                                           AV60DisColNom ,
                                           AV61Disnomcli ,
                                           AV62DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           AV72Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV55pricod ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           AV54Disfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV80Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV80Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV82Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV82Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV84Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV88Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV57DisCliNum = GXutil.padr( GXutil.rtrim( AV57DisCliNum), 8, "%") ;
      lV58DisArtCod = GXutil.padr( GXutil.rtrim( AV58DisArtCod), 16, "%") ;
      lV59Disartdsc = GXutil.padr( GXutil.rtrim( AV59Disartdsc), 26, "%") ;
      lV60DisColNom = GXutil.padr( GXutil.rtrim( AV60DisColNom), 13, "%") ;
      lV61Disnomcli = GXutil.padr( GXutil.rtrim( AV61Disnomcli), 13, "%") ;
      /* Using cursor P08ER7 */
      pr_default.execute(1, new Object[] {AV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), AV55pricod, AV55pricod, AV53EmprCod, AV54Disfec, Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to), AV77Webwnwdp02ds_6_tfdisfec, lV78Webwnwdp02ds_7_tfdisartcod, AV79Webwnwdp02ds_8_tfdisartcod_sel, lV80Webwnwdp02ds_9_tfdisartdsc, AV81Webwnwdp02ds_10_tfdisartdsc_sel, lV82Webwnwdp02ds_11_tfdiscolnom, AV83Webwnwdp02ds_12_tfdiscolnom_sel, lV84Webwnwdp02ds_13_tfdisnomcli, AV85Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to), lV88Webwnwdp02ds_17_tfdibcli, AV89Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV63Discodp), Integer.valueOf(AV56CliCod), lV57DisCliNum, lV58DisArtCod, lV59Disartdsc, lV60DisColNom, lV61Disnomcli, AV62DisUsrcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8ER4 = false ;
         A396EmprCod = P08ER7_A396EmprCod[0] ;
         A369DisFec = P08ER7_A369DisFec[0] ;
         A337DisArtDsc = P08ER7_A337DisArtDsc[0] ;
         A4348DisUsrCod = P08ER7_A4348DisUsrCod[0] ;
         A360DisCliNum = P08ER7_A360DisCliNum[0] ;
         A757PriCod = P08ER7_A757PriCod[0] ;
         A1014DibInt = P08ER7_A1014DibInt[0] ;
         n1014DibInt = P08ER7_n1014DibInt[0] ;
         A1013DibCli = P08ER7_A1013DibCli[0] ;
         n1013DibCli = P08ER7_n1013DibCli[0] ;
         A363DisColNum = P08ER7_A363DisColNum[0] ;
         n363DisColNum = P08ER7_n363DisColNum[0] ;
         A1195DisNomCli = P08ER7_A1195DisNomCli[0] ;
         A362DisColNom = P08ER7_A362DisColNom[0] ;
         n362DisColNom = P08ER7_n362DisColNom[0] ;
         A335DisArtCod = P08ER7_A335DisArtCod[0] ;
         A252CliCod = P08ER7_A252CliCod[0] ;
         A361DisCod = P08ER7_A361DisCod[0] ;
         A13732DisCanRec = P08ER7_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER7_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER7_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER7_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08ER7_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER7_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER7_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER7_n13737DisMaxObsL[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08ER7_A337DisArtDsc[0], A337DisArtDsc) == 0 ) )
         {
            brk8ER4 = false ;
            A396EmprCod = P08ER7_A396EmprCod[0] ;
            A361DisCod = P08ER7_A361DisCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8ER4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A337DisArtDsc)==0) )
         {
            AV38Option = A337DisArtDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ER4 )
         {
            brk8ER4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDISCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDisColNom = AV34SearchTxt ;
      AV25TFDisColNom_Sel = "" ;
      AV72Webwnwdp02ds_1_filterfulltext = AV52FilterFullText ;
      AV73Webwnwdp02ds_2_tfdiscod = AV14TFDisCod ;
      AV74Webwnwdp02ds_3_tfdiscod_to = AV15TFDisCod_To ;
      AV75Webwnwdp02ds_4_tfclicod = AV16TFCliCod ;
      AV76Webwnwdp02ds_5_tfclicod_to = AV17TFCliCod_To ;
      AV77Webwnwdp02ds_6_tfdisfec = AV18TFDisFec ;
      AV78Webwnwdp02ds_7_tfdisartcod = AV20TFDisArtCod ;
      AV79Webwnwdp02ds_8_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV80Webwnwdp02ds_9_tfdisartdsc = AV22TFDisArtDsc ;
      AV81Webwnwdp02ds_10_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV82Webwnwdp02ds_11_tfdiscolnom = AV24TFDisColNom ;
      AV83Webwnwdp02ds_12_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV84Webwnwdp02ds_13_tfdisnomcli = AV26TFDisNomCli ;
      AV85Webwnwdp02ds_14_tfdisnomcli_sel = AV27TFDisNomCli_Sel ;
      AV86Webwnwdp02ds_15_tfdiscolnum = AV28TFDisColNum ;
      AV87Webwnwdp02ds_16_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV88Webwnwdp02ds_17_tfdibcli = AV30TFDibCli ;
      AV89Webwnwdp02ds_18_tfdibcli_sel = AV31TFDibCli_Sel ;
      AV90Webwnwdp02ds_19_tfdibint = AV32TFDibInt ;
      AV91Webwnwdp02ds_20_tfdibint_to = AV33TFDibInt_To ;
      AV92Webwnwdp02ds_21_tfdismaxobslin = AV64TFDisMaxObsLin ;
      AV93Webwnwdp02ds_22_tfdismaxobslin_to = AV65TFDisMaxObsLin_To ;
      AV94Webwnwdp02ds_23_tfdiscanrec = AV66TFDisCanRec ;
      AV95Webwnwdp02ds_24_tfdiscanrec_to = AV67TFDisCanRec_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to) ,
                                           AV77Webwnwdp02ds_6_tfdisfec ,
                                           AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV78Webwnwdp02ds_7_tfdisartcod ,
                                           AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV88Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV63Discodp) ,
                                           Integer.valueOf(AV56CliCod) ,
                                           AV57DisCliNum ,
                                           AV58DisArtCod ,
                                           AV59Disartdsc ,
                                           AV60DisColNom ,
                                           AV61Disnomcli ,
                                           AV62DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           AV72Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV55pricod ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           AV54Disfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV80Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV80Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV82Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV82Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV84Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV88Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV57DisCliNum = GXutil.padr( GXutil.rtrim( AV57DisCliNum), 8, "%") ;
      lV58DisArtCod = GXutil.padr( GXutil.rtrim( AV58DisArtCod), 16, "%") ;
      lV59Disartdsc = GXutil.padr( GXutil.rtrim( AV59Disartdsc), 26, "%") ;
      lV60DisColNom = GXutil.padr( GXutil.rtrim( AV60DisColNom), 13, "%") ;
      lV61Disnomcli = GXutil.padr( GXutil.rtrim( AV61Disnomcli), 13, "%") ;
      /* Using cursor P08ER10 */
      pr_default.execute(2, new Object[] {AV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), AV55pricod, AV55pricod, AV53EmprCod, AV54Disfec, Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to), AV77Webwnwdp02ds_6_tfdisfec, lV78Webwnwdp02ds_7_tfdisartcod, AV79Webwnwdp02ds_8_tfdisartcod_sel, lV80Webwnwdp02ds_9_tfdisartdsc, AV81Webwnwdp02ds_10_tfdisartdsc_sel, lV82Webwnwdp02ds_11_tfdiscolnom, AV83Webwnwdp02ds_12_tfdiscolnom_sel, lV84Webwnwdp02ds_13_tfdisnomcli, AV85Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to), lV88Webwnwdp02ds_17_tfdibcli, AV89Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV63Discodp), Integer.valueOf(AV56CliCod), lV57DisCliNum, lV58DisArtCod, lV59Disartdsc, lV60DisColNom, lV61Disnomcli, AV62DisUsrcod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8ER6 = false ;
         A396EmprCod = P08ER10_A396EmprCod[0] ;
         A369DisFec = P08ER10_A369DisFec[0] ;
         A362DisColNom = P08ER10_A362DisColNom[0] ;
         n362DisColNom = P08ER10_n362DisColNom[0] ;
         A4348DisUsrCod = P08ER10_A4348DisUsrCod[0] ;
         A360DisCliNum = P08ER10_A360DisCliNum[0] ;
         A757PriCod = P08ER10_A757PriCod[0] ;
         A1014DibInt = P08ER10_A1014DibInt[0] ;
         n1014DibInt = P08ER10_n1014DibInt[0] ;
         A1013DibCli = P08ER10_A1013DibCli[0] ;
         n1013DibCli = P08ER10_n1013DibCli[0] ;
         A363DisColNum = P08ER10_A363DisColNum[0] ;
         n363DisColNum = P08ER10_n363DisColNum[0] ;
         A1195DisNomCli = P08ER10_A1195DisNomCli[0] ;
         A337DisArtDsc = P08ER10_A337DisArtDsc[0] ;
         A335DisArtCod = P08ER10_A335DisArtCod[0] ;
         A252CliCod = P08ER10_A252CliCod[0] ;
         A361DisCod = P08ER10_A361DisCod[0] ;
         A13732DisCanRec = P08ER10_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER10_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER10_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER10_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08ER10_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER10_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER10_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER10_n13737DisMaxObsL[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08ER10_A362DisColNom[0], A362DisColNom) == 0 ) )
         {
            brk8ER6 = false ;
            A396EmprCod = P08ER10_A396EmprCod[0] ;
            A361DisCod = P08ER10_A361DisCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8ER6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A362DisColNom)==0) )
         {
            AV38Option = A362DisColNom ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ER6 )
         {
            brk8ER6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDISNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV26TFDisNomCli = AV34SearchTxt ;
      AV27TFDisNomCli_Sel = "" ;
      AV72Webwnwdp02ds_1_filterfulltext = AV52FilterFullText ;
      AV73Webwnwdp02ds_2_tfdiscod = AV14TFDisCod ;
      AV74Webwnwdp02ds_3_tfdiscod_to = AV15TFDisCod_To ;
      AV75Webwnwdp02ds_4_tfclicod = AV16TFCliCod ;
      AV76Webwnwdp02ds_5_tfclicod_to = AV17TFCliCod_To ;
      AV77Webwnwdp02ds_6_tfdisfec = AV18TFDisFec ;
      AV78Webwnwdp02ds_7_tfdisartcod = AV20TFDisArtCod ;
      AV79Webwnwdp02ds_8_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV80Webwnwdp02ds_9_tfdisartdsc = AV22TFDisArtDsc ;
      AV81Webwnwdp02ds_10_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV82Webwnwdp02ds_11_tfdiscolnom = AV24TFDisColNom ;
      AV83Webwnwdp02ds_12_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV84Webwnwdp02ds_13_tfdisnomcli = AV26TFDisNomCli ;
      AV85Webwnwdp02ds_14_tfdisnomcli_sel = AV27TFDisNomCli_Sel ;
      AV86Webwnwdp02ds_15_tfdiscolnum = AV28TFDisColNum ;
      AV87Webwnwdp02ds_16_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV88Webwnwdp02ds_17_tfdibcli = AV30TFDibCli ;
      AV89Webwnwdp02ds_18_tfdibcli_sel = AV31TFDibCli_Sel ;
      AV90Webwnwdp02ds_19_tfdibint = AV32TFDibInt ;
      AV91Webwnwdp02ds_20_tfdibint_to = AV33TFDibInt_To ;
      AV92Webwnwdp02ds_21_tfdismaxobslin = AV64TFDisMaxObsLin ;
      AV93Webwnwdp02ds_22_tfdismaxobslin_to = AV65TFDisMaxObsLin_To ;
      AV94Webwnwdp02ds_23_tfdiscanrec = AV66TFDisCanRec ;
      AV95Webwnwdp02ds_24_tfdiscanrec_to = AV67TFDisCanRec_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to) ,
                                           AV77Webwnwdp02ds_6_tfdisfec ,
                                           AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV78Webwnwdp02ds_7_tfdisartcod ,
                                           AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV88Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV63Discodp) ,
                                           Integer.valueOf(AV56CliCod) ,
                                           AV57DisCliNum ,
                                           AV58DisArtCod ,
                                           AV59Disartdsc ,
                                           AV60DisColNom ,
                                           AV61Disnomcli ,
                                           AV62DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           AV72Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV55pricod ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           AV54Disfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV80Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV80Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV82Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV82Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV84Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV88Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV57DisCliNum = GXutil.padr( GXutil.rtrim( AV57DisCliNum), 8, "%") ;
      lV58DisArtCod = GXutil.padr( GXutil.rtrim( AV58DisArtCod), 16, "%") ;
      lV59Disartdsc = GXutil.padr( GXutil.rtrim( AV59Disartdsc), 26, "%") ;
      lV60DisColNom = GXutil.padr( GXutil.rtrim( AV60DisColNom), 13, "%") ;
      lV61Disnomcli = GXutil.padr( GXutil.rtrim( AV61Disnomcli), 13, "%") ;
      /* Using cursor P08ER13 */
      pr_default.execute(3, new Object[] {AV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), AV55pricod, AV55pricod, AV53EmprCod, AV54Disfec, Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to), AV77Webwnwdp02ds_6_tfdisfec, lV78Webwnwdp02ds_7_tfdisartcod, AV79Webwnwdp02ds_8_tfdisartcod_sel, lV80Webwnwdp02ds_9_tfdisartdsc, AV81Webwnwdp02ds_10_tfdisartdsc_sel, lV82Webwnwdp02ds_11_tfdiscolnom, AV83Webwnwdp02ds_12_tfdiscolnom_sel, lV84Webwnwdp02ds_13_tfdisnomcli, AV85Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to), lV88Webwnwdp02ds_17_tfdibcli, AV89Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV63Discodp), Integer.valueOf(AV56CliCod), lV57DisCliNum, lV58DisArtCod, lV59Disartdsc, lV60DisColNom, lV61Disnomcli, AV62DisUsrcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8ER8 = false ;
         A396EmprCod = P08ER13_A396EmprCod[0] ;
         A369DisFec = P08ER13_A369DisFec[0] ;
         A1195DisNomCli = P08ER13_A1195DisNomCli[0] ;
         A4348DisUsrCod = P08ER13_A4348DisUsrCod[0] ;
         A360DisCliNum = P08ER13_A360DisCliNum[0] ;
         A757PriCod = P08ER13_A757PriCod[0] ;
         A1014DibInt = P08ER13_A1014DibInt[0] ;
         n1014DibInt = P08ER13_n1014DibInt[0] ;
         A1013DibCli = P08ER13_A1013DibCli[0] ;
         n1013DibCli = P08ER13_n1013DibCli[0] ;
         A363DisColNum = P08ER13_A363DisColNum[0] ;
         n363DisColNum = P08ER13_n363DisColNum[0] ;
         A362DisColNom = P08ER13_A362DisColNom[0] ;
         n362DisColNom = P08ER13_n362DisColNom[0] ;
         A337DisArtDsc = P08ER13_A337DisArtDsc[0] ;
         A335DisArtCod = P08ER13_A335DisArtCod[0] ;
         A252CliCod = P08ER13_A252CliCod[0] ;
         A361DisCod = P08ER13_A361DisCod[0] ;
         A13732DisCanRec = P08ER13_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER13_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER13_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER13_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08ER13_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER13_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER13_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER13_n13737DisMaxObsL[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08ER13_A1195DisNomCli[0], A1195DisNomCli) == 0 ) )
         {
            brk8ER8 = false ;
            A396EmprCod = P08ER13_A396EmprCod[0] ;
            A361DisCod = P08ER13_A361DisCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8ER8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1195DisNomCli)==0) )
         {
            AV38Option = A1195DisNomCli ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ER8 )
         {
            brk8ER8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDIBCLIOPTIONS' Routine */
      returnInSub = false ;
      AV30TFDibCli = AV34SearchTxt ;
      AV31TFDibCli_Sel = "" ;
      AV72Webwnwdp02ds_1_filterfulltext = AV52FilterFullText ;
      AV73Webwnwdp02ds_2_tfdiscod = AV14TFDisCod ;
      AV74Webwnwdp02ds_3_tfdiscod_to = AV15TFDisCod_To ;
      AV75Webwnwdp02ds_4_tfclicod = AV16TFCliCod ;
      AV76Webwnwdp02ds_5_tfclicod_to = AV17TFCliCod_To ;
      AV77Webwnwdp02ds_6_tfdisfec = AV18TFDisFec ;
      AV78Webwnwdp02ds_7_tfdisartcod = AV20TFDisArtCod ;
      AV79Webwnwdp02ds_8_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV80Webwnwdp02ds_9_tfdisartdsc = AV22TFDisArtDsc ;
      AV81Webwnwdp02ds_10_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV82Webwnwdp02ds_11_tfdiscolnom = AV24TFDisColNom ;
      AV83Webwnwdp02ds_12_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV84Webwnwdp02ds_13_tfdisnomcli = AV26TFDisNomCli ;
      AV85Webwnwdp02ds_14_tfdisnomcli_sel = AV27TFDisNomCli_Sel ;
      AV86Webwnwdp02ds_15_tfdiscolnum = AV28TFDisColNum ;
      AV87Webwnwdp02ds_16_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV88Webwnwdp02ds_17_tfdibcli = AV30TFDibCli ;
      AV89Webwnwdp02ds_18_tfdibcli_sel = AV31TFDibCli_Sel ;
      AV90Webwnwdp02ds_19_tfdibint = AV32TFDibInt ;
      AV91Webwnwdp02ds_20_tfdibint_to = AV33TFDibInt_To ;
      AV92Webwnwdp02ds_21_tfdismaxobslin = AV64TFDisMaxObsLin ;
      AV93Webwnwdp02ds_22_tfdismaxobslin_to = AV65TFDisMaxObsLin_To ;
      AV94Webwnwdp02ds_23_tfdiscanrec = AV66TFDisCanRec ;
      AV95Webwnwdp02ds_24_tfdiscanrec_to = AV67TFDisCanRec_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to) ,
                                           AV77Webwnwdp02ds_6_tfdisfec ,
                                           AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV78Webwnwdp02ds_7_tfdisartcod ,
                                           AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV88Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV63Discodp) ,
                                           Integer.valueOf(AV56CliCod) ,
                                           AV57DisCliNum ,
                                           AV58DisArtCod ,
                                           AV59Disartdsc ,
                                           AV60DisColNom ,
                                           AV61Disnomcli ,
                                           AV62DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           AV72Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV55pricod ,
                                           AV54Disfec ,
                                           AV53EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV72Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV80Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV80Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV82Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV82Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV84Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV88Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV57DisCliNum = GXutil.padr( GXutil.rtrim( AV57DisCliNum), 8, "%") ;
      lV58DisArtCod = GXutil.padr( GXutil.rtrim( AV58DisArtCod), 16, "%") ;
      lV59Disartdsc = GXutil.padr( GXutil.rtrim( AV59Disartdsc), 26, "%") ;
      lV60DisColNom = GXutil.padr( GXutil.rtrim( AV60DisColNom), 13, "%") ;
      lV61Disnomcli = GXutil.padr( GXutil.rtrim( AV61Disnomcli), 13, "%") ;
      /* Using cursor P08ER16 */
      pr_default.execute(4, new Object[] {AV53EmprCod, AV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, lV72Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV92Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV93Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV94Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV95Webwnwdp02ds_24_tfdiscanrec_to), AV55pricod, AV55pricod, AV54Disfec, Integer.valueOf(AV73Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV74Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV75Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV76Webwnwdp02ds_5_tfclicod_to), AV77Webwnwdp02ds_6_tfdisfec, lV78Webwnwdp02ds_7_tfdisartcod, AV79Webwnwdp02ds_8_tfdisartcod_sel, lV80Webwnwdp02ds_9_tfdisartdsc, AV81Webwnwdp02ds_10_tfdisartdsc_sel, lV82Webwnwdp02ds_11_tfdiscolnom, AV83Webwnwdp02ds_12_tfdiscolnom_sel, lV84Webwnwdp02ds_13_tfdisnomcli, AV85Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV86Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV87Webwnwdp02ds_16_tfdiscolnum_to), lV88Webwnwdp02ds_17_tfdibcli, AV89Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV90Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV91Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV63Discodp), Integer.valueOf(AV56CliCod), lV57DisCliNum, lV58DisArtCod, lV59Disartdsc, lV60DisColNom, lV61Disnomcli, AV62DisUsrcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8ER10 = false ;
         A396EmprCod = P08ER16_A396EmprCod[0] ;
         A1013DibCli = P08ER16_A1013DibCli[0] ;
         n1013DibCli = P08ER16_n1013DibCli[0] ;
         A4348DisUsrCod = P08ER16_A4348DisUsrCod[0] ;
         A360DisCliNum = P08ER16_A360DisCliNum[0] ;
         A757PriCod = P08ER16_A757PriCod[0] ;
         A1014DibInt = P08ER16_A1014DibInt[0] ;
         n1014DibInt = P08ER16_n1014DibInt[0] ;
         A363DisColNum = P08ER16_A363DisColNum[0] ;
         n363DisColNum = P08ER16_n363DisColNum[0] ;
         A1195DisNomCli = P08ER16_A1195DisNomCli[0] ;
         A362DisColNom = P08ER16_A362DisColNom[0] ;
         n362DisColNom = P08ER16_n362DisColNom[0] ;
         A337DisArtDsc = P08ER16_A337DisArtDsc[0] ;
         A335DisArtCod = P08ER16_A335DisArtCod[0] ;
         A369DisFec = P08ER16_A369DisFec[0] ;
         A252CliCod = P08ER16_A252CliCod[0] ;
         A361DisCod = P08ER16_A361DisCod[0] ;
         A13732DisCanRec = P08ER16_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER16_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER16_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER16_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08ER16_A13732DisCanRec[0] ;
         n13732DisCanRec = P08ER16_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08ER16_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08ER16_n13737DisMaxObsL[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08ER16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08ER16_A1013DibCli[0], A1013DibCli) == 0 ) )
         {
            brk8ER10 = false ;
            A361DisCod = P08ER16_A361DisCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8ER10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1013DibCli)==0) )
         {
            AV38Option = A1013DibCli ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ER10 )
         {
            brk8ER10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwnwdp02getfilterdata.this.AV40OptionsJson;
      this.aP4[0] = webwnwdp02getfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = webwnwdp02getfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52FilterFullText = "" ;
      AV18TFDisFec = GXutil.nullDate() ;
      AV20TFDisArtCod = "" ;
      AV21TFDisArtCod_Sel = "" ;
      AV22TFDisArtDsc = "" ;
      AV23TFDisArtDsc_Sel = "" ;
      AV24TFDisColNom = "" ;
      AV25TFDisColNom_Sel = "" ;
      AV26TFDisNomCli = "" ;
      AV27TFDisNomCli_Sel = "" ;
      AV30TFDibCli = "" ;
      AV31TFDibCli_Sel = "" ;
      A335DisArtCod = "" ;
      AV72Webwnwdp02ds_1_filterfulltext = "" ;
      AV77Webwnwdp02ds_6_tfdisfec = GXutil.nullDate() ;
      AV78Webwnwdp02ds_7_tfdisartcod = "" ;
      AV79Webwnwdp02ds_8_tfdisartcod_sel = "" ;
      AV80Webwnwdp02ds_9_tfdisartdsc = "" ;
      AV81Webwnwdp02ds_10_tfdisartdsc_sel = "" ;
      AV82Webwnwdp02ds_11_tfdiscolnom = "" ;
      AV83Webwnwdp02ds_12_tfdiscolnom_sel = "" ;
      AV84Webwnwdp02ds_13_tfdisnomcli = "" ;
      AV85Webwnwdp02ds_14_tfdisnomcli_sel = "" ;
      AV88Webwnwdp02ds_17_tfdibcli = "" ;
      AV89Webwnwdp02ds_18_tfdibcli_sel = "" ;
      lV72Webwnwdp02ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV78Webwnwdp02ds_7_tfdisartcod = "" ;
      lV80Webwnwdp02ds_9_tfdisartdsc = "" ;
      lV82Webwnwdp02ds_11_tfdiscolnom = "" ;
      lV84Webwnwdp02ds_13_tfdisnomcli = "" ;
      lV88Webwnwdp02ds_17_tfdibcli = "" ;
      lV57DisCliNum = "" ;
      lV58DisArtCod = "" ;
      lV59Disartdsc = "" ;
      lV60DisColNom = "" ;
      lV61Disnomcli = "" ;
      AV57DisCliNum = "" ;
      AV58DisArtCod = "" ;
      AV59Disartdsc = "" ;
      AV60DisColNom = "" ;
      AV61Disnomcli = "" ;
      AV62DisUsrcod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1013DibCli = "" ;
      A360DisCliNum = "" ;
      A4348DisUsrCod = "" ;
      A757PriCod = "" ;
      AV55pricod = "" ;
      A396EmprCod = "" ;
      AV53EmprCod = "" ;
      AV54Disfec = GXutil.nullDate() ;
      P08ER4_A396EmprCod = new String[] {""} ;
      P08ER4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ER4_A335DisArtCod = new String[] {""} ;
      P08ER4_A4348DisUsrCod = new String[] {""} ;
      P08ER4_A360DisCliNum = new String[] {""} ;
      P08ER4_A757PriCod = new String[] {""} ;
      P08ER4_A1014DibInt = new int[1] ;
      P08ER4_n1014DibInt = new boolean[] {false} ;
      P08ER4_A1013DibCli = new String[] {""} ;
      P08ER4_n1013DibCli = new boolean[] {false} ;
      P08ER4_A363DisColNum = new int[1] ;
      P08ER4_n363DisColNum = new boolean[] {false} ;
      P08ER4_A1195DisNomCli = new String[] {""} ;
      P08ER4_A362DisColNom = new String[] {""} ;
      P08ER4_n362DisColNom = new boolean[] {false} ;
      P08ER4_A337DisArtDsc = new String[] {""} ;
      P08ER4_A252CliCod = new int[1] ;
      P08ER4_A361DisCod = new int[1] ;
      P08ER4_A13732DisCanRec = new short[1] ;
      P08ER4_n13732DisCanRec = new boolean[] {false} ;
      P08ER4_A13737DisMaxObsL = new short[1] ;
      P08ER4_n13737DisMaxObsL = new boolean[] {false} ;
      AV38Option = "" ;
      P08ER7_A396EmprCod = new String[] {""} ;
      P08ER7_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ER7_A337DisArtDsc = new String[] {""} ;
      P08ER7_A4348DisUsrCod = new String[] {""} ;
      P08ER7_A360DisCliNum = new String[] {""} ;
      P08ER7_A757PriCod = new String[] {""} ;
      P08ER7_A1014DibInt = new int[1] ;
      P08ER7_n1014DibInt = new boolean[] {false} ;
      P08ER7_A1013DibCli = new String[] {""} ;
      P08ER7_n1013DibCli = new boolean[] {false} ;
      P08ER7_A363DisColNum = new int[1] ;
      P08ER7_n363DisColNum = new boolean[] {false} ;
      P08ER7_A1195DisNomCli = new String[] {""} ;
      P08ER7_A362DisColNom = new String[] {""} ;
      P08ER7_n362DisColNom = new boolean[] {false} ;
      P08ER7_A335DisArtCod = new String[] {""} ;
      P08ER7_A252CliCod = new int[1] ;
      P08ER7_A361DisCod = new int[1] ;
      P08ER7_A13732DisCanRec = new short[1] ;
      P08ER7_n13732DisCanRec = new boolean[] {false} ;
      P08ER7_A13737DisMaxObsL = new short[1] ;
      P08ER7_n13737DisMaxObsL = new boolean[] {false} ;
      P08ER10_A396EmprCod = new String[] {""} ;
      P08ER10_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ER10_A362DisColNom = new String[] {""} ;
      P08ER10_n362DisColNom = new boolean[] {false} ;
      P08ER10_A4348DisUsrCod = new String[] {""} ;
      P08ER10_A360DisCliNum = new String[] {""} ;
      P08ER10_A757PriCod = new String[] {""} ;
      P08ER10_A1014DibInt = new int[1] ;
      P08ER10_n1014DibInt = new boolean[] {false} ;
      P08ER10_A1013DibCli = new String[] {""} ;
      P08ER10_n1013DibCli = new boolean[] {false} ;
      P08ER10_A363DisColNum = new int[1] ;
      P08ER10_n363DisColNum = new boolean[] {false} ;
      P08ER10_A1195DisNomCli = new String[] {""} ;
      P08ER10_A337DisArtDsc = new String[] {""} ;
      P08ER10_A335DisArtCod = new String[] {""} ;
      P08ER10_A252CliCod = new int[1] ;
      P08ER10_A361DisCod = new int[1] ;
      P08ER10_A13732DisCanRec = new short[1] ;
      P08ER10_n13732DisCanRec = new boolean[] {false} ;
      P08ER10_A13737DisMaxObsL = new short[1] ;
      P08ER10_n13737DisMaxObsL = new boolean[] {false} ;
      P08ER13_A396EmprCod = new String[] {""} ;
      P08ER13_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ER13_A1195DisNomCli = new String[] {""} ;
      P08ER13_A4348DisUsrCod = new String[] {""} ;
      P08ER13_A360DisCliNum = new String[] {""} ;
      P08ER13_A757PriCod = new String[] {""} ;
      P08ER13_A1014DibInt = new int[1] ;
      P08ER13_n1014DibInt = new boolean[] {false} ;
      P08ER13_A1013DibCli = new String[] {""} ;
      P08ER13_n1013DibCli = new boolean[] {false} ;
      P08ER13_A363DisColNum = new int[1] ;
      P08ER13_n363DisColNum = new boolean[] {false} ;
      P08ER13_A362DisColNom = new String[] {""} ;
      P08ER13_n362DisColNom = new boolean[] {false} ;
      P08ER13_A337DisArtDsc = new String[] {""} ;
      P08ER13_A335DisArtCod = new String[] {""} ;
      P08ER13_A252CliCod = new int[1] ;
      P08ER13_A361DisCod = new int[1] ;
      P08ER13_A13732DisCanRec = new short[1] ;
      P08ER13_n13732DisCanRec = new boolean[] {false} ;
      P08ER13_A13737DisMaxObsL = new short[1] ;
      P08ER13_n13737DisMaxObsL = new boolean[] {false} ;
      P08ER16_A396EmprCod = new String[] {""} ;
      P08ER16_A1013DibCli = new String[] {""} ;
      P08ER16_n1013DibCli = new boolean[] {false} ;
      P08ER16_A4348DisUsrCod = new String[] {""} ;
      P08ER16_A360DisCliNum = new String[] {""} ;
      P08ER16_A757PriCod = new String[] {""} ;
      P08ER16_A1014DibInt = new int[1] ;
      P08ER16_n1014DibInt = new boolean[] {false} ;
      P08ER16_A363DisColNum = new int[1] ;
      P08ER16_n363DisColNum = new boolean[] {false} ;
      P08ER16_A1195DisNomCli = new String[] {""} ;
      P08ER16_A362DisColNom = new String[] {""} ;
      P08ER16_n362DisColNom = new boolean[] {false} ;
      P08ER16_A337DisArtDsc = new String[] {""} ;
      P08ER16_A335DisArtCod = new String[] {""} ;
      P08ER16_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ER16_A252CliCod = new int[1] ;
      P08ER16_A361DisCod = new int[1] ;
      P08ER16_A13732DisCanRec = new short[1] ;
      P08ER16_n13732DisCanRec = new boolean[] {false} ;
      P08ER16_A13737DisMaxObsL = new short[1] ;
      P08ER16_n13737DisMaxObsL = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwnwdp02getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08ER4_A396EmprCod, P08ER4_A369DisFec, P08ER4_A335DisArtCod, P08ER4_A4348DisUsrCod, P08ER4_A360DisCliNum, P08ER4_A757PriCod, P08ER4_A1014DibInt, P08ER4_n1014DibInt, P08ER4_A1013DibCli, P08ER4_n1013DibCli,
            P08ER4_A363DisColNum, P08ER4_n363DisColNum, P08ER4_A1195DisNomCli, P08ER4_A362DisColNom, P08ER4_n362DisColNom, P08ER4_A337DisArtDsc, P08ER4_A252CliCod, P08ER4_A361DisCod, P08ER4_A13732DisCanRec, P08ER4_n13732DisCanRec,
            P08ER4_A13737DisMaxObsL, P08ER4_n13737DisMaxObsL
            }
            , new Object[] {
            P08ER7_A396EmprCod, P08ER7_A369DisFec, P08ER7_A337DisArtDsc, P08ER7_A4348DisUsrCod, P08ER7_A360DisCliNum, P08ER7_A757PriCod, P08ER7_A1014DibInt, P08ER7_n1014DibInt, P08ER7_A1013DibCli, P08ER7_n1013DibCli,
            P08ER7_A363DisColNum, P08ER7_n363DisColNum, P08ER7_A1195DisNomCli, P08ER7_A362DisColNom, P08ER7_n362DisColNom, P08ER7_A335DisArtCod, P08ER7_A252CliCod, P08ER7_A361DisCod, P08ER7_A13732DisCanRec, P08ER7_n13732DisCanRec,
            P08ER7_A13737DisMaxObsL, P08ER7_n13737DisMaxObsL
            }
            , new Object[] {
            P08ER10_A396EmprCod, P08ER10_A369DisFec, P08ER10_A362DisColNom, P08ER10_n362DisColNom, P08ER10_A4348DisUsrCod, P08ER10_A360DisCliNum, P08ER10_A757PriCod, P08ER10_A1014DibInt, P08ER10_n1014DibInt, P08ER10_A1013DibCli,
            P08ER10_n1013DibCli, P08ER10_A363DisColNum, P08ER10_n363DisColNum, P08ER10_A1195DisNomCli, P08ER10_A337DisArtDsc, P08ER10_A335DisArtCod, P08ER10_A252CliCod, P08ER10_A361DisCod, P08ER10_A13732DisCanRec, P08ER10_n13732DisCanRec,
            P08ER10_A13737DisMaxObsL, P08ER10_n13737DisMaxObsL
            }
            , new Object[] {
            P08ER13_A396EmprCod, P08ER13_A369DisFec, P08ER13_A1195DisNomCli, P08ER13_A4348DisUsrCod, P08ER13_A360DisCliNum, P08ER13_A757PriCod, P08ER13_A1014DibInt, P08ER13_n1014DibInt, P08ER13_A1013DibCli, P08ER13_n1013DibCli,
            P08ER13_A363DisColNum, P08ER13_n363DisColNum, P08ER13_A362DisColNom, P08ER13_n362DisColNom, P08ER13_A337DisArtDsc, P08ER13_A335DisArtCod, P08ER13_A252CliCod, P08ER13_A361DisCod, P08ER13_A13732DisCanRec, P08ER13_n13732DisCanRec,
            P08ER13_A13737DisMaxObsL, P08ER13_n13737DisMaxObsL
            }
            , new Object[] {
            P08ER16_A396EmprCod, P08ER16_A1013DibCli, P08ER16_n1013DibCli, P08ER16_A4348DisUsrCod, P08ER16_A360DisCliNum, P08ER16_A757PriCod, P08ER16_A1014DibInt, P08ER16_n1014DibInt, P08ER16_A363DisColNum, P08ER16_n363DisColNum,
            P08ER16_A1195DisNomCli, P08ER16_A362DisColNom, P08ER16_n362DisColNom, P08ER16_A337DisArtDsc, P08ER16_A335DisArtCod, P08ER16_A369DisFec, P08ER16_A252CliCod, P08ER16_A361DisCod, P08ER16_A13732DisCanRec, P08ER16_n13732DisCanRec,
            P08ER16_A13737DisMaxObsL, P08ER16_n13737DisMaxObsL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV64TFDisMaxObsLin ;
   private short AV65TFDisMaxObsLin_To ;
   private short AV66TFDisCanRec ;
   private short AV67TFDisCanRec_To ;
   private short AV92Webwnwdp02ds_21_tfdismaxobslin ;
   private short AV93Webwnwdp02ds_22_tfdismaxobslin_to ;
   private short AV94Webwnwdp02ds_23_tfdiscanrec ;
   private short AV95Webwnwdp02ds_24_tfdiscanrec_to ;
   private short A13737DisMaxObsL ;
   private short A13732DisCanRec ;
   private short Gx_err ;
   private int AV70GXV1 ;
   private int AV14TFDisCod ;
   private int AV15TFDisCod_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV28TFDisColNum ;
   private int AV29TFDisColNum_To ;
   private int AV32TFDibInt ;
   private int AV33TFDibInt_To ;
   private int AV73Webwnwdp02ds_2_tfdiscod ;
   private int AV74Webwnwdp02ds_3_tfdiscod_to ;
   private int AV75Webwnwdp02ds_4_tfclicod ;
   private int AV76Webwnwdp02ds_5_tfclicod_to ;
   private int AV86Webwnwdp02ds_15_tfdiscolnum ;
   private int AV87Webwnwdp02ds_16_tfdiscolnum_to ;
   private int AV90Webwnwdp02ds_19_tfdibint ;
   private int AV91Webwnwdp02ds_20_tfdibint_to ;
   private int AV63Discodp ;
   private int AV56CliCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1014DibInt ;
   private long AV46count ;
   private String AV20TFDisArtCod ;
   private String AV21TFDisArtCod_Sel ;
   private String AV22TFDisArtDsc ;
   private String AV23TFDisArtDsc_Sel ;
   private String AV24TFDisColNom ;
   private String AV25TFDisColNom_Sel ;
   private String AV26TFDisNomCli ;
   private String AV27TFDisNomCli_Sel ;
   private String AV30TFDibCli ;
   private String AV31TFDibCli_Sel ;
   private String A335DisArtCod ;
   private String AV78Webwnwdp02ds_7_tfdisartcod ;
   private String AV79Webwnwdp02ds_8_tfdisartcod_sel ;
   private String AV80Webwnwdp02ds_9_tfdisartdsc ;
   private String AV81Webwnwdp02ds_10_tfdisartdsc_sel ;
   private String AV82Webwnwdp02ds_11_tfdiscolnom ;
   private String AV83Webwnwdp02ds_12_tfdiscolnom_sel ;
   private String AV84Webwnwdp02ds_13_tfdisnomcli ;
   private String AV85Webwnwdp02ds_14_tfdisnomcli_sel ;
   private String AV88Webwnwdp02ds_17_tfdibcli ;
   private String AV89Webwnwdp02ds_18_tfdibcli_sel ;
   private String scmdbuf ;
   private String lV78Webwnwdp02ds_7_tfdisartcod ;
   private String lV80Webwnwdp02ds_9_tfdisartdsc ;
   private String lV82Webwnwdp02ds_11_tfdiscolnom ;
   private String lV84Webwnwdp02ds_13_tfdisnomcli ;
   private String lV88Webwnwdp02ds_17_tfdibcli ;
   private String lV57DisCliNum ;
   private String lV58DisArtCod ;
   private String lV59Disartdsc ;
   private String lV60DisColNom ;
   private String lV61Disnomcli ;
   private String AV57DisCliNum ;
   private String AV58DisArtCod ;
   private String AV59Disartdsc ;
   private String AV60DisColNom ;
   private String AV61Disnomcli ;
   private String AV62DisUsrcod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1013DibCli ;
   private String A360DisCliNum ;
   private String A4348DisUsrCod ;
   private String A757PriCod ;
   private String AV55pricod ;
   private String A396EmprCod ;
   private String AV53EmprCod ;
   private java.util.Date AV18TFDisFec ;
   private java.util.Date AV77Webwnwdp02ds_6_tfdisfec ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV54Disfec ;
   private boolean returnInSub ;
   private boolean brk8ER2 ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n13732DisCanRec ;
   private boolean n13737DisMaxObsL ;
   private boolean brk8ER4 ;
   private boolean brk8ER6 ;
   private boolean brk8ER8 ;
   private boolean brk8ER10 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV72Webwnwdp02ds_1_filterfulltext ;
   private String lV72Webwnwdp02ds_1_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08ER4_A396EmprCod ;
   private java.util.Date[] P08ER4_A369DisFec ;
   private String[] P08ER4_A335DisArtCod ;
   private String[] P08ER4_A4348DisUsrCod ;
   private String[] P08ER4_A360DisCliNum ;
   private String[] P08ER4_A757PriCod ;
   private int[] P08ER4_A1014DibInt ;
   private boolean[] P08ER4_n1014DibInt ;
   private String[] P08ER4_A1013DibCli ;
   private boolean[] P08ER4_n1013DibCli ;
   private int[] P08ER4_A363DisColNum ;
   private boolean[] P08ER4_n363DisColNum ;
   private String[] P08ER4_A1195DisNomCli ;
   private String[] P08ER4_A362DisColNom ;
   private boolean[] P08ER4_n362DisColNom ;
   private String[] P08ER4_A337DisArtDsc ;
   private int[] P08ER4_A252CliCod ;
   private int[] P08ER4_A361DisCod ;
   private short[] P08ER4_A13732DisCanRec ;
   private boolean[] P08ER4_n13732DisCanRec ;
   private short[] P08ER4_A13737DisMaxObsL ;
   private boolean[] P08ER4_n13737DisMaxObsL ;
   private String[] P08ER7_A396EmprCod ;
   private java.util.Date[] P08ER7_A369DisFec ;
   private String[] P08ER7_A337DisArtDsc ;
   private String[] P08ER7_A4348DisUsrCod ;
   private String[] P08ER7_A360DisCliNum ;
   private String[] P08ER7_A757PriCod ;
   private int[] P08ER7_A1014DibInt ;
   private boolean[] P08ER7_n1014DibInt ;
   private String[] P08ER7_A1013DibCli ;
   private boolean[] P08ER7_n1013DibCli ;
   private int[] P08ER7_A363DisColNum ;
   private boolean[] P08ER7_n363DisColNum ;
   private String[] P08ER7_A1195DisNomCli ;
   private String[] P08ER7_A362DisColNom ;
   private boolean[] P08ER7_n362DisColNom ;
   private String[] P08ER7_A335DisArtCod ;
   private int[] P08ER7_A252CliCod ;
   private int[] P08ER7_A361DisCod ;
   private short[] P08ER7_A13732DisCanRec ;
   private boolean[] P08ER7_n13732DisCanRec ;
   private short[] P08ER7_A13737DisMaxObsL ;
   private boolean[] P08ER7_n13737DisMaxObsL ;
   private String[] P08ER10_A396EmprCod ;
   private java.util.Date[] P08ER10_A369DisFec ;
   private String[] P08ER10_A362DisColNom ;
   private boolean[] P08ER10_n362DisColNom ;
   private String[] P08ER10_A4348DisUsrCod ;
   private String[] P08ER10_A360DisCliNum ;
   private String[] P08ER10_A757PriCod ;
   private int[] P08ER10_A1014DibInt ;
   private boolean[] P08ER10_n1014DibInt ;
   private String[] P08ER10_A1013DibCli ;
   private boolean[] P08ER10_n1013DibCli ;
   private int[] P08ER10_A363DisColNum ;
   private boolean[] P08ER10_n363DisColNum ;
   private String[] P08ER10_A1195DisNomCli ;
   private String[] P08ER10_A337DisArtDsc ;
   private String[] P08ER10_A335DisArtCod ;
   private int[] P08ER10_A252CliCod ;
   private int[] P08ER10_A361DisCod ;
   private short[] P08ER10_A13732DisCanRec ;
   private boolean[] P08ER10_n13732DisCanRec ;
   private short[] P08ER10_A13737DisMaxObsL ;
   private boolean[] P08ER10_n13737DisMaxObsL ;
   private String[] P08ER13_A396EmprCod ;
   private java.util.Date[] P08ER13_A369DisFec ;
   private String[] P08ER13_A1195DisNomCli ;
   private String[] P08ER13_A4348DisUsrCod ;
   private String[] P08ER13_A360DisCliNum ;
   private String[] P08ER13_A757PriCod ;
   private int[] P08ER13_A1014DibInt ;
   private boolean[] P08ER13_n1014DibInt ;
   private String[] P08ER13_A1013DibCli ;
   private boolean[] P08ER13_n1013DibCli ;
   private int[] P08ER13_A363DisColNum ;
   private boolean[] P08ER13_n363DisColNum ;
   private String[] P08ER13_A362DisColNom ;
   private boolean[] P08ER13_n362DisColNom ;
   private String[] P08ER13_A337DisArtDsc ;
   private String[] P08ER13_A335DisArtCod ;
   private int[] P08ER13_A252CliCod ;
   private int[] P08ER13_A361DisCod ;
   private short[] P08ER13_A13732DisCanRec ;
   private boolean[] P08ER13_n13732DisCanRec ;
   private short[] P08ER13_A13737DisMaxObsL ;
   private boolean[] P08ER13_n13737DisMaxObsL ;
   private String[] P08ER16_A396EmprCod ;
   private String[] P08ER16_A1013DibCli ;
   private boolean[] P08ER16_n1013DibCli ;
   private String[] P08ER16_A4348DisUsrCod ;
   private String[] P08ER16_A360DisCliNum ;
   private String[] P08ER16_A757PriCod ;
   private int[] P08ER16_A1014DibInt ;
   private boolean[] P08ER16_n1014DibInt ;
   private int[] P08ER16_A363DisColNum ;
   private boolean[] P08ER16_n363DisColNum ;
   private String[] P08ER16_A1195DisNomCli ;
   private String[] P08ER16_A362DisColNom ;
   private boolean[] P08ER16_n362DisColNom ;
   private String[] P08ER16_A337DisArtDsc ;
   private String[] P08ER16_A335DisArtCod ;
   private java.util.Date[] P08ER16_A369DisFec ;
   private int[] P08ER16_A252CliCod ;
   private int[] P08ER16_A361DisCod ;
   private short[] P08ER16_A13732DisCanRec ;
   private boolean[] P08ER16_n13732DisCanRec ;
   private short[] P08ER16_A13737DisMaxObsL ;
   private boolean[] P08ER16_n13737DisMaxObsL ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class webwnwdp02getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ER4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV73Webwnwdp02ds_2_tfdiscod ,
                                          int AV74Webwnwdp02ds_3_tfdiscod_to ,
                                          int AV75Webwnwdp02ds_4_tfclicod ,
                                          int AV76Webwnwdp02ds_5_tfclicod_to ,
                                          java.util.Date AV77Webwnwdp02ds_6_tfdisfec ,
                                          String AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                          String AV78Webwnwdp02ds_7_tfdisartcod ,
                                          String AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                          String AV80Webwnwdp02ds_9_tfdisartdsc ,
                                          String AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                          String AV82Webwnwdp02ds_11_tfdiscolnom ,
                                          String AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                          String AV84Webwnwdp02ds_13_tfdisnomcli ,
                                          int AV86Webwnwdp02ds_15_tfdiscolnum ,
                                          int AV87Webwnwdp02ds_16_tfdiscolnum_to ,
                                          String AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                          String AV88Webwnwdp02ds_17_tfdibcli ,
                                          int AV90Webwnwdp02ds_19_tfdibint ,
                                          int AV91Webwnwdp02ds_20_tfdibint_to ,
                                          int AV63Discodp ,
                                          int AV56CliCod ,
                                          String AV57DisCliNum ,
                                          String AV58DisArtCod ,
                                          String AV59Disartdsc ,
                                          String AV60DisColNom ,
                                          String AV61Disnomcli ,
                                          String AV62DisUsrcod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          java.util.Date A369DisFec ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          String A1195DisNomCli ,
                                          int A363DisColNum ,
                                          String A1013DibCli ,
                                          int A1014DibInt ,
                                          String A360DisCliNum ,
                                          String A4348DisUsrCod ,
                                          String AV72Webwnwdp02ds_1_filterfulltext ,
                                          short A13737DisMaxObsL ,
                                          short A13732DisCanRec ,
                                          short AV92Webwnwdp02ds_21_tfdismaxobslin ,
                                          short AV93Webwnwdp02ds_22_tfdismaxobslin_to ,
                                          short AV94Webwnwdp02ds_23_tfdiscanrec ,
                                          short AV95Webwnwdp02ds_24_tfdiscanrec_to ,
                                          String A757PriCod ,
                                          String AV55pricod ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          java.util.Date AV54Disfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[51];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisFec, T1.DisArtCod, T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisNomCli, T1.DisColNom, T1.DisArtDsc," ;
      scmdbuf += " T1.CliCod, T1.DisCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec," ;
      scmdbuf += " T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod," ;
      scmdbuf += " T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod," ;
      scmdbuf += " DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV73Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV86Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV87Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV63Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08ER7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV73Webwnwdp02ds_2_tfdiscod ,
                                          int AV74Webwnwdp02ds_3_tfdiscod_to ,
                                          int AV75Webwnwdp02ds_4_tfclicod ,
                                          int AV76Webwnwdp02ds_5_tfclicod_to ,
                                          java.util.Date AV77Webwnwdp02ds_6_tfdisfec ,
                                          String AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                          String AV78Webwnwdp02ds_7_tfdisartcod ,
                                          String AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                          String AV80Webwnwdp02ds_9_tfdisartdsc ,
                                          String AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                          String AV82Webwnwdp02ds_11_tfdiscolnom ,
                                          String AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                          String AV84Webwnwdp02ds_13_tfdisnomcli ,
                                          int AV86Webwnwdp02ds_15_tfdiscolnum ,
                                          int AV87Webwnwdp02ds_16_tfdiscolnum_to ,
                                          String AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                          String AV88Webwnwdp02ds_17_tfdibcli ,
                                          int AV90Webwnwdp02ds_19_tfdibint ,
                                          int AV91Webwnwdp02ds_20_tfdibint_to ,
                                          int AV63Discodp ,
                                          int AV56CliCod ,
                                          String AV57DisCliNum ,
                                          String AV58DisArtCod ,
                                          String AV59Disartdsc ,
                                          String AV60DisColNom ,
                                          String AV61Disnomcli ,
                                          String AV62DisUsrcod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          java.util.Date A369DisFec ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          String A1195DisNomCli ,
                                          int A363DisColNum ,
                                          String A1013DibCli ,
                                          int A1014DibInt ,
                                          String A360DisCliNum ,
                                          String A4348DisUsrCod ,
                                          String AV72Webwnwdp02ds_1_filterfulltext ,
                                          short A13737DisMaxObsL ,
                                          short A13732DisCanRec ,
                                          short AV92Webwnwdp02ds_21_tfdismaxobslin ,
                                          short AV93Webwnwdp02ds_22_tfdismaxobslin_to ,
                                          short AV94Webwnwdp02ds_23_tfdiscanrec ,
                                          short AV95Webwnwdp02ds_24_tfdiscanrec_to ,
                                          String A757PriCod ,
                                          String AV55pricod ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          java.util.Date AV54Disfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[51];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisFec, T1.DisArtDsc, T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisNomCli, T1.DisColNom, T1.DisArtCod," ;
      scmdbuf += " T1.CliCod, T1.DisCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec," ;
      scmdbuf += " T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod," ;
      scmdbuf += " T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod," ;
      scmdbuf += " DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV73Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV86Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV87Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (0==AV63Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08ER10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV73Webwnwdp02ds_2_tfdiscod ,
                                           int AV74Webwnwdp02ds_3_tfdiscod_to ,
                                           int AV75Webwnwdp02ds_4_tfclicod ,
                                           int AV76Webwnwdp02ds_5_tfclicod_to ,
                                           java.util.Date AV77Webwnwdp02ds_6_tfdisfec ,
                                           String AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           String AV78Webwnwdp02ds_7_tfdisartcod ,
                                           String AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           String AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           String AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           String AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           String AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           String AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           int AV86Webwnwdp02ds_15_tfdiscolnum ,
                                           int AV87Webwnwdp02ds_16_tfdiscolnum_to ,
                                           String AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           String AV88Webwnwdp02ds_17_tfdibcli ,
                                           int AV90Webwnwdp02ds_19_tfdibint ,
                                           int AV91Webwnwdp02ds_20_tfdibint_to ,
                                           int AV63Discodp ,
                                           int AV56CliCod ,
                                           String AV57DisCliNum ,
                                           String AV58DisArtCod ,
                                           String AV59Disartdsc ,
                                           String AV60DisColNom ,
                                           String AV61Disnomcli ,
                                           String AV62DisUsrcod ,
                                           int A361DisCod ,
                                           int A252CliCod ,
                                           java.util.Date A369DisFec ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           String A1195DisNomCli ,
                                           int A363DisColNum ,
                                           String A1013DibCli ,
                                           int A1014DibInt ,
                                           String A360DisCliNum ,
                                           String A4348DisUsrCod ,
                                           String AV72Webwnwdp02ds_1_filterfulltext ,
                                           short A13737DisMaxObsL ,
                                           short A13732DisCanRec ,
                                           short AV92Webwnwdp02ds_21_tfdismaxobslin ,
                                           short AV93Webwnwdp02ds_22_tfdismaxobslin_to ,
                                           short AV94Webwnwdp02ds_23_tfdiscanrec ,
                                           short AV95Webwnwdp02ds_24_tfdiscanrec_to ,
                                           String A757PriCod ,
                                           String AV55pricod ,
                                           String A396EmprCod ,
                                           String AV53EmprCod ,
                                           java.util.Date AV54Disfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[51];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisFec, T1.DisColNom, T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisNomCli, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.CliCod, T1.DisCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec," ;
      scmdbuf += " T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod," ;
      scmdbuf += " T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod," ;
      scmdbuf += " DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV73Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV86Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV87Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV63Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisColNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08ER13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV73Webwnwdp02ds_2_tfdiscod ,
                                           int AV74Webwnwdp02ds_3_tfdiscod_to ,
                                           int AV75Webwnwdp02ds_4_tfclicod ,
                                           int AV76Webwnwdp02ds_5_tfclicod_to ,
                                           java.util.Date AV77Webwnwdp02ds_6_tfdisfec ,
                                           String AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           String AV78Webwnwdp02ds_7_tfdisartcod ,
                                           String AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           String AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           String AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           String AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           String AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           String AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           int AV86Webwnwdp02ds_15_tfdiscolnum ,
                                           int AV87Webwnwdp02ds_16_tfdiscolnum_to ,
                                           String AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           String AV88Webwnwdp02ds_17_tfdibcli ,
                                           int AV90Webwnwdp02ds_19_tfdibint ,
                                           int AV91Webwnwdp02ds_20_tfdibint_to ,
                                           int AV63Discodp ,
                                           int AV56CliCod ,
                                           String AV57DisCliNum ,
                                           String AV58DisArtCod ,
                                           String AV59Disartdsc ,
                                           String AV60DisColNom ,
                                           String AV61Disnomcli ,
                                           String AV62DisUsrcod ,
                                           int A361DisCod ,
                                           int A252CliCod ,
                                           java.util.Date A369DisFec ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           String A1195DisNomCli ,
                                           int A363DisColNum ,
                                           String A1013DibCli ,
                                           int A1014DibInt ,
                                           String A360DisCliNum ,
                                           String A4348DisUsrCod ,
                                           String AV72Webwnwdp02ds_1_filterfulltext ,
                                           short A13737DisMaxObsL ,
                                           short A13732DisCanRec ,
                                           short AV92Webwnwdp02ds_21_tfdismaxobslin ,
                                           short AV93Webwnwdp02ds_22_tfdismaxobslin_to ,
                                           short AV94Webwnwdp02ds_23_tfdiscanrec ,
                                           short AV95Webwnwdp02ds_24_tfdiscanrec_to ,
                                           String A757PriCod ,
                                           String AV55pricod ,
                                           String A396EmprCod ,
                                           String AV53EmprCod ,
                                           java.util.Date AV54Disfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[51];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisFec, T1.DisNomCli, T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.CliCod, T1.DisCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec," ;
      scmdbuf += " T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod," ;
      scmdbuf += " T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod," ;
      scmdbuf += " DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV73Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV86Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV87Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV63Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisNomCli" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08ER16( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV73Webwnwdp02ds_2_tfdiscod ,
                                           int AV74Webwnwdp02ds_3_tfdiscod_to ,
                                           int AV75Webwnwdp02ds_4_tfclicod ,
                                           int AV76Webwnwdp02ds_5_tfclicod_to ,
                                           java.util.Date AV77Webwnwdp02ds_6_tfdisfec ,
                                           String AV79Webwnwdp02ds_8_tfdisartcod_sel ,
                                           String AV78Webwnwdp02ds_7_tfdisartcod ,
                                           String AV81Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           String AV80Webwnwdp02ds_9_tfdisartdsc ,
                                           String AV83Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           String AV82Webwnwdp02ds_11_tfdiscolnom ,
                                           String AV85Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           String AV84Webwnwdp02ds_13_tfdisnomcli ,
                                           int AV86Webwnwdp02ds_15_tfdiscolnum ,
                                           int AV87Webwnwdp02ds_16_tfdiscolnum_to ,
                                           String AV89Webwnwdp02ds_18_tfdibcli_sel ,
                                           String AV88Webwnwdp02ds_17_tfdibcli ,
                                           int AV90Webwnwdp02ds_19_tfdibint ,
                                           int AV91Webwnwdp02ds_20_tfdibint_to ,
                                           int AV63Discodp ,
                                           int AV56CliCod ,
                                           String AV57DisCliNum ,
                                           String AV58DisArtCod ,
                                           String AV59Disartdsc ,
                                           String AV60DisColNom ,
                                           String AV61Disnomcli ,
                                           String AV62DisUsrcod ,
                                           int A361DisCod ,
                                           int A252CliCod ,
                                           java.util.Date A369DisFec ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           String A1195DisNomCli ,
                                           int A363DisColNum ,
                                           String A1013DibCli ,
                                           int A1014DibInt ,
                                           String A360DisCliNum ,
                                           String A4348DisUsrCod ,
                                           String AV72Webwnwdp02ds_1_filterfulltext ,
                                           short A13737DisMaxObsL ,
                                           short A13732DisCanRec ,
                                           short AV92Webwnwdp02ds_21_tfdismaxobslin ,
                                           short AV93Webwnwdp02ds_22_tfdismaxobslin_to ,
                                           short AV94Webwnwdp02ds_23_tfdiscanrec ,
                                           short AV95Webwnwdp02ds_24_tfdiscanrec_to ,
                                           String A757PriCod ,
                                           String AV55pricod ,
                                           java.util.Date AV54Disfec ,
                                           String AV53EmprCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[51];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DibCli, T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.DibInt, T1.DisColNum, T1.DisNomCli, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisFec," ;
      scmdbuf += " T1.CliCod, T1.DisCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec," ;
      scmdbuf += " T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod," ;
      scmdbuf += " T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod," ;
      scmdbuf += " DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV73Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV86Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV87Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (0==AV63Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DibCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08ER4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] );
            case 1 :
                  return conditional_P08ER7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] );
            case 2 :
                  return conditional_P08ER10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] );
            case 3 :
                  return conditional_P08ER13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] );
            case 4 :
                  return conditional_P08ER16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ER4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ER7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ER10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ER13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ER16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((String[]) buf[13])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((String[]) buf[13])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
      }
   }

}

