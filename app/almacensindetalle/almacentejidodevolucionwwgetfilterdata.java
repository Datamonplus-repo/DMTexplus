package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidodevolucionwwgetfilterdata extends GXProcedure
{
   public almacentejidodevolucionwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidodevolucionwwgetfilterdata.class ), "" );
   }

   public almacentejidodevolucionwwgetfilterdata( int remoteHandle ,
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
      almacentejidodevolucionwwgetfilterdata.this.aP5 = new String[] {""};
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
      almacentejidodevolucionwwgetfilterdata.this.AV38DDOName = aP0;
      almacentejidodevolucionwwgetfilterdata.this.AV36SearchTxt = aP1;
      almacentejidodevolucionwwgetfilterdata.this.AV37SearchTxtTo = aP2;
      almacentejidodevolucionwwgetfilterdata.this.aP3 = aP3;
      almacentejidodevolucionwwgetfilterdata.this.aP4 = aP4;
      almacentejidodevolucionwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_TRNNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DEVCRUMAT") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DEVCRUATID") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DEVCRUHASH") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUHASHOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DEVCRUDESC") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUDESCOPTIONS' */
         S171 ();
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
      if ( GXutil.strcmp(AV49Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV10TFDevCruId = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDevCruId_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV12TFDevCruFec = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV14TFDevCruSal = localUtil.ctot( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV20TFTrnCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTrnCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV22TFTrnNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV23TFTrnNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV24TFDevCruMat = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV25TFDevCruMat_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV26TFDevCruAtId = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV27TFDevCruAtId_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV28TFDevCruStt_SelsJson = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV29TFDevCruStt_Sels.fromJSonString(AV28TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH") == 0 )
         {
            AV32TFDevCruHash = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH_SEL") == 0 )
         {
            AV33TFDevCruHash_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC") == 0 )
         {
            AV34TFDevCruDesc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC_SEL") == 0 )
         {
            AV35TFDevCruDesc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV36SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV54FilterFullText ;
      AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV14TFDevCruSal ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV16TFCliCod ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV17TFCliCod_To ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV18TFCliNom ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV19TFCliNom_Sel ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV20TFTrnCod ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV21TFTrnCod_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV22TFTrnNom ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV23TFTrnNom_Sel ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV24TFDevCruMat ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV25TFDevCruMat_Sel ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV26TFDevCruAtId ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV27TFDevCruAtId_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV29TFDevCruStt_Sels ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV32TFDevCruHash ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV33TFDevCruHash_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV34TFDevCruDesc ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV35TFDevCruDesc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JB2 */
      pr_default.execute(0, new Object[] {lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9JB2 = false ;
         A396EmprCod = P09JB2_A396EmprCod[0] ;
         A279CliNom = P09JB2_A279CliNom[0] ;
         A11675DevCruDesc = P09JB2_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JB2_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JB2_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JB2_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09JB2_A11672DevCruMat[0] ;
         A841TrnNom = P09JB2_A841TrnNom[0] ;
         n841TrnNom = P09JB2_n841TrnNom[0] ;
         A840TrnCod = P09JB2_A840TrnCod[0] ;
         n840TrnCod = P09JB2_n840TrnCod[0] ;
         A252CliCod = P09JB2_A252CliCod[0] ;
         A11673DevCruSal = P09JB2_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JB2_A11670DevCruFec[0] ;
         A11669DevCruId = P09JB2_A11669DevCruId[0] ;
         A841TrnNom = P09JB2_A841TrnNom[0] ;
         n841TrnNom = P09JB2_n841TrnNom[0] ;
         A279CliNom = P09JB2_A279CliNom[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09JB2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9JB2 = false ;
            A396EmprCod = P09JB2_A396EmprCod[0] ;
            A252CliCod = P09JB2_A252CliCod[0] ;
            A11669DevCruId = P09JB2_A11669DevCruId[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9JB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV40Option = A279CliNom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JB2 )
         {
            brk9JB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFTrnNom = AV36SearchTxt ;
      AV23TFTrnNom_Sel = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV54FilterFullText ;
      AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV14TFDevCruSal ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV16TFCliCod ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV17TFCliCod_To ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV18TFCliNom ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV19TFCliNom_Sel ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV20TFTrnCod ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV21TFTrnCod_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV22TFTrnNom ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV23TFTrnNom_Sel ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV24TFDevCruMat ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV25TFDevCruMat_Sel ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV26TFDevCruAtId ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV27TFDevCruAtId_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV29TFDevCruStt_Sels ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV32TFDevCruHash ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV33TFDevCruHash_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV34TFDevCruDesc ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV35TFDevCruDesc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JB3 */
      pr_default.execute(1, new Object[] {lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9JB4 = false ;
         A840TrnCod = P09JB3_A840TrnCod[0] ;
         n840TrnCod = P09JB3_n840TrnCod[0] ;
         A396EmprCod = P09JB3_A396EmprCod[0] ;
         A11675DevCruDesc = P09JB3_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JB3_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JB3_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JB3_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09JB3_A11672DevCruMat[0] ;
         A841TrnNom = P09JB3_A841TrnNom[0] ;
         n841TrnNom = P09JB3_n841TrnNom[0] ;
         A279CliNom = P09JB3_A279CliNom[0] ;
         A252CliCod = P09JB3_A252CliCod[0] ;
         A11673DevCruSal = P09JB3_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JB3_A11670DevCruFec[0] ;
         A11669DevCruId = P09JB3_A11669DevCruId[0] ;
         A841TrnNom = P09JB3_A841TrnNom[0] ;
         n841TrnNom = P09JB3_n841TrnNom[0] ;
         A279CliNom = P09JB3_A279CliNom[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09JB3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09JB3_A840TrnCod[0] == A840TrnCod ) )
         {
            brk9JB4 = false ;
            A11669DevCruId = P09JB3_A11669DevCruId[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9JB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
         {
            AV40Option = A841TrnNom ;
            AV39InsertIndex = 1 ;
            while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) < 0 ) )
            {
               AV39InsertIndex = (int)(AV39InsertIndex+1) ;
            }
            AV41Options.add(AV40Option, AV39InsertIndex);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JB4 )
         {
            brk9JB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDEVCRUMATOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDevCruMat = AV36SearchTxt ;
      AV25TFDevCruMat_Sel = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV54FilterFullText ;
      AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV14TFDevCruSal ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV16TFCliCod ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV17TFCliCod_To ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV18TFCliNom ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV19TFCliNom_Sel ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV20TFTrnCod ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV21TFTrnCod_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV22TFTrnNom ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV23TFTrnNom_Sel ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV24TFDevCruMat ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV25TFDevCruMat_Sel ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV26TFDevCruAtId ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV27TFDevCruAtId_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV29TFDevCruStt_Sels ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV32TFDevCruHash ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV33TFDevCruHash_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV34TFDevCruDesc ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV35TFDevCruDesc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JB4 */
      pr_default.execute(2, new Object[] {lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9JB6 = false ;
         A396EmprCod = P09JB4_A396EmprCod[0] ;
         A11672DevCruMat = P09JB4_A11672DevCruMat[0] ;
         A11675DevCruDesc = P09JB4_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JB4_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JB4_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JB4_A11680DevCruAtId[0] ;
         A841TrnNom = P09JB4_A841TrnNom[0] ;
         n841TrnNom = P09JB4_n841TrnNom[0] ;
         A840TrnCod = P09JB4_A840TrnCod[0] ;
         n840TrnCod = P09JB4_n840TrnCod[0] ;
         A279CliNom = P09JB4_A279CliNom[0] ;
         A252CliCod = P09JB4_A252CliCod[0] ;
         A11673DevCruSal = P09JB4_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JB4_A11670DevCruFec[0] ;
         A11669DevCruId = P09JB4_A11669DevCruId[0] ;
         A841TrnNom = P09JB4_A841TrnNom[0] ;
         n841TrnNom = P09JB4_n841TrnNom[0] ;
         A279CliNom = P09JB4_A279CliNom[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09JB4_A11672DevCruMat[0], A11672DevCruMat) == 0 ) )
         {
            brk9JB6 = false ;
            A396EmprCod = P09JB4_A396EmprCod[0] ;
            A11669DevCruId = P09JB4_A11669DevCruId[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9JB6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11672DevCruMat)==0) )
         {
            AV40Option = A11672DevCruMat ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JB6 )
         {
            brk9JB6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDEVCRUATIDOPTIONS' Routine */
      returnInSub = false ;
      AV26TFDevCruAtId = AV36SearchTxt ;
      AV27TFDevCruAtId_Sel = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV54FilterFullText ;
      AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV14TFDevCruSal ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV16TFCliCod ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV17TFCliCod_To ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV18TFCliNom ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV19TFCliNom_Sel ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV20TFTrnCod ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV21TFTrnCod_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV22TFTrnNom ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV23TFTrnNom_Sel ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV24TFDevCruMat ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV25TFDevCruMat_Sel ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV26TFDevCruAtId ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV27TFDevCruAtId_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV29TFDevCruStt_Sels ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV32TFDevCruHash ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV33TFDevCruHash_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV34TFDevCruDesc ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV35TFDevCruDesc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JB5 */
      pr_default.execute(3, new Object[] {lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9JB8 = false ;
         A396EmprCod = P09JB5_A396EmprCod[0] ;
         A11680DevCruAtId = P09JB5_A11680DevCruAtId[0] ;
         A11675DevCruDesc = P09JB5_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JB5_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JB5_A11678DevCruStt[0] ;
         A11672DevCruMat = P09JB5_A11672DevCruMat[0] ;
         A841TrnNom = P09JB5_A841TrnNom[0] ;
         n841TrnNom = P09JB5_n841TrnNom[0] ;
         A840TrnCod = P09JB5_A840TrnCod[0] ;
         n840TrnCod = P09JB5_n840TrnCod[0] ;
         A279CliNom = P09JB5_A279CliNom[0] ;
         A252CliCod = P09JB5_A252CliCod[0] ;
         A11673DevCruSal = P09JB5_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JB5_A11670DevCruFec[0] ;
         A11669DevCruId = P09JB5_A11669DevCruId[0] ;
         A841TrnNom = P09JB5_A841TrnNom[0] ;
         n841TrnNom = P09JB5_n841TrnNom[0] ;
         A279CliNom = P09JB5_A279CliNom[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09JB5_A11680DevCruAtId[0], A11680DevCruAtId) == 0 ) )
         {
            brk9JB8 = false ;
            A396EmprCod = P09JB5_A396EmprCod[0] ;
            A11669DevCruId = P09JB5_A11669DevCruId[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9JB8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A11680DevCruAtId)==0) )
         {
            AV40Option = A11680DevCruAtId ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JB8 )
         {
            brk9JB8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDEVCRUHASHOPTIONS' Routine */
      returnInSub = false ;
      AV32TFDevCruHash = AV36SearchTxt ;
      AV33TFDevCruHash_Sel = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV54FilterFullText ;
      AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV14TFDevCruSal ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV16TFCliCod ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV17TFCliCod_To ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV18TFCliNom ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV19TFCliNom_Sel ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV20TFTrnCod ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV21TFTrnCod_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV22TFTrnNom ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV23TFTrnNom_Sel ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV24TFDevCruMat ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV25TFDevCruMat_Sel ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV26TFDevCruAtId ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV27TFDevCruAtId_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV29TFDevCruStt_Sels ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV32TFDevCruHash ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV33TFDevCruHash_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV34TFDevCruDesc ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV35TFDevCruDesc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JB6 */
      pr_default.execute(4, new Object[] {lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9JB10 = false ;
         A396EmprCod = P09JB6_A396EmprCod[0] ;
         A11674DevCruHash = P09JB6_A11674DevCruHash[0] ;
         A11675DevCruDesc = P09JB6_A11675DevCruDesc[0] ;
         A11678DevCruStt = P09JB6_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JB6_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09JB6_A11672DevCruMat[0] ;
         A841TrnNom = P09JB6_A841TrnNom[0] ;
         n841TrnNom = P09JB6_n841TrnNom[0] ;
         A840TrnCod = P09JB6_A840TrnCod[0] ;
         n840TrnCod = P09JB6_n840TrnCod[0] ;
         A279CliNom = P09JB6_A279CliNom[0] ;
         A252CliCod = P09JB6_A252CliCod[0] ;
         A11673DevCruSal = P09JB6_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JB6_A11670DevCruFec[0] ;
         A11669DevCruId = P09JB6_A11669DevCruId[0] ;
         A841TrnNom = P09JB6_A841TrnNom[0] ;
         n841TrnNom = P09JB6_n841TrnNom[0] ;
         A279CliNom = P09JB6_A279CliNom[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09JB6_A11674DevCruHash[0], A11674DevCruHash) == 0 ) )
         {
            brk9JB10 = false ;
            A396EmprCod = P09JB6_A396EmprCod[0] ;
            A11669DevCruId = P09JB6_A11669DevCruId[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9JB10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A11674DevCruHash)==0) )
         {
            AV40Option = A11674DevCruHash ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JB10 )
         {
            brk9JB10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADDEVCRUDESCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFDevCruDesc = AV36SearchTxt ;
      AV35TFDevCruDesc_Sel = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV54FilterFullText ;
      AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV14TFDevCruSal ;
      AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV16TFCliCod ;
      AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV17TFCliCod_To ;
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV18TFCliNom ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV19TFCliNom_Sel ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV20TFTrnCod ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV21TFTrnCod_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV22TFTrnNom ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV23TFTrnNom_Sel ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV24TFDevCruMat ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV25TFDevCruMat_Sel ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV26TFDevCruAtId ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV27TFDevCruAtId_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV29TFDevCruStt_Sels ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV32TFDevCruHash ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV33TFDevCruHash_Sel ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV34TFDevCruDesc ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV35TFDevCruDesc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JB7 */
      pr_default.execute(5, new Object[] {lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9JB12 = false ;
         A396EmprCod = P09JB7_A396EmprCod[0] ;
         A11675DevCruDesc = P09JB7_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JB7_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JB7_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JB7_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09JB7_A11672DevCruMat[0] ;
         A841TrnNom = P09JB7_A841TrnNom[0] ;
         n841TrnNom = P09JB7_n841TrnNom[0] ;
         A840TrnCod = P09JB7_A840TrnCod[0] ;
         n840TrnCod = P09JB7_n840TrnCod[0] ;
         A279CliNom = P09JB7_A279CliNom[0] ;
         A252CliCod = P09JB7_A252CliCod[0] ;
         A11673DevCruSal = P09JB7_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JB7_A11670DevCruFec[0] ;
         A11669DevCruId = P09JB7_A11669DevCruId[0] ;
         A841TrnNom = P09JB7_A841TrnNom[0] ;
         n841TrnNom = P09JB7_n841TrnNom[0] ;
         A279CliNom = P09JB7_A279CliNom[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09JB7_A11675DevCruDesc[0], A11675DevCruDesc) == 0 ) )
         {
            brk9JB12 = false ;
            A396EmprCod = P09JB7_A396EmprCod[0] ;
            A11669DevCruId = P09JB7_A11669DevCruId[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9JB12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A11675DevCruDesc)==0) )
         {
            AV40Option = A11675DevCruDesc ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JB12 )
         {
            brk9JB12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = almacentejidodevolucionwwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = almacentejidodevolucionwwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = almacentejidodevolucionwwgetfilterdata.this.AV47OptionIndexesJson;
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
      AV12TFDevCruFec = GXutil.nullDate() ;
      AV14TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV22TFTrnNom = "" ;
      AV23TFTrnNom_Sel = "" ;
      AV24TFDevCruMat = "" ;
      AV25TFDevCruMat_Sel = "" ;
      AV26TFDevCruAtId = "" ;
      AV27TFDevCruAtId_Sel = "" ;
      AV28TFDevCruStt_SelsJson = "" ;
      AV29TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32TFDevCruHash = "" ;
      AV33TFDevCruHash_Sel = "" ;
      AV34TFDevCruDesc = "" ;
      AV35TFDevCruDesc_Sel = "" ;
      A279CliNom = "" ;
      AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = "" ;
      AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = "" ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = "" ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = "" ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = "" ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = "" ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = "" ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = "" ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = "" ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = "" ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = "" ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = "" ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = "" ;
      scmdbuf = "" ;
      lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = "" ;
      lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = "" ;
      lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = "" ;
      lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = "" ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = "" ;
      lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = "" ;
      lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = "" ;
      A11678DevCruStt = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11680DevCruAtId = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      P09JB2_A396EmprCod = new String[] {""} ;
      P09JB2_A279CliNom = new String[] {""} ;
      P09JB2_A11675DevCruDesc = new String[] {""} ;
      P09JB2_A11674DevCruHash = new String[] {""} ;
      P09JB2_A11678DevCruStt = new String[] {""} ;
      P09JB2_A11680DevCruAtId = new String[] {""} ;
      P09JB2_A11672DevCruMat = new String[] {""} ;
      P09JB2_A841TrnNom = new String[] {""} ;
      P09JB2_n841TrnNom = new boolean[] {false} ;
      P09JB2_A840TrnCod = new short[1] ;
      P09JB2_n840TrnCod = new boolean[] {false} ;
      P09JB2_A252CliCod = new int[1] ;
      P09JB2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB2_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      P09JB3_A840TrnCod = new short[1] ;
      P09JB3_n840TrnCod = new boolean[] {false} ;
      P09JB3_A396EmprCod = new String[] {""} ;
      P09JB3_A11675DevCruDesc = new String[] {""} ;
      P09JB3_A11674DevCruHash = new String[] {""} ;
      P09JB3_A11678DevCruStt = new String[] {""} ;
      P09JB3_A11680DevCruAtId = new String[] {""} ;
      P09JB3_A11672DevCruMat = new String[] {""} ;
      P09JB3_A841TrnNom = new String[] {""} ;
      P09JB3_n841TrnNom = new boolean[] {false} ;
      P09JB3_A279CliNom = new String[] {""} ;
      P09JB3_A252CliCod = new int[1] ;
      P09JB3_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB3_A11669DevCruId = new int[1] ;
      P09JB4_A396EmprCod = new String[] {""} ;
      P09JB4_A11672DevCruMat = new String[] {""} ;
      P09JB4_A11675DevCruDesc = new String[] {""} ;
      P09JB4_A11674DevCruHash = new String[] {""} ;
      P09JB4_A11678DevCruStt = new String[] {""} ;
      P09JB4_A11680DevCruAtId = new String[] {""} ;
      P09JB4_A841TrnNom = new String[] {""} ;
      P09JB4_n841TrnNom = new boolean[] {false} ;
      P09JB4_A840TrnCod = new short[1] ;
      P09JB4_n840TrnCod = new boolean[] {false} ;
      P09JB4_A279CliNom = new String[] {""} ;
      P09JB4_A252CliCod = new int[1] ;
      P09JB4_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB4_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB4_A11669DevCruId = new int[1] ;
      P09JB5_A396EmprCod = new String[] {""} ;
      P09JB5_A11680DevCruAtId = new String[] {""} ;
      P09JB5_A11675DevCruDesc = new String[] {""} ;
      P09JB5_A11674DevCruHash = new String[] {""} ;
      P09JB5_A11678DevCruStt = new String[] {""} ;
      P09JB5_A11672DevCruMat = new String[] {""} ;
      P09JB5_A841TrnNom = new String[] {""} ;
      P09JB5_n841TrnNom = new boolean[] {false} ;
      P09JB5_A840TrnCod = new short[1] ;
      P09JB5_n840TrnCod = new boolean[] {false} ;
      P09JB5_A279CliNom = new String[] {""} ;
      P09JB5_A252CliCod = new int[1] ;
      P09JB5_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB5_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB5_A11669DevCruId = new int[1] ;
      P09JB6_A396EmprCod = new String[] {""} ;
      P09JB6_A11674DevCruHash = new String[] {""} ;
      P09JB6_A11675DevCruDesc = new String[] {""} ;
      P09JB6_A11678DevCruStt = new String[] {""} ;
      P09JB6_A11680DevCruAtId = new String[] {""} ;
      P09JB6_A11672DevCruMat = new String[] {""} ;
      P09JB6_A841TrnNom = new String[] {""} ;
      P09JB6_n841TrnNom = new boolean[] {false} ;
      P09JB6_A840TrnCod = new short[1] ;
      P09JB6_n840TrnCod = new boolean[] {false} ;
      P09JB6_A279CliNom = new String[] {""} ;
      P09JB6_A252CliCod = new int[1] ;
      P09JB6_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB6_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB6_A11669DevCruId = new int[1] ;
      P09JB7_A396EmprCod = new String[] {""} ;
      P09JB7_A11675DevCruDesc = new String[] {""} ;
      P09JB7_A11674DevCruHash = new String[] {""} ;
      P09JB7_A11678DevCruStt = new String[] {""} ;
      P09JB7_A11680DevCruAtId = new String[] {""} ;
      P09JB7_A11672DevCruMat = new String[] {""} ;
      P09JB7_A841TrnNom = new String[] {""} ;
      P09JB7_n841TrnNom = new boolean[] {false} ;
      P09JB7_A840TrnCod = new short[1] ;
      P09JB7_n840TrnCod = new boolean[] {false} ;
      P09JB7_A279CliNom = new String[] {""} ;
      P09JB7_A252CliCod = new int[1] ;
      P09JB7_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB7_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JB7_A11669DevCruId = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucionwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09JB2_A396EmprCod, P09JB2_A279CliNom, P09JB2_A11675DevCruDesc, P09JB2_A11674DevCruHash, P09JB2_A11678DevCruStt, P09JB2_A11680DevCruAtId, P09JB2_A11672DevCruMat, P09JB2_A841TrnNom, P09JB2_n841TrnNom, P09JB2_A840TrnCod,
            P09JB2_n840TrnCod, P09JB2_A252CliCod, P09JB2_A11673DevCruSal, P09JB2_A11670DevCruFec, P09JB2_A11669DevCruId
            }
            , new Object[] {
            P09JB3_A840TrnCod, P09JB3_n840TrnCod, P09JB3_A396EmprCod, P09JB3_A11675DevCruDesc, P09JB3_A11674DevCruHash, P09JB3_A11678DevCruStt, P09JB3_A11680DevCruAtId, P09JB3_A11672DevCruMat, P09JB3_A841TrnNom, P09JB3_n841TrnNom,
            P09JB3_A279CliNom, P09JB3_A252CliCod, P09JB3_A11673DevCruSal, P09JB3_A11670DevCruFec, P09JB3_A11669DevCruId
            }
            , new Object[] {
            P09JB4_A396EmprCod, P09JB4_A11672DevCruMat, P09JB4_A11675DevCruDesc, P09JB4_A11674DevCruHash, P09JB4_A11678DevCruStt, P09JB4_A11680DevCruAtId, P09JB4_A841TrnNom, P09JB4_n841TrnNom, P09JB4_A840TrnCod, P09JB4_n840TrnCod,
            P09JB4_A279CliNom, P09JB4_A252CliCod, P09JB4_A11673DevCruSal, P09JB4_A11670DevCruFec, P09JB4_A11669DevCruId
            }
            , new Object[] {
            P09JB5_A396EmprCod, P09JB5_A11680DevCruAtId, P09JB5_A11675DevCruDesc, P09JB5_A11674DevCruHash, P09JB5_A11678DevCruStt, P09JB5_A11672DevCruMat, P09JB5_A841TrnNom, P09JB5_n841TrnNom, P09JB5_A840TrnCod, P09JB5_n840TrnCod,
            P09JB5_A279CliNom, P09JB5_A252CliCod, P09JB5_A11673DevCruSal, P09JB5_A11670DevCruFec, P09JB5_A11669DevCruId
            }
            , new Object[] {
            P09JB6_A396EmprCod, P09JB6_A11674DevCruHash, P09JB6_A11675DevCruDesc, P09JB6_A11678DevCruStt, P09JB6_A11680DevCruAtId, P09JB6_A11672DevCruMat, P09JB6_A841TrnNom, P09JB6_n841TrnNom, P09JB6_A840TrnCod, P09JB6_n840TrnCod,
            P09JB6_A279CliNom, P09JB6_A252CliCod, P09JB6_A11673DevCruSal, P09JB6_A11670DevCruFec, P09JB6_A11669DevCruId
            }
            , new Object[] {
            P09JB7_A396EmprCod, P09JB7_A11675DevCruDesc, P09JB7_A11674DevCruHash, P09JB7_A11678DevCruStt, P09JB7_A11680DevCruAtId, P09JB7_A11672DevCruMat, P09JB7_A841TrnNom, P09JB7_n841TrnNom, P09JB7_A840TrnCod, P09JB7_n840TrnCod,
            P09JB7_A279CliNom, P09JB7_A252CliCod, P09JB7_A11673DevCruSal, P09JB7_A11670DevCruFec, P09JB7_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20TFTrnCod ;
   private short AV21TFTrnCod_To ;
   private short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ;
   private short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV10TFDevCruId ;
   private int AV11TFDevCruId_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ;
   private int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ;
   private int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ;
   private int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ;
   private int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV22TFTrnNom ;
   private String AV23TFTrnNom_Sel ;
   private String AV24TFDevCruMat ;
   private String AV25TFDevCruMat_Sel ;
   private String AV26TFDevCruAtId ;
   private String AV27TFDevCruAtId_Sel ;
   private String AV32TFDevCruHash ;
   private String AV33TFDevCruHash_Sel ;
   private String AV34TFDevCruDesc ;
   private String AV35TFDevCruDesc_Sel ;
   private String A279CliNom ;
   private String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ;
   private String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ;
   private String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ;
   private String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ;
   private String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ;
   private String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ;
   private String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ;
   private String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ;
   private String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ;
   private String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ;
   private String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ;
   private String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ;
   private String scmdbuf ;
   private String lV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ;
   private String lV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ;
   private String lV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ;
   private String lV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ;
   private String lV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ;
   private String lV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ;
   private String A11678DevCruStt ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A11680DevCruAtId ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String A396EmprCod ;
   private java.util.Date AV14TFDevCruSal ;
   private java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV12TFDevCruFec ;
   private java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ;
   private java.util.Date A11670DevCruFec ;
   private boolean returnInSub ;
   private boolean brk9JB2 ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean brk9JB4 ;
   private boolean brk9JB6 ;
   private boolean brk9JB8 ;
   private boolean brk9JB10 ;
   private boolean brk9JB12 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV28TFDevCruStt_SelsJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ;
   private String lV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ;
   private String AV40Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09JB2_A396EmprCod ;
   private String[] P09JB2_A279CliNom ;
   private String[] P09JB2_A11675DevCruDesc ;
   private String[] P09JB2_A11674DevCruHash ;
   private String[] P09JB2_A11678DevCruStt ;
   private String[] P09JB2_A11680DevCruAtId ;
   private String[] P09JB2_A11672DevCruMat ;
   private String[] P09JB2_A841TrnNom ;
   private boolean[] P09JB2_n841TrnNom ;
   private short[] P09JB2_A840TrnCod ;
   private boolean[] P09JB2_n840TrnCod ;
   private int[] P09JB2_A252CliCod ;
   private java.util.Date[] P09JB2_A11673DevCruSal ;
   private java.util.Date[] P09JB2_A11670DevCruFec ;
   private int[] P09JB2_A11669DevCruId ;
   private short[] P09JB3_A840TrnCod ;
   private boolean[] P09JB3_n840TrnCod ;
   private String[] P09JB3_A396EmprCod ;
   private String[] P09JB3_A11675DevCruDesc ;
   private String[] P09JB3_A11674DevCruHash ;
   private String[] P09JB3_A11678DevCruStt ;
   private String[] P09JB3_A11680DevCruAtId ;
   private String[] P09JB3_A11672DevCruMat ;
   private String[] P09JB3_A841TrnNom ;
   private boolean[] P09JB3_n841TrnNom ;
   private String[] P09JB3_A279CliNom ;
   private int[] P09JB3_A252CliCod ;
   private java.util.Date[] P09JB3_A11673DevCruSal ;
   private java.util.Date[] P09JB3_A11670DevCruFec ;
   private int[] P09JB3_A11669DevCruId ;
   private String[] P09JB4_A396EmprCod ;
   private String[] P09JB4_A11672DevCruMat ;
   private String[] P09JB4_A11675DevCruDesc ;
   private String[] P09JB4_A11674DevCruHash ;
   private String[] P09JB4_A11678DevCruStt ;
   private String[] P09JB4_A11680DevCruAtId ;
   private String[] P09JB4_A841TrnNom ;
   private boolean[] P09JB4_n841TrnNom ;
   private short[] P09JB4_A840TrnCod ;
   private boolean[] P09JB4_n840TrnCod ;
   private String[] P09JB4_A279CliNom ;
   private int[] P09JB4_A252CliCod ;
   private java.util.Date[] P09JB4_A11673DevCruSal ;
   private java.util.Date[] P09JB4_A11670DevCruFec ;
   private int[] P09JB4_A11669DevCruId ;
   private String[] P09JB5_A396EmprCod ;
   private String[] P09JB5_A11680DevCruAtId ;
   private String[] P09JB5_A11675DevCruDesc ;
   private String[] P09JB5_A11674DevCruHash ;
   private String[] P09JB5_A11678DevCruStt ;
   private String[] P09JB5_A11672DevCruMat ;
   private String[] P09JB5_A841TrnNom ;
   private boolean[] P09JB5_n841TrnNom ;
   private short[] P09JB5_A840TrnCod ;
   private boolean[] P09JB5_n840TrnCod ;
   private String[] P09JB5_A279CliNom ;
   private int[] P09JB5_A252CliCod ;
   private java.util.Date[] P09JB5_A11673DevCruSal ;
   private java.util.Date[] P09JB5_A11670DevCruFec ;
   private int[] P09JB5_A11669DevCruId ;
   private String[] P09JB6_A396EmprCod ;
   private String[] P09JB6_A11674DevCruHash ;
   private String[] P09JB6_A11675DevCruDesc ;
   private String[] P09JB6_A11678DevCruStt ;
   private String[] P09JB6_A11680DevCruAtId ;
   private String[] P09JB6_A11672DevCruMat ;
   private String[] P09JB6_A841TrnNom ;
   private boolean[] P09JB6_n841TrnNom ;
   private short[] P09JB6_A840TrnCod ;
   private boolean[] P09JB6_n840TrnCod ;
   private String[] P09JB6_A279CliNom ;
   private int[] P09JB6_A252CliCod ;
   private java.util.Date[] P09JB6_A11673DevCruSal ;
   private java.util.Date[] P09JB6_A11670DevCruFec ;
   private int[] P09JB6_A11669DevCruId ;
   private String[] P09JB7_A396EmprCod ;
   private String[] P09JB7_A11675DevCruDesc ;
   private String[] P09JB7_A11674DevCruHash ;
   private String[] P09JB7_A11678DevCruStt ;
   private String[] P09JB7_A11680DevCruAtId ;
   private String[] P09JB7_A11672DevCruMat ;
   private String[] P09JB7_A841TrnNom ;
   private boolean[] P09JB7_n841TrnNom ;
   private short[] P09JB7_A840TrnCod ;
   private boolean[] P09JB7_n840TrnCod ;
   private String[] P09JB7_A279CliNom ;
   private int[] P09JB7_A252CliCod ;
   private java.util.Date[] P09JB7_A11673DevCruSal ;
   private java.util.Date[] P09JB7_A11670DevCruFec ;
   private int[] P09JB7_A11669DevCruId ;
   private GXSimpleCollection<String> AV29TFDevCruStt_Sels ;
   private GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class almacentejidodevolucionwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09JB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[30];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09JB4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruMat, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruMat" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09JB5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[30];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruAtId, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruAtId" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09JB6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[30];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruHash, T1.DevCruDesc, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruHash" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09JB7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[30];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV61Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV62Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruDesc" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P09JB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] );
            case 1 :
                  return conditional_P09JB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] );
            case 2 :
                  return conditional_P09JB4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] );
            case 3 :
                  return conditional_P09JB5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] );
            case 4 :
                  return conditional_P09JB6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] );
            case 5 :
                  return conditional_P09JB7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JB4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JB5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JB6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JB7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 300);
               ((String[]) buf[4])[0] = rslt.getString(4, 200);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 200);
               ((String[]) buf[2])[0] = rslt.getString(3, 300);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 300);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
      }
   }

}

