package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmanufawwgetfilterdata extends GXProcedure
{
   public tmanufawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmanufawwgetfilterdata.class ), "" );
   }

   public tmanufawwgetfilterdata( int remoteHandle ,
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
      tmanufawwgetfilterdata.this.aP5 = new String[] {""};
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
      tmanufawwgetfilterdata.this.AV38DDOName = aP0;
      tmanufawwgetfilterdata.this.AV36SearchTxt = aP1;
      tmanufawwgetfilterdata.this.AV37SearchTxtTo = aP2;
      tmanufawwgetfilterdata.this.aP3 = aP3;
      tmanufawwgetfilterdata.this.aP4 = aP4;
      tmanufawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANNIF") == 0 )
      {
         /* Execute user subroutine: 'LOADMANNIFOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANDOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANDOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADMANPOBOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANCPO") == 0 )
      {
         /* Execute user subroutine: 'LOADMANCPOOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANCP2") == 0 )
      {
         /* Execute user subroutine: 'LOADMANCP2OPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRVDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANTEL1") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTEL1OPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANTEL2") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTEL2OPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MANFAX") == 0 )
      {
         /* Execute user subroutine: 'LOADMANFAXOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("TrabajosExternos.TMANUFAWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternos.TMANUFAWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("TrabajosExternos.TMANUFAWWGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV10TFManCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFManCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF") == 0 )
         {
            AV32TFManNif = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF_SEL") == 0 )
         {
            AV33TFManNif_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV12TFManNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV13TFManNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM") == 0 )
         {
            AV14TFManDom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM_SEL") == 0 )
         {
            AV15TFManDom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB") == 0 )
         {
            AV16TFManPob = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB_SEL") == 0 )
         {
            AV17TFManPob_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO") == 0 )
         {
            AV18TFManCpo = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO_SEL") == 0 )
         {
            AV19TFManCpo_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2") == 0 )
         {
            AV20TFManCp2 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2_SEL") == 0 )
         {
            AV21TFManCp2_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV22TFPrvCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFPrvCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV24TFPrvDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV25TFPrvDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1") == 0 )
         {
            AV26TFManTel1 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1_SEL") == 0 )
         {
            AV27TFManTel1_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2") == 0 )
         {
            AV28TFManTel2 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2_SEL") == 0 )
         {
            AV29TFManTel2_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX") == 0 )
         {
            AV30TFManFax = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX_SEL") == 0 )
         {
            AV31TFManFax_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDTO") == 0 )
         {
            AV34TFManDto = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFManDto_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMANNIFOPTIONS' Routine */
      returnInSub = false ;
      AV32TFManNif = AV36SearchTxt ;
      AV33TFManNif_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09102 */
      pr_default.execute(0, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9102 = false ;
         A3302ManNif = P09102_A3302ManNif[0] ;
         n3302ManNif = P09102_n3302ManNif[0] ;
         A3409ManDto = P09102_A3409ManDto[0] ;
         n3409ManDto = P09102_n3409ManDto[0] ;
         A3301ManFax = P09102_A3301ManFax[0] ;
         n3301ManFax = P09102_n3301ManFax[0] ;
         A3300ManTel2 = P09102_A3300ManTel2[0] ;
         n3300ManTel2 = P09102_n3300ManTel2[0] ;
         A3299ManTel1 = P09102_A3299ManTel1[0] ;
         n3299ManTel1 = P09102_n3299ManTel1[0] ;
         A787PrvDsc = P09102_A787PrvDsc[0] ;
         n787PrvDsc = P09102_n787PrvDsc[0] ;
         A781PrvCod = P09102_A781PrvCod[0] ;
         n781PrvCod = P09102_n781PrvCod[0] ;
         A10743ManCp2 = P09102_A10743ManCp2[0] ;
         n10743ManCp2 = P09102_n10743ManCp2[0] ;
         A2252ManCpo = P09102_A2252ManCpo[0] ;
         n2252ManCpo = P09102_n2252ManCpo[0] ;
         A2251ManPob = P09102_A2251ManPob[0] ;
         n2251ManPob = P09102_n2251ManPob[0] ;
         A2250ManDom = P09102_A2250ManDom[0] ;
         n2250ManDom = P09102_n2250ManDom[0] ;
         A2249ManNom = P09102_A2249ManNom[0] ;
         n2249ManNom = P09102_n2249ManNom[0] ;
         A2248ManCod = P09102_A2248ManCod[0] ;
         A396EmprCod = P09102_A396EmprCod[0] ;
         A787PrvDsc = P09102_A787PrvDsc[0] ;
         n787PrvDsc = P09102_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09102_A3302ManNif[0], A3302ManNif) == 0 ) )
         {
            brk9102 = false ;
            A2248ManCod = P09102_A2248ManCod[0] ;
            A396EmprCod = P09102_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9102 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3302ManNif)==0) )
         {
            AV40Option = A3302ManNif ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3302ManNif, "@!"))) ;
            AV41Options.add(AV40Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9102 )
         {
            brk9102 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMANNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFManNom = AV36SearchTxt ;
      AV13TFManNom_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09103 */
      pr_default.execute(1, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9104 = false ;
         A2249ManNom = P09103_A2249ManNom[0] ;
         n2249ManNom = P09103_n2249ManNom[0] ;
         A3409ManDto = P09103_A3409ManDto[0] ;
         n3409ManDto = P09103_n3409ManDto[0] ;
         A3301ManFax = P09103_A3301ManFax[0] ;
         n3301ManFax = P09103_n3301ManFax[0] ;
         A3300ManTel2 = P09103_A3300ManTel2[0] ;
         n3300ManTel2 = P09103_n3300ManTel2[0] ;
         A3299ManTel1 = P09103_A3299ManTel1[0] ;
         n3299ManTel1 = P09103_n3299ManTel1[0] ;
         A787PrvDsc = P09103_A787PrvDsc[0] ;
         n787PrvDsc = P09103_n787PrvDsc[0] ;
         A781PrvCod = P09103_A781PrvCod[0] ;
         n781PrvCod = P09103_n781PrvCod[0] ;
         A10743ManCp2 = P09103_A10743ManCp2[0] ;
         n10743ManCp2 = P09103_n10743ManCp2[0] ;
         A2252ManCpo = P09103_A2252ManCpo[0] ;
         n2252ManCpo = P09103_n2252ManCpo[0] ;
         A2251ManPob = P09103_A2251ManPob[0] ;
         n2251ManPob = P09103_n2251ManPob[0] ;
         A2250ManDom = P09103_A2250ManDom[0] ;
         n2250ManDom = P09103_n2250ManDom[0] ;
         A3302ManNif = P09103_A3302ManNif[0] ;
         n3302ManNif = P09103_n3302ManNif[0] ;
         A2248ManCod = P09103_A2248ManCod[0] ;
         A396EmprCod = P09103_A396EmprCod[0] ;
         A787PrvDsc = P09103_A787PrvDsc[0] ;
         n787PrvDsc = P09103_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09103_A2249ManNom[0], A2249ManNom) == 0 ) )
         {
            brk9104 = false ;
            A2248ManCod = P09103_A2248ManCod[0] ;
            A396EmprCod = P09103_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9104 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2249ManNom)==0) )
         {
            AV40Option = A2249ManNom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9104 )
         {
            brk9104 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMANDOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFManDom = AV36SearchTxt ;
      AV15TFManDom_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09104 */
      pr_default.execute(2, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9106 = false ;
         A2250ManDom = P09104_A2250ManDom[0] ;
         n2250ManDom = P09104_n2250ManDom[0] ;
         A3409ManDto = P09104_A3409ManDto[0] ;
         n3409ManDto = P09104_n3409ManDto[0] ;
         A3301ManFax = P09104_A3301ManFax[0] ;
         n3301ManFax = P09104_n3301ManFax[0] ;
         A3300ManTel2 = P09104_A3300ManTel2[0] ;
         n3300ManTel2 = P09104_n3300ManTel2[0] ;
         A3299ManTel1 = P09104_A3299ManTel1[0] ;
         n3299ManTel1 = P09104_n3299ManTel1[0] ;
         A787PrvDsc = P09104_A787PrvDsc[0] ;
         n787PrvDsc = P09104_n787PrvDsc[0] ;
         A781PrvCod = P09104_A781PrvCod[0] ;
         n781PrvCod = P09104_n781PrvCod[0] ;
         A10743ManCp2 = P09104_A10743ManCp2[0] ;
         n10743ManCp2 = P09104_n10743ManCp2[0] ;
         A2252ManCpo = P09104_A2252ManCpo[0] ;
         n2252ManCpo = P09104_n2252ManCpo[0] ;
         A2251ManPob = P09104_A2251ManPob[0] ;
         n2251ManPob = P09104_n2251ManPob[0] ;
         A2249ManNom = P09104_A2249ManNom[0] ;
         n2249ManNom = P09104_n2249ManNom[0] ;
         A3302ManNif = P09104_A3302ManNif[0] ;
         n3302ManNif = P09104_n3302ManNif[0] ;
         A2248ManCod = P09104_A2248ManCod[0] ;
         A396EmprCod = P09104_A396EmprCod[0] ;
         A787PrvDsc = P09104_A787PrvDsc[0] ;
         n787PrvDsc = P09104_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09104_A2250ManDom[0], A2250ManDom) == 0 ) )
         {
            brk9106 = false ;
            A2248ManCod = P09104_A2248ManCod[0] ;
            A396EmprCod = P09104_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9106 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A2250ManDom)==0) )
         {
            AV40Option = A2250ManDom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9106 )
         {
            brk9106 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMANPOBOPTIONS' Routine */
      returnInSub = false ;
      AV16TFManPob = AV36SearchTxt ;
      AV17TFManPob_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09105 */
      pr_default.execute(3, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9108 = false ;
         A2251ManPob = P09105_A2251ManPob[0] ;
         n2251ManPob = P09105_n2251ManPob[0] ;
         A3409ManDto = P09105_A3409ManDto[0] ;
         n3409ManDto = P09105_n3409ManDto[0] ;
         A3301ManFax = P09105_A3301ManFax[0] ;
         n3301ManFax = P09105_n3301ManFax[0] ;
         A3300ManTel2 = P09105_A3300ManTel2[0] ;
         n3300ManTel2 = P09105_n3300ManTel2[0] ;
         A3299ManTel1 = P09105_A3299ManTel1[0] ;
         n3299ManTel1 = P09105_n3299ManTel1[0] ;
         A787PrvDsc = P09105_A787PrvDsc[0] ;
         n787PrvDsc = P09105_n787PrvDsc[0] ;
         A781PrvCod = P09105_A781PrvCod[0] ;
         n781PrvCod = P09105_n781PrvCod[0] ;
         A10743ManCp2 = P09105_A10743ManCp2[0] ;
         n10743ManCp2 = P09105_n10743ManCp2[0] ;
         A2252ManCpo = P09105_A2252ManCpo[0] ;
         n2252ManCpo = P09105_n2252ManCpo[0] ;
         A2250ManDom = P09105_A2250ManDom[0] ;
         n2250ManDom = P09105_n2250ManDom[0] ;
         A2249ManNom = P09105_A2249ManNom[0] ;
         n2249ManNom = P09105_n2249ManNom[0] ;
         A3302ManNif = P09105_A3302ManNif[0] ;
         n3302ManNif = P09105_n3302ManNif[0] ;
         A2248ManCod = P09105_A2248ManCod[0] ;
         A396EmprCod = P09105_A396EmprCod[0] ;
         A787PrvDsc = P09105_A787PrvDsc[0] ;
         n787PrvDsc = P09105_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09105_A2251ManPob[0], A2251ManPob) == 0 ) )
         {
            brk9108 = false ;
            A2248ManCod = P09105_A2248ManCod[0] ;
            A396EmprCod = P09105_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9108 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A2251ManPob)==0) )
         {
            AV40Option = A2251ManPob ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9108 )
         {
            brk9108 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMANCPOOPTIONS' Routine */
      returnInSub = false ;
      AV18TFManCpo = AV36SearchTxt ;
      AV19TFManCpo_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09106 */
      pr_default.execute(4, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk91010 = false ;
         A2252ManCpo = P09106_A2252ManCpo[0] ;
         n2252ManCpo = P09106_n2252ManCpo[0] ;
         A3409ManDto = P09106_A3409ManDto[0] ;
         n3409ManDto = P09106_n3409ManDto[0] ;
         A3301ManFax = P09106_A3301ManFax[0] ;
         n3301ManFax = P09106_n3301ManFax[0] ;
         A3300ManTel2 = P09106_A3300ManTel2[0] ;
         n3300ManTel2 = P09106_n3300ManTel2[0] ;
         A3299ManTel1 = P09106_A3299ManTel1[0] ;
         n3299ManTel1 = P09106_n3299ManTel1[0] ;
         A787PrvDsc = P09106_A787PrvDsc[0] ;
         n787PrvDsc = P09106_n787PrvDsc[0] ;
         A781PrvCod = P09106_A781PrvCod[0] ;
         n781PrvCod = P09106_n781PrvCod[0] ;
         A10743ManCp2 = P09106_A10743ManCp2[0] ;
         n10743ManCp2 = P09106_n10743ManCp2[0] ;
         A2251ManPob = P09106_A2251ManPob[0] ;
         n2251ManPob = P09106_n2251ManPob[0] ;
         A2250ManDom = P09106_A2250ManDom[0] ;
         n2250ManDom = P09106_n2250ManDom[0] ;
         A2249ManNom = P09106_A2249ManNom[0] ;
         n2249ManNom = P09106_n2249ManNom[0] ;
         A3302ManNif = P09106_A3302ManNif[0] ;
         n3302ManNif = P09106_n3302ManNif[0] ;
         A2248ManCod = P09106_A2248ManCod[0] ;
         A396EmprCod = P09106_A396EmprCod[0] ;
         A787PrvDsc = P09106_A787PrvDsc[0] ;
         n787PrvDsc = P09106_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09106_A2252ManCpo[0], A2252ManCpo) == 0 ) )
         {
            brk91010 = false ;
            A2248ManCod = P09106_A2248ManCod[0] ;
            A396EmprCod = P09106_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk91010 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A2252ManCpo)==0) )
         {
            AV40Option = A2252ManCpo ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91010 )
         {
            brk91010 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMANCP2OPTIONS' Routine */
      returnInSub = false ;
      AV20TFManCp2 = AV36SearchTxt ;
      AV21TFManCp2_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09107 */
      pr_default.execute(5, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk91012 = false ;
         A10743ManCp2 = P09107_A10743ManCp2[0] ;
         n10743ManCp2 = P09107_n10743ManCp2[0] ;
         A3409ManDto = P09107_A3409ManDto[0] ;
         n3409ManDto = P09107_n3409ManDto[0] ;
         A3301ManFax = P09107_A3301ManFax[0] ;
         n3301ManFax = P09107_n3301ManFax[0] ;
         A3300ManTel2 = P09107_A3300ManTel2[0] ;
         n3300ManTel2 = P09107_n3300ManTel2[0] ;
         A3299ManTel1 = P09107_A3299ManTel1[0] ;
         n3299ManTel1 = P09107_n3299ManTel1[0] ;
         A787PrvDsc = P09107_A787PrvDsc[0] ;
         n787PrvDsc = P09107_n787PrvDsc[0] ;
         A781PrvCod = P09107_A781PrvCod[0] ;
         n781PrvCod = P09107_n781PrvCod[0] ;
         A2252ManCpo = P09107_A2252ManCpo[0] ;
         n2252ManCpo = P09107_n2252ManCpo[0] ;
         A2251ManPob = P09107_A2251ManPob[0] ;
         n2251ManPob = P09107_n2251ManPob[0] ;
         A2250ManDom = P09107_A2250ManDom[0] ;
         n2250ManDom = P09107_n2250ManDom[0] ;
         A2249ManNom = P09107_A2249ManNom[0] ;
         n2249ManNom = P09107_n2249ManNom[0] ;
         A3302ManNif = P09107_A3302ManNif[0] ;
         n3302ManNif = P09107_n3302ManNif[0] ;
         A2248ManCod = P09107_A2248ManCod[0] ;
         A396EmprCod = P09107_A396EmprCod[0] ;
         A787PrvDsc = P09107_A787PrvDsc[0] ;
         n787PrvDsc = P09107_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09107_A10743ManCp2[0], A10743ManCp2) == 0 ) )
         {
            brk91012 = false ;
            A2248ManCod = P09107_A2248ManCod[0] ;
            A396EmprCod = P09107_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk91012 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A10743ManCp2)==0) )
         {
            AV40Option = A10743ManCp2 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91012 )
         {
            brk91012 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPrvDsc = AV36SearchTxt ;
      AV25TFPrvDsc_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09108 */
      pr_default.execute(6, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk91014 = false ;
         A781PrvCod = P09108_A781PrvCod[0] ;
         n781PrvCod = P09108_n781PrvCod[0] ;
         A3409ManDto = P09108_A3409ManDto[0] ;
         n3409ManDto = P09108_n3409ManDto[0] ;
         A3301ManFax = P09108_A3301ManFax[0] ;
         n3301ManFax = P09108_n3301ManFax[0] ;
         A3300ManTel2 = P09108_A3300ManTel2[0] ;
         n3300ManTel2 = P09108_n3300ManTel2[0] ;
         A3299ManTel1 = P09108_A3299ManTel1[0] ;
         n3299ManTel1 = P09108_n3299ManTel1[0] ;
         A787PrvDsc = P09108_A787PrvDsc[0] ;
         n787PrvDsc = P09108_n787PrvDsc[0] ;
         A10743ManCp2 = P09108_A10743ManCp2[0] ;
         n10743ManCp2 = P09108_n10743ManCp2[0] ;
         A2252ManCpo = P09108_A2252ManCpo[0] ;
         n2252ManCpo = P09108_n2252ManCpo[0] ;
         A2251ManPob = P09108_A2251ManPob[0] ;
         n2251ManPob = P09108_n2251ManPob[0] ;
         A2250ManDom = P09108_A2250ManDom[0] ;
         n2250ManDom = P09108_n2250ManDom[0] ;
         A2249ManNom = P09108_A2249ManNom[0] ;
         n2249ManNom = P09108_n2249ManNom[0] ;
         A3302ManNif = P09108_A3302ManNif[0] ;
         n3302ManNif = P09108_n3302ManNif[0] ;
         A2248ManCod = P09108_A2248ManCod[0] ;
         A396EmprCod = P09108_A396EmprCod[0] ;
         A787PrvDsc = P09108_A787PrvDsc[0] ;
         n787PrvDsc = P09108_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( P09108_A781PrvCod[0] == A781PrvCod ) )
         {
            brk91014 = false ;
            A2248ManCod = P09108_A2248ManCod[0] ;
            A396EmprCod = P09108_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk91014 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A787PrvDsc)==0) )
         {
            AV40Option = A787PrvDsc ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A787PrvDsc, "@!"))) ;
            AV39InsertIndex = 1 ;
            while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV44OptionsDesc.elementAt(-1+AV39InsertIndex), AV43OptionDesc) < 0 ) )
            {
               AV39InsertIndex = (int)(AV39InsertIndex+1) ;
            }
            AV41Options.add(AV40Option, AV39InsertIndex);
            AV44OptionsDesc.add(AV43OptionDesc, AV39InsertIndex);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91014 )
         {
            brk91014 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADMANTEL1OPTIONS' Routine */
      returnInSub = false ;
      AV26TFManTel1 = AV36SearchTxt ;
      AV27TFManTel1_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P09109 */
      pr_default.execute(7, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk91016 = false ;
         A3299ManTel1 = P09109_A3299ManTel1[0] ;
         n3299ManTel1 = P09109_n3299ManTel1[0] ;
         A3409ManDto = P09109_A3409ManDto[0] ;
         n3409ManDto = P09109_n3409ManDto[0] ;
         A3301ManFax = P09109_A3301ManFax[0] ;
         n3301ManFax = P09109_n3301ManFax[0] ;
         A3300ManTel2 = P09109_A3300ManTel2[0] ;
         n3300ManTel2 = P09109_n3300ManTel2[0] ;
         A787PrvDsc = P09109_A787PrvDsc[0] ;
         n787PrvDsc = P09109_n787PrvDsc[0] ;
         A781PrvCod = P09109_A781PrvCod[0] ;
         n781PrvCod = P09109_n781PrvCod[0] ;
         A10743ManCp2 = P09109_A10743ManCp2[0] ;
         n10743ManCp2 = P09109_n10743ManCp2[0] ;
         A2252ManCpo = P09109_A2252ManCpo[0] ;
         n2252ManCpo = P09109_n2252ManCpo[0] ;
         A2251ManPob = P09109_A2251ManPob[0] ;
         n2251ManPob = P09109_n2251ManPob[0] ;
         A2250ManDom = P09109_A2250ManDom[0] ;
         n2250ManDom = P09109_n2250ManDom[0] ;
         A2249ManNom = P09109_A2249ManNom[0] ;
         n2249ManNom = P09109_n2249ManNom[0] ;
         A3302ManNif = P09109_A3302ManNif[0] ;
         n3302ManNif = P09109_n3302ManNif[0] ;
         A2248ManCod = P09109_A2248ManCod[0] ;
         A396EmprCod = P09109_A396EmprCod[0] ;
         A787PrvDsc = P09109_A787PrvDsc[0] ;
         n787PrvDsc = P09109_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09109_A3299ManTel1[0], A3299ManTel1) == 0 ) )
         {
            brk91016 = false ;
            A2248ManCod = P09109_A2248ManCod[0] ;
            A396EmprCod = P09109_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk91016 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A3299ManTel1)==0) )
         {
            AV40Option = A3299ManTel1 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91016 )
         {
            brk91016 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADMANTEL2OPTIONS' Routine */
      returnInSub = false ;
      AV28TFManTel2 = AV36SearchTxt ;
      AV29TFManTel2_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P091010 */
      pr_default.execute(8, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk91018 = false ;
         A3300ManTel2 = P091010_A3300ManTel2[0] ;
         n3300ManTel2 = P091010_n3300ManTel2[0] ;
         A3409ManDto = P091010_A3409ManDto[0] ;
         n3409ManDto = P091010_n3409ManDto[0] ;
         A3301ManFax = P091010_A3301ManFax[0] ;
         n3301ManFax = P091010_n3301ManFax[0] ;
         A3299ManTel1 = P091010_A3299ManTel1[0] ;
         n3299ManTel1 = P091010_n3299ManTel1[0] ;
         A787PrvDsc = P091010_A787PrvDsc[0] ;
         n787PrvDsc = P091010_n787PrvDsc[0] ;
         A781PrvCod = P091010_A781PrvCod[0] ;
         n781PrvCod = P091010_n781PrvCod[0] ;
         A10743ManCp2 = P091010_A10743ManCp2[0] ;
         n10743ManCp2 = P091010_n10743ManCp2[0] ;
         A2252ManCpo = P091010_A2252ManCpo[0] ;
         n2252ManCpo = P091010_n2252ManCpo[0] ;
         A2251ManPob = P091010_A2251ManPob[0] ;
         n2251ManPob = P091010_n2251ManPob[0] ;
         A2250ManDom = P091010_A2250ManDom[0] ;
         n2250ManDom = P091010_n2250ManDom[0] ;
         A2249ManNom = P091010_A2249ManNom[0] ;
         n2249ManNom = P091010_n2249ManNom[0] ;
         A3302ManNif = P091010_A3302ManNif[0] ;
         n3302ManNif = P091010_n3302ManNif[0] ;
         A2248ManCod = P091010_A2248ManCod[0] ;
         A396EmprCod = P091010_A396EmprCod[0] ;
         A787PrvDsc = P091010_A787PrvDsc[0] ;
         n787PrvDsc = P091010_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P091010_A3300ManTel2[0], A3300ManTel2) == 0 ) )
         {
            brk91018 = false ;
            A2248ManCod = P091010_A2248ManCod[0] ;
            A396EmprCod = P091010_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk91018 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A3300ManTel2)==0) )
         {
            AV40Option = A3300ManTel2 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91018 )
         {
            brk91018 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADMANFAXOPTIONS' Routine */
      returnInSub = false ;
      AV30TFManFax = AV36SearchTxt ;
      AV31TFManFax_Sel = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = AV54FilterFullText ;
      AV60Trabajosexternos_tmanufawwds_2_tfmancod = AV10TFManCod ;
      AV61Trabajosexternos_tmanufawwds_3_tfmancod_to = AV11TFManCod_To ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = AV32TFManNif ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV33TFManNif_Sel ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = AV12TFManNom ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV13TFManNom_Sel ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = AV14TFManDom ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV15TFManDom_Sel ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = AV16TFManPob ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV17TFManPob_Sel ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = AV18TFManCpo ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV19TFManCpo_Sel ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = AV20TFManCp2 ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV21TFManCp2_Sel ;
      AV74Trabajosexternos_tmanufawwds_16_tfprvcod = AV22TFPrvCod ;
      AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV23TFPrvCod_To ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = AV24TFPrvDsc ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV25TFPrvDsc_Sel ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = AV26TFManTel1 ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV27TFManTel1_Sel ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = AV28TFManTel2 ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV29TFManTel2_Sel ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = AV30TFManFax ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV31TFManFax_Sel ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = AV34TFManDto ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = AV35TFManDto_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV62Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV68Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV70Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV72Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV80Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV82Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P091011 */
      pr_default.execute(9, new Object[] {lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, lV59Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV60Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV61Trabajosexternos_tmanufawwds_3_tfmancod_to), lV62Trabajosexternos_tmanufawwds_4_tfmannif, AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV64Trabajosexternos_tmanufawwds_6_tfmannom, AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV66Trabajosexternos_tmanufawwds_8_tfmandom, AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV68Trabajosexternos_tmanufawwds_10_tfmanpob, AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV70Trabajosexternos_tmanufawwds_12_tfmancpo, AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV72Trabajosexternos_tmanufawwds_14_tfmancp2, AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV74Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV76Trabajosexternos_tmanufawwds_18_tfprvdsc, AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV78Trabajosexternos_tmanufawwds_20_tfmantel1, AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV80Trabajosexternos_tmanufawwds_22_tfmantel2, AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV82Trabajosexternos_tmanufawwds_24_tfmanfax, AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV84Trabajosexternos_tmanufawwds_26_tfmandto, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk91020 = false ;
         A3301ManFax = P091011_A3301ManFax[0] ;
         n3301ManFax = P091011_n3301ManFax[0] ;
         A3409ManDto = P091011_A3409ManDto[0] ;
         n3409ManDto = P091011_n3409ManDto[0] ;
         A3300ManTel2 = P091011_A3300ManTel2[0] ;
         n3300ManTel2 = P091011_n3300ManTel2[0] ;
         A3299ManTel1 = P091011_A3299ManTel1[0] ;
         n3299ManTel1 = P091011_n3299ManTel1[0] ;
         A787PrvDsc = P091011_A787PrvDsc[0] ;
         n787PrvDsc = P091011_n787PrvDsc[0] ;
         A781PrvCod = P091011_A781PrvCod[0] ;
         n781PrvCod = P091011_n781PrvCod[0] ;
         A10743ManCp2 = P091011_A10743ManCp2[0] ;
         n10743ManCp2 = P091011_n10743ManCp2[0] ;
         A2252ManCpo = P091011_A2252ManCpo[0] ;
         n2252ManCpo = P091011_n2252ManCpo[0] ;
         A2251ManPob = P091011_A2251ManPob[0] ;
         n2251ManPob = P091011_n2251ManPob[0] ;
         A2250ManDom = P091011_A2250ManDom[0] ;
         n2250ManDom = P091011_n2250ManDom[0] ;
         A2249ManNom = P091011_A2249ManNom[0] ;
         n2249ManNom = P091011_n2249ManNom[0] ;
         A3302ManNif = P091011_A3302ManNif[0] ;
         n3302ManNif = P091011_n3302ManNif[0] ;
         A2248ManCod = P091011_A2248ManCod[0] ;
         A396EmprCod = P091011_A396EmprCod[0] ;
         A787PrvDsc = P091011_A787PrvDsc[0] ;
         n787PrvDsc = P091011_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P091011_A3301ManFax[0], A3301ManFax) == 0 ) )
         {
            brk91020 = false ;
            A2248ManCod = P091011_A2248ManCod[0] ;
            A396EmprCod = P091011_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk91020 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A3301ManFax)==0) )
         {
            AV40Option = A3301ManFax ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91020 )
         {
            brk91020 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmanufawwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = tmanufawwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = tmanufawwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV32TFManNif = "" ;
      AV33TFManNif_Sel = "" ;
      AV12TFManNom = "" ;
      AV13TFManNom_Sel = "" ;
      AV14TFManDom = "" ;
      AV15TFManDom_Sel = "" ;
      AV16TFManPob = "" ;
      AV17TFManPob_Sel = "" ;
      AV18TFManCpo = "" ;
      AV19TFManCpo_Sel = "" ;
      AV20TFManCp2 = "" ;
      AV21TFManCp2_Sel = "" ;
      AV24TFPrvDsc = "" ;
      AV25TFPrvDsc_Sel = "" ;
      AV26TFManTel1 = "" ;
      AV27TFManTel1_Sel = "" ;
      AV28TFManTel2 = "" ;
      AV29TFManTel2_Sel = "" ;
      AV30TFManFax = "" ;
      AV31TFManFax_Sel = "" ;
      AV34TFManDto = DecimalUtil.ZERO ;
      AV35TFManDto_To = DecimalUtil.ZERO ;
      A3302ManNif = "" ;
      AV59Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      AV62Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel = "" ;
      AV64Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel = "" ;
      AV66Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel = "" ;
      AV68Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel = "" ;
      AV70Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel = "" ;
      AV72Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel = "" ;
      AV76Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = "" ;
      AV78Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel = "" ;
      AV80Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel = "" ;
      AV82Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel = "" ;
      AV84Trabajosexternos_tmanufawwds_26_tfmandto = DecimalUtil.ZERO ;
      AV85Trabajosexternos_tmanufawwds_27_tfmandto_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV59Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      lV62Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      lV64Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      lV66Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      lV68Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      lV70Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      lV72Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      lV76Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      lV78Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      lV80Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      lV82Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      A2249ManNom = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A2252ManCpo = "" ;
      A10743ManCp2 = "" ;
      A787PrvDsc = "" ;
      A3299ManTel1 = "" ;
      A3300ManTel2 = "" ;
      A3301ManFax = "" ;
      A3409ManDto = DecimalUtil.ZERO ;
      P09102_A3302ManNif = new String[] {""} ;
      P09102_n3302ManNif = new boolean[] {false} ;
      P09102_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09102_n3409ManDto = new boolean[] {false} ;
      P09102_A3301ManFax = new String[] {""} ;
      P09102_n3301ManFax = new boolean[] {false} ;
      P09102_A3300ManTel2 = new String[] {""} ;
      P09102_n3300ManTel2 = new boolean[] {false} ;
      P09102_A3299ManTel1 = new String[] {""} ;
      P09102_n3299ManTel1 = new boolean[] {false} ;
      P09102_A787PrvDsc = new String[] {""} ;
      P09102_n787PrvDsc = new boolean[] {false} ;
      P09102_A781PrvCod = new short[1] ;
      P09102_n781PrvCod = new boolean[] {false} ;
      P09102_A10743ManCp2 = new String[] {""} ;
      P09102_n10743ManCp2 = new boolean[] {false} ;
      P09102_A2252ManCpo = new String[] {""} ;
      P09102_n2252ManCpo = new boolean[] {false} ;
      P09102_A2251ManPob = new String[] {""} ;
      P09102_n2251ManPob = new boolean[] {false} ;
      P09102_A2250ManDom = new String[] {""} ;
      P09102_n2250ManDom = new boolean[] {false} ;
      P09102_A2249ManNom = new String[] {""} ;
      P09102_n2249ManNom = new boolean[] {false} ;
      P09102_A2248ManCod = new short[1] ;
      P09102_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      AV43OptionDesc = "" ;
      P09103_A2249ManNom = new String[] {""} ;
      P09103_n2249ManNom = new boolean[] {false} ;
      P09103_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09103_n3409ManDto = new boolean[] {false} ;
      P09103_A3301ManFax = new String[] {""} ;
      P09103_n3301ManFax = new boolean[] {false} ;
      P09103_A3300ManTel2 = new String[] {""} ;
      P09103_n3300ManTel2 = new boolean[] {false} ;
      P09103_A3299ManTel1 = new String[] {""} ;
      P09103_n3299ManTel1 = new boolean[] {false} ;
      P09103_A787PrvDsc = new String[] {""} ;
      P09103_n787PrvDsc = new boolean[] {false} ;
      P09103_A781PrvCod = new short[1] ;
      P09103_n781PrvCod = new boolean[] {false} ;
      P09103_A10743ManCp2 = new String[] {""} ;
      P09103_n10743ManCp2 = new boolean[] {false} ;
      P09103_A2252ManCpo = new String[] {""} ;
      P09103_n2252ManCpo = new boolean[] {false} ;
      P09103_A2251ManPob = new String[] {""} ;
      P09103_n2251ManPob = new boolean[] {false} ;
      P09103_A2250ManDom = new String[] {""} ;
      P09103_n2250ManDom = new boolean[] {false} ;
      P09103_A3302ManNif = new String[] {""} ;
      P09103_n3302ManNif = new boolean[] {false} ;
      P09103_A2248ManCod = new short[1] ;
      P09103_A396EmprCod = new String[] {""} ;
      P09104_A2250ManDom = new String[] {""} ;
      P09104_n2250ManDom = new boolean[] {false} ;
      P09104_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09104_n3409ManDto = new boolean[] {false} ;
      P09104_A3301ManFax = new String[] {""} ;
      P09104_n3301ManFax = new boolean[] {false} ;
      P09104_A3300ManTel2 = new String[] {""} ;
      P09104_n3300ManTel2 = new boolean[] {false} ;
      P09104_A3299ManTel1 = new String[] {""} ;
      P09104_n3299ManTel1 = new boolean[] {false} ;
      P09104_A787PrvDsc = new String[] {""} ;
      P09104_n787PrvDsc = new boolean[] {false} ;
      P09104_A781PrvCod = new short[1] ;
      P09104_n781PrvCod = new boolean[] {false} ;
      P09104_A10743ManCp2 = new String[] {""} ;
      P09104_n10743ManCp2 = new boolean[] {false} ;
      P09104_A2252ManCpo = new String[] {""} ;
      P09104_n2252ManCpo = new boolean[] {false} ;
      P09104_A2251ManPob = new String[] {""} ;
      P09104_n2251ManPob = new boolean[] {false} ;
      P09104_A2249ManNom = new String[] {""} ;
      P09104_n2249ManNom = new boolean[] {false} ;
      P09104_A3302ManNif = new String[] {""} ;
      P09104_n3302ManNif = new boolean[] {false} ;
      P09104_A2248ManCod = new short[1] ;
      P09104_A396EmprCod = new String[] {""} ;
      P09105_A2251ManPob = new String[] {""} ;
      P09105_n2251ManPob = new boolean[] {false} ;
      P09105_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09105_n3409ManDto = new boolean[] {false} ;
      P09105_A3301ManFax = new String[] {""} ;
      P09105_n3301ManFax = new boolean[] {false} ;
      P09105_A3300ManTel2 = new String[] {""} ;
      P09105_n3300ManTel2 = new boolean[] {false} ;
      P09105_A3299ManTel1 = new String[] {""} ;
      P09105_n3299ManTel1 = new boolean[] {false} ;
      P09105_A787PrvDsc = new String[] {""} ;
      P09105_n787PrvDsc = new boolean[] {false} ;
      P09105_A781PrvCod = new short[1] ;
      P09105_n781PrvCod = new boolean[] {false} ;
      P09105_A10743ManCp2 = new String[] {""} ;
      P09105_n10743ManCp2 = new boolean[] {false} ;
      P09105_A2252ManCpo = new String[] {""} ;
      P09105_n2252ManCpo = new boolean[] {false} ;
      P09105_A2250ManDom = new String[] {""} ;
      P09105_n2250ManDom = new boolean[] {false} ;
      P09105_A2249ManNom = new String[] {""} ;
      P09105_n2249ManNom = new boolean[] {false} ;
      P09105_A3302ManNif = new String[] {""} ;
      P09105_n3302ManNif = new boolean[] {false} ;
      P09105_A2248ManCod = new short[1] ;
      P09105_A396EmprCod = new String[] {""} ;
      P09106_A2252ManCpo = new String[] {""} ;
      P09106_n2252ManCpo = new boolean[] {false} ;
      P09106_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09106_n3409ManDto = new boolean[] {false} ;
      P09106_A3301ManFax = new String[] {""} ;
      P09106_n3301ManFax = new boolean[] {false} ;
      P09106_A3300ManTel2 = new String[] {""} ;
      P09106_n3300ManTel2 = new boolean[] {false} ;
      P09106_A3299ManTel1 = new String[] {""} ;
      P09106_n3299ManTel1 = new boolean[] {false} ;
      P09106_A787PrvDsc = new String[] {""} ;
      P09106_n787PrvDsc = new boolean[] {false} ;
      P09106_A781PrvCod = new short[1] ;
      P09106_n781PrvCod = new boolean[] {false} ;
      P09106_A10743ManCp2 = new String[] {""} ;
      P09106_n10743ManCp2 = new boolean[] {false} ;
      P09106_A2251ManPob = new String[] {""} ;
      P09106_n2251ManPob = new boolean[] {false} ;
      P09106_A2250ManDom = new String[] {""} ;
      P09106_n2250ManDom = new boolean[] {false} ;
      P09106_A2249ManNom = new String[] {""} ;
      P09106_n2249ManNom = new boolean[] {false} ;
      P09106_A3302ManNif = new String[] {""} ;
      P09106_n3302ManNif = new boolean[] {false} ;
      P09106_A2248ManCod = new short[1] ;
      P09106_A396EmprCod = new String[] {""} ;
      P09107_A10743ManCp2 = new String[] {""} ;
      P09107_n10743ManCp2 = new boolean[] {false} ;
      P09107_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09107_n3409ManDto = new boolean[] {false} ;
      P09107_A3301ManFax = new String[] {""} ;
      P09107_n3301ManFax = new boolean[] {false} ;
      P09107_A3300ManTel2 = new String[] {""} ;
      P09107_n3300ManTel2 = new boolean[] {false} ;
      P09107_A3299ManTel1 = new String[] {""} ;
      P09107_n3299ManTel1 = new boolean[] {false} ;
      P09107_A787PrvDsc = new String[] {""} ;
      P09107_n787PrvDsc = new boolean[] {false} ;
      P09107_A781PrvCod = new short[1] ;
      P09107_n781PrvCod = new boolean[] {false} ;
      P09107_A2252ManCpo = new String[] {""} ;
      P09107_n2252ManCpo = new boolean[] {false} ;
      P09107_A2251ManPob = new String[] {""} ;
      P09107_n2251ManPob = new boolean[] {false} ;
      P09107_A2250ManDom = new String[] {""} ;
      P09107_n2250ManDom = new boolean[] {false} ;
      P09107_A2249ManNom = new String[] {""} ;
      P09107_n2249ManNom = new boolean[] {false} ;
      P09107_A3302ManNif = new String[] {""} ;
      P09107_n3302ManNif = new boolean[] {false} ;
      P09107_A2248ManCod = new short[1] ;
      P09107_A396EmprCod = new String[] {""} ;
      P09108_A781PrvCod = new short[1] ;
      P09108_n781PrvCod = new boolean[] {false} ;
      P09108_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09108_n3409ManDto = new boolean[] {false} ;
      P09108_A3301ManFax = new String[] {""} ;
      P09108_n3301ManFax = new boolean[] {false} ;
      P09108_A3300ManTel2 = new String[] {""} ;
      P09108_n3300ManTel2 = new boolean[] {false} ;
      P09108_A3299ManTel1 = new String[] {""} ;
      P09108_n3299ManTel1 = new boolean[] {false} ;
      P09108_A787PrvDsc = new String[] {""} ;
      P09108_n787PrvDsc = new boolean[] {false} ;
      P09108_A10743ManCp2 = new String[] {""} ;
      P09108_n10743ManCp2 = new boolean[] {false} ;
      P09108_A2252ManCpo = new String[] {""} ;
      P09108_n2252ManCpo = new boolean[] {false} ;
      P09108_A2251ManPob = new String[] {""} ;
      P09108_n2251ManPob = new boolean[] {false} ;
      P09108_A2250ManDom = new String[] {""} ;
      P09108_n2250ManDom = new boolean[] {false} ;
      P09108_A2249ManNom = new String[] {""} ;
      P09108_n2249ManNom = new boolean[] {false} ;
      P09108_A3302ManNif = new String[] {""} ;
      P09108_n3302ManNif = new boolean[] {false} ;
      P09108_A2248ManCod = new short[1] ;
      P09108_A396EmprCod = new String[] {""} ;
      P09109_A3299ManTel1 = new String[] {""} ;
      P09109_n3299ManTel1 = new boolean[] {false} ;
      P09109_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09109_n3409ManDto = new boolean[] {false} ;
      P09109_A3301ManFax = new String[] {""} ;
      P09109_n3301ManFax = new boolean[] {false} ;
      P09109_A3300ManTel2 = new String[] {""} ;
      P09109_n3300ManTel2 = new boolean[] {false} ;
      P09109_A787PrvDsc = new String[] {""} ;
      P09109_n787PrvDsc = new boolean[] {false} ;
      P09109_A781PrvCod = new short[1] ;
      P09109_n781PrvCod = new boolean[] {false} ;
      P09109_A10743ManCp2 = new String[] {""} ;
      P09109_n10743ManCp2 = new boolean[] {false} ;
      P09109_A2252ManCpo = new String[] {""} ;
      P09109_n2252ManCpo = new boolean[] {false} ;
      P09109_A2251ManPob = new String[] {""} ;
      P09109_n2251ManPob = new boolean[] {false} ;
      P09109_A2250ManDom = new String[] {""} ;
      P09109_n2250ManDom = new boolean[] {false} ;
      P09109_A2249ManNom = new String[] {""} ;
      P09109_n2249ManNom = new boolean[] {false} ;
      P09109_A3302ManNif = new String[] {""} ;
      P09109_n3302ManNif = new boolean[] {false} ;
      P09109_A2248ManCod = new short[1] ;
      P09109_A396EmprCod = new String[] {""} ;
      P091010_A3300ManTel2 = new String[] {""} ;
      P091010_n3300ManTel2 = new boolean[] {false} ;
      P091010_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091010_n3409ManDto = new boolean[] {false} ;
      P091010_A3301ManFax = new String[] {""} ;
      P091010_n3301ManFax = new boolean[] {false} ;
      P091010_A3299ManTel1 = new String[] {""} ;
      P091010_n3299ManTel1 = new boolean[] {false} ;
      P091010_A787PrvDsc = new String[] {""} ;
      P091010_n787PrvDsc = new boolean[] {false} ;
      P091010_A781PrvCod = new short[1] ;
      P091010_n781PrvCod = new boolean[] {false} ;
      P091010_A10743ManCp2 = new String[] {""} ;
      P091010_n10743ManCp2 = new boolean[] {false} ;
      P091010_A2252ManCpo = new String[] {""} ;
      P091010_n2252ManCpo = new boolean[] {false} ;
      P091010_A2251ManPob = new String[] {""} ;
      P091010_n2251ManPob = new boolean[] {false} ;
      P091010_A2250ManDom = new String[] {""} ;
      P091010_n2250ManDom = new boolean[] {false} ;
      P091010_A2249ManNom = new String[] {""} ;
      P091010_n2249ManNom = new boolean[] {false} ;
      P091010_A3302ManNif = new String[] {""} ;
      P091010_n3302ManNif = new boolean[] {false} ;
      P091010_A2248ManCod = new short[1] ;
      P091010_A396EmprCod = new String[] {""} ;
      P091011_A3301ManFax = new String[] {""} ;
      P091011_n3301ManFax = new boolean[] {false} ;
      P091011_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091011_n3409ManDto = new boolean[] {false} ;
      P091011_A3300ManTel2 = new String[] {""} ;
      P091011_n3300ManTel2 = new boolean[] {false} ;
      P091011_A3299ManTel1 = new String[] {""} ;
      P091011_n3299ManTel1 = new boolean[] {false} ;
      P091011_A787PrvDsc = new String[] {""} ;
      P091011_n787PrvDsc = new boolean[] {false} ;
      P091011_A781PrvCod = new short[1] ;
      P091011_n781PrvCod = new boolean[] {false} ;
      P091011_A10743ManCp2 = new String[] {""} ;
      P091011_n10743ManCp2 = new boolean[] {false} ;
      P091011_A2252ManCpo = new String[] {""} ;
      P091011_n2252ManCpo = new boolean[] {false} ;
      P091011_A2251ManPob = new String[] {""} ;
      P091011_n2251ManPob = new boolean[] {false} ;
      P091011_A2250ManDom = new String[] {""} ;
      P091011_n2250ManDom = new boolean[] {false} ;
      P091011_A2249ManNom = new String[] {""} ;
      P091011_n2249ManNom = new boolean[] {false} ;
      P091011_A3302ManNif = new String[] {""} ;
      P091011_n3302ManNif = new boolean[] {false} ;
      P091011_A2248ManCod = new short[1] ;
      P091011_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09102_A3302ManNif, P09102_n3302ManNif, P09102_A3409ManDto, P09102_n3409ManDto, P09102_A3301ManFax, P09102_n3301ManFax, P09102_A3300ManTel2, P09102_n3300ManTel2, P09102_A3299ManTel1, P09102_n3299ManTel1,
            P09102_A787PrvDsc, P09102_n787PrvDsc, P09102_A781PrvCod, P09102_n781PrvCod, P09102_A10743ManCp2, P09102_n10743ManCp2, P09102_A2252ManCpo, P09102_n2252ManCpo, P09102_A2251ManPob, P09102_n2251ManPob,
            P09102_A2250ManDom, P09102_n2250ManDom, P09102_A2249ManNom, P09102_n2249ManNom, P09102_A2248ManCod, P09102_A396EmprCod
            }
            , new Object[] {
            P09103_A2249ManNom, P09103_n2249ManNom, P09103_A3409ManDto, P09103_n3409ManDto, P09103_A3301ManFax, P09103_n3301ManFax, P09103_A3300ManTel2, P09103_n3300ManTel2, P09103_A3299ManTel1, P09103_n3299ManTel1,
            P09103_A787PrvDsc, P09103_n787PrvDsc, P09103_A781PrvCod, P09103_n781PrvCod, P09103_A10743ManCp2, P09103_n10743ManCp2, P09103_A2252ManCpo, P09103_n2252ManCpo, P09103_A2251ManPob, P09103_n2251ManPob,
            P09103_A2250ManDom, P09103_n2250ManDom, P09103_A3302ManNif, P09103_n3302ManNif, P09103_A2248ManCod, P09103_A396EmprCod
            }
            , new Object[] {
            P09104_A2250ManDom, P09104_n2250ManDom, P09104_A3409ManDto, P09104_n3409ManDto, P09104_A3301ManFax, P09104_n3301ManFax, P09104_A3300ManTel2, P09104_n3300ManTel2, P09104_A3299ManTel1, P09104_n3299ManTel1,
            P09104_A787PrvDsc, P09104_n787PrvDsc, P09104_A781PrvCod, P09104_n781PrvCod, P09104_A10743ManCp2, P09104_n10743ManCp2, P09104_A2252ManCpo, P09104_n2252ManCpo, P09104_A2251ManPob, P09104_n2251ManPob,
            P09104_A2249ManNom, P09104_n2249ManNom, P09104_A3302ManNif, P09104_n3302ManNif, P09104_A2248ManCod, P09104_A396EmprCod
            }
            , new Object[] {
            P09105_A2251ManPob, P09105_n2251ManPob, P09105_A3409ManDto, P09105_n3409ManDto, P09105_A3301ManFax, P09105_n3301ManFax, P09105_A3300ManTel2, P09105_n3300ManTel2, P09105_A3299ManTel1, P09105_n3299ManTel1,
            P09105_A787PrvDsc, P09105_n787PrvDsc, P09105_A781PrvCod, P09105_n781PrvCod, P09105_A10743ManCp2, P09105_n10743ManCp2, P09105_A2252ManCpo, P09105_n2252ManCpo, P09105_A2250ManDom, P09105_n2250ManDom,
            P09105_A2249ManNom, P09105_n2249ManNom, P09105_A3302ManNif, P09105_n3302ManNif, P09105_A2248ManCod, P09105_A396EmprCod
            }
            , new Object[] {
            P09106_A2252ManCpo, P09106_n2252ManCpo, P09106_A3409ManDto, P09106_n3409ManDto, P09106_A3301ManFax, P09106_n3301ManFax, P09106_A3300ManTel2, P09106_n3300ManTel2, P09106_A3299ManTel1, P09106_n3299ManTel1,
            P09106_A787PrvDsc, P09106_n787PrvDsc, P09106_A781PrvCod, P09106_n781PrvCod, P09106_A10743ManCp2, P09106_n10743ManCp2, P09106_A2251ManPob, P09106_n2251ManPob, P09106_A2250ManDom, P09106_n2250ManDom,
            P09106_A2249ManNom, P09106_n2249ManNom, P09106_A3302ManNif, P09106_n3302ManNif, P09106_A2248ManCod, P09106_A396EmprCod
            }
            , new Object[] {
            P09107_A10743ManCp2, P09107_n10743ManCp2, P09107_A3409ManDto, P09107_n3409ManDto, P09107_A3301ManFax, P09107_n3301ManFax, P09107_A3300ManTel2, P09107_n3300ManTel2, P09107_A3299ManTel1, P09107_n3299ManTel1,
            P09107_A787PrvDsc, P09107_n787PrvDsc, P09107_A781PrvCod, P09107_n781PrvCod, P09107_A2252ManCpo, P09107_n2252ManCpo, P09107_A2251ManPob, P09107_n2251ManPob, P09107_A2250ManDom, P09107_n2250ManDom,
            P09107_A2249ManNom, P09107_n2249ManNom, P09107_A3302ManNif, P09107_n3302ManNif, P09107_A2248ManCod, P09107_A396EmprCod
            }
            , new Object[] {
            P09108_A781PrvCod, P09108_n781PrvCod, P09108_A3409ManDto, P09108_n3409ManDto, P09108_A3301ManFax, P09108_n3301ManFax, P09108_A3300ManTel2, P09108_n3300ManTel2, P09108_A3299ManTel1, P09108_n3299ManTel1,
            P09108_A787PrvDsc, P09108_n787PrvDsc, P09108_A10743ManCp2, P09108_n10743ManCp2, P09108_A2252ManCpo, P09108_n2252ManCpo, P09108_A2251ManPob, P09108_n2251ManPob, P09108_A2250ManDom, P09108_n2250ManDom,
            P09108_A2249ManNom, P09108_n2249ManNom, P09108_A3302ManNif, P09108_n3302ManNif, P09108_A2248ManCod, P09108_A396EmprCod
            }
            , new Object[] {
            P09109_A3299ManTel1, P09109_n3299ManTel1, P09109_A3409ManDto, P09109_n3409ManDto, P09109_A3301ManFax, P09109_n3301ManFax, P09109_A3300ManTel2, P09109_n3300ManTel2, P09109_A787PrvDsc, P09109_n787PrvDsc,
            P09109_A781PrvCod, P09109_n781PrvCod, P09109_A10743ManCp2, P09109_n10743ManCp2, P09109_A2252ManCpo, P09109_n2252ManCpo, P09109_A2251ManPob, P09109_n2251ManPob, P09109_A2250ManDom, P09109_n2250ManDom,
            P09109_A2249ManNom, P09109_n2249ManNom, P09109_A3302ManNif, P09109_n3302ManNif, P09109_A2248ManCod, P09109_A396EmprCod
            }
            , new Object[] {
            P091010_A3300ManTel2, P091010_n3300ManTel2, P091010_A3409ManDto, P091010_n3409ManDto, P091010_A3301ManFax, P091010_n3301ManFax, P091010_A3299ManTel1, P091010_n3299ManTel1, P091010_A787PrvDsc, P091010_n787PrvDsc,
            P091010_A781PrvCod, P091010_n781PrvCod, P091010_A10743ManCp2, P091010_n10743ManCp2, P091010_A2252ManCpo, P091010_n2252ManCpo, P091010_A2251ManPob, P091010_n2251ManPob, P091010_A2250ManDom, P091010_n2250ManDom,
            P091010_A2249ManNom, P091010_n2249ManNom, P091010_A3302ManNif, P091010_n3302ManNif, P091010_A2248ManCod, P091010_A396EmprCod
            }
            , new Object[] {
            P091011_A3301ManFax, P091011_n3301ManFax, P091011_A3409ManDto, P091011_n3409ManDto, P091011_A3300ManTel2, P091011_n3300ManTel2, P091011_A3299ManTel1, P091011_n3299ManTel1, P091011_A787PrvDsc, P091011_n787PrvDsc,
            P091011_A781PrvCod, P091011_n781PrvCod, P091011_A10743ManCp2, P091011_n10743ManCp2, P091011_A2252ManCpo, P091011_n2252ManCpo, P091011_A2251ManPob, P091011_n2251ManPob, P091011_A2250ManDom, P091011_n2250ManDom,
            P091011_A2249ManNom, P091011_n2249ManNom, P091011_A3302ManNif, P091011_n3302ManNif, P091011_A2248ManCod, P091011_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFManCod ;
   private short AV11TFManCod_To ;
   private short AV22TFPrvCod ;
   private short AV23TFPrvCod_To ;
   private short AV60Trabajosexternos_tmanufawwds_2_tfmancod ;
   private short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ;
   private short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ;
   private short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ;
   private short A2248ManCod ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private java.math.BigDecimal AV34TFManDto ;
   private java.math.BigDecimal AV35TFManDto_To ;
   private java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ;
   private java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ;
   private java.math.BigDecimal A3409ManDto ;
   private String AV32TFManNif ;
   private String AV33TFManNif_Sel ;
   private String AV12TFManNom ;
   private String AV13TFManNom_Sel ;
   private String AV14TFManDom ;
   private String AV15TFManDom_Sel ;
   private String AV16TFManPob ;
   private String AV17TFManPob_Sel ;
   private String AV18TFManCpo ;
   private String AV19TFManCpo_Sel ;
   private String AV20TFManCp2 ;
   private String AV21TFManCp2_Sel ;
   private String AV24TFPrvDsc ;
   private String AV25TFPrvDsc_Sel ;
   private String AV26TFManTel1 ;
   private String AV27TFManTel1_Sel ;
   private String AV28TFManTel2 ;
   private String AV29TFManTel2_Sel ;
   private String AV30TFManFax ;
   private String AV31TFManFax_Sel ;
   private String A3302ManNif ;
   private String AV62Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ;
   private String AV64Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ;
   private String AV66Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ;
   private String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ;
   private String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ;
   private String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ;
   private String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ;
   private String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ;
   private String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ;
   private String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ;
   private String scmdbuf ;
   private String lV62Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String lV64Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String lV66Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String lV68Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String lV70Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String lV72Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String lV76Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String lV78Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String lV80Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String lV82Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String A2249ManNom ;
   private String A2250ManDom ;
   private String A2251ManPob ;
   private String A2252ManCpo ;
   private String A10743ManCp2 ;
   private String A787PrvDsc ;
   private String A3299ManTel1 ;
   private String A3300ManTel2 ;
   private String A3301ManFax ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9102 ;
   private boolean n3302ManNif ;
   private boolean n3409ManDto ;
   private boolean n3301ManFax ;
   private boolean n3300ManTel2 ;
   private boolean n3299ManTel1 ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n2251ManPob ;
   private boolean n2250ManDom ;
   private boolean n2249ManNom ;
   private boolean brk9104 ;
   private boolean brk9106 ;
   private boolean brk9108 ;
   private boolean brk91010 ;
   private boolean brk91012 ;
   private boolean brk91014 ;
   private boolean brk91016 ;
   private boolean brk91018 ;
   private boolean brk91020 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private String lV59Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private String AV40Option ;
   private String AV43OptionDesc ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09102_A3302ManNif ;
   private boolean[] P09102_n3302ManNif ;
   private java.math.BigDecimal[] P09102_A3409ManDto ;
   private boolean[] P09102_n3409ManDto ;
   private String[] P09102_A3301ManFax ;
   private boolean[] P09102_n3301ManFax ;
   private String[] P09102_A3300ManTel2 ;
   private boolean[] P09102_n3300ManTel2 ;
   private String[] P09102_A3299ManTel1 ;
   private boolean[] P09102_n3299ManTel1 ;
   private String[] P09102_A787PrvDsc ;
   private boolean[] P09102_n787PrvDsc ;
   private short[] P09102_A781PrvCod ;
   private boolean[] P09102_n781PrvCod ;
   private String[] P09102_A10743ManCp2 ;
   private boolean[] P09102_n10743ManCp2 ;
   private String[] P09102_A2252ManCpo ;
   private boolean[] P09102_n2252ManCpo ;
   private String[] P09102_A2251ManPob ;
   private boolean[] P09102_n2251ManPob ;
   private String[] P09102_A2250ManDom ;
   private boolean[] P09102_n2250ManDom ;
   private String[] P09102_A2249ManNom ;
   private boolean[] P09102_n2249ManNom ;
   private short[] P09102_A2248ManCod ;
   private String[] P09102_A396EmprCod ;
   private String[] P09103_A2249ManNom ;
   private boolean[] P09103_n2249ManNom ;
   private java.math.BigDecimal[] P09103_A3409ManDto ;
   private boolean[] P09103_n3409ManDto ;
   private String[] P09103_A3301ManFax ;
   private boolean[] P09103_n3301ManFax ;
   private String[] P09103_A3300ManTel2 ;
   private boolean[] P09103_n3300ManTel2 ;
   private String[] P09103_A3299ManTel1 ;
   private boolean[] P09103_n3299ManTel1 ;
   private String[] P09103_A787PrvDsc ;
   private boolean[] P09103_n787PrvDsc ;
   private short[] P09103_A781PrvCod ;
   private boolean[] P09103_n781PrvCod ;
   private String[] P09103_A10743ManCp2 ;
   private boolean[] P09103_n10743ManCp2 ;
   private String[] P09103_A2252ManCpo ;
   private boolean[] P09103_n2252ManCpo ;
   private String[] P09103_A2251ManPob ;
   private boolean[] P09103_n2251ManPob ;
   private String[] P09103_A2250ManDom ;
   private boolean[] P09103_n2250ManDom ;
   private String[] P09103_A3302ManNif ;
   private boolean[] P09103_n3302ManNif ;
   private short[] P09103_A2248ManCod ;
   private String[] P09103_A396EmprCod ;
   private String[] P09104_A2250ManDom ;
   private boolean[] P09104_n2250ManDom ;
   private java.math.BigDecimal[] P09104_A3409ManDto ;
   private boolean[] P09104_n3409ManDto ;
   private String[] P09104_A3301ManFax ;
   private boolean[] P09104_n3301ManFax ;
   private String[] P09104_A3300ManTel2 ;
   private boolean[] P09104_n3300ManTel2 ;
   private String[] P09104_A3299ManTel1 ;
   private boolean[] P09104_n3299ManTel1 ;
   private String[] P09104_A787PrvDsc ;
   private boolean[] P09104_n787PrvDsc ;
   private short[] P09104_A781PrvCod ;
   private boolean[] P09104_n781PrvCod ;
   private String[] P09104_A10743ManCp2 ;
   private boolean[] P09104_n10743ManCp2 ;
   private String[] P09104_A2252ManCpo ;
   private boolean[] P09104_n2252ManCpo ;
   private String[] P09104_A2251ManPob ;
   private boolean[] P09104_n2251ManPob ;
   private String[] P09104_A2249ManNom ;
   private boolean[] P09104_n2249ManNom ;
   private String[] P09104_A3302ManNif ;
   private boolean[] P09104_n3302ManNif ;
   private short[] P09104_A2248ManCod ;
   private String[] P09104_A396EmprCod ;
   private String[] P09105_A2251ManPob ;
   private boolean[] P09105_n2251ManPob ;
   private java.math.BigDecimal[] P09105_A3409ManDto ;
   private boolean[] P09105_n3409ManDto ;
   private String[] P09105_A3301ManFax ;
   private boolean[] P09105_n3301ManFax ;
   private String[] P09105_A3300ManTel2 ;
   private boolean[] P09105_n3300ManTel2 ;
   private String[] P09105_A3299ManTel1 ;
   private boolean[] P09105_n3299ManTel1 ;
   private String[] P09105_A787PrvDsc ;
   private boolean[] P09105_n787PrvDsc ;
   private short[] P09105_A781PrvCod ;
   private boolean[] P09105_n781PrvCod ;
   private String[] P09105_A10743ManCp2 ;
   private boolean[] P09105_n10743ManCp2 ;
   private String[] P09105_A2252ManCpo ;
   private boolean[] P09105_n2252ManCpo ;
   private String[] P09105_A2250ManDom ;
   private boolean[] P09105_n2250ManDom ;
   private String[] P09105_A2249ManNom ;
   private boolean[] P09105_n2249ManNom ;
   private String[] P09105_A3302ManNif ;
   private boolean[] P09105_n3302ManNif ;
   private short[] P09105_A2248ManCod ;
   private String[] P09105_A396EmprCod ;
   private String[] P09106_A2252ManCpo ;
   private boolean[] P09106_n2252ManCpo ;
   private java.math.BigDecimal[] P09106_A3409ManDto ;
   private boolean[] P09106_n3409ManDto ;
   private String[] P09106_A3301ManFax ;
   private boolean[] P09106_n3301ManFax ;
   private String[] P09106_A3300ManTel2 ;
   private boolean[] P09106_n3300ManTel2 ;
   private String[] P09106_A3299ManTel1 ;
   private boolean[] P09106_n3299ManTel1 ;
   private String[] P09106_A787PrvDsc ;
   private boolean[] P09106_n787PrvDsc ;
   private short[] P09106_A781PrvCod ;
   private boolean[] P09106_n781PrvCod ;
   private String[] P09106_A10743ManCp2 ;
   private boolean[] P09106_n10743ManCp2 ;
   private String[] P09106_A2251ManPob ;
   private boolean[] P09106_n2251ManPob ;
   private String[] P09106_A2250ManDom ;
   private boolean[] P09106_n2250ManDom ;
   private String[] P09106_A2249ManNom ;
   private boolean[] P09106_n2249ManNom ;
   private String[] P09106_A3302ManNif ;
   private boolean[] P09106_n3302ManNif ;
   private short[] P09106_A2248ManCod ;
   private String[] P09106_A396EmprCod ;
   private String[] P09107_A10743ManCp2 ;
   private boolean[] P09107_n10743ManCp2 ;
   private java.math.BigDecimal[] P09107_A3409ManDto ;
   private boolean[] P09107_n3409ManDto ;
   private String[] P09107_A3301ManFax ;
   private boolean[] P09107_n3301ManFax ;
   private String[] P09107_A3300ManTel2 ;
   private boolean[] P09107_n3300ManTel2 ;
   private String[] P09107_A3299ManTel1 ;
   private boolean[] P09107_n3299ManTel1 ;
   private String[] P09107_A787PrvDsc ;
   private boolean[] P09107_n787PrvDsc ;
   private short[] P09107_A781PrvCod ;
   private boolean[] P09107_n781PrvCod ;
   private String[] P09107_A2252ManCpo ;
   private boolean[] P09107_n2252ManCpo ;
   private String[] P09107_A2251ManPob ;
   private boolean[] P09107_n2251ManPob ;
   private String[] P09107_A2250ManDom ;
   private boolean[] P09107_n2250ManDom ;
   private String[] P09107_A2249ManNom ;
   private boolean[] P09107_n2249ManNom ;
   private String[] P09107_A3302ManNif ;
   private boolean[] P09107_n3302ManNif ;
   private short[] P09107_A2248ManCod ;
   private String[] P09107_A396EmprCod ;
   private short[] P09108_A781PrvCod ;
   private boolean[] P09108_n781PrvCod ;
   private java.math.BigDecimal[] P09108_A3409ManDto ;
   private boolean[] P09108_n3409ManDto ;
   private String[] P09108_A3301ManFax ;
   private boolean[] P09108_n3301ManFax ;
   private String[] P09108_A3300ManTel2 ;
   private boolean[] P09108_n3300ManTel2 ;
   private String[] P09108_A3299ManTel1 ;
   private boolean[] P09108_n3299ManTel1 ;
   private String[] P09108_A787PrvDsc ;
   private boolean[] P09108_n787PrvDsc ;
   private String[] P09108_A10743ManCp2 ;
   private boolean[] P09108_n10743ManCp2 ;
   private String[] P09108_A2252ManCpo ;
   private boolean[] P09108_n2252ManCpo ;
   private String[] P09108_A2251ManPob ;
   private boolean[] P09108_n2251ManPob ;
   private String[] P09108_A2250ManDom ;
   private boolean[] P09108_n2250ManDom ;
   private String[] P09108_A2249ManNom ;
   private boolean[] P09108_n2249ManNom ;
   private String[] P09108_A3302ManNif ;
   private boolean[] P09108_n3302ManNif ;
   private short[] P09108_A2248ManCod ;
   private String[] P09108_A396EmprCod ;
   private String[] P09109_A3299ManTel1 ;
   private boolean[] P09109_n3299ManTel1 ;
   private java.math.BigDecimal[] P09109_A3409ManDto ;
   private boolean[] P09109_n3409ManDto ;
   private String[] P09109_A3301ManFax ;
   private boolean[] P09109_n3301ManFax ;
   private String[] P09109_A3300ManTel2 ;
   private boolean[] P09109_n3300ManTel2 ;
   private String[] P09109_A787PrvDsc ;
   private boolean[] P09109_n787PrvDsc ;
   private short[] P09109_A781PrvCod ;
   private boolean[] P09109_n781PrvCod ;
   private String[] P09109_A10743ManCp2 ;
   private boolean[] P09109_n10743ManCp2 ;
   private String[] P09109_A2252ManCpo ;
   private boolean[] P09109_n2252ManCpo ;
   private String[] P09109_A2251ManPob ;
   private boolean[] P09109_n2251ManPob ;
   private String[] P09109_A2250ManDom ;
   private boolean[] P09109_n2250ManDom ;
   private String[] P09109_A2249ManNom ;
   private boolean[] P09109_n2249ManNom ;
   private String[] P09109_A3302ManNif ;
   private boolean[] P09109_n3302ManNif ;
   private short[] P09109_A2248ManCod ;
   private String[] P09109_A396EmprCod ;
   private String[] P091010_A3300ManTel2 ;
   private boolean[] P091010_n3300ManTel2 ;
   private java.math.BigDecimal[] P091010_A3409ManDto ;
   private boolean[] P091010_n3409ManDto ;
   private String[] P091010_A3301ManFax ;
   private boolean[] P091010_n3301ManFax ;
   private String[] P091010_A3299ManTel1 ;
   private boolean[] P091010_n3299ManTel1 ;
   private String[] P091010_A787PrvDsc ;
   private boolean[] P091010_n787PrvDsc ;
   private short[] P091010_A781PrvCod ;
   private boolean[] P091010_n781PrvCod ;
   private String[] P091010_A10743ManCp2 ;
   private boolean[] P091010_n10743ManCp2 ;
   private String[] P091010_A2252ManCpo ;
   private boolean[] P091010_n2252ManCpo ;
   private String[] P091010_A2251ManPob ;
   private boolean[] P091010_n2251ManPob ;
   private String[] P091010_A2250ManDom ;
   private boolean[] P091010_n2250ManDom ;
   private String[] P091010_A2249ManNom ;
   private boolean[] P091010_n2249ManNom ;
   private String[] P091010_A3302ManNif ;
   private boolean[] P091010_n3302ManNif ;
   private short[] P091010_A2248ManCod ;
   private String[] P091010_A396EmprCod ;
   private String[] P091011_A3301ManFax ;
   private boolean[] P091011_n3301ManFax ;
   private java.math.BigDecimal[] P091011_A3409ManDto ;
   private boolean[] P091011_n3409ManDto ;
   private String[] P091011_A3300ManTel2 ;
   private boolean[] P091011_n3300ManTel2 ;
   private String[] P091011_A3299ManTel1 ;
   private boolean[] P091011_n3299ManTel1 ;
   private String[] P091011_A787PrvDsc ;
   private boolean[] P091011_n787PrvDsc ;
   private short[] P091011_A781PrvCod ;
   private boolean[] P091011_n781PrvCod ;
   private String[] P091011_A10743ManCp2 ;
   private boolean[] P091011_n10743ManCp2 ;
   private String[] P091011_A2252ManCpo ;
   private boolean[] P091011_n2252ManCpo ;
   private String[] P091011_A2251ManPob ;
   private boolean[] P091011_n2251ManPob ;
   private String[] P091011_A2250ManDom ;
   private boolean[] P091011_n2250ManDom ;
   private String[] P091011_A2249ManNom ;
   private boolean[] P091011_n2249ManNom ;
   private String[] P091011_A3302ManNif ;
   private boolean[] P091011_n3302ManNif ;
   private short[] P091011_A2248ManCod ;
   private String[] P091011_A396EmprCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class tmanufawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09102( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ManNif, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManNif" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09103( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[39];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ManNom, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09104( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[39];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ManDom, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManDom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09105( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ManPob, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManPob" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09106( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[39];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ManCpo, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int10[11] = (byte)(1) ;
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManCpo" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09107( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[39];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ManCp2, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int12[11] = (byte)(1) ;
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManCp2" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09108( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[39];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09109( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[39];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.ManTel1, T1.ManDto, T1.ManFax, T1.ManTel2, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManTel1" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P091010( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                           short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                           String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                           short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                           String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           short A2248ManCod ,
                                           String A3302ManNif ,
                                           String A2249ManNom ,
                                           String A2250ManDom ,
                                           String A2251ManPob ,
                                           String A2252ManCpo ,
                                           String A10743ManCp2 ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A3299ManTel1 ,
                                           String A3300ManTel2 ,
                                           String A3301ManFax ,
                                           java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[39];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.ManTel2, T1.ManDto, T1.ManFax, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int18[11] = (byte)(1) ;
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManTel2" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P091011( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV59Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           short AV60Trabajosexternos_tmanufawwds_2_tfmancod ,
                                           short AV61Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                           String AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           String AV62Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           String AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           String AV64Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           String AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           String AV66Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           String AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           String AV68Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           String AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           String AV70Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           String AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           String AV72Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           short AV74Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                           short AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                           String AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           String AV76Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           String AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           String AV78Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           String AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           String AV80Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           String AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           String AV82Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           java.math.BigDecimal AV84Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           java.math.BigDecimal AV85Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           short A2248ManCod ,
                                           String A3302ManNif ,
                                           String A2249ManNom ,
                                           String A2250ManDom ,
                                           String A2251ManPob ,
                                           String A2252ManCpo ,
                                           String A10743ManCp2 ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A3299ManTel1 ,
                                           String A3300ManTel2 ,
                                           String A3301ManFax ,
                                           java.math.BigDecimal A3409ManDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[39];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.ManFax, T1.ManDto, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV59Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
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
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV62Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ManFax" ;
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
                  return conditional_P09102(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 1 :
                  return conditional_P09103(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 2 :
                  return conditional_P09104(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 3 :
                  return conditional_P09105(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 4 :
                  return conditional_P09106(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 5 :
                  return conditional_P09107(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 6 :
                  return conditional_P09108(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 7 :
                  return conditional_P09109(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 8 :
                  return conditional_P091010(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
            case 9 :
                  return conditional_P091011(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09102", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09103", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09104", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09105", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09106", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09107", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09108", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09109", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091010", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091011", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 34);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 34);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
      }
   }

}

