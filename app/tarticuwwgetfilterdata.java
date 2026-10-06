package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticuwwgetfilterdata extends GXProcedure
{
   public tarticuwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticuwwgetfilterdata.class ), "" );
   }

   public tarticuwwgetfilterdata( int remoteHandle ,
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
      tarticuwwgetfilterdata.this.aP5 = new String[] {""};
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
      tarticuwwgetfilterdata.this.AV58DDOName = aP0;
      tarticuwwgetfilterdata.this.AV56SearchTxt = aP1;
      tarticuwwgetfilterdata.this.AV57SearchTxtTo = aP2;
      tarticuwwgetfilterdata.this.aP3 = aP3;
      tarticuwwgetfilterdata.this.aP4 = aP4;
      tarticuwwgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_TIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ARTCOMER") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCOMEROPTIONS' */
         S161 ();
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
      if ( GXutil.strcmp(AV69Session.getValue("TARTICUWWGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TARTICUWWGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("TARTICUWWGridState"), null, null);
      }
      AV116GXV1 = 1 ;
      while ( AV116GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV116GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV107FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV12TFArtCod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV13TFArtCod_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV24TFArtDsc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV25TFArtDsc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV20TFTipArtCod = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTipArtCod_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV22TFTipArtDsc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV23TFTipArtDsc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV26TFArtPml = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFArtPml_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV108TFArtGraAca = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV109TFArtGraAca_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV38TFArtRen = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFArtRen_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV34TFArtAcaMin = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFArtAcaMin_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV112TFArtComer = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV113TFArtComer_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV116GXV1 = (int)(AV116GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV56SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV118Tarticuwwds_1_filterfulltext = AV107FilterFullText ;
      AV119Tarticuwwds_2_tfclicod = AV10TFCliCod ;
      AV120Tarticuwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV121Tarticuwwds_4_tfclinom = AV16TFCliNom ;
      AV122Tarticuwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV123Tarticuwwds_6_tfartcod = AV12TFArtCod ;
      AV124Tarticuwwds_7_tfartcod_sel = AV13TFArtCod_Sel ;
      AV125Tarticuwwds_8_tfartdsc = AV24TFArtDsc ;
      AV126Tarticuwwds_9_tfartdsc_sel = AV25TFArtDsc_Sel ;
      AV127Tarticuwwds_10_tftipartcod = AV20TFTipArtCod ;
      AV128Tarticuwwds_11_tftipartcod_to = AV21TFTipArtCod_To ;
      AV129Tarticuwwds_12_tftipartdsc = AV22TFTipArtDsc ;
      AV130Tarticuwwds_13_tftipartdsc_sel = AV23TFTipArtDsc_Sel ;
      AV131Tarticuwwds_14_tfartpml = AV26TFArtPml ;
      AV132Tarticuwwds_15_tfartpml_to = AV27TFArtPml_To ;
      AV133Tarticuwwds_16_tfartgraaca = AV108TFArtGraAca ;
      AV134Tarticuwwds_17_tfartgraaca_to = AV109TFArtGraAca_To ;
      AV135Tarticuwwds_18_tfartren = AV38TFArtRen ;
      AV136Tarticuwwds_19_tfartren_to = AV39TFArtRen_To ;
      AV137Tarticuwwds_20_tfartacamin = AV34TFArtAcaMin ;
      AV138Tarticuwwds_21_tfartacamin_to = AV35TFArtAcaMin_To ;
      AV139Tarticuwwds_22_tfartcomer = AV112TFArtComer ;
      AV140Tarticuwwds_23_tfartcomer_sel = AV113TFArtComer_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV118Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV119Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to) ,
                                           AV122Tarticuwwds_5_tfclinom_sel ,
                                           AV121Tarticuwwds_4_tfclinom ,
                                           AV124Tarticuwwds_7_tfartcod_sel ,
                                           AV123Tarticuwwds_6_tfartcod ,
                                           AV126Tarticuwwds_9_tfartdsc_sel ,
                                           AV125Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV127Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to) ,
                                           AV130Tarticuwwds_13_tftipartdsc_sel ,
                                           AV129Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV131Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV132Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV133Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to) ,
                                           AV135Tarticuwwds_18_tfartren ,
                                           AV136Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV137Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to) ,
                                           AV140Tarticuwwds_23_tfartcomer_sel ,
                                           AV139Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV121Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV121Tarticuwwds_4_tfclinom), 30, "%") ;
      lV123Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV123Tarticuwwds_6_tfartcod), 16, "%") ;
      lV125Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV125Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV129Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV129Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV139Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV139Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08342 */
      pr_default.execute(0, new Object[] {lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, Integer.valueOf(AV119Tarticuwwds_2_tfclicod), Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to), lV121Tarticuwwds_4_tfclinom, AV122Tarticuwwds_5_tfclinom_sel, lV123Tarticuwwds_6_tfartcod, AV124Tarticuwwds_7_tfartcod_sel, lV125Tarticuwwds_8_tfartdsc, AV126Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV127Tarticuwwds_10_tftipartcod), Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to), lV129Tarticuwwds_12_tftipartdsc, AV130Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV131Tarticuwwds_14_tfartpml), Short.valueOf(AV132Tarticuwwds_15_tfartpml_to), Short.valueOf(AV133Tarticuwwds_16_tfartgraaca), Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to), AV135Tarticuwwds_18_tfartren, AV136Tarticuwwds_19_tfartren_to, Short.valueOf(AV137Tarticuwwds_20_tfartacamin), Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to), lV139Tarticuwwds_22_tfartcomer, AV140Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8342 = false ;
         A396EmprCod = P08342_A396EmprCod[0] ;
         A10045CliAct = P08342_A10045CliAct[0] ;
         A279CliNom = P08342_A279CliNom[0] ;
         A5741ArtComer = P08342_A5741ArtComer[0] ;
         n5741ArtComer = P08342_n5741ArtComer[0] ;
         A63ArtAcaMin = P08342_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08342_n63ArtAcaMin[0] ;
         A95ArtRen = P08342_A95ArtRen[0] ;
         n95ArtRen = P08342_n95ArtRen[0] ;
         A1903ArtGraAca = P08342_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08342_n1903ArtGraAca[0] ;
         A1148ArtPml = P08342_A1148ArtPml[0] ;
         n1148ArtPml = P08342_n1148ArtPml[0] ;
         A830TipArtDsc = P08342_A830TipArtDsc[0] ;
         n830TipArtDsc = P08342_n830TipArtDsc[0] ;
         A829TipArtCod = P08342_A829TipArtCod[0] ;
         A69ArtDsc = P08342_A69ArtDsc[0] ;
         n69ArtDsc = P08342_n69ArtDsc[0] ;
         A65ArtCod = P08342_A65ArtCod[0] ;
         A252CliCod = P08342_A252CliCod[0] ;
         A830TipArtDsc = P08342_A830TipArtDsc[0] ;
         n830TipArtDsc = P08342_n830TipArtDsc[0] ;
         A10045CliAct = P08342_A10045CliAct[0] ;
         A279CliNom = P08342_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08342_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8342 = false ;
            A396EmprCod = P08342_A396EmprCod[0] ;
            A65ArtCod = P08342_A65ArtCod[0] ;
            A252CliCod = P08342_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8342 = true ;
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
         if ( ! brk8342 )
         {
            brk8342 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFArtCod = AV56SearchTxt ;
      AV13TFArtCod_Sel = "" ;
      AV118Tarticuwwds_1_filterfulltext = AV107FilterFullText ;
      AV119Tarticuwwds_2_tfclicod = AV10TFCliCod ;
      AV120Tarticuwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV121Tarticuwwds_4_tfclinom = AV16TFCliNom ;
      AV122Tarticuwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV123Tarticuwwds_6_tfartcod = AV12TFArtCod ;
      AV124Tarticuwwds_7_tfartcod_sel = AV13TFArtCod_Sel ;
      AV125Tarticuwwds_8_tfartdsc = AV24TFArtDsc ;
      AV126Tarticuwwds_9_tfartdsc_sel = AV25TFArtDsc_Sel ;
      AV127Tarticuwwds_10_tftipartcod = AV20TFTipArtCod ;
      AV128Tarticuwwds_11_tftipartcod_to = AV21TFTipArtCod_To ;
      AV129Tarticuwwds_12_tftipartdsc = AV22TFTipArtDsc ;
      AV130Tarticuwwds_13_tftipartdsc_sel = AV23TFTipArtDsc_Sel ;
      AV131Tarticuwwds_14_tfartpml = AV26TFArtPml ;
      AV132Tarticuwwds_15_tfartpml_to = AV27TFArtPml_To ;
      AV133Tarticuwwds_16_tfartgraaca = AV108TFArtGraAca ;
      AV134Tarticuwwds_17_tfartgraaca_to = AV109TFArtGraAca_To ;
      AV135Tarticuwwds_18_tfartren = AV38TFArtRen ;
      AV136Tarticuwwds_19_tfartren_to = AV39TFArtRen_To ;
      AV137Tarticuwwds_20_tfartacamin = AV34TFArtAcaMin ;
      AV138Tarticuwwds_21_tfartacamin_to = AV35TFArtAcaMin_To ;
      AV139Tarticuwwds_22_tfartcomer = AV112TFArtComer ;
      AV140Tarticuwwds_23_tfartcomer_sel = AV113TFArtComer_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV118Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV119Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to) ,
                                           AV122Tarticuwwds_5_tfclinom_sel ,
                                           AV121Tarticuwwds_4_tfclinom ,
                                           AV124Tarticuwwds_7_tfartcod_sel ,
                                           AV123Tarticuwwds_6_tfartcod ,
                                           AV126Tarticuwwds_9_tfartdsc_sel ,
                                           AV125Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV127Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to) ,
                                           AV130Tarticuwwds_13_tftipartdsc_sel ,
                                           AV129Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV131Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV132Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV133Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to) ,
                                           AV135Tarticuwwds_18_tfartren ,
                                           AV136Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV137Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to) ,
                                           AV140Tarticuwwds_23_tfartcomer_sel ,
                                           AV139Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV121Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV121Tarticuwwds_4_tfclinom), 30, "%") ;
      lV123Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV123Tarticuwwds_6_tfartcod), 16, "%") ;
      lV125Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV125Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV129Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV129Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV139Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV139Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08343 */
      pr_default.execute(1, new Object[] {lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, Integer.valueOf(AV119Tarticuwwds_2_tfclicod), Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to), lV121Tarticuwwds_4_tfclinom, AV122Tarticuwwds_5_tfclinom_sel, lV123Tarticuwwds_6_tfartcod, AV124Tarticuwwds_7_tfartcod_sel, lV125Tarticuwwds_8_tfartdsc, AV126Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV127Tarticuwwds_10_tftipartcod), Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to), lV129Tarticuwwds_12_tftipartdsc, AV130Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV131Tarticuwwds_14_tfartpml), Short.valueOf(AV132Tarticuwwds_15_tfartpml_to), Short.valueOf(AV133Tarticuwwds_16_tfartgraaca), Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to), AV135Tarticuwwds_18_tfartren, AV136Tarticuwwds_19_tfartren_to, Short.valueOf(AV137Tarticuwwds_20_tfartacamin), Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to), lV139Tarticuwwds_22_tfartcomer, AV140Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8344 = false ;
         A396EmprCod = P08343_A396EmprCod[0] ;
         A10045CliAct = P08343_A10045CliAct[0] ;
         A65ArtCod = P08343_A65ArtCod[0] ;
         A5741ArtComer = P08343_A5741ArtComer[0] ;
         n5741ArtComer = P08343_n5741ArtComer[0] ;
         A63ArtAcaMin = P08343_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08343_n63ArtAcaMin[0] ;
         A95ArtRen = P08343_A95ArtRen[0] ;
         n95ArtRen = P08343_n95ArtRen[0] ;
         A1903ArtGraAca = P08343_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08343_n1903ArtGraAca[0] ;
         A1148ArtPml = P08343_A1148ArtPml[0] ;
         n1148ArtPml = P08343_n1148ArtPml[0] ;
         A830TipArtDsc = P08343_A830TipArtDsc[0] ;
         n830TipArtDsc = P08343_n830TipArtDsc[0] ;
         A829TipArtCod = P08343_A829TipArtCod[0] ;
         A69ArtDsc = P08343_A69ArtDsc[0] ;
         n69ArtDsc = P08343_n69ArtDsc[0] ;
         A279CliNom = P08343_A279CliNom[0] ;
         A252CliCod = P08343_A252CliCod[0] ;
         A830TipArtDsc = P08343_A830TipArtDsc[0] ;
         n830TipArtDsc = P08343_n830TipArtDsc[0] ;
         A10045CliAct = P08343_A10045CliAct[0] ;
         A279CliNom = P08343_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08343_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brk8344 = false ;
            A396EmprCod = P08343_A396EmprCod[0] ;
            A252CliCod = P08343_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8344 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV60Option = A65ArtCod ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8344 )
         {
            brk8344 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFArtDsc = AV56SearchTxt ;
      AV25TFArtDsc_Sel = "" ;
      AV118Tarticuwwds_1_filterfulltext = AV107FilterFullText ;
      AV119Tarticuwwds_2_tfclicod = AV10TFCliCod ;
      AV120Tarticuwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV121Tarticuwwds_4_tfclinom = AV16TFCliNom ;
      AV122Tarticuwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV123Tarticuwwds_6_tfartcod = AV12TFArtCod ;
      AV124Tarticuwwds_7_tfartcod_sel = AV13TFArtCod_Sel ;
      AV125Tarticuwwds_8_tfartdsc = AV24TFArtDsc ;
      AV126Tarticuwwds_9_tfartdsc_sel = AV25TFArtDsc_Sel ;
      AV127Tarticuwwds_10_tftipartcod = AV20TFTipArtCod ;
      AV128Tarticuwwds_11_tftipartcod_to = AV21TFTipArtCod_To ;
      AV129Tarticuwwds_12_tftipartdsc = AV22TFTipArtDsc ;
      AV130Tarticuwwds_13_tftipartdsc_sel = AV23TFTipArtDsc_Sel ;
      AV131Tarticuwwds_14_tfartpml = AV26TFArtPml ;
      AV132Tarticuwwds_15_tfartpml_to = AV27TFArtPml_To ;
      AV133Tarticuwwds_16_tfartgraaca = AV108TFArtGraAca ;
      AV134Tarticuwwds_17_tfartgraaca_to = AV109TFArtGraAca_To ;
      AV135Tarticuwwds_18_tfartren = AV38TFArtRen ;
      AV136Tarticuwwds_19_tfartren_to = AV39TFArtRen_To ;
      AV137Tarticuwwds_20_tfartacamin = AV34TFArtAcaMin ;
      AV138Tarticuwwds_21_tfartacamin_to = AV35TFArtAcaMin_To ;
      AV139Tarticuwwds_22_tfartcomer = AV112TFArtComer ;
      AV140Tarticuwwds_23_tfartcomer_sel = AV113TFArtComer_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV118Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV119Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to) ,
                                           AV122Tarticuwwds_5_tfclinom_sel ,
                                           AV121Tarticuwwds_4_tfclinom ,
                                           AV124Tarticuwwds_7_tfartcod_sel ,
                                           AV123Tarticuwwds_6_tfartcod ,
                                           AV126Tarticuwwds_9_tfartdsc_sel ,
                                           AV125Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV127Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to) ,
                                           AV130Tarticuwwds_13_tftipartdsc_sel ,
                                           AV129Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV131Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV132Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV133Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to) ,
                                           AV135Tarticuwwds_18_tfartren ,
                                           AV136Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV137Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to) ,
                                           AV140Tarticuwwds_23_tfartcomer_sel ,
                                           AV139Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV121Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV121Tarticuwwds_4_tfclinom), 30, "%") ;
      lV123Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV123Tarticuwwds_6_tfartcod), 16, "%") ;
      lV125Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV125Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV129Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV129Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV139Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV139Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08344 */
      pr_default.execute(2, new Object[] {lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, Integer.valueOf(AV119Tarticuwwds_2_tfclicod), Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to), lV121Tarticuwwds_4_tfclinom, AV122Tarticuwwds_5_tfclinom_sel, lV123Tarticuwwds_6_tfartcod, AV124Tarticuwwds_7_tfartcod_sel, lV125Tarticuwwds_8_tfartdsc, AV126Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV127Tarticuwwds_10_tftipartcod), Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to), lV129Tarticuwwds_12_tftipartdsc, AV130Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV131Tarticuwwds_14_tfartpml), Short.valueOf(AV132Tarticuwwds_15_tfartpml_to), Short.valueOf(AV133Tarticuwwds_16_tfartgraaca), Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to), AV135Tarticuwwds_18_tfartren, AV136Tarticuwwds_19_tfartren_to, Short.valueOf(AV137Tarticuwwds_20_tfartacamin), Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to), lV139Tarticuwwds_22_tfartcomer, AV140Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8346 = false ;
         A396EmprCod = P08344_A396EmprCod[0] ;
         A10045CliAct = P08344_A10045CliAct[0] ;
         A69ArtDsc = P08344_A69ArtDsc[0] ;
         n69ArtDsc = P08344_n69ArtDsc[0] ;
         A5741ArtComer = P08344_A5741ArtComer[0] ;
         n5741ArtComer = P08344_n5741ArtComer[0] ;
         A63ArtAcaMin = P08344_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08344_n63ArtAcaMin[0] ;
         A95ArtRen = P08344_A95ArtRen[0] ;
         n95ArtRen = P08344_n95ArtRen[0] ;
         A1903ArtGraAca = P08344_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08344_n1903ArtGraAca[0] ;
         A1148ArtPml = P08344_A1148ArtPml[0] ;
         n1148ArtPml = P08344_n1148ArtPml[0] ;
         A830TipArtDsc = P08344_A830TipArtDsc[0] ;
         n830TipArtDsc = P08344_n830TipArtDsc[0] ;
         A829TipArtCod = P08344_A829TipArtCod[0] ;
         A65ArtCod = P08344_A65ArtCod[0] ;
         A279CliNom = P08344_A279CliNom[0] ;
         A252CliCod = P08344_A252CliCod[0] ;
         A830TipArtDsc = P08344_A830TipArtDsc[0] ;
         n830TipArtDsc = P08344_n830TipArtDsc[0] ;
         A10045CliAct = P08344_A10045CliAct[0] ;
         A279CliNom = P08344_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08344_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brk8346 = false ;
            A396EmprCod = P08344_A396EmprCod[0] ;
            A65ArtCod = P08344_A65ArtCod[0] ;
            A252CliCod = P08344_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8346 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV60Option = A69ArtDsc ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8346 )
         {
            brk8346 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFTipArtDsc = AV56SearchTxt ;
      AV23TFTipArtDsc_Sel = "" ;
      AV118Tarticuwwds_1_filterfulltext = AV107FilterFullText ;
      AV119Tarticuwwds_2_tfclicod = AV10TFCliCod ;
      AV120Tarticuwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV121Tarticuwwds_4_tfclinom = AV16TFCliNom ;
      AV122Tarticuwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV123Tarticuwwds_6_tfartcod = AV12TFArtCod ;
      AV124Tarticuwwds_7_tfartcod_sel = AV13TFArtCod_Sel ;
      AV125Tarticuwwds_8_tfartdsc = AV24TFArtDsc ;
      AV126Tarticuwwds_9_tfartdsc_sel = AV25TFArtDsc_Sel ;
      AV127Tarticuwwds_10_tftipartcod = AV20TFTipArtCod ;
      AV128Tarticuwwds_11_tftipartcod_to = AV21TFTipArtCod_To ;
      AV129Tarticuwwds_12_tftipartdsc = AV22TFTipArtDsc ;
      AV130Tarticuwwds_13_tftipartdsc_sel = AV23TFTipArtDsc_Sel ;
      AV131Tarticuwwds_14_tfartpml = AV26TFArtPml ;
      AV132Tarticuwwds_15_tfartpml_to = AV27TFArtPml_To ;
      AV133Tarticuwwds_16_tfartgraaca = AV108TFArtGraAca ;
      AV134Tarticuwwds_17_tfartgraaca_to = AV109TFArtGraAca_To ;
      AV135Tarticuwwds_18_tfartren = AV38TFArtRen ;
      AV136Tarticuwwds_19_tfartren_to = AV39TFArtRen_To ;
      AV137Tarticuwwds_20_tfartacamin = AV34TFArtAcaMin ;
      AV138Tarticuwwds_21_tfartacamin_to = AV35TFArtAcaMin_To ;
      AV139Tarticuwwds_22_tfartcomer = AV112TFArtComer ;
      AV140Tarticuwwds_23_tfartcomer_sel = AV113TFArtComer_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV118Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV119Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to) ,
                                           AV122Tarticuwwds_5_tfclinom_sel ,
                                           AV121Tarticuwwds_4_tfclinom ,
                                           AV124Tarticuwwds_7_tfartcod_sel ,
                                           AV123Tarticuwwds_6_tfartcod ,
                                           AV126Tarticuwwds_9_tfartdsc_sel ,
                                           AV125Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV127Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to) ,
                                           AV130Tarticuwwds_13_tftipartdsc_sel ,
                                           AV129Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV131Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV132Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV133Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to) ,
                                           AV135Tarticuwwds_18_tfartren ,
                                           AV136Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV137Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to) ,
                                           AV140Tarticuwwds_23_tfartcomer_sel ,
                                           AV139Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV121Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV121Tarticuwwds_4_tfclinom), 30, "%") ;
      lV123Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV123Tarticuwwds_6_tfartcod), 16, "%") ;
      lV125Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV125Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV129Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV129Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV139Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV139Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08345 */
      pr_default.execute(3, new Object[] {lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, Integer.valueOf(AV119Tarticuwwds_2_tfclicod), Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to), lV121Tarticuwwds_4_tfclinom, AV122Tarticuwwds_5_tfclinom_sel, lV123Tarticuwwds_6_tfartcod, AV124Tarticuwwds_7_tfartcod_sel, lV125Tarticuwwds_8_tfartdsc, AV126Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV127Tarticuwwds_10_tftipartcod), Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to), lV129Tarticuwwds_12_tftipartdsc, AV130Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV131Tarticuwwds_14_tfartpml), Short.valueOf(AV132Tarticuwwds_15_tfartpml_to), Short.valueOf(AV133Tarticuwwds_16_tfartgraaca), Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to), AV135Tarticuwwds_18_tfartren, AV136Tarticuwwds_19_tfartren_to, Short.valueOf(AV137Tarticuwwds_20_tfartacamin), Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to), lV139Tarticuwwds_22_tfartcomer, AV140Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8348 = false ;
         A829TipArtCod = P08345_A829TipArtCod[0] ;
         A396EmprCod = P08345_A396EmprCod[0] ;
         A10045CliAct = P08345_A10045CliAct[0] ;
         A5741ArtComer = P08345_A5741ArtComer[0] ;
         n5741ArtComer = P08345_n5741ArtComer[0] ;
         A63ArtAcaMin = P08345_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08345_n63ArtAcaMin[0] ;
         A95ArtRen = P08345_A95ArtRen[0] ;
         n95ArtRen = P08345_n95ArtRen[0] ;
         A1903ArtGraAca = P08345_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08345_n1903ArtGraAca[0] ;
         A1148ArtPml = P08345_A1148ArtPml[0] ;
         n1148ArtPml = P08345_n1148ArtPml[0] ;
         A830TipArtDsc = P08345_A830TipArtDsc[0] ;
         n830TipArtDsc = P08345_n830TipArtDsc[0] ;
         A69ArtDsc = P08345_A69ArtDsc[0] ;
         n69ArtDsc = P08345_n69ArtDsc[0] ;
         A65ArtCod = P08345_A65ArtCod[0] ;
         A279CliNom = P08345_A279CliNom[0] ;
         A252CliCod = P08345_A252CliCod[0] ;
         A830TipArtDsc = P08345_A830TipArtDsc[0] ;
         n830TipArtDsc = P08345_n830TipArtDsc[0] ;
         A10045CliAct = P08345_A10045CliAct[0] ;
         A279CliNom = P08345_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08345_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08345_A829TipArtCod[0] == A829TipArtCod ) )
         {
            brk8348 = false ;
            A65ArtCod = P08345_A65ArtCod[0] ;
            A252CliCod = P08345_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8348 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A830TipArtDsc)==0) )
         {
            AV60Option = A830TipArtDsc ;
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
         if ( ! brk8348 )
         {
            brk8348 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADARTCOMEROPTIONS' Routine */
      returnInSub = false ;
      AV112TFArtComer = AV56SearchTxt ;
      AV113TFArtComer_Sel = "" ;
      AV118Tarticuwwds_1_filterfulltext = AV107FilterFullText ;
      AV119Tarticuwwds_2_tfclicod = AV10TFCliCod ;
      AV120Tarticuwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV121Tarticuwwds_4_tfclinom = AV16TFCliNom ;
      AV122Tarticuwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV123Tarticuwwds_6_tfartcod = AV12TFArtCod ;
      AV124Tarticuwwds_7_tfartcod_sel = AV13TFArtCod_Sel ;
      AV125Tarticuwwds_8_tfartdsc = AV24TFArtDsc ;
      AV126Tarticuwwds_9_tfartdsc_sel = AV25TFArtDsc_Sel ;
      AV127Tarticuwwds_10_tftipartcod = AV20TFTipArtCod ;
      AV128Tarticuwwds_11_tftipartcod_to = AV21TFTipArtCod_To ;
      AV129Tarticuwwds_12_tftipartdsc = AV22TFTipArtDsc ;
      AV130Tarticuwwds_13_tftipartdsc_sel = AV23TFTipArtDsc_Sel ;
      AV131Tarticuwwds_14_tfartpml = AV26TFArtPml ;
      AV132Tarticuwwds_15_tfartpml_to = AV27TFArtPml_To ;
      AV133Tarticuwwds_16_tfartgraaca = AV108TFArtGraAca ;
      AV134Tarticuwwds_17_tfartgraaca_to = AV109TFArtGraAca_To ;
      AV135Tarticuwwds_18_tfartren = AV38TFArtRen ;
      AV136Tarticuwwds_19_tfartren_to = AV39TFArtRen_To ;
      AV137Tarticuwwds_20_tfartacamin = AV34TFArtAcaMin ;
      AV138Tarticuwwds_21_tfartacamin_to = AV35TFArtAcaMin_To ;
      AV139Tarticuwwds_22_tfartcomer = AV112TFArtComer ;
      AV140Tarticuwwds_23_tfartcomer_sel = AV113TFArtComer_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV118Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV119Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to) ,
                                           AV122Tarticuwwds_5_tfclinom_sel ,
                                           AV121Tarticuwwds_4_tfclinom ,
                                           AV124Tarticuwwds_7_tfartcod_sel ,
                                           AV123Tarticuwwds_6_tfartcod ,
                                           AV126Tarticuwwds_9_tfartdsc_sel ,
                                           AV125Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV127Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to) ,
                                           AV130Tarticuwwds_13_tftipartdsc_sel ,
                                           AV129Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV131Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV132Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV133Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to) ,
                                           AV135Tarticuwwds_18_tfartren ,
                                           AV136Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV137Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to) ,
                                           AV140Tarticuwwds_23_tfartcomer_sel ,
                                           AV139Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV118Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tarticuwwds_1_filterfulltext), "%", "") ;
      lV121Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV121Tarticuwwds_4_tfclinom), 30, "%") ;
      lV123Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV123Tarticuwwds_6_tfartcod), 16, "%") ;
      lV125Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV125Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV129Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV129Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV139Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV139Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08346 */
      pr_default.execute(4, new Object[] {lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, lV118Tarticuwwds_1_filterfulltext, Integer.valueOf(AV119Tarticuwwds_2_tfclicod), Integer.valueOf(AV120Tarticuwwds_3_tfclicod_to), lV121Tarticuwwds_4_tfclinom, AV122Tarticuwwds_5_tfclinom_sel, lV123Tarticuwwds_6_tfartcod, AV124Tarticuwwds_7_tfartcod_sel, lV125Tarticuwwds_8_tfartdsc, AV126Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV127Tarticuwwds_10_tftipartcod), Short.valueOf(AV128Tarticuwwds_11_tftipartcod_to), lV129Tarticuwwds_12_tftipartdsc, AV130Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV131Tarticuwwds_14_tfartpml), Short.valueOf(AV132Tarticuwwds_15_tfartpml_to), Short.valueOf(AV133Tarticuwwds_16_tfartgraaca), Short.valueOf(AV134Tarticuwwds_17_tfartgraaca_to), AV135Tarticuwwds_18_tfartren, AV136Tarticuwwds_19_tfartren_to, Short.valueOf(AV137Tarticuwwds_20_tfartacamin), Short.valueOf(AV138Tarticuwwds_21_tfartacamin_to), lV139Tarticuwwds_22_tfartcomer, AV140Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk83410 = false ;
         A396EmprCod = P08346_A396EmprCod[0] ;
         A10045CliAct = P08346_A10045CliAct[0] ;
         A5741ArtComer = P08346_A5741ArtComer[0] ;
         n5741ArtComer = P08346_n5741ArtComer[0] ;
         A63ArtAcaMin = P08346_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08346_n63ArtAcaMin[0] ;
         A95ArtRen = P08346_A95ArtRen[0] ;
         n95ArtRen = P08346_n95ArtRen[0] ;
         A1903ArtGraAca = P08346_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08346_n1903ArtGraAca[0] ;
         A1148ArtPml = P08346_A1148ArtPml[0] ;
         n1148ArtPml = P08346_n1148ArtPml[0] ;
         A830TipArtDsc = P08346_A830TipArtDsc[0] ;
         n830TipArtDsc = P08346_n830TipArtDsc[0] ;
         A829TipArtCod = P08346_A829TipArtCod[0] ;
         A69ArtDsc = P08346_A69ArtDsc[0] ;
         n69ArtDsc = P08346_n69ArtDsc[0] ;
         A65ArtCod = P08346_A65ArtCod[0] ;
         A279CliNom = P08346_A279CliNom[0] ;
         A252CliCod = P08346_A252CliCod[0] ;
         A830TipArtDsc = P08346_A830TipArtDsc[0] ;
         n830TipArtDsc = P08346_n830TipArtDsc[0] ;
         A10045CliAct = P08346_A10045CliAct[0] ;
         A279CliNom = P08346_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08346_A5741ArtComer[0], A5741ArtComer) == 0 ) )
         {
            brk83410 = false ;
            A396EmprCod = P08346_A396EmprCod[0] ;
            A65ArtCod = P08346_A65ArtCod[0] ;
            A252CliCod = P08346_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk83410 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5741ArtComer)==0) )
         {
            AV60Option = A5741ArtComer ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83410 )
         {
            brk83410 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tarticuwwgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = tarticuwwgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = tarticuwwgetfilterdata.this.AV67OptionIndexesJson;
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
      AV107FilterFullText = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV12TFArtCod = "" ;
      AV13TFArtCod_Sel = "" ;
      AV24TFArtDsc = "" ;
      AV25TFArtDsc_Sel = "" ;
      AV22TFTipArtDsc = "" ;
      AV23TFTipArtDsc_Sel = "" ;
      AV38TFArtRen = DecimalUtil.ZERO ;
      AV39TFArtRen_To = DecimalUtil.ZERO ;
      AV112TFArtComer = "" ;
      AV113TFArtComer_Sel = "" ;
      A279CliNom = "" ;
      AV118Tarticuwwds_1_filterfulltext = "" ;
      AV121Tarticuwwds_4_tfclinom = "" ;
      AV122Tarticuwwds_5_tfclinom_sel = "" ;
      AV123Tarticuwwds_6_tfartcod = "" ;
      AV124Tarticuwwds_7_tfartcod_sel = "" ;
      AV125Tarticuwwds_8_tfartdsc = "" ;
      AV126Tarticuwwds_9_tfartdsc_sel = "" ;
      AV129Tarticuwwds_12_tftipartdsc = "" ;
      AV130Tarticuwwds_13_tftipartdsc_sel = "" ;
      AV135Tarticuwwds_18_tfartren = DecimalUtil.ZERO ;
      AV136Tarticuwwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV139Tarticuwwds_22_tfartcomer = "" ;
      AV140Tarticuwwds_23_tfartcomer_sel = "" ;
      scmdbuf = "" ;
      lV118Tarticuwwds_1_filterfulltext = "" ;
      lV121Tarticuwwds_4_tfclinom = "" ;
      lV123Tarticuwwds_6_tfartcod = "" ;
      lV125Tarticuwwds_8_tfartdsc = "" ;
      lV129Tarticuwwds_12_tftipartdsc = "" ;
      lV139Tarticuwwds_22_tfartcomer = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      A10045CliAct = "" ;
      P08342_A396EmprCod = new String[] {""} ;
      P08342_A10045CliAct = new String[] {""} ;
      P08342_A279CliNom = new String[] {""} ;
      P08342_A5741ArtComer = new String[] {""} ;
      P08342_n5741ArtComer = new boolean[] {false} ;
      P08342_A63ArtAcaMin = new short[1] ;
      P08342_n63ArtAcaMin = new boolean[] {false} ;
      P08342_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08342_n95ArtRen = new boolean[] {false} ;
      P08342_A1903ArtGraAca = new short[1] ;
      P08342_n1903ArtGraAca = new boolean[] {false} ;
      P08342_A1148ArtPml = new short[1] ;
      P08342_n1148ArtPml = new boolean[] {false} ;
      P08342_A830TipArtDsc = new String[] {""} ;
      P08342_n830TipArtDsc = new boolean[] {false} ;
      P08342_A829TipArtCod = new short[1] ;
      P08342_A69ArtDsc = new String[] {""} ;
      P08342_n69ArtDsc = new boolean[] {false} ;
      P08342_A65ArtCod = new String[] {""} ;
      P08342_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV60Option = "" ;
      P08343_A396EmprCod = new String[] {""} ;
      P08343_A10045CliAct = new String[] {""} ;
      P08343_A65ArtCod = new String[] {""} ;
      P08343_A5741ArtComer = new String[] {""} ;
      P08343_n5741ArtComer = new boolean[] {false} ;
      P08343_A63ArtAcaMin = new short[1] ;
      P08343_n63ArtAcaMin = new boolean[] {false} ;
      P08343_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08343_n95ArtRen = new boolean[] {false} ;
      P08343_A1903ArtGraAca = new short[1] ;
      P08343_n1903ArtGraAca = new boolean[] {false} ;
      P08343_A1148ArtPml = new short[1] ;
      P08343_n1148ArtPml = new boolean[] {false} ;
      P08343_A830TipArtDsc = new String[] {""} ;
      P08343_n830TipArtDsc = new boolean[] {false} ;
      P08343_A829TipArtCod = new short[1] ;
      P08343_A69ArtDsc = new String[] {""} ;
      P08343_n69ArtDsc = new boolean[] {false} ;
      P08343_A279CliNom = new String[] {""} ;
      P08343_A252CliCod = new int[1] ;
      P08344_A396EmprCod = new String[] {""} ;
      P08344_A10045CliAct = new String[] {""} ;
      P08344_A69ArtDsc = new String[] {""} ;
      P08344_n69ArtDsc = new boolean[] {false} ;
      P08344_A5741ArtComer = new String[] {""} ;
      P08344_n5741ArtComer = new boolean[] {false} ;
      P08344_A63ArtAcaMin = new short[1] ;
      P08344_n63ArtAcaMin = new boolean[] {false} ;
      P08344_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08344_n95ArtRen = new boolean[] {false} ;
      P08344_A1903ArtGraAca = new short[1] ;
      P08344_n1903ArtGraAca = new boolean[] {false} ;
      P08344_A1148ArtPml = new short[1] ;
      P08344_n1148ArtPml = new boolean[] {false} ;
      P08344_A830TipArtDsc = new String[] {""} ;
      P08344_n830TipArtDsc = new boolean[] {false} ;
      P08344_A829TipArtCod = new short[1] ;
      P08344_A65ArtCod = new String[] {""} ;
      P08344_A279CliNom = new String[] {""} ;
      P08344_A252CliCod = new int[1] ;
      P08345_A829TipArtCod = new short[1] ;
      P08345_A396EmprCod = new String[] {""} ;
      P08345_A10045CliAct = new String[] {""} ;
      P08345_A5741ArtComer = new String[] {""} ;
      P08345_n5741ArtComer = new boolean[] {false} ;
      P08345_A63ArtAcaMin = new short[1] ;
      P08345_n63ArtAcaMin = new boolean[] {false} ;
      P08345_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08345_n95ArtRen = new boolean[] {false} ;
      P08345_A1903ArtGraAca = new short[1] ;
      P08345_n1903ArtGraAca = new boolean[] {false} ;
      P08345_A1148ArtPml = new short[1] ;
      P08345_n1148ArtPml = new boolean[] {false} ;
      P08345_A830TipArtDsc = new String[] {""} ;
      P08345_n830TipArtDsc = new boolean[] {false} ;
      P08345_A69ArtDsc = new String[] {""} ;
      P08345_n69ArtDsc = new boolean[] {false} ;
      P08345_A65ArtCod = new String[] {""} ;
      P08345_A279CliNom = new String[] {""} ;
      P08345_A252CliCod = new int[1] ;
      P08346_A396EmprCod = new String[] {""} ;
      P08346_A10045CliAct = new String[] {""} ;
      P08346_A5741ArtComer = new String[] {""} ;
      P08346_n5741ArtComer = new boolean[] {false} ;
      P08346_A63ArtAcaMin = new short[1] ;
      P08346_n63ArtAcaMin = new boolean[] {false} ;
      P08346_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08346_n95ArtRen = new boolean[] {false} ;
      P08346_A1903ArtGraAca = new short[1] ;
      P08346_n1903ArtGraAca = new boolean[] {false} ;
      P08346_A1148ArtPml = new short[1] ;
      P08346_n1148ArtPml = new boolean[] {false} ;
      P08346_A830TipArtDsc = new String[] {""} ;
      P08346_n830TipArtDsc = new boolean[] {false} ;
      P08346_A829TipArtCod = new short[1] ;
      P08346_A69ArtDsc = new String[] {""} ;
      P08346_n69ArtDsc = new boolean[] {false} ;
      P08346_A65ArtCod = new String[] {""} ;
      P08346_A279CliNom = new String[] {""} ;
      P08346_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticuwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08342_A396EmprCod, P08342_A10045CliAct, P08342_A279CliNom, P08342_A5741ArtComer, P08342_n5741ArtComer, P08342_A63ArtAcaMin, P08342_n63ArtAcaMin, P08342_A95ArtRen, P08342_n95ArtRen, P08342_A1903ArtGraAca,
            P08342_n1903ArtGraAca, P08342_A1148ArtPml, P08342_n1148ArtPml, P08342_A830TipArtDsc, P08342_n830TipArtDsc, P08342_A829TipArtCod, P08342_A69ArtDsc, P08342_n69ArtDsc, P08342_A65ArtCod, P08342_A252CliCod
            }
            , new Object[] {
            P08343_A396EmprCod, P08343_A10045CliAct, P08343_A65ArtCod, P08343_A5741ArtComer, P08343_n5741ArtComer, P08343_A63ArtAcaMin, P08343_n63ArtAcaMin, P08343_A95ArtRen, P08343_n95ArtRen, P08343_A1903ArtGraAca,
            P08343_n1903ArtGraAca, P08343_A1148ArtPml, P08343_n1148ArtPml, P08343_A830TipArtDsc, P08343_n830TipArtDsc, P08343_A829TipArtCod, P08343_A69ArtDsc, P08343_n69ArtDsc, P08343_A279CliNom, P08343_A252CliCod
            }
            , new Object[] {
            P08344_A396EmprCod, P08344_A10045CliAct, P08344_A69ArtDsc, P08344_n69ArtDsc, P08344_A5741ArtComer, P08344_n5741ArtComer, P08344_A63ArtAcaMin, P08344_n63ArtAcaMin, P08344_A95ArtRen, P08344_n95ArtRen,
            P08344_A1903ArtGraAca, P08344_n1903ArtGraAca, P08344_A1148ArtPml, P08344_n1148ArtPml, P08344_A830TipArtDsc, P08344_n830TipArtDsc, P08344_A829TipArtCod, P08344_A65ArtCod, P08344_A279CliNom, P08344_A252CliCod
            }
            , new Object[] {
            P08345_A829TipArtCod, P08345_A396EmprCod, P08345_A10045CliAct, P08345_A5741ArtComer, P08345_n5741ArtComer, P08345_A63ArtAcaMin, P08345_n63ArtAcaMin, P08345_A95ArtRen, P08345_n95ArtRen, P08345_A1903ArtGraAca,
            P08345_n1903ArtGraAca, P08345_A1148ArtPml, P08345_n1148ArtPml, P08345_A830TipArtDsc, P08345_n830TipArtDsc, P08345_A69ArtDsc, P08345_n69ArtDsc, P08345_A65ArtCod, P08345_A279CliNom, P08345_A252CliCod
            }
            , new Object[] {
            P08346_A396EmprCod, P08346_A10045CliAct, P08346_A5741ArtComer, P08346_n5741ArtComer, P08346_A63ArtAcaMin, P08346_n63ArtAcaMin, P08346_A95ArtRen, P08346_n95ArtRen, P08346_A1903ArtGraAca, P08346_n1903ArtGraAca,
            P08346_A1148ArtPml, P08346_n1148ArtPml, P08346_A830TipArtDsc, P08346_n830TipArtDsc, P08346_A829TipArtCod, P08346_A69ArtDsc, P08346_n69ArtDsc, P08346_A65ArtCod, P08346_A279CliNom, P08346_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20TFTipArtCod ;
   private short AV21TFTipArtCod_To ;
   private short AV26TFArtPml ;
   private short AV27TFArtPml_To ;
   private short AV108TFArtGraAca ;
   private short AV109TFArtGraAca_To ;
   private short AV34TFArtAcaMin ;
   private short AV35TFArtAcaMin_To ;
   private short AV127Tarticuwwds_10_tftipartcod ;
   private short AV128Tarticuwwds_11_tftipartcod_to ;
   private short AV131Tarticuwwds_14_tfartpml ;
   private short AV132Tarticuwwds_15_tfartpml_to ;
   private short AV133Tarticuwwds_16_tfartgraaca ;
   private short AV134Tarticuwwds_17_tfartgraaca_to ;
   private short AV137Tarticuwwds_20_tfartacamin ;
   private short AV138Tarticuwwds_21_tfartacamin_to ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short Gx_err ;
   private int AV116GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV119Tarticuwwds_2_tfclicod ;
   private int AV120Tarticuwwds_3_tfclicod_to ;
   private int A252CliCod ;
   private int AV59InsertIndex ;
   private long AV68count ;
   private java.math.BigDecimal AV38TFArtRen ;
   private java.math.BigDecimal AV39TFArtRen_To ;
   private java.math.BigDecimal AV135Tarticuwwds_18_tfartren ;
   private java.math.BigDecimal AV136Tarticuwwds_19_tfartren_to ;
   private java.math.BigDecimal A95ArtRen ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV12TFArtCod ;
   private String AV13TFArtCod_Sel ;
   private String AV24TFArtDsc ;
   private String AV25TFArtDsc_Sel ;
   private String AV22TFTipArtDsc ;
   private String AV23TFTipArtDsc_Sel ;
   private String AV112TFArtComer ;
   private String AV113TFArtComer_Sel ;
   private String A279CliNom ;
   private String AV121Tarticuwwds_4_tfclinom ;
   private String AV122Tarticuwwds_5_tfclinom_sel ;
   private String AV123Tarticuwwds_6_tfartcod ;
   private String AV124Tarticuwwds_7_tfartcod_sel ;
   private String AV125Tarticuwwds_8_tfartdsc ;
   private String AV126Tarticuwwds_9_tfartdsc_sel ;
   private String AV129Tarticuwwds_12_tftipartdsc ;
   private String AV130Tarticuwwds_13_tftipartdsc_sel ;
   private String AV139Tarticuwwds_22_tfartcomer ;
   private String AV140Tarticuwwds_23_tfartcomer_sel ;
   private String scmdbuf ;
   private String lV121Tarticuwwds_4_tfclinom ;
   private String lV123Tarticuwwds_6_tfartcod ;
   private String lV125Tarticuwwds_8_tfartdsc ;
   private String lV129Tarticuwwds_12_tftipartdsc ;
   private String lV139Tarticuwwds_22_tfartcomer ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8342 ;
   private boolean n5741ArtComer ;
   private boolean n63ArtAcaMin ;
   private boolean n95ArtRen ;
   private boolean n1903ArtGraAca ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean brk8344 ;
   private boolean brk8346 ;
   private boolean brk8348 ;
   private boolean brk83410 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV107FilterFullText ;
   private String AV118Tarticuwwds_1_filterfulltext ;
   private String lV118Tarticuwwds_1_filterfulltext ;
   private String AV60Option ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08342_A396EmprCod ;
   private String[] P08342_A10045CliAct ;
   private String[] P08342_A279CliNom ;
   private String[] P08342_A5741ArtComer ;
   private boolean[] P08342_n5741ArtComer ;
   private short[] P08342_A63ArtAcaMin ;
   private boolean[] P08342_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08342_A95ArtRen ;
   private boolean[] P08342_n95ArtRen ;
   private short[] P08342_A1903ArtGraAca ;
   private boolean[] P08342_n1903ArtGraAca ;
   private short[] P08342_A1148ArtPml ;
   private boolean[] P08342_n1148ArtPml ;
   private String[] P08342_A830TipArtDsc ;
   private boolean[] P08342_n830TipArtDsc ;
   private short[] P08342_A829TipArtCod ;
   private String[] P08342_A69ArtDsc ;
   private boolean[] P08342_n69ArtDsc ;
   private String[] P08342_A65ArtCod ;
   private int[] P08342_A252CliCod ;
   private String[] P08343_A396EmprCod ;
   private String[] P08343_A10045CliAct ;
   private String[] P08343_A65ArtCod ;
   private String[] P08343_A5741ArtComer ;
   private boolean[] P08343_n5741ArtComer ;
   private short[] P08343_A63ArtAcaMin ;
   private boolean[] P08343_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08343_A95ArtRen ;
   private boolean[] P08343_n95ArtRen ;
   private short[] P08343_A1903ArtGraAca ;
   private boolean[] P08343_n1903ArtGraAca ;
   private short[] P08343_A1148ArtPml ;
   private boolean[] P08343_n1148ArtPml ;
   private String[] P08343_A830TipArtDsc ;
   private boolean[] P08343_n830TipArtDsc ;
   private short[] P08343_A829TipArtCod ;
   private String[] P08343_A69ArtDsc ;
   private boolean[] P08343_n69ArtDsc ;
   private String[] P08343_A279CliNom ;
   private int[] P08343_A252CliCod ;
   private String[] P08344_A396EmprCod ;
   private String[] P08344_A10045CliAct ;
   private String[] P08344_A69ArtDsc ;
   private boolean[] P08344_n69ArtDsc ;
   private String[] P08344_A5741ArtComer ;
   private boolean[] P08344_n5741ArtComer ;
   private short[] P08344_A63ArtAcaMin ;
   private boolean[] P08344_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08344_A95ArtRen ;
   private boolean[] P08344_n95ArtRen ;
   private short[] P08344_A1903ArtGraAca ;
   private boolean[] P08344_n1903ArtGraAca ;
   private short[] P08344_A1148ArtPml ;
   private boolean[] P08344_n1148ArtPml ;
   private String[] P08344_A830TipArtDsc ;
   private boolean[] P08344_n830TipArtDsc ;
   private short[] P08344_A829TipArtCod ;
   private String[] P08344_A65ArtCod ;
   private String[] P08344_A279CliNom ;
   private int[] P08344_A252CliCod ;
   private short[] P08345_A829TipArtCod ;
   private String[] P08345_A396EmprCod ;
   private String[] P08345_A10045CliAct ;
   private String[] P08345_A5741ArtComer ;
   private boolean[] P08345_n5741ArtComer ;
   private short[] P08345_A63ArtAcaMin ;
   private boolean[] P08345_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08345_A95ArtRen ;
   private boolean[] P08345_n95ArtRen ;
   private short[] P08345_A1903ArtGraAca ;
   private boolean[] P08345_n1903ArtGraAca ;
   private short[] P08345_A1148ArtPml ;
   private boolean[] P08345_n1148ArtPml ;
   private String[] P08345_A830TipArtDsc ;
   private boolean[] P08345_n830TipArtDsc ;
   private String[] P08345_A69ArtDsc ;
   private boolean[] P08345_n69ArtDsc ;
   private String[] P08345_A65ArtCod ;
   private String[] P08345_A279CliNom ;
   private int[] P08345_A252CliCod ;
   private String[] P08346_A396EmprCod ;
   private String[] P08346_A10045CliAct ;
   private String[] P08346_A5741ArtComer ;
   private boolean[] P08346_n5741ArtComer ;
   private short[] P08346_A63ArtAcaMin ;
   private boolean[] P08346_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08346_A95ArtRen ;
   private boolean[] P08346_n95ArtRen ;
   private short[] P08346_A1903ArtGraAca ;
   private boolean[] P08346_n1903ArtGraAca ;
   private short[] P08346_A1148ArtPml ;
   private boolean[] P08346_n1148ArtPml ;
   private String[] P08346_A830TipArtDsc ;
   private boolean[] P08346_n830TipArtDsc ;
   private short[] P08346_A829TipArtCod ;
   private String[] P08346_A69ArtDsc ;
   private boolean[] P08346_n69ArtDsc ;
   private String[] P08346_A65ArtCod ;
   private String[] P08346_A279CliNom ;
   private int[] P08346_A252CliCod ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class tarticuwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08342( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tarticuwwds_1_filterfulltext ,
                                          int AV119Tarticuwwds_2_tfclicod ,
                                          int AV120Tarticuwwds_3_tfclicod_to ,
                                          String AV122Tarticuwwds_5_tfclinom_sel ,
                                          String AV121Tarticuwwds_4_tfclinom ,
                                          String AV124Tarticuwwds_7_tfartcod_sel ,
                                          String AV123Tarticuwwds_6_tfartcod ,
                                          String AV126Tarticuwwds_9_tfartdsc_sel ,
                                          String AV125Tarticuwwds_8_tfartdsc ,
                                          short AV127Tarticuwwds_10_tftipartcod ,
                                          short AV128Tarticuwwds_11_tftipartcod_to ,
                                          String AV130Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV129Tarticuwwds_12_tftipartdsc ,
                                          short AV131Tarticuwwds_14_tfartpml ,
                                          short AV132Tarticuwwds_15_tfartpml_to ,
                                          short AV133Tarticuwwds_16_tfartgraaca ,
                                          short AV134Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV135Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV136Tarticuwwds_19_tfartren_to ,
                                          short AV137Tarticuwwds_20_tfartacamin ,
                                          short AV138Tarticuwwds_21_tfartacamin_to ,
                                          String AV140Tarticuwwds_23_tfartcomer_sel ,
                                          String AV139Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T3.CliNom, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV118Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV123Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV134Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV138Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV139Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08343( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tarticuwwds_1_filterfulltext ,
                                          int AV119Tarticuwwds_2_tfclicod ,
                                          int AV120Tarticuwwds_3_tfclicod_to ,
                                          String AV122Tarticuwwds_5_tfclinom_sel ,
                                          String AV121Tarticuwwds_4_tfclinom ,
                                          String AV124Tarticuwwds_7_tfartcod_sel ,
                                          String AV123Tarticuwwds_6_tfartcod ,
                                          String AV126Tarticuwwds_9_tfartdsc_sel ,
                                          String AV125Tarticuwwds_8_tfartdsc ,
                                          short AV127Tarticuwwds_10_tftipartcod ,
                                          short AV128Tarticuwwds_11_tftipartcod_to ,
                                          String AV130Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV129Tarticuwwds_12_tftipartdsc ,
                                          short AV131Tarticuwwds_14_tfartpml ,
                                          short AV132Tarticuwwds_15_tfartpml_to ,
                                          short AV133Tarticuwwds_16_tfartgraaca ,
                                          short AV134Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV135Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV136Tarticuwwds_19_tfartren_to ,
                                          short AV137Tarticuwwds_20_tfartacamin ,
                                          short AV138Tarticuwwds_21_tfartacamin_to ,
                                          String AV140Tarticuwwds_23_tfartcomer_sel ,
                                          String AV139Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtCod, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T3.CliNom, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV118Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV123Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV134Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV138Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV139Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08344( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tarticuwwds_1_filterfulltext ,
                                          int AV119Tarticuwwds_2_tfclicod ,
                                          int AV120Tarticuwwds_3_tfclicod_to ,
                                          String AV122Tarticuwwds_5_tfclinom_sel ,
                                          String AV121Tarticuwwds_4_tfclinom ,
                                          String AV124Tarticuwwds_7_tfartcod_sel ,
                                          String AV123Tarticuwwds_6_tfartcod ,
                                          String AV126Tarticuwwds_9_tfartdsc_sel ,
                                          String AV125Tarticuwwds_8_tfartdsc ,
                                          short AV127Tarticuwwds_10_tftipartcod ,
                                          short AV128Tarticuwwds_11_tftipartcod_to ,
                                          String AV130Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV129Tarticuwwds_12_tftipartdsc ,
                                          short AV131Tarticuwwds_14_tfartpml ,
                                          short AV132Tarticuwwds_15_tfartpml_to ,
                                          short AV133Tarticuwwds_16_tfartgraaca ,
                                          short AV134Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV135Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV136Tarticuwwds_19_tfartren_to ,
                                          short AV137Tarticuwwds_20_tfartacamin ,
                                          short AV138Tarticuwwds_21_tfartacamin_to ,
                                          String AV140Tarticuwwds_23_tfartcomer_sel ,
                                          String AV139Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtDsc, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtCod, T3.CliNom, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV118Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV123Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV134Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV138Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV139Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08345( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tarticuwwds_1_filterfulltext ,
                                          int AV119Tarticuwwds_2_tfclicod ,
                                          int AV120Tarticuwwds_3_tfclicod_to ,
                                          String AV122Tarticuwwds_5_tfclinom_sel ,
                                          String AV121Tarticuwwds_4_tfclinom ,
                                          String AV124Tarticuwwds_7_tfartcod_sel ,
                                          String AV123Tarticuwwds_6_tfartcod ,
                                          String AV126Tarticuwwds_9_tfartdsc_sel ,
                                          String AV125Tarticuwwds_8_tfartdsc ,
                                          short AV127Tarticuwwds_10_tftipartcod ,
                                          short AV128Tarticuwwds_11_tftipartcod_to ,
                                          String AV130Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV129Tarticuwwds_12_tftipartdsc ,
                                          short AV131Tarticuwwds_14_tfartpml ,
                                          short AV132Tarticuwwds_15_tfartpml_to ,
                                          short AV133Tarticuwwds_16_tfartgraaca ,
                                          short AV134Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV135Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV136Tarticuwwds_19_tfartren_to ,
                                          short AV137Tarticuwwds_20_tfartacamin ,
                                          short AV138Tarticuwwds_21_tfartacamin_to ,
                                          String AV140Tarticuwwds_23_tfartcomer_sel ,
                                          String AV139Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TipArtCod, T1.EmprCod, T3.CliAct, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV118Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV123Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV134Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV138Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV139Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipArtCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08346( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tarticuwwds_1_filterfulltext ,
                                          int AV119Tarticuwwds_2_tfclicod ,
                                          int AV120Tarticuwwds_3_tfclicod_to ,
                                          String AV122Tarticuwwds_5_tfclinom_sel ,
                                          String AV121Tarticuwwds_4_tfclinom ,
                                          String AV124Tarticuwwds_7_tfartcod_sel ,
                                          String AV123Tarticuwwds_6_tfartcod ,
                                          String AV126Tarticuwwds_9_tfartdsc_sel ,
                                          String AV125Tarticuwwds_8_tfartdsc ,
                                          short AV127Tarticuwwds_10_tftipartcod ,
                                          short AV128Tarticuwwds_11_tftipartcod_to ,
                                          String AV130Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV129Tarticuwwds_12_tftipartdsc ,
                                          short AV131Tarticuwwds_14_tfartpml ,
                                          short AV132Tarticuwwds_15_tfartpml_to ,
                                          short AV133Tarticuwwds_16_tfartgraaca ,
                                          short AV134Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV135Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV136Tarticuwwds_19_tfartren_to ,
                                          short AV137Tarticuwwds_20_tfartacamin ,
                                          short AV138Tarticuwwds_21_tfartacamin_to ,
                                          String AV140Tarticuwwds_23_tfartcomer_sel ,
                                          String AV139Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV118Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV123Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV134Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV138Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV139Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtComer" ;
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
                  return conditional_P08342(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_P08343(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 2 :
                  return conditional_P08344(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 3 :
                  return conditional_P08345(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 4 :
                  return conditional_P08346(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08342", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08343", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08344", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08345", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08346", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 16);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               return;
      }
   }

}

