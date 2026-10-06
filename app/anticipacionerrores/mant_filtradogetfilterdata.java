package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_filtradogetfilterdata extends GXProcedure
{
   public mant_filtradogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_filtradogetfilterdata.class ), "" );
   }

   public mant_filtradogetfilterdata( int remoteHandle ,
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
      mant_filtradogetfilterdata.this.aP5 = new String[] {""};
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
      mant_filtradogetfilterdata.this.AV54DDOName = aP0;
      mant_filtradogetfilterdata.this.AV55SearchTxt = aP1;
      mant_filtradogetfilterdata.this.AV56SearchTxtTo = aP2;
      mant_filtradogetfilterdata.this.aP3 = aP3;
      mant_filtradogetfilterdata.this.aP4 = aP4;
      mant_filtradogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV44Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV47OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTEMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTARTCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTMAQCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTMAQDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTTIPMCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTTIPMCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTTIPMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTTIPMDSCOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV57OptionsJson = AV44Options.toJSonString(false) ;
      AV58OptionsDescJson = AV46OptionsDesc.toJSonString(false) ;
      AV59OptionIndexesJson = AV47OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("AnticipacionErrores.MAnt_FiltradoGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnticipacionErrores.MAnt_FiltradoGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("AnticipacionErrores.MAnt_FiltradoGridState"), null, null);
      }
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTID") == 0 )
         {
            AV10TFMAntId = GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFMAntId_To = GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD") == 0 )
         {
            AV12TFMAntEmprCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD_SEL") == 0 )
         {
            AV13TFMAntEmprCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLICOD") == 0 )
         {
            AV14TFMAntCliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMAntCliCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM") == 0 )
         {
            AV16TFMAntCliNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM_SEL") == 0 )
         {
            AV17TFMAntCliNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD") == 0 )
         {
            AV18TFMAntArtCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD_SEL") == 0 )
         {
            AV19TFMAntArtCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC") == 0 )
         {
            AV20TFMAntArtDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC_SEL") == 0 )
         {
            AV21TFMAntArtDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNUM") == 0 )
         {
            AV24TFMAntColNum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFMAntColNum_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM") == 0 )
         {
            AV22TFMAntColNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM_SEL") == 0 )
         {
            AV23TFMAntColNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLCOD") == 0 )
         {
            AV26TFMAntColCod = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFMAntColCod_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD") == 0 )
         {
            AV28TFMAntMaqCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD_SEL") == 0 )
         {
            AV29TFMAntMaqCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC") == 0 )
         {
            AV30TFMAntMaqDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC_SEL") == 0 )
         {
            AV31TFMAntMaqDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD") == 0 )
         {
            AV32TFMAntTipMCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD_SEL") == 0 )
         {
            AV33TFMAntTipMCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC") == 0 )
         {
            AV34TFMAntTipMDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC_SEL") == 0 )
         {
            AV35TFMAntTipMDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILTOT") == 0 )
         {
            AV74TFMAntKilTot = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFMAntKilTot_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILPROD") == 0 )
         {
            AV36TFMAntKilProd = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFMAntKilProd_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILREO") == 0 )
         {
            AV38TFMAntKilReo = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFMAntKilReo_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTPORC") == 0 )
         {
            AV40TFMAntPorc = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFMAntPorc_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETTOT") == 0 )
         {
            AV85TFMAntMetTot = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV86TFMAntMetTot_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETPROD") == 0 )
         {
            AV81TFMAntMetProd = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV82TFMAntMetProd_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETREO") == 0 )
         {
            AV83TFMAntMetReo = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFMAntMetReo_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETPOR") == 0 )
         {
            AV87TFMantMetPor = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFMantMetPor_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MANTEMPRCOD") == 0 )
         {
            AV63MAntEmprCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV67CliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD") == 0 )
         {
            AV68ArtCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV69ForColNum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPMAQCODJSON") == 0 )
         {
            AV70TipMaqCodJSON = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHAINICIO") == 0 )
         {
            AV72FechaInicio = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHAFIN") == 0 )
         {
            AV73FechaFin = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMANTEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMAntEmprCod = AV55SearchTxt ;
      AV13TFMAntEmprCod_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV67CliCod) ,
                                           AV63MAntEmprCod ,
                                           A14563MAntTkn ,
                                           A14564MAntUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL2 */
      pr_default.execute(0, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV67CliCod), AV63MAntEmprCod, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAUL2 = false ;
         A14565MAntCliCod = P0AUL2_A14565MAntCliCod[0] ;
         A14564MAntUsu = P0AUL2_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL2_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL2_A14566MAntEmprCo[0] ;
         A14648MAntMetPro = P0AUL2_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL2_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL2_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL2_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL2_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL2_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL2_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL2_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL2_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL2_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL2_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL2_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL2_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL2_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL2_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL2_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL2_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL2_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL2_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL2_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AUL2_A14563MAntTkn[0], A14563MAntTkn) == 0 ) && ( GXutil.strcmp(P0AUL2_A14564MAntUsu[0], A14564MAntUsu) == 0 ) && ( P0AUL2_A14565MAntCliCod[0] == A14565MAntCliCod ) && ( GXutil.strcmp(P0AUL2_A14566MAntEmprCo[0], A14566MAntEmprCo) == 0 ) )
         {
            brkAUL2 = false ;
            A14562MAntId = P0AUL2_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14566MAntEmprCo)==0) )
         {
            AV43Option = A14566MAntEmprCo ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL2 )
         {
            brkAUL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMANTCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMAntCliNom = AV55SearchTxt ;
      AV17TFMAntCliNom_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL3 */
      pr_default.execute(1, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAUL4 = false ;
         A14564MAntUsu = P0AUL3_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL3_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL3_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL3_A14565MAntCliCod[0] ;
         A14611MAntCliNom = P0AUL3_A14611MAntCliNom[0] ;
         A14648MAntMetPro = P0AUL3_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL3_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL3_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL3_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL3_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL3_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL3_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL3_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL3_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL3_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL3_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL3_A14567MAntArtCod[0] ;
         A14562MAntId = P0AUL3_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL3_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL3_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL3_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL3_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL3_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL3_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AUL3_A14611MAntCliNom[0], A14611MAntCliNom) == 0 ) )
         {
            brkAUL4 = false ;
            A14562MAntId = P0AUL3_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14611MAntCliNom)==0) )
         {
            AV43Option = A14611MAntCliNom ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL4 )
         {
            brkAUL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMANTARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFMAntArtCod = AV55SearchTxt ;
      AV19TFMAntArtCod_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV67CliCod) ,
                                           AV63MAntEmprCod ,
                                           A14563MAntTkn ,
                                           A14564MAntUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL4 */
      pr_default.execute(2, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV67CliCod), AV63MAntEmprCod, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAUL6 = false ;
         A14566MAntEmprCo = P0AUL4_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL4_A14565MAntCliCod[0] ;
         A14564MAntUsu = P0AUL4_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL4_A14563MAntTkn[0] ;
         A14567MAntArtCod = P0AUL4_A14567MAntArtCod[0] ;
         A14648MAntMetPro = P0AUL4_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL4_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL4_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL4_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL4_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL4_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL4_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL4_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL4_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL4_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL4_A14613MAntArtDsc[0] ;
         A14611MAntCliNom = P0AUL4_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL4_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL4_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL4_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL4_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL4_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL4_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL4_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AUL4_A14563MAntTkn[0], A14563MAntTkn) == 0 ) && ( GXutil.strcmp(P0AUL4_A14564MAntUsu[0], A14564MAntUsu) == 0 ) && ( P0AUL4_A14565MAntCliCod[0] == A14565MAntCliCod ) && ( GXutil.strcmp(P0AUL4_A14566MAntEmprCo[0], A14566MAntEmprCo) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AUL4_A14567MAntArtCod[0], A14567MAntArtCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkAUL6 = false ;
            A14562MAntId = P0AUL4_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14567MAntArtCod)==0) )
         {
            AV43Option = A14567MAntArtCod ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL6 )
         {
            brkAUL6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMANTARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMAntArtDsc = AV55SearchTxt ;
      AV21TFMAntArtDsc_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL5 */
      pr_default.execute(3, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAUL8 = false ;
         A14564MAntUsu = P0AUL5_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL5_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL5_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL5_A14565MAntCliCod[0] ;
         A14613MAntArtDsc = P0AUL5_A14613MAntArtDsc[0] ;
         A14648MAntMetPro = P0AUL5_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL5_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL5_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL5_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL5_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL5_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL5_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL5_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL5_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL5_A14568MAntColNum[0] ;
         A14567MAntArtCod = P0AUL5_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL5_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL5_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL5_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL5_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL5_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL5_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL5_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL5_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AUL5_A14613MAntArtDsc[0], A14613MAntArtDsc) == 0 ) )
         {
            brkAUL8 = false ;
            A14562MAntId = P0AUL5_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14613MAntArtDsc)==0) )
         {
            AV43Option = A14613MAntArtDsc ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL8 )
         {
            brkAUL8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMANTCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFMAntColNom = AV55SearchTxt ;
      AV23TFMAntColNom_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL6 */
      pr_default.execute(4, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAUL10 = false ;
         A14564MAntUsu = P0AUL6_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL6_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL6_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL6_A14565MAntCliCod[0] ;
         A14623MAntColNom = P0AUL6_A14623MAntColNom[0] ;
         A14648MAntMetPro = P0AUL6_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL6_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL6_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL6_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL6_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL6_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL6_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL6_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUL6_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL6_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL6_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL6_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL6_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL6_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL6_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL6_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL6_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL6_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL6_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AUL6_A14623MAntColNom[0], A14623MAntColNom) == 0 ) )
         {
            brkAUL10 = false ;
            A14562MAntId = P0AUL6_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A14623MAntColNom)==0) )
         {
            AV43Option = A14623MAntColNom ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL10 )
         {
            brkAUL10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMANTMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV28TFMAntMaqCod = AV55SearchTxt ;
      AV29TFMAntMaqCod_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL7 */
      pr_default.execute(5, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAUL12 = false ;
         A14564MAntUsu = P0AUL7_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL7_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL7_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL7_A14565MAntCliCod[0] ;
         A14570MAntMaqCod = P0AUL7_A14570MAntMaqCod[0] ;
         A14648MAntMetPro = P0AUL7_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL7_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL7_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL7_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL7_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL7_A14610MAntMaqDsc[0] ;
         A14642MAntColCod = P0AUL7_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL7_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL7_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL7_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL7_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL7_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL7_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL7_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL7_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL7_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL7_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL7_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL7_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AUL7_A14570MAntMaqCod[0], A14570MAntMaqCod) == 0 ) )
         {
            brkAUL12 = false ;
            A14562MAntId = P0AUL7_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A14570MAntMaqCod)==0) )
         {
            AV43Option = A14570MAntMaqCod ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL12 )
         {
            brkAUL12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMANTMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFMAntMaqDsc = AV55SearchTxt ;
      AV31TFMAntMaqDsc_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL8 */
      pr_default.execute(6, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAUL14 = false ;
         A14564MAntUsu = P0AUL8_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL8_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL8_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL8_A14565MAntCliCod[0] ;
         A14610MAntMaqDsc = P0AUL8_A14610MAntMaqDsc[0] ;
         A14648MAntMetPro = P0AUL8_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL8_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL8_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL8_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUL8_A14569MAntTipMCo[0] ;
         A14570MAntMaqCod = P0AUL8_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL8_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL8_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL8_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL8_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL8_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL8_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL8_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL8_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL8_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL8_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL8_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL8_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL8_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AUL8_A14610MAntMaqDsc[0], A14610MAntMaqDsc) == 0 ) )
         {
            brkAUL14 = false ;
            A14562MAntId = P0AUL8_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A14610MAntMaqDsc)==0) )
         {
            AV43Option = A14610MAntMaqDsc ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL14 )
         {
            brkAUL14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADMANTTIPMCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFMAntTipMCod = AV55SearchTxt ;
      AV33TFMAntTipMCod_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL9 */
      pr_default.execute(7, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brkAUL16 = false ;
         A14564MAntUsu = P0AUL9_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL9_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL9_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL9_A14565MAntCliCod[0] ;
         A14569MAntTipMCo = P0AUL9_A14569MAntTipMCo[0] ;
         A14648MAntMetPro = P0AUL9_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL9_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL9_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUL9_A14612MAntTipMDs[0] ;
         A14610MAntMaqDsc = P0AUL9_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL9_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL9_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL9_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL9_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL9_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL9_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL9_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL9_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL9_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL9_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL9_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL9_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL9_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL9_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P0AUL9_A14569MAntTipMCo[0], A14569MAntTipMCo) == 0 ) )
         {
            brkAUL16 = false ;
            A14562MAntId = P0AUL9_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A14569MAntTipMCo)==0) )
         {
            AV43Option = A14569MAntTipMCo ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL16 )
         {
            brkAUL16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADMANTTIPMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFMAntTipMDsc = AV55SearchTxt ;
      AV35TFMAntTipMDsc_Sel = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = AV60FilterFullText ;
      AV94Anticipacionerrores_mant_filtradods_2_tfmantid = AV10TFMAntId ;
      AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV11TFMAntId_To ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV14TFMAntCliCod ;
      AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV16TFMAntCliNom ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV18TFMAntArtCod ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV24TFMAntColNum ;
      AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV22TFMAntColNom ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV26TFMAntColCod ;
      AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV74TFMAntKilTot ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV75TFMAntKilTot_To ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV36TFMAntKilProd ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV38TFMAntKilReo ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = AV40TFMAntPorc ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV41TFMAntPorc_To ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV85TFMAntMetTot ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV86TFMAntMetTot_To ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV81TFMAntMetProd ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV82TFMAntMetProd_To ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV83TFMAntMetReo ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV84TFMAntMetReo_To ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV87TFMantMetPor ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV88TFMantMetPor_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV71TipMaqCodCollection ,
                                           AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV68ArtCod ,
                                           Integer.valueOf(AV69ForColNum) ,
                                           Integer.valueOf(AV71TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           A14564MAntUsu ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           A14563MAntTkn ,
                                           AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV63MAntEmprCod ,
                                           Integer.valueOf(AV67CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUL10 */
      pr_default.execute(8, new Object[] {AV80sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV80sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV63MAntEmprCod, Integer.valueOf(AV67CliCod), lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, lV93Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV94Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV68ArtCod, Integer.valueOf(AV69ForColNum)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brkAUL18 = false ;
         A14564MAntUsu = P0AUL10_A14564MAntUsu[0] ;
         A14563MAntTkn = P0AUL10_A14563MAntTkn[0] ;
         A14566MAntEmprCo = P0AUL10_A14566MAntEmprCo[0] ;
         A14565MAntCliCod = P0AUL10_A14565MAntCliCod[0] ;
         A14612MAntTipMDs = P0AUL10_A14612MAntTipMDs[0] ;
         A14648MAntMetPro = P0AUL10_A14648MAntMetPro[0] ;
         n14648MAntMetPro = P0AUL10_n14648MAntMetPro[0] ;
         A14643MAntKilPro = P0AUL10_A14643MAntKilPro[0] ;
         A14569MAntTipMCo = P0AUL10_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUL10_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUL10_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUL10_A14642MAntColCod[0] ;
         A14623MAntColNom = P0AUL10_A14623MAntColNom[0] ;
         A14568MAntColNum = P0AUL10_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUL10_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUL10_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUL10_A14611MAntCliNom[0] ;
         A14562MAntId = P0AUL10_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUL10_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUL10_A14646MAntKilTot[0] ;
         A14649MAntMetReo = P0AUL10_A14649MAntMetReo[0] ;
         n14649MAntMetReo = P0AUL10_n14649MAntMetReo[0] ;
         A14647MAntMetTot = P0AUL10_A14647MAntMetTot[0] ;
         n14647MAntMetTot = P0AUL10_n14647MAntMetTot[0] ;
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P0AUL10_A14612MAntTipMDs[0], A14612MAntTipMDs) == 0 ) )
         {
            brkAUL18 = false ;
            A14562MAntId = P0AUL10_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUL18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A14612MAntTipMDs)==0) )
         {
            AV43Option = A14612MAntTipMDs ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUL18 )
         {
            brkAUL18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mant_filtradogetfilterdata.this.AV57OptionsJson;
      this.aP4[0] = mant_filtradogetfilterdata.this.AV58OptionsDescJson;
      this.aP5[0] = mant_filtradogetfilterdata.this.AV59OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV57OptionsJson = "" ;
      AV58OptionsDescJson = "" ;
      AV59OptionIndexesJson = "" ;
      AV44Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60FilterFullText = "" ;
      AV12TFMAntEmprCod = "" ;
      AV13TFMAntEmprCod_Sel = "" ;
      AV16TFMAntCliNom = "" ;
      AV17TFMAntCliNom_Sel = "" ;
      AV18TFMAntArtCod = "" ;
      AV19TFMAntArtCod_Sel = "" ;
      AV20TFMAntArtDsc = "" ;
      AV21TFMAntArtDsc_Sel = "" ;
      AV22TFMAntColNom = "" ;
      AV23TFMAntColNom_Sel = "" ;
      AV28TFMAntMaqCod = "" ;
      AV29TFMAntMaqCod_Sel = "" ;
      AV30TFMAntMaqDsc = "" ;
      AV31TFMAntMaqDsc_Sel = "" ;
      AV32TFMAntTipMCod = "" ;
      AV33TFMAntTipMCod_Sel = "" ;
      AV34TFMAntTipMDsc = "" ;
      AV35TFMAntTipMDsc_Sel = "" ;
      AV74TFMAntKilTot = DecimalUtil.ZERO ;
      AV75TFMAntKilTot_To = DecimalUtil.ZERO ;
      AV36TFMAntKilProd = DecimalUtil.ZERO ;
      AV37TFMAntKilProd_To = DecimalUtil.ZERO ;
      AV38TFMAntKilReo = DecimalUtil.ZERO ;
      AV39TFMAntKilReo_To = DecimalUtil.ZERO ;
      AV40TFMAntPorc = DecimalUtil.ZERO ;
      AV41TFMAntPorc_To = DecimalUtil.ZERO ;
      AV85TFMAntMetTot = DecimalUtil.ZERO ;
      AV86TFMAntMetTot_To = DecimalUtil.ZERO ;
      AV81TFMAntMetProd = DecimalUtil.ZERO ;
      AV82TFMAntMetProd_To = DecimalUtil.ZERO ;
      AV83TFMAntMetReo = DecimalUtil.ZERO ;
      AV84TFMAntMetReo_To = DecimalUtil.ZERO ;
      AV87TFMantMetPor = DecimalUtil.ZERO ;
      AV88TFMantMetPor_To = DecimalUtil.ZERO ;
      AV63MAntEmprCod = "" ;
      AV68ArtCod = "" ;
      AV70TipMaqCodJSON = "" ;
      AV72FechaInicio = GXutil.nullDate() ;
      AV73FechaFin = GXutil.nullDate() ;
      A14566MAntEmprCo = "" ;
      AV93Anticipacionerrores_mant_filtradods_1_filterfulltext = "" ;
      AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = "" ;
      AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = "" ;
      AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = "" ;
      AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = "" ;
      AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = "" ;
      AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = "" ;
      AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = "" ;
      AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = "" ;
      AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = "" ;
      AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = "" ;
      AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = "" ;
      AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = "" ;
      AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = "" ;
      AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = "" ;
      AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = "" ;
      AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = "" ;
      AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = "" ;
      AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = "" ;
      AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot = DecimalUtil.ZERO ;
      AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = DecimalUtil.ZERO ;
      AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod = DecimalUtil.ZERO ;
      AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = DecimalUtil.ZERO ;
      AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo = DecimalUtil.ZERO ;
      AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = DecimalUtil.ZERO ;
      AV126Anticipacionerrores_mant_filtradods_34_tfmantporc = DecimalUtil.ZERO ;
      AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to = DecimalUtil.ZERO ;
      AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot = DecimalUtil.ZERO ;
      AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = DecimalUtil.ZERO ;
      AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod = DecimalUtil.ZERO ;
      AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = DecimalUtil.ZERO ;
      AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo = DecimalUtil.ZERO ;
      AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = DecimalUtil.ZERO ;
      AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor = DecimalUtil.ZERO ;
      AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = DecimalUtil.ZERO ;
      AV80sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV71TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV93Anticipacionerrores_mant_filtradods_1_filterfulltext = "" ;
      lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod = "" ;
      lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom = "" ;
      lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod = "" ;
      lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc = "" ;
      lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom = "" ;
      lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = "" ;
      lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = "" ;
      lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = "" ;
      lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = "" ;
      A14569MAntTipMCo = "" ;
      A14611MAntCliNom = "" ;
      A14567MAntArtCod = "" ;
      A14613MAntArtDsc = "" ;
      A14623MAntColNom = "" ;
      A14570MAntMaqCod = "" ;
      A14610MAntMaqDsc = "" ;
      A14612MAntTipMDs = "" ;
      A14646MAntKilTot = DecimalUtil.ZERO ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14647MAntMetTot = DecimalUtil.ZERO ;
      A14648MAntMetPro = DecimalUtil.ZERO ;
      A14649MAntMetReo = DecimalUtil.ZERO ;
      A14563MAntTkn = "" ;
      A14564MAntUsu = "" ;
      P0AUL2_A14565MAntCliCod = new int[1] ;
      P0AUL2_A14564MAntUsu = new String[] {""} ;
      P0AUL2_A14563MAntTkn = new String[] {""} ;
      P0AUL2_A14566MAntEmprCo = new String[] {""} ;
      P0AUL2_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL2_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL2_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL2_A14612MAntTipMDs = new String[] {""} ;
      P0AUL2_A14569MAntTipMCo = new String[] {""} ;
      P0AUL2_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL2_A14570MAntMaqCod = new String[] {""} ;
      P0AUL2_A14642MAntColCod = new byte[1] ;
      P0AUL2_A14623MAntColNom = new String[] {""} ;
      P0AUL2_A14568MAntColNum = new int[1] ;
      P0AUL2_A14613MAntArtDsc = new String[] {""} ;
      P0AUL2_A14567MAntArtCod = new String[] {""} ;
      P0AUL2_A14611MAntCliNom = new String[] {""} ;
      P0AUL2_A14562MAntId = new long[1] ;
      P0AUL2_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL2_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL2_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL2_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL2_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL2_n14647MAntMetTot = new boolean[] {false} ;
      A14650MantMetPor = DecimalUtil.ZERO ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      AV43Option = "" ;
      P0AUL3_A14564MAntUsu = new String[] {""} ;
      P0AUL3_A14563MAntTkn = new String[] {""} ;
      P0AUL3_A14566MAntEmprCo = new String[] {""} ;
      P0AUL3_A14565MAntCliCod = new int[1] ;
      P0AUL3_A14611MAntCliNom = new String[] {""} ;
      P0AUL3_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL3_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL3_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL3_A14612MAntTipMDs = new String[] {""} ;
      P0AUL3_A14569MAntTipMCo = new String[] {""} ;
      P0AUL3_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL3_A14570MAntMaqCod = new String[] {""} ;
      P0AUL3_A14642MAntColCod = new byte[1] ;
      P0AUL3_A14623MAntColNom = new String[] {""} ;
      P0AUL3_A14568MAntColNum = new int[1] ;
      P0AUL3_A14613MAntArtDsc = new String[] {""} ;
      P0AUL3_A14567MAntArtCod = new String[] {""} ;
      P0AUL3_A14562MAntId = new long[1] ;
      P0AUL3_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL3_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL3_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL3_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL3_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL3_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL4_A14566MAntEmprCo = new String[] {""} ;
      P0AUL4_A14565MAntCliCod = new int[1] ;
      P0AUL4_A14564MAntUsu = new String[] {""} ;
      P0AUL4_A14563MAntTkn = new String[] {""} ;
      P0AUL4_A14567MAntArtCod = new String[] {""} ;
      P0AUL4_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL4_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL4_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL4_A14612MAntTipMDs = new String[] {""} ;
      P0AUL4_A14569MAntTipMCo = new String[] {""} ;
      P0AUL4_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL4_A14570MAntMaqCod = new String[] {""} ;
      P0AUL4_A14642MAntColCod = new byte[1] ;
      P0AUL4_A14623MAntColNom = new String[] {""} ;
      P0AUL4_A14568MAntColNum = new int[1] ;
      P0AUL4_A14613MAntArtDsc = new String[] {""} ;
      P0AUL4_A14611MAntCliNom = new String[] {""} ;
      P0AUL4_A14562MAntId = new long[1] ;
      P0AUL4_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL4_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL4_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL4_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL4_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL4_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL5_A14564MAntUsu = new String[] {""} ;
      P0AUL5_A14563MAntTkn = new String[] {""} ;
      P0AUL5_A14566MAntEmprCo = new String[] {""} ;
      P0AUL5_A14565MAntCliCod = new int[1] ;
      P0AUL5_A14613MAntArtDsc = new String[] {""} ;
      P0AUL5_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL5_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL5_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL5_A14612MAntTipMDs = new String[] {""} ;
      P0AUL5_A14569MAntTipMCo = new String[] {""} ;
      P0AUL5_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL5_A14570MAntMaqCod = new String[] {""} ;
      P0AUL5_A14642MAntColCod = new byte[1] ;
      P0AUL5_A14623MAntColNom = new String[] {""} ;
      P0AUL5_A14568MAntColNum = new int[1] ;
      P0AUL5_A14567MAntArtCod = new String[] {""} ;
      P0AUL5_A14611MAntCliNom = new String[] {""} ;
      P0AUL5_A14562MAntId = new long[1] ;
      P0AUL5_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL5_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL5_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL5_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL5_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL5_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL6_A14564MAntUsu = new String[] {""} ;
      P0AUL6_A14563MAntTkn = new String[] {""} ;
      P0AUL6_A14566MAntEmprCo = new String[] {""} ;
      P0AUL6_A14565MAntCliCod = new int[1] ;
      P0AUL6_A14623MAntColNom = new String[] {""} ;
      P0AUL6_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL6_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL6_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL6_A14612MAntTipMDs = new String[] {""} ;
      P0AUL6_A14569MAntTipMCo = new String[] {""} ;
      P0AUL6_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL6_A14570MAntMaqCod = new String[] {""} ;
      P0AUL6_A14642MAntColCod = new byte[1] ;
      P0AUL6_A14568MAntColNum = new int[1] ;
      P0AUL6_A14613MAntArtDsc = new String[] {""} ;
      P0AUL6_A14567MAntArtCod = new String[] {""} ;
      P0AUL6_A14611MAntCliNom = new String[] {""} ;
      P0AUL6_A14562MAntId = new long[1] ;
      P0AUL6_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL6_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL6_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL6_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL6_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL6_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL7_A14564MAntUsu = new String[] {""} ;
      P0AUL7_A14563MAntTkn = new String[] {""} ;
      P0AUL7_A14566MAntEmprCo = new String[] {""} ;
      P0AUL7_A14565MAntCliCod = new int[1] ;
      P0AUL7_A14570MAntMaqCod = new String[] {""} ;
      P0AUL7_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL7_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL7_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL7_A14612MAntTipMDs = new String[] {""} ;
      P0AUL7_A14569MAntTipMCo = new String[] {""} ;
      P0AUL7_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL7_A14642MAntColCod = new byte[1] ;
      P0AUL7_A14623MAntColNom = new String[] {""} ;
      P0AUL7_A14568MAntColNum = new int[1] ;
      P0AUL7_A14613MAntArtDsc = new String[] {""} ;
      P0AUL7_A14567MAntArtCod = new String[] {""} ;
      P0AUL7_A14611MAntCliNom = new String[] {""} ;
      P0AUL7_A14562MAntId = new long[1] ;
      P0AUL7_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL7_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL7_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL7_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL7_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL7_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL8_A14564MAntUsu = new String[] {""} ;
      P0AUL8_A14563MAntTkn = new String[] {""} ;
      P0AUL8_A14566MAntEmprCo = new String[] {""} ;
      P0AUL8_A14565MAntCliCod = new int[1] ;
      P0AUL8_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL8_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL8_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL8_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL8_A14612MAntTipMDs = new String[] {""} ;
      P0AUL8_A14569MAntTipMCo = new String[] {""} ;
      P0AUL8_A14570MAntMaqCod = new String[] {""} ;
      P0AUL8_A14642MAntColCod = new byte[1] ;
      P0AUL8_A14623MAntColNom = new String[] {""} ;
      P0AUL8_A14568MAntColNum = new int[1] ;
      P0AUL8_A14613MAntArtDsc = new String[] {""} ;
      P0AUL8_A14567MAntArtCod = new String[] {""} ;
      P0AUL8_A14611MAntCliNom = new String[] {""} ;
      P0AUL8_A14562MAntId = new long[1] ;
      P0AUL8_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL8_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL8_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL8_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL8_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL8_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL9_A14564MAntUsu = new String[] {""} ;
      P0AUL9_A14563MAntTkn = new String[] {""} ;
      P0AUL9_A14566MAntEmprCo = new String[] {""} ;
      P0AUL9_A14565MAntCliCod = new int[1] ;
      P0AUL9_A14569MAntTipMCo = new String[] {""} ;
      P0AUL9_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL9_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL9_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL9_A14612MAntTipMDs = new String[] {""} ;
      P0AUL9_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL9_A14570MAntMaqCod = new String[] {""} ;
      P0AUL9_A14642MAntColCod = new byte[1] ;
      P0AUL9_A14623MAntColNom = new String[] {""} ;
      P0AUL9_A14568MAntColNum = new int[1] ;
      P0AUL9_A14613MAntArtDsc = new String[] {""} ;
      P0AUL9_A14567MAntArtCod = new String[] {""} ;
      P0AUL9_A14611MAntCliNom = new String[] {""} ;
      P0AUL9_A14562MAntId = new long[1] ;
      P0AUL9_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL9_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL9_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL9_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL9_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL9_n14647MAntMetTot = new boolean[] {false} ;
      P0AUL10_A14564MAntUsu = new String[] {""} ;
      P0AUL10_A14563MAntTkn = new String[] {""} ;
      P0AUL10_A14566MAntEmprCo = new String[] {""} ;
      P0AUL10_A14565MAntCliCod = new int[1] ;
      P0AUL10_A14612MAntTipMDs = new String[] {""} ;
      P0AUL10_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL10_n14648MAntMetPro = new boolean[] {false} ;
      P0AUL10_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL10_A14569MAntTipMCo = new String[] {""} ;
      P0AUL10_A14610MAntMaqDsc = new String[] {""} ;
      P0AUL10_A14570MAntMaqCod = new String[] {""} ;
      P0AUL10_A14642MAntColCod = new byte[1] ;
      P0AUL10_A14623MAntColNom = new String[] {""} ;
      P0AUL10_A14568MAntColNum = new int[1] ;
      P0AUL10_A14613MAntArtDsc = new String[] {""} ;
      P0AUL10_A14567MAntArtCod = new String[] {""} ;
      P0AUL10_A14611MAntCliNom = new String[] {""} ;
      P0AUL10_A14562MAntId = new long[1] ;
      P0AUL10_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL10_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL10_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL10_n14649MAntMetReo = new boolean[] {false} ;
      P0AUL10_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUL10_n14647MAntMetTot = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_filtradogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AUL2_A14565MAntCliCod, P0AUL2_A14564MAntUsu, P0AUL2_A14563MAntTkn, P0AUL2_A14566MAntEmprCo, P0AUL2_A14648MAntMetPro, P0AUL2_n14648MAntMetPro, P0AUL2_A14643MAntKilPro, P0AUL2_A14612MAntTipMDs, P0AUL2_A14569MAntTipMCo, P0AUL2_A14610MAntMaqDsc,
            P0AUL2_A14570MAntMaqCod, P0AUL2_A14642MAntColCod, P0AUL2_A14623MAntColNom, P0AUL2_A14568MAntColNum, P0AUL2_A14613MAntArtDsc, P0AUL2_A14567MAntArtCod, P0AUL2_A14611MAntCliNom, P0AUL2_A14562MAntId, P0AUL2_A14644MAntKilReo, P0AUL2_A14646MAntKilTot,
            P0AUL2_A14649MAntMetReo, P0AUL2_n14649MAntMetReo, P0AUL2_A14647MAntMetTot, P0AUL2_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL3_A14564MAntUsu, P0AUL3_A14563MAntTkn, P0AUL3_A14566MAntEmprCo, P0AUL3_A14565MAntCliCod, P0AUL3_A14611MAntCliNom, P0AUL3_A14648MAntMetPro, P0AUL3_n14648MAntMetPro, P0AUL3_A14643MAntKilPro, P0AUL3_A14612MAntTipMDs, P0AUL3_A14569MAntTipMCo,
            P0AUL3_A14610MAntMaqDsc, P0AUL3_A14570MAntMaqCod, P0AUL3_A14642MAntColCod, P0AUL3_A14623MAntColNom, P0AUL3_A14568MAntColNum, P0AUL3_A14613MAntArtDsc, P0AUL3_A14567MAntArtCod, P0AUL3_A14562MAntId, P0AUL3_A14644MAntKilReo, P0AUL3_A14646MAntKilTot,
            P0AUL3_A14649MAntMetReo, P0AUL3_n14649MAntMetReo, P0AUL3_A14647MAntMetTot, P0AUL3_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL4_A14566MAntEmprCo, P0AUL4_A14565MAntCliCod, P0AUL4_A14564MAntUsu, P0AUL4_A14563MAntTkn, P0AUL4_A14567MAntArtCod, P0AUL4_A14648MAntMetPro, P0AUL4_n14648MAntMetPro, P0AUL4_A14643MAntKilPro, P0AUL4_A14612MAntTipMDs, P0AUL4_A14569MAntTipMCo,
            P0AUL4_A14610MAntMaqDsc, P0AUL4_A14570MAntMaqCod, P0AUL4_A14642MAntColCod, P0AUL4_A14623MAntColNom, P0AUL4_A14568MAntColNum, P0AUL4_A14613MAntArtDsc, P0AUL4_A14611MAntCliNom, P0AUL4_A14562MAntId, P0AUL4_A14644MAntKilReo, P0AUL4_A14646MAntKilTot,
            P0AUL4_A14649MAntMetReo, P0AUL4_n14649MAntMetReo, P0AUL4_A14647MAntMetTot, P0AUL4_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL5_A14564MAntUsu, P0AUL5_A14563MAntTkn, P0AUL5_A14566MAntEmprCo, P0AUL5_A14565MAntCliCod, P0AUL5_A14613MAntArtDsc, P0AUL5_A14648MAntMetPro, P0AUL5_n14648MAntMetPro, P0AUL5_A14643MAntKilPro, P0AUL5_A14612MAntTipMDs, P0AUL5_A14569MAntTipMCo,
            P0AUL5_A14610MAntMaqDsc, P0AUL5_A14570MAntMaqCod, P0AUL5_A14642MAntColCod, P0AUL5_A14623MAntColNom, P0AUL5_A14568MAntColNum, P0AUL5_A14567MAntArtCod, P0AUL5_A14611MAntCliNom, P0AUL5_A14562MAntId, P0AUL5_A14644MAntKilReo, P0AUL5_A14646MAntKilTot,
            P0AUL5_A14649MAntMetReo, P0AUL5_n14649MAntMetReo, P0AUL5_A14647MAntMetTot, P0AUL5_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL6_A14564MAntUsu, P0AUL6_A14563MAntTkn, P0AUL6_A14566MAntEmprCo, P0AUL6_A14565MAntCliCod, P0AUL6_A14623MAntColNom, P0AUL6_A14648MAntMetPro, P0AUL6_n14648MAntMetPro, P0AUL6_A14643MAntKilPro, P0AUL6_A14612MAntTipMDs, P0AUL6_A14569MAntTipMCo,
            P0AUL6_A14610MAntMaqDsc, P0AUL6_A14570MAntMaqCod, P0AUL6_A14642MAntColCod, P0AUL6_A14568MAntColNum, P0AUL6_A14613MAntArtDsc, P0AUL6_A14567MAntArtCod, P0AUL6_A14611MAntCliNom, P0AUL6_A14562MAntId, P0AUL6_A14644MAntKilReo, P0AUL6_A14646MAntKilTot,
            P0AUL6_A14649MAntMetReo, P0AUL6_n14649MAntMetReo, P0AUL6_A14647MAntMetTot, P0AUL6_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL7_A14564MAntUsu, P0AUL7_A14563MAntTkn, P0AUL7_A14566MAntEmprCo, P0AUL7_A14565MAntCliCod, P0AUL7_A14570MAntMaqCod, P0AUL7_A14648MAntMetPro, P0AUL7_n14648MAntMetPro, P0AUL7_A14643MAntKilPro, P0AUL7_A14612MAntTipMDs, P0AUL7_A14569MAntTipMCo,
            P0AUL7_A14610MAntMaqDsc, P0AUL7_A14642MAntColCod, P0AUL7_A14623MAntColNom, P0AUL7_A14568MAntColNum, P0AUL7_A14613MAntArtDsc, P0AUL7_A14567MAntArtCod, P0AUL7_A14611MAntCliNom, P0AUL7_A14562MAntId, P0AUL7_A14644MAntKilReo, P0AUL7_A14646MAntKilTot,
            P0AUL7_A14649MAntMetReo, P0AUL7_n14649MAntMetReo, P0AUL7_A14647MAntMetTot, P0AUL7_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL8_A14564MAntUsu, P0AUL8_A14563MAntTkn, P0AUL8_A14566MAntEmprCo, P0AUL8_A14565MAntCliCod, P0AUL8_A14610MAntMaqDsc, P0AUL8_A14648MAntMetPro, P0AUL8_n14648MAntMetPro, P0AUL8_A14643MAntKilPro, P0AUL8_A14612MAntTipMDs, P0AUL8_A14569MAntTipMCo,
            P0AUL8_A14570MAntMaqCod, P0AUL8_A14642MAntColCod, P0AUL8_A14623MAntColNom, P0AUL8_A14568MAntColNum, P0AUL8_A14613MAntArtDsc, P0AUL8_A14567MAntArtCod, P0AUL8_A14611MAntCliNom, P0AUL8_A14562MAntId, P0AUL8_A14644MAntKilReo, P0AUL8_A14646MAntKilTot,
            P0AUL8_A14649MAntMetReo, P0AUL8_n14649MAntMetReo, P0AUL8_A14647MAntMetTot, P0AUL8_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL9_A14564MAntUsu, P0AUL9_A14563MAntTkn, P0AUL9_A14566MAntEmprCo, P0AUL9_A14565MAntCliCod, P0AUL9_A14569MAntTipMCo, P0AUL9_A14648MAntMetPro, P0AUL9_n14648MAntMetPro, P0AUL9_A14643MAntKilPro, P0AUL9_A14612MAntTipMDs, P0AUL9_A14610MAntMaqDsc,
            P0AUL9_A14570MAntMaqCod, P0AUL9_A14642MAntColCod, P0AUL9_A14623MAntColNom, P0AUL9_A14568MAntColNum, P0AUL9_A14613MAntArtDsc, P0AUL9_A14567MAntArtCod, P0AUL9_A14611MAntCliNom, P0AUL9_A14562MAntId, P0AUL9_A14644MAntKilReo, P0AUL9_A14646MAntKilTot,
            P0AUL9_A14649MAntMetReo, P0AUL9_n14649MAntMetReo, P0AUL9_A14647MAntMetTot, P0AUL9_n14647MAntMetTot
            }
            , new Object[] {
            P0AUL10_A14564MAntUsu, P0AUL10_A14563MAntTkn, P0AUL10_A14566MAntEmprCo, P0AUL10_A14565MAntCliCod, P0AUL10_A14612MAntTipMDs, P0AUL10_A14648MAntMetPro, P0AUL10_n14648MAntMetPro, P0AUL10_A14643MAntKilPro, P0AUL10_A14569MAntTipMCo, P0AUL10_A14610MAntMaqDsc,
            P0AUL10_A14570MAntMaqCod, P0AUL10_A14642MAntColCod, P0AUL10_A14623MAntColNom, P0AUL10_A14568MAntColNum, P0AUL10_A14613MAntArtDsc, P0AUL10_A14567MAntArtCod, P0AUL10_A14611MAntCliNom, P0AUL10_A14562MAntId, P0AUL10_A14644MAntKilReo, P0AUL10_A14646MAntKilTot,
            P0AUL10_A14649MAntMetReo, P0AUL10_n14649MAntMetReo, P0AUL10_A14647MAntMetTot, P0AUL10_n14647MAntMetTot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26TFMAntColCod ;
   private byte AV27TFMAntColCod_To ;
   private byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ;
   private byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ;
   private byte A14642MAntColCod ;
   private short Gx_err ;
   private int AV91GXV1 ;
   private int AV14TFMAntCliCod ;
   private int AV15TFMAntCliCod_To ;
   private int AV24TFMAntColNum ;
   private int AV25TFMAntColNum_To ;
   private int AV67CliCod ;
   private int AV69ForColNum ;
   private int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ;
   private int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ;
   private int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ;
   private int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ;
   private int AV71TipMaqCodCollection_size ;
   private int A14565MAntCliCod ;
   private int A14568MAntColNum ;
   private long AV10TFMAntId ;
   private long AV11TFMAntId_To ;
   private long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ;
   private long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ;
   private long A14562MAntId ;
   private long AV48count ;
   private java.math.BigDecimal AV74TFMAntKilTot ;
   private java.math.BigDecimal AV75TFMAntKilTot_To ;
   private java.math.BigDecimal AV36TFMAntKilProd ;
   private java.math.BigDecimal AV37TFMAntKilProd_To ;
   private java.math.BigDecimal AV38TFMAntKilReo ;
   private java.math.BigDecimal AV39TFMAntKilReo_To ;
   private java.math.BigDecimal AV40TFMAntPorc ;
   private java.math.BigDecimal AV41TFMAntPorc_To ;
   private java.math.BigDecimal AV85TFMAntMetTot ;
   private java.math.BigDecimal AV86TFMAntMetTot_To ;
   private java.math.BigDecimal AV81TFMAntMetProd ;
   private java.math.BigDecimal AV82TFMAntMetProd_To ;
   private java.math.BigDecimal AV83TFMAntMetReo ;
   private java.math.BigDecimal AV84TFMAntMetReo_To ;
   private java.math.BigDecimal AV87TFMantMetPor ;
   private java.math.BigDecimal AV88TFMantMetPor_To ;
   private java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ;
   private java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ;
   private java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ;
   private java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ;
   private java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ;
   private java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ;
   private java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ;
   private java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ;
   private java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ;
   private java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ;
   private java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ;
   private java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ;
   private java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ;
   private java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ;
   private java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ;
   private java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14647MAntMetTot ;
   private java.math.BigDecimal A14648MAntMetPro ;
   private java.math.BigDecimal A14649MAntMetReo ;
   private java.math.BigDecimal A14650MantMetPor ;
   private java.math.BigDecimal A14645MAntPorc ;
   private String AV12TFMAntEmprCod ;
   private String AV13TFMAntEmprCod_Sel ;
   private String AV18TFMAntArtCod ;
   private String AV19TFMAntArtCod_Sel ;
   private String AV22TFMAntColNom ;
   private String AV23TFMAntColNom_Sel ;
   private String AV28TFMAntMaqCod ;
   private String AV29TFMAntMaqCod_Sel ;
   private String AV32TFMAntTipMCod ;
   private String AV33TFMAntTipMCod_Sel ;
   private String AV63MAntEmprCod ;
   private String AV68ArtCod ;
   private String A14566MAntEmprCo ;
   private String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ;
   private String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ;
   private String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ;
   private String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ;
   private String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ;
   private String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ;
   private String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ;
   private String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ;
   private String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ;
   private String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ;
   private String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ;
   private String scmdbuf ;
   private String lV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ;
   private String lV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ;
   private String lV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ;
   private String lV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ;
   private String lV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ;
   private String A14569MAntTipMCo ;
   private String A14567MAntArtCod ;
   private String A14623MAntColNom ;
   private String A14570MAntMaqCod ;
   private String A14564MAntUsu ;
   private java.util.Date AV72FechaInicio ;
   private java.util.Date AV73FechaFin ;
   private boolean returnInSub ;
   private boolean brkAUL2 ;
   private boolean n14648MAntMetPro ;
   private boolean n14649MAntMetReo ;
   private boolean n14647MAntMetTot ;
   private boolean brkAUL4 ;
   private boolean brkAUL6 ;
   private boolean brkAUL8 ;
   private boolean brkAUL10 ;
   private boolean brkAUL12 ;
   private boolean brkAUL14 ;
   private boolean brkAUL16 ;
   private boolean brkAUL18 ;
   private String AV57OptionsJson ;
   private String AV58OptionsDescJson ;
   private String AV59OptionIndexesJson ;
   private String AV54DDOName ;
   private String AV55SearchTxt ;
   private String AV56SearchTxtTo ;
   private String AV60FilterFullText ;
   private String AV16TFMAntCliNom ;
   private String AV17TFMAntCliNom_Sel ;
   private String AV20TFMAntArtDsc ;
   private String AV21TFMAntArtDsc_Sel ;
   private String AV30TFMAntMaqDsc ;
   private String AV31TFMAntMaqDsc_Sel ;
   private String AV34TFMAntTipMDsc ;
   private String AV35TFMAntTipMDsc_Sel ;
   private String AV70TipMaqCodJSON ;
   private String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ;
   private String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ;
   private String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ;
   private String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ;
   private String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ;
   private String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ;
   private String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ;
   private String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ;
   private String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ;
   private String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ;
   private String lV93Anticipacionerrores_mant_filtradods_1_filterfulltext ;
   private String lV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ;
   private String lV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ;
   private String lV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ;
   private String lV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ;
   private String A14611MAntCliNom ;
   private String A14613MAntArtDsc ;
   private String A14610MAntMaqDsc ;
   private String A14612MAntTipMDs ;
   private String A14563MAntTkn ;
   private String AV43Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private GXSimpleCollection<String> AV71TipMaqCodCollection ;
   private app.anticipacionerrores.SdtsdtMTok AV80sdtMTok ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AUL2_A14565MAntCliCod ;
   private String[] P0AUL2_A14564MAntUsu ;
   private String[] P0AUL2_A14563MAntTkn ;
   private String[] P0AUL2_A14566MAntEmprCo ;
   private java.math.BigDecimal[] P0AUL2_A14648MAntMetPro ;
   private boolean[] P0AUL2_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL2_A14643MAntKilPro ;
   private String[] P0AUL2_A14612MAntTipMDs ;
   private String[] P0AUL2_A14569MAntTipMCo ;
   private String[] P0AUL2_A14610MAntMaqDsc ;
   private String[] P0AUL2_A14570MAntMaqCod ;
   private byte[] P0AUL2_A14642MAntColCod ;
   private String[] P0AUL2_A14623MAntColNom ;
   private int[] P0AUL2_A14568MAntColNum ;
   private String[] P0AUL2_A14613MAntArtDsc ;
   private String[] P0AUL2_A14567MAntArtCod ;
   private String[] P0AUL2_A14611MAntCliNom ;
   private long[] P0AUL2_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL2_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL2_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL2_A14649MAntMetReo ;
   private boolean[] P0AUL2_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL2_A14647MAntMetTot ;
   private boolean[] P0AUL2_n14647MAntMetTot ;
   private String[] P0AUL3_A14564MAntUsu ;
   private String[] P0AUL3_A14563MAntTkn ;
   private String[] P0AUL3_A14566MAntEmprCo ;
   private int[] P0AUL3_A14565MAntCliCod ;
   private String[] P0AUL3_A14611MAntCliNom ;
   private java.math.BigDecimal[] P0AUL3_A14648MAntMetPro ;
   private boolean[] P0AUL3_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL3_A14643MAntKilPro ;
   private String[] P0AUL3_A14612MAntTipMDs ;
   private String[] P0AUL3_A14569MAntTipMCo ;
   private String[] P0AUL3_A14610MAntMaqDsc ;
   private String[] P0AUL3_A14570MAntMaqCod ;
   private byte[] P0AUL3_A14642MAntColCod ;
   private String[] P0AUL3_A14623MAntColNom ;
   private int[] P0AUL3_A14568MAntColNum ;
   private String[] P0AUL3_A14613MAntArtDsc ;
   private String[] P0AUL3_A14567MAntArtCod ;
   private long[] P0AUL3_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL3_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL3_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL3_A14649MAntMetReo ;
   private boolean[] P0AUL3_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL3_A14647MAntMetTot ;
   private boolean[] P0AUL3_n14647MAntMetTot ;
   private String[] P0AUL4_A14566MAntEmprCo ;
   private int[] P0AUL4_A14565MAntCliCod ;
   private String[] P0AUL4_A14564MAntUsu ;
   private String[] P0AUL4_A14563MAntTkn ;
   private String[] P0AUL4_A14567MAntArtCod ;
   private java.math.BigDecimal[] P0AUL4_A14648MAntMetPro ;
   private boolean[] P0AUL4_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL4_A14643MAntKilPro ;
   private String[] P0AUL4_A14612MAntTipMDs ;
   private String[] P0AUL4_A14569MAntTipMCo ;
   private String[] P0AUL4_A14610MAntMaqDsc ;
   private String[] P0AUL4_A14570MAntMaqCod ;
   private byte[] P0AUL4_A14642MAntColCod ;
   private String[] P0AUL4_A14623MAntColNom ;
   private int[] P0AUL4_A14568MAntColNum ;
   private String[] P0AUL4_A14613MAntArtDsc ;
   private String[] P0AUL4_A14611MAntCliNom ;
   private long[] P0AUL4_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL4_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL4_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL4_A14649MAntMetReo ;
   private boolean[] P0AUL4_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL4_A14647MAntMetTot ;
   private boolean[] P0AUL4_n14647MAntMetTot ;
   private String[] P0AUL5_A14564MAntUsu ;
   private String[] P0AUL5_A14563MAntTkn ;
   private String[] P0AUL5_A14566MAntEmprCo ;
   private int[] P0AUL5_A14565MAntCliCod ;
   private String[] P0AUL5_A14613MAntArtDsc ;
   private java.math.BigDecimal[] P0AUL5_A14648MAntMetPro ;
   private boolean[] P0AUL5_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL5_A14643MAntKilPro ;
   private String[] P0AUL5_A14612MAntTipMDs ;
   private String[] P0AUL5_A14569MAntTipMCo ;
   private String[] P0AUL5_A14610MAntMaqDsc ;
   private String[] P0AUL5_A14570MAntMaqCod ;
   private byte[] P0AUL5_A14642MAntColCod ;
   private String[] P0AUL5_A14623MAntColNom ;
   private int[] P0AUL5_A14568MAntColNum ;
   private String[] P0AUL5_A14567MAntArtCod ;
   private String[] P0AUL5_A14611MAntCliNom ;
   private long[] P0AUL5_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL5_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL5_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL5_A14649MAntMetReo ;
   private boolean[] P0AUL5_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL5_A14647MAntMetTot ;
   private boolean[] P0AUL5_n14647MAntMetTot ;
   private String[] P0AUL6_A14564MAntUsu ;
   private String[] P0AUL6_A14563MAntTkn ;
   private String[] P0AUL6_A14566MAntEmprCo ;
   private int[] P0AUL6_A14565MAntCliCod ;
   private String[] P0AUL6_A14623MAntColNom ;
   private java.math.BigDecimal[] P0AUL6_A14648MAntMetPro ;
   private boolean[] P0AUL6_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL6_A14643MAntKilPro ;
   private String[] P0AUL6_A14612MAntTipMDs ;
   private String[] P0AUL6_A14569MAntTipMCo ;
   private String[] P0AUL6_A14610MAntMaqDsc ;
   private String[] P0AUL6_A14570MAntMaqCod ;
   private byte[] P0AUL6_A14642MAntColCod ;
   private int[] P0AUL6_A14568MAntColNum ;
   private String[] P0AUL6_A14613MAntArtDsc ;
   private String[] P0AUL6_A14567MAntArtCod ;
   private String[] P0AUL6_A14611MAntCliNom ;
   private long[] P0AUL6_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL6_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL6_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL6_A14649MAntMetReo ;
   private boolean[] P0AUL6_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL6_A14647MAntMetTot ;
   private boolean[] P0AUL6_n14647MAntMetTot ;
   private String[] P0AUL7_A14564MAntUsu ;
   private String[] P0AUL7_A14563MAntTkn ;
   private String[] P0AUL7_A14566MAntEmprCo ;
   private int[] P0AUL7_A14565MAntCliCod ;
   private String[] P0AUL7_A14570MAntMaqCod ;
   private java.math.BigDecimal[] P0AUL7_A14648MAntMetPro ;
   private boolean[] P0AUL7_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL7_A14643MAntKilPro ;
   private String[] P0AUL7_A14612MAntTipMDs ;
   private String[] P0AUL7_A14569MAntTipMCo ;
   private String[] P0AUL7_A14610MAntMaqDsc ;
   private byte[] P0AUL7_A14642MAntColCod ;
   private String[] P0AUL7_A14623MAntColNom ;
   private int[] P0AUL7_A14568MAntColNum ;
   private String[] P0AUL7_A14613MAntArtDsc ;
   private String[] P0AUL7_A14567MAntArtCod ;
   private String[] P0AUL7_A14611MAntCliNom ;
   private long[] P0AUL7_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL7_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL7_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL7_A14649MAntMetReo ;
   private boolean[] P0AUL7_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL7_A14647MAntMetTot ;
   private boolean[] P0AUL7_n14647MAntMetTot ;
   private String[] P0AUL8_A14564MAntUsu ;
   private String[] P0AUL8_A14563MAntTkn ;
   private String[] P0AUL8_A14566MAntEmprCo ;
   private int[] P0AUL8_A14565MAntCliCod ;
   private String[] P0AUL8_A14610MAntMaqDsc ;
   private java.math.BigDecimal[] P0AUL8_A14648MAntMetPro ;
   private boolean[] P0AUL8_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL8_A14643MAntKilPro ;
   private String[] P0AUL8_A14612MAntTipMDs ;
   private String[] P0AUL8_A14569MAntTipMCo ;
   private String[] P0AUL8_A14570MAntMaqCod ;
   private byte[] P0AUL8_A14642MAntColCod ;
   private String[] P0AUL8_A14623MAntColNom ;
   private int[] P0AUL8_A14568MAntColNum ;
   private String[] P0AUL8_A14613MAntArtDsc ;
   private String[] P0AUL8_A14567MAntArtCod ;
   private String[] P0AUL8_A14611MAntCliNom ;
   private long[] P0AUL8_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL8_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL8_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL8_A14649MAntMetReo ;
   private boolean[] P0AUL8_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL8_A14647MAntMetTot ;
   private boolean[] P0AUL8_n14647MAntMetTot ;
   private String[] P0AUL9_A14564MAntUsu ;
   private String[] P0AUL9_A14563MAntTkn ;
   private String[] P0AUL9_A14566MAntEmprCo ;
   private int[] P0AUL9_A14565MAntCliCod ;
   private String[] P0AUL9_A14569MAntTipMCo ;
   private java.math.BigDecimal[] P0AUL9_A14648MAntMetPro ;
   private boolean[] P0AUL9_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL9_A14643MAntKilPro ;
   private String[] P0AUL9_A14612MAntTipMDs ;
   private String[] P0AUL9_A14610MAntMaqDsc ;
   private String[] P0AUL9_A14570MAntMaqCod ;
   private byte[] P0AUL9_A14642MAntColCod ;
   private String[] P0AUL9_A14623MAntColNom ;
   private int[] P0AUL9_A14568MAntColNum ;
   private String[] P0AUL9_A14613MAntArtDsc ;
   private String[] P0AUL9_A14567MAntArtCod ;
   private String[] P0AUL9_A14611MAntCliNom ;
   private long[] P0AUL9_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL9_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL9_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL9_A14649MAntMetReo ;
   private boolean[] P0AUL9_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL9_A14647MAntMetTot ;
   private boolean[] P0AUL9_n14647MAntMetTot ;
   private String[] P0AUL10_A14564MAntUsu ;
   private String[] P0AUL10_A14563MAntTkn ;
   private String[] P0AUL10_A14566MAntEmprCo ;
   private int[] P0AUL10_A14565MAntCliCod ;
   private String[] P0AUL10_A14612MAntTipMDs ;
   private java.math.BigDecimal[] P0AUL10_A14648MAntMetPro ;
   private boolean[] P0AUL10_n14648MAntMetPro ;
   private java.math.BigDecimal[] P0AUL10_A14643MAntKilPro ;
   private String[] P0AUL10_A14569MAntTipMCo ;
   private String[] P0AUL10_A14610MAntMaqDsc ;
   private String[] P0AUL10_A14570MAntMaqCod ;
   private byte[] P0AUL10_A14642MAntColCod ;
   private String[] P0AUL10_A14623MAntColNom ;
   private int[] P0AUL10_A14568MAntColNum ;
   private String[] P0AUL10_A14613MAntArtDsc ;
   private String[] P0AUL10_A14567MAntArtCod ;
   private String[] P0AUL10_A14611MAntCliNom ;
   private long[] P0AUL10_A14562MAntId ;
   private java.math.BigDecimal[] P0AUL10_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUL10_A14646MAntKilTot ;
   private java.math.BigDecimal[] P0AUL10_A14649MAntMetReo ;
   private boolean[] P0AUL10_n14649MAntMetReo ;
   private java.math.BigDecimal[] P0AUL10_A14647MAntMetTot ;
   private boolean[] P0AUL10_n14647MAntMetTot ;
   private GXSimpleCollection<String> AV44Options ;
   private GXSimpleCollection<String> AV46OptionsDesc ;
   private GXSimpleCollection<String> AV47OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class mant_filtradogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV67CliCod ,
                                          String AV63MAntEmprCod ,
                                          String A14563MAntTkn ,
                                          String A14564MAntUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[69];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MAntCliCod, MAntUsu, MAntTkn, MAntEmprCo, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntTkn = ? and MAntUsu = ? and MAntCliCod = ? and MAntEmprCo = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
         GXv_int2[20] = (byte)(1) ;
         GXv_int2[21] = (byte)(1) ;
         GXv_int2[22] = (byte)(1) ;
         GXv_int2[23] = (byte)(1) ;
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int2[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int2[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int2[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntTkn, MAntUsu, MAntCliCod, MAntEmprCo" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AUL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String A14564MAntUsu ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          String A14563MAntTkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV63MAntEmprCod ,
                                          int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[69];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntCliNom, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum," ;
      scmdbuf += " MAntArtDsc, MAntArtCod, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
         GXv_int5[14] = (byte)(1) ;
         GXv_int5[15] = (byte)(1) ;
         GXv_int5[16] = (byte)(1) ;
         GXv_int5[17] = (byte)(1) ;
         GXv_int5[18] = (byte)(1) ;
         GXv_int5[19] = (byte)(1) ;
         GXv_int5[20] = (byte)(1) ;
         GXv_int5[21] = (byte)(1) ;
         GXv_int5[22] = (byte)(1) ;
         GXv_int5[23] = (byte)(1) ;
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int5[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int5[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int5[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int5[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int5[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int5[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int5[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int5[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int5[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int5[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int5[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int5[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int5[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int5[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int5[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int5[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int5[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int5[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int5[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntCliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0AUL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV67CliCod ,
                                          String AV63MAntEmprCod ,
                                          String A14563MAntTkn ,
                                          String A14564MAntUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[69];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT MAntEmprCo, MAntCliCod, MAntUsu, MAntTkn, MAntArtCod, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum," ;
      scmdbuf += " MAntArtDsc, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntTkn = ? and MAntUsu = ? and MAntCliCod = ? and MAntEmprCo = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
         GXv_int8[20] = (byte)(1) ;
         GXv_int8[21] = (byte)(1) ;
         GXv_int8[22] = (byte)(1) ;
         GXv_int8[23] = (byte)(1) ;
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int8[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int8[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int8[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntTkn, MAntUsu, MAntCliCod, MAntEmprCo, MAntArtCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AUL5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String A14564MAntUsu ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          String A14563MAntTkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV63MAntEmprCod ,
                                          int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[69];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntArtDsc, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
         GXv_int11[14] = (byte)(1) ;
         GXv_int11[15] = (byte)(1) ;
         GXv_int11[16] = (byte)(1) ;
         GXv_int11[17] = (byte)(1) ;
         GXv_int11[18] = (byte)(1) ;
         GXv_int11[19] = (byte)(1) ;
         GXv_int11[20] = (byte)(1) ;
         GXv_int11[21] = (byte)(1) ;
         GXv_int11[22] = (byte)(1) ;
         GXv_int11[23] = (byte)(1) ;
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int11[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int11[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int11[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int11[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int11[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int11[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int11[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int11[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int11[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int11[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int11[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int11[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int11[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int11[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntArtDsc" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AUL6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String A14564MAntUsu ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          String A14563MAntTkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV63MAntEmprCod ,
                                          int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[69];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntColNom, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntArtDsc," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
         GXv_int14[16] = (byte)(1) ;
         GXv_int14[17] = (byte)(1) ;
         GXv_int14[18] = (byte)(1) ;
         GXv_int14[19] = (byte)(1) ;
         GXv_int14[20] = (byte)(1) ;
         GXv_int14[21] = (byte)(1) ;
         GXv_int14[22] = (byte)(1) ;
         GXv_int14[23] = (byte)(1) ;
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int14[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int14[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int14[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int14[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int14[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int14[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0AUL7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String A14564MAntUsu ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          String A14563MAntTkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV63MAntEmprCod ,
                                          int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[69];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntMaqCod, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
         GXv_int17[13] = (byte)(1) ;
         GXv_int17[14] = (byte)(1) ;
         GXv_int17[15] = (byte)(1) ;
         GXv_int17[16] = (byte)(1) ;
         GXv_int17[17] = (byte)(1) ;
         GXv_int17[18] = (byte)(1) ;
         GXv_int17[19] = (byte)(1) ;
         GXv_int17[20] = (byte)(1) ;
         GXv_int17[21] = (byte)(1) ;
         GXv_int17[22] = (byte)(1) ;
         GXv_int17[23] = (byte)(1) ;
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int17[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int17[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int17[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int17[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int17[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int17[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int17[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int17[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int17[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int17[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int17[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int17[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int17[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int17[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntMaqCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P0AUL8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String A14564MAntUsu ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          String A14563MAntTkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV63MAntEmprCod ,
                                          int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[69];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntMaqDsc, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
         GXv_int20[13] = (byte)(1) ;
         GXv_int20[14] = (byte)(1) ;
         GXv_int20[15] = (byte)(1) ;
         GXv_int20[16] = (byte)(1) ;
         GXv_int20[17] = (byte)(1) ;
         GXv_int20[18] = (byte)(1) ;
         GXv_int20[19] = (byte)(1) ;
         GXv_int20[20] = (byte)(1) ;
         GXv_int20[21] = (byte)(1) ;
         GXv_int20[22] = (byte)(1) ;
         GXv_int20[23] = (byte)(1) ;
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int20[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int20[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int20[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int20[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int20[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int20[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int20[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int20[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int20[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int20[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int20[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int20[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int20[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int20[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntMaqDsc" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P0AUL9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                          String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV68ArtCod ,
                                          int AV69ForColNum ,
                                          int AV71TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          String A14564MAntUsu ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          String A14563MAntTkn ,
                                          String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV63MAntEmprCod ,
                                          int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[69];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntTipMCo, MAntMetPro, MAntKilPro, MAntTipMDs, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
         GXv_int23[15] = (byte)(1) ;
         GXv_int23[16] = (byte)(1) ;
         GXv_int23[17] = (byte)(1) ;
         GXv_int23[18] = (byte)(1) ;
         GXv_int23[19] = (byte)(1) ;
         GXv_int23[20] = (byte)(1) ;
         GXv_int23[21] = (byte)(1) ;
         GXv_int23[22] = (byte)(1) ;
         GXv_int23[23] = (byte)(1) ;
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int23[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int23[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int23[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int23[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int23[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int23[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int23[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int23[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int23[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int23[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int23[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int23[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int23[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int23[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntTipMCo" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P0AUL10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A14569MAntTipMCo ,
                                           GXSimpleCollection<String> AV71TipMaqCodCollection ,
                                           String AV93Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           long AV94Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                           long AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                           String AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           String AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           int AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                           int AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                           String AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           String AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           String AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           String AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           String AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           String AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           int AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                           int AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                           String AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           String AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           byte AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                           byte AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                           String AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           String AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           String AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           String AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           String AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           String AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           String AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           String AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           java.math.BigDecimal AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           java.math.BigDecimal AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           java.math.BigDecimal AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           java.math.BigDecimal AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           java.math.BigDecimal AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           String AV68ArtCod ,
                                           int AV69ForColNum ,
                                           int AV71TipMaqCodCollection_size ,
                                           long A14562MAntId ,
                                           String A14566MAntEmprCo ,
                                           int A14565MAntCliCod ,
                                           String A14611MAntCliNom ,
                                           String A14567MAntArtCod ,
                                           String A14613MAntArtDsc ,
                                           int A14568MAntColNum ,
                                           String A14623MAntColNom ,
                                           byte A14642MAntColCod ,
                                           String A14570MAntMaqCod ,
                                           String A14610MAntMaqDsc ,
                                           String A14612MAntTipMDs ,
                                           java.math.BigDecimal A14646MAntKilTot ,
                                           java.math.BigDecimal A14643MAntKilPro ,
                                           java.math.BigDecimal A14644MAntKilReo ,
                                           java.math.BigDecimal A14647MAntMetTot ,
                                           java.math.BigDecimal A14648MAntMetPro ,
                                           java.math.BigDecimal A14649MAntMetReo ,
                                           String A14564MAntUsu ,
                                           String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                           String A14563MAntTkn ,
                                           String AV80sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                           String AV63MAntEmprCod ,
                                           int AV67CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[69];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT MAntUsu, MAntTkn, MAntEmprCo, MAntCliCod, MAntTipMDs, MAntMetPro, MAntKilPro, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc," ;
      scmdbuf += " MAntArtCod, MAntCliNom, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot FROM MAnt" ;
      addWhere(sWhereString, "(MAntUsu = ?)");
      addWhere(sWhereString, "(MAntTkn = ?)");
      addWhere(sWhereString, "(MAntEmprCo = ?)");
      addWhere(sWhereString, "(MAntCliCod = ?)");
      if ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
         GXv_int26[5] = (byte)(1) ;
         GXv_int26[6] = (byte)(1) ;
         GXv_int26[7] = (byte)(1) ;
         GXv_int26[8] = (byte)(1) ;
         GXv_int26[9] = (byte)(1) ;
         GXv_int26[10] = (byte)(1) ;
         GXv_int26[11] = (byte)(1) ;
         GXv_int26[12] = (byte)(1) ;
         GXv_int26[13] = (byte)(1) ;
         GXv_int26[14] = (byte)(1) ;
         GXv_int26[15] = (byte)(1) ;
         GXv_int26[16] = (byte)(1) ;
         GXv_int26[17] = (byte)(1) ;
         GXv_int26[18] = (byte)(1) ;
         GXv_int26[19] = (byte)(1) ;
         GXv_int26[20] = (byte)(1) ;
         GXv_int26[21] = (byte)(1) ;
         GXv_int26[22] = (byte)(1) ;
         GXv_int26[23] = (byte)(1) ;
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV94Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV95Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (0==AV106Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (0==AV107Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV112Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int26[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV116Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int26[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int26[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int26[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int26[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int26[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int26[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int26[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int26[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int26[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int26[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int26[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int26[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int26[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int26[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int26[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int26[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int26[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int26[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int26[67] = (byte)(1) ;
      }
      if ( ! (0==AV69ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int26[68] = (byte)(1) ;
      }
      if ( AV71TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntTipMDs" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_P0AUL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 1 :
                  return conditional_P0AUL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
            case 2 :
                  return conditional_P0AUL4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 3 :
                  return conditional_P0AUL5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
            case 4 :
                  return conditional_P0AUL6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
            case 5 :
                  return conditional_P0AUL7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
            case 6 :
                  return conditional_P0AUL8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
            case 7 :
                  return conditional_P0AUL9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
            case 8 :
                  return conditional_P0AUL10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUL10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getVarchar(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getVarchar(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getVarchar(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getVarchar(15);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getVarchar(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getVarchar(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getVarchar(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getVarchar(16);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[69], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 256);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
      }
   }

}

