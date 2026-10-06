package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwlismergetfilterdata extends GXProcedure
{
   public webwlismergetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlismergetfilterdata.class ), "" );
   }

   public webwlismergetfilterdata( int remoteHandle ,
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
      webwlismergetfilterdata.this.aP5 = new String[] {""};
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
      webwlismergetfilterdata.this.AV36DDOName = aP0;
      webwlismergetfilterdata.this.AV34SearchTxt = aP1;
      webwlismergetfilterdata.this.AV35SearchTxtTo = aP2;
      webwlismergetfilterdata.this.aP3 = aP3;
      webwlismergetfilterdata.this.aP4 = aP4;
      webwlismergetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARGOTS") == 0 )
      {
         /* Execute user subroutine: 'LOADBARGOTSOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARGRS") == 0 )
      {
         /* Execute user subroutine: 'LOADBARGRSOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BAROCS") == 0 )
      {
         /* Execute user subroutine: 'LOADBAROCSOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARRCS") == 0 )
      {
         /* Execute user subroutine: 'LOADBARRCSOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BAROEKO") == 0 )
      {
         /* Execute user subroutine: 'LOADBAROEKOOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARMARCA") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMARCAOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARFASCOD2") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCOD2OPTIONS' */
         S241 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARFASDSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASDSC2OPTIONS' */
         S251 ();
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
      if ( GXutil.strcmp(AV47Session.getValue("WebWlismerGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWlismerGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("WebWlismerGridState"), null, null);
      }
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV66FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECSAL") == 0 )
         {
            AV54BarFecSal = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV55BarFecSal_To = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV56CliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57CliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV58BarSer = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV59BarSer_To = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV60BarColNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV61BarColNom_To = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV62BarColNum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63BarColNum_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV14TFBarNHdr = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV15TFBarNHdr_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV16TFBarTipArt = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFBarTipArt_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV20TFBarSer = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV21TFBarSer_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV22TFBarSerDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV23TFBarSerDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV24TFBarColNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV25TFBarColNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV26TFBarNomCli = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV27TFBarNomCli_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV28TFBarColNum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarColNum_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV52TFBarFecSal = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV30TFBarFecCli = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV32TFBarKgm = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFBarKgm_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV64TFBarRdto4 = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFBarRdto4_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV67TFBarGots = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV68TFBarGots_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV69TFBarGrs = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV70TFBarGrs_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV71TFBarOcs = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV72TFBarOcs_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV73TFBarRcs = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV74TFBarRcs_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV75TFBarOeko = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV76TFBarOeko_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV77TFBarAccesorios_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV78TFBarMarca = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV79TFBarMarca_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV80TFBar_MacCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFBar_MacCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV82TFBarFasCod2 = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV83TFBarFasCod2_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV84TFBarFasDsc2 = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV85TFBarFasDsc2_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV34SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL8 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8FL2 = false ;
         A4466BarAcaAnh = P08FL8_A4466BarAcaAnh[0] ;
         A279CliNom = P08FL8_A279CliNom[0] ;
         A13769BarRdto4 = P08FL8_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL8_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL8_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL8_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL8_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL8_A217BarTipArt[0] ;
         n217BarTipArt = P08FL8_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL8_A13696BarNHdr[0] ;
         A136BarColNum = P08FL8_A136BarColNum[0] ;
         A135BarColNom = P08FL8_A135BarColNom[0] ;
         A212BarSer = P08FL8_A212BarSer[0] ;
         A252CliCod = P08FL8_A252CliCod[0] ;
         n252CliCod = P08FL8_n252CliCod[0] ;
         A161BarFecSal = P08FL8_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL8_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL8_A13861BarMarca[0] ;
         n13861BarMarca = P08FL8_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL8_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL8_n13860BarAccesor[0] ;
         A166BarKgm = P08FL8_A166BarKgm[0] ;
         n166BarKgm = P08FL8_n166BarKgm[0] ;
         A129BarCod = P08FL8_A129BarCod[0] ;
         A132BarCodReo = P08FL8_A132BarCodReo[0] ;
         A130BarCodPar = P08FL8_A130BarCodPar[0] ;
         A361DisCod = P08FL8_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL8_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL8_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL8_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL8_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL8_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL8_A13861BarMarca[0] ;
         n13861BarMarca = P08FL8_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL8_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL8_n13860BarAccesor[0] ;
         A166BarKgm = P08FL8_A166BarKgm[0] ;
         n166BarKgm = P08FL8_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                AV46count = 0 ;
                                                while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08FL8_A279CliNom[0], A279CliNom) == 0 ) )
                                                {
                                                   brk8FL2 = false ;
                                                   A252CliCod = P08FL8_A252CliCod[0] ;
                                                   n252CliCod = P08FL8_n252CliCod[0] ;
                                                   A129BarCod = P08FL8_A129BarCod[0] ;
                                                   A132BarCodReo = P08FL8_A132BarCodReo[0] ;
                                                   A130BarCodPar = P08FL8_A130BarCodPar[0] ;
                                                   A396EmprCod = P08FL8_A396EmprCod[0] ;
                                                   AV46count = (long)(AV46count+1) ;
                                                   brk8FL2 = true ;
                                                   pr_default.readNext(0);
                                                }
                                                if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                                                {
                                                   AV38Option = A279CliNom ;
                                                   AV39Options.add(AV38Option, 0);
                                                   AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8FL2 )
         {
            brk8FL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarNHdr = AV34SearchTxt ;
      AV15TFBarNHdr_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL15 */
      pr_default.execute(1, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4466BarAcaAnh = P08FL15_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL15_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL15_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL15_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL15_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL15_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL15_A217BarTipArt[0] ;
         n217BarTipArt = P08FL15_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL15_A13696BarNHdr[0] ;
         A279CliNom = P08FL15_A279CliNom[0] ;
         A136BarColNum = P08FL15_A136BarColNum[0] ;
         A135BarColNom = P08FL15_A135BarColNom[0] ;
         A212BarSer = P08FL15_A212BarSer[0] ;
         A252CliCod = P08FL15_A252CliCod[0] ;
         n252CliCod = P08FL15_n252CliCod[0] ;
         A161BarFecSal = P08FL15_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL15_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL15_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL15_A13861BarMarca[0] ;
         n13861BarMarca = P08FL15_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL15_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL15_n13860BarAccesor[0] ;
         A166BarKgm = P08FL15_A166BarKgm[0] ;
         n166BarKgm = P08FL15_n166BarKgm[0] ;
         A129BarCod = P08FL15_A129BarCod[0] ;
         A132BarCodReo = P08FL15_A132BarCodReo[0] ;
         A130BarCodPar = P08FL15_A130BarCodPar[0] ;
         A361DisCod = P08FL15_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL15_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL15_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL15_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL15_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL15_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL15_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL15_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL15_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL15_A13861BarMarca[0] ;
         n13861BarMarca = P08FL15_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL15_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL15_n13860BarAccesor[0] ;
         A166BarKgm = P08FL15_A166BarKgm[0] ;
         n166BarKgm = P08FL15_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                                                {
                                                   AV38Option = A13696BarNHdr ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarSer = AV34SearchTxt ;
      AV21TFBarSer_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL22 */
      pr_default.execute(2, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8FL5 = false ;
         A4466BarAcaAnh = P08FL22_A4466BarAcaAnh[0] ;
         A212BarSer = P08FL22_A212BarSer[0] ;
         A13769BarRdto4 = P08FL22_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL22_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL22_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL22_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL22_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL22_A217BarTipArt[0] ;
         n217BarTipArt = P08FL22_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL22_A13696BarNHdr[0] ;
         A279CliNom = P08FL22_A279CliNom[0] ;
         A136BarColNum = P08FL22_A136BarColNum[0] ;
         A135BarColNom = P08FL22_A135BarColNom[0] ;
         A252CliCod = P08FL22_A252CliCod[0] ;
         n252CliCod = P08FL22_n252CliCod[0] ;
         A161BarFecSal = P08FL22_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL22_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL22_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL22_A13861BarMarca[0] ;
         n13861BarMarca = P08FL22_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL22_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL22_n13860BarAccesor[0] ;
         A166BarKgm = P08FL22_A166BarKgm[0] ;
         n166BarKgm = P08FL22_n166BarKgm[0] ;
         A129BarCod = P08FL22_A129BarCod[0] ;
         A132BarCodReo = P08FL22_A132BarCodReo[0] ;
         A130BarCodPar = P08FL22_A130BarCodPar[0] ;
         A361DisCod = P08FL22_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL22_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL22_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL22_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL22_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL22_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL22_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL22_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL22_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL22_A13861BarMarca[0] ;
         n13861BarMarca = P08FL22_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL22_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL22_n13860BarAccesor[0] ;
         A166BarKgm = P08FL22_A166BarKgm[0] ;
         n166BarKgm = P08FL22_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                AV46count = 0 ;
                                                while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08FL22_A212BarSer[0], A212BarSer) == 0 ) )
                                                {
                                                   brk8FL5 = false ;
                                                   A129BarCod = P08FL22_A129BarCod[0] ;
                                                   A132BarCodReo = P08FL22_A132BarCodReo[0] ;
                                                   A130BarCodPar = P08FL22_A130BarCodPar[0] ;
                                                   A396EmprCod = P08FL22_A396EmprCod[0] ;
                                                   AV46count = (long)(AV46count+1) ;
                                                   brk8FL5 = true ;
                                                   pr_default.readNext(2);
                                                }
                                                if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                                                {
                                                   AV38Option = A212BarSer ;
                                                   AV39Options.add(AV38Option, 0);
                                                   AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8FL5 )
         {
            brk8FL5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSerDsc = AV34SearchTxt ;
      AV23TFBarSerDsc_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL29 */
      pr_default.execute(3, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8FL7 = false ;
         A4466BarAcaAnh = P08FL29_A4466BarAcaAnh[0] ;
         A1652BarSerDsc = P08FL29_A1652BarSerDsc[0] ;
         A13769BarRdto4 = P08FL29_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL29_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL29_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL29_A1234BarNomCli[0] ;
         A217BarTipArt = P08FL29_A217BarTipArt[0] ;
         n217BarTipArt = P08FL29_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL29_A13696BarNHdr[0] ;
         A279CliNom = P08FL29_A279CliNom[0] ;
         A136BarColNum = P08FL29_A136BarColNum[0] ;
         A135BarColNom = P08FL29_A135BarColNom[0] ;
         A212BarSer = P08FL29_A212BarSer[0] ;
         A252CliCod = P08FL29_A252CliCod[0] ;
         n252CliCod = P08FL29_n252CliCod[0] ;
         A161BarFecSal = P08FL29_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL29_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL29_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL29_A13861BarMarca[0] ;
         n13861BarMarca = P08FL29_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL29_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL29_n13860BarAccesor[0] ;
         A166BarKgm = P08FL29_A166BarKgm[0] ;
         n166BarKgm = P08FL29_n166BarKgm[0] ;
         A129BarCod = P08FL29_A129BarCod[0] ;
         A132BarCodReo = P08FL29_A132BarCodReo[0] ;
         A130BarCodPar = P08FL29_A130BarCodPar[0] ;
         A361DisCod = P08FL29_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL29_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL29_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL29_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL29_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL29_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL29_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL29_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL29_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL29_A13861BarMarca[0] ;
         n13861BarMarca = P08FL29_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL29_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL29_n13860BarAccesor[0] ;
         A166BarKgm = P08FL29_A166BarKgm[0] ;
         n166BarKgm = P08FL29_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                AV46count = 0 ;
                                                while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08FL29_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                                                {
                                                   brk8FL7 = false ;
                                                   A129BarCod = P08FL29_A129BarCod[0] ;
                                                   A132BarCodReo = P08FL29_A132BarCodReo[0] ;
                                                   A130BarCodPar = P08FL29_A130BarCodPar[0] ;
                                                   A396EmprCod = P08FL29_A396EmprCod[0] ;
                                                   AV46count = (long)(AV46count+1) ;
                                                   brk8FL7 = true ;
                                                   pr_default.readNext(3);
                                                }
                                                if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                                                {
                                                   AV38Option = A1652BarSerDsc ;
                                                   AV39Options.add(AV38Option, 0);
                                                   AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8FL7 )
         {
            brk8FL7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarColNom = AV34SearchTxt ;
      AV25TFBarColNom_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL36 */
      pr_default.execute(4, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8FL9 = false ;
         A4466BarAcaAnh = P08FL36_A4466BarAcaAnh[0] ;
         A135BarColNom = P08FL36_A135BarColNom[0] ;
         A13769BarRdto4 = P08FL36_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL36_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL36_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL36_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL36_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL36_A217BarTipArt[0] ;
         n217BarTipArt = P08FL36_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL36_A13696BarNHdr[0] ;
         A279CliNom = P08FL36_A279CliNom[0] ;
         A136BarColNum = P08FL36_A136BarColNum[0] ;
         A212BarSer = P08FL36_A212BarSer[0] ;
         A252CliCod = P08FL36_A252CliCod[0] ;
         n252CliCod = P08FL36_n252CliCod[0] ;
         A161BarFecSal = P08FL36_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL36_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL36_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL36_A13861BarMarca[0] ;
         n13861BarMarca = P08FL36_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL36_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL36_n13860BarAccesor[0] ;
         A166BarKgm = P08FL36_A166BarKgm[0] ;
         n166BarKgm = P08FL36_n166BarKgm[0] ;
         A129BarCod = P08FL36_A129BarCod[0] ;
         A132BarCodReo = P08FL36_A132BarCodReo[0] ;
         A130BarCodPar = P08FL36_A130BarCodPar[0] ;
         A361DisCod = P08FL36_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL36_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL36_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL36_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL36_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL36_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL36_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL36_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL36_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL36_A13861BarMarca[0] ;
         n13861BarMarca = P08FL36_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL36_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL36_n13860BarAccesor[0] ;
         A166BarKgm = P08FL36_A166BarKgm[0] ;
         n166BarKgm = P08FL36_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                AV46count = 0 ;
                                                while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08FL36_A135BarColNom[0], A135BarColNom) == 0 ) )
                                                {
                                                   brk8FL9 = false ;
                                                   A129BarCod = P08FL36_A129BarCod[0] ;
                                                   A132BarCodReo = P08FL36_A132BarCodReo[0] ;
                                                   A130BarCodPar = P08FL36_A130BarCodPar[0] ;
                                                   A396EmprCod = P08FL36_A396EmprCod[0] ;
                                                   AV46count = (long)(AV46count+1) ;
                                                   brk8FL9 = true ;
                                                   pr_default.readNext(4);
                                                }
                                                if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                                                {
                                                   AV38Option = A135BarColNom ;
                                                   AV39Options.add(AV38Option, 0);
                                                   AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8FL9 )
         {
            brk8FL9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarNomCli = AV34SearchTxt ;
      AV27TFBarNomCli_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL43 */
      pr_default.execute(5, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8FL11 = false ;
         A4466BarAcaAnh = P08FL43_A4466BarAcaAnh[0] ;
         A1234BarNomCli = P08FL43_A1234BarNomCli[0] ;
         A13769BarRdto4 = P08FL43_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL43_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL43_A155BarFecCli[0] ;
         A1652BarSerDsc = P08FL43_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL43_A217BarTipArt[0] ;
         n217BarTipArt = P08FL43_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL43_A13696BarNHdr[0] ;
         A279CliNom = P08FL43_A279CliNom[0] ;
         A136BarColNum = P08FL43_A136BarColNum[0] ;
         A135BarColNom = P08FL43_A135BarColNom[0] ;
         A212BarSer = P08FL43_A212BarSer[0] ;
         A252CliCod = P08FL43_A252CliCod[0] ;
         n252CliCod = P08FL43_n252CliCod[0] ;
         A161BarFecSal = P08FL43_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL43_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL43_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL43_A13861BarMarca[0] ;
         n13861BarMarca = P08FL43_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL43_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL43_n13860BarAccesor[0] ;
         A166BarKgm = P08FL43_A166BarKgm[0] ;
         n166BarKgm = P08FL43_n166BarKgm[0] ;
         A129BarCod = P08FL43_A129BarCod[0] ;
         A132BarCodReo = P08FL43_A132BarCodReo[0] ;
         A130BarCodPar = P08FL43_A130BarCodPar[0] ;
         A361DisCod = P08FL43_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL43_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL43_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL43_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL43_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL43_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL43_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL43_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL43_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL43_A13861BarMarca[0] ;
         n13861BarMarca = P08FL43_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL43_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL43_n13860BarAccesor[0] ;
         A166BarKgm = P08FL43_A166BarKgm[0] ;
         n166BarKgm = P08FL43_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                AV46count = 0 ;
                                                while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08FL43_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
                                                {
                                                   brk8FL11 = false ;
                                                   A129BarCod = P08FL43_A129BarCod[0] ;
                                                   A132BarCodReo = P08FL43_A132BarCodReo[0] ;
                                                   A130BarCodPar = P08FL43_A130BarCodPar[0] ;
                                                   A396EmprCod = P08FL43_A396EmprCod[0] ;
                                                   AV46count = (long)(AV46count+1) ;
                                                   brk8FL11 = true ;
                                                   pr_default.readNext(5);
                                                }
                                                if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
                                                {
                                                   AV38Option = A1234BarNomCli ;
                                                   AV39Options.add(AV38Option, 0);
                                                   AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8FL11 )
         {
            brk8FL11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARGOTSOPTIONS' Routine */
      returnInSub = false ;
      AV67TFBarGots = AV34SearchTxt ;
      AV68TFBarGots_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL50 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4466BarAcaAnh = P08FL50_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL50_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL50_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL50_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL50_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL50_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL50_A217BarTipArt[0] ;
         n217BarTipArt = P08FL50_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL50_A13696BarNHdr[0] ;
         A279CliNom = P08FL50_A279CliNom[0] ;
         A136BarColNum = P08FL50_A136BarColNum[0] ;
         A135BarColNom = P08FL50_A135BarColNom[0] ;
         A212BarSer = P08FL50_A212BarSer[0] ;
         A252CliCod = P08FL50_A252CliCod[0] ;
         n252CliCod = P08FL50_n252CliCod[0] ;
         A161BarFecSal = P08FL50_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL50_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL50_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL50_A13861BarMarca[0] ;
         n13861BarMarca = P08FL50_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL50_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL50_n13860BarAccesor[0] ;
         A166BarKgm = P08FL50_A166BarKgm[0] ;
         n166BarKgm = P08FL50_n166BarKgm[0] ;
         A129BarCod = P08FL50_A129BarCod[0] ;
         A132BarCodReo = P08FL50_A132BarCodReo[0] ;
         A130BarCodPar = P08FL50_A130BarCodPar[0] ;
         A361DisCod = P08FL50_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL50_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL50_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL50_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL50_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL50_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL50_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL50_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL50_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL50_A13861BarMarca[0] ;
         n13861BarMarca = P08FL50_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL50_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL50_n13860BarAccesor[0] ;
         A166BarKgm = P08FL50_A166BarKgm[0] ;
         n166BarKgm = P08FL50_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13855BarGots)==0) )
                                                {
                                                   AV38Option = A13855BarGots ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARGRSOPTIONS' Routine */
      returnInSub = false ;
      AV69TFBarGrs = AV34SearchTxt ;
      AV70TFBarGrs_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL57 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A4466BarAcaAnh = P08FL57_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL57_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL57_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL57_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL57_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL57_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL57_A217BarTipArt[0] ;
         n217BarTipArt = P08FL57_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL57_A13696BarNHdr[0] ;
         A279CliNom = P08FL57_A279CliNom[0] ;
         A136BarColNum = P08FL57_A136BarColNum[0] ;
         A135BarColNom = P08FL57_A135BarColNom[0] ;
         A212BarSer = P08FL57_A212BarSer[0] ;
         A252CliCod = P08FL57_A252CliCod[0] ;
         n252CliCod = P08FL57_n252CliCod[0] ;
         A161BarFecSal = P08FL57_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL57_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL57_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL57_A13861BarMarca[0] ;
         n13861BarMarca = P08FL57_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL57_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL57_n13860BarAccesor[0] ;
         A166BarKgm = P08FL57_A166BarKgm[0] ;
         n166BarKgm = P08FL57_n166BarKgm[0] ;
         A129BarCod = P08FL57_A129BarCod[0] ;
         A132BarCodReo = P08FL57_A132BarCodReo[0] ;
         A130BarCodPar = P08FL57_A130BarCodPar[0] ;
         A361DisCod = P08FL57_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL57_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL57_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL57_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL57_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL57_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL57_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL57_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL57_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL57_A13861BarMarca[0] ;
         n13861BarMarca = P08FL57_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL57_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL57_n13860BarAccesor[0] ;
         A166BarKgm = P08FL57_A166BarKgm[0] ;
         n166BarKgm = P08FL57_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13856BarGrs)==0) )
                                                {
                                                   AV38Option = A13856BarGrs ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBAROCSOPTIONS' Routine */
      returnInSub = false ;
      AV71TFBarOcs = AV34SearchTxt ;
      AV72TFBarOcs_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL64 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4466BarAcaAnh = P08FL64_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL64_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL64_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL64_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL64_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL64_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL64_A217BarTipArt[0] ;
         n217BarTipArt = P08FL64_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL64_A13696BarNHdr[0] ;
         A279CliNom = P08FL64_A279CliNom[0] ;
         A136BarColNum = P08FL64_A136BarColNum[0] ;
         A135BarColNom = P08FL64_A135BarColNom[0] ;
         A212BarSer = P08FL64_A212BarSer[0] ;
         A252CliCod = P08FL64_A252CliCod[0] ;
         n252CliCod = P08FL64_n252CliCod[0] ;
         A161BarFecSal = P08FL64_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL64_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL64_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL64_A13861BarMarca[0] ;
         n13861BarMarca = P08FL64_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL64_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL64_n13860BarAccesor[0] ;
         A166BarKgm = P08FL64_A166BarKgm[0] ;
         n166BarKgm = P08FL64_n166BarKgm[0] ;
         A129BarCod = P08FL64_A129BarCod[0] ;
         A132BarCodReo = P08FL64_A132BarCodReo[0] ;
         A130BarCodPar = P08FL64_A130BarCodPar[0] ;
         A361DisCod = P08FL64_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL64_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL64_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL64_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL64_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL64_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL64_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL64_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL64_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL64_A13861BarMarca[0] ;
         n13861BarMarca = P08FL64_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL64_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL64_n13860BarAccesor[0] ;
         A166BarKgm = P08FL64_A166BarKgm[0] ;
         n166BarKgm = P08FL64_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13857BarOcs)==0) )
                                                {
                                                   AV38Option = A13857BarOcs ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARRCSOPTIONS' Routine */
      returnInSub = false ;
      AV73TFBarRcs = AV34SearchTxt ;
      AV74TFBarRcs_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL71 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A4466BarAcaAnh = P08FL71_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL71_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL71_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL71_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL71_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL71_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL71_A217BarTipArt[0] ;
         n217BarTipArt = P08FL71_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL71_A13696BarNHdr[0] ;
         A279CliNom = P08FL71_A279CliNom[0] ;
         A136BarColNum = P08FL71_A136BarColNum[0] ;
         A135BarColNom = P08FL71_A135BarColNom[0] ;
         A212BarSer = P08FL71_A212BarSer[0] ;
         A252CliCod = P08FL71_A252CliCod[0] ;
         n252CliCod = P08FL71_n252CliCod[0] ;
         A161BarFecSal = P08FL71_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL71_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL71_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL71_A13861BarMarca[0] ;
         n13861BarMarca = P08FL71_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL71_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL71_n13860BarAccesor[0] ;
         A166BarKgm = P08FL71_A166BarKgm[0] ;
         n166BarKgm = P08FL71_n166BarKgm[0] ;
         A129BarCod = P08FL71_A129BarCod[0] ;
         A132BarCodReo = P08FL71_A132BarCodReo[0] ;
         A130BarCodPar = P08FL71_A130BarCodPar[0] ;
         A361DisCod = P08FL71_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL71_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL71_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL71_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL71_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL71_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL71_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL71_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL71_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL71_A13861BarMarca[0] ;
         n13861BarMarca = P08FL71_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL71_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL71_n13860BarAccesor[0] ;
         A166BarKgm = P08FL71_A166BarKgm[0] ;
         n166BarKgm = P08FL71_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13858BarRcs)==0) )
                                                {
                                                   AV38Option = A13858BarRcs ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADBAROEKOOPTIONS' Routine */
      returnInSub = false ;
      AV75TFBarOeko = AV34SearchTxt ;
      AV76TFBarOeko_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL78 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A4466BarAcaAnh = P08FL78_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL78_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL78_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL78_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL78_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL78_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL78_A217BarTipArt[0] ;
         n217BarTipArt = P08FL78_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL78_A13696BarNHdr[0] ;
         A279CliNom = P08FL78_A279CliNom[0] ;
         A136BarColNum = P08FL78_A136BarColNum[0] ;
         A135BarColNom = P08FL78_A135BarColNom[0] ;
         A212BarSer = P08FL78_A212BarSer[0] ;
         A252CliCod = P08FL78_A252CliCod[0] ;
         n252CliCod = P08FL78_n252CliCod[0] ;
         A161BarFecSal = P08FL78_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL78_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL78_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL78_A13861BarMarca[0] ;
         n13861BarMarca = P08FL78_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL78_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL78_n13860BarAccesor[0] ;
         A166BarKgm = P08FL78_A166BarKgm[0] ;
         n166BarKgm = P08FL78_n166BarKgm[0] ;
         A129BarCod = P08FL78_A129BarCod[0] ;
         A132BarCodReo = P08FL78_A132BarCodReo[0] ;
         A130BarCodPar = P08FL78_A130BarCodPar[0] ;
         A361DisCod = P08FL78_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL78_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL78_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL78_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL78_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL78_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL78_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL78_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL78_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL78_A13861BarMarca[0] ;
         n13861BarMarca = P08FL78_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL78_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL78_n13860BarAccesor[0] ;
         A166BarKgm = P08FL78_A166BarKgm[0] ;
         n166BarKgm = P08FL78_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13859BarOeko)==0) )
                                                {
                                                   AV38Option = A13859BarOeko ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADBARMARCAOPTIONS' Routine */
      returnInSub = false ;
      AV78TFBarMarca = AV34SearchTxt ;
      AV79TFBarMarca_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL85 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A4466BarAcaAnh = P08FL85_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL85_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL85_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL85_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL85_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL85_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL85_A217BarTipArt[0] ;
         n217BarTipArt = P08FL85_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL85_A13696BarNHdr[0] ;
         A279CliNom = P08FL85_A279CliNom[0] ;
         A136BarColNum = P08FL85_A136BarColNum[0] ;
         A135BarColNom = P08FL85_A135BarColNom[0] ;
         A212BarSer = P08FL85_A212BarSer[0] ;
         A252CliCod = P08FL85_A252CliCod[0] ;
         n252CliCod = P08FL85_n252CliCod[0] ;
         A161BarFecSal = P08FL85_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL85_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL85_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL85_A13861BarMarca[0] ;
         n13861BarMarca = P08FL85_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL85_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL85_n13860BarAccesor[0] ;
         A166BarKgm = P08FL85_A166BarKgm[0] ;
         n166BarKgm = P08FL85_n166BarKgm[0] ;
         A129BarCod = P08FL85_A129BarCod[0] ;
         A132BarCodReo = P08FL85_A132BarCodReo[0] ;
         A130BarCodPar = P08FL85_A130BarCodPar[0] ;
         A361DisCod = P08FL85_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL85_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL85_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL85_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL85_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL85_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL85_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL85_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL85_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL85_A13861BarMarca[0] ;
         n13861BarMarca = P08FL85_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL85_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL85_n13860BarAccesor[0] ;
         A166BarKgm = P08FL85_A166BarKgm[0] ;
         n166BarKgm = P08FL85_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13861BarMarca)==0) )
                                                {
                                                   AV38Option = A13861BarMarca ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S241( )
   {
      /* 'LOADBARFASCOD2OPTIONS' Routine */
      returnInSub = false ;
      AV82TFBarFasCod2 = AV34SearchTxt ;
      AV83TFBarFasCod2_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL92 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A4466BarAcaAnh = P08FL92_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL92_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL92_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL92_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL92_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL92_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL92_A217BarTipArt[0] ;
         n217BarTipArt = P08FL92_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL92_A13696BarNHdr[0] ;
         A279CliNom = P08FL92_A279CliNom[0] ;
         A136BarColNum = P08FL92_A136BarColNum[0] ;
         A135BarColNom = P08FL92_A135BarColNom[0] ;
         A212BarSer = P08FL92_A212BarSer[0] ;
         A252CliCod = P08FL92_A252CliCod[0] ;
         n252CliCod = P08FL92_n252CliCod[0] ;
         A161BarFecSal = P08FL92_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL92_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL92_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL92_A13861BarMarca[0] ;
         n13861BarMarca = P08FL92_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL92_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL92_n13860BarAccesor[0] ;
         A166BarKgm = P08FL92_A166BarKgm[0] ;
         n166BarKgm = P08FL92_n166BarKgm[0] ;
         A129BarCod = P08FL92_A129BarCod[0] ;
         A132BarCodReo = P08FL92_A132BarCodReo[0] ;
         A130BarCodPar = P08FL92_A130BarCodPar[0] ;
         A361DisCod = P08FL92_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL92_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL92_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL92_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL92_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL92_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL92_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL92_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL92_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL92_A13861BarMarca[0] ;
         n13861BarMarca = P08FL92_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL92_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL92_n13860BarAccesor[0] ;
         A166BarKgm = P08FL92_A166BarKgm[0] ;
         n166BarKgm = P08FL92_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13863BarFasCod2)==0) )
                                                {
                                                   AV38Option = A13863BarFasCod2 ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S251( )
   {
      /* 'LOADBARFASDSC2OPTIONS' Routine */
      returnInSub = false ;
      AV84TFBarFasDsc2 = AV34SearchTxt ;
      AV85TFBarFasDsc2_Sel = "" ;
      AV90Webwlismerds_1_filterfulltext = AV66FilterFullText ;
      AV91Webwlismerds_2_barfecsal = AV54BarFecSal ;
      AV92Webwlismerds_3_barfecsal_to = AV55BarFecSal_To ;
      AV93Webwlismerds_4_clicod = AV56CliCod ;
      AV94Webwlismerds_5_clicod_to = AV57CliCod_To ;
      AV95Webwlismerds_6_barser = AV58BarSer ;
      AV96Webwlismerds_7_barser_to = AV59BarSer_To ;
      AV97Webwlismerds_8_barcolnom = AV60BarColNom ;
      AV98Webwlismerds_9_barcolnom_to = AV61BarColNom_To ;
      AV99Webwlismerds_10_barcolnum = AV62BarColNum ;
      AV100Webwlismerds_11_barcolnum_to = AV63BarColNum_To ;
      AV101Webwlismerds_12_tfclicod = AV10TFCliCod ;
      AV102Webwlismerds_13_tfclicod_to = AV11TFCliCod_To ;
      AV103Webwlismerds_14_tfclinom = AV12TFCliNom ;
      AV104Webwlismerds_15_tfclinom_sel = AV13TFCliNom_Sel ;
      AV105Webwlismerds_16_tfbarnhdr = AV14TFBarNHdr ;
      AV106Webwlismerds_17_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV107Webwlismerds_18_tfbartipart = AV16TFBarTipArt ;
      AV108Webwlismerds_19_tfbartipart_to = AV17TFBarTipArt_To ;
      AV109Webwlismerds_20_tfbarser = AV20TFBarSer ;
      AV110Webwlismerds_21_tfbarser_sel = AV21TFBarSer_Sel ;
      AV111Webwlismerds_22_tfbarserdsc = AV22TFBarSerDsc ;
      AV112Webwlismerds_23_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV113Webwlismerds_24_tfbarcolnom = AV24TFBarColNom ;
      AV114Webwlismerds_25_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV115Webwlismerds_26_tfbarnomcli = AV26TFBarNomCli ;
      AV116Webwlismerds_27_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV117Webwlismerds_28_tfbarcolnum = AV28TFBarColNum ;
      AV118Webwlismerds_29_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV119Webwlismerds_30_tfbarfecsal = AV52TFBarFecSal ;
      AV120Webwlismerds_31_tfbarfeccli = AV30TFBarFecCli ;
      AV121Webwlismerds_32_tfbarkgm = AV32TFBarKgm ;
      AV122Webwlismerds_33_tfbarkgm_to = AV33TFBarKgm_To ;
      AV123Webwlismerds_34_tfbarrdto4 = AV64TFBarRdto4 ;
      AV124Webwlismerds_35_tfbarrdto4_to = AV65TFBarRdto4_To ;
      AV125Webwlismerds_36_tfbargots = AV67TFBarGots ;
      AV126Webwlismerds_37_tfbargots_sel = AV68TFBarGots_Sel ;
      AV127Webwlismerds_38_tfbargrs = AV69TFBarGrs ;
      AV128Webwlismerds_39_tfbargrs_sel = AV70TFBarGrs_Sel ;
      AV129Webwlismerds_40_tfbarocs = AV71TFBarOcs ;
      AV130Webwlismerds_41_tfbarocs_sel = AV72TFBarOcs_Sel ;
      AV131Webwlismerds_42_tfbarrcs = AV73TFBarRcs ;
      AV132Webwlismerds_43_tfbarrcs_sel = AV74TFBarRcs_Sel ;
      AV133Webwlismerds_44_tfbaroeko = AV75TFBarOeko ;
      AV134Webwlismerds_45_tfbaroeko_sel = AV76TFBarOeko_Sel ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = AV77TFBarAccesorios_Sel ;
      AV136Webwlismerds_47_tfbarmarca = AV78TFBarMarca ;
      AV137Webwlismerds_48_tfbarmarca_sel = AV79TFBarMarca_Sel ;
      AV138Webwlismerds_49_tfbar_maccod = AV80TFBar_MacCod ;
      AV139Webwlismerds_50_tfbar_maccod_to = AV81TFBar_MacCod_To ;
      AV140Webwlismerds_51_tfbarfascod2 = AV82TFBarFasCod2 ;
      AV141Webwlismerds_52_tfbarfascod2_sel = AV83TFBarFasCod2_Sel ;
      AV142Webwlismerds_53_tfbarfasdsc2 = AV84TFBarFasDsc2 ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = AV85TFBarFasDsc2_Sel ;
      pr_default.dynParam(13, new Object[]{ new Object[]{
                                           AV91Webwlismerds_2_barfecsal ,
                                           AV92Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV93Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV94Webwlismerds_5_clicod_to) ,
                                           AV95Webwlismerds_6_barser ,
                                           AV96Webwlismerds_7_barser_to ,
                                           AV97Webwlismerds_8_barcolnom ,
                                           AV98Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV99Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV100Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV101Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV102Webwlismerds_13_tfclicod_to) ,
                                           AV104Webwlismerds_15_tfclinom_sel ,
                                           AV103Webwlismerds_14_tfclinom ,
                                           AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           AV105Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV107Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV108Webwlismerds_19_tfbartipart_to) ,
                                           AV110Webwlismerds_21_tfbarser_sel ,
                                           AV109Webwlismerds_20_tfbarser ,
                                           AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           AV111Webwlismerds_22_tfbarserdsc ,
                                           AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           AV113Webwlismerds_24_tfbarcolnom ,
                                           AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           AV115Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to) ,
                                           AV119Webwlismerds_30_tfbarfecsal ,
                                           AV120Webwlismerds_31_tfbarfeccli ,
                                           AV121Webwlismerds_32_tfbarkgm ,
                                           AV122Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV123Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           AV90Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV126Webwlismerds_37_tfbargots_sel ,
                                           AV125Webwlismerds_36_tfbargots ,
                                           AV128Webwlismerds_39_tfbargrs_sel ,
                                           AV127Webwlismerds_38_tfbargrs ,
                                           AV130Webwlismerds_41_tfbarocs_sel ,
                                           AV129Webwlismerds_40_tfbarocs ,
                                           AV132Webwlismerds_43_tfbarrcs_sel ,
                                           AV131Webwlismerds_42_tfbarrcs ,
                                           AV134Webwlismerds_45_tfbaroeko_sel ,
                                           AV133Webwlismerds_44_tfbaroeko ,
                                           AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV137Webwlismerds_48_tfbarmarca_sel ,
                                           AV136Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to) ,
                                           AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           AV140Webwlismerds_51_tfbarfascod2 ,
                                           AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV142Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV140Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV140Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV103Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV103Webwlismerds_14_tfclinom), 30, "%") ;
      lV105Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV109Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV109Webwlismerds_20_tfbarser), 16, "%") ;
      lV111Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV113Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV113Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV115Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV115Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FL99 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, AV135Webwlismerds_46_tfbaraccesorios_sel, AV135Webwlismerds_46_tfbaraccesorios_sel, AV137Webwlismerds_48_tfbarmarca_sel, AV136Webwlismerds_47_tfbarmarca, lV136Webwlismerds_47_tfbarmarca, AV137Webwlismerds_48_tfbarmarca_sel, AV137Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV138Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV139Webwlismerds_50_tfbar_maccod_to), AV141Webwlismerds_52_tfbarfascod2_sel, AV140Webwlismerds_51_tfbarfascod2, lV140Webwlismerds_51_tfbarfascod2, AV141Webwlismerds_52_tfbarfascod2_sel, AV141Webwlismerds_52_tfbarfascod2_sel, AV91Webwlismerds_2_barfecsal, AV92Webwlismerds_3_barfecsal_to, Integer.valueOf(AV93Webwlismerds_4_clicod), Integer.valueOf(AV94Webwlismerds_5_clicod_to), AV95Webwlismerds_6_barser, AV96Webwlismerds_7_barser_to, AV97Webwlismerds_8_barcolnom, AV98Webwlismerds_9_barcolnom_to, Integer.valueOf(AV99Webwlismerds_10_barcolnum), Integer.valueOf(AV100Webwlismerds_11_barcolnum_to), Integer.valueOf(AV101Webwlismerds_12_tfclicod), Integer.valueOf(AV102Webwlismerds_13_tfclicod_to), lV103Webwlismerds_14_tfclinom, AV104Webwlismerds_15_tfclinom_sel, lV105Webwlismerds_16_tfbarnhdr, AV106Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV107Webwlismerds_18_tfbartipart), Short.valueOf(AV108Webwlismerds_19_tfbartipart_to), lV109Webwlismerds_20_tfbarser, AV110Webwlismerds_21_tfbarser_sel, lV111Webwlismerds_22_tfbarserdsc, AV112Webwlismerds_23_tfbarserdsc_sel, lV113Webwlismerds_24_tfbarcolnom, AV114Webwlismerds_25_tfbarcolnom_sel, lV115Webwlismerds_26_tfbarnomcli, AV116Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV117Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV118Webwlismerds_29_tfbarcolnum_to), AV119Webwlismerds_30_tfbarfecsal, AV120Webwlismerds_31_tfbarfeccli, AV121Webwlismerds_32_tfbarkgm, AV122Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV123Webwlismerds_34_tfbarrdto4), Short.valueOf(AV124Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A4466BarAcaAnh = P08FL99_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FL99_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FL99_n13769BarRdto4[0] ;
         A155BarFecCli = P08FL99_A155BarFecCli[0] ;
         A1234BarNomCli = P08FL99_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FL99_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FL99_A217BarTipArt[0] ;
         n217BarTipArt = P08FL99_n217BarTipArt[0] ;
         A13696BarNHdr = P08FL99_A13696BarNHdr[0] ;
         A279CliNom = P08FL99_A279CliNom[0] ;
         A136BarColNum = P08FL99_A136BarColNum[0] ;
         A135BarColNom = P08FL99_A135BarColNom[0] ;
         A212BarSer = P08FL99_A212BarSer[0] ;
         A252CliCod = P08FL99_A252CliCod[0] ;
         n252CliCod = P08FL99_n252CliCod[0] ;
         A161BarFecSal = P08FL99_A161BarFecSal[0] ;
         A13862Bar_MacCod = P08FL99_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL99_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FL99_A13861BarMarca[0] ;
         n13861BarMarca = P08FL99_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL99_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL99_n13860BarAccesor[0] ;
         A166BarKgm = P08FL99_A166BarKgm[0] ;
         n166BarKgm = P08FL99_n166BarKgm[0] ;
         A129BarCod = P08FL99_A129BarCod[0] ;
         A132BarCodReo = P08FL99_A132BarCodReo[0] ;
         A130BarCodPar = P08FL99_A130BarCodPar[0] ;
         A361DisCod = P08FL99_A361DisCod[0] ;
         A13863BarFasCod2 = P08FL99_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL99_n13863BarFasCod2[0] ;
         A396EmprCod = P08FL99_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FL99_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FL99_n13862Bar_MacCod[0] ;
         A279CliNom = P08FL99_A279CliNom[0] ;
         A13863BarFasCod2 = P08FL99_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FL99_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FL99_A13861BarMarca[0] ;
         n13861BarMarca = P08FL99_n13861BarMarca[0] ;
         A13860BarAccesor = P08FL99_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FL99_n13860BarAccesor[0] ;
         A166BarKgm = P08FL99_A166BarKgm[0] ;
         n166BarKgm = P08FL99_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV125Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV126Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV127Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV128Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV128Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV129Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV130Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV130Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV131Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV132Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV132Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV133Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV134Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV134Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismergetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV90Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV90Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV90Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV143Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV143Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( ! (GXutil.strcmp("", A13864BarFasDsc2)==0) )
                                                {
                                                   AV38Option = A13864BarFasDsc2 ;
                                                   AV37InsertIndex = 1 ;
                                                   while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
                                                   {
                                                      AV37InsertIndex = (int)(AV37InsertIndex+1) ;
                                                   }
                                                   if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
                                                   {
                                                      AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
                                                      AV46count = (long)(AV46count+1) ;
                                                      AV44OptionIndexes.removeItem(AV37InsertIndex);
                                                      AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
                                                   }
                                                   else
                                                   {
                                                      AV39Options.add(AV38Option, AV37InsertIndex);
                                                      AV44OptionIndexes.add("1", AV37InsertIndex);
                                                   }
                                                }
                                                if ( AV39Options.size() == 50 )
                                                {
                                                   /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                   if (true) break;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwlismergetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = webwlismergetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = webwlismergetfilterdata.this.AV45OptionIndexesJson;
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
      AV66FilterFullText = "" ;
      AV54BarFecSal = GXutil.nullDate() ;
      AV55BarFecSal_To = GXutil.nullDate() ;
      AV58BarSer = "" ;
      AV59BarSer_To = "" ;
      AV60BarColNom = "" ;
      AV61BarColNom_To = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFBarNHdr = "" ;
      AV15TFBarNHdr_Sel = "" ;
      AV20TFBarSer = "" ;
      AV21TFBarSer_Sel = "" ;
      AV22TFBarSerDsc = "" ;
      AV23TFBarSerDsc_Sel = "" ;
      AV24TFBarColNom = "" ;
      AV25TFBarColNom_Sel = "" ;
      AV26TFBarNomCli = "" ;
      AV27TFBarNomCli_Sel = "" ;
      AV52TFBarFecSal = GXutil.nullDate() ;
      AV30TFBarFecCli = GXutil.nullDate() ;
      AV32TFBarKgm = DecimalUtil.ZERO ;
      AV33TFBarKgm_To = DecimalUtil.ZERO ;
      AV67TFBarGots = "" ;
      AV68TFBarGots_Sel = "" ;
      AV69TFBarGrs = "" ;
      AV70TFBarGrs_Sel = "" ;
      AV71TFBarOcs = "" ;
      AV72TFBarOcs_Sel = "" ;
      AV73TFBarRcs = "" ;
      AV74TFBarRcs_Sel = "" ;
      AV75TFBarOeko = "" ;
      AV76TFBarOeko_Sel = "" ;
      AV77TFBarAccesorios_Sel = "" ;
      AV78TFBarMarca = "" ;
      AV79TFBarMarca_Sel = "" ;
      AV82TFBarFasCod2 = "" ;
      AV83TFBarFasCod2_Sel = "" ;
      AV84TFBarFasDsc2 = "" ;
      AV85TFBarFasDsc2_Sel = "" ;
      A279CliNom = "" ;
      AV90Webwlismerds_1_filterfulltext = "" ;
      AV91Webwlismerds_2_barfecsal = GXutil.nullDate() ;
      AV92Webwlismerds_3_barfecsal_to = GXutil.nullDate() ;
      AV95Webwlismerds_6_barser = "" ;
      AV96Webwlismerds_7_barser_to = "" ;
      AV97Webwlismerds_8_barcolnom = "" ;
      AV98Webwlismerds_9_barcolnom_to = "" ;
      AV103Webwlismerds_14_tfclinom = "" ;
      AV104Webwlismerds_15_tfclinom_sel = "" ;
      AV105Webwlismerds_16_tfbarnhdr = "" ;
      AV106Webwlismerds_17_tfbarnhdr_sel = "" ;
      AV109Webwlismerds_20_tfbarser = "" ;
      AV110Webwlismerds_21_tfbarser_sel = "" ;
      AV111Webwlismerds_22_tfbarserdsc = "" ;
      AV112Webwlismerds_23_tfbarserdsc_sel = "" ;
      AV113Webwlismerds_24_tfbarcolnom = "" ;
      AV114Webwlismerds_25_tfbarcolnom_sel = "" ;
      AV115Webwlismerds_26_tfbarnomcli = "" ;
      AV116Webwlismerds_27_tfbarnomcli_sel = "" ;
      AV119Webwlismerds_30_tfbarfecsal = GXutil.nullDate() ;
      AV120Webwlismerds_31_tfbarfeccli = GXutil.nullDate() ;
      AV121Webwlismerds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV122Webwlismerds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV125Webwlismerds_36_tfbargots = "" ;
      AV126Webwlismerds_37_tfbargots_sel = "" ;
      AV127Webwlismerds_38_tfbargrs = "" ;
      AV128Webwlismerds_39_tfbargrs_sel = "" ;
      AV129Webwlismerds_40_tfbarocs = "" ;
      AV130Webwlismerds_41_tfbarocs_sel = "" ;
      AV131Webwlismerds_42_tfbarrcs = "" ;
      AV132Webwlismerds_43_tfbarrcs_sel = "" ;
      AV133Webwlismerds_44_tfbaroeko = "" ;
      AV134Webwlismerds_45_tfbaroeko_sel = "" ;
      AV135Webwlismerds_46_tfbaraccesorios_sel = "" ;
      AV136Webwlismerds_47_tfbarmarca = "" ;
      AV137Webwlismerds_48_tfbarmarca_sel = "" ;
      AV140Webwlismerds_51_tfbarfascod2 = "" ;
      AV141Webwlismerds_52_tfbarfascod2_sel = "" ;
      AV142Webwlismerds_53_tfbarfasdsc2 = "" ;
      AV143Webwlismerds_54_tfbarfasdsc2_sel = "" ;
      scmdbuf = "" ;
      lV136Webwlismerds_47_tfbarmarca = "" ;
      lV140Webwlismerds_51_tfbarfascod2 = "" ;
      lV103Webwlismerds_14_tfclinom = "" ;
      lV105Webwlismerds_16_tfbarnhdr = "" ;
      lV109Webwlismerds_20_tfbarser = "" ;
      lV111Webwlismerds_22_tfbarserdsc = "" ;
      lV113Webwlismerds_24_tfbarcolnom = "" ;
      lV115Webwlismerds_26_tfbarnomcli = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A13696BarNHdr = "" ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      A13860BarAccesor = "" ;
      A396EmprCod = "" ;
      P08FL8_A9713Tb1_Cod = new short[1] ;
      P08FL8_A4466BarAcaAnh = new short[1] ;
      P08FL8_A279CliNom = new String[] {""} ;
      P08FL8_A13769BarRdto4 = new short[1] ;
      P08FL8_n13769BarRdto4 = new boolean[] {false} ;
      P08FL8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL8_A1234BarNomCli = new String[] {""} ;
      P08FL8_A1652BarSerDsc = new String[] {""} ;
      P08FL8_A217BarTipArt = new short[1] ;
      P08FL8_n217BarTipArt = new boolean[] {false} ;
      P08FL8_A13696BarNHdr = new String[] {""} ;
      P08FL8_A136BarColNum = new int[1] ;
      P08FL8_A135BarColNom = new String[] {""} ;
      P08FL8_A212BarSer = new String[] {""} ;
      P08FL8_A252CliCod = new int[1] ;
      P08FL8_n252CliCod = new boolean[] {false} ;
      P08FL8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL8_A13862Bar_MacCod = new int[1] ;
      P08FL8_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL8_A13861BarMarca = new String[] {""} ;
      P08FL8_n13861BarMarca = new boolean[] {false} ;
      P08FL8_A13860BarAccesor = new String[] {""} ;
      P08FL8_n13860BarAccesor = new boolean[] {false} ;
      P08FL8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL8_n166BarKgm = new boolean[] {false} ;
      P08FL8_A129BarCod = new int[1] ;
      P08FL8_A132BarCodReo = new byte[1] ;
      P08FL8_A130BarCodPar = new String[] {""} ;
      P08FL8_A361DisCod = new int[1] ;
      P08FL8_A13863BarFasCod2 = new String[] {""} ;
      P08FL8_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL8_A396EmprCod = new String[] {""} ;
      AV38Option = "" ;
      P08FL15_A9713Tb1_Cod = new short[1] ;
      P08FL15_A4466BarAcaAnh = new short[1] ;
      P08FL15_A13769BarRdto4 = new short[1] ;
      P08FL15_n13769BarRdto4 = new boolean[] {false} ;
      P08FL15_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL15_A1234BarNomCli = new String[] {""} ;
      P08FL15_A1652BarSerDsc = new String[] {""} ;
      P08FL15_A217BarTipArt = new short[1] ;
      P08FL15_n217BarTipArt = new boolean[] {false} ;
      P08FL15_A13696BarNHdr = new String[] {""} ;
      P08FL15_A279CliNom = new String[] {""} ;
      P08FL15_A136BarColNum = new int[1] ;
      P08FL15_A135BarColNom = new String[] {""} ;
      P08FL15_A212BarSer = new String[] {""} ;
      P08FL15_A252CliCod = new int[1] ;
      P08FL15_n252CliCod = new boolean[] {false} ;
      P08FL15_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL15_A13862Bar_MacCod = new int[1] ;
      P08FL15_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL15_A13861BarMarca = new String[] {""} ;
      P08FL15_n13861BarMarca = new boolean[] {false} ;
      P08FL15_A13860BarAccesor = new String[] {""} ;
      P08FL15_n13860BarAccesor = new boolean[] {false} ;
      P08FL15_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL15_n166BarKgm = new boolean[] {false} ;
      P08FL15_A129BarCod = new int[1] ;
      P08FL15_A132BarCodReo = new byte[1] ;
      P08FL15_A130BarCodPar = new String[] {""} ;
      P08FL15_A361DisCod = new int[1] ;
      P08FL15_A13863BarFasCod2 = new String[] {""} ;
      P08FL15_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL15_A396EmprCod = new String[] {""} ;
      P08FL22_A9713Tb1_Cod = new short[1] ;
      P08FL22_A4466BarAcaAnh = new short[1] ;
      P08FL22_A212BarSer = new String[] {""} ;
      P08FL22_A13769BarRdto4 = new short[1] ;
      P08FL22_n13769BarRdto4 = new boolean[] {false} ;
      P08FL22_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL22_A1234BarNomCli = new String[] {""} ;
      P08FL22_A1652BarSerDsc = new String[] {""} ;
      P08FL22_A217BarTipArt = new short[1] ;
      P08FL22_n217BarTipArt = new boolean[] {false} ;
      P08FL22_A13696BarNHdr = new String[] {""} ;
      P08FL22_A279CliNom = new String[] {""} ;
      P08FL22_A136BarColNum = new int[1] ;
      P08FL22_A135BarColNom = new String[] {""} ;
      P08FL22_A252CliCod = new int[1] ;
      P08FL22_n252CliCod = new boolean[] {false} ;
      P08FL22_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL22_A13862Bar_MacCod = new int[1] ;
      P08FL22_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL22_A13861BarMarca = new String[] {""} ;
      P08FL22_n13861BarMarca = new boolean[] {false} ;
      P08FL22_A13860BarAccesor = new String[] {""} ;
      P08FL22_n13860BarAccesor = new boolean[] {false} ;
      P08FL22_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL22_n166BarKgm = new boolean[] {false} ;
      P08FL22_A129BarCod = new int[1] ;
      P08FL22_A132BarCodReo = new byte[1] ;
      P08FL22_A130BarCodPar = new String[] {""} ;
      P08FL22_A361DisCod = new int[1] ;
      P08FL22_A13863BarFasCod2 = new String[] {""} ;
      P08FL22_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL22_A396EmprCod = new String[] {""} ;
      P08FL29_A9713Tb1_Cod = new short[1] ;
      P08FL29_A4466BarAcaAnh = new short[1] ;
      P08FL29_A1652BarSerDsc = new String[] {""} ;
      P08FL29_A13769BarRdto4 = new short[1] ;
      P08FL29_n13769BarRdto4 = new boolean[] {false} ;
      P08FL29_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL29_A1234BarNomCli = new String[] {""} ;
      P08FL29_A217BarTipArt = new short[1] ;
      P08FL29_n217BarTipArt = new boolean[] {false} ;
      P08FL29_A13696BarNHdr = new String[] {""} ;
      P08FL29_A279CliNom = new String[] {""} ;
      P08FL29_A136BarColNum = new int[1] ;
      P08FL29_A135BarColNom = new String[] {""} ;
      P08FL29_A212BarSer = new String[] {""} ;
      P08FL29_A252CliCod = new int[1] ;
      P08FL29_n252CliCod = new boolean[] {false} ;
      P08FL29_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL29_A13862Bar_MacCod = new int[1] ;
      P08FL29_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL29_A13861BarMarca = new String[] {""} ;
      P08FL29_n13861BarMarca = new boolean[] {false} ;
      P08FL29_A13860BarAccesor = new String[] {""} ;
      P08FL29_n13860BarAccesor = new boolean[] {false} ;
      P08FL29_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL29_n166BarKgm = new boolean[] {false} ;
      P08FL29_A129BarCod = new int[1] ;
      P08FL29_A132BarCodReo = new byte[1] ;
      P08FL29_A130BarCodPar = new String[] {""} ;
      P08FL29_A361DisCod = new int[1] ;
      P08FL29_A13863BarFasCod2 = new String[] {""} ;
      P08FL29_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL29_A396EmprCod = new String[] {""} ;
      P08FL36_A9713Tb1_Cod = new short[1] ;
      P08FL36_A4466BarAcaAnh = new short[1] ;
      P08FL36_A135BarColNom = new String[] {""} ;
      P08FL36_A13769BarRdto4 = new short[1] ;
      P08FL36_n13769BarRdto4 = new boolean[] {false} ;
      P08FL36_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL36_A1234BarNomCli = new String[] {""} ;
      P08FL36_A1652BarSerDsc = new String[] {""} ;
      P08FL36_A217BarTipArt = new short[1] ;
      P08FL36_n217BarTipArt = new boolean[] {false} ;
      P08FL36_A13696BarNHdr = new String[] {""} ;
      P08FL36_A279CliNom = new String[] {""} ;
      P08FL36_A136BarColNum = new int[1] ;
      P08FL36_A212BarSer = new String[] {""} ;
      P08FL36_A252CliCod = new int[1] ;
      P08FL36_n252CliCod = new boolean[] {false} ;
      P08FL36_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL36_A13862Bar_MacCod = new int[1] ;
      P08FL36_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL36_A13861BarMarca = new String[] {""} ;
      P08FL36_n13861BarMarca = new boolean[] {false} ;
      P08FL36_A13860BarAccesor = new String[] {""} ;
      P08FL36_n13860BarAccesor = new boolean[] {false} ;
      P08FL36_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL36_n166BarKgm = new boolean[] {false} ;
      P08FL36_A129BarCod = new int[1] ;
      P08FL36_A132BarCodReo = new byte[1] ;
      P08FL36_A130BarCodPar = new String[] {""} ;
      P08FL36_A361DisCod = new int[1] ;
      P08FL36_A13863BarFasCod2 = new String[] {""} ;
      P08FL36_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL36_A396EmprCod = new String[] {""} ;
      P08FL43_A9713Tb1_Cod = new short[1] ;
      P08FL43_A4466BarAcaAnh = new short[1] ;
      P08FL43_A1234BarNomCli = new String[] {""} ;
      P08FL43_A13769BarRdto4 = new short[1] ;
      P08FL43_n13769BarRdto4 = new boolean[] {false} ;
      P08FL43_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL43_A1652BarSerDsc = new String[] {""} ;
      P08FL43_A217BarTipArt = new short[1] ;
      P08FL43_n217BarTipArt = new boolean[] {false} ;
      P08FL43_A13696BarNHdr = new String[] {""} ;
      P08FL43_A279CliNom = new String[] {""} ;
      P08FL43_A136BarColNum = new int[1] ;
      P08FL43_A135BarColNom = new String[] {""} ;
      P08FL43_A212BarSer = new String[] {""} ;
      P08FL43_A252CliCod = new int[1] ;
      P08FL43_n252CliCod = new boolean[] {false} ;
      P08FL43_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL43_A13862Bar_MacCod = new int[1] ;
      P08FL43_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL43_A13861BarMarca = new String[] {""} ;
      P08FL43_n13861BarMarca = new boolean[] {false} ;
      P08FL43_A13860BarAccesor = new String[] {""} ;
      P08FL43_n13860BarAccesor = new boolean[] {false} ;
      P08FL43_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL43_n166BarKgm = new boolean[] {false} ;
      P08FL43_A129BarCod = new int[1] ;
      P08FL43_A132BarCodReo = new byte[1] ;
      P08FL43_A130BarCodPar = new String[] {""} ;
      P08FL43_A361DisCod = new int[1] ;
      P08FL43_A13863BarFasCod2 = new String[] {""} ;
      P08FL43_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL43_A396EmprCod = new String[] {""} ;
      P08FL50_A9713Tb1_Cod = new short[1] ;
      P08FL50_A4466BarAcaAnh = new short[1] ;
      P08FL50_A13769BarRdto4 = new short[1] ;
      P08FL50_n13769BarRdto4 = new boolean[] {false} ;
      P08FL50_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL50_A1234BarNomCli = new String[] {""} ;
      P08FL50_A1652BarSerDsc = new String[] {""} ;
      P08FL50_A217BarTipArt = new short[1] ;
      P08FL50_n217BarTipArt = new boolean[] {false} ;
      P08FL50_A13696BarNHdr = new String[] {""} ;
      P08FL50_A279CliNom = new String[] {""} ;
      P08FL50_A136BarColNum = new int[1] ;
      P08FL50_A135BarColNom = new String[] {""} ;
      P08FL50_A212BarSer = new String[] {""} ;
      P08FL50_A252CliCod = new int[1] ;
      P08FL50_n252CliCod = new boolean[] {false} ;
      P08FL50_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL50_A13862Bar_MacCod = new int[1] ;
      P08FL50_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL50_A13861BarMarca = new String[] {""} ;
      P08FL50_n13861BarMarca = new boolean[] {false} ;
      P08FL50_A13860BarAccesor = new String[] {""} ;
      P08FL50_n13860BarAccesor = new boolean[] {false} ;
      P08FL50_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL50_n166BarKgm = new boolean[] {false} ;
      P08FL50_A129BarCod = new int[1] ;
      P08FL50_A132BarCodReo = new byte[1] ;
      P08FL50_A130BarCodPar = new String[] {""} ;
      P08FL50_A361DisCod = new int[1] ;
      P08FL50_A13863BarFasCod2 = new String[] {""} ;
      P08FL50_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL50_A396EmprCod = new String[] {""} ;
      P08FL57_A9713Tb1_Cod = new short[1] ;
      P08FL57_A4466BarAcaAnh = new short[1] ;
      P08FL57_A13769BarRdto4 = new short[1] ;
      P08FL57_n13769BarRdto4 = new boolean[] {false} ;
      P08FL57_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL57_A1234BarNomCli = new String[] {""} ;
      P08FL57_A1652BarSerDsc = new String[] {""} ;
      P08FL57_A217BarTipArt = new short[1] ;
      P08FL57_n217BarTipArt = new boolean[] {false} ;
      P08FL57_A13696BarNHdr = new String[] {""} ;
      P08FL57_A279CliNom = new String[] {""} ;
      P08FL57_A136BarColNum = new int[1] ;
      P08FL57_A135BarColNom = new String[] {""} ;
      P08FL57_A212BarSer = new String[] {""} ;
      P08FL57_A252CliCod = new int[1] ;
      P08FL57_n252CliCod = new boolean[] {false} ;
      P08FL57_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL57_A13862Bar_MacCod = new int[1] ;
      P08FL57_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL57_A13861BarMarca = new String[] {""} ;
      P08FL57_n13861BarMarca = new boolean[] {false} ;
      P08FL57_A13860BarAccesor = new String[] {""} ;
      P08FL57_n13860BarAccesor = new boolean[] {false} ;
      P08FL57_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL57_n166BarKgm = new boolean[] {false} ;
      P08FL57_A129BarCod = new int[1] ;
      P08FL57_A132BarCodReo = new byte[1] ;
      P08FL57_A130BarCodPar = new String[] {""} ;
      P08FL57_A361DisCod = new int[1] ;
      P08FL57_A13863BarFasCod2 = new String[] {""} ;
      P08FL57_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL57_A396EmprCod = new String[] {""} ;
      P08FL64_A9713Tb1_Cod = new short[1] ;
      P08FL64_A4466BarAcaAnh = new short[1] ;
      P08FL64_A13769BarRdto4 = new short[1] ;
      P08FL64_n13769BarRdto4 = new boolean[] {false} ;
      P08FL64_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL64_A1234BarNomCli = new String[] {""} ;
      P08FL64_A1652BarSerDsc = new String[] {""} ;
      P08FL64_A217BarTipArt = new short[1] ;
      P08FL64_n217BarTipArt = new boolean[] {false} ;
      P08FL64_A13696BarNHdr = new String[] {""} ;
      P08FL64_A279CliNom = new String[] {""} ;
      P08FL64_A136BarColNum = new int[1] ;
      P08FL64_A135BarColNom = new String[] {""} ;
      P08FL64_A212BarSer = new String[] {""} ;
      P08FL64_A252CliCod = new int[1] ;
      P08FL64_n252CliCod = new boolean[] {false} ;
      P08FL64_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL64_A13862Bar_MacCod = new int[1] ;
      P08FL64_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL64_A13861BarMarca = new String[] {""} ;
      P08FL64_n13861BarMarca = new boolean[] {false} ;
      P08FL64_A13860BarAccesor = new String[] {""} ;
      P08FL64_n13860BarAccesor = new boolean[] {false} ;
      P08FL64_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL64_n166BarKgm = new boolean[] {false} ;
      P08FL64_A129BarCod = new int[1] ;
      P08FL64_A132BarCodReo = new byte[1] ;
      P08FL64_A130BarCodPar = new String[] {""} ;
      P08FL64_A361DisCod = new int[1] ;
      P08FL64_A13863BarFasCod2 = new String[] {""} ;
      P08FL64_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL64_A396EmprCod = new String[] {""} ;
      P08FL71_A9713Tb1_Cod = new short[1] ;
      P08FL71_A4466BarAcaAnh = new short[1] ;
      P08FL71_A13769BarRdto4 = new short[1] ;
      P08FL71_n13769BarRdto4 = new boolean[] {false} ;
      P08FL71_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL71_A1234BarNomCli = new String[] {""} ;
      P08FL71_A1652BarSerDsc = new String[] {""} ;
      P08FL71_A217BarTipArt = new short[1] ;
      P08FL71_n217BarTipArt = new boolean[] {false} ;
      P08FL71_A13696BarNHdr = new String[] {""} ;
      P08FL71_A279CliNom = new String[] {""} ;
      P08FL71_A136BarColNum = new int[1] ;
      P08FL71_A135BarColNom = new String[] {""} ;
      P08FL71_A212BarSer = new String[] {""} ;
      P08FL71_A252CliCod = new int[1] ;
      P08FL71_n252CliCod = new boolean[] {false} ;
      P08FL71_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL71_A13862Bar_MacCod = new int[1] ;
      P08FL71_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL71_A13861BarMarca = new String[] {""} ;
      P08FL71_n13861BarMarca = new boolean[] {false} ;
      P08FL71_A13860BarAccesor = new String[] {""} ;
      P08FL71_n13860BarAccesor = new boolean[] {false} ;
      P08FL71_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL71_n166BarKgm = new boolean[] {false} ;
      P08FL71_A129BarCod = new int[1] ;
      P08FL71_A132BarCodReo = new byte[1] ;
      P08FL71_A130BarCodPar = new String[] {""} ;
      P08FL71_A361DisCod = new int[1] ;
      P08FL71_A13863BarFasCod2 = new String[] {""} ;
      P08FL71_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL71_A396EmprCod = new String[] {""} ;
      P08FL78_A9713Tb1_Cod = new short[1] ;
      P08FL78_A4466BarAcaAnh = new short[1] ;
      P08FL78_A13769BarRdto4 = new short[1] ;
      P08FL78_n13769BarRdto4 = new boolean[] {false} ;
      P08FL78_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL78_A1234BarNomCli = new String[] {""} ;
      P08FL78_A1652BarSerDsc = new String[] {""} ;
      P08FL78_A217BarTipArt = new short[1] ;
      P08FL78_n217BarTipArt = new boolean[] {false} ;
      P08FL78_A13696BarNHdr = new String[] {""} ;
      P08FL78_A279CliNom = new String[] {""} ;
      P08FL78_A136BarColNum = new int[1] ;
      P08FL78_A135BarColNom = new String[] {""} ;
      P08FL78_A212BarSer = new String[] {""} ;
      P08FL78_A252CliCod = new int[1] ;
      P08FL78_n252CliCod = new boolean[] {false} ;
      P08FL78_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL78_A13862Bar_MacCod = new int[1] ;
      P08FL78_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL78_A13861BarMarca = new String[] {""} ;
      P08FL78_n13861BarMarca = new boolean[] {false} ;
      P08FL78_A13860BarAccesor = new String[] {""} ;
      P08FL78_n13860BarAccesor = new boolean[] {false} ;
      P08FL78_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL78_n166BarKgm = new boolean[] {false} ;
      P08FL78_A129BarCod = new int[1] ;
      P08FL78_A132BarCodReo = new byte[1] ;
      P08FL78_A130BarCodPar = new String[] {""} ;
      P08FL78_A361DisCod = new int[1] ;
      P08FL78_A13863BarFasCod2 = new String[] {""} ;
      P08FL78_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL78_A396EmprCod = new String[] {""} ;
      P08FL85_A9713Tb1_Cod = new short[1] ;
      P08FL85_A4466BarAcaAnh = new short[1] ;
      P08FL85_A13769BarRdto4 = new short[1] ;
      P08FL85_n13769BarRdto4 = new boolean[] {false} ;
      P08FL85_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL85_A1234BarNomCli = new String[] {""} ;
      P08FL85_A1652BarSerDsc = new String[] {""} ;
      P08FL85_A217BarTipArt = new short[1] ;
      P08FL85_n217BarTipArt = new boolean[] {false} ;
      P08FL85_A13696BarNHdr = new String[] {""} ;
      P08FL85_A279CliNom = new String[] {""} ;
      P08FL85_A136BarColNum = new int[1] ;
      P08FL85_A135BarColNom = new String[] {""} ;
      P08FL85_A212BarSer = new String[] {""} ;
      P08FL85_A252CliCod = new int[1] ;
      P08FL85_n252CliCod = new boolean[] {false} ;
      P08FL85_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL85_A13862Bar_MacCod = new int[1] ;
      P08FL85_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL85_A13861BarMarca = new String[] {""} ;
      P08FL85_n13861BarMarca = new boolean[] {false} ;
      P08FL85_A13860BarAccesor = new String[] {""} ;
      P08FL85_n13860BarAccesor = new boolean[] {false} ;
      P08FL85_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL85_n166BarKgm = new boolean[] {false} ;
      P08FL85_A129BarCod = new int[1] ;
      P08FL85_A132BarCodReo = new byte[1] ;
      P08FL85_A130BarCodPar = new String[] {""} ;
      P08FL85_A361DisCod = new int[1] ;
      P08FL85_A13863BarFasCod2 = new String[] {""} ;
      P08FL85_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL85_A396EmprCod = new String[] {""} ;
      P08FL92_A9713Tb1_Cod = new short[1] ;
      P08FL92_A4466BarAcaAnh = new short[1] ;
      P08FL92_A13769BarRdto4 = new short[1] ;
      P08FL92_n13769BarRdto4 = new boolean[] {false} ;
      P08FL92_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL92_A1234BarNomCli = new String[] {""} ;
      P08FL92_A1652BarSerDsc = new String[] {""} ;
      P08FL92_A217BarTipArt = new short[1] ;
      P08FL92_n217BarTipArt = new boolean[] {false} ;
      P08FL92_A13696BarNHdr = new String[] {""} ;
      P08FL92_A279CliNom = new String[] {""} ;
      P08FL92_A136BarColNum = new int[1] ;
      P08FL92_A135BarColNom = new String[] {""} ;
      P08FL92_A212BarSer = new String[] {""} ;
      P08FL92_A252CliCod = new int[1] ;
      P08FL92_n252CliCod = new boolean[] {false} ;
      P08FL92_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL92_A13862Bar_MacCod = new int[1] ;
      P08FL92_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL92_A13861BarMarca = new String[] {""} ;
      P08FL92_n13861BarMarca = new boolean[] {false} ;
      P08FL92_A13860BarAccesor = new String[] {""} ;
      P08FL92_n13860BarAccesor = new boolean[] {false} ;
      P08FL92_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL92_n166BarKgm = new boolean[] {false} ;
      P08FL92_A129BarCod = new int[1] ;
      P08FL92_A132BarCodReo = new byte[1] ;
      P08FL92_A130BarCodPar = new String[] {""} ;
      P08FL92_A361DisCod = new int[1] ;
      P08FL92_A13863BarFasCod2 = new String[] {""} ;
      P08FL92_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL92_A396EmprCod = new String[] {""} ;
      P08FL99_A9713Tb1_Cod = new short[1] ;
      P08FL99_A4466BarAcaAnh = new short[1] ;
      P08FL99_A13769BarRdto4 = new short[1] ;
      P08FL99_n13769BarRdto4 = new boolean[] {false} ;
      P08FL99_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL99_A1234BarNomCli = new String[] {""} ;
      P08FL99_A1652BarSerDsc = new String[] {""} ;
      P08FL99_A217BarTipArt = new short[1] ;
      P08FL99_n217BarTipArt = new boolean[] {false} ;
      P08FL99_A13696BarNHdr = new String[] {""} ;
      P08FL99_A279CliNom = new String[] {""} ;
      P08FL99_A136BarColNum = new int[1] ;
      P08FL99_A135BarColNom = new String[] {""} ;
      P08FL99_A212BarSer = new String[] {""} ;
      P08FL99_A252CliCod = new int[1] ;
      P08FL99_n252CliCod = new boolean[] {false} ;
      P08FL99_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FL99_A13862Bar_MacCod = new int[1] ;
      P08FL99_n13862Bar_MacCod = new boolean[] {false} ;
      P08FL99_A13861BarMarca = new String[] {""} ;
      P08FL99_n13861BarMarca = new boolean[] {false} ;
      P08FL99_A13860BarAccesor = new String[] {""} ;
      P08FL99_n13860BarAccesor = new boolean[] {false} ;
      P08FL99_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FL99_n166BarKgm = new boolean[] {false} ;
      P08FL99_A129BarCod = new int[1] ;
      P08FL99_A132BarCodReo = new byte[1] ;
      P08FL99_A130BarCodPar = new String[] {""} ;
      P08FL99_A361DisCod = new int[1] ;
      P08FL99_A13863BarFasCod2 = new String[] {""} ;
      P08FL99_n13863BarFasCod2 = new boolean[] {false} ;
      P08FL99_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlismergetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08FL8_A9713Tb1_Cod, P08FL8_A4466BarAcaAnh, P08FL8_A279CliNom, P08FL8_A13769BarRdto4, P08FL8_n13769BarRdto4, P08FL8_A155BarFecCli, P08FL8_A1234BarNomCli, P08FL8_A1652BarSerDsc, P08FL8_A217BarTipArt, P08FL8_n217BarTipArt,
            P08FL8_A13696BarNHdr, P08FL8_A136BarColNum, P08FL8_A135BarColNom, P08FL8_A212BarSer, P08FL8_A252CliCod, P08FL8_n252CliCod, P08FL8_A161BarFecSal, P08FL8_A13862Bar_MacCod, P08FL8_n13862Bar_MacCod, P08FL8_A13861BarMarca,
            P08FL8_n13861BarMarca, P08FL8_A13860BarAccesor, P08FL8_n13860BarAccesor, P08FL8_A166BarKgm, P08FL8_n166BarKgm, P08FL8_A129BarCod, P08FL8_A132BarCodReo, P08FL8_A130BarCodPar, P08FL8_A361DisCod, P08FL8_A13863BarFasCod2,
            P08FL8_n13863BarFasCod2, P08FL8_A396EmprCod
            }
            , new Object[] {
            P08FL15_A9713Tb1_Cod, P08FL15_A4466BarAcaAnh, P08FL15_A13769BarRdto4, P08FL15_n13769BarRdto4, P08FL15_A155BarFecCli, P08FL15_A1234BarNomCli, P08FL15_A1652BarSerDsc, P08FL15_A217BarTipArt, P08FL15_n217BarTipArt, P08FL15_A13696BarNHdr,
            P08FL15_A279CliNom, P08FL15_A136BarColNum, P08FL15_A135BarColNom, P08FL15_A212BarSer, P08FL15_A252CliCod, P08FL15_n252CliCod, P08FL15_A161BarFecSal, P08FL15_A13862Bar_MacCod, P08FL15_n13862Bar_MacCod, P08FL15_A13861BarMarca,
            P08FL15_n13861BarMarca, P08FL15_A13860BarAccesor, P08FL15_n13860BarAccesor, P08FL15_A166BarKgm, P08FL15_n166BarKgm, P08FL15_A129BarCod, P08FL15_A132BarCodReo, P08FL15_A130BarCodPar, P08FL15_A361DisCod, P08FL15_A13863BarFasCod2,
            P08FL15_n13863BarFasCod2, P08FL15_A396EmprCod
            }
            , new Object[] {
            P08FL22_A9713Tb1_Cod, P08FL22_A4466BarAcaAnh, P08FL22_A212BarSer, P08FL22_A13769BarRdto4, P08FL22_n13769BarRdto4, P08FL22_A155BarFecCli, P08FL22_A1234BarNomCli, P08FL22_A1652BarSerDsc, P08FL22_A217BarTipArt, P08FL22_n217BarTipArt,
            P08FL22_A13696BarNHdr, P08FL22_A279CliNom, P08FL22_A136BarColNum, P08FL22_A135BarColNom, P08FL22_A252CliCod, P08FL22_n252CliCod, P08FL22_A161BarFecSal, P08FL22_A13862Bar_MacCod, P08FL22_n13862Bar_MacCod, P08FL22_A13861BarMarca,
            P08FL22_n13861BarMarca, P08FL22_A13860BarAccesor, P08FL22_n13860BarAccesor, P08FL22_A166BarKgm, P08FL22_n166BarKgm, P08FL22_A129BarCod, P08FL22_A132BarCodReo, P08FL22_A130BarCodPar, P08FL22_A361DisCod, P08FL22_A13863BarFasCod2,
            P08FL22_n13863BarFasCod2, P08FL22_A396EmprCod
            }
            , new Object[] {
            P08FL29_A9713Tb1_Cod, P08FL29_A4466BarAcaAnh, P08FL29_A1652BarSerDsc, P08FL29_A13769BarRdto4, P08FL29_n13769BarRdto4, P08FL29_A155BarFecCli, P08FL29_A1234BarNomCli, P08FL29_A217BarTipArt, P08FL29_n217BarTipArt, P08FL29_A13696BarNHdr,
            P08FL29_A279CliNom, P08FL29_A136BarColNum, P08FL29_A135BarColNom, P08FL29_A212BarSer, P08FL29_A252CliCod, P08FL29_n252CliCod, P08FL29_A161BarFecSal, P08FL29_A13862Bar_MacCod, P08FL29_n13862Bar_MacCod, P08FL29_A13861BarMarca,
            P08FL29_n13861BarMarca, P08FL29_A13860BarAccesor, P08FL29_n13860BarAccesor, P08FL29_A166BarKgm, P08FL29_n166BarKgm, P08FL29_A129BarCod, P08FL29_A132BarCodReo, P08FL29_A130BarCodPar, P08FL29_A361DisCod, P08FL29_A13863BarFasCod2,
            P08FL29_n13863BarFasCod2, P08FL29_A396EmprCod
            }
            , new Object[] {
            P08FL36_A9713Tb1_Cod, P08FL36_A4466BarAcaAnh, P08FL36_A135BarColNom, P08FL36_A13769BarRdto4, P08FL36_n13769BarRdto4, P08FL36_A155BarFecCli, P08FL36_A1234BarNomCli, P08FL36_A1652BarSerDsc, P08FL36_A217BarTipArt, P08FL36_n217BarTipArt,
            P08FL36_A13696BarNHdr, P08FL36_A279CliNom, P08FL36_A136BarColNum, P08FL36_A212BarSer, P08FL36_A252CliCod, P08FL36_n252CliCod, P08FL36_A161BarFecSal, P08FL36_A13862Bar_MacCod, P08FL36_n13862Bar_MacCod, P08FL36_A13861BarMarca,
            P08FL36_n13861BarMarca, P08FL36_A13860BarAccesor, P08FL36_n13860BarAccesor, P08FL36_A166BarKgm, P08FL36_n166BarKgm, P08FL36_A129BarCod, P08FL36_A132BarCodReo, P08FL36_A130BarCodPar, P08FL36_A361DisCod, P08FL36_A13863BarFasCod2,
            P08FL36_n13863BarFasCod2, P08FL36_A396EmprCod
            }
            , new Object[] {
            P08FL43_A9713Tb1_Cod, P08FL43_A4466BarAcaAnh, P08FL43_A1234BarNomCli, P08FL43_A13769BarRdto4, P08FL43_n13769BarRdto4, P08FL43_A155BarFecCli, P08FL43_A1652BarSerDsc, P08FL43_A217BarTipArt, P08FL43_n217BarTipArt, P08FL43_A13696BarNHdr,
            P08FL43_A279CliNom, P08FL43_A136BarColNum, P08FL43_A135BarColNom, P08FL43_A212BarSer, P08FL43_A252CliCod, P08FL43_n252CliCod, P08FL43_A161BarFecSal, P08FL43_A13862Bar_MacCod, P08FL43_n13862Bar_MacCod, P08FL43_A13861BarMarca,
            P08FL43_n13861BarMarca, P08FL43_A13860BarAccesor, P08FL43_n13860BarAccesor, P08FL43_A166BarKgm, P08FL43_n166BarKgm, P08FL43_A129BarCod, P08FL43_A132BarCodReo, P08FL43_A130BarCodPar, P08FL43_A361DisCod, P08FL43_A13863BarFasCod2,
            P08FL43_n13863BarFasCod2, P08FL43_A396EmprCod
            }
            , new Object[] {
            P08FL50_A9713Tb1_Cod, P08FL50_A4466BarAcaAnh, P08FL50_A13769BarRdto4, P08FL50_n13769BarRdto4, P08FL50_A155BarFecCli, P08FL50_A1234BarNomCli, P08FL50_A1652BarSerDsc, P08FL50_A217BarTipArt, P08FL50_n217BarTipArt, P08FL50_A13696BarNHdr,
            P08FL50_A279CliNom, P08FL50_A136BarColNum, P08FL50_A135BarColNom, P08FL50_A212BarSer, P08FL50_A252CliCod, P08FL50_n252CliCod, P08FL50_A161BarFecSal, P08FL50_A13862Bar_MacCod, P08FL50_n13862Bar_MacCod, P08FL50_A13861BarMarca,
            P08FL50_n13861BarMarca, P08FL50_A13860BarAccesor, P08FL50_n13860BarAccesor, P08FL50_A166BarKgm, P08FL50_n166BarKgm, P08FL50_A129BarCod, P08FL50_A132BarCodReo, P08FL50_A130BarCodPar, P08FL50_A361DisCod, P08FL50_A13863BarFasCod2,
            P08FL50_n13863BarFasCod2, P08FL50_A396EmprCod
            }
            , new Object[] {
            P08FL57_A9713Tb1_Cod, P08FL57_A4466BarAcaAnh, P08FL57_A13769BarRdto4, P08FL57_n13769BarRdto4, P08FL57_A155BarFecCli, P08FL57_A1234BarNomCli, P08FL57_A1652BarSerDsc, P08FL57_A217BarTipArt, P08FL57_n217BarTipArt, P08FL57_A13696BarNHdr,
            P08FL57_A279CliNom, P08FL57_A136BarColNum, P08FL57_A135BarColNom, P08FL57_A212BarSer, P08FL57_A252CliCod, P08FL57_n252CliCod, P08FL57_A161BarFecSal, P08FL57_A13862Bar_MacCod, P08FL57_n13862Bar_MacCod, P08FL57_A13861BarMarca,
            P08FL57_n13861BarMarca, P08FL57_A13860BarAccesor, P08FL57_n13860BarAccesor, P08FL57_A166BarKgm, P08FL57_n166BarKgm, P08FL57_A129BarCod, P08FL57_A132BarCodReo, P08FL57_A130BarCodPar, P08FL57_A361DisCod, P08FL57_A13863BarFasCod2,
            P08FL57_n13863BarFasCod2, P08FL57_A396EmprCod
            }
            , new Object[] {
            P08FL64_A9713Tb1_Cod, P08FL64_A4466BarAcaAnh, P08FL64_A13769BarRdto4, P08FL64_n13769BarRdto4, P08FL64_A155BarFecCli, P08FL64_A1234BarNomCli, P08FL64_A1652BarSerDsc, P08FL64_A217BarTipArt, P08FL64_n217BarTipArt, P08FL64_A13696BarNHdr,
            P08FL64_A279CliNom, P08FL64_A136BarColNum, P08FL64_A135BarColNom, P08FL64_A212BarSer, P08FL64_A252CliCod, P08FL64_n252CliCod, P08FL64_A161BarFecSal, P08FL64_A13862Bar_MacCod, P08FL64_n13862Bar_MacCod, P08FL64_A13861BarMarca,
            P08FL64_n13861BarMarca, P08FL64_A13860BarAccesor, P08FL64_n13860BarAccesor, P08FL64_A166BarKgm, P08FL64_n166BarKgm, P08FL64_A129BarCod, P08FL64_A132BarCodReo, P08FL64_A130BarCodPar, P08FL64_A361DisCod, P08FL64_A13863BarFasCod2,
            P08FL64_n13863BarFasCod2, P08FL64_A396EmprCod
            }
            , new Object[] {
            P08FL71_A9713Tb1_Cod, P08FL71_A4466BarAcaAnh, P08FL71_A13769BarRdto4, P08FL71_n13769BarRdto4, P08FL71_A155BarFecCli, P08FL71_A1234BarNomCli, P08FL71_A1652BarSerDsc, P08FL71_A217BarTipArt, P08FL71_n217BarTipArt, P08FL71_A13696BarNHdr,
            P08FL71_A279CliNom, P08FL71_A136BarColNum, P08FL71_A135BarColNom, P08FL71_A212BarSer, P08FL71_A252CliCod, P08FL71_n252CliCod, P08FL71_A161BarFecSal, P08FL71_A13862Bar_MacCod, P08FL71_n13862Bar_MacCod, P08FL71_A13861BarMarca,
            P08FL71_n13861BarMarca, P08FL71_A13860BarAccesor, P08FL71_n13860BarAccesor, P08FL71_A166BarKgm, P08FL71_n166BarKgm, P08FL71_A129BarCod, P08FL71_A132BarCodReo, P08FL71_A130BarCodPar, P08FL71_A361DisCod, P08FL71_A13863BarFasCod2,
            P08FL71_n13863BarFasCod2, P08FL71_A396EmprCod
            }
            , new Object[] {
            P08FL78_A9713Tb1_Cod, P08FL78_A4466BarAcaAnh, P08FL78_A13769BarRdto4, P08FL78_n13769BarRdto4, P08FL78_A155BarFecCli, P08FL78_A1234BarNomCli, P08FL78_A1652BarSerDsc, P08FL78_A217BarTipArt, P08FL78_n217BarTipArt, P08FL78_A13696BarNHdr,
            P08FL78_A279CliNom, P08FL78_A136BarColNum, P08FL78_A135BarColNom, P08FL78_A212BarSer, P08FL78_A252CliCod, P08FL78_n252CliCod, P08FL78_A161BarFecSal, P08FL78_A13862Bar_MacCod, P08FL78_n13862Bar_MacCod, P08FL78_A13861BarMarca,
            P08FL78_n13861BarMarca, P08FL78_A13860BarAccesor, P08FL78_n13860BarAccesor, P08FL78_A166BarKgm, P08FL78_n166BarKgm, P08FL78_A129BarCod, P08FL78_A132BarCodReo, P08FL78_A130BarCodPar, P08FL78_A361DisCod, P08FL78_A13863BarFasCod2,
            P08FL78_n13863BarFasCod2, P08FL78_A396EmprCod
            }
            , new Object[] {
            P08FL85_A9713Tb1_Cod, P08FL85_A4466BarAcaAnh, P08FL85_A13769BarRdto4, P08FL85_n13769BarRdto4, P08FL85_A155BarFecCli, P08FL85_A1234BarNomCli, P08FL85_A1652BarSerDsc, P08FL85_A217BarTipArt, P08FL85_n217BarTipArt, P08FL85_A13696BarNHdr,
            P08FL85_A279CliNom, P08FL85_A136BarColNum, P08FL85_A135BarColNom, P08FL85_A212BarSer, P08FL85_A252CliCod, P08FL85_n252CliCod, P08FL85_A161BarFecSal, P08FL85_A13862Bar_MacCod, P08FL85_n13862Bar_MacCod, P08FL85_A13861BarMarca,
            P08FL85_n13861BarMarca, P08FL85_A13860BarAccesor, P08FL85_n13860BarAccesor, P08FL85_A166BarKgm, P08FL85_n166BarKgm, P08FL85_A129BarCod, P08FL85_A132BarCodReo, P08FL85_A130BarCodPar, P08FL85_A361DisCod, P08FL85_A13863BarFasCod2,
            P08FL85_n13863BarFasCod2, P08FL85_A396EmprCod
            }
            , new Object[] {
            P08FL92_A9713Tb1_Cod, P08FL92_A4466BarAcaAnh, P08FL92_A13769BarRdto4, P08FL92_n13769BarRdto4, P08FL92_A155BarFecCli, P08FL92_A1234BarNomCli, P08FL92_A1652BarSerDsc, P08FL92_A217BarTipArt, P08FL92_n217BarTipArt, P08FL92_A13696BarNHdr,
            P08FL92_A279CliNom, P08FL92_A136BarColNum, P08FL92_A135BarColNom, P08FL92_A212BarSer, P08FL92_A252CliCod, P08FL92_n252CliCod, P08FL92_A161BarFecSal, P08FL92_A13862Bar_MacCod, P08FL92_n13862Bar_MacCod, P08FL92_A13861BarMarca,
            P08FL92_n13861BarMarca, P08FL92_A13860BarAccesor, P08FL92_n13860BarAccesor, P08FL92_A166BarKgm, P08FL92_n166BarKgm, P08FL92_A129BarCod, P08FL92_A132BarCodReo, P08FL92_A130BarCodPar, P08FL92_A361DisCod, P08FL92_A13863BarFasCod2,
            P08FL92_n13863BarFasCod2, P08FL92_A396EmprCod
            }
            , new Object[] {
            P08FL99_A9713Tb1_Cod, P08FL99_A4466BarAcaAnh, P08FL99_A13769BarRdto4, P08FL99_n13769BarRdto4, P08FL99_A155BarFecCli, P08FL99_A1234BarNomCli, P08FL99_A1652BarSerDsc, P08FL99_A217BarTipArt, P08FL99_n217BarTipArt, P08FL99_A13696BarNHdr,
            P08FL99_A279CliNom, P08FL99_A136BarColNum, P08FL99_A135BarColNom, P08FL99_A212BarSer, P08FL99_A252CliCod, P08FL99_n252CliCod, P08FL99_A161BarFecSal, P08FL99_A13862Bar_MacCod, P08FL99_n13862Bar_MacCod, P08FL99_A13861BarMarca,
            P08FL99_n13861BarMarca, P08FL99_A13860BarAccesor, P08FL99_n13860BarAccesor, P08FL99_A166BarKgm, P08FL99_n166BarKgm, P08FL99_A129BarCod, P08FL99_A132BarCodReo, P08FL99_A130BarCodPar, P08FL99_A361DisCod, P08FL99_A13863BarFasCod2,
            P08FL99_n13863BarFasCod2, P08FL99_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV16TFBarTipArt ;
   private short AV17TFBarTipArt_To ;
   private short AV64TFBarRdto4 ;
   private short AV65TFBarRdto4_To ;
   private short AV107Webwlismerds_18_tfbartipart ;
   private short AV108Webwlismerds_19_tfbartipart_to ;
   private short AV123Webwlismerds_34_tfbarrdto4 ;
   private short AV124Webwlismerds_35_tfbarrdto4_to ;
   private short A217BarTipArt ;
   private short A13769BarRdto4 ;
   private short A4466BarAcaAnh ;
   private short Gx_err ;
   private int AV88GXV1 ;
   private int AV56CliCod ;
   private int AV57CliCod_To ;
   private int AV62BarColNum ;
   private int AV63BarColNum_To ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV28TFBarColNum ;
   private int AV29TFBarColNum_To ;
   private int AV80TFBar_MacCod ;
   private int AV81TFBar_MacCod_To ;
   private int AV93Webwlismerds_4_clicod ;
   private int AV94Webwlismerds_5_clicod_to ;
   private int AV99Webwlismerds_10_barcolnum ;
   private int AV100Webwlismerds_11_barcolnum_to ;
   private int AV101Webwlismerds_12_tfclicod ;
   private int AV102Webwlismerds_13_tfclicod_to ;
   private int AV117Webwlismerds_28_tfbarcolnum ;
   private int AV118Webwlismerds_29_tfbarcolnum_to ;
   private int AV138Webwlismerds_49_tfbar_maccod ;
   private int AV139Webwlismerds_50_tfbar_maccod_to ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A13862Bar_MacCod ;
   private int A361DisCod ;
   private int AV37InsertIndex ;
   private long AV46count ;
   private java.math.BigDecimal AV32TFBarKgm ;
   private java.math.BigDecimal AV33TFBarKgm_To ;
   private java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ;
   private java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV58BarSer ;
   private String AV59BarSer_To ;
   private String AV60BarColNom ;
   private String AV61BarColNom_To ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFBarNHdr ;
   private String AV15TFBarNHdr_Sel ;
   private String AV20TFBarSer ;
   private String AV21TFBarSer_Sel ;
   private String AV22TFBarSerDsc ;
   private String AV23TFBarSerDsc_Sel ;
   private String AV24TFBarColNom ;
   private String AV25TFBarColNom_Sel ;
   private String AV26TFBarNomCli ;
   private String AV27TFBarNomCli_Sel ;
   private String AV67TFBarGots ;
   private String AV68TFBarGots_Sel ;
   private String AV69TFBarGrs ;
   private String AV70TFBarGrs_Sel ;
   private String AV71TFBarOcs ;
   private String AV72TFBarOcs_Sel ;
   private String AV73TFBarRcs ;
   private String AV74TFBarRcs_Sel ;
   private String AV75TFBarOeko ;
   private String AV76TFBarOeko_Sel ;
   private String AV77TFBarAccesorios_Sel ;
   private String AV78TFBarMarca ;
   private String AV79TFBarMarca_Sel ;
   private String AV82TFBarFasCod2 ;
   private String AV83TFBarFasCod2_Sel ;
   private String AV84TFBarFasDsc2 ;
   private String AV85TFBarFasDsc2_Sel ;
   private String A279CliNom ;
   private String AV95Webwlismerds_6_barser ;
   private String AV96Webwlismerds_7_barser_to ;
   private String AV97Webwlismerds_8_barcolnom ;
   private String AV98Webwlismerds_9_barcolnom_to ;
   private String AV103Webwlismerds_14_tfclinom ;
   private String AV104Webwlismerds_15_tfclinom_sel ;
   private String AV105Webwlismerds_16_tfbarnhdr ;
   private String AV106Webwlismerds_17_tfbarnhdr_sel ;
   private String AV109Webwlismerds_20_tfbarser ;
   private String AV110Webwlismerds_21_tfbarser_sel ;
   private String AV111Webwlismerds_22_tfbarserdsc ;
   private String AV112Webwlismerds_23_tfbarserdsc_sel ;
   private String AV113Webwlismerds_24_tfbarcolnom ;
   private String AV114Webwlismerds_25_tfbarcolnom_sel ;
   private String AV115Webwlismerds_26_tfbarnomcli ;
   private String AV116Webwlismerds_27_tfbarnomcli_sel ;
   private String AV125Webwlismerds_36_tfbargots ;
   private String AV126Webwlismerds_37_tfbargots_sel ;
   private String AV127Webwlismerds_38_tfbargrs ;
   private String AV128Webwlismerds_39_tfbargrs_sel ;
   private String AV129Webwlismerds_40_tfbarocs ;
   private String AV130Webwlismerds_41_tfbarocs_sel ;
   private String AV131Webwlismerds_42_tfbarrcs ;
   private String AV132Webwlismerds_43_tfbarrcs_sel ;
   private String AV133Webwlismerds_44_tfbaroeko ;
   private String AV134Webwlismerds_45_tfbaroeko_sel ;
   private String AV135Webwlismerds_46_tfbaraccesorios_sel ;
   private String AV136Webwlismerds_47_tfbarmarca ;
   private String AV137Webwlismerds_48_tfbarmarca_sel ;
   private String AV140Webwlismerds_51_tfbarfascod2 ;
   private String AV141Webwlismerds_52_tfbarfascod2_sel ;
   private String AV142Webwlismerds_53_tfbarfasdsc2 ;
   private String AV143Webwlismerds_54_tfbarfasdsc2_sel ;
   private String scmdbuf ;
   private String lV136Webwlismerds_47_tfbarmarca ;
   private String lV140Webwlismerds_51_tfbarfascod2 ;
   private String lV103Webwlismerds_14_tfclinom ;
   private String lV105Webwlismerds_16_tfbarnhdr ;
   private String lV109Webwlismerds_20_tfbarser ;
   private String lV111Webwlismerds_22_tfbarserdsc ;
   private String lV113Webwlismerds_24_tfbarcolnom ;
   private String lV115Webwlismerds_26_tfbarnomcli ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A13696BarNHdr ;
   private String A13855BarGots ;
   private String A13856BarGrs ;
   private String A13857BarOcs ;
   private String A13858BarRcs ;
   private String A13859BarOeko ;
   private String A13861BarMarca ;
   private String A13863BarFasCod2 ;
   private String A13864BarFasDsc2 ;
   private String A13860BarAccesor ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV54BarFecSal ;
   private java.util.Date AV55BarFecSal_To ;
   private java.util.Date AV52TFBarFecSal ;
   private java.util.Date AV30TFBarFecCli ;
   private java.util.Date AV91Webwlismerds_2_barfecsal ;
   private java.util.Date AV92Webwlismerds_3_barfecsal_to ;
   private java.util.Date AV119Webwlismerds_30_tfbarfecsal ;
   private java.util.Date AV120Webwlismerds_31_tfbarfeccli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private boolean returnInSub ;
   private boolean brk8FL2 ;
   private boolean n13769BarRdto4 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13862Bar_MacCod ;
   private boolean n13861BarMarca ;
   private boolean n13860BarAccesor ;
   private boolean n166BarKgm ;
   private boolean n13863BarFasCod2 ;
   private boolean brk8FL5 ;
   private boolean brk8FL7 ;
   private boolean brk8FL9 ;
   private boolean brk8FL11 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV66FilterFullText ;
   private String AV90Webwlismerds_1_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P08FL8_A9713Tb1_Cod ;
   private short[] P08FL8_A4466BarAcaAnh ;
   private String[] P08FL8_A279CliNom ;
   private short[] P08FL8_A13769BarRdto4 ;
   private boolean[] P08FL8_n13769BarRdto4 ;
   private java.util.Date[] P08FL8_A155BarFecCli ;
   private String[] P08FL8_A1234BarNomCli ;
   private String[] P08FL8_A1652BarSerDsc ;
   private short[] P08FL8_A217BarTipArt ;
   private boolean[] P08FL8_n217BarTipArt ;
   private String[] P08FL8_A13696BarNHdr ;
   private int[] P08FL8_A136BarColNum ;
   private String[] P08FL8_A135BarColNom ;
   private String[] P08FL8_A212BarSer ;
   private int[] P08FL8_A252CliCod ;
   private boolean[] P08FL8_n252CliCod ;
   private java.util.Date[] P08FL8_A161BarFecSal ;
   private int[] P08FL8_A13862Bar_MacCod ;
   private boolean[] P08FL8_n13862Bar_MacCod ;
   private String[] P08FL8_A13861BarMarca ;
   private boolean[] P08FL8_n13861BarMarca ;
   private String[] P08FL8_A13860BarAccesor ;
   private boolean[] P08FL8_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL8_A166BarKgm ;
   private boolean[] P08FL8_n166BarKgm ;
   private int[] P08FL8_A129BarCod ;
   private byte[] P08FL8_A132BarCodReo ;
   private String[] P08FL8_A130BarCodPar ;
   private int[] P08FL8_A361DisCod ;
   private String[] P08FL8_A13863BarFasCod2 ;
   private boolean[] P08FL8_n13863BarFasCod2 ;
   private String[] P08FL8_A396EmprCod ;
   private short[] P08FL15_A9713Tb1_Cod ;
   private short[] P08FL15_A4466BarAcaAnh ;
   private short[] P08FL15_A13769BarRdto4 ;
   private boolean[] P08FL15_n13769BarRdto4 ;
   private java.util.Date[] P08FL15_A155BarFecCli ;
   private String[] P08FL15_A1234BarNomCli ;
   private String[] P08FL15_A1652BarSerDsc ;
   private short[] P08FL15_A217BarTipArt ;
   private boolean[] P08FL15_n217BarTipArt ;
   private String[] P08FL15_A13696BarNHdr ;
   private String[] P08FL15_A279CliNom ;
   private int[] P08FL15_A136BarColNum ;
   private String[] P08FL15_A135BarColNom ;
   private String[] P08FL15_A212BarSer ;
   private int[] P08FL15_A252CliCod ;
   private boolean[] P08FL15_n252CliCod ;
   private java.util.Date[] P08FL15_A161BarFecSal ;
   private int[] P08FL15_A13862Bar_MacCod ;
   private boolean[] P08FL15_n13862Bar_MacCod ;
   private String[] P08FL15_A13861BarMarca ;
   private boolean[] P08FL15_n13861BarMarca ;
   private String[] P08FL15_A13860BarAccesor ;
   private boolean[] P08FL15_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL15_A166BarKgm ;
   private boolean[] P08FL15_n166BarKgm ;
   private int[] P08FL15_A129BarCod ;
   private byte[] P08FL15_A132BarCodReo ;
   private String[] P08FL15_A130BarCodPar ;
   private int[] P08FL15_A361DisCod ;
   private String[] P08FL15_A13863BarFasCod2 ;
   private boolean[] P08FL15_n13863BarFasCod2 ;
   private String[] P08FL15_A396EmprCod ;
   private short[] P08FL22_A9713Tb1_Cod ;
   private short[] P08FL22_A4466BarAcaAnh ;
   private String[] P08FL22_A212BarSer ;
   private short[] P08FL22_A13769BarRdto4 ;
   private boolean[] P08FL22_n13769BarRdto4 ;
   private java.util.Date[] P08FL22_A155BarFecCli ;
   private String[] P08FL22_A1234BarNomCli ;
   private String[] P08FL22_A1652BarSerDsc ;
   private short[] P08FL22_A217BarTipArt ;
   private boolean[] P08FL22_n217BarTipArt ;
   private String[] P08FL22_A13696BarNHdr ;
   private String[] P08FL22_A279CliNom ;
   private int[] P08FL22_A136BarColNum ;
   private String[] P08FL22_A135BarColNom ;
   private int[] P08FL22_A252CliCod ;
   private boolean[] P08FL22_n252CliCod ;
   private java.util.Date[] P08FL22_A161BarFecSal ;
   private int[] P08FL22_A13862Bar_MacCod ;
   private boolean[] P08FL22_n13862Bar_MacCod ;
   private String[] P08FL22_A13861BarMarca ;
   private boolean[] P08FL22_n13861BarMarca ;
   private String[] P08FL22_A13860BarAccesor ;
   private boolean[] P08FL22_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL22_A166BarKgm ;
   private boolean[] P08FL22_n166BarKgm ;
   private int[] P08FL22_A129BarCod ;
   private byte[] P08FL22_A132BarCodReo ;
   private String[] P08FL22_A130BarCodPar ;
   private int[] P08FL22_A361DisCod ;
   private String[] P08FL22_A13863BarFasCod2 ;
   private boolean[] P08FL22_n13863BarFasCod2 ;
   private String[] P08FL22_A396EmprCod ;
   private short[] P08FL29_A9713Tb1_Cod ;
   private short[] P08FL29_A4466BarAcaAnh ;
   private String[] P08FL29_A1652BarSerDsc ;
   private short[] P08FL29_A13769BarRdto4 ;
   private boolean[] P08FL29_n13769BarRdto4 ;
   private java.util.Date[] P08FL29_A155BarFecCli ;
   private String[] P08FL29_A1234BarNomCli ;
   private short[] P08FL29_A217BarTipArt ;
   private boolean[] P08FL29_n217BarTipArt ;
   private String[] P08FL29_A13696BarNHdr ;
   private String[] P08FL29_A279CliNom ;
   private int[] P08FL29_A136BarColNum ;
   private String[] P08FL29_A135BarColNom ;
   private String[] P08FL29_A212BarSer ;
   private int[] P08FL29_A252CliCod ;
   private boolean[] P08FL29_n252CliCod ;
   private java.util.Date[] P08FL29_A161BarFecSal ;
   private int[] P08FL29_A13862Bar_MacCod ;
   private boolean[] P08FL29_n13862Bar_MacCod ;
   private String[] P08FL29_A13861BarMarca ;
   private boolean[] P08FL29_n13861BarMarca ;
   private String[] P08FL29_A13860BarAccesor ;
   private boolean[] P08FL29_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL29_A166BarKgm ;
   private boolean[] P08FL29_n166BarKgm ;
   private int[] P08FL29_A129BarCod ;
   private byte[] P08FL29_A132BarCodReo ;
   private String[] P08FL29_A130BarCodPar ;
   private int[] P08FL29_A361DisCod ;
   private String[] P08FL29_A13863BarFasCod2 ;
   private boolean[] P08FL29_n13863BarFasCod2 ;
   private String[] P08FL29_A396EmprCod ;
   private short[] P08FL36_A9713Tb1_Cod ;
   private short[] P08FL36_A4466BarAcaAnh ;
   private String[] P08FL36_A135BarColNom ;
   private short[] P08FL36_A13769BarRdto4 ;
   private boolean[] P08FL36_n13769BarRdto4 ;
   private java.util.Date[] P08FL36_A155BarFecCli ;
   private String[] P08FL36_A1234BarNomCli ;
   private String[] P08FL36_A1652BarSerDsc ;
   private short[] P08FL36_A217BarTipArt ;
   private boolean[] P08FL36_n217BarTipArt ;
   private String[] P08FL36_A13696BarNHdr ;
   private String[] P08FL36_A279CliNom ;
   private int[] P08FL36_A136BarColNum ;
   private String[] P08FL36_A212BarSer ;
   private int[] P08FL36_A252CliCod ;
   private boolean[] P08FL36_n252CliCod ;
   private java.util.Date[] P08FL36_A161BarFecSal ;
   private int[] P08FL36_A13862Bar_MacCod ;
   private boolean[] P08FL36_n13862Bar_MacCod ;
   private String[] P08FL36_A13861BarMarca ;
   private boolean[] P08FL36_n13861BarMarca ;
   private String[] P08FL36_A13860BarAccesor ;
   private boolean[] P08FL36_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL36_A166BarKgm ;
   private boolean[] P08FL36_n166BarKgm ;
   private int[] P08FL36_A129BarCod ;
   private byte[] P08FL36_A132BarCodReo ;
   private String[] P08FL36_A130BarCodPar ;
   private int[] P08FL36_A361DisCod ;
   private String[] P08FL36_A13863BarFasCod2 ;
   private boolean[] P08FL36_n13863BarFasCod2 ;
   private String[] P08FL36_A396EmprCod ;
   private short[] P08FL43_A9713Tb1_Cod ;
   private short[] P08FL43_A4466BarAcaAnh ;
   private String[] P08FL43_A1234BarNomCli ;
   private short[] P08FL43_A13769BarRdto4 ;
   private boolean[] P08FL43_n13769BarRdto4 ;
   private java.util.Date[] P08FL43_A155BarFecCli ;
   private String[] P08FL43_A1652BarSerDsc ;
   private short[] P08FL43_A217BarTipArt ;
   private boolean[] P08FL43_n217BarTipArt ;
   private String[] P08FL43_A13696BarNHdr ;
   private String[] P08FL43_A279CliNom ;
   private int[] P08FL43_A136BarColNum ;
   private String[] P08FL43_A135BarColNom ;
   private String[] P08FL43_A212BarSer ;
   private int[] P08FL43_A252CliCod ;
   private boolean[] P08FL43_n252CliCod ;
   private java.util.Date[] P08FL43_A161BarFecSal ;
   private int[] P08FL43_A13862Bar_MacCod ;
   private boolean[] P08FL43_n13862Bar_MacCod ;
   private String[] P08FL43_A13861BarMarca ;
   private boolean[] P08FL43_n13861BarMarca ;
   private String[] P08FL43_A13860BarAccesor ;
   private boolean[] P08FL43_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL43_A166BarKgm ;
   private boolean[] P08FL43_n166BarKgm ;
   private int[] P08FL43_A129BarCod ;
   private byte[] P08FL43_A132BarCodReo ;
   private String[] P08FL43_A130BarCodPar ;
   private int[] P08FL43_A361DisCod ;
   private String[] P08FL43_A13863BarFasCod2 ;
   private boolean[] P08FL43_n13863BarFasCod2 ;
   private String[] P08FL43_A396EmprCod ;
   private short[] P08FL50_A9713Tb1_Cod ;
   private short[] P08FL50_A4466BarAcaAnh ;
   private short[] P08FL50_A13769BarRdto4 ;
   private boolean[] P08FL50_n13769BarRdto4 ;
   private java.util.Date[] P08FL50_A155BarFecCli ;
   private String[] P08FL50_A1234BarNomCli ;
   private String[] P08FL50_A1652BarSerDsc ;
   private short[] P08FL50_A217BarTipArt ;
   private boolean[] P08FL50_n217BarTipArt ;
   private String[] P08FL50_A13696BarNHdr ;
   private String[] P08FL50_A279CliNom ;
   private int[] P08FL50_A136BarColNum ;
   private String[] P08FL50_A135BarColNom ;
   private String[] P08FL50_A212BarSer ;
   private int[] P08FL50_A252CliCod ;
   private boolean[] P08FL50_n252CliCod ;
   private java.util.Date[] P08FL50_A161BarFecSal ;
   private int[] P08FL50_A13862Bar_MacCod ;
   private boolean[] P08FL50_n13862Bar_MacCod ;
   private String[] P08FL50_A13861BarMarca ;
   private boolean[] P08FL50_n13861BarMarca ;
   private String[] P08FL50_A13860BarAccesor ;
   private boolean[] P08FL50_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL50_A166BarKgm ;
   private boolean[] P08FL50_n166BarKgm ;
   private int[] P08FL50_A129BarCod ;
   private byte[] P08FL50_A132BarCodReo ;
   private String[] P08FL50_A130BarCodPar ;
   private int[] P08FL50_A361DisCod ;
   private String[] P08FL50_A13863BarFasCod2 ;
   private boolean[] P08FL50_n13863BarFasCod2 ;
   private String[] P08FL50_A396EmprCod ;
   private short[] P08FL57_A9713Tb1_Cod ;
   private short[] P08FL57_A4466BarAcaAnh ;
   private short[] P08FL57_A13769BarRdto4 ;
   private boolean[] P08FL57_n13769BarRdto4 ;
   private java.util.Date[] P08FL57_A155BarFecCli ;
   private String[] P08FL57_A1234BarNomCli ;
   private String[] P08FL57_A1652BarSerDsc ;
   private short[] P08FL57_A217BarTipArt ;
   private boolean[] P08FL57_n217BarTipArt ;
   private String[] P08FL57_A13696BarNHdr ;
   private String[] P08FL57_A279CliNom ;
   private int[] P08FL57_A136BarColNum ;
   private String[] P08FL57_A135BarColNom ;
   private String[] P08FL57_A212BarSer ;
   private int[] P08FL57_A252CliCod ;
   private boolean[] P08FL57_n252CliCod ;
   private java.util.Date[] P08FL57_A161BarFecSal ;
   private int[] P08FL57_A13862Bar_MacCod ;
   private boolean[] P08FL57_n13862Bar_MacCod ;
   private String[] P08FL57_A13861BarMarca ;
   private boolean[] P08FL57_n13861BarMarca ;
   private String[] P08FL57_A13860BarAccesor ;
   private boolean[] P08FL57_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL57_A166BarKgm ;
   private boolean[] P08FL57_n166BarKgm ;
   private int[] P08FL57_A129BarCod ;
   private byte[] P08FL57_A132BarCodReo ;
   private String[] P08FL57_A130BarCodPar ;
   private int[] P08FL57_A361DisCod ;
   private String[] P08FL57_A13863BarFasCod2 ;
   private boolean[] P08FL57_n13863BarFasCod2 ;
   private String[] P08FL57_A396EmprCod ;
   private short[] P08FL64_A9713Tb1_Cod ;
   private short[] P08FL64_A4466BarAcaAnh ;
   private short[] P08FL64_A13769BarRdto4 ;
   private boolean[] P08FL64_n13769BarRdto4 ;
   private java.util.Date[] P08FL64_A155BarFecCli ;
   private String[] P08FL64_A1234BarNomCli ;
   private String[] P08FL64_A1652BarSerDsc ;
   private short[] P08FL64_A217BarTipArt ;
   private boolean[] P08FL64_n217BarTipArt ;
   private String[] P08FL64_A13696BarNHdr ;
   private String[] P08FL64_A279CliNom ;
   private int[] P08FL64_A136BarColNum ;
   private String[] P08FL64_A135BarColNom ;
   private String[] P08FL64_A212BarSer ;
   private int[] P08FL64_A252CliCod ;
   private boolean[] P08FL64_n252CliCod ;
   private java.util.Date[] P08FL64_A161BarFecSal ;
   private int[] P08FL64_A13862Bar_MacCod ;
   private boolean[] P08FL64_n13862Bar_MacCod ;
   private String[] P08FL64_A13861BarMarca ;
   private boolean[] P08FL64_n13861BarMarca ;
   private String[] P08FL64_A13860BarAccesor ;
   private boolean[] P08FL64_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL64_A166BarKgm ;
   private boolean[] P08FL64_n166BarKgm ;
   private int[] P08FL64_A129BarCod ;
   private byte[] P08FL64_A132BarCodReo ;
   private String[] P08FL64_A130BarCodPar ;
   private int[] P08FL64_A361DisCod ;
   private String[] P08FL64_A13863BarFasCod2 ;
   private boolean[] P08FL64_n13863BarFasCod2 ;
   private String[] P08FL64_A396EmprCod ;
   private short[] P08FL71_A9713Tb1_Cod ;
   private short[] P08FL71_A4466BarAcaAnh ;
   private short[] P08FL71_A13769BarRdto4 ;
   private boolean[] P08FL71_n13769BarRdto4 ;
   private java.util.Date[] P08FL71_A155BarFecCli ;
   private String[] P08FL71_A1234BarNomCli ;
   private String[] P08FL71_A1652BarSerDsc ;
   private short[] P08FL71_A217BarTipArt ;
   private boolean[] P08FL71_n217BarTipArt ;
   private String[] P08FL71_A13696BarNHdr ;
   private String[] P08FL71_A279CliNom ;
   private int[] P08FL71_A136BarColNum ;
   private String[] P08FL71_A135BarColNom ;
   private String[] P08FL71_A212BarSer ;
   private int[] P08FL71_A252CliCod ;
   private boolean[] P08FL71_n252CliCod ;
   private java.util.Date[] P08FL71_A161BarFecSal ;
   private int[] P08FL71_A13862Bar_MacCod ;
   private boolean[] P08FL71_n13862Bar_MacCod ;
   private String[] P08FL71_A13861BarMarca ;
   private boolean[] P08FL71_n13861BarMarca ;
   private String[] P08FL71_A13860BarAccesor ;
   private boolean[] P08FL71_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL71_A166BarKgm ;
   private boolean[] P08FL71_n166BarKgm ;
   private int[] P08FL71_A129BarCod ;
   private byte[] P08FL71_A132BarCodReo ;
   private String[] P08FL71_A130BarCodPar ;
   private int[] P08FL71_A361DisCod ;
   private String[] P08FL71_A13863BarFasCod2 ;
   private boolean[] P08FL71_n13863BarFasCod2 ;
   private String[] P08FL71_A396EmprCod ;
   private short[] P08FL78_A9713Tb1_Cod ;
   private short[] P08FL78_A4466BarAcaAnh ;
   private short[] P08FL78_A13769BarRdto4 ;
   private boolean[] P08FL78_n13769BarRdto4 ;
   private java.util.Date[] P08FL78_A155BarFecCli ;
   private String[] P08FL78_A1234BarNomCli ;
   private String[] P08FL78_A1652BarSerDsc ;
   private short[] P08FL78_A217BarTipArt ;
   private boolean[] P08FL78_n217BarTipArt ;
   private String[] P08FL78_A13696BarNHdr ;
   private String[] P08FL78_A279CliNom ;
   private int[] P08FL78_A136BarColNum ;
   private String[] P08FL78_A135BarColNom ;
   private String[] P08FL78_A212BarSer ;
   private int[] P08FL78_A252CliCod ;
   private boolean[] P08FL78_n252CliCod ;
   private java.util.Date[] P08FL78_A161BarFecSal ;
   private int[] P08FL78_A13862Bar_MacCod ;
   private boolean[] P08FL78_n13862Bar_MacCod ;
   private String[] P08FL78_A13861BarMarca ;
   private boolean[] P08FL78_n13861BarMarca ;
   private String[] P08FL78_A13860BarAccesor ;
   private boolean[] P08FL78_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL78_A166BarKgm ;
   private boolean[] P08FL78_n166BarKgm ;
   private int[] P08FL78_A129BarCod ;
   private byte[] P08FL78_A132BarCodReo ;
   private String[] P08FL78_A130BarCodPar ;
   private int[] P08FL78_A361DisCod ;
   private String[] P08FL78_A13863BarFasCod2 ;
   private boolean[] P08FL78_n13863BarFasCod2 ;
   private String[] P08FL78_A396EmprCod ;
   private short[] P08FL85_A9713Tb1_Cod ;
   private short[] P08FL85_A4466BarAcaAnh ;
   private short[] P08FL85_A13769BarRdto4 ;
   private boolean[] P08FL85_n13769BarRdto4 ;
   private java.util.Date[] P08FL85_A155BarFecCli ;
   private String[] P08FL85_A1234BarNomCli ;
   private String[] P08FL85_A1652BarSerDsc ;
   private short[] P08FL85_A217BarTipArt ;
   private boolean[] P08FL85_n217BarTipArt ;
   private String[] P08FL85_A13696BarNHdr ;
   private String[] P08FL85_A279CliNom ;
   private int[] P08FL85_A136BarColNum ;
   private String[] P08FL85_A135BarColNom ;
   private String[] P08FL85_A212BarSer ;
   private int[] P08FL85_A252CliCod ;
   private boolean[] P08FL85_n252CliCod ;
   private java.util.Date[] P08FL85_A161BarFecSal ;
   private int[] P08FL85_A13862Bar_MacCod ;
   private boolean[] P08FL85_n13862Bar_MacCod ;
   private String[] P08FL85_A13861BarMarca ;
   private boolean[] P08FL85_n13861BarMarca ;
   private String[] P08FL85_A13860BarAccesor ;
   private boolean[] P08FL85_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL85_A166BarKgm ;
   private boolean[] P08FL85_n166BarKgm ;
   private int[] P08FL85_A129BarCod ;
   private byte[] P08FL85_A132BarCodReo ;
   private String[] P08FL85_A130BarCodPar ;
   private int[] P08FL85_A361DisCod ;
   private String[] P08FL85_A13863BarFasCod2 ;
   private boolean[] P08FL85_n13863BarFasCod2 ;
   private String[] P08FL85_A396EmprCod ;
   private short[] P08FL92_A9713Tb1_Cod ;
   private short[] P08FL92_A4466BarAcaAnh ;
   private short[] P08FL92_A13769BarRdto4 ;
   private boolean[] P08FL92_n13769BarRdto4 ;
   private java.util.Date[] P08FL92_A155BarFecCli ;
   private String[] P08FL92_A1234BarNomCli ;
   private String[] P08FL92_A1652BarSerDsc ;
   private short[] P08FL92_A217BarTipArt ;
   private boolean[] P08FL92_n217BarTipArt ;
   private String[] P08FL92_A13696BarNHdr ;
   private String[] P08FL92_A279CliNom ;
   private int[] P08FL92_A136BarColNum ;
   private String[] P08FL92_A135BarColNom ;
   private String[] P08FL92_A212BarSer ;
   private int[] P08FL92_A252CliCod ;
   private boolean[] P08FL92_n252CliCod ;
   private java.util.Date[] P08FL92_A161BarFecSal ;
   private int[] P08FL92_A13862Bar_MacCod ;
   private boolean[] P08FL92_n13862Bar_MacCod ;
   private String[] P08FL92_A13861BarMarca ;
   private boolean[] P08FL92_n13861BarMarca ;
   private String[] P08FL92_A13860BarAccesor ;
   private boolean[] P08FL92_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL92_A166BarKgm ;
   private boolean[] P08FL92_n166BarKgm ;
   private int[] P08FL92_A129BarCod ;
   private byte[] P08FL92_A132BarCodReo ;
   private String[] P08FL92_A130BarCodPar ;
   private int[] P08FL92_A361DisCod ;
   private String[] P08FL92_A13863BarFasCod2 ;
   private boolean[] P08FL92_n13863BarFasCod2 ;
   private String[] P08FL92_A396EmprCod ;
   private short[] P08FL99_A9713Tb1_Cod ;
   private short[] P08FL99_A4466BarAcaAnh ;
   private short[] P08FL99_A13769BarRdto4 ;
   private boolean[] P08FL99_n13769BarRdto4 ;
   private java.util.Date[] P08FL99_A155BarFecCli ;
   private String[] P08FL99_A1234BarNomCli ;
   private String[] P08FL99_A1652BarSerDsc ;
   private short[] P08FL99_A217BarTipArt ;
   private boolean[] P08FL99_n217BarTipArt ;
   private String[] P08FL99_A13696BarNHdr ;
   private String[] P08FL99_A279CliNom ;
   private int[] P08FL99_A136BarColNum ;
   private String[] P08FL99_A135BarColNom ;
   private String[] P08FL99_A212BarSer ;
   private int[] P08FL99_A252CliCod ;
   private boolean[] P08FL99_n252CliCod ;
   private java.util.Date[] P08FL99_A161BarFecSal ;
   private int[] P08FL99_A13862Bar_MacCod ;
   private boolean[] P08FL99_n13862Bar_MacCod ;
   private String[] P08FL99_A13861BarMarca ;
   private boolean[] P08FL99_n13861BarMarca ;
   private String[] P08FL99_A13860BarAccesor ;
   private boolean[] P08FL99_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FL99_A166BarKgm ;
   private boolean[] P08FL99_n166BarKgm ;
   private int[] P08FL99_A129BarCod ;
   private byte[] P08FL99_A132BarCodReo ;
   private String[] P08FL99_A130BarCodPar ;
   private int[] P08FL99_A361DisCod ;
   private String[] P08FL99_A13863BarFasCod2 ;
   private boolean[] P08FL99_n13863BarFasCod2 ;
   private String[] P08FL99_A396EmprCod ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class webwlismergetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FL8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV91Webwlismerds_2_barfecsal ,
                                          java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                          int AV93Webwlismerds_4_clicod ,
                                          int AV94Webwlismerds_5_clicod_to ,
                                          String AV95Webwlismerds_6_barser ,
                                          String AV96Webwlismerds_7_barser_to ,
                                          String AV97Webwlismerds_8_barcolnom ,
                                          String AV98Webwlismerds_9_barcolnom_to ,
                                          int AV99Webwlismerds_10_barcolnum ,
                                          int AV100Webwlismerds_11_barcolnum_to ,
                                          int AV101Webwlismerds_12_tfclicod ,
                                          int AV102Webwlismerds_13_tfclicod_to ,
                                          String AV104Webwlismerds_15_tfclinom_sel ,
                                          String AV103Webwlismerds_14_tfclinom ,
                                          String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                          String AV105Webwlismerds_16_tfbarnhdr ,
                                          short AV107Webwlismerds_18_tfbartipart ,
                                          short AV108Webwlismerds_19_tfbartipart_to ,
                                          String AV110Webwlismerds_21_tfbarser_sel ,
                                          String AV109Webwlismerds_20_tfbarser ,
                                          String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                          String AV111Webwlismerds_22_tfbarserdsc ,
                                          String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                          String AV113Webwlismerds_24_tfbarcolnom ,
                                          String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                          String AV115Webwlismerds_26_tfbarnomcli ,
                                          int AV117Webwlismerds_28_tfbarcolnum ,
                                          int AV118Webwlismerds_29_tfbarcolnum_to ,
                                          java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                          java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                          java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                          java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                          short AV123Webwlismerds_34_tfbarrdto4 ,
                                          short AV124Webwlismerds_35_tfbarrdto4_to ,
                                          java.util.Date A161BarFecSal ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          short A13769BarRdto4 ,
                                          String AV90Webwlismerds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13855BarGots ,
                                          String A13856BarGrs ,
                                          String A13857BarOcs ,
                                          String A13858BarRcs ,
                                          String A13859BarOeko ,
                                          String A13861BarMarca ,
                                          int A13862Bar_MacCod ,
                                          String A13863BarFasCod2 ,
                                          String A13864BarFasDsc2 ,
                                          String AV126Webwlismerds_37_tfbargots_sel ,
                                          String AV125Webwlismerds_36_tfbargots ,
                                          String AV128Webwlismerds_39_tfbargrs_sel ,
                                          String AV127Webwlismerds_38_tfbargrs ,
                                          String AV130Webwlismerds_41_tfbarocs_sel ,
                                          String AV129Webwlismerds_40_tfbarocs ,
                                          String AV132Webwlismerds_43_tfbarrcs_sel ,
                                          String AV131Webwlismerds_42_tfbarrcs ,
                                          String AV134Webwlismerds_45_tfbaroeko_sel ,
                                          String AV133Webwlismerds_44_tfbaroeko ,
                                          String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                          String A13860BarAccesor ,
                                          String AV137Webwlismerds_48_tfbarmarca_sel ,
                                          String AV136Webwlismerds_47_tfbarmarca ,
                                          int AV138Webwlismerds_49_tfbar_maccod ,
                                          int AV139Webwlismerds_50_tfbar_maccod_to ,
                                          String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                          String AV140Webwlismerds_51_tfbarfascod2 ,
                                          String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                          String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[52];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T3.CliNom, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08FL15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[52];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08FL22( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[52];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarSer, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08FL29( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[52];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarSerDsc, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08FL36( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[52];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarColNom, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08FL43( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[52];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarNomCli, T1.BarRdto4, T1.BarFecCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08FL50( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[52];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08FL57( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[52];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int18[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int18[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int18[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int18[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P08FL64( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[52];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08FL71( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[52];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int22[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int22[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int22[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int22[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int22[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int22[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int22[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int22[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int22[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P08FL78( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[52];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int24[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int24[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int24[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int24[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int24[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int24[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int24[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int24[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int24[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int24[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_P08FL85( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[52];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int26[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int26[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int26[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int26[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int26[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int26[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P08FL92( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[52];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int28[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int28[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int28[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int28[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int28[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int28[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int28[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int28[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int28[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int28[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int28[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_P08FL99( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV91Webwlismerds_2_barfecsal ,
                                           java.util.Date AV92Webwlismerds_3_barfecsal_to ,
                                           int AV93Webwlismerds_4_clicod ,
                                           int AV94Webwlismerds_5_clicod_to ,
                                           String AV95Webwlismerds_6_barser ,
                                           String AV96Webwlismerds_7_barser_to ,
                                           String AV97Webwlismerds_8_barcolnom ,
                                           String AV98Webwlismerds_9_barcolnom_to ,
                                           int AV99Webwlismerds_10_barcolnum ,
                                           int AV100Webwlismerds_11_barcolnum_to ,
                                           int AV101Webwlismerds_12_tfclicod ,
                                           int AV102Webwlismerds_13_tfclicod_to ,
                                           String AV104Webwlismerds_15_tfclinom_sel ,
                                           String AV103Webwlismerds_14_tfclinom ,
                                           String AV106Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV105Webwlismerds_16_tfbarnhdr ,
                                           short AV107Webwlismerds_18_tfbartipart ,
                                           short AV108Webwlismerds_19_tfbartipart_to ,
                                           String AV110Webwlismerds_21_tfbarser_sel ,
                                           String AV109Webwlismerds_20_tfbarser ,
                                           String AV112Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV111Webwlismerds_22_tfbarserdsc ,
                                           String AV114Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV113Webwlismerds_24_tfbarcolnom ,
                                           String AV116Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV115Webwlismerds_26_tfbarnomcli ,
                                           int AV117Webwlismerds_28_tfbarcolnum ,
                                           int AV118Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV119Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV120Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV121Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV122Webwlismerds_33_tfbarkgm_to ,
                                           short AV123Webwlismerds_34_tfbarrdto4 ,
                                           short AV124Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           String AV90Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV126Webwlismerds_37_tfbargots_sel ,
                                           String AV125Webwlismerds_36_tfbargots ,
                                           String AV128Webwlismerds_39_tfbargrs_sel ,
                                           String AV127Webwlismerds_38_tfbargrs ,
                                           String AV130Webwlismerds_41_tfbarocs_sel ,
                                           String AV129Webwlismerds_40_tfbarocs ,
                                           String AV132Webwlismerds_43_tfbarrcs_sel ,
                                           String AV131Webwlismerds_42_tfbarrcs ,
                                           String AV134Webwlismerds_45_tfbaroeko_sel ,
                                           String AV133Webwlismerds_44_tfbaroeko ,
                                           String AV135Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV137Webwlismerds_48_tfbarmarca_sel ,
                                           String AV136Webwlismerds_47_tfbarmarca ,
                                           int AV138Webwlismerds_49_tfbar_maccod ,
                                           int AV139Webwlismerds_50_tfbar_maccod_to ,
                                           String AV141Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV140Webwlismerds_51_tfbarfascod2 ,
                                           String AV143Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV142Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[52];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, COALESCE(" ;
      scmdbuf += " T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod) AS Bar_MacCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod = T9.BarCod and" ;
      scmdbuf += " T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh)" ;
      scmdbuf += " LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2," ;
      scmdbuf += " T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod" ;
      scmdbuf += " and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int30[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int30[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV115Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int30[43] = (byte)(1) ;
      }
      if ( ! (0==AV117Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int30[44] = (byte)(1) ;
      }
      if ( ! (0==AV118Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int30[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int30[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int30[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int30[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int30[49] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int30[50] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int30[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_P08FL8(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 1 :
                  return conditional_P08FL15(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 2 :
                  return conditional_P08FL22(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 3 :
                  return conditional_P08FL29(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 4 :
                  return conditional_P08FL36(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 5 :
                  return conditional_P08FL43(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 6 :
                  return conditional_P08FL50(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 7 :
                  return conditional_P08FL57(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 8 :
                  return conditional_P08FL64(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 9 :
                  return conditional_P08FL71(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 10 :
                  return conditional_P08FL78(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 11 :
                  return conditional_P08FL85(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 12 :
                  return conditional_P08FL92(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 13 :
                  return conditional_P08FL99(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).intValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FL8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL29", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL50", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL57", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL64", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL71", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL78", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL85", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FL99", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 11);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 11);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 11);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(19);
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 1);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(24, 3);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 13 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
      }
   }

}

