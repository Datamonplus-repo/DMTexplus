package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprofsawwgetfilterdata extends GXProcedure
{
   public tprofsawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprofsawwgetfilterdata.class ), "" );
   }

   public tprofsawwgetfilterdata( int remoteHandle ,
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
      tprofsawwgetfilterdata.this.aP5 = new String[] {""};
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
      tprofsawwgetfilterdata.this.AV40DDOName = aP0;
      tprofsawwgetfilterdata.this.AV41SearchTxt = aP1;
      tprofsawwgetfilterdata.this.AV42SearchTxtTo = aP2;
      tprofsawwgetfilterdata.this.aP3 = aP3;
      tprofsawwgetfilterdata.this.aP4 = aP4;
      tprofsawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRODSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSC2OPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV43OptionsJson = AV30Options.toJSonString(false) ;
      AV44OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV33OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("TPROFSAWWGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPROFSAWWGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("TPROFSAWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV12TFProCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV13TFProCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV14TFProDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV15TFProDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV16TFProDsc2 = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV17TFProDsc2_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV18TFEmprNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV19TFEmprNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROULTFP") == 0 )
         {
            AV20TFProUltFP = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFProUltFP_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV22TFProNumLin = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFProNumLin_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV24TFFasCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV25TFFasCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV26TFFasDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV27TFFasDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV41SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC2 */
      pr_default.execute(0, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8NC2 = false ;
         A396EmprCod = P08NC2_A396EmprCod[0] ;
         A460FasDsc = P08NC2_A460FasDsc[0] ;
         A457FasCod = P08NC2_A457FasCod[0] ;
         A774ProNumLin = P08NC2_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC2_A6437ProUltFP[0] ;
         A407EmprNom = P08NC2_A407EmprNom[0] ;
         n407EmprNom = P08NC2_n407EmprNom[0] ;
         A4628ProDsc2 = P08NC2_A4628ProDsc2[0] ;
         A759ProDsc = P08NC2_A759ProDsc[0] ;
         A758ProCod = P08NC2_A758ProCod[0] ;
         A407EmprNom = P08NC2_A407EmprNom[0] ;
         n407EmprNom = P08NC2_n407EmprNom[0] ;
         A460FasDsc = P08NC2_A460FasDsc[0] ;
         A4628ProDsc2 = P08NC2_A4628ProDsc2[0] ;
         A759ProDsc = P08NC2_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08NC2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8NC2 = false ;
            A774ProNumLin = P08NC2_A774ProNumLin[0] ;
            A758ProCod = P08NC2_A758ProCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV29Option = A396EmprCod ;
            AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV30Options.add(AV29Option, 0);
            AV32OptionsDesc.add(AV31OptionDesc, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC2 )
         {
            brk8NC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProCod = AV41SearchTxt ;
      AV13TFProCod_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC3 */
      pr_default.execute(1, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8NC4 = false ;
         A758ProCod = P08NC3_A758ProCod[0] ;
         A460FasDsc = P08NC3_A460FasDsc[0] ;
         A457FasCod = P08NC3_A457FasCod[0] ;
         A774ProNumLin = P08NC3_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC3_A6437ProUltFP[0] ;
         A407EmprNom = P08NC3_A407EmprNom[0] ;
         n407EmprNom = P08NC3_n407EmprNom[0] ;
         A4628ProDsc2 = P08NC3_A4628ProDsc2[0] ;
         A759ProDsc = P08NC3_A759ProDsc[0] ;
         A396EmprCod = P08NC3_A396EmprCod[0] ;
         A407EmprNom = P08NC3_A407EmprNom[0] ;
         n407EmprNom = P08NC3_n407EmprNom[0] ;
         A460FasDsc = P08NC3_A460FasDsc[0] ;
         A4628ProDsc2 = P08NC3_A4628ProDsc2[0] ;
         A759ProDsc = P08NC3_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08NC3_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk8NC4 = false ;
            A774ProNumLin = P08NC3_A774ProNumLin[0] ;
            A396EmprCod = P08NC3_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV29Option = A758ProCod ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC4 )
         {
            brk8NC4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProDsc = AV41SearchTxt ;
      AV15TFProDsc_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC4 */
      pr_default.execute(2, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8NC6 = false ;
         A758ProCod = P08NC4_A758ProCod[0] ;
         A396EmprCod = P08NC4_A396EmprCod[0] ;
         A460FasDsc = P08NC4_A460FasDsc[0] ;
         A457FasCod = P08NC4_A457FasCod[0] ;
         A774ProNumLin = P08NC4_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC4_A6437ProUltFP[0] ;
         A407EmprNom = P08NC4_A407EmprNom[0] ;
         n407EmprNom = P08NC4_n407EmprNom[0] ;
         A4628ProDsc2 = P08NC4_A4628ProDsc2[0] ;
         A759ProDsc = P08NC4_A759ProDsc[0] ;
         A407EmprNom = P08NC4_A407EmprNom[0] ;
         n407EmprNom = P08NC4_n407EmprNom[0] ;
         A4628ProDsc2 = P08NC4_A4628ProDsc2[0] ;
         A759ProDsc = P08NC4_A759ProDsc[0] ;
         A460FasDsc = P08NC4_A460FasDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08NC4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08NC4_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk8NC6 = false ;
            A774ProNumLin = P08NC4_A774ProNumLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV29Option = A759ProDsc ;
            AV28InsertIndex = 1 ;
            while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
            {
               AV28InsertIndex = (int)(AV28InsertIndex+1) ;
            }
            AV30Options.add(AV29Option, AV28InsertIndex);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC6 )
         {
            brk8NC6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRODSC2OPTIONS' Routine */
      returnInSub = false ;
      AV16TFProDsc2 = AV41SearchTxt ;
      AV17TFProDsc2_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC5 */
      pr_default.execute(3, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8NC8 = false ;
         A4628ProDsc2 = P08NC5_A4628ProDsc2[0] ;
         A460FasDsc = P08NC5_A460FasDsc[0] ;
         A457FasCod = P08NC5_A457FasCod[0] ;
         A774ProNumLin = P08NC5_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC5_A6437ProUltFP[0] ;
         A407EmprNom = P08NC5_A407EmprNom[0] ;
         n407EmprNom = P08NC5_n407EmprNom[0] ;
         A759ProDsc = P08NC5_A759ProDsc[0] ;
         A758ProCod = P08NC5_A758ProCod[0] ;
         A396EmprCod = P08NC5_A396EmprCod[0] ;
         A407EmprNom = P08NC5_A407EmprNom[0] ;
         n407EmprNom = P08NC5_n407EmprNom[0] ;
         A460FasDsc = P08NC5_A460FasDsc[0] ;
         A4628ProDsc2 = P08NC5_A4628ProDsc2[0] ;
         A759ProDsc = P08NC5_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08NC5_A4628ProDsc2[0], A4628ProDsc2) == 0 ) )
         {
            brk8NC8 = false ;
            A774ProNumLin = P08NC5_A774ProNumLin[0] ;
            A758ProCod = P08NC5_A758ProCod[0] ;
            A396EmprCod = P08NC5_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4628ProDsc2)==0) )
         {
            AV29Option = A4628ProDsc2 ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC8 )
         {
            brk8NC8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFEmprNom = AV41SearchTxt ;
      AV19TFEmprNom_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC6 */
      pr_default.execute(4, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8NC10 = false ;
         A407EmprNom = P08NC6_A407EmprNom[0] ;
         n407EmprNom = P08NC6_n407EmprNom[0] ;
         A460FasDsc = P08NC6_A460FasDsc[0] ;
         A457FasCod = P08NC6_A457FasCod[0] ;
         A774ProNumLin = P08NC6_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC6_A6437ProUltFP[0] ;
         A4628ProDsc2 = P08NC6_A4628ProDsc2[0] ;
         A759ProDsc = P08NC6_A759ProDsc[0] ;
         A758ProCod = P08NC6_A758ProCod[0] ;
         A396EmprCod = P08NC6_A396EmprCod[0] ;
         A407EmprNom = P08NC6_A407EmprNom[0] ;
         n407EmprNom = P08NC6_n407EmprNom[0] ;
         A460FasDsc = P08NC6_A460FasDsc[0] ;
         A4628ProDsc2 = P08NC6_A4628ProDsc2[0] ;
         A759ProDsc = P08NC6_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08NC6_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8NC10 = false ;
            A774ProNumLin = P08NC6_A774ProNumLin[0] ;
            A758ProCod = P08NC6_A758ProCod[0] ;
            A396EmprCod = P08NC6_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV29Option = A407EmprNom ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC10 )
         {
            brk8NC10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV24TFFasCod = AV41SearchTxt ;
      AV25TFFasCod_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC7 */
      pr_default.execute(5, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8NC12 = false ;
         A457FasCod = P08NC7_A457FasCod[0] ;
         A460FasDsc = P08NC7_A460FasDsc[0] ;
         A774ProNumLin = P08NC7_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC7_A6437ProUltFP[0] ;
         A407EmprNom = P08NC7_A407EmprNom[0] ;
         n407EmprNom = P08NC7_n407EmprNom[0] ;
         A4628ProDsc2 = P08NC7_A4628ProDsc2[0] ;
         A759ProDsc = P08NC7_A759ProDsc[0] ;
         A758ProCod = P08NC7_A758ProCod[0] ;
         A396EmprCod = P08NC7_A396EmprCod[0] ;
         A407EmprNom = P08NC7_A407EmprNom[0] ;
         n407EmprNom = P08NC7_n407EmprNom[0] ;
         A460FasDsc = P08NC7_A460FasDsc[0] ;
         A4628ProDsc2 = P08NC7_A4628ProDsc2[0] ;
         A759ProDsc = P08NC7_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08NC7_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8NC12 = false ;
            A774ProNumLin = P08NC7_A774ProNumLin[0] ;
            A758ProCod = P08NC7_A758ProCod[0] ;
            A396EmprCod = P08NC7_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV29Option = A457FasCod ;
            AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV30Options.add(AV29Option, 0);
            AV32OptionsDesc.add(AV31OptionDesc, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC12 )
         {
            brk8NC12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFFasDsc = AV41SearchTxt ;
      AV27TFFasDsc_Sel = "" ;
      AV51Tprofsawwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tprofsawwds_2_tfemprcod = AV10TFEmprCod ;
      AV53Tprofsawwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV54Tprofsawwds_4_tfprocod = AV12TFProCod ;
      AV55Tprofsawwds_5_tfprocod_sel = AV13TFProCod_Sel ;
      AV56Tprofsawwds_6_tfprodsc = AV14TFProDsc ;
      AV57Tprofsawwds_7_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV58Tprofsawwds_8_tfprodsc2 = AV16TFProDsc2 ;
      AV59Tprofsawwds_9_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV60Tprofsawwds_10_tfemprnom = AV18TFEmprNom ;
      AV61Tprofsawwds_11_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV62Tprofsawwds_12_tfproultfp = AV20TFProUltFP ;
      AV63Tprofsawwds_13_tfproultfp_to = AV21TFProUltFP_To ;
      AV64Tprofsawwds_14_tfpronumlin = AV22TFProNumLin ;
      AV65Tprofsawwds_15_tfpronumlin_to = AV23TFProNumLin_To ;
      AV66Tprofsawwds_16_tffascod = AV24TFFasCod ;
      AV67Tprofsawwds_17_tffascod_sel = AV25TFFasCod_Sel ;
      AV68Tprofsawwds_18_tffasdsc = AV26TFFasDsc ;
      AV69Tprofsawwds_19_tffasdsc_sel = AV27TFFasDsc_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV51Tprofsawwds_1_filterfulltext ,
                                           AV53Tprofsawwds_3_tfemprcod_sel ,
                                           AV52Tprofsawwds_2_tfemprcod ,
                                           AV55Tprofsawwds_5_tfprocod_sel ,
                                           AV54Tprofsawwds_4_tfprocod ,
                                           AV57Tprofsawwds_7_tfprodsc_sel ,
                                           AV56Tprofsawwds_6_tfprodsc ,
                                           AV59Tprofsawwds_9_tfprodsc2_sel ,
                                           AV58Tprofsawwds_8_tfprodsc2 ,
                                           AV61Tprofsawwds_11_tfemprnom_sel ,
                                           AV60Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV62Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV64Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to) ,
                                           AV67Tprofsawwds_17_tffascod_sel ,
                                           AV66Tprofsawwds_16_tffascod ,
                                           AV69Tprofsawwds_19_tffasdsc_sel ,
                                           AV68Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV51Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tprofsawwds_1_filterfulltext), "%", "") ;
      lV52Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV54Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV54Tprofsawwds_4_tfprocod), 8, "%") ;
      lV56Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV58Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV60Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV66Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_16_tffascod), 8, "%") ;
      lV68Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV68Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08NC8 */
      pr_default.execute(6, new Object[] {lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV51Tprofsawwds_1_filterfulltext, lV52Tprofsawwds_2_tfemprcod, AV53Tprofsawwds_3_tfemprcod_sel, lV54Tprofsawwds_4_tfprocod, AV55Tprofsawwds_5_tfprocod_sel, lV56Tprofsawwds_6_tfprodsc, AV57Tprofsawwds_7_tfprodsc_sel, lV58Tprofsawwds_8_tfprodsc2, AV59Tprofsawwds_9_tfprodsc2_sel, lV60Tprofsawwds_10_tfemprnom, AV61Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV62Tprofsawwds_12_tfproultfp), Short.valueOf(AV63Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV64Tprofsawwds_14_tfpronumlin), Short.valueOf(AV65Tprofsawwds_15_tfpronumlin_to), lV66Tprofsawwds_16_tffascod, AV67Tprofsawwds_17_tffascod_sel, lV68Tprofsawwds_18_tffasdsc, AV69Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8NC14 = false ;
         A457FasCod = P08NC8_A457FasCod[0] ;
         A396EmprCod = P08NC8_A396EmprCod[0] ;
         A460FasDsc = P08NC8_A460FasDsc[0] ;
         A774ProNumLin = P08NC8_A774ProNumLin[0] ;
         A6437ProUltFP = P08NC8_A6437ProUltFP[0] ;
         A407EmprNom = P08NC8_A407EmprNom[0] ;
         n407EmprNom = P08NC8_n407EmprNom[0] ;
         A4628ProDsc2 = P08NC8_A4628ProDsc2[0] ;
         A759ProDsc = P08NC8_A759ProDsc[0] ;
         A758ProCod = P08NC8_A758ProCod[0] ;
         A407EmprNom = P08NC8_A407EmprNom[0] ;
         n407EmprNom = P08NC8_n407EmprNom[0] ;
         A460FasDsc = P08NC8_A460FasDsc[0] ;
         A4628ProDsc2 = P08NC8_A4628ProDsc2[0] ;
         A759ProDsc = P08NC8_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08NC8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08NC8_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8NC14 = false ;
            A774ProNumLin = P08NC8_A774ProNumLin[0] ;
            A758ProCod = P08NC8_A758ProCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8NC14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV29Option = A460FasDsc ;
            AV28InsertIndex = 1 ;
            while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
            {
               AV28InsertIndex = (int)(AV28InsertIndex+1) ;
            }
            AV30Options.add(AV29Option, AV28InsertIndex);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NC14 )
         {
            brk8NC14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprofsawwgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = tprofsawwgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = tprofsawwgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV44OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFProCod = "" ;
      AV13TFProCod_Sel = "" ;
      AV14TFProDsc = "" ;
      AV15TFProDsc_Sel = "" ;
      AV16TFProDsc2 = "" ;
      AV17TFProDsc2_Sel = "" ;
      AV18TFEmprNom = "" ;
      AV19TFEmprNom_Sel = "" ;
      AV24TFFasCod = "" ;
      AV25TFFasCod_Sel = "" ;
      AV26TFFasDsc = "" ;
      AV27TFFasDsc_Sel = "" ;
      A396EmprCod = "" ;
      AV51Tprofsawwds_1_filterfulltext = "" ;
      AV52Tprofsawwds_2_tfemprcod = "" ;
      AV53Tprofsawwds_3_tfemprcod_sel = "" ;
      AV54Tprofsawwds_4_tfprocod = "" ;
      AV55Tprofsawwds_5_tfprocod_sel = "" ;
      AV56Tprofsawwds_6_tfprodsc = "" ;
      AV57Tprofsawwds_7_tfprodsc_sel = "" ;
      AV58Tprofsawwds_8_tfprodsc2 = "" ;
      AV59Tprofsawwds_9_tfprodsc2_sel = "" ;
      AV60Tprofsawwds_10_tfemprnom = "" ;
      AV61Tprofsawwds_11_tfemprnom_sel = "" ;
      AV66Tprofsawwds_16_tffascod = "" ;
      AV67Tprofsawwds_17_tffascod_sel = "" ;
      AV68Tprofsawwds_18_tffasdsc = "" ;
      AV69Tprofsawwds_19_tffasdsc_sel = "" ;
      scmdbuf = "" ;
      lV51Tprofsawwds_1_filterfulltext = "" ;
      lV52Tprofsawwds_2_tfemprcod = "" ;
      lV54Tprofsawwds_4_tfprocod = "" ;
      lV56Tprofsawwds_6_tfprodsc = "" ;
      lV58Tprofsawwds_8_tfprodsc2 = "" ;
      lV60Tprofsawwds_10_tfemprnom = "" ;
      lV66Tprofsawwds_16_tffascod = "" ;
      lV68Tprofsawwds_18_tffasdsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A407EmprNom = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P08NC2_A396EmprCod = new String[] {""} ;
      P08NC2_A460FasDsc = new String[] {""} ;
      P08NC2_A457FasCod = new String[] {""} ;
      P08NC2_A774ProNumLin = new short[1] ;
      P08NC2_A6437ProUltFP = new short[1] ;
      P08NC2_A407EmprNom = new String[] {""} ;
      P08NC2_n407EmprNom = new boolean[] {false} ;
      P08NC2_A4628ProDsc2 = new String[] {""} ;
      P08NC2_A759ProDsc = new String[] {""} ;
      P08NC2_A758ProCod = new String[] {""} ;
      AV29Option = "" ;
      AV31OptionDesc = "" ;
      P08NC3_A758ProCod = new String[] {""} ;
      P08NC3_A460FasDsc = new String[] {""} ;
      P08NC3_A457FasCod = new String[] {""} ;
      P08NC3_A774ProNumLin = new short[1] ;
      P08NC3_A6437ProUltFP = new short[1] ;
      P08NC3_A407EmprNom = new String[] {""} ;
      P08NC3_n407EmprNom = new boolean[] {false} ;
      P08NC3_A4628ProDsc2 = new String[] {""} ;
      P08NC3_A759ProDsc = new String[] {""} ;
      P08NC3_A396EmprCod = new String[] {""} ;
      P08NC4_A758ProCod = new String[] {""} ;
      P08NC4_A396EmprCod = new String[] {""} ;
      P08NC4_A460FasDsc = new String[] {""} ;
      P08NC4_A457FasCod = new String[] {""} ;
      P08NC4_A774ProNumLin = new short[1] ;
      P08NC4_A6437ProUltFP = new short[1] ;
      P08NC4_A407EmprNom = new String[] {""} ;
      P08NC4_n407EmprNom = new boolean[] {false} ;
      P08NC4_A4628ProDsc2 = new String[] {""} ;
      P08NC4_A759ProDsc = new String[] {""} ;
      P08NC5_A4628ProDsc2 = new String[] {""} ;
      P08NC5_A460FasDsc = new String[] {""} ;
      P08NC5_A457FasCod = new String[] {""} ;
      P08NC5_A774ProNumLin = new short[1] ;
      P08NC5_A6437ProUltFP = new short[1] ;
      P08NC5_A407EmprNom = new String[] {""} ;
      P08NC5_n407EmprNom = new boolean[] {false} ;
      P08NC5_A759ProDsc = new String[] {""} ;
      P08NC5_A758ProCod = new String[] {""} ;
      P08NC5_A396EmprCod = new String[] {""} ;
      P08NC6_A407EmprNom = new String[] {""} ;
      P08NC6_n407EmprNom = new boolean[] {false} ;
      P08NC6_A460FasDsc = new String[] {""} ;
      P08NC6_A457FasCod = new String[] {""} ;
      P08NC6_A774ProNumLin = new short[1] ;
      P08NC6_A6437ProUltFP = new short[1] ;
      P08NC6_A4628ProDsc2 = new String[] {""} ;
      P08NC6_A759ProDsc = new String[] {""} ;
      P08NC6_A758ProCod = new String[] {""} ;
      P08NC6_A396EmprCod = new String[] {""} ;
      P08NC7_A457FasCod = new String[] {""} ;
      P08NC7_A460FasDsc = new String[] {""} ;
      P08NC7_A774ProNumLin = new short[1] ;
      P08NC7_A6437ProUltFP = new short[1] ;
      P08NC7_A407EmprNom = new String[] {""} ;
      P08NC7_n407EmprNom = new boolean[] {false} ;
      P08NC7_A4628ProDsc2 = new String[] {""} ;
      P08NC7_A759ProDsc = new String[] {""} ;
      P08NC7_A758ProCod = new String[] {""} ;
      P08NC7_A396EmprCod = new String[] {""} ;
      P08NC8_A457FasCod = new String[] {""} ;
      P08NC8_A396EmprCod = new String[] {""} ;
      P08NC8_A460FasDsc = new String[] {""} ;
      P08NC8_A774ProNumLin = new short[1] ;
      P08NC8_A6437ProUltFP = new short[1] ;
      P08NC8_A407EmprNom = new String[] {""} ;
      P08NC8_n407EmprNom = new boolean[] {false} ;
      P08NC8_A4628ProDsc2 = new String[] {""} ;
      P08NC8_A759ProDsc = new String[] {""} ;
      P08NC8_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprofsawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08NC2_A396EmprCod, P08NC2_A460FasDsc, P08NC2_A457FasCod, P08NC2_A774ProNumLin, P08NC2_A6437ProUltFP, P08NC2_A407EmprNom, P08NC2_n407EmprNom, P08NC2_A4628ProDsc2, P08NC2_A759ProDsc, P08NC2_A758ProCod
            }
            , new Object[] {
            P08NC3_A758ProCod, P08NC3_A460FasDsc, P08NC3_A457FasCod, P08NC3_A774ProNumLin, P08NC3_A6437ProUltFP, P08NC3_A407EmprNom, P08NC3_n407EmprNom, P08NC3_A4628ProDsc2, P08NC3_A759ProDsc, P08NC3_A396EmprCod
            }
            , new Object[] {
            P08NC4_A758ProCod, P08NC4_A396EmprCod, P08NC4_A460FasDsc, P08NC4_A457FasCod, P08NC4_A774ProNumLin, P08NC4_A6437ProUltFP, P08NC4_A407EmprNom, P08NC4_n407EmprNom, P08NC4_A4628ProDsc2, P08NC4_A759ProDsc
            }
            , new Object[] {
            P08NC5_A4628ProDsc2, P08NC5_A460FasDsc, P08NC5_A457FasCod, P08NC5_A774ProNumLin, P08NC5_A6437ProUltFP, P08NC5_A407EmprNom, P08NC5_n407EmprNom, P08NC5_A759ProDsc, P08NC5_A758ProCod, P08NC5_A396EmprCod
            }
            , new Object[] {
            P08NC6_A407EmprNom, P08NC6_n407EmprNom, P08NC6_A460FasDsc, P08NC6_A457FasCod, P08NC6_A774ProNumLin, P08NC6_A6437ProUltFP, P08NC6_A4628ProDsc2, P08NC6_A759ProDsc, P08NC6_A758ProCod, P08NC6_A396EmprCod
            }
            , new Object[] {
            P08NC7_A457FasCod, P08NC7_A460FasDsc, P08NC7_A774ProNumLin, P08NC7_A6437ProUltFP, P08NC7_A407EmprNom, P08NC7_n407EmprNom, P08NC7_A4628ProDsc2, P08NC7_A759ProDsc, P08NC7_A758ProCod, P08NC7_A396EmprCod
            }
            , new Object[] {
            P08NC8_A457FasCod, P08NC8_A396EmprCod, P08NC8_A460FasDsc, P08NC8_A774ProNumLin, P08NC8_A6437ProUltFP, P08NC8_A407EmprNom, P08NC8_n407EmprNom, P08NC8_A4628ProDsc2, P08NC8_A759ProDsc, P08NC8_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20TFProUltFP ;
   private short AV21TFProUltFP_To ;
   private short AV22TFProNumLin ;
   private short AV23TFProNumLin_To ;
   private short AV62Tprofsawwds_12_tfproultfp ;
   private short AV63Tprofsawwds_13_tfproultfp_to ;
   private short AV64Tprofsawwds_14_tfpronumlin ;
   private short AV65Tprofsawwds_15_tfpronumlin_to ;
   private short A6437ProUltFP ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV28InsertIndex ;
   private long AV34count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFProCod ;
   private String AV13TFProCod_Sel ;
   private String AV14TFProDsc ;
   private String AV15TFProDsc_Sel ;
   private String AV16TFProDsc2 ;
   private String AV17TFProDsc2_Sel ;
   private String AV18TFEmprNom ;
   private String AV19TFEmprNom_Sel ;
   private String AV24TFFasCod ;
   private String AV25TFFasCod_Sel ;
   private String AV26TFFasDsc ;
   private String AV27TFFasDsc_Sel ;
   private String A396EmprCod ;
   private String AV52Tprofsawwds_2_tfemprcod ;
   private String AV53Tprofsawwds_3_tfemprcod_sel ;
   private String AV54Tprofsawwds_4_tfprocod ;
   private String AV55Tprofsawwds_5_tfprocod_sel ;
   private String AV56Tprofsawwds_6_tfprodsc ;
   private String AV57Tprofsawwds_7_tfprodsc_sel ;
   private String AV58Tprofsawwds_8_tfprodsc2 ;
   private String AV59Tprofsawwds_9_tfprodsc2_sel ;
   private String AV60Tprofsawwds_10_tfemprnom ;
   private String AV61Tprofsawwds_11_tfemprnom_sel ;
   private String AV66Tprofsawwds_16_tffascod ;
   private String AV67Tprofsawwds_17_tffascod_sel ;
   private String AV68Tprofsawwds_18_tffasdsc ;
   private String AV69Tprofsawwds_19_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV52Tprofsawwds_2_tfemprcod ;
   private String lV54Tprofsawwds_4_tfprocod ;
   private String lV56Tprofsawwds_6_tfprodsc ;
   private String lV58Tprofsawwds_8_tfprodsc2 ;
   private String lV60Tprofsawwds_10_tfemprnom ;
   private String lV66Tprofsawwds_16_tffascod ;
   private String lV68Tprofsawwds_18_tffasdsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A407EmprNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private boolean returnInSub ;
   private boolean brk8NC2 ;
   private boolean n407EmprNom ;
   private boolean brk8NC4 ;
   private boolean brk8NC6 ;
   private boolean brk8NC8 ;
   private boolean brk8NC10 ;
   private boolean brk8NC12 ;
   private boolean brk8NC14 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Tprofsawwds_1_filterfulltext ;
   private String lV51Tprofsawwds_1_filterfulltext ;
   private String AV29Option ;
   private String AV31OptionDesc ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08NC2_A396EmprCod ;
   private String[] P08NC2_A460FasDsc ;
   private String[] P08NC2_A457FasCod ;
   private short[] P08NC2_A774ProNumLin ;
   private short[] P08NC2_A6437ProUltFP ;
   private String[] P08NC2_A407EmprNom ;
   private boolean[] P08NC2_n407EmprNom ;
   private String[] P08NC2_A4628ProDsc2 ;
   private String[] P08NC2_A759ProDsc ;
   private String[] P08NC2_A758ProCod ;
   private String[] P08NC3_A758ProCod ;
   private String[] P08NC3_A460FasDsc ;
   private String[] P08NC3_A457FasCod ;
   private short[] P08NC3_A774ProNumLin ;
   private short[] P08NC3_A6437ProUltFP ;
   private String[] P08NC3_A407EmprNom ;
   private boolean[] P08NC3_n407EmprNom ;
   private String[] P08NC3_A4628ProDsc2 ;
   private String[] P08NC3_A759ProDsc ;
   private String[] P08NC3_A396EmprCod ;
   private String[] P08NC4_A758ProCod ;
   private String[] P08NC4_A396EmprCod ;
   private String[] P08NC4_A460FasDsc ;
   private String[] P08NC4_A457FasCod ;
   private short[] P08NC4_A774ProNumLin ;
   private short[] P08NC4_A6437ProUltFP ;
   private String[] P08NC4_A407EmprNom ;
   private boolean[] P08NC4_n407EmprNom ;
   private String[] P08NC4_A4628ProDsc2 ;
   private String[] P08NC4_A759ProDsc ;
   private String[] P08NC5_A4628ProDsc2 ;
   private String[] P08NC5_A460FasDsc ;
   private String[] P08NC5_A457FasCod ;
   private short[] P08NC5_A774ProNumLin ;
   private short[] P08NC5_A6437ProUltFP ;
   private String[] P08NC5_A407EmprNom ;
   private boolean[] P08NC5_n407EmprNom ;
   private String[] P08NC5_A759ProDsc ;
   private String[] P08NC5_A758ProCod ;
   private String[] P08NC5_A396EmprCod ;
   private String[] P08NC6_A407EmprNom ;
   private boolean[] P08NC6_n407EmprNom ;
   private String[] P08NC6_A460FasDsc ;
   private String[] P08NC6_A457FasCod ;
   private short[] P08NC6_A774ProNumLin ;
   private short[] P08NC6_A6437ProUltFP ;
   private String[] P08NC6_A4628ProDsc2 ;
   private String[] P08NC6_A759ProDsc ;
   private String[] P08NC6_A758ProCod ;
   private String[] P08NC6_A396EmprCod ;
   private String[] P08NC7_A457FasCod ;
   private String[] P08NC7_A460FasDsc ;
   private short[] P08NC7_A774ProNumLin ;
   private short[] P08NC7_A6437ProUltFP ;
   private String[] P08NC7_A407EmprNom ;
   private boolean[] P08NC7_n407EmprNom ;
   private String[] P08NC7_A4628ProDsc2 ;
   private String[] P08NC7_A759ProDsc ;
   private String[] P08NC7_A758ProCod ;
   private String[] P08NC7_A396EmprCod ;
   private String[] P08NC8_A457FasCod ;
   private String[] P08NC8_A396EmprCod ;
   private String[] P08NC8_A460FasDsc ;
   private short[] P08NC8_A774ProNumLin ;
   private short[] P08NC8_A6437ProUltFP ;
   private String[] P08NC8_A407EmprNom ;
   private boolean[] P08NC8_n407EmprNom ;
   private String[] P08NC8_A4628ProDsc2 ;
   private String[] P08NC8_A759ProDsc ;
   private String[] P08NC8_A758ProCod ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class tprofsawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc2, T4.ProDsc, T1.ProCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08NC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[27];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T3.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc2, T4.ProDsc, T1.EmprCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08NC4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T1.EmprCod, T4.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T3.ProDsc2, T3.ProDsc FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod" ;
      scmdbuf += " = T1.FasCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T4.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc2 = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.FasDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08NC5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T4.ProDsc2, T3.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc, T1.ProCod, T1.EmprCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.ProDsc2" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08NC6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[27];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T3.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T4.ProDsc2, T4.ProDsc, T1.ProCod, T1.EmprCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08NC7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[27];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T3.FasDsc, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc2, T4.ProDsc, T1.ProCod, T1.EmprCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08NC8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tprofsawwds_1_filterfulltext ,
                                          String AV53Tprofsawwds_3_tfemprcod_sel ,
                                          String AV52Tprofsawwds_2_tfemprcod ,
                                          String AV55Tprofsawwds_5_tfprocod_sel ,
                                          String AV54Tprofsawwds_4_tfprocod ,
                                          String AV57Tprofsawwds_7_tfprodsc_sel ,
                                          String AV56Tprofsawwds_6_tfprodsc ,
                                          String AV59Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV58Tprofsawwds_8_tfprodsc2 ,
                                          String AV61Tprofsawwds_11_tfemprnom_sel ,
                                          String AV60Tprofsawwds_10_tfemprnom ,
                                          short AV62Tprofsawwds_12_tfproultfp ,
                                          short AV63Tprofsawwds_13_tfproultfp_to ,
                                          short AV64Tprofsawwds_14_tfpronumlin ,
                                          short AV65Tprofsawwds_15_tfpronumlin_to ,
                                          String AV67Tprofsawwds_17_tffascod_sel ,
                                          String AV66Tprofsawwds_16_tffascod ,
                                          String AV69Tprofsawwds_19_tffasdsc_sel ,
                                          String AV68Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[27];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T3.FasDsc, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc2, T4.ProDsc, T1.ProCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV51Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV62Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV63Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV64Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
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
                  return conditional_P08NC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P08NC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P08NC4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 3 :
                  return conditional_P08NC5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 4 :
                  return conditional_P08NC6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 5 :
                  return conditional_P08NC7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 6 :
                  return conditional_P08NC8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NC4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NC5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NC6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NC7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NC8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 100);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
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
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
      }
   }

}

