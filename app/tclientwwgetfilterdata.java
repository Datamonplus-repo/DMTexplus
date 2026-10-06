package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclientwwgetfilterdata extends GXProcedure
{
   public tclientwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclientwwgetfilterdata.class ), "" );
   }

   public tclientwwgetfilterdata( int remoteHandle ,
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
      tclientwwgetfilterdata.this.aP5 = new String[] {""};
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
      tclientwwgetfilterdata.this.AV52DDOName = aP0;
      tclientwwgetfilterdata.this.AV50SearchTxt = aP1;
      tclientwwgetfilterdata.this.AV51SearchTxtTo = aP2;
      tclientwwgetfilterdata.this.aP3 = aP3;
      tclientwwgetfilterdata.this.aP4 = aP4;
      tclientwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLINIF") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINIFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLIDOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIDOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLIPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIPOBOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLICP") == 0 )
      {
         /* Execute user subroutine: 'LOADCLICPOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLICP2") == 0 )
      {
         /* Execute user subroutine: 'LOADCLICP2OPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV56OptionsJson = AV55Options.toJSonString(false) ;
      AV59OptionsDescJson = AV58OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV60OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue("TCLIENTWWGridState"), "") == 0 )
      {
         AV65GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCLIENTWWGridState"), null, null);
      }
      else
      {
         AV65GridState.fromxml(AV63Session.getValue("TCLIENTWWGridState"), null, null);
      }
      AV101GXV1 = 1 ;
      while ( AV101GXV1 <= AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV66GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV1));
         if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV94FilterFullText = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF") == 0 )
         {
            AV12TFCliNif = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF_SEL") == 0 )
         {
            AV13TFCliNif_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM") == 0 )
         {
            AV16TFCliDom = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM_SEL") == 0 )
         {
            AV17TFCliDom_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB") == 0 )
         {
            AV18TFCliPob = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB_SEL") == 0 )
         {
            AV19TFCliPob_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP") == 0 )
         {
            AV20TFCliCp = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP_SEL") == 0 )
         {
            AV21TFCliCp_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2") == 0 )
         {
            AV95TFCliCp2 = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2_SEL") == 0 )
         {
            AV96TFCliCp2_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV24TFPrvDsc = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV25TFPrvDsc_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV101GXV1 = (int)(AV101GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV50SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G2 */
      pr_default.execute(0, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk82G2 = false ;
         A781PrvCod = P082G2_A781PrvCod[0] ;
         A279CliNom = P082G2_A279CliNom[0] ;
         A10045CliAct = P082G2_A10045CliAct[0] ;
         A787PrvDsc = P082G2_A787PrvDsc[0] ;
         n787PrvDsc = P082G2_n787PrvDsc[0] ;
         A4828CliCp2 = P082G2_A4828CliCp2[0] ;
         A256CliCp = P082G2_A256CliCp[0] ;
         A295CliPob = P082G2_A295CliPob[0] ;
         A260CliDom = P082G2_A260CliDom[0] ;
         A278CliNif = P082G2_A278CliNif[0] ;
         A252CliCod = P082G2_A252CliCod[0] ;
         A396EmprCod = P082G2_A396EmprCod[0] ;
         A787PrvDsc = P082G2_A787PrvDsc[0] ;
         n787PrvDsc = P082G2_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P082G2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk82G2 = false ;
            A252CliCod = P082G2_A252CliCod[0] ;
            A396EmprCod = P082G2_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV54Option = A279CliNom ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G2 )
         {
            brk82G2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINIFOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNif = AV50SearchTxt ;
      AV13TFCliNif_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G3 */
      pr_default.execute(1, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk82G4 = false ;
         A781PrvCod = P082G3_A781PrvCod[0] ;
         A10045CliAct = P082G3_A10045CliAct[0] ;
         A278CliNif = P082G3_A278CliNif[0] ;
         A787PrvDsc = P082G3_A787PrvDsc[0] ;
         n787PrvDsc = P082G3_n787PrvDsc[0] ;
         A4828CliCp2 = P082G3_A4828CliCp2[0] ;
         A256CliCp = P082G3_A256CliCp[0] ;
         A295CliPob = P082G3_A295CliPob[0] ;
         A260CliDom = P082G3_A260CliDom[0] ;
         A279CliNom = P082G3_A279CliNom[0] ;
         A252CliCod = P082G3_A252CliCod[0] ;
         A396EmprCod = P082G3_A396EmprCod[0] ;
         A787PrvDsc = P082G3_A787PrvDsc[0] ;
         n787PrvDsc = P082G3_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P082G3_A278CliNif[0], A278CliNif) == 0 ) )
         {
            brk82G4 = false ;
            A252CliCod = P082G3_A252CliCod[0] ;
            A396EmprCod = P082G3_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A278CliNif)==0) )
         {
            AV54Option = A278CliNif ;
            AV57OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A278CliNif, "@!"))) ;
            AV55Options.add(AV54Option, 0);
            AV58OptionsDesc.add(AV57OptionDesc, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G4 )
         {
            brk82G4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLIDOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliDom = AV50SearchTxt ;
      AV17TFCliDom_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G4 */
      pr_default.execute(2, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk82G6 = false ;
         A781PrvCod = P082G4_A781PrvCod[0] ;
         A10045CliAct = P082G4_A10045CliAct[0] ;
         A260CliDom = P082G4_A260CliDom[0] ;
         A787PrvDsc = P082G4_A787PrvDsc[0] ;
         n787PrvDsc = P082G4_n787PrvDsc[0] ;
         A4828CliCp2 = P082G4_A4828CliCp2[0] ;
         A256CliCp = P082G4_A256CliCp[0] ;
         A295CliPob = P082G4_A295CliPob[0] ;
         A278CliNif = P082G4_A278CliNif[0] ;
         A279CliNom = P082G4_A279CliNom[0] ;
         A252CliCod = P082G4_A252CliCod[0] ;
         A396EmprCod = P082G4_A396EmprCod[0] ;
         A787PrvDsc = P082G4_A787PrvDsc[0] ;
         n787PrvDsc = P082G4_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P082G4_A260CliDom[0], A260CliDom) == 0 ) )
         {
            brk82G6 = false ;
            A252CliCod = P082G4_A252CliCod[0] ;
            A396EmprCod = P082G4_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A260CliDom)==0) )
         {
            AV54Option = A260CliDom ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G6 )
         {
            brk82G6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCLIPOBOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliPob = AV50SearchTxt ;
      AV19TFCliPob_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G5 */
      pr_default.execute(3, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk82G8 = false ;
         A781PrvCod = P082G5_A781PrvCod[0] ;
         A10045CliAct = P082G5_A10045CliAct[0] ;
         A295CliPob = P082G5_A295CliPob[0] ;
         A787PrvDsc = P082G5_A787PrvDsc[0] ;
         n787PrvDsc = P082G5_n787PrvDsc[0] ;
         A4828CliCp2 = P082G5_A4828CliCp2[0] ;
         A256CliCp = P082G5_A256CliCp[0] ;
         A260CliDom = P082G5_A260CliDom[0] ;
         A278CliNif = P082G5_A278CliNif[0] ;
         A279CliNom = P082G5_A279CliNom[0] ;
         A252CliCod = P082G5_A252CliCod[0] ;
         A396EmprCod = P082G5_A396EmprCod[0] ;
         A787PrvDsc = P082G5_A787PrvDsc[0] ;
         n787PrvDsc = P082G5_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P082G5_A295CliPob[0], A295CliPob) == 0 ) )
         {
            brk82G8 = false ;
            A252CliCod = P082G5_A252CliCod[0] ;
            A396EmprCod = P082G5_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A295CliPob)==0) )
         {
            AV54Option = A295CliPob ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G8 )
         {
            brk82G8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCLICPOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliCp = AV50SearchTxt ;
      AV21TFCliCp_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G6 */
      pr_default.execute(4, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk82G10 = false ;
         A781PrvCod = P082G6_A781PrvCod[0] ;
         A10045CliAct = P082G6_A10045CliAct[0] ;
         A256CliCp = P082G6_A256CliCp[0] ;
         A787PrvDsc = P082G6_A787PrvDsc[0] ;
         n787PrvDsc = P082G6_n787PrvDsc[0] ;
         A4828CliCp2 = P082G6_A4828CliCp2[0] ;
         A295CliPob = P082G6_A295CliPob[0] ;
         A260CliDom = P082G6_A260CliDom[0] ;
         A278CliNif = P082G6_A278CliNif[0] ;
         A279CliNom = P082G6_A279CliNom[0] ;
         A252CliCod = P082G6_A252CliCod[0] ;
         A396EmprCod = P082G6_A396EmprCod[0] ;
         A787PrvDsc = P082G6_A787PrvDsc[0] ;
         n787PrvDsc = P082G6_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P082G6_A256CliCp[0], A256CliCp) == 0 ) )
         {
            brk82G10 = false ;
            A252CliCod = P082G6_A252CliCod[0] ;
            A396EmprCod = P082G6_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A256CliCp)==0) )
         {
            AV54Option = A256CliCp ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G10 )
         {
            brk82G10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADCLICP2OPTIONS' Routine */
      returnInSub = false ;
      AV95TFCliCp2 = AV50SearchTxt ;
      AV96TFCliCp2_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G7 */
      pr_default.execute(5, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk82G12 = false ;
         A781PrvCod = P082G7_A781PrvCod[0] ;
         A10045CliAct = P082G7_A10045CliAct[0] ;
         A4828CliCp2 = P082G7_A4828CliCp2[0] ;
         A787PrvDsc = P082G7_A787PrvDsc[0] ;
         n787PrvDsc = P082G7_n787PrvDsc[0] ;
         A256CliCp = P082G7_A256CliCp[0] ;
         A295CliPob = P082G7_A295CliPob[0] ;
         A260CliDom = P082G7_A260CliDom[0] ;
         A278CliNif = P082G7_A278CliNif[0] ;
         A279CliNom = P082G7_A279CliNom[0] ;
         A252CliCod = P082G7_A252CliCod[0] ;
         A396EmprCod = P082G7_A396EmprCod[0] ;
         A787PrvDsc = P082G7_A787PrvDsc[0] ;
         n787PrvDsc = P082G7_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P082G7_A4828CliCp2[0], A4828CliCp2) == 0 ) )
         {
            brk82G12 = false ;
            A252CliCod = P082G7_A252CliCod[0] ;
            A396EmprCod = P082G7_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A4828CliCp2)==0) )
         {
            AV54Option = A4828CliCp2 ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G12 )
         {
            brk82G12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPrvDsc = AV50SearchTxt ;
      AV25TFPrvDsc_Sel = "" ;
      AV103Tclientwwds_1_filterfulltext = AV94FilterFullText ;
      AV104Tclientwwds_2_tfclicod = AV10TFCliCod ;
      AV105Tclientwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV106Tclientwwds_4_tfclinom = AV14TFCliNom ;
      AV107Tclientwwds_5_tfclinom_sel = AV15TFCliNom_Sel ;
      AV108Tclientwwds_6_tfclinif = AV12TFCliNif ;
      AV109Tclientwwds_7_tfclinif_sel = AV13TFCliNif_Sel ;
      AV110Tclientwwds_8_tfclidom = AV16TFCliDom ;
      AV111Tclientwwds_9_tfclidom_sel = AV17TFCliDom_Sel ;
      AV112Tclientwwds_10_tfclipob = AV18TFCliPob ;
      AV113Tclientwwds_11_tfclipob_sel = AV19TFCliPob_Sel ;
      AV114Tclientwwds_12_tfclicp = AV20TFCliCp ;
      AV115Tclientwwds_13_tfclicp_sel = AV21TFCliCp_Sel ;
      AV116Tclientwwds_14_tfclicp2 = AV95TFCliCp2 ;
      AV117Tclientwwds_15_tfclicp2_sel = AV96TFCliCp2_Sel ;
      AV118Tclientwwds_16_tfprvdsc = AV24TFPrvDsc ;
      AV119Tclientwwds_17_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV103Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV104Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV105Tclientwwds_3_tfclicod_to) ,
                                           AV107Tclientwwds_5_tfclinom_sel ,
                                           AV106Tclientwwds_4_tfclinom ,
                                           AV109Tclientwwds_7_tfclinif_sel ,
                                           AV108Tclientwwds_6_tfclinif ,
                                           AV111Tclientwwds_9_tfclidom_sel ,
                                           AV110Tclientwwds_8_tfclidom ,
                                           AV113Tclientwwds_11_tfclipob_sel ,
                                           AV112Tclientwwds_10_tfclipob ,
                                           AV115Tclientwwds_13_tfclicp_sel ,
                                           AV114Tclientwwds_12_tfclicp ,
                                           AV117Tclientwwds_15_tfclicp2_sel ,
                                           AV116Tclientwwds_14_tfclicp2 ,
                                           AV119Tclientwwds_17_tfprvdsc_sel ,
                                           AV118Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           A10045CliAct ,
                                           AV98cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV103Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Tclientwwds_1_filterfulltext), "%", "") ;
      lV106Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV106Tclientwwds_4_tfclinom), 30, "%") ;
      lV108Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV108Tclientwwds_6_tfclinif), 20, "%") ;
      lV110Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV110Tclientwwds_8_tfclidom), 34, "%") ;
      lV112Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV112Tclientwwds_10_tfclipob), 30, "%") ;
      lV114Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV114Tclientwwds_12_tfclicp), 6, "%") ;
      lV116Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV116Tclientwwds_14_tfclicp2), 6, "%") ;
      lV118Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV118Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082G8 */
      pr_default.execute(6, new Object[] {AV98cliact, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, lV103Tclientwwds_1_filterfulltext, Integer.valueOf(AV104Tclientwwds_2_tfclicod), Integer.valueOf(AV105Tclientwwds_3_tfclicod_to), lV106Tclientwwds_4_tfclinom, AV107Tclientwwds_5_tfclinom_sel, lV108Tclientwwds_6_tfclinif, AV109Tclientwwds_7_tfclinif_sel, lV110Tclientwwds_8_tfclidom, AV111Tclientwwds_9_tfclidom_sel, lV112Tclientwwds_10_tfclipob, AV113Tclientwwds_11_tfclipob_sel, lV114Tclientwwds_12_tfclicp, AV115Tclientwwds_13_tfclicp_sel, lV116Tclientwwds_14_tfclicp2, AV117Tclientwwds_15_tfclicp2_sel, lV118Tclientwwds_16_tfprvdsc, AV119Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk82G14 = false ;
         A781PrvCod = P082G8_A781PrvCod[0] ;
         A10045CliAct = P082G8_A10045CliAct[0] ;
         A787PrvDsc = P082G8_A787PrvDsc[0] ;
         n787PrvDsc = P082G8_n787PrvDsc[0] ;
         A4828CliCp2 = P082G8_A4828CliCp2[0] ;
         A256CliCp = P082G8_A256CliCp[0] ;
         A295CliPob = P082G8_A295CliPob[0] ;
         A260CliDom = P082G8_A260CliDom[0] ;
         A278CliNif = P082G8_A278CliNif[0] ;
         A279CliNom = P082G8_A279CliNom[0] ;
         A252CliCod = P082G8_A252CliCod[0] ;
         A396EmprCod = P082G8_A396EmprCod[0] ;
         A787PrvDsc = P082G8_A787PrvDsc[0] ;
         n787PrvDsc = P082G8_n787PrvDsc[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( P082G8_A781PrvCod[0] == A781PrvCod ) )
         {
            brk82G14 = false ;
            A252CliCod = P082G8_A252CliCod[0] ;
            A396EmprCod = P082G8_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk82G14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A787PrvDsc)==0) )
         {
            AV54Option = A787PrvDsc ;
            AV57OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A787PrvDsc, "@!"))) ;
            AV53InsertIndex = 1 ;
            while ( ( AV53InsertIndex <= AV55Options.size() ) && ( GXutil.strcmp((String)AV58OptionsDesc.elementAt(-1+AV53InsertIndex), AV57OptionDesc) < 0 ) )
            {
               AV53InsertIndex = (int)(AV53InsertIndex+1) ;
            }
            AV55Options.add(AV54Option, AV53InsertIndex);
            AV58OptionsDesc.add(AV57OptionDesc, AV53InsertIndex);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), AV53InsertIndex);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82G14 )
         {
            brk82G14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tclientwwgetfilterdata.this.AV56OptionsJson;
      this.aP4[0] = tclientwwgetfilterdata.this.AV59OptionsDescJson;
      this.aP5[0] = tclientwwgetfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV56OptionsJson = "" ;
      AV59OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63Session = httpContext.getWebSession();
      AV65GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV94FilterFullText = "" ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV12TFCliNif = "" ;
      AV13TFCliNif_Sel = "" ;
      AV16TFCliDom = "" ;
      AV17TFCliDom_Sel = "" ;
      AV18TFCliPob = "" ;
      AV19TFCliPob_Sel = "" ;
      AV20TFCliCp = "" ;
      AV21TFCliCp_Sel = "" ;
      AV95TFCliCp2 = "" ;
      AV96TFCliCp2_Sel = "" ;
      AV24TFPrvDsc = "" ;
      AV25TFPrvDsc_Sel = "" ;
      A279CliNom = "" ;
      AV103Tclientwwds_1_filterfulltext = "" ;
      AV106Tclientwwds_4_tfclinom = "" ;
      AV107Tclientwwds_5_tfclinom_sel = "" ;
      AV108Tclientwwds_6_tfclinif = "" ;
      AV109Tclientwwds_7_tfclinif_sel = "" ;
      AV110Tclientwwds_8_tfclidom = "" ;
      AV111Tclientwwds_9_tfclidom_sel = "" ;
      AV112Tclientwwds_10_tfclipob = "" ;
      AV113Tclientwwds_11_tfclipob_sel = "" ;
      AV114Tclientwwds_12_tfclicp = "" ;
      AV115Tclientwwds_13_tfclicp_sel = "" ;
      AV116Tclientwwds_14_tfclicp2 = "" ;
      AV117Tclientwwds_15_tfclicp2_sel = "" ;
      AV118Tclientwwds_16_tfprvdsc = "" ;
      AV119Tclientwwds_17_tfprvdsc_sel = "" ;
      scmdbuf = "" ;
      lV103Tclientwwds_1_filterfulltext = "" ;
      lV106Tclientwwds_4_tfclinom = "" ;
      lV108Tclientwwds_6_tfclinif = "" ;
      lV110Tclientwwds_8_tfclidom = "" ;
      lV112Tclientwwds_10_tfclipob = "" ;
      lV114Tclientwwds_12_tfclicp = "" ;
      lV116Tclientwwds_14_tfclicp2 = "" ;
      lV118Tclientwwds_16_tfprvdsc = "" ;
      A278CliNif = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A4828CliCp2 = "" ;
      A787PrvDsc = "" ;
      A10045CliAct = "" ;
      AV98cliact = "" ;
      P082G2_A781PrvCod = new short[1] ;
      P082G2_A279CliNom = new String[] {""} ;
      P082G2_A10045CliAct = new String[] {""} ;
      P082G2_A787PrvDsc = new String[] {""} ;
      P082G2_n787PrvDsc = new boolean[] {false} ;
      P082G2_A4828CliCp2 = new String[] {""} ;
      P082G2_A256CliCp = new String[] {""} ;
      P082G2_A295CliPob = new String[] {""} ;
      P082G2_A260CliDom = new String[] {""} ;
      P082G2_A278CliNif = new String[] {""} ;
      P082G2_A252CliCod = new int[1] ;
      P082G2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV54Option = "" ;
      P082G3_A781PrvCod = new short[1] ;
      P082G3_A10045CliAct = new String[] {""} ;
      P082G3_A278CliNif = new String[] {""} ;
      P082G3_A787PrvDsc = new String[] {""} ;
      P082G3_n787PrvDsc = new boolean[] {false} ;
      P082G3_A4828CliCp2 = new String[] {""} ;
      P082G3_A256CliCp = new String[] {""} ;
      P082G3_A295CliPob = new String[] {""} ;
      P082G3_A260CliDom = new String[] {""} ;
      P082G3_A279CliNom = new String[] {""} ;
      P082G3_A252CliCod = new int[1] ;
      P082G3_A396EmprCod = new String[] {""} ;
      AV57OptionDesc = "" ;
      P082G4_A781PrvCod = new short[1] ;
      P082G4_A10045CliAct = new String[] {""} ;
      P082G4_A260CliDom = new String[] {""} ;
      P082G4_A787PrvDsc = new String[] {""} ;
      P082G4_n787PrvDsc = new boolean[] {false} ;
      P082G4_A4828CliCp2 = new String[] {""} ;
      P082G4_A256CliCp = new String[] {""} ;
      P082G4_A295CliPob = new String[] {""} ;
      P082G4_A278CliNif = new String[] {""} ;
      P082G4_A279CliNom = new String[] {""} ;
      P082G4_A252CliCod = new int[1] ;
      P082G4_A396EmprCod = new String[] {""} ;
      P082G5_A781PrvCod = new short[1] ;
      P082G5_A10045CliAct = new String[] {""} ;
      P082G5_A295CliPob = new String[] {""} ;
      P082G5_A787PrvDsc = new String[] {""} ;
      P082G5_n787PrvDsc = new boolean[] {false} ;
      P082G5_A4828CliCp2 = new String[] {""} ;
      P082G5_A256CliCp = new String[] {""} ;
      P082G5_A260CliDom = new String[] {""} ;
      P082G5_A278CliNif = new String[] {""} ;
      P082G5_A279CliNom = new String[] {""} ;
      P082G5_A252CliCod = new int[1] ;
      P082G5_A396EmprCod = new String[] {""} ;
      P082G6_A781PrvCod = new short[1] ;
      P082G6_A10045CliAct = new String[] {""} ;
      P082G6_A256CliCp = new String[] {""} ;
      P082G6_A787PrvDsc = new String[] {""} ;
      P082G6_n787PrvDsc = new boolean[] {false} ;
      P082G6_A4828CliCp2 = new String[] {""} ;
      P082G6_A295CliPob = new String[] {""} ;
      P082G6_A260CliDom = new String[] {""} ;
      P082G6_A278CliNif = new String[] {""} ;
      P082G6_A279CliNom = new String[] {""} ;
      P082G6_A252CliCod = new int[1] ;
      P082G6_A396EmprCod = new String[] {""} ;
      P082G7_A781PrvCod = new short[1] ;
      P082G7_A10045CliAct = new String[] {""} ;
      P082G7_A4828CliCp2 = new String[] {""} ;
      P082G7_A787PrvDsc = new String[] {""} ;
      P082G7_n787PrvDsc = new boolean[] {false} ;
      P082G7_A256CliCp = new String[] {""} ;
      P082G7_A295CliPob = new String[] {""} ;
      P082G7_A260CliDom = new String[] {""} ;
      P082G7_A278CliNif = new String[] {""} ;
      P082G7_A279CliNom = new String[] {""} ;
      P082G7_A252CliCod = new int[1] ;
      P082G7_A396EmprCod = new String[] {""} ;
      P082G8_A781PrvCod = new short[1] ;
      P082G8_A10045CliAct = new String[] {""} ;
      P082G8_A787PrvDsc = new String[] {""} ;
      P082G8_n787PrvDsc = new boolean[] {false} ;
      P082G8_A4828CliCp2 = new String[] {""} ;
      P082G8_A256CliCp = new String[] {""} ;
      P082G8_A295CliPob = new String[] {""} ;
      P082G8_A260CliDom = new String[] {""} ;
      P082G8_A278CliNif = new String[] {""} ;
      P082G8_A279CliNom = new String[] {""} ;
      P082G8_A252CliCod = new int[1] ;
      P082G8_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P082G2_A781PrvCod, P082G2_A279CliNom, P082G2_A10045CliAct, P082G2_A787PrvDsc, P082G2_n787PrvDsc, P082G2_A4828CliCp2, P082G2_A256CliCp, P082G2_A295CliPob, P082G2_A260CliDom, P082G2_A278CliNif,
            P082G2_A252CliCod, P082G2_A396EmprCod
            }
            , new Object[] {
            P082G3_A781PrvCod, P082G3_A10045CliAct, P082G3_A278CliNif, P082G3_A787PrvDsc, P082G3_n787PrvDsc, P082G3_A4828CliCp2, P082G3_A256CliCp, P082G3_A295CliPob, P082G3_A260CliDom, P082G3_A279CliNom,
            P082G3_A252CliCod, P082G3_A396EmprCod
            }
            , new Object[] {
            P082G4_A781PrvCod, P082G4_A10045CliAct, P082G4_A260CliDom, P082G4_A787PrvDsc, P082G4_n787PrvDsc, P082G4_A4828CliCp2, P082G4_A256CliCp, P082G4_A295CliPob, P082G4_A278CliNif, P082G4_A279CliNom,
            P082G4_A252CliCod, P082G4_A396EmprCod
            }
            , new Object[] {
            P082G5_A781PrvCod, P082G5_A10045CliAct, P082G5_A295CliPob, P082G5_A787PrvDsc, P082G5_n787PrvDsc, P082G5_A4828CliCp2, P082G5_A256CliCp, P082G5_A260CliDom, P082G5_A278CliNif, P082G5_A279CliNom,
            P082G5_A252CliCod, P082G5_A396EmprCod
            }
            , new Object[] {
            P082G6_A781PrvCod, P082G6_A10045CliAct, P082G6_A256CliCp, P082G6_A787PrvDsc, P082G6_n787PrvDsc, P082G6_A4828CliCp2, P082G6_A295CliPob, P082G6_A260CliDom, P082G6_A278CliNif, P082G6_A279CliNom,
            P082G6_A252CliCod, P082G6_A396EmprCod
            }
            , new Object[] {
            P082G7_A781PrvCod, P082G7_A10045CliAct, P082G7_A4828CliCp2, P082G7_A787PrvDsc, P082G7_n787PrvDsc, P082G7_A256CliCp, P082G7_A295CliPob, P082G7_A260CliDom, P082G7_A278CliNif, P082G7_A279CliNom,
            P082G7_A252CliCod, P082G7_A396EmprCod
            }
            , new Object[] {
            P082G8_A781PrvCod, P082G8_A10045CliAct, P082G8_A787PrvDsc, P082G8_n787PrvDsc, P082G8_A4828CliCp2, P082G8_A256CliCp, P082G8_A295CliPob, P082G8_A260CliDom, P082G8_A278CliNif, P082G8_A279CliNom,
            P082G8_A252CliCod, P082G8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A781PrvCod ;
   private short Gx_err ;
   private int AV101GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV104Tclientwwds_2_tfclicod ;
   private int AV105Tclientwwds_3_tfclicod_to ;
   private int A252CliCod ;
   private int AV53InsertIndex ;
   private long AV62count ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV12TFCliNif ;
   private String AV13TFCliNif_Sel ;
   private String AV16TFCliDom ;
   private String AV17TFCliDom_Sel ;
   private String AV18TFCliPob ;
   private String AV19TFCliPob_Sel ;
   private String AV20TFCliCp ;
   private String AV21TFCliCp_Sel ;
   private String AV95TFCliCp2 ;
   private String AV96TFCliCp2_Sel ;
   private String AV24TFPrvDsc ;
   private String AV25TFPrvDsc_Sel ;
   private String A279CliNom ;
   private String AV106Tclientwwds_4_tfclinom ;
   private String AV107Tclientwwds_5_tfclinom_sel ;
   private String AV108Tclientwwds_6_tfclinif ;
   private String AV109Tclientwwds_7_tfclinif_sel ;
   private String AV110Tclientwwds_8_tfclidom ;
   private String AV111Tclientwwds_9_tfclidom_sel ;
   private String AV112Tclientwwds_10_tfclipob ;
   private String AV113Tclientwwds_11_tfclipob_sel ;
   private String AV114Tclientwwds_12_tfclicp ;
   private String AV115Tclientwwds_13_tfclicp_sel ;
   private String AV116Tclientwwds_14_tfclicp2 ;
   private String AV117Tclientwwds_15_tfclicp2_sel ;
   private String AV118Tclientwwds_16_tfprvdsc ;
   private String AV119Tclientwwds_17_tfprvdsc_sel ;
   private String scmdbuf ;
   private String lV106Tclientwwds_4_tfclinom ;
   private String lV108Tclientwwds_6_tfclinif ;
   private String lV110Tclientwwds_8_tfclidom ;
   private String lV112Tclientwwds_10_tfclipob ;
   private String lV114Tclientwwds_12_tfclicp ;
   private String lV116Tclientwwds_14_tfclicp2 ;
   private String lV118Tclientwwds_16_tfprvdsc ;
   private String A278CliNif ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A4828CliCp2 ;
   private String A787PrvDsc ;
   private String A10045CliAct ;
   private String AV98cliact ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk82G2 ;
   private boolean n787PrvDsc ;
   private boolean brk82G4 ;
   private boolean brk82G6 ;
   private boolean brk82G8 ;
   private boolean brk82G10 ;
   private boolean brk82G12 ;
   private boolean brk82G14 ;
   private String AV56OptionsJson ;
   private String AV59OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV52DDOName ;
   private String AV50SearchTxt ;
   private String AV51SearchTxtTo ;
   private String AV94FilterFullText ;
   private String AV103Tclientwwds_1_filterfulltext ;
   private String lV103Tclientwwds_1_filterfulltext ;
   private String AV54Option ;
   private String AV57OptionDesc ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P082G2_A781PrvCod ;
   private String[] P082G2_A279CliNom ;
   private String[] P082G2_A10045CliAct ;
   private String[] P082G2_A787PrvDsc ;
   private boolean[] P082G2_n787PrvDsc ;
   private String[] P082G2_A4828CliCp2 ;
   private String[] P082G2_A256CliCp ;
   private String[] P082G2_A295CliPob ;
   private String[] P082G2_A260CliDom ;
   private String[] P082G2_A278CliNif ;
   private int[] P082G2_A252CliCod ;
   private String[] P082G2_A396EmprCod ;
   private short[] P082G3_A781PrvCod ;
   private String[] P082G3_A10045CliAct ;
   private String[] P082G3_A278CliNif ;
   private String[] P082G3_A787PrvDsc ;
   private boolean[] P082G3_n787PrvDsc ;
   private String[] P082G3_A4828CliCp2 ;
   private String[] P082G3_A256CliCp ;
   private String[] P082G3_A295CliPob ;
   private String[] P082G3_A260CliDom ;
   private String[] P082G3_A279CliNom ;
   private int[] P082G3_A252CliCod ;
   private String[] P082G3_A396EmprCod ;
   private short[] P082G4_A781PrvCod ;
   private String[] P082G4_A10045CliAct ;
   private String[] P082G4_A260CliDom ;
   private String[] P082G4_A787PrvDsc ;
   private boolean[] P082G4_n787PrvDsc ;
   private String[] P082G4_A4828CliCp2 ;
   private String[] P082G4_A256CliCp ;
   private String[] P082G4_A295CliPob ;
   private String[] P082G4_A278CliNif ;
   private String[] P082G4_A279CliNom ;
   private int[] P082G4_A252CliCod ;
   private String[] P082G4_A396EmprCod ;
   private short[] P082G5_A781PrvCod ;
   private String[] P082G5_A10045CliAct ;
   private String[] P082G5_A295CliPob ;
   private String[] P082G5_A787PrvDsc ;
   private boolean[] P082G5_n787PrvDsc ;
   private String[] P082G5_A4828CliCp2 ;
   private String[] P082G5_A256CliCp ;
   private String[] P082G5_A260CliDom ;
   private String[] P082G5_A278CliNif ;
   private String[] P082G5_A279CliNom ;
   private int[] P082G5_A252CliCod ;
   private String[] P082G5_A396EmprCod ;
   private short[] P082G6_A781PrvCod ;
   private String[] P082G6_A10045CliAct ;
   private String[] P082G6_A256CliCp ;
   private String[] P082G6_A787PrvDsc ;
   private boolean[] P082G6_n787PrvDsc ;
   private String[] P082G6_A4828CliCp2 ;
   private String[] P082G6_A295CliPob ;
   private String[] P082G6_A260CliDom ;
   private String[] P082G6_A278CliNif ;
   private String[] P082G6_A279CliNom ;
   private int[] P082G6_A252CliCod ;
   private String[] P082G6_A396EmprCod ;
   private short[] P082G7_A781PrvCod ;
   private String[] P082G7_A10045CliAct ;
   private String[] P082G7_A4828CliCp2 ;
   private String[] P082G7_A787PrvDsc ;
   private boolean[] P082G7_n787PrvDsc ;
   private String[] P082G7_A256CliCp ;
   private String[] P082G7_A295CliPob ;
   private String[] P082G7_A260CliDom ;
   private String[] P082G7_A278CliNif ;
   private String[] P082G7_A279CliNom ;
   private int[] P082G7_A252CliCod ;
   private String[] P082G7_A396EmprCod ;
   private short[] P082G8_A781PrvCod ;
   private String[] P082G8_A10045CliAct ;
   private String[] P082G8_A787PrvDsc ;
   private boolean[] P082G8_n787PrvDsc ;
   private String[] P082G8_A4828CliCp2 ;
   private String[] P082G8_A256CliCp ;
   private String[] P082G8_A295CliPob ;
   private String[] P082G8_A260CliDom ;
   private String[] P082G8_A278CliNif ;
   private String[] P082G8_A279CliNom ;
   private int[] P082G8_A252CliCod ;
   private String[] P082G8_A396EmprCod ;
   private GXSimpleCollection<String> AV55Options ;
   private GXSimpleCollection<String> AV58OptionsDesc ;
   private GXSimpleCollection<String> AV60OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV65GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV66GridStateFilterValue ;
}

final  class tclientwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P082G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliNom, T1.CliAct, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P082G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[25];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T1.CliNif, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliNif" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P082G4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T1.CliDom, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliDom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P082G5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T1.CliPob, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliPob" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P082G6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[25];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T1.CliCp, T2.PrvDsc, T1.CliCp2, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliCp" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P082G7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[25];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T1.CliCp2, T2.PrvDsc, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CliCp2" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P082G8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Tclientwwds_1_filterfulltext ,
                                          int AV104Tclientwwds_2_tfclicod ,
                                          int AV105Tclientwwds_3_tfclicod_to ,
                                          String AV107Tclientwwds_5_tfclinom_sel ,
                                          String AV106Tclientwwds_4_tfclinom ,
                                          String AV109Tclientwwds_7_tfclinif_sel ,
                                          String AV108Tclientwwds_6_tfclinif ,
                                          String AV111Tclientwwds_9_tfclidom_sel ,
                                          String AV110Tclientwwds_8_tfclidom ,
                                          String AV113Tclientwwds_11_tfclipob_sel ,
                                          String AV112Tclientwwds_10_tfclipob ,
                                          String AV115Tclientwwds_13_tfclicp_sel ,
                                          String AV114Tclientwwds_12_tfclicp ,
                                          String AV117Tclientwwds_15_tfclicp2_sel ,
                                          String AV116Tclientwwds_14_tfclicp2 ,
                                          String AV119Tclientwwds_17_tfprvdsc_sel ,
                                          String AV118Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          String A10045CliAct ,
                                          String AV98cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[25];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV103Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV108Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV116Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvCod" ;
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
                  return conditional_P082G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 1 :
                  return conditional_P082G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 2 :
                  return conditional_P082G4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 3 :
                  return conditional_P082G5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 4 :
                  return conditional_P082G6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 5 :
                  return conditional_P082G7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 6 :
                  return conditional_P082G8(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P082G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P082G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P082G4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P082G5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P082G6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P082G7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P082G8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 34);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 34);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 34);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
      }
   }

}

