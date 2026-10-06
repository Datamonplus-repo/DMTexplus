package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devolucionalmacentejidocrudosindetallewwgetfilterdata extends GXProcedure
{
   public devolucionalmacentejidocrudosindetallewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devolucionalmacentejidocrudosindetallewwgetfilterdata.class ), "" );
   }

   public devolucionalmacentejidocrudosindetallewwgetfilterdata( int remoteHandle ,
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
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.aP5 = new String[] {""};
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
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.AV28DDOName = aP0;
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.AV26SearchTxt = aP1;
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.AV27SearchTxtTo = aP2;
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.aP3 = aP3;
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.aP4 = aP4;
      devolucionalmacentejidocrudosindetallewwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_DEVCRUMAT") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUMATOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_DEVCRUATID") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUATIDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_DEVCRUOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUOBSOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_DEVCRUHASH") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUHASHOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_DEVCRUDESC") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUDESCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DevolucionAlmacenTejidoCrudosindetalleWWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV10TFDevCruId = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDevCruId_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV12TFDevCruFec = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV49TFDevCruSal = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV18TFTrnCod = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFTrnCod_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV20TFTrnNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV21TFTrnNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV22TFDevCruMat = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV23TFDevCruMat_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV55TFDevCruAtId = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV56TFDevCruAtId_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV47TFDevCruStt_SelsJson = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV48TFDevCruStt_Sels.fromJSonString(AV47TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV24TFDevCruObs = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV25TFDevCruObs_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH") == 0 )
         {
            AV51TFDevCruHash = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH_SEL") == 0 )
         {
            AV52TFDevCruHash_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC") == 0 )
         {
            AV53TFDevCruDesc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC_SEL") == 0 )
         {
            AV54TFDevCruDesc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV26SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09042 */
      pr_default.execute(0, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9042 = false ;
         A396EmprCod = P09042_A396EmprCod[0] ;
         A279CliNom = P09042_A279CliNom[0] ;
         A11675DevCruDesc = P09042_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09042_A11674DevCruHash[0] ;
         A11682DevCruObs = P09042_A11682DevCruObs[0] ;
         A11678DevCruStt = P09042_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09042_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09042_A11672DevCruMat[0] ;
         A841TrnNom = P09042_A841TrnNom[0] ;
         n841TrnNom = P09042_n841TrnNom[0] ;
         A840TrnCod = P09042_A840TrnCod[0] ;
         n840TrnCod = P09042_n840TrnCod[0] ;
         A252CliCod = P09042_A252CliCod[0] ;
         A11673DevCruSal = P09042_A11673DevCruSal[0] ;
         A11670DevCruFec = P09042_A11670DevCruFec[0] ;
         A11669DevCruId = P09042_A11669DevCruId[0] ;
         A841TrnNom = P09042_A841TrnNom[0] ;
         n841TrnNom = P09042_n841TrnNom[0] ;
         A279CliNom = P09042_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09042_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9042 = false ;
            A396EmprCod = P09042_A396EmprCod[0] ;
            A252CliCod = P09042_A252CliCod[0] ;
            A11669DevCruId = P09042_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9042 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV30Option = A279CliNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9042 )
         {
            brk9042 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFTrnNom = AV26SearchTxt ;
      AV21TFTrnNom_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09043 */
      pr_default.execute(1, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9044 = false ;
         A840TrnCod = P09043_A840TrnCod[0] ;
         n840TrnCod = P09043_n840TrnCod[0] ;
         A396EmprCod = P09043_A396EmprCod[0] ;
         A11675DevCruDesc = P09043_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09043_A11674DevCruHash[0] ;
         A11682DevCruObs = P09043_A11682DevCruObs[0] ;
         A11678DevCruStt = P09043_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09043_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09043_A11672DevCruMat[0] ;
         A841TrnNom = P09043_A841TrnNom[0] ;
         n841TrnNom = P09043_n841TrnNom[0] ;
         A279CliNom = P09043_A279CliNom[0] ;
         A252CliCod = P09043_A252CliCod[0] ;
         A11673DevCruSal = P09043_A11673DevCruSal[0] ;
         A11670DevCruFec = P09043_A11670DevCruFec[0] ;
         A11669DevCruId = P09043_A11669DevCruId[0] ;
         A841TrnNom = P09043_A841TrnNom[0] ;
         n841TrnNom = P09043_n841TrnNom[0] ;
         A279CliNom = P09043_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09043_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09043_A840TrnCod[0] == A840TrnCod ) )
         {
            brk9044 = false ;
            A11669DevCruId = P09043_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9044 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
         {
            AV30Option = A841TrnNom ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            AV31Options.add(AV30Option, AV29InsertIndex);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9044 )
         {
            brk9044 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDEVCRUMATOPTIONS' Routine */
      returnInSub = false ;
      AV22TFDevCruMat = AV26SearchTxt ;
      AV23TFDevCruMat_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09044 */
      pr_default.execute(2, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9046 = false ;
         A396EmprCod = P09044_A396EmprCod[0] ;
         A11672DevCruMat = P09044_A11672DevCruMat[0] ;
         A11675DevCruDesc = P09044_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09044_A11674DevCruHash[0] ;
         A11682DevCruObs = P09044_A11682DevCruObs[0] ;
         A11678DevCruStt = P09044_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09044_A11680DevCruAtId[0] ;
         A841TrnNom = P09044_A841TrnNom[0] ;
         n841TrnNom = P09044_n841TrnNom[0] ;
         A840TrnCod = P09044_A840TrnCod[0] ;
         n840TrnCod = P09044_n840TrnCod[0] ;
         A279CliNom = P09044_A279CliNom[0] ;
         A252CliCod = P09044_A252CliCod[0] ;
         A11673DevCruSal = P09044_A11673DevCruSal[0] ;
         A11670DevCruFec = P09044_A11670DevCruFec[0] ;
         A11669DevCruId = P09044_A11669DevCruId[0] ;
         A841TrnNom = P09044_A841TrnNom[0] ;
         n841TrnNom = P09044_n841TrnNom[0] ;
         A279CliNom = P09044_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09044_A11672DevCruMat[0], A11672DevCruMat) == 0 ) )
         {
            brk9046 = false ;
            A396EmprCod = P09044_A396EmprCod[0] ;
            A11669DevCruId = P09044_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9046 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11672DevCruMat)==0) )
         {
            AV30Option = A11672DevCruMat ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9046 )
         {
            brk9046 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDEVCRUATIDOPTIONS' Routine */
      returnInSub = false ;
      AV55TFDevCruAtId = AV26SearchTxt ;
      AV56TFDevCruAtId_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09045 */
      pr_default.execute(3, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9048 = false ;
         A396EmprCod = P09045_A396EmprCod[0] ;
         A11680DevCruAtId = P09045_A11680DevCruAtId[0] ;
         A11675DevCruDesc = P09045_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09045_A11674DevCruHash[0] ;
         A11682DevCruObs = P09045_A11682DevCruObs[0] ;
         A11678DevCruStt = P09045_A11678DevCruStt[0] ;
         A11672DevCruMat = P09045_A11672DevCruMat[0] ;
         A841TrnNom = P09045_A841TrnNom[0] ;
         n841TrnNom = P09045_n841TrnNom[0] ;
         A840TrnCod = P09045_A840TrnCod[0] ;
         n840TrnCod = P09045_n840TrnCod[0] ;
         A279CliNom = P09045_A279CliNom[0] ;
         A252CliCod = P09045_A252CliCod[0] ;
         A11673DevCruSal = P09045_A11673DevCruSal[0] ;
         A11670DevCruFec = P09045_A11670DevCruFec[0] ;
         A11669DevCruId = P09045_A11669DevCruId[0] ;
         A841TrnNom = P09045_A841TrnNom[0] ;
         n841TrnNom = P09045_n841TrnNom[0] ;
         A279CliNom = P09045_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09045_A11680DevCruAtId[0], A11680DevCruAtId) == 0 ) )
         {
            brk9048 = false ;
            A396EmprCod = P09045_A396EmprCod[0] ;
            A11669DevCruId = P09045_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9048 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A11680DevCruAtId)==0) )
         {
            AV30Option = A11680DevCruAtId ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9048 )
         {
            brk9048 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDEVCRUOBSOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDevCruObs = AV26SearchTxt ;
      AV25TFDevCruObs_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09046 */
      pr_default.execute(4, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk90410 = false ;
         A396EmprCod = P09046_A396EmprCod[0] ;
         A11682DevCruObs = P09046_A11682DevCruObs[0] ;
         A11675DevCruDesc = P09046_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09046_A11674DevCruHash[0] ;
         A11678DevCruStt = P09046_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09046_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09046_A11672DevCruMat[0] ;
         A841TrnNom = P09046_A841TrnNom[0] ;
         n841TrnNom = P09046_n841TrnNom[0] ;
         A840TrnCod = P09046_A840TrnCod[0] ;
         n840TrnCod = P09046_n840TrnCod[0] ;
         A279CliNom = P09046_A279CliNom[0] ;
         A252CliCod = P09046_A252CliCod[0] ;
         A11673DevCruSal = P09046_A11673DevCruSal[0] ;
         A11670DevCruFec = P09046_A11670DevCruFec[0] ;
         A11669DevCruId = P09046_A11669DevCruId[0] ;
         A841TrnNom = P09046_A841TrnNom[0] ;
         n841TrnNom = P09046_n841TrnNom[0] ;
         A279CliNom = P09046_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09046_A11682DevCruObs[0], A11682DevCruObs) == 0 ) )
         {
            brk90410 = false ;
            A396EmprCod = P09046_A396EmprCod[0] ;
            A11669DevCruId = P09046_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90410 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A11682DevCruObs)==0) )
         {
            AV30Option = A11682DevCruObs ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90410 )
         {
            brk90410 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADDEVCRUHASHOPTIONS' Routine */
      returnInSub = false ;
      AV51TFDevCruHash = AV26SearchTxt ;
      AV52TFDevCruHash_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09047 */
      pr_default.execute(5, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk90412 = false ;
         A396EmprCod = P09047_A396EmprCod[0] ;
         A11674DevCruHash = P09047_A11674DevCruHash[0] ;
         A11675DevCruDesc = P09047_A11675DevCruDesc[0] ;
         A11682DevCruObs = P09047_A11682DevCruObs[0] ;
         A11678DevCruStt = P09047_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09047_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09047_A11672DevCruMat[0] ;
         A841TrnNom = P09047_A841TrnNom[0] ;
         n841TrnNom = P09047_n841TrnNom[0] ;
         A840TrnCod = P09047_A840TrnCod[0] ;
         n840TrnCod = P09047_n840TrnCod[0] ;
         A279CliNom = P09047_A279CliNom[0] ;
         A252CliCod = P09047_A252CliCod[0] ;
         A11673DevCruSal = P09047_A11673DevCruSal[0] ;
         A11670DevCruFec = P09047_A11670DevCruFec[0] ;
         A11669DevCruId = P09047_A11669DevCruId[0] ;
         A841TrnNom = P09047_A841TrnNom[0] ;
         n841TrnNom = P09047_n841TrnNom[0] ;
         A279CliNom = P09047_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09047_A11674DevCruHash[0], A11674DevCruHash) == 0 ) )
         {
            brk90412 = false ;
            A396EmprCod = P09047_A396EmprCod[0] ;
            A11669DevCruId = P09047_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90412 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A11674DevCruHash)==0) )
         {
            AV30Option = A11674DevCruHash ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90412 )
         {
            brk90412 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADDEVCRUDESCOPTIONS' Routine */
      returnInSub = false ;
      AV53TFDevCruDesc = AV26SearchTxt ;
      AV54TFDevCruDesc_Sel = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV44FilterFullText ;
      AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV49TFDevCruSal ;
      AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV14TFCliCod ;
      AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV16TFCliNom ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV18TFTrnCod ;
      AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV19TFTrnCod_To ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV20TFTrnNom ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV22TFDevCruMat ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV55TFDevCruAtId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV56TFDevCruAtId_Sel ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV48TFDevCruStt_Sels ;
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV24TFDevCruObs ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV51TFDevCruHash ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV52TFDevCruHash_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV53TFDevCruDesc ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV54TFDevCruDesc_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09048 */
      pr_default.execute(6, new Object[] {lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk90414 = false ;
         A396EmprCod = P09048_A396EmprCod[0] ;
         A11675DevCruDesc = P09048_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09048_A11674DevCruHash[0] ;
         A11682DevCruObs = P09048_A11682DevCruObs[0] ;
         A11678DevCruStt = P09048_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09048_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09048_A11672DevCruMat[0] ;
         A841TrnNom = P09048_A841TrnNom[0] ;
         n841TrnNom = P09048_n841TrnNom[0] ;
         A840TrnCod = P09048_A840TrnCod[0] ;
         n840TrnCod = P09048_n840TrnCod[0] ;
         A279CliNom = P09048_A279CliNom[0] ;
         A252CliCod = P09048_A252CliCod[0] ;
         A11673DevCruSal = P09048_A11673DevCruSal[0] ;
         A11670DevCruFec = P09048_A11670DevCruFec[0] ;
         A11669DevCruId = P09048_A11669DevCruId[0] ;
         A841TrnNom = P09048_A841TrnNom[0] ;
         n841TrnNom = P09048_n841TrnNom[0] ;
         A279CliNom = P09048_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09048_A11675DevCruDesc[0], A11675DevCruDesc) == 0 ) )
         {
            brk90414 = false ;
            A396EmprCod = P09048_A396EmprCod[0] ;
            A11669DevCruId = P09048_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90414 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A11675DevCruDesc)==0) )
         {
            AV30Option = A11675DevCruDesc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90414 )
         {
            brk90414 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = devolucionalmacentejidocrudosindetallewwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = devolucionalmacentejidocrudosindetallewwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = devolucionalmacentejidocrudosindetallewwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV12TFDevCruFec = GXutil.nullDate() ;
      AV49TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV20TFTrnNom = "" ;
      AV21TFTrnNom_Sel = "" ;
      AV22TFDevCruMat = "" ;
      AV23TFDevCruMat_Sel = "" ;
      AV55TFDevCruAtId = "" ;
      AV56TFDevCruAtId_Sel = "" ;
      AV47TFDevCruStt_SelsJson = "" ;
      AV48TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24TFDevCruObs = "" ;
      AV25TFDevCruObs_Sel = "" ;
      AV51TFDevCruHash = "" ;
      AV52TFDevCruHash_Sel = "" ;
      AV53TFDevCruDesc = "" ;
      AV54TFDevCruDesc_Sel = "" ;
      A279CliNom = "" ;
      AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = "" ;
      AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = "" ;
      AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = "" ;
      AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = "" ;
      AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = "" ;
      AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = "" ;
      AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = "" ;
      scmdbuf = "" ;
      lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      A11678DevCruStt = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11680DevCruAtId = "" ;
      A11682DevCruObs = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      P09042_A396EmprCod = new String[] {""} ;
      P09042_A279CliNom = new String[] {""} ;
      P09042_A11675DevCruDesc = new String[] {""} ;
      P09042_A11674DevCruHash = new String[] {""} ;
      P09042_A11682DevCruObs = new String[] {""} ;
      P09042_A11678DevCruStt = new String[] {""} ;
      P09042_A11680DevCruAtId = new String[] {""} ;
      P09042_A11672DevCruMat = new String[] {""} ;
      P09042_A841TrnNom = new String[] {""} ;
      P09042_n841TrnNom = new boolean[] {false} ;
      P09042_A840TrnCod = new short[1] ;
      P09042_n840TrnCod = new boolean[] {false} ;
      P09042_A252CliCod = new int[1] ;
      P09042_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09042_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09042_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      P09043_A840TrnCod = new short[1] ;
      P09043_n840TrnCod = new boolean[] {false} ;
      P09043_A396EmprCod = new String[] {""} ;
      P09043_A11675DevCruDesc = new String[] {""} ;
      P09043_A11674DevCruHash = new String[] {""} ;
      P09043_A11682DevCruObs = new String[] {""} ;
      P09043_A11678DevCruStt = new String[] {""} ;
      P09043_A11680DevCruAtId = new String[] {""} ;
      P09043_A11672DevCruMat = new String[] {""} ;
      P09043_A841TrnNom = new String[] {""} ;
      P09043_n841TrnNom = new boolean[] {false} ;
      P09043_A279CliNom = new String[] {""} ;
      P09043_A252CliCod = new int[1] ;
      P09043_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09043_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09043_A11669DevCruId = new int[1] ;
      P09044_A396EmprCod = new String[] {""} ;
      P09044_A11672DevCruMat = new String[] {""} ;
      P09044_A11675DevCruDesc = new String[] {""} ;
      P09044_A11674DevCruHash = new String[] {""} ;
      P09044_A11682DevCruObs = new String[] {""} ;
      P09044_A11678DevCruStt = new String[] {""} ;
      P09044_A11680DevCruAtId = new String[] {""} ;
      P09044_A841TrnNom = new String[] {""} ;
      P09044_n841TrnNom = new boolean[] {false} ;
      P09044_A840TrnCod = new short[1] ;
      P09044_n840TrnCod = new boolean[] {false} ;
      P09044_A279CliNom = new String[] {""} ;
      P09044_A252CliCod = new int[1] ;
      P09044_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09044_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09044_A11669DevCruId = new int[1] ;
      P09045_A396EmprCod = new String[] {""} ;
      P09045_A11680DevCruAtId = new String[] {""} ;
      P09045_A11675DevCruDesc = new String[] {""} ;
      P09045_A11674DevCruHash = new String[] {""} ;
      P09045_A11682DevCruObs = new String[] {""} ;
      P09045_A11678DevCruStt = new String[] {""} ;
      P09045_A11672DevCruMat = new String[] {""} ;
      P09045_A841TrnNom = new String[] {""} ;
      P09045_n841TrnNom = new boolean[] {false} ;
      P09045_A840TrnCod = new short[1] ;
      P09045_n840TrnCod = new boolean[] {false} ;
      P09045_A279CliNom = new String[] {""} ;
      P09045_A252CliCod = new int[1] ;
      P09045_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09045_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09045_A11669DevCruId = new int[1] ;
      P09046_A396EmprCod = new String[] {""} ;
      P09046_A11682DevCruObs = new String[] {""} ;
      P09046_A11675DevCruDesc = new String[] {""} ;
      P09046_A11674DevCruHash = new String[] {""} ;
      P09046_A11678DevCruStt = new String[] {""} ;
      P09046_A11680DevCruAtId = new String[] {""} ;
      P09046_A11672DevCruMat = new String[] {""} ;
      P09046_A841TrnNom = new String[] {""} ;
      P09046_n841TrnNom = new boolean[] {false} ;
      P09046_A840TrnCod = new short[1] ;
      P09046_n840TrnCod = new boolean[] {false} ;
      P09046_A279CliNom = new String[] {""} ;
      P09046_A252CliCod = new int[1] ;
      P09046_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09046_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09046_A11669DevCruId = new int[1] ;
      P09047_A396EmprCod = new String[] {""} ;
      P09047_A11674DevCruHash = new String[] {""} ;
      P09047_A11675DevCruDesc = new String[] {""} ;
      P09047_A11682DevCruObs = new String[] {""} ;
      P09047_A11678DevCruStt = new String[] {""} ;
      P09047_A11680DevCruAtId = new String[] {""} ;
      P09047_A11672DevCruMat = new String[] {""} ;
      P09047_A841TrnNom = new String[] {""} ;
      P09047_n841TrnNom = new boolean[] {false} ;
      P09047_A840TrnCod = new short[1] ;
      P09047_n840TrnCod = new boolean[] {false} ;
      P09047_A279CliNom = new String[] {""} ;
      P09047_A252CliCod = new int[1] ;
      P09047_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09047_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09047_A11669DevCruId = new int[1] ;
      P09048_A396EmprCod = new String[] {""} ;
      P09048_A11675DevCruDesc = new String[] {""} ;
      P09048_A11674DevCruHash = new String[] {""} ;
      P09048_A11682DevCruObs = new String[] {""} ;
      P09048_A11678DevCruStt = new String[] {""} ;
      P09048_A11680DevCruAtId = new String[] {""} ;
      P09048_A11672DevCruMat = new String[] {""} ;
      P09048_A841TrnNom = new String[] {""} ;
      P09048_n841TrnNom = new boolean[] {false} ;
      P09048_A840TrnCod = new short[1] ;
      P09048_n840TrnCod = new boolean[] {false} ;
      P09048_A279CliNom = new String[] {""} ;
      P09048_A252CliCod = new int[1] ;
      P09048_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09048_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09048_A11669DevCruId = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetallewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09042_A396EmprCod, P09042_A279CliNom, P09042_A11675DevCruDesc, P09042_A11674DevCruHash, P09042_A11682DevCruObs, P09042_A11678DevCruStt, P09042_A11680DevCruAtId, P09042_A11672DevCruMat, P09042_A841TrnNom, P09042_n841TrnNom,
            P09042_A840TrnCod, P09042_n840TrnCod, P09042_A252CliCod, P09042_A11673DevCruSal, P09042_A11670DevCruFec, P09042_A11669DevCruId
            }
            , new Object[] {
            P09043_A840TrnCod, P09043_n840TrnCod, P09043_A396EmprCod, P09043_A11675DevCruDesc, P09043_A11674DevCruHash, P09043_A11682DevCruObs, P09043_A11678DevCruStt, P09043_A11680DevCruAtId, P09043_A11672DevCruMat, P09043_A841TrnNom,
            P09043_n841TrnNom, P09043_A279CliNom, P09043_A252CliCod, P09043_A11673DevCruSal, P09043_A11670DevCruFec, P09043_A11669DevCruId
            }
            , new Object[] {
            P09044_A396EmprCod, P09044_A11672DevCruMat, P09044_A11675DevCruDesc, P09044_A11674DevCruHash, P09044_A11682DevCruObs, P09044_A11678DevCruStt, P09044_A11680DevCruAtId, P09044_A841TrnNom, P09044_n841TrnNom, P09044_A840TrnCod,
            P09044_n840TrnCod, P09044_A279CliNom, P09044_A252CliCod, P09044_A11673DevCruSal, P09044_A11670DevCruFec, P09044_A11669DevCruId
            }
            , new Object[] {
            P09045_A396EmprCod, P09045_A11680DevCruAtId, P09045_A11675DevCruDesc, P09045_A11674DevCruHash, P09045_A11682DevCruObs, P09045_A11678DevCruStt, P09045_A11672DevCruMat, P09045_A841TrnNom, P09045_n841TrnNom, P09045_A840TrnCod,
            P09045_n840TrnCod, P09045_A279CliNom, P09045_A252CliCod, P09045_A11673DevCruSal, P09045_A11670DevCruFec, P09045_A11669DevCruId
            }
            , new Object[] {
            P09046_A396EmprCod, P09046_A11682DevCruObs, P09046_A11675DevCruDesc, P09046_A11674DevCruHash, P09046_A11678DevCruStt, P09046_A11680DevCruAtId, P09046_A11672DevCruMat, P09046_A841TrnNom, P09046_n841TrnNom, P09046_A840TrnCod,
            P09046_n840TrnCod, P09046_A279CliNom, P09046_A252CliCod, P09046_A11673DevCruSal, P09046_A11670DevCruFec, P09046_A11669DevCruId
            }
            , new Object[] {
            P09047_A396EmprCod, P09047_A11674DevCruHash, P09047_A11675DevCruDesc, P09047_A11682DevCruObs, P09047_A11678DevCruStt, P09047_A11680DevCruAtId, P09047_A11672DevCruMat, P09047_A841TrnNom, P09047_n841TrnNom, P09047_A840TrnCod,
            P09047_n840TrnCod, P09047_A279CliNom, P09047_A252CliCod, P09047_A11673DevCruSal, P09047_A11670DevCruFec, P09047_A11669DevCruId
            }
            , new Object[] {
            P09048_A396EmprCod, P09048_A11675DevCruDesc, P09048_A11674DevCruHash, P09048_A11682DevCruObs, P09048_A11678DevCruStt, P09048_A11680DevCruAtId, P09048_A11672DevCruMat, P09048_A841TrnNom, P09048_n841TrnNom, P09048_A840TrnCod,
            P09048_n840TrnCod, P09048_A279CliNom, P09048_A252CliCod, P09048_A11673DevCruSal, P09048_A11670DevCruFec, P09048_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18TFTrnCod ;
   private short AV19TFTrnCod_To ;
   private short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ;
   private short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV10TFDevCruId ;
   private int AV11TFDevCruId_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ;
   private int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ;
   private int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ;
   private int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ;
   private int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV20TFTrnNom ;
   private String AV21TFTrnNom_Sel ;
   private String AV22TFDevCruMat ;
   private String AV23TFDevCruMat_Sel ;
   private String AV55TFDevCruAtId ;
   private String AV56TFDevCruAtId_Sel ;
   private String AV51TFDevCruHash ;
   private String AV52TFDevCruHash_Sel ;
   private String AV53TFDevCruDesc ;
   private String AV54TFDevCruDesc_Sel ;
   private String A279CliNom ;
   private String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ;
   private String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ;
   private String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ;
   private String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ;
   private String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ;
   private String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ;
   private String scmdbuf ;
   private String lV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String lV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String lV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String lV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String lV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String lV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String A11678DevCruStt ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A11680DevCruAtId ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String A396EmprCod ;
   private java.util.Date AV49TFDevCruSal ;
   private java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV12TFDevCruFec ;
   private java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ;
   private java.util.Date A11670DevCruFec ;
   private boolean returnInSub ;
   private boolean brk9042 ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean brk9044 ;
   private boolean brk9046 ;
   private boolean brk9048 ;
   private boolean brk90410 ;
   private boolean brk90412 ;
   private boolean brk90414 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV47TFDevCruStt_SelsJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV24TFDevCruObs ;
   private String AV25TFDevCruObs_Sel ;
   private String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ;
   private String lV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String lV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String A11682DevCruObs ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09042_A396EmprCod ;
   private String[] P09042_A279CliNom ;
   private String[] P09042_A11675DevCruDesc ;
   private String[] P09042_A11674DevCruHash ;
   private String[] P09042_A11682DevCruObs ;
   private String[] P09042_A11678DevCruStt ;
   private String[] P09042_A11680DevCruAtId ;
   private String[] P09042_A11672DevCruMat ;
   private String[] P09042_A841TrnNom ;
   private boolean[] P09042_n841TrnNom ;
   private short[] P09042_A840TrnCod ;
   private boolean[] P09042_n840TrnCod ;
   private int[] P09042_A252CliCod ;
   private java.util.Date[] P09042_A11673DevCruSal ;
   private java.util.Date[] P09042_A11670DevCruFec ;
   private int[] P09042_A11669DevCruId ;
   private short[] P09043_A840TrnCod ;
   private boolean[] P09043_n840TrnCod ;
   private String[] P09043_A396EmprCod ;
   private String[] P09043_A11675DevCruDesc ;
   private String[] P09043_A11674DevCruHash ;
   private String[] P09043_A11682DevCruObs ;
   private String[] P09043_A11678DevCruStt ;
   private String[] P09043_A11680DevCruAtId ;
   private String[] P09043_A11672DevCruMat ;
   private String[] P09043_A841TrnNom ;
   private boolean[] P09043_n841TrnNom ;
   private String[] P09043_A279CliNom ;
   private int[] P09043_A252CliCod ;
   private java.util.Date[] P09043_A11673DevCruSal ;
   private java.util.Date[] P09043_A11670DevCruFec ;
   private int[] P09043_A11669DevCruId ;
   private String[] P09044_A396EmprCod ;
   private String[] P09044_A11672DevCruMat ;
   private String[] P09044_A11675DevCruDesc ;
   private String[] P09044_A11674DevCruHash ;
   private String[] P09044_A11682DevCruObs ;
   private String[] P09044_A11678DevCruStt ;
   private String[] P09044_A11680DevCruAtId ;
   private String[] P09044_A841TrnNom ;
   private boolean[] P09044_n841TrnNom ;
   private short[] P09044_A840TrnCod ;
   private boolean[] P09044_n840TrnCod ;
   private String[] P09044_A279CliNom ;
   private int[] P09044_A252CliCod ;
   private java.util.Date[] P09044_A11673DevCruSal ;
   private java.util.Date[] P09044_A11670DevCruFec ;
   private int[] P09044_A11669DevCruId ;
   private String[] P09045_A396EmprCod ;
   private String[] P09045_A11680DevCruAtId ;
   private String[] P09045_A11675DevCruDesc ;
   private String[] P09045_A11674DevCruHash ;
   private String[] P09045_A11682DevCruObs ;
   private String[] P09045_A11678DevCruStt ;
   private String[] P09045_A11672DevCruMat ;
   private String[] P09045_A841TrnNom ;
   private boolean[] P09045_n841TrnNom ;
   private short[] P09045_A840TrnCod ;
   private boolean[] P09045_n840TrnCod ;
   private String[] P09045_A279CliNom ;
   private int[] P09045_A252CliCod ;
   private java.util.Date[] P09045_A11673DevCruSal ;
   private java.util.Date[] P09045_A11670DevCruFec ;
   private int[] P09045_A11669DevCruId ;
   private String[] P09046_A396EmprCod ;
   private String[] P09046_A11682DevCruObs ;
   private String[] P09046_A11675DevCruDesc ;
   private String[] P09046_A11674DevCruHash ;
   private String[] P09046_A11678DevCruStt ;
   private String[] P09046_A11680DevCruAtId ;
   private String[] P09046_A11672DevCruMat ;
   private String[] P09046_A841TrnNom ;
   private boolean[] P09046_n841TrnNom ;
   private short[] P09046_A840TrnCod ;
   private boolean[] P09046_n840TrnCod ;
   private String[] P09046_A279CliNom ;
   private int[] P09046_A252CliCod ;
   private java.util.Date[] P09046_A11673DevCruSal ;
   private java.util.Date[] P09046_A11670DevCruFec ;
   private int[] P09046_A11669DevCruId ;
   private String[] P09047_A396EmprCod ;
   private String[] P09047_A11674DevCruHash ;
   private String[] P09047_A11675DevCruDesc ;
   private String[] P09047_A11682DevCruObs ;
   private String[] P09047_A11678DevCruStt ;
   private String[] P09047_A11680DevCruAtId ;
   private String[] P09047_A11672DevCruMat ;
   private String[] P09047_A841TrnNom ;
   private boolean[] P09047_n841TrnNom ;
   private short[] P09047_A840TrnCod ;
   private boolean[] P09047_n840TrnCod ;
   private String[] P09047_A279CliNom ;
   private int[] P09047_A252CliCod ;
   private java.util.Date[] P09047_A11673DevCruSal ;
   private java.util.Date[] P09047_A11670DevCruFec ;
   private int[] P09047_A11669DevCruId ;
   private String[] P09048_A396EmprCod ;
   private String[] P09048_A11675DevCruDesc ;
   private String[] P09048_A11674DevCruHash ;
   private String[] P09048_A11682DevCruObs ;
   private String[] P09048_A11678DevCruStt ;
   private String[] P09048_A11680DevCruAtId ;
   private String[] P09048_A11672DevCruMat ;
   private String[] P09048_A841TrnNom ;
   private boolean[] P09048_n841TrnNom ;
   private short[] P09048_A840TrnCod ;
   private boolean[] P09048_n840TrnCod ;
   private String[] P09048_A279CliNom ;
   private int[] P09048_A252CliCod ;
   private java.util.Date[] P09048_A11673DevCruSal ;
   private java.util.Date[] P09048_A11670DevCruFec ;
   private int[] P09048_A11669DevCruId ;
   private GXSimpleCollection<String> AV48TFDevCruStt_Sels ;
   private GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class devolucionalmacentejidocrudosindetallewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09042( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
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

   protected Object[] conditional_P09043( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[33];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
         GXv_int5[1] = (byte)(1) ;
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09044( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruMat, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruMat" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09045( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[33];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruAtId, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
         GXv_int11[1] = (byte)(1) ;
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruAtId" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09046( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruObs, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruObs" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09047( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[33];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruHash, T1.DevCruDesc, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruHash" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09048( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[33];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV62Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruDesc" ;
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
                  return conditional_P09042(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
            case 1 :
                  return conditional_P09043(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
            case 2 :
                  return conditional_P09044(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
            case 3 :
                  return conditional_P09045(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
            case 4 :
                  return conditional_P09046(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
            case 5 :
                  return conditional_P09047(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
            case 6 :
                  return conditional_P09048(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09042", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09043", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09044", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09045", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09046", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09047", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09048", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 300);
               ((String[]) buf[4])[0] = rslt.getString(4, 200);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 200);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 300);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
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
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
               }
               return;
      }
   }

}

