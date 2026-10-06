package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tempreswwgetfilterdata extends GXProcedure
{
   public tempreswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tempreswwgetfilterdata.class ), "" );
   }

   public tempreswwgetfilterdata( int remoteHandle ,
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
      tempreswwgetfilterdata.this.aP5 = new String[] {""};
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
      tempreswwgetfilterdata.this.AV62DDOName = aP0;
      tempreswwgetfilterdata.this.AV60SearchTxt = aP1;
      tempreswwgetfilterdata.this.AV61SearchTxtTo = aP2;
      tempreswwgetfilterdata.this.aP3 = aP3;
      tempreswwgetfilterdata.this.aP4 = aP4;
      tempreswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRDIR") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRDIROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRCPO") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCPOOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRPOBOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRCIF") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCIFOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRTEL") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRTELOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRFAX") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRFAXOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_IVACOD") == 0 )
      {
         /* Execute user subroutine: 'LOADIVACODOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_IVADSC") == 0 )
      {
         /* Execute user subroutine: 'LOADIVADSCOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV66OptionsJson = AV65Options.toJSonString(false) ;
      AV69OptionsDescJson = AV68OptionsDesc.toJSonString(false) ;
      AV71OptionIndexesJson = AV70OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV73Session.getValue("TEMPRESWWGridState"), "") == 0 )
      {
         AV75GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEMPRESWWGridState"), null, null);
      }
      else
      {
         AV75GridState.fromxml(AV73Session.getValue("TEMPRESWWGridState"), null, null);
      }
      AV95GXV1 = 1 ;
      while ( AV95GXV1 <= AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV76GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV1));
         if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV92FilterFullText = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR") == 0 )
         {
            AV14TFEmprDir = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR_SEL") == 0 )
         {
            AV15TFEmprDir_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO") == 0 )
         {
            AV16TFEmprCpo = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO_SEL") == 0 )
         {
            AV17TFEmprCpo_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB") == 0 )
         {
            AV18TFEmprPob = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB_SEL") == 0 )
         {
            AV19TFEmprPob_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF") == 0 )
         {
            AV20TFEmprCif = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF_SEL") == 0 )
         {
            AV21TFEmprCif_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL") == 0 )
         {
            AV22TFEmprTel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL_SEL") == 0 )
         {
            AV23TFEmprTel_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX") == 0 )
         {
            AV24TFEmprFax = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX_SEL") == 0 )
         {
            AV25TFEmprFax_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD") == 0 )
         {
            AV26TFIvaCod = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD_SEL") == 0 )
         {
            AV27TFIvaCod_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC") == 0 )
         {
            AV28TFIvaDsc = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC_SEL") == 0 )
         {
            AV29TFIvaDsc_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVAPOR") == 0 )
         {
            AV30TFIvaPor = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFIvaPor_To = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV95GXV1 = (int)(AV95GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV60SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW2 */
      pr_default.execute(0, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A588IvaPor = P08OW2_A588IvaPor[0] ;
         n588IvaPor = P08OW2_n588IvaPor[0] ;
         A954IvaDsc = P08OW2_A954IvaDsc[0] ;
         n954IvaDsc = P08OW2_n954IvaDsc[0] ;
         A953IvaCod = P08OW2_A953IvaCod[0] ;
         n953IvaCod = P08OW2_n953IvaCod[0] ;
         A405EmprFax = P08OW2_A405EmprFax[0] ;
         n405EmprFax = P08OW2_n405EmprFax[0] ;
         A409EmprTel = P08OW2_A409EmprTel[0] ;
         n409EmprTel = P08OW2_n409EmprTel[0] ;
         A395EmprCif = P08OW2_A395EmprCif[0] ;
         n395EmprCif = P08OW2_n395EmprCif[0] ;
         A408EmprPob = P08OW2_A408EmprPob[0] ;
         n408EmprPob = P08OW2_n408EmprPob[0] ;
         A403EmprCpo = P08OW2_A403EmprCpo[0] ;
         n403EmprCpo = P08OW2_n403EmprCpo[0] ;
         A404EmprDir = P08OW2_A404EmprDir[0] ;
         n404EmprDir = P08OW2_n404EmprDir[0] ;
         A407EmprNom = P08OW2_A407EmprNom[0] ;
         n407EmprNom = P08OW2_n407EmprNom[0] ;
         A396EmprCod = P08OW2_A396EmprCod[0] ;
         A588IvaPor = P08OW2_A588IvaPor[0] ;
         n588IvaPor = P08OW2_n588IvaPor[0] ;
         A954IvaDsc = P08OW2_A954IvaDsc[0] ;
         n954IvaDsc = P08OW2_n954IvaDsc[0] ;
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV64Option = A396EmprCod ;
            AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV65Options.add(AV64Option, 0);
            AV68OptionsDesc.add(AV67OptionDesc, 0);
         }
         if ( AV65Options.size() == 50 )
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
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV60SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW3 */
      pr_default.execute(1, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8OW3 = false ;
         A407EmprNom = P08OW3_A407EmprNom[0] ;
         n407EmprNom = P08OW3_n407EmprNom[0] ;
         A588IvaPor = P08OW3_A588IvaPor[0] ;
         n588IvaPor = P08OW3_n588IvaPor[0] ;
         A954IvaDsc = P08OW3_A954IvaDsc[0] ;
         n954IvaDsc = P08OW3_n954IvaDsc[0] ;
         A953IvaCod = P08OW3_A953IvaCod[0] ;
         n953IvaCod = P08OW3_n953IvaCod[0] ;
         A405EmprFax = P08OW3_A405EmprFax[0] ;
         n405EmprFax = P08OW3_n405EmprFax[0] ;
         A409EmprTel = P08OW3_A409EmprTel[0] ;
         n409EmprTel = P08OW3_n409EmprTel[0] ;
         A395EmprCif = P08OW3_A395EmprCif[0] ;
         n395EmprCif = P08OW3_n395EmprCif[0] ;
         A408EmprPob = P08OW3_A408EmprPob[0] ;
         n408EmprPob = P08OW3_n408EmprPob[0] ;
         A403EmprCpo = P08OW3_A403EmprCpo[0] ;
         n403EmprCpo = P08OW3_n403EmprCpo[0] ;
         A404EmprDir = P08OW3_A404EmprDir[0] ;
         n404EmprDir = P08OW3_n404EmprDir[0] ;
         A396EmprCod = P08OW3_A396EmprCod[0] ;
         A588IvaPor = P08OW3_A588IvaPor[0] ;
         n588IvaPor = P08OW3_n588IvaPor[0] ;
         A954IvaDsc = P08OW3_A954IvaDsc[0] ;
         n954IvaDsc = P08OW3_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08OW3_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8OW3 = false ;
            A396EmprCod = P08OW3_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV64Option = A407EmprNom ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW3 )
         {
            brk8OW3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADEMPRDIROPTIONS' Routine */
      returnInSub = false ;
      AV14TFEmprDir = AV60SearchTxt ;
      AV15TFEmprDir_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW4 */
      pr_default.execute(2, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8OW5 = false ;
         A404EmprDir = P08OW4_A404EmprDir[0] ;
         n404EmprDir = P08OW4_n404EmprDir[0] ;
         A588IvaPor = P08OW4_A588IvaPor[0] ;
         n588IvaPor = P08OW4_n588IvaPor[0] ;
         A954IvaDsc = P08OW4_A954IvaDsc[0] ;
         n954IvaDsc = P08OW4_n954IvaDsc[0] ;
         A953IvaCod = P08OW4_A953IvaCod[0] ;
         n953IvaCod = P08OW4_n953IvaCod[0] ;
         A405EmprFax = P08OW4_A405EmprFax[0] ;
         n405EmprFax = P08OW4_n405EmprFax[0] ;
         A409EmprTel = P08OW4_A409EmprTel[0] ;
         n409EmprTel = P08OW4_n409EmprTel[0] ;
         A395EmprCif = P08OW4_A395EmprCif[0] ;
         n395EmprCif = P08OW4_n395EmprCif[0] ;
         A408EmprPob = P08OW4_A408EmprPob[0] ;
         n408EmprPob = P08OW4_n408EmprPob[0] ;
         A403EmprCpo = P08OW4_A403EmprCpo[0] ;
         n403EmprCpo = P08OW4_n403EmprCpo[0] ;
         A407EmprNom = P08OW4_A407EmprNom[0] ;
         n407EmprNom = P08OW4_n407EmprNom[0] ;
         A396EmprCod = P08OW4_A396EmprCod[0] ;
         A588IvaPor = P08OW4_A588IvaPor[0] ;
         n588IvaPor = P08OW4_n588IvaPor[0] ;
         A954IvaDsc = P08OW4_A954IvaDsc[0] ;
         n954IvaDsc = P08OW4_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08OW4_A404EmprDir[0], A404EmprDir) == 0 ) )
         {
            brk8OW5 = false ;
            A396EmprCod = P08OW4_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A404EmprDir)==0) )
         {
            AV64Option = A404EmprDir ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW5 )
         {
            brk8OW5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADEMPRCPOOPTIONS' Routine */
      returnInSub = false ;
      AV16TFEmprCpo = AV60SearchTxt ;
      AV17TFEmprCpo_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW5 */
      pr_default.execute(3, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8OW7 = false ;
         A403EmprCpo = P08OW5_A403EmprCpo[0] ;
         n403EmprCpo = P08OW5_n403EmprCpo[0] ;
         A588IvaPor = P08OW5_A588IvaPor[0] ;
         n588IvaPor = P08OW5_n588IvaPor[0] ;
         A954IvaDsc = P08OW5_A954IvaDsc[0] ;
         n954IvaDsc = P08OW5_n954IvaDsc[0] ;
         A953IvaCod = P08OW5_A953IvaCod[0] ;
         n953IvaCod = P08OW5_n953IvaCod[0] ;
         A405EmprFax = P08OW5_A405EmprFax[0] ;
         n405EmprFax = P08OW5_n405EmprFax[0] ;
         A409EmprTel = P08OW5_A409EmprTel[0] ;
         n409EmprTel = P08OW5_n409EmprTel[0] ;
         A395EmprCif = P08OW5_A395EmprCif[0] ;
         n395EmprCif = P08OW5_n395EmprCif[0] ;
         A408EmprPob = P08OW5_A408EmprPob[0] ;
         n408EmprPob = P08OW5_n408EmprPob[0] ;
         A404EmprDir = P08OW5_A404EmprDir[0] ;
         n404EmprDir = P08OW5_n404EmprDir[0] ;
         A407EmprNom = P08OW5_A407EmprNom[0] ;
         n407EmprNom = P08OW5_n407EmprNom[0] ;
         A396EmprCod = P08OW5_A396EmprCod[0] ;
         A588IvaPor = P08OW5_A588IvaPor[0] ;
         n588IvaPor = P08OW5_n588IvaPor[0] ;
         A954IvaDsc = P08OW5_A954IvaDsc[0] ;
         n954IvaDsc = P08OW5_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08OW5_A403EmprCpo[0], A403EmprCpo) == 0 ) )
         {
            brk8OW7 = false ;
            A396EmprCod = P08OW5_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A403EmprCpo)==0) )
         {
            AV64Option = A403EmprCpo ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW7 )
         {
            brk8OW7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADEMPRPOBOPTIONS' Routine */
      returnInSub = false ;
      AV18TFEmprPob = AV60SearchTxt ;
      AV19TFEmprPob_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW6 */
      pr_default.execute(4, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8OW9 = false ;
         A408EmprPob = P08OW6_A408EmprPob[0] ;
         n408EmprPob = P08OW6_n408EmprPob[0] ;
         A588IvaPor = P08OW6_A588IvaPor[0] ;
         n588IvaPor = P08OW6_n588IvaPor[0] ;
         A954IvaDsc = P08OW6_A954IvaDsc[0] ;
         n954IvaDsc = P08OW6_n954IvaDsc[0] ;
         A953IvaCod = P08OW6_A953IvaCod[0] ;
         n953IvaCod = P08OW6_n953IvaCod[0] ;
         A405EmprFax = P08OW6_A405EmprFax[0] ;
         n405EmprFax = P08OW6_n405EmprFax[0] ;
         A409EmprTel = P08OW6_A409EmprTel[0] ;
         n409EmprTel = P08OW6_n409EmprTel[0] ;
         A395EmprCif = P08OW6_A395EmprCif[0] ;
         n395EmprCif = P08OW6_n395EmprCif[0] ;
         A403EmprCpo = P08OW6_A403EmprCpo[0] ;
         n403EmprCpo = P08OW6_n403EmprCpo[0] ;
         A404EmprDir = P08OW6_A404EmprDir[0] ;
         n404EmprDir = P08OW6_n404EmprDir[0] ;
         A407EmprNom = P08OW6_A407EmprNom[0] ;
         n407EmprNom = P08OW6_n407EmprNom[0] ;
         A396EmprCod = P08OW6_A396EmprCod[0] ;
         A588IvaPor = P08OW6_A588IvaPor[0] ;
         n588IvaPor = P08OW6_n588IvaPor[0] ;
         A954IvaDsc = P08OW6_A954IvaDsc[0] ;
         n954IvaDsc = P08OW6_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08OW6_A408EmprPob[0], A408EmprPob) == 0 ) )
         {
            brk8OW9 = false ;
            A396EmprCod = P08OW6_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A408EmprPob)==0) )
         {
            AV64Option = A408EmprPob ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW9 )
         {
            brk8OW9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADEMPRCIFOPTIONS' Routine */
      returnInSub = false ;
      AV20TFEmprCif = AV60SearchTxt ;
      AV21TFEmprCif_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW7 */
      pr_default.execute(5, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8OW11 = false ;
         A395EmprCif = P08OW7_A395EmprCif[0] ;
         n395EmprCif = P08OW7_n395EmprCif[0] ;
         A588IvaPor = P08OW7_A588IvaPor[0] ;
         n588IvaPor = P08OW7_n588IvaPor[0] ;
         A954IvaDsc = P08OW7_A954IvaDsc[0] ;
         n954IvaDsc = P08OW7_n954IvaDsc[0] ;
         A953IvaCod = P08OW7_A953IvaCod[0] ;
         n953IvaCod = P08OW7_n953IvaCod[0] ;
         A405EmprFax = P08OW7_A405EmprFax[0] ;
         n405EmprFax = P08OW7_n405EmprFax[0] ;
         A409EmprTel = P08OW7_A409EmprTel[0] ;
         n409EmprTel = P08OW7_n409EmprTel[0] ;
         A408EmprPob = P08OW7_A408EmprPob[0] ;
         n408EmprPob = P08OW7_n408EmprPob[0] ;
         A403EmprCpo = P08OW7_A403EmprCpo[0] ;
         n403EmprCpo = P08OW7_n403EmprCpo[0] ;
         A404EmprDir = P08OW7_A404EmprDir[0] ;
         n404EmprDir = P08OW7_n404EmprDir[0] ;
         A407EmprNom = P08OW7_A407EmprNom[0] ;
         n407EmprNom = P08OW7_n407EmprNom[0] ;
         A396EmprCod = P08OW7_A396EmprCod[0] ;
         A588IvaPor = P08OW7_A588IvaPor[0] ;
         n588IvaPor = P08OW7_n588IvaPor[0] ;
         A954IvaDsc = P08OW7_A954IvaDsc[0] ;
         n954IvaDsc = P08OW7_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08OW7_A395EmprCif[0], A395EmprCif) == 0 ) )
         {
            brk8OW11 = false ;
            A396EmprCod = P08OW7_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A395EmprCif)==0) )
         {
            AV64Option = A395EmprCif ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW11 )
         {
            brk8OW11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADEMPRTELOPTIONS' Routine */
      returnInSub = false ;
      AV22TFEmprTel = AV60SearchTxt ;
      AV23TFEmprTel_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW8 */
      pr_default.execute(6, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8OW13 = false ;
         A409EmprTel = P08OW8_A409EmprTel[0] ;
         n409EmprTel = P08OW8_n409EmprTel[0] ;
         A588IvaPor = P08OW8_A588IvaPor[0] ;
         n588IvaPor = P08OW8_n588IvaPor[0] ;
         A954IvaDsc = P08OW8_A954IvaDsc[0] ;
         n954IvaDsc = P08OW8_n954IvaDsc[0] ;
         A953IvaCod = P08OW8_A953IvaCod[0] ;
         n953IvaCod = P08OW8_n953IvaCod[0] ;
         A405EmprFax = P08OW8_A405EmprFax[0] ;
         n405EmprFax = P08OW8_n405EmprFax[0] ;
         A395EmprCif = P08OW8_A395EmprCif[0] ;
         n395EmprCif = P08OW8_n395EmprCif[0] ;
         A408EmprPob = P08OW8_A408EmprPob[0] ;
         n408EmprPob = P08OW8_n408EmprPob[0] ;
         A403EmprCpo = P08OW8_A403EmprCpo[0] ;
         n403EmprCpo = P08OW8_n403EmprCpo[0] ;
         A404EmprDir = P08OW8_A404EmprDir[0] ;
         n404EmprDir = P08OW8_n404EmprDir[0] ;
         A407EmprNom = P08OW8_A407EmprNom[0] ;
         n407EmprNom = P08OW8_n407EmprNom[0] ;
         A396EmprCod = P08OW8_A396EmprCod[0] ;
         A588IvaPor = P08OW8_A588IvaPor[0] ;
         n588IvaPor = P08OW8_n588IvaPor[0] ;
         A954IvaDsc = P08OW8_A954IvaDsc[0] ;
         n954IvaDsc = P08OW8_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08OW8_A409EmprTel[0], A409EmprTel) == 0 ) )
         {
            brk8OW13 = false ;
            A396EmprCod = P08OW8_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW13 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A409EmprTel)==0) )
         {
            AV64Option = A409EmprTel ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW13 )
         {
            brk8OW13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADEMPRFAXOPTIONS' Routine */
      returnInSub = false ;
      AV24TFEmprFax = AV60SearchTxt ;
      AV25TFEmprFax_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW9 */
      pr_default.execute(7, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8OW15 = false ;
         A405EmprFax = P08OW9_A405EmprFax[0] ;
         n405EmprFax = P08OW9_n405EmprFax[0] ;
         A588IvaPor = P08OW9_A588IvaPor[0] ;
         n588IvaPor = P08OW9_n588IvaPor[0] ;
         A954IvaDsc = P08OW9_A954IvaDsc[0] ;
         n954IvaDsc = P08OW9_n954IvaDsc[0] ;
         A953IvaCod = P08OW9_A953IvaCod[0] ;
         n953IvaCod = P08OW9_n953IvaCod[0] ;
         A409EmprTel = P08OW9_A409EmprTel[0] ;
         n409EmprTel = P08OW9_n409EmprTel[0] ;
         A395EmprCif = P08OW9_A395EmprCif[0] ;
         n395EmprCif = P08OW9_n395EmprCif[0] ;
         A408EmprPob = P08OW9_A408EmprPob[0] ;
         n408EmprPob = P08OW9_n408EmprPob[0] ;
         A403EmprCpo = P08OW9_A403EmprCpo[0] ;
         n403EmprCpo = P08OW9_n403EmprCpo[0] ;
         A404EmprDir = P08OW9_A404EmprDir[0] ;
         n404EmprDir = P08OW9_n404EmprDir[0] ;
         A407EmprNom = P08OW9_A407EmprNom[0] ;
         n407EmprNom = P08OW9_n407EmprNom[0] ;
         A396EmprCod = P08OW9_A396EmprCod[0] ;
         A588IvaPor = P08OW9_A588IvaPor[0] ;
         n588IvaPor = P08OW9_n588IvaPor[0] ;
         A954IvaDsc = P08OW9_A954IvaDsc[0] ;
         n954IvaDsc = P08OW9_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08OW9_A405EmprFax[0], A405EmprFax) == 0 ) )
         {
            brk8OW15 = false ;
            A396EmprCod = P08OW9_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW15 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A405EmprFax)==0) )
         {
            AV64Option = A405EmprFax ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW15 )
         {
            brk8OW15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADIVACODOPTIONS' Routine */
      returnInSub = false ;
      AV26TFIvaCod = AV60SearchTxt ;
      AV27TFIvaCod_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW10 */
      pr_default.execute(8, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8OW17 = false ;
         A953IvaCod = P08OW10_A953IvaCod[0] ;
         n953IvaCod = P08OW10_n953IvaCod[0] ;
         A588IvaPor = P08OW10_A588IvaPor[0] ;
         n588IvaPor = P08OW10_n588IvaPor[0] ;
         A954IvaDsc = P08OW10_A954IvaDsc[0] ;
         n954IvaDsc = P08OW10_n954IvaDsc[0] ;
         A405EmprFax = P08OW10_A405EmprFax[0] ;
         n405EmprFax = P08OW10_n405EmprFax[0] ;
         A409EmprTel = P08OW10_A409EmprTel[0] ;
         n409EmprTel = P08OW10_n409EmprTel[0] ;
         A395EmprCif = P08OW10_A395EmprCif[0] ;
         n395EmprCif = P08OW10_n395EmprCif[0] ;
         A408EmprPob = P08OW10_A408EmprPob[0] ;
         n408EmprPob = P08OW10_n408EmprPob[0] ;
         A403EmprCpo = P08OW10_A403EmprCpo[0] ;
         n403EmprCpo = P08OW10_n403EmprCpo[0] ;
         A404EmprDir = P08OW10_A404EmprDir[0] ;
         n404EmprDir = P08OW10_n404EmprDir[0] ;
         A407EmprNom = P08OW10_A407EmprNom[0] ;
         n407EmprNom = P08OW10_n407EmprNom[0] ;
         A396EmprCod = P08OW10_A396EmprCod[0] ;
         A588IvaPor = P08OW10_A588IvaPor[0] ;
         n588IvaPor = P08OW10_n588IvaPor[0] ;
         A954IvaDsc = P08OW10_A954IvaDsc[0] ;
         n954IvaDsc = P08OW10_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08OW10_A953IvaCod[0], A953IvaCod) == 0 ) )
         {
            brk8OW17 = false ;
            A396EmprCod = P08OW10_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW17 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A953IvaCod)==0) )
         {
            AV64Option = A953IvaCod ;
            AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A953IvaCod, "@!"))) ;
            AV65Options.add(AV64Option, 0);
            AV68OptionsDesc.add(AV67OptionDesc, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW17 )
         {
            brk8OW17 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADIVADSCOPTIONS' Routine */
      returnInSub = false ;
      AV28TFIvaDsc = AV60SearchTxt ;
      AV29TFIvaDsc_Sel = "" ;
      AV97Tempreswwds_1_filterfulltext = AV92FilterFullText ;
      AV98Tempreswwds_2_tfemprcod = AV10TFEmprCod ;
      AV99Tempreswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV100Tempreswwds_4_tfemprnom = AV12TFEmprNom ;
      AV101Tempreswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV102Tempreswwds_6_tfemprdir = AV14TFEmprDir ;
      AV103Tempreswwds_7_tfemprdir_sel = AV15TFEmprDir_Sel ;
      AV104Tempreswwds_8_tfemprcpo = AV16TFEmprCpo ;
      AV105Tempreswwds_9_tfemprcpo_sel = AV17TFEmprCpo_Sel ;
      AV106Tempreswwds_10_tfemprpob = AV18TFEmprPob ;
      AV107Tempreswwds_11_tfemprpob_sel = AV19TFEmprPob_Sel ;
      AV108Tempreswwds_12_tfemprcif = AV20TFEmprCif ;
      AV109Tempreswwds_13_tfemprcif_sel = AV21TFEmprCif_Sel ;
      AV110Tempreswwds_14_tfemprtel = AV22TFEmprTel ;
      AV111Tempreswwds_15_tfemprtel_sel = AV23TFEmprTel_Sel ;
      AV112Tempreswwds_16_tfemprfax = AV24TFEmprFax ;
      AV113Tempreswwds_17_tfemprfax_sel = AV25TFEmprFax_Sel ;
      AV114Tempreswwds_18_tfivacod = AV26TFIvaCod ;
      AV115Tempreswwds_19_tfivacod_sel = AV27TFIvaCod_Sel ;
      AV116Tempreswwds_20_tfivadsc = AV28TFIvaDsc ;
      AV117Tempreswwds_21_tfivadsc_sel = AV29TFIvaDsc_Sel ;
      AV118Tempreswwds_22_tfivapor = AV30TFIvaPor ;
      AV119Tempreswwds_23_tfivapor_to = AV31TFIvaPor_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV97Tempreswwds_1_filterfulltext ,
                                           AV99Tempreswwds_3_tfemprcod_sel ,
                                           AV98Tempreswwds_2_tfemprcod ,
                                           AV101Tempreswwds_5_tfemprnom_sel ,
                                           AV100Tempreswwds_4_tfemprnom ,
                                           AV103Tempreswwds_7_tfemprdir_sel ,
                                           AV102Tempreswwds_6_tfemprdir ,
                                           AV105Tempreswwds_9_tfemprcpo_sel ,
                                           AV104Tempreswwds_8_tfemprcpo ,
                                           AV107Tempreswwds_11_tfemprpob_sel ,
                                           AV106Tempreswwds_10_tfemprpob ,
                                           AV109Tempreswwds_13_tfemprcif_sel ,
                                           AV108Tempreswwds_12_tfemprcif ,
                                           AV111Tempreswwds_15_tfemprtel_sel ,
                                           AV110Tempreswwds_14_tfemprtel ,
                                           AV113Tempreswwds_17_tfemprfax_sel ,
                                           AV112Tempreswwds_16_tfemprfax ,
                                           AV115Tempreswwds_19_tfivacod_sel ,
                                           AV114Tempreswwds_18_tfivacod ,
                                           AV117Tempreswwds_21_tfivadsc_sel ,
                                           AV116Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV118Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV119Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV97Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Tempreswwds_1_filterfulltext), "%", "") ;
      lV98Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV98Tempreswwds_2_tfemprcod), 3, "%") ;
      lV100Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV100Tempreswwds_4_tfemprnom), 30, "%") ;
      lV102Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV102Tempreswwds_6_tfemprdir), 35, "%") ;
      lV104Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV104Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV106Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV106Tempreswwds_10_tfemprpob), 35, "%") ;
      lV108Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV108Tempreswwds_12_tfemprcif), 15, "%") ;
      lV110Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV110Tempreswwds_14_tfemprtel), 15, "%") ;
      lV112Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV112Tempreswwds_16_tfemprfax), 15, "%") ;
      lV114Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV114Tempreswwds_18_tfivacod), 3, "%") ;
      lV116Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV116Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OW11 */
      pr_default.execute(9, new Object[] {lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV97Tempreswwds_1_filterfulltext, lV98Tempreswwds_2_tfemprcod, AV99Tempreswwds_3_tfemprcod_sel, lV100Tempreswwds_4_tfemprnom, AV101Tempreswwds_5_tfemprnom_sel, lV102Tempreswwds_6_tfemprdir, AV103Tempreswwds_7_tfemprdir_sel, lV104Tempreswwds_8_tfemprcpo, AV105Tempreswwds_9_tfemprcpo_sel, lV106Tempreswwds_10_tfemprpob, AV107Tempreswwds_11_tfemprpob_sel, lV108Tempreswwds_12_tfemprcif, AV109Tempreswwds_13_tfemprcif_sel, lV110Tempreswwds_14_tfemprtel, AV111Tempreswwds_15_tfemprtel_sel, lV112Tempreswwds_16_tfemprfax, AV113Tempreswwds_17_tfemprfax_sel, lV114Tempreswwds_18_tfivacod, AV115Tempreswwds_19_tfivacod_sel, lV116Tempreswwds_20_tfivadsc, AV117Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV118Tempreswwds_22_tfivapor), Byte.valueOf(AV119Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk8OW19 = false ;
         A953IvaCod = P08OW11_A953IvaCod[0] ;
         n953IvaCod = P08OW11_n953IvaCod[0] ;
         A588IvaPor = P08OW11_A588IvaPor[0] ;
         n588IvaPor = P08OW11_n588IvaPor[0] ;
         A954IvaDsc = P08OW11_A954IvaDsc[0] ;
         n954IvaDsc = P08OW11_n954IvaDsc[0] ;
         A405EmprFax = P08OW11_A405EmprFax[0] ;
         n405EmprFax = P08OW11_n405EmprFax[0] ;
         A409EmprTel = P08OW11_A409EmprTel[0] ;
         n409EmprTel = P08OW11_n409EmprTel[0] ;
         A395EmprCif = P08OW11_A395EmprCif[0] ;
         n395EmprCif = P08OW11_n395EmprCif[0] ;
         A408EmprPob = P08OW11_A408EmprPob[0] ;
         n408EmprPob = P08OW11_n408EmprPob[0] ;
         A403EmprCpo = P08OW11_A403EmprCpo[0] ;
         n403EmprCpo = P08OW11_n403EmprCpo[0] ;
         A404EmprDir = P08OW11_A404EmprDir[0] ;
         n404EmprDir = P08OW11_n404EmprDir[0] ;
         A407EmprNom = P08OW11_A407EmprNom[0] ;
         n407EmprNom = P08OW11_n407EmprNom[0] ;
         A396EmprCod = P08OW11_A396EmprCod[0] ;
         A588IvaPor = P08OW11_A588IvaPor[0] ;
         n588IvaPor = P08OW11_n588IvaPor[0] ;
         A954IvaDsc = P08OW11_A954IvaDsc[0] ;
         n954IvaDsc = P08OW11_n954IvaDsc[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P08OW11_A953IvaCod[0], A953IvaCod) == 0 ) )
         {
            brk8OW19 = false ;
            A396EmprCod = P08OW11_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OW19 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A954IvaDsc)==0) )
         {
            AV64Option = A954IvaDsc ;
            AV63InsertIndex = 1 ;
            while ( ( AV63InsertIndex <= AV65Options.size() ) && ( GXutil.strcmp((String)AV65Options.elementAt(-1+AV63InsertIndex), AV64Option) < 0 ) )
            {
               AV63InsertIndex = (int)(AV63InsertIndex+1) ;
            }
            AV65Options.add(AV64Option, AV63InsertIndex);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), AV63InsertIndex);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OW19 )
         {
            brk8OW19 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tempreswwgetfilterdata.this.AV66OptionsJson;
      this.aP4[0] = tempreswwgetfilterdata.this.AV69OptionsDescJson;
      this.aP5[0] = tempreswwgetfilterdata.this.AV71OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66OptionsJson = "" ;
      AV69OptionsDescJson = "" ;
      AV71OptionIndexesJson = "" ;
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV73Session = httpContext.getWebSession();
      AV75GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV92FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV14TFEmprDir = "" ;
      AV15TFEmprDir_Sel = "" ;
      AV16TFEmprCpo = "" ;
      AV17TFEmprCpo_Sel = "" ;
      AV18TFEmprPob = "" ;
      AV19TFEmprPob_Sel = "" ;
      AV20TFEmprCif = "" ;
      AV21TFEmprCif_Sel = "" ;
      AV22TFEmprTel = "" ;
      AV23TFEmprTel_Sel = "" ;
      AV24TFEmprFax = "" ;
      AV25TFEmprFax_Sel = "" ;
      AV26TFIvaCod = "" ;
      AV27TFIvaCod_Sel = "" ;
      AV28TFIvaDsc = "" ;
      AV29TFIvaDsc_Sel = "" ;
      A396EmprCod = "" ;
      AV97Tempreswwds_1_filterfulltext = "" ;
      AV98Tempreswwds_2_tfemprcod = "" ;
      AV99Tempreswwds_3_tfemprcod_sel = "" ;
      AV100Tempreswwds_4_tfemprnom = "" ;
      AV101Tempreswwds_5_tfemprnom_sel = "" ;
      AV102Tempreswwds_6_tfemprdir = "" ;
      AV103Tempreswwds_7_tfemprdir_sel = "" ;
      AV104Tempreswwds_8_tfemprcpo = "" ;
      AV105Tempreswwds_9_tfemprcpo_sel = "" ;
      AV106Tempreswwds_10_tfemprpob = "" ;
      AV107Tempreswwds_11_tfemprpob_sel = "" ;
      AV108Tempreswwds_12_tfemprcif = "" ;
      AV109Tempreswwds_13_tfemprcif_sel = "" ;
      AV110Tempreswwds_14_tfemprtel = "" ;
      AV111Tempreswwds_15_tfemprtel_sel = "" ;
      AV112Tempreswwds_16_tfemprfax = "" ;
      AV113Tempreswwds_17_tfemprfax_sel = "" ;
      AV114Tempreswwds_18_tfivacod = "" ;
      AV115Tempreswwds_19_tfivacod_sel = "" ;
      AV116Tempreswwds_20_tfivadsc = "" ;
      AV117Tempreswwds_21_tfivadsc_sel = "" ;
      scmdbuf = "" ;
      lV97Tempreswwds_1_filterfulltext = "" ;
      lV98Tempreswwds_2_tfemprcod = "" ;
      lV100Tempreswwds_4_tfemprnom = "" ;
      lV102Tempreswwds_6_tfemprdir = "" ;
      lV104Tempreswwds_8_tfemprcpo = "" ;
      lV106Tempreswwds_10_tfemprpob = "" ;
      lV108Tempreswwds_12_tfemprcif = "" ;
      lV110Tempreswwds_14_tfemprtel = "" ;
      lV112Tempreswwds_16_tfemprfax = "" ;
      lV114Tempreswwds_18_tfivacod = "" ;
      lV116Tempreswwds_20_tfivadsc = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      A395EmprCif = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A953IvaCod = "" ;
      A954IvaDsc = "" ;
      P08OW2_A588IvaPor = new byte[1] ;
      P08OW2_n588IvaPor = new boolean[] {false} ;
      P08OW2_A954IvaDsc = new String[] {""} ;
      P08OW2_n954IvaDsc = new boolean[] {false} ;
      P08OW2_A953IvaCod = new String[] {""} ;
      P08OW2_n953IvaCod = new boolean[] {false} ;
      P08OW2_A405EmprFax = new String[] {""} ;
      P08OW2_n405EmprFax = new boolean[] {false} ;
      P08OW2_A409EmprTel = new String[] {""} ;
      P08OW2_n409EmprTel = new boolean[] {false} ;
      P08OW2_A395EmprCif = new String[] {""} ;
      P08OW2_n395EmprCif = new boolean[] {false} ;
      P08OW2_A408EmprPob = new String[] {""} ;
      P08OW2_n408EmprPob = new boolean[] {false} ;
      P08OW2_A403EmprCpo = new String[] {""} ;
      P08OW2_n403EmprCpo = new boolean[] {false} ;
      P08OW2_A404EmprDir = new String[] {""} ;
      P08OW2_n404EmprDir = new boolean[] {false} ;
      P08OW2_A407EmprNom = new String[] {""} ;
      P08OW2_n407EmprNom = new boolean[] {false} ;
      P08OW2_A396EmprCod = new String[] {""} ;
      AV64Option = "" ;
      AV67OptionDesc = "" ;
      P08OW3_A407EmprNom = new String[] {""} ;
      P08OW3_n407EmprNom = new boolean[] {false} ;
      P08OW3_A588IvaPor = new byte[1] ;
      P08OW3_n588IvaPor = new boolean[] {false} ;
      P08OW3_A954IvaDsc = new String[] {""} ;
      P08OW3_n954IvaDsc = new boolean[] {false} ;
      P08OW3_A953IvaCod = new String[] {""} ;
      P08OW3_n953IvaCod = new boolean[] {false} ;
      P08OW3_A405EmprFax = new String[] {""} ;
      P08OW3_n405EmprFax = new boolean[] {false} ;
      P08OW3_A409EmprTel = new String[] {""} ;
      P08OW3_n409EmprTel = new boolean[] {false} ;
      P08OW3_A395EmprCif = new String[] {""} ;
      P08OW3_n395EmprCif = new boolean[] {false} ;
      P08OW3_A408EmprPob = new String[] {""} ;
      P08OW3_n408EmprPob = new boolean[] {false} ;
      P08OW3_A403EmprCpo = new String[] {""} ;
      P08OW3_n403EmprCpo = new boolean[] {false} ;
      P08OW3_A404EmprDir = new String[] {""} ;
      P08OW3_n404EmprDir = new boolean[] {false} ;
      P08OW3_A396EmprCod = new String[] {""} ;
      P08OW4_A404EmprDir = new String[] {""} ;
      P08OW4_n404EmprDir = new boolean[] {false} ;
      P08OW4_A588IvaPor = new byte[1] ;
      P08OW4_n588IvaPor = new boolean[] {false} ;
      P08OW4_A954IvaDsc = new String[] {""} ;
      P08OW4_n954IvaDsc = new boolean[] {false} ;
      P08OW4_A953IvaCod = new String[] {""} ;
      P08OW4_n953IvaCod = new boolean[] {false} ;
      P08OW4_A405EmprFax = new String[] {""} ;
      P08OW4_n405EmprFax = new boolean[] {false} ;
      P08OW4_A409EmprTel = new String[] {""} ;
      P08OW4_n409EmprTel = new boolean[] {false} ;
      P08OW4_A395EmprCif = new String[] {""} ;
      P08OW4_n395EmprCif = new boolean[] {false} ;
      P08OW4_A408EmprPob = new String[] {""} ;
      P08OW4_n408EmprPob = new boolean[] {false} ;
      P08OW4_A403EmprCpo = new String[] {""} ;
      P08OW4_n403EmprCpo = new boolean[] {false} ;
      P08OW4_A407EmprNom = new String[] {""} ;
      P08OW4_n407EmprNom = new boolean[] {false} ;
      P08OW4_A396EmprCod = new String[] {""} ;
      P08OW5_A403EmprCpo = new String[] {""} ;
      P08OW5_n403EmprCpo = new boolean[] {false} ;
      P08OW5_A588IvaPor = new byte[1] ;
      P08OW5_n588IvaPor = new boolean[] {false} ;
      P08OW5_A954IvaDsc = new String[] {""} ;
      P08OW5_n954IvaDsc = new boolean[] {false} ;
      P08OW5_A953IvaCod = new String[] {""} ;
      P08OW5_n953IvaCod = new boolean[] {false} ;
      P08OW5_A405EmprFax = new String[] {""} ;
      P08OW5_n405EmprFax = new boolean[] {false} ;
      P08OW5_A409EmprTel = new String[] {""} ;
      P08OW5_n409EmprTel = new boolean[] {false} ;
      P08OW5_A395EmprCif = new String[] {""} ;
      P08OW5_n395EmprCif = new boolean[] {false} ;
      P08OW5_A408EmprPob = new String[] {""} ;
      P08OW5_n408EmprPob = new boolean[] {false} ;
      P08OW5_A404EmprDir = new String[] {""} ;
      P08OW5_n404EmprDir = new boolean[] {false} ;
      P08OW5_A407EmprNom = new String[] {""} ;
      P08OW5_n407EmprNom = new boolean[] {false} ;
      P08OW5_A396EmprCod = new String[] {""} ;
      P08OW6_A408EmprPob = new String[] {""} ;
      P08OW6_n408EmprPob = new boolean[] {false} ;
      P08OW6_A588IvaPor = new byte[1] ;
      P08OW6_n588IvaPor = new boolean[] {false} ;
      P08OW6_A954IvaDsc = new String[] {""} ;
      P08OW6_n954IvaDsc = new boolean[] {false} ;
      P08OW6_A953IvaCod = new String[] {""} ;
      P08OW6_n953IvaCod = new boolean[] {false} ;
      P08OW6_A405EmprFax = new String[] {""} ;
      P08OW6_n405EmprFax = new boolean[] {false} ;
      P08OW6_A409EmprTel = new String[] {""} ;
      P08OW6_n409EmprTel = new boolean[] {false} ;
      P08OW6_A395EmprCif = new String[] {""} ;
      P08OW6_n395EmprCif = new boolean[] {false} ;
      P08OW6_A403EmprCpo = new String[] {""} ;
      P08OW6_n403EmprCpo = new boolean[] {false} ;
      P08OW6_A404EmprDir = new String[] {""} ;
      P08OW6_n404EmprDir = new boolean[] {false} ;
      P08OW6_A407EmprNom = new String[] {""} ;
      P08OW6_n407EmprNom = new boolean[] {false} ;
      P08OW6_A396EmprCod = new String[] {""} ;
      P08OW7_A395EmprCif = new String[] {""} ;
      P08OW7_n395EmprCif = new boolean[] {false} ;
      P08OW7_A588IvaPor = new byte[1] ;
      P08OW7_n588IvaPor = new boolean[] {false} ;
      P08OW7_A954IvaDsc = new String[] {""} ;
      P08OW7_n954IvaDsc = new boolean[] {false} ;
      P08OW7_A953IvaCod = new String[] {""} ;
      P08OW7_n953IvaCod = new boolean[] {false} ;
      P08OW7_A405EmprFax = new String[] {""} ;
      P08OW7_n405EmprFax = new boolean[] {false} ;
      P08OW7_A409EmprTel = new String[] {""} ;
      P08OW7_n409EmprTel = new boolean[] {false} ;
      P08OW7_A408EmprPob = new String[] {""} ;
      P08OW7_n408EmprPob = new boolean[] {false} ;
      P08OW7_A403EmprCpo = new String[] {""} ;
      P08OW7_n403EmprCpo = new boolean[] {false} ;
      P08OW7_A404EmprDir = new String[] {""} ;
      P08OW7_n404EmprDir = new boolean[] {false} ;
      P08OW7_A407EmprNom = new String[] {""} ;
      P08OW7_n407EmprNom = new boolean[] {false} ;
      P08OW7_A396EmprCod = new String[] {""} ;
      P08OW8_A409EmprTel = new String[] {""} ;
      P08OW8_n409EmprTel = new boolean[] {false} ;
      P08OW8_A588IvaPor = new byte[1] ;
      P08OW8_n588IvaPor = new boolean[] {false} ;
      P08OW8_A954IvaDsc = new String[] {""} ;
      P08OW8_n954IvaDsc = new boolean[] {false} ;
      P08OW8_A953IvaCod = new String[] {""} ;
      P08OW8_n953IvaCod = new boolean[] {false} ;
      P08OW8_A405EmprFax = new String[] {""} ;
      P08OW8_n405EmprFax = new boolean[] {false} ;
      P08OW8_A395EmprCif = new String[] {""} ;
      P08OW8_n395EmprCif = new boolean[] {false} ;
      P08OW8_A408EmprPob = new String[] {""} ;
      P08OW8_n408EmprPob = new boolean[] {false} ;
      P08OW8_A403EmprCpo = new String[] {""} ;
      P08OW8_n403EmprCpo = new boolean[] {false} ;
      P08OW8_A404EmprDir = new String[] {""} ;
      P08OW8_n404EmprDir = new boolean[] {false} ;
      P08OW8_A407EmprNom = new String[] {""} ;
      P08OW8_n407EmprNom = new boolean[] {false} ;
      P08OW8_A396EmprCod = new String[] {""} ;
      P08OW9_A405EmprFax = new String[] {""} ;
      P08OW9_n405EmprFax = new boolean[] {false} ;
      P08OW9_A588IvaPor = new byte[1] ;
      P08OW9_n588IvaPor = new boolean[] {false} ;
      P08OW9_A954IvaDsc = new String[] {""} ;
      P08OW9_n954IvaDsc = new boolean[] {false} ;
      P08OW9_A953IvaCod = new String[] {""} ;
      P08OW9_n953IvaCod = new boolean[] {false} ;
      P08OW9_A409EmprTel = new String[] {""} ;
      P08OW9_n409EmprTel = new boolean[] {false} ;
      P08OW9_A395EmprCif = new String[] {""} ;
      P08OW9_n395EmprCif = new boolean[] {false} ;
      P08OW9_A408EmprPob = new String[] {""} ;
      P08OW9_n408EmprPob = new boolean[] {false} ;
      P08OW9_A403EmprCpo = new String[] {""} ;
      P08OW9_n403EmprCpo = new boolean[] {false} ;
      P08OW9_A404EmprDir = new String[] {""} ;
      P08OW9_n404EmprDir = new boolean[] {false} ;
      P08OW9_A407EmprNom = new String[] {""} ;
      P08OW9_n407EmprNom = new boolean[] {false} ;
      P08OW9_A396EmprCod = new String[] {""} ;
      P08OW10_A953IvaCod = new String[] {""} ;
      P08OW10_n953IvaCod = new boolean[] {false} ;
      P08OW10_A588IvaPor = new byte[1] ;
      P08OW10_n588IvaPor = new boolean[] {false} ;
      P08OW10_A954IvaDsc = new String[] {""} ;
      P08OW10_n954IvaDsc = new boolean[] {false} ;
      P08OW10_A405EmprFax = new String[] {""} ;
      P08OW10_n405EmprFax = new boolean[] {false} ;
      P08OW10_A409EmprTel = new String[] {""} ;
      P08OW10_n409EmprTel = new boolean[] {false} ;
      P08OW10_A395EmprCif = new String[] {""} ;
      P08OW10_n395EmprCif = new boolean[] {false} ;
      P08OW10_A408EmprPob = new String[] {""} ;
      P08OW10_n408EmprPob = new boolean[] {false} ;
      P08OW10_A403EmprCpo = new String[] {""} ;
      P08OW10_n403EmprCpo = new boolean[] {false} ;
      P08OW10_A404EmprDir = new String[] {""} ;
      P08OW10_n404EmprDir = new boolean[] {false} ;
      P08OW10_A407EmprNom = new String[] {""} ;
      P08OW10_n407EmprNom = new boolean[] {false} ;
      P08OW10_A396EmprCod = new String[] {""} ;
      P08OW11_A953IvaCod = new String[] {""} ;
      P08OW11_n953IvaCod = new boolean[] {false} ;
      P08OW11_A588IvaPor = new byte[1] ;
      P08OW11_n588IvaPor = new boolean[] {false} ;
      P08OW11_A954IvaDsc = new String[] {""} ;
      P08OW11_n954IvaDsc = new boolean[] {false} ;
      P08OW11_A405EmprFax = new String[] {""} ;
      P08OW11_n405EmprFax = new boolean[] {false} ;
      P08OW11_A409EmprTel = new String[] {""} ;
      P08OW11_n409EmprTel = new boolean[] {false} ;
      P08OW11_A395EmprCif = new String[] {""} ;
      P08OW11_n395EmprCif = new boolean[] {false} ;
      P08OW11_A408EmprPob = new String[] {""} ;
      P08OW11_n408EmprPob = new boolean[] {false} ;
      P08OW11_A403EmprCpo = new String[] {""} ;
      P08OW11_n403EmprCpo = new boolean[] {false} ;
      P08OW11_A404EmprDir = new String[] {""} ;
      P08OW11_n404EmprDir = new boolean[] {false} ;
      P08OW11_A407EmprNom = new String[] {""} ;
      P08OW11_n407EmprNom = new boolean[] {false} ;
      P08OW11_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempreswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08OW2_A588IvaPor, P08OW2_n588IvaPor, P08OW2_A954IvaDsc, P08OW2_n954IvaDsc, P08OW2_A953IvaCod, P08OW2_n953IvaCod, P08OW2_A405EmprFax, P08OW2_n405EmprFax, P08OW2_A409EmprTel, P08OW2_n409EmprTel,
            P08OW2_A395EmprCif, P08OW2_n395EmprCif, P08OW2_A408EmprPob, P08OW2_n408EmprPob, P08OW2_A403EmprCpo, P08OW2_n403EmprCpo, P08OW2_A404EmprDir, P08OW2_n404EmprDir, P08OW2_A407EmprNom, P08OW2_n407EmprNom,
            P08OW2_A396EmprCod
            }
            , new Object[] {
            P08OW3_A407EmprNom, P08OW3_n407EmprNom, P08OW3_A588IvaPor, P08OW3_n588IvaPor, P08OW3_A954IvaDsc, P08OW3_n954IvaDsc, P08OW3_A953IvaCod, P08OW3_n953IvaCod, P08OW3_A405EmprFax, P08OW3_n405EmprFax,
            P08OW3_A409EmprTel, P08OW3_n409EmprTel, P08OW3_A395EmprCif, P08OW3_n395EmprCif, P08OW3_A408EmprPob, P08OW3_n408EmprPob, P08OW3_A403EmprCpo, P08OW3_n403EmprCpo, P08OW3_A404EmprDir, P08OW3_n404EmprDir,
            P08OW3_A396EmprCod
            }
            , new Object[] {
            P08OW4_A404EmprDir, P08OW4_n404EmprDir, P08OW4_A588IvaPor, P08OW4_n588IvaPor, P08OW4_A954IvaDsc, P08OW4_n954IvaDsc, P08OW4_A953IvaCod, P08OW4_n953IvaCod, P08OW4_A405EmprFax, P08OW4_n405EmprFax,
            P08OW4_A409EmprTel, P08OW4_n409EmprTel, P08OW4_A395EmprCif, P08OW4_n395EmprCif, P08OW4_A408EmprPob, P08OW4_n408EmprPob, P08OW4_A403EmprCpo, P08OW4_n403EmprCpo, P08OW4_A407EmprNom, P08OW4_n407EmprNom,
            P08OW4_A396EmprCod
            }
            , new Object[] {
            P08OW5_A403EmprCpo, P08OW5_n403EmprCpo, P08OW5_A588IvaPor, P08OW5_n588IvaPor, P08OW5_A954IvaDsc, P08OW5_n954IvaDsc, P08OW5_A953IvaCod, P08OW5_n953IvaCod, P08OW5_A405EmprFax, P08OW5_n405EmprFax,
            P08OW5_A409EmprTel, P08OW5_n409EmprTel, P08OW5_A395EmprCif, P08OW5_n395EmprCif, P08OW5_A408EmprPob, P08OW5_n408EmprPob, P08OW5_A404EmprDir, P08OW5_n404EmprDir, P08OW5_A407EmprNom, P08OW5_n407EmprNom,
            P08OW5_A396EmprCod
            }
            , new Object[] {
            P08OW6_A408EmprPob, P08OW6_n408EmprPob, P08OW6_A588IvaPor, P08OW6_n588IvaPor, P08OW6_A954IvaDsc, P08OW6_n954IvaDsc, P08OW6_A953IvaCod, P08OW6_n953IvaCod, P08OW6_A405EmprFax, P08OW6_n405EmprFax,
            P08OW6_A409EmprTel, P08OW6_n409EmprTel, P08OW6_A395EmprCif, P08OW6_n395EmprCif, P08OW6_A403EmprCpo, P08OW6_n403EmprCpo, P08OW6_A404EmprDir, P08OW6_n404EmprDir, P08OW6_A407EmprNom, P08OW6_n407EmprNom,
            P08OW6_A396EmprCod
            }
            , new Object[] {
            P08OW7_A395EmprCif, P08OW7_n395EmprCif, P08OW7_A588IvaPor, P08OW7_n588IvaPor, P08OW7_A954IvaDsc, P08OW7_n954IvaDsc, P08OW7_A953IvaCod, P08OW7_n953IvaCod, P08OW7_A405EmprFax, P08OW7_n405EmprFax,
            P08OW7_A409EmprTel, P08OW7_n409EmprTel, P08OW7_A408EmprPob, P08OW7_n408EmprPob, P08OW7_A403EmprCpo, P08OW7_n403EmprCpo, P08OW7_A404EmprDir, P08OW7_n404EmprDir, P08OW7_A407EmprNom, P08OW7_n407EmprNom,
            P08OW7_A396EmprCod
            }
            , new Object[] {
            P08OW8_A409EmprTel, P08OW8_n409EmprTel, P08OW8_A588IvaPor, P08OW8_n588IvaPor, P08OW8_A954IvaDsc, P08OW8_n954IvaDsc, P08OW8_A953IvaCod, P08OW8_n953IvaCod, P08OW8_A405EmprFax, P08OW8_n405EmprFax,
            P08OW8_A395EmprCif, P08OW8_n395EmprCif, P08OW8_A408EmprPob, P08OW8_n408EmprPob, P08OW8_A403EmprCpo, P08OW8_n403EmprCpo, P08OW8_A404EmprDir, P08OW8_n404EmprDir, P08OW8_A407EmprNom, P08OW8_n407EmprNom,
            P08OW8_A396EmprCod
            }
            , new Object[] {
            P08OW9_A405EmprFax, P08OW9_n405EmprFax, P08OW9_A588IvaPor, P08OW9_n588IvaPor, P08OW9_A954IvaDsc, P08OW9_n954IvaDsc, P08OW9_A953IvaCod, P08OW9_n953IvaCod, P08OW9_A409EmprTel, P08OW9_n409EmprTel,
            P08OW9_A395EmprCif, P08OW9_n395EmprCif, P08OW9_A408EmprPob, P08OW9_n408EmprPob, P08OW9_A403EmprCpo, P08OW9_n403EmprCpo, P08OW9_A404EmprDir, P08OW9_n404EmprDir, P08OW9_A407EmprNom, P08OW9_n407EmprNom,
            P08OW9_A396EmprCod
            }
            , new Object[] {
            P08OW10_A953IvaCod, P08OW10_n953IvaCod, P08OW10_A588IvaPor, P08OW10_n588IvaPor, P08OW10_A954IvaDsc, P08OW10_n954IvaDsc, P08OW10_A405EmprFax, P08OW10_n405EmprFax, P08OW10_A409EmprTel, P08OW10_n409EmprTel,
            P08OW10_A395EmprCif, P08OW10_n395EmprCif, P08OW10_A408EmprPob, P08OW10_n408EmprPob, P08OW10_A403EmprCpo, P08OW10_n403EmprCpo, P08OW10_A404EmprDir, P08OW10_n404EmprDir, P08OW10_A407EmprNom, P08OW10_n407EmprNom,
            P08OW10_A396EmprCod
            }
            , new Object[] {
            P08OW11_A953IvaCod, P08OW11_n953IvaCod, P08OW11_A588IvaPor, P08OW11_n588IvaPor, P08OW11_A954IvaDsc, P08OW11_n954IvaDsc, P08OW11_A405EmprFax, P08OW11_n405EmprFax, P08OW11_A409EmprTel, P08OW11_n409EmprTel,
            P08OW11_A395EmprCif, P08OW11_n395EmprCif, P08OW11_A408EmprPob, P08OW11_n408EmprPob, P08OW11_A403EmprCpo, P08OW11_n403EmprCpo, P08OW11_A404EmprDir, P08OW11_n404EmprDir, P08OW11_A407EmprNom, P08OW11_n407EmprNom,
            P08OW11_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30TFIvaPor ;
   private byte AV31TFIvaPor_To ;
   private byte AV118Tempreswwds_22_tfivapor ;
   private byte AV119Tempreswwds_23_tfivapor_to ;
   private byte A588IvaPor ;
   private short Gx_err ;
   private int AV95GXV1 ;
   private int AV63InsertIndex ;
   private long AV72count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV14TFEmprDir ;
   private String AV15TFEmprDir_Sel ;
   private String AV16TFEmprCpo ;
   private String AV17TFEmprCpo_Sel ;
   private String AV18TFEmprPob ;
   private String AV19TFEmprPob_Sel ;
   private String AV20TFEmprCif ;
   private String AV21TFEmprCif_Sel ;
   private String AV22TFEmprTel ;
   private String AV23TFEmprTel_Sel ;
   private String AV24TFEmprFax ;
   private String AV25TFEmprFax_Sel ;
   private String AV26TFIvaCod ;
   private String AV27TFIvaCod_Sel ;
   private String AV28TFIvaDsc ;
   private String AV29TFIvaDsc_Sel ;
   private String A396EmprCod ;
   private String AV98Tempreswwds_2_tfemprcod ;
   private String AV99Tempreswwds_3_tfemprcod_sel ;
   private String AV100Tempreswwds_4_tfemprnom ;
   private String AV101Tempreswwds_5_tfemprnom_sel ;
   private String AV102Tempreswwds_6_tfemprdir ;
   private String AV103Tempreswwds_7_tfemprdir_sel ;
   private String AV104Tempreswwds_8_tfemprcpo ;
   private String AV105Tempreswwds_9_tfemprcpo_sel ;
   private String AV106Tempreswwds_10_tfemprpob ;
   private String AV107Tempreswwds_11_tfemprpob_sel ;
   private String AV108Tempreswwds_12_tfemprcif ;
   private String AV109Tempreswwds_13_tfemprcif_sel ;
   private String AV110Tempreswwds_14_tfemprtel ;
   private String AV111Tempreswwds_15_tfemprtel_sel ;
   private String AV112Tempreswwds_16_tfemprfax ;
   private String AV113Tempreswwds_17_tfemprfax_sel ;
   private String AV114Tempreswwds_18_tfivacod ;
   private String AV115Tempreswwds_19_tfivacod_sel ;
   private String AV116Tempreswwds_20_tfivadsc ;
   private String AV117Tempreswwds_21_tfivadsc_sel ;
   private String scmdbuf ;
   private String lV98Tempreswwds_2_tfemprcod ;
   private String lV100Tempreswwds_4_tfemprnom ;
   private String lV102Tempreswwds_6_tfemprdir ;
   private String lV104Tempreswwds_8_tfemprcpo ;
   private String lV106Tempreswwds_10_tfemprpob ;
   private String lV108Tempreswwds_12_tfemprcif ;
   private String lV110Tempreswwds_14_tfemprtel ;
   private String lV112Tempreswwds_16_tfemprfax ;
   private String lV114Tempreswwds_18_tfivacod ;
   private String lV116Tempreswwds_20_tfivadsc ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String A395EmprCif ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A953IvaCod ;
   private String A954IvaDsc ;
   private boolean returnInSub ;
   private boolean n588IvaPor ;
   private boolean n954IvaDsc ;
   private boolean n953IvaCod ;
   private boolean n405EmprFax ;
   private boolean n409EmprTel ;
   private boolean n395EmprCif ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private boolean brk8OW3 ;
   private boolean brk8OW5 ;
   private boolean brk8OW7 ;
   private boolean brk8OW9 ;
   private boolean brk8OW11 ;
   private boolean brk8OW13 ;
   private boolean brk8OW15 ;
   private boolean brk8OW17 ;
   private boolean brk8OW19 ;
   private String AV66OptionsJson ;
   private String AV69OptionsDescJson ;
   private String AV71OptionIndexesJson ;
   private String AV62DDOName ;
   private String AV60SearchTxt ;
   private String AV61SearchTxtTo ;
   private String AV92FilterFullText ;
   private String AV97Tempreswwds_1_filterfulltext ;
   private String lV97Tempreswwds_1_filterfulltext ;
   private String AV64Option ;
   private String AV67OptionDesc ;
   private com.genexus.webpanels.WebSession AV73Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08OW2_A588IvaPor ;
   private boolean[] P08OW2_n588IvaPor ;
   private String[] P08OW2_A954IvaDsc ;
   private boolean[] P08OW2_n954IvaDsc ;
   private String[] P08OW2_A953IvaCod ;
   private boolean[] P08OW2_n953IvaCod ;
   private String[] P08OW2_A405EmprFax ;
   private boolean[] P08OW2_n405EmprFax ;
   private String[] P08OW2_A409EmprTel ;
   private boolean[] P08OW2_n409EmprTel ;
   private String[] P08OW2_A395EmprCif ;
   private boolean[] P08OW2_n395EmprCif ;
   private String[] P08OW2_A408EmprPob ;
   private boolean[] P08OW2_n408EmprPob ;
   private String[] P08OW2_A403EmprCpo ;
   private boolean[] P08OW2_n403EmprCpo ;
   private String[] P08OW2_A404EmprDir ;
   private boolean[] P08OW2_n404EmprDir ;
   private String[] P08OW2_A407EmprNom ;
   private boolean[] P08OW2_n407EmprNom ;
   private String[] P08OW2_A396EmprCod ;
   private String[] P08OW3_A407EmprNom ;
   private boolean[] P08OW3_n407EmprNom ;
   private byte[] P08OW3_A588IvaPor ;
   private boolean[] P08OW3_n588IvaPor ;
   private String[] P08OW3_A954IvaDsc ;
   private boolean[] P08OW3_n954IvaDsc ;
   private String[] P08OW3_A953IvaCod ;
   private boolean[] P08OW3_n953IvaCod ;
   private String[] P08OW3_A405EmprFax ;
   private boolean[] P08OW3_n405EmprFax ;
   private String[] P08OW3_A409EmprTel ;
   private boolean[] P08OW3_n409EmprTel ;
   private String[] P08OW3_A395EmprCif ;
   private boolean[] P08OW3_n395EmprCif ;
   private String[] P08OW3_A408EmprPob ;
   private boolean[] P08OW3_n408EmprPob ;
   private String[] P08OW3_A403EmprCpo ;
   private boolean[] P08OW3_n403EmprCpo ;
   private String[] P08OW3_A404EmprDir ;
   private boolean[] P08OW3_n404EmprDir ;
   private String[] P08OW3_A396EmprCod ;
   private String[] P08OW4_A404EmprDir ;
   private boolean[] P08OW4_n404EmprDir ;
   private byte[] P08OW4_A588IvaPor ;
   private boolean[] P08OW4_n588IvaPor ;
   private String[] P08OW4_A954IvaDsc ;
   private boolean[] P08OW4_n954IvaDsc ;
   private String[] P08OW4_A953IvaCod ;
   private boolean[] P08OW4_n953IvaCod ;
   private String[] P08OW4_A405EmprFax ;
   private boolean[] P08OW4_n405EmprFax ;
   private String[] P08OW4_A409EmprTel ;
   private boolean[] P08OW4_n409EmprTel ;
   private String[] P08OW4_A395EmprCif ;
   private boolean[] P08OW4_n395EmprCif ;
   private String[] P08OW4_A408EmprPob ;
   private boolean[] P08OW4_n408EmprPob ;
   private String[] P08OW4_A403EmprCpo ;
   private boolean[] P08OW4_n403EmprCpo ;
   private String[] P08OW4_A407EmprNom ;
   private boolean[] P08OW4_n407EmprNom ;
   private String[] P08OW4_A396EmprCod ;
   private String[] P08OW5_A403EmprCpo ;
   private boolean[] P08OW5_n403EmprCpo ;
   private byte[] P08OW5_A588IvaPor ;
   private boolean[] P08OW5_n588IvaPor ;
   private String[] P08OW5_A954IvaDsc ;
   private boolean[] P08OW5_n954IvaDsc ;
   private String[] P08OW5_A953IvaCod ;
   private boolean[] P08OW5_n953IvaCod ;
   private String[] P08OW5_A405EmprFax ;
   private boolean[] P08OW5_n405EmprFax ;
   private String[] P08OW5_A409EmprTel ;
   private boolean[] P08OW5_n409EmprTel ;
   private String[] P08OW5_A395EmprCif ;
   private boolean[] P08OW5_n395EmprCif ;
   private String[] P08OW5_A408EmprPob ;
   private boolean[] P08OW5_n408EmprPob ;
   private String[] P08OW5_A404EmprDir ;
   private boolean[] P08OW5_n404EmprDir ;
   private String[] P08OW5_A407EmprNom ;
   private boolean[] P08OW5_n407EmprNom ;
   private String[] P08OW5_A396EmprCod ;
   private String[] P08OW6_A408EmprPob ;
   private boolean[] P08OW6_n408EmprPob ;
   private byte[] P08OW6_A588IvaPor ;
   private boolean[] P08OW6_n588IvaPor ;
   private String[] P08OW6_A954IvaDsc ;
   private boolean[] P08OW6_n954IvaDsc ;
   private String[] P08OW6_A953IvaCod ;
   private boolean[] P08OW6_n953IvaCod ;
   private String[] P08OW6_A405EmprFax ;
   private boolean[] P08OW6_n405EmprFax ;
   private String[] P08OW6_A409EmprTel ;
   private boolean[] P08OW6_n409EmprTel ;
   private String[] P08OW6_A395EmprCif ;
   private boolean[] P08OW6_n395EmprCif ;
   private String[] P08OW6_A403EmprCpo ;
   private boolean[] P08OW6_n403EmprCpo ;
   private String[] P08OW6_A404EmprDir ;
   private boolean[] P08OW6_n404EmprDir ;
   private String[] P08OW6_A407EmprNom ;
   private boolean[] P08OW6_n407EmprNom ;
   private String[] P08OW6_A396EmprCod ;
   private String[] P08OW7_A395EmprCif ;
   private boolean[] P08OW7_n395EmprCif ;
   private byte[] P08OW7_A588IvaPor ;
   private boolean[] P08OW7_n588IvaPor ;
   private String[] P08OW7_A954IvaDsc ;
   private boolean[] P08OW7_n954IvaDsc ;
   private String[] P08OW7_A953IvaCod ;
   private boolean[] P08OW7_n953IvaCod ;
   private String[] P08OW7_A405EmprFax ;
   private boolean[] P08OW7_n405EmprFax ;
   private String[] P08OW7_A409EmprTel ;
   private boolean[] P08OW7_n409EmprTel ;
   private String[] P08OW7_A408EmprPob ;
   private boolean[] P08OW7_n408EmprPob ;
   private String[] P08OW7_A403EmprCpo ;
   private boolean[] P08OW7_n403EmprCpo ;
   private String[] P08OW7_A404EmprDir ;
   private boolean[] P08OW7_n404EmprDir ;
   private String[] P08OW7_A407EmprNom ;
   private boolean[] P08OW7_n407EmprNom ;
   private String[] P08OW7_A396EmprCod ;
   private String[] P08OW8_A409EmprTel ;
   private boolean[] P08OW8_n409EmprTel ;
   private byte[] P08OW8_A588IvaPor ;
   private boolean[] P08OW8_n588IvaPor ;
   private String[] P08OW8_A954IvaDsc ;
   private boolean[] P08OW8_n954IvaDsc ;
   private String[] P08OW8_A953IvaCod ;
   private boolean[] P08OW8_n953IvaCod ;
   private String[] P08OW8_A405EmprFax ;
   private boolean[] P08OW8_n405EmprFax ;
   private String[] P08OW8_A395EmprCif ;
   private boolean[] P08OW8_n395EmprCif ;
   private String[] P08OW8_A408EmprPob ;
   private boolean[] P08OW8_n408EmprPob ;
   private String[] P08OW8_A403EmprCpo ;
   private boolean[] P08OW8_n403EmprCpo ;
   private String[] P08OW8_A404EmprDir ;
   private boolean[] P08OW8_n404EmprDir ;
   private String[] P08OW8_A407EmprNom ;
   private boolean[] P08OW8_n407EmprNom ;
   private String[] P08OW8_A396EmprCod ;
   private String[] P08OW9_A405EmprFax ;
   private boolean[] P08OW9_n405EmprFax ;
   private byte[] P08OW9_A588IvaPor ;
   private boolean[] P08OW9_n588IvaPor ;
   private String[] P08OW9_A954IvaDsc ;
   private boolean[] P08OW9_n954IvaDsc ;
   private String[] P08OW9_A953IvaCod ;
   private boolean[] P08OW9_n953IvaCod ;
   private String[] P08OW9_A409EmprTel ;
   private boolean[] P08OW9_n409EmprTel ;
   private String[] P08OW9_A395EmprCif ;
   private boolean[] P08OW9_n395EmprCif ;
   private String[] P08OW9_A408EmprPob ;
   private boolean[] P08OW9_n408EmprPob ;
   private String[] P08OW9_A403EmprCpo ;
   private boolean[] P08OW9_n403EmprCpo ;
   private String[] P08OW9_A404EmprDir ;
   private boolean[] P08OW9_n404EmprDir ;
   private String[] P08OW9_A407EmprNom ;
   private boolean[] P08OW9_n407EmprNom ;
   private String[] P08OW9_A396EmprCod ;
   private String[] P08OW10_A953IvaCod ;
   private boolean[] P08OW10_n953IvaCod ;
   private byte[] P08OW10_A588IvaPor ;
   private boolean[] P08OW10_n588IvaPor ;
   private String[] P08OW10_A954IvaDsc ;
   private boolean[] P08OW10_n954IvaDsc ;
   private String[] P08OW10_A405EmprFax ;
   private boolean[] P08OW10_n405EmprFax ;
   private String[] P08OW10_A409EmprTel ;
   private boolean[] P08OW10_n409EmprTel ;
   private String[] P08OW10_A395EmprCif ;
   private boolean[] P08OW10_n395EmprCif ;
   private String[] P08OW10_A408EmprPob ;
   private boolean[] P08OW10_n408EmprPob ;
   private String[] P08OW10_A403EmprCpo ;
   private boolean[] P08OW10_n403EmprCpo ;
   private String[] P08OW10_A404EmprDir ;
   private boolean[] P08OW10_n404EmprDir ;
   private String[] P08OW10_A407EmprNom ;
   private boolean[] P08OW10_n407EmprNom ;
   private String[] P08OW10_A396EmprCod ;
   private String[] P08OW11_A953IvaCod ;
   private boolean[] P08OW11_n953IvaCod ;
   private byte[] P08OW11_A588IvaPor ;
   private boolean[] P08OW11_n588IvaPor ;
   private String[] P08OW11_A954IvaDsc ;
   private boolean[] P08OW11_n954IvaDsc ;
   private String[] P08OW11_A405EmprFax ;
   private boolean[] P08OW11_n405EmprFax ;
   private String[] P08OW11_A409EmprTel ;
   private boolean[] P08OW11_n409EmprTel ;
   private String[] P08OW11_A395EmprCif ;
   private boolean[] P08OW11_n395EmprCif ;
   private String[] P08OW11_A408EmprPob ;
   private boolean[] P08OW11_n408EmprPob ;
   private String[] P08OW11_A403EmprCpo ;
   private boolean[] P08OW11_n403EmprCpo ;
   private String[] P08OW11_A404EmprDir ;
   private boolean[] P08OW11_n404EmprDir ;
   private String[] P08OW11_A407EmprNom ;
   private boolean[] P08OW11_n407EmprNom ;
   private String[] P08OW11_A396EmprCod ;
   private GXSimpleCollection<String> AV65Options ;
   private GXSimpleCollection<String> AV68OptionsDesc ;
   private GXSimpleCollection<String> AV70OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV75GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV76GridStateFilterValue ;
}

final  class tempreswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS IvaPor, NULL AS IvaDsc, NULL AS IvaCod, NULL AS EmprFax, NULL AS EmprTel, NULL AS EmprCif, NULL AS EmprPob, NULL AS EmprCpo, NULL AS EmprDir," ;
      scmdbuf += " NULL AS EmprNom, EmprCod FROM ( SELECT T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod" ;
      scmdbuf += " FROM (TXPEMPRES T1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08OW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprNom, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08OW4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprDir, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprDir" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08OW5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCpo, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCpo" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08OW6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprPob, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprPob" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08OW7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[33];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCif, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCif" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08OW8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprTel, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprTel" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08OW9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV97Tempreswwds_1_filterfulltext ,
                                          String AV99Tempreswwds_3_tfemprcod_sel ,
                                          String AV98Tempreswwds_2_tfemprcod ,
                                          String AV101Tempreswwds_5_tfemprnom_sel ,
                                          String AV100Tempreswwds_4_tfemprnom ,
                                          String AV103Tempreswwds_7_tfemprdir_sel ,
                                          String AV102Tempreswwds_6_tfemprdir ,
                                          String AV105Tempreswwds_9_tfemprcpo_sel ,
                                          String AV104Tempreswwds_8_tfemprcpo ,
                                          String AV107Tempreswwds_11_tfemprpob_sel ,
                                          String AV106Tempreswwds_10_tfemprpob ,
                                          String AV109Tempreswwds_13_tfemprcif_sel ,
                                          String AV108Tempreswwds_12_tfemprcif ,
                                          String AV111Tempreswwds_15_tfemprtel_sel ,
                                          String AV110Tempreswwds_14_tfemprtel ,
                                          String AV113Tempreswwds_17_tfemprfax_sel ,
                                          String AV112Tempreswwds_16_tfemprfax ,
                                          String AV115Tempreswwds_19_tfivacod_sel ,
                                          String AV114Tempreswwds_18_tfivacod ,
                                          String AV117Tempreswwds_21_tfivadsc_sel ,
                                          String AV116Tempreswwds_20_tfivadsc ,
                                          byte AV118Tempreswwds_22_tfivapor ,
                                          byte AV119Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[33];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprFax, T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
         GXv_int16[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprFax" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08OW10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV97Tempreswwds_1_filterfulltext ,
                                           String AV99Tempreswwds_3_tfemprcod_sel ,
                                           String AV98Tempreswwds_2_tfemprcod ,
                                           String AV101Tempreswwds_5_tfemprnom_sel ,
                                           String AV100Tempreswwds_4_tfemprnom ,
                                           String AV103Tempreswwds_7_tfemprdir_sel ,
                                           String AV102Tempreswwds_6_tfemprdir ,
                                           String AV105Tempreswwds_9_tfemprcpo_sel ,
                                           String AV104Tempreswwds_8_tfemprcpo ,
                                           String AV107Tempreswwds_11_tfemprpob_sel ,
                                           String AV106Tempreswwds_10_tfemprpob ,
                                           String AV109Tempreswwds_13_tfemprcif_sel ,
                                           String AV108Tempreswwds_12_tfemprcif ,
                                           String AV111Tempreswwds_15_tfemprtel_sel ,
                                           String AV110Tempreswwds_14_tfemprtel ,
                                           String AV113Tempreswwds_17_tfemprfax_sel ,
                                           String AV112Tempreswwds_16_tfemprfax ,
                                           String AV115Tempreswwds_19_tfivacod_sel ,
                                           String AV114Tempreswwds_18_tfivacod ,
                                           String AV117Tempreswwds_21_tfivadsc_sel ,
                                           String AV116Tempreswwds_20_tfivadsc ,
                                           byte AV118Tempreswwds_22_tfivapor ,
                                           byte AV119Tempreswwds_23_tfivapor_to ,
                                           String A396EmprCod ,
                                           String A407EmprNom ,
                                           String A404EmprDir ,
                                           String A403EmprCpo ,
                                           String A408EmprPob ,
                                           String A395EmprCif ,
                                           String A409EmprTel ,
                                           String A405EmprFax ,
                                           String A953IvaCod ,
                                           String A954IvaDsc ,
                                           byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[33];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.IvaCod, T2.IvaPor, T2.IvaDsc, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
         GXv_int18[9] = (byte)(1) ;
         GXv_int18[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.IvaCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P08OW11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV97Tempreswwds_1_filterfulltext ,
                                           String AV99Tempreswwds_3_tfemprcod_sel ,
                                           String AV98Tempreswwds_2_tfemprcod ,
                                           String AV101Tempreswwds_5_tfemprnom_sel ,
                                           String AV100Tempreswwds_4_tfemprnom ,
                                           String AV103Tempreswwds_7_tfemprdir_sel ,
                                           String AV102Tempreswwds_6_tfemprdir ,
                                           String AV105Tempreswwds_9_tfemprcpo_sel ,
                                           String AV104Tempreswwds_8_tfemprcpo ,
                                           String AV107Tempreswwds_11_tfemprpob_sel ,
                                           String AV106Tempreswwds_10_tfemprpob ,
                                           String AV109Tempreswwds_13_tfemprcif_sel ,
                                           String AV108Tempreswwds_12_tfemprcif ,
                                           String AV111Tempreswwds_15_tfemprtel_sel ,
                                           String AV110Tempreswwds_14_tfemprtel ,
                                           String AV113Tempreswwds_17_tfemprfax_sel ,
                                           String AV112Tempreswwds_16_tfemprfax ,
                                           String AV115Tempreswwds_19_tfivacod_sel ,
                                           String AV114Tempreswwds_18_tfivacod ,
                                           String AV117Tempreswwds_21_tfivadsc_sel ,
                                           String AV116Tempreswwds_20_tfivadsc ,
                                           byte AV118Tempreswwds_22_tfivapor ,
                                           byte AV119Tempreswwds_23_tfivapor_to ,
                                           String A396EmprCod ,
                                           String A407EmprNom ,
                                           String A404EmprDir ,
                                           String A403EmprCpo ,
                                           String A408EmprPob ,
                                           String A395EmprCif ,
                                           String A409EmprTel ,
                                           String A405EmprFax ,
                                           String A953IvaCod ,
                                           String A954IvaDsc ,
                                           byte A588IvaPor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[33];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.IvaCod, T2.IvaPor, T2.IvaDsc, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV97Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
         GXv_int20[1] = (byte)(1) ;
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV102Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV104Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV106Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV110Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV112Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.IvaCod" ;
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
                  return conditional_P08OW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 1 :
                  return conditional_P08OW3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 2 :
                  return conditional_P08OW4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 3 :
                  return conditional_P08OW5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 4 :
                  return conditional_P08OW6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 5 :
                  return conditional_P08OW7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 6 :
                  return conditional_P08OW8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 7 :
                  return conditional_P08OW9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 8 :
                  return conditional_P08OW10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 9 :
                  return conditional_P08OW11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OW11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 35);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 7);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 35);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 35);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 7);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 7);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 35);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
            case 7 :
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
            case 8 :
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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
            case 9 :
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
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

