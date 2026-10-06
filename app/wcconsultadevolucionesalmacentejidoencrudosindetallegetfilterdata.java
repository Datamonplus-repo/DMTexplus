package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata extends GXProcedure
{
   public wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.class ), "" );
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata( int remoteHandle ,
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
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.aP5 = new String[] {""};
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
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.AV28DDOName = aP0;
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.AV26SearchTxt = aP1;
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.AV27SearchTxtTo = aP2;
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.aP3 = aP3;
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.aP4 = aP4;
      wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_DEVCRUOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUOBSOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
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
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV24TFDevCruObs = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV25TFDevCruObs_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC") == 0 )
         {
            AV46DevCruFec = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC_TO") == 0 )
         {
            AV47DevCruFec_to = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV48CliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV49CliCod_to = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV50AlbRef = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENT") == 0 )
         {
            AV51AlbREnt = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV52AlbRecCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV26SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV44FilterFullText ;
      AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV10TFDevCruId ;
      AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV14TFCliCod ;
      AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV15TFCliCod_To ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV16TFCliNom ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV18TFTrnCod ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV19TFTrnCod_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV20TFTrnNom ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV22TFDevCruMat ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV24TFDevCruObs ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV48CliCod) ,
                                           Integer.valueOf(AV49CliCod_to) ,
                                           AV46DevCruFec ,
                                           AV47DevCruFec_to ,
                                           Integer.valueOf(AV52AlbRecCod) ,
                                           AV50AlbRef ,
                                           AV51AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV50AlbRef = GXutil.padr( GXutil.rtrim( AV50AlbRef), 16, "%") ;
      lV51AlbREnt = GXutil.padr( GXutil.rtrim( AV51AlbREnt), 8, "%") ;
      /* Using cursor P090B2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV48CliCod), Integer.valueOf(AV49CliCod_to), AV46DevCruFec, AV47DevCruFec_to, Integer.valueOf(AV52AlbRecCod), lV50AlbRef, lV51AlbREnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk90B2 = false ;
         A396EmprCod = P090B2_A396EmprCod[0] ;
         A279CliNom = P090B2_A279CliNom[0] ;
         A46AlbREnt = P090B2_A46AlbREnt[0] ;
         A45AlbRef = P090B2_A45AlbRef[0] ;
         A44AlbRecCod = P090B2_A44AlbRecCod[0] ;
         A11682DevCruObs = P090B2_A11682DevCruObs[0] ;
         A11672DevCruMat = P090B2_A11672DevCruMat[0] ;
         A841TrnNom = P090B2_A841TrnNom[0] ;
         n841TrnNom = P090B2_n841TrnNom[0] ;
         A840TrnCod = P090B2_A840TrnCod[0] ;
         n840TrnCod = P090B2_n840TrnCod[0] ;
         A252CliCod = P090B2_A252CliCod[0] ;
         A11670DevCruFec = P090B2_A11670DevCruFec[0] ;
         A11669DevCruId = P090B2_A11669DevCruId[0] ;
         A46AlbREnt = P090B2_A46AlbREnt[0] ;
         A45AlbRef = P090B2_A45AlbRef[0] ;
         A840TrnCod = P090B2_A840TrnCod[0] ;
         n840TrnCod = P090B2_n840TrnCod[0] ;
         A252CliCod = P090B2_A252CliCod[0] ;
         A841TrnNom = P090B2_A841TrnNom[0] ;
         n841TrnNom = P090B2_n841TrnNom[0] ;
         A279CliNom = P090B2_A279CliNom[0] ;
         A11682DevCruObs = P090B2_A11682DevCruObs[0] ;
         A11672DevCruMat = P090B2_A11672DevCruMat[0] ;
         A11670DevCruFec = P090B2_A11670DevCruFec[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P090B2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk90B2 = false ;
            A396EmprCod = P090B2_A396EmprCod[0] ;
            A44AlbRecCod = P090B2_A44AlbRecCod[0] ;
            A252CliCod = P090B2_A252CliCod[0] ;
            A11669DevCruId = P090B2_A11669DevCruId[0] ;
            A252CliCod = P090B2_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90B2 = true ;
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
         if ( ! brk90B2 )
         {
            brk90B2 = true ;
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
      AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV44FilterFullText ;
      AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV10TFDevCruId ;
      AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV14TFCliCod ;
      AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV15TFCliCod_To ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV16TFCliNom ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV18TFTrnCod ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV19TFTrnCod_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV20TFTrnNom ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV22TFDevCruMat ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV24TFDevCruObs ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV48CliCod) ,
                                           Integer.valueOf(AV49CliCod_to) ,
                                           AV46DevCruFec ,
                                           AV47DevCruFec_to ,
                                           Integer.valueOf(AV52AlbRecCod) ,
                                           AV50AlbRef ,
                                           AV51AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV50AlbRef = GXutil.padr( GXutil.rtrim( AV50AlbRef), 16, "%") ;
      lV51AlbREnt = GXutil.padr( GXutil.rtrim( AV51AlbREnt), 8, "%") ;
      /* Using cursor P090B3 */
      pr_default.execute(1, new Object[] {AV45Emprcod, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV48CliCod), Integer.valueOf(AV49CliCod_to), AV46DevCruFec, AV47DevCruFec_to, Integer.valueOf(AV52AlbRecCod), lV50AlbRef, lV51AlbREnt});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk90B4 = false ;
         A396EmprCod = P090B3_A396EmprCod[0] ;
         A840TrnCod = P090B3_A840TrnCod[0] ;
         n840TrnCod = P090B3_n840TrnCod[0] ;
         A46AlbREnt = P090B3_A46AlbREnt[0] ;
         A45AlbRef = P090B3_A45AlbRef[0] ;
         A44AlbRecCod = P090B3_A44AlbRecCod[0] ;
         A11682DevCruObs = P090B3_A11682DevCruObs[0] ;
         A11672DevCruMat = P090B3_A11672DevCruMat[0] ;
         A841TrnNom = P090B3_A841TrnNom[0] ;
         n841TrnNom = P090B3_n841TrnNom[0] ;
         A279CliNom = P090B3_A279CliNom[0] ;
         A252CliCod = P090B3_A252CliCod[0] ;
         A11670DevCruFec = P090B3_A11670DevCruFec[0] ;
         A11669DevCruId = P090B3_A11669DevCruId[0] ;
         A840TrnCod = P090B3_A840TrnCod[0] ;
         n840TrnCod = P090B3_n840TrnCod[0] ;
         A46AlbREnt = P090B3_A46AlbREnt[0] ;
         A45AlbRef = P090B3_A45AlbRef[0] ;
         A252CliCod = P090B3_A252CliCod[0] ;
         A841TrnNom = P090B3_A841TrnNom[0] ;
         n841TrnNom = P090B3_n841TrnNom[0] ;
         A279CliNom = P090B3_A279CliNom[0] ;
         A11682DevCruObs = P090B3_A11682DevCruObs[0] ;
         A11672DevCruMat = P090B3_A11672DevCruMat[0] ;
         A11670DevCruFec = P090B3_A11670DevCruFec[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P090B3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P090B3_A840TrnCod[0] == A840TrnCod ) )
         {
            brk90B4 = false ;
            A44AlbRecCod = P090B3_A44AlbRecCod[0] ;
            A11669DevCruId = P090B3_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90B4 = true ;
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
         if ( ! brk90B4 )
         {
            brk90B4 = true ;
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
      AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV44FilterFullText ;
      AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV10TFDevCruId ;
      AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV14TFCliCod ;
      AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV15TFCliCod_To ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV16TFCliNom ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV18TFTrnCod ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV19TFTrnCod_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV20TFTrnNom ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV22TFDevCruMat ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV24TFDevCruObs ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV48CliCod) ,
                                           Integer.valueOf(AV49CliCod_to) ,
                                           AV46DevCruFec ,
                                           AV47DevCruFec_to ,
                                           Integer.valueOf(AV52AlbRecCod) ,
                                           AV50AlbRef ,
                                           AV51AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV50AlbRef = GXutil.padr( GXutil.rtrim( AV50AlbRef), 16, "%") ;
      lV51AlbREnt = GXutil.padr( GXutil.rtrim( AV51AlbREnt), 8, "%") ;
      /* Using cursor P090B4 */
      pr_default.execute(2, new Object[] {AV45Emprcod, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV48CliCod), Integer.valueOf(AV49CliCod_to), AV46DevCruFec, AV47DevCruFec_to, Integer.valueOf(AV52AlbRecCod), lV50AlbRef, lV51AlbREnt});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk90B6 = false ;
         A396EmprCod = P090B4_A396EmprCod[0] ;
         A11672DevCruMat = P090B4_A11672DevCruMat[0] ;
         A46AlbREnt = P090B4_A46AlbREnt[0] ;
         A45AlbRef = P090B4_A45AlbRef[0] ;
         A44AlbRecCod = P090B4_A44AlbRecCod[0] ;
         A11682DevCruObs = P090B4_A11682DevCruObs[0] ;
         A841TrnNom = P090B4_A841TrnNom[0] ;
         n841TrnNom = P090B4_n841TrnNom[0] ;
         A840TrnCod = P090B4_A840TrnCod[0] ;
         n840TrnCod = P090B4_n840TrnCod[0] ;
         A279CliNom = P090B4_A279CliNom[0] ;
         A252CliCod = P090B4_A252CliCod[0] ;
         A11670DevCruFec = P090B4_A11670DevCruFec[0] ;
         A11669DevCruId = P090B4_A11669DevCruId[0] ;
         A46AlbREnt = P090B4_A46AlbREnt[0] ;
         A45AlbRef = P090B4_A45AlbRef[0] ;
         A840TrnCod = P090B4_A840TrnCod[0] ;
         n840TrnCod = P090B4_n840TrnCod[0] ;
         A252CliCod = P090B4_A252CliCod[0] ;
         A841TrnNom = P090B4_A841TrnNom[0] ;
         n841TrnNom = P090B4_n841TrnNom[0] ;
         A279CliNom = P090B4_A279CliNom[0] ;
         A11672DevCruMat = P090B4_A11672DevCruMat[0] ;
         A11682DevCruObs = P090B4_A11682DevCruObs[0] ;
         A11670DevCruFec = P090B4_A11670DevCruFec[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P090B4_A11672DevCruMat[0], A11672DevCruMat) == 0 ) )
         {
            brk90B6 = false ;
            A396EmprCod = P090B4_A396EmprCod[0] ;
            A44AlbRecCod = P090B4_A44AlbRecCod[0] ;
            A11669DevCruId = P090B4_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90B6 = true ;
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
         if ( ! brk90B6 )
         {
            brk90B6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDEVCRUOBSOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDevCruObs = AV26SearchTxt ;
      AV25TFDevCruObs_Sel = "" ;
      AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV44FilterFullText ;
      AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV10TFDevCruId ;
      AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV14TFCliCod ;
      AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV15TFCliCod_To ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV16TFCliNom ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV18TFTrnCod ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV19TFTrnCod_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV20TFTrnNom ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV22TFDevCruMat ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV24TFDevCruObs ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV25TFDevCruObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV48CliCod) ,
                                           Integer.valueOf(AV49CliCod_to) ,
                                           AV46DevCruFec ,
                                           AV47DevCruFec_to ,
                                           Integer.valueOf(AV52AlbRecCod) ,
                                           AV50AlbRef ,
                                           AV51AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV50AlbRef = GXutil.padr( GXutil.rtrim( AV50AlbRef), 16, "%") ;
      lV51AlbREnt = GXutil.padr( GXutil.rtrim( AV51AlbREnt), 8, "%") ;
      /* Using cursor P090B5 */
      pr_default.execute(3, new Object[] {AV45Emprcod, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV48CliCod), Integer.valueOf(AV49CliCod_to), AV46DevCruFec, AV47DevCruFec_to, Integer.valueOf(AV52AlbRecCod), lV50AlbRef, lV51AlbREnt});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk90B8 = false ;
         A396EmprCod = P090B5_A396EmprCod[0] ;
         A11682DevCruObs = P090B5_A11682DevCruObs[0] ;
         A46AlbREnt = P090B5_A46AlbREnt[0] ;
         A45AlbRef = P090B5_A45AlbRef[0] ;
         A44AlbRecCod = P090B5_A44AlbRecCod[0] ;
         A11672DevCruMat = P090B5_A11672DevCruMat[0] ;
         A841TrnNom = P090B5_A841TrnNom[0] ;
         n841TrnNom = P090B5_n841TrnNom[0] ;
         A840TrnCod = P090B5_A840TrnCod[0] ;
         n840TrnCod = P090B5_n840TrnCod[0] ;
         A279CliNom = P090B5_A279CliNom[0] ;
         A252CliCod = P090B5_A252CliCod[0] ;
         A11670DevCruFec = P090B5_A11670DevCruFec[0] ;
         A11669DevCruId = P090B5_A11669DevCruId[0] ;
         A46AlbREnt = P090B5_A46AlbREnt[0] ;
         A45AlbRef = P090B5_A45AlbRef[0] ;
         A840TrnCod = P090B5_A840TrnCod[0] ;
         n840TrnCod = P090B5_n840TrnCod[0] ;
         A252CliCod = P090B5_A252CliCod[0] ;
         A841TrnNom = P090B5_A841TrnNom[0] ;
         n841TrnNom = P090B5_n841TrnNom[0] ;
         A279CliNom = P090B5_A279CliNom[0] ;
         A11682DevCruObs = P090B5_A11682DevCruObs[0] ;
         A11672DevCruMat = P090B5_A11672DevCruMat[0] ;
         A11670DevCruFec = P090B5_A11670DevCruFec[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P090B5_A11682DevCruObs[0], A11682DevCruObs) == 0 ) )
         {
            brk90B8 = false ;
            A396EmprCod = P090B5_A396EmprCod[0] ;
            A44AlbRecCod = P090B5_A44AlbRecCod[0] ;
            A11669DevCruId = P090B5_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90B8 = true ;
            pr_default.readNext(3);
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
         if ( ! brk90B8 )
         {
            brk90B8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata.this.AV37OptionIndexesJson;
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
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV20TFTrnNom = "" ;
      AV21TFTrnNom_Sel = "" ;
      AV22TFDevCruMat = "" ;
      AV23TFDevCruMat_Sel = "" ;
      AV24TFDevCruObs = "" ;
      AV25TFDevCruObs_Sel = "" ;
      AV45Emprcod = "" ;
      AV46DevCruFec = GXutil.nullDate() ;
      AV47DevCruFec_to = GXutil.nullDate() ;
      AV50AlbRef = "" ;
      AV51AlbREnt = "" ;
      A279CliNom = "" ;
      AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = GXutil.nullDate() ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = "" ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = "" ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = "" ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = "" ;
      scmdbuf = "" ;
      lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      lV50AlbRef = "" ;
      lV51AlbREnt = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      A396EmprCod = "" ;
      P090B2_A396EmprCod = new String[] {""} ;
      P090B2_A279CliNom = new String[] {""} ;
      P090B2_A46AlbREnt = new String[] {""} ;
      P090B2_A45AlbRef = new String[] {""} ;
      P090B2_A44AlbRecCod = new int[1] ;
      P090B2_A11682DevCruObs = new String[] {""} ;
      P090B2_A11672DevCruMat = new String[] {""} ;
      P090B2_A841TrnNom = new String[] {""} ;
      P090B2_n841TrnNom = new boolean[] {false} ;
      P090B2_A840TrnCod = new short[1] ;
      P090B2_n840TrnCod = new boolean[] {false} ;
      P090B2_A252CliCod = new int[1] ;
      P090B2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P090B2_A11669DevCruId = new int[1] ;
      AV30Option = "" ;
      P090B3_A396EmprCod = new String[] {""} ;
      P090B3_A840TrnCod = new short[1] ;
      P090B3_n840TrnCod = new boolean[] {false} ;
      P090B3_A46AlbREnt = new String[] {""} ;
      P090B3_A45AlbRef = new String[] {""} ;
      P090B3_A44AlbRecCod = new int[1] ;
      P090B3_A11682DevCruObs = new String[] {""} ;
      P090B3_A11672DevCruMat = new String[] {""} ;
      P090B3_A841TrnNom = new String[] {""} ;
      P090B3_n841TrnNom = new boolean[] {false} ;
      P090B3_A279CliNom = new String[] {""} ;
      P090B3_A252CliCod = new int[1] ;
      P090B3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P090B3_A11669DevCruId = new int[1] ;
      P090B4_A396EmprCod = new String[] {""} ;
      P090B4_A11672DevCruMat = new String[] {""} ;
      P090B4_A46AlbREnt = new String[] {""} ;
      P090B4_A45AlbRef = new String[] {""} ;
      P090B4_A44AlbRecCod = new int[1] ;
      P090B4_A11682DevCruObs = new String[] {""} ;
      P090B4_A841TrnNom = new String[] {""} ;
      P090B4_n841TrnNom = new boolean[] {false} ;
      P090B4_A840TrnCod = new short[1] ;
      P090B4_n840TrnCod = new boolean[] {false} ;
      P090B4_A279CliNom = new String[] {""} ;
      P090B4_A252CliCod = new int[1] ;
      P090B4_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P090B4_A11669DevCruId = new int[1] ;
      P090B5_A396EmprCod = new String[] {""} ;
      P090B5_A11682DevCruObs = new String[] {""} ;
      P090B5_A46AlbREnt = new String[] {""} ;
      P090B5_A45AlbRef = new String[] {""} ;
      P090B5_A44AlbRecCod = new int[1] ;
      P090B5_A11672DevCruMat = new String[] {""} ;
      P090B5_A841TrnNom = new String[] {""} ;
      P090B5_n841TrnNom = new boolean[] {false} ;
      P090B5_A840TrnCod = new short[1] ;
      P090B5_n840TrnCod = new boolean[] {false} ;
      P090B5_A279CliNom = new String[] {""} ;
      P090B5_A252CliCod = new int[1] ;
      P090B5_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P090B5_A11669DevCruId = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P090B2_A396EmprCod, P090B2_A279CliNom, P090B2_A46AlbREnt, P090B2_A45AlbRef, P090B2_A44AlbRecCod, P090B2_A11682DevCruObs, P090B2_A11672DevCruMat, P090B2_A841TrnNom, P090B2_n841TrnNom, P090B2_A840TrnCod,
            P090B2_n840TrnCod, P090B2_A252CliCod, P090B2_A11670DevCruFec, P090B2_A11669DevCruId
            }
            , new Object[] {
            P090B3_A396EmprCod, P090B3_A840TrnCod, P090B3_n840TrnCod, P090B3_A46AlbREnt, P090B3_A45AlbRef, P090B3_A44AlbRecCod, P090B3_A11682DevCruObs, P090B3_A11672DevCruMat, P090B3_A841TrnNom, P090B3_n841TrnNom,
            P090B3_A279CliNom, P090B3_A252CliCod, P090B3_A11670DevCruFec, P090B3_A11669DevCruId
            }
            , new Object[] {
            P090B4_A396EmprCod, P090B4_A11672DevCruMat, P090B4_A46AlbREnt, P090B4_A45AlbRef, P090B4_A44AlbRecCod, P090B4_A11682DevCruObs, P090B4_A841TrnNom, P090B4_n841TrnNom, P090B4_A840TrnCod, P090B4_n840TrnCod,
            P090B4_A279CliNom, P090B4_A252CliCod, P090B4_A11670DevCruFec, P090B4_A11669DevCruId
            }
            , new Object[] {
            P090B5_A396EmprCod, P090B5_A11682DevCruObs, P090B5_A46AlbREnt, P090B5_A45AlbRef, P090B5_A44AlbRecCod, P090B5_A11672DevCruMat, P090B5_A841TrnNom, P090B5_n841TrnNom, P090B5_A840TrnCod, P090B5_n840TrnCod,
            P090B5_A279CliNom, P090B5_A252CliCod, P090B5_A11670DevCruFec, P090B5_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18TFTrnCod ;
   private short AV19TFTrnCod_To ;
   private short AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ;
   private short AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV10TFDevCruId ;
   private int AV11TFDevCruId_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV48CliCod ;
   private int AV49CliCod_to ;
   private int AV52AlbRecCod ;
   private int AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ;
   private int AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ;
   private int AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ;
   private int AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV20TFTrnNom ;
   private String AV21TFTrnNom_Sel ;
   private String AV22TFDevCruMat ;
   private String AV23TFDevCruMat_Sel ;
   private String AV45Emprcod ;
   private String AV50AlbRef ;
   private String AV51AlbREnt ;
   private String A279CliNom ;
   private String AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ;
   private String AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ;
   private String AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ;
   private String scmdbuf ;
   private String lV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String lV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String lV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String lV50AlbRef ;
   private String lV51AlbREnt ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A396EmprCod ;
   private java.util.Date AV12TFDevCruFec ;
   private java.util.Date AV46DevCruFec ;
   private java.util.Date AV47DevCruFec_to ;
   private java.util.Date AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ;
   private java.util.Date A11670DevCruFec ;
   private boolean returnInSub ;
   private boolean brk90B2 ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean brk90B4 ;
   private boolean brk90B6 ;
   private boolean brk90B8 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV24TFDevCruObs ;
   private String AV25TFDevCruObs_Sel ;
   private String AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ;
   private String lV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String A11682DevCruObs ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P090B2_A396EmprCod ;
   private String[] P090B2_A279CliNom ;
   private String[] P090B2_A46AlbREnt ;
   private String[] P090B2_A45AlbRef ;
   private int[] P090B2_A44AlbRecCod ;
   private String[] P090B2_A11682DevCruObs ;
   private String[] P090B2_A11672DevCruMat ;
   private String[] P090B2_A841TrnNom ;
   private boolean[] P090B2_n841TrnNom ;
   private short[] P090B2_A840TrnCod ;
   private boolean[] P090B2_n840TrnCod ;
   private int[] P090B2_A252CliCod ;
   private java.util.Date[] P090B2_A11670DevCruFec ;
   private int[] P090B2_A11669DevCruId ;
   private String[] P090B3_A396EmprCod ;
   private short[] P090B3_A840TrnCod ;
   private boolean[] P090B3_n840TrnCod ;
   private String[] P090B3_A46AlbREnt ;
   private String[] P090B3_A45AlbRef ;
   private int[] P090B3_A44AlbRecCod ;
   private String[] P090B3_A11682DevCruObs ;
   private String[] P090B3_A11672DevCruMat ;
   private String[] P090B3_A841TrnNom ;
   private boolean[] P090B3_n841TrnNom ;
   private String[] P090B3_A279CliNom ;
   private int[] P090B3_A252CliCod ;
   private java.util.Date[] P090B3_A11670DevCruFec ;
   private int[] P090B3_A11669DevCruId ;
   private String[] P090B4_A396EmprCod ;
   private String[] P090B4_A11672DevCruMat ;
   private String[] P090B4_A46AlbREnt ;
   private String[] P090B4_A45AlbRef ;
   private int[] P090B4_A44AlbRecCod ;
   private String[] P090B4_A11682DevCruObs ;
   private String[] P090B4_A841TrnNom ;
   private boolean[] P090B4_n841TrnNom ;
   private short[] P090B4_A840TrnCod ;
   private boolean[] P090B4_n840TrnCod ;
   private String[] P090B4_A279CliNom ;
   private int[] P090B4_A252CliCod ;
   private java.util.Date[] P090B4_A11670DevCruFec ;
   private int[] P090B4_A11669DevCruId ;
   private String[] P090B5_A396EmprCod ;
   private String[] P090B5_A11682DevCruObs ;
   private String[] P090B5_A46AlbREnt ;
   private String[] P090B5_A45AlbRef ;
   private int[] P090B5_A44AlbRecCod ;
   private String[] P090B5_A11672DevCruMat ;
   private String[] P090B5_A841TrnNom ;
   private boolean[] P090B5_n841TrnNom ;
   private short[] P090B5_A840TrnCod ;
   private boolean[] P090B5_n840TrnCod ;
   private String[] P090B5_A279CliNom ;
   private int[] P090B5_A252CliCod ;
   private java.util.Date[] P090B5_A11670DevCruFec ;
   private int[] P090B5_A11669DevCruId ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wcconsultadevolucionesalmacentejidoencrudosindetallegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV48CliCod ,
                                          int AV49CliCod_to ,
                                          java.util.Date AV46DevCruFec ,
                                          java.util.Date AV47DevCruFec_to ,
                                          int AV52AlbRecCod ,
                                          String AV50AlbRef ,
                                          String AV51AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T4.CliNom, T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T5.DevCruObs, T5.DevCruMat, T3.TrnNom, T2.TrnCod, T2.CliCod, T5.DevCruFec, T1.DevCruId FROM ((((TXPDEVCR1" ;
      scmdbuf += " T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T2.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV48CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV49CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV52AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P090B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV48CliCod ,
                                          int AV49CliCod_to ,
                                          java.util.Date AV46DevCruFec ,
                                          java.util.Date AV47DevCruFec_to ,
                                          int AV52AlbRecCod ,
                                          String AV50AlbRef ,
                                          String AV51AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.TrnCod, T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T5.DevCruObs, T5.DevCruMat, T3.TrnNom, T4.CliNom, T2.CliCod, T5.DevCruFec, T1.DevCruId FROM ((((TXPDEVCR1" ;
      scmdbuf += " T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T2.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV48CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV49CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV52AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.TrnCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P090B4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV48CliCod ,
                                          int AV49CliCod_to ,
                                          java.util.Date AV46DevCruFec ,
                                          java.util.Date AV47DevCruFec_to ,
                                          int AV52AlbRecCod ,
                                          String AV50AlbRef ,
                                          String AV51AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T5.DevCruMat, T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T5.DevCruObs, T3.TrnNom, T2.TrnCod, T4.CliNom, T2.CliCod, T5.DevCruFec, T1.DevCruId FROM ((((TXPDEVCR1" ;
      scmdbuf += " T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T2.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV48CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV49CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV52AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.DevCruMat" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P090B5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV48CliCod ,
                                          int AV49CliCod_to ,
                                          java.util.Date AV46DevCruFec ,
                                          java.util.Date AV47DevCruFec_to ,
                                          int AV52AlbRecCod ,
                                          String AV50AlbRef ,
                                          String AV51AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T5.DevCruObs, T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T5.DevCruMat, T3.TrnNom, T2.TrnCod, T4.CliNom, T2.CliCod, T5.DevCruFec, T1.DevCruId FROM ((((TXPDEVCR1" ;
      scmdbuf += " T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T2.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV58Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV48CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV49CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV52AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.DevCruObs" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P090B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_P090B3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 2 :
                  return conditional_P090B4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 3 :
                  return conditional_P090B5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090B4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090B5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

